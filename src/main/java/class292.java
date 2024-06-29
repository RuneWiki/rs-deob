import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class292 implements class479 {

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "Lrw;")
    private class535 field3906 = new class535(256);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "Lpq;")
    private class159 field3897;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "Lpq;")
    private class159 field3907;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    private int field3913;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "[Ldu;")
    private class568[] field3911;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "[I")
    public static int[] field3900 = new int[1];

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "[I")
    public static int[] field3909 = new int[2];

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "[Lud;")
    public static class519[] field3912 = new class519[2048];

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Ljj;")
    public static class398 field3908 = new class398(70, 3);

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)Ldu;", line = 4)
    public final class568 method1728(int arg0, int arg1) {
        if (arg0 >= -93) {
            method1737(38, 1);
        }
        field3901++;
        return this.field3911[arg1];
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z", line = 15)
    public static final boolean method1729(int arg0) {
        if (arg0 != 131) {
            method1729(-46);
        }
        field3910++;
        class28 var1 = class37.field371.field825.field275;
        if (var1 == null || class37.field371.field825 == var1) {
            return false;
        }
        class69 var2 = (class69) var1;
        if (var2.field902 >= 2000) {
            var2.field902 -= 2000;
        }
        return var2.field902 == 1009;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I", line = 41)
    public final int method1730(int arg0) {
        field3905++;
        if (arg0 != 13449) {
            field3909 = null;
        }
        return this.field3913;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZFIIII)[I", line = 53)
    public final int[] method1731(boolean arg0, float arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 26409) {
            method1729(73);
        }
        field3899++;
        return this.method1735(arg5, 70).method2480(arg0, arg4, this, 0, (double) arg1, arg3, this.field3907, this.field3911[arg5].field7867);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Z", line = 65)
    public final boolean method1732(int arg0, int arg1) {
        field3898++;
        class430 var3 = this.method1735(arg0, 70);
        if (arg1 < 32) {
            this.field3897 = null;
        }
        return var3 != null && var3.method2476((byte) 64, this.field3907, this);
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V", line = 85)
    public static void method1733(int arg0) {
        if (arg0 == 2000) {
            field3900 = null;
            field3912 = null;
            field3909 = null;
            field3908 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIFIIZ)[I", line = 100)
    public final int[] method1734(boolean arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5) {
        if (!arg0) {
            this.method1734(true, 113, -0.18309024F, 54, -128, false);
        }
        field3903++;
        return this.method1735(arg4, 70).method2479(arg1, this.field3911[arg4].field7867, (double) arg2, this, 7621, this.field3907, arg3);
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)Lof;", line = 115)
    private final class430 method1735(int arg0, int arg1) {
        field3904++;
        class477 var3 = this.field3906.method3026(-123, (long) arg0);
        if (arg1 != 70) {
            this.field3911 = null;
        }
        if (var3 != null) {
            return (class430) var3;
        }
        byte[] var4 = this.field3897.method1082((byte) 33, arg0);
        if (var4 == null) {
            return null;
        } else {
            class430 var5 = new class430(new class138(var4));
            this.field3906.method3027((long) arg0, var5, (byte) 111);
            return var5;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIZF)[F", line = 149)
    public final float[] method1736(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5) {
        field3914++;
        if (arg1 != 8171) {
            field3908 = null;
        }
        return this.method1735(arg0, 70).method2474(this, arg3, this.field3907, this.field3911[arg0].field7867, arg1 - 29388, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(II)Z", line = 160)
    public static final boolean method1737(int arg0, int arg1) {
        if (arg1 >= -73) {
            return false;
        } else {
            field3902++;
            return arg0 == 7 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lpq;Lpq;Lpq;)V", line = 180)
    public class292(class159 arg0, class159 arg1, class159 arg2) {
        this.field3897 = arg1;
        this.field3907 = arg2;
        class138 var4 = new class138(arg0.method1087(0, 0, 1));
        this.field3913 = var4.method922((byte) -128);
        this.field3911 = new class568[this.field3913];
        for (int var5 = 0; var5 < this.field3913; var5++) {
            if (var4.method957((byte) -98) == 1) {
                this.field3911[var5] = new class568();
            }
        }
        for (int var6 = 0; var6 < this.field3913; var6++) {
            if (this.field3911[var6] != null) {
                this.field3911[var6].field7857 = var4.method957((byte) -94) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field3913; var7++) {
            if (this.field3911[var7] != null) {
                this.field3911[var7].field7864 = var4.method957((byte) -79) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field3913; var8++) {
            if (this.field3911[var8] != null) {
                this.field3911[var8].field7853 = var4.method957((byte) -73) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field3913; var9++) {
            if (this.field3911[var9] != null) {
                this.field3911[var9].field7865 = var4.method957((byte) -120) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field3913; var10++) {
            if (this.field3911[var10] != null) {
                this.field3911[var10].field7863 = var4.method950(false);
            }
        }
        for (int var11 = 0; var11 < this.field3913; var11++) {
            if (this.field3911[var11] != null) {
                this.field3911[var11].field7869 = var4.method950(false);
            }
        }
        for (int var12 = 0; var12 < this.field3913; var12++) {
            if (this.field3911[var12] != null) {
                this.field3911[var12].field7870 = var4.method950(false);
            }
        }
        for (int var13 = 0; var13 < this.field3913; var13++) {
            if (this.field3911[var13] != null) {
                this.field3911[var13].field7866 = var4.method950(false);
            }
        }
        for (int var14 = 0; var14 < this.field3913; var14++) {
            if (this.field3911[var14] != null) {
                this.field3911[var14].field7858 = (short) var4.method922((byte) -120);
            }
        }
        for (int var15 = 0; var15 < this.field3913; var15++) {
            if (this.field3911[var15] != null) {
                this.field3911[var15].field7855 = var4.method950(false);
            }
        }
        for (int var16 = 0; var16 < this.field3913; var16++) {
            if (this.field3911[var16] != null) {
                this.field3911[var16].field7859 = var4.method950(false);
            }
        }
        for (int var17 = 0; var17 < this.field3913; var17++) {
            if (this.field3911[var17] != null) {
                this.field3911[var17].field7860 = var4.method957((byte) -104) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field3913; var18++) {
            if (this.field3911[var18] != null) {
                this.field3911[var18].field7867 = var4.method957((byte) -89) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field3913; var19++) {
            if (this.field3911[var19] != null) {
                this.field3911[var19].field7852 = var4.method950(false);
            }
        }
        for (int var20 = 0; var20 < this.field3913; var20++) {
            if (this.field3911[var20] != null) {
                this.field3911[var20].field7854 = var4.method957((byte) -128) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field3913; var21++) {
            if (this.field3911[var21] != null) {
                this.field3911[var21].field7861 = var4.method957((byte) -90) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field3913; var22++) {
            if (this.field3911[var22] != null) {
                this.field3911[var22].field7851 = var4.method957((byte) -123) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field3913; var23++) {
            if (this.field3911[var23] != null) {
                this.field3911[var23].field7862 = var4.method957((byte) -64);
            }
        }
        for (int var24 = 0; var24 < this.field3913; var24++) {
            if (this.field3911[var24] != null) {
                this.field3911[var24].field7856 = var4.method943(-92);
            }
        }
        for (int var25 = 0; var25 < this.field3913; var25++) {
            if (this.field3911[var25] != null) {
                this.field3911[var25].field7868 = var4.method957((byte) -97) == 1;
            }
        }
    }
}
