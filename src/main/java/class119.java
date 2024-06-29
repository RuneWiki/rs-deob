import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class119 extends class536 {

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "B")
    public byte field1325 = 5;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "[I")
    public static int[] field1324 = new int[32];

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field1327 = -50;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "[[I")
    public static int[][] field1334 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Z")
    public static boolean field1336 = true;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Z")
    public boolean field1332;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLsp;I)V")
    public static final void method692(boolean arg0, class677 arg1, int arg2) {
        field1329++;
        class543 var3 = arg1.method3737((byte) 88);
        if (arg1.field9518 == 0) {
            class264.field3293 = -1;
            class171.field1900 = 0;
            arg1.field9514 = 0;
            return;
        }
        if (arg1.field9455 != -1 && arg1.field9482 == 0) {
            class257 var4 = class265.field3301.method3043(arg1.field9455, -8191);
            if (arg1.field9516 > 0 && var4.field3231 == 0) {
                class171.field1900 = 0;
                arg1.field9514++;
                class264.field3293 = -1;
                return;
            }
            if (arg1.field9516 <= 0 && var4.field3229 == 0) {
                class264.field3293 = -1;
                class171.field1900 = 0;
                arg1.field9514++;
                return;
            }
        }
        if (arg1.field9504 != -1 && arg1.field9420 <= class678.field9539) {
            class681 var5 = class63.field654.method2191(false, arg1.field9504);
            if (var5.field9596 && var5.field9611 != -1) {
                class257 var6 = class265.field3301.method3043(var5.field9611, -8191);
                if (arg1.field9516 > 0 && var6.field3231 == 0) {
                    class264.field3293 = -1;
                    arg1.field9514++;
                    class171.field1900 = 0;
                    return;
                }
                if (arg1.field9516 <= 0 && var6.field3229 == 0) {
                    arg1.field9514++;
                    class264.field3293 = -1;
                    class171.field1900 = 0;
                    return;
                }
            }
        }
        if (arg1.field9504 != -1 && arg1.field9420 <= class678.field9539) {
            class681 var7 = class63.field654.method2191(false, arg1.field9504);
            if (var7.field9596 && var7.field9611 != -1) {
                class257 var8 = class265.field3301.method3043(var7.field9611, -8191);
                if (arg1.field9516 > 0 && var8.field3231 == 0) {
                    arg1.field9514++;
                    class264.field3293 = -1;
                    class171.field1900 = 0;
                    return;
                }
                if (arg1.field9516 <= 0 && var8.field3229 == 0) {
                    class264.field3293 = -1;
                    arg1.field9514++;
                    class171.field1900 = 0;
                    return;
                }
            }
        }
        int var9 = arg1.field5179;
        int var10 = arg1.field5176;
        int var11 = arg1.field9517[arg1.field9518 - 1] * 512 + arg1.method1414(-31789) * 256;
        if (arg2 != -2) {
            field1334 = null;
        }
        int var12 = arg1.field9513[arg1.field9518 - 1] * 512 + (arg1.method1414(arg2 - 31787) * 256);
        if (var9 >= var11) {
            if (var11 >= var9) {
                if (var10 < var12) {
                    arg1.method3740((byte) -29, 8192);
                } else if (var12 < var10) {
                    arg1.method3740((byte) -29, 0);
                }
            } else if (var12 > var10) {
                arg1.method3740((byte) -29, 6144);
            } else if (var10 <= var12) {
                arg1.method3740((byte) -29, 4096);
            } else {
                arg1.method3740((byte) -29, 2048);
            }
        } else if (var10 < var12) {
            arg1.method3740((byte) -29, 10240);
        } else if (var12 < var10) {
            arg1.method3740((byte) -29, 14336);
        } else {
            arg1.method3740((byte) -29, 12288);
        }
        byte var13 = arg1.field9523[arg1.field9518 - 1];
        if (!arg0 && var11 - var9 > 1024 || var11 - var9 < -1024 || (var12 - var10) > 1024 || (var12 - var10) < -1024) {
            arg1.field5176 = var12;
            arg1.field5179 = var11;
            arg1.method3733(arg1.field9497, false, (byte) -103);
            arg1.field9518--;
            if (arg1.field9516 > 0) {
                arg1.field9516--;
            }
            class171.field1900 = 0;
            class264.field3293 = -1;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg1 instanceof class600) {
            var15 = ((class600) arg1).field8461.field2514;
        }
        if (var15) {
            int var16 = arg1.field9497 - arg1.field9446.field8518;
            if (var16 != 0 && arg1.field9448 == -1 && arg1.field9469 != 0) {
                var14 = 8;
            }
            if (!arg0 && arg1.field9518 > 2) {
                var14 = 24;
            }
            if (!arg0 && arg1.field9518 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg0 && arg1.field9518 > 1) {
                var14 = 24;
            }
            if (!arg0 && arg1.field9518 > 2) {
                var14 = 32;
            }
        }
        if (arg1.field9514 > 0 && arg1.field9518 > 1) {
            var14 = 32;
            arg1.field9514--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field7632 != -1) {
            int var17 = var14 << 9;
            if (arg1.field9518 == 1) {
                int var18 = arg1.field9520 * arg1.field9520;
                int var19 = (arg1.field5179 <= var11 ? var11 - arg1.field5179 : -var11 + arg1.field5179) << 9;
                int var20 = (var12 >= arg1.field5176 ? var12 - arg1.field5176 : arg1.field5176 - var12) << 9;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var3.field7632 * var21 * 2;
                if (var22 < var18) {
                    arg1.field9520 /= 2;
                } else if (var18 / 2 > var21) {
                    arg1.field9520 -= var3.field7632;
                    if (arg1.field9520 < 0) {
                        arg1.field9520 = 0;
                    }
                } else if (var17 > arg1.field9520) {
                    arg1.field9520 += var3.field7632;
                    if (arg1.field9520 > var17) {
                        arg1.field9520 = var17;
                    }
                }
            } else if (var17 > arg1.field9520) {
                arg1.field9520 += var3.field7632;
                if (arg1.field9520 > var17) {
                    arg1.field9520 = var17;
                }
            } else if (arg1.field9520 > 0) {
                arg1.field9520 -= var3.field7632;
                if (arg1.field9520 < 0) {
                    arg1.field9520 = 0;
                }
            }
            var14 = arg1.field9520 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class171.field1900 = 0;
        if (var9 == var11 && var10 == var12) {
            class264.field3293 = -1;
        } else {
            if (var9 < var11) {
                class171.field1900 |= 0x4;
                arg1.field5179 += var14;
                if (var11 < arg1.field5179) {
                    arg1.field5179 = var11;
                }
            } else if (var11 < var9) {
                arg1.field5179 -= var14;
                class171.field1900 |= 0x8;
                if (var11 > arg1.field5179) {
                    arg1.field5179 = var11;
                }
            }
            if (var12 > var10) {
                arg1.field5176 += var14;
                class171.field1900 |= 0x1;
                if (var12 < arg1.field5176) {
                    arg1.field5176 = var12;
                }
            } else if (var12 < var10) {
                class171.field1900 |= 0x2;
                arg1.field5176 -= var14;
                if (arg1.field5176 < var12) {
                    arg1.field5176 = var12;
                }
            }
            if (var14 >= 32) {
                class264.field3293 = 2;
            } else {
                class264.field3293 = var13;
            }
        }
        if (arg1.field5179 == var11 && arg1.field5176 == var12) {
            if (arg1.field9516 > 0) {
                arg1.field9516--;
            }
            arg1.field9518--;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method693(int arg0) {
        field1324 = null;
        if (arg0 == -1) {
            field1334 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILtf;)V")
    public static final void method694(int arg0, class701 arg1) {
        field1326++;
        class613.field8632 = arg1.method3875("p11_full", (byte) -91);
        if (arg0 != 0) {
            field1327 = 61;
        }
        class36.field372 = arg1.method3875("p12_full", (byte) -118);
        class80.field813 = arg1.method3875("b12_full", (byte) -120);
    }
}
