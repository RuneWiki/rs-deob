import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class110 implements Runnable {

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "Z")
    private boolean field1605 = false;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "Z")
    private boolean field1613 = false;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    private int field1615 = 0;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    private int field1618 = 0;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field1609;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Lii;")
    private class519 field1603;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field1614;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1607;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "Ldb;")
    public static class298 field1621 = new class298(47, 1);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "Lsa;")
    private class192 field1608;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "[B")
    private byte[] field1619;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "[I")
    public static int[] field1610;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[BZI)V", line = 8)
    public final void method814(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field1606++;
        if (this.field1605) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1614.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
        if (!arg2) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!fv", name = "run", descriptor = "()V", line = 36)
    public final void run() {
        field1602++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1618 == this.field1615) {
                        if (this.field1605) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1618 <= this.field1615) {
                        var2 = this.field1615 - this.field1618;
                    } else {
                        var2 = 5000 - this.field1618;
                    }
                    var3 = this.field1618;
                }
                if (var2 > 0) {
                    try {
                        this.field1607.write(this.field1619, var3, var2);
                    } catch (IOException var9) {
                        this.field1613 = true;
                    }
                    this.field1618 = (this.field1618 + var2) % 5000;
                    try {
                        if (this.field1618 == this.field1615) {
                            this.field1607.flush();
                        }
                    } catch (IOException var8) {
                        this.field1613 = true;
                    }
                }
            }
            try {
                if (this.field1614 != null) {
                    this.field1614.close();
                }
                if (this.field1607 != null) {
                    this.field1607.close();
                }
                if (this.field1609 != null) {
                    this.field1609.close();
                }
            } catch (IOException var7) {
            }
            this.field1619 = null;
        } catch (Exception var12) {
            class259.method1586(var12, null, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[BII)V", line = 107)
    public final void method815(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1604++;
        if (this.field1605) {
            return;
        }
        if (this.field1613) {
            this.field1613 = false;
            throw new IOException();
        }
        if (this.field1619 == null) {
            this.field1619 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1619[this.field1615] = arg1[arg0 + var6];
                this.field1615 = (this.field1615 + 1) % 5000;
                if (((this.field1618 + 4900) % 5000) == this.field1615) {
                    throw new IOException();
                }
            }
            if (this.field1608 == null) {
                this.field1608 = this.field1603.method2904(this, 3, (byte) 119);
            }
            if (arg2 < 25) {
                this.method822(true);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLgba;)V", line = 159)
    public static final void method816(byte arg0, class625 arg1) {
        field1616++;
        if (arg0 < 83) {
            return;
        }
        class625 var2 = class637.method3519(arg1, 2122911660);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class627.field8461;
            var3 = class149.field2387;
        } else {
            var3 = var2.field8361;
            var4 = var2.field8350;
        }
        class529.method2955(false, (byte) -80, arg1, var3, var4);
        class504.method2796(var3, arg1, (byte) -32, var4);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 186)
    public static void method817(int arg0) {
        if (arg0 > -111) {
            field1610 = null;
        }
        field1621 = null;
        field1610 = null;
    }

    @OriginalMember(owner = "client!fv", name = "finalize", descriptor = "()V", line = 197)
    protected final void finalize() {
        field1620++;
        this.method820(0);
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I", line = 206)
    public final int method818(int arg0) throws IOException {
        field1600++;
        if (this.field1605) {
            return 0;
        } else {
            if (arg0 != -19508) {
                method817(14);
            }
            return this.field1614.available();
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Ljava/net/Socket;Lii;)V", line = 339)
    public class110(Socket arg0, class519 arg1) throws IOException {
        this.field1609 = arg0;
        this.field1603 = arg1;
        this.field1609.setSoTimeout(30000);
        this.field1609.setTcpNoDelay(true);
        this.field1614 = this.field1609.getInputStream();
        this.field1607 = this.field1609.getOutputStream();
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V", line = 231)
    public final void method819(int arg0) throws IOException {
        if (arg0 >= -39) {
            method816((byte) -14, null);
        }
        field1611++;
        if (!this.field1605 && this.field1613) {
            this.field1613 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V", line = 254)
    public final void method820(int arg0) {
        field1601++;
        if (this.field1605) {
            return;
        }
        synchronized (this) {
            this.field1605 = true;
            this.notifyAll();
        }
        if (arg0 != 0) {
            this.field1613 = true;
        }
        if (this.field1608 != null) {
            while (this.field1608.field2816 == 0) {
                class486.method2722(0, 1L);
            }
            if (this.field1608.field2816 == 1) {
                try {
                    ((Thread) this.field1608.field2820).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1608 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)I", line = 290)
    public final int method821(boolean arg0) throws IOException {
        field1617++;
        if (this.field1605) {
            return 0;
        } else {
            if (arg0) {
                method816((byte) 4, null);
            }
            return this.field1614.read();
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(Z)V", line = 310)
    public final void method822(boolean arg0) {
        if (arg0) {
            this.field1607 = null;
        }
        field1612++;
        if (!this.field1605) {
            this.field1614 = new class119();
            this.field1607 = new class64();
        }
    }
}
