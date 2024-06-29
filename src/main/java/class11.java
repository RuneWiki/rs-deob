import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 extends class260 {

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    private int field240 = 409;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    private int field241 = 1024;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    private int field250 = 1024;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    private int field251 = 0;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    private int field252 = 819;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
    private int field260 = 1024;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    private int field258 = 2048;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    private int field259 = 1024;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "I")
    private int field256 = 0;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "Loh;")
    public static class263 field253 = class253.method1681(-121, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field245 = 50;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Loh;")
    public static class263 field242 = class253.method1681(-118, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "Loh;")
    public static class263 field261 = class253.method1681(-118, "mem=");

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Lrc;")
    public static class65 field243;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "Lue;")
    public static class86 field248;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public static void method84(int arg0) {
        field243 = null;
        field261 = null;
        field253 = null;
        field242 = null;
        field248 = null;
        if (arg0 >= -127) {
            method84(-47);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field246;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field4511.method304(arg0, false);
            if (super.field4511.field1029) {
                int[][] var4 = super.field4511.method306((byte) -59);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                int var11 = 0;
                boolean var12 = true;
                int var13 = class49.field1052 * this.field258 >> 12;
                int var14 = class49.field1052 * this.field250 >> 12;
                int var15 = 0;
                int var16 = class60.field1235 * this.field240 >> 12;
                int var17 = class60.field1235 * this.field252 >> 12;
                if (var17 <= 1) {
                    return var4[arg0];
                } else {
                    this.field257 = class49.field1052 / 8 * this.field241 >> 12;
                    int var18 = class49.field1052 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    Random var20 = new Random((long) this.field256);
                    int[][] var21 = new int[var18][3];
                    while (true) {
                        while (true) {
                            int var22 = class256.method1699(var20, 119, -var14 + var13) + var14;
                            int var23 = var8 - -var22;
                            int var24 = class256.method1699(var20, 121, -var16 + var17) + var16;
                            if (~class49.field1052 > ~var23) {
                                var23 = class49.field1052;
                                var22 = -var8 + class49.field1052;
                            }
                            int var10000;
                            int var25;
                            if (var12) {
                                var25 = 0;
                            } else {
                                int[] var26 = var21[var9];
                                var25 = var26[2];
                                int var27 = var7 + var23;
                                int var28 = 0;
                                int var29 = var9;
                                if (~var27 > -1) {
                                    var27 += class49.field1052;
                                }
                                if (~var27 < ~class49.field1052) {
                                    var27 -= class49.field1052;
                                }
                                while (true) {
                                    int[] var30 = var21[var29];
                                    if (~var27 <= ~var30[0] && var27 <= var30[1]) {
                                        if (~var9 != ~var29) {
                                            int var31 = var8 - -var7;
                                            if (~var31 > -1) {
                                                var31 += class49.field1052;
                                            }
                                            if (class49.field1052 < var31) {
                                                var31 -= class49.field1052;
                                            }
                                            for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                                int[] var40 = var21[(var9 - -var32) % var11];
                                                var25 = Math.max(var25, var40[2]);
                                            }
                                            for (int var33 = 0; var33 <= var28; ++var33) {
                                                int[] var34 = var21[(var9 + var33) % var11];
                                                int var35 = var34[2];
                                                if (~var25 != ~var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (~var27 >= ~var31) {
                                                        if (var36 != 0) {
                                                            var38 = Math.max(var31, var36);
                                                            var39 = class49.field1052;
                                                        } else {
                                                            var39 = Math.min(var27, var37);
                                                            var38 = 0;
                                                        }
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var27, var37);
                                                    }
                                                    this.method87(arg1 ^ -251, var35, var20, -var38 + var39, -var35 + var25, var4, var6 + var38);
                                                }
                                            }
                                        }
                                        var9 = var29;
                                        break;
                                    }
                                    ++var28;
                                    var10000 = ~var11;
                                    ++var29;
                                    if (var10000 >= ~var29) {
                                        var29 = 0;
                                    }
                                }
                            }
                            if (~class60.field1235 <= ~(var24 + var25)) {
                                var10 = false;
                            } else {
                                var24 = -var25 + class60.field1235;
                            }
                            if (~class49.field1052 == ~var23) {
                                this.method87(-6, var25, var20, var22, var24, var4, var5 + var8);
                                if (var10) {
                                    return var3;
                                }
                                var12 = false;
                                var6 = var5;
                                var10 = true;
                                var9 = 0;
                                int[][] var41 = var21;
                                var21 = var19;
                                int[] var42 = var19[var15++];
                                var19 = var41;
                                var11 = var15;
                                var42[0] = var8;
                                var15 = 0;
                                var42[1] = var23;
                                var8 = 0;
                                var42[2] = var24 + var25;
                                var5 = class256.method1699(var20, arg1 + -137, class49.field1052);
                                var7 = -var6 + var5;
                                int var43 = var7;
                                if (var7 < 0) {
                                    var43 = class49.field1052 + var7;
                                }
                                if (~var43 < ~class49.field1052) {
                                    var43 -= class49.field1052;
                                }
                                while (true) {
                                    int[] var44 = var21[var9];
                                    if (var43 >= var44[0] && var44[1] >= var43) {
                                        break;
                                    }
                                    var10000 = ~var11;
                                    ++var9;
                                    if (var10000 >= ~var9) {
                                        var9 = 0;
                                    }
                                }
                            } else {
                                int[] var45 = var19[var15++];
                                var45[2] = var25 - -var24;
                                var45[1] = var23;
                                var45[0] = var8;
                                this.method87(-6, var25, var20, var22, var24, var4, var5 + var8);
                                var8 = var23;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)Z")
    public static final boolean method85(int arg0, int arg1, int arg2, int arg3) {
        if (!class162.method1065(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class112.field2102[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class43.field940) {
                        if (!class216.method1469(var4, var6, var5)) {
                            return false;
                        }
                        if (!class216.method1469(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class216.method1469(var4, var7, var5)) {
                            return false;
                        }
                        if (!class216.method1469(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class216.method1469(var4, var8, var5)) {
                        return false;
                    }
                    if (!class216.method1469(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class1.field5) {
                        if (!class216.method1469(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class216.method1469(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class216.method1469(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class216.method1469(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class216.method1469(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class216.method1469(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class43.field940) {
                        if (!class216.method1469(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class216.method1469(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class216.method1469(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class216.method1469(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class216.method1469(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class216.method1469(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class1.field5) {
                        if (!class216.method1469(var4, var6, var5)) {
                            return false;
                        }
                        if (!class216.method1469(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class216.method1469(var4, var7, var5)) {
                            return false;
                        }
                        if (!class216.method1469(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class216.method1469(var4, var8, var5)) {
                        return false;
                    }
                    if (!class216.method1469(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class216.method1469(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class216.method1469(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class216.method1469(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class216.method1469(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class216.method1469(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field260 = arg2.method1294((byte) 3);
                                        }
                                    } else {
                                        this.field259 = arg2.method1294((byte) 3);
                                    }
                                } else {
                                    this.field251 = arg2.method1301(-8317);
                                }
                            } else {
                                this.field241 = arg2.method1294((byte) 3);
                            }
                        } else {
                            this.field252 = arg2.method1294((byte) 3);
                        }
                    } else {
                        this.field240 = arg2.method1294((byte) 3);
                    }
                } else {
                    this.field258 = arg2.method1294((byte) 3);
                }
            } else {
                this.field250 = arg2.method1294((byte) 3);
            }
        } else {
            this.field256 = arg2.method1301(-8317);
        }
        if (arg1 != 5701) {
            this.method17(-46, 105);
        }
        ++field255;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILjava/util/Random;II[[II)V")
    private final void method87(int arg0, int arg1, Random arg2, int arg3, int arg4, int[][] arg5, int arg6) {
        ++field262;
        int var8 = ~this.field260 < -1 ? -class256.method1699(arg2, 121, this.field260) + 4096 : 4096;
        if (arg0 == -6) {
            int var9 = this.field259 * this.field257 >> 12;
            int var10 = this.field257 - (var9 <= 0 ? 0 : class256.method1699(arg2, 127, var9));
            if (~class49.field1052 >= ~arg6) {
                arg6 -= class49.field1052;
            }
            if (var10 <= 0) {
                if (~(arg6 - -arg3) < ~class49.field1052) {
                    int var11 = -arg6 + class49.field1052;
                    for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                        int[] var13 = arg5[arg1 - -var12];
                        class149.method978(var13, arg6, var11, var8);
                        class149.method978(var13, 0, -var11 + arg3, var8);
                    }
                } else {
                    for (int var14 = 0; ~arg4 < ~var14; ++var14) {
                        class149.method978(arg5[arg1 + var14], arg6, arg3, var8);
                    }
                }
            } else if (arg4 > 0 && ~arg3 < -1) {
                int var15 = arg3 / 2;
                int var16 = arg4 / 2;
                int var17 = ~var15 > ~var10 ? var15 : var10;
                int var18 = var16 >= var10 ? var10 : var16;
                int var19 = -(var17 * 2) + arg3;
                int var20 = arg6 + var17;
                for (int var21 = 0; ~arg4 < ~var21; ++var21) {
                    int[] var22 = arg5[arg1 + var21];
                    if (var21 < var18) {
                        int var23 = var8 * var21 / var18;
                        if (this.field251 == 0) {
                            for (int var24 = 0; var17 > var24; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class263.method1777(class166.field3024, arg6 - -var24)] = var22[class263.method1777(class166.field3024, arg6 - 1 + -var24 + arg3)] = var23 * var25 >> 12;
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~var17; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class263.method1777(arg6 + var26, class166.field3024)] = var22[class263.method1777(-var26 + -1 + arg3 + arg6, class166.field3024)] = var28 < var23 ? var28 : var23;
                            }
                        }
                        if (class49.field1052 >= var20 - -var19) {
                            class149.method978(var22, var20, var19, var23);
                        } else {
                            int var27 = class49.field1052 - var20;
                            class149.method978(var22, var20, var27, var23);
                            class149.method978(var22, 0, var19 - var27, var23);
                        }
                    } else {
                        int var29 = arg4 - var21 + -1;
                        if (~var29 > ~var18) {
                            int var30 = var8 * var29 / var18;
                            if (this.field251 == 0) {
                                for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class263.method1777(arg6 + var31, class166.field3024)] = var22[class263.method1777(class166.field3024, arg6 + -1 + arg3 - var31)] = var30 * var32 >> 12;
                                }
                            } else {
                                for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class263.method1777(class166.field3024, arg6 + var33)] = var22[class263.method1777(class166.field3024, -var33 + -1 + arg6 + arg3)] = var35 < var30 ? var35 : var30;
                                }
                            }
                            if (var19 + var20 > class49.field1052) {
                                int var34 = -var20 + class49.field1052;
                                class149.method978(var22, var20, var34, var30);
                                class149.method978(var22, 0, -var34 + var19, var30);
                            } else {
                                class149.method978(var22, var20, var19, var30);
                            }
                        } else {
                            for (int var36 = 0; var17 > var36; ++var36) {
                                var22[class263.method1777(class166.field3024, arg6 + var36)] = var22[class263.method1777(class166.field3024, -var36 + arg6 + arg3 - 1)] = var8 * var36 / var17;
                            }
                            if (var19 + var20 > class49.field1052) {
                                int var37 = -var20 + class49.field1052;
                                class149.method978(var22, var20, var37, var8);
                                class149.method978(var22, 0, -var37 + var19, var8);
                            } else {
                                class149.method978(var22, var20, var19, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        ++field244;
        if (arg0 <= 81) {
            this.field256 = -12;
        }
    }
}
