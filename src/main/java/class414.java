import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class class414 extends class468 {

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "Llea;")
    public class574 field5309;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
    public int field5317;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public static int field5300 = 0;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    public static int field5298 = 0;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field5293 = 0;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    private static int field5307 = 0;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
    public static int field5316 = 0;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    private static int field5312 = 0;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public static int field5311 = 0;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field5295 = 0;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    private static int field5296;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    private static int field5301;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    public int field5305;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
    private static int field5313;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    private static int field5320;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "[I")
    private int[] field5308;

    @OriginalMember(owner = "client!qv", name = "ba", descriptor = "(IIIIIII)V", line = 3)
    public final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5309.method3106()) {
            throw new IllegalStateException();
        }
        if (this.field5308 == null) {
            this.field5308 = new int[4];
        }
        this.field5309.method478(this.field5308);
        this.field5309.method451(this.field5309.field7374, this.field5309.field7357, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1552();
        int var9 = this.method1549();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method1543(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5309.method403(this.field5308[0], this.field5308[1], this.field5308[2], this.field5308[3]);
    }

    @OriginalMember(owner = "client!qv", name = "EA", descriptor = "(IIII)V", line = 45)
    public final void method1559(int arg0, int arg1, int arg2, int arg3) {
        this.field5290 = arg0;
        this.field5314 = arg1;
        this.field5310 = arg2;
        this.field5305 = arg3;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(FFFFFF)Z", line = 57)
    private final boolean method2311(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5292 + this.field5290 + this.field5310;
        int var8 = this.field5317 + this.field5314 + this.field5305;
        if (this.field5292 != var7 || this.field5317 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5314 * var11;
            float var14 = (float) this.field5314 * var12;
            float var15 = (float) this.field5290 * var9;
            float var16 = (float) this.field5290 * var10;
            float var17 = (float) this.field5310 * -var9;
            float var18 = (float) this.field5310 * -var10;
            float var19 = (float) this.field5305 * -var11;
            float var20 = (float) this.field5305 * -var12;
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
        if (var23 < (float) this.field5309.field7374) {
            var23 = this.field5309.field7374;
        }
        if (var24 > (float) this.field5309.field7350) {
            var24 = this.field5309.field7350;
        }
        if (var25 < (float) this.field5309.field7357) {
            var25 = this.field5309.field7357;
        }
        if (var26 > (float) this.field5309.field7367) {
            var26 = this.field5309.field7367;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field5319 = this.field5309.field7339;
        field5303 = (int) ((float) ((int) var25 * field5319) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5322 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5292 / var29);
        field5306 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5317 / var30);
        field5291 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5292 / var30);
        field5302 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5317 / var29);
        field5296 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5301 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5304 = (this.field5292 >> 1 << 12) + (field5301 * field5291 >> 4);
        field5294 = (this.field5317 >> 1 << 12) + (field5302 * field5301 >> 4);
        field5299 = field5322 * field5296 >> 4;
        field5297 = field5306 * field5296 >> 4;
        field5313 = (int) var23;
        field5318 = (int) var27;
        field5320 = (int) var25;
        field5315 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 193)
    public final void method1547(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8) {
        if (this.field5309.method3106()) {
            throw new IllegalStateException();
        } else if (this.method2311(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class2 var10 = (class2) arg6;
            this.method1780(var10.field6, var10.field5, field5313 - arg7, -arg8 - (field5315 - field5320));
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "()I", line = 215)
    public final int method1549() {
        return this.field5317 + this.field5314 + this.field5305;
    }

    @OriginalMember(owner = "client!qv", name = "AA", descriptor = "()I", line = 228)
    public final int method1552() {
        return this.field5292 + this.field5290 + this.field5310;
    }

    @OriginalMember(owner = "client!qv", name = "sa", descriptor = "(FFFFFFIII)V", line = 234)
    public final void method1554(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5309.method3106()) {
            throw new IllegalStateException();
        } else if (this.method2311(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field5321 = arg7;
            if (arg6 != 1) {
                field5316 = arg7 >>> 24;
                field5300 = 256 - field5316;
                if (arg6 == 0) {
                    field5295 = (arg7 & 0xFF0000) >> 16;
                    field5293 = (arg7 & 0xFF00) >> 8;
                    field5298 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field5307 = arg7 >>> 24;
                    field5312 = 256 - field5307;
                    int var10 = (arg7 & 0xFF00FF) * field5312 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field5312 & 0xFF0000;
                    field5311 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1781(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1781(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1781(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1781(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1781(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1781(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1781(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1781(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1781(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1781(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1781(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1781(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "QA", descriptor = "()I", line = 342)
    public final int method1556() {
        return this.field5292;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Llea;II)V", line = 350)
    public class414(class574 arg0, int arg1, int arg2) {
        this.field5309 = arg0;
        this.field5292 = arg1;
        this.field5317 = arg2;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "()I", line = 358)
    public final int method1544() {
        return this.field5317;
    }

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "(IIIII)V")
    public abstract void method1543(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([I[III)V")
    public abstract void method1780(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method1557(int arg0, int arg1, class219 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qv", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(II)V")
    public abstract void method1781(int arg0, int arg1);
}
