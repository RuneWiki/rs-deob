import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class66 extends class86 {

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "[[I")
    public int[][] field919;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "[I")
    public int[] field918;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "[Z")
    public boolean[] field917;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Ltf;")
    public static class242 field914 = new class242(64);

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "Lbe;")
    public static class283 field922 = class153.method941(126, "l");

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "Lbe;")
    private static class283 field929 = class153.method941(-126, "Loaded sprites");

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "[B")
    public static byte[] field928 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "Lbe;")
    public static class283 field923 = field929;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "Lhc;")
    public static class162 field924;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "Lek;")
    public static class172 field926;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "Lcm;")
    public static class181 field927;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "Lah;")
    public static class194 field925;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V", line = 12)
    public static void method420(byte arg0) {
        field924 = null;
        field929 = null;
        field926 = null;
        field927 = null;
        field925 = null;
        field923 = null;
        field914 = null;
        field922 = null;
        int var1 = 91 % ((2 - arg0) / 61);
        field928 = null;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V", line = 34)
    public static final void method421(byte arg0) {
        if (arg0 >= 109) {
            class284.method1954(0, (byte) -108, 0);
            field911++;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIZI)V", line = 52)
    public static final void method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field921++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg7;
        int var11 = arg4 - arg0;
        int var12 = arg4 * arg4;
        int var13 = arg7 - arg0;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var13 * var13;
        int var17 = var14 << 1;
        int var18 = arg7 << 1;
        int var19 = var16 << 1;
        int var20 = var12 << 1;
        int var21 = var15 << 1;
        int var22 = (1 - var18) * var12 + var17;
        int var23 = var13 << 1;
        int var24 = var16 - (var23 - 1) * var21;
        int var25 = (1 - var23) * var15 + var19;
        int var26 = var12 << 2;
        int var27 = var14 - ((var18 - 1) * var20);
        if (!arg6) {
            field924 = (class162) null;
        }
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = (var18 - 3) * var20;
        int var32 = var17 * 3;
        int var33 = var19 * 3;
        int var34 = var28;
        int var35 = var30;
        int var36 = (var13 - 1) * var29;
        int var37 = (arg7 - 1) * var26;
        int var38 = (var23 - 3) * var21;
        int[] var39 = class97.field1636[arg1];
        class114.method742(30197, arg2 - arg4, var39, arg2 - var11, arg3);
        class114.method742(30197, arg2 - var11, var39, arg2 + var11, arg5);
        class114.method742(30197, arg2 + var11, var39, arg2 + arg4, arg3);
        while (var10 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var22 += var32;
                    var32 += var28;
                    var27 += var34;
                    var34 += var28;
                }
            }
            if (var27 < 0) {
                var22 += var32;
                var32 += var28;
                var8++;
                var27 += var34;
                var34 += var28;
            }
            var27 += -var31;
            var22 += -var37;
            var37 -= var26;
            var31 -= var26;
            boolean var40 = var13 >= var10;
            var10--;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var24 += var35;
                        var25 += var33;
                        var33 += var30;
                        var35 += var30;
                        var9++;
                    }
                }
                if (var24 < 0) {
                    var25 += var33;
                    var9++;
                    var24 += var35;
                    var35 += var30;
                    var33 += var30;
                }
                var24 += -var38;
                var38 -= var29;
                var25 += -var36;
                var36 -= var29;
            }
            int var41 = arg2 + var8;
            int var42 = arg1 - var10;
            int var43 = arg1 + var10;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 - var9;
                int var46 = arg2 + var9;
                class114.method742(30197, var44, class97.field1636[var42], var45, arg3);
                class114.method742(30197, var45, class97.field1636[var42], var46, arg5);
                class114.method742(30197, var46, class97.field1636[var42], var41, arg3);
                class114.method742(30197, var44, class97.field1636[var43], var45, arg3);
                class114.method742(30197, var45, class97.field1636[var43], var46, arg5);
                class114.method742(30197, var46, class97.field1636[var43], var41, arg3);
            } else {
                class114.method742(30197, var44, class97.field1636[var42], var41, arg3);
                class114.method742(30197, var44, class97.field1636[var43], var41, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIIIII)V", line = 225)
    public static final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field912++;
        if (arg4 != -1864) {
            return;
        }
        int var11 = arg8 - arg7;
        int var12 = arg1 - arg10;
        boolean var13;
        if (class222.field3731 > 0 && class222.field3731 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg5;
        int var15 = 983040 / arg9;
        for (int var16 = -var15; var16 < var12 + var15; var16++) {
            int var17 = (var16 + 1) * arg9 + arg6 >> 16;
            int var18 = arg9 * var16 + arg6 >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                int var20 = arg2 + var18;
                int var21 = arg10 + var16 >> 6;
                int var10000 = arg2 + var17;
                if (var21 >= 0 && var21 <= class309.field5291.length - 1) {
                    int[][] var23 = class309.field5291[var21];
                    for (int var24 = -var14; var24 < (var11 + var14); var24++) {
                        int var25 = arg0 + (arg5 * var24) >> 16;
                        int var26 = (var24 + 1) * arg5 + arg0 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            int var28 = arg3 + var25;
                            int var29 = arg7 + var24 >> 6;
                            var10000 = arg3 + var26;
                            if (var29 >= 0 && (var23.length - 1) >= var29 && var23[var29] != null) {
                                int var31 = (arg7 + var24 & 0x3F << 6) + (arg10 + var16 & 0x3F);
                                int var32 = var23[var29][var31];
                                if (var32 != 0) {
                                    class281 var33 = class254.method1722(0, var32 - 1);
                                    if (var13 && class290.field4915 == var33.field4685) {
                                        class292 var34 = new class292();
                                        var34.field4948 = var33.field4685;
                                        var34.field4951 = var28;
                                        var34.field4950 = var20;
                                        class178.field3067.method1809(var34, (byte) -122);
                                    }
                                    class304.field5159[var33.field4685].method711(var20 - 7, var28 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class292 var35 = (class292) class178.field3067.method1812((byte) 39); var35 != null; var35 = (class292) class178.field3067.method1813((byte) 104)) {
            class304.field5159[var35.field4948].method711(var35.field4950 - 7, var35.field4951 - 7);
            class78.method517(var35.field4950, var35.field4951, 15, 16776960, 128);
            class78.method517(var35.field4950, var35.field4951, 7, 16777215, 256);
        }
        class178.field3067.method1810(27);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIBIII)V", line = 343)
    public static final void method424(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field915++;
        long var6 = class288.method1972(arg5, arg4, arg3);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x32416B) >> 20;
            int var9 = arg0;
            int var10 = (int) var6 >> 14 & 0x1F;
            int var11 = (103 - arg3) * 4 * 512 + ((arg4 * 4) + 24624);
            int[] var12 = class78.field1357;
            if (var6 > 0L) {
                var9 = arg1;
            }
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class281 var14 = class254.method1722(0, var13);
            if (var14.field4699 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var8 == 0) {
                        var12[var11] = var9;
                        var12[var11 + 512] = var9;
                        var12[var11 + 1024] = var9;
                        var12[var11 + 1536] = var9;
                    } else if (var8 == 1) {
                        var12[var11] = var9;
                        var12[var11 + 1] = var9;
                        var12[var11 + 2] = var9;
                        var12[var11 + 3] = var9;
                    } else if (var8 == 2) {
                        var12[var11 + 3] = var9;
                        var12[var11 + 515] = var9;
                        var12[var11 + 1027] = var9;
                        var12[var11 + 3 + 1536] = var9;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var9;
                        var12[var11 + 1537] = var9;
                        var12[var11 + 1536 + 2] = var9;
                        var12[var11 + 1536 + 3] = var9;
                    }
                }
                if (var10 == 3) {
                    if (var8 == 0) {
                        var12[var11] = var9;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var9;
                    } else if (var8 == 2) {
                        var12[var11 + 1536 + 3] = var9;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var9;
                    }
                }
                if (var10 == 2) {
                    if (var8 == 3) {
                        var12[var11] = var9;
                        var12[var11 + 512] = var9;
                        var12[var11 + 1024] = var9;
                        var12[var11 + 1536] = var9;
                    } else if (var8 == 0) {
                        var12[var11] = var9;
                        var12[var11 + 1] = var9;
                        var12[var11 + 2] = var9;
                        var12[var11 + 3] = var9;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var9;
                        var12[var11 + 515] = var9;
                        var12[var11 + 3 + 1024] = var9;
                        var12[var11 + 1536 + 3] = var9;
                    } else if (var8 == 2) {
                        var12[var11 + 1536] = var9;
                        var12[var11 + 1 + 1536] = var9;
                        var12[var11 + 2 + 1536] = var9;
                        var12[var11 + 1539] = var9;
                    }
                }
            } else {
                class95 var15 = null;
                if (!var14.field4710) {
                    var15 = class205.field3494[var14.field4699];
                } else if (var8 == 0) {
                    var15 = class205.field3494[var14.field4699];
                } else if (var8 == 1) {
                    var15 = class15.field169[var14.field4699];
                } else if (var8 == 2) {
                    var15 = class213.field3629[var14.field4699];
                } else if (var8 == 3) {
                    var15 = class260.field4421[var14.field4699];
                }
                if (var15 != null) {
                    int var16 = (var14.field4727 * 4 - var15.field1464) / 2;
                    int var17 = (var14.field4754 * 4 - var15.field1465) / 2;
                    var15.method560(arg4 * 4 + var16 + 48, 48 - -((-arg3 + 104 - var14.field4754) * 4) + var17);
                }
            }
        }
        if (arg2 > -38) {
            field923 = (class283) null;
        }
        long var18 = class184.method1214(arg5, arg4, arg3);
        if (var18 != 0L) {
            int var20 = ((int) var18 & 0x7CE27) >> 14;
            int var21 = ((int) var18 & 0x38083D) >> 20;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class281 var23 = class254.method1722(0, var22);
            if (var23.field4699 != -1) {
                class95 var24 = null;
                if (!var23.field4710) {
                    var24 = class205.field3494[var23.field4699];
                } else if (var21 == 0) {
                    var24 = class205.field3494[var23.field4699];
                } else if (var21 == 1) {
                    var24 = class15.field169[var23.field4699];
                } else if (var21 == 2) {
                    var24 = class213.field3629[var23.field4699];
                } else if (var21 == 3) {
                    var24 = class260.field4421[var23.field4699];
                }
                if (var24 != null) {
                    int var25 = (var23.field4754 * 4 - var24.field1465) / 2;
                    int var26 = (var23.field4727 * 4 - var24.field1464) / 2;
                    var24.method560(arg4 * 4 + var26 + 48, (-var23.field4754 + -arg3 + 104) * 4 + var25 + 48);
                }
            } else if (var20 == 9) {
                int[] var27 = class78.field1357;
                int var28 = 15658734;
                if (var18 > 0L) {
                    var28 = 15597568;
                }
                int var29 = arg4 * 4 + (52736 - (arg3 * 512)) * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var27[var29 + 1536] = var28;
                    var27[var29 + 1024 + 1] = var28;
                    var27[var29 + 512 + 2] = var28;
                    var27[var29 + 3] = var28;
                } else {
                    var27[var29] = var28;
                    var27[var29 + 512 + 1] = var28;
                    var27[var29 + 2 + 1024] = var28;
                    var27[var29 + 1536 + 3] = var28;
                }
            }
        }
        long var30 = class263.method1783(arg5, arg4, arg3);
        if (var30 == 0L) {
            return;
        }
        int var32 = ((int) var30 & 0x3C6CC6) >> 20;
        int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class281 var34 = class254.method1722(0, var33);
        if (var34.field4699 == -1) {
            return;
        }
        class95 var35 = null;
        if (!var34.field4710) {
            var35 = class205.field3494[var34.field4699];
        } else if (var32 == 0) {
            var35 = class205.field3494[var34.field4699];
        } else if (var32 == 1) {
            var35 = class15.field169[var34.field4699];
        } else if (var32 == 2) {
            var35 = class213.field3629[var34.field4699];
        } else if (var32 == 3) {
            var35 = class260.field4421[var34.field4699];
        }
        if (var35 != null) {
            int var36 = (var34.field4754 * 4 - var35.field1465) / 2;
            int var37 = (var34.field4727 * 4 - var35.field1464) / 2;
            var35.method560(arg4 * 4 + var37 + 48, (104 - arg3 + -var34.field4754) * 4 + (48 - -var36));
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I[B)V", line = 644)
    public class66(int arg0, byte[] arg1) {
        this.field913 = arg0;
        class229 var3 = new class229(arg1);
        this.field916 = var3.method1535((byte) 118);
        this.field919 = new int[this.field916][];
        this.field918 = new int[this.field916];
        this.field917 = new boolean[this.field916];
        for (int var4 = 0; var4 < this.field916; var4++) {
            this.field918[var4] = var3.method1535((byte) 72);
        }
        for (int var5 = 0; var5 < this.field916; var5++) {
            this.field917[var5] = var3.method1535((byte) 88) == 1;
        }
        for (int var6 = 0; var6 < this.field916; var6++) {
            this.field919[var6] = new int[var3.method1535((byte) 73)];
        }
        for (int var7 = 0; var7 < this.field916; var7++) {
            for (int var8 = 0; var8 < this.field919[var7].length; var8++) {
                this.field919[var7][var8] = var3.method1535((byte) 96);
            }
        }
    }
}
