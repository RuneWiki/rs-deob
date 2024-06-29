import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class545 extends class484 {

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "[I")
    public static int[] field8132 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "Z")
    public static boolean field8134 = false;

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "[I")
    public static int[] field8135 = new int[1];

    @OriginalMember(owner = "client!ev", name = "O", descriptor = "Ljava/lang/String;")
    public static String field8138 = "";

    @OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!ev", name = "J", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!ev", name = "P", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!ev", name = "Q", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!ev", name = "R", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I[ILida;B[IIIIII[[ZI)V")
    private final void method3200(int arg0, int[] arg1, class134 arg2, byte arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean[][] arg10, int arg11) {
        ++field8137;
        int var13 = (-arg6 + arg8) * arg0 / 256;
        arg2.field1771 = false;
        arg2.field1778 = false;
        int var14 = arg0 >> 8;
        int var15 = arg7;
        int var16 = arg11 + var13;
        if (arg3 > 16) {
            for (int var17 = arg9; arg5 > var17; ++var17) {
                for (int var18 = arg6; ~arg8 < ~var18; ++var18) {
                    if (arg10[-arg9 + var17][-arg6 + var18]) {
                        if (super.field7356[var17][var18] != null) {
                            class244 var33 = super.field7356[var17][var18];
                            if (var33.field3578 != -1 && (var33.field3580 & 2) == 0 && var33.field3581 == 0) {
                                int var34 = super.field7358.method959(var33.field3578);
                                arg2.method824(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class189.method1234((byte) -104, var33.field3588, var34), class189.method1234((byte) -122, var33.field3584, var34), class189.method1234((byte) 117, var33.field3579, var34));
                                arg2.method824(var16, var16, var16 - var14, var15, var14 + var15, var15, class189.method1234((byte) -92, var33.field3582, var34), class189.method1234((byte) 18, var33.field3579, var34), class189.method1234((byte) 8, var33.field3584, var34));
                            } else if (var33.field3581 == 0) {
                                arg2.method820(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, var33.field3588, var33.field3584, var33.field3579);
                                arg2.method820(var16, var16, -var14 + var16, var15, var14 + var15, var15, var33.field3582, var33.field3579, var33.field3584);
                            } else {
                                int var35 = var33.field3581;
                                arg2.method820(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, class6.method24(-16777216 & var33.field3588, (byte) -128, var35), class6.method24(var33.field3584 & -16777216, (byte) -114, var35), class6.method24(-16777216 & var33.field3579, (byte) 43, var35));
                                arg2.method820(var16, var16, -var14 + var16, var15, var14 + var15, var15, class6.method24(var33.field3582 & -16777216, (byte) -122, var35), class6.method24(var33.field3579 & -16777216, (byte) -123, var35), class6.method24(-16777216 & var33.field3584, (byte) 97, var35));
                            }
                        } else if (super.field7355[var17][var18] != null) {
                            class13 var19 = super.field7355[var17][var18];
                            for (int var20 = 0; var20 < var19.field115; ++var20) {
                                arg4[var20] = var15 - -(var19.field109[var20] * var14 / super.field8116);
                                arg1[var20] = -(var19.field111[var20] * var14 / super.field8116) + var16;
                            }
                            for (int var21 = 0; var21 < var19.field113; ++var21) {
                                int var22 = var21 * 3;
                                int var23 = var22 - -1;
                                int var24 = var23 + 1;
                                int var25 = arg4[var22];
                                int var26 = arg4[var23];
                                int var27 = arg4[var24];
                                int var28 = arg1[var22];
                                int var29 = arg1[var23];
                                int var30 = arg1[var24];
                                if (var19.field106 != null && var19.field106[var21] != 0 && (var19.field108 == null || var19.field108 != null && ~var19.field108[var21] == 0)) {
                                    int var31 = var19.field106[var21];
                                    arg2.method820(var28, var29, var30, var25, var26, var27, class6.method24(-(-16777216 & var19.field110[var22]) + -16777216, (byte) 44, var31), class6.method24(-(var19.field110[var23] & -16777216) + -16777216, (byte) 24, var31), class6.method24(-16777216 - (-16777216 & var19.field110[var24]), (byte) -112, var31));
                                } else if (var19.field108 != null && ~var19.field108[var21] != 0) {
                                    int var32 = super.field7358.method959(var19.field108[var21]);
                                    arg2.method824(var28, var29, var30, var25, var26, var27, var32, var32, var32);
                                } else {
                                    arg2.method820(var28, var29, var30, var25, var26, var27, var19.field110[var22], var19.field110[var23], var19.field110[var24]);
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var15 += var14;
                var16 = arg11 + var13;
            }
            arg2.field1778 = true;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "([II[IIII[[ZLida;IIII)V")
    private final void method3201(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, boolean[][] arg6, class134 arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field8140;
        int var13 = (-arg10 + arg1) * arg3 / 256;
        arg7.field1778 = false;
        arg7.field1771 = false;
        int var14 = arg3 >> 8;
        int var15 = arg4;
        int var16 = arg8 - -var13;
        for (int var17 = arg9; ~var17 > ~arg5; ++var17) {
            for (int var18 = arg10; ~var18 > ~arg1; ++var18) {
                if (arg6[-arg9 + var17][-arg10 + var18]) {
                    if (super.field7350[var17][var18] != null) {
                        class423 var19 = super.field7350[var17][var18];
                        if (~var19.field6054 != 0 && ~(var19.field6056 & 2) == -1 && ~var19.field6057 == 0) {
                            int var20 = super.field7358.method959(var19.field6054);
                            arg7.method824(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class189.method1234((byte) 81, var19.field6052 & 65535, var20), class189.method1234((byte) -88, 65535 & var19.field6058, var20), class189.method1234((byte) 120, var19.field6053 & 65535, var20));
                            arg7.method824(var16, var16, -var14 + var16, var15, var15 - -var14, var15, class189.method1234((byte) -88, var19.field6055 & 65535, var20), class189.method1234((byte) 52, 65535 & var19.field6053, var20), class189.method1234((byte) -83, var19.field6058 & 65535, var20));
                        } else if (~var19.field6057 == 0) {
                            arg7.method824(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var19.field6052 & 65535, 65535 & var19.field6058, var19.field6053 & 65535);
                            arg7.method824(var16, var16, -var14 + var16, var15, var14 + var15, var15, 65535 & var19.field6055, 65535 & var19.field6053, 65535 & var19.field6058);
                        } else {
                            int var21 = var19.field6057;
                            arg7.method824(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var21, var21, var21);
                            arg7.method824(var16, var16, -var14 + var16, var15, var14 + var15, var15, var21, var21, var21);
                        }
                    } else if (super.field7352[var17][var18] != null) {
                        class505 var22 = super.field7352[var17][var18];
                        for (int var23 = 0; ~var23 > ~var22.field7531; ++var23) {
                            arg2[var23] = var22.field7532[var23] * var14 / super.field8116 + var15;
                            arg0[var23] = -(var22.field7530[var23] * var14 / super.field8116) + var16;
                        }
                        for (int var24 = 0; ~var24 > ~var22.field7527; ++var24) {
                            short var25 = var22.field7533[var24];
                            short var26 = var22.field7525[var24];
                            short var27 = var22.field7529[var24];
                            int var28 = arg2[var25];
                            int var29 = arg2[var26];
                            int var30 = arg2[var27];
                            int var31 = arg0[var25];
                            int var32 = arg0[var26];
                            int var33 = arg0[var27];
                            if (var22.field7526 != null && ~var22.field7526[var24] != 0) {
                                int var34 = var22.field7526[var24];
                                arg7.method824(var31, var32, var33, var28, var29, var30, class189.method1234((byte) -95, var22.field7528[var25], var34), class189.method1234((byte) 91, var22.field7528[var26], var34), class189.method1234((byte) -106, var22.field7528[var27], var34));
                            } else if (var22.field7523 != null && ~var22.field7523[var24] != 0) {
                                int var35 = super.field7358.method959(var22.field7523[var24]);
                                arg7.method824(var31, var32, var33, var28, var29, var30, class189.method1234((byte) 48, var22.field7528[var25], var35), class189.method1234((byte) -115, var22.field7528[var26], var35), class189.method1234((byte) 51, var22.field7528[var27], var35));
                            } else {
                                int var36 = var22.field7524[var24];
                                arg7.method824(var31, var32, var33, var28, var29, var30, class189.method1234((byte) -80, var22.field7528[var25], var36), class189.method1234((byte) 18, var22.field7528[var26], var36), class189.method1234((byte) -89, var22.field7528[var27], var36));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg8 + var13;
            var15 += var14;
        }
        if (arg11 != -21186) {
            this.method1330(109, -46);
        }
        arg7.field1778 = true;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lqa;III)V")
    public static final void method3202(class167 arg0, int arg1, int arg2, int arg3) {
        ++field8136;
        if (arg1 == -538163834) {
            if (arg3 >= 0 && arg2 >= 0 && ~class32.field328 != -1 && class392.field5709 != 0) {
                arg0.method1016(class634.field9255, class112.field1413, class32.field328, class392.field5709);
                arg0.method1022(class174.field2370, class556.field8252, class32.field328, class392.field5709);
                class105 var4 = arg0.method1020();
                var4.method608(class241.field3527, class382.field5573, class475.field7254, class468.field6940, class308.field4486, class273.field4039);
                arg0.method999(var4);
                if (class562.field8337 != null) {
                    int var5 = -1;
                    int var6 = -1;
                    int var7 = arg0.method1018();
                    int var8 = (-class634.field9255 + arg3) * var7 / class32.field328;
                    int var9 = (-class112.field1413 + arg2) * var7 / class392.field5709;
                    int var10 = arg0.method960();
                    int var11 = (-class634.field9255 + arg3) * var10 / class32.field328;
                    int var12 = (-class112.field1413 + arg2) * var10 / class392.field5709;
                    int[] var13 = new int[] { var8, var9, var7 };
                    var4.method605(var13);
                    int[] var14 = new int[] { var11, var12, var10 };
                    var4.method605(var14);
                    float var15 = 0.0F;
                    int var16 = var14[0] + -var13[0];
                    int var17 = var14[1] + -var13[1];
                    int var18 = var14[2] - var13[2];
                    while (var15 < 1.0F) {
                        int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                        int var20 = var19 >> 7;
                        int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                        int var22 = var21 >> 7;
                        if (~var20 < -1 && var22 > 0 && var20 < class35.field399 && ~class382.field5586 < ~var22) {
                            int var23 = class239.field3493.field3457;
                            if (var23 < 3 && (2 & class237.field3473[1][var20][var22]) != 0) {
                                ++var23;
                            }
                            if ((float) class562.field8337[var23].method1323(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                                var5 = (-1 + class239.field3493.method514(0) << 6) + var19 >> 7;
                                var6 = (-1 + class239.field3493.method514(arg1 ^ -538163834) << 6) + var21 >> 7;
                                break;
                            }
                        }
                        var15 = (float) ((double) var15 + 0.01D);
                    }
                    if (~var5 != 0 && var6 != -1) {
                        if (class369.field5337 && ~(64 & class270.field4003) != -1) {
                            class311 var24 = class240.method1540(class564.field8360, class427.field6085, true);
                            if (var24 == null) {
                                class178.method1188((byte) 125);
                            } else {
                                class436.method2670(0L, -1, 9, var6, true, (byte) -5, class479.field7270, var5, " ->", class425.field6074, false);
                            }
                        } else {
                            if (class461.field6666 == class181.field2783) {
                                class436.method2670(0L, -1, 23, var6, true, (byte) -5, class118.field1541.method2953(3181, class77.field889), var5, "", -1, false);
                            }
                            ++class166.field2251;
                            class436.method2670(0L, -1, 19, var6, true, (byte) -5, class549.field8189, var5, "", class630.field9219, false);
                        }
                    }
                }
                class126 var25 = class147.field1903;
                for (class239 var26 = (class239) var25.method772(arg1 + 538163834); var26 != null; var26 = (class239) var25.method775(2)) {
                    if ((class307.field4473 || class239.field3493.field3457 == var26.field3491) && var26.method1536(arg2, arg1 ^ -538163834, arg0, arg3)) {
                        if (var26.field3498 instanceof class179) {
                            class179 var27 = (class179) var26.field3498;
                            int var28 = var27.method514(0);
                            if ((1 & var28) == 0 && (127 & var27.field3464) == 0 && ~(127 & var27.field3463) == -1 || (1 & var28) == 1 && (var27.field3464 & 127) == 64 && (127 & var27.field3463) == 64) {
                                int var29 = var27.field3464 + -(-1 + var27.method514(arg1 + 538163834) << 6);
                                int var30 = var27.field3463 - (var27.method514(0) + -1 << 6);
                                for (int var31 = 0; var31 < class567.field8409; ++var31) {
                                    class234 var38 = (class234) class627.field9185.method1333((long) class25.field230[var31], false);
                                    if (var38 != null) {
                                        class383 var39 = var38.field3443;
                                        if (~class576.field8505 != ~var39.field1068 && var39.field1034) {
                                            int var40 = -(var39.field5601.field6234 + -1 << 6) + var39.field3464;
                                            int var41 = -(var39.field5601.field6234 - 1 << 6) + var39.field3463;
                                            if (var29 <= var40 && ~var39.field5601.field6234 >= ~(-(-var29 + var40 >> 7) + var27.method514(0)) && var41 >= var30 && var39.field5601.field6234 <= var27.method514(0) - (-var30 + var41 >> 7)) {
                                                class498.method3003((byte) -106, ~class239.field3493.field3457 != ~var26.field3491, var39);
                                                var39.field1068 = class576.field8505;
                                            }
                                        }
                                    }
                                }
                                int var32 = class264.field3925;
                                int[] var33 = class533.field7895;
                                for (int var34 = 0; var34 < var32; ++var34) {
                                    class179 var35 = class383.field5604[var33[var34]];
                                    if (var35 != null && ~class576.field8505 != ~var35.field1068 && var27 != var35 && var35.field1034) {
                                        int var36 = var35.field3464 - (-1 + var35.method514(0) << 6);
                                        int var37 = var35.field3463 + -(var35.method514(0) + -1 << 6);
                                        if (~var29 >= ~var36 && ~var35.method514(0) >= ~(var27.method514(0) + -(var36 - var29 >> 7)) && ~var37 <= ~var30 && ~var35.method514(0) >= ~(var27.method514(0) + -(-var30 + var37 >> 7))) {
                                            class323.method2022(var35, ~class239.field3493.field3457 != ~var26.field3491, arg1 + 538163925);
                                            var35.field1068 = class576.field8505;
                                        }
                                    }
                                }
                            }
                            if (class576.field8505 == var27.field1068) {
                                continue;
                            }
                            class323.method2022(var27, ~class239.field3493.field3457 != ~var26.field3491, arg1 ^ -538163724);
                            var27.field1068 = class576.field8505;
                        }
                        if (var26.field3498 instanceof class383) {
                            class383 var42 = (class383) var26.field3498;
                            if (var42.field5601 != null) {
                                if (~(1 & var42.field5601.field6234) == -1 && ~(var42.field3464 & 127) == -1 && (var42.field3463 & 127) == 0 || ~(1 & var42.field5601.field6234) == -2 && ~(var42.field3464 & 127) == -65 && ~(var42.field3463 & 127) == -65) {
                                    int var43 = -(var42.field5601.field6234 + -1 << 6) + var42.field3464;
                                    int var44 = -(var42.field5601.field6234 + -1 << 6) + var42.field3463;
                                    for (int var45 = 0; var45 < class567.field8409; ++var45) {
                                        class234 var52 = (class234) class627.field9185.method1333((long) class25.field230[var45], false);
                                        if (var52 != null) {
                                            class383 var53 = var52.field3443;
                                            if (class576.field8505 != var53.field1068 && var42 != var53 && var53.field1034) {
                                                int var54 = -(var53.field5601.field6234 + -1 << 6) + var53.field3464;
                                                int var55 = var53.field3463 - (var53.field5601.field6234 - 1 << 6);
                                                if (~var54 <= ~var43 && -(-var43 + var54 >> 7) + var42.field5601.field6234 >= var53.field5601.field6234 && var44 <= var55 && -(-var44 + var55 >> 7) + var42.field5601.field6234 >= var53.field5601.field6234) {
                                                    class498.method3003((byte) -106, class239.field3493.field3457 != var26.field3491, var53);
                                                    var53.field1068 = class576.field8505;
                                                }
                                            }
                                        }
                                    }
                                    int var46 = class264.field3925;
                                    int[] var47 = class533.field7895;
                                    for (int var48 = 0; var48 < var46; ++var48) {
                                        class179 var49 = class383.field5604[var47[var48]];
                                        if (var49 != null && class576.field8505 != var49.field1068 && var49.field1034) {
                                            int var50 = var49.field3464 + -(-1 + var49.method514(0) << 6);
                                            int var51 = var49.field3463 - (var49.method514(0) - 1 << 6);
                                            if (~var50 <= ~var43 && var49.method514(arg1 + 538163834) <= -(-var43 + var50 >> 7) + var42.field5601.field6234 && var51 >= var44 && ~var49.method514(0) >= ~(-(-var44 + var51 >> 7) + var42.field5601.field6234)) {
                                                class323.method2022(var49, ~class239.field3493.field3457 != ~var26.field3491, 99);
                                                var49.field1068 = class576.field8505;
                                            }
                                        }
                                    }
                                }
                                if (~class576.field8505 == ~var42.field1068) {
                                    continue;
                                }
                                class498.method3003((byte) -106, class239.field3493.field3457 != var26.field3491, var42);
                                var42.field1068 = class576.field8505;
                            }
                        }
                        if (var26.field3498 instanceof class394) {
                            int var56 = class584.field8677 + var26.field3495;
                            int var57 = class424.field6061 + var26.field3494;
                            class368 var58 = (class368) class546.field8147.method1333((long) (var56 | var26.field3491 << 28 | var57 << 14), false);
                            if (var58 != null) {
                                for (class539 var59 = (class539) var58.field5322.method2490(arg1 ^ -538163834); var59 != null; var59 = (class539) var58.field5322.method2495((byte) 121)) {
                                    class414 var60 = class216.field3204.method3357(var59.field7977, (byte) -107);
                                    if (class369.field5337) {
                                        if (~class239.field3493.field3457 == ~var26.field3491) {
                                            class173 var65 = ~class437.field6433 != 0 ? class8.field74.method3290(class437.field6433, arg1 ^ -538165979) : null;
                                            if ((class270.field4003 & 1) != 0 && (var65 == null || ~var60.method2459(36, class437.field6433, var65.field2339) != ~var65.field2339)) {
                                                ++class241.field3530;
                                                class436.method2670((long) var59.field7977, -1, 17, var26.field3494, true, (byte) -5, class479.field7270, var26.field3495, class323.field4798 + " -> <col=ff9040>" + var60.field5900, class425.field6074, false);
                                            }
                                        }
                                    } else {
                                        if (class239.field3493.field3457 == var26.field3491) {
                                            String[] var61 = var60.field5889;
                                            for (int var62 = 4; var62 >= 0; --var62) {
                                                if (var61 != null && var61[var62] != null) {
                                                    byte var63 = 0;
                                                    if (~var62 == -1) {
                                                        var63 = 60;
                                                    }
                                                    int var64 = class417.field5998;
                                                    if (~var62 == -2) {
                                                        var63 = 3;
                                                    }
                                                    if (var62 == 2) {
                                                        var63 = 22;
                                                    }
                                                    if (~var62 == -4) {
                                                        var63 = 50;
                                                    }
                                                    if (var60.field5933 == var62) {
                                                        var64 = var60.field5903;
                                                    }
                                                    if (var62 == 4) {
                                                        var63 = 4;
                                                    }
                                                    if (var60.field5905 == var62) {
                                                        var64 = var60.field5920;
                                                    }
                                                    ++class181.field2782;
                                                    class436.method2670((long) var59.field7977, -1, var63, var26.field3494, true, (byte) -5, var61[var62], var26.field3495, "<col=ff9040>" + var60.field5900, var64, false);
                                                }
                                            }
                                        }
                                        ++class100.field1270;
                                        class436.method2670((long) var59.field7977, -1, 1002, var26.field3494, true, (byte) -5, class153.field1954.method2953(3181, class77.field889), var26.field3495, "<col=ff9040>" + var60.field5900, class293.field4305, class239.field3493.field3457 != var26.field3491);
                                    }
                                }
                            }
                        }
                        if (var26.field3498 instanceof class438) {
                            class438 var66 = (class438) var26.field3498;
                            class158 var67 = class312.field4690.method2004(false, var66.method173(arg1 + 538163904));
                            if (var67.field2035 != null) {
                                var67 = var67.method923(-124, class406.field5823);
                            }
                            if (var67 != null) {
                                if (class369.field5337) {
                                    if (~class239.field3493.field3457 == ~var26.field3491) {
                                        class173 var68 = class437.field6433 == -1 ? null : class8.field74.method3290(class437.field6433, arg1 ^ -538165979);
                                        if ((class270.field4003 & 4) != 0 && (var68 == null || ~var67.method913(var68.field2339, true, class437.field6433) != ~var68.field2339)) {
                                            class436.method2670(class197.method1270(var66, var26.field3495, var26.field3494, 1073741824), -1, 57, var26.field3494, true, (byte) -5, class479.field7270, var26.field3495, class323.field4798 + " -> <col=00ffff>" + var67.field2063, class425.field6074, false);
                                            ++class135.field1791;
                                        }
                                    }
                                } else {
                                    if (~class239.field3493.field3457 == ~var26.field3491) {
                                        String[] var69 = var67.field2100;
                                        if (var69 != null) {
                                            for (int var70 = 4; var70 >= 0; --var70) {
                                                if (var69[var70] != null) {
                                                    short var71 = 0;
                                                    int var72 = class417.field5998;
                                                    if (var70 == 0) {
                                                        var71 = 10;
                                                    }
                                                    if (var70 == 1) {
                                                        var71 = 49;
                                                    }
                                                    if (~var70 == -3) {
                                                        var71 = 8;
                                                    }
                                                    if (~var70 == -4) {
                                                        var71 = 20;
                                                    }
                                                    if (~var67.field2072 == ~var70) {
                                                        var72 = var67.field2087;
                                                    }
                                                    if (var70 == 4) {
                                                        var71 = 1010;
                                                    }
                                                    if (~var67.field2056 == ~var70) {
                                                        var72 = var67.field2068;
                                                    }
                                                    class436.method2670(class197.method1270(var66, var26.field3495, var26.field3494, arg1 + 1611905658), -1, var71, var26.field3494, true, (byte) -5, var69[var70], var26.field3495, "<col=00ffff>" + var67.field2063, var72, false);
                                                    ++class227.field3337;
                                                }
                                            }
                                        }
                                    }
                                    ++class392.field5696;
                                    class436.method2670((long) var67.field2010, -1, 1006, var26.field3494, true, (byte) -5, class153.field1954.method2953(3181, class77.field889), var26.field3495, "<col=00ffff>" + var67.field2063, class293.field4305, ~class239.field3493.field3457 != ~var26.field3491);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lfg;IIII[[I[[II)V")
    public class545(class164 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I[I[IILida;Z[I)V")
    private final void method3203(int arg0, int[] arg1, int[] arg2, int arg3, class134 arg4, boolean arg5, int[] arg6) {
        ++field8141;
        class423 var8 = super.field7350[arg0][arg3];
        if (var8 != null) {
            if ((var8.field6056 & 2) == 0) {
                int var9 = super.field8116 * arg0;
                int var10 = super.field8116 + var9;
                int var11 = super.field8116 * arg3;
                int var12 = super.field8116 + var11;
                int var17;
                int var18;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var30;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                if (~(var8.field6056 & 1) == -1) {
                    int var13 = super.field7341[arg0][arg3];
                    int var14 = super.field7341[arg0 - -1][arg3];
                    int var15 = super.field7341[arg0 - -1][arg3 + 1];
                    int var16 = super.field7341[arg0][arg3 - -1];
                    int var19;
                    if (super.field7344 == -1) {
                        var17 = super.field7351 - -(super.field7346 * var11 + super.field7349 * var13 + super.field7340 * var9 >> 15);
                        if (var17 <= super.field7358.field2193) {
                            return;
                        }
                        var18 = (super.field7349 * var14 + super.field7346 * var11 + super.field7340 * var10 >> 15) + super.field7351;
                        if (~var18 >= ~super.field7358.field2193) {
                            return;
                        }
                        var19 = (super.field7349 * var15 + super.field7340 * var10 - -(super.field7346 * var12) >> 15) + super.field7351;
                        if (~var19 >= ~super.field7358.field2193) {
                            return;
                        }
                        var20 = (super.field7346 * var12 + super.field7349 * var16 + super.field7340 * var9 >> 15) + super.field7351;
                        if (super.field7358.field2193 >= var20) {
                            return;
                        }
                    } else {
                        var20 = super.field7344;
                        var19 = super.field7344;
                        var18 = super.field7344;
                        var17 = super.field7344;
                    }
                    var21 = (super.field7345 * var9 + (super.field7347 * var13 - -(super.field7348 * var11)) >> 15) + super.field7338;
                    var22 = super.field7358.field2219 * var21 / var17 + arg4.field1783;
                    var23 = (super.field7343 * var9 + super.field7359 * var11 + super.field7342 * var13 >> 15) + super.field7339;
                    var24 = super.field7358.field2199 * var23 / var17 + arg4.field1782;
                    var25 = (super.field7347 * var14 + super.field7348 * var11 + super.field7345 * var10 >> 15) + super.field7338;
                    var26 = super.field7339 - -(super.field7342 * var14 + super.field7359 * var11 + super.field7343 * var10 >> 15);
                    var27 = arg4.field1783 - -(super.field7358.field2219 * var25 / var18);
                    var28 = arg4.field1782 - -(super.field7358.field2199 * var26 / var18);
                    int var29 = super.field7338 - -(super.field7347 * var15 + super.field7348 * var12 + super.field7345 * var10 >> 15);
                    var30 = super.field7358.field2219 * var29 / var19 + arg4.field1783;
                    int var31 = (super.field7359 * var12 + (super.field7343 * var10 - -(super.field7342 * var15)) >> 15) + super.field7339;
                    var32 = arg4.field1782 - -(super.field7358.field2199 * var31 / var19);
                    var33 = (super.field7345 * var9 + super.field7348 * var12 + super.field7347 * var16 >> 15) + super.field7338;
                    var34 = arg4.field1783 - -(super.field7358.field2219 * var33 / var20);
                    var35 = (super.field7343 * var9 - -(super.field7342 * var16) - -(super.field7359 * var12) >> 15) + super.field7339;
                    var36 = super.field7358.field2199 * var35 / var20 + arg4.field1782;
                } else {
                    int var37 = super.field7341[arg0][arg3];
                    int var38;
                    if (~super.field7344 != 0) {
                        var20 = super.field7344;
                        var38 = super.field7344;
                        var18 = super.field7344;
                        var17 = super.field7344;
                    } else {
                        int var39 = super.field7349 * var37;
                        var17 = (super.field7346 * var11 + super.field7340 * var9 + var39 >> 15) + super.field7351;
                        if (super.field7358.field2193 >= var17) {
                            return;
                        }
                        var18 = (super.field7346 * var11 + super.field7340 * var10 + var39 >> 15) + super.field7351;
                        if (super.field7358.field2193 >= var18) {
                            return;
                        }
                        var38 = (super.field7340 * var10 + var39 - -(super.field7346 * var12) >> 15) + super.field7351;
                        if (super.field7358.field2193 >= var38) {
                            return;
                        }
                        var20 = (super.field7346 * var12 + super.field7340 * var9 + var39 >> 15) + super.field7351;
                        if (~var20 >= ~super.field7358.field2193) {
                            return;
                        }
                    }
                    int var40 = super.field7347 * var37;
                    int var41 = super.field7342 * var37;
                    var21 = (super.field7348 * var11 + super.field7345 * var9 + var40 >> 15) + super.field7338;
                    var22 = arg4.field1783 - -(super.field7358.field2219 * var21 / var17);
                    var23 = super.field7339 - -(super.field7343 * var9 - -var41 - -(super.field7359 * var11) >> 15);
                    var24 = super.field7358.field2199 * var23 / var17 + arg4.field1782;
                    var25 = super.field7338 - -(super.field7348 * var11 + (super.field7345 * var10 - -var40) >> 15);
                    var27 = super.field7358.field2219 * var25 / var18 + arg4.field1783;
                    var26 = (super.field7359 * var11 + super.field7343 * var10 + var41 >> 15) + super.field7339;
                    int var42 = super.field7338 - -(super.field7345 * var10 + super.field7348 * var12 + var40 >> 15);
                    var28 = super.field7358.field2199 * var26 / var18 + arg4.field1782;
                    int var43 = (super.field7359 * var12 + super.field7343 * var10 + var41 >> 15) + super.field7339;
                    var30 = arg4.field1783 - -(super.field7358.field2219 * var42 / var38);
                    var32 = super.field7358.field2199 * var43 / var38 + arg4.field1782;
                    var33 = (super.field7348 * var12 + super.field7345 * var9 + var40 >> 15) + super.field7338;
                    var35 = super.field7339 - -(super.field7359 * var12 + (super.field7343 * var9 - -var41) >> 15);
                    var34 = super.field7358.field2219 * var33 / var20 + arg4.field1783;
                    var36 = arg4.field1782 - -(super.field7358.field2199 * var35 / var20);
                }
                if (~((var28 - var36) * (-var34 + var30) + -((-var34 + var27) * (-var36 + var32))) < -1) {
                    arg4.field1784 = var30 < 0 || var34 < 0 || var27 < 0 || arg4.field1777 < var30 || ~var34 < ~arg4.field1777 || arg4.field1777 < var27;
                    if (~var8.field6054 <= -1) {
                        if (this.method2938(super.field7358.field2262.method1762(var8.field6054, (byte) 45).field968)) {
                            arg4.field1779 = 100;
                        }
                        arg4.method831(var32, var36, var28, var30, var34, var27, 65535 & var8.field6052, 65535 & var8.field6058, var8.field6053 & 65535, var21, var25, var33, var23, var26, var35, var17, var18, var20, var8.field6054);
                        arg4.field1779 = 0;
                    } else {
                        arg4.method824(var32, var36, var28, var30, var34, var27, var8.field6052 & 65535, var8.field6058 & 65535, 65535 & var8.field6053);
                    }
                }
                if ((var22 - var27) * (var36 - var28) + -((-var27 + var34) * (-var28 + var24)) > 0) {
                    arg4.field1784 = var22 < 0 || var27 < 0 || var34 < 0 || ~var22 < ~arg4.field1777 || ~var27 < ~arg4.field1777 || arg4.field1777 < var34;
                    if (var8.field6054 < 0) {
                        arg4.method824(var24, var28, var36, var22, var27, var34, 65535 & var8.field6055, 65535 & var8.field6053, var8.field6058 & 65535);
                        return;
                    }
                    if (this.method2938(super.field7358.field2262.method1762(var8.field6054, (byte) 45).field968)) {
                        arg4.field1779 = 100;
                    }
                    arg4.method831(var24, var28, var36, var22, var27, var34, var8.field6055 & 65535, var8.field6053 & 65535, 65535 & var8.field6058, var21, var25, var33, var23, var26, var35, var17, var18, var20, var8.field6054);
                    arg4.field1779 = 0;
                }
            }
        } else {
            if (!arg5) {
                field8132 = null;
            }
            class505 var44 = super.field7352[arg0][arg3];
            if (var44 != null) {
                if (super.field7344 != -1) {
                    for (int var45 = 0; ~var45 > ~var44.field7531; ++var45) {
                        int var46 = var44.field7532[var45] - -(arg0 << super.field8119);
                        short var47 = var44.field7534[var45];
                        int var48 = var44.field7530[var45] - -(arg3 << super.field8119);
                        int var49 = (super.field7348 * var48 + super.field7347 * var47 + super.field7345 * var46 >> 15) + super.field7338;
                        int var50 = (super.field7359 * var48 + super.field7343 * var46 + super.field7342 * var47 >> 15) + super.field7339;
                        arg6[var45] = super.field7358.field2219 * var49 / super.field7344 + arg4.field1783;
                        arg2[var45] = super.field7358.field2199 * var50 / super.field7344 + arg4.field1782;
                    }
                } else {
                    for (int var51 = 0; ~var44.field7531 < ~var51; ++var51) {
                        int var91 = var44.field7532[var51] - -(arg0 << super.field8119);
                        short var92 = var44.field7534[var51];
                        int var93 = var44.field7530[var51] - -(arg3 << super.field8119);
                        int var94 = super.field7351 - -(super.field7346 * var93 + super.field7349 * var92 + super.field7340 * var91 >> 15);
                        if (super.field7358.field2193 >= var94) {
                            return;
                        }
                        int var95 = super.field7339 - -(super.field7343 * var91 + super.field7359 * var93 + super.field7342 * var92 >> 15);
                        int var96 = (super.field7348 * var93 + super.field7347 * var92 + super.field7345 * var91 >> 15) + super.field7338;
                        arg6[var51] = arg4.field1783 - -(super.field7358.field2219 * var96 / var94);
                        arg2[var51] = arg4.field1782 - -(super.field7358.field2199 * var95 / var94);
                    }
                }
                if (var44.field7523 != null) {
                    int var52 = super.field7341[arg0][arg3];
                    int var53 = super.field7341[arg0 + 1][arg3];
                    int var54 = super.field7341[arg0][arg3 - -1];
                    int var55 = super.field8116 * arg0;
                    int var56 = super.field8116 + var55;
                    int var57 = super.field8116 * arg3;
                    int var58 = var57 - -super.field8116;
                    int var59 = super.field7338 - -(super.field7348 * var57 + super.field7345 * var55 - -(super.field7347 * var52) >> 15);
                    int var60 = (super.field7359 * var57 + super.field7343 * var55 + super.field7342 * var52 >> 15) + super.field7339;
                    int var61 = (super.field7346 * var57 + super.field7340 * var55 - -(super.field7349 * var52) >> 15) + super.field7351;
                    int var62 = (super.field7347 * var53 + super.field7348 * var57 + super.field7345 * var56 >> 15) + super.field7338;
                    int var63 = (super.field7343 * var56 + super.field7359 * var57 + super.field7342 * var53 >> 15) + super.field7339;
                    int var64 = super.field7351 - -(super.field7346 * var57 + super.field7340 * var56 - -(super.field7349 * var53) >> 15);
                    int var65 = (super.field7348 * var58 + (super.field7345 * var55 - -(super.field7347 * var54)) >> 15) + super.field7338;
                    int var66 = (super.field7342 * var54 + super.field7359 * var58 + super.field7343 * var55 >> 15) + super.field7339;
                    int var67 = super.field7351 - -(super.field7340 * var55 - (-(super.field7349 * var54) - super.field7346 * var58) >> 15);
                    for (int var68 = 0; var44.field7527 > var68; ++var68) {
                        short var69 = var44.field7533[var68];
                        short var70 = var44.field7525[var68];
                        short var71 = var44.field7529[var68];
                        int var72 = arg6[var69];
                        int var73 = arg6[var70];
                        int var74 = arg6[var71];
                        int var75 = arg2[var69];
                        int var76 = arg2[var70];
                        int var77 = arg2[var71];
                        if (~((-var73 + var72) * (-var76 + var77) + -((-var73 + var74) * (-var76 + var75))) < -1) {
                            arg4.field1784 = ~var72 > -1 || ~var73 > -1 || var74 < 0 || arg4.field1777 < var72 || arg4.field1777 < var73 || ~var74 < ~arg4.field1777;
                            short var78 = var44.field7523[var68];
                            if (var78 == -1) {
                                int var79 = var44.field7524[var68];
                                if (var79 != -1) {
                                    arg4.method824(var75, var76, var77, var72, var73, var74, class189.method1234((byte) 87, var44.field7528[var69], var79), class189.method1234((byte) -112, var44.field7528[var70], var79), class189.method1234((byte) -128, var44.field7528[var71], var79));
                                }
                            } else {
                                if (this.method2938(super.field7358.field2262.method1762(var78, (byte) 45).field968)) {
                                    arg4.field1779 = 100;
                                }
                                arg4.method831(var75, var76, var77, var72, var73, var74, var44.field7528[var69], var44.field7528[var70], var44.field7528[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg4.field1779 = 0;
                            }
                        }
                    }
                } else {
                    for (int var80 = 0; ~var44.field7527 < ~var80; ++var80) {
                        short var81 = var44.field7533[var80];
                        short var82 = var44.field7525[var80];
                        short var83 = var44.field7529[var80];
                        int var84 = arg6[var81];
                        int var85 = arg6[var82];
                        int var86 = arg6[var83];
                        int var87 = arg2[var81];
                        int var88 = arg2[var82];
                        int var89 = arg2[var83];
                        if ((-var85 + var84) * (-var88 + var89) + -((-var85 + var86) * (-var88 + var87)) > 0) {
                            int var90 = var44.field7524[var80];
                            if (var90 != -1) {
                                arg4.field1784 = var84 < 0 || ~var85 > -1 || var86 < 0 || arg4.field1777 < var84 || arg4.field1777 < var85 || ~var86 < ~arg4.field1777;
                                arg4.method824(var87, var88, var89, var84, var85, var86, class189.method1234((byte) 6, var44.field7528[var81], var90), class189.method1234((byte) -83, var44.field7528[var82], var90), class189.method1234((byte) -126, var44.field7528[var83], var90));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field8131;
        class157 var9 = (class157) super.field7358.method963(Thread.currentThread());
        class134 var10 = var9.field2007;
        var10.field1779 = 0;
        var10.field1784 = false;
        if (super.field7356 == null) {
            if (super.field7350 != null) {
                this.method3201(var9.field4093, arg6, var9.field4095, arg2, arg0, arg5, arg7, var10, arg1, arg3, arg4, -21186);
                return;
            }
        } else {
            this.method3200(arg2, var9.field4093, var10, (byte) 82, var9.field4095, arg5, arg4, arg0, arg6, arg3, arg7, arg1);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V")
    public final void method1330(int arg0, int arg1) {
        ++field8139;
        class157 var3 = (class157) super.field7358.method963(Thread.currentThread());
        var3.field2007.field1779 = 0;
        if (super.field7356 == null) {
            if (super.field7350 != null) {
                this.method3203(arg0, var3.field4085, var3.field4093, arg1, var3.field2007, true, var3.field4095);
                return;
            }
        } else {
            this.method3205(6587, arg1, arg0, var3.field4093, var3.field2007, super.field7358.field2211, var3.field4085, var3.field4095);
        }
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V")
    public static void method3204(int arg0) {
        if (arg0 != -16777216) {
            field8132 = null;
        }
        field8135 = null;
        field8132 = null;
        field8138 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III[ILida;Z[I[I)V")
    private final void method3205(int arg0, int arg1, int arg2, int[] arg3, class134 arg4, boolean arg5, int[] arg6, int[] arg7) {
        ++field8133;
        class244 var9 = super.field7356[arg2][arg1];
        if (var9 != null) {
            if ((2 & var9.field3580) == 0) {
                int var10 = super.field8116 * arg2;
                int var11 = super.field8116 + var10;
                int var12 = super.field8116 * arg1;
                int var13 = var12 - -super.field8116;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                int var45;
                if (~(1 & var9.field3580) != -1 && !arg5) {
                    int var18 = super.field7341[arg2][arg1];
                    if (~super.field7344 != 0) {
                        var19 = super.field7344;
                        var20 = super.field7344;
                        var21 = super.field7344;
                        var22 = super.field7344;
                    } else {
                        int var23 = super.field7349 * var18;
                        var22 = (super.field7340 * var10 - (-var23 - super.field7346 * var12) >> 15) + super.field7351;
                        if (var22 <= super.field7358.field2193) {
                            return;
                        }
                        var21 = (super.field7340 * var11 + var23 - -(super.field7346 * var12) >> 15) + super.field7351;
                        if (var21 <= super.field7358.field2193) {
                            return;
                        }
                        var20 = (super.field7346 * var13 + super.field7340 * var11 + var23 >> 15) + super.field7351;
                        if (~var20 >= ~super.field7358.field2193) {
                            return;
                        }
                        var19 = (super.field7346 * var13 + super.field7340 * var10 - -var23 >> 15) + super.field7351;
                        if (var19 <= super.field7358.field2193) {
                            return;
                        }
                    }
                    if (super.field7358.field2228) {
                        int var24 = -super.field7358.field2217 + var22;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = -super.field7358.field2217 + var21;
                        if (~var25 < -1) {
                            var15 = var25;
                            if (~var25 < -256) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field7358.field2217 + var20;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field7358.field2217 + var19;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (~var27 < -256) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field7347 * var18;
                    int var29 = super.field7342 * var18;
                    var30 = (super.field7345 * var10 + super.field7348 * var12 + var28 >> 15) + super.field7338;
                    var31 = super.field7358.field2219 * var30 / var22 + arg4.field1783;
                    var32 = (super.field7359 * var12 + (super.field7343 * var10 - -var29) >> 15) + super.field7339;
                    var33 = super.field7358.field2199 * var32 / var22 + arg4.field1782;
                    var34 = super.field7338 - -(super.field7345 * var11 + super.field7348 * var12 + var28 >> 15);
                    var35 = (super.field7343 * var11 - (-(super.field7359 * var12) + -var29) >> 15) + super.field7339;
                    var36 = super.field7358.field2219 * var34 / var21 + arg4.field1783;
                    var37 = (super.field7348 * var13 + super.field7345 * var11 + var28 >> 15) + super.field7338;
                    var38 = super.field7358.field2199 * var35 / var21 + arg4.field1782;
                    var39 = (super.field7359 * var13 + super.field7343 * var11 + var29 >> 15) + super.field7339;
                    var40 = super.field7358.field2219 * var37 / var20 + arg4.field1783;
                    var41 = super.field7338 - -(super.field7348 * var13 + (super.field7345 * var10 - -var28) >> 15);
                    var42 = super.field7358.field2199 * var39 / var20 + arg4.field1782;
                    var43 = (super.field7343 * var10 + (var29 - -(super.field7359 * var13)) >> 15) + super.field7339;
                    var44 = super.field7358.field2219 * var41 / var19 + arg4.field1783;
                    var45 = super.field7358.field2199 * var43 / var19 + arg4.field1782;
                } else {
                    int var46 = super.field7341[arg2][arg1];
                    int var47 = super.field7341[arg2 - -1][arg1];
                    int var48 = super.field7341[arg2 - -1][arg1 - -1];
                    int var49 = super.field7341[arg2][arg1 + 1];
                    if (super.field7344 != -1) {
                        var19 = super.field7344;
                        var20 = super.field7344;
                        var21 = super.field7344;
                        var22 = super.field7344;
                    } else {
                        var22 = (super.field7346 * var12 + super.field7349 * var46 + super.field7340 * var10 >> 15) + super.field7351;
                        if (super.field7358.field2193 >= var22) {
                            return;
                        }
                        var21 = (super.field7346 * var12 + super.field7349 * var47 + super.field7340 * var11 >> 15) + super.field7351;
                        if (~var21 >= ~super.field7358.field2193) {
                            return;
                        }
                        var20 = super.field7351 - -(super.field7346 * var13 + super.field7349 * var48 + super.field7340 * var11 >> 15);
                        if (~var20 >= ~super.field7358.field2193) {
                            return;
                        }
                        var19 = (super.field7340 * var10 + super.field7349 * var49 + super.field7346 * var13 >> 15) + super.field7351;
                        if (~var19 >= ~super.field7358.field2193) {
                            return;
                        }
                    }
                    if (arg5) {
                        int var50 = -super.field7358.field2217 + var22;
                        if (~var50 < -256) {
                            var50 = 255;
                        }
                        if (var50 > 0) {
                            var14 = var50;
                            int var51 = var9.field3586 * var50 / 255;
                            if (var51 > 0) {
                                var46 -= var51;
                            }
                        }
                        int var52 = -super.field7358.field2217 + var21;
                        if (var52 > 255) {
                            var52 = 255;
                        }
                        if (var52 > 0) {
                            var15 = var52;
                            int var53 = var9.field3583 * var52 / 255;
                            if (var53 > 0) {
                                var47 -= var53;
                            }
                        }
                        int var54 = var20 - super.field7358.field2217;
                        if (var54 > 255) {
                            var54 = 255;
                        }
                        if (var54 > 0) {
                            var16 = var54;
                            int var55 = var9.field3585 * var54 / 255;
                            if (~var55 < -1) {
                                var48 -= var55;
                            }
                        }
                        int var56 = -super.field7358.field2217 + var19;
                        if (~var56 < -256) {
                            var56 = 255;
                        }
                        if (~var56 < -1) {
                            var17 = var56;
                            int var57 = var9.field3587 * var56 / 255;
                            if (var57 > 0) {
                                var49 -= var57;
                            }
                        }
                    } else if (super.field7358.field2228) {
                        int var58 = -super.field7358.field2217 + var22;
                        if (~var58 < -1) {
                            var14 = var58;
                            if (~var58 < -256) {
                                var14 = 255;
                            }
                        }
                        int var59 = -super.field7358.field2217 + var21;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = -super.field7358.field2217 + var20;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = -super.field7358.field2217 + var19;
                        if (~var61 < -1) {
                            var17 = var61;
                            if (~var61 < -256) {
                                var17 = 255;
                            }
                        }
                    }
                    var30 = (super.field7348 * var12 + super.field7345 * var10 - -(super.field7347 * var46) >> 15) + super.field7338;
                    var31 = super.field7358.field2219 * var30 / var22 + arg4.field1783;
                    var32 = (super.field7342 * var46 + (super.field7343 * var10 - -(super.field7359 * var12)) >> 15) + super.field7339;
                    var33 = super.field7358.field2199 * var32 / var22 + arg4.field1782;
                    var34 = super.field7338 - -(super.field7347 * var47 + super.field7348 * var12 + super.field7345 * var11 >> 15);
                    var36 = super.field7358.field2219 * var34 / var21 + arg4.field1783;
                    var35 = (super.field7359 * var12 + super.field7343 * var11 - -(super.field7342 * var47) >> 15) + super.field7339;
                    var37 = (super.field7348 * var13 + (super.field7345 * var11 - -(super.field7347 * var48)) >> 15) + super.field7338;
                    var38 = super.field7358.field2199 * var35 / var21 + arg4.field1782;
                    var40 = arg4.field1783 - -(super.field7358.field2219 * var37 / var20);
                    var39 = (super.field7359 * var13 + super.field7343 * var11 + super.field7342 * var48 >> 15) + super.field7339;
                    var41 = (super.field7347 * var49 + super.field7348 * var13 + super.field7345 * var10 >> 15) + super.field7338;
                    var42 = arg4.field1782 - -(super.field7358.field2199 * var39 / var20);
                    var44 = super.field7358.field2219 * var41 / var19 + arg4.field1783;
                    var43 = super.field7339 - -(super.field7343 * var10 + super.field7359 * var13 + super.field7342 * var49 >> 15);
                    var45 = arg4.field1782 - -(super.field7358.field2199 * var43 / var19);
                }
                boolean var62 = var9.field3578 != -1 && this.method2938(super.field7358.field2262.method1762(var9.field3578, (byte) 45).field968);
                int var63 = var15 + var17 + var16;
                if ((-var44 + var40) * (-var45 + var38) - (var42 - var45) * (-var44 + var36) > 0) {
                    arg4.field1784 = var40 < 0 || ~var44 > -1 || ~var36 > -1 || var40 > arg4.field1777 || var44 > arg4.field1777 || arg4.field1777 < var36;
                    if (~var63 <= -766) {
                        arg4.method829(var42, var45, var38, var40, var44, var36, super.field7358.field2229);
                    } else {
                        if (var62) {
                            arg4.field1779 = 100;
                        }
                        if (var63 <= 0) {
                            if (~var9.field3578 > -1) {
                                arg4.method820(var42, var45, var38, var40, var44, var36, var9.field3588, var9.field3584, var9.field3579);
                            } else {
                                arg4.method831(var42, var45, var38, var40, var44, var36, var9.field3588, var9.field3584, var9.field3579, var37, var41, var34, var39, var43, var35, var20, var19, var21, var9.field3578);
                            }
                        } else if (var9.field3578 < 0) {
                            arg4.method820(var42, var45, var38, var40, var44, var36, class6.method24(super.field7358.field2229 | var16 << 24, (byte) -111, var9.field3588), class6.method24(var17 << 24 | super.field7358.field2229, (byte) -113, var9.field3584), class6.method24(var15 << 24 | super.field7358.field2229, (byte) -124, var9.field3579));
                        } else {
                            arg4.method828(var42, var45, var38, var40, var44, var36, super.field7358.field2229, var16, var17, var15, var9.field3588, var9.field3584, var9.field3579, var37, var41, var34, var39, var43, var35, var20, var19, var21, var9.field3578);
                        }
                        arg4.field1779 = 0;
                    }
                }
                int var64 = var15 + var17 + var14;
                if ((-var36 + var31) * (-var38 + var45) + -((var33 - var38) * (-var36 + var44)) > 0) {
                    arg4.field1784 = ~var31 > -1 || ~var36 > -1 || var44 < 0 || arg4.field1777 < var31 || ~arg4.field1777 > ~var36 || ~var44 < ~arg4.field1777;
                    if (var64 < 765) {
                        if (var62) {
                            arg4.field1779 = 100;
                        }
                        if (var64 <= 0) {
                            if (~var9.field3578 <= -1) {
                                arg4.method831(var33, var38, var45, var31, var36, var44, var9.field3582, var9.field3579, var9.field3584, var30, var34, var41, var32, var35, var43, var22, var21, var19, var9.field3578);
                            } else {
                                arg4.method820(var33, var38, var45, var31, var36, var44, var9.field3582, var9.field3579, var9.field3584);
                            }
                        } else if (~var9.field3578 > -1) {
                            arg4.method820(var33, var38, var45, var31, var36, var44, class6.method24(var14 << 24 | super.field7358.field2229, (byte) 51, var9.field3582), class6.method24(super.field7358.field2229 | var15 << 24, (byte) 110, var9.field3579), class6.method24(super.field7358.field2229 | var17 << 24, (byte) -120, var9.field3584));
                        } else {
                            arg4.method828(var33, var38, var45, var31, var36, var44, super.field7358.field2229, var14, var15, var17, var9.field3582, var9.field3579, var9.field3584, var30, var34, var41, var32, var35, var43, var22, var21, var19, var9.field3578);
                        }
                        arg4.field1779 = 0;
                        return;
                    }
                    arg4.method829(var33, var38, var45, var31, var36, var44, super.field7358.field2229);
                }
            }
        } else if (arg0 == 6587) {
            class13 var65 = super.field7355[arg2][arg1];
            if (var65 != null) {
                if (~super.field7344 == 0) {
                    for (int var66 = 0; var65.field115 > var66; ++var66) {
                        int var67 = (arg2 << super.field8119) + var65.field109[var66];
                        int var68 = var65.field107[var66];
                        int var69 = (arg1 << super.field8119) + var65.field111[var66];
                        int var70 = super.field7351 - -(super.field7340 * var67 + super.field7349 * var68 + super.field7346 * var69 >> 15);
                        if (~var70 >= ~super.field7358.field2193) {
                            return;
                        }
                        arg6[var66] = 0;
                        if (arg5) {
                            int var71 = -super.field7358.field2217 + var70;
                            if (var71 > 255) {
                                var71 = 255;
                            }
                            if (~var71 < -1) {
                                arg6[var66] = var71;
                                int var72 = var65.field112[var66] * var71 / 255;
                                if (~var72 < -1) {
                                    var68 -= var72;
                                }
                            }
                        } else if (super.field7358.field2228) {
                            int var73 = -super.field7358.field2217 + var70;
                            if (~var73 < -1) {
                                arg6[var66] = var73;
                                if (~arg6[var66] < -256) {
                                    arg6[var66] = 255;
                                }
                            }
                        }
                        int var74 = (super.field7347 * var68 + super.field7345 * var67 - -(super.field7348 * var69) >> 15) + super.field7338;
                        int var75 = (super.field7342 * var68 + super.field7359 * var69 + super.field7343 * var67 >> 15) + super.field7339;
                        arg7[var66] = super.field7358.field2219 * var74 / var70 + arg4.field1783;
                        arg3[var66] = arg4.field1782 - -(super.field7358.field2199 * var75 / var70);
                    }
                } else {
                    for (int var76 = 0; var76 < var65.field115; ++var76) {
                        int var116 = var65.field109[var76] - -(arg2 << super.field8119);
                        int var117 = var65.field107[var76];
                        int var118 = (arg1 << super.field8119) + var65.field111[var76];
                        arg6[var76] = 0;
                        if (arg5) {
                            int var119 = super.field7344 - super.field7358.field2217;
                            if (var119 > 255) {
                                var119 = 255;
                            }
                            if (~var119 < -1) {
                                arg6[var76] = var119;
                                int var120 = var65.field112[var76] * var119 / 255;
                                if (~var120 < -1) {
                                    var117 -= var120;
                                }
                            }
                        } else if (super.field7358.field2228) {
                            int var121 = -super.field7358.field2217 + super.field7344;
                            if (var121 > 0) {
                                arg6[var76] = var121;
                                if (~arg6[var76] < -256) {
                                    arg6[var76] = 255;
                                }
                            }
                        }
                        int var122 = (super.field7343 * var116 + super.field7342 * var117 - -(super.field7359 * var118) >> 15) + super.field7339;
                        int var123 = (super.field7348 * var118 + super.field7347 * var117 + super.field7345 * var116 >> 15) + super.field7338;
                        arg7[var76] = super.field7358.field2219 * var123 / super.field7344 + arg4.field1783;
                        arg3[var76] = arg4.field1782 - -(super.field7358.field2199 * var122 / super.field7344);
                    }
                }
                if (var65.field108 == null) {
                    for (int var77 = 0; ~var77 > ~var65.field113; ++var77) {
                        int var78 = var77 * 3;
                        int var79 = var78 + 1;
                        int var80 = var79 + 1;
                        int var81 = arg7[var78];
                        int var82 = arg7[var79];
                        int var83 = arg7[var80];
                        int var84 = arg3[var78];
                        int var85 = arg3[var79];
                        int var86 = arg3[var80];
                        int var87 = arg6[var78] + arg6[var79] + arg6[var80];
                        if (~((var86 - var85) * (-var82 + var81) - (-var82 + var83) * (-var85 + var84)) < -1) {
                            arg4.field1784 = var81 < 0 || ~var82 > -1 || ~var83 > -1 || var81 > arg4.field1777 || arg4.field1777 < var82 || ~var83 < ~arg4.field1777;
                            if (~var87 <= -766) {
                                arg4.method829(var84, var85, var86, var81, var82, var83, super.field7358.field2229);
                            } else if (~var87 < -1) {
                                if ((var65.field110[var78] & 16777215) != 0) {
                                    arg4.method820(var84, var85, var86, var81, var82, var83, class369.method2248(super.field7358.field2229, var65.field110[var78], -100, arg6[var78]), class369.method2248(super.field7358.field2229, var65.field110[var79], -121, arg6[var79]), class369.method2248(super.field7358.field2229, var65.field110[var80], -101, arg6[var80]));
                                }
                            } else if ((var65.field110[var78] & 16777215) != 0) {
                                arg4.method820(var84, var85, var86, var81, var82, var83, var65.field110[var78], var65.field110[var79], var65.field110[var80]);
                            }
                        }
                    }
                } else {
                    int var88 = super.field7341[arg2][arg1];
                    int var89 = super.field7341[arg2 + 1][arg1];
                    int var90 = super.field7341[arg2][arg1 + 1];
                    int var91 = super.field8116 * arg2;
                    int var92 = super.field8116 + var91;
                    int var93 = super.field8116 * arg1;
                    int var94 = super.field8116 + var93;
                    int var95 = (super.field7345 * var91 - (-(super.field7348 * var93) + -(super.field7347 * var88)) >> 15) + super.field7338;
                    int var96 = super.field7339 - -(super.field7359 * var93 + super.field7343 * var91 - -(super.field7342 * var88) >> 15);
                    int var97 = (super.field7340 * var91 - -(super.field7349 * var88) - -(super.field7346 * var93) >> 15) + super.field7351;
                    int var98 = super.field7338 - -(super.field7347 * var89 + super.field7348 * var93 + super.field7345 * var92 >> 15);
                    int var99 = super.field7339 - -(super.field7342 * var89 + super.field7359 * var93 + super.field7343 * var92 >> 15);
                    int var100 = (super.field7349 * var89 + super.field7340 * var92 - -(super.field7346 * var93) >> 15) + super.field7351;
                    int var101 = (super.field7348 * var94 + super.field7345 * var91 - -(super.field7347 * var90) >> 15) + super.field7338;
                    int var102 = (super.field7343 * var91 + super.field7359 * var94 + super.field7342 * var90 >> 15) + super.field7339;
                    int var103 = (super.field7346 * var94 + super.field7349 * var90 + super.field7340 * var91 >> 15) + super.field7351;
                    for (int var104 = 0; var104 < var65.field113; ++var104) {
                        int var105 = var104 * 3;
                        int var106 = var105 + 1;
                        int var107 = var106 + 1;
                        int var108 = arg7[var105];
                        int var109 = arg7[var106];
                        int var110 = arg7[var107];
                        int var111 = arg3[var105];
                        int var112 = arg3[var106];
                        int var113 = arg3[var107];
                        int var114 = arg6[var106] + arg6[var107] + arg6[var105];
                        if ((var108 - var109) * (-var112 + var113) + -((var111 - var112) * (-var109 + var110)) > 0) {
                            arg4.field1784 = var108 < 0 || var109 < 0 || ~var110 > -1 || arg4.field1777 < var108 || var109 > arg4.field1777 || ~var110 < ~arg4.field1777;
                            short var115 = var65.field108[var104];
                            if (var114 < 765) {
                                if (~var115 != 0 && this.method2938(super.field7358.field2262.method1762(var115, (byte) 45).field968)) {
                                    arg4.field1779 = 100;
                                }
                                if (var114 <= 0) {
                                    if (~var115 != 0) {
                                        arg4.method831(var111, var112, var113, var108, var109, var110, var65.field110[var105], var65.field110[var106], var65.field110[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                    } else if ((var65.field110[var105] & 16777215) != 0) {
                                        arg4.method820(var111, var112, var113, var108, var109, var110, var65.field110[var105], var65.field110[var106], var65.field110[var107]);
                                    }
                                } else if (var115 != -1) {
                                    arg4.method828(var111, var112, var113, var108, var109, var110, super.field7358.field2229, arg6[var105], arg6[var106], arg6[var107], var65.field110[var105], var65.field110[var106], var65.field110[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                } else if ((16777215 & var65.field110[var105]) != 0) {
                                    arg4.method820(var111, var112, var113, var108, var109, var110, class6.method24(super.field7358.field2229 | arg6[var105] << 24, (byte) 41, var65.field110[var105]), class6.method24(arg6[var106] << 24 | super.field7358.field2229, (byte) 40, var65.field110[var106]), class6.method24(super.field7358.field2229 | arg6[var107] << 24, (byte) 88, var65.field110[var107]));
                                }
                                arg4.field1779 = 0;
                            } else {
                                arg4.method829(var111, var112, var113, var108, var109, var110, super.field7358.field2229);
                            }
                        }
                    }
                }
            }
        }
    }
}
