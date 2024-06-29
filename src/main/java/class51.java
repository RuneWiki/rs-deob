import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class51 implements Runnable {

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    private int field600 = 0;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "Z")
    private boolean field610 = false;

    @OriginalMember(owner = "client!caa", name = "s", descriptor = "Z")
    private boolean field616 = false;

    @OriginalMember(owner = "client!caa", name = "u", descriptor = "I")
    private int field618 = 0;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "Luf;")
    private class353 field609;

    @OriginalMember(owner = "client!caa", name = "t", descriptor = "Ljava/net/Socket;")
    private Socket field617;

    @OriginalMember(owner = "client!caa", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field619;

    @OriginalMember(owner = "client!caa", name = "x", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field621;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "[I")
    public static int[] field604 = new int[1000];

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "Lqp;")
    public static class586 field613 = new class586(25, 10);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!caa", name = "r", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!caa", name = "w", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!caa", name = "A", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!caa", name = "y", descriptor = "Lbca;")
    private class286 field622;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "[B")
    private byte[] field612;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V")
    public final void method254(boolean arg0) {
        field607++;
        if (this.field610) {
            return;
        }
        if (!arg0) {
            method256(-51);
        }
        this.field619 = new class424();
        this.field621 = new class508();
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIZ[B)V")
    public final void method255(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        field606++;
        if (this.field610) {
            return;
        }
        if (this.field616) {
            this.field616 = false;
            throw new IOException();
        }
        if (this.field612 == null) {
            this.field612 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field612[this.field618] = arg3[arg0 + var6];
                this.field618 = (this.field618 + 1) % 5000;
                if ((this.field600 + 4900) % 5000 == this.field618) {
                    throw new IOException();
                }
            }
            if (this.field622 == null) {
                this.field622 = this.field609.method2159(3, (byte) 26, this);
            }
            if (arg2) {
                method262(-37, 120, (byte) -25);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static void method256(int arg0) {
        field613 = null;
        if (arg0 != 30244) {
            method261(16, -46);
        }
        field604 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)I")
    public final int method257(byte arg0) throws IOException {
        field603++;
        if (arg0 <= 29) {
            return 65;
        } else if (this.field610) {
            return 0;
        } else {
            return this.field619.available();
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public static final void method258(int arg0) {
        if (class392.method2366(30)) {
            if (class59.field709 == null) {
                class66.method406((byte) 123);
            }
            class30.field272 = true;
            class283.field4192 = 0;
            try {
                class87.field1103 = class621.field9076.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        if (arg0 != 0) {
            method262(-31, -26, (byte) 115);
        }
        field601++;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "([BIII)V")
    public final void method259(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field599++;
        if (this.field610) {
            return;
        }
        int var5 = 90 / ((-arg3 - 25) / 43);
        while (arg2 > 0) {
            int var6 = this.field619.read(arg0, arg1, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg2 -= var6;
            arg1 += var6;
        }
    }

    @OriginalMember(owner = "client!caa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method264((byte) 127);
        field605++;
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
    public static final void method260(int arg0) {
        field620++;
        if (class247.field3610 || arg0 != 11263) {
            return;
        }
        if (class94.field1158.field301) {
            class578.field8523 = ((int) class578.field8523 - 17 & 0xFFFFFFF0);
        } else {
            class203.field3025 += (-12.0F - class203.field3025) / 2.0F;
        }
        class247.field3610 = true;
        class120.field1561 = true;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)V")
    public static final void method261(int arg0, int arg1) {
        if (arg1 != 1000) {
            method258(106);
        }
        field623++;
        class621 var2 = class442.method2691(arg0, 1, true);
        var2.method3598(255);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIB)I")
    public static final int method262(int arg0, int arg1, byte arg2) {
        field598++;
        if (arg2 < 15) {
            field604 = null;
        }
        return arg1 == 1 || arg1 == 3 ? class336.field4935[arg0 & 0x3] : class629.field9214[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(Z)V")
    public final void method263(boolean arg0) throws IOException {
        if (!arg0) {
            this.method254(true);
        }
        field611++;
        if (!this.field610 && this.field616) {
            this.field616 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V")
    public final void method264(byte arg0) {
        field615++;
        if (this.field610) {
            return;
        }
        synchronized (this) {
            if (arg0 <= 124) {
                this.field621 = null;
            }
            this.field610 = true;
            this.notifyAll();
        }
        if (this.field622 != null) {
            while (this.field622.field4208 == 0) {
                class428.method2624(1, 1L);
            }
            if (this.field622.field4208 == 1) {
                try {
                    ((Thread) this.field622.field4213).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field622 = null;
    }

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)I")
    public final int method265(int arg0) throws IOException {
        field608++;
        if (arg0 == -31512) {
            return this.field610 ? 0 : this.field619.read();
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljda;IIB)V")
    public static final void method266(class278 arg0, int arg1, int arg2, byte arg3) {
        class468.field6812[arg1][arg2] = arg0;
        if (arg3 <= 53) {
            field613 = null;
        }
        field602++;
    }

    @OriginalMember(owner = "client!caa", name = "run", descriptor = "()V")
    public final void run() {
        field614++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field618 == this.field600) {
                        if (this.field610) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field600 <= this.field618) {
                        var2 = this.field618 - this.field600;
                    } else {
                        var2 = 5000 - this.field600;
                    }
                    var3 = this.field600;
                }
                if (var2 > 0) {
                    try {
                        this.field621.write(this.field612, var3, var2);
                    } catch (IOException var9) {
                        this.field616 = true;
                    }
                    this.field600 = (this.field600 + var2) % 5000;
                    try {
                        if (this.field618 == this.field600) {
                            this.field621.flush();
                        }
                    } catch (IOException var8) {
                        this.field616 = true;
                    }
                }
            }
            try {
                if (this.field619 != null) {
                    this.field619.close();
                }
                if (this.field621 != null) {
                    this.field621.close();
                }
                if (this.field617 != null) {
                    this.field617.close();
                }
            } catch (IOException var7) {
            }
            this.field612 = null;
        } catch (Exception var12) {
            class31.method140(null, -128, var12);
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Ljava/net/Socket;Luf;)V")
    public class51(Socket arg0, class353 arg1) throws IOException {
        this.field609 = arg1;
        this.field617 = arg0;
        this.field617.setSoTimeout(30000);
        this.field617.setTcpNoDelay(true);
        this.field619 = this.field617.getInputStream();
        this.field621 = this.field617.getOutputStream();
    }
}
