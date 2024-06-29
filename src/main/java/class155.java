import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class155 implements class419 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method1120(int arg0) {
        field2362++;
        class163.method1181(false, 4);
        class292.field4183 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class222.field3218.length; var2++) {
            if (class515.field7579[var2] != -1 && class222.field3218[var2] == null) {
                class222.field3218[var2] = class490.field7157.method683(class515.field7579[var2], 0, 5);
                if (class222.field3218[var2] == null) {
                    class292.field4183++;
                    var1 = false;
                }
            }
            if (class364.field5473[var2] != -1 && class379.field5653[var2] == null) {
                class379.field5653[var2] = class490.field7157.method679(0, 96, class178.field2702[var2], class364.field5473[var2]);
                if (class379.field5653[var2] == null) {
                    var1 = false;
                    class292.field4183++;
                }
            }
            if (class323.field4961[var2] != -1 && class98.field1597[var2] == null) {
                class98.field1597[var2] = class490.field7157.method683(class323.field4961[var2], 0, 5);
                if (class98.field1597[var2] == null) {
                    var1 = false;
                    class292.field4183++;
                }
            }
            if (class266.field3846[var2] != -1 && class29.field476[var2] == null) {
                class29.field476[var2] = class490.field7157.method683(class266.field3846[var2], 0, 5);
                if (class29.field476[var2] == null) {
                    var1 = false;
                    class292.field4183++;
                }
            }
            if (class403.field5925 != null && class466.field6852[var2] == null && class403.field5925[var2] != -1) {
                class466.field6852[var2] = class490.field7157.method679(0, 99, class178.field2702[var2], class403.field5925[var2]);
                if (class466.field6852[var2] == null) {
                    class292.field4183++;
                    var1 = false;
                }
            }
        }
        if (class518.field7617 == null) {
            if (class80.field1325 == null || !class511.field7543.method668(class80.field1325.field2137 + "_staticelements", 16751)) {
                class518.field7617 = new class388(0);
            } else if (class511.field7543.method676(class80.field1325.field2137 + "_staticelements", false)) {
                class518.field7617 = class287.method1792(class22.field394, class80.field1325.field2137 + "_staticelements", class511.field7543, (byte) -113);
            } else {
                class292.field4183++;
                var1 = false;
            }
        }
        if (!var1) {
            class139.field2099 = 1;
            return;
        }
        boolean var3 = true;
        class360.field5439 = 0;
        for (int var4 = 0; var4 < class222.field3218.length; var4++) {
            byte[] var19 = class379.field5653[var4];
            if (var19 != null) {
                int var20 = (class274.field3954[var4] >> 8) * 64 - class483.field7082;
                int var21 = (class274.field3954[var4] & 0xFF) * 64 - class465.field6840;
                if (class445.field6534 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class256.method1623(var21, class83.field1366, class237.field3436, var20, arg0 + 117, var19);
            }
            byte[] var22 = class29.field476[var4];
            if (var22 != null) {
                int var23 = (class274.field3954[var4] >> 8) * 64 - class483.field7082;
                int var24 = (class274.field3954[var4] & 0xFF) * 64 - class465.field6840;
                if (class445.field6534 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class256.method1623(var24, class83.field1366, class237.field3436, var23, 106, var22);
            }
        }
        if (!var3) {
            class139.field2099 = 2;
            return;
        }
        if (class139.field2099 != 0) {
            class54.method392((byte) -101, true, class239.field3480.method1273(true, class370.field5530) + "<br>(100%)", class55.field808);
        }
        class292.method1811(true);
        class24.method204((byte) -102);
        boolean var5 = false;
        if (class394.field5821.method482() && class397.field5830.field136) {
            for (int var6 = 0; var6 < class222.field3218.length; var6++) {
                if (class29.field476[var6] != null || class98.field1597[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class397.field5830.field153) {
            var7 = class162.field2448[class279.field4015];
        } else {
            var7 = class129.field1988[class279.field4015];
        }
        if (class394.field5821.method446()) {
            var7++;
        }
        class307.method1930(7, 4, class237.field3436, class83.field1366, var7, var5, class394.field5821.method488() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class255.field3679[var8].method982(-96);
        }
        class434.method2627((byte) -55);
        class459.method2753(false, false);
        class519.method3067((byte) -110);
        class118.field1861 = null;
        class292.method1811(true);
        System.gc();
        class163.method1181(true, arg0);
        class473.method2831(true);
        class67.field1167 = class397.field5830.method56((byte) 110, class399.field5865);
        class41.field635 = class397.field5830.field136;
        class128.field1961 = class445.field6538 >= 96;
        class356.field5388 = class397.field5830.method59((byte) 114, class399.field5865);
        class404.field5954 = !class397.field5830.field115;
        class400.field5873 = class397.field5830.method1292(class399.field5865, -2) ? -1 : class334.field5132;
        class237.field3431 = class399.field5865 == 1 || class397.field5830.field134;
        class286.field4135 = class397.field5830.field144;
        class227.field3314 = new class425(arg0, class237.field3436, class83.field1366, false);
        if (class445.field6534 == 0) {
            class408.method2530(class222.field3218, (byte) -57, class227.field3314);
        } else {
            class227.method1501(class227.field3314, (byte) 125, class222.field3218);
        }
        class263.method1683(class237.field3436 >> 4, (byte) 53, class83.field1366 >> 4);
        class206.method1379((byte) -53);
        if (var5) {
            class67.method581(true);
            class411.field6045 = new class425(1, class237.field3436, class83.field1366, true);
            if (class445.field6534 == 0) {
                class408.method2530(class98.field1597, (byte) -66, class411.field6045);
                class163.method1181(true, arg0);
            } else {
                class227.method1501(class411.field6045, (byte) 125, class98.field1597);
                class163.method1181(true, 4);
            }
            class411.field6045.method1074(class227.field3314.field2252[0], 0, true);
            class411.field6045.method1069(null, arg0 ^ 0xC, null, class394.field5821);
            class67.method581(false);
        }
        class227.field3314.method1069(var5 ? class411.field6045.field2252 : null, 8, class255.field3679, class394.field5821);
        if (class445.field6534 == 0) {
            class163.method1181(true, 4);
            class119.method869(class227.field3314, class379.field5653, (byte) -119);
            if (class466.field6852 != null) {
                class41.method321(19735);
            }
        } else {
            class163.method1181(true, arg0);
            class422.method2582(class227.field3314, -113, class379.field5653);
        }
        class24.method204((byte) -102);
        class163.method1181(true, arg0);
        class227.field3314.method1071(-1, class394.field5821, null, var5 ? class62.field1063[0] : null);
        class227.field3314.method2602(class394.field5821, 23992);
        class163.method1181(true, 4);
        if (var5) {
            class67.method581(true);
            class163.method1181(true, 4);
            if (class445.field6534 == 0) {
                class119.method869(class411.field6045, class29.field476, (byte) -119);
            } else {
                class422.method2582(class411.field6045, -66, class29.field476);
            }
            class24.method204((byte) -102);
            class163.method1181(true, 4);
            class411.field6045.method1071(arg0 - 5, class394.field5821, class145.field2135[0], null);
            class411.field6045.method2602(class394.field5821, 23992);
            class163.method1181(true, 4);
            class67.method581(false);
        }
        class366.method2358(70);
        int var9 = class227.field3314.field6238;
        if (var9 > class434.field6317) {
            var9 = class434.field6317;
        }
        if (var9 < (class434.field6317 - 1)) {
            var9 = class434.field6317 - 1;
        }
        if (class397.field5830.method1292(class399.field5865, -2)) {
            class72.method607(0);
        } else {
            class72.method607(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class237.field3436; var17++) {
                for (int var18 = 0; var18 < class83.field1366; var18++) {
                    class91.method737(var17, var10, (byte) -118, var18);
                }
            }
        }
        class335.method2202(arg0 ^ 0xFFFFFFFB);
        class292.method1811(true);
        class246.method1573(16384);
        class24.method204((byte) -102);
        class503.field7375 = false;
        class335.method2203(1693);
        if (class409.field6029 != null && class138.field2091 != null && class17.field266 == 25) {
            class112.field1776++;
            class114.method841(false, class275.field3989);
            class86.field1436.method1892(397825512, 1057001181);
        }
        if (class445.field6534 == 0) {
            int var11 = (class351.field5335 - (class237.field3436 >> 4)) / 8;
            int var12 = ((class237.field3436 >> 4) + class351.field5335) / 8;
            int var13 = (class251.field3624 - (class83.field1366 >> 4)) / 8;
            int var14 = ((class83.field1366 >> 4) + class251.field3624) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var11 > var15 || var15 > var12 || var16 < var13 || var16 > var14) {
                        class490.field7157.method686((byte) 112, "m" + var15 + "_" + var16);
                        class490.field7157.method686((byte) 122, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class17.field266 == 28) {
            class138.method1022(10, 1);
        } else {
            class138.method1022(30, 1);
            if (class138.field2091 != null) {
                class114.method841(false, class411.field6044);
            }
        }
        class127.method940((byte) 75);
        class292.method1811(true);
        class73.method617(116);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIILtn;)V")
    public static final void method1121(int arg0, boolean arg1, int arg2, int arg3, class58 arg4) {
        field2363++;
        if (arg2 <= 14) {
            method1120(-31);
        }
        int var5 = arg4.field925;
        if (arg4.field937 == 0) {
            arg4.field925 = arg4.field877;
        } else if (arg4.field937 == 1) {
            arg4.field925 = arg3 - arg4.field877;
        } else if (arg4.field937 == 2) {
            arg4.field925 = arg4.field877 * arg3 >> 14;
        }
        int var6 = arg4.field896;
        if (arg4.field854 == 0) {
            arg4.field896 = arg4.field936;
        } else if (arg4.field854 == 1) {
            arg4.field896 = arg0 - arg4.field936;
        } else if (arg4.field854 == 2) {
            arg4.field896 = arg4.field936 * arg0 >> 14;
        }
        if (arg4.field937 == 4) {
            arg4.field925 = arg4.field896 * arg4.field841 / arg4.field930;
        }
        if (arg4.field854 == 4) {
            arg4.field896 = arg4.field930 * arg4.field925 / arg4.field841;
        }
        if (class38.field578 && (client.method1349(arg4).field1626 != 0 || arg4.field843 == 0)) {
            if (arg4.field896 < 5 && arg4.field925 < 5) {
                arg4.field896 = 5;
                arg4.field925 = 5;
            } else {
                if (arg4.field896 <= 0) {
                    arg4.field896 = 5;
                }
                if (arg4.field925 <= 0) {
                    arg4.field925 = 5;
                }
            }
        }
        if (class494.field7196 == arg4.field892) {
            class212.field3067 = arg4;
        }
        if (arg1 && arg4.field918 != null && arg4.field925 != var5 || arg4.field896 != var6) {
            class519 var7 = new class519();
            var7.field7625 = arg4;
            var7.field7627 = arg4.field918;
            class481.field7066.method2270(0, var7);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1122(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)Ltn;")
    public static final class58 method1123(int arg0, int arg1, byte arg2) {
        field2361++;
        class58 var3 = class421.method2578(-4179, arg1);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field910 == null || var3.field910.length <= arg0) {
            return null;
        } else {
            if (arg2 >= -44) {
                method1121(-39, true, 64, 102, null);
            }
            return var3.field910[arg0];
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BJ[ILsv;)Ljava/lang/String;")
    public final String method1124(byte arg0, long arg1, int[] arg2, class467 arg3) {
        if (arg0 != 33) {
            return null;
        }
        field2364++;
        if (class441.field6471 == arg3) {
            class68 var6 = class405.field5963.method2960(arg2[0], 0);
            return var6.method587(false, (int) arg1);
        } else if (class323.field4953 == arg3 || class310.field4444 == arg3) {
            class172 var7 = class8.field111.method3077(-127, (int) arg1);
            return var7.field2569;
        } else if (class177.field2690 == arg3 || class192.field2819 == arg3 || class390.field5778 == arg3) {
            return class405.field5963.method2960(arg2[0], 0).method587(false, (int) arg1);
        } else {
            return null;
        }
    }

    static {
        new class180("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }
}
