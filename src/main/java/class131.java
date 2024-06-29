import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class131 extends class148 {

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public int field2986 = 0;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public int field2994 = -1;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "[Lwe;")
    public static class155[] field2991 = new class155[4];

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "Lja;")
    public static class62 field2987 = class30.method243(43, "Null");

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "Lja;")
    private static class62 field2999 = class30.method243(43, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "Lja;")
    public static class62 field3001 = field2999;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "Ljf;")
    public static class68 field2992 = new class68(512);

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "Lja;")
    public static class62 field3003 = class30.method243(43, " loggt sich ein)3");

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "Lja;")
    private static class62 field3008 = class30.method243(43, "flash1:");

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "Lja;")
    public static class62 field3007 = field3008;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "Lja;")
    public static class62 field3004 = field3008;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public int field2996;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "[Lic;")
    public static class58[] field2988;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "[[Lhe;")
    public static class54[][] field2990;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public static void method1055(int arg0) {
        field2991 = null;
        field3001 = null;
        field3008 = null;
        field2988 = null;
        if (arg0 != 5) {
            method1058(2, -79);
        }
        field2990 = null;
        field2999 = null;
        field3004 = null;
        field2992 = null;
        field3003 = null;
        field2987 = null;
        field3007 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIILhe;I)V")
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class54 arg6, int arg7) {
        field2993++;
        if (class120.field2750) {
            class48.field1095 = 32;
        } else {
            class48.field1095 = 0;
        }
        class120.field2750 = false;
        if (arg0 != 32) {
            method1058(28, 77);
        }
        if (class70.field1797 != 0) {
            if (arg7 >= arg4 && arg4 + 16 > arg7 && arg5 <= arg2 && arg2 < arg5 + 16) {
                arg6.field1262 -= 4;
                client.method163(arg6, -83);
            } else if (arg4 <= arg7 && arg4 + 16 > arg7 && arg2 >= arg5 + arg3 - 16 && arg2 < arg5 + arg3) {
                arg6.field1262 += 4;
                client.method163(arg6, -100);
            } else if (arg7 >= arg4 - class48.field1095 && arg4 + class48.field1095 + 16 > arg7 && arg2 >= arg5 + 16 && arg2 < arg5 + arg3 - 16) {
                int var8 = (arg3 - 32) * arg3 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - var8 - 32;
                int var10 = arg2 - var8 / 2 - arg5 - 16;
                arg6.field1262 = (arg1 - arg3) * var10 / var9;
                client.method163(arg6, -73);
                class120.field2750 = true;
            }
        }
        if (class100.field2324 == 0) {
            return;
        }
        int var11 = arg6.field1316;
        if (arg4 - var11 <= arg7 && arg5 <= arg2 && arg7 < arg4 + 16 && arg2 <= arg3 + arg5) {
            arg6.field1262 += class100.field2324 * 45;
            client.method163(arg6, -87);
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLhe;II)V")
    public static final void method1057(byte arg0, class54 arg1, int arg2, int arg3) {
        if (arg0 < 124) {
            method1058(-17, -95);
        }
        if (arg1.field1278 == 1) {
            class144.field3354++;
            class135.method1079((byte) -113, class83.field1991, arg1.field1290, arg1.field1291, 0, 0, 33);
        }
        field2997++;
        if (arg1.field1278 == 2 && !class90.field2145) {
            class62 var4 = class51.method354(arg1, true);
            if (var4 != null) {
                class135.method1079((byte) -113, class70.method594(new class62[] { class29.field709, arg1.field1258 }, 1229), var4, arg1.field1291, 0, -1, 23);
                class144.field3370++;
            }
        }
        if (arg1.field1278 == 3) {
            class52.field1191++;
            class135.method1079((byte) -113, class83.field1991, class111.field2532, arg1.field1291, 0, 0, 57);
        }
        if (arg1.field1278 == 4) {
            class17.field385++;
            class135.method1079((byte) -113, class83.field1991, arg1.field1290, arg1.field1291, 0, 0, 42);
        }
        if (arg1.field1278 == 5) {
            class135.method1079((byte) -113, class83.field1991, arg1.field1290, arg1.field1291, 0, 0, 47);
            class42.field970++;
        }
        if (arg1.field1278 == 6 && class119.field2724 == null) {
            class135.method1079((byte) -113, class83.field1991, arg1.field1290, arg1.field1291, 0, -1, 15);
            class142.field3318++;
        }
        if (arg1.field1279 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field1345; var6++) {
                for (int var7 = 0; var7 < arg1.field1316; var7++) {
                    int var8 = (arg1.field1240 + 32) * var7;
                    int var9 = (arg1.field1228 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg1.field1360[var5];
                        var9 += arg1.field1296[var5];
                    }
                    if (var8 <= arg2 && arg3 >= var9 && arg2 < var8 + 32 && arg3 < var9 + 32) {
                        class118.field2687 = arg1;
                        class83.field2003 = var5;
                        if (arg1.field1304[var5] > 0) {
                            class23 var10 = class140.method1114(arg1.field1304[var5] - 1, false);
                            if (class68.field1692 == 1 && class94.method725(class22.method171(arg1, (byte) 71), 19139)) {
                                if (class35.field842 != arg1.field1291 || class40.field932 != var5) {
                                    class53.field1210++;
                                    class135.method1079((byte) -113, class70.method594(new class62[] { class60.field1459, class36.field864, var10.field571 }, 1229), class35.field827, arg1.field1291, var10.field575, var5, 44);
                                }
                            } else if (!class90.field2145 || !class94.method725(class22.method171(arg1, (byte) -115), 19139)) {
                                class62[] var11 = var10.field581;
                                class105.field2422++;
                                if (class116.field2674) {
                                    var11 = class34.method266((byte) -34, var11);
                                }
                                if (class94.method725(class22.method171(arg1, (byte) -120), 19139)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 37;
                                            } else {
                                                var13 = 40;
                                            }
                                            class86.field2073++;
                                            class135.method1079((byte) -113, class70.method594(new class62[] { class124.field2833, var10.field571 }, 1229), var11[var12], arg1.field1291, var10.field575, var5, var13);
                                        } else if (var12 == 4) {
                                            class103.field2385++;
                                            class135.method1079((byte) -113, class70.method594(new class62[] { class124.field2833, var10.field571 }, 1229), class50.field1160, arg1.field1291, var10.field575, var5, 40);
                                        }
                                    }
                                }
                                if (class134.method1068(class22.method171(arg1, (byte) -117), 3511)) {
                                    field2983++;
                                    class135.method1079((byte) -113, class70.method594(new class62[] { class124.field2833, var10.field571 }, 1229), class35.field827, arg1.field1291, var10.field575, var5, 1);
                                }
                                if (class94.method725(class22.method171(arg1, (byte) 56), 19139) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 5;
                                            }
                                            if (var14 == 1) {
                                                var15 = 26;
                                            }
                                            if (var14 == 2) {
                                                var15 = 20;
                                            }
                                            class47.field1071++;
                                            class135.method1079((byte) -113, class70.method594(new class62[] { class124.field2833, var10.field571 }, 1229), var11[var14], arg1.field1291, var10.field575, var5, var15);
                                        }
                                    }
                                }
                                class62[] var16 = arg1.field1347;
                                if (class116.field2674) {
                                    var16 = class34.method266((byte) -37, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            class62.field1517++;
                                            if (var17 == 0) {
                                                var18 = 21;
                                            }
                                            if (var17 == 1) {
                                                var18 = 19;
                                            }
                                            if (var17 == 2) {
                                                var18 = 8;
                                            }
                                            if (var17 == 3) {
                                                var18 = 43;
                                            }
                                            if (var17 == 4) {
                                                var18 = 29;
                                            }
                                            class135.method1079((byte) -113, class70.method594(new class62[] { class124.field2833, var10.field571 }, 1229), var16[var17], arg1.field1291, var10.field575, var5, var18);
                                        }
                                    }
                                }
                                class135.method1079((byte) -113, class70.method594(new class62[] { class124.field2833, var10.field571 }, 1229), class39.field906, arg1.field1291, var10.field575, var5, 1004);
                            } else if ((class52.field1201 & 0x10) == 16) {
                                class47.field1080++;
                                class135.method1079((byte) -113, class70.method594(new class62[] { class27.field678, class36.field864, var10.field571 }, 1229), class124.field2835, arg1.field1291, var10.field575, var5, 14);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg1.field1322) {
            return;
        }
        if (!class90.field2145) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class62 var23 = class130.method1054(arg1, var19, 15547);
                if (var23 != null) {
                    class98.field2281++;
                    class135.method1079((byte) -113, arg1.field1260, var23, arg1.field1291, var19 + 1, arg1.field1257, 1003);
                }
            }
            class62 var20 = class51.method354(arg1, true);
            if (var20 != null) {
                class135.method1079((byte) -113, arg1.field1260, var20, arg1.field1291, 0, arg1.field1257, 23);
                class144.field3370++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class62 var22 = class130.method1054(arg1, var21, 15547);
                if (var22 != null) {
                    class98.field2281++;
                    class135.method1079((byte) -113, arg1.field1260, var22, arg1.field1291, var21 + 1, arg1.field1257, 13);
                }
            }
            if (!class17.method120(class22.method171(arg1, (byte) -96), 1)) {
                return;
            }
            class135.method1079((byte) -113, class83.field1991, class9.field239, arg1.field1291, 0, arg1.field1257, 15);
            class142.field3318++;
        } else if (class80.method635(-1295571787, class22.method171(arg1, (byte) 61)) && (class52.field1201 & 0x20) == 32) {
            class135.method1079((byte) -113, class70.method594(new class62[] { class27.field678, class126.field2847, arg1.field1260 }, 1229), class124.field2835, arg1.field1291, 0, arg1.field1257, 10);
            class57.field1409++;
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)Z")
    public static final boolean method1058(int arg0, int arg1) {
        field2982++;
        if (arg1 < 32) {
            return false;
        } else if (~arg1 == arg0) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lpd;B)V")
    public static final void method1059(class108 arg0, byte arg1) {
        if (arg1 >= -89) {
            method1058(-52, -96);
        }
        class105.field2432 = arg0;
        field3006++;
    }
}
