import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class288 extends class81 {

    @OriginalMember(owner = "client!nh", name = "uc", descriptor = "I")
    public int field4581 = 0;

    @OriginalMember(owner = "client!nh", name = "pc", descriptor = "I")
    public int field4576 = -1;

    @OriginalMember(owner = "client!nh", name = "nc", descriptor = "I")
    public int field4574 = 0;

    @OriginalMember(owner = "client!nh", name = "Ac", descriptor = "I")
    public int field4587 = -1;

    @OriginalMember(owner = "client!nh", name = "Dc", descriptor = "I")
    public int field4590 = -1;

    @OriginalMember(owner = "client!nh", name = "Bc", descriptor = "I")
    public int field4588 = 255;

    @OriginalMember(owner = "client!nh", name = "yc", descriptor = "I")
    public int field4585 = -1;

    @OriginalMember(owner = "client!nh", name = "Kc", descriptor = "I")
    public int field4597 = -1;

    @OriginalMember(owner = "client!nh", name = "wc", descriptor = "I")
    public int field4583 = -1;

    @OriginalMember(owner = "client!nh", name = "Hc", descriptor = "Z")
    public boolean field4594 = false;

    @OriginalMember(owner = "client!nh", name = "Jc", descriptor = "I")
    public int field4596 = 0;

    @OriginalMember(owner = "client!nh", name = "Lc", descriptor = "I")
    public int field4598 = 0;

    @OriginalMember(owner = "client!nh", name = "xc", descriptor = "I")
    public int field4584 = -1;

    @OriginalMember(owner = "client!nh", name = "mc", descriptor = "I")
    public int field4573 = 0;

    @OriginalMember(owner = "client!nh", name = "Qc", descriptor = "B")
    private byte field4603 = 0;

    @OriginalMember(owner = "client!nh", name = "Gc", descriptor = "I")
    public static int field4593 = 2301979;

    @OriginalMember(owner = "client!nh", name = "vc", descriptor = "[I")
    public static int[] field4582 = new int[128];

    @OriginalMember(owner = "client!nh", name = "Nc", descriptor = "J")
    public static long field4600 = 0L;

    @OriginalMember(owner = "client!nh", name = "Rc", descriptor = "[I")
    public static int[] field4604 = new int[5];

    @OriginalMember(owner = "client!nh", name = "oc", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!nh", name = "qc", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!nh", name = "rc", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!nh", name = "sc", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!nh", name = "tc", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!nh", name = "zc", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!nh", name = "Cc", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!nh", name = "Ec", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!nh", name = "Ic", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!nh", name = "Mc", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!nh", name = "Pc", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!nh", name = "Fc", descriptor = "Lwg;")
    public class23 field4592;

    @OriginalMember(owner = "client!nh", name = "Oc", descriptor = "Ljava/lang/String;")
    public String field4601;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIJILgh;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class32 arg10) {
        ++field4579;
        if (this.field4592 != null) {
            class167 var13 = super.field1384 != -1 && ~super.field1393 == -1 ? class105.method714(super.field1384, (byte) 72) : null;
            class167 var14 = ~super.field1421 == 0 || this.field4594 || super.field1421 == this.method533(-1).field531 && var13 != null ? null : class105.method714(super.field1421, (byte) 93);
            class279 var15 = this.field4592.method151(super.field1400, var14, super.field1465, super.field1387, 124, var13, true, super.field1420, super.field1477, super.field1474, super.field1411);
            int var16 = class171.method1151((byte) -89);
            if (~class149.field2511 != -1 && ~var16 > -51) {
                int var17 = -var16 + 50;
                while (~var17 < ~class196.field3186) {
                    class21.field335[class196.field3186] = new byte[102400];
                    ++class196.field3186;
                }
                while (~class196.field3186 < ~var17) {
                    --class196.field3186;
                    class21.field335[class196.field3186] = null;
                }
            }
            if (var15 != null) {
                super.field1395 = var15.method110();
                if (class188.field3051 && (this.field4592.field357 == -1 || class12.method73((byte) 57, this.field4592.field357).field3538)) {
                    class279 var18 = class229.method1540(arg0, var15, super.field1458, super.field1397, 50, var14 != null ? var14 : var13, super.field1391, 0, 1, super.field1432, 0, 240, 160, var14 == null ? super.field1465 : super.field1474);
                    var18.method120(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class32) null);
                }
                if (class273.field4378 == this) {
                    for (int var19 = class26.field398.length - 1; var19 >= 0; --var19) {
                        class280 var20 = class26.field398[var19];
                        if (var20 != null && ~var20.field4455 != 0) {
                            if (var20.field4460 == 1 && ~var20.field4454 <= -1 && class42.field625.length > var20.field4454) {
                                class141 var21 = class42.field625[var20.field4454];
                                if (var21 != null) {
                                    int var22 = var21.field1397 / 32 + -(class273.field4378.field1397 / 32);
                                    int var23 = var21.field1458 / 32 - class273.field4378.field1458 / 32;
                                    this.method1950(var23, arg6, arg9, -568, arg0, var20.field4455, 360000, arg5, arg7, var22, arg2, arg3, arg4, (class32) null, var15, arg1);
                                }
                            }
                            if (var20.field4460 == 2) {
                                int var24 = (var20.field4451 - class126.field2206) * 4 + -(class273.field4378.field1397 / 32) + 2;
                                int var25 = (-class255.field4162 + var20.field4453) * 4 + 2 - class273.field4378.field1458 / 32;
                                int var26 = var20.field4452 * 4;
                                int var27 = var26 * var26;
                                this.method1950(var25, arg6, arg9, -568, arg0, var20.field4455, var27, arg5, arg7, var24, arg2, arg3, arg4, (class32) null, var15, arg1);
                            }
                            if (var20.field4460 == 10 && ~var20.field4454 <= -1 && var20.field4454 < class105.field1874.length) {
                                class288 var28 = class105.field1874[var20.field4454];
                                if (var28 != null) {
                                    int var29 = var28.field1397 / 32 + -(class273.field4378.field1397 / 32);
                                    int var30 = var28.field1458 / 32 + -(class273.field4378.field1458 / 32);
                                    this.method1950(var30, arg6, arg9, -568, arg0, var20.field4455, 360000, arg5, arg7, var29, arg2, arg3, arg4, (class32) null, var15, arg1);
                                }
                            }
                        }
                    }
                }
                this.method531(var15, (byte) -97);
                this.method532(752, arg0, var15);
                class279 var31 = null;
                if (!this.field4594 && super.field1396 != -1 && super.field1482 != -1) {
                    class121 var32 = class189.method1243(65536, super.field1396);
                    var31 = var32.method830(1, super.field1390, super.field1482, super.field1463);
                    if (var31 != null) {
                        var31.method126(0, -super.field1386, 0);
                        if (var32.field2140) {
                            if (class179.field2953 != 0) {
                                var31.method128(class179.field2953);
                            }
                            if (class294.field4682 != 0) {
                                var31.method118(class294.field4682);
                            }
                            if (~class139.field2398 != -1) {
                                var31.method126(0, class139.field2398, 0);
                            }
                        }
                    }
                }
                class279 var33 = null;
                if (!this.field4594 && super.field1442 != null) {
                    if (super.field1436 <= class266.field4301) {
                        super.field1442 = null;
                    }
                    if (~class266.field4301 <= ~super.field1410 && ~super.field1436 < ~class266.field4301) {
                        if (super.field1442 instanceof class35) {
                            var33 = (class279) ((class35) super.field1442).method233(true);
                        } else {
                            var33 = (class279) super.field1442;
                        }
                        var33.method126(-super.field1397 + super.field1467, super.field1398 - super.field1391, super.field1415 - super.field1458);
                        if (super.field1389 == 512) {
                            var33.method130();
                        } else if (super.field1389 != 1024) {
                            if (super.field1389 == 1536) {
                                var33.method133();
                            }
                        } else {
                            var33.method117();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class18) var15).method97(var31);
                }
                if (var33 != null) {
                    var15 = ((class18) var15).method97(var33);
                }
                var15.field4448 = true;
                var15.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field1457);
                if (var33 != null) {
                    if (~super.field1389 != -513) {
                        if (~super.field1389 != -1025) {
                            if (~super.field1389 == -1537) {
                                var33.method130();
                            }
                        } else {
                            var33.method117();
                        }
                    } else {
                        var33.method133();
                    }
                    var33.method126(super.field1397 - super.field1467, -super.field1398 + super.field1391, -super.field1415 + super.field1458);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4589;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZII)V")
    public final void method1949(int arg0, boolean arg1, int arg2, int arg3) {
        super.method524(this.method528(arg3 + -62), arg0, arg1, arg2, 98);
        ++field4578;
        if (arg3 != 32) {
            this.field4587 = -38;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)I")
    public final int method521(byte arg0) {
        ++field4595;
        if (arg0 != 25) {
            field4600 = 101L;
        }
        return super.field1471;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIIIIIILgh;Lba;I)V")
    private final void method1950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class32 arg13, class279 arg14, int arg15) {
        int var17 = arg0 * arg0 + arg9 * arg9;
        ++field4575;
        if (~var17 <= -17 && arg6 >= var17) {
            int var18 = 2047 & (int) (325.949D * Math.atan2((double) arg9, (double) arg0));
            class279 var19 = class158.method1084(super.field1391, super.field1397, true, var18, arg14, arg5, super.field1458);
            if (var19 != null) {
                var19.method120(0, arg15, arg10, arg11, arg12, arg7, arg1, arg8, -1L, arg2, arg13);
            }
            if (arg3 != -568) {
                this.field4583 = -81;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4602;
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)Z")
    public final boolean method536(int arg0) {
        ++field4591;
        if (arg0 <= 122) {
            return false;
        } else {
            return this.field4592 != null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)Ljava/lang/String;")
    public final String method1951(byte arg0) {
        ++field4599;
        if (arg0 != -81) {
            this.method120(-86, -57, -1, -33, -10, 111, 110, -83, 105L, 74, (class32) null);
        }
        String var2 = this.field4601;
        if (class210.field3555 != null) {
            var2 = class210.field3555[this.field4603] + var2;
        }
        if (class234.field3885 != null) {
            var2 = var2 + class234.field3885[this.field4603];
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
    public static void method1952(int arg0) {
        if (arg0 != -13) {
            field4593 = -6;
        }
        field4582 = null;
        field4604 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()I")
    public final int method110() {
        ++field4580;
        return super.field1395;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIIII)Z")
    public static final boolean method1953(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class264.field4290 * arg3 + class183.field2977 * arg0 >> 16;
        int var6 = class183.field2977 * arg3 - class264.field4290 * arg0 >> 16;
        int var7 = class98.field1692 * var6 + class84.field1526 * arg1 >> 16;
        int var8 = class98.field1692 * arg1 - class84.field1526 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class98.field1692 * var6 + class84.field1526 * arg2 >> 16;
        int var12 = class98.field1692 * arg2 - class84.field1526 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class215.field3628 && var13 < class215.field3628) {
            return false;
        } else if (var9 > class109.field1960 && var13 > class109.field1960) {
            return false;
        } else if (var10 < class177.field2914 && var14 < class177.field2914) {
            return false;
        } else {
            return var10 <= class296.field4703 || var14 <= class296.field4703;
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)I")
    public final int method528(int arg0) {
        ++field4586;
        int var2 = -116 % ((arg0 - 74) / 43);
        return this.field4592 != null && this.field4592.field357 != -1 ? class12.method73((byte) 57, this.field4592.field357).field3537 : super.method528(120);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLeh;)V")
    public final void method1954(byte arg0, class101 arg1) {
        ++field4577;
        arg1.field1762 = 0;
        int var3 = -1;
        int var4 = arg1.method669((byte) 36);
        int[] var5 = new int[12];
        int var6 = 1 & var4;
        int var7 = super.method528(4);
        boolean var8 = ~(var4 & 4) != -1;
        this.method529((byte) 114, ((var4 & 58) >> 3) + 1);
        this.field4603 = (byte) ((var4 & 214) >> 6);
        super.field1397 += 64 * (this.method528(126) + -var7);
        super.field1458 += (-var7 + this.method528(-75)) * 64;
        this.field4590 = arg1.method646(122);
        this.field4584 = arg1.method646(-112);
        this.field4573 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg1.method669((byte) 36);
            if (var10 == 0) {
                var5[var9] = 0;
            } else {
                int var11 = arg1.method669((byte) 36);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var3 = arg1.method677(false);
                    this.field4573 = arg1.method669((byte) 36);
                    break;
                }
                if (~var12 <= -32769) {
                    int var25 = class65.field1101[var12 + -32768];
                    var5[var9] = class112.method789(var25, 1073741824);
                    int var26 = class203.method1346(-1, var25).field3285;
                    if (~var26 != -1) {
                        this.field4573 = var26;
                    }
                } else {
                    var5[var9] = class112.method789(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        if (arg0 >= -27) {
            this.finalize();
        }
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var24 = arg1.method669((byte) 36);
            if (~var24 > -1 || var24 >= class228.field3845[var14].length) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field1471 = arg1.method677(false);
        long var15 = arg1.method694(false);
        this.field4601 = class21.method146(var15, (byte) -93);
        this.field4598 = arg1.method669((byte) 36);
        if (!var8) {
            this.field4574 = 0;
            this.field4581 = arg1.method669((byte) 36);
            this.field4585 = arg1.method669((byte) 36);
            if (this.field4585 == 255) {
                this.field4585 = -1;
            }
        } else {
            this.field4574 = arg1.method677(false);
            this.field4581 = this.field4598;
            this.field4585 = -1;
        }
        int var17 = this.field4596;
        this.field4596 = arg1.method669((byte) 36);
        if (this.field4596 == 0) {
            class125.method856(1, this);
        } else {
            int var18 = this.field4583;
            int var19 = this.field4576;
            int var20 = this.field4588;
            int var21 = this.field4587;
            int var22 = this.field4597;
            this.field4583 = arg1.method677(false);
            this.field4576 = arg1.method677(false);
            this.field4597 = arg1.method677(false);
            this.field4587 = arg1.method677(false);
            this.field4588 = arg1.method669((byte) 36);
            if (this.field4596 != var17 || ~this.field4583 != ~var18 || this.field4576 != var19 || this.field4597 != var22 || this.field4587 != var21 || this.field4588 != var20) {
                class167.method1117(this, (byte) -127);
            }
        }
        if (this.field4592 == null) {
            this.field4592 = new class23();
        }
        int var23 = this.field4592.field357;
        this.field4592.method161(var13, super.field1471, (byte) 124, ~var6 == -2, var5, var3);
        if (~var3 != ~var23) {
            super.field1397 = super.field1464[0] * 128 - -(this.method528(-33) * 64);
            super.field1458 = super.field1486[0] * 128 - -(this.method528(125) * 64);
        }
        if (super.field1457 != null) {
            super.field1457.method215();
        }
    }
}
