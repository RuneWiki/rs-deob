import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class247 {

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public int field3688 = 0;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field3683 = 16;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public int field3685 = -1;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public int field3681 = 1190717;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Z")
    public boolean field3680 = false;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public int field3682 = -1;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public int field3692 = 128;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public int field3687 = -1;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Z")
    public boolean field3695 = true;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field3693 = 8;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Z")
    public boolean field3694 = true;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Lbr;")
    public static class223 field3690 = null;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Lbr;")
    public static class223 field3697 = null;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Z")
    public static boolean field3703;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Ltj;")
    public static class108 field3702;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "[I")
    public static int[] field3701;

    static {
        new class349("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field3703 = true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([Z[[BIII[[BLli;II[[BILph;BLvq;)V", line = 6)
    public static final void method1720(boolean[] arg0, byte[][] arg1, int arg2, int arg3, int arg4, byte[][] arg5, class247 arg6, int arg7, int arg8, byte[][] arg9, int arg10, class386 arg11, byte arg12, class269 arg13) {
        if (arg12 <= 103) {
            method1721(98);
        }
        field3696++;
        if (arg6 != null && arg11 != null || arg11 != null && arg8 == 12 || arg6 != null && arg8 == 0) {
            boolean[] var14 = arg6 != null && arg6.field3680 ? class284.field4124[arg8] : class58.field780[arg8];
            if (arg4 > 0) {
                if (arg3 > 0) {
                    int var15 = arg1[arg3 - 1][arg4 - 1] & 0xFF;
                    if (var15 > 0) {
                        class247 var16 = class377.method2408((byte) 67, var15 - 1);
                        if (var16.field3688 != -1 && var16.field3680) {
                            byte var17 = arg9[arg3 - 1][arg4 - 1];
                            int var18 = arg5[arg3 - 1][arg4 - 1] * 2 + 4 & 0x7;
                            int var19 = class150.method1113(var16, arg13, (byte) -116);
                            if (class297.field4325[var17][var18]) {
                                class93.field1192[0] = var16.field3688;
                                class102.field1290[0] = var19;
                                class305.field4450[0] = arg13.method864() ? var16.field3682 : var16.field3687;
                                class138.field2119[0] = var16.field3692;
                                class347.field5051[0] = var16.field3693;
                                class423.field6037[0] = 256;
                            }
                        }
                    }
                }
                if (arg7 - 1 > arg3) {
                    int var20 = arg1[arg3 + 1][arg4 - 1] & 0xFF;
                    if (var20 > 0) {
                        class247 var21 = class377.method2408((byte) 67, var20 - 1);
                        if (var21.field3688 != -1 && var21.field3680) {
                            byte var22 = arg9[arg3 + 1][arg4 - 1];
                            int var23 = arg5[arg3 + 1][arg4 - 1] * 2 + 6 & 0x7;
                            int var24 = class150.method1113(var21, arg13, (byte) 78);
                            if (class297.field4325[var22][var23]) {
                                class93.field1192[2] = var21.field3688;
                                class102.field1290[2] = var24;
                                class305.field4450[2] = arg13.method864() ? var21.field3682 : var21.field3687;
                                class138.field2119[2] = var21.field3692;
                                class347.field5051[2] = var21.field3693;
                                class423.field6037[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg4 < arg2 - 1) {
                if (arg3 > 0) {
                    int var25 = arg1[arg3 - 1][arg4 + 1] & 0xFF;
                    if (var25 > 0) {
                        class247 var26 = class377.method2408((byte) 67, var25 - 1);
                        if (var26.field3688 != -1 && var26.field3680) {
                            byte var27 = arg9[arg3 - 1][arg4 + 1];
                            int var28 = arg5[arg3 - 1][arg4 + 1] * 2 + 2 & 0x7;
                            int var29 = class150.method1113(var26, arg13, (byte) -119);
                            if (class297.field4325[var27][var28]) {
                                class93.field1192[6] = var26.field3688;
                                class102.field1290[6] = var29;
                                class305.field4450[6] = arg13.method864() ? var26.field3682 : var26.field3687;
                                class138.field2119[6] = var26.field3692;
                                class347.field5051[6] = var26.field3693;
                                class423.field6037[6] = 64;
                            }
                        }
                    }
                }
                if (arg3 < arg7 - 1) {
                    int var30 = arg1[arg3 + 1][arg4 + 1] & 0xFF;
                    if (var30 > 0) {
                        class247 var31 = class377.method2408((byte) 67, var30 - 1);
                        if (var31.field3688 != -1 && var31.field3680) {
                            byte var32 = arg9[arg3 + 1][arg4 + 1];
                            int var33 = arg5[arg3 + 1][arg4 + 1] * 2 & 0x7;
                            int var34 = class150.method1113(var31, arg13, (byte) 119);
                            if (class297.field4325[var32][var33]) {
                                class93.field1192[4] = var31.field3688;
                                class102.field1290[4] = var34;
                                class305.field4450[4] = arg13.method864() ? var31.field3682 : var31.field3687;
                                class138.field2119[4] = var31.field3692;
                                class347.field5051[4] = var31.field3693;
                                class423.field6037[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg4 > 0) {
                int var35 = arg1[arg3][arg4 - 1] & 0xFF;
                if (var35 > 0) {
                    class247 var36 = class377.method2408((byte) 67, var35 - 1);
                    if (var36.field3688 != -1) {
                        byte var37 = arg9[arg3][arg4 - 1];
                        byte var38 = arg5[arg3][arg4 - 1];
                        if (var36.field3680) {
                            int var39 = 2;
                            int var40 = (var38 * 2) + 4;
                            int var41 = class150.method1113(var36, arg13, (byte) -115);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var39 &= 0x7;
                                var40 &= 0x7;
                                if (class297.field4325[var37][var40] && var36.field3693 >= class347.field5051[var39]) {
                                    class93.field1192[var39] = var36.field3688;
                                    class102.field1290[var39] = var41;
                                    class305.field4450[var39] = arg13.method864() ? var36.field3682 : var36.field3687;
                                    class138.field2119[var39] = var36.field3692;
                                    if (class347.field5051[var39] == var36.field3693) {
                                        class423.field6037[var39] = class332.method2176(class423.field6037[var39], 32);
                                    } else {
                                        class423.field6037[var39] = 32;
                                    }
                                    class347.field5051[var39] = var36.field3693;
                                }
                                var40++;
                                var39--;
                            }
                            if (!var14[arg10 & 0x3]) {
                                arg0[0] = class284.field4124[var37][class209.method1483(3, var38 + 2)];
                            }
                        } else if (!var14[-(-arg10) & 0x3]) {
                            arg0[0] = class58.field780[var37][class209.method1483(3, var38 + 2)];
                        }
                    }
                }
            }
            if (arg4 < arg2 - 1) {
                int var43 = arg1[arg3][arg4 + 1] & 0xFF;
                if (var43 > 0) {
                    class247 var44 = class377.method2408((byte) 67, var43 - 1);
                    if (var44.field3688 != -1) {
                        byte var45 = arg9[arg3][arg4 + 1];
                        byte var46 = arg5[arg3][arg4 + 1];
                        if (var44.field3680) {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class150.method1113(var44, arg13, (byte) 96);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var47 &= 0x7;
                                var48 &= 0x7;
                                if (class297.field4325[var45][var48] && class347.field5051[var47] <= var44.field3693) {
                                    class93.field1192[var47] = var44.field3688;
                                    class102.field1290[var47] = var49;
                                    class305.field4450[var47] = arg13.method864() ? var44.field3682 : var44.field3687;
                                    class138.field2119[var47] = var44.field3692;
                                    if (class347.field5051[var47] == var44.field3693) {
                                        class423.field6037[var47] = class332.method2176(class423.field6037[var47], 16);
                                    } else {
                                        class423.field6037[var47] = 16;
                                    }
                                    class347.field5051[var47] = var44.field3693;
                                }
                                var48--;
                                var47++;
                            }
                            if (!var14[arg10 + 2 & 0x3]) {
                                arg0[2] = class284.field4124[var45][class209.method1483(3, var46)];
                            }
                        } else if (!var14[arg10 + 2 & 0x3]) {
                            arg0[2] = class58.field780[var45][class209.method1483(var46, 3)];
                        }
                    }
                }
            }
            if (arg3 > 0) {
                int var51 = arg1[arg3 - 1][arg4] & 0xFF;
                if (var51 > 0) {
                    class247 var52 = class377.method2408((byte) 67, var51 - 1);
                    if (var52.field3688 != -1) {
                        byte var53 = arg9[arg3 - 1][arg4];
                        byte var54 = arg5[arg3 - 1][arg4];
                        if (var52.field3680) {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class150.method1113(var52, arg13, (byte) -92);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var55 &= 0x7;
                                var56 &= 0x7;
                                if (class297.field4325[var53][var56] && class347.field5051[var55] <= var52.field3693) {
                                    class93.field1192[var55] = var52.field3688;
                                    class102.field1290[var55] = var57;
                                    class305.field4450[var55] = arg13.method864() ? var52.field3682 : var52.field3687;
                                    class138.field2119[var55] = var52.field3692;
                                    if (class347.field5051[var55] == var52.field3693) {
                                        class423.field6037[var55] = class332.method2176(class423.field6037[var55], 8);
                                    } else {
                                        class423.field6037[var55] = 8;
                                    }
                                    class347.field5051[var55] = var52.field3693;
                                }
                                var55++;
                                var56--;
                            }
                            if (!var14[arg10 + 3 & 0x3]) {
                                arg0[3] = class284.field4124[var53][class209.method1483(3, var54 + 1)];
                            }
                        } else if (!var14[arg10 + 3 & 0x3]) {
                            arg0[3] = class58.field780[var53][class209.method1483(3, var54 + 1)];
                        }
                    }
                }
            }
            if (arg3 < arg7 - 1) {
                int var59 = arg1[arg3 + 1][arg4] & 0xFF;
                if (var59 > 0) {
                    class247 var60 = class377.method2408((byte) 67, var59 - 1);
                    if (var60.field3688 != -1) {
                        byte var61 = arg9[arg3 + 1][arg4];
                        byte var62 = arg5[arg3 + 1][arg4];
                        if (var60.field3680) {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class150.method1113(var60, arg13, (byte) -83);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var64 &= 0x7;
                                var63 &= 0x7;
                                if (class297.field4325[var61][var64] && class347.field5051[var63] <= var60.field3693) {
                                    class93.field1192[var63] = var60.field3688;
                                    class102.field1290[var63] = var65;
                                    class305.field4450[var63] = arg13.method864() ? var60.field3682 : var60.field3687;
                                    class138.field2119[var63] = var60.field3692;
                                    if (class347.field5051[var63] == var60.field3693) {
                                        class423.field6037[var63] = class332.method2176(class423.field6037[var63], 4);
                                    } else {
                                        class423.field6037[var63] = 4;
                                    }
                                    class347.field5051[var63] = var60.field3693;
                                }
                                var64++;
                                var63--;
                            }
                            if (!var14[arg10 + 1 & 0x3]) {
                                arg0[1] = class284.field4124[var61][class209.method1483(var62 + 3, 3)];
                            }
                        } else if (!var14[arg10 + 1 & 0x3]) {
                            arg0[1] = class58.field780[var61][class209.method1483(var62 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg6 == null) {
            return;
        }
        int var67 = class150.method1113(arg6, arg13, (byte) 52);
        if (!arg6.field3680) {
            return;
        }
        for (int var68 = 0; var68 < 8; var68++) {
            int var69 = var68 - arg10 * 2 & 0x7;
            if (class297.field4325[arg8][var68] && class347.field5051[var69] <= arg6.field3693) {
                class93.field1192[var69] = arg6.field3688;
                class102.field1290[var69] = var67;
                class305.field4450[var69] = arg13.method864() ? arg6.field3682 : arg6.field3687;
                class138.field2119[var69] = arg6.field3692;
                if (class347.field5051[var69] == arg6.field3693) {
                    class423.field6037[var69] = class332.method2176(class423.field6037[var69], 2);
                } else {
                    class423.field6037[var69] = 2;
                }
                class347.field5051[var69] = arg6.field3693;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 482)
    public static void method1721(int arg0) {
        field3690 = null;
        field3701 = null;
        field3697 = null;
        field3702 = null;
        if (arg0 != 23552) {
            field3703 = true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIILlf;)V", line = 495)
    private final void method1722(int arg0, int arg1, int arg2, class130 arg3) {
        field3686++;
        if (arg1 != 128) {
            return;
        }
        if (arg2 == 1) {
            this.field3688 = class105.method615(arg3.method839((byte) -92), 115);
        } else if (arg2 == 2) {
            this.field3682 = arg3.method837(true);
            return;
        } else if (arg2 == 3) {
            this.field3682 = arg3.method798(false);
            if (this.field3682 == 65535) {
                this.field3682 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field3695 = false;
            return;
        } else if (arg2 == 7) {
            this.field3685 = class105.method615(arg3.method839((byte) -92), 122);
            return;
        } else if (arg2 == 8) {
            class417.field6000 = arg0;
            return;
        } else if (arg2 == 9) {
            this.field3692 = arg3.method798(false);
            return;
        } else if (arg2 == 10) {
            this.field3694 = false;
            return;
        } else if (arg2 == 11) {
            this.field3693 = arg3.method837(true);
            return;
        } else if (arg2 == 12) {
            this.field3680 = true;
            return;
        } else if (arg2 == 13) {
            this.field3681 = arg3.method839((byte) -92);
            return;
        } else {
            if (arg2 == 14) {
                this.field3683 = arg3.method837(true);
            } else if (arg2 == 15) {
                this.field3687 = arg3.method798(false);
                if (this.field3687 == 65535) {
                    this.field3687 = -1;
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIZ)V", line = 583)
    public static final void method1723(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != -18668) {
            return;
        }
        field3699++;
        if (arg2) {
            class198.field2828--;
            if (class198.field2828 == 0) {
                class106.field1365 = null;
            }
        }
        if (!arg0) {
            return;
        }
        class31.field388--;
        if (class31.field388 == 0) {
            class131.field1911 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILlf;I)V", line = 616)
    public final void method1724(int arg0, class130 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method837(true);
            if (var4 == 0) {
                if (arg2 != -1) {
                    method1728(117, 10, 28, 124);
                }
                field3684++;
                return;
            }
            this.method1722(arg0, arg2 ^ 0xFFFFFF7F, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V", line = 645)
    public final void method1725(int arg0, boolean arg1) {
        this.field3693 = this.field3693 << 8 | arg0;
        if (!arg1) {
            field3689++;
            if (this.field3687 == -1) {
                this.field3687 = this.field3682;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZILao;BZLao;)I", line = 660)
    public static final int method1726(int arg0, boolean arg1, int arg2, class158 arg3, byte arg4, boolean arg5, class158 arg6) {
        field3700++;
        int var7 = class207.method1478(arg1, arg3, 2588, arg0, arg6);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class207.method1478(arg5, arg3, 2588, arg2, arg6);
            if (arg4 >= -101) {
                return -71;
            } else if (arg5) {
                return -var8;
            } else {
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIZIII)V", line = 705)
    public static final void method1727(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3691++;
        if (class385.field5449 == null) {
            class59.field786.method1832(arg0, -16777216, arg4, 1, arg1, arg5);
            return;
        }
        class265.field3897++;
        if (class181.field2555 != null && class181.field2555.field4463 - (class181.field2555.method773((byte) 95) - 1) * 64 >> 7 == class218.field3132 && class181.field2555.field4466 + 64 - (class181.field2555.method773((byte) 111) * 64) >> 7 == class72.field944) {
            class218.field3132 = -1;
            class72.field944 = -1;
            class28.method152((byte) 116);
        }
        class316.method2110(arg3 ^ arg3);
        if (!arg2) {
            class154.method1141(28810);
        }
        class131.method861((byte) 127);
        class101.method587(arg0, arg5, true, (byte) -96, arg1, arg4);
        int var6 = class127.field1766;
        int var7 = class396.field5573;
        int var8 = class308.field4484;
        int var9 = class411.field5897;
        if (class336.field4878 == 1) {
            int var12 = (int) class241.field3553;
            if (class433.field6195 >> 8 > var12) {
                var12 = class433.field6195 >> 8;
            }
            if (class248.field3704[4] && (class355.field5147[4] + 128) > var12) {
                var12 = class355.field5147[4] + 128;
            }
            int var13 = (int) class358.field5176 + class129.field1834 & 0x3FFF;
            class198.method1406(class431.field6168, 16384, var9, var13, var12, class323.field4712, class452.method2820(class158.field2302, class181.field2555.field4466, false, class181.field2555.field4463) - 50, 600 - -((var12 >> 3) * 3));
        } else if (class336.field4878 == 4) {
            int var10 = (int) class241.field3553;
            if (var10 < class433.field6195 >> 8) {
                var10 = class433.field6195 >> 8;
            }
            if (class248.field3704[4] && class355.field5147[4] + 128 > var10) {
                var10 = class355.field5147[4] + 128;
            }
            int var11 = (int) class358.field5176 & 0x3FFF;
            class198.method1406(class431.field6168, 16384, var9, var11, var10, class323.field4712, class452.method2820(class158.field2302, class165.field2348, false, class302.field4402) - 50, (var10 >> 3) * 3 + 600);
        } else if (class336.field4878 == 5) {
            class402.method2518(var9, (byte) 113);
        }
        int var14 = class386.field5469;
        int var15 = class249.field3707;
        int var16 = class417.field5999;
        int var17 = class319.field4676;
        int var18 = class278.field3990;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class248.field3704[var19]) {
                int var22 = (int) ((double) (-class285.field4144[var19]) + (double) (class285.field4144[var19] * 2 + 1) * Math.random() + Math.sin((double) class125.field1682[var19] / 100.0D * (double) class365.field5225[var19]) * (double) class355.field5147[var19]);
                if (var19 == 3) {
                    class278.field3990 = class278.field3990 + var22 & 0x3FFF;
                }
                if (var19 == 1) {
                    class249.field3707 += var22;
                }
                if (var19 == 0) {
                    class386.field5469 += var22;
                }
                if (var19 == 4) {
                    class319.field4676 += var22;
                    if (class319.field4676 < 1024) {
                        class319.field4676 = 1024;
                    } else if (class319.field4676 > 3072) {
                        class319.field4676 = 3072;
                    }
                }
                if (var19 == 2) {
                    class417.field5999 += var22;
                }
            }
        }
        if (class386.field5469 < 0) {
            class386.field5469 = 0;
        }
        if (class386.field5469 > (class394.field5548 << 7) - 1) {
            class386.field5469 = (class394.field5548 << 7) - 1;
        }
        if (class417.field5999 < 0) {
            class417.field5999 = 0;
        }
        if (class417.field5999 > ((class407.field5751 << 7) - 1)) {
            class417.field5999 = (class407.field5751 << 7) - 1;
        }
        class51.method333(true);
        class373.method2388((byte) 41);
        class59.field786.method937(var6, var7, var6 + var8, var7 - -var9);
        class59.field786.method897();
        int var20 = class200.field2855;
        if (class429.field6097 == null) {
            class59.field786.method886(var20);
        } else {
            class429.field6097.method2172(111, var8, var9, class319.field4676, var7, var6, class278.field3990, class105.field1352 << 3, class59.field786, var20);
        }
        class127.method769(0);
        class44.field598.method1142(class386.field5469, class249.field3707, class417.field5999, -class319.field4676 & 0x3FFF, -class278.field3990 & 0x3FFF, -class214.field3072 & 0x3FFF);
        class59.field786.method973(class44.field598);
        class59.field786.method1003(var8 / 2 + var6, var9 / 2 + var7, class359.field5181 << 1, class359.field5181 << 1);
        class101.method588(var8 / 2 + var6, arg3 ^ 0x3618, var9 / 2 + var7, class359.field5181 << 1, class359.field5181 << 1);
        class427.method2668(class249.field3707, -class214.field3072 & 0x3FFF, class417.field5999, class386.field5469, (byte) 127, -class319.field4676 & 0x3FFF, -class278.field3990 & 0x3FFF);
        byte var21 = class253.method1759(1) == 2 ? (byte) class265.field3897 : 1;
        class250.method1735(class59.field786, class34.field434, class287.field4169, class44.field598, class386.field5469, class249.field3707, class417.field5999, class32.field398, class370.field5263, class147.field2189, class327.field4744, class357.field5168, class59.field794, class158.field2302 + 1, var21, class181.field2555.field4463 >> 7, class181.field2555.field4466 >> 7, !class266.field3908);
        class127.method769(0);
        if (class423.field6041 == 30) {
            class324.method2144(256, var8, 256, var9, var6, var7, 97);
            class240.method1642(var9, 1, var7, 256, var8, 256, var6);
            class199.method1411(var7, 256, var6, 256, true, var9, var8);
            class361.method2349(var6, var9, var8, var7, 10519);
        }
        class435.method2716();
        class386.field5469 = var14;
        class278.field3990 = var18;
        class417.field5999 = var16;
        class249.field3707 = var15;
        class319.field4676 = var17;
        if (class312.field4609 && class187.field2661.method505(-18297) == 0) {
            class312.field4609 = false;
        }
        if (class312.field4609) {
            class59.field786.method1832(var6, -16777216, var8, 1, var7, var9);
            class135.method1044(false, arg3 ^ 0x2CB9, class169.field2394.method2284((byte) -70, class309.field4497), class402.field5648);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)Z", line = 894)
    public static final boolean method1728(int arg0, int arg1, int arg2, int arg3) {
        if (class254.method1764(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class239.method1627(var4 + 1, class439.field6280[arg0].method359(arg1, arg2) + arg3, var5 + 1) && class239.method1627(var4 + 128 - 1, class439.field6280[arg0].method359(arg1 + 1, arg2) + arg3, var5 + 1) && class239.method1627(var4 + 128 - 1, class439.field6280[arg0].method359(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class239.method1627(var4 + 1, class439.field6280[arg0].method359(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
