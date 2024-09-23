import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DWQOSSFD")
public class class11 {

    @OriginalMember(owner = "DWQOSSFD", name = "d", descriptor = "B")
    private byte field606 = 8;

    @OriginalMember(owner = "DWQOSSFD", name = "l", descriptor = "Z")
    private boolean field614 = true;

    @OriginalMember(owner = "DWQOSSFD", name = "n", descriptor = "I")
    private int field616 = 431;

    @OriginalMember(owner = "DWQOSSFD", name = "o", descriptor = "B")
    private byte field617 = 3;

    @OriginalMember(owner = "DWQOSSFD", name = "A", descriptor = "I")
    private int field629 = 4;

    @OriginalMember(owner = "DWQOSSFD", name = "g", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "DWQOSSFD", name = "h", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "DWQOSSFD", name = "H", descriptor = "[[[I")
    private int[][][] field636;

    @OriginalMember(owner = "DWQOSSFD", name = "k", descriptor = "[[[B")
    private byte[][][] field613;

    @OriginalMember(owner = "DWQOSSFD", name = "q", descriptor = "[[[B")
    private byte[][][] field619;

    @OriginalMember(owner = "DWQOSSFD", name = "b", descriptor = "[[[B")
    private byte[][][] field604;

    @OriginalMember(owner = "DWQOSSFD", name = "p", descriptor = "[[[B")
    private byte[][][] field618;

    @OriginalMember(owner = "DWQOSSFD", name = "D", descriptor = "[[[B")
    private byte[][][] field632;

    @OriginalMember(owner = "DWQOSSFD", name = "x", descriptor = "[[[I")
    private int[][][] field626;

    @OriginalMember(owner = "DWQOSSFD", name = "m", descriptor = "[[[B")
    private byte[][][] field615;

    @OriginalMember(owner = "DWQOSSFD", name = "C", descriptor = "[[I")
    private int[][] field631;

    @OriginalMember(owner = "DWQOSSFD", name = "s", descriptor = "[I")
    private int[] field621;

    @OriginalMember(owner = "DWQOSSFD", name = "t", descriptor = "[I")
    private int[] field622;

    @OriginalMember(owner = "DWQOSSFD", name = "u", descriptor = "[I")
    private int[] field623;

    @OriginalMember(owner = "DWQOSSFD", name = "v", descriptor = "[I")
    private int[] field624;

    @OriginalMember(owner = "DWQOSSFD", name = "w", descriptor = "[I")
    private int[] field625;

    @OriginalMember(owner = "DWQOSSFD", name = "c", descriptor = "Z")
    private static boolean field605 = true;

    @OriginalMember(owner = "DWQOSSFD", name = "e", descriptor = "I")
    private static int field607 = -864;

    @OriginalMember(owner = "DWQOSSFD", name = "f", descriptor = "I")
    public static int field608 = 99;

