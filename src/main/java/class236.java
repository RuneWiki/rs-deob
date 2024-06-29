import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class236 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3672 = "Select";

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field3674 = -1;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[Lrf;")
    public static class47[] field3671 = new class47[50];

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method1546(int arg0) {
        if (arg0 <= -67) {
            field3672 = null;
            field3671 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lam;BIII)V")
    public static final void method1547(class314 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3675++;
        if (class250.field3905 == arg0 || class179.field2721 >= 400 || arg1 >= -86) {
            return;
        }
        String var11;
        if (arg0.field5037 == 0) {
            boolean var5 = true;
            if (class250.field3905.field5031 != -1 && arg0.field5031 != -1) {
                int var6 = class250.field3905.field5059 > arg0.field5059 ? class250.field3905.field5059 : arg0.field5059;
                int var7 = arg0.field5031 > class250.field3905.field5031 ? class250.field3905.field5031 : arg0.field5031;
                int var8 = class250.field3905.field5059 - arg0.field5059;
                int var9 = var6 * 10 / 100 + var7 + 5;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var9 < var8) {
                    var5 = false;
                }
            }
            String var10 = class188.field2856 == 1 ? class105.field1514 : class271.field4325;
            if (arg0.field5045 <= arg0.field5059) {
                var11 = arg0.method2117(102400, true) + (var5 ? class136.method856((byte) -69, class250.field3905.field5059, arg0.field5059) : "<col=ffffff>") + " (" + var10 + arg0.field5059 + ")";
            } else {
                var11 = arg0.method2117(102400, true) + (var5 ? class136.method856((byte) -36, class250.field3905.field5059, arg0.field5059) : "<col=ffffff>") + " (" + var10 + arg0.field5059 + "+" + (arg0.field5045 - arg0.field5059) + ")";
            }
        } else {
            var11 = arg0.method2117(102400, true) + " (" + class32.field479 + arg0.field5037 + ")";
        }
        if (class265.field4266 == 1) {
            class93.field1357++;
            class82.method518(class256.field4085, (short) 39, class95.field1367, class34.field521 + " -> <col=ffffff>" + var11, arg4, arg2, (long) arg3, (byte) 101);
        } else if (!class193.field2950) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class233.field3648[var12] != null) {
                    class17.field296++;
                    short var14 = 0;
                    if (class188.field2856 == 0 && class233.field3648[var12].equalsIgnoreCase(class69.field973)) {
                        if (arg0.field5059 > class250.field3905.field5059) {
                            var14 = 2000;
                        }
                        if (class250.field3905.field5054 != 0 && arg0.field5054 != 0) {
                            if (class250.field3905.field5054 == arg0.field5054) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class16.field287[var12]) {
                        var14 = 2000;
                    }
                    boolean var15 = false;
                    short var16 = class27.field428[var12];
                    short var17 = (short) (var14 + var16);
                    class82.method518(class15.field276[var12], var17, class233.field3648[var12], "<col=ffffff>" + var11, arg4, arg2, (long) arg3, (byte) 98);
                }
            }
        } else if ((class202.field3052 & 0x8) != 0) {
            class6.field64++;
            class82.method518(class121.field1729, (short) 51, class225.field3526, class166.field2353 + " -> <col=ffffff>" + var11, arg4, arg2, (long) arg3, (byte) 100);
        }
        for (int var13 = 0; var13 < class179.field2721; var13++) {
            if (class151.field2101[var13] == 48) {
                class137.field1877[var13] = "<col=ffffff>" + var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
    public static final int method1548(int arg0) {
        int var1 = -26 / ((-arg0 - 44) / 46);
        field3673++;
        if ((double) class97.field1407 == 3.0D) {
            return 37;
        } else if ((double) class97.field1407 == 4.0D) {
            return 50;
        } else if ((double) class97.field1407 == 6.0D) {
            return 75;
        } else if ((double) class97.field1407 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
