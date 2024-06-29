import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class462 extends class404 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lfe;")
    public class150 field6452;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public int field6464;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public int field6475;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field6466 = 0;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field6474 = 0;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field6470 = 0;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field6477 = 0;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field6473 = 0;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    private static int field6476 = 0;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    private static int field6467 = 0;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field6480 = 0;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public int field6453;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    private static int field6459;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    private static int field6461;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    private static int field6471;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    private static int field6472;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public int field6478;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "[I")
    private int[] field6465;

    @OriginalMember(owner = "client!ij", name = "aa", descriptor = "(FFFFFFIII)V")
    public final void method371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6452.method1030()) {
            throw new IllegalStateException();
        }
        this.method2716(arg0, arg1, arg2, arg3, arg4, arg5);
        field6451 = arg7;
        if (arg6 != 1) {
            field6473 = arg7 >>> 24;
            field6474 = 256 - field6473;
            if (arg6 == 0) {
                field6470 = (arg7 & 0xFF0000) >> 16;
                field6466 = (arg7 & 0xFF00) >> 8;
                field6480 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field6467 = arg7 >>> 24;
                field6476 = 256 - field6467;
                int var10 = (arg7 & 0xFF00FF) * field6476 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field6476 & 0xFF0000;
                field6477 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method357(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method357(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method357(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method357(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method357(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method357(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method357(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method357(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method357(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method357(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method357(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method357(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "JA", descriptor = "()I")
    public final int method369() {
        return this.field6475 + this.field6458 + this.field6453;
    }

    @OriginalMember(owner = "client!ij", name = "ja", descriptor = "()I")
    public final int method370() {
        return this.field6464 + this.field6460 + this.field6478;
    }

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ij", name = "YA", descriptor = "(IIIII)V")
    public abstract void method353(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)V")
    public abstract void method357(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILea;II)V")
    public abstract void method351(int arg0, int arg1, class113 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ij", name = "ka", descriptor = "(IIII)V")
    public final void method379(int arg0, int arg1, int arg2, int arg3) {
        this.field6460 = arg0;
        this.field6458 = arg1;
        this.field6478 = arg2;
        this.field6453 = arg3;
    }

    @OriginalMember(owner = "client!ij", name = "UA", descriptor = "()I")
    public final int method375() {
        return this.field6464;
    }

    @OriginalMember(owner = "client!ij", name = "qa", descriptor = "()I")
    public final int method378() {
        return this.field6475;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(FFFFFF)V")
    private final void method2716(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6464 + this.field6460 + this.field6478;
        int var8 = this.field6475 + this.field6458 + this.field6453;
        if (this.field6464 != var7 || this.field6475 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6458 * var11;
            float var14 = (float) this.field6458 * var12;
            float var15 = (float) this.field6460 * var9;
            float var16 = (float) this.field6460 * var10;
            float var17 = (float) this.field6478 * -var9;
            float var18 = (float) this.field6478 * -var10;
            float var19 = (float) this.field6453 * -var11;
            float var20 = (float) this.field6453 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field6452.field2014) {
            var23 = this.field6452.field2014;
        }
        if (var24 > (float) this.field6452.field1992) {
            var24 = this.field6452.field1992;
        }
        if (var25 < (float) this.field6452.field2009) {
            var25 = this.field6452.field2009;
        }
        if (var26 > (float) this.field6452.field2004) {
            var26 = this.field6452.field2004;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field6456 = this.field6452.field2013;
        field6462 = (int) ((float) ((int) var25 * field6456) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6468 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6464 / var29);
        field6457 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6475 / var30);
        field6463 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6464 / var30);
        field6481 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6475 / var29);
        field6471 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6472 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6455 = (this.field6464 >> 1 << 12) + (field6472 * field6463 >> 4);
        field6479 = (this.field6475 >> 1 << 12) + (field6481 * field6472 >> 4);
        field6482 = field6471 * field6468 >> 4;
        field6483 = field6471 * field6457 >> 4;
        field6459 = (int) var23;
        field6469 = (int) var27;
        field6461 = (int) var25;
        field6454 = (int) var28;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([I[III)V")
    public abstract void method352(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "(IIIIIII)V")
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6452.method1030()) {
            throw new IllegalStateException();
        }
        if (this.field6465 == null) {
            this.field6465 = new int[4];
        }
        this.field6452.method846(this.field6465);
        this.field6452.method899(this.field6452.field2014, this.field6452.field2009, arg0 + arg2, arg1 + arg3);
        int var8 = this.method370();
        int var9 = this.method369();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method353(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6452.method925(this.field6465[0], this.field6465[1], this.field6465[2], this.field6465[3]);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method372(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class113 arg6, int arg7, int arg8) {
        if (this.field6452.method1030()) {
            throw new IllegalStateException();
        }
        this.method2716(arg0, arg1, arg2, arg3, arg4, arg5);
        class64 var10 = (class64) arg6;
        this.method352(var10.field815, var10.field816, field6459 - arg7, -arg8 - (field6454 - field6461));
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lfe;II)V")
    public class462(class150 arg0, int arg1, int arg2) {
        this.field6452 = arg0;
        this.field6464 = arg1;
        this.field6475 = arg2;
    }
}
