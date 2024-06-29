import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class358 {

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public int field4621 = 0;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Lhb;")
    public static class728 field4620;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLei;)I")
    public static final int method2074(boolean arg0, class180 arg1) {
        field4624++;
        int var2 = arg1.method1235(2, -4080);
        if (!arg0) {
            return 24;
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method1235(5, -4080);
        } else if (var2 == 2) {
            var3 = arg1.method1235(8, -4080);
        } else {
            var3 = arg1.method1235(11, -4080);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLsl;)V")
    public final void method2075(byte arg0, class461 arg1) {
        while (true) {
            int var3 = arg1.method2600((byte) -125);
            if (var3 == 0) {
                field4619++;
                if (arg0 < 25) {
                    method2078(-111);
                    return;
                }
                return;
            }
            this.method2076(arg1, var3, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lsl;IB)V")
    private final void method2076(class461 arg0, int arg1, byte arg2) {
        field4626++;
        if (arg1 == 5) {
            this.field4621 = arg0.method2566(arg2 ^ 0xE);
        }
        if (arg2 != -16) {
            this.field4621 = 24;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLjk;)V")
    public static final void method2077(byte arg0, class635 arg1) {
        field4622++;
        arg1.field8757 = null;
        int var2 = arg1.field8760.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field8760[var3].field4099 = false;
        }
        class23[] var4 = class429.field5740;
        synchronized (class429.field5740) {
            if (class429.field5740.length > var2 && class558.field7766[var2] < 200) {
                class429.field5740[var2].method166(-8839, arg1);
                int var10002 = class558.field7766[var2]++;
            }
            if (arg0 != -14) {
                method2074(true, null);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static void method2078(int arg0) {
        if (arg0 != -1) {
            method2077((byte) 92, null);
        }
        field4620 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([[[Lds;ZIIII)Z")
    public static final boolean method2079(class14[][][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4627++;
        byte var6 = arg1 ? 1 : (byte) (class762.field10618 & 0xFF);
        if (class232.field3052[class472.field6329][arg2][arg3] == var6) {
            return false;
        } else if ((class305.field4001[class472.field6329][arg2][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg5 != 5373952) {
                method2080(9);
            }
            class701.field9755[var7] = arg2;
            int var8 = 0;
            int var35 = var7 + 1;
            class347.field4447[var7] = arg3;
            class232.field3052[class472.field6329][arg2][arg3] = var6;
            while (var35 != var8) {
                int var9 = class701.field9755[var8] & 0xFFFF;
                int var10 = class701.field9755[var8] >> 16 & 0xFF;
                int var11 = class701.field9755[var8] >> 24 & 0xFF;
                int var12 = class347.field4447[var8] & 0xFFFF;
                int var13 = class347.field4447[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class305.field4001[class472.field6329][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg0 != null) {
                    label244: for (int var16 = class472.field6329 + 1; var16 <= 3; var16++) {
                        if (arg0[var16] != null && (class305.field4001[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg0[var16][var9][var12] != null) {
                                if (arg0[var16][var9][var12].field278 != null) {
                                    int var17 = class299.method1786(var10, (byte) 122);
                                    if (arg0[var16][var9][var12].field278.field4794 == var17 || arg0[var16][var9][var12].field283 != null && arg0[var16][var9][var12].field283.field4794 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class299.method1786(var11, (byte) 122);
                                        if (arg0[var16][var9][var12].field278.field4794 == var18 || arg0[var16][var9][var12].field283 != null && arg0[var16][var9][var12].field283.field4794 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class299.method1786(var13, (byte) 122);
                                        if (arg0[var16][var9][var12].field278.field4794 == var19 || arg0[var16][var9][var12].field283 != null && arg0[var16][var9][var12].field283.field4794 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class14 var20 = arg0[var16][var9][var12];
                                if (var20.field289 != null) {
                                    for (class621 var21 = var20.field289; var21 != null; var21 = var21.field8560) {
                                        class556 var22 = var21.field8559;
                                        if (var22 instanceof class457) {
                                            class457 var23 = (class457) var22;
                                            int var24 = var23.method758(true);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var25 = var23.method743(-30968);
                                            int var26 = var25 << 6 | var24;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class14 var27 = arg0[var16][var9][var12];
                            if (var27 != null && var27.field289 != null) {
                                for (class621 var28 = var27.field289; var28 != null; var28 = var28.field8560) {
                                    class556 var29 = var28.field8559;
                                    if (var29.field7741 != var29.field7734 || var29.field7746 != var29.field7744) {
                                        for (int var30 = var29.field7734; var30 <= var29.field7741; var30++) {
                                            for (int var31 = var29.field7746; var31 <= var29.field7744; var31++) {
                                                class232.field3052[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class232.field3052[var16][var9][var12] = var6;
                        }
                    }
                }
                if (var15) {
                    int var32 = class195.field2669[class472.field6329 + 1].method1677(var12, (byte) 67, var9);
                    if (var32 > class741.field10342[arg4]) {
                        class741.field10342[arg4] = var32;
                    }
                    int var33 = var9 << 9;
                    int var34 = var12 << 9;
                    if (class702.field9764[arg4] > var33) {
                        class702.field9764[arg4] = var33;
                    } else if (class609.field8449[arg4] < var33) {
                        class609.field8449[arg4] = var33;
                    }
                    if (class85.field1180[arg4] > var34) {
                        class85.field1180[arg4] = var34;
                    } else if (var34 > class449.field5944[arg4]) {
                        class449.field5944[arg4] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class232.field3052[class472.field6329][var9 - 1][var12] != var6) {
                        class701.field9755[var35] = class683.method3840(-754974720, class683.method3840(1179648, var9 - 1));
                        class347.field4447[var35] = class683.method3840(1245184, var12);
                        class232.field3052[class472.field6329][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class543.field7597) {
                        if (var9 - 1 >= 0 && class232.field3052[class472.field6329][var9 - 1][var12] != var6 && (class305.field4001[class472.field6329][var9][var12] & 0x4) == 0 && (class305.field4001[class472.field6329][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class701.field9755[var35] = class683.method3840(class683.method3840(var9 - 1, 1179648), 1375731712);
                            class347.field4447[var35] = class683.method3840(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class232.field3052[class472.field6329][var9 - 1][var12] = var6;
                        }
                        if (class232.field3052[class472.field6329][var9][var12] != var6) {
                            class701.field9755[var35] = class683.method3840(class683.method3840(var9, 5373952), 318767104);
                            class347.field4447[var35] = class683.method3840(5439488, var12);
                            class232.field3052[class472.field6329][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class409.field5183 && class232.field3052[class472.field6329][var9 + 1][var12] != var6 && (class305.field4001[class472.field6329][var9][var12] & 0x4) == 0 && (class305.field4001[class472.field6329][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class701.field9755[var35] = class683.method3840(class683.method3840(5373952, var9 + 1), -1845493760);
                            class347.field4447[var35] = class683.method3840(5439488, var12);
                            class232.field3052[class472.field6329][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class409.field5183 && class232.field3052[class472.field6329][var9 + 1][var12] != var6) {
                        class701.field9755[var35] = class683.method3840(class683.method3840(var9 + 1, 9568256), 1392508928);
                        class347.field4447[var35] = class683.method3840(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class232.field3052[class472.field6329][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class232.field3052[class472.field6329][var9 - 1][var12] != var6 && (class305.field4001[class472.field6329][var9][var12] & 0x4) == 0 && (class305.field4001[class472.field6329][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class701.field9755[var35] = class683.method3840(class683.method3840(var9 - 1, 13762560), 301989888);
                            class347.field4447[var35] = class683.method3840(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class232.field3052[class472.field6329][var9 - 1][var12] = var6;
                        }
                        if (class232.field3052[class472.field6329][var9][var12] != var6) {
                            class701.field9755[var35] = class683.method3840(-1828716544, class683.method3840(13762560, var9));
                            class347.field4447[var35] = class683.method3840(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class232.field3052[class472.field6329][var9][var12] = var6;
                        }
                        if (class409.field5183 > var9 + 1 && class232.field3052[class472.field6329][var9 + 1][var12] != var6 && (class305.field4001[class472.field6329][var9][var12] & 0x4) == 0 && (class305.field4001[class472.field6329][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class701.field9755[var35] = class683.method3840(class683.method3840(9568256, var9 + 1), -771751936);
                            class347.field4447[var35] = class683.method3840(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class232.field3052[class472.field6329][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class741.field10342[arg4] != -1000000) {
                class741.field10342[arg4] += 40;
                class702.field9764[arg4] -= 512;
                class609.field8449[arg4] += 512;
                class449.field5944[arg4] += 512;
                class85.field1180[arg4] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static final void method2080(int arg0) {
        if (arg0 > -112) {
            method2079(null, true, 2, -87, -93, 61);
        }
        field4623++;
        if (class756.field10543 < 0) {
            class108.field1561 = -1;
            class756.field10543 = 0;
            class557.field7751 = -1;
        }
        if (class756.field10543 > class73.field1051) {
            class108.field1561 = -1;
            class557.field7751 = -1;
            class756.field10543 = class73.field1051;
        }
        if (class687.field9571 < 0) {
            class557.field7751 = -1;
            class687.field9571 = 0;
            class108.field1561 = -1;
        }
        if (class73.field1034 < class687.field9571) {
            class687.field9571 = class73.field1034;
            class557.field7751 = -1;
            class108.field1561 = -1;
        }
    }
}
