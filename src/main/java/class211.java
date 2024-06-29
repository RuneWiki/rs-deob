import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class211 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3792 = 0;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lvf;")
    public static class265 field3788 = class87.method582(-46, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lvf;")
    private static class265 field3793 = class87.method582(-46, "Walk here");

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lvf;")
    public static class265 field3789 = field3793;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Ldg;")
    public static class276 field3787 = new class276(20);

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3798 = 2301979;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3799 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field3786;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public int field3796;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lfl;")
    public static class192 field3797;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[[[Lac;")
    public static class137[][][] field3800;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3793 = null;
        field3789 = null;
        field3787 = null;
        field3797 = null;
        field3800 = null;
        field3788 = null;
        int var1 = -79 % ((arg0 + 41) / 57);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z[Ljg;II[BIIZ)V")
    public static final void method1447(boolean arg0, class257[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, boolean arg7) {
        field3791++;
        byte var8;
        if (arg0) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg0) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg6 + var10) > 0 && arg6 + var10 < 103 && (arg5 + var11) > 0 && arg5 + var11 < 103) {
                            arg1[var9].field4422[arg6 + var10][arg5 + var11] = class203.method1395(arg1[var9].field4422[arg6 + var10][arg5 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class135 var12 = new class135(arg4);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var36 = 0; var36 < 64; var36++) {
                for (int var37 = 0; var37 < 64; var37++) {
                    class192.method1329(arg3, var37 + arg5, var36 - -arg6, var13, arg2, (byte) 59, 0, var12, arg0);
                }
            }
        }
        boolean var14 = arg7;
        while (var12.field2449 < var12.field2483.length) {
            int var15 = var12.method920((byte) 64);
            if (var15 != 129) {
                var12.field2449--;
                break;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = var12.method929((byte) -3);
                if (var17 == 0) {
                    int var18 = arg5;
                    if (arg5 < 0) {
                        var18 = 0;
                    } else if (arg5 >= 104) {
                        var18 = 104;
                    }
                    int var19 = arg6 + 64;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 >= 104) {
                        var19 = 104;
                    }
                    int var20 = arg6;
                    if (arg6 < 0) {
                        var20 = 0;
                    } else if (arg6 >= 104) {
                        var20 = 104;
                    }
                    int var21 = arg5 + 64;
                    if (var21 < 0) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    while (var20 < var19) {
                        while (var18 < var21) {
                            class48.field1023[var16][var20][var18] = 0;
                            var18++;
                        }
                        var20++;
                    }
                } else if (var17 == 1) {
                    for (int var26 = 0; var26 < 64; var26 += 4) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            byte var28 = var12.method929((byte) -3);
                            for (int var29 = arg6 + var26; var29 < arg6 + var26 + 4; var29++) {
                                for (int var30 = var27 + arg5; var30 < (var27 + arg5 + 4); var30++) {
                                    if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                                        class48.field1023[var16][var29][var30] = var28;
                                    }
                                }
                            }
                        }
                    }
                } else if (var17 == 2 && var16 > 0) {
                    int var22 = arg6;
                    int var23 = arg5;
                    if (arg6 < 0) {
                        var22 = 0;
                    } else if (arg6 >= 104) {
                        var22 = 104;
                    }
                    int var24 = arg6 + 64;
                    if (arg5 < 0) {
                        var23 = 0;
                    } else if (arg5 >= 104) {
                        var23 = 104;
                    }
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 >= 104) {
                        var24 = 104;
                    }
                    int var25 = arg5 + 64;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 >= 104) {
                        var25 = 104;
                    }
                    while (var24 > var22) {
                        while (var23 < var25) {
                            class48.field1023[var16][var22][var23] = class48.field1023[var16 - 1][var22][var23];
                            var23++;
                        }
                        var22++;
                    }
                }
            }
            var14 = true;
        }
        if (var14) {
            return;
        }
        for (int var31 = 0; var31 < 4; var31++) {
            for (int var32 = 0; var32 < 16; var32++) {
                for (int var33 = 0; var33 < 16; var33++) {
                    int var34 = (arg5 >> 2) + var33;
                    int var35 = (arg6 >> 2) + var32;
                    if (var35 >= 0 && var35 < 26 && var34 >= 0 && var34 < 26) {
                        class48.field1023[var31][var35][var34] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)I")
    public static final int method1448(int arg0, int arg1, byte arg2) {
        field3795++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg2 < 123) {
            return 42;
        } else if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
