import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class330 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Ltm;")
    public static class112 field4540 = new class112("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4542 = 999999;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lfc;")
    public static class343 field4544;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIILof;)V")
    public static final void method1969(int arg0, int arg1, int arg2, class367 arg3) {
        class406 var4 = class11.method105(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field5621 = arg3;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static final void method1970(int arg0) {
        if (class192.field2753 < 0) {
            class192.field2753 = 0;
            class266.field3706 = -1;
            class84.field1265 = -1;
        }
        if (arg0 != 8142) {
            method1971(false, -27, -119, (class406[][][]) null, 45, 12);
        }
        field4541++;
        if (class192.field2753 > class379.field5389) {
            class266.field3706 = -1;
            class192.field2753 = class379.field5389;
            class84.field1265 = -1;
        }
        if (class417.field5743 < 0) {
            class417.field5743 = 0;
            class84.field1265 = -1;
            class266.field3706 = -1;
        }
        if (class379.field5384 < class417.field5743) {
            class266.field3706 = -1;
            class417.field5743 = class379.field5384;
            class84.field1265 = -1;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZII[[[Lui;II)Z")
    public static final boolean method1971(boolean arg0, int arg1, int arg2, class406[][][] arg3, int arg4, int arg5) {
        field4543++;
        byte var6 = arg0 ? 1 : (byte) (class195.field2771 & 0xFF);
        if (class484.field6821[class76.field1161][arg4][arg5] == var6) {
            return false;
        } else if ((class205.field2947[class76.field1161][arg4][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg2 != 17291) {
                field4542 = -104;
            }
            class443.field6108[var7] = arg4;
            int var8 = 0;
            int var35 = var7 + 1;
            class487.field6862[var7] = arg5;
            class484.field6821[class76.field1161][arg4][arg5] = var6;
            while (var35 != var8) {
                int var9 = class443.field6108[var8] & 0xFFFF;
                int var10 = (class443.field6108[var8] & 0xFFCD02) >> 16;
                int var11 = class443.field6108[var8] >> 24 & 0xFF;
                int var12 = class487.field6862[var8] & 0xFFFF;
                int var13 = class487.field6862[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class205.field2947[class76.field1161][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class76.field1161 + 1; var16 <= 3; var16++) {
                    if ((class205.field2947[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field5617 != null) {
                                int var20 = class24.method213((byte) 78, var10);
                                if (arg3[var16][var9][var12].field5617.field6544 == var20 || arg3[var16][var9][var12].field5624 != null && arg3[var16][var9][var12].field5624.field6544 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class24.method213((byte) 78, var11);
                                    if (arg3[var16][var9][var12].field5617.field6544 == var21 || arg3[var16][var9][var12].field5624 != null && arg3[var16][var9][var12].field5624.field6544 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class24.method213((byte) 78, var13);
                                    if (arg3[var16][var9][var12].field5617.field6544 == var22 || arg3[var16][var9][var12].field5624 != null && arg3[var16][var9][var12].field5624.field6544 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class406 var23 = arg3[var16][var9][var12];
                            if (var23.field5613 != null) {
                                for (class146 var24 = var23.field5613; var24 != null; var24 = var24.field2066) {
                                    class478 var25 = var24.field2062;
                                    if (var25 instanceof class278) {
                                        class278 var26 = (class278) var25;
                                        int var27 = var26.method219(-17942);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method215(-11524);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class406 var30 = arg3[var16][var9][var12];
                        if (var30 != null && var30.field5613 != null) {
                            for (class146 var31 = var30.field5613; var31 != null; var31 = var31.field2066) {
                                class478 var32 = var31.field2062;
                                if (var32.field6753 != var32.field6751 || var32.field6749 != var32.field6747) {
                                    for (int var33 = var32.field6753; var33 <= var32.field6751; var33++) {
                                        for (int var34 = var32.field6747; var34 <= var32.field6749; var34++) {
                                            class484.field6821[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class484.field6821[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class317.field4306[class76.field1161 + 1].method710(var9, var12);
                    if (class435.field5976[arg1] < var17) {
                        class435.field5976[arg1] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (var18 < class440.field6042[arg1]) {
                        class440.field6042[arg1] = var18;
                    } else if (class280.field3862[arg1] < var18) {
                        class280.field3862[arg1] = var18;
                    }
                    if (class488.field6888[arg1] > var19) {
                        class488.field6888[arg1] = var19;
                    } else if (class99.field1405[arg1] < var19) {
                        class99.field1405[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class484.field6821[class76.field1161][var9 - 1][var12] != var6) {
                        class443.field6108[var35] = class366.method2215(-754974720, class366.method2215(1179648, var9 - 1));
                        class487.field6862[var35] = class366.method2215(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class484.field6821[class76.field1161][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class422.field5811) {
                        if ((var9 - 1) >= 0 && class484.field6821[class76.field1161][var9 - 1][var12] != var6 && (class205.field2947[class76.field1161][var9][var12] & 0x4) == 0 && (class205.field2947[class76.field1161][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class443.field6108[var35] = class366.method2215(class366.method2215(var9 - 1, 1179648), 1375731712);
                            class487.field6862[var35] = class366.method2215(1245184, var12);
                            class484.field6821[class76.field1161][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class484.field6821[class76.field1161][var9][var12] != var6) {
                            class443.field6108[var35] = class366.method2215(318767104, class366.method2215(5373952, var9));
                            class487.field6862[var35] = class366.method2215(var12, 5439488);
                            class484.field6821[class76.field1161][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class200.field2875 > (var9 + 1) && class484.field6821[class76.field1161][var9 + 1][var12] != var6 && (class205.field2947[class76.field1161][var9][var12] & 0x4) == 0 && (class205.field2947[class76.field1161][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class443.field6108[var35] = class366.method2215(class366.method2215(5373952, var9 + 1), -1845493760);
                            class487.field6862[var35] = class366.method2215(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class484.field6821[class76.field1161][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class200.field2875 > var9 + 1 && class484.field6821[class76.field1161][var9 + 1][var12] != var6) {
                        class443.field6108[var35] = class366.method2215(class366.method2215(var9 + 1, 9568256), 1392508928);
                        class487.field6862[var35] = class366.method2215(var12, 9633792);
                        class484.field6821[class76.field1161][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class484.field6821[class76.field1161][var9 - 1][var12] != var6 && (class205.field2947[class76.field1161][var9][var12] & 0x4) == 0 && (class205.field2947[class76.field1161][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class443.field6108[var35] = class366.method2215(301989888, class366.method2215(var9 - 1, 13762560));
                            class487.field6862[var35] = class366.method2215(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class484.field6821[class76.field1161][var9 - 1][var12] = var6;
                        }
                        if (class484.field6821[class76.field1161][var9][var12] != var6) {
                            class443.field6108[var35] = class366.method2215(class366.method2215(var9, 13762560), -1828716544);
                            class487.field6862[var35] = class366.method2215(13828096, var12);
                            class484.field6821[class76.field1161][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class200.field2875 && class484.field6821[class76.field1161][var9 + 1][var12] != var6 && (class205.field2947[class76.field1161][var9][var12] & 0x4) == 0 && (class205.field2947[class76.field1161][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class443.field6108[var35] = class366.method2215(-771751936, class366.method2215(var9 + 1, 9568256));
                            class487.field6862[var35] = class366.method2215(var12, 9633792);
                            class484.field6821[class76.field1161][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class435.field5976[arg1] != -1000000) {
                class435.field5976[arg1] += 10;
                class440.field6042[arg1] -= 50;
                class280.field3862[arg1] += 50;
                class99.field1405[arg1] += 50;
                class488.field6888[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static void method1972(int arg0) {
        field4540 = null;
        field4544 = null;
        int var1 = 20 / ((-arg0 - 39) / 49);
    }
}
