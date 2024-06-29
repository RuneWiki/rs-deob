import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class175 extends class342 {

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Z")
    public static boolean field2653 = false;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field2656 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2654 = "Loaded config";

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field2658 = 0;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field2661 = 50;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "[I")
    public static int[] field2643 = new int[field2661];

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2659 = "Connecting to update server";

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "[I")
    public static int[] field2660 = new int[field2661];

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[I")
    public static int[] field2645 = new int[field2661];

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field2648 = new String[field2661];

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "[I")
    public static int[] field2657 = new int[field2661];

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "[I")
    public static int[] field2652 = new int[field2661];

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "[I")
    public static int[] field2651 = new int[field2661];

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "[I")
    public static int[] field2655 = new int[field2661];

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Ll;")
    public static class133 field2647;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "Ll;")
    public static class133 field2649;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lfd;")
    public static class207 field2644;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "[Lil;")
    public static class282[] field2650;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "[Z")
    public static boolean[] field2646;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V", line = 15)
    public static final void method1255(int arg0, int arg1) {
        field2642++;
        int var2 = class310.field4816;
        if (arg0 == 0) {
            var2 = 1;
        }
        if (arg1 != -2) {
            return;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class33 var4;
            if (arg0 == 0) {
                var4 = class98.field1566;
            } else {
                var4 = class254.field3992[class103.field1606[var3]];
            }
            if (var4 != null && var4.method278(arg1 ^ 0x14CA)) {
                int var5 = var4.method280(false);
                if (arg0 == 0 || arg0 == var5) {
                    if (var5 == 1) {
                        if ((var4.field1905 & 0x7F) == 64 && (var4.field1868 & 0x7F) == 64) {
                            int var6 = var4.field1868 >> 7;
                            int var7 = var4.field1905 >> 7;
                            if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                                var10002 = class240.field3833[var7][var6]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field1905 & 0x7F) == 0 && (var4.field1868 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field1905 & 0x7F) == 64 && (var4.field1868 & 0x7F) == 64)) {
                        int var8 = var4.field1905 - var5 * 64 >> 7;
                        int var9 = var4.field1868 - var5 * 64 >> 7;
                        int var10 = var8 + var4.method280(false);
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        int var11 = var9 + var4.method280(false);
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        for (int var12 = var8; var12 < var10; var12++) {
                            for (int var13 = var9; var13 < var11; var13++) {
                                var10002 = class240.field3833[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        label224: for (int var14 = 0; var14 < var2; var14++) {
            long var15;
            class33 var17;
            if (arg0 == 0) {
                var17 = class98.field1566;
                var15 = 8791798054912L;
            } else {
                var15 = (long) class103.field1606[var14] << 32;
                var17 = class254.field3992[class103.field1606[var14]];
            }
            if (var17 != null && var17.method278(-5324)) {
                int var18 = var17.method280(false);
                if (arg0 == 0 || arg0 == var18) {
                    var17.field508 = false;
                    var17.field1925 = true;
                    if ((class170.field2565 && class310.field4816 > 200 || class310.field4816 > 50) && arg0 != 0 && var17.field1872 == var17.method888(0).field5206) {
                        var17.field508 = true;
                    }
                    if (var18 == 1) {
                        if ((var17.field1905 & 0x7F) == 64 && (var17.field1868 & 0x7F) == 64) {
                            int var28 = var17.field1868 >> 7;
                            int var29 = var17.field1905 >> 7;
                            if (var29 < 0 || var29 >= 104 || var28 < 0 || var28 >= 104) {
                                continue;
                            }
                            if (class240.field3833[var29][var28] > 1) {
                                var10002 = class240.field3833[var29][var28]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var17.field1905 & 0x7F) == 0 && (var17.field1868 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var17.field1905 & 0x7F) == 64 && (var17.field1868 & 0x7F) == 0) {
                        int var19 = var17.field1905 - (var18 * 64) >> 7;
                        int var20 = var17.field1868 - var18 * 64 >> 7;
                        boolean var21 = true;
                        int var22 = var18 + var19;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var23 = var18 + var20;
                        if (var22 > 104) {
                            var22 = 104;
                        }
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        for (int var24 = var19; var24 < var22; var24++) {
                            for (int var25 = var20; var25 < var23; var25++) {
                                if (class240.field3833[var24][var25] <= 1) {
                                    var21 = false;
                                    break;
                                }
                            }
                        }
                        if (var21) {
                            int var26 = var19;
                            while (true) {
                                if (var26 >= var22) {
                                    continue label224;
                                }
                                for (int var27 = var20; var27 < var23; var27++) {
                                    var10002 = class240.field3833[var26][var27]--;
                                }
                                var26++;
                            }
                        }
                    }
                    if (var17.field1893 == null || class227.field3618 < var17.field1931 || class227.field3618 >= var17.field1889) {
                        var17.field1925 = false;
                        var17.field1909 = class320.method2181(var17.field1905, var17.field1868, arg1 - 26, class205.field3101);
                        class272.method1874(class205.field3101, var17.field1905, var17.field1868, var17.field1909, var18 * 64 + 60 - 64, var17, var17.field1939, var15, var17.field1919);
                    } else {
                        var17.field1925 = false;
                        var17.field508 = false;
                        var17.field1909 = class320.method2181(var17.field1905, var17.field1868, -124, class205.field3101);
                        class333.method2313(class205.field3101, var17.field1905, var17.field1868, var17.field1909, var17, var17.field1939, var15, var17.field1879, var17.field1950, var17.field1878, var17.field1862);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 305)
    public static void method1256(int arg0) {
        field2657 = null;
        field2645 = null;
        field2643 = null;
        field2647 = null;
        field2660 = null;
        field2654 = null;
        if (arg0 >= -89) {
            return;
        }
        field2649 = null;
        field2659 = null;
        field2652 = null;
        field2656 = null;
        field2644 = null;
        field2646 = null;
        field2651 = null;
        field2648 = null;
        field2650 = null;
        field2655 = null;
    }
}
