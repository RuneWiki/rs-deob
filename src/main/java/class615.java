import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class class615 extends class504 {

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "[Lqp;")
    public class615[] field8135;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "Z")
    public boolean field8118;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "Ldb;")
    public static class298 field8123 = new class298(91, 7);

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "Ldb;")
    public static class298 field8131 = new class298(28, -2);

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Ldb;")
    public static class298 field8133 = new class298(70, 3);

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "Ldb;")
    public static class298 field8138 = new class298(36, -2);

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
    public static int field8140 = -1;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "J")
    public static long field8139 = -1L;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public int field8121;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Lvba;")
    public class38 field8125;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "Lko;")
    public class471 field8129;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public void method3144(byte arg0) {
        if (arg0 != 2) {
            this.method3366(-123, 46, 2);
        }
        if (this.field8118) {
            this.field8125.method295((byte) -119);
            this.field8125 = null;
        } else {
            this.field8129.method2651((byte) -128);
            this.field8129 = null;
        }
        field8126++;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)[I")
    public int[] method8(int arg0, byte arg1) {
        field8136++;
        if (arg1 != -18) {
            this.field8118 = false;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method3364(int arg0) {
        field8138 = null;
        if (arg0 == 998) {
            field8131 = null;
            field8133 = null;
            field8123 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
    public void method3145(int arg0, int arg1, int arg2) {
        field8127++;
        int var4 = ~this.field8121 == arg1 ? arg2 : this.field8121;
        if (this.field8118) {
            this.field8125 = new class38(var4, arg2, arg0);
        } else {
            this.field8129 = new class471(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BILeh;)V")
    public void method15(byte arg0, int arg1, class335 arg2) {
        if (arg0 >= 44) {
            field8124++;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[[I")
    public int[][] method223(int arg0, int arg1) {
        field8130++;
        if (arg0 != 2) {
            this.method8(114, (byte) 48);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)I")
    public int method3365(int arg0) {
        field8132++;
        if (arg0 != -1) {
            this.method10(-121);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)I")
    public int method3146(byte arg0) {
        field8119++;
        if (arg0 <= 46) {
            field8140 = -47;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(III)[I")
    public final int[] method3366(int arg0, int arg1, int arg2) {
        field8122++;
        if (arg1 != 997) {
            this.field8121 = -54;
        }
        return this.field8135[arg0].field8118 ? this.field8135[arg0].method8(arg2, (byte) -18) : this.field8135[arg0].method223(2, arg2)[0];
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ldw;Lfba;)V")
    public static final void method3367(class673 arg0, class24 arg1) {
        if (!arg1.field421) {
            return;
        }
        short var2 = arg1.field398;
        short var3 = arg1.field404;
        byte var4 = arg1.field416;
        byte var5 = arg1.field402;
        int var6 = (var2 << class348.field4782) + class16.field256;
        int var7 = (var3 << class348.field4782) + class16.field256;
        class24[][] var8 = class703.field9899[var4];
        if (class467.field6283 == class218.field3099) {
            class269.field3751.method445(class684.field9625[0].method200(var6, var7), class454.method2590(var2, var3), class709.method3905(var2, var3), class404.method2322(var2, var3));
        }
        if (arg1.field405) {
            if (class263.field3653) {
                if (var4 > 0) {
                    class24 var9 = class703.field9899[var4 - 1][var2][var3];
                    if (var9 != null && var9.field421) {
                        return;
                    }
                }
                if (var2 <= class350.field4797 && var2 > class253.field3500) {
                    class24 var10 = var8[var2 - 1][var3];
                    if (var10 != null && var10.field421 && (var10.field405 || (arg1.field414 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class350.field4797 && var2 < class149.field2388 - 1) {
                    class24 var11 = var8[var2 + 1][var3];
                    if (var11 != null && var11.field421 && (var11.field405 || (arg1.field414 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class173.field2673 && var3 > class669.field9498) {
                    class24 var12 = var8[var2][var3 - 1];
                    if (var12 != null && var12.field421 && (var12.field405 || (arg1.field414 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class173.field2673 && var3 < class221.field3133 - 1) {
                    class24 var13 = var8[var2][var3 + 1];
                    if (var13 != null && var13.field421 && (var13.field405 || (arg1.field414 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class263.field3653 = true;
            }
            arg1.field405 = false;
            if (arg1.field408 != null) {
                class24 var14 = arg1.field408;
                if (!class572.method3142(var14.field402, var2, var3)) {
                    class218.field3099[var14.field402].method18(var2, var3);
                }
                class477 var15 = var14.field411;
                if (var15 != null) {
                    if (class131.field2159) {
                        if ((var15.field6357 & arg1.field412) == 0) {
                            class148.method1066(arg0, var4, var2, var3);
                        } else {
                            class10.method124(arg0, var15.field6357, var5, var2, var3);
                        }
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    var15.method145((byte) 124, class269.field3751);
                }
                for (class684 var16 = var14.field409; var16 != null; var16 = var16.field9618) {
                    class641 var17 = var16.field9619;
                    if (var17 != null) {
                        if (class131.field2159) {
                            class148.method1066(arg0, var4, var2, var3);
                            class269.field3751.method400(arg0.field9523, arg0.field9524);
                        }
                        var17.method145((byte) 124, class269.field3751);
                    }
                }
            }
            boolean var18 = !class572.method3142(var5, var2, var3);
            if (var18) {
                class218.field3099[var5].method18(var2, var3);
                class618 var19 = arg1.field422;
                if (var19 != null && var19.field8193) {
                    if (class131.field2159) {
                        class148.method1066(arg0, var4, var2, var3);
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    class571 var20 = var19.method145((byte) 124, class269.field3751);
                    if (var20 != null) {
                        var20.field7578 = var19;
                        var20.field7580 = var4;
                        var20.field7583 = var2;
                        var20.field7579 = var3;
                        class670.field9502.method327(var20, true);
                    }
                }
            }
            int var21 = 0;
            int var22 = 0;
            class477 var23 = arg1.field411;
            class18 var24 = arg1.field396;
            if (var23 != null || var24 != null) {
                if (class350.field4797 == var2) {
                    var21++;
                } else if (class350.field4797 < var2) {
                    var21 += 2;
                }
                if (class173.field2673 == var3) {
                    var21 += 3;
                } else if (class173.field2673 > var3) {
                    var21 += 6;
                }
                var22 = class253.field3485[var21];
                arg1.field412 = class547.field7302[var21];
            }
            if (var23 != null) {
                if ((var23.field6357 & class23.field379[var21]) == 0) {
                    arg1.field407 = 0;
                } else if (var23.field6357 == 16) {
                    arg1.field407 = 3;
                    arg1.field401 = class419.field5768[var21];
                    arg1.field417 = (byte) (3 - arg1.field401);
                } else if (var23.field6357 == 32) {
                    arg1.field407 = 6;
                    arg1.field401 = class48.field684[var21];
                    arg1.field417 = (byte) (6 - arg1.field401);
                } else if (var23.field6357 == 64) {
                    arg1.field407 = 12;
                    arg1.field401 = class680.field9594[var21];
                    arg1.field417 = (byte) (12 - arg1.field401);
                } else {
                    arg1.field407 = 9;
                    arg1.field401 = class406.field5470[var21];
                    arg1.field417 = (byte) (9 - arg1.field401);
                }
                if ((var23.field6357 & var22) != 0 && !class562.method3087(var5, var2, var3, var23.field6357)) {
                    if (class131.field2159) {
                        class148.method1066(arg0, var4, var2, var3);
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    class571 var25 = var23.method145((byte) 124, class269.field3751);
                    if (var25 != null) {
                        var25.field7578 = var23;
                        var25.field7580 = var4;
                        var25.field7583 = var2;
                        var25.field7579 = var3;
                        class670.field9502.method327(var25, true);
                    }
                }
                class477 var26 = arg1.field406;
                if (var26 != null && (var26.field6357 & var22) != 0 && !class562.method3087(var5, var2, var3, var26.field6357)) {
                    if (class131.field2159) {
                        class148.method1066(arg0, var4, var2, var3);
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    class571 var27 = var26.method145((byte) 124, class269.field3751);
                    if (var27 != null) {
                        var27.field7578 = var26;
                        var27.field7580 = var4;
                        var27.field7583 = var2;
                        var27.field7579 = var3;
                        class670.field9502.method327(var27, true);
                    }
                }
            }
            if (var24 != null && !class216.method1377(var5, var2, var3, var24.method188((byte) 111))) {
                class18 var28 = arg1.field413;
                if ((var24.field299 & var22) != 0) {
                    if (class131.field2159) {
                        class148.method1066(arg0, var4, var2, var3);
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    class571 var29 = var24.method145((byte) 124, class269.field3751);
                    if (var29 != null) {
                        var29.field7578 = var24;
                        var29.field7580 = var4;
                        var29.field7583 = var2;
                        var29.field7579 = var3;
                        class670.field9502.method327(var29, true);
                    }
                } else if (var24.field299 == 256) {
                    int var30 = var24.field300 - class548.field7315;
                    int var31 = var24.field305 - class418.field5723;
                    int var32 = var24.field304;
                    int var33;
                    if (var32 == 1 || var32 == 2) {
                        var33 = -var30;
                    } else {
                        var33 = var30;
                    }
                    int var34;
                    if (var32 == 2 || var32 == 3) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    if (class131.field2159) {
                        class148.method1066(arg0, var4, var2, var3);
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    if (var34 < var33) {
                        class571 var35 = var24.method145((byte) 124, class269.field3751);
                        if (var35 != null) {
                            var35.field7578 = var24;
                            var35.field7580 = var4;
                            var35.field7583 = var2;
                            var35.field7579 = var3;
                            class670.field9502.method327(var35, true);
                        }
                    } else if (var28 != null) {
                        class571 var36 = var28.method145((byte) 124, class269.field3751);
                        if (var36 != null) {
                            var36.field7578 = var28;
                            var36.field7580 = var4;
                            var36.field7583 = var2;
                            var36.field7579 = var3;
                            class670.field9502.method327(var36, true);
                        }
                    }
                }
            }
            if (var18) {
                class618 var37 = arg1.field422;
                if (var37 != null && !var37.field8193) {
                    if (class131.field2159) {
                        class148.method1066(arg0, var4, var2, var3);
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    class571 var38 = var37.method145((byte) 124, class269.field3751);
                    if (var38 != null) {
                        var38.field7578 = var37;
                        var38.field7580 = var4;
                        var38.field7583 = var2;
                        var38.field7579 = var3;
                        class670.field9502.method327(var38, true);
                    }
                }
                class136 var39 = arg1.field403;
                if (var39 != null && !var39.field2213) {
                    if (class131.field2159) {
                        class148.method1066(arg0, var4, var2, var3);
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    class571 var40 = var39.method145((byte) 124, class269.field3751);
                    if (var40 != null) {
                        var40.field7578 = var39;
                        var40.field7580 = var4;
                        var40.field7583 = var2;
                        var40.field7579 = var3;
                        class670.field9502.method327(var40, true);
                    }
                }
            }
            byte var41 = arg1.field414;
            if (var41 != 0) {
                if (var2 < class350.field4797 && (var41 & 0x4) != 0) {
                    class24 var42 = var8[var2 + 1][var3];
                    if (var42 != null && var42.field421) {
                        class692.field9746.method1405(var42, 103);
                    }
                }
                if (var3 < class173.field2673 && (var41 & 0x2) != 0) {
                    class24 var43 = var8[var2][var3 + 1];
                    if (var43 != null && var43.field421) {
                        class692.field9746.method1405(var43, 103);
                    }
                }
                if (var2 > class350.field4797 && (var41 & 0x1) != 0) {
                    class24 var44 = var8[var2 - 1][var3];
                    if (var44 != null && var44.field421) {
                        class692.field9746.method1405(var44, 103);
                    }
                }
                if (var3 > class173.field2673 && (var41 & 0x8) != 0) {
                    class24 var45 = var8[var2][var3 - 1];
                    if (var45 != null && var45.field421) {
                        class692.field9746.method1405(var45, 103);
                    }
                }
            }
        }
        if (arg1.field407 != 0) {
            boolean var46 = true;
            for (class684 var47 = arg1.field409; var47 != null; var47 = var47.field9618) {
                if (class109.field1593 != var47.field9619.field8615 && (var47.field9621 & arg1.field407) == arg1.field401) {
                    var46 = false;
                    break;
                }
            }
            if (var46) {
                class477 var48 = arg1.field411;
                if (!class562.method3087(var5, var2, var3, var48.field6357)) {
                    if (class131.field2159) {
                        label663: {
                            if (var48.field6357 >= 16) {
                                int var49 = var2 - class350.field4797;
                                int var50 = var3 - class173.field2673;
                                if (var48.field6357 == 16) {
                                    int var51 = var49 - class16.field256;
                                    int var52 = class16.field256 + var50;
                                    if (var52 < var51 && var2 > 0 && var3 <= class227.field3196) {
                                        class148.method1066(arg0, var4, var2 - 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field6357 == 32) {
                                    int var53 = class16.field256 + var49;
                                    int var54 = class16.field256 + var50;
                                    if (var54 < -var53 && var2 < class657.field8966 && var3 < class227.field3196) {
                                        class148.method1066(arg0, var4, var2 + 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field6357 == 64) {
                                    int var55 = class16.field256 + var49;
                                    int var56 = var50 - class16.field256;
                                    if (var56 > var55 && var2 < class657.field8966 && var3 > 0) {
                                        class148.method1066(arg0, var4, var2 + 1, var3 - 1);
                                        break label663;
                                    }
                                } else if (var48.field6357 == 128) {
                                    int var57 = var49 - class16.field256;
                                    int var58 = var50 - class16.field256;
                                    if (var58 > -var57 && var2 > 0 && var3 > 0) {
                                        class148.method1066(arg0, var4, var2 - 1, var3 - 1);
                                        break label663;
                                    }
                                }
                            }
                            class148.method1066(arg0, var4, var2, var3);
                        }
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    class571 var59 = var48.method145((byte) 124, class269.field3751);
                    if (var59 != null) {
                        var59.field7578 = var48;
                        var59.field7580 = var4;
                        var59.field7583 = var2;
                        var59.field7579 = var3;
                        class670.field9502.method327(var59, true);
                    }
                }
                arg1.field407 = 0;
            }
        }
        if (arg1.field419) {
            try {
                arg1.field419 = false;
                int var60 = 0;
                label606: for (class684 var61 = arg1.field409; var61 != null; var61 = var61.field9618) {
                    class641 var62 = var61.field9619;
                    if (class109.field1593 != var62.field8615) {
                        for (int var63 = var62.field8611; var63 <= var62.field8622; var63++) {
                            for (int var64 = var62.field8618; var64 <= var62.field8610; var64++) {
                                class24 var65 = var8[var63][var64];
                                if (var65.field405) {
                                    arg1.field419 = true;
                                    continue label606;
                                }
                                if (var65.field407 != 0) {
                                    int var66 = 0;
                                    if (var63 > var62.field8611) {
                                        var66++;
                                    }
                                    if (var63 < var62.field8622) {
                                        var66 += 4;
                                    }
                                    if (var64 > var62.field8618) {
                                        var66 += 8;
                                    }
                                    if (var64 < var62.field8610) {
                                        var66 += 2;
                                    }
                                    if ((var66 & var65.field407) == arg1.field417) {
                                        arg1.field419 = true;
                                        continue label606;
                                    }
                                }
                            }
                        }
                        int var67 = class350.field4797 - var62.field8611;
                        int var68 = var62.field8622 - class350.field4797;
                        if (var68 > var67) {
                            var67 = var68;
                        }
                        int var69 = class173.field2673 - var62.field8618;
                        int var70 = var62.field8610 - class173.field2673;
                        if (var70 > var69) {
                            var69 = var70;
                        }
                        arg0.field9522[var60] = var62;
                        arg0.field9521[var60++] = var67 + var69;
                    }
                }
                while (var60 > 0) {
                    int var71 = -50;
                    int var72 = -1;
                    for (int var73 = 0; var73 < var60; var73++) {
                        class641 var74 = arg0.field9522[var73];
                        if (class109.field1593 != var74.field8615) {
                            int var75 = arg0.field9521[var73];
                            if (var75 > var71) {
                                var71 = var75;
                                var72 = var73;
                            } else if (var71 == var75) {
                                int var76 = var74.field8620 - class548.field7315;
                                int var77 = var74.field8612 - class418.field5723;
                                int var78 = arg0.field9522[var72].field8620 - class548.field7315;
                                int var79 = arg0.field9522[var72].field8612 - class418.field5723;
                                if (var76 * var76 + var77 * var77 > var78 * var78 + var79 * var79) {
                                    var72 = var73;
                                }
                            }
                        }
                    }
                    if (var72 == -1) {
                        break;
                    }
                    class641 var80 = arg0.field9522[var72];
                    var80.field8615 = class109.field1593;
                    if (!class90.method716(var5, var80.field8611, var80.field8622, var80.field8618, var80.field8610, var80.method729(false))) {
                        if (class131.field2159) {
                            if (var80.field8614 == 0) {
                                class369.method2176(arg0, var4, var80.field8611, var80.field8618, var80.field8622, var80.field8610);
                            } else {
                                class148.method1066(arg0, var4, var2, var3);
                                int var81 = var2 - class350.field4797;
                                int var82 = var3 - class173.field2673;
                                if (var80.field8614 == 2) {
                                    if (var82 > -var81) {
                                        class386.method2244(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class386.method2244(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var82 > var81) {
                                    class386.method2244(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class386.method2244(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class269.field3751.method400(arg0.field9523, arg0.field9524);
                        }
                        class571 var83 = var80.method145((byte) 124, class269.field3751);
                        if (var83 != null) {
                            var83.field7578 = var80;
                            var83.field7580 = var4;
                            var83.field7583 = var80.field8611;
                            var83.field7579 = var80.field8618;
                            class670.field9502.method327(var83, true);
                        }
                    }
                    for (int var84 = var80.field8611; var84 <= var80.field8622; var84++) {
                        for (int var85 = var80.field8618; var85 <= var80.field8610; var85++) {
                            class24 var86 = var8[var84][var85];
                            if (var86.field407 != 0) {
                                class692.field9746.method1405(var86, 103);
                            } else if ((var2 != var84 || var3 != var85) && var86.field421) {
                                class692.field9746.method1405(var86, 103);
                            }
                        }
                    }
                }
                if (arg1.field419) {
                    return;
                }
            } catch (Exception var121) {
                arg1.field419 = false;
            }
        }
        if (arg1.field399 != null && (byte) (class107.field1583 & 0xFF) == arg1.field420) {
            class174 var87 = arg1.field399;
            int var88 = class218.field3099[var4].method195(var2, var3);
            int var89;
            if (var4 < class13.field218 - 1) {
                var89 = class218.field3099[var4].method195(var2, var3) - class218.field3099[var4 + 1].method195(var2, var3);
            } else {
                var89 = 0x8 << class348.field4782;
            }
            class491.field6629.method579(var6, var88, var7, arg0.field9520);
            int var90 = arg0.field9520[2];
            class491.field6629.method579(var6, var88 - var89, var7, arg0.field9520);
            int var91 = arg0.field9520[2];
            int var92 = var90;
            int var93 = var91;
            if (var90 > var91) {
                var92 = var91;
                var93 = var90;
            }
            int var94 = var92 - class502.field6718;
            int var95 = class502.field6718 + var93;
            var87.field2682 = var94;
            var87.field2684 = var95;
            var87.field2683 = true;
            class269.field3751.method465(var87);
        }
        if (!arg1.field421) {
            return;
        }
        if (arg1.field407 != 0) {
            return;
        }
        if (var2 <= class350.field4797 && var2 > class253.field3500) {
            class24 var96 = var8[var2 - 1][var3];
            if (var96 != null && var96.field421) {
                return;
            }
        }
        if (var2 >= class350.field4797 && var2 < class149.field2388 - 1) {
            class24 var97 = var8[var2 + 1][var3];
            if (var97 != null && var97.field421) {
                return;
            }
        }
        if (var3 <= class173.field2673 && var3 > class669.field9498) {
            class24 var98 = var8[var2][var3 - 1];
            if (var98 != null && var98.field421) {
                return;
            }
        }
        if (var3 >= class173.field2673 && var3 < class221.field3133 - 1) {
            class24 var99 = var8[var2][var3 + 1];
            if (var99 != null && var99.field421) {
                return;
            }
        }
        arg1.field421 = false;
        class585.field7757--;
        class136 var100 = arg1.field403;
        if (var100 != null && var100.field2213) {
            if (class131.field2159) {
                class148.method1066(arg0, var4, var2, var3);
                class269.field3751.method400(arg0.field9523, arg0.field9524);
            }
            class571 var101 = var100.method145((byte) 124, class269.field3751);
            if (var101 != null) {
                var101.field7578 = var100;
                var101.field7580 = var4;
                var101.field7583 = var2;
                var101.field7579 = var3;
                class670.field9502.method327(var101, true);
            }
        }
        if (arg1.field412 != 0) {
            class18 var102 = arg1.field396;
            if (var102 != null && !class216.method1377(var5, var2, var3, var102.method188((byte) 124))) {
                if ((var102.field299 & arg1.field412) != 0) {
                    if (class131.field2159) {
                        class148.method1066(arg0, var4, var2, var3);
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    class571 var103 = var102.method145((byte) 124, class269.field3751);
                    if (var103 != null) {
                        var103.field7578 = var102;
                        var103.field7580 = var4;
                        var103.field7583 = var2;
                        var103.field7579 = var3;
                        class670.field9502.method327(var103, true);
                    }
                } else if (var102.field299 == 256) {
                    int var104 = var102.field300 - class548.field7315;
                    int var105 = var102.field305 - class418.field5723;
                    int var106 = var102.field304;
                    int var107;
                    if (var106 == 1 || var106 == 2) {
                        var107 = -var104;
                    } else {
                        var107 = var104;
                    }
                    int var108;
                    if (var106 == 2 || var106 == 3) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    if (class131.field2159) {
                        class148.method1066(arg0, var4, var2, var3);
                        class269.field3751.method400(arg0.field9523, arg0.field9524);
                    }
                    class18 var109 = arg1.field413;
                    if (var108 > var107) {
                        class571 var110 = var102.method145((byte) 124, class269.field3751);
                        if (var110 != null) {
                            var110.field7578 = var102;
                            var110.field7580 = var4;
                            var110.field7583 = var2;
                            var110.field7579 = var3;
                            class670.field9502.method327(var110, true);
                        }
                    } else if (var109 != null) {
                        class571 var111 = var109.method145((byte) 124, class269.field3751);
                        if (var111 != null) {
                            var111.field7578 = var109;
                            var111.field7580 = var4;
                            var111.field7583 = var2;
                            var111.field7579 = var3;
                            class670.field9502.method327(var111, true);
                        }
                    }
                }
            }
            class477 var112 = arg1.field411;
            class477 var113 = arg1.field406;
            if (var113 != null && (var113.field6357 & arg1.field412) != 0 && !class562.method3087(var5, var2, var3, var113.field6357)) {
                if (class131.field2159) {
                    class10.method124(arg0, var113.field6357, var4, var2, var3);
                    class269.field3751.method400(arg0.field9523, arg0.field9524);
                }
                class571 var114 = var113.method145((byte) 124, class269.field3751);
                if (var114 != null) {
                    var114.field7578 = var113;
                    var114.field7580 = var4;
                    var114.field7583 = var2;
                    var114.field7579 = var3;
                    class670.field9502.method327(var114, true);
                }
            }
            if (var112 != null && (var112.field6357 & arg1.field412) != 0 && !class562.method3087(var5, var2, var3, var112.field6357)) {
                if (class131.field2159) {
                    class10.method124(arg0, var112.field6357, var4, var2, var3);
                    class269.field3751.method400(arg0.field9523, arg0.field9524);
                }
                class571 var115 = var112.method145((byte) 124, class269.field3751);
                if (var115 != null) {
                    var115.field7578 = var112;
                    var115.field7580 = var4;
                    var115.field7583 = var2;
                    var115.field7579 = var3;
                    class670.field9502.method327(var115, true);
                }
            }
        }
        if (var4 < class13.field218 - 1) {
            class24 var116 = class703.field9899[var4 + 1][var2][var3];
            if (var116 != null && var116.field421) {
                class692.field9746.method1406(var116, (byte) -88);
            }
        }
        if (var2 < class350.field4797) {
            class24 var117 = var8[var2 + 1][var3];
            if (var117 != null && var117.field421) {
                class692.field9746.method1405(var117, 103);
            }
        }
        if (var3 < class173.field2673) {
            class24 var118 = var8[var2][var3 + 1];
            if (var118 != null && var118.field421) {
                class692.field9746.method1405(var118, 103);
            }
        }
        if (var2 > class350.field4797) {
            class24 var119 = var8[var2 - 1][var3];
            if (var119 != null && var119.field421) {
                class692.field9746.method1405(var119, 103);
            }
        }
        if (var3 > class173.field2673) {
            class24 var120 = var8[var2][var3 - 1];
            if (var120 != null && var120.field421) {
                class692.field9746.method1405(var120, 103);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZII)[[I")
    public final int[][] method3368(boolean arg0, int arg1, int arg2) {
        field8128++;
        if (!arg0) {
            return null;
        } else if (this.field8135[arg1].field8118) {
            int[] var4 = this.field8135[arg1].method8(arg2, (byte) -18);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field8135[arg1].method223(2, arg2);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)Lrba;")
    public static final class402 method3369(int arg0, int arg1, int arg2, int arg3) {
        field8120++;
        class402 var4 = null;
        if (~arg0 == arg1) {
            class331.field4534++;
            var4 = class390.method2252(class654.field8853, -118, class262.field3644);
        }
        if (arg0 == 1) {
            var4 = class390.method2252(class562.field7451, -106, class262.field3644);
            class471.field6309++;
        }
        var4.field5354.method2003(class233.field3269 + arg2, 16777216);
        var4.field5354.method1980(-345277664, class561.field7444.method3271(82, 0) ? 1 : 0);
        var4.field5354.method2021(1326408496, class473.field6334 + arg3);
        class123.field2061 = arg3;
        class227.field3199 = false;
        class476.field6353 = arg2;
        class174.method1177(arg1 + 11);
        return var4;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IZ)V")
    public class615(int arg0, boolean arg1) {
        this.field8135 = new class615[arg0];
        this.field8118 = arg1;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
    public void method10(int arg0) {
        field8134++;
        if (arg0 != 12404) {
            this.method3368(false, 34, 35);
        }
    }
}
