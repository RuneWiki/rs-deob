import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class369 extends class40 {

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    private int field5251 = 6;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "Ljava/awt/Frame;")
    public static Frame field5255;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "Z")
    public static boolean field5257;

    static {
        new class349("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V", line = 3)
    public class369() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 7)
    public static final void method2366(int arg0) {
        class213.field3014.method1443(false);
        ++field5250;
        if (arg0 == -13) {
            class20.field269 = null;
            class439.field6279 = 1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lbr;IIB)V", line = 27)
    public static final void method2367(class223 arg0, int arg1, int arg2, byte arg3) {
        ++field5254;
        class376.field5362 = arg2;
        class247.field3697 = arg0;
        class299.field4345 = arg1;
        int var4 = -100 / ((arg3 - 73) / 45);
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V", line = 39)
    public static final void method2368(int arg0) {
        class426.field6083.method2755(0);
        ++field5249;
        if (arg0 > -81) {
            field5257 = true;
        }
        for (class382 var1 = (class382) class228.field3392.method2752(-99); var1 != null; var1 = (class382) class228.field3392.method2754(-1)) {
            if (~var1.field5420 > -1001) {
                var1.method2660((byte) 115);
                class426.field6083.method2756(49, var1);
            }
        }
        class426.field6083.method2750(class228.field3392, (byte) -22);
        if (class327.field4749 == null) {
            if (~class73.field948 >= -1) {
                int var2 = -1;
                if (class252.field3744 != null) {
                    var2 = class252.field3744.method474((byte) -120);
                }
                if (class359.field5185) {
                    if (~var2 == 0) {
                        int var3 = class270.field3949.method536(0);
                        int var4 = class270.field3949.method543(7);
                        if (var3 < class129.field1832 + -10 || var3 > class264.field3882 + class129.field1832 + 10 || ~var4 > ~(class352.field5116 + -10) || var4 > class352.field5116 + 10 - -class291.field4227) {
                            class359.field5185 = false;
                            class198.method1404(class291.field4227, class352.field5116, class129.field1832, class264.field3882, false);
                        }
                    }
                    if (var2 == 0) {
                        int var5 = class129.field1832;
                        int var6 = class352.field5116;
                        int var7 = class264.field3882;
                        int var8 = class252.field3744.method476(-7);
                        int var9 = class252.field3744.method471((byte) -96);
                        int var10 = -1;
                        for (int var11 = 0; var11 < class381.field5412; ++var11) {
                            if (!class19.field253) {
                                int var15 = (class381.field5412 - 1 - var11) * 16 + var6 + 31;
                                if (var5 < var8 && var5 + var7 > var8 && var15 + -13 < var9 && ~(var15 + 3) < ~var9) {
                                    var10 = var11;
                                }
                            } else {
                                int var16 = var6 - (-((-1 - var11 + class381.field5412) * 16) + -33);
                                if (~var8 < ~var5 && ~var8 > ~(var5 + var7) && ~(var16 - 13) > ~var9 && ~(var16 + 4) < ~var9) {
                                    var10 = var11;
                                }
                            }
                        }
                        if (var10 != -1) {
                            int var12 = 0;
                            class189 var13 = new class189(class228.field3392);
                            for (class382 var14 = (class382) var13.method1354(-14082); var14 != null; var14 = (class382) var13.method1356(-28309)) {
                                if (var10 == var12) {
                                    class80.method475((byte) -6, var14);
                                }
                                ++var12;
                            }
                        }
                        class359.field5185 = false;
                        class198.method1404(class291.field4227, class352.field5116, class129.field1832, class264.field3882, false);
                        return;
                    }
                } else {
                    if (~class209.field2987 <= -1) {
                        var2 = class209.field2987;
                    }
                    class209.field2987 = -1;
                    if (var2 == 0 && (~class335.field4856 == -2 && ~class381.field5412 < -3 || class311.method2096(2))) {
                        var2 = 2;
                    }
                    if (var2 == 2 && ~class381.field5412 < -1) {
                        if (class252.field3744 != null) {
                            class438.method2730((byte) 15, class252.field3744.method471((byte) 96), class252.field3744.method476(-125));
                        } else {
                            class438.method2730((byte) 15, class260.field3849, class378.field5385);
                        }
                    }
                    if (~var2 != -1 || class381.field5412 <= 0) {
                        return;
                    }
                    class429.method2674(65535);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILlf;)V", line = 192)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field5256;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field550 = ~arg2.method837(true) == -2;
            }
        } else {
            this.field5251 = arg2.method837(true);
        }
        if (arg1 <= 79) {
            method2366(18);
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V", line = 226)
    public static void method2369(int arg0) {
        field5255 = null;
        if (arg0 != 2) {
            field5255 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIBII)V", line = 240)
    public static final void method2370(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 83) {
            method2366(-63);
        }
        ++field5247;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class209.method1485(class231.field3415, 1667, class408.field5789, arg1 + arg3);
        int var10 = class209.method1485(class231.field3415, 1667, class408.field5789, -arg3 + arg1);
        class5.method17(class440.field6288[arg0], var9, arg4, (byte) 95, var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (~var7 < -1) {
                --var6;
                var7 -= var6 << 1;
                int var11 = -var6 + arg0;
                int var12 = arg0 + var6;
                if (class245.field3659 <= var12 && ~class240.field3547 <= ~var11) {
                    int var13 = class209.method1485(class231.field3415, arg2 ^ 1744, class408.field5789, arg1 + var5);
                    int var14 = class209.method1485(class231.field3415, 1667, class408.field5789, -var5 + arg1);
                    if (~var12 >= ~class240.field3547) {
                        class5.method17(class440.field6288[var12], var13, arg4, (byte) 127, var14);
                    }
                    if (class245.field3659 <= var11) {
                        class5.method17(class440.field6288[var11], var13, arg4, (byte) 123, var14);
                    }
                }
            }
            ++var5;
            int var15 = arg0 - var5;
            int var16 = arg0 - -var5;
            if (~class245.field3659 >= ~var16 && var15 <= class240.field3547) {
                int var17 = class209.method1485(class231.field3415, arg2 ^ 1744, class408.field5789, arg1 + var6);
                int var18 = class209.method1485(class231.field3415, arg2 + 1584, class408.field5789, -var6 + arg1);
                if (var16 <= class240.field3547) {
                    class5.method17(class440.field6288[var16], var17, arg4, (byte) 72, var18);
                }
                if (var15 >= class245.field3659) {
                    class5.method17(class440.field6288[var15], var17, arg4, (byte) 95, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[[I", line = 318)
    public final int[][] method112(int arg0, int arg1) {
        ++field5248;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int[][] var4 = this.method261(0, 28552, arg1);
            int[][] var5 = this.method261(1, 28552, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field5251;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class410.field5886; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = var18 - (var18 * var20 >> 11) + var20;
                                                                var7[var16] = var19 + var21 - (var19 * var21 >> 11);
                                                                var8[var16] = -(var17 * var22 >> 11) + var22 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class410.field5886 < ~var23; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var24 >= ~var26 ? -var24 + var26 : var24 - var26;
                                                            var7[var23] = ~var28 > ~var25 ? -var28 + var25 : -var25 + var28;
                                                            var8[var23] = var27 > var29 ? -var29 + var27 : -var27 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class410.field5886; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = ~var32 <= ~var35 ? var32 : var35;
                                                        var7[var30] = ~var33 > ~var36 ? var36 : var33;
                                                        var8[var30] = var31 > var34 ? var31 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class410.field5886; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var38 < ~var43 ? var43 : var38;
                                                    var7[var37] = ~var42 <= ~var39 ? var39 : var42;
                                                    var8[var37] = var41 <= var40 ? var41 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class410.field5886; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = var47 != 0 ? -((4096 - var12[var44] << 12) / var47) + 4096 : 0;
                                                var7[var44] = ~var46 != -1 ? -((-var13[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var8[var44] = ~var45 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class410.field5886 < ~var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = ~var50 != -4097 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = ~var51 != -4097 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class410.field5886 > var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 <= -2049 ? -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var7[var52] = var55 < 2048 ? var10[var52] * var55 >> 11 : -((4096 - var10[var52]) * (4096 - var55) >> 11) + 4096;
                                        var8[var52] = var53 >= 2048 ? 4096 - ((-var11[var52] + 4096) * (-var53 + 4096) >> 11) : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class410.field5886; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class410.field5886 < ~var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var58 == -1 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class410.field5886; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class410.field5886 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class410.field5886; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        if (arg0 != 1) {
            field5257 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(BI)V", line = 637)
    public static final void method2371(byte arg0, int arg1) {
        class198.field2833.method91(4, arg1);
        ++field5252;
        if (arg0 <= 5) {
            field5257 = true;
        }
        class293.field4238.method91(4, arg1);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)[I", line = 649)
    public final int[] method44(byte arg0, int arg1) {
        ++field5253;
        int[] var3 = super.field551.method185(65280, arg1);
        if (arg0 > -20) {
            this.field5251 = 3;
        }
        if (super.field551.field441) {
            int[] var4 = this.method266((byte) -116, arg1, 0);
            int[] var5 = this.method266((byte) -116, arg1, 1);
            int var6 = this.field5251;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class410.field5886; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class410.field5886; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 <= ~var12 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class410.field5886 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 > var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class410.field5886; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 >= ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class410.field5886; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class410.field5886 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class410.field5886; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? 4096 - ((4096 - var24) * (-var4[var23] + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class410.field5886 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class410.field5886 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class410.field5886; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class410.field5886; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class410.field5886; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }
}
