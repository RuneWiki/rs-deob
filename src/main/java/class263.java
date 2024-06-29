import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class263 {

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
    public static int[] field3734 = new int[8];

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Ljava/lang/String;")
    public String field3735;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZI[[[Luaa;IB)Z")
    public static final boolean method1738(int arg0, boolean arg1, int arg2, class99[][][] arg3, int arg4, byte arg5) {
        field3738++;
        byte var6 = arg1 ? 1 : (byte) (class23.field246 & 0xFF);
        if (class399.field6056[class226.field3179][arg2][arg4] == var6) {
            return false;
        } else if ((class443.field6617[class226.field3179][arg2][arg4] & 0x4) == 0) {
            return false;
        } else if (arg5 == -43) {
            byte var7 = 0;
            class215.field2963[var7] = arg2;
            int var8 = 0;
            int var35 = var7 + 1;
            class55.field635[var7] = arg4;
            class399.field6056[class226.field3179][arg2][arg4] = var6;
            while (var35 != var8) {
                int var9 = class215.field2963[var8] & 0xFFFF;
                int var10 = (class215.field2963[var8] & 0xFF0137) >> 16;
                int var11 = class215.field2963[var8] >> 24 & 0xFF;
                int var12 = class55.field635[var8] & 0xFFFF;
                int var13 = (class55.field635[var8] & 0xFFDE91) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class443.field6617[class226.field3179][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class226.field3179 + 1; var16 <= 3; var16++) {
                    if ((class443.field6617[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field1168 != null) {
                                int var20 = class102.method628(var10, 80);
                                if (arg3[var16][var9][var12].field1168.field8750 == var20 || arg3[var16][var9][var12].field1176 != null && arg3[var16][var9][var12].field1176.field8750 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class102.method628(var11, 80);
                                    if (arg3[var16][var9][var12].field1168.field8750 == var21 || arg3[var16][var9][var12].field1176 != null && arg3[var16][var9][var12].field1176.field8750 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class102.method628(var13, 80);
                                    if (arg3[var16][var9][var12].field1168.field8750 == var22 || arg3[var16][var9][var12].field1176 != null && arg3[var16][var9][var12].field1176.field8750 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class99 var23 = arg3[var16][var9][var12];
                            if (var23.field1167 != null) {
                                for (class104 var24 = var23.field1167; var24 != null; var24 = var24.field1251) {
                                    class144 var25 = var24.field1253;
                                    if (var25 instanceof class57) {
                                        class57 var26 = (class57) var25;
                                        int var27 = var26.method95(124);
                                        int var28 = var26.method92(9812);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class99 var30 = arg3[var16][var9][var12];
                        if (var30 != null && var30.field1167 != null) {
                            for (class104 var31 = var30.field1167; var31 != null; var31 = var31.field1251) {
                                class144 var32 = var31.field1253;
                                if (var32.field1773 != var32.field1762 || var32.field1761 != var32.field1758) {
                                    for (int var33 = var32.field1773; var33 <= var32.field1762; var33++) {
                                        for (int var34 = var32.field1758; var34 <= var32.field1761; var34++) {
                                            class399.field6056[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class399.field6056[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class435.field6449[class226.field3179 + 1].method259(var9, var12);
                    if (var17 > class334.field4796[arg0]) {
                        class334.field4796[arg0] = var17;
                    }
                    int var18 = var9 << 9;
                    int var19 = var12 << 9;
                    if (class274.field3847[arg0] > var18) {
                        class274.field3847[arg0] = var18;
                    } else if (var18 > class455.field6822[arg0]) {
                        class455.field6822[arg0] = var18;
                    }
                    if (class550.field7845[arg0] > var19) {
                        class550.field7845[arg0] = var19;
                    } else if (var19 > class448.field6688[arg0]) {
                        class448.field6688[arg0] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class399.field6056[class226.field3179][var9 - 1][var12] != var6) {
                        class215.field2963[var35] = class283.method1834(class283.method1834(1179648, var9 - 1), -754974720);
                        class55.field635[var35] = class283.method1834(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class399.field6056[class226.field3179][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class30.field349;
                    var12++;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && class399.field6056[class226.field3179][var9 - 1][var12] != var6 && (class443.field6617[class226.field3179][var9][var12] & 0x4) == 0 && (class443.field6617[class226.field3179][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class215.field2963[var35] = class283.method1834(class283.method1834(var9 - 1, 1179648), 1375731712);
                            class55.field635[var35] = class283.method1834(1245184, var12);
                            class399.field6056[class226.field3179][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class399.field6056[class226.field3179][var9][var12] != var6) {
                            class215.field2963[var35] = class283.method1834(318767104, class283.method1834(5373952, var9));
                            class55.field635[var35] = class283.method1834(var12, 5439488);
                            class399.field6056[class226.field3179][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class90.field1032 > var9 + 1 && class399.field6056[class226.field3179][var9 + 1][var12] != var6 && (class443.field6617[class226.field3179][var9][var12] & 0x4) == 0 && (class443.field6617[class226.field3179][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class215.field2963[var35] = class283.method1834(-1845493760, class283.method1834(var9 + 1, 5373952));
                            class55.field635[var35] = class283.method1834(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class399.field6056[class226.field3179][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class90.field1032 > var9 + 1 && class399.field6056[class226.field3179][var9 + 1][var12] != var6) {
                        class215.field2963[var35] = class283.method1834(class283.method1834(9568256, var9 + 1), 1392508928);
                        class55.field635[var35] = class283.method1834(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class399.field6056[class226.field3179][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class399.field6056[class226.field3179][var9 - 1][var12] != var6 && (class443.field6617[class226.field3179][var9][var12] & 0x4) == 0 && (class443.field6617[class226.field3179][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class215.field2963[var35] = class283.method1834(301989888, class283.method1834(13762560, var9 - 1));
                            class55.field635[var35] = class283.method1834(13828096, var12);
                            class399.field6056[class226.field3179][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class399.field6056[class226.field3179][var9][var12] != var6) {
                            class215.field2963[var35] = class283.method1834(-1828716544, class283.method1834(13762560, var9));
                            class55.field635[var35] = class283.method1834(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class399.field6056[class226.field3179][var9][var12] = var6;
                        }
                        if (class90.field1032 > (var9 + 1) && class399.field6056[class226.field3179][var9 + 1][var12] != var6 && (class443.field6617[class226.field3179][var9][var12] & 0x4) == 0 && (class443.field6617[class226.field3179][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class215.field2963[var35] = class283.method1834(-771751936, class283.method1834(9568256, var9 + 1));
                            class55.field635[var35] = class283.method1834(var12, 9633792);
                            class399.field6056[class226.field3179][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class334.field4796[arg0] != -1000000) {
                class334.field4796[arg0] += 10;
                class274.field3847[arg0] -= 50;
                class455.field6822[arg0] += 50;
                class448.field6688[arg0] += 50;
                class550.field7845[arg0] -= 50;
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lkea;I)V")
    public static final void method1739(class203 arg0, int arg1) {
        field3739++;
        if (arg1 < -36) {
            class321.field4649 = arg0;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static void method1740(int arg0) {
        int var1 = 114 / ((arg0 + 24) / 37);
        field3734 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1741(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3737++;
        if (!arg4) {
            class341.field4865 = arg2;
            class201.field2688 = arg1;
            class343.field4894 = arg3;
            class157.field1941 = arg0;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lkr;II)V")
    public static final void method1742(class645 arg0, int arg1, int arg2) {
        field3736++;
        boolean var3 = arg0.method3671(1, (byte) 17) == 1;
        if (var3) {
            class224.field3146[class344.field4914++] = arg1;
        }
        int var4 = arg0.method3671(2, (byte) 17);
        class655 var5 = class142.field1749[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field9472 = false;
            } else if (class244.field3460 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class110 var6 = class554.field7859[arg1] = new class110();
                var6.field1353 = (var5.field1757 << 28) + (var5.field2515[0] + class287.field3980 >> 6 << 14) + (var5.field2524[0] + class250.field3549 >> 6);
                if (var5.field9445 == -1) {
                    var6.field1350 = var5.field2501.method877(-119);
                } else {
                    var6.field1350 = var5.field9445;
                }
                var6.field1351 = var5.field2469;
                var6.field1347 = var5.field9476;
                if (var5.field9482 > 0) {
                    class620.method3568(var5, 0);
                }
                class142.field1749[arg1] = null;
                if (arg0.method3671(1, (byte) 17) != 0) {
                    class80.method531(arg1, true, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method3671(3, (byte) 17);
            int var8 = var5.field2515[0];
            int var9 = var5.field2524[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field9468 = var9;
                var5.field9437 = var8;
                var5.field9472 = true;
            } else {
                var5.method3745(var8, var9, -1, class297.field4401[arg1]);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method3671(4, (byte) 17);
            int var11 = var5.field2515[0];
            int var12 = var5.field2524[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field9472 = true;
                var5.field9437 = var11;
                var5.field9468 = var12;
            } else {
                var5.method3745(var11, var12, -1, class297.field4401[arg1]);
            }
        } else {
            int var13 = arg0.method3671(1, (byte) 17);
            if (var13 == 0) {
                int var14 = arg0.method3671(12, (byte) 17);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E9) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field2515[0] + var16;
                int var19 = var5.field2524[0] + var17;
                if (var3) {
                    var5.field9468 = var19;
                    var5.field9472 = true;
                    var5.field9437 = var18;
                } else {
                    var5.method3745(var18, var19, -1, class297.field4401[arg1]);
                }
                var5.field1757 = (byte) (var5.field1757 + var15 & 0x3);
                if (class244.field3460 == arg1) {
                    class226.field3179 = var5.field1757;
                }
            } else {
                int var20 = arg0.method3671(30, (byte) 17);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFCAB4) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field2515[0] - (-class287.field3980 - var22) & 0x3FFF) - class287.field3980;
                int var25 = (var5.field2524[0] + class250.field3549 + var23 & 0x3FFF) - class250.field3549;
                if (var3) {
                    var5.field9472 = true;
                    var5.field9468 = var25;
                    var5.field9437 = var24;
                } else {
                    var5.method3745(var24, var25, -1, class297.field4401[arg1]);
                }
                if (arg2 >= -24) {
                    method1738(101, false, -104, null, 16, (byte) -127);
                }
                var5.field1757 = (byte) (var5.field1757 + var21 & 0x3);
                if (class244.field3460 == arg1) {
                    class226.field3179 = var5.field1757;
                }
            }
        }
    }
}
