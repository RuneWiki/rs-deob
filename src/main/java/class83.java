import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class83 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Ljl;")
    public static class391 field1358 = new class391();

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Ljj;")
    public static class156 field1359 = new class156(512);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
    public static int[] field1361 = new int[50];

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1362 = 0;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lfg;")
    public static class18 field1360 = new class18(64);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILja;Lnc;ZI[Lc;)V", line = 3)
    public static final void method641(int arg0, class90 arg1, class126 arg2, boolean arg3, int arg4, class158[] arg5) {
        field1357++;
        if (!arg3) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class183.field2703; var7++) {
                    for (int var8 = 0; var8 < class66.field1056; var8++) {
                        if ((class278.field4176[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class278.field4176[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg5[var9].method1240(var7, var8, false);
                            }
                        }
                    }
                }
            }
        }
        int[][] var10 = new int[class183.field2703][class66.field1056];
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var14 = 0; var14 < class66.field1056; var14++) {
                class60.field962[var14] = 0;
                class144.field2252[var14] = 0;
                class444.field6463[var14] = 0;
                class356.field5063[var14] = 0;
                class66.field1079[var14] = 0;
            }
            for (int var15 = -5; var15 < class183.field2703; var15++) {
                for (int var16 = 0; var16 < class66.field1056; var16++) {
                    int var25 = var15 + 5;
                    int var10002;
                    if (var25 < class183.field2703) {
                        int var26 = class375.field5316[var11][var25][var16] & 0xFF;
                        if (var26 > 0) {
                            class361 var27 = class199.method1514(var26 - 1, (byte) -42);
                            class60.field962[var16] += var27.field5144;
                            class144.field2252[var16] += var27.field5155;
                            class444.field6463[var16] += var27.field5146;
                            class356.field5063[var16] += var27.field5142;
                            var10002 = class66.field1079[var16]++;
                        }
                    }
                    int var28 = var15 - 5;
                    if (var28 >= 0) {
                        int var29 = class375.field5316[var11][var28][var16] & 0xFF;
                        if (var29 > 0) {
                            class361 var30 = class199.method1514(var29 - 1, (byte) -42);
                            class60.field962[var16] -= var30.field5144;
                            class144.field2252[var16] -= var30.field5155;
                            class444.field6463[var16] -= var30.field5146;
                            class356.field5063[var16] -= var30.field5142;
                            var10002 = class66.field1079[var16]--;
                        }
                    }
                }
                if (var15 >= 0) {
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    int var21 = 0;
                    for (int var22 = -5; var22 < class66.field1056; var22++) {
                        int var23 = var22 + 5;
                        if (var23 < class66.field1056) {
                            var19 += class444.field6463[var23];
                            var21 += class66.field1079[var23];
                            var17 += class60.field962[var23];
                            var18 += class144.field2252[var23];
                            var20 += class356.field5063[var23];
                        }
                        int var24 = var22 - 5;
                        if (var24 >= 0) {
                            var18 -= class144.field2252[var24];
                            var21 -= class66.field1079[var24];
                            var19 -= class444.field6463[var24];
                            var20 -= class356.field5063[var24];
                            var17 -= class60.field962[var24];
                        }
                        if (var22 >= 0 && var20 > 0 && var21 > 0) {
                            var10[var15][var22] = class180.method1410(var17 * 256 / var20, var18 / var21, var19 / var21, 13371);
                        }
                    }
                }
            }
            class180.method1409(class50.field816[var11], var11, class66.field1056, class383.field5481[var11], false, class375.field5316[var11], class182.field2691[var11], var10, class183.field2703, arg2, arg3, class275.field4140[var11], arg1);
            class375.field5316[var11] = null;
            class182.field2691[var11] = null;
            class275.field4140[var11] = null;
            class383.field5481[var11] = null;
        }
        if (!arg3) {
            if (class169.field2515) {
                class306.method2095();
            }
            if (class238.field3438 != 0) {
                class383.method2431();
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            class50.field816[var12].method796();
        }
        int var13 = 46 / ((arg4 + 23) / 53);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 216)
    public static final void method642(int arg0) {
        if (arg0 != 1718570920) {
            field1360 = null;
        }
        field1356++;
        for (int var1 = 0; var1 < class361.field5154; var1++) {
            int var10002 = class196.field2869[var1]--;
            if (class196.field2869[var1] >= -10) {
                class116 var3 = class225.field3325[var1];
                if (var3 == null) {
                    var3 = class116.method986(class176.field2622, class169.field2516[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class196.field2869[var1] += var3.method988();
                    class225.field3325[var1] = var3;
                }
                if (class196.field2869[var1] < 0) {
                    int var10;
                    if (class113.field1815[var1] == 0) {
                        var10 = class420.field6130[var1] * class242.field3530 >> 8;
                    } else {
                        int var4 = (class113.field1815[var1] & 0xFF) * 128;
                        int var5 = (class113.field1815[var1] & 0xFF82B1) >> 16;
                        int var6 = var5 * 128 + 64 - class86.field1394.field6520;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class113.field1815[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class86.field1394.field6519;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var9 > var4) {
                            class196.field2869[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = class420.field6130[var1] * class151.field2315 * (var4 - var9) / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class201 var11 = var3.method987().method1524(class416.field6016);
                        class24 var12 = class24.method202(var11, 100, var10);
                        var12.method184(class169.field2514[var1] - 1);
                        class220.field3275.method513(var12);
                    }
                    class196.field2869[var1] = -100;
                }
            } else {
                class361.field5154--;
                for (int var2 = var1; var2 < class361.field5154; var2++) {
                    class169.field2516[var2] = class169.field2516[var2 + 1];
                    class225.field3325[var2] = class225.field3325[var2 + 1];
                    class169.field2514[var2] = class169.field2514[var2 + 1];
                    class196.field2869[var2] = class196.field2869[var2 + 1];
                    class113.field1815[var2] = class113.field1815[var2 + 1];
                    class420.field6130[var2] = class420.field6130[var2 + 1];
                }
                var1--;
            }
        }
        if (class387.field5546 && !class199.method1516((byte) -84)) {
            if (class321.field4641 != 0 && class86.field1402 != -1) {
                class121.method1012((byte) 50, class321.field4641, false, class446.field6501, 0, class86.field1402);
            }
            class387.field5546 = false;
        } else if (class321.field4641 != 0 && class86.field1402 != -1 && !class199.method1516((byte) -84)) {
            class13.field216.method2781(false, 47);
            class380.field5386++;
            class13.field216.method275(class86.field1402, 1414495172);
            class86.field1402 = -1;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 352)
    public static void method643(int arg0) {
        field1360 = null;
        field1361 = null;
        if (arg0 == 0) {
            field1359 = null;
            field1358 = null;
        }
    }
}
