import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class66 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1089 = "Continue";

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "[Z")
    public static boolean[] field1097 = new boolean[5];

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Z")
    public static boolean field1093 = false;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field1087 = -1;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Ln;")
    public static class283 field1092;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILsk;I)V")
    public static final void method527(int arg0, int arg1, int arg2, class189 arg3, int arg4) {
        field1094++;
        if (class51.field826 >= 400) {
            return;
        }
        if (arg3.field2829 != null) {
            arg3 = arg3.method1257(-32207);
        }
        if (arg0 < 51) {
            method531((byte) -19);
        }
        if (arg3 == null || !arg3.field2849) {
            return;
        }
        String var5 = arg3.field2871;
        if (arg3.field2820 != 0) {
            String var6 = class246.field3836 == 1 ? class146.field2116 : class239.field3683;
            var5 = var5 + class73.method585(class185.field2687.field3485, (byte) -102, arg3.field2820) + " (" + var6 + arg3.field2820 + ")";
        }
        if (class277.field4275 == 1) {
            class24.field395++;
            class246.method1685(class106.field1570 + " -> <col=ffff00>" + var5, arg1, (long) arg4, class123.field1819, arg2, (short) 49, class166.field2454, true);
        } else if (class76.field1205) {
            class260 var7 = class207.field3108 == -1 ? null : class77.method612(class207.field3108, 11);
            if ((class146.field2123 & 0x2) != 0) {
                if (var7 == null || arg3.method1259(false, class207.field3108, var7.field3997) != var7.field3997) {
                    class246.method1685(class174.field2545 + " -> <col=ffff00>" + var5, arg1, (long) arg4, class182.field2647, arg2, (short) 4, class270.field4218, true);
                    class280.field4306++;
                }
                return;
            }
        } else {
            class96.field1417++;
            String[] var8 = arg3.field2835;
            if (class227.field3540) {
                var8 = class177.method1172(-6, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class246.field3836 != 0 || !var8[var9].equalsIgnoreCase(class256.field3950))) {
                        class218.field3340++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 5;
                        }
                        if (var9 == 1) {
                            var10 = 24;
                        }
                        int var11 = -1;
                        if (var9 == 2) {
                            var10 = 16;
                        }
                        if (arg3.field2852 == var9) {
                            var11 = arg3.field2857;
                        }
                        if (arg3.field2814 == var9) {
                            var11 = arg3.field2822;
                        }
                        if (var9 == 3) {
                            var10 = 33;
                        }
                        if (var9 == 4) {
                            var10 = 51;
                        }
                        class246.method1685("<col=ffff00>" + var5, arg1, (long) arg4, var8[var9], arg2, var10, var11, true);
                    }
                }
            }
            if (class246.field3836 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class256.field3950)) {
                        class196.field2964++;
                        short var13 = 0;
                        if (var12 == 0) {
                            var13 = 5;
                        }
                        if (var12 == 1) {
                            var13 = 24;
                        }
                        short var14 = 0;
                        if (arg3.field2820 > class185.field2687.field3485) {
                            var14 = 2000;
                        }
                        if (var12 == 2) {
                            var13 = 16;
                        }
                        if (var12 == 3) {
                            var13 = 33;
                        }
                        if (var12 == 4) {
                            var13 = 51;
                        }
                        if (var13 != 0) {
                            var13 += var14;
                        }
                        class246.method1685("<col=ffff00>" + var5, arg1, (long) arg4, var8[var12], arg2, var13, arg3.field2818, true);
                    }
                }
            }
            class246.method1685("<col=ffff00>" + var5, arg1, (long) arg4, class128.field1892, arg2, (short) 1005, class152.field2223, true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method528(byte arg0) {
        if (arg0 != -90) {
            method529(35, false, 122, (class201[][][]) null, -38, false);
        }
        field1089 = null;
        field1097 = null;
        field1092 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZI[[[Ljc;IZ)Z")
    public static final boolean method529(int arg0, boolean arg1, int arg2, class201[][][] arg3, int arg4, boolean arg5) {
        if (arg5) {
            method527(15, -50, -49, (class189) null, 94);
        }
        field1096++;
        byte var6 = arg1 ? 1 : (byte) (class113.field1723 & 0xFF);
        if (class50.field813[class260.field3986][arg2][arg0] == var6) {
            return false;
        } else if ((class247.field3844[class260.field3986][arg2][arg0] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class106.field1568[var8] = arg2;
            int var31 = var8 + 1;
            class229.field3560[var8] = arg0;
            class50.field813[class260.field3986][arg2][arg0] = var6;
            while (var7 != var31) {
                int var9 = class106.field1568[var7] & 0xFFFF;
                int var10 = (class106.field1568[var7] & 0xFF3705) >> 16;
                boolean var11 = false;
                boolean var12 = false;
                int var13 = class106.field1568[var7] >> 24 & 0xFF;
                int var14 = class229.field3560[var7] >> 16 & 0xFF;
                int var15 = class229.field3560[var7] & 0xFFFF;
                var7 = var7 + 1 & 0xFFF;
                if ((class247.field3844[class260.field3986][var9][var15] & 0x4) == 0) {
                    var11 = true;
                }
                label229: for (int var16 = class260.field3986 + 1; var16 <= 3; var16++) {
                    if ((class247.field3844[var16][var9][var15] & 0x8) == 0) {
                        if (var11 && arg3[var16][var9][var15] != null) {
                            if (arg3[var16][var9][var15].field3024 != null) {
                                int var19 = class51.method387(-16755, var10);
                                if (arg3[var16][var9][var15].field3024.field2589 == var19 || arg3[var16][var9][var15].field3024.field2582 == var19) {
                                    continue;
                                }
                                if (var13 != 0) {
                                    int var20 = class51.method387(-16755, var13);
                                    if (arg3[var16][var9][var15].field3024.field2589 == var20 || arg3[var16][var9][var15].field3024.field2582 == var20) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var21 = class51.method387(-16755, var14);
                                    if (arg3[var16][var9][var15].field3024.field2589 == var21 || arg3[var16][var9][var15].field3024.field2582 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var9][var15].field3037 != null) {
                                for (int var22 = 0; var22 < arg3[var16][var9][var15].field3026; var22++) {
                                    int var23 = (int) (arg3[var16][var9][var15].field3037[var22].field1880 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg3[var16][var9][var15].field3037[var22].field1880 >> 20 & 0x3L);
                                    int var25 = var23 | var24 << 6;
                                    if (var10 == var25 || var13 != 0 && var13 == var25 || var14 != 0 && var14 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var12 = true;
                        class201 var26 = arg3[var16][var9][var15];
                        if (var26 != null && var26.field3026 > 0) {
                            for (int var27 = 0; var27 < var26.field3026; var27++) {
                                class128 var28 = var26.field3037[var27];
                                if (var28.field1882 != var28.field1879 || var28.field1876 != var28.field1870) {
                                    for (int var29 = var28.field1882; var29 <= var28.field1879; var29++) {
                                        for (int var30 = var28.field1870; var30 <= var28.field1876; var30++) {
                                            class50.field813[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class50.field813[var16][var9][var15] = var6;
                    }
                }
                if (var12) {
                    if (class166.field2451[class260.field3986 + 1][var9][var15] > class195.field2954[arg4]) {
                        class195.field2954[arg4] = class166.field2451[class260.field3986 + 1][var9][var15];
                    }
                    int var17 = var9 << 7;
                    if (var17 < class86.field1312[arg4]) {
                        class86.field1312[arg4] = var17;
                    } else if (class62.field1034[arg4] < var17) {
                        class62.field1034[arg4] = var17;
                    }
                    int var18 = var15 << 7;
                    if (var18 < class221.field3443[arg4]) {
                        class221.field3443[arg4] = var18;
                    } else if (class3.field48[arg4] < var18) {
                        class3.field48[arg4] = var18;
                    }
                }
                if (!var11) {
                    if (var9 >= 1 && class50.field813[class260.field3986][var9 - 1][var15] != var6) {
                        class106.field1568[var31] = class186.method1215(-754974720, class186.method1215(1179648, var9 - 1));
                        class229.field3560[var31] = class186.method1215(1245184, var15);
                        var31 = var31 + 1 & 0xFFF;
                        class50.field813[class260.field3986][var9 - 1][var15] = var6;
                    }
                    var15++;
                    if (var15 < 104) {
                        if (var9 - 1 >= 0 && class50.field813[class260.field3986][var9 - 1][var15] != var6 && (class247.field3844[class260.field3986][var9][var15] & 0x4) == 0 && (class247.field3844[class260.field3986][var9 - 1][var15 - 1] & 0x4) == 0) {
                            class106.field1568[var31] = class186.method1215(class186.method1215(1179648, var9 - 1), 1375731712);
                            class229.field3560[var31] = class186.method1215(1245184, var15);
                            var31 = var31 + 1 & 0xFFF;
                            class50.field813[class260.field3986][var9 - 1][var15] = var6;
                        }
                        if (class50.field813[class260.field3986][var9][var15] != var6) {
                            class106.field1568[var31] = class186.method1215(318767104, class186.method1215(5373952, var9));
                            class229.field3560[var31] = class186.method1215(var15, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class50.field813[class260.field3986][var9][var15] = var6;
                        }
                        if (var9 + 1 < 104 && class50.field813[class260.field3986][var9 + 1][var15] != var6 && (class247.field3844[class260.field3986][var9][var15] & 0x4) == 0 && (class247.field3844[class260.field3986][var9 + 1][var15 - 1] & 0x4) == 0) {
                            class106.field1568[var31] = class186.method1215(class186.method1215(var9 + 1, 5373952), -1845493760);
                            class229.field3560[var31] = class186.method1215(var15, 5439488);
                            class50.field813[class260.field3986][var9 + 1][var15] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var15--;
                    if (var9 + 1 < 104 && class50.field813[class260.field3986][var9 + 1][var15] != var6) {
                        class106.field1568[var31] = class186.method1215(1392508928, class186.method1215(var9 + 1, 9568256));
                        class229.field3560[var31] = class186.method1215(var15, 9633792);
                        class50.field813[class260.field3986][var9 + 1][var15] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var15--;
                    if (var15 >= 0) {
                        if (var9 - 1 >= 0 && class50.field813[class260.field3986][var9 - 1][var15] != var6 && (class247.field3844[class260.field3986][var9][var15] & 0x4) == 0 && (class247.field3844[class260.field3986][var9 - 1][var15 + 1] & 0x4) == 0) {
                            class106.field1568[var31] = class186.method1215(class186.method1215(13762560, var9 - 1), 301989888);
                            class229.field3560[var31] = class186.method1215(13828096, var15);
                            var31 = var31 + 1 & 0xFFF;
                            class50.field813[class260.field3986][var9 - 1][var15] = var6;
                        }
                        if (class50.field813[class260.field3986][var9][var15] != var6) {
                            class106.field1568[var31] = class186.method1215(-1828716544, class186.method1215(13762560, var9));
                            class229.field3560[var31] = class186.method1215(13828096, var15);
                            class50.field813[class260.field3986][var9][var15] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class50.field813[class260.field3986][var9 + 1][var15] != var6 && (class247.field3844[class260.field3986][var9][var15] & 0x4) == 0 && (class247.field3844[class260.field3986][var9 + 1][var15 + 1] & 0x4) == 0) {
                            class106.field1568[var31] = class186.method1215(class186.method1215(var9 + 1, 9568256), -771751936);
                            class229.field3560[var31] = class186.method1215(9633792, var15);
                            var31 = var31 + 1 & 0xFFF;
                            class50.field813[class260.field3986][var9 + 1][var15] = var6;
                        }
                    }
                }
            }
            if (class195.field2954[arg4] != -1000000) {
                class195.field2954[arg4] += 10;
                class86.field1312[arg4] -= 50;
                class62.field1034[arg4] += 50;
                class3.field48[arg4] += 50;
                class221.field3443[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ[B)I")
    public static final int method530(int arg0, boolean arg1, byte[] arg2) {
        field1091++;
        if (arg1) {
            method529(121, true, 75, (class201[][][]) null, -38, true);
        }
        return class81.method634(0, arg2, arg0, 90);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
    public static final void method531(byte arg0) {
        if (class182.field2648 != null) {
            class182.field2648.method811((byte) -116);
        }
        field1086++;
        if (class258.field3961 != null) {
            class258.field3961.method811((byte) -116);
        }
        class85.method652(2, 22050, class25.field431, false);
        class182.field2648 = class56.method470(class297.field4569, class217.field3338, 22050, -18999, 0);
        class182.field2648.method806((byte) 4, class120.field1792);
        if (arg0 <= 83) {
            method527(-127, -81, 45, (class189) null, -103);
        }
        class258.field3961 = class56.method470(class297.field4569, class217.field3338, 2048, -18999, 1);
        class258.field3961.method806((byte) 95, class108.field1581);
    }
}
