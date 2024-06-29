import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class126 extends class23 {

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    private int field2235 = 204;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    private int field2231 = 1;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    private int field2241 = 1;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Llc;")
    public static class143 field2232 = class66.method374("scape main", -1);

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field2239 = 0;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "Lia;")
    public static class181 field2233;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "Lvh;")
    public static class43 field2230;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "[I")
    public static int[] field2226;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
    public static void method765(byte arg0) {
        field2226 = null;
        if (arg0 == 78) {
            field2232 = null;
            field2233 = null;
            field2230 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class126() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIILld;Lhg;IIIIZBII)Lhg;")
    public static final class150 method766(int arg0, int arg1, int arg2, int arg3, class104 arg4, class150 arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte arg11, int arg12, int arg13) {
        ++field2236;
        long var14 = ((long) arg3 << 48) + ((long) arg1 << 32) + (long) (arg2 - (-(arg9 << 16) - (arg7 << 24)));
        class150 var16 = (class150) class67.field1280.method826(var14, false);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (~arg2 == -2) {
                var18 = 9;
            } else if (~arg2 != -3) {
                if (~arg2 != -4) {
                    if (arg2 == 4) {
                        var18 = 18;
                    } else {
                        var18 = 21;
                    }
                } else {
                    var18 = 15;
                }
            } else {
                var18 = 12;
            }
            int[] var19 = new int[] { 64, 96, 128 };
            class94 var20 = new class94(var17 * var18 + 1, var17 * var18 * 2 - var18, 0);
            int var21 = var20.method552(0, 0, 0);
            int[][] var22 = new int[var17][var18];
            for (int var23 = 0; var17 > var23; ++var23) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; ~var32 > ~var18; ++var32) {
                    int var33 = (var32 << 11) / var18;
                    int var34 = arg8 - -(class196.field3635[var33] * var30) >> 16;
                    int var35 = class196.field3630[var33] * var31 + arg0 >> 16;
                    var22[var23][var32] = var20.method552(var34, 0, var35);
                }
            }
            for (int var24 = 0; var17 > var24; ++var24) {
                int var25 = (var24 * 256 + 128) / var17;
                int var26 = -var25 + 256;
                byte var27 = (byte) (arg7 * var25 + arg9 * var26 >> 8);
                short var28 = (short) ((32512 & (arg1 & 127) * var26 + (127 & arg3) * var25) + ((arg1 & 64512) * var26 + (64512 & arg3) * var25 & 16515072) + (229376 & (896 & arg1) * var26 + (896 & arg3) * var25) >> 8);
                for (int var29 = 0; ~var29 > ~var18; ++var29) {
                    if (~var24 != -1) {
                        var20.method526(var22[var24 + -1][var29], var22[var24 + -1][(var29 + 1) % var18], var22[var24][(var29 + 1) % var18], (byte) 1, var28, var27);
                        var20.method526(var22[var24 + -1][var29], var22[var24][(var29 + 1) % var18], var22[var24][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method526(var21, var22[0][(var29 + 1) % var18], var22[0][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method553(64, 768, -50, -10, -50);
            class67.field1280.method827(-3, var16, var14);
        }
        int var36 = arg2 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = var36;
        int var41 = arg5.method977();
        int var42 = arg5.method986();
        if (arg10) {
            if (arg12 > 1664 || ~arg12 > -385) {
                var37 -= 128;
            }
            if (~arg12 < -1153 && arg12 < 1920) {
                var38 = var36 + 128;
            }
            if (~arg12 < -641 && ~arg12 > -1409) {
                var40 = var36 + 128;
            }
            if (~arg12 < -129 && ~arg12 > -897) {
                var39 -= 128;
            }
        }
        if (~var42 < ~var38) {
            var42 = var38;
        }
        if (arg11 < 33) {
            return null;
        } else {
            int var43 = arg5.method984();
            class225 var44 = null;
            if (~var43 > ~var37) {
                var43 = var37;
            }
            if (~var39 < ~var41) {
                var41 = var39;
            }
            int var45 = arg5.method976();
            if (arg4 != null) {
                int var46 = arg4.field1829[arg6];
                var44 = class101.method604(var46 >> 16, -21);
                arg6 = var46 & 65535;
            }
            if (var45 > var40) {
                var45 = var40;
            }
            class150 var47;
            if (var44 != null) {
                var47 = var16.method979(!var44.method1544(133627240, arg6), true);
                var47.method989((var42 - var41) / 2, 128, (-var43 + var45) / 2);
                var47.method978((var41 + var42) / 2, 0, (var43 - -var45) / 2);
                var47.method974(var44, arg6);
            } else {
                var47 = var16.method979(true, true);
                var47.method989((-var41 + var42) / 2, 128, (-var43 + var45) / 2);
                var47.method978((var41 + var42) / 2, 0, (var43 + var45) / 2);
            }
            if (~arg12 != -1) {
                var47.method980(arg12);
            }
            class183 var48 = (class183) var47;
            if (~arg13 != ~class20.method140(arg8 + var41, 114, arg0 - -var43, class170.field3044) || ~class20.method140(arg8 + var42, 127, arg0 + var45, class170.field3044) != ~arg13) {
                for (int var49 = 0; var48.field3267 > var49; ++var49) {
                    var48.field3262[var49] += -arg13 + class20.method140(var48.field3284[var49] + arg8, 110, var48.field3274[var49] + arg0, class170.field3044);
                }
                var48.field3263 = false;
            }
            return var47;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)I")
    public static final int method767(int arg0, int arg1) {
        ++field2238;
        int var2 = 0;
        if (~arg0 > -1 || arg0 >= 65536) {
            arg0 >>>= 16;
            var2 += 16;
        }
        if (~arg0 <= -257) {
            arg0 >>>= 8;
            var2 += 8;
        }
        if (~arg0 <= -17) {
            arg0 >>>= 4;
            var2 += 4;
        }
        if (arg1 >= -113) {
            method767(-31, 99);
        }
        if (arg0 >= 4) {
            arg0 >>>= 2;
            var2 += 2;
        }
        if (~arg0 <= -2) {
            ++var2;
            arg0 >>>= 1;
        }
        return var2 - -arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field2237;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (arg0 >= -13) {
            this.method86(94, -38);
        }
        if (super.field369.field1005) {
            for (int var4 = 0; var4 < class72.field1359; ++var4) {
                int var5 = class3.field43[var4];
                int var6 = class31.field495[arg1];
                int var7 = this.field2241 * var5 >> 12;
                int var8 = var5 % (4096 / this.field2241) * this.field2241;
                int var9 = this.field2231 * var6 >> 12;
                int var10 = var6 % (4096 / this.field2231) * this.field2231;
                if (var10 < this.field2235) {
                    for (var7 -= var9; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field2235 < ~var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var8 > ~this.field2235) {
                    int var11;
                    for (var11 = var7 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field2228;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field2235 = arg0.method1275(128);
                }
            } else {
                this.field2231 = arg0.method1265(120);
            }
        } else {
            this.field2241 = arg0.method1265(120);
        }
        if (!arg2) {
            field2226 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class264.method1764(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class89.method514(var6 + 1, class192.field3535[arg0][arg1][arg3] + arg5, var7 + 1) && class89.method514(var6 + 128 - 1, class192.field3535[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class89.method514(var6 + 128 - 1, class192.field3535[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class89.method514(var6 + 1, class192.field3535[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class188.field3410[arg0][var8][var14] == -class182.field3256) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class192.field3535[arg0][arg1][arg3] + arg5;
            if (!class89.method514(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class89.method514(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class89.method514(var9, var11, var13)) {
                        return false;
                    } else if (!class89.method514(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }
}
