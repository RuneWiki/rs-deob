import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class5 implements Runnable {

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    private int field43 = 0;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    private int field50 = 0;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Z")
    private boolean field35 = false;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Z")
    private boolean field57 = false;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lnga;")
    private class256 field45;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field56;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field36;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field40;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lgg;")
    public static class114 field48 = new class114(4);

    @OriginalMember(owner = "client!se", name = "z", descriptor = "J")
    public static long field60 = 0L;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "[I")
    public static int[] field63 = new int[4];

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lfg;")
    public static class418 field52;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lwp;")
    private class435 field46;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "[B")
    private byte[] field49;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public final void method17(byte arg0) throws IOException {
        if (arg0 != -73) {
            field54 = -114;
        }
        field58++;
        if (!this.field57 && this.field35) {
            this.field35 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)I")
    public static final int method18(int arg0, byte arg1) {
        int var2 = 75 % ((-arg1 - 56) / 51);
        field44++;
        int var3 = arg0 & 0x3F;
        int var4 = (arg0 & 0xDE) >> 6;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I")
    public final int method19(int arg0) throws IOException {
        if (arg0 != 523) {
            this.field49 = null;
        }
        field55++;
        return this.field57 ? 0 : this.field36.read();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II[BB)V")
    public final void method20(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        int var5 = 119 / ((arg3 + 74) / 40);
        field51++;
        if (this.field57) {
            return;
        }
        while (arg0 > 0) {
            int var6 = this.field36.read(arg2, arg1, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 += var6;
            arg0 -= var6;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
    public final int method21(int arg0) throws IOException {
        field37++;
        if (this.field57) {
            return 0;
        } else if (arg0 == 0) {
            return this.field36.available();
        } else {
            return -75;
        }
    }

    @OriginalMember(owner = "client!se", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method27(false);
        field42++;
    }

    @OriginalMember(owner = "client!se", name = "run", descriptor = "()V")
    public final void run() {
        field53++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field50 == this.field43) {
                        if (this.field57) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field50 <= this.field43) {
                        var2 = this.field43 - this.field50;
                    } else {
                        var2 = this.field62 - this.field50;
                    }
                    var3 = this.field50;
                }
                if (var2 > 0) {
                    try {
                        this.field40.write(this.field49, var3, var2);
                    } catch (IOException var9) {
                        this.field35 = true;
                    }
                    this.field50 = (this.field50 + var2) % this.field62;
                    try {
                        if (this.field50 == this.field43) {
                            this.field40.flush();
                        }
                    } catch (IOException var8) {
                        this.field35 = true;
                    }
                }
            }
            try {
                if (this.field36 != null) {
                    this.field36.close();
                }
                if (this.field40 != null) {
                    this.field40.close();
                }
                if (this.field56 != null) {
                    this.field56.close();
                }
            } catch (IOException var7) {
            }
            this.field49 = null;
        } catch (Exception var12) {
            class486.method2844((byte) -1, null, var12);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public final void method22(byte arg0) {
        if (arg0 > -92) {
            return;
        }
        field38++;
        if (!this.field57) {
            this.field36 = new class158();
            this.field40 = new class463();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIBLgaa;I)V")
    public static final void method23(boolean arg0, int arg1, byte arg2, class460 arg3, int arg4) {
        field59++;
        int var5 = arg3.field6566;
        if (arg3.field6612 == 0) {
            arg3.field6566 = arg3.field6610;
        } else if (arg3.field6612 == 1) {
            arg3.field6566 = arg4 - arg3.field6610;
        } else if (arg3.field6612 == 2) {
            arg3.field6566 = arg3.field6610 * arg4 >> 14;
        }
        int var6 = arg3.field6514;
        if (arg2 != -41) {
            field60 = 20L;
        }
        if (arg3.field6523 == 0) {
            arg3.field6514 = arg3.field6504;
        } else if (arg3.field6523 == 1) {
            arg3.field6514 = arg1 - arg3.field6504;
        } else if (arg3.field6523 == 2) {
            arg3.field6514 = arg3.field6504 * arg1 >> 14;
        }
        if (arg3.field6612 == 4) {
            arg3.field6566 = arg3.field6514 * arg3.field6510 / arg3.field6608;
        }
        if (arg3.field6523 == 4) {
            arg3.field6514 = arg3.field6608 * arg3.field6566 / arg3.field6510;
        }
        if (class491.field6959 && (client.method715(arg3).field465 != 0 || arg3.field6483 == 0)) {
            if (arg3.field6514 < 5 && arg3.field6566 < 5) {
                arg3.field6514 = 5;
                arg3.field6566 = 5;
            } else {
                if (arg3.field6514 <= 0) {
                    arg3.field6514 = 5;
                }
                if (arg3.field6566 <= 0) {
                    arg3.field6566 = 5;
                }
            }
        }
        if (class294.field3836 == arg3.field6506) {
            class14.field200 = arg3;
        }
        if (arg0 && arg3.field6538 != null && arg3.field6566 != var5 || arg3.field6514 != var6) {
            class575 var7 = new class575();
            var7.field8027 = arg3.field6538;
            var7.field8028 = arg3;
            class278.field3517.method3110(var7, 1);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/net/Socket;BI)Lcr;")
    public static final class175 method24(Socket arg0, byte arg1, int arg2) throws IOException {
        if (arg1 == -80) {
            field47++;
            return new class140(arg0, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([BIII)V")
    public final void method25(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field39++;
        if (this.field57) {
            return;
        }
        if (this.field35) {
            this.field35 = false;
            throw new IOException();
        }
        if (this.field49 == null) {
            this.field49 = new byte[this.field62];
        }
        synchronized (this) {
            for (int var6 = arg3; var6 < arg1; var6++) {
                this.field49[this.field43] = arg0[arg2 + var6];
                this.field43 = (this.field43 + 1) % this.field62;
                if (((this.field50 + this.field62 - 100) % this.field62) == this.field43) {
                    throw new IOException();
                }
            }
            if (this.field46 == null) {
                this.field46 = this.field45.method1555(3, true, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public static void method26(int arg0) {
        field48 = null;
        field63 = null;
        field52 = null;
        if (arg0 != -19) {
            method23(false, -35, (byte) -104, null, 51);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public final void method27(boolean arg0) {
        field41++;
        if (this.field57) {
            return;
        }
        synchronized (this) {
            this.field57 = true;
            this.notifyAll();
        }
        if (arg0) {
            this.field49 = null;
        }
        if (this.field46 != null) {
            while (this.field46.field6124 == 0) {
                class517.method2965(1L, -101);
            }
            if (this.field46.field6124 == 1) {
                try {
                    ((Thread) this.field46.field6123).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field46 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/net/Socket;Lnga;I)V")
    public class5(Socket arg0, class256 arg1, int arg2) throws IOException {
        this.field45 = arg1;
        this.field56 = arg0;
        this.field56.setSoTimeout(30000);
        this.field56.setTcpNoDelay(true);
        this.field36 = this.field56.getInputStream();
        this.field40 = this.field56.getOutputStream();
        this.field62 = arg2;
    }
}
