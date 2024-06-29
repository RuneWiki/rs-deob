import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class230 extends class471 {

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    private int field3023 = -1;

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "Z")
    private boolean field3046 = false;

    @OriginalMember(owner = "client!om", name = "hb", descriptor = "I")
    private int field3053 = -32768;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "I")
    private int field3038 = 0;

    @OriginalMember(owner = "client!om", name = "lb", descriptor = "I")
    private int field3057 = 0;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!om", name = "kb", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "I")
    private int field3043;

    @OriginalMember(owner = "client!om", name = "eb", descriptor = "I")
    public int field3050;

    @OriginalMember(owner = "client!om", name = "cb", descriptor = "I")
    private int field3048;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public int field3035;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "Lnb;")
    private class181 field3033;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field3025 = field3020;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "[I")
    public static int[] field3030 = new int[50];

    @OriginalMember(owner = "client!om", name = "nb", descriptor = "I")
    public static int field3059 = field3020 >> 2;

    @OriginalMember(owner = "client!om", name = "fb", descriptor = "Lgd;")
    public static class206 field3051 = new class206("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!om", name = "y", descriptor = "D")
    private double field3018;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "D")
    private double field3022;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "D")
    private double field3027;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "D")
    private double field3031;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "D")
    private double field3034;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "D")
    private double field3039;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "D")
    private double field3044;

    @OriginalMember(owner = "client!om", name = "db", descriptor = "D")
    private double field3049;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    private int field3032;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    private int field3037;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!om", name = "bb", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!om", name = "gb", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!om", name = "ib", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!om", name = "jb", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!om", name = "mb", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!om", name = "ob", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "Loh;")
    private class256 field3016;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Lwm;B)Lnf;")
    public final class374 method3(class364 arg0, byte arg1) {
        ++field3045;
        if (arg1 < 99) {
            this.method2(-116, -19, -108, (class364) null, true, (class197) null, true);
        }
        class456 var3 = this.method1286(1024, (byte) 126, arg0);
        if (var3 == null) {
            return null;
        } else {
            class203 var4 = arg0.method1960();
            var4.method1031(this.field3037);
            var4.method1032(this.field3032);
            var4.method1027((int) this.field3022, (int) this.field3049, (int) this.field3044);
            if (this.field3016 != null) {
                class342 var5 = this.field3016.method1441();
                arg0.method2051(var3, var5, var4, (class478) null, 0);
            } else {
                var3.method1880(var4, (class478) null, 0);
            }
            this.field3053 = var3.method1871();
            this.method1283((byte) -16, arg0, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V")
    public final void method1281(byte arg0) {
        ++field3054;
        if (arg0 != 74) {
            this.finalize();
        }
        if (this.field3016 != null) {
            this.field3016.method1437();
        }
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
    public final void method8(int arg0) {
        if (arg0 > -74) {
            this.field3038 = -97;
        }
        ++field3029;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
    public final void method1282(int arg0, boolean arg1) {
        this.field3022 += (double) arg0 * this.field3027;
        this.field3044 += (double) arg0 * this.field3034;
        ++field3036;
        this.field3046 = arg1;
        if (this.field3056 == -1) {
            this.field3049 += (double) arg0 * this.field3039;
        } else {
            this.field3049 += this.field3031 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3039;
            this.field3039 += (double) arg0 * this.field3031;
        }
        this.field3032 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field3027, this.field3034)) + 8192;
        this.field3037 = (int) (2607.5945876176133D * Math.atan2(this.field3039, this.field3018)) & 16383;
        if (this.field3033 != null) {
            this.field3057 += arg0;
            while (true) {
                do {
                    do {
                        if (~this.field3057 >= ~this.field3033.field2466[this.field3038]) {
                            return;
                        }
                        this.field3057 -= this.field3033.field2466[this.field3038];
                        ++this.field3038;
                        if (this.field3038 >= this.field3033.field2468.length) {
                            this.field3038 -= this.field3033.field2481;
                            if (~this.field3038 > -1 || this.field3033.field2468.length <= this.field3038) {
                                this.field3038 = 0;
                            }
                        }
                        this.field3023 = this.field3038 - -1;
                    } while (~this.field3033.field2468.length < ~this.field3023);
                    this.field3023 -= this.field3033.field2481;
                } while (this.field3023 >= 0 && ~this.field3023 > ~this.field3033.field2468.length);
                this.field3023 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLwm;Lgn;)V")
    private final void method1283(byte arg0, class364 arg1, class456 arg2) {
        if (arg0 != -16) {
            this.field3049 = -0.77606290390948D;
        }
        ++field3026;
        class130[] var4 = arg2.method1839();
        class304[] var5 = arg2.method1845();
        if ((this.field3016 == null || this.field3016.field3394) && (var4 != null || var5 != null)) {
            this.field3016 = new class256(class70.field968);
        }
        if (this.field3016 != null) {
            this.field3016.method1440(arg1, (long) class70.field968, var4, var5, false);
            this.field3016.method1444(super.field6502, super.field6500, super.field6505, super.field6491, super.field6497);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILwm;ZLhp;Z)V")
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        if (arg6) {
            ++field3024;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIBLwm;)Z")
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        ++field3042;
        if (arg2 >= -107) {
            this.field3053 = -17;
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field3051 = null;
        field3030 = null;
        int var1 = 100 / ((arg0 - -55) / 42);
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(I)I")
    public final int method6(int arg0) {
        if (arg0 != 0) {
            return 18;
        } else {
            ++field3041;
            return this.field3053;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IJ)V")
    public static final void method1285(int arg0, long arg1) {
        if (arg0 != -1) {
            field3059 = 5;
        }
        ++field3055;
        int var3 = class186.field2560;
        if (class87.field1215 != var3) {
            int var4 = -class87.field1215 + var3;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (~var5 != -1) {
                    if (var5 > var4) {
                        var5 = var4;
                    }
                } else {
                    var5 = 1;
                }
            } else if (~var5 != -1) {
                if (var5 < var4) {
                    var5 = var4;
                }
            } else {
                var5 = -1;
            }
            class87.field1215 += var5;
        }
        int var6 = class23.field306;
        if (!class488.field6789.field6670) {
            class270.field3610 += (float) arg1 * class216.field2912 / 40.0F * 8.0F;
            class239.field3186 += (float) arg1 * class63.field842 / 40.0F * 8.0F;
        }
        if (class36.field544 != var6) {
            int var7 = -class36.field544 + var6;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (~var8 != -1) {
                    if (var7 < var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (~var7 < ~var8) {
                var8 = var7;
            }
            class36.field544 += var8;
        }
        class403.method2439((byte) 105);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field3017 = arg9;
        this.field3028 = arg6;
        this.field3056 = arg7;
        this.field3043 = arg0;
        this.field3050 = arg10;
        this.field3048 = arg8;
        this.field3035 = arg5;
        this.field3046 = false;
        int var12 = class302.field4030.method1394(this.field3043, -7290).field3310;
        if (var12 != -1) {
            this.field3033 = class395.field5477.method266(16107, var12);
        } else {
            this.field3033 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        ++field3052;
        if (arg0 != 7) {
            this.field3048 = -72;
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBLwm;)Lgn;")
    private final class456 method1286(int arg0, byte arg1, class364 arg2) {
        int var4 = 99 % ((arg1 - 73) / 46);
        ++field3058;
        class248 var5 = class302.field4030.method1394(this.field3043, -7290);
        return var5.method1392(this.field3023, this.field3057, arg2, (byte) -112, arg0, class395.field5477, this.field3038);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lwm;B)V")
    public final void method10(class364 arg0, byte arg1) {
        ++field3021;
        class456 var3 = this.method1286(0, (byte) -128, arg0);
        if (var3 != null) {
            class203 var4 = arg0.method1960();
            var4.method1031(this.field3037);
            var4.method1032(this.field3032);
            var4.method1027((int) this.field3022, (int) this.field3049, (int) this.field3044);
            this.field3053 = var3.method1871();
            if (arg1 < -48) {
                this.method1283((byte) -16, arg0, var3);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public final void method538(byte arg0) {
        super.field6500 = super.field6505 = (short) ((int) (this.field3022 / 128.0D));
        ++field3040;
        if (arg0 != 127) {
            this.method1283((byte) 78, (class364) null, (class456) null);
        }
        super.field6491 = super.field6497 = (short) ((int) (this.field3044 / 128.0D));
    }

    @OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3016 != null) {
            this.field3016.method1437();
        }
        ++field3047;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIZI)V")
    public final void method1287(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!this.field3046) {
            double var6 = (double) (-super.field6501 + arg1);
            double var8 = (double) (-super.field6507 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3044 = (double) this.field3048 * var8 / var10 + (double) super.field6507;
            this.field3022 = (double) this.field3048 * var6 / var10 + (double) super.field6501;
            this.field3049 = (double) super.field6503;
        }
        ++field3019;
        double var12 = (double) (-arg2 + 1 + this.field3028);
        this.field3027 = ((double) arg1 + -this.field3022) / var12;
        this.field3034 = ((double) arg4 - this.field3044) / var12;
        this.field3018 = Math.sqrt(this.field3034 * this.field3034 + this.field3027 * this.field3027);
        if (this.field3056 == -1) {
            this.field3039 = ((double) arg0 + -this.field3049) / var12;
        } else {
            if (!this.field3046) {
                this.field3039 = -this.field3018 * Math.tan((double) this.field3056 * 0.02454369D);
            }
            this.field3031 = ((double) arg0 + -this.field3049 + -(this.field3039 * var12)) * 2.0D / (var12 * var12);
        }
        if (!arg3) {
            this.field3046 = false;
        }
    }
}
