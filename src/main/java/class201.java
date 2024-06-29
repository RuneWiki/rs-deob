import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class201 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field2837 = 1;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)Lbb;", line = 8)
    public static final class218 method1251(int arg0, byte arg1) {
        field2832++;
        if (arg1 >= -97) {
            field2837 = -49;
        }
        class218 var2 = (class218) class358.field5225.method1073((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class521.field7727.method727(arg0, 0, 101);
        class218 var4 = new class218();
        if (var3 != null) {
            var4.method1350(new class391(var3), arg0, (byte) 111);
        }
        class358.field5225.method1072((long) arg0, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BIZII[[[Lhg;)Z", line = 35)
    public static final boolean method1252(byte arg0, int arg1, boolean arg2, int arg3, int arg4, class486[][][] arg5) {
        field2836++;
        byte var6 = arg2 ? 1 : (byte) (class168.field2517 & 0xFF);
        if (class475.field6931[class436.field6379][arg4][arg3] == var6) {
            return false;
        } else if ((class267.field3700[class436.field6379][arg4][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class382.field5579[var7] = arg4;
            int var35 = var7 + 1;
            class204.field2871[var7] = arg3;
            class475.field6931[class436.field6379][arg4][arg3] = var6;
            while (var35 != var8) {
                int var9 = class382.field5579[var8] & 0xFFFF;
                int var10 = class382.field5579[var8] >> 16 & 0xFF;
                int var11 = class382.field5579[var8] >> 24 & 0xFF;
                int var12 = class204.field2871[var8] & 0xFFFF;
                int var13 = class204.field2871[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class267.field3700[class436.field6379][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class436.field6379 + 1; var16 <= 3; var16++) {
                    if ((class267.field3700[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field7114 != null) {
                                int var20 = class348.method2060((byte) 124, var10);
                                if (arg5[var16][var9][var12].field7114.field1315 == var20 || arg5[var16][var9][var12].field7118 != null && arg5[var16][var9][var12].field7118.field1315 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class348.method2060((byte) 127, var11);
                                    if (arg5[var16][var9][var12].field7114.field1315 == var21 || arg5[var16][var9][var12].field7118 != null && arg5[var16][var9][var12].field7118.field1315 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class348.method2060((byte) 124, var13);
                                    if (arg5[var16][var9][var12].field7114.field1315 == var22 || arg5[var16][var9][var12].field7118 != null && arg5[var16][var9][var12].field7118.field1315 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class486 var23 = arg5[var16][var9][var12];
                            if (var23.field7115 != null) {
                                for (class164 var24 = var23.field7115; var24 != null; var24 = var24.field2467) {
                                    class116 var25 = var24.field2468;
                                    if (var25 instanceof class503) {
                                        class503 var26 = (class503) var25;
                                        int var27 = var26.method496(87);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method499(-15561);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class486 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field7115 != null) {
                            for (class164 var31 = var30.field7115; var31 != null; var31 = var31.field2467) {
                                class116 var32 = var31.field2468;
                                if (var32.field1736 != var32.field1729 || var32.field1742 != var32.field1730) {
                                    for (int var33 = var32.field1729; var33 <= var32.field1736; var33++) {
                                        for (int var34 = var32.field1730; var34 <= var32.field1742; var34++) {
                                            class475.field6931[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class475.field6931[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class211.field2950[class436.field6379 + 1].method351(var9, var12);
                    if (class485.field7092[arg1] < var17) {
                        class485.field7092[arg1] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (class172.field2563[arg1] > var18) {
                        class172.field2563[arg1] = var18;
                    } else if (class264.field3654[arg1] < var18) {
                        class264.field3654[arg1] = var18;
                    }
                    if (var19 < class195.field2782[arg1]) {
                        class195.field2782[arg1] = var19;
                    } else if (var19 > class115.field1727[arg1]) {
                        class115.field1727[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class475.field6931[class436.field6379][var9 - 1][var12] != var6) {
                        class382.field5579[var35] = class255.method1532(class255.method1532(1179648, var9 - 1), -754974720);
                        class204.field2871[var35] = class255.method1532(var12, 1245184);
                        class475.field6931[class436.field6379][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (class422.field6182 > var12) {
                        if (var9 - 1 >= 0 && class475.field6931[class436.field6379][var9 - 1][var12] != var6 && (class267.field3700[class436.field6379][var9][var12] & 0x4) == 0 && (class267.field3700[class436.field6379][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class382.field5579[var35] = class255.method1532(class255.method1532(var9 - 1, 1179648), 1375731712);
                            class204.field2871[var35] = class255.method1532(1245184, var12);
                            class475.field6931[class436.field6379][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class475.field6931[class436.field6379][var9][var12] != var6) {
                            class382.field5579[var35] = class255.method1532(class255.method1532(5373952, var9), 318767104);
                            class204.field2871[var35] = class255.method1532(5439488, var12);
                            class475.field6931[class436.field6379][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class527.field7799 && class475.field6931[class436.field6379][var9 + 1][var12] != var6 && (class267.field3700[class436.field6379][var9][var12] & 0x4) == 0 && (class267.field3700[class436.field6379][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class382.field5579[var35] = class255.method1532(-1845493760, class255.method1532(var9 + 1, 5373952));
                            class204.field2871[var35] = class255.method1532(var12, 5439488);
                            class475.field6931[class436.field6379][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class527.field7799 && class475.field6931[class436.field6379][var9 + 1][var12] != var6) {
                        class382.field5579[var35] = class255.method1532(1392508928, class255.method1532(9568256, var9 + 1));
                        class204.field2871[var35] = class255.method1532(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class475.field6931[class436.field6379][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class475.field6931[class436.field6379][var9 - 1][var12] != var6 && (class267.field3700[class436.field6379][var9][var12] & 0x4) == 0 && (class267.field3700[class436.field6379][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class382.field5579[var35] = class255.method1532(301989888, class255.method1532(var9 - 1, 13762560));
                            class204.field2871[var35] = class255.method1532(13828096, var12);
                            class475.field6931[class436.field6379][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class475.field6931[class436.field6379][var9][var12] != var6) {
                            class382.field5579[var35] = class255.method1532(class255.method1532(var9, 13762560), -1828716544);
                            class204.field2871[var35] = class255.method1532(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class475.field6931[class436.field6379][var9][var12] = var6;
                        }
                        if (class527.field7799 > var9 + 1 && class475.field6931[class436.field6379][var9 + 1][var12] != var6 && (class267.field3700[class436.field6379][var9][var12] & 0x4) == 0 && (class267.field3700[class436.field6379][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class382.field5579[var35] = class255.method1532(-771751936, class255.method1532(9568256, var9 + 1));
                            class204.field2871[var35] = class255.method1532(var12, 9633792);
                            class475.field6931[class436.field6379][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (arg0 > -92) {
                method1253((byte) -83);
            }
            if (class485.field7092[arg1] != -1000000) {
                class485.field7092[arg1] += 10;
                class172.field2563[arg1] -= 50;
                class264.field3654[arg1] += 50;
                class115.field1727[arg1] += 50;
                class195.field2782[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 357)
    public static final void method1253(byte arg0) {
        field2835++;
        if (class420.field6137) {
            return;
        }
        class463.field6805 = true;
        if (arg0 != -7) {
            field2837 = -120;
        }
        if (class20.field269.field7654) {
            class252.field3498 = ((int) class252.field3498 + 47 & 0xFFFFFFF0);
        } else {
            class187.field2712 += (12.0F - class187.field2712) / 2.0F;
        }
        class420.field6137 = true;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V", line = 382)
    public static final void method1254(boolean arg0, int arg1) {
        field2833++;
        if (arg1 < 121) {
            field2837 = -33;
        }
        while (class179.field2631.method1279(true, class422.field6187) >= 15) {
            int var2 = class179.field2631.method1282(-26364, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class378.field5533[var2] == null) {
                class378.field5533[var2] = new class502();
                class378.field5533[var2].field1035 = var2;
                var3 = true;
            }
            class502 var4 = class378.field5533[var2];
            class65.field899[class275.field3772++] = var2;
            var4.field1027 = class441.field6516;
            if (var4.field7387 != null && var4.field7387.method643((byte) 122)) {
                class347.method2052(var4, (byte) 54);
            }
            int var5;
            if (arg0) {
                var5 = class179.field2631.method1282(-26364, 8);
                if (var5 > 127) {
                    var5 -= 256;
                }
            } else {
                var5 = class179.field2631.method1282(-26364, 5);
                if (var5 > 15) {
                    var5 -= 32;
                }
            }
            int var6;
            if (arg0) {
                var6 = class179.field2631.method1282(-26364, 8);
                if (var6 > 127) {
                    var6 -= 256;
                }
            } else {
                var6 = class179.field2631.method1282(-26364, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
            }
            var4.method2939(112, class158.field2401.method2208(class179.field2631.method1282(-26364, 14), -99));
            int var7 = class179.field2631.method1282(-26364, 1);
            if (var7 == 1) {
                class435.field6374[class225.field3203++] = var2;
            }
            int var8 = class179.field2631.method1282(-26364, 3) + 4 << 11 & 0x3EEB;
            int var9 = class179.field2631.method1282(-26364, 2);
            int var10 = class179.field2631.method1282(-26364, 1);
            var4.method620(12, var4.field7387.field1168);
            var4.field1036 = var4.field7387.field1194 << 3;
            if (var4.field1036 == 0) {
                var4.method612((byte) 84, 0);
            } else if (var3) {
                var4.method612((byte) -17, var8);
            }
            var4.method2946(class316.field4324.field1127[0] + var5, class316.field4324.field1117[0] + var6, var10 == 1, var9, var4.method626((byte) 120), -117);
            if (var4.field7387.method643((byte) 114)) {
                class226.method1401(var4.field1127[0], null, var4.field1117[0], 0, 125, null, var4.field1738, var4);
            }
        }
        class179.field2631.method1276(113);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILvc;)I", line = 484)
    public static final int method1255(int arg0, class207 arg1) {
        field2834++;
        if (arg0 != 9568256) {
            method1253((byte) 115);
        }
        int var2 = arg1.method1282(-26364, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method1282(-26364, 5);
        } else if (var2 == 2) {
            var3 = arg1.method1282(-26364, 8);
        } else {
            var3 = arg1.method1282(-26364, 11);
        }
        return var3;
    }
}
