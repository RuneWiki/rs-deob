import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class169 {

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Ljd;")
    public static class85 field2913 = class221.method1499("(Y<)4col>", (byte) 122);

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Ljd;")
    private static class85 field2917 = class221.method1499("Allocating memory", (byte) 96);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Ljd;")
    public static class85 field2907 = class221.method1499(" <col=ffff00>", (byte) 100);

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Ljd;")
    public static class85 field2912 = field2917;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[B")
    public static byte[] field2914 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field2916 = 0;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field2920 = 0;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Ljd;")
    public static class85 field2918 = class221.method1499("compass", (byte) 105);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2917 = null;
        field2913 = null;
        field2912 = null;
        field2918 = null;
        field2907 = null;
        if (arg0 < 0) {
            field2914 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZILrh;)V")
    public static final void method1133(int arg0, boolean arg1, int arg2, class44 arg3) {
        if (!arg1) {
            method1135(false, (byte) -50);
        }
        field2910++;
        if ((arg0 & 0x20) != 0) {
            arg3.field1007 = class189.field3249.method1697(65280);
            if (arg3.field1007 == 65535) {
                arg3.field1007 = -1;
            }
        }
        if ((arg0 & 0x400) != 0) {
            arg3.field1064 = class189.field3249.method1694((byte) -100);
            int var4 = class189.field3249.method1712(6357);
            arg3.field1022 = 0;
            arg3.field1051 = var4 >> 16;
            arg3.field1026 = 0;
            arg3.field1019 = (var4 & 0xFFFF) + class151.field2555;
            if (arg3.field1019 > class151.field2555) {
                arg3.field1022 = -1;
            }
            if (arg3.field1064 == 65535) {
                arg3.field1064 = -1;
            }
            if (arg3.field1064 != -1 && class151.field2555 == arg3.field1019) {
                int var5 = class87.method647((byte) 44, arg3.field1064).field1329;
                if (var5 != -1) {
                    class106 var6 = class101.method704(1, var5);
                    if (var6 != null && var6.field1857 != null) {
                        class163.method1080(var6, arg3.field1042, arg3.field1027, 0, 21983, class22.field308 == arg3);
                    }
                }
            }
        }
        if ((arg0 & 0x200) != 0) {
            int var7 = class189.field3249.method1678(false);
            int var8 = class189.field3249.method1716(2);
            arg3.method391(class151.field2555, var7, -16218, var8);
        }
        if ((arg0 & 0x1) != 0) {
            int var9 = class189.field3249.method1694((byte) -100);
            int var10 = class189.field3249.method1716(2);
            int var11 = class189.field3249.method1711((byte) -67);
            int var12 = class189.field3249.field4224;
            boolean var13 = (var9 & 0x8000) != 0;
            if (arg3.field762 != null && arg3.field796 != null) {
                long var14 = arg3.field762.method624(false);
                boolean var16 = false;
                if (var10 <= 1) {
                    if (!var13 && class98.field1766 == 1 || field2916 == 1) {
                        var16 = true;
                    } else {
                        for (int var17 = 0; var17 < class56.field978; var17++) {
                            if (class137.field2379[var17] == var14) {
                                var16 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var16 && class61.field1113 == 0) {
                    class33.field499.field4224 = 0;
                    class189.field3249.method1700(0, var11, class33.field499.field4238, (byte) 51);
                    class33.field499.field4224 = 0;
                    int var18 = -1;
                    class85 var20;
                    if (var13) {
                        var9 &= 0x7FFF;
                        class50 var19 = class72.method515(class33.field499, (byte) 43);
                        var18 = var19.field876;
                        var20 = var19.field885.method1073(105, class33.field499);
                    } else {
                        var20 = class10.method60(class229.method1539(100, class33.field499).method617((byte) 33));
                    }
                    arg3.field1060 = var20.method601(0);
                    arg3.field1070 = 150;
                    arg3.field1040 = var9 & 0xFF;
                    arg3.field1034 = var9 >> 8;
                    if (var10 == 2) {
                        class32.method222(var18, (class85) null, -100, class172.method1150(new class85[] { class227.field3942, arg3.method308(0) }, 0), var20, var13 ? 17 : 1);
                    } else if (var10 == 1) {
                        class32.method222(var18, (class85) null, -100, class172.method1150(new class85[] { class94.field1713, arg3.method308(0) }, 0), var20, var13 ? 17 : 1);
                    } else {
                        class32.method222(var18, (class85) null, -100, arg3.method308(0), var20, var13 ? 17 : 2);
                    }
                }
            }
            class189.field3249.field4224 = var12 + var11;
        }
        if ((arg0 & 0x40) != 0) {
            int var21 = class189.field3249.method1716(2);
            byte[] var22 = new byte[var21];
            class247 var23 = new class247(var22);
            class189.field3249.method1700(0, var21, var22, (byte) 118);
            class200.field3491[arg2] = var23;
            arg3.method309(117, var23);
        }
        if ((arg0 & 0x10) != 0) {
            arg3.field1060 = class189.field3249.method1692(110);
            if (arg3.field1060.method615(true, 0) == 126) {
                arg3.field1060 = arg3.field1060.method611((byte) -97, 1);
                class148.method972(arg3.field1060, (byte) -45, arg3.method308(0), 2);
            } else if (class22.field308 == arg3) {
                class148.method972(arg3.field1060, (byte) -110, arg3.method308(0), 2);
            }
            arg3.field1040 = 0;
            arg3.field1070 = 150;
            arg3.field1034 = 0;
        }
        if ((arg0 & 0x8) != 0) {
            int var24 = class189.field3249.method1711((byte) -67);
            int var25 = class189.field3249.method1716(2);
            arg3.method391(class151.field2555, var24, -16218, var25);
            arg3.field1004 = class151.field2555 + 300;
            arg3.field1039 = class189.field3249.method1678(!arg1);
        }
        if ((arg0 & 0x100) != 0) {
            arg3.field1017 = class189.field3249.method1687(112);
            arg3.field1021 = class189.field3249.method1687(110);
            arg3.field1068 = class189.field3249.method1687(112);
            arg3.field1010 = class189.field3249.method1711((byte) -67);
            arg3.field1035 = class189.field3249.method1694((byte) -100) + class151.field2555;
            arg3.field1050 = class189.field3249.method1694((byte) -100) + class151.field2555;
            arg3.field1059 = class189.field3249.method1687(96);
            arg3.field1063 = 0;
            arg3.field1030 = 1;
        }
        if ((arg0 & 0x80) != 0) {
            arg3.field1038 = class189.field3249.method1694((byte) -100);
            arg3.field1046 = class189.field3249.method1694((byte) -100);
        }
        if ((arg0 & 0x4) == 0) {
            return;
        }
        int var26 = class189.field3249.method1694((byte) -100);
        if (var26 == 65535) {
            var26 = -1;
        }
        int var27 = class189.field3249.method1678(false);
        class254.method1754(-59, var27, var26, arg3);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)Lpc;")
    public static final class21 method1134(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        class21 var2 = (class21) class23.field330.method1269((long) arg1, (byte) 120);
        field2915++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class118.field2107.method464(-1, 16, arg1);
        class21 var4 = new class21();
        if (var3 != null) {
            var4.method147(-6, new class247(var3));
        }
        class23.field330.method1271(-15561, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZB)V")
    public static final void method1135(boolean arg0, byte arg1) {
        field2911++;
        if ((class22.field308.field1042 >> 7) == class7.field79 && (class22.field308.field1027 >> 7) == class18.field259) {
            class7.field79 = 0;
        }
        int var2 = class196.field3375;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class44 var5;
            long var6;
            if (arg0) {
                var5 = class22.field308;
                var6 = 8791798054912L;
            } else {
                var5 = class249.field4291[class151.field2556[var3]];
                var6 = (long) class151.field2556[var3] << 32;
            }
            if (var5 != null && var5.method128(10)) {
                int var8 = var5.field1027 >> 7;
                var5.field766 = false;
                int var9 = var5.field1042 >> 7;
                if ((class95.field1735 && class196.field3375 > 200 || class196.field3375 > 50) && !arg0 && var5.field1057 == var5.field1014) {
                    var5.field766 = true;
                }
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field776 == null || class151.field2555 < var5.field773 || class151.field2555 >= var5.field792) {
                        if (var5.method311((byte) 109) == 1 && (var5.field1042 & 0x7F) == 64 && (var5.field1027 & 0x7F) == 64) {
                            if (class237.field4096[var9][var8] == class50.field873) {
                                continue;
                            }
                            class237.field4096[var9][var8] = class50.field873;
                        }
                        var5.field1045 = class246.method1660(604124551, var5.field1042, class116.field2066, var5.field1027);
                        class130.method876(class116.field2066, var5.field1042, var5.field1027, var5.field1045, var5.method311((byte) -92) * 64 - 4, var5, var5.field1036, var6, var5.field1065);
                    } else {
                        var5.field766 = false;
                        var5.field1045 = class246.method1660(604124551, var5.field1042, class116.field2066, var5.field1027);
                        class260.method1784(class116.field2066, var5.field1042, var5.field1027, var5.field1045, var5, var5.field1036, var6, var5.field757, var5.field767, var5.field772, var5.field788);
                    }
                }
            }
        }
        int var4 = 96 / ((arg1 + 54) / 35);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(ZI)V")
    public static final void method1136(boolean arg0, int arg1) {
        field2919++;
        if (class1.field4 == arg1) {
            return;
        }
        if (class1.field4 == 0) {
            class20.method138(6962);
        }
        if (!arg0) {
            method1135(true, (byte) -51);
        }
        if (arg1 == 40) {
            class177.method1194(class253.field4363, class100.field1796, class100.field1790, false);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 != 40 && class194.field3310 != null) {
            class194.field3310.method218(122);
            class194.field3310 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class124.field2199 = 1;
            class115.field2064 = 0;
            class236.field4079 = 0;
            class217.field3804 = 1;
            class261.field4611 = 0;
            class146.method958((byte) -102);
        }
        if (arg1 == 5) {
            class152.method1003(class161.field2773, (byte) -10);
        } else {
            class2.method7(-1);
        }
        boolean var3 = class1.field4 == 5 || class1.field4 == 10 || class1.field4 == 28;
        if (var2 != var3) {
            if (var2) {
                class2.field24 = class87.field1622;
                if (class270.field4793 == 0) {
                    class263.method1797(2, -119);
                } else {
                    class141.method928(0, 2, 255, class87.field1622, (byte) -22, false, class213.field3744);
                }
                class55.field969.method1035(false, false);
            } else {
                class263.method1797(2, -119);
                class55.field969.method1035(true, false);
            }
        }
        class1.field4 = arg1;
    }
}
