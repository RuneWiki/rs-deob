import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DIFHBVBT")
public class class14 {

    @OriginalMember(owner = "DIFHBVBT", name = "g", descriptor = "B")
    private byte field601 = 6;

    @OriginalMember(owner = "DIFHBVBT", name = "s", descriptor = "B")
    private byte field613 = 6;

    @OriginalMember(owner = "DIFHBVBT", name = "u", descriptor = "Z")
    private boolean field615 = false;

    @OriginalMember(owner = "DIFHBVBT", name = "w", descriptor = "Z")
    private boolean field617 = false;

    @OriginalMember(owner = "DIFHBVBT", name = "F", descriptor = "I")
    private int field626 = 4;

    @OriginalMember(owner = "DIFHBVBT", name = "G", descriptor = "I")
    private int field627 = -965;

    @OriginalMember(owner = "DIFHBVBT", name = "z", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "DIFHBVBT", name = "A", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "DIFHBVBT", name = "B", descriptor = "[[[I")
    private int[][][] field622;

    @OriginalMember(owner = "DIFHBVBT", name = "c", descriptor = "[[[B")
    private byte[][][] field597;

    @OriginalMember(owner = "DIFHBVBT", name = "h", descriptor = "[[[B")
    private byte[][][] field602;

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "[[[B")
    private byte[][][] field595;

    @OriginalMember(owner = "DIFHBVBT", name = "C", descriptor = "[[[B")
    private byte[][][] field623;

    @OriginalMember(owner = "DIFHBVBT", name = "t", descriptor = "[[[B")
    private byte[][][] field614;

    @OriginalMember(owner = "DIFHBVBT", name = "D", descriptor = "[[[I")
    private int[][][] field624;

    @OriginalMember(owner = "DIFHBVBT", name = "H", descriptor = "[[[B")
    private byte[][][] field628;

    @OriginalMember(owner = "DIFHBVBT", name = "k", descriptor = "[[I")
    private int[][] field605;

    @OriginalMember(owner = "DIFHBVBT", name = "n", descriptor = "[I")
    private int[] field608;

    @OriginalMember(owner = "DIFHBVBT", name = "o", descriptor = "[I")
    private int[] field609;

    @OriginalMember(owner = "DIFHBVBT", name = "p", descriptor = "[I")
    private int[] field610;

    @OriginalMember(owner = "DIFHBVBT", name = "q", descriptor = "[I")
    private int[] field611;

    @OriginalMember(owner = "DIFHBVBT", name = "r", descriptor = "[I")
    private int[] field612;

    @OriginalMember(owner = "DIFHBVBT", name = "b", descriptor = "[I")
    private static final int[] field596 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "DIFHBVBT", name = "d", descriptor = "[I")
    private static final int[] field598 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "DIFHBVBT", name = "e", descriptor = "B")
    private static byte field599 = 7;

    @OriginalMember(owner = "DIFHBVBT", name = "f", descriptor = "I")
    private static int field600 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "DIFHBVBT", name = "j", descriptor = "[I")
    private static final int[] field604 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "DIFHBVBT", name = "v", descriptor = "I")
    private static int field616 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "DIFHBVBT", name = "x", descriptor = "Z")
    public static boolean field618 = true;

    @OriginalMember(owner = "DIFHBVBT", name = "y", descriptor = "I")
    public static int field619 = 99;

    @OriginalMember(owner = "DIFHBVBT", name = "E", descriptor = "[I")
    private static final int[] field625 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "DIFHBVBT", name = "l", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "DIFHBVBT", name = "i", descriptor = "Z")
    private static boolean field603;

    @OriginalMember(owner = "DIFHBVBT", name = "m", descriptor = "Z")
    private static boolean field607;

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(LCFARFRSG;IIIIIII)V")
    private final void method234(class8 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 <= 0) {
            this.field617 = !this.field617;
        }
        if (arg2 < 0 || arg2 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var11 = arg0.method30();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method30();
                    return;
                }
                if (var11 <= 49) {
                    arg0.method30();
                }
            }
        }
        this.field597[arg6][arg2][arg4] = 0;
        while (true) {
            int var9 = arg0.method30();
            if (var9 == 0) {
                if (arg6 == 0) {
                    this.field622[0][arg2][arg4] = -method245(arg2 + arg3 + 932731, arg4 + 556238 + arg7) * 8;
                    return;
                } else {
                    this.field622[arg6][arg2][arg4] = this.field622[arg6 - 1][arg2][arg4] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method30();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg6 == 0) {
                    this.field622[0][arg2][arg4] = -var10 * 8;
                    return;
                }
                this.field622[arg6][arg2][arg4] = this.field622[arg6 - 1][arg2][arg4] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field595[arg6][arg2][arg4] = arg0.method31();
                this.field623[arg6][arg2][arg4] = (byte) ((var9 - 2) / 4);
                this.field614[arg6][arg2][arg4] = (byte) (var9 + arg5 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field597[arg6][arg2][arg4] = (byte) (var9 - 49);
            } else {
                this.field602[arg6][arg2][arg4] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(III)I")
    private static final int method235(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method237(var3, var5);
        int var8 = method237(var3 + 1, var5);
        int var9 = method237(var3, var5 + 1);
        int var10 = method237(var3 + 1, var5 + 1);
        int var11 = method248(var7, var8, var4, arg2);
        int var12 = method248(var9, var10, var4, arg2);
        return method248(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(IZIII)V")
    public final void method236(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            return;
        }
        for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg4; var7 <= arg3 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field620 && var6 >= 0 && var6 < this.field621) {
                    this.field628[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.field622[0][var7][var6] = this.field622[0][var7 - 1][var6];
                    }
                    if (arg3 + arg4 == var7 && var7 < this.field620 - 1) {
                        this.field622[0][var7][var6] = this.field622[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field622[0][var7][var6] = this.field622[0][var7][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < this.field621 - 1) {
                        this.field622[0][var7][var6] = this.field622[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(II)I")
    private static final int method237(int arg0, int arg1) {
        int var2 = method250(arg0 - 1, arg1 - 1) + method250(arg0 + 1, arg1 - 1) + method250(arg0 - 1, arg1 + 1) + method250(arg0 + 1, arg1 + 1);
        int var3 = method250(arg0 - 1, arg1) + method250(arg0 + 1, arg1) + method250(arg0, arg1 - 1) + method250(arg0, arg1 + 1);
        int var4 = method250(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "DIFHBVBT", name = "b", descriptor = "(II)I")
    private final int method238(int arg0, int arg1) {
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

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(LSIPXLNWG;IILHQFIXEZL;IIIII)V")
    private final void method239(class57 arg0, int arg1, int arg2, class28 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 16 / arg2;
        if (field618 && (this.field597[0][arg1][arg4] & 0x2) == 0) {
            if ((this.field597[arg5][arg1][arg4] & 0x10) != 0) {
                return;
            }
            if (this.method249(this.field613, arg1, arg5, arg4) != field606) {
                return;
            }
        }
        if (arg5 < field619) {
            field619 = arg5;
        }
        int var11 = this.field622[arg5][arg1][arg4];
        int var12 = this.field622[arg5][arg1 + 1][arg4];
        int var13 = this.field622[arg5][arg1 + 1][arg4 + 1];
        int var14 = this.field622[arg5][arg1][arg4 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class54 var16 = class54.method486(arg6);
        int var17 = (arg6 << 14) + (arg4 << 7) + arg1 + 1073741824;
        if (!var16.field1353) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg7 << 6) + arg8);
        if (arg8 == 22) {
            if (!field618 || var16.field1353 || var16.field1368) {
                class12 var19;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var19 = var16.method478(22, arg7, var11, var12, var13, var14, -1);
                } else {
                    var19 = new class41((byte) 1, true, var14, var11, var12, arg6, 22, arg7, var13, var16.field1370);
                }
                arg0.method502(var18, arg5, var15, var17, arg4, field599, arg1, var19);
                if (var16.field1365 && var16.field1353 && arg3 != null) {
                    arg3.method303(arg1, arg4, -190);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class12 var39;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var39 = var16.method478(10, arg7, var11, var12, var13, var14, -1);
            } else {
                var39 = new class41((byte) 1, true, var14, var11, var12, arg6, 10, arg7, var13, var16.field1370);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg8 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg7 == 1 || arg7 == 3) {
                    var41 = var16.field1339;
                    var42 = var16.field1380;
                } else {
                    var41 = var16.field1380;
                    var42 = var16.field1339;
                }
                if (arg0.method506(arg4, arg1, var15, var17, var40, var39, 0, var42, arg5, var41, var18) && var16.field1342) {
                    class37 var43;
                    if (var39 instanceof class37) {
                        var43 = (class37) var39;
                    } else {
                        var43 = var16.method478(10, arg7, var11, var12, var13, var14, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field991 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field628[arg5][arg1 + var44][arg4 + var45]) {
                                    this.field628[arg5][arg1 + var44][arg4 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var16.field1365 && arg3 != null) {
                arg3.method302(9, arg4, arg1, var16.field1380, arg7, var16.field1339, var16.field1354);
            }
        } else if (arg8 >= 12) {
            class12 var20;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var20 = var16.method478(arg8, arg7, var11, var12, var13, var14, -1);
            } else {
                var20 = new class41((byte) 1, true, var14, var11, var12, arg6, arg8, arg7, var13, var16.field1370);
            }
            arg0.method506(arg4, arg1, var15, var17, 0, var20, 0, 1, arg5, 1, var18);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg5 > 0) {
                this.field624[arg5][arg1][arg4] |= 0x924;
            }
            if (var16.field1365 && arg3 != null) {
                arg3.method302(9, arg4, arg1, var16.field1380, arg7, var16.field1339, var16.field1354);
            }
        } else if (arg8 == 0) {
            class12 var21;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var21 = var16.method478(0, arg7, var11, var12, var13, var14, -1);
            } else {
                var21 = new class41((byte) 1, true, var14, var11, var12, arg6, 0, arg7, var13, var16.field1370);
            }
            arg0.method504(null, var17, var18, 0, var21, var15, arg1, false, arg5, arg4, field596[arg7]);
            if (arg7 == 0) {
                if (var16.field1342) {
                    this.field628[arg5][arg1][arg4] = 50;
                    this.field628[arg5][arg1][arg4 + 1] = 50;
                }
                if (var16.field1379) {
                    this.field624[arg5][arg1][arg4] |= 0x249;
                }
            } else if (arg7 == 1) {
                if (var16.field1342) {
                    this.field628[arg5][arg1][arg4 + 1] = 50;
                    this.field628[arg5][arg1 + 1][arg4 + 1] = 50;
                }
                if (var16.field1379) {
                    this.field624[arg5][arg1][arg4 + 1] |= 0x492;
                }
            } else if (arg7 == 2) {
                if (var16.field1342) {
                    this.field628[arg5][arg1 + 1][arg4] = 50;
                    this.field628[arg5][arg1 + 1][arg4 + 1] = 50;
                }
                if (var16.field1379) {
                    this.field624[arg5][arg1 + 1][arg4] |= 0x249;
                }
            } else if (arg7 == 3) {
                if (var16.field1342) {
                    this.field628[arg5][arg1][arg4] = 50;
                    this.field628[arg5][arg1 + 1][arg4] = 50;
                }
                if (var16.field1379) {
                    this.field624[arg5][arg1][arg4] |= 0x492;
                }
            }
            if (var16.field1365 && arg3 != null) {
                arg3.method301(arg8, arg1, field603, var16.field1354, arg7, arg4);
            }
            if (var16.field1372 != 16) {
                arg0.method512(var16.field1372, arg4, -853, arg5, arg1);
            }
        } else if (arg8 == 1) {
            class12 var22;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var22 = var16.method478(1, arg7, var11, var12, var13, var14, -1);
            } else {
                var22 = new class41((byte) 1, true, var14, var11, var12, arg6, 1, arg7, var13, var16.field1370);
            }
            arg0.method504(null, var17, var18, 0, var22, var15, arg1, false, arg5, arg4, field625[arg7]);
            if (var16.field1342) {
                if (arg7 == 0) {
                    this.field628[arg5][arg1][arg4 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field628[arg5][arg1 + 1][arg4 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field628[arg5][arg1 + 1][arg4] = 50;
                } else if (arg7 == 3) {
                    this.field628[arg5][arg1][arg4] = 50;
                }
            }
            if (var16.field1365 && arg3 != null) {
                arg3.method301(arg8, arg1, field603, var16.field1354, arg7, arg4);
            }
        } else if (arg8 == 2) {
            int var23 = arg7 + 1 & 0x3;
            class12 var24;
            class12 var25;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var24 = var16.method478(2, arg7 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method478(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class41((byte) 1, true, var14, var11, var12, arg6, 2, arg7 + 4, var13, var16.field1370);
                var25 = new class41((byte) 1, true, var14, var11, var12, arg6, 2, var23, var13, var16.field1370);
            }
            arg0.method504(var25, var17, var18, field596[var23], var24, var15, arg1, false, arg5, arg4, field596[arg7]);
            if (var16.field1379) {
                if (arg7 == 0) {
                    this.field624[arg5][arg1][arg4] |= 0x249;
                    this.field624[arg5][arg1][arg4 + 1] |= 0x492;
                } else if (arg7 == 1) {
                    this.field624[arg5][arg1][arg4 + 1] |= 0x492;
                    this.field624[arg5][arg1 + 1][arg4] |= 0x249;
                } else if (arg7 == 2) {
                    this.field624[arg5][arg1 + 1][arg4] |= 0x249;
                    this.field624[arg5][arg1][arg4] |= 0x492;
                } else if (arg7 == 3) {
                    this.field624[arg5][arg1][arg4] |= 0x492;
                    this.field624[arg5][arg1][arg4] |= 0x249;
                }
            }
            if (var16.field1365 && arg3 != null) {
                arg3.method301(arg8, arg1, field603, var16.field1354, arg7, arg4);
            }
            if (var16.field1372 != 16) {
                arg0.method512(var16.field1372, arg4, -853, arg5, arg1);
            }
        } else if (arg8 == 3) {
            class12 var26;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var26 = var16.method478(3, arg7, var11, var12, var13, var14, -1);
            } else {
                var26 = new class41((byte) 1, true, var14, var11, var12, arg6, 3, arg7, var13, var16.field1370);
            }
            arg0.method504(null, var17, var18, 0, var26, var15, arg1, false, arg5, arg4, field625[arg7]);
            if (var16.field1342) {
                if (arg7 == 0) {
                    this.field628[arg5][arg1][arg4 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field628[arg5][arg1 + 1][arg4 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field628[arg5][arg1 + 1][arg4] = 50;
                } else if (arg7 == 3) {
                    this.field628[arg5][arg1][arg4] = 50;
                }
            }
            if (var16.field1365 && arg3 != null) {
                arg3.method301(arg8, arg1, field603, var16.field1354, arg7, arg4);
            }
        } else if (arg8 == 9) {
            class12 var27;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var27 = var16.method478(arg8, arg7, var11, var12, var13, var14, -1);
            } else {
                var27 = new class41((byte) 1, true, var14, var11, var12, arg6, arg8, arg7, var13, var16.field1370);
            }
            arg0.method506(arg4, arg1, var15, var17, 0, var27, 0, 1, arg5, 1, var18);
            if (var16.field1365 && arg3 != null) {
                arg3.method302(9, arg4, arg1, var16.field1380, arg7, var16.field1339, var16.field1354);
            }
        } else {
            if (var16.field1371) {
                if (arg7 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg7 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg7 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg8 == 4) {
                class12 var32;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var32 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class41((byte) 1, true, var14, var11, var12, arg6, 4, 0, var13, var16.field1370);
                }
                arg0.method505(var15, arg1, arg5, var17, arg7 * 512, var18, var32, arg4, field596[arg7], 0, 0, (byte) 2);
            } else if (arg8 == 5) {
                int var33 = 16;
                int var34 = arg0.method522(arg5, arg1, arg4);
                if (var34 > 0) {
                    var33 = class54.method486(var34 >> 14 & 0x7FFF).field1372;
                }
                class12 var35;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var35 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class41((byte) 1, true, var14, var11, var12, arg6, 4, 0, var13, var16.field1370);
                }
                arg0.method505(var15, arg1, arg5, var17, arg7 * 512, var18, var35, arg4, field596[arg7], field598[arg7] * var33, field604[arg7] * var33, (byte) 2);
            } else if (arg8 == 6) {
                class12 var36;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var36 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class41((byte) 1, true, var14, var11, var12, arg6, 4, 0, var13, var16.field1370);
                }
                arg0.method505(var15, arg1, arg5, var17, arg7, var18, var36, arg4, 256, 0, 0, (byte) 2);
            } else if (arg8 == 7) {
                class12 var37;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var37 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class41((byte) 1, true, var14, var11, var12, arg6, 4, 0, var13, var16.field1370);
                }
                arg0.method505(var15, arg1, arg5, var17, arg7, var18, var37, arg4, 512, 0, 0, (byte) 2);
            } else if (arg8 == 8) {
                class12 var38;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var38 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class41((byte) 1, true, var14, var11, var12, arg6, 4, 0, var13, var16.field1370);
                }
                arg0.method505(var15, arg1, arg5, var17, arg7, var18, var38, arg4, 768, 0, 0, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "<init>", descriptor = "(II[[[II[[[B)V")
    public class14(int arg0, int arg1, int[][][] arg2, int arg3, byte[][][] arg4) {
        field619 = 99;
        this.field620 = arg0;
        int var6 = 44 / arg3;
        this.field621 = arg1;
        this.field622 = arg2;
        this.field597 = arg4;
        this.field602 = new byte[4][this.field620][this.field621];
        this.field595 = new byte[4][this.field620][this.field621];
        this.field623 = new byte[4][this.field620][this.field621];
        this.field614 = new byte[4][this.field620][this.field621];
        this.field624 = new int[4][this.field620 + 1][this.field621 + 1];
        this.field628 = new byte[4][this.field620 + 1][this.field621 + 1];
        this.field605 = new int[this.field620 + 1][this.field621 + 1];
        this.field608 = new int[this.field621];
        this.field609 = new int[this.field621];
        this.field610 = new int[this.field621];
        this.field611 = new int[this.field621];
        this.field612 = new int[this.field621];
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(IZI[B)Z")
    public static final boolean method240(int arg0, boolean arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        class8 var5 = new class8(arg3, 792);
        int var6 = -1;
        if (!arg1) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method44();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method44();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method30() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class54 var17 = class54.method486(var6);
                        if (var14 != 22 || !field618 || var17.field1353 || var17.field1368) {
                            var4 &= var17.method479(414);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method44();
                if (var10 == 0) {
                    break;
                }
                var5.method30();
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "b", descriptor = "(III)I")
    private final int method241(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(II[[[IIIIILHQFIXEZL;ILSIPXLNWG;Z)V")
    public static final void method242(int arg0, int arg1, int[][][] arg2, int arg3, int arg4, int arg5, int arg6, class28 arg7, int arg8, class57 arg9, boolean arg10) {
        int var11 = arg2[arg6][arg4][arg3];
        int var12 = arg2[arg6][arg4 + 1][arg3];
        int var13 = arg2[arg6][arg4 + 1][arg3 + 1];
        int var14 = arg2[arg6][arg4][arg3 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class54 var16 = class54.method486(arg1);
        int var17 = (arg1 << 14) + (arg3 << 7) + arg4 + 1073741824;
        if (!var16.field1353) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg0 << 6) + arg8);
        if (!arg10) {
            for (int var19 = 1; var19 > 0; var19++) {
            }
        }
        if (arg8 == 22) {
            class12 var20;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var20 = var16.method478(22, arg0, var11, var12, var13, var14, -1);
            } else {
                var20 = new class41((byte) 1, true, var14, var11, var12, arg1, 22, arg0, var13, var16.field1370);
            }
            arg9.method502(var18, arg5, var15, var17, arg3, field599, arg4, var20);
            if (var16.field1365 && var16.field1353) {
                arg7.method303(arg4, arg3, -190);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class12 var40;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var40 = var16.method478(10, arg0, var11, var12, var13, var14, -1);
            } else {
                var40 = new class41((byte) 1, true, var14, var11, var12, arg1, 10, arg0, var13, var16.field1370);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg8 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg0 == 1 || arg0 == 3) {
                    var42 = var16.field1339;
                    var43 = var16.field1380;
                } else {
                    var42 = var16.field1380;
                    var43 = var16.field1339;
                }
                arg9.method506(arg3, arg4, var15, var17, var41, var40, 0, var43, arg5, var42, var18);
            }
            if (var16.field1365) {
                arg7.method302(9, arg3, arg4, var16.field1380, arg0, var16.field1339, var16.field1354);
            }
        } else if (arg8 >= 12) {
            class12 var21;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var21 = var16.method478(arg8, arg0, var11, var12, var13, var14, -1);
            } else {
                var21 = new class41((byte) 1, true, var14, var11, var12, arg1, arg8, arg0, var13, var16.field1370);
            }
            arg9.method506(arg3, arg4, var15, var17, 0, var21, 0, 1, arg5, 1, var18);
            if (var16.field1365) {
                arg7.method302(9, arg3, arg4, var16.field1380, arg0, var16.field1339, var16.field1354);
            }
        } else if (arg8 == 0) {
            class12 var22;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var22 = var16.method478(0, arg0, var11, var12, var13, var14, -1);
            } else {
                var22 = new class41((byte) 1, true, var14, var11, var12, arg1, 0, arg0, var13, var16.field1370);
            }
            arg9.method504(null, var17, var18, 0, var22, var15, arg4, false, arg5, arg3, field596[arg0]);
            if (var16.field1365) {
                arg7.method301(arg8, arg4, field603, var16.field1354, arg0, arg3);
            }
        } else if (arg8 == 1) {
            class12 var23;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var23 = var16.method478(1, arg0, var11, var12, var13, var14, -1);
            } else {
                var23 = new class41((byte) 1, true, var14, var11, var12, arg1, 1, arg0, var13, var16.field1370);
            }
            arg9.method504(null, var17, var18, 0, var23, var15, arg4, false, arg5, arg3, field625[arg0]);
            if (var16.field1365) {
                arg7.method301(arg8, arg4, field603, var16.field1354, arg0, arg3);
            }
        } else if (arg8 == 2) {
            int var24 = arg0 + 1 & 0x3;
            class12 var25;
            class12 var26;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var25 = var16.method478(2, arg0 + 4, var11, var12, var13, var14, -1);
                var26 = var16.method478(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new class41((byte) 1, true, var14, var11, var12, arg1, 2, arg0 + 4, var13, var16.field1370);
                var26 = new class41((byte) 1, true, var14, var11, var12, arg1, 2, var24, var13, var16.field1370);
            }
            arg9.method504(var26, var17, var18, field596[var24], var25, var15, arg4, false, arg5, arg3, field596[arg0]);
            if (var16.field1365) {
                arg7.method301(arg8, arg4, field603, var16.field1354, arg0, arg3);
            }
        } else if (arg8 == 3) {
            class12 var27;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var27 = var16.method478(3, arg0, var11, var12, var13, var14, -1);
            } else {
                var27 = new class41((byte) 1, true, var14, var11, var12, arg1, 3, arg0, var13, var16.field1370);
            }
            arg9.method504(null, var17, var18, 0, var27, var15, arg4, false, arg5, arg3, field625[arg0]);
            if (var16.field1365) {
                arg7.method301(arg8, arg4, field603, var16.field1354, arg0, arg3);
            }
        } else if (arg8 == 9) {
            class12 var28;
            if (var16.field1370 == -1 && var16.field1340 == null) {
                var28 = var16.method478(arg8, arg0, var11, var12, var13, var14, -1);
            } else {
                var28 = new class41((byte) 1, true, var14, var11, var12, arg1, arg8, arg0, var13, var16.field1370);
            }
            arg9.method506(arg3, arg4, var15, var17, 0, var28, 0, 1, arg5, 1, var18);
            if (var16.field1365) {
                arg7.method302(9, arg3, arg4, var16.field1380, arg0, var16.field1339, var16.field1354);
            }
        } else {
            if (var16.field1371) {
                if (arg0 == 1) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg0 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var11;
                    var11 = var31;
                } else if (arg0 == 3) {
                    int var32 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var32;
                }
            }
            if (arg8 == 4) {
                class12 var33;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var33 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var33 = new class41((byte) 1, true, var14, var11, var12, arg1, 4, 0, var13, var16.field1370);
                }
                arg9.method505(var15, arg4, arg5, var17, arg0 * 512, var18, var33, arg3, field596[arg0], 0, 0, (byte) 2);
            } else if (arg8 == 5) {
                int var34 = 16;
                int var35 = arg9.method522(arg5, arg4, arg3);
                if (var35 > 0) {
                    var34 = class54.method486(var35 >> 14 & 0x7FFF).field1372;
                }
                class12 var36;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var36 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class41((byte) 1, true, var14, var11, var12, arg1, 4, 0, var13, var16.field1370);
                }
                arg9.method505(var15, arg4, arg5, var17, arg0 * 512, var18, var36, arg3, field596[arg0], field598[arg0] * var34, field604[arg0] * var34, (byte) 2);
            } else if (arg8 == 6) {
                class12 var37;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var37 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class41((byte) 1, true, var14, var11, var12, arg1, 4, 0, var13, var16.field1370);
                }
                arg9.method505(var15, arg4, arg5, var17, arg0, var18, var37, arg3, 256, 0, 0, (byte) 2);
            } else if (arg8 == 7) {
                class12 var38;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var38 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class41((byte) 1, true, var14, var11, var12, arg1, 4, 0, var13, var16.field1370);
                }
                arg9.method505(var15, arg4, arg5, var17, arg0, var18, var38, arg3, 512, 0, 0, (byte) 2);
            } else if (arg8 == 8) {
                class12 var39;
                if (var16.field1370 == -1 && var16.field1340 == null) {
                    var39 = var16.method478(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var39 = new class41((byte) 1, true, var14, var11, var12, arg1, 4, 0, var13, var16.field1370);
                }
                arg9.method505(var15, arg4, arg5, var17, arg0, var18, var39, arg3, 768, 0, 0, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(IZI)Z")
    public static final boolean method243(int arg0, boolean arg1, int arg2) {
        class54 var3 = class54.method486(arg0);
        if (!arg1) {
            field607 = !field607;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method480(arg2, true);
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(LCFARFRSG;LOBRIXRSB;I)V")
    public static final void method244(class8 arg0, class45 arg1, int arg2) {
        if (arg2 < 8 || arg2 > 8) {
            return;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg0.method44();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class54 var5 = class54.method486(var3);
            var5.method488(-25545, arg1);
            while (true) {
                int var6 = arg0.method44();
                if (var6 == 0) {
                    break;
                }
                arg0.method30();
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "c", descriptor = "(II)I")
    private static final int method245(int arg0, int arg1) {
        int var2 = method235(arg0 + 45365, arg1 + 91923, 4) + (method235(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method235(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(I[BIZII[LHQFIXEZL;)V")
    public final void method246(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5, class28[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg0 + var13 > 0 && arg0 + var13 < 103 && arg5 + var14 > 0 && arg5 + var14 < 103) {
                        arg6[var8].field797[arg0 + var13][arg5 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (arg3) {
            this.field626 = -206;
        }
        class8 var9 = new class8(arg1, 792);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method234(var9, 769, arg0 + var11, arg2, arg5 + var12, 0, var10, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(LSIPXLNWG;[LHQFIXEZL;B)V")
    public final void method247(class57 arg0, class28[] arg1, byte arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field597[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field597[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method303(var110, var111, -190);
                        }
                    }
                }
            }
        }
        field616 += (int) (Math.random() * 5.0D) - 2;
        if (field616 < -8) {
            field616 = -8;
        }
        if (field616 > 8) {
            field616 = 8;
        }
        field600 += (int) (Math.random() * 5.0D) - 2;
        if (field600 < -16) {
            field600 = -16;
        }
        if (field600 > 16) {
            field600 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field628[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field621 - 1; var56++) {
                for (int var101 = 1; var101 < this.field620 - 1; var101++) {
                    int var102 = this.field622[var5][var101 + 1][var56] - this.field622[var5][var101 - 1][var56];
                    int var103 = this.field622[var5][var101][var56 + 1] - this.field622[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field605[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field621; var57++) {
                this.field608[var57] = 0;
                this.field609[var57] = 0;
                this.field610[var57] = 0;
                this.field611[var57] = 0;
                this.field612[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field620 + 5; var58++) {
                for (int var61 = 0; var61 < this.field621; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field620) {
                        int var96 = this.field602[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class70 var97 = class70.field1711[var96 - 1];
                            this.field608[var61] += var97.field1720;
                            this.field609[var61] += var97.field1718;
                            this.field610[var61] += var97.field1719;
                            this.field611[var61] += var97.field1721;
                            var10002 = this.field612[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field620) {
                        int var99 = this.field602[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class70 var100 = class70.field1711[var99 - 1];
                            this.field608[var61] -= var100.field1720;
                            this.field609[var61] -= var100.field1718;
                            this.field610[var61] -= var100.field1719;
                            this.field611[var61] -= var100.field1721;
                            var10002 = this.field612[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field620 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field621 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field621) {
                            var62 += this.field608[var68];
                            var63 += this.field609[var68];
                            var64 += this.field610[var68];
                            var65 += this.field611[var68];
                            var66 += this.field612[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field621) {
                            var62 -= this.field608[var69];
                            var63 -= this.field609[var69];
                            var64 -= this.field610[var69];
                            var65 -= this.field611[var69];
                            var66 -= this.field612[var69];
                        }
                        if (var67 >= 1 && var67 < this.field621 - 1 && (!field618 || (this.field597[0][var58][var67] & 0x2) != 0 || (this.field597[var5][var58][var67] & 0x10) == 0 && this.method249(this.field613, var58, var5, var67) == field606)) {
                            if (var5 < field619) {
                                field619 = var5;
                            }
                            int var70 = this.field602[var5][var58][var67] & 0xFF;
                            int var71 = this.field595[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field622[var5][var58][var67];
                                int var73 = this.field622[var5][var58 + 1][var67];
                                int var74 = this.field622[var5][var58 + 1][var67 + 1];
                                int var75 = this.field622[var5][var58][var67 + 1];
                                int var76 = this.field605[var58][var67];
                                int var77 = this.field605[var58 + 1][var67];
                                int var78 = this.field605[var58 + 1][var67 + 1];
                                int var79 = this.field605[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method241(var82, var83, var84);
                                    int var85 = field616 + var82 & 0xFF;
                                    int var86 = field600 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method241(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field623[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class70.field1711[var71 - 1].field1716) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field624[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class59.field1519[method254(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method501(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method254(var80, var76), method254(var80, var77), method254(var80, var78), method254(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field623[var5][var58][var67] + 1;
                                    byte var90 = this.field614[var5][var58][var67];
                                    class70 var91 = class70.field1711[var71 - 1];
                                    int var92 = var91.field1714;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class59.method553(var92, (byte) 8);
                                        var94 = -1;
                                    } else if (var91.field1713 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method241(var91.field1717, var91.field1718, var91.field1719);
                                        var93 = class59.field1519[this.method238(var91.field1722, 96)];
                                    }
                                    arg0.method501(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method254(var80, var76), method254(var80, var77), method254(var80, var78), method254(var80, var79), this.method238(var94, var76), this.method238(var94, var77), this.method238(var94, var78), this.method238(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field621 - 1; var59++) {
                for (int var60 = 1; var60 < this.field620 - 1; var60++) {
                    arg0.method500(var5, var60, var59, this.method249(this.field613, var60, var5, var59));
                }
            }
        }
        if (arg2 != 19) {
            this.field615 = !this.field615;
        }
        arg0.method527(-10, -50, -50, 148, 768, 64);
        for (int var6 = 0; var6 < this.field620; var6++) {
            for (int var47 = 0; var47 < this.field621; var47++) {
                if ((this.field597[1][var6][var47] & 0x2) == 2) {
                    arg0.method498(var47, true, var6);
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
                for (int var12 = 0; var12 <= this.field621; var12++) {
                    for (int var13 = 0; var13 <= this.field620; var13++) {
                        if ((this.field624[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field624[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field621 && (this.field624[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field624[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field624[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field622[var17][var13][var14] - var21;
                                int var23 = this.field622[var16][var13][var14];
                                class57.method499(var13 * 128, var23, var15 * 128 + 128, var10, var13 * 128, 1, var22, -72, var14 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field624[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field624[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field624[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field620 && (this.field624[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field624[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field624[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field622[var29][var26][var12] - var33;
                                int var35 = this.field622[var28][var26][var12];
                                class57.method499(var27 * 128 + 128, var35, var12 * 128, var10, var26 * 128, 2, var34, -72, var12 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field624[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field624[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field624[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field621 && (this.field624[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field624[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field620) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field624[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field622[var11][var38][var40];
                                class57.method499(var39 * 128 + 128, var44, var41 * 128 + 128, var10, var38 * 128, 4, var44, -72, var40 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field624[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(IIII)I")
    private static final int method248(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class59.field1508[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(BIII)I")
    public int method249(byte arg0, int arg1, int arg2, int arg3) {
        if (this.field601 == arg0) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if ((this.field597[arg2][arg1][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (this.field597[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "d", descriptor = "(II)I")
    private static final int method250(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "([BI[LHQFIXEZL;IZIILSIPXLNWG;III)V")
    public final void method251(byte[] arg0, int arg1, class28[] arg2, int arg3, boolean arg4, int arg5, int arg6, class57 arg7, int arg8, int arg9, int arg10) {
        class8 var12 = new class8(arg0, 792);
        if (!arg4) {
            this.field627 = 424;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method44();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method44();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method30();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg5 == var19 && var18 >= arg10 && var18 < arg10 + 8 && var17 >= arg1 && var17 < arg1 + 8) {
                    class54 var23 = class54.method486(var13);
                    int var24 = arg6 + class56.method493(var22, var23.field1380, var18 & 0x7, var17 & 0x7, var23.field1339, arg9, 0);
                    int var25 = arg8 + class56.method494(false, var23.field1339, arg9, var23.field1380, var18 & 0x7, var22, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg3;
                        if ((this.field597[1][var24][var25] & 0x2) == 2) {
                            var26 = arg3 - 1;
                        }
                        class28 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg2[var26];
                        }
                        this.method239(arg7, var24, 552, var27, var25, arg3, var13, arg9 + var22 & 0x3, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(III[BII[LHQFIXEZL;III)V")
    public final void method252(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, class28[] arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg8 + var11 > 0 && arg8 + var11 < 103 && arg9 + var17 > 0 && arg9 + var17 < 103) {
                    arg6[arg4].field797[arg8 + var11][arg9 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        class8 var12 = new class8(arg3, 792);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg0 == var13 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg2 && var16 < arg2 + 8) {
                        this.method234(var12, 769, arg8 + class56.method491(arg7, (byte) 71, var16 & 0x7, var15 & 0x7), 0, arg9 + class56.method492(var16 & 0x7, var15 & 0x7, arg7, 684), arg7, arg4, 0);
                    } else {
                        this.method234(var12, 769, -1, 0, -1, 0, 0, 0);
                    }
                }
            }
        }
        int var14 = 30 / arg1;
    }

    @OriginalMember(owner = "DIFHBVBT", name = "a", descriptor = "(LSIPXLNWG;[LHQFIXEZL;[BIII)V")
    public final void method253(class57 arg0, class28[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        class8 var7 = new class8(arg2, 792);
        while (arg3 >= 0) {
            for (int var22 = 1; var22 > 0; var22++) {
            }
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method44();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method44();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method30();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = arg4 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field597[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class28 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.method239(arg0, var18, 552, var21, var19, var14, var8, var17, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "DIFHBVBT", name = "e", descriptor = "(II)I")
    private static final int method254(int arg0, int arg1) {
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
}
