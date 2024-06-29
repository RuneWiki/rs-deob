import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class227 extends class264 {

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    private int field3258 = 4096;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "I")
    private int field3259 = 409;

    @OriginalMember(owner = "client!hp", name = "S", descriptor = "[I")
    private int[] field3262 = new int[3];

    @OriginalMember(owner = "client!hp", name = "X", descriptor = "I")
    private int field3267 = 4096;

    @OriginalMember(owner = "client!hp", name = "gb", descriptor = "I")
    private int field3276 = 4096;

    @OriginalMember(owner = "client!hp", name = "T", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!hp", name = "eb", descriptor = "[S")
    public static short[] field3274 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!hp", name = "bb", descriptor = "Z")
    public static boolean field3271 = false;

    @OriginalMember(owner = "client!hp", name = "fb", descriptor = "I")
    public static int field3275 = 999999;

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!hp", name = "Y", descriptor = "Lrc;")
    public static class108 field3268 = new class108(77, -2);

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!hp", name = "U", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!hp", name = "V", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!hp", name = "W", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!hp", name = "Z", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!hp", name = "ab", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!hp", name = "cb", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!hp", name = "db", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!hp", name = "hb", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!hp", name = "ib", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!hp", name = "jb", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!hp", name = "kb", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        ++field3261;
        int[][] var3 = super.field3816.method1928((byte) 67, arg1);
        if (arg0 != 116) {
            method1544((byte[]) null, (byte) 17);
        }
        if (super.field3816.field4208) {
            int[][] var4 = this.method1782(arg1, (byte) 122, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class478.field6792 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3262[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field3259 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3262[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field3259) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3262[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field3259) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3276 * var12 >> 12;
                            var9[var11] = this.field3258 * var14 >> 12;
                            var10[var11] = this.field3267 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([BB)Lks;")
    public static final class292 method1544(byte[] arg0, byte arg1) {
        ++field3269;
        class292 var2 = new class292();
        class161 var3 = new class161(arg0);
        var3.field2298 = var3.field2262.length + -2;
        int var4 = var3.method1134(-16848);
        int var5 = var3.field2262.length + -var4 + -2 + -12;
        var3.field2298 = var5;
        int var6 = var3.method1168(arg1 + 251);
        var2.field4140 = var3.method1134(-16848);
        var2.field4130 = var3.method1134(arg1 + -16852);
        var2.field4127 = var3.method1134(-16848);
        if (arg1 != 4) {
            field3274 = null;
        }
        var2.field4133 = var3.method1134(-16848);
        int var7 = var3.method1172((byte) -12);
        if (~var7 < -1) {
            var2.field4129 = new class155[var7];
            for (int var8 = 0; var7 > var8; ++var8) {
                int var9 = var3.method1134(-16848);
                class155 var10 = new class155(class169.method1230(arg1 + -4, var9));
                var2.field4129[var8] = var10;
                while (~(var9--) < -1) {
                    int var11 = var3.method1168(255);
                    int var12 = var3.method1168(255);
                    var10.method1100(new class478(var12), -128, (long) var11);
                }
            }
        }
        var3.field2298 = 0;
        var2.field4132 = var3.method1185(-123);
        var2.field4138 = new int[var6];
        var2.field4135 = new int[var6];
        var2.field4139 = new String[var6];
        int var13 = 0;
        while (~var5 < ~var3.field2298) {
            int var14 = var3.method1134(-16848);
            if (~var14 != -4) {
                if (~var14 > -101 && ~var14 != -22 && var14 != 38 && var14 != 39) {
                    var2.field4135[var13] = var3.method1168(255);
                } else {
                    var2.field4135[var13] = var3.method1172((byte) 61);
                }
            } else {
                var2.field4139[var13] = var3.method1186(-1).intern();
            }
            var2.field4138[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIII)V")
    public static final void method1545(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1009) {
            class457.method2744(class412.field5634, arg2, arg3);
        } else if (~arg1 == -1013) {
            class457.method2744(class89.field1271, arg2, arg3);
        } else if (~arg1 != -1007) {
            if (~arg1 == -1005) {
                class457.method2744(class172.field2622, arg2, arg3);
            } else if (arg1 == 1010) {
                class457.method2744(class213.field3103, arg2, arg3);
            }
        } else {
            class457.method2744(class428.field5972, arg2, arg3);
        }
        if (arg0) {
            method1545(true, -16, -8, 46);
        }
        ++field3277;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;")
    public static final String method1546(int arg0, int arg1, int arg2, long arg3, boolean arg4) {
        ++field3272;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (~arg3 > -1L) {
            arg3 = -arg3;
            var8 = true;
        }
        if (arg2 <= 115) {
            field3280 = -2;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; ~var10 > ~arg1; ++var10) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 + -((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (-((int) arg3 * 10) + var13 + 48));
            if (~arg3 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                ++var12;
                if (~(var12 % 3) == -1) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BC)Z")
    public static final boolean method1547(byte arg0, char arg1) {
        ++field3273;
        if (arg0 <= 16) {
            method1549(0);
        }
        return arg1 >= '0' && ~arg1 >= -58 || arg1 >= 'A' && arg1 <= 'Z' || ~arg1 <= -98 && ~arg1 >= -123;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1548(int arg0, String arg1, int arg2) {
        if (arg2 != 28186) {
            field3274 = null;
        }
        ++field3264;
        class334 var3 = class352.method2172(arg0, 3, 16711935);
        var3.method2104(0);
        var3.field4645 = arg1;
    }

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)V")
    public static void method1549(int arg0) {
        field3274 = null;
        if (arg0 > 65) {
            field3268 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILml;ZLml;I)I")
    public static final int method1550(int arg0, class21 arg1, boolean arg2, class21 arg3, int arg4) {
        if (arg4 != 0) {
            return 111;
        } else {
            ++field3270;
            if (arg0 == 1) {
                int var5 = arg3.field3073;
                int var6 = arg1.field3073;
                if (!arg2) {
                    if (~var6 == 0) {
                        var6 = 2001;
                    }
                    if (~var5 == 0) {
                        var5 = 2001;
                    }
                }
                return -var6 + var5;
            } else if (arg0 == 2) {
                return class448.method2712(arg1.method150(101).field261, arg3.method150(arg4 ^ 86).field261, class66.field967, (byte) 89);
            } else if (~arg0 == -4) {
                if (!arg3.field232.equals("-")) {
                    if (arg1.field232.equals("-")) {
                        return arg2 ? 1 : -1;
                    } else {
                        return class448.method2712(arg1.field232, arg3.field232, class66.field967, (byte) 89);
                    }
                } else if (arg1.field232.equals("-")) {
                    return 0;
                } else {
                    return !arg2 ? 1 : -1;
                }
            } else if (arg0 == 4) {
                if (arg3.method1436(arg4)) {
                    return arg1.method1436(arg4) ? 0 : 1;
                } else {
                    return arg1.method1436(0) ? -1 : 0;
                }
            } else if (~arg0 == -6) {
                if (arg3.method1431((byte) -101)) {
                    return arg1.method1431((byte) -52) ? 0 : 1;
                } else {
                    return arg1.method1431((byte) -75) ? -1 : 0;
                }
            } else if (arg0 == 6) {
                if (!arg3.method1435((byte) 108)) {
                    return arg1.method1435((byte) 64) ? -1 : 0;
                } else {
                    return arg1.method1435((byte) -103) ? 0 : 1;
                }
            } else if (arg0 == 7) {
                if (arg3.method1432(-29579)) {
                    return arg1.method1432(-29579) ? 0 : 1;
                } else {
                    return arg1.method1432(-29579) ? -1 : 0;
                }
            } else if (arg0 == 8) {
                int var7 = arg3.field225;
                int var8 = arg1.field225;
                if (arg2) {
                    if (~var8 == -1001) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (~var7 == 0) {
                        var7 = 1000;
                    }
                    if (~var8 == 0) {
                        var8 = 1000;
                    }
                }
                return -var8 + var7;
            } else {
                return -arg1.field228 + arg3.field228;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lfo;IIII)V")
    public static final void method1551(class418 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3265;
        class389 var5 = arg0.method2506(-16338);
        int var6 = 16383 & -arg0.field5772.field3970 + arg0.field5733;
        if (arg2 == -1) {
            if (var6 == 0 && ~arg0.field5756 >= -26) {
                if (!arg0.field5765 || !var5.method2366(arg0.field5763, 106)) {
                    arg0.field5763 = var5.method2367(true);
                    arg0.field5765 = arg0.field5763 != -1;
                }
            } else {
                arg0.field5765 = false;
                if (~arg4 > -1 && var5.field5335 != -1) {
                    arg0.field5763 = var5.field5335;
                } else if (arg4 > 0 && ~var5.field5358 != 0) {
                    arg0.field5763 = var5.field5358;
                } else {
                    arg0.field5763 = var5.field5339;
                }
            }
        } else if (~arg0.field5748 != 0 && (var6 >= 10240 || ~var6 >= -2049)) {
            int var7 = 16383 & class444.field6331[arg1] - arg0.field5772.field3970;
            arg0.field5765 = false;
            if (arg2 == 2 && ~var5.field5343 != 0) {
                if (~var7 < -2049 && var7 <= 6144 && ~var5.field5351 != 0) {
                    arg0.field5763 = var5.field5351;
                } else if (var7 >= 10240 && ~var7 > -14337 && var5.field5352 != -1) {
                    arg0.field5763 = var5.field5352;
                } else if (var7 > 6144 && ~var7 > -10241 && ~var5.field5348 != 0) {
                    arg0.field5763 = var5.field5348;
                } else {
                    arg0.field5763 = var5.field5343;
                }
            } else if (~arg2 == -1 && var5.field5361 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5336 != -1) {
                    arg0.field5763 = var5.field5336;
                } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field5350 != 0) {
                    arg0.field5763 = var5.field5350;
                } else if (~var7 < -6145 && var7 < 10240 && var5.field5344 != -1) {
                    arg0.field5763 = var5.field5344;
                } else {
                    arg0.field5763 = var5.field5361;
                }
            } else if (var7 > 2048 && ~var7 >= -6145 && ~var5.field5331 != 0) {
                arg0.field5763 = var5.field5331;
            } else if (var7 >= 10240 && ~var7 > -14337 && var5.field5367 != -1) {
                arg0.field5763 = var5.field5367;
            } else if (~var7 < -6145 && ~var7 > -10241 && var5.field5378 != -1) {
                arg0.field5763 = var5.field5378;
            } else {
                arg0.field5763 = var5.field5339;
            }
        } else if (var6 == 0 && ~arg0.field5756 >= -26) {
            arg0.field5765 = false;
            if (~arg2 == -3 && ~var5.field5343 != 0) {
                arg0.field5763 = var5.field5343;
            } else if (arg2 == 0 && var5.field5361 != -1) {
                arg0.field5763 = var5.field5361;
            } else {
                arg0.field5763 = var5.field5339;
            }
        } else {
            if (arg2 == 2 && ~var5.field5343 != 0) {
                if (~arg4 > -1 && ~var5.field5332 != 0) {
                    arg0.field5763 = var5.field5332;
                } else if (~arg4 < -1 && ~var5.field5345 != 0) {
                    arg0.field5763 = var5.field5345;
                } else {
                    arg0.field5763 = var5.field5343;
                }
            } else if (~arg2 == -1 && ~var5.field5361 != 0) {
                if (~arg4 > -1 && ~var5.field5357 != 0) {
                    arg0.field5763 = var5.field5357;
                } else if (arg4 > 0 && var5.field5337 != -1) {
                    arg0.field5763 = var5.field5337;
                } else {
                    arg0.field5763 = var5.field5361;
                }
            } else if (~arg4 > -1 && ~var5.field5360 != 0) {
                arg0.field5763 = var5.field5360;
            } else if (arg4 > 0 && var5.field5356 != -1) {
                arg0.field5763 = var5.field5356;
            } else {
                arg0.field5763 = var5.field5339;
            }
            arg0.field5765 = false;
        }
        if (arg3 != 0) {
            field3268 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 <= 31) {
            method1551((class418) null, 99, 109, -56, 116);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg1.method1178((byte) 63);
                            this.field3262[0] = class88.method739(var5, 16711680) << 4;
                            this.field3262[2] = class88.method739(var5, 255) >> 12;
                            this.field3262[1] = class88.method739(4080, var5 >> 4);
                        }
                    } else {
                        this.field3276 = arg1.method1134(-16848);
                    }
                } else {
                    this.field3258 = arg1.method1134(-16848);
                }
            } else {
                this.field3267 = arg1.method1134(-16848);
            }
        } else {
            this.field3259 = arg1.method1134(-16848);
        }
        ++field3278;
    }
}
