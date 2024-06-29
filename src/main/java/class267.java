import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class267 implements Runnable {

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Z")
    private boolean field4464 = false;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
    private boolean field4450 = false;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    private int field4471 = 0;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    private int field4465 = 0;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lib;")
    private class28 field4462;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Ljava/net/Socket;")
    private Socket field4469;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field4451;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4449;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field4446 = 0;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lbd;")
    public static class162 field4457 = class17.method142(0, " x ");

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field4458 = 0;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Z")
    public static boolean field4461 = true;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "Lbd;")
    private static class162 field4472 = class17.method142(0, "Use");

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "[Lqd;")
    public static class179[] field4473 = new class179[4];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lbd;")
    public static class162 field4443 = field4472;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "F")
    public static float field4447;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lvb;")
    private class166 field4454;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[B")
    private byte[] field4448;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "[I")
    public static int[] field4468;

    @OriginalMember(owner = "client!oc", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        field4470++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field4471 == this.field4465) {
                        if (this.field4464) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field4471;
                    if (this.field4471 > this.field4465) {
                        var4 = 5000 - this.field4471;
                    } else {
                        var4 = this.field4465 - this.field4471;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field4449.write(this.field4448, var3, var4);
                    } catch (IOException var12) {
                        this.field4450 = true;
                    }
                    this.field4471 = (this.field4471 + var4) % 5000;
                    try {
                        if (this.field4471 == this.field4465) {
                            this.field4449.flush();
                        }
                    } catch (IOException var11) {
                        this.field4450 = true;
                    }
                }
            }
            try {
                if (this.field4451 != null) {
                    this.field4451.close();
                }
                if (this.field4449 != null) {
                    this.field4449.close();
                }
                if (this.field4469 != null) {
                    this.field4469.close();
                }
            } catch (IOException var10) {
            }
            this.field4448 = null;
        } catch (Exception var15) {
            class129.method1039(-8, (String) null, var15);
        }
    }

    @OriginalMember(owner = "client!oc", name = "finalize", descriptor = "()V", line = 75)
    protected final void finalize() {
        this.method1829((byte) 4);
        field4455++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 85)
    public static void method1825(byte arg0) {
        field4457 = null;
        field4468 = null;
        if (arg0 != 127) {
            field4468 = (int[]) null;
        }
        field4473 = null;
        field4443 = null;
        field4472 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I", line = 99)
    public final int method1826(int arg0) throws IOException {
        if (arg0 < 76) {
            this.finalize();
        }
        field4467++;
        return this.field4464 ? 0 : this.field4451.available();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II[BI)V", line = 114)
    public final void method1827(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4463++;
        if (this.field4464) {
            return;
        }
        if (this.field4450) {
            this.field4450 = false;
            throw new IOException();
        }
        if (this.field4448 == null) {
            this.field4448 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (var6 >= arg3) {
                    if (this.field4454 == null) {
                        this.field4454 = this.field4462.method241((byte) -111, this, 3);
                    }
                    this.notifyAll();
                    break;
                }
                this.field4448[this.field4465] = arg2[arg0 + var6];
                this.field4465 = (this.field4465 + 1) % 5000;
                if (((this.field4471 + 4900) % 5000) == this.field4465) {
                    throw new IOException();
                }
                var6++;
            }
        }
        int var8 = 90 % ((-arg1 - 10) / 46);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/net/Socket;Lib;)V", line = 351)
    public class267(Socket arg0, class28 arg1) throws IOException {
        this.field4462 = arg1;
        this.field4469 = arg0;
        this.field4469.setSoTimeout(30000);
        this.field4469.setTcpNoDelay(true);
        this.field4451 = this.field4469.getInputStream();
        this.field4449 = this.field4469.getOutputStream();
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 215)
    public final void method1828(int arg0) throws IOException {
        if (arg0 != -1) {
            return;
        }
        field4445++;
        if (!this.field4464 && this.field4450) {
            this.field4450 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V", line = 239)
    public final void method1829(byte arg0) {
        field4456++;
        if (this.field4464) {
            return;
        }
        synchronized (this) {
            if (arg0 != 4) {
                return;
            }
            this.field4464 = true;
            this.notifyAll();
        }
        if (this.field4454 != null) {
            while (this.field4454.field2934 == 0) {
                class177.method1342(1L, 1);
            }
            if (this.field4454.field2934 == 1) {
                try {
                    ((Thread) this.field4454.field2933).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field4454 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB[BI)V", line = 283)
    public final void method1830(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field4460++;
        int var5 = -33 / ((44 - arg1) / 58);
        if (this.field4464) {
            return;
        }
        while (arg0 > 0) {
            int var6 = this.field4451.read(arg2, arg3, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg0 -= var6;
            arg3 += var6;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 307)
    public final void method1831(int arg0) {
        field4466++;
        int var2 = -3 % ((arg0) / 46);
        if (!this.field4464) {
            this.field4451 = new class201();
            this.field4449 = new class290();
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I", line = 322)
    public final int method1832(int arg0) throws IOException {
        field4453++;
        if (this.field4464) {
            return 0;
        } else if (arg0 == 25831) {
            return this.field4451.read();
        } else {
            return 111;
        }
    }
}
