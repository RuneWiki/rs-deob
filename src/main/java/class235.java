import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class class235 {

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field3424 = -1;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "Ltn;")
    public static class60 field3419 = new class60(75, 8);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(FIIFLsm;FFFIII)[B", line = 4)
    public static final byte[] method1437(float arg0, int arg1, int arg2, float arg3, class190 arg4, float arg5, float arg6, float arg7, int arg8, int arg9, int arg10) {
        field3421++;
        byte[] var11 = new byte[arg8 * arg9 * arg1];
        if (arg10 < 17) {
            return null;
        } else {
            class366.method2162(arg4, arg9, (byte) -128, arg1, arg3, arg2, arg8, arg6, var11, arg5, arg0, 0, arg7);
            return var11;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Z", line = 19)
    public final boolean method1438(boolean arg0) {
        if (arg0) {
            method1440(-113);
        }
        field3420++;
        return (this.field3426 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 31)
    public static final void method1439(int arg0) {
        field3416++;
        if (arg0 > -65) {
            field3419 = null;
        }
        if (!class427.field6024) {
            return;
        }
        class150 var1 = class343.method2046(field3424, 0, class231.field3397);
        if (var1 != null && var1.field2076 != null) {
            class389 var2 = new class389();
            var2.field5466 = var1.field2076;
            var2.field5457 = var1;
            class495.method2866(var2);
        }
        class483.field6724 = -1;
        class427.field6024 = false;
        class432.field6097 = -1;
        if (var1 != null) {
            class187.method1190(var1, 98);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 68)
    public static void method1440(int arg0) {
        if (arg0 != 13762560) {
            method1440(121);
        }
        field3419 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZIII[[[Lrb;B)Z", line = 84)
    public static final boolean method1441(boolean arg0, int arg1, int arg2, int arg3, class239[][][] arg4, byte arg5) {
        field3415++;
        byte var6 = arg0 ? 1 : (byte) (class402.field5649 & 0xFF);
        if (class453.field6348[class320.field4627][arg3][arg1] == var6) {
            return false;
        } else if ((class368.field5253[class320.field4627][arg3][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            if (arg5 <= 112) {
                field3424 = 98;
            }
            class97.field1275[var7] = arg3;
            int var35 = var7 + 1;
            class66.field846[var7] = arg1;
            class453.field6348[class320.field4627][arg3][arg1] = var6;
            while (var35 != var8) {
                int var9 = class97.field1275[var8] & 0xFFFF;
                int var10 = (class97.field1275[var8] & 0xFF652D) >> 16;
                int var11 = class97.field1275[var8] >> 24 & 0xFF;
                int var12 = class66.field846[var8] & 0xFFFF;
                int var13 = (class66.field846[var8] & 0xFF7044) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class368.field5253[class320.field4627][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class320.field4627 + 1; var16 <= 3; var16++) {
                    if ((class368.field5253[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field3487 != null) {
                                int var20 = class212.method1335(var10, (byte) -121);
                                if (arg4[var16][var9][var12].field3487.field3405 == var20 || arg4[var16][var9][var12].field3473 != null && arg4[var16][var9][var12].field3473.field3405 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class212.method1335(var11, (byte) -126);
                                    if (arg4[var16][var9][var12].field3487.field3405 == var21 || arg4[var16][var9][var12].field3473 != null && arg4[var16][var9][var12].field3473.field3405 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class212.method1335(var13, (byte) -120);
                                    if (arg4[var16][var9][var12].field3487.field3405 == var22 || arg4[var16][var9][var12].field3473 != null && arg4[var16][var9][var12].field3473.field3405 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class239 var23 = arg4[var16][var9][var12];
                            if (var23.field3482 != null) {
                                for (class134 var24 = var23.field3482; var24 != null; var24 = var24.field1755) {
                                    class144 var25 = var24.field1761;
                                    if (var25 instanceof class21) {
                                        class21 var26 = (class21) var25;
                                        int var27 = var26.method112(50);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method114(-9772);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class239 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field3482 != null) {
                            for (class134 var31 = var30.field3482; var31 != null; var31 = var31.field1755) {
                                class144 var32 = var31.field1761;
                                if (var32.field1911 != var32.field1898 || var32.field1907 != var32.field1902) {
                                    for (int var33 = var32.field1911; var33 <= var32.field1898; var33++) {
                                        for (int var34 = var32.field1902; var34 <= var32.field1907; var34++) {
                                            class453.field6348[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class453.field6348[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class330.field4818[class320.field4627 + 1].method10(var9, var12);
                    if (class405.field5736[arg2] < var17) {
                        class405.field5736[arg2] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class14.field188[arg2]) {
                        class14.field188[arg2] = var18;
                    } else if (var18 > class427.field6022[arg2]) {
                        class427.field6022[arg2] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class63.field792[arg2]) {
                        class63.field792[arg2] = var19;
                    } else if (class542.field7924[arg2] < var19) {
                        class542.field7924[arg2] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class453.field6348[class320.field4627][var9 - 1][var12] != var6) {
                        class97.field1275[var35] = class170.method1067(class170.method1067(1179648, var9 - 1), -754974720);
                        class66.field846[var35] = class170.method1067(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class453.field6348[class320.field4627][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class500.field7068;
                    var12++;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && class453.field6348[class320.field4627][var9 - 1][var12] != var6 && (class368.field5253[class320.field4627][var9][var12] & 0x4) == 0 && (class368.field5253[class320.field4627][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class97.field1275[var35] = class170.method1067(class170.method1067(var9 - 1, 1179648), 1375731712);
                            class66.field846[var35] = class170.method1067(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class453.field6348[class320.field4627][var9 - 1][var12] = var6;
                        }
                        if (class453.field6348[class320.field4627][var9][var12] != var6) {
                            class97.field1275[var35] = class170.method1067(class170.method1067(5373952, var9), 318767104);
                            class66.field846[var35] = class170.method1067(var12, 5439488);
                            class453.field6348[class320.field4627][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class43.field494 && class453.field6348[class320.field4627][var9 + 1][var12] != var6 && (class368.field5253[class320.field4627][var9][var12] & 0x4) == 0 && (class368.field5253[class320.field4627][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class97.field1275[var35] = class170.method1067(class170.method1067(5373952, var9 + 1), -1845493760);
                            class66.field846[var35] = class170.method1067(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class453.field6348[class320.field4627][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class43.field494 && class453.field6348[class320.field4627][var9 + 1][var12] != var6) {
                        class97.field1275[var35] = class170.method1067(class170.method1067(var9 + 1, 9568256), 1392508928);
                        class66.field846[var35] = class170.method1067(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class453.field6348[class320.field4627][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class453.field6348[class320.field4627][var9 - 1][var12] != var6 && (class368.field5253[class320.field4627][var9][var12] & 0x4) == 0 && (class368.field5253[class320.field4627][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class97.field1275[var35] = class170.method1067(class170.method1067(13762560, var9 - 1), 301989888);
                            class66.field846[var35] = class170.method1067(13828096, var12);
                            class453.field6348[class320.field4627][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class453.field6348[class320.field4627][var9][var12] != var6) {
                            class97.field1275[var35] = class170.method1067(class170.method1067(13762560, var9), -1828716544);
                            class66.field846[var35] = class170.method1067(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class453.field6348[class320.field4627][var9][var12] = var6;
                        }
                        if (class43.field494 > var9 + 1 && class453.field6348[class320.field4627][var9 + 1][var12] != var6 && (class368.field5253[class320.field4627][var9][var12] & 0x4) == 0 && (class368.field5253[class320.field4627][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class97.field1275[var35] = class170.method1067(-771751936, class170.method1067(var9 + 1, 9568256));
                            class66.field846[var35] = class170.method1067(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class453.field6348[class320.field4627][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class405.field5736[arg2] != -1000000) {
                class405.field5736[arg2] += 10;
                class14.field188[arg2] -= 50;
                class427.field6022[arg2] += 50;
                class542.field7924[arg2] += 50;
                class63.field792[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)Z", line = 405)
    public final boolean method1442(int arg0) {
        field3427++;
        if (arg0 < 15) {
            return true;
        } else {
            return (this.field3426 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 416)
    public static final void method1443(byte arg0) {
        field3425++;
        if (class110.field1501) {
            return;
        }
        if (class4.field81.field1437) {
            class327.field4768 = ((int) class327.field4768 + 47 & 0xFFFFFFF0);
        } else {
            class325.field4750 += (12.0F - class325.field4750) / 2.0F;
        }
        class110.field1501 = true;
        class264.field3877 = true;
        int var1 = 126 % ((-arg0 - 32) / 46);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)Z", line = 440)
    public final boolean method1444(byte arg0) {
        field3418++;
        if (arg0 < 67) {
            field3424 = -12;
        }
        return (this.field3426 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)Z", line = 451)
    public final boolean method1445(int arg0) {
        field3422++;
        int var2 = 88 / ((arg0 - 14) / 50);
        return (this.field3426 & 0x4) != 0;
    }
}
