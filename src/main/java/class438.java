import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class438 {

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Lbd;")
    public static class44 field6235 = new class44("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "Lrj;")
    public static class430 field6237 = new class430("LIVE", 0);

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Lqv;")
    public static class316 field6238 = new class316(81, 8);

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public static void method2576(int arg0) {
        field6238 = null;
        field6235 = null;
        if (arg0 > -5) {
            method2577(-81, null, (byte) -18, true, -72, 105);
        }
        field6237 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I[[[Lmm;BZII)Z")
    public static final boolean method2577(int arg0, class188[][][] arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        int var6 = -85 / ((arg2 + 74) / 32);
        field6236++;
        byte var7 = arg3 ? 1 : (byte) (class110.field1635 & 0xFF);
        if (class386.field5507[class123.field1944][arg5][arg4] == var7) {
            return false;
        } else if ((class234.field3497[class123.field1944][arg5][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var8 = 0;
            class10.field99[var8] = arg5;
            int var9 = 0;
            int var36 = var8 + 1;
            class213.field3205[var8] = arg4;
            class386.field5507[class123.field1944][arg5][arg4] = var7;
            while (var36 != var9) {
                int var10 = class10.field99[var9] & 0xFFFF;
                int var11 = (class10.field99[var9] & 0xFFC874) >> 16;
                int var12 = class10.field99[var9] >> 24 & 0xFF;
                int var13 = class213.field3205[var9] & 0xFFFF;
                int var14 = class213.field3205[var9] >> 16 & 0xFF;
                var9 = var9 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class234.field3497[class123.field1944][var10][var13] & 0x4) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                label233: for (int var17 = class123.field1944 + 1; var17 <= 3; var17++) {
                    if ((class234.field3497[var17][var10][var13] & 0x8) == 0) {
                        if (var15 && arg1[var17][var10][var13] != null) {
                            if (arg1[var17][var10][var13].field2764 != null) {
                                int var21 = class203.method1403(var11, -77);
                                if (arg1[var17][var10][var13].field2764.field6797 == var21 || arg1[var17][var10][var13].field2751 != null && arg1[var17][var10][var13].field2751.field6797 == var21) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var22 = class203.method1403(var12, -123);
                                    if (arg1[var17][var10][var13].field2764.field6797 == var22 || arg1[var17][var10][var13].field2751 != null && arg1[var17][var10][var13].field2751.field6797 == var22) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var23 = class203.method1403(var14, -123);
                                    if (arg1[var17][var10][var13].field2764.field6797 == var23 || arg1[var17][var10][var13].field2751 != null && arg1[var17][var10][var13].field2751.field6797 == var23) {
                                        continue;
                                    }
                                }
                            }
                            class188 var24 = arg1[var17][var10][var13];
                            if (var24.field2773 != null) {
                                for (class317 var25 = var24.field2773; var25 != null; var25 = var25.field4709) {
                                    class478 var26 = var25.field4711;
                                    if (var26 instanceof class534) {
                                        class534 var27 = (class534) var26;
                                        int var28 = var27.method559((byte) 62);
                                        int var29 = var27.method560(-29863);
                                        if (var28 == 21) {
                                            var28 = 19;
                                        }
                                        int var30 = var29 << 6 | var28;
                                        if (var11 == var30 || var12 != 0 && var12 == var30 || var14 != 0 && var14 == var30) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class188 var31 = arg1[var17][var10][var13];
                        if (var31 != null && var31.field2773 != null) {
                            for (class317 var32 = var31.field2773; var32 != null; var32 = var32.field4709) {
                                class478 var33 = var32.field4711;
                                if (var33.field6971 != var33.field6970 || var33.field6962 != var33.field6959) {
                                    for (int var34 = var33.field6971; var34 <= var33.field6970; var34++) {
                                        for (int var35 = var33.field6962; var35 <= var33.field6959; var35++) {
                                            class386.field5507[var17][var34][var35] = var7;
                                        }
                                    }
                                }
                            }
                        }
                        var16 = true;
                        class386.field5507[var17][var10][var13] = var7;
                    }
                }
                if (var16) {
                    int var18 = class146.field2262[class123.field1944 + 1].method156(var10, var13);
                    if (class485.field7032[arg0] < var18) {
                        class485.field7032[arg0] = var18;
                    }
                    int var19 = var10 << 7;
                    int var20 = var13 << 7;
                    if (var19 < class319.field4733[arg0]) {
                        class319.field4733[arg0] = var19;
                    } else if (class408.field5785[arg0] < var19) {
                        class408.field5785[arg0] = var19;
                    }
                    if (class477.field6944[arg0] > var20) {
                        class477.field6944[arg0] = var20;
                    } else if (class7.field51[arg0] < var20) {
                        class7.field51[arg0] = var20;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class386.field5507[class123.field1944][var10 - 1][var13] != var7) {
                        class10.field99[var36] = class442.method2600(-754974720, class442.method2600(1179648, var10 - 1));
                        class213.field3205[var36] = class442.method2600(var13, 1245184);
                        class386.field5507[class123.field1944][var10 - 1][var13] = var7;
                        var36 = var36 + 1 & 0xFFF;
                    }
                    var13++;
                    if (var13 < class255.field3763) {
                        if ((var10 - 1) >= 0 && class386.field5507[class123.field1944][var10 - 1][var13] != var7 && (class234.field3497[class123.field1944][var10][var13] & 0x4) == 0 && (class234.field3497[class123.field1944][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class10.field99[var36] = class442.method2600(class442.method2600(var10 - 1, 1179648), 1375731712);
                            class213.field3205[var36] = class442.method2600(var13, 1245184);
                            class386.field5507[class123.field1944][var10 - 1][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class386.field5507[class123.field1944][var10][var13] != var7) {
                            class10.field99[var36] = class442.method2600(318767104, class442.method2600(5373952, var10));
                            class213.field3205[var36] = class442.method2600(var13, 5439488);
                            var36 = var36 + 1 & 0xFFF;
                            class386.field5507[class123.field1944][var10][var13] = var7;
                        }
                        if ((var10 + 1) < class69.field1139 && class386.field5507[class123.field1944][var10 + 1][var13] != var7 && (class234.field3497[class123.field1944][var10][var13] & 0x4) == 0 && (class234.field3497[class123.field1944][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class10.field99[var36] = class442.method2600(class442.method2600(var10 + 1, 5373952), -1845493760);
                            class213.field3205[var36] = class442.method2600(5439488, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class386.field5507[class123.field1944][var10 + 1][var13] = var7;
                        }
                    }
                    var13--;
                    if (class69.field1139 > (var10 + 1) && class386.field5507[class123.field1944][var10 + 1][var13] != var7) {
                        class10.field99[var36] = class442.method2600(1392508928, class442.method2600(var10 + 1, 9568256));
                        class213.field3205[var36] = class442.method2600(var13, 9633792);
                        class386.field5507[class123.field1944][var10 + 1][var13] = var7;
                        var36 = var36 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var10 - 1 >= 0 && class386.field5507[class123.field1944][var10 - 1][var13] != var7 && (class234.field3497[class123.field1944][var10][var13] & 0x4) == 0 && (class234.field3497[class123.field1944][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class10.field99[var36] = class442.method2600(301989888, class442.method2600(var10 - 1, 13762560));
                            class213.field3205[var36] = class442.method2600(13828096, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class386.field5507[class123.field1944][var10 - 1][var13] = var7;
                        }
                        if (class386.field5507[class123.field1944][var10][var13] != var7) {
                            class10.field99[var36] = class442.method2600(-1828716544, class442.method2600(var10, 13762560));
                            class213.field3205[var36] = class442.method2600(var13, 13828096);
                            var36 = var36 + 1 & 0xFFF;
                            class386.field5507[class123.field1944][var10][var13] = var7;
                        }
                        if (var10 + 1 < class69.field1139 && class386.field5507[class123.field1944][var10 + 1][var13] != var7 && (class234.field3497[class123.field1944][var10][var13] & 0x4) == 0 && (class234.field3497[class123.field1944][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class10.field99[var36] = class442.method2600(-771751936, class442.method2600(var10 + 1, 9568256));
                            class213.field3205[var36] = class442.method2600(9633792, var13);
                            class386.field5507[class123.field1944][var10 + 1][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class485.field7032[arg0] != -1000000) {
                class485.field7032[arg0] += 10;
                class319.field4733[arg0] -= 50;
                class408.field5785[arg0] += 50;
                class7.field51[arg0] += 50;
                class477.field6944[arg0] -= 50;
            }
            return true;
        }
    }
}
