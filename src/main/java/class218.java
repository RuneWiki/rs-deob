import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class218 extends class202 {

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    private boolean field3352 = false;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    private int field3361 = -32768;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    private int field3371 = 0;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    private int field3378 = -1;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Z")
    private boolean field3355 = false;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    private int field3370 = 0;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    private int field3389;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    private int field3363;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    private int field3367;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    private int field3390;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    private int field3369;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    private int field3354;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "Lwk;")
    private class195 field3375;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3360 = "glow2:";

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field3364 = 5063219;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field3359 = 0;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "D")
    private double field3349;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "D")
    private double field3357;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "D")
    public double field3358;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "D")
    public double field3362;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "D")
    private double field3379;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "D")
    public double field3382;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "D")
    private double field3383;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "D")
    private double field3391;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    private int field3365;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "Lte;")
    private class220 field3372;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method1420(int arg0) {
        if (arg0 != 0) {
            method1422((byte) 60, -113);
        }
        field3360 = null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IIIII)V")
    public final void method1421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field3352) {
            double var6 = (double) (arg0 - this.field3390);
            double var8 = (double) (arg3 - this.field3354);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3358 = (double) this.field3367 * var8 / var10 + (double) this.field3354;
            this.field3362 = (double) this.field3363;
            this.field3382 = (double) this.field3367 * var6 / var10 + (double) this.field3390;
        }
        field3384++;
        double var12 = (double) (this.field3373 + 1 - arg4);
        this.field3349 = ((double) arg3 - this.field3358) / var12;
        if (arg1 != -19968) {
            this.field3375 = null;
        }
        this.field3383 = ((double) arg0 - this.field3382) / var12;
        this.field3391 = Math.sqrt(this.field3383 * this.field3383 + this.field3349 * this.field3349);
        if (this.field3369 == -1) {
            this.field3379 = ((double) arg2 - this.field3362) / var12;
        } else {
            if (!this.field3352) {
                this.field3379 = -this.field3391 * Math.tan((double) this.field3369 * 0.02454369D);
            }
            this.field3357 = ((double) arg2 - this.field3362 - (this.field3379 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)Lsl;")
    public static final class267 method1422(byte arg0, int arg1) {
        class267 var2 = (class267) class197.field3011.method1486((long) arg1, -19212);
        field3380++;
        if (arg0 < 65) {
            field3385 = -124;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class165.field2345.method2050(110, 11, arg1);
        class267 var4 = new class267();
        if (var3 != null) {
            var4.method1756(1, new class215(var3));
        }
        class197.field3011.method1489((long) arg1, 113, var4);
        return var4;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)V")
    public final void method1423(boolean arg0, int arg1) {
        this.field3352 = true;
        this.field3382 += (double) arg1 * this.field3383;
        field3356++;
        if (this.field3369 == -1) {
            this.field3362 += (double) arg1 * this.field3379;
        } else {
            this.field3362 += this.field3357 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3379;
            this.field3379 += (double) arg1 * this.field3357;
        }
        this.field3358 += (double) arg1 * this.field3349;
        this.field3392 = (int) (Math.atan2(this.field3349, this.field3383) * 325.949D) + 1024 & 0x7FF;
        this.field3365 = (int) (Math.atan2(this.field3379, this.field3391) * 325.949D) & 0x7FF;
        if (this.field3375 != null) {
            this.field3370 += arg1;
            label45: while (true) {
                do {
                    do {
                        if (this.field3375.field2966[this.field3371] >= this.field3370) {
                            break label45;
                        }
                        this.field3370 -= this.field3375.field2966[this.field3371];
                        this.field3371++;
                        if (this.field3375.field2989.length <= this.field3371) {
                            this.field3371 -= this.field3375.field2984;
                            if (this.field3371 < 0 || this.field3371 >= this.field3375.field2989.length) {
                                this.field3371 = 0;
                            }
                        }
                        this.field3378 = this.field3371 + 1;
                    } while (this.field3375.field2989.length > this.field3378);
                    this.field3378 -= this.field3375.field2984;
                } while (this.field3378 >= 0 && this.field3378 < this.field3375.field2989.length);
                this.field3378 = -1;
            }
        }
        if (arg0) {
            this.field3357 = 0.22598555535126083D;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIIJILte;)V")
    public final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class220 arg10) {
        field3374++;
        class94 var13 = this.method1424((byte) 111);
        if (var13 != null) {
            this.method1428(111, var13);
            var13.method11(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3372);
            this.field3361 = var13.method9();
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lmi;")
    private final class94 method1424(byte arg0) {
        field3348++;
        class167 var2 = class291.method1952(0, this.field3389);
        class94 var3 = var2.method1072(this.field3371, 1, this.field3378, this.field3370);
        if (var3 == null) {
            return null;
        }
        var3.method413(this.field3365);
        if (arg0 < 5) {
            this.method1428(-46, (class94) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()I")
    public final int method9() {
        field3368++;
        return this.field3361;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)Llc;")
    public static final class307 method1425(int arg0, byte arg1) {
        field3351++;
        class307 var2 = (class307) class15.field267.method950((long) arg0, (byte) -45);
        if (arg1 != -124) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class10.field136.method2050(76, class177.method1116(-1019628630, arg0), class191.method1208((byte) 54, arg0));
            class307 var4 = new class307();
            if (var3 != null) {
                var4.method2091(new class215(var3), false);
            }
            class15.field267.method942((long) arg0, (byte) 101, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIZIII)Z")
    public static final boolean method1426(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field3376++;
        if (arg1 >= (arg3 + arg8) || arg3 >= arg1 + arg2) {
            return false;
        } else if (arg4 + arg0 > arg7 && arg6 + arg7 > arg4) {
            return !arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V")
    public final void method7(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3381++;
        if (!this.field3355) {
            class94 var6 = this.method1424((byte) 113);
            if (var6 == null) {
                return;
            }
            this.method1428(119, var6);
        }
        if (this.field3372 != null) {
            this.field3372.method1442(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILga;)Z")
    public static final boolean method1427(int arg0, class149 arg1) {
        field3350++;
        if (arg0 != -1) {
            field3360 = null;
        }
        if (arg1 == null) {
            return false;
        } else if (!arg1.field2062) {
            return false;
        } else if (!arg1.method937(arg0 - 103)) {
            return false;
        } else if (class53.field750.method1453(true, (long) arg1.field2029) == null) {
            return class307.field4942.method1453(true, (long) arg1.field2059) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILmi;)V")
    private final void method1428(int arg0, class94 arg1) {
        field3387++;
        if (arg0 <= 80) {
            this.field3366 = 113;
        }
        class66 var3 = (class66) arg1;
        if ((this.field3372 == null || this.field3372.field3413) && (var3.field884 != null || var3.field885 != null)) {
            this.field3372 = new class220(class35.field533, 1, 1);
        }
        if (this.field3372 != null) {
            this.field3372.method1443(var3.field884, var3.field885, false, var3.field872, var3.field901, var3.field903);
        }
        this.field3355 = true;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3389 = arg0;
        this.field3363 = arg4;
        this.field3377 = arg9;
        this.field3367 = arg8;
        this.field3352 = false;
        this.field3366 = arg5;
        this.field3390 = arg3;
        this.field3369 = arg7;
        this.field3353 = arg10;
        this.field3354 = arg2;
        this.field3393 = arg1;
        this.field3373 = arg6;
        int var12 = class291.method1952(0, this.field3389).field2375;
        if (var12 == -1) {
            this.field3375 = null;
        } else {
            this.field3375 = class280.method1815(var12, 78);
        }
    }
}
