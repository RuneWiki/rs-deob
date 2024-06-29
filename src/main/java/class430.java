import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class class430 extends class154 {

    @OriginalMember(owner = "client!am", name = "B", descriptor = "Llo;")
    public class509 field6330;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field6309;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field6305 = 0;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field6316 = 0;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    private static int field6314 = 0;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field6307 = 0;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    private static int field6311 = 0;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field6329 = 0;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    public static int field6333 = 0;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public static int field6334 = 0;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    private static int field6306;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public int field6308;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public int field6312;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    private static int field6317;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    private static int field6321;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public int field6326;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    private static int field6335;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "[I")
    private int[] field6332;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(FFFFFFIII)V", line = 4)
    public final void method997(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6330.method3048()) {
            throw new IllegalStateException();
        }
        this.method2526(arg0, arg1, arg2, arg3, arg4, arg5);
        field6323 = arg7;
        if (arg6 != 1) {
            field6333 = arg7 >>> 24;
            field6329 = 256 - field6333;
            if (arg6 == 0) {
                field6307 = (arg7 & 0xFF0000) >> 16;
                field6305 = (arg7 & 0xFF00) >> 8;
                field6316 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field6311 = arg7 >>> 24;
                field6314 = 256 - field6311;
                int var10 = (arg7 & 0xFF00FF) * field6314 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field6314 & 0xFF0000;
                field6334 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method573(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method573(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method573(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method573(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method573(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method573(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method573(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method573(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method573(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method573(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method573(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method573(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()I", line = 108)
    public final int method989() {
        return this.field6309 + this.field6303 + this.field6326;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()I", line = 112)
    public final int method988() {
        return this.field6331 + this.field6312 + this.field6308;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "()I", line = 122)
    public final int method1001() {
        return this.field6331;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(FFFFFF)V", line = 133)
    private final void method2526(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6331 + this.field6312 + this.field6308;
        int var8 = this.field6309 + this.field6303 + this.field6326;
        if (this.field6331 != var7 || this.field6309 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6303 * var11;
            float var14 = (float) this.field6303 * var12;
            float var15 = (float) this.field6312 * var9;
            float var16 = (float) this.field6312 * var10;
            float var17 = (float) this.field6308 * -var9;
            float var18 = (float) this.field6308 * -var10;
            float var19 = (float) this.field6326 * -var11;
            float var20 = (float) this.field6326 * -var12;
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
        if (var23 < (float) this.field6330.field7723) {
            var23 = this.field6330.field7723;
        }
        if (var24 > (float) this.field6330.field7698) {
            var24 = this.field6330.field7698;
        }
        if (var25 < (float) this.field6330.field7731) {
            var25 = this.field6330.field7731;
        }
        if (var26 > (float) this.field6330.field7703) {
            var26 = this.field6330.field7703;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field6325 = this.field6330.field7711;
        field6310 = (int) ((float) ((int) var25 * field6325) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6304 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6331 / var29);
        field6320 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6309 / var30);
        field6322 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6331 / var30);
        field6328 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6309 / var29);
        field6335 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6321 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6313 = (this.field6331 >> 1 << 12) + (field6322 * field6321 >> 4);
        field6327 = (this.field6309 >> 1 << 12) + (field6328 * field6321 >> 4);
        field6315 = field6335 * field6304 >> 4;
        field6318 = field6335 * field6320 >> 4;
        field6317 = (int) var23;
        field6324 = (int) var27;
        field6306 = (int) var25;
        field6319 = (int) var28;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(FFFFFFLbe;II)V", line = 273)
    public final void method1000(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class28 arg6, int arg7, int arg8) {
        if (this.field6330.method3048()) {
            throw new IllegalStateException();
        }
        this.method2526(arg0, arg1, arg2, arg3, arg4, arg5);
        class388 var10 = (class388) arg6;
        this.method571(var10.field5622, var10.field5618, field6317 - arg7, -arg8 - (field6319 - field6306));
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "()I", line = 282)
    public final int method993() {
        return this.field6309;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(IIIIIII)V", line = 295)
    public final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6330.method3048()) {
            throw new IllegalStateException();
        }
        if (this.field6332 == null) {
            this.field6332 = new int[4];
        }
        this.field6330.method1936(this.field6332);
        this.field6330.method1948(this.field6330.field7723, this.field6330.field7731, arg0 + arg2, arg1 + arg3);
        int var8 = this.method988();
        int var9 = this.method989();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method577(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6330.method1982(this.field6332[0], this.field6332[1], this.field6332[2], this.field6332[3]);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)V", line = 344)
    public final void method992(int arg0, int arg1, int arg2, int arg3) {
        this.field6312 = arg0;
        this.field6303 = arg1;
        this.field6308 = arg2;
        this.field6326 = arg3;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Llo;II)V", line = 349)
    public class430(class509 arg0, int arg1, int arg2) {
        this.field6330 = arg0;
        this.field6331 = arg1;
        this.field6309 = arg2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILbe;II)V")
    public abstract void method574(int arg0, int arg1, class28 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
    public abstract void method573(int arg0, int arg1);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V")
    public abstract void method577(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([I[III)V")
    public abstract void method571(int[] arg0, int[] arg1, int arg2, int arg3);
}
