import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class130 extends class55 {

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Lbh;")
    public static class234 field1883 = new class234();

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public int field1871;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "Lb;")
    public static class262 field1874;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "[Lwj;")
    public static class130[] field1884;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
    public abstract void method848(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V")
    public final void method849(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1880++;
        if (arg3 != 8645) {
            field1874 = null;
        }
        int var6 = this.field1881 << 3;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        int var8 = this.field1870 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method860(var6, var8, var7, var9, arg4, arg0);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIIII)V")
    public abstract void method850(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V")
    public abstract void method851(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
    public abstract void method852(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V")
    public abstract void method853(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lbc;Lbc;Z)V")
    public static final void method854(class282 arg0, class282 arg1, boolean arg2) {
        class251.field3624 = arg0;
        if (!arg2) {
            method857(-123);
        }
        class267.field3863 = arg1;
        field1876++;
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)V")
    public static void method855(int arg0) {
        field1883 = null;
        if (arg0 == 23742) {
            field1874 = null;
            field1884 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZIIZILqi;IBIII)V")
    public static final void method856(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, class216 arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        if (arg0 >= 0 && arg0 < 104 && arg3 >= 0 && arg3 < 104) {
            if (!arg1 && !arg4) {
                class241.field3507[arg7][arg0][arg3] = 0;
            }
            while (true) {
                int var12 = arg6.method1407(123);
                if (var12 == 0) {
                    if (arg1) {
                        class290.field4536[0][arg0 + arg11][arg3 + arg10] = class180.field2550[0][arg0 + arg11][arg3 + arg10];
                    } else if (arg7 == 0) {
                        class290.field4536[0][arg0 + arg11][arg3 + arg10] = -class167.method1096((byte) -108, arg9 + 556238, arg5 + 932731) * 8;
                    } else {
                        class290.field4536[arg7][arg0 + arg11][arg3 + arg10] = class290.field4536[arg7 - 1][arg0 + arg11][arg3 + arg10] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg6.method1407(126);
                    if (arg1) {
                        class290.field4536[0][arg0 + arg11][arg3 + arg10] = var13 * 8 + class180.field2550[0][arg0 + arg11][arg3 + arg10];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg7 == 0) {
                            class290.field4536[0][arg0 + arg11][arg3 + arg10] = -var13 * 8;
                        } else {
                            class290.field4536[arg7][arg0 + arg11][arg3 + arg10] = class290.field4536[arg7 - 1][arg0 + arg11][arg3 + arg10] - var13 * 8;
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg4) {
                        arg6.method1407(119);
                    } else {
                        class27.field324[arg7][arg0][arg3] = arg6.method1355(true);
                        class93.field1254[arg7][arg0][arg3] = (byte) ((var12 - 2) / 4);
                        class143.field2044[arg7][arg0][arg3] = (byte) class5.method26(3, arg2 + var12 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!arg1 && !arg4) {
                        class241.field3507[arg7][arg0][arg3] = (byte) (var12 - 49);
                    }
                } else if (!arg4) {
                    class53.field602[arg7][arg0][arg3] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg6.method1407(103);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg6.method1407(116);
                    break;
                }
                if (var14 <= 49) {
                    arg6.method1407(112);
                }
            }
        }
        if (arg8 <= 106) {
            method859(-110, 14, 58, (byte) 54);
        }
        field1872++;
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V")
    public static final void method857(int arg0) {
        field1877++;
        class97.method582(class188.field2698, -96);
        int var1 = (class204.field2902 >> 10) + (class166.field2383 >> 3);
        int var2 = (class245.field3560 >> 10) + (class110.field1473 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class282.field4278 = new byte[var5][];
        class41.field500 = new byte[var5][];
        class138.field2009 = new int[var5];
        class3.field40 = new int[var5];
        class136.field1984 = new int[var5][4];
        class51.field585 = new int[var5];
        class221.field3125 = new int[var5];
        class263.field3815 = new int[var5];
        class261.field3801 = new byte[var5][];
        class190.field2739 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
            for (int var10 = (var1 - 6) / 8; var10 <= ((var1 + 6) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class190.field2739[var7] = var11;
                class263.field3815[var7] = class26.field305.method1844("m" + var8 + "_" + var10, -84);
                class3.field40[var7] = class26.field305.method1844("l" + var8 + "_" + var10, -91);
                class221.field3125[var7] = class26.field305.method1844("n" + var8 + "_" + var10, 107);
                class138.field2009[var7] = class26.field305.method1844("um" + var8 + "_" + var10, class165.method1085(arg0, -88));
                class51.field585[var7] = class26.field305.method1844("ul" + var8 + "_" + var10, class165.method1085(arg0, -90));
                if (class221.field3125[var7] == -1) {
                    class263.field3815[var7] = -1;
                    class3.field40[var7] = -1;
                    class138.field2009[var7] = -1;
                    class51.field585[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class221.field3125.length; var9++) {
            class221.field3125[var9] = -1;
            class263.field3815[var9] = -1;
            class3.field40[var9] = -1;
            class138.field2009[var9] = -1;
            class51.field585[var9] = -1;
        }
        class179.method1164(true, var3, var1, false, arg0, var4, -125, var2);
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)V")
    public abstract void method858(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIB)I")
    public static final int method859(int arg0, int arg1, int arg2, byte arg3) {
        field1873++;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg0 / arg2;
        int var7 = arg2 - 1 & arg1;
        int var8 = class211.method1336(var6, -1, var5);
        if (arg3 > -19) {
            method855(85);
        }
        int var9 = class211.method1336(var6 + 1, -1, var5);
        int var10 = class211.method1336(var6, -1, var5 + 1);
        int var11 = class211.method1336(var6 + 1, -1, var5 + 1);
        int var12 = class122.method798(-31574, var8, arg2, var4, var9);
        int var13 = class122.method798(-31574, var10, arg2, var4, var11);
        return class122.method798(-31574, var12, arg2, var7, var13);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
