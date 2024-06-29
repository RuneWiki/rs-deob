import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class211 extends class215 {

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    private int field3389 = 0;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    private int field3385 = 0;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    private int field3390 = 0;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "[I")
    public static int[] field3381 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
    public static int field3400 = -1;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    private int field3383;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    private int field3388;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    private int field3392;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    private int field3393;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
    private int field3401;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3397;
        long var8 = class62.method363(arg7, arg1 - -arg3, arg6 - -arg2);
        if (~var8 != -1L) {
            int var10 = ((int) var8 & 4160578) >> 20;
            int var11 = 31 & (int) var8 >> 14;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class228 var13 = class256.method1749(var12, 0);
            if (~var13.field3644 == 0) {
                int var14 = arg0;
                if (var8 > 0L) {
                    var14 = arg5;
                }
                int[] var15 = class217.field3483;
                int var16 = (52736 - arg6 * 512) * 4 + 24624 - -(arg1 * 4);
                if (var11 == 0 || ~var11 == -3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 - -512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (~var10 == -2) {
                        var15[var16] = var14;
                        var15[var16 - -1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (~var10 == -3) {
                        var15[var16 - -3] = var14;
                        var15[var16 + 515] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 1536 - -3] = var14;
                    } else if (var10 == 3) {
                        var15[var16 - -1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 - -1536 + 3] = var14;
                    }
                }
                if (var11 == 3) {
                    if (~var10 == -1) {
                        var15[var16] = var14;
                    } else if (~var10 != -2) {
                        if (~var10 == -3) {
                            var15[var16 - -1536 + 3] = var14;
                        } else if (~var10 == -4) {
                            var15[var16 + 1536] = var14;
                        }
                    } else {
                        var15[var16 + 3] = var14;
                    }
                }
                if (var11 == 2) {
                    if (~var10 == -4) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 - -1024] = var14;
                        var15[var16 - -1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 - -3 + 512] = var14;
                        var15[var16 - -3 - -1024] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (~var10 == -3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 - -1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 - -1536 + 3] = var14;
                    }
                }
            } else if (!class103.method623(var10, arg6, arg2, arg1, arg3, var13, 80)) {
                return false;
            }
        }
        long var17 = class286.method1929(arg7, arg1 + arg3, arg2 + arg6);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 3595870) >> 20;
            int var20 = ((int) var17 & 521728) >> 14;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class228 var22 = class256.method1749(var21, 0);
            if (~var22.field3644 == 0) {
                if (~var20 == -10) {
                    int var23 = 15658734;
                    int[] var24 = class217.field3483;
                    if (~var17 < -1L) {
                        var23 = 15597568;
                    }
                    int var25 = (-arg6 + 103) * 512 * 4 + arg1 * 4 + 24624;
                    if (~var19 != -1 && ~var19 != -3) {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 1026] = var23;
                        var24[var25 + 1539] = var23;
                    } else {
                        var24[var25 - -1536] = var23;
                        var24[var25 - -1 + 1024] = var23;
                        var24[var25 - -2 + 512] = var23;
                        var24[var25 - -3] = var23;
                    }
                }
            } else if (!class103.method623(var19, arg6, arg2, arg1, arg3, var22, 5)) {
                return false;
            }
        }
        long var26 = class291.method1960(arg7, arg1 + arg3, arg6 - -arg2);
        if (~var26 != -1L) {
            int var28 = (3708701 & (int) var26) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class228 var30 = class256.method1749(var29, 0);
            if (var30.field3644 != -1 && !class103.method623(var28, arg6, arg2, arg1, arg3, var30, 5)) {
                return false;
            }
        }
        if (arg4 < 76) {
            method1483(-56, -19, -24, -25, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class211() {
        super(1, false);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1482(String arg0, int arg1) {
        ++field3386;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            char var7 = arg0.charAt(var5);
            if (~var4 == -1) {
                var7 = Character.toLowerCase(var7);
            } else if (var4 == 2 || Character.isUpperCase(var7)) {
                var7 = class141.method971(false, var7);
            }
            if (!Character.isLetter(var7)) {
                if (var7 != '.' && ~var7 != -64 && ~var7 != -34) {
                    if (!Character.isSpaceChar(var7)) {
                        var4 = 1;
                    } else if (var4 != 2) {
                        var4 = 1;
                    }
                } else {
                    var4 = 2;
                }
            } else {
                var4 = 0;
            }
            var3[var5] = var7;
        }
        int var6 = 75 % ((-75 - arg1) / 49);
        return new String(var3);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1483(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3380;
        int var5 = arg2;
        int var6 = 0;
        int var7 = -1;
        if (arg4) {
            method1484(-61, -19, 13, 121, false);
        }
        int var8 = -arg2;
        int var9 = class256.method1750(70, arg2 + arg3, class116.field1653, class114.field1634);
        int var10 = class256.method1750(111, arg3 - arg2, class116.field1653, class114.field1634);
        class78.method433(var9, var10, class14.field186[arg0], arg1, (byte) 123);
        while (~var6 > ~var5) {
            var7 += 2;
            var8 += var7;
            if (~var8 < -1) {
                --var5;
                var8 -= var5 << 1;
                int var11 = arg0 + var5;
                int var12 = -var5 + arg0;
                if (~var11 <= ~class117.field1656 && ~class132.field2105 <= ~var12) {
                    int var13 = class256.method1750(83, arg3 + var6, class116.field1653, class114.field1634);
                    int var14 = class256.method1750(94, -var6 + arg3, class116.field1653, class114.field1634);
                    if (~var11 >= ~class132.field2105) {
                        class78.method433(var13, var14, class14.field186[var11], arg1, (byte) 123);
                    }
                    if (var12 >= class117.field1656) {
                        class78.method433(var13, var14, class14.field186[var12], arg1, (byte) 123);
                    }
                }
            }
            ++var6;
            int var15 = -var6 + arg0;
            int var16 = arg0 + var6;
            if (~var16 <= ~class117.field1656 && ~class132.field2105 <= ~var15) {
                int var17 = class256.method1750(54, arg3 + var5, class116.field1653, class114.field1634);
                int var18 = class256.method1750(77, -var5 + arg3, class116.field1653, class114.field1634);
                if (class132.field2105 >= var16) {
                    class78.method433(var17, var18, class14.field186[var16], arg1, (byte) 123);
                }
                if (~class117.field1656 >= ~var15) {
                    class78.method433(var17, var18, class14.field186[var15], arg1, (byte) 123);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IIIIZ)V")
    public static final void method1484(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class88.field1076 = arg1;
        class59.field752 = arg2;
        class194.field3111 = arg3;
        class84.field1044 = new class246[arg0][class88.field1076][class59.field752];
        class25.field348 = new int[arg0][class88.field1076 + 1][class59.field752 + 1];
        if (arg4) {
            class75.field943 = new class246[1][class88.field1076][class59.field752];
            class2.field15 = new int[class88.field1076][class59.field752];
            class172.field2739 = new int[1][class88.field1076 + 1][class59.field752 + 1];
        } else {
            class75.field943 = null;
            class2.field15 = null;
            class172.field2739 = null;
        }
        class127.method862(false);
        class120.field1704 = new class61[500];
        class286.field4564 = 0;
        class32.field425 = new class61[500];
        class162.field2576 = 0;
        class136.field2158 = new int[arg0][class88.field1076 + 1][class59.field752 + 1];
        class247.field4069 = new class19[5000];
        class152.field2362 = 0;
        class209.field3329 = new class19[100];
        class162.field2588 = new boolean[class194.field3111 + class194.field3111 + 1][class194.field3111 + class194.field3111 + 1];
        class9.field110 = new boolean[class194.field3111 + class194.field3111 + 2][class194.field3111 + class194.field3111 + 2];
        class204.field3214 = new byte[arg0][class88.field1076][class59.field752];
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        int[][] var3 = super.field3461.method1126(arg0 + 2, arg1);
        ++field3395;
        if (super.field3461.field2591) {
            int[][] var4 = this.method1504(arg0 ^ 82, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class244.field4015; ++var11) {
                this.method1486((byte) -42, var6[var11], var7[var11], var5[var11]);
                this.field3393 += this.field3390;
                this.field3401 += this.field3389;
                if (~this.field3401 > -1) {
                    this.field3401 = 0;
                }
                for (this.field3392 += this.field3385; ~this.field3392 > -1; this.field3392 += 4096) {
                }
                if (~this.field3393 > -1) {
                    this.field3393 = 0;
                }
                while (~this.field3392 < -4097) {
                    this.field3392 -= 4096;
                }
                if (this.field3401 > 4096) {
                    this.field3401 = 4096;
                }
                if (this.field3393 > 4096) {
                    this.field3393 = 4096;
                }
                this.method1485(this.field3393, this.field3401, this.field3392, arg0 ^ 99);
                var8[var11] = this.field3383;
                var9[var11] = this.field3398;
                var10[var11] = this.field3388;
            }
        }
        if (arg0 != -1) {
            field3394 = -93;
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
    private final void method1485(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 > 2048 ? arg1 - (arg0 * arg1 >> 12) + arg0 : (arg0 + 4096) * arg1 >> 12;
        ++field3387;
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg1 - -arg1;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var11 = var8 * var5 >> 12;
            int var12 = -(var9 << 12) + var6;
            int var13 = var11 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field3383 = var5;
                                    this.field3398 = var7;
                                    this.field3388 = var15;
                                }
                            } else {
                                this.field3388 = var5;
                                this.field3383 = var14;
                                this.field3398 = var7;
                            }
                        } else {
                            this.field3398 = var15;
                            this.field3383 = var7;
                            this.field3388 = var5;
                        }
                    } else {
                        this.field3388 = var14;
                        this.field3383 = var7;
                        this.field3398 = var5;
                    }
                } else {
                    this.field3388 = var7;
                    this.field3398 = var5;
                    this.field3383 = var15;
                }
            } else {
                this.field3388 = var7;
                this.field3398 = var14;
                this.field3383 = var5;
            }
        } else {
            this.field3383 = this.field3398 = this.field3388 = arg1;
        }
        if (arg3 >= -24) {
            method1484(-53, 61, 21, -34, true);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field3382;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field3389 = (arg2.method587(arg0 + -1521146235) << 12) / 100;
                }
            } else {
                this.field3390 = (arg2.method587(107) << 12) / 100;
            }
        } else {
            this.field3385 = arg2.method564(arg0 ^ -1521146254);
        }
        if (arg0 != 1521146348) {
            method1482((String) null, 19);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BIII)V")
    private final void method1486(byte arg0, int arg1, int arg2, int arg3) {
        ++field3391;
        int var5 = ~arg3 < ~arg1 ? arg3 : arg1;
        int var6 = ~arg1 < ~arg3 ? arg3 : arg1;
        int var7 = ~arg2 < ~var5 ? arg2 : var5;
        int var8 = ~var6 < ~arg2 ? arg2 : var6;
        int var9 = var7 - var8;
        this.field3401 = (var7 + var8) / 2;
        if (~this.field3401 < -1 && this.field3401 < 4096) {
            this.field3393 = (var9 << 12) / (~this.field3401 < -2049 ? -(this.field3401 * 2) + 8192 : this.field3401 * 2);
        } else {
            this.field3393 = 0;
        }
        if (~var9 >= -1) {
            this.field3392 = 0;
        } else {
            int var10 = (-arg3 + var7 << 12) / var9;
            int var11 = (var7 - arg1 << 12) / var9;
            int var12 = (-arg2 + var7 << 12) / var9;
            if (arg3 != var7) {
                if (~arg1 != ~var7) {
                    this.field3392 = arg3 == var8 ? var11 + 12288 : -var10 + 20480;
                } else {
                    this.field3392 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field3392 = arg1 != var8 ? -var11 + 4096 : 20480 - -var12;
            }
            this.field3392 /= 6;
        }
        if (arg0 != -42) {
            method1483(-40, 39, 88, -91, true);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
    public static final void method1487(String arg0, String arg1, int arg2, byte arg3) {
        class121.method786(-1, arg2, false, (String) null, arg0, arg1);
        ++field3384;
        if (arg3 > -120) {
            field3400 = -115;
        }
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
    public static void method1488(int arg0) {
        if (arg0 >= -68) {
            method1488(97);
        }
        field3381 = null;
    }
}
