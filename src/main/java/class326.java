import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class326 {

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    private int field4888 = 0;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    private int field4897 = -1;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Lsf;")
    private class398 field4900 = new class398();

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Z")
    public boolean field4903 = false;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    private int field4896;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    private int field4894;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "[Lrj;")
    private class430[] field4892;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "[[[I")
    private int[][][] field4890;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "[I")
    public static int[] field4893 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Lwl;")
    public static class452 field4899 = new class452(88, -1);

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field4904 = 0;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Z")
    public static boolean field4901 = false;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ldr;IILjd;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method2009(class261 arg0, int arg1, int arg2, class361 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class1.field14 = arg0;
        class319.field4826 = arg1;
        class183.field2740 = arg3;
        class385.field5626 = class1.field14.method342() > 0;
        class319.field4825 = arg4 >> class254.field3869;
        class426.field6265 = arg6 >> class254.field3869;
        class121.field1596 = arg4;
        class446.field6573 = arg6;
        class273.field4192 = arg5;
        class452.field6686 = class319.field4825 - class246.field3690;
        if (class452.field6686 < 0) {
            class168.field2416 = -class452.field6686;
            class452.field6686 = 0;
        } else {
            class168.field2416 = 0;
        }
        class337.field5008 = class426.field6265 - class246.field3690;
        if (class337.field5008 < 0) {
            class238.field3551 = -class337.field5008;
            class337.field5008 = 0;
        } else {
            class238.field3551 = 0;
        }
        class44.field553 = class319.field4825 + class246.field3690;
        if (class44.field553 > class275.field4206) {
            class44.field553 = class275.field4206;
        }
        class196.field2958 = class426.field6265 + class246.field3690;
        if (class196.field2958 > class265.field4044) {
            class196.field2958 = class265.field4044;
        }
        for (int var18 = 0; var18 < class246.field3690 + class246.field3690 + 2; var18++) {
            for (int var23 = 0; var23 < class246.field3690 + class246.field3690 + 2; var23++) {
                int var24 = class319.field4825 + var18 - class246.field3690;
                int var25 = class426.field6265 + var23 - class246.field3690;
                if (var24 >= 0 && var25 >= 0 && var24 < class275.field4206 && var25 < class265.field4044) {
                    int var26 = var24 << class254.field3869;
                    int var27 = var25 << class254.field3869;
                    int var28 = class85.field1201[class85.field1201.length - 1].method92(var24, var25) - 1000;
                    int var29 = class154.field2118 == null ? class85.field1201[0].method92(var24, var25) + class26.field337 : class154.field2118[0].method92(var24, var25) + class26.field337;
                    class60.field774[var18][var23] = class1.field14.method395(var26, var28, var27, var26, var29, var27);
                } else {
                    class60.field774[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class246.field3690 + class246.field3690 + 1; var19++) {
            for (int var22 = 0; var22 < class246.field3690 + class246.field3690 + 1; var22++) {
                class423.field6230[var19][var22] = class60.field774[var19][var22] || class60.field774[var19 + 1][var22] || class60.field774[var19][var22 + 1] || class60.field774[var19 + 1][var22 + 1];
            }
        }
        class56.field748 = arg8;
        class328.field4931 = arg9;
        class371.field5418 = arg10;
        class39.field498 = arg11;
        class112.field1484 = arg12;
        class141.method885();
        class6.method52(16);
        for (class70 var20 = (class70) class47.field577.method2127(-1489721243); var20 != null; var20 = (class70) class47.field577.method2126(-28)) {
            var20.method2759((byte) -25);
            class342.method2090(var20, (byte) -3);
        }
        if (class385.field5626) {
            for (int var21 = 0; var21 < class358.field5278; var21++) {
                class281.field4303[var21].method134(false, arg17, arg1);
            }
        }
        if (arg2 > 1) {
            class1.field14.method428(0);
            if (class426.field6271 == null || class426.field6271 instanceof class409) {
                class426.field6271 = new class240();
            }
        } else if (class426.field6271 == null || class426.field6271 instanceof class240) {
            class426.field6271 = new class409();
        }
        class426.field6271.method1468((byte) -125, arg2);
        class426.field6271.method1475(true);
        if (class103.field1393 != null) {
            class94.method617(true);
            class426.field6271.method1469(22, (byte) 14);
            class459.method2847(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class426.field6271.method1475(true);
            class426.field6271.method1469(23, (byte) 14);
            class94.method617(false);
        }
        class459.method2847(arg2, arg7, arg13, arg14, arg15, arg16);
        class426.field6271.method1475(true);
        class426.field6271.method1476(-6723);
        class426.field6271.method1475(true);
        if (arg2 > 1) {
            class1.field14.method383(0);
        }
        class1.field14.method408(0, (class147[]) null);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([[B[I[[B[BI[III)I")
    public static final int method2010(byte[][] arg0, int[] arg1, byte[][] arg2, byte[] arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field4891++;
        int var8 = arg1[arg4];
        int var9 = arg5[arg4] + var8;
        int var10 = arg1[arg7];
        int var11 = arg5[arg7] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg6 & arg3[arg4];
        if ((arg3[arg7] & 0xFF) < var14) {
            var14 = arg3[arg7] & 0xFF;
        }
        byte[] var15 = arg0[arg4];
        byte[] var16 = arg2[arg7];
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

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method2011(int arg0) {
        int var2 = 124 % ((-arg0 - 26) / 44);
        field4887++;
        if (this.field4896 != this.field4894) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field4894; var3++) {
            this.field4892[var3] = class267.field4075;
        }
        return this.field4890;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static final void method2012(byte arg0) {
        field4895++;
        class302.method1860(-125, false);
        if (class8.field86 >= 0 && class8.field86 != 0) {
            class388.method2399(true, class8.field86);
            class8.field86 = -1;
        }
        if (arg0 != -5) {
            field4901 = true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method2013(int arg0, boolean arg1) {
        if (!arg1) {
            this.field4888 = -55;
        }
        field4889++;
        if (this.field4896 == this.field4894) {
            this.field4903 = this.field4892[arg0] == null;
            this.field4892[arg0] = class267.field4075;
            return this.field4890[arg0];
        } else if (this.field4894 == 1) {
            this.field4903 = this.field4897 != arg0;
            this.field4897 = arg0;
            return this.field4890[0];
        } else {
            class430 var3 = this.field4892[arg0];
            if (var3 == null) {
                this.field4903 = true;
                if (this.field4894 > this.field4888) {
                    var3 = new class430(arg0, this.field4888);
                    this.field4888++;
                } else {
                    class430 var4 = (class430) this.field4900.method2515(63);
                    var3 = new class430(arg0, var4.field6319);
                    this.field4892[var4.field6320] = null;
                    var4.method625((byte) -50);
                }
                this.field4892[arg0] = var3;
            } else {
                this.field4903 = false;
            }
            this.field4900.method2513((byte) 89, var3);
            return this.field4890[var3.field6319];
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
    public static final void method2014(int arg0, int arg1) {
        class143.field1909.method1481(3, arg1);
        if (arg0 == 0) {
            field4885++;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ltg;III)V")
    public static final void method2015(class451 arg0, int arg1, int arg2, int arg3) {
        class247.field3702[arg2][arg3] = arg0;
        field4886++;
        if (arg1 < 58) {
            method2009((class261) null, -55, 109, (class361) null, 49, -85, -31, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -46, (byte) -109, 18, 39, true);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public final void method2016(int arg0) {
        for (int var2 = arg0; var2 < this.field4894; var2++) {
            this.field4890[var2][0] = null;
            this.field4890[var2][1] = null;
            this.field4890[var2][2] = null;
            this.field4890[var2] = null;
        }
        field4898++;
        this.field4890 = null;
        this.field4892 = null;
        this.field4900.method2512((byte) 4);
        this.field4900 = null;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    public static void method2017(int arg0) {
        field4899 = null;
        if (arg0 != 0) {
            method2010((byte[][]) null, (int[]) null, (byte[][]) null, (byte[]) null, -91, (int[]) null, -82, -37);
        }
        field4893 = null;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
    public class326(int arg0, int arg1, int arg2) {
        this.field4896 = arg1;
        this.field4894 = arg0;
        this.field4892 = new class430[this.field4896];
        this.field4890 = new int[this.field4894][3][arg2];
    }
}
