import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class466 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private int field6769 = 0;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    private int field6775 = 0;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field6772;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    private int field6767;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "[B")
    private byte[] field6776;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field6768;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lqt;")
    public static class459 field6774 = new class459(38, 2);

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field6780 = 16777215;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lwf;")
    public static class91 field6781;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field6766;

    static {
        new class44("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z", line = 11)
    public final boolean method2765(int arg0, int arg1) throws IOException {
        field6773++;
        if (arg0 <= 0 || arg0 >= this.field6767) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (arg1 != 0) {
                this.method2770(-56);
            }
            int var4;
            if (this.field6769 < this.field6775) {
                var4 = this.field6769 + this.field6767 - this.field6775;
            } else {
                var4 = this.field6769 - this.field6775;
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field6766 == null) {
                return false;
            } else {
                throw new IOException(this.field6766.toString());
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 44)
    public static void method2766(int arg0) {
        if (arg0 != 128) {
            method2767(null, 7, 124, -2, -29, -101, null, 40, null, -121, -80, -58, 11, -24, 51);
        }
        field6774 = null;
        field6781 = null;
    }

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V", line = 57)
    public final void run() {
        field6777++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6766 != null) {
                        return;
                    }
                    if (this.field6775 == 0) {
                        var2 = this.field6767 - this.field6769 - 1;
                    } else if (this.field6775 >= this.field6769) {
                        var2 = this.field6775 - this.field6769 - 1;
                    } else {
                        var2 = this.field6767 - this.field6769;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field6772.read(this.field6776, this.field6769, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6766 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6769 = (this.field6769 + var3) % this.field6767;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lkg;IIIIILqa;ILka;IIIIII)Lka;", line = 115)
    public static final class336 method2767(class183 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class167 arg6, int arg7, class336 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field6765++;
        if (arg8 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg0 != null) {
            int var16 = var15 | arg0.method1273(arg1, -1, 128, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg9 << 48) + (long) ((arg12 << 16) + (arg5 + (arg2 << 24))) + ((long) arg13 << 32);
        class511 var19 = class53.field980;
        class336 var20;
        synchronized (class53.field980) {
            var20 = (class336) class53.field980.method2982(0, var17);
        }
        if (var20 == null || arg6.method252(var20.method1166(), var15) != 0) {
            if (var20 != null) {
                var15 = arg6.method217(var15, var20.method1166());
            }
            byte var21;
            if (arg5 == 1) {
                var21 = 9;
            } else if (arg5 == 2) {
                var21 = 12;
            } else if (arg5 == 3) {
                var21 = 15;
            } else if (arg5 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class330 var24 = new class330((var21 * var22) + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method2084((byte) -112, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class358.field5204[var31] * var28 >> 15;
                    int var33 = class358.field5203[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2084((byte) 30, var32, var33, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg2 * var35 + arg12 * var36 >> 8);
                short var38 = (short) (((arg9 & 0x7F) * var35 + (arg13 & 0x7F) * var36 & 0x7F00) + ((arg9 & 0xFC00) * var35 + (arg13 & 0xFC00) * var36 & 0xFC0000) + ((arg9 & 0x380) * var35 + (arg13 & 0x380) * var36 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2088(var25, var26[0][var39], (short) -1, var26[0][(var39 + 1) % var21], (byte) 1, (byte) -1, var37, 1, var38);
                    } else {
                        var24.method2088(var26[var34 - 1][var39], var26[var34][(var39 + 1) % var21], (short) -1, var26[var34 - 1][(var39 + 1) % var21], (byte) 1, (byte) -1, var37, arg14, var38);
                        var24.method2088(var26[var34 - 1][var39], var26[var34][var39], (short) -1, var26[var34][(var39 + 1) % var21], (byte) 1, (byte) -1, var37, 1, var38);
                    }
                }
            }
            var20 = arg6.method225(var24, var15, class429.field6176, 64, 768);
            class511 var40 = class53.field980;
            synchronized (class53.field980) {
                class53.field980.method2981(var20, arg14 + 116, var17);
            }
        }
        int var41 = (arg5 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg3 != 0) {
            if ((arg3 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg3 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg3 & 0x8) != 0) {
                var42 -= 128;
            }
            if ((arg3 & 0x1) != 0) {
                var45 = var41 + 128;
            }
        }
        int var46 = arg8.method1137();
        int var47 = arg8.method1164();
        int var48 = arg8.method1139();
        if (var48 < var43) {
            var48 = var43;
        }
        int var49 = arg8.method1160();
        if (var47 > var44) {
            var47 = var44;
        }
        if (var42 > var46) {
            var46 = var42;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class543 var50 = null;
        if (arg0 != null) {
            int var51 = arg0.field2692[arg1];
            var50 = class96.field1526.method2714(var51 >> 16, (byte) 108);
            arg1 = var51 & 0xFFFF;
        }
        class336 var52;
        if (var50 == null) {
            var52 = var20.method1154((byte) 3, var15, true);
            var52.method1156(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1167(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method1154((byte) 3, var15, true);
            var52.method1156(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method1167(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2129(arg1, var50, true);
        }
        if (arg4 != 0) {
            var52.method1135(arg4);
        }
        if (arg14 != 1) {
            return null;
        }
        if (arg11 != 0) {
            var52.method1145(arg11);
        }
        if (arg10 != 0) {
            var52.method1167(0, arg10, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 331)
    public static final void method2768(int arg0) {
        if (arg0 == 0) {
            field6770++;
            class142.field2196.method2286((byte) 19);
            class450.field6574.method101((byte) -128);
            class392.field5573.method101((byte) -128);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V", line = 344)
    public final void method2769(int arg0) {
        field6778++;
        this.field6772 = new class436();
        if (arg0 != -8371) {
            this.field6769 = -118;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 367)
    public class466(InputStream arg0, int arg1) {
        this.field6772 = arg0;
        this.field6767 = arg1 + 1;
        this.field6776 = new byte[this.field6767];
        this.field6768 = new Thread(this);
        this.field6768.setDaemon(true);
        this.field6768.start();
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V", line = 382)
    public final void method2770(int arg0) {
        if (arg0 != -12495) {
            return;
        }
        synchronized (this) {
            if (this.field6766 == null) {
                this.field6766 = new IOException("");
            }
            this.notifyAll();
        }
        field6771++;
        try {
            this.field6768.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIIB)I", line = 408)
    public final int method2771(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field6779++;
        if (arg1 < 0 || arg2 < 0 || arg0.length < arg1 + arg2) {
            throw new IndexOutOfBoundsException();
        } else if (arg3 == 37) {
            synchronized (this) {
                int var6;
                if (this.field6769 >= this.field6775) {
                    var6 = this.field6769 - this.field6775;
                } else {
                    var6 = this.field6767 + this.field6769 - this.field6775;
                }
                if (var6 < arg1) {
                    arg1 = var6;
                }
                if (arg1 == 0 && this.field6766 != null) {
                    throw new IOException(this.field6766.toString());
                }
                if ((this.field6775 + arg1) <= this.field6767) {
                    class282.method1818(this.field6776, this.field6775, arg0, arg2, arg1);
                } else {
                    int var7 = this.field6767 - this.field6775;
                    class282.method1818(this.field6776, this.field6775, arg0, arg2, var7);
                    class282.method1818(this.field6776, 0, arg0, arg2 + var7, arg1 - var7);
                }
                this.field6775 = (this.field6775 + arg1) % this.field6767;
                this.notifyAll();
                return arg1;
            }
        } else {
            return -126;
        }
    }
}
