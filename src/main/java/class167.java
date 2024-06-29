import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class167 extends class544 {

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Lmh;")
    public class537 field2041;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Lbg;")
    public static class393 field2044 = new class393();

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Z")
    public boolean field2040;

    static {
        new class180(null, "geschickt werden.", null, null);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Object;III)[B", line = 4)
    public static final byte[] method928(Object arg0, int arg1, int arg2, int arg3) {
        field2049++;
        if (arg0 == null) {
            return null;
        }
        if (arg3 != -104) {
            field2047 = -101;
        }
        if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class551.method3226(arg1, (byte) 124, arg2, var4);
        } else if (arg0 instanceof class124) {
            class124 var5 = (class124) arg0;
            return var5.method712(arg2, -114, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Llp;Ldg;)V", line = 37)
    public static final void method930(class329 arg0, class349 arg1) {
        if (!arg1.field4500) {
            return;
        }
        short var2 = arg1.field4503;
        short var3 = arg1.field4516;
        byte var4 = arg1.field4515;
        byte var5 = arg1.field4495;
        int var6 = (var2 << class362.field4756) + class410.field5342;
        int var7 = (var3 << class362.field4756) + class410.field5342;
        class349[][] var8 = class383.field5070[var4];
        float var9;
        if (class370.field4884 == class128.field1574) {
            class638.field9190.method1159(class90.field1114[0].method847(var6, var7), class198.method1070(var2, var3), class557.method3267(var2, var3), class80.method465(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class638.field9190.method1106(3000.0F, var9 * 1.5F);
        if (arg1.field4505) {
            if (class425.field5480) {
                if (var4 > 0) {
                    class349 var10 = class383.field5070[var4 - 1][var2][var3];
                    if (var10 != null && var10.field4500) {
                        return;
                    }
                }
                if (var2 <= class144.field1735 && var2 > class391.field5184) {
                    class349 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field4500 && (var11.field4505 || (arg1.field4514 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class144.field1735 && var2 < class341.field4393 - 1) {
                    class349 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field4500 && (var12.field4505 || (arg1.field4514 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class222.field2728 && var3 > class325.field4157) {
                    class349 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field4500 && (var13.field4505 || (arg1.field4514 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class222.field2728 && var3 < class163.field1995 - 1) {
                    class349 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field4500 && (var14.field4505 || (arg1.field4514 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class425.field5480 = true;
            }
            arg1.field4505 = false;
            if (arg1.field4494 != null) {
                class349 var15 = arg1.field4494;
                class638.field9190.method1106(3000.0F, (201.5F - (float) (var15.field4495 + 1) * 50.0F) * 1.5F);
                if (!class544.method3186(var15.field4495, var2, var3)) {
                    class128.field1574[var15.field4495].method844(var2, var3);
                }
                class241 var16 = var15.field4496;
                if (var16 != null) {
                    if (class562.field8273) {
                        if ((var16.field3006 & arg1.field4504) == 0) {
                            class534.method3050(arg0, var4, var2, var3);
                        } else {
                            class368.method2061(arg0, var16.field3006, var5, var2, var3);
                        }
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    var16.method320(-1, class638.field9190);
                }
                for (class61 var17 = var15.field4499; var17 != null; var17 = var17.field595) {
                    class598 var18 = var17.field589;
                    if (var18 != null) {
                        if (class562.field8273) {
                            class534.method3050(arg0, var4, var2, var3);
                            class638.field9190.method1193(arg0.field4296, arg0.field4293);
                        }
                        var18.method320(-1, class638.field9190);
                    }
                }
                class638.field9190.method1106(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class544.method3186(var5, var2, var3);
            if (var19) {
                class128.field1574[var5].method844(var2, var3);
                class31 var20 = arg1.field4506;
                if (var20 != null && var20.field238) {
                    if (var20.field236) {
                        class638.field9190.method1106(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class562.field8273) {
                        class534.method3050(arg0, var4, var2, var3);
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    class318 var21 = var20.method320(-1, class638.field9190);
                    if (var21 != null) {
                        var21.field4057 = var20;
                        var21.field4052 = var4;
                        var21.field4060 = var2;
                        var21.field4050 = var3;
                        class504.field6989.method1991(var21, -89);
                    }
                    if (var20.field236) {
                        class638.field9190.method1106(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class241 var24 = arg1.field4496;
            class56 var25 = arg1.field4507;
            if (var24 != null || var25 != null) {
                if (class144.field1735 == var2) {
                    var22++;
                } else if (class144.field1735 < var2) {
                    var22 += 2;
                }
                if (class222.field2728 == var3) {
                    var22 += 3;
                } else if (class222.field2728 > var3) {
                    var22 += 6;
                }
                var23 = class177.field2147[var22];
                arg1.field4504 = class438.field6037[var22];
            }
            if (var24 != null) {
                if ((var24.field3006 & class352.field4540[var22]) == 0) {
                    arg1.field4502 = 0;
                } else if (var24.field3006 == 16) {
                    arg1.field4502 = 3;
                    arg1.field4508 = class78.field919[var22];
                    arg1.field4512 = (byte) (3 - arg1.field4508);
                } else if (var24.field3006 == 32) {
                    arg1.field4502 = 6;
                    arg1.field4508 = class143.field1716[var22];
                    arg1.field4512 = (byte) (6 - arg1.field4508);
                } else if (var24.field3006 == 64) {
                    arg1.field4502 = 12;
                    arg1.field4508 = class318.field4054[var22];
                    arg1.field4512 = (byte) (12 - arg1.field4508);
                } else {
                    arg1.field4502 = 9;
                    arg1.field4508 = class473.field6620[var22];
                    arg1.field4512 = (byte) (9 - arg1.field4508);
                }
                if ((var24.field3006 & var23) != 0 && !class262.method1467(var5, var2, var3, var24.field3006)) {
                    if (class562.field8273) {
                        class534.method3050(arg0, var4, var2, var3);
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    class318 var26 = var24.method320(-1, class638.field9190);
                    if (var26 != null) {
                        var26.field4057 = var24;
                        var26.field4052 = var4;
                        var26.field4060 = var2;
                        var26.field4050 = var3;
                        class504.field6989.method1991(var26, 38);
                    }
                }
                class241 var27 = arg1.field4497;
                if (var27 != null && (var27.field3006 & var23) != 0 && !class262.method1467(var5, var2, var3, var27.field3006)) {
                    if (class562.field8273) {
                        class534.method3050(arg0, var4, var2, var3);
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    class318 var28 = var27.method320(-1, class638.field9190);
                    if (var28 != null) {
                        var28.field4057 = var27;
                        var28.field4052 = var4;
                        var28.field4060 = var2;
                        var28.field4050 = var3;
                        class504.field6989.method1991(var28, 93);
                    }
                }
            }
            if (var25 != null && !class528.method3008(var5, var2, var3, var25.method315(0))) {
                class56 var29 = arg1.field4498;
                class638.field9190.method1106(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field489 & var23) != 0) {
                    if (class562.field8273) {
                        class534.method3050(arg0, var4, var2, var3);
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    class318 var30 = var25.method320(-1, class638.field9190);
                    if (var30 != null) {
                        var30.field4057 = var25;
                        var30.field4052 = var4;
                        var30.field4060 = var2;
                        var30.field4050 = var3;
                        class504.field6989.method1991(var30, -97);
                    }
                } else if (var25.field489 == 256) {
                    int var31 = var25.field488 - class103.field1263;
                    int var32 = var25.field491 - class76.field894;
                    int var33 = var25.field493;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class562.field8273) {
                        class534.method3050(arg0, var4, var2, var3);
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    if (var35 < var34) {
                        class318 var36 = var25.method320(-1, class638.field9190);
                        if (var36 != null) {
                            var36.field4057 = var25;
                            var36.field4052 = var4;
                            var36.field4060 = var2;
                            var36.field4050 = var3;
                            class504.field6989.method1991(var36, 30);
                        }
                    } else if (var29 != null) {
                        class318 var37 = var29.method320(-1, class638.field9190);
                        if (var37 != null) {
                            var37.field4057 = var29;
                            var37.field4052 = var4;
                            var37.field4060 = var2;
                            var37.field4050 = var3;
                            class504.field6989.method1991(var37, -74);
                        }
                    }
                }
                class638.field9190.method1106(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class31 var38 = arg1.field4506;
                if (var38 != null && !var38.field238) {
                    if (var38.field236) {
                        class638.field9190.method1106(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class562.field8273) {
                        class534.method3050(arg0, var4, var2, var3);
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    class318 var39 = var38.method320(-1, class638.field9190);
                    if (var39 != null) {
                        var39.field4057 = var38;
                        var39.field4052 = var4;
                        var39.field4060 = var2;
                        var39.field4050 = var3;
                        class504.field6989.method1991(var39, -106);
                    }
                    if (var38.field236) {
                        class638.field9190.method1106(3000.0F, var9 * 1.5F);
                    }
                }
                class202 var40 = arg1.field4509;
                if (var40 != null && !var40.field2427) {
                    if (class562.field8273) {
                        class534.method3050(arg0, var4, var2, var3);
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    class318 var41 = var40.method320(-1, class638.field9190);
                    if (var41 != null) {
                        var41.field4057 = var40;
                        var41.field4052 = var4;
                        var41.field4060 = var2;
                        var41.field4050 = var3;
                        class504.field6989.method1991(var41, -103);
                    }
                }
            }
            byte var42 = arg1.field4514;
            if (var42 != 0) {
                if (var2 < class144.field1735 && (var42 & 0x4) != 0) {
                    class349 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field4500) {
                        class367.field4820.method1327(var43, true);
                    }
                }
                if (var3 < class222.field2728 && (var42 & 0x2) != 0) {
                    class349 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field4500) {
                        class367.field4820.method1327(var44, true);
                    }
                }
                if (var2 > class144.field1735 && (var42 & 0x1) != 0) {
                    class349 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field4500) {
                        class367.field4820.method1327(var45, true);
                    }
                }
                if (var3 > class222.field2728 && (var42 & 0x8) != 0) {
                    class349 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field4500) {
                        class367.field4820.method1327(var46, true);
                    }
                }
            }
        }
        if (arg1.field4502 != 0) {
            boolean var47 = true;
            for (class61 var48 = arg1.field4499; var48 != null; var48 = var48.field595) {
                if (class341.field4394 != var48.field589.field8658 && (var48.field591 & arg1.field4502) == arg1.field4508) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class241 var49 = arg1.field4496;
                if (!class262.method1467(var5, var2, var3, var49.field3006)) {
                    if (class562.field8273) {
                        label682: {
                            if (var49.field3006 >= 16) {
                                int var50 = var2 - class144.field1735;
                                int var51 = var3 - class222.field2728;
                                if (var49.field3006 == 16) {
                                    int var52 = var50 - class410.field5342;
                                    int var53 = class410.field5342 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class548.field8061) {
                                        class534.method3050(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3006 == 32) {
                                    int var54 = class410.field5342 + var50;
                                    int var55 = class410.field5342 + var51;
                                    if (var55 < -var54 && var2 < class238.field2985 && var3 < class548.field8061) {
                                        class534.method3050(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field3006 == 64) {
                                    int var56 = class410.field5342 + var50;
                                    int var57 = var51 - class410.field5342;
                                    if (var57 > var56 && var2 < class238.field2985 && var3 > 0) {
                                        class534.method3050(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field3006 == 128) {
                                    int var58 = var50 - class410.field5342;
                                    int var59 = var51 - class410.field5342;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class534.method3050(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class534.method3050(arg0, var4, var2, var3);
                        }
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    class318 var60 = var49.method320(-1, class638.field9190);
                    if (var60 != null) {
                        var60.field4057 = var49;
                        var60.field4052 = var4;
                        var60.field4060 = var2;
                        var60.field4050 = var3;
                        class504.field6989.method1991(var60, 110);
                    }
                }
                arg1.field4502 = 0;
            }
        }
        if (arg1.field4491) {
            try {
                arg1.field4491 = false;
                int var61 = 0;
                label625: for (class61 var62 = arg1.field4499; var62 != null; var62 = var62.field595) {
                    class598 var63 = var62.field589;
                    if (class341.field4394 != var63.field8658) {
                        for (int var64 = var63.field8653; var64 <= var63.field8663; var64++) {
                            for (int var65 = var63.field8650; var65 <= var63.field8654; var65++) {
                                class349 var66 = var8[var64][var65];
                                if (var66.field4505) {
                                    arg1.field4491 = true;
                                    continue label625;
                                }
                                if (var66.field4502 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field8653) {
                                        var67++;
                                    }
                                    if (var64 < var63.field8663) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field8650) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field8654) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field4502) == arg1.field4512) {
                                        arg1.field4491 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class144.field1735 - var63.field8653;
                        int var69 = var63.field8663 - class144.field1735;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class222.field2728 - var63.field8650;
                        int var71 = var63.field8654 - class222.field2728;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field4289[var61] = var63;
                        arg0.field4288[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class598 var75 = arg0.field4289[var74];
                        if (class341.field4394 != var75.field8658) {
                            int var76 = arg0.field4288[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field8661 - class103.field1263;
                                int var78 = var75.field8652 - class76.field894;
                                int var79 = arg0.field4289[var73].field8661 - class103.field1263;
                                int var80 = arg0.field4289[var73].field8652 - class76.field894;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class598 var81 = arg0.field4289[var73];
                    var81.field8658 = class341.field4394;
                    if (!class182.method1000(var5, var81.field8653, var81.field8663, var81.field8650, var81.field8654, var81.method322(64))) {
                        if (class562.field8273) {
                            if (var81.field8656 == 0) {
                                class618.method3550(arg0, var4, var81.field8653, var81.field8650, var81.field8663, var81.field8654);
                            } else {
                                class534.method3050(arg0, var4, var2, var3);
                                int var82 = var2 - class144.field1735;
                                int var83 = var3 - class222.field2728;
                                if (var81.field8656 == 2) {
                                    if (var83 > -var82) {
                                        class473.method2754(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class473.method2754(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class473.method2754(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class473.method2754(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class638.field9190.method1193(arg0.field4296, arg0.field4293);
                        }
                        class318 var84 = var81.method320(-1, class638.field9190);
                        if (var84 != null) {
                            var84.field4057 = var81;
                            var84.field4052 = var4;
                            var84.field4060 = var81.field8653;
                            var84.field4050 = var81.field8650;
                            class504.field6989.method1991(var84, -90);
                        }
                    }
                    for (int var85 = var81.field8653; var85 <= var81.field8663; var85++) {
                        for (int var86 = var81.field8650; var86 <= var81.field8654; var86++) {
                            class349 var87 = var8[var85][var86];
                            if (var87.field4502 != 0) {
                                class367.field4820.method1327(var87, true);
                            } else if ((var2 != var85 || var3 != var86) && var87.field4500) {
                                class367.field4820.method1327(var87, true);
                            }
                        }
                    }
                }
                if (arg1.field4491) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field4491 = false;
            }
        }
        if (arg1.field4492 != null && (byte) (class22.field150 & 0xFF) == arg1.field4513) {
            class400 var88 = arg1.field4492;
            int var89 = class128.field1574[var4].method855(var2, var3);
            int var90;
            if (var4 < client.field3216 - 1) {
                var90 = class128.field1574[var4].method855(var2, var3) - class128.field1574[var4 + 1].method855(var2, var3);
            } else {
                var90 = 0x8 << class362.field4756;
            }
            class617.field8932.method657(var6, var89, var7, arg0.field4299);
            int var91 = arg0.field4299[2];
            class617.field8932.method657(var6, var89 - var90, var7, arg0.field4299);
            int var92 = arg0.field4299[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class289.field3761;
            int var96 = class289.field3761 + var94;
            var88.field5258 = var95;
            var88.field5260 = var96;
            var88.field5259 = true;
            class638.field9190.method1140(var88);
        }
        if (!arg1.field4500) {
            return;
        }
        if (arg1.field4502 != 0) {
            return;
        }
        if (var2 <= class144.field1735 && var2 > class391.field5184) {
            class349 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field4500) {
                return;
            }
        }
        if (var2 >= class144.field1735 && var2 < class341.field4393 - 1) {
            class349 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field4500) {
                return;
            }
        }
        if (var3 <= class222.field2728 && var3 > class325.field4157) {
            class349 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field4500) {
                return;
            }
        }
        if (var3 >= class222.field2728 && var3 < class163.field1995 - 1) {
            class349 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field4500) {
                return;
            }
        }
        arg1.field4500 = false;
        class595.field8631--;
        class202 var101 = arg1.field4509;
        if (var101 != null && var101.field2427) {
            if (class562.field8273) {
                class534.method3050(arg0, var4, var2, var3);
                class638.field9190.method1193(arg0.field4296, arg0.field4293);
            }
            class318 var102 = var101.method320(-1, class638.field9190);
            if (var102 != null) {
                var102.field4057 = var101;
                var102.field4052 = var4;
                var102.field4060 = var2;
                var102.field4050 = var3;
                class504.field6989.method1991(var102, 21);
            }
        }
        if (arg1.field4504 != 0) {
            class56 var103 = arg1.field4507;
            if (var103 != null && !class528.method3008(var5, var2, var3, var103.method315(0))) {
                if ((var103.field489 & arg1.field4504) != 0) {
                    if (class562.field8273) {
                        class534.method3050(arg0, var4, var2, var3);
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    class318 var104 = var103.method320(-1, class638.field9190);
                    if (var104 != null) {
                        var104.field4057 = var103;
                        var104.field4052 = var4;
                        var104.field4060 = var2;
                        var104.field4050 = var3;
                        class504.field6989.method1991(var104, -123);
                    }
                } else if (var103.field489 == 256) {
                    int var105 = var103.field488 - class103.field1263;
                    int var106 = var103.field491 - class76.field894;
                    int var107 = var103.field493;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class562.field8273) {
                        class534.method3050(arg0, var4, var2, var3);
                        class638.field9190.method1193(arg0.field4296, arg0.field4293);
                    }
                    class56 var110 = arg1.field4498;
                    if (var109 > var108) {
                        class318 var111 = var103.method320(-1, class638.field9190);
                        if (var111 != null) {
                            var111.field4057 = var103;
                            var111.field4052 = var4;
                            var111.field4060 = var2;
                            var111.field4050 = var3;
                            class504.field6989.method1991(var111, 84);
                        }
                    } else if (var110 != null) {
                        class318 var112 = var110.method320(-1, class638.field9190);
                        if (var112 != null) {
                            var112.field4057 = var110;
                            var112.field4052 = var4;
                            var112.field4060 = var2;
                            var112.field4050 = var3;
                            class504.field6989.method1991(var112, -124);
                        }
                    }
                }
            }
            class241 var113 = arg1.field4496;
            class241 var114 = arg1.field4497;
            if (var114 != null && (var114.field3006 & arg1.field4504) != 0 && !class262.method1467(var5, var2, var3, var114.field3006)) {
                if (class562.field8273) {
                    class368.method2061(arg0, var114.field3006, var4, var2, var3);
                    class638.field9190.method1193(arg0.field4296, arg0.field4293);
                }
                class318 var115 = var114.method320(-1, class638.field9190);
                if (var115 != null) {
                    var115.field4057 = var114;
                    var115.field4052 = var4;
                    var115.field4060 = var2;
                    var115.field4050 = var3;
                    class504.field6989.method1991(var115, -126);
                }
            }
            if (var113 != null && (var113.field3006 & arg1.field4504) != 0 && !class262.method1467(var5, var2, var3, var113.field3006)) {
                if (class562.field8273) {
                    class368.method2061(arg0, var113.field3006, var4, var2, var3);
                    class638.field9190.method1193(arg0.field4296, arg0.field4293);
                }
                class318 var116 = var113.method320(-1, class638.field9190);
                if (var116 != null) {
                    var116.field4057 = var113;
                    var116.field4052 = var4;
                    var116.field4060 = var2;
                    var116.field4050 = var3;
                    class504.field6989.method1991(var116, 83);
                }
            }
        }
        if (var4 < client.field3216 - 1) {
            class349 var117 = class383.field5070[var4 + 1][var2][var3];
            if (var117 != null && var117.field4500) {
                class367.field4820.method1326(-15218, var117);
            }
        }
        if (var2 < class144.field1735) {
            class349 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field4500) {
                class367.field4820.method1327(var118, true);
            }
        }
        if (var3 < class222.field2728) {
            class349 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field4500) {
                class367.field4820.method1327(var119, true);
            }
        }
        if (var2 > class144.field1735) {
            class349 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field4500) {
                class367.field4820.method1327(var120, true);
            }
        }
        if (var3 > class222.field2728) {
            class349 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field4500) {
                class367.field4820.method1327(var121, true);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 1155)
    public static final void method931(byte arg0) {
        field2042++;
        for (class99 var1 = (class99) class89.field1096.method1050((byte) 73); var1 != null; var1 = (class99) class89.field1096.method1047(-7962)) {
            if (class222.method1280(var1.field1227, 0)) {
                class238.method1357(var1, true);
            }
        }
        if (arg0 > -106) {
            field2047 = 124;
        }
        if (class199.field2397 == 1) {
            class19.method123(2169);
            return;
        }
        class450.method2636(class594.field8623, class521.field7314, class609.field8848, 0, class308.field3933);
        int var2 = class410.field5340.method1241(class31.field237.method987(class31.field247, 22), (byte) 0);
        for (class99 var3 = (class99) class89.field1096.method1050((byte) 73); var3 != null; var3 = (class99) class89.field1096.method1047(-7962)) {
            int var4 = class605.method3479(true, var3);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class609.field8848 = var2 + 8;
        class594.field8623 = class199.field2397 * 16 + (class590.field8552 ? 26 : 22);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lmh;)V", line = 1209)
    public class167(class537 arg0) {
        this.field2041 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 1218)
    public static void method935(byte arg0) {
        if (arg0 <= -80) {
            field2044 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Z", line = 1228)
    public final boolean method936(byte arg0) {
        field2039++;
        if (arg0 != -26) {
            this.method939(35, -93, 0);
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Let;IIILqa;)V", line = 1239)
    public static final void method937(class509 arg0, int arg1, int arg2, int arg3, class206 arg4) {
        field2038++;
        class309 var5 = arg0.method2930(0, arg4);
        if (var5 == null) {
            return;
        }
        arg4.method1107(arg1, arg2, arg0.field7094 + arg1, arg0.field7059 + arg2);
        if (arg3 > -69) {
            return;
        }
        if (class275.field3625 == 2 || class275.field3625 == 5 || class19.field138 == null) {
            arg4.method1180(-16777216, var5, arg1, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class617.field8931 == 4) {
            var8 = class429.field5826;
            var7 = class449.field6219;
            var6 = (int) (-class558.field8223) & 0x3FFF;
            var9 = 4096;
        } else {
            var6 = (int) (-class558.field8223) + class335.field4369 & 0x3FFF;
            var7 = class103.field1265.field8652;
            var8 = class103.field1265.field8661;
            var9 = 4096 - (class194.field2354 * 16);
        }
        int var10 = var8 / 32 + 48 - ((class106.field1289 + -104) * 2);
        int var11 = 48 - ((class422.field5452 - 104) * 2 + var7 / 32 - (class422.field5452 * 4));
        class19.field138.method289((float) arg0.field7094 / 2.0F + (float) arg1, (float) arg0.field7059 / 2.0F + (float) arg2, (float) var10, (float) var11, var9, var6 << 2, var5, arg1, arg2);
        for (class171 var12 = (class171) class425.field5478.method1050((byte) 73); var12 != null; var12 = (class171) class425.field5478.method1047(-7962)) {
            int var58 = var12.field2081;
            int var59 = ((class315.field4019.field4403[var58] & 0xFFFFD3B) >> 14) - class632.field9113;
            int var60 = (class315.field4019.field4403[var58] & 0x3FFF) - class119.field1504;
            int var61 = var59 * 4 + 2 - (var8 / 32);
            int var62 = var60 * 4 + (2 - var7 / 32);
            class553.method3235(class315.field4019.field4404[var58], var61, arg0, var62, var5, arg4, arg2, -88, arg1);
        }
        for (int var13 = 0; var13 < class163.field1994; var13++) {
            int var55 = class634.field9126[var13] * 4 + 2 - (var8 / 32);
            int var56 = class250.field3230[var13] * 4 + 2 - var7 / 32;
            class437 var57 = class16.field126.method1759(false, class643.field9313[var13]);
            if (var57.field6004 != null) {
                var57 = var57.method2545(-1, class281.field3700);
                if (var57 == null || var57.field6008 == -1) {
                    continue;
                }
            }
            class553.method3235(var57.field6008, var55, arg0, var56, var5, arg4, arg2, 116, arg1);
        }
        for (class36 var14 = (class36) class150.field1787.method2638(false); var14 != null; var14 = (class36) class150.field1787.method2641(12089)) {
            int var50 = (int) (var14.field7967 >> 28 & 0x3L);
            if (class260.field3355 == var50) {
                int var51 = (int) (var14.field7967 & 0x3FFFL) - class632.field9113;
                int var52 = (int) (var14.field7967 >> 14 & 0x3FFFL) - class119.field1504;
                int var53 = var51 * 4 + 2 - (var8 / 32);
                int var54 = var52 * 4 + 2 - var7 / 32;
                class592.method3439(16383, var5, arg0, arg1, arg2, var54, var53, class106.field1296[0]);
            }
        }
        for (int var15 = 0; var15 < class474.field6637; var15++) {
            class415 var45 = (class415) class309.field3938.method2645((long) class194.field2345[var15], (byte) -100);
            if (var45 != null) {
                class459 var46 = var45.field5390;
                if (var46.method2673(false) && class103.field1265.field8660 == var46.field8660) {
                    class74 var47 = var46.field6334;
                    if (var47 != null && var47.field800 != null) {
                        var47 = var47.method420(class281.field3700, 96);
                    }
                    if (var47 != null && var47.field853 && var47.field809) {
                        int var48 = var46.field8661 / 32 - (var8 / 32);
                        int var49 = var46.field8652 / 32 - (var7 / 32);
                        if (var47.field828 == -1) {
                            class592.method3439(16383, var5, arg0, arg1, arg2, var49, var48, class106.field1296[1]);
                        } else {
                            class553.method3235(var47.field828, var48, arg0, var49, var5, arg4, arg2, 105, arg1);
                        }
                    }
                }
            }
        }
        int var16 = class370.field4878;
        int[] var17 = class519.field7302;
        for (int var18 = 0; var18 < var16; var18++) {
            class545 var37 = class459.field6329[var17[var18]];
            if (var37 != null && var37.method3195(false) && class103.field1265 != var37 && class103.field1265.field8660 == var37.field8660) {
                int var38 = var37.field8661 / 32 - (var8 / 32);
                int var39 = var37.field8652 / 32 - (var7 / 32);
                boolean var40 = false;
                for (int var41 = 0; var41 < class389.field5147; var41++) {
                    if (var37.field8023.equals(class436.field5911[var41]) && class141.field1706[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class326.field4165; var43++) {
                    if (var37.field8023.equals(class533.field7498[var43].field4651)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class103.field1265.field7993 != 0 && var37.field7993 != 0 && class103.field1265.field7993 == var37.field7993) {
                    var44 = true;
                }
                if (var37.field7986) {
                    class592.method3439(16383, var5, arg0, arg1, arg2, var39, var38, class106.field1296[6]);
                } else if (var40) {
                    class592.method3439(16383, var5, arg0, arg1, arg2, var39, var38, class106.field1296[3]);
                } else if (var42) {
                    class592.method3439(16383, var5, arg0, arg1, arg2, var39, var38, class106.field1296[5]);
                } else if (var44) {
                    class592.method3439(16383, var5, arg0, arg1, arg2, var39, var38, class106.field1296[4]);
                } else {
                    class592.method3439(16383, var5, arg0, arg1, arg2, var39, var38, class106.field1296[2]);
                }
            }
        }
        class458[] var19 = class225.field2765;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class458 var23 = var19[var20];
            if (var23 != null && var23.field6309 != 0 && class335.field4358 % 20 < 10) {
                if (var23.field6309 == 1) {
                    class415 var24 = (class415) class309.field3938.method2645((long) var23.field6303, (byte) -123);
                    if (var24 != null) {
                        class459 var25 = var24.field5390;
                        int var26 = var25.field8661 / 32 - (var8 / 32);
                        int var27 = var25.field8652 / 32 - (var7 / 32);
                        class410.method2344(360000L, var27, arg1, arg0, var26, arg2, false, var23.field6308, var5);
                    }
                }
                if (var23.field6309 == 2) {
                    int var28 = var23.field6297 / 32 - (var8 / 32);
                    int var29 = var23.field6300 / 32 - var7 / 32;
                    long var30 = (long) (var23.field6304 << 5);
                    long var32 = var30 * var30;
                    class410.method2344(var32, var29, arg1, arg0, var28, arg2, false, var23.field6308, var5);
                }
                if (var23.field6309 == 10 && var23.field6303 >= 0 && class459.field6329.length > var23.field6303) {
                    class545 var34 = class459.field6329[var23.field6303];
                    if (var34 != null) {
                        int var35 = var34.field8661 / 32 - (var8 / 32);
                        int var36 = var34.field8652 / 32 - var7 / 32;
                        class410.method2344(360000L, var36, arg1, arg0, var35, arg2, false, var23.field6308, var5);
                    }
                }
            }
        }
        if (class617.field8931 == 4) {
            return;
        }
        if (class469.field6549 != 0) {
            int var21 = class469.field6549 * 4 + ((class103.field1265.method2694(28146) + -1) * 2) + 2 - (var8 / 32);
            int var22 = class136.field1666 * 4 + (class103.field1265.method2694(28146) * 2) + 2 - var7 / 32 - 2;
            class592.method3439(16383, var5, arg0, arg1, arg2, var22, var21, class43.field350[class251.field3235 ? 1 : 0]);
        }
        arg4.method1118(-1, (byte) 45, 3, arg0.field7094 / 2 + (arg1 - 1), arg0.field7059 / 2 + -1 + arg2, 3);
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)Z", line = 1546)
    public final boolean method938(int arg0) {
        field2048++;
        if (arg0 <= 105) {
            field2047 = -17;
        }
        return this.field2040;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)I", line = 1562)
    public int method941(int arg0) {
        field2043++;
        if (arg0 != 0) {
            this.method941(33);
        }
        return 0;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)I", line = 1577)
    public final int method942(byte arg0) {
        field2046++;
        return arg0 < 30 ? -9 : 1;
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)[Lhba;", line = 1593)
    public static final class10[] method943(int arg0) {
        if (arg0 != -20415) {
            method931((byte) 63);
        }
        field2045++;
        return new class10[] { class532.field7487, class497.field6904, class411.field5346 };
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Z")
    public abstract boolean method929(int arg0);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public abstract void method932(boolean arg0);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Z")
    public abstract boolean method933(int arg0);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
    public abstract void method934(int arg0, byte arg1);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
    public abstract void method939(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLrr;ILrr;)V")
    public abstract void method940(boolean arg0, class303 arg1, int arg2, class303 arg3);
}
