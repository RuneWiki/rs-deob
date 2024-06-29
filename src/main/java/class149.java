import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class149 {

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "J")
    private long field2285 = -1L;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "J")
    private long field2295 = -1L;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    private int field2298 = 0;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Loh;")
    private class453 field2292;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "J")
    private long field2284;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "J")
    private long field2303;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "J")
    private long field2283;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "[B")
    private byte[] field2286;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "[B")
    private byte[] field2297;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "Lrb;")
    public static class283 field2299 = new class283(89, 6);

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "J")
    private long field2291;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Lug;")
    public static class330 field2289;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    private final void method1073(int arg0) throws IOException {
        this.field2301 = 0;
        field2306++;
        int var2 = 84 / ((arg0 - 45) / 56);
        if (this.field2291 != this.field2283) {
            this.field2292.method2658(this.field2283, (byte) 36);
            this.field2291 = this.field2283;
        }
        this.field2285 = this.field2283;
        while (this.field2301 < this.field2286.length) {
            int var3 = this.field2286.length - this.field2301;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field2292.method2657(this.field2301, var3, -107, this.field2286);
            if (var4 == -1) {
                break;
            }
            this.field2291 += var4;
            this.field2301 += var4;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method1074(byte arg0) {
        if (arg0 >= -38) {
            return null;
        } else {
            field2287++;
            return this.field2292.method2661(-27008);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
    private final void method1075(boolean arg0) throws IOException {
        if (arg0) {
            this.field2292 = null;
        }
        field2290++;
        if (this.field2295 == -1L) {
            return;
        }
        if (this.field2295 != this.field2291) {
            this.field2292.method2658(this.field2295, (byte) 36);
            this.field2291 = this.field2295;
        }
        this.field2292.method2662(this.field2298, (byte) -114, this.field2297, 0);
        this.field2291 += this.field2298;
        if (this.field2291 > this.field2284) {
            this.field2284 = this.field2291;
        }
        long var2 = -1L;
        if (this.field2285 <= this.field2295 && this.field2295 < this.field2285 + ((long) this.field2301)) {
            var2 = this.field2295;
        } else if (this.field2285 >= this.field2295 && (long) this.field2298 + this.field2295 > this.field2285) {
            var2 = this.field2285;
        }
        long var4 = -1L;
        if (((long) this.field2298 + this.field2295) > this.field2285 && ((long) this.field2298 + this.field2295) <= ((long) this.field2301 + this.field2285)) {
            var4 = this.field2295 + ((long) this.field2298);
        } else if (this.field2295 < (long) this.field2301 + this.field2285 && ((long) this.field2298 + this.field2295) >= ((long) this.field2301 + this.field2285)) {
            var4 = (long) this.field2301 + this.field2285;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class57.method372(this.field2297, (int) (var2 - this.field2295), this.field2286, (int) (var2 - this.field2285), var6);
        }
        this.field2298 = 0;
        this.field2295 = -1L;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(JI)V")
    public final void method1076(long arg0, int arg1) throws IOException {
        field2308++;
        if (arg1 > -69) {
            method1080((byte) -125);
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1074((byte) -56));
        }
        this.field2283 = arg0;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([[B[II[BI[[BI[I)I")
    public static final int method1077(byte[][] arg0, int[] arg1, int arg2, byte[] arg3, int arg4, byte[][] arg5, int arg6, int[] arg7) {
        field2293++;
        int var8 = arg7[arg4];
        int var9 = var8 + arg1[arg4];
        int var10 = arg7[arg2];
        int var11 = arg1[arg2] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg3[arg4] & 0xFF;
        if ((arg3[arg2] & 0xFF) < var14) {
            var14 = arg3[arg2] & 0xFF;
        }
        byte[] var15 = arg0[arg4];
        byte[] var16 = arg5[arg2];
        if (arg6 <= 9) {
            return 31;
        }
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZI)V")
    public static final void method1078(int arg0, boolean arg1, int arg2) {
        field2302++;
        class274.method1602(14, class17.field271);
        if (arg1) {
            field2299 = null;
        }
        class119.field1865++;
        class17.field275.method1832(32767, arg0);
        class17.field275.method1866(arg2, !arg1);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([BI)V")
    public final void method1079(byte[] arg0, int arg1) throws IOException {
        field2307++;
        this.method1081(arg0.length, arg0, 0, 0);
        if (arg1 != 10789) {
            method1078(-53, false, 104);
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V")
    public static void method1080(byte arg0) {
        int var1 = -30 / ((arg0 + 14) / 60);
        field2299 = null;
        field2289 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I[BII)V")
    public final void method1081(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2296++;
        try {
            if (arg1.length < arg3 + arg0) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (this.field2295 != -1L && this.field2295 <= this.field2283 && (long) arg0 + this.field2283 <= (long) this.field2298 + this.field2295) {
                class57.method372(this.field2297, (int) (this.field2283 - this.field2295), arg1, arg3, arg0);
                this.field2283 += arg0;
                return;
            }
            long var5 = this.field2283;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field2285 <= this.field2283 && (long) this.field2301 + this.field2285 > this.field2283) {
                int var9 = (int) (this.field2285 + (long) this.field2301 - this.field2283);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class57.method372(this.field2286, (int) (this.field2283 - this.field2285), arg1, arg3, var9);
                arg3 += var9;
                this.field2283 += var9;
                arg0 -= var9;
            }
            if (this.field2286.length < arg0) {
                this.field2292.method2658(this.field2283, (byte) 36);
                this.field2291 = this.field2283;
                while (arg0 > 0) {
                    int var11 = this.field2292.method2657(arg3, arg0, -74, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2283 += var11;
                    arg0 -= var11;
                    this.field2291 += var11;
                    arg3 += var11;
                }
            } else if (arg0 > 0) {
                this.method1073(102);
                int var10 = arg0;
                if (this.field2301 < arg0) {
                    var10 = this.field2301;
                }
                class57.method372(this.field2286, 0, arg1, arg3, var10);
                this.field2283 += var10;
                arg3 += var10;
                arg0 -= var10;
            }
            if (this.field2295 != -1L) {
                if (this.field2295 > this.field2283 && arg0 > 0) {
                    int var12 = arg3 + ((int) (this.field2295 - this.field2283));
                    if (var12 > (arg0 + arg3)) {
                        var12 = arg0 + arg3;
                    }
                    while (arg3 < var12) {
                        arg0--;
                        arg1[arg3++] = 0;
                        this.field2283++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field2295 >= var5 && this.field2295 < ((long) var8 + var5)) {
                    var13 = this.field2295;
                } else if (this.field2295 <= var5 && (long) this.field2298 + this.field2295 > var5) {
                    var13 = var5;
                }
                if (this.field2295 + ((long) this.field2298) > var5 && var5 + ((long) var8) >= (long) this.field2298 + this.field2295) {
                    var15 = (long) this.field2298 + this.field2295;
                } else if ((long) var8 + var5 > this.field2295 && (long) var8 + var5 <= this.field2295 - -((long) this.field2298)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class57.method372(this.field2297, (int) (var13 - this.field2295), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (this.field2283 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field2283));
                        this.field2283 = var15;
                    }
                }
            }
            if (arg2 != 0) {
                this.field2291 = -115L;
            }
        } catch (IOException var19) {
            this.field2291 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
    public static final void method1082(int arg0, boolean arg1) {
        int var2 = -31 / ((61 - arg0) / 50);
        if (arg1) {
            if (class236.field3268 != -1) {
                class378.method2257(-17958, class236.field3268);
            }
            for (class91 var3 = (class91) class425.field6168.method1588(25); var3 != null; var3 = (class91) class425.field6168.method1582(-108)) {
                if (!var3.method2790(-127)) {
                    var3 = (class91) class425.field6168.method1588(124);
                    if (var3 == null) {
                        break;
                    }
                }
                class147.method1052(var3, false, true, -4);
            }
            class236.field3268 = -1;
            class425.field6168 = new class270(8);
            class241.method1467((byte) -77);
            class236.field3268 = class133.field2029;
            class454.method2663(true, false);
            class157.method1127(1508614222);
            class47.method317(class236.field3268);
        }
        field2294++;
        class527.field7689 = true;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I[BII)V")
    public final void method1083(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2300++;
        try {
            if (((long) arg0 + this.field2283) > this.field2303) {
                this.field2303 = (long) arg0 + this.field2283;
            }
            if ((long) arg2 != this.field2295 && (this.field2283 < this.field2295 || ((long) this.field2298 + this.field2295) < this.field2283)) {
                this.method1075(false);
            }
            if (this.field2295 != -1L && (long) this.field2297.length + this.field2295 < (long) arg0 + this.field2283) {
                int var5 = (int) ((long) this.field2297.length + this.field2295 - this.field2283);
                class57.method372(arg1, arg3, this.field2297, (int) (this.field2283 - this.field2295), var5);
                this.field2283 += var5;
                arg3 += var5;
                arg0 -= var5;
                this.field2298 = this.field2297.length;
                this.method1075(false);
            }
            if (this.field2297.length < arg0) {
                if (this.field2291 != this.field2283) {
                    this.field2292.method2658(this.field2283, (byte) 36);
                    this.field2291 = this.field2283;
                }
                this.field2292.method2662(arg0, (byte) -68, arg1, arg3);
                this.field2291 += arg0;
                if (this.field2284 < this.field2291) {
                    this.field2284 = this.field2291;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2285 <= this.field2283 && this.field2283 < (long) this.field2301 + this.field2285) {
                    var6 = this.field2283;
                } else if (this.field2283 <= this.field2285 && this.field2285 < ((long) arg0 + this.field2283)) {
                    var6 = this.field2285;
                }
                if (this.field2285 < ((long) arg0 + this.field2283) && (long) arg0 + this.field2283 <= (long) this.field2301 + this.field2285) {
                    var8 = this.field2283 + ((long) arg0);
                } else if (this.field2283 < (long) this.field2301 + this.field2285 && ((long) this.field2301 + this.field2285) <= (this.field2283 + ((long) arg0))) {
                    var8 = this.field2285 + ((long) this.field2301);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class57.method372(arg1, (int) ((long) arg3 + var6 - this.field2283), this.field2286, (int) (var6 - this.field2285), var10);
                }
                this.field2283 += arg0;
            } else if (arg0 > 0) {
                if (this.field2295 == -1L) {
                    this.field2295 = this.field2283;
                }
                class57.method372(arg1, arg3, this.field2297, (int) (this.field2283 - this.field2295), arg0);
                this.field2283 += arg0;
                if (((long) this.field2298) < (this.field2283 - this.field2295)) {
                    this.field2298 = (int) (this.field2283 - this.field2295);
                }
            }
        } catch (IOException var12) {
            this.field2291 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lgk;ZZIIILgk;)I")
    public static final int method1084(class468 arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, class468 arg6) {
        field2288++;
        int var7 = class530.method3136(arg2, arg6, arg3, arg0, true);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (~arg4 == arg5) {
            return 0;
        } else {
            int var8 = class530.method3136(arg1, arg6, arg4, arg0, true);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)J")
    public final long method1085(int arg0) {
        int var2 = -1 % ((-arg0 - 32) / 35);
        field2305++;
        return this.field2303;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Loh;II)V")
    public class149(class453 arg0, int arg1, int arg2) throws IOException {
        this.field2292 = arg0;
        this.field2303 = this.field2284 = arg0.method2660((byte) -51);
        this.field2283 = 0L;
        this.field2286 = new byte[arg1];
        this.field2297 = new byte[arg2];
    }
}
