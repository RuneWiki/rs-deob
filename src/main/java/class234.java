import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class234 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4133 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4137 = 0;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lcg;")
    public static class43 field4138 = new class43(0, 0);

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Lsf;")
    public static class108 field4139 = class140.method973(255, "hint_mapedge");

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)I", line = 4)
    public static final int method1629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        field4132++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg4;
            arg4 = var8;
        }
        if (arg1 != -10660) {
            method1631(-52);
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 7 + 1 - (arg0 + arg3);
        } else if (var7 == 2) {
            return 1 + 7 - arg4 - arg6;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[Lfk;[[F[[BI[[I[[F[[FI[[B[[B[[B)V", line = 38)
    public static final void method1630(int arg0, class46[] arg1, float[][] arg2, byte[][] arg3, int arg4, int[][] arg5, float[][] arg6, float[][] arg7, int arg8, byte[][] arg9, byte[][] arg10, byte[][] arg11) {
        int var12 = 0;
        if (arg8 <= 89) {
            method1633((byte) 31);
        }
        while (arg0 > var12) {
            class46 var13 = arg1[var12];
            if (var13.field671 == arg4) {
                class111 var14 = new class111();
                int var15 = (var13.field678 >> 7) - var13.field670;
                int var16 = 0;
                int var17 = (var13.field674 >> 7) - var13.field670;
                if (var17 < 0) {
                    var16 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field674 >> 7) + var13.field670;
                if (var18 > 103) {
                    var18 = 103;
                }
                int var19 = var17;
                while (true) {
                    if (var19 > var18) {
                        int var56 = 0;
                        var14.method802();
                        if ((var13.field674 >> 7) - var13.field670 < 0) {
                            var56 -= (var13.field674 >> 7) - var13.field670;
                        }
                        for (int var57 = var17; var57 <= var18; var57++) {
                            short var58 = var13.field668[var56];
                            int var59 = var15 + (var58 >> 8);
                            int var60 = (var58 & 0xFF) + var59 - 1;
                            if (var60 > 103) {
                                var60 = 103;
                            }
                            if (var59 < 0) {
                                var59 = 0;
                            }
                            for (int var61 = var59; var61 <= var60; var61++) {
                                int var62 = arg11[var61][var57] & 0xFF;
                                byte var63 = arg3[var61][var57];
                                int var64 = arg9[var61][var57] & 0xFF;
                                boolean var65 = false;
                                if (var62 == 0) {
                                    if (var64 == 0) {
                                        continue;
                                    }
                                    class7 var66 = class290.method2071((byte) -16, var64 - 1);
                                    if (var66.field89 == -1) {
                                        continue;
                                    }
                                    if (arg10[var61][var57] != 0) {
                                        class1.method10(92, var61, arg2, var13, class14.field166[arg10[var61][var57]], var14, arg7, arg5, arg3[var61][var57], arg6, var57);
                                        continue;
                                    }
                                } else if (var64 != 0) {
                                    class7 var67 = class290.method2071((byte) -16, var64 - 1);
                                    if (var67.field89 == -1) {
                                        class1.method10(86, var61, arg2, var13, class210.field3760[arg10[var61][var57]], var14, arg7, arg5, arg3[var61][var57], arg6, var57);
                                        continue;
                                    }
                                    byte var68 = arg10[var61][var57];
                                    if (var68 != 0) {
                                        var65 = true;
                                    }
                                }
                                class326 var69 = class6.method38(arg4, var61, var57);
                                if (var69 != null) {
                                    int var70 = (int) (var69.field5563 >> 14) & 0x3F;
                                    if (var70 == 9) {
                                        int[] var71 = null;
                                        int var72 = (int) (var69.field5563 >> 20) & 0x3;
                                        if ((var72 & 0x1) == 0) {
                                            boolean var73 = var61 - 1 >= var59;
                                            if (!var73 && var18 >= var57 + 1) {
                                                short var74 = var13.field668[var56 + 1];
                                                int var75 = (var74 >> 8) + var15;
                                                int var76 = var75 + (var74 & 0xFF);
                                                var73 = var75 < var61 && var61 < var76;
                                            }
                                            boolean var77 = var61 + 1 <= var60;
                                            if (!var77 && var57 - 1 >= var17) {
                                                short var78 = var13.field668[var56 - 1];
                                                int var79 = (var78 >> 8) + var15;
                                                int var80 = var79 + (var78 & 0xFF);
                                                var77 = var61 > var79 && var61 < var80;
                                            }
                                            if (var73 && var77) {
                                                var71 = class14.field166[0];
                                            } else if (var73) {
                                                var63 = 1;
                                                var71 = class14.field166[1];
                                            } else if (var77) {
                                                var63 = 3;
                                                var71 = class14.field166[1];
                                            }
                                        } else {
                                            boolean var81 = var61 + 1 <= var60;
                                            boolean var82 = (var61 - 1) >= var59;
                                            if (!var82 && var17 <= var57 - 1) {
                                                short var83 = var13.field668[var56 - 1];
                                                int var84 = var15 + (var83 >> 8);
                                                int var85 = (var83 & 0xFF) + var84;
                                                var82 = var84 < var61 && var61 < var85;
                                            }
                                            if (!var81 && var18 >= var57 + 1) {
                                                short var86 = var13.field668[var56 + 1];
                                                int var87 = (var86 >> 8) + var15;
                                                int var88 = (var86 & 0xFF) + var87;
                                                var81 = var61 > var87 && var88 > var61;
                                            }
                                            if (var82 && var81) {
                                                var71 = class14.field166[0];
                                            } else if (var82) {
                                                var71 = class14.field166[1];
                                                var63 = 0;
                                            } else if (var81) {
                                                var63 = 2;
                                                var71 = class14.field166[1];
                                            }
                                        }
                                        if (var71 != null) {
                                            class1.method10(40, var61, arg2, var13, var71, var14, arg7, arg5, var63, arg6, var57);
                                        }
                                        continue;
                                    }
                                }
                                if (var65) {
                                    class1.method10(96, var61, arg2, var13, class210.field3760[arg10[var61][var57]], var14, arg7, arg5, arg3[var61][var57], arg6, var57);
                                    class1.method10(79, var61, arg2, var13, class14.field166[arg10[var61][var57]], var14, arg7, arg5, arg3[var61][var57], arg6, var57);
                                } else {
                                    class1.method10(118, var61, arg2, var13, class14.field166[0], var14, arg7, arg5, var63, arg6, var57);
                                }
                            }
                            var56++;
                        }
                        if (var14.field1947 > 0 && var14.field1946 > 0) {
                            var14.method801();
                            var13.field680 = var14;
                        }
                        break;
                    }
                    short var20 = var13.field668[var16];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg11[var23][var19] & 0xFF;
                        int var25 = arg9[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class7 var31 = class290.method2071((byte) -16, var25 - 1);
                            if (var31.field89 == -1) {
                                continue;
                            }
                            if (arg10[var23][var19] != 0) {
                                int[] var32 = class14.field166[arg10[var23][var19]];
                                var14.field1933 += ((var32.length >> 1) - 2) * 3;
                                var14.field1935 += var32.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class7 var27 = class290.method2071((byte) -16, var25 - 1);
                            if (var27.field89 == -1) {
                                byte var28 = arg10[var23][var19];
                                if (var28 != 0) {
                                    int[] var29 = class210.field3760[var28];
                                    var14.field1933 += (var29.length >> 1) * 3 - 6;
                                    var14.field1935 += var29.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg10[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class326 var33 = class6.method38(arg4, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field5563 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var38 = null;
                                int var39 = (int) (var33.field5563 >> 20) & 0x3;
                                if ((var39 & 0x1) == 0) {
                                    boolean var48 = (var23 - 1) >= var21;
                                    if (!var48 && var18 >= (var19 + 1)) {
                                        short var49 = var13.field668[var16 + 1];
                                        int var50 = (var49 >> 8) + var15;
                                        int var51 = var50 + (var49 & 0xFF);
                                        var48 = var50 < var23 && var23 < var51;
                                    }
                                    boolean var52 = var23 + 1 <= var22;
                                    if (!var52 && (var19 - 1) >= var17) {
                                        short var53 = var13.field668[var16 - 1];
                                        int var54 = (var53 >> 8) + var15;
                                        int var55 = var54 + (var53 & 0xFF);
                                        var52 = var23 > var54 && var23 < var55;
                                    }
                                    if (var48 && var52) {
                                        var38 = class14.field166[0];
                                    } else if (var48) {
                                        var38 = class14.field166[1];
                                    } else if (var52) {
                                        var38 = class14.field166[1];
                                    }
                                } else {
                                    boolean var40 = var22 >= (var23 + 1);
                                    boolean var41 = var21 <= (var23 - 1);
                                    if (!var41 && (var19 - 1) >= var17) {
                                        short var42 = var13.field668[var16 - 1];
                                        int var43 = var15 + (var42 >> 8);
                                        int var44 = (var42 & 0xFF) + var43;
                                        var41 = var23 > var43 && var23 < var44;
                                    }
                                    if (!var40 && var18 >= (var19 + 1)) {
                                        short var45 = var13.field668[var16 + 1];
                                        int var46 = (var45 >> 8) + var15;
                                        int var47 = (var45 & 0xFF) + var46;
                                        var40 = var23 > var46 && var23 < var47;
                                    }
                                    if (var41 && var40) {
                                        var38 = class14.field166[0];
                                    } else if (var41) {
                                        var38 = class14.field166[1];
                                    } else if (var40) {
                                        var38 = class14.field166[1];
                                    }
                                }
                                if (var38 != null) {
                                    var14.field1933 += ((var38.length >> 1) - 2) * 3;
                                    var14.field1935 += var38.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var36 = class14.field166[arg10[var23][var19]];
                            int[] var37 = class210.field3760[arg10[var23][var19]];
                            var14.field1933 += (var36.length >> 1) * 3 - 6;
                            var14.field1933 += (var37.length >> 1) * 3 - 6;
                            var14.field1935 += var36.length >> 1;
                            var14.field1935 += var37.length >> 1;
                        } else {
                            int[] var35 = class14.field166[0];
                            var14.field1933 += (var35.length >> 1) * 3 - 6;
                            var14.field1935 += var35.length >> 1;
                        }
                    }
                    var16++;
                    var19++;
                }
            }
            var12++;
        }
        field4134++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 571)
    public static void method1631(int arg0) {
        field4138 = null;
        if (arg0 != 31124) {
            field4139 = (class108) null;
        }
        field4139 = null;
        field4133 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I", line = 583)
    public static final int method1632(int arg0, int arg1) {
        field4135++;
        int var2 = 37 % ((-arg1 - 24) / 38);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 601)
    public static final void method1633(byte arg0) {
        field4136++;
        class223.field3945.method639(arg0 - 221);
        class157.field2829.method639(-112);
        class176.field3200.method639(-115);
        if (arg0 == 103) {
            class151.field2732.method639(arg0 - 219);
        }
    }
}