    @OriginalMember(owner = "DWQOSSFD", name = "i", descriptor = "[I")
    private static final int[] field611 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "DWQOSSFD", name = "j", descriptor = "[I")
    private static final int[] field612 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "DWQOSSFD", name = "y", descriptor = "[I")
    private static final int[] field627 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "DWQOSSFD", name = "z", descriptor = "[I")
    private static final int[] field628 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "DWQOSSFD", name = "E", descriptor = "Z")
    public static boolean field633 = true;

    @OriginalMember(owner = "DWQOSSFD", name = "F", descriptor = "I")
    private static int field634 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "DWQOSSFD", name = "G", descriptor = "I")
    private static int field635 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "DWQOSSFD", name = "r", descriptor = "I")
    private static int field620;

    @OriginalMember(owner = "DWQOSSFD", name = "B", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "Z")
    private static boolean field603;

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(II)I")
    private static final int method188(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(IIII)I")
    private static final int method189(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class47.field1227[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(III[BIZII[LYMCKWFGH;LGLVCMXFQ;I)V")
    public final void method190(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7, class68[] arg8, class22 arg9, int arg10) {
        class62 var12 = new class62(-417, arg3);
        int var13 = -1;
        if (!arg5) {
            this.field614 = !this.field614;
        }
        while (true) {
            int var14 = var12.method535();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method535();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method521();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg7 == var19 && var18 >= arg6 && var18 < arg6 + 8 && var17 >= arg2 && var17 < arg2 + 8) {
                    class53 var23 = class53.method464(var13);
                    int var24 = arg0 + class27.method314(var23.field1457, var23.field1421, arg1, var18 & 0x7, var17 & 0x7, -593);
                    int var25 = arg10 + class27.method315(var17 & 0x7, arg1, -32309, var23.field1421, var18 & 0x7, var23.field1457);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = var19;
                        if ((this.field613[1][var24][var25] & 0x2) == 2) {
                            var26 = var19 - 1;
                        }
                        class68 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg8[var26];
                        }
                        this.method199(var19, var27, var25, arg1 + var22 & 0x3, var13, 4, arg9, var24, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "([BIII)Z")
    public static final boolean method191(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var4 = true;
        if (arg1 != 0) {
            field620 = -253;
        }
        class62 var5 = new class62(-417, arg0);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method535();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method535();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method521() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class53 var17 = class53.method464(var6);
                        if (var14 != 22 || !field633 || var17.field1424 || var17.field1467) {
                            var4 &= var17.method460(971);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method535();
                if (var10 == 0) {
                    break;
                }
                var5.method521();
            }
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(III)I")
    private final int method192(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "DWQOSSFD", name = "b", descriptor = "(II)I")
    private static final int method193(int arg0, int arg1) {
        int var2 = method206(arg0 + 45365, arg1 + 91923, 4) + (method206(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method206(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(IIBII)V")
    public final void method194(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (int var6 = arg0; var6 <= arg0 + arg3; var6++) {
            for (int var7 = arg4; var7 <= arg1 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field609 && var6 >= 0 && var6 < this.field610) {
                    this.field615[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.field636[0][var7][var6] = this.field636[0][var7 - 1][var6];
                    }
                    if (arg1 + arg4 == var7 && var7 < this.field609 - 1) {
                        this.field636[0][var7][var6] = this.field636[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field636[0][var7][var6] = this.field636[0][var7][var6 - 1];
                    }
                    if (arg0 + arg3 == var6 && var6 < this.field610 - 1) {
                        this.field636[0][var7][var6] = this.field636[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg2 != 36) {
            this.field616 = -384;
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(LTXSWXFHQ;ILXOUQUKZW;)V")
    public static final void method195(class55 arg0, int arg1, class62 arg2) {
        int var3 = -1;
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method535();
            if (var5 == 0) {
                return;
            }
            var3 += var5;
            class53 var6 = class53.method464(var3);
            var6.method469((byte) 8, arg0);
            while (true) {
                int var7 = arg2.method535();
                if (var7 == 0) {
                    break;
                }
                arg2.method521();
            }
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "c", descriptor = "(II)I")
    private static final int method196(int arg0, int arg1) {
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

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(ILGLVCMXFQ;LYMCKWFGH;[[[IIIIIIII)V")
    public static final void method197(int arg0, class22 arg1, class68 arg2, int[][][] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg3[arg9][arg7][arg0];
        int var12 = arg3[arg9][arg7 + 1][arg0];
        while (arg10 >= 0) {
            field605 = !field605;
        }
        int var13 = arg3[arg9][arg7 + 1][arg0 + 1];
        int var14 = arg3[arg9][arg7][arg0 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class53 var16 = class53.method464(arg6);
        int var17 = (arg6 << 14) + (arg0 << 7) + arg7 + 1073741824;
        if (!var16.field1424) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg4 << 6) + arg8);
        if (arg8 == 22) {
            class63 var19;
            if (var16.field1418 == -1 && var16.field1439 == null) {
                var19 = var16.method470(22, arg4, var11, var12, var13, var14, -1);
            } else {
                var19 = new class39(arg4, arg6, 22, var16.field1418, var12, var11, true, 923, var14, var13);
            }
            arg1.method239((byte) 3, var15, arg0, var18, arg7, arg5, var19, var17);
            if (var16.field1447 && var16.field1424) {
                arg2.method572(0, arg7, arg0);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class63 var39;
            if (var16.field1418 == -1 && var16.field1439 == null) {
                var39 = var16.method470(10, arg4, var11, var12, var13, var14, -1);
            } else {
                var39 = new class39(arg4, arg6, 10, var16.field1418, var12, var11, true, 923, var14, var13);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg8 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg4 == 1 || arg4 == 3) {
                    var41 = var16.field1457;
                    var42 = var16.field1421;
                } else {
                    var41 = var16.field1421;
                    var42 = var16.field1457;
                }
                arg1.method243(var15, var39, arg0, var41, arg7, var18, var17, arg5, (byte) 5, var40, var42);
            }
            if (var16.field1447) {
                arg2.method571(15914, var16.field1445, var16.field1421, arg0, arg4, arg7, var16.field1457);
            }
        } else if (arg8 >= 12) {
            class63 var20;
            if (var16.field1418 == -1 && var16.field1439 == null) {
                var20 = var16.method470(arg8, arg4, var11, var12, var13, var14, -1);
            } else {
                var20 = new class39(arg4, arg6, arg8, var16.field1418, var12, var11, true, 923, var14, var13);
            }
            arg1.method243(var15, var20, arg0, 1, arg7, var18, var17, arg5, (byte) 5, 0, 1);
            if (var16.field1447) {
                arg2.method571(15914, var16.field1445, var16.field1421, arg0, arg4, arg7, var16.field1457);
            }
        } else if (arg8 == 0) {
            class63 var21;
            if (var16.field1418 == -1 && var16.field1439 == null) {
                var21 = var16.method470(0, arg4, var11, var12, var13, var14, -1);
            } else {
                var21 = new class39(arg4, arg6, 0, var16.field1418, var12, var11, true, 923, var14, var13);
            }
            arg1.method241(field611[arg4], var21, 0, var15, arg5, var18, -150, var17, null, arg0, arg7);
            if (var16.field1447) {
                arg2.method570(arg0, arg8, var16.field1445, arg7, arg4, 287);
            }
        } else if (arg8 == 1) {
            class63 var22;
            if (var16.field1418 == -1 && var16.field1439 == null) {
                var22 = var16.method470(1, arg4, var11, var12, var13, var14, -1);
            } else {
                var22 = new class39(arg4, arg6, 1, var16.field1418, var12, var11, true, 923, var14, var13);
            }
            arg1.method241(field628[arg4], var22, 0, var15, arg5, var18, -150, var17, null, arg0, arg7);
            if (var16.field1447) {
                arg2.method570(arg0, arg8, var16.field1445, arg7, arg4, 287);
            }
        } else if (arg8 == 2) {
            int var23 = arg4 + 1 & 0x3;
            class63 var24;
            class63 var25;
            if (var16.field1418 == -1 && var16.field1439 == null) {
                var24 = var16.method470(2, arg4 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method470(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class39(arg4 + 4, arg6, 2, var16.field1418, var12, var11, true, 923, var14, var13);
                var25 = new class39(var23, arg6, 2, var16.field1418, var12, var11, true, 923, var14, var13);
            }
            arg1.method241(field611[arg4], var24, field611[var23], var15, arg5, var18, -150, var17, var25, arg0, arg7);
            if (var16.field1447) {
                arg2.method570(arg0, arg8, var16.field1445, arg7, arg4, 287);
            }
        } else if (arg8 == 3) {
            class63 var26;
            if (var16.field1418 == -1 && var16.field1439 == null) {
                var26 = var16.method470(3, arg4, var11, var12, var13, var14, -1);
            } else {
                var26 = new class39(arg4, arg6, 3, var16.field1418, var12, var11, true, 923, var14, var13);
            }
            arg1.method241(field628[arg4], var26, 0, var15, arg5, var18, -150, var17, null, arg0, arg7);
            if (var16.field1447) {
                arg2.method570(arg0, arg8, var16.field1445, arg7, arg4, 287);
            }
        } else if (arg8 == 9) {
            class63 var27;
            if (var16.field1418 == -1 && var16.field1439 == null) {
                var27 = var16.method470(arg8, arg4, var11, var12, var13, var14, -1);
            } else {
                var27 = new class39(arg4, arg6, arg8, var16.field1418, var12, var11, true, 923, var14, var13);
            }
            arg1.method243(var15, var27, arg0, 1, arg7, var18, var17, arg5, (byte) 5, 0, 1);
            if (var16.field1447) {
                arg2.method571(15914, var16.field1445, var16.field1421, arg0, arg4, arg7, var16.field1457);
            }
        } else {
            if (var16.field1436) {
                if (arg4 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg4 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg4 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg8 == 4) {
                class63 var32;
                if (var16.field1418 == -1 && var16.field1439 == null) {
                    var32 = var16.method470(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class39(0, arg6, 4, var16.field1418, var12, var11, true, 923, var14, var13);
                }
                arg1.method242(var32, arg4 * 512, var15, var17, arg7, arg5, field611[arg4], 0, var18, 0, (byte) 7, arg0);
            } else if (arg8 == 5) {
                int var33 = 16;
                int var34 = arg1.method259(arg5, arg7, arg0);
                if (var34 > 0) {
                    var33 = class53.method464(var34 >> 14 & 0x7FFF).field1427;
                }
                class63 var35;
                if (var16.field1418 == -1 && var16.field1439 == null) {
                    var35 = var16.method470(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class39(0, arg6, 4, var16.field1418, var12, var11, true, 923, var14, var13);
                }
                arg1.method242(var35, arg4 * 512, var15, var17, arg7, arg5, field611[arg4], field612[arg4] * var33, var18, field627[arg4] * var33, (byte) 7, arg0);
            } else if (arg8 == 6) {
                class63 var36;
                if (var16.field1418 == -1 && var16.field1439 == null) {
                    var36 = var16.method470(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class39(0, arg6, 4, var16.field1418, var12, var11, true, 923, var14, var13);
                }
                arg1.method242(var36, arg4, var15, var17, arg7, arg5, 256, 0, var18, 0, (byte) 7, arg0);
            } else if (arg8 == 7) {
                class63 var37;
                if (var16.field1418 == -1 && var16.field1439 == null) {
                    var37 = var16.method470(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class39(0, arg6, 4, var16.field1418, var12, var11, true, 923, var14, var13);
                }
                arg1.method242(var37, arg4, var15, var17, arg7, arg5, 512, 0, var18, 0, (byte) 7, arg0);
            } else if (arg8 == 8) {
                class63 var38;
                if (var16.field1418 == -1 && var16.field1439 == null) {
                    var38 = var16.method470(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class39(0, arg6, 4, var16.field1418, var12, var11, true, 923, var14, var13);
                }
                arg1.method242(var38, arg4, var15, var17, arg7, arg5, 768, 0, var18, 0, (byte) 7, arg0);
            }
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(LXOUQUKZW;IIZIIII)V")
    private final void method198(class62 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3) {
            this.field616 = 480;
        }
        if (arg1 < 0 || arg1 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var11 = arg0.method521();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method521();
                    return;
                }
                if (var11 <= 49) {
                    arg0.method521();
                }
            }
        }
        this.field613[arg2][arg1][arg5] = 0;
        while (true) {
            int var9 = arg0.method521();
            if (var9 == 0) {
                if (arg2 == 0) {
                    this.field636[0][arg1][arg5] = -method193(arg1 + arg4 + 932731, arg5 + 556238 + arg7) * 8;
                    return;
                } else {
                    this.field636[arg2][arg1][arg5] = this.field636[arg2 - 1][arg1][arg5] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method521();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg2 == 0) {
                    this.field636[0][arg1][arg5] = -var10 * 8;
                    return;
                }
                this.field636[arg2][arg1][arg5] = this.field636[arg2 - 1][arg1][arg5] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field604[arg2][arg1][arg5] = arg0.method522();
                this.field618[arg2][arg1][arg5] = (byte) ((var9 - 2) / 4);
                this.field632[arg2][arg1][arg5] = (byte) (var9 + arg6 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field613[arg2][arg1][arg5] = (byte) (var9 - 49);
            } else {
                this.field619[arg2][arg1][arg5] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(ILYMCKWFGH;IIIILGLVCMXFQ;II)V")
    private final void method199(int arg0, class68 arg1, int arg2, int arg3, int arg4, int arg5, class22 arg6, int arg7, int arg8) {
        if (field633 && (this.field613[0][arg7][arg2] & 0x2) == 0) {
            if ((this.field613[arg0][arg7][arg2] & 0x10) != 0) {
                return;
            }
            if (this.method208(this.field606, arg0, arg2, arg7) != field630) {
                return;
            }
        }
        if (arg0 < field608) {
            field608 = arg0;
        }
        int var10 = this.field636[arg0][arg7][arg2];
        int var11 = this.field636[arg0][arg7 + 1][arg2];
        if (arg5 < this.field629 || arg5 > this.field629) {
            field605 = !field605;
        }
        int var12 = this.field636[arg0][arg7 + 1][arg2 + 1];
        int var13 = this.field636[arg0][arg7][arg2 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class53 var15 = class53.method464(arg4);
        int var16 = (arg4 << 14) + (arg2 << 7) + arg7 + 1073741824;
        if (!var15.field1424) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg3 << 6) + arg8);
        if (arg8 == 22) {
            if (!field633 || var15.field1424 || var15.field1467) {
                class63 var18;
                if (var15.field1418 == -1 && var15.field1439 == null) {
                    var18 = var15.method470(22, arg3, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class39(arg3, arg4, 22, var15.field1418, var11, var10, true, 923, var13, var12);
                }
                arg6.method239((byte) 3, var14, arg2, var17, arg7, arg0, var18, var16);
                if (var15.field1447 && var15.field1424 && arg1 != null) {
                    arg1.method572(0, arg7, arg2);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class63 var38;
            if (var15.field1418 == -1 && var15.field1439 == null) {
                var38 = var15.method470(10, arg3, var10, var11, var12, var13, -1);
            } else {
                var38 = new class39(arg3, arg4, 10, var15.field1418, var11, var10, true, 923, var13, var12);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg8 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg3 == 1 || arg3 == 3) {
                    var40 = var15.field1457;
                    var41 = var15.field1421;
                } else {
                    var40 = var15.field1421;
                    var41 = var15.field1457;
                }
                if (arg6.method243(var14, var38, arg2, var40, arg7, var17, var16, arg0, (byte) 5, var39, var41) && var15.field1466) {
                    class35 var42;
                    if (var38 instanceof class35) {
                        var42 = (class35) var38;
                    } else {
                        var42 = var15.method470(10, arg3, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1034 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field615[arg0][arg7 + var43][arg2 + var44]) {
                                    this.field615[arg0][arg7 + var43][arg2 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1447 && arg1 != null) {
                arg1.method571(15914, var15.field1445, var15.field1421, arg2, arg3, arg7, var15.field1457);
            }
        } else if (arg8 >= 12) {
            class63 var19;
            if (var15.field1418 == -1 && var15.field1439 == null) {
                var19 = var15.method470(arg8, arg3, var10, var11, var12, var13, -1);
            } else {
                var19 = new class39(arg3, arg4, arg8, var15.field1418, var11, var10, true, 923, var13, var12);
            }
            arg6.method243(var14, var19, arg2, 1, arg7, var17, var16, arg0, (byte) 5, 0, 1);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg0 > 0) {
                this.field626[arg0][arg7][arg2] |= 0x924;
            }
            if (var15.field1447 && arg1 != null) {
                arg1.method571(15914, var15.field1445, var15.field1421, arg2, arg3, arg7, var15.field1457);
            }
        } else if (arg8 == 0) {
            class63 var20;
            if (var15.field1418 == -1 && var15.field1439 == null) {
                var20 = var15.method470(0, arg3, var10, var11, var12, var13, -1);
            } else {
                var20 = new class39(arg3, arg4, 0, var15.field1418, var11, var10, true, 923, var13, var12);
            }
            arg6.method241(field611[arg3], var20, 0, var14, arg0, var17, -150, var16, null, arg2, arg7);
            if (arg3 == 0) {
                if (var15.field1466) {
                    this.field615[arg0][arg7][arg2] = 50;
                    this.field615[arg0][arg7][arg2 + 1] = 50;
                }
                if (var15.field1442) {
                    this.field626[arg0][arg7][arg2] |= 0x249;
                }
            } else if (arg3 == 1) {
                if (var15.field1466) {
                    this.field615[arg0][arg7][arg2 + 1] = 50;
                    this.field615[arg0][arg7 + 1][arg2 + 1] = 50;
                }
                if (var15.field1442) {
                    this.field626[arg0][arg7][arg2 + 1] |= 0x492;
                }
            } else if (arg3 == 2) {
                if (var15.field1466) {
                    this.field615[arg0][arg7 + 1][arg2] = 50;
                    this.field615[arg0][arg7 + 1][arg2 + 1] = 50;
                }
                if (var15.field1442) {
                    this.field626[arg0][arg7 + 1][arg2] |= 0x249;
                }
            } else if (arg3 == 3) {
                if (var15.field1466) {
                    this.field615[arg0][arg7][arg2] = 50;
                    this.field615[arg0][arg7 + 1][arg2] = 50;
                }
                if (var15.field1442) {
                    this.field626[arg0][arg7][arg2] |= 0x492;
                }
            }
            if (var15.field1447 && arg1 != null) {
                arg1.method570(arg2, arg8, var15.field1445, arg7, arg3, 287);
            }
            if (var15.field1427 != 16) {
                arg6.method249(arg0, var15.field1427, arg2, arg7, (byte) -58);
            }
        } else if (arg8 == 1) {
            class63 var21;
            if (var15.field1418 == -1 && var15.field1439 == null) {
                var21 = var15.method470(1, arg3, var10, var11, var12, var13, -1);
            } else {
                var21 = new class39(arg3, arg4, 1, var15.field1418, var11, var10, true, 923, var13, var12);
            }
            arg6.method241(field628[arg3], var21, 0, var14, arg0, var17, -150, var16, null, arg2, arg7);
            if (var15.field1466) {
                if (arg3 == 0) {
                    this.field615[arg0][arg7][arg2 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field615[arg0][arg7 + 1][arg2 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field615[arg0][arg7 + 1][arg2] = 50;
                } else if (arg3 == 3) {
                    this.field615[arg0][arg7][arg2] = 50;
                }
            }
            if (var15.field1447 && arg1 != null) {
                arg1.method570(arg2, arg8, var15.field1445, arg7, arg3, 287);
            }
        } else if (arg8 == 2) {
            int var22 = arg3 + 1 & 0x3;
            class63 var23;
            class63 var24;
            if (var15.field1418 == -1 && var15.field1439 == null) {
                var23 = var15.method470(2, arg3 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method470(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class39(arg3 + 4, arg4, 2, var15.field1418, var11, var10, true, 923, var13, var12);
                var24 = new class39(var22, arg4, 2, var15.field1418, var11, var10, true, 923, var13, var12);
            }
            arg6.method241(field611[arg3], var23, field611[var22], var14, arg0, var17, -150, var16, var24, arg2, arg7);
            if (var15.field1442) {
                if (arg3 == 0) {
                    this.field626[arg0][arg7][arg2] |= 0x249;
                    this.field626[arg0][arg7][arg2 + 1] |= 0x492;
                } else if (arg3 == 1) {
                    this.field626[arg0][arg7][arg2 + 1] |= 0x492;
                    this.field626[arg0][arg7 + 1][arg2] |= 0x249;
                } else if (arg3 == 2) {
                    this.field626[arg0][arg7 + 1][arg2] |= 0x249;
                    this.field626[arg0][arg7][arg2] |= 0x492;
                } else if (arg3 == 3) {
                    this.field626[arg0][arg7][arg2] |= 0x492;
                    this.field626[arg0][arg7][arg2] |= 0x249;
                }
            }
            if (var15.field1447 && arg1 != null) {
                arg1.method570(arg2, arg8, var15.field1445, arg7, arg3, 287);
            }
            if (var15.field1427 != 16) {
                arg6.method249(arg0, var15.field1427, arg2, arg7, (byte) -58);
            }
        } else if (arg8 == 3) {
            class63 var25;
            if (var15.field1418 == -1 && var15.field1439 == null) {
                var25 = var15.method470(3, arg3, var10, var11, var12, var13, -1);
            } else {
                var25 = new class39(arg3, arg4, 3, var15.field1418, var11, var10, true, 923, var13, var12);
            }
            arg6.method241(field628[arg3], var25, 0, var14, arg0, var17, -150, var16, null, arg2, arg7);
            if (var15.field1466) {
                if (arg3 == 0) {
                    this.field615[arg0][arg7][arg2 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field615[arg0][arg7 + 1][arg2 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field615[arg0][arg7 + 1][arg2] = 50;
                } else if (arg3 == 3) {
                    this.field615[arg0][arg7][arg2] = 50;
                }
            }
            if (var15.field1447 && arg1 != null) {
                arg1.method570(arg2, arg8, var15.field1445, arg7, arg3, 287);
            }
        } else if (arg8 == 9) {
            class63 var26;
            if (var15.field1418 == -1 && var15.field1439 == null) {
                var26 = var15.method470(arg8, arg3, var10, var11, var12, var13, -1);
            } else {
                var26 = new class39(arg3, arg4, arg8, var15.field1418, var11, var10, true, 923, var13, var12);
            }
            arg6.method243(var14, var26, arg2, 1, arg7, var17, var16, arg0, (byte) 5, 0, 1);
            if (var15.field1447 && arg1 != null) {
                arg1.method571(15914, var15.field1445, var15.field1421, arg2, arg3, arg7, var15.field1457);
            }
        } else {
            if (var15.field1436) {
                if (arg3 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg3 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg3 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg8 == 4) {
                class63 var31;
                if (var15.field1418 == -1 && var15.field1439 == null) {
                    var31 = var15.method470(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class39(0, arg4, 4, var15.field1418, var11, var10, true, 923, var13, var12);
                }
                arg6.method242(var31, arg3 * 512, var14, var16, arg7, arg0, field611[arg3], 0, var17, 0, (byte) 7, arg2);
            } else if (arg8 == 5) {
                int var32 = 16;
                int var33 = arg6.method259(arg0, arg7, arg2);
                if (var33 > 0) {
                    var32 = class53.method464(var33 >> 14 & 0x7FFF).field1427;
                }
                class63 var34;
                if (var15.field1418 == -1 && var15.field1439 == null) {
                    var34 = var15.method470(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class39(0, arg4, 4, var15.field1418, var11, var10, true, 923, var13, var12);
                }
                arg6.method242(var34, arg3 * 512, var14, var16, arg7, arg0, field611[arg3], field612[arg3] * var32, var17, field627[arg3] * var32, (byte) 7, arg2);
            } else if (arg8 == 6) {
                class63 var35;
                if (var15.field1418 == -1 && var15.field1439 == null) {
                    var35 = var15.method470(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class39(0, arg4, 4, var15.field1418, var11, var10, true, 923, var13, var12);
                }
                arg6.method242(var35, arg3, var14, var16, arg7, arg0, 256, 0, var17, 0, (byte) 7, arg2);
            } else if (arg8 == 7) {
                class63 var36;
                if (var15.field1418 == -1 && var15.field1439 == null) {
                    var36 = var15.method470(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class39(0, arg4, 4, var15.field1418, var11, var10, true, 923, var13, var12);
                }
                arg6.method242(var36, arg3, var14, var16, arg7, arg0, 512, 0, var17, 0, (byte) 7, arg2);
            } else if (arg8 == 8) {
                class63 var37;
                if (var15.field1418 == -1 && var15.field1439 == null) {
                    var37 = var15.method470(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class39(0, arg4, 4, var15.field1418, var11, var10, true, 923, var13, var12);
                }
                arg6.method242(var37, arg3, var14, var16, arg7, arg0, 768, 0, var17, 0, (byte) 7, arg2);
            }
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(I[BIIII[LYMCKWFGH;)V")
    public final void method200(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class68[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 + var13 > 0 && arg4 + var13 < 103 && arg0 + var14 > 0 && arg0 + var14 < 103) {
                        arg6[var8].field1644[arg4 + var13][arg0 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class62 var9 = new class62(-417, arg1);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method198(var9, arg4 + var11, var10, false, arg3, arg0 + var12, 0, arg2);
                }
            }
        }
        if (arg5 >= 0) {
            field620 = -157;
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "d", descriptor = "(II)I")
    private static final int method201(int arg0, int arg1) {
        int var2 = method188(arg0 - 1, arg1 - 1) + method188(arg0 + 1, arg1 - 1) + method188(arg0 - 1, arg1 + 1) + method188(arg0 + 1, arg1 + 1);
        int var3 = method188(arg0 - 1, arg1) + method188(arg0 + 1, arg1) + method188(arg0, arg1 - 1) + method188(arg0, arg1 + 1);
        int var4 = method188(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "DWQOSSFD", name = "b", descriptor = "(III)Z")
    public static final boolean method202(int arg0, int arg1, int arg2) {
        if (arg0 != -26485) {
            throw new NullPointerException();
        }
        class53 var3 = class53.method464(arg2);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method461(field603, arg1);
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(II[LYMCKWFGH;Z[BIIIII)V")
    public final void method203(int arg0, int arg1, class68[] arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg1 + var11 > 0 && arg1 + var11 < 103 && arg8 + var17 > 0 && arg8 + var17 < 103) {
                    arg2[arg6].field1644[arg1 + var11][arg8 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        if (!arg3) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        class62 var13 = new class62(-417, arg4);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg7 == var14 && var15 >= arg9 && var15 < arg9 + 8 && var16 >= arg0 && var16 < arg0 + 8) {
                        this.method198(var13, arg1 + class27.method312(var15 & 0x7, arg5, var16 & 0x7, (byte) 5), arg6, false, 0, arg8 + class27.method313(var16 & 0x7, var15 & 0x7, arg5, (byte) 7), arg5, 0);
                    } else {
                        this.method198(var13, -1, 0, false, 0, -1, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "([LYMCKWFGH;LGLVCMXFQ;Z)V")
    public final void method204(class68[] arg0, class22 arg1, boolean arg2) {
        if (arg2) {
            this.field629 = 12;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field613[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field613[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method572(0, var110, var111);
                        }
                    }
                }
            }
        }
        field635 += (int) (Math.random() * 5.0D) - 2;
        if (field635 < -8) {
            field635 = -8;
        }
        if (field635 > 8) {
            field635 = 8;
        }
        field634 += (int) (Math.random() * 5.0D) - 2;
        if (field634 < -16) {
            field634 = -16;
        }
        if (field634 > 16) {
            field634 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field615[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field610 - 1; var56++) {
                for (int var101 = 1; var101 < this.field609 - 1; var101++) {
                    int var102 = this.field636[var5][var101 + 1][var56] - this.field636[var5][var101 - 1][var56];
                    int var103 = this.field636[var5][var101][var56 + 1] - this.field636[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field631[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field610; var57++) {
                this.field621[var57] = 0;
                this.field622[var57] = 0;
                this.field623[var57] = 0;
                this.field624[var57] = 0;
                this.field625[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field609 + 5; var58++) {
                for (int var61 = 0; var61 < this.field610; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field609) {
                        int var96 = this.field619[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class13 var97 = class13.field641[var96 - 1];
                            this.field621[var61] += var97.field650;
                            this.field622[var61] += var97.field648;
                            this.field623[var61] += var97.field649;
                            this.field624[var61] += var97.field651;
                            var10002 = this.field625[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field609) {
                        int var99 = this.field619[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class13 var100 = class13.field641[var99 - 1];
                            this.field621[var61] -= var100.field650;
                            this.field622[var61] -= var100.field648;
                            this.field623[var61] -= var100.field649;
                            this.field624[var61] -= var100.field651;
                            var10002 = this.field625[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field609 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field610 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field610) {
                            var62 += this.field621[var68];
                            var63 += this.field622[var68];
                            var64 += this.field623[var68];
                            var65 += this.field624[var68];
                            var66 += this.field625[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field610) {
                            var62 -= this.field621[var69];
                            var63 -= this.field622[var69];
                            var64 -= this.field623[var69];
                            var65 -= this.field624[var69];
                            var66 -= this.field625[var69];
                        }
                        if (var67 >= 1 && var67 < this.field610 - 1 && (!field633 || (this.field613[0][var58][var67] & 0x2) != 0 || (this.field613[var5][var58][var67] & 0x10) == 0 && this.method208(this.field606, var5, var67, var58) == field630)) {
                            if (var5 < field608) {
                                field608 = var5;
                            }
                            int var70 = this.field619[var5][var58][var67] & 0xFF;
                            int var71 = this.field604[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field636[var5][var58][var67];
                                int var73 = this.field636[var5][var58 + 1][var67];
                                int var74 = this.field636[var5][var58 + 1][var67 + 1];
                                int var75 = this.field636[var5][var58][var67 + 1];
                                int var76 = this.field631[var58][var67];
                                int var77 = this.field631[var58 + 1][var67];
                                int var78 = this.field631[var58 + 1][var67 + 1];
                                int var79 = this.field631[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method192(var82, var83, var84);
                                    int var85 = field635 + var82 & 0xFF;
                                    int var86 = field634 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method192(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field618[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class13.field641[var71 - 1].field646) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field626[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class47.field1238[method196(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method238(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method196(var80, var76), method196(var80, var77), method196(var80, var78), method196(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field618[var5][var58][var67] + 1;
                                    byte var90 = this.field632[var5][var58][var67];
                                    class13 var91 = class13.field641[var71 - 1];
                                    int var92 = var91.field644;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class47.method437(-17795, var92);
                                        var94 = -1;
                                    } else if (var91.field643 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method192(var91.field647, var91.field648, var91.field649);
                                        var93 = class47.field1238[this.method207(var91.field652, 96)];
                                    }
                                    arg1.method238(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method196(var80, var76), method196(var80, var77), method196(var80, var78), method196(var80, var79), this.method207(var94, var76), this.method207(var94, var77), this.method207(var94, var78), this.method207(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field610 - 1; var59++) {
                for (int var60 = 1; var60 < this.field609 - 1; var60++) {
                    arg1.method237(var5, var60, var59, this.method208(this.field606, var5, var59, var60));
                }
            }
        }
        arg1.method264(-50, 49, -10, 768, -50, 64);
        for (int var6 = 0; var6 < this.field609; var6++) {
            for (int var47 = 0; var47 < this.field610; var47++) {
                if ((this.field613[1][var6][var47] & 0x2) == 2) {
                    arg1.method235(var47, 0, var6);
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
                for (int var12 = 0; var12 <= this.field610; var12++) {
                    for (int var13 = 0; var13 <= this.field609; var13++) {
                        if ((this.field626[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field626[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field610 && (this.field626[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field626[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field626[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field636[var17][var13][var14] - var21;
                                int var23 = this.field636[var16][var13][var14];
                                class22.method236(this.field617, var13 * 128, var10, var22, var13 * 128, var14 * 128, var23, var15 * 128 + 128, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field626[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field626[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field626[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field609 && (this.field626[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field626[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field626[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field636[var29][var26][var12] - var33;
                                int var35 = this.field636[var28][var26][var12];
                                class22.method236(this.field617, var26 * 128, var10, var34, var27 * 128 + 128, var12 * 128, var35, var12 * 128, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field626[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field626[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field626[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field610 && (this.field626[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field626[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field609) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field626[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field636[var11][var38][var40];
                                class22.method236(this.field617, var38 * 128, var10, var44, var39 * 128 + 128, var40 * 128, var44, var41 * 128 + 128, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field626[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "<init>", descriptor = "(IZ[[[I[[[BI)V")
    public class11(int arg0, boolean arg1, int[][][] arg2, byte[][][] arg3, int arg4) {
        field608 = 99;
        this.field609 = arg0;
        this.field610 = arg4;
        this.field636 = arg2;
        this.field613 = arg3;
        this.field619 = new byte[4][this.field609][this.field610];
        this.field604 = new byte[4][this.field609][this.field610];
        this.field618 = new byte[4][this.field609][this.field610];
        this.field632 = new byte[4][this.field609][this.field610];
        this.field626 = new int[4][this.field609 + 1][this.field610 + 1];
        this.field615 = new byte[4][this.field609 + 1][this.field610 + 1];
        if (!arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field631 = new int[this.field609 + 1][this.field610 + 1];
        this.field621 = new int[this.field610];
        this.field622 = new int[this.field610];
        this.field623 = new int[this.field610];
        this.field624 = new int[this.field610];
        this.field625 = new int[this.field610];
    }

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(ILGLVCMXFQ;I[B[LYMCKWFGH;I)V")
    public final void method205(int arg0, class22 arg1, int arg2, byte[] arg3, class68[] arg4, int arg5) {
        class62 var7 = new class62(-417, arg3);
        if (arg5 != 20236) {
            this.field616 = -368;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method535();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method535();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method521();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var13;
                int var19 = arg2 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field613[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class68 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    this.method199(var14, var21, var19, var17, var8, 4, arg1, var18, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "DWQOSSFD", name = "c", descriptor = "(III)I")
    private static final int method206(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method201(var3, var5);
        int var8 = method201(var3 + 1, var5);
        int var9 = method201(var3, var5 + 1);
        int var10 = method201(var3 + 1, var5 + 1);
        int var11 = method189(var7, var8, var4, arg2);
        int var12 = method189(var9, var10, var4, arg2);
        return method189(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "DWQOSSFD", name = "e", descriptor = "(II)I")
    private final int method207(int arg0, int arg1) {
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

    @OriginalMember(owner = "DWQOSSFD", name = "a", descriptor = "(BIII)I")
    public int method208(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 8) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field613[arg1][arg3][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (this.field613[1][arg3][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }
}
