import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class117 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2090 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lsb;")
    public static class98 field2093 = class47.method368("Verbindung abgebrochen)3", 0);

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lvd;")
    public static class15 field2095 = new class15();

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lsb;")
    public static class98 field2096 = class47.method368("<col=ffff00>", 0);

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field2099 = -1;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field2107 = -1;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "S")
    public static short field2100 = 1;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Lsb;")
    public static class98 field2105 = class47.method368("(U(Y", 0);

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lsb;")
    public static class98 field2106 = class47.method368("headicons_prayer", 0);

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Lsb;")
    private static class98 field2104 = class47.method368("Loading title screen )2 ", 0);

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Lsb;")
    public static class98 field2103 = field2104;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static volatile int field2108 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "[Lnj;")
    public static class82[] field2101;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[Lnj;")
    public static class82[] field2102;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[[I")
    public static int[][] field2097;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[[[B")
    public static byte[][][] field2098;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)Z")
    public static final boolean method872(int arg0, int arg1, int arg2, int arg3) {
        if (!class229.method1578(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class78.field1393[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class120.field2196) {
                    if (!class16.method143(var4, var6, var5)) {
                        return false;
                    }
                    if (!class16.method143(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class16.method143(var4, var7, var5)) {
                        return false;
                    }
                    if (!class16.method143(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class16.method143(var4, var8, var5)) {
                    return false;
                }
                if (!class16.method143(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class154.field2810) {
                    if (!class16.method143(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class16.method143(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class16.method143(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class16.method143(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class16.method143(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class16.method143(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class120.field2196) {
                    if (!class16.method143(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class16.method143(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class16.method143(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class16.method143(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class16.method143(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class16.method143(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class154.field2810) {
                    if (!class16.method143(var4, var6, var5)) {
                        return false;
                    }
                    if (!class16.method143(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class16.method143(var4, var7, var5)) {
                        return false;
                    }
                    if (!class16.method143(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class16.method143(var4, var8, var5)) {
                    return false;
                }
                if (!class16.method143(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class16.method143(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class16.method143(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class16.method143(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class16.method143(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class16.method143(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static final void method873(byte arg0) {
        if (!class97.field1672) {
            if (class20.field362 != 0) {
                class189.field3267 = class157.field2859;
                class200.field3430 = class112.field1998;
            } else if (class48.field810 == 0) {
                class200.field3430 = class199.field3426;
                class189.field3267 = class75.field1322;
            } else {
                class200.field3430 = class250.field4384;
                class189.field3267 = class139.field2471;
            }
            class212.field3630[0] = 1003;
            class226.field3894 = 1;
            class112.field1994[0] = class214.field3640;
            class217.field3751[0] = class233.field4011;
        }
        field2091++;
        if (class232.field3992 != -1) {
            class132.method995(class232.field3992, (byte) -123);
        }
        for (int var1 = 0; var1 < class120.field2215; var1++) {
            if (class208.field3563[var1]) {
                class69.field1105[var1] = true;
            }
            class72.field1196[var1] = class208.field3563[var1];
            class208.field3563[var1] = false;
        }
        class151.field2784 = -1;
        class23.field470 = null;
        if (arg0 != 66) {
            return;
        }
        class139.field2467 = class236.field4071;
        class102.field1822 = -1;
        if (class232.field3992 != -1) {
            class120.field2215 = 0;
            class223.method1540(0, 0, (byte) 125, -1, class121.field2227, 0, 0, class232.field3992, class180.field3111);
        }
        class128.method954();
        class33.method291(arg0 - 164);
        if (class97.field1672) {
            class81.method607(-76);
        } else if (class151.field2784 != -1) {
            class255.method1768(class102.field1822, class151.field2784, (byte) 95);
        }
        if (class36.field601 == 3) {
            for (int var2 = 0; var2 < class120.field2215; var2++) {
                if (class72.field1196[var2]) {
                    class128.method968(class150.field2762[var2], class235.field4063[var2], class119.field2132[var2], class11.field222[var2], 16711935, 128);
                } else if (class69.field1105[var2]) {
                    class128.method968(class150.field2762[var2], class235.field4063[var2], class119.field2132[var2], class11.field222[var2], 16711680, 128);
                }
            }
        }
        class104.method801(class163.field2943.field4466, 64, class163.field2943.field4492, class265.field4640, class199.field3418);
        class199.field3418 = 0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ltg;Ltg;I)I")
    public static final int method874(class75 arg0, class75 arg1, int arg2) {
        field2094++;
        if (arg2 < 100) {
            method872(-88, -94, -119, 1);
        }
        int var3 = 0;
        if (arg1.method575(class1.field13, 0)) {
            var3++;
        }
        if (arg1.method575(class106.field1902, 0)) {
            var3++;
        }
        if (arg1.method575(class221.field3810, 0)) {
            var3++;
        }
        if (arg0.method575(class1.field13, 0)) {
            var3++;
        }
        if (arg0.method575(class106.field1902, 0)) {
            var3++;
        }
        if (arg0.method575(class221.field3810, 0)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method875(int arg0, Component arg1) {
        field2092++;
        arg1.removeMouseListener(class71.field1129);
        arg1.removeMouseMotionListener(class71.field1129);
        arg1.removeFocusListener(class71.field1129);
        class258.field4548 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method876(int arg0) {
        field2102 = null;
        field2104 = null;
        field2095 = null;
        field2098 = null;
        field2093 = null;
        if (arg0 != 230) {
            method876(-128);
        }
        field2096 = null;
        field2106 = null;
        field2101 = null;
        field2105 = null;
        field2097 = null;
        field2103 = null;
    }
}
