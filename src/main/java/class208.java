import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class208 extends class58 {

    @OriginalMember(owner = "client!cl", name = "Ac", descriptor = "I")
    public int field3315 = 0;

    @OriginalMember(owner = "client!cl", name = "zc", descriptor = "Z")
    public boolean field3314 = false;

    @OriginalMember(owner = "client!cl", name = "Fc", descriptor = "I")
    public int field3320 = -1;

    @OriginalMember(owner = "client!cl", name = "Bc", descriptor = "I")
    public int field3316 = 255;

    @OriginalMember(owner = "client!cl", name = "wc", descriptor = "I")
    public int field3311 = 0;

    @OriginalMember(owner = "client!cl", name = "Xc", descriptor = "I")
    public int field3338 = -1;

    @OriginalMember(owner = "client!cl", name = "Yc", descriptor = "I")
    public int field3339 = -1;

    @OriginalMember(owner = "client!cl", name = "Nc", descriptor = "B")
    private byte field3328 = 0;

    @OriginalMember(owner = "client!cl", name = "ad", descriptor = "I")
    public int field3341 = 0;

    @OriginalMember(owner = "client!cl", name = "Vc", descriptor = "I")
    public int field3336 = -1;

    @OriginalMember(owner = "client!cl", name = "xc", descriptor = "I")
    public int field3312 = -1;

    @OriginalMember(owner = "client!cl", name = "Qc", descriptor = "I")
    public int field3331 = -1;

    @OriginalMember(owner = "client!cl", name = "Pc", descriptor = "I")
    public int field3330 = 0;

    @OriginalMember(owner = "client!cl", name = "hd", descriptor = "I")
    public int field3348 = 0;

    @OriginalMember(owner = "client!cl", name = "jd", descriptor = "I")
    public int field3350 = -1;

    @OriginalMember(owner = "client!cl", name = "kd", descriptor = "B")
    private byte field3351 = 0;

    @OriginalMember(owner = "client!cl", name = "Ic", descriptor = "[I")
    public static int[] field3323 = new int[2048];

    @OriginalMember(owner = "client!cl", name = "bd", descriptor = "Z")
    public static boolean field3342 = true;

    @OriginalMember(owner = "client!cl", name = "Lc", descriptor = "I")
    public static int field3326 = -1;

    @OriginalMember(owner = "client!cl", name = "Kc", descriptor = "I")
    public static int field3325 = -1;

    @OriginalMember(owner = "client!cl", name = "gd", descriptor = "[I")
    public static int[] field3347 = new int[5];

    @OriginalMember(owner = "client!cl", name = "yc", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!cl", name = "Cc", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!cl", name = "Dc", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!cl", name = "Gc", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!cl", name = "Hc", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!cl", name = "Jc", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!cl", name = "Mc", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!cl", name = "Rc", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!cl", name = "Tc", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!cl", name = "Uc", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!cl", name = "Wc", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!cl", name = "Zc", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!cl", name = "cd", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!cl", name = "dd", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!cl", name = "ed", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!cl", name = "fd", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!cl", name = "id", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!cl", name = "Ec", descriptor = "Lid;")
    public class157 field3319;

    @OriginalMember(owner = "client!cl", name = "Oc", descriptor = "Ljava/lang/String;")
    public String field3329;

    @OriginalMember(owner = "client!cl", name = "Sc", descriptor = "Ljava/lang/String;")
    public String field3333;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)I")
    public final int method362(int arg0) {
        if (arg0 != 25892) {
            method1476(false, (char) 65529, 48);
        }
        ++field3337;
        return this.field3319 != null && ~this.field3319.field2479 != 0 ? class145.method974(arg0 + -25967, this.field3319.field2479).field1591 : super.method362(25892);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lma;I)Loe;")
    public static final class151 method1472(class202 arg0, int arg1) {
        ++field3343;
        class151 var2 = new class151();
        var2.field2352 = arg0.method1419(89);
        var2.field2353 = class79.method532(-32769, var2.field2352);
        return arg1 != -864 ? null : var2;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3317;
        if (!super.field810) {
            if (this.field3319 == null) {
                return;
            }
            class200 var6 = super.field853 != -1 && ~super.field883 == -1 ? class196.method1359(super.field853, (byte) 21) : null;
            class200 var7 = super.field857 == -1 || this.field3314 || super.field857 == this.method361(-1).field4282 && var6 != null ? null : class196.method1359(super.field857, (byte) 21);
            class293 var8 = this.field3319.method1043(super.field851, false, var7, false, -12890, super.field838, super.field825, super.field873, super.field813, super.field867, super.field808, var6);
            if (var8 == null) {
                return;
            }
            this.method363((byte) 75, var8, (class293) null);
        }
        if (super.field833 != null) {
            super.field833.method516(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBIII)V")
    public static final void method1473(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; class249.field3967 > var5; ++var5) {
            if (class310.field5013[var5] + class260.field4266[var5] > arg0 && class310.field5013[var5] < arg0 + arg4 && arg3 < class73.field1059[var5] - -class150.field2341[var5] && class73.field1059[var5] < arg3 - -arg2) {
                class283.field4731[var5] = true;
            }
        }
        if (arg1 < 1) {
            field3342 = true;
        }
        ++field3349;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIIJILgd;)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class77 arg10) {
        ++field3345;
        if (this.field3319 != null) {
            class200 var13 = super.field853 != -1 && ~super.field883 == -1 ? class196.method1359(super.field853, (byte) 21) : null;
            class261 var14 = this.method361(-1);
            boolean var15 = ~var14.field4297 != -1 || var14.field4291 != 0 || var14.field4286 != 0 || var14.field4280 != 0;
            class200 var16 = super.field857 == -1 || this.field3314 || ~super.field857 == ~this.method361(-1).field4282 && var13 != null ? null : class196.method1359(super.field857, (byte) 21);
            class293 var17 = this.field3319.method1043(super.field851, var15, var16, true, -12890, super.field838, super.field825, super.field873, super.field813, super.field867, super.field808, var13);
            int var18 = class120.method782((byte) -126);
            if (class169.field2630 != 0 && var18 < 50) {
                int var19 = -var18 + 50;
                while (~var19 < ~class175.field2737) {
                    class183.field2837[class175.field2737] = new byte[102400];
                    ++class175.field2737;
                }
                while (class175.field2737 > var19) {
                    --class175.field2737;
                    class183.field2837[class175.field2737] = null;
                }
            }
            if (var17 != null) {
                super.field794 = var17.method206();
                if (class180.field2800 && (~this.field3319.field2479 == 0 || class145.method974(-104, this.field3319.field2479).field1623)) {
                    class293 var20 = class207.method1470(super.field863, arg0, -105, super.field869, var16 == null ? super.field813 : super.field808, 0, super.field850, var17, 160, 0, var16 != null ? var16 : var13, super.field836, 240, 1);
                    var20.method205(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class77) null);
                }
                if (class309.field5006 == this) {
                    for (int var21 = class263.field4340.length - 1; ~var21 <= -1; --var21) {
                        class3 var22 = class263.field4340[var21];
                        if (var22 != null && ~var22.field18 != 0) {
                            if (~var22.field16 == -2 && ~var22.field17 <= -1 && ~var22.field17 > ~class76.field1188.length) {
                                class35 var23 = class76.field1188[var22.field17];
                                if (var23 != null) {
                                    int var24 = var23.field850 / 32 + -(class309.field5006.field850 / 32);
                                    int var25 = var23.field836 / 32 - class309.field5006.field836 / 32;
                                    this.method1479((class77) null, 360000, var25, (byte) -103, arg5, arg7, arg1, var24, arg0, arg3, var22.field18, arg6, var17, arg4, arg2, arg9);
                                }
                            }
                            if (~var22.field16 == -3) {
                                int var26 = (var22.field20 - class254.field4063) * 4 + 2 + -(class309.field5006.field850 / 32);
                                int var27 = (-class101.field1517 + var22.field25) * 4 + -(class309.field5006.field836 / 32) + 2;
                                int var28 = var22.field21 * 4;
                                int var29 = var28 * var28;
                                this.method1479((class77) null, var29, var27, (byte) -119, arg5, arg7, arg1, var26, arg0, arg3, var22.field18, arg6, var17, arg4, arg2, arg9);
                            }
                            if (~var22.field16 == -11 && var22.field17 >= 0 && ~var22.field17 > ~class300.field4925.length) {
                                class208 var30 = class300.field4925[var22.field17];
                                if (var30 != null) {
                                    int var31 = var30.field836 / 32 + -(class309.field5006.field836 / 32);
                                    int var32 = var30.field850 / 32 + -(class309.field5006.field850 / 32);
                                    this.method1479((class77) null, 360000, var31, (byte) -55, arg5, arg7, arg1, var32, arg0, arg3, var22.field18, arg6, var17, arg4, arg2, arg9);
                                }
                            }
                        }
                    }
                }
                this.method350((byte) -39, var17);
                this.method349(arg0, true, var17);
                class293 var33 = null;
                if (!this.field3314 && super.field870 != -1 && super.field829 != -1) {
                    class119 var34 = class278.method1939(super.field870, (byte) -128);
                    var33 = var34.method774((byte) 102, super.field799, super.field830, super.field829);
                    if (var33 != null) {
                        var33.method1315(0, -super.field887, 0);
                        if (var34.field1825) {
                            if (class119.field1830 != 0) {
                                var33.method1304(class119.field1830);
                            }
                            if (class89.field1379 != 0) {
                                var33.method1311(class89.field1379);
                            }
                            if (class127.field1964 != 0) {
                                var33.method1315(0, class127.field1964, 0);
                            }
                        }
                    }
                }
                class293 var35 = null;
                if (!this.field3314 && super.field882 != null) {
                    if (~super.field809 >= ~class4.field32) {
                        super.field882 = null;
                    }
                    if (~class4.field32 <= ~super.field815 && class4.field32 < super.field809) {
                        if (super.field882 instanceof class125) {
                            var35 = (class293) ((class125) super.field882).method829((byte) -124);
                        } else {
                            var35 = (class293) super.field882;
                        }
                        var35.method1315(-super.field836 + super.field819, super.field796 - super.field869, -super.field850 + super.field790);
                        if (~super.field802 == -513) {
                            var35.method1303();
                        } else if (super.field802 != 1024) {
                            if (~super.field802 == -1537) {
                                var35.method1296();
                            }
                        } else {
                            var35.method1294();
                        }
                    }
                }
                if (var33 != null) {
                    var17 = ((class191) var17).method1301(var33);
                }
                if (var35 != null) {
                    var17 = ((class191) var17).method1301(var35);
                }
                this.method363((byte) 79, var17, var33);
                var17.field4825 = true;
                var17.method205(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field833);
                if (var35 != null) {
                    if (super.field802 != 512) {
                        if (~super.field802 == -1025) {
                            var35.method1294();
                        } else if (super.field802 == 1536) {
                            var35.method1303();
                        }
                    } else {
                        var35.method1296();
                    }
                    var35.method1315(-super.field819 + super.field836, -super.field796 + super.field869, -super.field790 + super.field850);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)Z")
    public final boolean method211(int arg0) {
        ++field3313;
        if (this.field3319 == null) {
            return false;
        } else {
            if (arg0 != 65535) {
                field3326 = 104;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)I")
    public final int method213(int arg0) {
        if (arg0 != 0) {
            field3342 = true;
        }
        ++field3335;
        return -1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method1474(int arg0, boolean arg1) {
        if (arg0 != 255) {
            return null;
        } else {
            ++field3340;
            String var3 = "";
            if (class301.field4940 != null) {
                var3 = var3 + class301.field4940[this.field3351];
            }
            if (class22.field293 != null && class22.field293[this.field3351] != -1) {
                class124 var4 = class154.method1012(class22.field293[this.field3351], false);
                if (~var4.field1898 != -116) {
                    class159.method1055("gdn1", -17731, new Throwable());
                    class22.field293[this.field3351] = -1;
                } else {
                    var3 = var3 + var4.method827(this.field3328 & 255, (byte) 40);
                }
            }
            String var5;
            if (!arg1) {
                var5 = var3 + this.field3329;
            } else {
                var5 = var3 + this.field3333;
            }
            if (class294.field4837 != null) {
                var5 = var5 + class294.field4837[this.field3351];
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!cl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3324;
        if (super.field833 != null) {
            super.field833.method511();
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLma;I)V")
    public final void method1475(byte arg0, class202 arg1, int arg2) {
        arg1.field3272 = 0;
        ++field3327;
        int var4 = arg1.method1420((byte) 0);
        int var5 = 1 & var4;
        boolean var6 = (var4 & 2) != 0;
        boolean var7 = (var4 & 4) != 0;
        int var8 = super.method362(25892);
        this.method365((var4 >> 3 & 7) + 1, -17145);
        int var9 = -1;
        int[] var10 = new int[12];
        this.field3351 = (byte) (var4 >> 6 & 3);
        super.field836 += (-var8 + this.method362(25892)) * 64;
        super.field850 += 64 * (-var8 + this.method362(25892));
        this.field3328 = arg1.method1457((byte) -64);
        this.field3339 = arg1.method1457((byte) -52);
        this.field3331 = arg1.method1457((byte) -94);
        this.field3341 = 0;
        for (int var11 = 0; var11 < 12; ++var11) {
            int var12 = arg1.method1420((byte) 0);
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg1.method1420((byte) 0);
                int var14 = (var12 << 8) + var13;
                if (var11 == 0 && ~var14 == -65536) {
                    var9 = arg1.method1419(110);
                    this.field3341 = arg1.method1420((byte) 0);
                    break;
                }
                if (~var14 <= -32769) {
                    int var26 = class57.field783[var14 + -32768];
                    var10[var11] = class82.method554(1073741824, var26);
                    int var27 = class14.method92(var26, false).field2073;
                    if (~var27 != -1) {
                        this.field3341 = var27;
                    }
                } else {
                    var10[var11] = class82.method554(var14 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; ++var16) {
            int var25 = arg1.method1420((byte) 0);
            if (var25 < 0 || ~class226.field3581[var16].length >= ~var25) {
                var25 = 0;
            }
            var15[var16] = var25;
        }
        int var17 = 84 % ((41 - arg0) / 37);
        super.field807 = arg1.method1419(65);
        this.field3333 = arg1.method1403(-127);
        if (var6) {
            this.field3329 = arg1.method1403(-125);
        } else {
            this.field3329 = this.field3333;
        }
        this.field3330 = arg1.method1420((byte) 0);
        if (!var7) {
            this.field3348 = 0;
            this.field3315 = arg1.method1420((byte) 0);
            this.field3312 = arg1.method1420((byte) 0);
            if (this.field3312 == 255) {
                this.field3312 = -1;
            }
        } else {
            this.field3348 = arg1.method1419(70);
            this.field3315 = this.field3330;
            this.field3312 = -1;
        }
        int var18 = this.field3311;
        this.field3311 = arg1.method1420((byte) 0);
        if (~this.field3311 == -1) {
            class43.method274((byte) 115, arg2, this);
        } else {
            int var19 = this.field3320;
            int var20 = this.field3336;
            int var21 = this.field3338;
            int var22 = this.field3316;
            int var23 = this.field3350;
            this.field3338 = arg1.method1419(121);
            this.field3320 = arg1.method1419(102);
            this.field3336 = arg1.method1419(127);
            this.field3350 = arg1.method1419(113);
            this.field3316 = arg1.method1420((byte) 0);
            if (this.field3311 != var18 || ~this.field3338 != ~var21 || this.field3320 != var19 || this.field3336 != var20 || ~this.field3350 != ~var23 || ~this.field3316 != ~var22) {
                class173.method1162(arg2, true, this);
            }
        }
        if (this.field3319 == null) {
            this.field3319 = new class157();
        }
        int var24 = this.field3319.field2479;
        this.field3319.method1033(super.field807, var5 == 1, var9, var10, -103, var15);
        if (~var9 != ~var24) {
            super.field836 = super.field849[0] * 128 + 64 * this.method362(25892);
            super.field850 = super.field804[0] * 128 + 64 * this.method362(25892);
        }
        if (super.field833 != null) {
            super.field833.method509();
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()I")
    public final int method206() {
        ++field3332;
        return super.field794;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZCI)C")
    public static final char method1476(boolean arg0, char arg1, int arg2) {
        if (!arg0) {
            field3323 = null;
        }
        ++field3344;
        if (arg1 >= 192 && arg1 <= 255) {
            if (~arg1 <= -193 && arg1 <= 198) {
                return 'A';
            }
            if (arg1 == 199) {
                return 'C';
            }
            if (arg1 >= 200 && arg1 <= 203) {
                return 'E';
            }
            if (arg1 >= 204 && arg1 <= 207) {
                return 'I';
            }
            if (arg1 == 209 && ~arg2 != -1) {
                return 'N';
            }
            if (~arg1 <= -211 && ~arg1 >= -215) {
                return 'O';
            }
            if (arg1 >= 217 && ~arg1 >= -221) {
                return 'U';
            }
            if (~arg1 == -222) {
                return 'Y';
            }
            if (~arg1 == -224) {
                return 's';
            }
            if (arg1 >= 224 && ~arg1 >= -231) {
                return 'a';
            }
            if (~arg1 == -232) {
                return 'c';
            }
            if (~arg1 <= -233 && ~arg1 >= -236) {
                return 'e';
            }
            if (arg1 >= 236 && arg1 <= 239) {
                return 'i';
            }
            if (arg1 == 241 && arg2 != 0) {
                return 'n';
            }
            if (~arg1 <= -243 && ~arg1 >= -247) {
                return 'o';
            }
            if (arg1 >= 249 && arg1 <= 252) {
                return 'u';
            }
            if (~arg1 == -254 || ~arg1 == -256) {
                return 'y';
            }
        }
        if (~arg1 == -339) {
            return 'O';
        } else if (~arg1 == -340) {
            return 'o';
        } else if (arg1 == 376) {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BZ)Ljava/lang/String;")
    public final String method1477(byte arg0, boolean arg1) {
        ++field3334;
        int var3 = 123 % ((37 - arg0) / 56);
        return arg1 ? this.field3333 : this.field3329;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)I")
    public final int method210(int arg0) {
        int var2 = 48 / ((arg0 - -20) / 40);
        ++field3321;
        return super.field807;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V")
    public static void method1478(byte arg0) {
        field3347 = null;
        field3323 = null;
        if (arg0 < 54) {
            method1472((class202) null, -72);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lgd;IIBIIIIIIIILrk;III)V")
    private final void method1479(class77 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class293 arg12, int arg13, int arg14, int arg15) {
        ++field3322;
        if (arg3 >= -49) {
            this.field3348 = 21;
        }
        int var17 = arg2 * arg2 - -(arg7 * arg7);
        if (~var17 <= -17 && arg1 >= var17) {
            int var18 = 2047 & (int) (325.949D * Math.atan2((double) arg2, (double) arg7));
            class293 var19 = class134.method904(super.field836, arg10, var18, super.field869, super.field850, arg12, (byte) -102);
            if (var19 != null) {
                var19.method205(0, arg6, arg14, arg9, arg13, arg4, arg11, arg5, -1L, arg15, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZZI)V")
    public final void method1480(int arg0, boolean arg1, boolean arg2, int arg3) {
        super.method357(arg1, this.method362(25892), (byte) -118, arg0, arg3);
        ++field3346;
        if (arg2) {
            method1478((byte) -106);
        }
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)V")
    public static final void method1481(int arg0) {
        ++class180.field2795;
        class276.field4572.method1391(0, arg0);
        class276.field4572.method1446((byte) 54, class115.method725((byte) 121));
        ++field3318;
        class276.field4572.method1412(class169.field2644, false);
        class276.field4572.method1412(class79.field1254, false);
        class276.field4572.method1446((byte) 64, class230.field3687);
    }
}
