import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class580 extends class192 {

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    private int field7898 = 6;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field7903 = new String[100];

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field7906 = 0;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field7902;
        if (arg2 != -12160) {
            this.method109(-41, (class418) null, 103);
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field2449 = arg1.method2396(-102) == 1;
            }
        } else {
            this.field7898 = arg1.method2396(2);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IB)[[I")
    public final int[][] method107(int arg0, byte arg1) {
        ++field7901;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int[][] var4 = this.method1251(0, arg0, (byte) 70);
            int[][] var5 = this.method1251(1, arg0, (byte) -68);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field7898;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class561.field7319; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = var19 - (-var17 - -(var17 * var19 >> 11));
                                                                var7[var16] = var22 - ((var20 * var22 >> 11) + -var20);
                                                                var8[var16] = var21 - (var18 * var21 >> 11) + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class561.field7319 < ~var23; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = ~var24 >= ~var28 ? -var24 + var28 : var24 - var28;
                                                            var7[var23] = ~var27 >= ~var29 ? -var27 + var29 : -var29 + var27;
                                                            var8[var23] = var25 < var26 ? -var25 + var26 : -var26 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class561.field7319; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = var31 > var32 ? var31 : var32;
                                                        var7[var30] = ~var33 > ~var36 ? var36 : var33;
                                                        var8[var30] = var34 < var35 ? var35 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class561.field7319 < ~var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = ~var41 >= ~var39 ? var41 : var39;
                                                    var7[var37] = ~var40 > ~var42 ? var40 : var42;
                                                    var8[var37] = var43 > var38 ? var38 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class561.field7319 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var45 != 0 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var7[var44] = var47 != 0 ? -((4096 - var13[var44] << 12) / var47) + 4096 : 0;
                                                var8[var44] = ~var46 != -1 ? 4096 - (-var14[var44] + 4096 << 12) / var46 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class561.field7319 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (4096 - var49) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class561.field7319 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 < 2048 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var8[var52] = var54 < 2048 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class561.field7319 > var56; ++var56) {
                                    var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class561.field7319 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var6[var57] = var59 == 0 ? 4096 : (var9[var57] << 12) / var59;
                                var7[var57] = ~var60 == -1 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = ~var58 != -1 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class561.field7319 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class561.field7319 < ~var62; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class561.field7319 < ~var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        int var64 = 49 % ((arg1 - -14) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field7905;
        if (arg1 > -123) {
            return null;
        } else {
            int[] var3 = super.field2448.method2978(arg0, (byte) -56);
            if (super.field2448.field7266) {
                int[] var4 = this.method1253(0, arg0, 0);
                int[] var5 = this.method1253(0, arg0, 1);
                int var6 = this.field7898;
                if (~var6 != -2) {
                    if (~var6 != -3) {
                        if (~var6 != -4) {
                            if (var6 != 4) {
                                if (var6 != 5) {
                                    if (var6 != 6) {
                                        if (var6 != 7) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; class561.field7319 > var7; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = -(var8 * var9 >> 11) + var9 - -var8;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class561.field7319 < ~var10; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = var11 < var12 ? -var11 + var12 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; var13 < class561.field7319; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~var16 > ~class561.field7319; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = var18 > var17 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~class561.field7319 < ~var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class561.field7319 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~var23 > ~class561.field7319; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; var25 < class561.field7319; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class561.field7319; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class561.field7319; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; class561.field7319 > var29; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class561.field7319; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class580() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)Ljk;")
    public static final class705 method3185(byte arg0, int arg1) {
        ++field7904;
        class705 var2 = (class705) class258.field3482.method3880((long) arg1, -92);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class517.field6774.method3346(-1, arg1, 0);
            if (var3 != null && ~var3.length < -2) {
                if (arg0 >= -35) {
                    method3187((byte) 113);
                }
                class705 var4 = class3.method10(var3, false);
                class258.field3482.method3881((long) arg1, (byte) 125, var4);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3186(String arg0, byte arg1) {
        ++field7900;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            String var2 = class315.method1841((byte) 118, arg0);
            if (var2 != null) {
                if (arg1 >= 29) {
                    for (int var3 = 0; var3 < class665.field9225; ++var3) {
                        String var4 = class405.field5160[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class315.method1841((byte) 113, var4);
                        if (var5 != null && var5.equals(var2)) {
                            --class665.field9225;
                            for (int var6 = var3; class665.field9225 > var6; ++var6) {
                                class405.field5160[var6] = class405.field5160[var6 - -1];
                                class329.field4274[var6] = class329.field4274[var6 + 1];
                                class565.field7387[var6] = class565.field7387[var6 + 1];
                                class636.field8849[var6] = class636.field8849[var6 + 1];
                                class509.field6673[var6] = class509.field6673[var6 + 1];
                                class51.field713[var6] = class51.field713[var6 + 1];
                            }
                            class352.field4527 = class166.field2089;
                            ++class77.field1046;
                            class11 var7 = class130.method931(class649.field9035, (byte) 54, class97.field1288);
                            var7.field114.method2352(true, class367.method2111(2, arg0));
                            var7.field114.method2374(arg0, -126);
                            class100.method760(var7, -122);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(B)V")
    public static void method3187(byte arg0) {
        field7903 = null;
        if (arg0 != 46) {
            field7903 = null;
        }
    }
}
