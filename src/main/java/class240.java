import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class240 extends class290 {

    @OriginalMember(owner = "client!tl", name = "jc", descriptor = "I")
    public int field3465 = 0;

    @OriginalMember(owner = "client!tl", name = "uc", descriptor = "I")
    public int field3476 = -1;

    @OriginalMember(owner = "client!tl", name = "sc", descriptor = "I")
    public int field3474 = -1;

    @OriginalMember(owner = "client!tl", name = "qc", descriptor = "I")
    public int field3472 = 0;

    @OriginalMember(owner = "client!tl", name = "Ic", descriptor = "I")
    public int field3490 = -1;

    @OriginalMember(owner = "client!tl", name = "Ec", descriptor = "I")
    public int field3486 = -1;

    @OriginalMember(owner = "client!tl", name = "Kc", descriptor = "I")
    public int field3492 = -1;

    @OriginalMember(owner = "client!tl", name = "Jc", descriptor = "I")
    public int field3491 = 255;

    @OriginalMember(owner = "client!tl", name = "tc", descriptor = "I")
    public int field3475 = 0;

    @OriginalMember(owner = "client!tl", name = "Nc", descriptor = "I")
    public int field3495 = 0;

    @OriginalMember(owner = "client!tl", name = "Qc", descriptor = "I")
    public int field3498 = -1;

    @OriginalMember(owner = "client!tl", name = "Mc", descriptor = "Z")
    public boolean field3494 = false;

    @OriginalMember(owner = "client!tl", name = "nc", descriptor = "I")
    public int field3469 = -1;

    @OriginalMember(owner = "client!tl", name = "lc", descriptor = "I")
    public int field3467 = 0;

    @OriginalMember(owner = "client!tl", name = "zc", descriptor = "B")
    private byte field3481 = 0;

    @OriginalMember(owner = "client!tl", name = "Ac", descriptor = "[Ljava/lang/String;")
    public static String[] field3482 = new String[500];

    @OriginalMember(owner = "client!tl", name = "Cc", descriptor = "I")
    public static int field3484 = 0;

    @OriginalMember(owner = "client!tl", name = "Dc", descriptor = "[I")
    public static int[] field3485 = new int[500];

    @OriginalMember(owner = "client!tl", name = "oc", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!tl", name = "pc", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!tl", name = "rc", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!tl", name = "vc", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!tl", name = "wc", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!tl", name = "xc", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!tl", name = "yc", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!tl", name = "Bc", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!tl", name = "Fc", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!tl", name = "Gc", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!tl", name = "Hc", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!tl", name = "Lc", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!tl", name = "Oc", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!tl", name = "Pc", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!tl", name = "mc", descriptor = "Lqh;")
    public class134 field3468;

    @OriginalMember(owner = "client!tl", name = "kc", descriptor = "Ljava/lang/String;")
    public String field3466;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)I")
    public final int method332(boolean arg0) {
        ++field3489;
        return !arg0 ? 4 : super.field4588;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
    public final int method1556(int arg0) {
        ++field3477;
        if (arg0 != 3888) {
            return 58;
        } else {
            return this.field3468 != null && this.field3468.field1961 != -1 ? class165.method1084(arg0 + -4007, this.field3468.field1961).field3858 : super.method1556(3888);
        }
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method1557(int arg0) {
        String var2 = this.field3466;
        if (class276.field4200 != null) {
            var2 = class276.field4200[this.field3481] + var2;
        }
        ++field3487;
        if (arg0 != 104) {
            this.field3469 = 7;
        }
        if (class202.field2865 != null) {
            var2 = var2 + class202.field2865[this.field3481];
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static void method1558(byte arg0) {
        field3482 = null;
        field3485 = null;
        if (arg0 < 98) {
            method1564((class82) null, 76);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIIILah;IIIIILqd;I)V")
    private final void method1559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class162 arg14, int arg15) {
        int var17 = arg1 * arg1 - -(arg12 * arg12);
        ++field3493;
        if (~var17 <= -17 && ~arg4 <= ~var17) {
            int var18 = (int) (Math.atan2((double) arg1, (double) arg12) * 325.949D) & 2047;
            if (arg6 >= -97) {
                field3484 = 62;
            }
            class106 var19 = class292.method1960(var18, super.field4527, arg8, super.field4563, arg15, super.field4553, 27382);
            if (var19 != null) {
                var19.method235(0, arg3, arg13, arg2, arg7, arg11, arg0, arg10, -1L, arg5, arg14);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(II)Lfj;")
    public static final class276 method1560(int arg0, int arg1) {
        ++field3470;
        if (arg1 != 10214) {
            field3482 = null;
        }
        class276 var2 = (class276) class260.field3786.method65((byte) -92, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class204.field2905.method1861(arg0, 30, 1);
            class276 var4 = new class276();
            if (var3 != null) {
                var4.method1781(arg0, new class216(var3), -54);
            }
            class260.field3786.method64((long) arg0, arg1 ^ -10215, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIBI)V")
    public final void method1561(boolean arg0, int arg1, byte arg2, int arg3) {
        ++field3483;
        super.method1942(120, arg1, this.method1556(3888), arg0, arg3);
        if (arg2 > -30) {
            method1562(61, -90, 54, -109, false, 72);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIIIJILqd;)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class162 arg10) {
        ++field3478;
        if (this.field3468 != null) {
            class274 var13 = ~super.field4592 != 0 && super.field4518 == 0 ? class27.method165(super.field4592, (byte) 112) : null;
            class274 var14 = super.field4579 == -1 || this.field3494 || ~super.field4579 == ~this.method1949(-1).field4376 && var13 != null ? null : class27.method165(super.field4579, (byte) 43);
            class106 var15 = this.field3468.method877(super.field4503, super.field4520, super.field4568, super.field4567, (byte) 111, super.field4540, super.field4580, super.field4581, var13, true, var14);
            int var16 = class37.method234((byte) 122);
            if (class179.field2546 != 0 && var16 < 50) {
                int var17 = 50 - var16;
                while (class229.field3275 < var17) {
                    class203.field2889[class229.field3275] = new byte[102400];
                    ++class229.field3275;
                }
                while (~var17 > ~class229.field3275) {
                    --class229.field3275;
                    class203.field2889[class229.field3275] = null;
                }
            }
            if (var15 != null) {
                super.field4531 = var15.method227();
                if (class284.field4342 && (this.field3468.field1961 == -1 || class165.method1084(-60, this.field3468.field1961).field3862)) {
                    class106 var18 = class282.method1876(1, super.field4527, arg0, 0, 160, var15, -76, super.field4593, var14 != null ? super.field4568 : super.field4567, var14 != null ? var14 : var13, super.field4563, 0, 240, super.field4553);
                    var18.method235(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class162) null);
                }
                if (class177.field2507 == this) {
                    for (int var19 = class243.field3528.length + -1; ~var19 <= -1; --var19) {
                        class287 var20 = class243.field3528[var19];
                        if (var20 != null && var20.field4472 != -1) {
                            if (~var20.field4470 == -2 && ~var20.field4459 <= -1 && ~var20.field4459 > ~class20.field244.length) {
                                class54 var21 = class20.field244[var20.field4459];
                                if (var21 != null) {
                                    int var22 = var21.field4563 / 32 + -(class177.field2507.field4563 / 32);
                                    int var23 = var21.field4553 / 32 + -(class177.field2507.field4553 / 32);
                                    this.method1559(arg6, var22, arg3, arg1, 360000, arg9, -106, arg4, var15, arg0, arg7, arg5, var23, arg2, (class162) null, var20.field4472);
                                }
                            }
                            if (var20.field4470 == 2) {
                                int var24 = (-class110.field1473 + var20.field4479) * 4 - (-2 - -(class177.field2507.field4563 / 32));
                                int var25 = (var20.field4473 - class166.field2383) * 4 + 2 + -(class177.field2507.field4553 / 32);
                                int var26 = var20.field4468 * 4;
                                int var27 = var26 * var26;
                                this.method1559(arg6, var24, arg3, arg1, var27, arg9, -123, arg4, var15, arg0, arg7, arg5, var25, arg2, (class162) null, var20.field4472);
                            }
                            if (~var20.field4470 == -11 && var20.field4459 >= 0 && var20.field4459 < class253.field3656.length) {
                                class240 var28 = class253.field3656[var20.field4459];
                                if (var28 != null) {
                                    int var29 = var28.field4563 / 32 + -(class177.field2507.field4563 / 32);
                                    int var30 = var28.field4553 / 32 + -(class177.field2507.field4553 / 32);
                                    this.method1559(arg6, var29, arg3, arg1, 360000, arg9, -118, arg4, var15, arg0, arg7, arg5, var30, arg2, (class162) null, var20.field4472);
                                }
                            }
                        }
                    }
                }
                this.method1941(false, var15);
                this.method1945(arg0, var15, (byte) -119);
                class106 var31 = null;
                if (!this.field3494 && ~super.field4590 != 0 && super.field4578 != -1) {
                    class101 var32 = class189.method1246(super.field4590, (byte) -50);
                    var31 = var32.method615(super.field4556, super.field4578, super.field4542, 8);
                    if (var31 != null) {
                        var31.method645(0, -super.field4526, 0);
                        if (var32.field1391) {
                            if (~class287.field4467 != -1) {
                                var31.method666(class287.field4467);
                            }
                            if (~class143.field2042 != -1) {
                                var31.method646(class143.field2042);
                            }
                            if (class287.field4456 != 0) {
                                var31.method645(0, class287.field4456, 0);
                            }
                        }
                    }
                }
                class106 var33 = null;
                if (!this.field3494 && super.field4587 != null) {
                    if (super.field4551 <= class198.field2819) {
                        super.field4587 = null;
                    }
                    if (~class198.field2819 <= ~super.field4549 && super.field4551 > class198.field2819) {
                        if (super.field4587 instanceof class122) {
                            var33 = (class106) ((class122) super.field4587).method795(572894544);
                        } else {
                            var33 = (class106) super.field4587;
                        }
                        var33.method645(super.field4511 - super.field4563, -super.field4527 + super.field4598, -super.field4553 + super.field4519);
                        if (~super.field4534 != -513) {
                            if (super.field4534 == 1024) {
                                var33.method667();
                            } else if (~super.field4534 == -1537) {
                                var33.method655();
                            }
                        } else {
                            var33.method668();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class275) var15).method1778(var31);
                }
                if (var33 != null) {
                    var15 = ((class275) var15).method1778(var33);
                }
                var15.field1435 = true;
                var15.method235(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4561);
                if (var33 != null) {
                    if (super.field4534 == 512) {
                        var33.method655();
                    } else if (~super.field4534 != -1025) {
                        if (~super.field4534 == -1537) {
                            var33.method668();
                        }
                    } else {
                        var33.method667();
                    }
                    var33.method645(-super.field4511 + super.field4563, -super.field4598 + super.field4527, -super.field4519 + super.field4553);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()I")
    public final int method227() {
        ++field3471;
        return super.field4531;
    }

    @OriginalMember(owner = "client!tl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3480;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1562(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field3479;
        int var6 = arg0;
        if (!arg4) {
            while (~(arg0 - -arg5) <= ~var6) {
                for (int var11 = arg2; arg2 - -arg3 >= var11; ++var11) {
                    if (~var11 <= -1 && ~var11 > -105 && ~var6 <= -1 && var6 < 104) {
                        class263.field3812[arg1][var11][var6] = 127;
                    }
                }
                ++var6;
            }
            for (int var7 = arg0; arg0 - -arg5 > var7; ++var7) {
                for (int var10 = arg2; var10 < arg2 - -arg3; ++var10) {
                    if (~var10 <= -1 && var10 < 104 && ~var7 <= -1 && var7 < 104) {
                        class290.field4536[arg1][var10][var7] = arg1 > 0 ? class290.field4536[arg1 - 1][var10][var7] : 0;
                    }
                }
            }
            if (arg2 > 0 && arg2 < 104) {
                for (int var8 = arg0 - -1; ~var8 > ~(arg0 + arg5); ++var8) {
                    if (~var8 <= -1 && var8 < 104) {
                        class290.field4536[arg1][arg2][var8] = class290.field4536[arg1][arg2 + -1][var8];
                    }
                }
            }
            if (arg0 > 0 && ~arg0 > -105) {
                for (int var9 = arg2 + 1; ~var9 > ~(arg2 + arg3); ++var9) {
                    if (var9 >= 0 && var9 < 104) {
                        class290.field4536[arg1][var9][arg0] = class290.field4536[arg1][var9][arg0 + -1];
                    }
                }
            }
            if (~arg2 <= -1 && ~arg0 <= -1 && arg2 < 104 && arg0 < 104) {
                if (arg1 == 0) {
                    if (arg2 > 0 && ~class290.field4536[arg1][arg2 - 1][arg0] != -1) {
                        class290.field4536[arg1][arg2][arg0] = class290.field4536[arg1][arg2 + -1][arg0];
                        return;
                    }
                    if (arg0 > 0 && class290.field4536[arg1][arg2][arg0 + -1] != 0) {
                        class290.field4536[arg1][arg2][arg0] = class290.field4536[arg1][arg2][arg0 - 1];
                        return;
                    }
                    if (~arg2 < -1 && ~arg0 < -1 && ~class290.field4536[arg1][arg2 + -1][arg0 + -1] != -1) {
                        class290.field4536[arg1][arg2][arg0] = class290.field4536[arg1][arg2 + -1][arg0 - 1];
                        return;
                    }
                } else {
                    if (~arg2 >= -1 || class290.field4536[arg1 + -1][arg2 - 1][arg0] == class290.field4536[arg1][arg2 + -1][arg0]) {
                        if (~arg0 < -1 && class290.field4536[arg1 + -1][arg2][arg0 - 1] != class290.field4536[arg1][arg2][arg0 - 1]) {
                            class290.field4536[arg1][arg2][arg0] = class290.field4536[arg1][arg2][arg0 + -1];
                            return;
                        }
                        if (arg2 > 0 && ~arg0 < -1 && class290.field4536[arg1 + -1][arg2 + -1][arg0 + -1] != class290.field4536[arg1][arg2 + -1][arg0 + -1]) {
                            class290.field4536[arg1][arg2][arg0] = class290.field4536[arg1][arg2 - 1][arg0 + -1];
                            return;
                        }
                        return;
                    }
                    class290.field4536[arg1][arg2][arg0] = class290.field4536[arg1][arg2 + -1][arg0];
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lqi;Z)V")
    public final void method1563(class216 arg0, boolean arg1) {
        arg0.field3021 = 0;
        int var3 = arg0.method1407(127);
        ++field3473;
        boolean var4 = ~(var3 & 4) != -1;
        int var5 = super.method1556(3888);
        int var6 = var3 & 1;
        int[] var7 = new int[12];
        int var8 = -1;
        this.method1939((var3 >> 3 & 7) + 1, -112);
        this.field3481 = (byte) ((199 & var3) >> 6);
        super.field4563 += (this.method1556(3888) + -var5) * 64;
        super.field4553 += (this.method1556(3888) - var5) * 64;
        this.field3469 = arg0.method1355(arg1);
        this.field3492 = arg0.method1355(arg1);
        this.field3465 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg0.method1407(110);
            if (var10 == 0) {
                var7[var9] = 0;
            } else {
                int var11 = arg0.method1407(103);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && ~var12 == -65536) {
                    var8 = arg0.method1380(arg1);
                    this.field3465 = arg0.method1407(110);
                    break;
                }
                if (var12 >= 32768) {
                    int var25 = class93.field1250[var12 + -32768];
                    var7[var9] = class220.method1432(1073741824, var25);
                    int var26 = class36.method224(var25, 83).field3288;
                    if (var26 != 0) {
                        this.field3465 = var26;
                    }
                } else {
                    var7[var9] = class220.method1432(Integer.MIN_VALUE, var12 + -256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var24 = arg0.method1407(120);
            if (var24 < 0 || ~class1.field9[var14].length >= ~var24) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field4588 = arg0.method1380(true);
        long var15 = arg0.method1386((byte) -128);
        this.field3466 = class110.method686(var15, true);
        this.field3472 = arg0.method1407(122);
        if (var4) {
            this.field3467 = arg0.method1380(arg1);
            this.field3486 = -1;
            this.field3495 = this.field3472;
        } else {
            this.field3467 = 0;
            this.field3495 = arg0.method1407(120);
            this.field3486 = arg0.method1407(103);
            if (~this.field3486 == -256) {
                this.field3486 = -1;
            }
        }
        int var17 = this.field3475;
        this.field3475 = arg0.method1407(127);
        if (~this.field3475 == -1) {
            class154.method1010(this, (byte) -121);
        } else {
            int var18 = this.field3490;
            int var19 = this.field3474;
            int var20 = this.field3498;
            int var21 = this.field3491;
            int var22 = this.field3476;
            this.field3490 = arg0.method1380(true);
            this.field3474 = arg0.method1380(arg1);
            this.field3498 = arg0.method1380(true);
            this.field3476 = arg0.method1380(arg1);
            this.field3491 = arg0.method1407(106);
            if (~this.field3475 != ~var17 || ~this.field3490 != ~var18 || ~this.field3474 != ~var19 || this.field3498 != var20 || this.field3476 != var22 || ~this.field3491 != ~var21) {
                class33.method205((byte) 125, this);
            }
        }
        if (this.field3468 == null) {
            this.field3468 = new class134();
        }
        int var23 = this.field3468.field1961;
        this.field3468.method880(super.field4588, var13, 25275, var7, var6 == 1, var8);
        if (var8 != var23) {
            super.field4563 = super.field4597[0] * 128 + this.method1556(3888) * 64;
            super.field4553 = super.field4585[0] * 128 - -(64 * this.method1556(3888));
        }
        if (super.field4561 != null) {
            super.field4561.method1071();
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3497;
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)Z")
    public final boolean method325(int arg0) {
        ++field3488;
        if (this.field3468 == null) {
            return false;
        } else {
            if (arg0 < 112) {
                this.field3475 = 18;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lwe;I)V")
    public static final void method1564(class82 arg0, int arg1) {
        ++field3496;
        class82 var2 = class42.method263(-101, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = client.field4437;
            var4 = class84.field1166;
        } else {
            var3 = var2.field1048;
            var4 = var2.field1131;
        }
        class152.method998(var3, var4, -15809, false, arg0);
        if (arg1 != -105) {
            method1564((class82) null, -9);
        }
        class66.method404(var4, 22595, arg0, var3);
    }
}
