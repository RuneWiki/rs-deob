import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class704 {

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "Ldg;")
    public static class376 field9913 = new class376(55, -1);

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "F")
    public static float field9915;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "Lmea;")
    public static class393 field9916;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "[I")
    public static int[] field9914;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
    public static void method3920(byte arg0) {
        field9914 = null;
        if (arg0 >= -70) {
            field9914 = null;
        }
        field9916 = null;
        field9913 = null;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z[[[BIB)V")
    public static final void method3921(boolean arg0, byte[][][] arg1, int arg2, byte arg3) {
        int var4 = arg0 ? 1 : 0;
        class224.field3157 = 0;
        class460.field6580 = 0;
        class295.field4328++;
        for (int var5 = 0; var5 < class313.field4626[var4]; var5++) {
            if (!class285.method1836(class496.field7034[var4][var5], arg0, arg1, arg2, arg3)) {
                class441.method2614(class496.field7034[var4][var5]);
                if (class496.field7034[var4][var5].field3026 != -1) {
                    class286.field4268[class224.field3157++] = class496.field7034[var4][var5];
                }
            }
        }
        for (int var6 = 0; var6 < class59.field1130[var4]; var6++) {
            if (!class285.method1836(class232.field3618[var4][var6], arg0, arg1, arg2, arg3)) {
                class441.method2614(class232.field3618[var4][var6]);
                if (class232.field3618[var4][var6].field3026 != -1) {
                    class527.field7418[class460.field6580++] = class232.field3618[var4][var6];
                }
            }
        }
        for (int var7 = 0; var7 < class127.field1896[var4]; var7++) {
            if (!class285.method1836(class471.field6741[var4][var7], arg0, arg1, arg2, arg3)) {
                if (class471.field6741[var4][var7].method1184(-72)) {
                    class441.method2614(class471.field6741[var4][var7]);
                    if (class471.field6741[var4][var7].field3026 != -1) {
                        class527.field7418[class460.field6580++] = class471.field6741[var4][var7];
                    }
                } else {
                    class441.method2614(class471.field6741[var4][var7]);
                    if (class471.field6741[var4][var7].field3026 != -1) {
                        class286.field4268[class224.field3157++] = class471.field6741[var4][var7];
                    }
                }
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < class282.field4237; var8++) {
                if (!class285.method1836(class518.field7307[var8], arg0, arg1, arg2, arg3)) {
                    class441.method2614(class518.field7307[var8]);
                    if (class518.field7307[var8].field3026 != -1) {
                        if (class518.field7307[var8].method1184(124)) {
                            class527.field7418[class460.field6580++] = class518.field7307[var8];
                        } else {
                            class286.field4268[class224.field3157++] = class518.field7307[var8];
                        }
                    }
                }
            }
        }
        if (class224.field3157 > 0) {
            class312.method1980(class286.field4268, 0, class224.field3157 - 1);
            for (int var9 = 0; var9 < class224.field3157; var9++) {
                class187.method1265(class286.field4268[var9], true);
            }
        }
        if (class443.field6452) {
            class682.field9618.method134(0, null);
        }
        for (int var10 = class293.field4322; var10 < class41.field685; var10++) {
            if (var10 < arg2 || arg1 == null) {
                int var21 = class260.field3949.length;
                if (class260.field3949.length + class39.field645 > class302.field4492) {
                    var21 -= class260.field3949.length + class39.field645 - class302.field4492;
                }
                int var22 = class260.field3949[0].length;
                if (class260.field3949[0].length + class112.field1694 > class8.field82) {
                    var22 -= class260.field3949[0].length + class112.field1694 - class8.field82;
                }
                boolean[][] var23 = class535.field7505;
                if (class539.field7551) {
                    if (class520.field7337) {
                        var23 = class691.field9724[var10];
                    }
                    for (int var24 = class88.field1478; var24 < var21; var24++) {
                        int var25 = class39.field645 + var24 - class88.field1478;
                        for (int var26 = class344.field5034; var26 < var22; var26++) {
                            if (class260.field3949[var24][var26] && !class252.method1682(var10, var25, (byte) 7, class112.field1694 + var26 - class344.field5034)) {
                                var23[var24][var26] = true;
                            } else {
                                var23[var24][var26] = false;
                            }
                        }
                    }
                }
                if (class520.field7337) {
                    class296.field4340[var10].method445(0, 0, 0, null, false);
                    for (int var27 = 0; var27 < class179.field2550; var27++) {
                        class295.field4329[var27].method3205(new class484(var10 + 1), (byte) -91);
                    }
                } else if (class524.field7404) {
                    class296.field4340[var10].method443(class435.field6354, class612.field8575, class196.field2802, class535.field7505, true, class139.field2047);
                } else {
                    class296.field4340[var10].method445(class435.field6354, class612.field8575, class196.field2802, class535.field7505, true);
                }
            } else {
                int var12 = class260.field3949.length;
                if (class260.field3949.length + class39.field645 > class302.field4492) {
                    var12 -= class260.field3949.length + class39.field645 - class302.field4492;
                }
                int var13 = class260.field3949[0].length;
                if (class260.field3949[0].length + class112.field1694 > class8.field82) {
                    var13 -= class260.field3949[0].length + class112.field1694 - class8.field82;
                }
                boolean[][] var14 = class535.field7505;
                if (class539.field7551) {
                    if (class520.field7337) {
                        var14 = class691.field9724[var10];
                    }
                    for (int var15 = class88.field1478; var15 < var12; var15++) {
                        int var16 = class39.field645 + var15 - class88.field1478;
                        for (int var17 = class344.field5034; var17 < var13; var17++) {
                            var14[var15][var17] = false;
                            if (class260.field3949[var15][var17]) {
                                int var18 = class112.field1694 + var17 - class344.field5034;
                                for (int var19 = var10; var19 >= 0; var19--) {
                                    if (class153.field2210[var19][var16][var18] != null && class153.field2210[var19][var16][var18].field672 == var10) {
                                        if ((var19 < arg2 || arg1[var19][var16][var18] != arg3) && !class252.method1682(var10, var16, (byte) 7, var18)) {
                                            var14[var15][var17] = true;
                                            break;
                                        }
                                        var14[var15][var17] = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class520.field7337) {
                    class296.field4340[var10].method445(0, 0, 0, null, false);
                    for (int var20 = 0; var20 < class179.field2550; var20++) {
                        class295.field4329[var20].method3205(new class484(var10 + 1), (byte) -103);
                    }
                } else if (class524.field7404) {
                    class296.field4340[var10].method443(class435.field6354, class612.field8575, class196.field2802, class535.field7505, false, class139.field2047);
                } else {
                    class296.field4340[var10].method445(class435.field6354, class612.field8575, class196.field2802, class535.field7505, false);
                }
            }
        }
        if (class460.field6580 > 0) {
            class148.method1057(class527.field7418, 0, class460.field6580 - 1);
            for (int var11 = 0; var11 < class460.field6580; var11++) {
                class187.method1265(class527.field7418[var11], true);
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIII)V")
    public static final void method3922(int arg0, int arg1, int arg2, int arg3) {
        field9917++;
        class191 var4 = class6.method38(11, -74, arg3);
        var4.method1285((byte) -1);
        var4.field2754 = arg1;
        if (arg2 <= 36) {
            method3920((byte) 120);
        }
        var4.field2760 = arg0;
    }
}
