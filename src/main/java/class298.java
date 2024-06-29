import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class298 extends class518 {

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    private int field4157 = 6;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field4164 = new String[] { method2394(method2393("\u0010{G\u0014\u0017")), method2394(method2393("\u000bf\u00059")), method2394(method2393("\u0010{G\u0017\u0017")), method2394(method2393("\u001e=G{B")), method2394(method2393("\u0010{G\u0016\u0017")), method2394(method2393("\u0010{G\u0011\u0017")), method2394(method2393("\u0010{G\u0012\u0017")), method2394(method2393("\u0010{G\u0010\u0017")) };

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "[I")
    public static int[] field4161 = new int[4096];

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "[I")
    public static int[] field4162 = new int[1];

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Ltea;")
    public static class272 field4155;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V", line = 3)
    public static final void method2390(String arg0, int arg1, String arg2) {
        try {
            ++field4163;
            if (~arg2.length() >= -321) {
                if (class586.method4335((byte) 120)) {
                    if (arg1 != 3086) {
                        field4161 = null;
                    }
                    class60.field911.method5604(1350);
                    class525.method3991((byte) -111);
                    class304.field4234 = arg2;
                    class337.field4888 = arg0;
                    class699.method5035(5, 31754);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4164[2] + (arg0 != null ? field4164[3] : field4164[1]) + ',' + arg1 + ',' + (arg2 != null ? field4164[3] : field4164[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjc;I)V", line = 29)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    super.field7565 = ~arg1.method5128(arg2 + 3) == -2;
                }
            } else {
                this.field4157 = arg1.method5128(0);
            }
            ++field4159;
            if (arg2 != -3) {
                method2391((class782) null, -14, (byte) -113, 70);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4164[4] + arg0 + ',' + (arg1 != null ? field4164[3] : field4164[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[[I", line = 67)
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field4160;
            if (arg0 != 0) {
                field4161 = null;
            }
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (super.field7575.field3416) {
                int[][] var4 = this.method3943(0, arg1, -23583);
                int[][] var5 = this.method3943(1, arg1, -23583);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field4157;
                if (var15 != 1) {
                    if (~var15 != -3) {
                        if (~var15 != -4) {
                            if (~var15 != -5) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (var15 != 7) {
                                            if (~var15 != -9) {
                                                if (var15 != 9) {
                                                    if (~var15 != -11) {
                                                        if (var15 != 11) {
                                                            if (var15 == 12) {
                                                                for (int var57 = 0; class110.field1436 > var57; ++var57) {
                                                                    int var58 = var14[var57];
                                                                    int var59 = var10[var57];
                                                                    int var60 = var9[var57];
                                                                    int var61 = var13[var57];
                                                                    int var62 = var12[var57];
                                                                    int var63 = var11[var57];
                                                                    var6[var57] = var60 - (var60 * var62 >> 11) + var62;
                                                                    var7[var57] = -(var59 * var61 >> 11) + var59 + var61;
                                                                    var8[var57] = -(var58 * var63 >> 11) + var58 + var63;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var50 = 0; ~class110.field1436 < ~var50; ++var50) {
                                                                int var51 = var14[var50];
                                                                int var52 = var13[var50];
                                                                int var53 = var10[var50];
                                                                int var54 = var9[var50];
                                                                int var55 = var12[var50];
                                                                int var56 = var11[var50];
                                                                var6[var50] = ~var54 < ~var55 ? -var55 + var54 : -var54 + var55;
                                                                var7[var50] = var52 >= var53 ? -var53 + var52 : -var52 + var53;
                                                                var8[var50] = ~var56 < ~var51 ? -var51 + var56 : -var56 + var51;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var43 = 0; ~var43 > ~class110.field1436; ++var43) {
                                                            int var44 = var10[var43];
                                                            int var45 = var13[var43];
                                                            int var46 = var12[var43];
                                                            int var47 = var14[var43];
                                                            int var48 = var9[var43];
                                                            int var49 = var11[var43];
                                                            var6[var43] = var46 >= var48 ? var46 : var48;
                                                            var7[var43] = ~var45 <= ~var44 ? var45 : var44;
                                                            var8[var43] = ~var47 <= ~var49 ? var47 : var49;
                                                        }
                                                    }
                                                } else {
                                                    for (int var36 = 0; ~class110.field1436 < ~var36; ++var36) {
                                                        int var37 = var10[var36];
                                                        int var38 = var13[var36];
                                                        int var39 = var14[var36];
                                                        int var40 = var11[var36];
                                                        int var41 = var9[var36];
                                                        int var42 = var12[var36];
                                                        var6[var36] = var41 >= var42 ? var42 : var41;
                                                        var7[var36] = ~var38 >= ~var37 ? var38 : var37;
                                                        var8[var36] = ~var40 > ~var39 ? var40 : var39;
                                                    }
                                                }
                                            } else {
                                                for (int var32 = 0; class110.field1436 > var32; ++var32) {
                                                    int var33 = var10[var32];
                                                    int var34 = var9[var32];
                                                    int var35 = var11[var32];
                                                    var6[var32] = var34 == 0 ? 0 : -((4096 - var12[var32] << 12) / var34) + 4096;
                                                    var7[var32] = var33 != 0 ? -((4096 - var13[var32] << 12) / var33) + 4096 : 0;
                                                    var8[var32] = var35 != 0 ? -((-var14[var32] + 4096 << 12) / var35) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var28 = 0; ~class110.field1436 < ~var28; ++var28) {
                                                int var29 = var9[var28];
                                                int var30 = var10[var28];
                                                int var31 = var11[var28];
                                                var6[var28] = ~var29 != -4097 ? (var12[var28] << 12) / (-var29 + 4096) : 4096;
                                                var7[var28] = ~var30 != -4097 ? (var13[var28] << 12) / (4096 - var30) : 4096;
                                                var8[var28] = var31 != 4096 ? (var14[var28] << 12) / (-var31 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var24 = 0; class110.field1436 > var24; ++var24) {
                                            int var25 = var14[var24];
                                            int var26 = var12[var24];
                                            int var27 = var13[var24];
                                            var6[var24] = ~var26 > -2049 ? var9[var24] * var26 >> 11 : -((-var9[var24] + 4096) * (-var26 + 4096) >> 11) + 4096;
                                            var7[var24] = var27 >= 2048 ? -((4096 - var27) * (-var10[var24] + 4096) >> 11) + 4096 : var10[var24] * var27 >> 11;
                                            var8[var24] = var25 < 2048 ? var11[var24] * var25 >> 11 : -((4096 - var11[var24]) * (-var25 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class110.field1436; ++var23) {
                                        var6[var23] = 4096 - ((4096 - var12[var23]) * (-var9[var23] + 4096) >> 12);
                                        var7[var23] = 4096 - ((4096 - var13[var23]) * (-var10[var23] + 4096) >> 12);
                                        var8[var23] = -((-var11[var23] + 4096) * (-var14[var23] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var19 = 0; class110.field1436 > var19; ++var19) {
                                    int var20 = var13[var19];
                                    int var21 = var14[var19];
                                    int var22 = var12[var19];
                                    var6[var19] = var22 == 0 ? 4096 : (var9[var19] << 12) / var22;
                                    var7[var19] = var20 == 0 ? 4096 : (var10[var19] << 12) / var20;
                                    var8[var19] = ~var21 != -1 ? (var11[var19] << 12) / var21 : 4096;
                                }
                            }
                        } else {
                            for (int var18 = 0; ~var18 > ~class110.field1436; ++var18) {
                                var6[var18] = var9[var18] * var12[var18] >> 12;
                                var7[var18] = var10[var18] * var13[var18] >> 12;
                                var8[var18] = var11[var18] * var14[var18] >> 12;
                            }
                        }
                    } else {
                        for (int var17 = 0; ~var17 > ~class110.field1436; ++var17) {
                            var6[var17] = var9[var17] + -var12[var17];
                            var7[var17] = var10[var17] - var13[var17];
                            var8[var17] = var11[var17] - var14[var17];
                        }
                    }
                } else {
                    for (int var16 = 0; ~class110.field1436 < ~var16; ++var16) {
                        var6[var16] = var9[var16] + var12[var16];
                        var7[var16] = var10[var16] + var13[var16];
                        var8[var16] = var11[var16] + var14[var16];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var65) {
            throw class665.method4799(var65, field4164[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[I", line = 385)
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field4156;
            int[] var3 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int[] var4 = this.method3944(arg0, 0, (byte) 73);
                int[] var5 = this.method3944(arg0, 1, (byte) 73);
                int var6 = this.field4157;
                if (~var6 != -2) {
                    if (~var6 != -3) {
                        if (~var6 != -4) {
                            if (var6 != 4) {
                                if (var6 != 5) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (~var6 != -12) {
                                                            if (~var6 == -13) {
                                                                for (int var28 = 0; var28 < class110.field1436; ++var28) {
                                                                    int var29 = var5[var28];
                                                                    int var30 = var4[var28];
                                                                    var3[var28] = -(var29 * var30 >> 11) + var29 + var30;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var25 = 0; var25 < class110.field1436; ++var25) {
                                                                int var26 = var5[var25];
                                                                int var27 = var4[var25];
                                                                var3[var25] = var26 < var27 ? -var26 + var27 : -var27 + var26;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var22 = 0; class110.field1436 > var22; ++var22) {
                                                            int var23 = var5[var22];
                                                            int var24 = var4[var22];
                                                            var3[var22] = ~var23 > ~var24 ? var24 : var23;
                                                        }
                                                    }
                                                } else {
                                                    for (int var19 = 0; ~var19 > ~class110.field1436; ++var19) {
                                                        int var20 = var5[var19];
                                                        int var21 = var4[var19];
                                                        var3[var19] = var21 >= var20 ? var20 : var21;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; ~var17 > ~class110.field1436; ++var17) {
                                                    int var18 = var4[var17];
                                                    var3[var17] = ~var18 != -1 ? -((4096 - var5[var17] << 12) / var18) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var15 = 0; ~var15 > ~class110.field1436; ++var15) {
                                                int var16 = var4[var15];
                                                var3[var15] = var16 == 4096 ? 4096 : (var5[var15] << 12) / (-var16 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var13 = 0; ~class110.field1436 < ~var13; ++var13) {
                                            int var14 = var5[var13];
                                            var3[var13] = ~var14 > -2049 ? var4[var13] * var14 >> 11 : -((4096 - var14) * (-var4[var13] + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var12 = 0; ~class110.field1436 < ~var12; ++var12) {
                                        var3[var12] = -((-var4[var12] + 4096) * (-var5[var12] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var10 = 0; ~var10 > ~class110.field1436; ++var10) {
                                    int var11 = var5[var10];
                                    var3[var10] = var11 == 0 ? 4096 : (var4[var10] << 12) / var11;
                                }
                            }
                        } else {
                            for (int var9 = 0; ~var9 > ~class110.field1436; ++var9) {
                                var3[var9] = var4[var9] * var5[var9] >> 12;
                            }
                        }
                    } else {
                        for (int var8 = 0; ~class110.field1436 < ~var8; ++var8) {
                            var3[var8] = var4[var8] + -var5[var8];
                        }
                    }
                } else {
                    for (int var7 = 0; class110.field1436 > var7; ++var7) {
                        var3[var7] = var4[var7] + var5[var7];
                    }
                }
            }
            int var31 = -127 / ((arg1 - -57) / 55);
            return var3;
        } catch (RuntimeException var33) {
            throw class665.method4799(var33, field4164[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 631)
    public class298() {
        super(2, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lvo;IBI)V", line = 639)
    public static final void method2391(class782 arg0, int arg1, byte arg2, int arg3) {
        try {
            ++field4158;
            class789.field11387 = arg0;
            class652.field9266 = arg3;
            class78.field1098 = arg1;
            if (arg2 != -86) {
                method2391((class782) null, 34, (byte) 75, 51);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4164[7] + (arg0 != null ? field4164[3] : field4164[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V", line = 652)
    public static void method2392(byte arg0) {
        try {
            int var1 = -124 / ((arg0 - -51) / 33);
            field4155 = null;
            field4162 = null;
            field4161 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4164[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2393(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2394(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 101;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
