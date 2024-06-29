import java.awt.Frame;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 extends class99 {

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Z")
    public boolean field2104 = false;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lr;")
    public static class118 field2102 = class153.method1136(89, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!md", name = "G", descriptor = "Lr;")
    public static class118 field2110 = class153.method1136(86, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Lr;")
    public static class118 field2111 = class153.method1136(94, ")4lang)4de");

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lr;")
    private static class118 field2101 = class153.method1136(77, "Please enter your username)3");

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Lr;")
    public static class118 field2113 = field2101;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2108 = Calendar.getInstance();

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public int field2114;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Lke;")
    public static class74 field2115;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "Ln;")
    public static class90 field2112;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Ljava/awt/Frame;")
    public static Frame field2117;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "[[[B")
    public static byte[][][] field2100;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Le;I)V")
    public static final void method706(class29 arg0, int arg1) {
        field2106++;
        if (class108.field2508) {
            class105.method816(610, arg0);
            return;
        }
        if (class82.field1972 == 1 && class29.field701 >= 715 && class14.field317 >= 453) {
            class45.field1088 = !class45.field1088;
            if (class45.field1088) {
                class32.method271(-17486);
            } else {
                class141.method1052(class101.field2330, class46.field1113, false, false, 255, class132.field3023);
            }
        }
        if (class26.field631 == 5) {
            return;
        }
        class69.field1611++;
        if (arg1 != -75 || class26.field631 != 10) {
            return;
        }
        if (class103.field2369 != 2 && class15.field390 == 0) {
            if (class82.field1972 == 1) {
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 5;
                byte var5 = 35;
                if (class29.field701 >= var4 && var4 + var3 >= class29.field701 && class14.field317 >= var2 && var2 + var5 >= class14.field317) {
                    class140.method1048((byte) 38);
                    return;
                }
            }
            if (class139.field3167 != null) {
                class140.method1048((byte) 38);
            }
        }
        int var6 = class82.field1972;
        int var7 = class29.field701;
        int var8 = class14.field317;
        if (class2.field46 == 0) {
            short var9 = 291;
            short var10 = 302;
            if (var6 == 1 && var10 - 75 <= var7 && var10 + 75 >= var7 && var8 >= var9 - 20 && var8 <= var9 + 20) {
                class2.field46 = 3;
                class47.field1138 = 0;
            }
            short var11 = 462;
            boolean var12 = false;
            if (class33.field842 != 0) {
                while (class115.method901(92)) {
                    if (class122.field2809 == 84) {
                        var12 = true;
                        break;
                    }
                }
            }
            if (var12 || var6 == 1 && var11 - 75 <= var7 && var7 <= var11 + 75 && var9 - 20 <= var8 && var8 <= var9 + 20) {
                class2.field46 = 2;
                class132.field3026 = class25.field610;
                class47.field1138 = 0;
                class132.field3025 = class151.field3378;
                class132.field3024 = class151.field3371;
            }
        } else if (class2.field46 == 2) {
            short var13 = 302;
            short var14 = 231;
            short var15 = 321;
            int var21 = var14 + 30;
            if (var6 == 1 && var8 >= var21 - 15 && var8 < var21) {
                class47.field1138 = 0;
            }
            var21 += 15;
            if (var6 == 1 && var8 >= var21 - 15 && var21 > var8) {
                class47.field1138 = 1;
            }
            var21 += 15;
            if (var6 == 1 && var7 >= var13 - 75 && var7 <= var13 + 75 && var8 >= var15 - 20 && var8 <= var15 + 20) {
                class132.field3022 = class132.field3022.method928(arg1 + 30405).method903(38);
                if (class132.field3022.method935(-69) == 0) {
                    class26.method230(class151.field3407, class151.field3414, field2113, true);
                } else if (class132.field3021.method935(-91) == 0) {
                    class26.method230(class151.field3401, class151.field3417, class114.field2658, true);
                } else {
                    class26.method230(class151.field3394, class151.field3416, class114.field2667, true);
                    class39.method326(arg1 + 22152, 20);
                }
            } else {
                short var16 = 462;
                if (var6 == 1 && var16 - 75 <= var7 && var16 + 75 >= var7 && var15 - 20 <= var8 && var8 <= var15 + 20) {
                    class132.field3021 = class132.field3023;
                    class2.field46 = 0;
                    class132.field3022 = class132.field3023;
                }
                while (true) {
                    boolean var17;
                    label243: do {
                        while (class115.method901(arg1 + 112)) {
                            var17 = false;
                            for (int var18 = 0; var18 < class46.field1121.method935(-116); var18++) {
                                if (class99.field2290 == class46.field1121.method916(arg1 ^ 0x615E, var18)) {
                                    var17 = true;
                                    break;
                                }
                            }
                            if (class47.field1138 != 0) {
                                continue label243;
                            }
                            if (class122.field2809 == 85 && class132.field3022.method935(-128) > 0) {
                                class132.field3022 = class132.field3022.method932(class132.field3022.method935(-90) - 1, (byte) 126, 0);
                            }
                            if (class122.field2809 == 84 || class122.field2809 == 80) {
                                class47.field1138 = 1;
                            }
                            if (var17 && class132.field3022.method935(-99) < 12) {
                                class132.field3022 = class132.field3022.method922(class99.field2290, (byte) -6);
                            }
                        }
                        return;
                    } while (class47.field1138 != 1);
                    if (class122.field2809 == 85 && class132.field3021.method935(arg1 + 11) > 0) {
                        class132.field3021 = class132.field3021.method932(class132.field3021.method935(-92) - 1, (byte) -59, 0);
                    }
                    if (class122.field2809 == 84 || class122.field2809 == 80) {
                        class47.field1138 = 0;
                    }
                    if (class33.field842 != 0 && class122.field2809 == 84) {
                        class132.field3022 = class132.field3022.method928(arg1 ^ 0xFFFF89CF).method903(arg1 ^ 0xFFFFFF93);
                        if (class132.field3022.method935(-125) == 0) {
                            class26.method230(class151.field3407, class151.field3414, field2113, true);
                            return;
                        }
                        if (class132.field3021.method935(-121) == 0) {
                            class26.method230(class151.field3401, class151.field3417, class114.field2658, true);
                            return;
                        }
                        class26.method230(class151.field3394, class151.field3416, class114.field2667, true);
                        class39.method326(22077, 20);
                        return;
                    }
                    if (var17 && class132.field3021.method935(arg1 ^ 0x1F) < 20) {
                        class132.field3021 = class132.field3021.method922(class99.field2290, (byte) -6);
                    }
                }
            }
        } else if (class2.field46 == 3) {
            short var19 = 382;
            short var20 = 321;
            if (var6 == 1 && var7 >= var19 - 75 && var7 <= var19 + 75 && var8 >= var20 - 20 && var20 + 20 >= var8) {
                class2.field46 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method707(int arg0) {
        field2101 = null;
        field2108 = null;
        field2100 = null;
        field2117 = null;
        field2112 = null;
        field2102 = null;
        field2115 = null;
        int var1 = 116 / ((-arg0 - 50) / 54);
        field2110 = null;
        field2113 = null;
        field2111 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Z")
    public static final boolean method708(byte arg0, int arg1) {
        field2109++;
        if (arg0 != -116) {
            method708((byte) 79, -121);
        }
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLke;)Z")
    public static final boolean method709(boolean arg0, class74 arg1) {
        if (!arg0) {
            field2100 = null;
        }
        field2103++;
        if (class33.field844) {
            if (class46.method384(arg1, 0) != 0) {
                return false;
            }
            if (arg1.field1807 == 0) {
                return false;
            }
        }
        return arg1.field1840;
    }
}
