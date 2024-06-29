import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class73 implements class489 {

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Lik;")
    private class191 field1014 = new class191(256);

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "Lpj;")
    private class132 field1016;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "Lpj;")
    private class132 field1012;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "[Lgaa;")
    private class269[] field1004;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1010 = null;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "[I")
    public static int[] field1018 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "[I")
    public static int[] field1019;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)I", line = 6)
    public final int method581(int arg0) {
        field1015++;
        if (arg0 != -16264) {
            this.field1012 = null;
        }
        return this.field1013;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIZIF)[I", line = 17)
    public final int[] method582(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        field1017++;
        if (arg2 != 23117) {
            method583(105);
        }
        return this.method589(arg4, 4).method247(this, this.field1004[arg4].field3822, arg1, this.field1016, arg0, (double) arg5, -90970558);
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V", line = 28)
    public static void method583(int arg0) {
        field1019 = null;
        field1018 = null;
        field1010 = null;
        if (arg0 != -24397) {
            method584(-99, -70, 32);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)I", line = 43)
    public static final int method584(int arg0, int arg1, int arg2) {
        field1009++;
        int var3 = class205.method1361((byte) -117, 4, arg2 + 91923, arg0 + 45365) - (128 - (class205.method1361((byte) -117, 2, arg2 + 37821, arg0 + 10294) - 128 >> 1) - (class205.method1361((byte) -117, 1, arg2, arg0) + -128 >> 2));
        if (arg1 < 115) {
            field1018 = null;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIFIIZ)[F", line = 65)
    public final float[] method585(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 == 25948) {
            field1007++;
            return this.method589(arg1, 4).method249(-42, arg0, this.field1004[arg1].field3822, this, this.field1016, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIFIZI)[I", line = 76)
    public final int[] method586(int arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5) {
        field1005++;
        if (arg5 < 91) {
            this.method590(122, (byte) 86);
        }
        return this.method589(arg0, 4).method245((byte) -124, arg4, (double) arg2, arg3, arg1, this.field1016, this.field1004[arg0].field3822, this);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[BIIIII)Z", line = 93)
    public static final boolean method587(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1011++;
        if (arg4 <= 111) {
            field1019 = null;
        }
        int var7 = arg2 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg0 + arg6 - 1) / arg0);
        int var10 = -((arg0 + arg2 - 1) / arg0);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg5] == 0) {
                    return true;
                }
                arg5 += arg0;
            }
            int var13 = arg5 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lpj;Lpj;Lpj;)V", line = 151)
    public class73(class132 arg0, class132 arg1, class132 arg2) {
        this.field1016 = arg2;
        this.field1012 = arg1;
        class96 var4 = new class96(arg0.method940(0, 0, 0));
        this.field1013 = var4.method743((byte) -35);
        this.field1004 = new class269[this.field1013];
        for (int var5 = 0; var5 < this.field1013; var5++) {
            if (var4.method718(-56) == 1) {
                this.field1004[var5] = new class269();
            }
        }
        for (int var6 = 0; var6 < this.field1013; var6++) {
            if (this.field1004[var6] != null) {
                this.field1004[var6].field3821 = var4.method718(79) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field1013; var7++) {
            if (this.field1004[var7] != null) {
                this.field1004[var7].field3805 = var4.method718(-62) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field1013; var8++) {
            if (this.field1004[var8] != null) {
                this.field1004[var8].field3823 = var4.method718(101) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field1013; var9++) {
            if (this.field1004[var9] != null) {
                this.field1004[var9].field3825 = var4.method718(-97) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field1013; var10++) {
            if (this.field1004[var10] != null) {
                this.field1004[var10].field3810 = var4.method748(-813976688);
            }
        }
        for (int var11 = 0; var11 < this.field1013; var11++) {
            if (this.field1004[var11] != null) {
                this.field1004[var11].field3820 = var4.method748(-813976688);
            }
        }
        for (int var12 = 0; var12 < this.field1013; var12++) {
            if (this.field1004[var12] != null) {
                this.field1004[var12].field3803 = var4.method748(-813976688);
            }
        }
        for (int var13 = 0; var13 < this.field1013; var13++) {
            if (this.field1004[var13] != null) {
                this.field1004[var13].field3814 = var4.method748(-813976688);
            }
        }
        for (int var14 = 0; var14 < this.field1013; var14++) {
            if (this.field1004[var14] != null) {
                this.field1004[var14].field3817 = (short) var4.method743((byte) -80);
            }
        }
        for (int var15 = 0; var15 < this.field1013; var15++) {
            if (this.field1004[var15] != null) {
                this.field1004[var15].field3808 = var4.method748(-813976688);
            }
        }
        for (int var16 = 0; var16 < this.field1013; var16++) {
            if (this.field1004[var16] != null) {
                this.field1004[var16].field3806 = var4.method748(-813976688);
            }
        }
        for (int var17 = 0; var17 < this.field1013; var17++) {
            if (this.field1004[var17] != null) {
                this.field1004[var17].field3819 = var4.method718(-71) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field1013; var18++) {
            if (this.field1004[var18] != null) {
                this.field1004[var18].field3822 = var4.method718(77) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field1013; var19++) {
            if (this.field1004[var19] != null) {
                this.field1004[var19].field3809 = var4.method748(-813976688);
            }
        }
        for (int var20 = 0; var20 < this.field1013; var20++) {
            if (this.field1004[var20] != null) {
                this.field1004[var20].field3807 = var4.method718(-66) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field1013; var21++) {
            if (this.field1004[var21] != null) {
                this.field1004[var21].field3824 = var4.method718(123) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field1013; var22++) {
            if (this.field1004[var22] != null) {
                this.field1004[var22].field3815 = var4.method718(-78) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field1013; var23++) {
            if (this.field1004[var23] != null) {
                this.field1004[var23].field3804 = var4.method718(104);
            }
        }
        for (int var24 = 0; var24 < this.field1013; var24++) {
            if (this.field1004[var24] != null) {
                this.field1004[var24].field3816 = var4.method714(false);
            }
        }
        for (int var25 = 0; var25 < this.field1013; var25++) {
            if (this.field1004[var25] != null) {
                this.field1004[var25].field3813 = var4.method718(114) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Lgaa;", line = 365)
    public final class269 method588(int arg0, int arg1) {
        if (arg0 != -26679) {
            field1018 = null;
        }
        field1006++;
        return this.field1004[arg1];
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)Lgp;", line = 376)
    private final class44 method589(int arg0, int arg1) {
        field1008++;
        class665 var3 = this.field1014.method1267((byte) 127, (long) arg0);
        if (var3 != null) {
            return (class44) var3;
        }
        byte[] var4 = this.field1012.method938(arg0, (byte) -53);
        if (var4 == null) {
            return null;
        } else {
            class44 var5 = new class44(new class96(var4));
            this.field1014.method1265(false, (long) arg0, var5);
            return arg1 == 4 ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)Z", line = 402)
    public final boolean method590(int arg0, byte arg1) {
        field1003++;
        class44 var3 = this.method589(arg0, 4);
        if (arg1 != -50) {
            this.field1004 = null;
        }
        return var3 != null && var3.method244(this.field1016, this, (byte) -9);
    }
}
