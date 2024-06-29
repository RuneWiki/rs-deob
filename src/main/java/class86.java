import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class86 {

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "[[I")
    public int[][] field1319;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lag;")
    public static class97 field1323 = new class97();

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1333 = "Loading - please wait.";

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field1330 = new String[500];

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "[Z")
    public static boolean[] field1334 = new boolean[100];

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field1337 = 20;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "[I")
    public static int[] field1327 = new int[5];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lve;")
    public static class233 field1331;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[[I")
    public static int[][] field1335;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIB)V")
    public final void method573(int arg0, int arg1, byte arg2) {
        field1317++;
        int var4 = arg1 - this.field1315;
        int var5 = arg0 - this.field1308;
        this.field1319[var5][var4] = class163.method1093(this.field1319[var5][var4], 262144);
        int var6 = 73 % ((-arg2 - 28) / 46);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1311++;
        if (arg2 == 1) {
            if (arg1 == arg6 && arg3 == arg7) {
                return true;
            }
        } else if (arg6 <= arg1 && (arg6 + arg2 - 1) >= arg1 && arg3 <= arg3 && (arg3 + arg2 - 1) >= arg3) {
            return true;
        }
        int var9 = arg6 - this.field1308;
        int var10 = arg3 - this.field1315;
        if (arg4 != 19661088) {
            method590((byte) -48);
        }
        int var11 = arg1 - this.field1308;
        int var12 = arg7 - this.field1315;
        if (arg2 == 1) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1319[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field1319[var9][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1319[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field1319[var9][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field1319[var9][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field1319[var9][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field1319[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field1319[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field1319[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field1319[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field1319[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var9 - 1;
            int var14 = arg2 + var12 - 1;
            if (arg5 == 0) {
                if (arg0 == 0) {
                    if ((var11 - arg2) == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12 && (this.field1319[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var10 - arg2) == var12 && (this.field1319[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 >= var9 && var13 >= var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 - arg2) == var9 && var12 <= var10 && var14 >= var10 && (this.field1319[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var14 >= var10 && (this.field1319[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 + 1 == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12 && (this.field1319[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg2 == var12 && (this.field1319[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 <= var11 && var11 <= var13 && (var10 - arg2) == var12) {
                        return true;
                    }
                    if ((var11 - arg2) == var9 && var12 <= var10 && var10 <= var14 && (this.field1319[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14 && (this.field1319[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    if ((var11 - arg2) == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var14 >= var10 && (this.field1319[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 - arg2) == var12 && (this.field1319[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg2 == var9 && var12 <= var10 && var14 >= var10 && (this.field1319[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 - arg2) == var12 && (this.field1319[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - arg2 == var9 && var10 >= var12 && var10 <= var14 && (this.field1319[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12 && (this.field1319[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 - arg2) == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 - arg2) == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field1319[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14 && (this.field1319[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 - arg2) == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field1319[var11][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var13 && (var10 - arg2) == var12 && (this.field1319[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg2 == var9 && var10 >= var12 && var10 <= var14 && (this.field1319[var13][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var12 <= var10 && var10 <= var14 && (this.field1319[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
    public static final void method575(byte arg0, int arg1) {
        class48.field682.method258(arg1, (byte) 119);
        class28.field407.method258(arg1, (byte) 98);
        class190.field2691.method258(arg1, (byte) 113);
        if (arg0 < 9) {
            field1334 = null;
        }
        field1314++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIBIIII)V")
    public static final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field1316++;
        int var11 = arg1 - arg5;
        int var12 = arg9 - arg8;
        int var13 = -1;
        if (class80.field1235 > 0) {
            if (class140.field2029 > 10) {
                var13 = 50 - ((class140.field2029 - 10) * 5);
            } else {
                var13 = class140.field2029 * 5;
            }
        }
        int var14 = 983040 / arg2;
        int var15 = -61 % ((arg6 + 35) / 33);
        int var16 = 983040 / arg10;
        for (int var17 = -var16; var17 < var12 + var16; var17++) {
            int var19 = arg10 * var17 + arg4 >> 16;
            int var20 = arg4 + ((var17 + 1) * arg10) >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var22 = arg8 + var17 >> 6;
                int var23 = arg0 + var19;
                int var10000 = arg0 + var20;
                if (var22 >= 0 && var22 <= (class234.field3525.length - 1)) {
                    int[][] var25 = class234.field3525[var22];
                    for (int var26 = -var14; var26 < (var11 + var14); var26++) {
                        int var27 = (var26 + 1) * arg2 + arg7 >> 16;
                        int var28 = arg2 * var26 + arg7 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            var10000 = arg3 + var27;
                            int var31 = arg3 + var28;
                            int var32 = arg5 + var26 >> 6;
                            if (var32 >= 0 && var32 <= var25.length - 1 && var25[var32] != null) {
                                int var33 = (arg5 + var26 & 0x3F << 6) + (arg8 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class250 var35 = class91.method618(112, var34 - 1);
                                    if (!class19.field270[var35.field3811]) {
                                        if (var13 != -1 && class242.field3637 == var35.field3811) {
                                            class45 var36 = new class45();
                                            var36.field641 = var35.field3811;
                                            var36.field643 = var23;
                                            var36.field638 = var31;
                                            class288.field4558.method652(96, var36);
                                        } else {
                                            class275.field4405[var35.field3811].method470(var23 - 7, var31 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class45 var18 = (class45) class288.field4558.method656(110); var18 != null; var18 = (class45) class288.field4558.method650(124)) {
            class144.method946(var18.field643, var18.field638, 15, 16776960, var13);
            class144.method946(var18.field643, var18.field638, 13, 16776960, var13);
            class144.method946(var18.field643, var18.field638, 11, 16776960, var13);
            class144.method946(var18.field643, var18.field638, 9, 16776960, var13);
            class275.field4405[var18.field641].method470(var18.field643 - 7, var18.field638 + -7);
        }
        class288.field4558.method647((byte) -70);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBZI)V")
    public final void method577(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        int var7 = arg5 - this.field1308;
        int var8 = 127 / ((arg3 + 36) / 35);
        int var9 = arg0 - this.field1315;
        field1312++;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method580(128, var9, true, var7);
                this.method580(8, var9, true, var7 - 1);
            }
            if (arg2 == 1) {
                this.method580(2, var9, true, var7);
                this.method580(32, var9 + 1, true, var7);
            }
            if (arg2 == 2) {
                this.method580(8, var9, true, var7);
                this.method580(128, var9, true, var7 + 1);
            }
            if (arg2 == 3) {
                this.method580(32, var9, true, var7);
                this.method580(2, var9 - 1, true, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method580(1, var9, true, var7);
                this.method580(16, var9 + 1, true, var7 - 1);
            }
            if (arg2 == 1) {
                this.method580(4, var9, true, var7);
                this.method580(64, var9 + 1, true, var7 + 1);
            }
            if (arg2 == 2) {
                this.method580(16, var9, true, var7);
                this.method580(1, var9 - 1, true, var7 + 1);
            }
            if (arg2 == 3) {
                this.method580(64, var9, true, var7);
                this.method580(4, var9 - 1, true, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method580(130, var9, true, var7);
                this.method580(8, var9, true, var7 - 1);
                this.method580(32, var9 + 1, true, var7);
            }
            if (arg2 == 1) {
                this.method580(10, var9, true, var7);
                this.method580(32, var9 + 1, true, var7);
                this.method580(128, var9, true, var7 + 1);
            }
            if (arg2 == 2) {
                this.method580(40, var9, true, var7);
                this.method580(128, var9, true, var7 + 1);
                this.method580(2, var9 - 1, true, var7);
            }
            if (arg2 == 3) {
                this.method580(160, var9, true, var7);
                this.method580(2, var9 - 1, true, var7);
                this.method580(8, var9, true, var7 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method580(65536, var9, true, var7);
                this.method580(4096, var9, true, var7 - 1);
            }
            if (arg2 == 1) {
                this.method580(1024, var9, true, var7);
                this.method580(16384, var9 + 1, true, var7);
            }
            if (arg2 == 2) {
                this.method580(4096, var9, true, var7);
                this.method580(65536, var9, true, var7 + 1);
            }
            if (arg2 == 3) {
                this.method580(16384, var9, true, var7);
                this.method580(1024, var9 - 1, true, var7);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method580(512, var9, true, var7);
                this.method580(8192, var9 + 1, true, var7 - 1);
            }
            if (arg2 == 1) {
                this.method580(2048, var9, true, var7);
                this.method580(32768, var9 + 1, true, var7 + 1);
            }
            if (arg2 == 2) {
                this.method580(8192, var9, true, var7);
                this.method580(512, var9 - 1, true, var7 + 1);
            }
            if (arg2 == 3) {
                this.method580(32768, var9, true, var7);
                this.method580(2048, var9 - 1, true, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method580(66560, var9, true, var7);
            this.method580(4096, var9, true, var7 - 1);
            this.method580(16384, var9 + 1, true, var7);
        }
        if (arg2 == 1) {
            this.method580(5120, var9, true, var7);
            this.method580(16384, var9 + 1, true, var7);
            this.method580(65536, var9, true, var7 + 1);
        }
        if (arg2 == 2) {
            this.method580(20480, var9, true, var7);
            this.method580(65536, var9, true, var7 + 1);
            this.method580(1024, var9 - 1, true, var7);
        }
        if (arg2 == 3) {
            this.method580(81920, var9, true, var7);
            this.method580(1024, var9 - 1, true, var7);
            this.method580(4096, var9, true, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIZ)V")
    public final void method578(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1 - this.field1308;
        int var8 = arg2 - this.field1315;
        if (arg0 != -1) {
            this.field1315 = -110;
        }
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < var7 + arg4; var10++) {
            if (var10 >= 0 && var10 < this.field1329) {
                for (int var11 = var8; var11 < arg3 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field1324) {
                        this.method580(var9, var11, true, var10);
                    }
                }
            }
        }
        field1310++;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIB)V")
    public final void method579(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field1315;
        field1307++;
        if (arg2 != -82) {
            field1327 = null;
        }
        int var5 = arg0 - this.field1308;
        this.field1319[var5][var4] = class184.method1188(this.field1319[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZI)V")
    private final void method580(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.method580(50, 115, false, 24);
        }
        field1321++;
        this.field1319[arg3][arg1] = class163.method1093(this.field1319[arg3][arg1], arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZI)V")
    public final void method581(int arg0, boolean arg1, int arg2) {
        field1318++;
        if (!arg1) {
            int var4 = arg2 - this.field1315;
            int var5 = arg0 - this.field1308;
            this.field1319[var5][var4] = class163.method1093(this.field1319[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIBIIII)Z")
    private final boolean method582(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field1325++;
        int var11 = arg3 + arg9;
        int var12 = arg0 + arg1;
        int var13 = arg4 + arg7;
        int var14 = arg2 + arg6;
        if (arg1 >= arg2 && arg1 < var14) {
            if (arg4 == var11 && (arg8 & 0x4) == 0) {
                int var15 = arg1;
                int var16 = var12 <= var14 ? var12 : var14;
                while (var15 < var16) {
                    if ((this.field1319[var15 - this.field1308][var11 - this.field1315 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg3 == var13 && (arg8 & 0x1) == 0) {
                int var17 = arg1;
                int var18 = var12 > var14 ? var14 : var12;
                while (var17 < var18) {
                    if ((this.field1319[var17 - this.field1308][arg3 - this.field1315] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var12 > arg2 && var14 >= var12) {
            if (arg4 == var11 && (arg8 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var12; var19++) {
                    if ((this.field1319[var19 - this.field1308][var11 - this.field1315 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var13 && (arg8 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var12; var20++) {
                    if ((this.field1319[var20 - this.field1308][arg3 - this.field1315] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg4 <= arg3 && var13 > arg3) {
            if (arg2 == var12 && (arg8 & 0x8) == 0) {
                int var21 = arg3;
                int var22 = var13 < var11 ? var13 : var11;
                while (var22 > var21) {
                    if ((this.field1319[var12 - this.field1308 - 1][var21 - this.field1315] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg1 == var14 && (arg8 & 0x2) == 0) {
                int var23 = arg3;
                int var24 = var11 > var13 ? var13 : var11;
                while (var23 < var24) {
                    if ((this.field1319[arg1 - this.field1308][var23 - this.field1315] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg4 < var11 && var13 >= var11) {
            if (arg2 == var12 && (arg8 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var11; var25++) {
                    if ((this.field1319[var12 - this.field1308 - 1][var25 - this.field1315] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var14 && (arg8 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var11; var26++) {
                    if ((this.field1319[arg1 - this.field1308][var26 - this.field1315] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        int var27 = -4 / ((38 - arg5) / 61);
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public final void method583(int arg0) {
        field1338++;
        int var2 = 0;
        if (arg0 != 16777216) {
            field1334 = null;
        }
        while (var2 < this.field1329) {
            for (int var3 = 0; var3 < this.field1324; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field1329 - 5) || (this.field1324 - 5) <= var3) {
                    this.field1319[var2][var3] = 16777215;
                } else {
                    this.field1319[var2][var3] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBII)V")
    private final void method584(int arg0, byte arg1, int arg2, int arg3) {
        this.field1319[arg2][arg0] = class184.method1188(this.field1319[arg2][arg0], ~arg3);
        field1309++;
        if (arg1 < 56) {
            this.field1308 = -8;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZIIIII)V")
    public final void method585(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1336++;
        int var8 = arg0 - this.field1308;
        int var9 = arg3 - this.field1315;
        int var10 = 256;
        if (arg1) {
            var10 += 131072;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg4;
            arg4 = arg2;
            arg2 = var11;
        }
        if (arg5 >= -66) {
            this.field1324 = -104;
        }
        for (int var12 = var8; var12 < (arg4 + var8); var12++) {
            if (var12 >= 0 && this.field1329 > var12) {
                for (int var13 = var9; var13 < var9 + arg2; var13++) {
                    if (var13 >= 0 && var13 < this.field1324) {
                        this.method584(var13, (byte) 112, var12, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1322++;
        if (arg1 == 1) {
            if (arg0 == arg7 && arg3 == arg4) {
                return true;
            }
        } else if (arg0 <= arg7 && arg7 <= (arg0 - (1 - arg1)) && arg3 <= arg3 && arg3 <= (arg3 + arg1 - 1)) {
            return true;
        }
        if (arg6 != 7956) {
            field1323 = null;
        }
        int var9 = arg4 - this.field1315;
        int var10 = arg0 - this.field1308;
        int var11 = arg7 - this.field1308;
        int var12 = arg3 - this.field1315;
        if (arg1 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field1319[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1319[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field1319[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field1319[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field1319[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field1319[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field1319[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field1319[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field1319[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field1319[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field1319[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field1319[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var10 - 1;
            int var14 = var9 + arg1 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var11 + 1 == var10 && var9 <= var12 && var12 <= var14 && (this.field1319[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 - arg1 == var9 && (this.field1319[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - arg1 == var10 && var9 <= var12 && var12 <= var14 && (this.field1319[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 - arg1 == var9 && (this.field1319[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 - arg1 == var10 && var9 <= var12 && var14 >= var12 && (this.field1319[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9 && (this.field1319[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12 && (this.field1319[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 + 1 == var9 && (this.field1319[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9 && (this.field1319[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var10 && var11 <= var13 && (var12 - arg1) == var9 && (this.field1319[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg1) == var10 && var9 <= var12 && var14 >= var12 && (this.field1319[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var12 >= var9 && var12 <= var14 && (this.field1319[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIBI)V")
    public final void method587(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg2 - this.field1308;
        int var8 = arg5 - this.field1315;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method584(var8, (byte) 58, var7, 128);
                this.method584(var8, (byte) 124, var7 - 1, 8);
            }
            if (arg1 == 1) {
                this.method584(var8, (byte) 92, var7, 2);
                this.method584(var8 + 1, (byte) 118, var7, 32);
            }
            if (arg1 == 2) {
                this.method584(var8, (byte) 113, var7, 8);
                this.method584(var8, (byte) 107, var7 + 1, 128);
            }
            if (arg1 == 3) {
                this.method584(var8, (byte) 74, var7, 32);
                this.method584(var8 - 1, (byte) 72, var7, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method584(var8, (byte) 124, var7, 1);
                this.method584(var8 + 1, (byte) 99, var7 - 1, 16);
            }
            if (arg1 == 1) {
                this.method584(var8, (byte) 103, var7, 4);
                this.method584(var8 + 1, (byte) 69, var7 + 1, 64);
            }
            if (arg1 == 2) {
                this.method584(var8, (byte) 120, var7, 16);
                this.method584(var8 - 1, (byte) 100, var7 + 1, 1);
            }
            if (arg1 == 3) {
                this.method584(var8, (byte) 119, var7, 64);
                this.method584(var8 - 1, (byte) 57, var7 - 1, 4);
            }
        }
        field1328++;
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method584(var8, (byte) 108, var7, 130);
                this.method584(var8, (byte) 103, var7 - 1, 8);
                this.method584(var8 + 1, (byte) 67, var7, 32);
            }
            if (arg1 == 1) {
                this.method584(var8, (byte) 75, var7, 10);
                this.method584(var8 + 1, (byte) 99, var7, 32);
                this.method584(var8, (byte) 109, var7 + 1, 128);
            }
            if (arg1 == 2) {
                this.method584(var8, (byte) 118, var7, 40);
                this.method584(var8, (byte) 58, var7 + 1, 128);
                this.method584(var8 - 1, (byte) 97, var7, 2);
            }
            if (arg1 == 3) {
                this.method584(var8, (byte) 105, var7, 160);
                this.method584(var8 - 1, (byte) 72, var7, 2);
                this.method584(var8, (byte) 119, var7 - 1, 8);
            }
        }
        if (arg0) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method584(var8, (byte) 115, var7, 65536);
                    this.method584(var8, (byte) 120, var7 - 1, 4096);
                }
                if (arg1 == 1) {
                    this.method584(var8, (byte) 58, var7, 1024);
                    this.method584(var8 + 1, (byte) 90, var7, 16384);
                }
                if (arg1 == 2) {
                    this.method584(var8, (byte) 82, var7, 4096);
                    this.method584(var8, (byte) 67, var7 + 1, 65536);
                }
                if (arg1 == 3) {
                    this.method584(var8, (byte) 78, var7, 16384);
                    this.method584(var8 - 1, (byte) 86, var7, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method584(var8, (byte) 121, var7, 512);
                    this.method584(var8 + 1, (byte) 63, var7 - 1, 8192);
                }
                if (arg1 == 1) {
                    this.method584(var8, (byte) 101, var7, 2048);
                    this.method584(var8 + 1, (byte) 83, var7 + 1, 32768);
                }
                if (arg1 == 2) {
                    this.method584(var8, (byte) 93, var7, 8192);
                    this.method584(var8 - 1, (byte) 114, var7 + 1, 512);
                }
                if (arg1 == 3) {
                    this.method584(var8, (byte) 86, var7, 32768);
                    this.method584(var8 - 1, (byte) 88, var7 - 1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method584(var8, (byte) 60, var7, 66560);
                    this.method584(var8, (byte) 127, var7 - 1, 4096);
                    this.method584(var8 + 1, (byte) 59, var7, 16384);
                }
                if (arg1 == 1) {
                    this.method584(var8, (byte) 90, var7, 5120);
                    this.method584(var8 + 1, (byte) 85, var7, 16384);
                    this.method584(var8, (byte) 68, var7 + 1, 65536);
                }
                if (arg1 == 2) {
                    this.method584(var8, (byte) 111, var7, 20480);
                    this.method584(var8, (byte) 111, var7 + 1, 65536);
                    this.method584(var8 - 1, (byte) 78, var7, 1024);
                }
                if (arg1 == 3) {
                    this.method584(var8, (byte) 72, var7, 81920);
                    this.method584(var8 - 1, (byte) 110, var7, 1024);
                    this.method584(var8, (byte) 121, var7 - 1, 4096);
                }
            }
        }
        if (arg4 != 29) {
            field1335 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1313++;
        if (arg6 != 8192) {
            this.method586(119, -33, 103, -90, 122, 77, -9, -79);
        }
        if (arg2 < (arg4 + arg5) && arg2 + arg8 > arg4) {
            return arg7 < arg0 + arg1 && arg3 + arg7 > arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method589(int arg0, int arg1, String arg2) {
        field1332++;
        class270 var3 = class190.method1213(25702, arg0, 3);
        var3.method1808((byte) 62);
        if (arg1 != 5) {
            field1333 = null;
        }
        var3.field4222 = arg2;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method590(byte arg0) {
        field1331 = null;
        field1334 = null;
        field1333 = null;
        field1330 = null;
        field1323 = null;
        if (arg0 >= -99) {
            method592(-56);
        }
        field1335 = null;
        field1327 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIIIIIII)Z")
    public final boolean method591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 0) {
            return false;
        }
        field1320++;
        if (arg8 > 1) {
            return this.method588(arg6, arg5, arg3, arg8, arg1, arg4, 8192, arg0, arg8) ? true : this.method582(arg8, arg3, arg1, arg0, arg5, (byte) 100, arg4, arg6, arg7, arg8);
        }
        int var10 = arg1 + arg4 - 1;
        int var11 = arg5 + arg6 - 1;
        if (arg3 >= arg1 && arg3 <= var10 && arg0 >= arg5 && var11 >= arg0) {
            return true;
        } else if ((arg1 - 1) == arg3 && arg0 >= arg5 && var11 >= arg0 && (this.field1319[arg3 - this.field1308][arg0 - this.field1315] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg3 && arg0 >= arg5 && var11 >= arg0 && (this.field1319[arg3 - this.field1308][arg0 - this.field1315] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg0 && arg3 >= arg1 && var10 >= arg3 && (this.field1319[arg3 - this.field1308][arg0 - this.field1315] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg0 && arg1 <= arg3 && var10 >= arg3 && (this.field1319[arg3 - this.field1308][arg0 - this.field1315] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static final void method592(int arg0) {
        class217.method1396(false, class273.field4357);
        class203.field2946++;
        field1326++;
        if (class219.field3229 && class70.field1091) {
            int var1 = class25.field345;
            int var2 = var1 - class123.field1786;
            if (class32.field472 > var2) {
                var2 = class32.field472;
            }
            if ((class273.field4357.field4177 + var2) > (class32.field472 + class219.field3231.field4177)) {
                var2 = class32.field472 + class219.field3231.field4177 - class273.field4357.field4177;
            }
            int var3 = class273.field4357.field4159;
            int var4 = class190.field2688;
            int var5 = var2 - class37.field545;
            int var6 = var4 - class35.field504;
            if (var6 < class142.field2060) {
                var6 = class142.field2060;
            }
            if ((class273.field4357.field4051 + var6) > (class142.field2060 + class219.field3231.field4051)) {
                var6 = class142.field2060 + class219.field3231.field4051 - class273.field4357.field4051;
            }
            int var7 = class219.field3231.field4059 + var2 - class32.field472;
            int var8 = var6 - class12.field186;
            if (class273.field4357.field4082 < class203.field2946 && (var5 > var3 || (-var3) > var5 || var3 < var8 || (-var3) > var8)) {
                class114.field1632 = true;
            }
            if (arg0 == 3647) {
                int var9 = class219.field3231.field4140 + var6 - class142.field2060;
                if (class273.field4357.field4040 != null && class114.field1632) {
                    class234 var10 = new class234();
                    var10.field3530 = class273.field4357.field4040;
                    var10.field3531 = class273.field4357;
                    var10.field3528 = var7;
                    var10.field3519 = var9;
                    class15.method118((byte) 83, var10);
                }
                if (class137.field1987 == 0) {
                    if (class114.field1632) {
                        if (class273.field4357.field4133 != null) {
                            class234 var11 = new class234();
                            var11.field3531 = class273.field4357;
                            var11.field3523 = class231.field3453;
                            var11.field3528 = var7;
                            var11.field3530 = class273.field4357.field4133;
                            var11.field3519 = var9;
                            class15.method118((byte) 75, var11);
                        }
                        if (class231.field3453 != null && client.method1430(class273.field4357) != null) {
                            class95.field1451.method522(218, 28727);
                            class95.field1451.method738(class273.field4357.field4058, (byte) 126);
                            class95.field1451.method748(class231.field3453.field4113, 26277);
                            class67.field1050++;
                            class95.field1451.method737(-2645, class273.field4357.field4113);
                            class95.field1451.method784(true, class231.field3453.field4058);
                        }
                    } else if ((class250.field3787 == 1 || class76.method506(class283.field4508 - 1, (byte) 73)) && class283.field4508 > 2) {
                        class7.method76(0);
                    } else if (class283.field4508 > 0) {
                        class26.method195(126);
                    }
                    class273.field4357 = null;
                }
            }
        } else if (class203.field2946 > 1) {
            class273.field4357 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(II)V")
    public class86(int arg0, int arg1) {
        this.field1329 = arg0;
        this.field1315 = 0;
        this.field1324 = arg1;
        this.field1308 = 0;
        this.field1319 = new int[this.field1329][this.field1324];
        this.method583(16777216);
    }
}
