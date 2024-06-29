import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class197 {

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Lap;")
    public static class335 field2547 = new class335("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "Ldq;")
    public static class493 field2551 = new class493(49, 6);

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "Ldq;")
    public static class493 field2552 = new class493(37, 7);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static final void method1216(boolean arg0) {
        if (!arg0) {
            method1220(null, 59, null, null);
        }
        field2550++;
        for (class301 var1 = (class301) class529.field7799.method153(0); var1 != null; var1 = (class301) class529.field7799.method161(-78)) {
            class176 var2 = var1.field3872;
            if (class276.field3488 != var2.field2676 || class163.field2065 > var2.field2295) {
                var1.method2165(16225);
                var2.method1122(29236);
            } else if (var2.field2327 <= class163.field2065) {
                if (var2.field2302 > 0) {
                    class295 var3 = class187.field2446[var2.field2302 - 1];
                    if (var3 != null && var3.field2666 >= 0 && var3.field2666 < class452.field6526 * 128 && var3.field2677 >= 0 && (class440.field6307 * 128) > var3.field2677) {
                        var2.method1125(var3.field2666, class151.method991(var3.field2677, false, var2.field2676, var3.field2666) - var2.field2317, -69, class163.field2065, var3.field2677);
                    }
                }
                if (var2.field2302 < 0) {
                    int var4 = -var2.field2302 - 1;
                    class223 var5;
                    if (class66.field858 == var4) {
                        var5 = class23.field336;
                    } else {
                        var5 = class387.field5107[var4];
                    }
                    if (var5 != null && var5.field2666 >= 0 && class452.field6526 * 128 > var5.field2666 && var5.field2677 >= 0 && var5.field2677 < (class440.field6307 * 128)) {
                        var2.method1125(var5.field2666, class151.method991(var5.field2677, false, var2.field2676, var5.field2666) - var2.field2317, 68, class163.field2065, var5.field2677);
                    }
                }
                var2.method1121(class250.field3207, false);
                class361.method2076(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lhd;I)Z")
    public static final boolean method1217(class523 arg0, int arg1) {
        field2549++;
        if (arg1 != 250) {
            method1219(false);
        }
        if (class187.field2444 == arg0.field7650) {
            class280.field3572 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method1218(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class144.field1852++;
        class356.field4584 = 0;
        for (int var6 = class329.field4164; var6 < class524.field7753; var6++) {
            class490[][] var17 = class125.field1664[var6];
            for (int var18 = class253.field3235; var18 < class469.field6812; var18++) {
                for (int var19 = class205.field2680; var19 < class316.field4043; var19++) {
                    class490 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class38.field501[var18 + class230.field2929 - class255.field3246][var19 + class230.field2929 - class139.field1797] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field7142 = true;
                            var20.field7141 = true;
                            if (var20.field7127 == null) {
                                var20.field7128 = false;
                            } else {
                                var20.field7128 = true;
                            }
                            class356.field4584++;
                        } else {
                            var20.field7142 = false;
                            var20.field7141 = false;
                            var20.field7133 = 0;
                            if (var18 >= class255.field3246 - 16 && var18 <= class255.field3246 + 16 && var19 >= class139.field1797 - 16 && var19 <= class139.field1797 + 16 && (var20.field7126 != null || var20.field7130 != null || var20.field7138 != null || var20.field7137 != null || var20.field7131 != null || var20.field7127 != null)) {
                                class523.field7719.method1417(var20, 5000);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class520.field7520 == class140.field1808;
        for (int var8 = class329.field4164; var8 < class524.field7753; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class481.field7025.method322() && var8 >= arg2 && arg1 != null) {
                int var10 = class38.field501.length;
                if (class38.field501.length + class253.field3235 > class470.field6825) {
                    var10 -= class38.field501.length + class253.field3235 - class470.field6825;
                }
                int var11 = class38.field501[0].length;
                if (class38.field501[0].length + class205.field2680 > class105.field1336) {
                    var11 -= class38.field501[0].length + class205.field2680 - class105.field1336;
                }
                int var12 = class89.field1096;
                while (true) {
                    if (var12 >= var10) {
                        class523.field7719.method1414(class520.field7520[var8], var8, 12214, var9, true);
                        break;
                    }
                    int var13 = class253.field3235 + var12 - class89.field1096;
                    for (int var14 = class277.field3497; var14 < var11; var14++) {
                        class473.field6847[var12][var14] = false;
                        if (class38.field501[var12][var14]) {
                            int var15 = class205.field2680 + var14 - class277.field3497;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class125.field1664[var16][var13][var15] != null && class125.field1664[var16][var13][var15].field7140 == var8) {
                                    class473.field6847[var12][var14] = class125.field1664[var16][var13][var15].field7142;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class523.field7719.method1414(class520.field7520[var8], var8, 12214, var9, false);
            }
            class523.field7719.method1422(255);
        }
        if (!class363.method2083(true)) {
            class363.method2083(false);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(Z)V")
    public static void method1219(boolean arg0) {
        field2547 = null;
        field2551 = null;
        field2552 = null;
        if (!arg0) {
            method1218(-30, null, -72, (byte) -35, 116, -100);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lqn;ILya;Lqn;)V")
    public static final void method1220(class47 arg0, int arg1, class38 arg2, class47 arg3) {
        field2548++;
        class209.field2708 = class21.method177(0, (byte) 100, arg0, class76.field986);
        if (arg1 != -18577) {
            method1219(true);
        }
        class143.field1843 = arg2.method300(class209.field2708, class311.method1819(arg3, class76.field986, 0), true);
        class159.field2030 = class21.method177(0, (byte) 100, arg0, class323.field4103);
        class460.field6579 = arg2.method300(class159.field2030, class311.method1819(arg3, class323.field4103, 0), true);
        class274.field3437 = class21.method177(0, (byte) 100, arg0, class520.field7519);
        class91.field1116 = arg2.method300(class274.field3437, class311.method1819(arg3, class520.field7519, 0), true);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
    public static final void method1221(int arg0, int arg1, int arg2) {
        if (class165.field2105 == 1) {
            class249.method1510(class533.field7844, arg2, (byte) 2, arg1);
        } else if (class165.field2105 == 2) {
            class324.method1898((byte) 37, arg2, arg1);
        }
        field2546++;
        if (arg0 >= -117) {
            method1217(null, -106);
        }
        class165.field2105 = 0;
        class533.field7844 = null;
    }
}
