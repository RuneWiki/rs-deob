import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class132 {

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Ljv;")
    public static class55 field2081 = new class55(20);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lgf;ZLqa;)I")
    public static final int method982(class180 arg0, boolean arg1, class162 arg2) {
        field2078++;
        if (arg0.field2715 != -1) {
            return arg0.field2715;
        }
        if (arg0.field2723 != -1) {
            class83 var3 = arg2.field2501.method956(-945, arg2.method224() ? arg0.field2723 : arg0.field2722);
            if (!var3.field1427) {
                return var3.field1432;
            }
        }
        return arg1 ? arg0.field2716 : -7;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method983(int arg0) {
        if (arg0 != -1845) {
            method986(86, null, -61, (byte) 13, -122, 84);
        }
        field2081 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B[ILat;[I[I)V")
    public static final void method984(byte arg0, int[] arg1, class255 arg2, int[] arg3, int[] arg4) {
        int var5 = 0;
        if (arg0 > -74) {
            return;
        }
        while (var5 < arg4.length) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && arg2.field7592.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field7592[var9] = null;
                    } else {
                        class165 var10 = class431.field6419.method1137(-126, var6);
                        int var11 = var10.field2553;
                        class53 var12 = arg2.field7592[var9];
                        if (var12 != null) {
                            if (var12.field926 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field7592[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field927 = 0;
                                    var12.field922 = var8;
                                    var12.field921 = 0;
                                    var12.field925 = 1;
                                    var12.field923 = 0;
                                    class441.method2642((byte) 112, 0, var10, arg2.field6233, false, arg2.field6228, arg2.field6232);
                                } else if (var11 == 2) {
                                    var12.field921 = 0;
                                }
                            } else if (var10.field2558 >= class431.field6419.method1137(-103, var12.field926).field2558) {
                                var12 = arg2.field7592[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class53 var13 = arg2.field7592[var9] = new class53();
                            var13.field927 = 0;
                            var13.field926 = var6;
                            var13.field925 = 1;
                            var13.field922 = var8;
                            var13.field923 = 0;
                            var13.field921 = 0;
                            class441.method2642((byte) 49, 0, var10, arg2.field6233, false, arg2.field6228, arg2.field6232);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
        field2080++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I")
    public static final int method985(byte arg0) {
        field2079++;
        try {
            if (class431.field6416 == 0) {
                if (class61.field1071 > (class211.method1419(12921) - 5000L)) {
                    return 0;
                }
                class101.field1660 = class368.field5553.method1852(class503.field7420, class171.field2649, (byte) 38);
                class328.field4953 = class211.method1419(12921);
                class431.field6416 = 1;
            }
            if (class328.field4953 + 30000L < class211.method1419(12921)) {
                return class289.method1829(1000, (byte) 33);
            }
            if (class431.field6416 == 1) {
                if (class101.field1660.field4940 == 2) {
                    return class289.method1829(1001, (byte) 33);
                }
                if (class101.field1660.field4940 != 1) {
                    return -1;
                }
                class116.field1927 = new class187((Socket) class101.field1660.field4939, class368.field5553);
                class101.field1660 = null;
                int var1 = 0;
                class410.field6141.field2289 = 0;
                if (class206.field2985) {
                    var1 = class129.field2055;
                }
                class410.field6141.method1109(false, class339.field5136.field6139);
                class410.field6141.method1117(var1, (byte) 12);
                class116.field1927.method1304(class410.field6141.field2270, 0, class410.field6141.field2289, (byte) 111);
                class25.method313(false);
                int var2 = class116.field1927.method1309(118);
                class25.method313(false);
                if (var2 != 0) {
                    return class289.method1829(var2, (byte) 33);
                }
                class431.field6416 = 2;
            }
            if (class431.field6416 == 2) {
                if (class116.field1927.method1308(14971) < 2) {
                    return -1;
                }
                class372.field5655 = class116.field1927.method1309(120);
                class372.field5655 <<= 0x8;
                class372.field5655 += class116.field1927.method1309(123);
                class161.field2495 = new byte[class372.field5655];
                class431.field6416 = 3;
                class292.field4157 = 0;
            }
            if (class431.field6416 == 3) {
                int var3 = class116.field1927.method1308(14971);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > (class372.field5655 - class292.field4157)) {
                    var3 = class372.field5655 - class292.field4157;
                }
                class116.field1927.method1306(class292.field4157, 0, class161.field2495, var3);
                class292.field4157 += var3;
                if (class372.field5655 > class292.field4157) {
                    return -1;
                }
                if (!class397.method2449(class161.field2495, (byte) -99)) {
                    return class289.method1829(1002, (byte) 33);
                }
                class403.field6057 = new class89[class406.field6099];
                int var4 = 0;
                for (int var5 = class3.field97; var5 <= class391.field5915; var5++) {
                    class89 var6 = class329.method2116(var5, (byte) 60);
                    if (var6 != null) {
                        class403.field6057[var4++] = var6;
                    }
                }
                class261.field3797 = null;
                class305.field4650 = 0;
                class116.field1927.method1305((byte) -62);
                class431.field6416 = 0;
                class161.field2495 = null;
                class116.field1927 = null;
                class275.field3977 = 0;
                class61.field1071 = class211.method1419(12921);
                return 0;
            }
        } catch (IOException var7) {
            return class289.method1829(1003, (byte) 33);
        }
        return arg0 > -30 ? -23 : -1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method986(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class183.field2743++;
        class68.field1179 = 0;
        for (int var6 = class11.field196; var6 < class190.field2830; var6++) {
            class429[][] var17 = class380.field5761[var6];
            for (int var18 = class451.field6738; var18 < class1.field2; var18++) {
                for (int var19 = class363.field5501; var19 < class252.field3602; var19++) {
                    class429 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class62.field1078[var18 + class369.field5579 - class267.field3846][var19 + class369.field5579 - class388.field5834] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field6371 = true;
                            var20.field6377 = true;
                            if (var20.field6364 == null) {
                                var20.field6383 = false;
                            } else {
                                var20.field6383 = true;
                            }
                            class68.field1179++;
                        } else {
                            var20.field6371 = false;
                            var20.field6377 = false;
                            var20.field6369 = 0;
                            if (var18 >= class267.field3846 - 16 && var18 <= class267.field3846 + 16 && var19 >= class388.field5834 - 16 && var19 <= class388.field5834 + 16 && (var20.field6370 != null || var20.field6365 != null || var20.field6380 != null || var20.field6367 != null || var20.field6366 != null || var20.field6364 != null)) {
                                class318.field4777.method324((byte) 36, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class88.field1546 == class335.field5061;
        for (int var8 = class11.field196; var8 < class190.field2830; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class95.field1609.method224() && var8 >= arg2 && arg1 != null) {
                int var10 = class62.field1078.length;
                if (class62.field1078.length + class451.field6738 > class151.field2408) {
                    var10 -= class62.field1078.length + class451.field6738 - class151.field2408;
                }
                int var11 = class62.field1078[0].length;
                if (class62.field1078[0].length + class363.field5501 > class261.field3792) {
                    var11 -= class62.field1078[0].length + class363.field5501 - class261.field3792;
                }
                int var12 = class345.field5181;
                while (true) {
                    if (var12 >= var10) {
                        class318.field4777.method333(var9, true, var8, class88.field1546[var8], (byte) -124);
                        break;
                    }
                    int var13 = class451.field6738 + var12 - class345.field5181;
                    for (int var14 = class291.field4150; var14 < var11; var14++) {
                        class20.field352[var12][var14] = false;
                        if (class62.field1078[var12][var14]) {
                            int var15 = class363.field5501 + var14 - class291.field4150;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class380.field5761[var16][var13][var15] != null && class380.field5761[var16][var13][var15].field6368 == var8) {
                                    class20.field352[var12][var14] = class380.field5761[var16][var13][var15].field6371;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class318.field4777.method333(var9, false, var8, class88.field1546[var8], (byte) -121);
            }
            class318.field4777.method329((byte) 127);
        }
        if (!class466.method2767(true)) {
            class466.method2767(false);
        }
    }
}
