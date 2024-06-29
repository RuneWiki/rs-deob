import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class361 extends Canvas {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field5547;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lri;")
    public static class73 field5552;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[I")
    public static int[] field5555;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[I")
    public static int[] field5553;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!sf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field5547.update(arg0);
        field5546++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method2250(byte arg0) {
        field5549++;
        if (class12.field162 > 0) {
            class246.method1653(-4548);
            return;
        }
        if (arg0 != -31) {
            method2250((byte) -75);
        }
        class500.field7361 = class90.field1361;
        class90.field1361 = null;
        class11.method76(false, 40);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;BIII)V")
    public static final void method2251(String arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5551++;
        class38 var5 = class229.method1575(arg4, 0, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field504 != null) {
            class168 var6 = new class168();
            var6.field2484 = var5.field504;
            var6.field2479 = arg0;
            var6.field2489 = arg2;
            var6.field2488 = var5;
            class360.method2238(var6);
        }
        boolean var7 = true;
        if (var5.field448 != 0) {
            var7 = class367.method2281(105, var5);
        }
        if (!var7 || !client.method1328(var5).method2359(arg2 - 1, (byte) -10)) {
            return;
        }
        if (arg2 == 1) {
            class120.field1812++;
            class291.method1861((byte) -104, class193.field2825);
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
        if (arg2 == 2) {
            class291.method1861((byte) -104, class141.field2111);
            class386.field5846++;
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
        if (arg2 == 3) {
            class291.method1861((byte) -104, class484.field7088);
            class370.field5659++;
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
        if (arg2 == 4) {
            class214.field3118++;
            class291.method1861((byte) -104, class165.field2429);
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
        if (arg2 == 5) {
            class291.method1861((byte) -104, class38.field548);
            class241.field3565++;
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
        if (arg2 == 6) {
            class291.method1861((byte) -104, class85.field1313);
            class518.field7561++;
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
        int var8 = 48 % ((52 - arg1) / 56);
        if (arg2 == 7) {
            class26.field271++;
            class291.method1861((byte) -104, class359.field5511);
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
        if (arg2 == 8) {
            class291.method1861((byte) -104, class118.field1776);
            class478.field7021++;
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
        if (arg2 == 9) {
            class344.field4973++;
            class291.method1861((byte) -104, class453.field6720);
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
        if (arg2 == 10) {
            class291.method1861((byte) -104, class170.field2518);
            class472.field6951++;
            class340.method2080(arg3, -1, var5.field535, arg4);
        }
    }

    @OriginalMember(owner = "client!sf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field5548++;
        this.field5547.paint(arg0);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static void method2252(byte arg0) {
        field5552 = null;
        if (arg0 == -36) {
            field5555 = null;
            field5553 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILqa;IZ)V")
    public static final void method2253(int arg0, class162 arg1, int arg2, boolean arg3) {
        field5550++;
        if (arg2 < 0 || arg0 < 0 || class495.field7317 == 0 || class259.field3814 == 0) {
            return;
        }
        if (!arg3) {
            method2253(-6, null, -105, false);
        }
        arg1.method1050(class172.field2534, class239.field3551, class495.field7317, class259.field3814);
        arg1.method1098(class29.field300, class155.field2284, class495.field7317, class259.field3814);
        class414 var4 = arg1.method1126();
        var4.method900(class11.field144, class485.field7118, class303.field4277, class237.field3496, class41.field616, class150.field2237);
        arg1.method1082(var4);
        if (class307.field4415 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method1076();
            int var8 = (arg2 - class172.field2534) * var7 / class495.field7317;
            int var9 = (arg0 - class239.field3551) * var7 / class259.field3814;
            int var10 = arg1.method1060();
            int var11 = (arg2 - class172.field2534) * var10 / class495.field7317;
            int var12 = (arg0 - class239.field3551) * var10 / class259.field3814;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method909(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method909(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class30.field323 && class182.field2661 > var22) {
                    int var23 = class500.field7365.field1768;
                    if (var23 < 3 && (class183.field2684[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class307.field4415[var23].method202(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class500.field7365.method847(-1) - 1 << 6) >> 7;
                        var6 = var21 + (class500.field7365.method847(-1) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class61.field932 && (class217.field3177 & 0x40) != 0) {
                    class38 var24 = class229.method1575(class267.field3903, 0, class266.field3893);
                    if (var24 == null) {
                        class138.method920((byte) -43);
                    } else {
                        class496.method2976(false, var5, 0L, " ->", class213.field3114, true, class509.field7432, -1, -128, var6, 45);
                    }
                } else {
                    if (class359.field5513 == class183.field2707) {
                        class496.method2976(false, var5, 0L, "", -1, true, class442.field6598.method2838(false, class143.field2137), -1, -112, var6, 44);
                    }
                    class496.method2976(false, var5, 0L, "", class135.field2065, true, class39.field572, -1, -124, var6, 5);
                    class355.field5457++;
                }
            }
        }
        class296 var25 = class118.field1784;
        for (class405 var26 = (class405) var25.method1873((byte) 97); var26 != null; var26 = (class405) var25.method1880(-61)) {
            if (class500.field7365.field1768 == var26.field6110 && var26.method2438(arg0, arg1, 0, arg2)) {
                if (var26.field6109 instanceof class239) {
                    class239 var27 = (class239) var26.field6109;
                    int var28 = var27.method847(-1);
                    if ((var28 & 0x1) == 0 && (var27.field1763 & 0x7F) == 0 && (var27.field1769 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field1763 & 0x7F) == 64 && (var27.field1769 & 0x7F) == 64) {
                        int var29 = var27.field1763 - (var27.method847(-1) - 1 << 6);
                        int var30 = var27.field1769 - (var27.method847(-1) - 1 << 6);
                        for (int var31 = 0; var31 < class402.field6044; var31++) {
                            class167 var38 = class193.field2821[class378.field5766[var31]];
                            if (var38 != null && class317.field4559 != var38.field1974 && var38.field1990) {
                                int var39 = var38.field1763 - (var38.field2472.field4881 - 1 << 6);
                                int var40 = var38.field1769 - (var38.field2472.field4881 - 1 << 6);
                                if (var29 <= var39 && var38.field2472.field4881 <= var27.method847(-1) - (var39 - var29 >> 7) && var30 <= var40 && var38.field2472.field4881 <= (var27.method847(-1) - (var40 - var30 >> 7))) {
                                    class519.method3066(class500.field7365.field1768 != var26.field6110, var38, 81);
                                    var38.field1974 = class317.field4559;
                                }
                            }
                        }
                        int var32 = class74.field1105;
                        int[] var33 = class272.field3948;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class239 var35 = class44.field707[var33[var34]];
                            if (var35 != null && class317.field4559 != var35.field1974 && var27 != var35 && var35.field1990) {
                                int var36 = var35.field1763 - (var35.method847(-1) - 1 << 6);
                                int var37 = var35.field1769 - (var35.method847(-1) - 1 << 6);
                                if (var36 >= var29 && var35.method847(-1) <= (var27.method847(-1) - (var36 - var29 >> 7)) && var30 <= var37 && var35.method847(-1) <= (var27.method847(-1) - (var37 - var30 >> 7))) {
                                    class340.method2078(-65, var35, class500.field7365.field1768 != var26.field6110);
                                    var35.field1974 = class317.field4559;
                                }
                            }
                        }
                    }
                    if (class317.field4559 == var27.field1974) {
                        continue;
                    }
                    class340.method2078(110, var27, class500.field7365.field1768 != var26.field6110);
                    var27.field1974 = class317.field4559;
                }
                if (var26.field6109 instanceof class167) {
                    class167 var41 = (class167) var26.field6109;
                    if (var41.field2472 != null) {
                        if ((var41.field2472.field4881 & 0x1) == 0 && (var41.field1763 & 0x7F) == 0 && (var41.field1769 & 0x7F) == 0 || (var41.field2472.field4881 & 0x1) == 1 && (var41.field1763 & 0x7F) == 64 && (var41.field1769 & 0x7F) == 64) {
                            int var42 = var41.field1763 - (var41.field2472.field4881 - 1 << 6);
                            int var43 = var41.field1769 - (var41.field2472.field4881 - 1 << 6);
                            for (int var44 = 0; var44 < class402.field6044; var44++) {
                                class167 var51 = class193.field2821[class378.field5766[var44]];
                                if (var51 != null && class317.field4559 != var51.field1974 && var41 != var51 && var51.field1990) {
                                    int var52 = var51.field1763 - (var51.field2472.field4881 - 1 << 6);
                                    int var53 = var51.field1769 - (var51.field2472.field4881 - 1 << 6);
                                    if (var42 <= var52 && var41.field2472.field4881 - (var52 - var42 >> 7) >= var51.field2472.field4881 && var53 >= var43 && var41.field2472.field4881 - (var53 - var43 >> 7) >= var51.field2472.field4881) {
                                        class519.method3066(class500.field7365.field1768 != var26.field6110, var51, 111);
                                        var51.field1974 = class317.field4559;
                                    }
                                }
                            }
                            int var45 = class74.field1105;
                            int[] var46 = class272.field3948;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class239 var48 = class44.field707[var46[var47]];
                                if (var48 != null && class317.field4559 != var48.field1974 && var48.field1990) {
                                    int var49 = var48.field1763 - (var48.method847(-1) - 1 << 6);
                                    int var50 = var48.field1769 - (var48.method847(-1) - 1 << 6);
                                    if (var49 >= var42 && var48.method847(-1) <= var41.field2472.field4881 - (var49 - var42 >> 7) && var50 >= var43 && var48.method847(-1) <= var41.field2472.field4881 - (var50 - var43 >> 7)) {
                                        class340.method2078(112, var48, class500.field7365.field1768 != var26.field6110);
                                        var48.field1974 = class317.field4559;
                                    }
                                }
                            }
                        }
                        if (class317.field4559 == var41.field1974) {
                            continue;
                        }
                        class519.method3066(class500.field7365.field1768 != var26.field6110, var41, 91);
                        var41.field1974 = class317.field4559;
                    }
                }
                if (var26.field6109 instanceof class200) {
                    class84 var54 = (class84) class176.field2591.method2605(false, (long) (var26.field6117 | var26.field6110 << 28 | var26.field6112 << 14));
                    if (var54 != null) {
                        for (class237 var55 = (class237) var54.field1291.method818(!arg3); var55 != null; var55 = (class237) var54.field1291.method814(-42)) {
                            class339 var56 = class294.field4196.method453(0, var55.field3491);
                            if (!class61.field932) {
                                if (class500.field7365.field1768 == var26.field6110) {
                                    String[] var57 = var56.field4810;
                                    for (int var58 = 4; var58 >= 0; var58--) {
                                        if (var57 != null && var57[var58] != null) {
                                            byte var59 = 0;
                                            if (var58 == 0) {
                                                var59 = 58;
                                            }
                                            int var60 = class413.field6213;
                                            if (var58 == 1) {
                                                var59 = 22;
                                            }
                                            if (var58 == 2) {
                                                var59 = 20;
                                            }
                                            if (var58 == 3) {
                                                var59 = 50;
                                            }
                                            if (var58 == 4) {
                                                var59 = 2;
                                            }
                                            if (var56.field4798 == var58) {
                                                var60 = var56.field4838;
                                            }
                                            if (var56.field4833 == var58) {
                                                var60 = var56.field4793;
                                            }
                                            class496.method2976(false, var26.field6117, (long) var55.field3491, "<col=ff9040>" + var56.field4796, var60, true, var57[var58], -1, -112, var26.field6112, var59);
                                            class229.field3418++;
                                        }
                                    }
                                }
                                class289.field4148++;
                                class496.method2976(class500.field7365.field1768 != var26.field6110, var26.field6117, (long) var55.field3491, "<col=ff9040>" + var56.field4796, class122.field1847, true, class400.field5993.method2838(false, class143.field2137), -1, -122, var26.field6112, 1004);
                            } else if (class500.field7365.field1768 == var26.field6110) {
                                class83 var61 = class515.field7518 == -1 ? null : class381.field5778.method506(true, class515.field7518);
                                if ((class217.field3177 & 0x1) != 0 && (var61 == null || var56.method2075((byte) -68, class515.field7518, var61.field1284) != var61.field1284)) {
                                    class496.method2976(false, var26.field6117, (long) var55.field3491, class187.field2779 + " -> <col=ff9040>" + var56.field4796, class213.field3114, true, class509.field7432, -1, -117, var26.field6112, 12);
                                    class168.field2492++;
                                }
                            }
                        }
                    }
                }
                if (var26.field6109 instanceof class351) {
                    class351 var62 = (class351) var26.field6109;
                    class519 var63 = class252.field3743.method2686(var62.method20(-30685), (byte) 114);
                    if (var63.field7596 != null) {
                        var63 = var63.method3067(class49.field796, -13012);
                    }
                    if (var63 != null) {
                        if (!class61.field932) {
                            if (class500.field7365.field1768 == var26.field6110) {
                                String[] var64 = var63.field7612;
                                if (var64 != null) {
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        if (var64[var65] != null) {
                                            short var66 = 0;
                                            int var67 = class413.field6213;
                                            if (var65 == 0) {
                                                var66 = 57;
                                            }
                                            if (var65 == 1) {
                                                var66 = 16;
                                            }
                                            if (var65 == 2) {
                                                var66 = 13;
                                            }
                                            if (var65 == 3) {
                                                var66 = 8;
                                            }
                                            if (var63.field7661 == var65) {
                                                var67 = var63.field7616;
                                            }
                                            if (var65 == 4) {
                                                var66 = 1012;
                                            }
                                            if (var63.field7610 == var65) {
                                                var67 = var63.field7644;
                                            }
                                            class499.field7357++;
                                            class496.method2976(false, var26.field6117, class483.method2864(var26.field6117, var62, 781, var26.field6112), "<col=00ffff>" + var63.field7663, var67, true, var64[var65], -1, -125, var26.field6112, var66);
                                        }
                                    }
                                }
                            }
                            class496.method2976(class500.field7365.field1768 != var26.field6110, var26.field6117, (long) var63.field7580, "<col=00ffff>" + var63.field7663, class122.field1847, true, class400.field5993.method2838(false, class143.field2137), -1, -116, var26.field6112, 1006);
                            class494.field7316++;
                        } else if (class500.field7365.field1768 == var26.field6110) {
                            class83 var68 = class515.field7518 == -1 ? null : class381.field5778.method506(true, class515.field7518);
                            if ((class217.field3177 & 0x4) != 0 && (var68 == null || var63.method3063((byte) 71, var68.field1284, class515.field7518) != var68.field1284)) {
                                class504.field7386++;
                                class496.method2976(false, var26.field6117, class483.method2864(var26.field6117, var62, 781, var26.field6112), class187.field2779 + " -> <col=00ffff>" + var63.field7663, class213.field3114, true, class509.field7432, -1, -117, var26.field6112, 18);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class361(Component arg0) {
        this.field5547 = arg0;
    }

    static {
        new class475("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field5552 = new class73(63, 6);
        field5555 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
        field5553 = new int[1];
    }
}
