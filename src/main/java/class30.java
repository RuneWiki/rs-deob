import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class30 extends class171 {

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
    public static boolean field409 = false;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
    public static int[] field405 = new int[4];

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "[I")
    public static int[] field415 = new int[100];

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "S")
    public static short field416 = 1;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field411 = 0;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "B")
    public static byte field412;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
    public static void method195(byte arg0) {
        field415 = null;
        if (arg0 <= 120) {
            method196((class211) null, -90, -106, -22);
        }
        field405 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lse;III)V")
    public static final void method196(class211 arg0, int arg1, int arg2, int arg3) {
        field417++;
        if (arg0.field3109 == 1) {
            class193.field2660++;
            class238.method1593(-1, 0L, -30789, 0, arg0.field3045, "", (short) 16, arg0.field3093);
        }
        if (arg0.field3109 == 2 && !class11.field113) {
            String var4 = class29.method194(arg1 - 23309, arg0);
            if (var4 != null) {
                class228.field3455++;
                class238.method1593(-1, 0L, -30789, -1, var4, "<col=00ff00>" + arg0.field3111, (short) 50, arg0.field3093);
            }
        }
        if (arg0.field3109 == 3) {
            class238.method1593(-1, 0L, -30789, 0, class257.field3924, "", (short) 7, arg0.field3093);
            class95.field1342++;
        }
        if (arg0.field3109 == 4) {
            class238.method1593(-1, 0L, -30789, 0, arg0.field3045, "", (short) 38, arg0.field3093);
            class137.field1922++;
        }
        if (arg0.field3109 == 5) {
            class174.field2443++;
            class238.method1593(-1, 0L, -30789, 0, arg0.field3045, "", (short) 33, arg0.field3093);
        }
        if (arg0.field3109 == 6 && class233.field3524 == null) {
            class148.field2042++;
            class238.method1593(-1, 0L, -30789, -1, arg0.field3045, "", (short) 26, arg0.field3093);
        }
        if (arg0.field3035 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field3087; var6++) {
                for (int var7 = 0; var7 < arg0.field3026; var7++) {
                    int var8 = (arg0.field3159 + 32) * var6;
                    int var9 = (arg0.field3178 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg0.field3167[var5];
                        var8 += arg0.field3006[var5];
                    }
                    if (arg3 >= var9 && arg2 >= var8 && var9 + 32 > arg3 && (var8 + 32) > arg2) {
                        class197.field2742 = var5;
                        class131.field1843 = arg0;
                        if (arg0.field3015[var5] > 0) {
                            class203 var10 = client.method1040(arg0);
                            class32 var11 = class73.method463(arg0.field3015[var5] - 1, -31104);
                            if (class141.field1963 == 1 && var10.method1289((byte) 75)) {
                                if (class76.field1061 != arg0.field3093 || class156.field2172 != var5) {
                                    class230.field3482++;
                                    class238.method1593(-1, (long) var11.field448, arg1 ^ 0xFFFFDCB6, var5, class224.field3405, class238.field3612 + " -> <col=ff9040>" + var11.field437, (short) 44, arg0.field3093);
                                }
                            } else if (class11.field113 && var10.method1289((byte) -88)) {
                                class230 var12 = class96.field1357 == -1 ? null : class92.method602(arg1 - 23415, class96.field1357);
                                if ((class285.field4469 & 0x10) != 0 && (var12 == null || var11.method212(class96.field1357, 112, var12.field3480) != var12.field3480)) {
                                    class238.method1593(class93.field1303, (long) var11.field448, -30789, var5, class168.field2332, class54.field791 + " -> <col=ff9040>" + var11.field437, (short) 23, arg0.field3093);
                                    class219.field3296++;
                                }
                            } else {
                                class21.field313++;
                                String[] var13 = var11.field490;
                                if (class175.field2462) {
                                    var13 = class197.method1261(var13, arg1 - 23304);
                                }
                                if (var10.method1289((byte) -90)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 35;
                                            } else {
                                                var15 = 41;
                                            }
                                            class238.method1593(-1, (long) var11.field448, arg1 - 54098, var5, var13[var14], "<col=ff9040>" + var11.field437, var15, arg0.field3093);
                                            class218.field3290++;
                                        }
                                    }
                                }
                                if (var10.method1285((byte) -23)) {
                                    class294.field4623++;
                                    class238.method1593(class265.field3976, (long) var11.field448, arg1 ^ 0xFFFFDCB6, var5, class224.field3405, "<col=ff9040>" + var11.field437, (short) 58, arg0.field3093);
                                }
                                if (var10.method1289((byte) -106) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class82.field1115++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 47;
                                            }
                                            if (var16 == 1) {
                                                var17 = 25;
                                            }
                                            if (var16 == 2) {
                                                var17 = 17;
                                            }
                                            class238.method1593(-1, (long) var11.field448, -30789, var5, var13[var16], "<col=ff9040>" + var11.field437, var17, arg0.field3093);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field3018;
                                if (class175.field2462) {
                                    var18 = class197.method1261(var18, 5);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class149.field2064++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 36;
                                            }
                                            if (var19 == 1) {
                                                var20 = 1;
                                            }
                                            if (var19 == 2) {
                                                var20 = 3;
                                            }
                                            if (var19 == 3) {
                                                var20 = 46;
                                            }
                                            if (var19 == 4) {
                                                var20 = 31;
                                            }
                                            class238.method1593(-1, (long) var11.field448, arg1 ^ 0xFFFFDCB6, var5, var18[var19], "<col=ff9040>" + var11.field437, var20, arg0.field3093);
                                        }
                                    }
                                }
                                class238.method1593(class273.field4217, (long) var11.field448, -30789, var5, class277.field4295, "<col=ff9040>" + var11.field437, (short) 1003, arg0.field3093);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg0.field3011) {
            if (!class11.field113) {
                for (int var21 = 9; var21 >= 5; var21--) {
                    String var25 = class286.method1929(var21, arg0, arg1 ^ 0x5B7F);
                    if (var25 != null) {
                        class219.field3295++;
                        class238.method1593(class288.method1940(arg0, var21, 935), (long) (var21 + 1), -30789, arg0.field3042, var25, arg0.field3107, (short) 1006, arg0.field3093);
                    }
                }
                String var22 = class29.method194(0, arg0);
                if (var22 != null) {
                    class228.field3455++;
                    class238.method1593(-1, 0L, -30789, arg0.field3042, var22, arg0.field3107, (short) 50, arg0.field3093);
                }
                for (int var23 = 4; var23 >= 0; var23--) {
                    String var24 = class286.method1929(var23, arg0, 102);
                    if (var24 != null) {
                        class219.field3295++;
                        class238.method1593(class288.method1940(arg0, var23, 935), (long) (var23 + 1), -30789, arg0.field3042, var24, arg0.field3107, (short) 40, arg0.field3093);
                    }
                }
                if (client.method1040(arg0).method1283((byte) 45)) {
                    class148.field2042++;
                    if (arg0.field3172 == null) {
                        class238.method1593(-1, 0L, arg1 ^ 0xFFFFDCB6, arg0.field3042, class163.field2269, "", (short) 26, arg0.field3093);
                    } else {
                        class238.method1593(-1, 0L, -30789, arg0.field3042, arg0.field3172, "", (short) 26, arg0.field3093);
                    }
                }
            } else if (client.method1040(arg0).method1293(arg1 - 55833) && (class285.field4469 & 0x20) != 0) {
                class238.method1593(class93.field1303, 0L, -30789, arg0.field3042, class168.field2332, class54.field791 + " -> " + arg0.field3107, (short) 22, arg0.field3093);
                class180.field2524++;
            }
        }
        if (arg1 != 23309) {
            field415 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Z")
    public static final boolean method197(byte arg0, int arg1) {
        field413++;
        class245 var2 = class235.method1549(false, arg1);
        if (var2 == null) {
            return false;
        } else if (class244.field3717 == 1 || class244.field3717 == 2 || class34.field533 == 2) {
            class13.field130 = var2.field3741;
            class19.field273 = var2.field3742;
            if (class34.field533 != 0) {
                class285.field4466 = class13.field130 + 40000;
                class56.field810 = class285.field4466;
                class198.field2766 = class13.field130 + 50000;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class34.field533 != 0) {
                var3 = ":" + (var2.field3741 + 7000);
            }
            if (class218.field3287 != null) {
                var4 = "/p=" + class218.field3287;
            }
            int var5 = 90 / ((-arg0 - 9) / 51);
            String var6 = "http://" + var2.field3742 + var3 + "/l=" + class218.field3288 + "/a=" + class230.field3491 + var4 + "/j" + (class282.field4371 ? "1" : "0") + ",o" + (class249.field3806 ? "1" : "0") + ",a2,m" + (class286.field4521 ? "1" : "0");
            try {
                class250.field3826.getAppletContext().showDocument(new URL(var6), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V")
    public class30(int arg0, int arg1) {
        this.field407 = arg1;
        this.field406 = arg0;
    }
}
