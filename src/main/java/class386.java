import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class386 implements class615 {

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "Lvca;")
    private class675 field5656 = new class675(256);

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "Lvo;")
    private class345 field5661;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Lvo;")
    private class345 field5648;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    private int field5655;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "[Lde;")
    private class377[] field5665;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field5659 = 0;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field5658 = 0;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "Lvn;")
    public static class186 field5652 = new class186();

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Lvo;")
    public static class345 field5664;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIIIIII)I", line = 5)
    public static final int method2357(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5646++;
        if ((arg3 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg6;
        }
        if (arg0) {
            field5658 = -75;
        }
        if (var8 == 1) {
            return 7 + 1 - arg5 - arg1;
        } else if (var8 == 2) {
            return 7 - arg6 - (arg4 + -1);
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 40)
    public static void method2358(byte arg0) {
        if (arg0 != -94) {
            method2357(false, -34, 98, -72, -96, 112, 60);
        }
        field5664 = null;
        field5652 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Lde;", line = 51)
    public final class377 method2359(int arg0, int arg1) {
        field5660++;
        if (arg0 > -121) {
            this.method2366(116, 117);
        }
        return this.field5665[arg1];
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZIBFI)[I", line = 69)
    public final int[] method2360(int arg0, boolean arg1, int arg2, byte arg3, float arg4, int arg5) {
        if (arg3 != 118) {
            this.method2360(124, false, 61, (byte) 47, -1.0494863F, -57);
        }
        field5657++;
        return this.method2366(arg2, -82).method1982(this.field5665[arg2].field5230, 116, (double) arg4, arg1, this.field5648, arg5, arg0, this);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZFBIII)[F", line = 80)
    public final float[] method2361(boolean arg0, float arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5650++;
        if (arg2 != 107) {
            this.field5648 = null;
        }
        return this.method2366(arg5, -109).method1978(arg3, arg4, arg2 - 107, this.field5665[arg5].field5230, this, this.field5648);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIBIZII)V", line = 94)
    public static final void method2362(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg3 == 2) {
            field5649++;
            if ((arg5 ? class525.field7713.field5997 : class525.field7713.field5973) != 0 && arg1 != 0 && class222.field3314 < 50 && arg2 != -1) {
                class428.field6114[class222.field3314++] = new class105((byte) (arg5 ? 3 : 2), arg2, arg1, arg4, arg6, arg0, arg7, null);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)Z", line = 114)
    public final boolean method2363(byte arg0, int arg1) {
        if (arg0 >= -110) {
            return false;
        } else {
            field5647++;
            class333 var3 = this.method2366(arg1, -95);
            return var3 != null && var3.method1979(this.field5648, 33, this);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I", line = 129)
    public final int method2364(int arg0) {
        field5654++;
        return arg0 == -6274 ? this.field5655 : 47;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIZIFI)[I", line = 143)
    public final int[] method2365(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
        if (arg3 >= -56) {
            this.method2359(-92, 43);
        }
        field5662++;
        return this.method2366(arg1, -42).method1986(arg0, this.field5648, this.field5665[arg1].field5230, arg5, (double) arg4, 255, this);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Lur;", line = 155)
    private final class333 method2366(int arg0, int arg1) {
        field5653++;
        class143 var3 = this.field5656.method3823((long) arg0, -1);
        if (var3 != null) {
            return (class333) var3;
        }
        byte[] var4 = this.field5661.method2086(1024, arg0);
        if (var4 == null) {
            return null;
        }
        class333 var5 = new class333(new class465(var4));
        if (arg1 > -11) {
            this.method2360(111, false, -28, (byte) 73, -1.0169532F, -121);
        }
        this.field5656.method3824((long) arg0, -91, var5);
        return var5;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lvo;Lvo;Lvo;)V", line = 192)
    public class386(class345 arg0, class345 arg1, class345 arg2) {
        this.field5661 = arg1;
        this.field5648 = arg2;
        class465 var4 = new class465(arg0.method2081(-123, 0, 0));
        this.field5655 = var4.method2755((byte) -70);
        this.field5665 = new class377[this.field5655];
        for (int var5 = 0; var5 < this.field5655; var5++) {
            if (var4.method2705(-57) == 1) {
                this.field5665[var5] = new class377();
            }
        }
        for (int var6 = 0; var6 < this.field5655; var6++) {
            if (this.field5665[var6] != null) {
                this.field5665[var6].field5232 = var4.method2705(-96) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field5655; var7++) {
            if (this.field5665[var7] != null) {
                this.field5665[var7].field5219 = var4.method2705(-101) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field5655; var8++) {
            if (this.field5665[var8] != null) {
                this.field5665[var8].field5222 = var4.method2705(-102) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field5655; var9++) {
            if (this.field5665[var9] != null) {
                this.field5665[var9].field5218 = var4.method2705(-49) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field5655; var10++) {
            if (this.field5665[var10] != null) {
                this.field5665[var10].field5233 = var4.method2712(-107);
            }
        }
        for (int var11 = 0; var11 < this.field5655; var11++) {
            if (this.field5665[var11] != null) {
                this.field5665[var11].field5227 = var4.method2712(-121);
            }
        }
        for (int var12 = 0; var12 < this.field5655; var12++) {
            if (this.field5665[var12] != null) {
                this.field5665[var12].field5217 = var4.method2712(-57);
            }
        }
        for (int var13 = 0; var13 < this.field5655; var13++) {
            if (this.field5665[var13] != null) {
                this.field5665[var13].field5229 = var4.method2712(-105);
            }
        }
        for (int var14 = 0; var14 < this.field5655; var14++) {
            if (this.field5665[var14] != null) {
                this.field5665[var14].field5223 = (short) var4.method2755((byte) -67);
            }
        }
        for (int var15 = 0; var15 < this.field5655; var15++) {
            if (this.field5665[var15] != null) {
                this.field5665[var15].field5220 = var4.method2712(-93);
            }
        }
        for (int var16 = 0; var16 < this.field5655; var16++) {
            if (this.field5665[var16] != null) {
                this.field5665[var16].field5224 = var4.method2712(-95);
            }
        }
        for (int var17 = 0; var17 < this.field5655; var17++) {
            if (this.field5665[var17] != null) {
                this.field5665[var17].field5216 = var4.method2705(-128) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field5655; var18++) {
            if (this.field5665[var18] != null) {
                this.field5665[var18].field5230 = var4.method2705(-90) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field5655; var19++) {
            if (this.field5665[var19] != null) {
                this.field5665[var19].field5231 = var4.method2712(-103);
            }
        }
        for (int var20 = 0; var20 < this.field5655; var20++) {
            if (this.field5665[var20] != null) {
                this.field5665[var20].field5234 = var4.method2705(-43) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field5655; var21++) {
            if (this.field5665[var21] != null) {
                this.field5665[var21].field5221 = var4.method2705(-37) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field5655; var22++) {
            if (this.field5665[var22] != null) {
                this.field5665[var22].field5235 = var4.method2705(-49) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field5655; var23++) {
            if (this.field5665[var23] != null) {
                this.field5665[var23].field5236 = var4.method2705(-103);
            }
        }
        for (int var24 = 0; var24 < this.field5655; var24++) {
            if (this.field5665[var24] != null) {
                this.field5665[var24].field5228 = var4.method2691((byte) -67);
            }
        }
        for (int var25 = 0; var25 < this.field5655; var25++) {
            if (this.field5665[var25] != null) {
                this.field5665[var25].field5225 = var4.method2705(-25) == 1;
            }
        }
    }
}
