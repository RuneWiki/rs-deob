import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class282 implements class369 {

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lar;")
    private class47 field3871 = new class47(256);

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Lam;")
    private class286 field3869;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lam;")
    private class286 field3867;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "[Lne;")
    private class75[] field3864;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field3868 = 0;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3870 = "Starting 3d Library";

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lar;")
    public static class47 field3858 = new class47(64);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "[[[B")
    public static byte[][][] field3872;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(FIZIII)[I", line = 3)
    public final int[] method1659(float arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3862++;
        return arg5 == 21196 ? this.method1666(arg1, 2780).method92(this.field3869, arg4, this.field3864[arg1].field839, (byte) 34, arg3, this, (double) arg0) : null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)Lne;", line = 14)
    public final class75 method1660(int arg0, byte arg1) {
        field3865++;
        if (arg1 > -73) {
            this.method1662(false, -118, 11, 2, -0.9360962F, -4);
        }
        return this.field3864[arg0];
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I", line = 27)
    public static final int method1661(int arg0) {
        field3863++;
        return arg0 == 16078 ? class318.field4232 : 102;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIIFI)[I", line = 43)
    public final int[] method1662(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5) {
        field3859++;
        if (arg3 != 28861) {
            field3868 = -85;
        }
        return this.method1666(arg5, 2780).method88(this, arg1, this.field3864[arg5].field839, this.field3869, arg0, arg2, 1, (double) arg4);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[[[BIBII)V", line = 58)
    public static final void method1663(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class14.field137++;
        class140.field1798 = 0;
        for (int var6 = class27.field257; var6 < class366.field5129; var6++) {
            class96[][] var17 = class176.field2209[var6];
            for (int var18 = class231.field3183; var18 < class105.field1290; var18++) {
                for (int var19 = class312.field4193; var19 < class207.field2797; var19++) {
                    class96 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class342.field4573[var18 + class430.field6316 - class98.field1164][var19 + class430.field6316 - class419.field6103] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field1131 = true;
                            var20.field1143 = true;
                            if (var20.field1130 == null) {
                                var20.field1120 = false;
                            } else {
                                var20.field1120 = true;
                            }
                            class140.field1798++;
                        } else {
                            var20.field1131 = false;
                            var20.field1143 = false;
                            var20.field1123 = 0;
                            if (var18 >= class98.field1164 - 16 && var18 <= class98.field1164 + 16 && var19 >= class419.field6103 - 16 && var19 <= class419.field6103 + 16 && (var20.field1128 != null || var20.field1136 != null || var20.field1126 != null || var20.field1140 != null || var20.field1135 != null || var20.field1130 != null)) {
                                class211.field2862.method1078(var20, -88);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class98.field1161 == class275.field3707;
        for (int var8 = class27.field257; var8 < class366.field5129; var8++) {
            float var9 = var7 ? 202.0F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class191.field2407.method1562() && var8 >= arg2 && arg1 != null) {
                int var10 = class342.field4573.length;
                if (class342.field4573.length + class231.field3183 > class231.field3184) {
                    var10 -= class342.field4573.length + class231.field3183 - class231.field3184;
                }
                int var11 = class342.field4573[0].length;
                if (class342.field4573[0].length + class312.field4193 > class209.field2840) {
                    var11 -= class342.field4573[0].length + class312.field4193 - class209.field2840;
                }
                int var12 = class129.field1667;
                while (true) {
                    if (var12 >= var10) {
                        class211.field2862.method1084(class98.field1161[var8], var8, var9, (byte) -101, true);
                        break;
                    }
                    int var13 = class231.field3183 + var12 - class129.field1667;
                    for (int var14 = class54.field554; var14 < var11; var14++) {
                        class379.field5356[var12][var14] = false;
                        if (class342.field4573[var12][var14]) {
                            int var15 = class312.field4193 + var14 - class54.field554;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class176.field2209[var16][var13][var15] != null && class176.field2209[var16][var13][var15].field1137 == var8) {
                                    class379.field5356[var12][var14] = class176.field2209[var16][var13][var15].field1131;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class211.field2862.method1084(class98.field1161[var8], var8, var9, (byte) -101, false);
            }
            class211.field2862.method1076((byte) 86);
        }
        if (!class149.method794(true)) {
            class149.method794(false);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IFZIIB)[F", line = 195)
    public final float[] method1664(int arg0, float arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        int var7 = 46 % ((-arg5 - 55) / 54);
        field3861++;
        return this.method1666(arg4, 2780).method91(this.field3869, 0, this.field3864[arg4].field839, arg0, arg3, this);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IB)Z", line = 208)
    public final boolean method1665(int arg0, byte arg1) {
        field3866++;
        if (arg1 == -125) {
            class19 var3 = this.method1666(arg0, 2780);
            return var3 != null && var3.method90(this, 0, this.field3869);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lko;", line = 227)
    private final class19 method1666(int arg0, int arg1) {
        field3860++;
        if (arg1 != 2780) {
            field3870 = null;
        }
        class187 var3 = this.field3871.method222((long) arg0, -8407);
        if (var3 != null) {
            return (class19) var3;
        }
        byte[] var4 = this.field3867.method1699(arg0, arg1 ^ 0xAF5);
        if (var4 == null) {
            return null;
        } else {
            class19 var5 = new class19(new class250(var4));
            this.field3871.method218((long) arg0, (byte) 13, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lam;Lam;Lam;)V", line = 276)
    public class282(class286 arg0, class286 arg1, class286 arg2) {
        this.field3869 = arg2;
        this.field3867 = arg1;
        class250 var4 = new class250(arg0.method1687(0, 0, 255));
        int var5 = var4.method1374(-2);
        this.field3864 = new class75[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1350(31351) == 1) {
                this.field3864[var6] = new class75();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3864[var7] != null) {
                this.field3864[var7].field823 = var4.method1350(31351) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3864[var8] != null) {
                this.field3864[var8].field834 = var4.method1350(31351) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3864[var9] != null) {
                this.field3864[var9].field825 = var4.method1350(31351) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3864[var10] != null) {
                this.field3864[var10].field822 = var4.method1350(31351) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3864[var11] != null) {
                this.field3864[var11].field836 = var4.method1363((byte) -78);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3864[var12] != null) {
                this.field3864[var12].field841 = var4.method1363((byte) 122);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3864[var13] != null) {
                this.field3864[var13].field824 = var4.method1363((byte) -66);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3864[var14] != null) {
                this.field3864[var14].field829 = var4.method1363((byte) 122);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3864[var15] != null) {
                this.field3864[var15].field827 = (short) var4.method1374(-2);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field3864[var16] != null) {
                this.field3864[var16].field835 = var4.method1363((byte) -38);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field3864[var17] != null) {
                this.field3864[var17].field845 = var4.method1363((byte) 107);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field3864[var18] != null) {
                this.field3864[var18].field840 = var4.method1350(31351) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field3864[var19] != null) {
                this.field3864[var19].field839 = var4.method1350(31351) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field3864[var20] != null) {
                this.field3864[var20].field819 = var4.method1363((byte) 114);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field3864[var21] != null) {
                this.field3864[var21].field828 = var4.method1350(31351) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field3864[var22] != null) {
                this.field3864[var22].field844 = var4.method1350(31351) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field3864[var23] != null) {
                this.field3864[var23].field843 = var4.method1350(31351) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 265)
    public static void method1667(int arg0) {
        if (arg0 == 0) {
            field3872 = null;
            field3858 = null;
            field3870 = null;
        }
    }
}
