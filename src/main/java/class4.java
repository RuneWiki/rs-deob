import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class4 extends class548 {

    @OriginalMember(owner = "client!jja", name = "f", descriptor = "I")
    public static int field22 = -1;

    @OriginalMember(owner = "client!jja", name = "j", descriptor = "Laf;")
    public static class39 field26 = new class39(32);

    @OriginalMember(owner = "client!jja", name = "g", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!jja", name = "h", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!jja", name = "i", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!jja", name = "k", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "([[[Lug;IIIIZ)Z", line = 3)
    public static final boolean method10(class472[][][] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field25++;
        if (arg1 != 5439488) {
            field27 = -122;
        }
        byte var6 = arg5 ? 1 : (byte) (class137.field1758 & 0xFF);
        if (class244.field3608[class435.field6040][arg4][arg3] == var6) {
            return false;
        } else if ((class533.field7338[class435.field6040][arg4][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class250.field3723[var7] = arg4;
            int var35 = var7 + 1;
            class5.field29[var7] = arg3;
            class244.field3608[class435.field6040][arg4][arg3] = var6;
            while (var35 != var8) {
                int var9 = class250.field3723[var8] & 0xFFFF;
                int var10 = class250.field3723[var8] >> 16 & 0xFF;
                int var11 = class250.field3723[var8] >> 24 & 0xFF;
                int var12 = class5.field29[var8] & 0xFFFF;
                int var13 = (class5.field29[var8] & 0xFF3720) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class533.field7338[class435.field6040][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg0 != null) {
                    label244: for (int var16 = class435.field6040 + 1; var16 <= 3; var16++) {
                        if (arg0[var16] != null && (class533.field7338[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg0[var16][var9][var12] != null) {
                                if (arg0[var16][var9][var12].field6548 != null) {
                                    int var17 = class10.method27(var10, -1349376474);
                                    if (arg0[var16][var9][var12].field6548.field5564 == var17 || arg0[var16][var9][var12].field6544 != null && arg0[var16][var9][var12].field6544.field5564 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class10.method27(var11, -1349376474);
                                        if (arg0[var16][var9][var12].field6548.field5564 == var18 || arg0[var16][var9][var12].field6544 != null && arg0[var16][var9][var12].field6544.field5564 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class10.method27(var13, -1349376474);
                                        if (arg0[var16][var9][var12].field6548.field5564 == var19 || arg0[var16][var9][var12].field6544 != null && arg0[var16][var9][var12].field6544.field5564 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class472 var20 = arg0[var16][var9][var12];
                                if (var20.field6551 != null) {
                                    for (class44 var21 = var20.field6551; var21 != null; var21 = var21.field466) {
                                        class253 var22 = var21.field465;
                                        if (var22 instanceof class466) {
                                            class466 var23 = (class466) var22;
                                            int var24 = var23.method756((byte) -3);
                                            int var25 = var23.method762(true);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var26 = var24 | var25 << 6;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class472 var27 = arg0[var16][var9][var12];
                            if (var27 != null && var27.field6551 != null) {
                                for (class44 var28 = var27.field6551; var28 != null; var28 = var28.field466) {
                                    class253 var29 = var28.field465;
                                    if (var29.field3754 != var29.field3745 || var29.field3758 != var29.field3755) {
                                        for (int var30 = var29.field3745; var30 <= var29.field3754; var30++) {
                                            for (int var31 = var29.field3758; var31 <= var29.field3755; var31++) {
                                                class244.field3608[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            class244.field3608[var16][var9][var12] = var6;
                            var15 = true;
                        }
                    }
                }
                if (var15) {
                    int var32 = class661.field9303[class435.field6040 + 1].method2525(var9, var12, (byte) 114);
                    if (class213.field2953[arg2] < var32) {
                        class213.field2953[arg2] = var32;
                    }
                    int var33 = var9 << 9;
                    int var34 = var12 << 9;
                    if (var33 < class33.field319[arg2]) {
                        class33.field319[arg2] = var33;
                    } else if (var33 > class473.field6554[arg2]) {
                        class473.field6554[arg2] = var33;
                    }
                    if (class631.field8828[arg2] > var34) {
                        class631.field8828[arg2] = var34;
                    } else if (class679.field9491[arg2] < var34) {
                        class679.field9491[arg2] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class244.field3608[class435.field6040][var9 - 1][var12] != var6) {
                        class250.field3723[var35] = class613.method3544(-754974720, class613.method3544(1179648, var9 - 1));
                        class5.field29[var35] = class613.method3544(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class244.field3608[class435.field6040][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class525.field7224 > var12) {
                        if ((var9 - 1) >= 0 && class244.field3608[class435.field6040][var9 - 1][var12] != var6 && (class533.field7338[class435.field6040][var9][var12] & 0x4) == 0 && (class533.field7338[class435.field6040][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class250.field3723[var35] = class613.method3544(class613.method3544(var9 - 1, 1179648), 1375731712);
                            class5.field29[var35] = class613.method3544(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class244.field3608[class435.field6040][var9 - 1][var12] = var6;
                        }
                        if (class244.field3608[class435.field6040][var9][var12] != var6) {
                            class250.field3723[var35] = class613.method3544(class613.method3544(5373952, var9), 318767104);
                            class5.field29[var35] = class613.method3544(5439488, var12);
                            class244.field3608[class435.field6040][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class741.field10208 > (var9 + 1) && class244.field3608[class435.field6040][var9 + 1][var12] != var6 && (class533.field7338[class435.field6040][var9][var12] & 0x4) == 0 && (class533.field7338[class435.field6040][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class250.field3723[var35] = class613.method3544(-1845493760, class613.method3544(var9 + 1, 5373952));
                            class5.field29[var35] = class613.method3544(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class244.field3608[class435.field6040][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class741.field10208 > var9 + 1 && class244.field3608[class435.field6040][var9 + 1][var12] != var6) {
                        class250.field3723[var35] = class613.method3544(1392508928, class613.method3544(var9 + 1, 9568256));
                        class5.field29[var35] = class613.method3544(var12, 9633792);
                        class244.field3608[class435.field6040][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class244.field3608[class435.field6040][var9 - 1][var12] != var6 && (class533.field7338[class435.field6040][var9][var12] & 0x4) == 0 && (class533.field7338[class435.field6040][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class250.field3723[var35] = class613.method3544(class613.method3544(var9 - 1, 13762560), 301989888);
                            class5.field29[var35] = class613.method3544(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class244.field3608[class435.field6040][var9 - 1][var12] = var6;
                        }
                        if (class244.field3608[class435.field6040][var9][var12] != var6) {
                            class250.field3723[var35] = class613.method3544(-1828716544, class613.method3544(var9, 13762560));
                            class5.field29[var35] = class613.method3544(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class244.field3608[class435.field6040][var9][var12] = var6;
                        }
                        if (class741.field10208 > var9 + 1 && class244.field3608[class435.field6040][var9 + 1][var12] != var6 && (class533.field7338[class435.field6040][var9][var12] & 0x4) == 0 && (class533.field7338[class435.field6040][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class250.field3723[var35] = class613.method3544(-771751936, class613.method3544(9568256, var9 + 1));
                            class5.field29[var35] = class613.method3544(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class244.field3608[class435.field6040][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class213.field2953[arg2] != -1000000) {
                class213.field2953[arg2] += 40;
                class33.field319[arg2] -= 512;
                class473.field6554[arg2] += 512;
                class679.field9491[arg2] += 512;
                class631.field8828[arg2] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(B)V", line = 332)
    public static final void method11(byte arg0) {
        class683.field9565 = 0;
        field23++;
        int var1 = class315.field4517.method3013(-106);
        int var2 = class315.field4517.method3002(-1);
        boolean var3 = class315.field4517.method3013(-92) == 1;
        int var4 = class315.field4517.method3006(false);
        class347.method2192(-128);
        class562.method3326((byte) -86, var1);
        int var5 = (class179.field2258 - class315.field4517.field6962) / 16;
        class725.field10032 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class725.field10032[var6][var10] = class315.field4517.method3008(64);
            }
        }
        class370.field5341 = null;
        class452.field6305 = new byte[var5][];
        class404.field5702 = new int[var5];
        class372.field5355 = new int[var5];
        class175.field2217 = new byte[var5][];
        class476.field6609 = new int[var5];
        class448.field6279 = new byte[var5][];
        class380.field5444 = new byte[var5][];
        class734.field10130 = new int[var5];
        class611.field8607 = new int[var5];
        class86.field1038 = null;
        int var7 = 0;
        if (arg0 > -67) {
            method11((byte) -90);
        }
        for (int var8 = (var4 - (class741.field10208 >> 4)) / 8; var8 <= ((class741.field10208 >> 4) + var4) / 8; var8++) {
            for (int var9 = (var2 - (class525.field7224 >> 4)) / 8; var9 <= ((class525.field7224 >> 4) + var2) / 8; var9++) {
                class611.field8607[var7] = (var8 << 8) + var9;
                class476.field6609[var7] = class604.field8480.method1839(-1, "m" + var8 + "_" + var9);
                class734.field10130[var7] = class604.field8480.method1839(-1, "l" + var8 + "_" + var9);
                class372.field5355[var7] = class604.field8480.method1839(-1, "um" + var8 + "_" + var9);
                class404.field5702[var7] = class604.field8480.method1839(-1, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class625.method3602(var4, var3, 11, 7, var2);
    }

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "(I)V", line = 417)
    public static void method12(int arg0) {
        if (arg0 == -754974720) {
            field26 = null;
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(BII)V", line = 427)
    public static final void method13(byte arg0, int arg1, int arg2) {
        if (arg0 >= -80) {
            field22 = -29;
        }
        field24++;
        class17 var3 = class245.method1634(1, (long) arg2, 6);
        var3.method66((byte) -102);
        var3.field107 = arg1;
    }
}
