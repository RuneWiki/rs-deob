import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class86 extends class106 {

    @OriginalMember(owner = "client!j", name = "G", descriptor = "[Lve;")
    public class198[] field1878;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "J")
    public static volatile long field1877 = 0L;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "Z")
    public static boolean field1880 = false;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "[J")
    public static long[] field1887 = new long[200];

    @OriginalMember(owner = "client!j", name = "J", descriptor = "Lrf;")
    public static class163 field1881 = class53.method392(72, "(U1");

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lrf;")
    public static class163 field1888 = class53.method392(-83, ")1p");

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)I")
    public static final int method603(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field1889++;
        if (var4 == 0) {
            return arg0;
        }
        int var5 = 31 / ((-arg3 - 17) / 35);
        if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBIIII)I")
    public static final int method604(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1883++;
        int var7 = arg4 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg1;
            arg1 = var8;
        }
        if (arg2 != 51) {
            return 46;
        } else if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg5;
        } else if (var7 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
    public final boolean method605(int arg0, int arg1) {
        if (arg1 != 4) {
            field1881 = null;
        }
        field1886++;
        return this.field1878[arg0].field3925;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lu;Lu;IZ)V")
    public class86(class184 arg0, class184 arg1, int arg2, boolean arg3) {
        class5 var5 = new class5();
        int var6 = arg0.method1225(arg2, true);
        this.field1878 = new class198[var6];
        int[] var7 = arg0.method1230(-44, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1235(var7[var8], (byte) -64, arg2);
            class161 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class161 var12 = (class161) var5.method46(-107); var12 != null; var12 = (class161) var5.method53(7759444)) {
                if (var12.field3256 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1243(var11, -1, 0);
                } else {
                    var13 = arg1.method1243(0, -1, var11);
                }
                var10 = new class161(var11, var13);
                var5.method51(0, var10);
            }
            this.field1878[var7[var8]] = new class198(var9, var10);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILig;II)V")
    public static final void method606(int arg0, int arg1, class84 arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            return;
        }
        field1884++;
        client.method198((byte) -127);
        class173.method1159(arg3, arg1, arg3 + arg2.field1746, arg2.field1815 + arg1);
        if (class19.field321 == 2 || class19.field321 == 5) {
            class173.method1170(arg3, arg1, 0, arg2.field1756, arg2.field1795);
        } else {
            int var5 = class77.field1593 + class54.field1114 & 0x7FF;
            int var6 = class56.field1136.field716 / 32 + 48;
            int var7 = 464 - class56.field1136.field679 / 32;
            class64.field1346.method1102(arg3, arg1, arg2.field1746, arg2.field1815, var6, var7, var5, class26.field468 + 256, arg2.field1756, arg2.field1795);
            for (int var8 = 0; var8 < class118.field2504; var8++) {
                int var38 = class43.field869[var8] * 4 + 2 - class56.field1136.field716 / 32;
                int var39 = class29.field544[var8] * 4 + 2 - class56.field1136.field679 / 32;
                class61.method448(-1, arg1, arg2, var39, var38, class122.field2565[var8], arg3);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var34 = 0; var34 < 104; var34++) {
                    class5 var35 = class69.field1434[class60.field1227][var9][var34];
                    if (var35 != null) {
                        int var36 = var9 * 4 + 2 - class56.field1136.field716 / 32;
                        int var37 = var34 * 4 + 2 - class56.field1136.field679 / 32;
                        class61.method448(-1, arg1, arg2, var37, var36, class77.field1594[0], arg3);
                    }
                }
            }
            for (int var10 = 0; var10 < class93.field2013; var10++) {
                class70 var30 = class187.field3723[class170.field3459[var10]];
                if (var30 != null && var30.method228(arg4 + 2)) {
                    class129 var31 = var30.field1482;
                    if (var31 != null && var31.field2682 != null) {
                        var31 = var31.method851(arg4 ^ 0x1);
                    }
                    if (var31 != null && var31.field2646 && var31.field2641) {
                        int var32 = var30.field679 / 32 - class56.field1136.field679 / 32;
                        int var33 = var30.field716 / 32 - class56.field1136.field716 / 32;
                        class61.method448(-1, arg1, arg2, var32, var33, class77.field1594[1], arg3);
                    }
                }
            }
            for (int var11 = 0; var11 < class112.field2377; var11++) {
                class38 var22 = class121.field2553[class27.field504[var11]];
                if (var22 != null && var22.method228(3)) {
                    int var23 = var22.field716 / 32 - class56.field1136.field716 / 32;
                    boolean var24 = false;
                    int var25 = var22.field679 / 32 - class56.field1136.field679 / 32;
                    long var26 = var22.field758.method1058(arg4 - 129);
                    for (int var28 = 0; var28 < class186.field3717; var28++) {
                        if (field1887[var28] == var26 && class115.field2449[var28] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var29 = false;
                    if (class56.field1136.field770 != 0 && var22.field770 != 0 && class56.field1136.field770 == var22.field770) {
                        var29 = true;
                    }
                    if (var24) {
                        class61.method448(-1, arg1, arg2, var25, var23, class77.field1594[3], arg3);
                    } else if (var29) {
                        class61.method448(-1, arg1, arg2, var25, var23, class77.field1594[4], arg3);
                    } else {
                        class61.method448(arg4 - 2, arg1, arg2, var25, var23, class77.field1594[2], arg3);
                    }
                }
            }
            if (class5.field106 != 0 && class51.field1023 % 20 < 10) {
                if (class5.field106 == 1 && class21.field368 >= 0 && class187.field3723.length > class21.field368) {
                    class70 var12 = class187.field3723[class21.field368];
                    if (var12 != null) {
                        int var13 = var12.field716 / 32 - class56.field1136.field716 / 32;
                        int var14 = var12.field679 / 32 - class56.field1136.field679 / 32;
                        class44.method269(arg1, class209.field4078[1], var13, var14, arg2, arg3, (byte) 94);
                    }
                }
                if (class5.field106 == 2) {
                    int var15 = (class108.field2249 - class172.field3493) * 4 + 2 - class56.field1136.field716 / 32;
                    int var16 = (class206.field4024 - class69.field1470) * 4 + 2 - class56.field1136.field679 / 32;
                    class44.method269(arg1, class209.field4078[1], var15, var16, arg2, arg3, (byte) 88);
                }
                if (class5.field106 == 10 && class133.field2757 >= 0 && class121.field2553.length > class133.field2757) {
                    class38 var17 = class121.field2553[class133.field2757];
                    if (var17 != null) {
                        int var18 = var17.field716 / 32 - class56.field1136.field716 / 32;
                        int var19 = var17.field679 / 32 - class56.field1136.field679 / 32;
                        class44.method269(arg1, class209.field4078[1], var18, var19, arg2, arg3, (byte) -110);
                    }
                }
            }
            if (class113.field2392 != 0) {
                int var20 = class158.field3233 * 4 + 2 - class56.field1136.field679 / 32;
                int var21 = class113.field2392 * 4 + 2 - class56.field1136.field716 / 32;
                class61.method448(arg4 - 2, arg1, arg2, var20, var21, class209.field4078[0], arg3);
            }
            class173.method1173(arg3 + arg2.field1746 / 2 - 1, arg1 - -(arg2.field1815 / 2) + -1, 3, 3, 16777215);
        }
        class27.field498[arg0] = true;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V")
    public static void method607(byte arg0) {
        field1881 = null;
        field1887 = null;
        field1888 = null;
        if (arg0 != 38) {
            method609(82, 104);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLdg;II)V")
    public static final void method608(byte arg0, class38 arg1, int arg2, int arg3) {
        if ((arg3 & 0x200) != 0) {
            arg1.field714 = class105.field2195.method350(false);
            arg1.field675 = class105.field2195.method338((byte) 126);
            arg1.field689 = class105.field2195.method378(false);
            arg1.field698 = class105.field2195.method338((byte) 83);
            arg1.field673 = class105.field2195.method367(arg0 + 6) + class51.field1023;
            arg1.field738 = class105.field2195.method387((byte) 88) + class51.field1023;
            arg1.field687 = class105.field2195.method350(false);
            arg1.field724 = 0;
            arg1.field706 = 1;
        }
        if ((arg3 & 0x100) != 0) {
            int var4 = class105.field2195.method338((byte) 70);
            int var5 = class105.field2195.method338((byte) 110);
            arg1.method231(class51.field1023, var5, arg0 ^ 0x5B, var4);
        }
        if ((arg3 & 0x2) != 0) {
            int var6 = class105.field2195.method350(false);
            byte[] var7 = new byte[var6];
            class52 var8 = new class52(var7);
            class105.field2195.method345(var6, 0, var7, 2);
            class44.field899[arg2] = var8;
            arg1.method242(var8, arg0 ^ 0xFFFFFFE0);
        }
        field1879++;
        if ((arg3 & 0x40) != 0) {
            int var9 = class105.field2195.method350(false);
            int var10 = class105.field2195.method338((byte) 120);
            arg1.method231(class51.field1023, var10, 108, var9);
            arg1.field726 = class51.field1023 + 300;
            arg1.field680 = class105.field2195.method344(255);
        }
        if (arg0 != 31) {
            method607((byte) -42);
        }
        if ((arg3 & 0x400) != 0) {
            arg1.field741 = class105.field2195.method367(arg0 + 77);
            int var11 = class105.field2195.method376((byte) 113);
            if (arg1.field741 == 65535) {
                arg1.field741 = -1;
            }
            arg1.field723 = (var11 & 0xFFFF) + class51.field1023;
            arg1.field722 = var11 >> 16;
            arg1.field720 = 0;
            arg1.field703 = 0;
            if (class51.field1023 < arg1.field723) {
                arg1.field703 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg1.field686 = class105.field2195.method363(arg0 ^ 0x4A78);
            if (arg1.field686.method1032(0, (byte) -28) == 126) {
                arg1.field686 = arg1.field686.method1039(1, -56);
                class43.method267((byte) -114, arg1.field686, arg1.field758, 2);
            } else if (class56.field1136 == arg1) {
                class43.method267((byte) -49, arg1.field686, arg1.field758, 2);
            }
            arg1.field735 = 0;
            arg1.field704 = 0;
            arg1.field672 = 150;
        }
        if ((arg3 & 0x80) != 0) {
            int var12 = class105.field2195.method349((byte) 93);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class105.field2195.method378(false);
            class38.method241(var12, var13, -13808, arg1);
        }
        if ((arg3 & 0x1) != 0) {
            arg1.field740 = class105.field2195.method387((byte) 88);
            if (arg1.field740 == 65535) {
                arg1.field740 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg1.field674 = class105.field2195.method390((byte) 97);
            arg1.field708 = class105.field2195.method387((byte) 88);
        }
        if ((arg3 & 0x8) == 0) {
            return;
        }
        int var14 = class105.field2195.method349((byte) 93);
        int var15 = class105.field2195.method350(false);
        int var16 = class105.field2195.method350(false);
        int var17 = class105.field2195.field1033;
        if (arg1.field758 != null && arg1.field795 != null) {
            boolean var18 = false;
            long var19 = arg1.field758.method1058(-112);
            if (var15 <= 1) {
                for (int var21 = 0; var21 < class26.field479; var21++) {
                    if (class130.field2713[var21] == var19) {
                        var18 = true;
                        break;
                    }
                }
            }
            if (!var18 && class97.field2053 == 0) {
                class199.field3947.field1033 = 0;
                class105.field2195.method380(class199.field3947.field1054, -128, var16, 0);
                class199.field3947.field1033 = 0;
                class163 var22 = class83.method580(class31.method210(false, class199.field3947).method1037((byte) 27));
                arg1.field686 = var22.method1052(77);
                arg1.field704 = var14 >> 8;
                arg1.field672 = 150;
                arg1.field735 = var14 & 0xFF;
                if (var15 == 2 || var15 == 3) {
                    class43.method267((byte) -95, var22, class180.method1216(new class163[] { class38.field793, arg1.field758 }, false), 1);
                } else if (var15 == 1) {
                    class43.method267((byte) -110, var22, class180.method1216(new class163[] { class27.field509, arg1.field758 }, false), 1);
                } else {
                    class43.method267((byte) -53, var22, arg1.field758, 2);
                }
            }
        }
        class105.field2195.field1033 = var16 + var17;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(II)I")
    public static final int method609(int arg0, int arg1) {
        field1885++;
        class100 var2 = class131.method873(arg0, arg1 - 19300);
        int var3 = var2.field2098;
        int var4 = var2.field2108;
        if (arg1 != 25331) {
            method608((byte) -101, null, 120, -62);
        }
        int var5 = var2.field2107;
        int var6 = class159.field3235[var5 - var4];
        return class143.field2940[var3] >> var4 & var6;
    }
}
