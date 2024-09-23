import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BRNLHXCU")
public class class3 {

    @OriginalMember(owner = "BRNLHXCU", name = "d", descriptor = "I")
    private int field38 = 25910;

    @OriginalMember(owner = "BRNLHXCU", name = "u", descriptor = "Z")
    private boolean field55 = false;

    @OriginalMember(owner = "BRNLHXCU", name = "p", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "BRNLHXCU", name = "q", descriptor = "I")
    private int field51;

    @OriginalMember(owner = "BRNLHXCU", name = "t", descriptor = "[[[I")
    private int[][][] field54;

    @OriginalMember(owner = "BRNLHXCU", name = "n", descriptor = "[[[B")
    private byte[][][] field48;

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "[[[B")
    private byte[][][] field35;

    @OriginalMember(owner = "BRNLHXCU", name = "v", descriptor = "[[[B")
    private byte[][][] field56;

    @OriginalMember(owner = "BRNLHXCU", name = "r", descriptor = "[[[B")
    private byte[][][] field52;

    @OriginalMember(owner = "BRNLHXCU", name = "s", descriptor = "[[[B")
    private byte[][][] field53;

    @OriginalMember(owner = "BRNLHXCU", name = "b", descriptor = "[[[I")
    private int[][][] field36;

    @OriginalMember(owner = "BRNLHXCU", name = "B", descriptor = "[[[B")
    private byte[][][] field62;

    @OriginalMember(owner = "BRNLHXCU", name = "m", descriptor = "[[I")
    private int[][] field47;

    @OriginalMember(owner = "BRNLHXCU", name = "h", descriptor = "[I")
    private int[] field42;

    @OriginalMember(owner = "BRNLHXCU", name = "i", descriptor = "[I")
    private int[] field43;

    @OriginalMember(owner = "BRNLHXCU", name = "j", descriptor = "[I")
    private int[] field44;

    @OriginalMember(owner = "BRNLHXCU", name = "k", descriptor = "[I")
    private int[] field45;

    @OriginalMember(owner = "BRNLHXCU", name = "l", descriptor = "[I")
    private int[] field46;

    @OriginalMember(owner = "BRNLHXCU", name = "c", descriptor = "I")
    private static int field37 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "BRNLHXCU", name = "e", descriptor = "I")
    private static int field39 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "BRNLHXCU", name = "f", descriptor = "[I")
    private static final int[] field40 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "BRNLHXCU", name = "o", descriptor = "[I")
    private static final int[] field49 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "BRNLHXCU", name = "w", descriptor = "[I")
    private static final int[] field57 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "BRNLHXCU", name = "z", descriptor = "I")
    private static int field60 = 4;

    @OriginalMember(owner = "BRNLHXCU", name = "A", descriptor = "[I")
    private static final int[] field61 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "BRNLHXCU", name = "C", descriptor = "I")
    private static int field63 = -30411;

    @OriginalMember(owner = "BRNLHXCU", name = "D", descriptor = "I")
    private static int field64 = 817;

    @OriginalMember(owner = "BRNLHXCU", name = "E", descriptor = "I")
    private static int field65 = -196;

    @OriginalMember(owner = "BRNLHXCU", name = "F", descriptor = "Z")
    public static boolean field66 = true;

    @OriginalMember(owner = "BRNLHXCU", name = "g", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "BRNLHXCU", name = "y", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "BRNLHXCU", name = "x", descriptor = "Z")
    private static boolean field58;

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(IIIIIIILUGKPKMOJ;LONADPAJP;)V")
    private final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class59 arg7, class47 arg8) {
        if (field66) {
            if ((this.field48[arg1][arg2][arg4] & 0x10) != 0) {
                return;
            }
            if (this.method23(this.field41, arg2, arg1, arg4) != field59) {
                return;
            }
        }
        int var10 = this.field54[arg1][arg2][arg4];
        int var11 = this.field54[arg1][arg2 + 1][arg4];
        int var12 = this.field54[arg1][arg2 + 1][arg4 + 1];
        int var13 = this.field54[arg1][arg2][arg4 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class64 var15 = class64.method568(arg0);
        int var16 = (arg0 << 14) + (arg4 << 7) + arg2 + 1073741824;
        if (!var15.field1614) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg6 << 6) + arg3);
        if (arg5 != 25910) {
            for (int var18 = 1; var18 > 0; var18++) {
            }
        }
        if (arg3 == 22) {
            if (!field66 || var15.field1614 || var15.field1650) {
                class18 var19;
                if (var15.field1608 == -1 && var15.field1639 == null) {
                    var19 = var15.method569(22, arg6, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class44(field64, var11, var13, arg0, arg6, var12, var10, true, var15.field1608, 22);
                }
                arg7.method513(field60, var19, arg2, arg4, var16, var14, arg1, var17);
                if (var15.field1621 && var15.field1614 && arg8 != null) {
                    arg8.method454(arg2, (byte) 4, arg4);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class18 var39;
            if (var15.field1608 == -1 && var15.field1639 == null) {
                var39 = var15.method569(10, arg6, var10, var11, var12, var13, -1);
            } else {
                var39 = new class44(field64, var11, var13, arg0, arg6, var12, var10, true, var15.field1608, 10);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg3 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg6 == 1 || arg6 == 3) {
                    var41 = var15.field1617;
                    var42 = var15.field1647;
                } else {
                    var41 = var15.field1647;
                    var42 = var15.field1617;
                }
                if (arg7.method517(var14, arg4, var40, var39, arg1, var17, arg2, var42, var41, field63, var16) && var15.field1607) {
                    class21 var43;
                    if (var39 instanceof class21) {
                        var43 = (class21) var39;
                    } else {
                        var43 = var15.method569(10, arg6, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field909 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field62[arg1][arg2 + var44][arg4 + var45]) {
                                    this.field62[arg1][arg2 + var44][arg4 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1621 && arg8 != null) {
                arg8.method453(var15.field1647, -192, var15.field1646, var15.field1617, arg2, arg4, arg6);
            }
        } else if (arg3 >= 12) {
            class18 var20;
            if (var15.field1608 == -1 && var15.field1639 == null) {
                var20 = var15.method569(arg3, arg6, var10, var11, var12, var13, -1);
            } else {
                var20 = new class44(field64, var11, var13, arg0, arg6, var12, var10, true, var15.field1608, arg3);
            }
            arg7.method517(var14, arg4, 0, var20, arg1, var17, arg2, 1, 1, field63, var16);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
                this.field36[arg1][arg2][arg4] |= 0x924;
            }
            if (var15.field1621 && arg8 != null) {
                arg8.method453(var15.field1647, -192, var15.field1646, var15.field1617, arg2, arg4, arg6);
            }
        } else if (arg3 == 0) {
            class18 var21;
            if (var15.field1608 == -1 && var15.field1639 == null) {
                var21 = var15.method569(0, arg6, var10, var11, var12, var13, -1);
            } else {
                var21 = new class44(field64, var11, var13, arg0, arg6, var12, var10, true, var15.field1608, 0);
            }
            arg7.method515(var16, arg2, field49[arg6], var21, 0, arg4, var14, var17, 158, arg1, null);
            if (arg6 == 0) {
                if (var15.field1607) {
                    this.field62[arg1][arg2][arg4] = 50;
                    this.field62[arg1][arg2][arg4 + 1] = 50;
                }
                if (var15.field1633) {
                    this.field36[arg1][arg2][arg4] |= 0x249;
                }
            } else if (arg6 == 1) {
                if (var15.field1607) {
                    this.field62[arg1][arg2][arg4 + 1] = 50;
                    this.field62[arg1][arg2 + 1][arg4 + 1] = 50;
                }
                if (var15.field1633) {
                    this.field36[arg1][arg2][arg4 + 1] |= 0x492;
                }
            } else if (arg6 == 2) {
                if (var15.field1607) {
                    this.field62[arg1][arg2 + 1][arg4] = 50;
                    this.field62[arg1][arg2 + 1][arg4 + 1] = 50;
                }
                if (var15.field1633) {
                    this.field36[arg1][arg2 + 1][arg4] |= 0x249;
                }
            } else if (arg6 == 3) {
                if (var15.field1607) {
                    this.field62[arg1][arg2][arg4] = 50;
                    this.field62[arg1][arg2 + 1][arg4] = 50;
                }
                if (var15.field1633) {
                    this.field36[arg1][arg2][arg4] |= 0x492;
                }
            }
            if (var15.field1621 && arg8 != null) {
                arg8.method452(arg2, var15.field1646, arg4, -987, arg6, arg3);
            }
            if (var15.field1609 != 16) {
                arg7.method523(-807, arg4, var15.field1609, arg2, arg1);
            }
        } else if (arg3 == 1) {
            class18 var22;
            if (var15.field1608 == -1 && var15.field1639 == null) {
                var22 = var15.method569(1, arg6, var10, var11, var12, var13, -1);
            } else {
                var22 = new class44(field64, var11, var13, arg0, arg6, var12, var10, true, var15.field1608, 1);
            }
            arg7.method515(var16, arg2, field61[arg6], var22, 0, arg4, var14, var17, 158, arg1, null);
            if (var15.field1607) {
                if (arg6 == 0) {
                    this.field62[arg1][arg2][arg4 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field62[arg1][arg2 + 1][arg4 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field62[arg1][arg2 + 1][arg4] = 50;
                } else if (arg6 == 3) {
                    this.field62[arg1][arg2][arg4] = 50;
                }
            }
            if (var15.field1621 && arg8 != null) {
                arg8.method452(arg2, var15.field1646, arg4, -987, arg6, arg3);
            }
        } else if (arg3 == 2) {
            int var23 = arg6 + 1 & 0x3;
            class18 var24;
            class18 var25;
            if (var15.field1608 == -1 && var15.field1639 == null) {
                var24 = var15.method569(2, arg6 + 4, var10, var11, var12, var13, -1);
                var25 = var15.method569(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class44(field64, var11, var13, arg0, arg6 + 4, var12, var10, true, var15.field1608, 2);
                var25 = new class44(field64, var11, var13, arg0, var23, var12, var10, true, var15.field1608, 2);
            }
            arg7.method515(var16, arg2, field49[arg6], var24, field49[var23], arg4, var14, var17, 158, arg1, var25);
            if (var15.field1633) {
                if (arg6 == 0) {
                    this.field36[arg1][arg2][arg4] |= 0x249;
                    this.field36[arg1][arg2][arg4 + 1] |= 0x492;
                } else if (arg6 == 1) {
                    this.field36[arg1][arg2][arg4 + 1] |= 0x492;
                    this.field36[arg1][arg2 + 1][arg4] |= 0x249;
                } else if (arg6 == 2) {
                    this.field36[arg1][arg2 + 1][arg4] |= 0x249;
                    this.field36[arg1][arg2][arg4] |= 0x492;
                } else if (arg6 == 3) {
                    this.field36[arg1][arg2][arg4] |= 0x492;
                    this.field36[arg1][arg2][arg4] |= 0x249;
                }
            }
            if (var15.field1621 && arg8 != null) {
                arg8.method452(arg2, var15.field1646, arg4, -987, arg6, arg3);
            }
            if (var15.field1609 != 16) {
                arg7.method523(-807, arg4, var15.field1609, arg2, arg1);
            }
        } else if (arg3 == 3) {
            class18 var26;
            if (var15.field1608 == -1 && var15.field1639 == null) {
                var26 = var15.method569(3, arg6, var10, var11, var12, var13, -1);
            } else {
                var26 = new class44(field64, var11, var13, arg0, arg6, var12, var10, true, var15.field1608, 3);
            }
            arg7.method515(var16, arg2, field61[arg6], var26, 0, arg4, var14, var17, 158, arg1, null);
            if (var15.field1607) {
                if (arg6 == 0) {
                    this.field62[arg1][arg2][arg4 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field62[arg1][arg2 + 1][arg4 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field62[arg1][arg2 + 1][arg4] = 50;
                } else if (arg6 == 3) {
                    this.field62[arg1][arg2][arg4] = 50;
                }
            }
            if (var15.field1621 && arg8 != null) {
                arg8.method452(arg2, var15.field1646, arg4, -987, arg6, arg3);
            }
        } else if (arg3 == 9) {
            class18 var27;
            if (var15.field1608 == -1 && var15.field1639 == null) {
                var27 = var15.method569(arg3, arg6, var10, var11, var12, var13, -1);
            } else {
                var27 = new class44(field64, var11, var13, arg0, arg6, var12, var10, true, var15.field1608, arg3);
            }
            arg7.method517(var14, arg4, 0, var27, arg1, var17, arg2, 1, 1, field63, var16);
            if (var15.field1621 && arg8 != null) {
                arg8.method453(var15.field1647, -192, var15.field1646, var15.field1617, arg2, arg4, arg6);
            }
        } else {
            if (var15.field1604) {
                if (arg6 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg6 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg6 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg3 == 4) {
                class18 var32;
                if (var15.field1608 == -1 && var15.field1639 == null) {
                    var32 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class44(field64, var11, var13, arg0, 0, var12, var10, true, var15.field1608, 4);
                }
                arg7.method516(var14, arg2, arg1, 0, var32, arg4, 0, (byte) 77, var16, var17, arg6 * 512, field49[arg6]);
            } else if (arg3 == 5) {
                int var33 = 16;
                int var34 = arg7.method533(arg1, arg2, arg4);
                if (var34 > 0) {
                    var33 = class64.method568(var34 >> 14 & 0x7FFF).field1609;
                }
                class18 var35;
                if (var15.field1608 == -1 && var15.field1639 == null) {
                    var35 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class44(field64, var11, var13, arg0, 0, var12, var10, true, var15.field1608, 4);
                }
                arg7.method516(var14, arg2, arg1, field57[arg6] * var33, var35, arg4, field40[arg6] * var33, (byte) 77, var16, var17, arg6 * 512, field49[arg6]);
            } else if (arg3 == 6) {
                class18 var36;
                if (var15.field1608 == -1 && var15.field1639 == null) {
                    var36 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class44(field64, var11, var13, arg0, 0, var12, var10, true, var15.field1608, 4);
                }
                arg7.method516(var14, arg2, arg1, 0, var36, arg4, 0, (byte) 77, var16, var17, arg6, 256);
            } else if (arg3 == 7) {
                class18 var37;
                if (var15.field1608 == -1 && var15.field1639 == null) {
                    var37 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class44(field64, var11, var13, arg0, 0, var12, var10, true, var15.field1608, 4);
                }
                arg7.method516(var14, arg2, arg1, 0, var37, arg4, 0, (byte) 77, var16, var17, arg6, 512);
            } else if (arg3 == 8) {
                class18 var38;
                if (var15.field1608 == -1 && var15.field1639 == null) {
                    var38 = var15.method569(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class44(field64, var11, var13, arg0, 0, var12, var10, true, var15.field1608, 4);
                }
                arg7.method516(var14, arg2, arg1, 0, var38, arg4, 0, (byte) 77, var16, var17, arg6, 768);
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(III)Z")
    public static final boolean method5(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        class64 var4 = class64.method568(arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var4.method566(field65, arg2);
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(II)I")
    private static final int method6(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "BRNLHXCU", name = "b", descriptor = "(II)I")
    private static final int method7(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(IIIIILCKBTFRZM;II)V")
    private final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, class5 arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 < 0 || arg0 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var11 = arg5.method44();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg5.method44();
                    return;
                }
                if (var11 <= 49) {
                    arg5.method44();
                }
            }
        }
        this.field48[arg4][arg0][arg7] = 0;
        while (true) {
            int var9 = arg5.method44();
            if (var9 == 0) {
                if (arg4 == 0) {
                    this.field54[0][arg0][arg7] = -method11(arg0 + arg2 + 932731, arg7 + 556238 + arg3) * 8;
                    return;
                } else {
                    this.field54[arg4][arg0][arg7] = this.field54[arg4 - 1][arg0][arg7] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg5.method44();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg4 == 0) {
                    this.field54[0][arg0][arg7] = -var10 * 8;
                    return;
                }
                this.field54[arg4][arg0][arg7] = this.field54[arg4 - 1][arg0][arg7] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field56[arg4][arg0][arg7] = arg5.method45();
                this.field52[arg4][arg0][arg7] = (byte) ((var9 - 2) / 4);
                this.field53[arg4][arg0][arg7] = (byte) (var9 + arg6 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field48[arg4][arg0][arg7] = (byte) (var9 - 49);
            } else {
                this.field35[arg4][arg0][arg7] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "c", descriptor = "(II)I")
    private final int method9(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "d", descriptor = "(II)I")
    private static final int method10(int arg0, int arg1) {
        int var2 = method6(arg0 - 1, arg1 - 1) + method6(arg0 + 1, arg1 - 1) + method6(arg0 - 1, arg1 + 1) + method6(arg0 + 1, arg1 + 1);
        int var3 = method6(arg0 - 1, arg1) + method6(arg0 + 1, arg1) + method6(arg0, arg1 - 1) + method6(arg0, arg1 + 1);
        int var4 = method6(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "BRNLHXCU", name = "e", descriptor = "(II)I")
    private static final int method11(int arg0, int arg1) {
        int var2 = method15(arg0 + 45365, arg1 + 91923, 4) + (method15(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method15(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(III[[[ILUGKPKMOJ;LONADPAJP;ZIIII)V")
    public static final void method12(int arg0, int arg1, int arg2, int[][][] arg3, class59 arg4, class47 arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg3[arg9][arg0][arg2];
        int var12 = arg3[arg9][arg0 + 1][arg2];
        int var13 = arg3[arg9][arg0 + 1][arg2 + 1];
        int var14 = arg3[arg9][arg0][arg2 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class64 var16 = class64.method568(arg1);
        if (!arg6) {
            for (int var17 = 1; var17 > 0; var17++) {
            }
        }
        int var18 = (arg1 << 14) + (arg2 << 7) + arg0 + 1073741824;
        if (!var16.field1614) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg10 << 6) + arg7);
        if (arg7 == 22) {
            class18 var20;
            if (var16.field1608 == -1 && var16.field1639 == null) {
                var20 = var16.method569(22, arg10, var11, var12, var13, var14, -1);
            } else {
                var20 = new class44(field64, var12, var14, arg1, arg10, var13, var11, true, var16.field1608, 22);
            }
            arg4.method513(field60, var20, arg0, arg2, var18, var15, arg8, var19);
            if (var16.field1621 && var16.field1614) {
                arg5.method454(arg0, (byte) 4, arg2);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class18 var40;
            if (var16.field1608 == -1 && var16.field1639 == null) {
                var40 = var16.method569(10, arg10, var11, var12, var13, var14, -1);
            } else {
                var40 = new class44(field64, var12, var14, arg1, arg10, var13, var11, true, var16.field1608, 10);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg7 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg10 == 1 || arg10 == 3) {
                    var42 = var16.field1617;
                    var43 = var16.field1647;
                } else {
                    var42 = var16.field1647;
                    var43 = var16.field1617;
                }
                arg4.method517(var15, arg2, var41, var40, arg8, var19, arg0, var43, var42, field63, var18);
            }
            if (var16.field1621) {
                arg5.method453(var16.field1647, -192, var16.field1646, var16.field1617, arg0, arg2, arg10);
            }
        } else if (arg7 >= 12) {
            class18 var21;
            if (var16.field1608 == -1 && var16.field1639 == null) {
                var21 = var16.method569(arg7, arg10, var11, var12, var13, var14, -1);
            } else {
                var21 = new class44(field64, var12, var14, arg1, arg10, var13, var11, true, var16.field1608, arg7);
            }
            arg4.method517(var15, arg2, 0, var21, arg8, var19, arg0, 1, 1, field63, var18);
            if (var16.field1621) {
                arg5.method453(var16.field1647, -192, var16.field1646, var16.field1617, arg0, arg2, arg10);
            }
        } else if (arg7 == 0) {
            class18 var22;
            if (var16.field1608 == -1 && var16.field1639 == null) {
                var22 = var16.method569(0, arg10, var11, var12, var13, var14, -1);
            } else {
                var22 = new class44(field64, var12, var14, arg1, arg10, var13, var11, true, var16.field1608, 0);
            }
            arg4.method515(var18, arg0, field49[arg10], var22, 0, arg2, var15, var19, 158, arg8, null);
            if (var16.field1621) {
                arg5.method452(arg0, var16.field1646, arg2, -987, arg10, arg7);
            }
        } else if (arg7 == 1) {
            class18 var23;
            if (var16.field1608 == -1 && var16.field1639 == null) {
                var23 = var16.method569(1, arg10, var11, var12, var13, var14, -1);
            } else {
                var23 = new class44(field64, var12, var14, arg1, arg10, var13, var11, true, var16.field1608, 1);
            }
            arg4.method515(var18, arg0, field61[arg10], var23, 0, arg2, var15, var19, 158, arg8, null);
            if (var16.field1621) {
                arg5.method452(arg0, var16.field1646, arg2, -987, arg10, arg7);
            }
        } else if (arg7 == 2) {
            int var24 = arg10 + 1 & 0x3;
            class18 var25;
            class18 var26;
            if (var16.field1608 == -1 && var16.field1639 == null) {
                var25 = var16.method569(2, arg10 + 4, var11, var12, var13, var14, -1);
                var26 = var16.method569(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new class44(field64, var12, var14, arg1, arg10 + 4, var13, var11, true, var16.field1608, 2);
                var26 = new class44(field64, var12, var14, arg1, var24, var13, var11, true, var16.field1608, 2);
            }
            arg4.method515(var18, arg0, field49[arg10], var25, field49[var24], arg2, var15, var19, 158, arg8, var26);
            if (var16.field1621) {
                arg5.method452(arg0, var16.field1646, arg2, -987, arg10, arg7);
            }
        } else if (arg7 == 3) {
            class18 var27;
            if (var16.field1608 == -1 && var16.field1639 == null) {
                var27 = var16.method569(3, arg10, var11, var12, var13, var14, -1);
            } else {
                var27 = new class44(field64, var12, var14, arg1, arg10, var13, var11, true, var16.field1608, 3);
            }
            arg4.method515(var18, arg0, field61[arg10], var27, 0, arg2, var15, var19, 158, arg8, null);
            if (var16.field1621) {
                arg5.method452(arg0, var16.field1646, arg2, -987, arg10, arg7);
            }
        } else if (arg7 == 9) {
            class18 var28;
            if (var16.field1608 == -1 && var16.field1639 == null) {
                var28 = var16.method569(arg7, arg10, var11, var12, var13, var14, -1);
            } else {
                var28 = new class44(field64, var12, var14, arg1, arg10, var13, var11, true, var16.field1608, arg7);
            }
            arg4.method517(var15, arg2, 0, var28, arg8, var19, arg0, 1, 1, field63, var18);
            if (var16.field1621) {
                arg5.method453(var16.field1647, -192, var16.field1646, var16.field1617, arg0, arg2, arg10);
            }
        } else {
            if (var16.field1604) {
                if (arg10 == 1) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg10 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var11;
                    var11 = var31;
                } else if (arg10 == 3) {
                    int var32 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var32;
                }
            }
            if (arg7 == 4) {
                class18 var33;
                if (var16.field1608 == -1 && var16.field1639 == null) {
                    var33 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var33 = new class44(field64, var12, var14, arg1, 0, var13, var11, true, var16.field1608, 4);
                }
                arg4.method516(var15, arg0, arg8, 0, var33, arg2, 0, (byte) 77, var18, var19, arg10 * 512, field49[arg10]);
            } else if (arg7 == 5) {
                int var34 = 16;
                int var35 = arg4.method533(arg8, arg0, arg2);
                if (var35 > 0) {
                    var34 = class64.method568(var35 >> 14 & 0x7FFF).field1609;
                }
                class18 var36;
                if (var16.field1608 == -1 && var16.field1639 == null) {
                    var36 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class44(field64, var12, var14, arg1, 0, var13, var11, true, var16.field1608, 4);
                }
                arg4.method516(var15, arg0, arg8, field57[arg10] * var34, var36, arg2, field40[arg10] * var34, (byte) 77, var18, var19, arg10 * 512, field49[arg10]);
            } else if (arg7 == 6) {
                class18 var37;
                if (var16.field1608 == -1 && var16.field1639 == null) {
                    var37 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class44(field64, var12, var14, arg1, 0, var13, var11, true, var16.field1608, 4);
                }
                arg4.method516(var15, arg0, arg8, 0, var37, arg2, 0, (byte) 77, var18, var19, arg10, 256);
            } else if (arg7 == 7) {
                class18 var38;
                if (var16.field1608 == -1 && var16.field1639 == null) {
                    var38 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class44(field64, var12, var14, arg1, 0, var13, var11, true, var16.field1608, 4);
                }
                arg4.method516(var15, arg0, arg8, 0, var38, arg2, 0, (byte) 77, var18, var19, arg10, 512);
            } else if (arg7 == 8) {
                class18 var39;
                if (var16.field1608 == -1 && var16.field1639 == null) {
                    var39 = var16.method569(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var39 = new class44(field64, var12, var14, arg1, 0, var13, var11, true, var16.field1608, 4);
                }
                arg4.method516(var15, arg0, arg8, 0, var39, arg2, 0, (byte) 77, var18, var19, arg10, 768);
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(ZIIII)V")
    public final void method13(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = arg3; var7 <= arg1 + arg3; var7++) {
            for (int var8 = arg2; var8 <= arg2 + arg4; var8++) {
                if (var8 >= 0 && var8 < this.field50 && var7 >= 0 && var7 < this.field51) {
                    this.field62[0][var8][var7] = 127;
                    if (arg2 == var8 && var8 > 0) {
                        this.field54[0][var8][var7] = this.field54[0][var8 - 1][var7];
                    }
                    if (arg2 + arg4 == var8 && var8 < this.field50 - 1) {
                        this.field54[0][var8][var7] = this.field54[0][var8 + 1][var7];
                    }
                    if (arg3 == var7 && var7 > 0) {
                        this.field54[0][var8][var7] = this.field54[0][var8][var7 - 1];
                    }
                    if (arg1 + arg3 == var7 && var7 < this.field51 - 1) {
                        this.field54[0][var8][var7] = this.field54[0][var8][var7 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(I[BIIII[LONADPAJP;)V")
    public final void method14(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class47[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg0 + var14 > 0 && arg0 + var14 < 103 && arg3 + var15 > 0 && arg3 + var15 < 103) {
                        arg6[var8].field1286[arg0 + var14][arg3 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class5 var9 = new class5(2, arg1);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method8(arg0 + var12, 0, arg2, arg5, var10, var9, 0, arg3 + var13);
                }
            }
        }
        int var11 = 4 / arg4;
    }

    @OriginalMember(owner = "BRNLHXCU", name = "b", descriptor = "(III)I")
    private static final int method15(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method10(var3, var5);
        int var8 = method10(var3 + 1, var5);
        int var9 = method10(var3, var5 + 1);
        int var10 = method10(var3 + 1, var5 + 1);
        int var11 = method22(var7, var8, var4, arg2);
        int var12 = method22(var9, var10, var4, arg2);
        return method22(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(ILUGKPKMOJ;[BIIIBII[LONADPAJP;I)V")
    public final void method16(int arg0, class59 arg1, byte[] arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, class47[] arg9, int arg10) {
        if (arg6 != 3) {
            return;
        }
        class5 var12 = new class5(2, arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method58();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method58();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method44();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg3 == var19 && var18 >= arg8 && var18 < arg8 + 8 && var17 >= arg5 && var17 < arg5 + 8) {
                    class64 var23 = class64.method568(var13);
                    int var24 = arg0 + class20.method335(var23.field1647, var23.field1617, -542, var17 & 0x7, arg7, var18 & 0x7);
                    int var25 = arg10 + class20.method336(var23.field1647, arg7, var18 & 0x7, 353, var23.field1617, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = var19;
                        if ((this.field48[1][var24][var25] & 0x2) == 2) {
                            var26 = var19 - 1;
                        }
                        class47 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg9[var26];
                        }
                        this.method4(var13, var19, var24, var21, var25, this.field38, arg7 + var22 & 0x3, arg1, var27);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(LUGKPKMOJ;[LONADPAJP;I)V")
    public final void method17(class59 arg0, class47[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field48[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field48[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method454(var110, (byte) 4, var111);
                        }
                    }
                }
            }
        }
        if (arg2 >= 0) {
            return;
        }
        field37 += (int) (Math.random() * 5.0D) - 2;
        if (field37 < -8) {
            field37 = -8;
        }
        if (field37 > 8) {
            field37 = 8;
        }
        field39 += (int) (Math.random() * 5.0D) - 2;
        if (field39 < -16) {
            field39 = -16;
        }
        if (field39 > 16) {
            field39 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field62[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field51 - 1; var56++) {
                for (int var101 = 1; var101 < this.field50 - 1; var101++) {
                    int var102 = this.field54[var5][var101 + 1][var56] - this.field54[var5][var101 - 1][var56];
                    int var103 = this.field54[var5][var101][var56 + 1] - this.field54[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field47[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field51; var57++) {
                this.field42[var57] = 0;
                this.field43[var57] = 0;
                this.field44[var57] = 0;
                this.field45[var57] = 0;
                this.field46[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field50 + 5; var58++) {
                for (int var61 = 0; var61 < this.field51; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field50) {
                        int var96 = this.field35[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class6 var97 = class6.field621[var96 - 1];
                            this.field42[var61] += var97.field630;
                            this.field43[var61] += var97.field628;
                            this.field44[var61] += var97.field629;
                            this.field45[var61] += var97.field631;
                            var10002 = this.field46[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field50) {
                        int var99 = this.field35[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class6 var100 = class6.field621[var99 - 1];
                            this.field42[var61] -= var100.field630;
                            this.field43[var61] -= var100.field628;
                            this.field44[var61] -= var100.field629;
                            this.field45[var61] -= var100.field631;
                            var10002 = this.field46[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field50 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field51 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field51) {
                            var62 += this.field42[var68];
                            var63 += this.field43[var68];
                            var64 += this.field44[var68];
                            var65 += this.field45[var68];
                            var66 += this.field46[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field51) {
                            var62 -= this.field42[var69];
                            var63 -= this.field43[var69];
                            var64 -= this.field44[var69];
                            var65 -= this.field45[var69];
                            var66 -= this.field46[var69];
                        }
                        if (var67 >= 1 && var67 < this.field51 - 1 && (!field66 || (this.field48[var5][var58][var67] & 0x10) == 0 && this.method23(this.field41, var58, var5, var67) == field59)) {
                            int var70 = this.field35[var5][var58][var67] & 0xFF;
                            int var71 = this.field56[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field54[var5][var58][var67];
                                int var73 = this.field54[var5][var58 + 1][var67];
                                int var74 = this.field54[var5][var58 + 1][var67 + 1];
                                int var75 = this.field54[var5][var58][var67 + 1];
                                int var76 = this.field47[var58][var67];
                                int var77 = this.field47[var58 + 1][var67];
                                int var78 = this.field47[var58 + 1][var67 + 1];
                                int var79 = this.field47[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method24(var82, var83, var84);
                                    int var85 = field37 + var82 & 0xFF;
                                    int var86 = field39 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method24(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field52[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class6.field621[var71 - 1].field626) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field36[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class10.field685[method7(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method512(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method7(var80, var76), method7(var80, var77), method7(var80, var78), method7(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field52[var5][var58][var67] + 1;
                                    byte var90 = this.field53[var5][var58][var67];
                                    class6 var91 = class6.field621[var71 - 1];
                                    int var92 = var91.field624;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class10.method243(var92, -4596);
                                        var94 = -1;
                                    } else if (var91.field623 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method24(var91.field627, var91.field628, var91.field629);
                                        var93 = class10.field685[this.method9(var91.field632, 96)];
                                    }
                                    arg0.method512(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method7(var80, var76), method7(var80, var77), method7(var80, var78), method7(var80, var79), this.method9(var94, var76), this.method9(var94, var77), this.method9(var94, var78), this.method9(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field51 - 1; var59++) {
                for (int var60 = 1; var60 < this.field50 - 1; var60++) {
                    arg0.method511(var5, var60, var59, this.method23(this.field41, var60, var5, var59));
                }
            }
        }
        arg0.method538(-50, -50, 0, 768, -10, 64);
        for (int var6 = 0; var6 < this.field50; var6++) {
            for (int var47 = 0; var47 < this.field51; var47++) {
                if ((this.field48[1][var6][var47] & 0x2) == 2) {
                    arg0.method509(var6, var47, (byte) 4);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field51; var12++) {
                    for (int var13 = 0; var13 <= this.field50; var13++) {
                        if ((this.field36[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field36[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field51 && (this.field36[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label326: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field36[var16 - 1][var13][var18] & var7) == 0) {
                                        break label326;
                                    }
                                }
                                var16--;
                            }
                            label315: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field36[var17 + 1][var13][var19] & var7) == 0) {
                                        break label315;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field54[var17][var13][var14] - var21;
                                int var23 = this.field54[var16][var13][var14];
                                class59.method510(var22, var10, var14 * 128, 1, (byte) -103, var15 * 128 + 128, var13 * 128, var13 * 128, var23);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field36[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field36[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field36[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field50 && (this.field36[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label379: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field36[var28 - 1][var30][var12] & var8) == 0) {
                                        break label379;
                                    }
                                }
                                var28--;
                            }
                            label368: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field36[var29 + 1][var31][var12] & var8) == 0) {
                                        break label368;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field54[var29][var26][var12] - var33;
                                int var35 = this.field54[var28][var26][var12];
                                class59.method510(var34, var10, var12 * 128, 2, (byte) -103, var12 * 128, var27 * 128 + 128, var26 * 128, var35);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field36[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field36[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field36[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field51 && (this.field36[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label432: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field36[var11][var38 - 1][var42] & var9) == 0) {
                                        break label432;
                                    }
                                }
                                var38--;
                            }
                            label421: while (var39 < this.field50) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field36[var11][var39 + 1][var43] & var9) == 0) {
                                        break label421;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field54[var11][var38][var40];
                                class59.method510(var44, var10, var40 * 128, 4, (byte) -103, var41 * 128 + 128, var39 * 128 + 128, var38 * 128, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field36[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(LCKBTFRZM;LEEDCHWRL;I)V")
    public static final void method18(class5 arg0, class13 arg1, int arg2) {
        int var3 = -1;
        int var4 = 71 / arg2;
        while (true) {
            int var5 = arg0.method58();
            if (var5 == 0) {
                return;
            }
            var3 += var5;
            class64 var6 = class64.method568(var3);
            var6.method571(arg1, -8);
            while (true) {
                int var7 = arg0.method58();
                if (var7 == 0) {
                    break;
                }
                arg0.method44();
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(IIII[LONADPAJP;III[BI)V")
    public final void method19(int arg0, int arg1, int arg2, int arg3, class47[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg1 + var11 > 0 && arg1 + var11 < 103 && arg6 + var16 > 0 && arg6 + var16 < 103) {
                    arg4[arg5].field1286[arg1 + var11][arg6 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class5 var12 = new class5(2, arg8);
        if (arg0 != 45880) {
            this.field55 = !this.field55;
        }
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg7 == var13 && var14 >= arg3 && var14 < arg3 + 8 && var15 >= arg2 && var15 < arg2 + 8) {
                        this.method8(arg1 + class20.method333(var15 & 0x7, 9, var14 & 0x7, arg9), 0, 0, 0, arg5, var12, arg9, arg6 + class20.method334(var14 & 0x7, var15 & 0x7, arg9, false));
                    } else {
                        this.method8(-1, 0, 0, 0, 0, var12, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(IB[BI)Z")
    public static final boolean method20(int arg0, byte arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        if (arg1 != 125) {
            field58 = !field58;
        }
        class5 var5 = new class5(2, arg2);
        int var6 = -1;
        label59: while (true) {
            int var7 = var5.method58();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method58();
                    if (var11 == 0) {
                        continue label59;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method44() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class64 var17 = class64.method568(var6);
                        if (var14 != 22 || !field66 || var17.field1614 || var17.field1650) {
                            var4 &= var17.method572(249);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method58();
                if (var10 == 0) {
                    break;
                }
                var5.method44();
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(II[LONADPAJP;LUGKPKMOJ;[BI)V")
    public final void method21(int arg0, int arg1, class47[] arg2, class59 arg3, byte[] arg4, int arg5) {
        int var7 = 89 / arg1;
        class5 var8 = new class5(2, arg4);
        int var9 = -1;
        while (true) {
            int var10 = var8.method58();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method58();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var8.method44();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg5 + var14;
                int var20 = arg0 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field48[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class47 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg2[var21];
                    }
                    this.method4(var9, var15, var19, var17, var20, this.field38, var18, arg3, var22);
                }
            }
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "<init>", descriptor = "(II[[[I[[[BI)V")
    public class3(int arg0, int arg1, int[][][] arg2, byte[][][] arg3, int arg4) {
        this.field50 = arg1;
        this.field51 = arg4;
        this.field54 = arg2;
        this.field48 = arg3;
        this.field35 = new byte[4][this.field50][this.field51];
        this.field56 = new byte[4][this.field50][this.field51];
        this.field52 = new byte[4][this.field50][this.field51];
        this.field53 = new byte[4][this.field50][this.field51];
        this.field36 = new int[4][this.field50 + 1][this.field51 + 1];
        this.field62 = new byte[4][this.field50 + 1][this.field51 + 1];
        this.field47 = new int[this.field50 + 1][this.field51 + 1];
        this.field42 = new int[this.field51];
        this.field43 = new int[this.field51];
        this.field44 = new int[this.field51];
        this.field45 = new int[this.field51];
        this.field46 = new int[this.field51];
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "a", descriptor = "(IIII)I")
    private static final int method22(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class10.field674[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "BRNLHXCU", name = "b", descriptor = "(IIII)I")
    public int method23(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field48[arg2][arg1][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (this.field48[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "BRNLHXCU", name = "c", descriptor = "(III)I")
    private final int method24(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
