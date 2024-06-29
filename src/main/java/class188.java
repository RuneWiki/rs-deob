import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class188 extends class109 {

    @OriginalMember(owner = "client!pi", name = "Nb", descriptor = "I")
    public int field3206 = 0;

    @OriginalMember(owner = "client!pi", name = "Mb", descriptor = "I")
    public int field3205 = 0;

    @OriginalMember(owner = "client!pi", name = "bc", descriptor = "S")
    private short field3220 = 0;

    @OriginalMember(owner = "client!pi", name = "cc", descriptor = "I")
    private int field3221 = 0;

    @OriginalMember(owner = "client!pi", name = "Ub", descriptor = "Z")
    public boolean field3213 = false;

    @OriginalMember(owner = "client!pi", name = "jc", descriptor = "I")
    public int field3228 = -1;

    @OriginalMember(owner = "client!pi", name = "Wb", descriptor = "I")
    public int field3215 = 0;

    @OriginalMember(owner = "client!pi", name = "gc", descriptor = "I")
    public int field3225 = 0;

    @OriginalMember(owner = "client!pi", name = "fc", descriptor = "I")
    public int field3224 = -1;

    @OriginalMember(owner = "client!pi", name = "Xb", descriptor = "I")
    public int field3216 = 0;

    @OriginalMember(owner = "client!pi", name = "nc", descriptor = "I")
    public int field3232 = -1;

    @OriginalMember(owner = "client!pi", name = "oc", descriptor = "I")
    public int field3233 = 0;

    @OriginalMember(owner = "client!pi", name = "Jb", descriptor = "I")
    public int field3202 = -1;

    @OriginalMember(owner = "client!pi", name = "sc", descriptor = "S")
    private short field3237 = 0;

    @OriginalMember(owner = "client!pi", name = "dc", descriptor = "I")
    public int field3222 = -1;

    @OriginalMember(owner = "client!pi", name = "wc", descriptor = "I")
    public int field3241 = 0;

    @OriginalMember(owner = "client!pi", name = "mc", descriptor = "I")
    public int field3231 = -1;

    @OriginalMember(owner = "client!pi", name = "Ob", descriptor = "Leg;")
    public static class37 field3207 = class174.method1167("m", 88);

    @OriginalMember(owner = "client!pi", name = "ec", descriptor = "Leg;")
    public static class37 field3223 = class174.method1167("D-Bmarrage de la librairie 3D", 113);

    @OriginalMember(owner = "client!pi", name = "pc", descriptor = "Z")
    public static boolean field3234 = false;

    @OriginalMember(owner = "client!pi", name = "lc", descriptor = "Leg;")
    public static class37 field3230 = class174.method1167("Chargement de l(W-Bcran)2titre )2 ", -48);

    @OriginalMember(owner = "client!pi", name = "Kb", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!pi", name = "Lb", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!pi", name = "Pb", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!pi", name = "Qb", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!pi", name = "Rb", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!pi", name = "Sb", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!pi", name = "Tb", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!pi", name = "Vb", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!pi", name = "Zb", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!pi", name = "ac", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!pi", name = "hc", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!pi", name = "ic", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!pi", name = "kc", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!pi", name = "rc", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!pi", name = "tc", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!pi", name = "uc", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!pi", name = "vc", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!pi", name = "yc", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!pi", name = "xc", descriptor = "Lbl;")
    public class253 field3242;

    @OriginalMember(owner = "client!pi", name = "Yb", descriptor = "Lql;")
    public class285 field3217;

    @OriginalMember(owner = "client!pi", name = "qc", descriptor = "Leg;")
    public class37 field3235;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)Z")
    public final boolean method767(boolean arg0) {
        ++field3226;
        if (arg0) {
            this.field3214 = -46;
        }
        return this.field3217 != null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3203;
        if (!super.field1833) {
            if (this.field3217 == null) {
                return;
            }
            class2 var6 = super.field1800 != -1 && ~super.field1785 == -1 ? class186.method1242(0, super.field1800) : null;
            class2 var7 = ~super.field1789 == 0 || this.field3213 || ~super.field1789 == ~super.field1767 && var6 != null ? null : class186.method1242(0, super.field1789);
            class253 var8 = this.field3217.method1915(12, super.field1771, super.field1792, false, var6, var7);
            if (var8 == null) {
                return;
            }
            this.method765(var8, 10114);
        }
        if (super.field1826 != null) {
            super.field1826.method1332(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIJILdk;)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class193 arg10) {
        ++field3243;
        if (this.field3217 != null) {
            class2 var13 = ~super.field1800 != 0 && super.field1785 == 0 ? class186.method1242(0, super.field1800) : null;
            class2 var14 = super.field1789 == -1 || this.field3213 || super.field1789 == super.field1767 && var13 != null ? null : class186.method1242(0, super.field1789);
            class253 var15 = this.field3217.method1915(12, super.field1771, super.field1792, true, var13, var14);
            int var16 = class69.method479((byte) -67);
            if (class44.field691 != 0 && ~var16 > -51) {
                int var17 = -var16 + 50;
                while (class215.field3721 < var17) {
                    class9.field157[class215.field3721] = new byte[102400];
                    ++class215.field3721;
                }
                while (~class215.field3721 < ~var17) {
                    --class215.field3721;
                    class9.field157[class215.field3721] = null;
                }
            }
            if (var15 != null) {
                super.field1762 = var15.method308();
                if (class232.field4013 && (this.field3217.field5027 == -1 || class148.method1022(this.field3217.field5027, (byte) -116).field4856)) {
                    class253 var18 = class167.method1122(240, var15, var14 == null ? var13 : var14, false, 0, super.field1799, var14 != null ? super.field1792 : super.field1771, super.field1793, 160, arg0, 1, 0, super.field1820, super.field1822);
                    var18.method313(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class193) null);
                }
                if (class82.field1285 == this) {
                    for (int var19 = class61.field1001.length - 1; var19 >= 0; --var19) {
                        class134 var20 = class61.field1001[var19];
                        if (var20 != null && ~var20.field2326 != 0) {
                            if (var20.field2331 == 1 && ~var20.field2335 <= -1 && ~var20.field2335 > ~class55.field833.length) {
                                class163 var21 = class55.field833[var20.field2335];
                                if (var21 != null) {
                                    int var22 = var21.field1799 / 32 + -(class82.field1285.field1799 / 32);
                                    int var23 = var21.field1793 / 32 + -(class82.field1285.field1793 / 32);
                                    this.method1307(arg3, arg2, arg6, arg7, arg4, var15, 0, arg9, var20.field2326, arg5, var22, var23, (class193) null, arg1, arg0);
                                }
                            }
                            if (~var20.field2331 == -3) {
                                int var24 = (-class144.field2456 + var20.field2324) * 4 + 2 - class82.field1285.field1793 / 32;
                                int var25 = (-class40.field642 + var20.field2330) * 4 + 2 + -(class82.field1285.field1799 / 32);
                                this.method1307(arg3, arg2, arg6, arg7, arg4, var15, 0, arg9, var20.field2326, arg5, var25, var24, (class193) null, arg1, arg0);
                            }
                            if (~var20.field2331 == -11 && var20.field2335 >= 0 && ~var20.field2335 > ~class98.field1526.length) {
                                class188 var26 = class98.field1526[var20.field2335];
                                if (var26 != null) {
                                    int var27 = var26.field1799 / 32 - class82.field1285.field1799 / 32;
                                    int var28 = var26.field1793 / 32 + -(class82.field1285.field1793 / 32);
                                    this.method1307(arg3, arg2, arg6, arg7, arg4, var15, 0, arg9, var20.field2326, arg5, var27, var28, (class193) null, arg1, arg0);
                                }
                            }
                        }
                    }
                }
                int var29 = 0;
                int var30 = 0;
                int var31 = 0;
                if (~this.field3237 != -1 && ~this.field3220 != -1) {
                    int var32 = class76.field1192[arg0];
                    int var33 = class76.field1189[arg0];
                    short var34 = this.field3237;
                    short var35 = this.field3220;
                    int var36 = -var34 / 2;
                    int var37 = -var35 / 2;
                    int var38 = var33 * var37 + -(var32 * var36) >> 16;
                    int var39 = var32 * var37 + var33 * var36 >> 16;
                    int var40 = class262.method1768(class237.field4140, super.field1799 + var39, super.field1793 + var38, (byte) -116);
                    int var41 = var34 / 2;
                    int var42 = -var34 / 2;
                    int var43 = var35 / 2;
                    int var44 = var33 * var43 - var32 * var42 >> 16;
                    int var45 = -var35 / 2;
                    int var46 = var32 * var43 - -(var33 * var42) >> 16;
                    int var47 = var33 * var45 + -(var32 * var41) >> 16;
                    int var48 = var32 * var45 - -(var33 * var41) >> 16;
                    int var49 = class262.method1768(class237.field4140, super.field1799 + var48, super.field1793 + var47, (byte) -106);
                    int var50 = class262.method1768(class237.field4140, super.field1799 + var46, super.field1793 + var44, (byte) -113);
                    int var51 = var34 / 2;
                    int var52 = var35 / 2;
                    int var53 = var32 * var52 - -(var33 * var51) >> 16;
                    int var54 = var33 * var52 - var32 * var51 >> 16;
                    int var55 = class262.method1768(class237.field4140, super.field1799 + var53, super.field1793 - -var54, (byte) -103);
                    int var56 = ~var49 > ~var55 ? var49 : var55;
                    int var57 = var49 > var40 ? var40 : var49;
                    int var58 = var40 < var50 ? var40 : var50;
                    int var59 = var50 < var55 ? var50 : var55;
                    int var60 = var40 + var55;
                    var29 = (int) (Math.atan2((double) (-var59 + var57), (double) var35) * 325.95D) & 2047;
                    if (~var29 != -1) {
                        var15.method1467(var29);
                    }
                    var30 = 2047 & (int) (Math.atan2((double) (-var56 + var58), (double) var34) * 325.95D);
                    if (~(var49 + var50) > ~var60) {
                        var60 = var49 + var50;
                    }
                    if (var30 != 0) {
                        var15.method1459(var30);
                    }
                    var31 = (var60 >> 1) - super.field1822;
                    if (var31 != 0) {
                        var15.method1457(0, var31, 0);
                    }
                }
                class253 var61 = null;
                if (!this.field3213 && super.field1814 != -1 && ~super.field1773 != 0) {
                    class231 var62 = class79.method536(-63, super.field1814);
                    var61 = var62.method1593(super.field1773, -28023);
                    if (var61 != null) {
                        var61.method1457(0, -super.field1811, 0);
                        if (var62.field3958) {
                            if (~var29 != -1) {
                                var61.method1467(var29);
                            }
                            if (~var30 != -1) {
                                var61.method1459(var30);
                            }
                            if (var31 != 0) {
                                var61.method1457(0, var31, 0);
                            }
                        }
                    }
                }
                class253 var63 = null;
                if (!this.field3213 && this.field3242 != null) {
                    if (class72.field1146 >= this.field3233) {
                        this.field3242 = null;
                    }
                    if (~this.field3206 >= ~class72.field1146 && ~class72.field1146 > ~this.field3233) {
                        var63 = this.field3242;
                        var63.method1457(-super.field1799 + this.field3208, -super.field1822 + this.field3239, -super.field1793 + this.field3214);
                        if (~super.field1816 != -513) {
                            if (super.field1816 != 1024) {
                                if (~super.field1816 == -1537) {
                                    var63.method1451();
                                }
                            } else {
                                var63.method1446();
                            }
                        } else {
                            var63.method1470();
                        }
                    }
                }
                if (var61 != null) {
                    var15 = ((class209) var15).method1447(var61);
                }
                if (var63 != null) {
                    var15 = ((class209) var15).method1447(var63);
                }
                this.method765(var15, 10114);
                var15.field4511 = true;
                var15.method313(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field1826);
                if (var63 != null) {
                    if (super.field1816 == 512) {
                        var63.method1451();
                    } else if (~super.field1816 != -1025) {
                        if (~super.field1816 == -1537) {
                            var63.method1470();
                        }
                    } else {
                        var63.method1446();
                    }
                    var63.method1457(-this.field3208 + super.field1799, -this.field3239 + super.field1822, -this.field3214 + super.field1793);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)I")
    public final int method763(int arg0) {
        if (arg0 != -1) {
            field3207 = null;
        }
        ++field3209;
        return this.field3217 != null && ~this.field3217.field5027 != 0 ? class148.method1022(this.field3217.field5027, (byte) -116).field4839 : super.method763(-1);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZI)V")
    public final void method1301(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 == 4484) {
            ++field3219;
            super.method766(-1, arg1, arg2, this.method763(-1), arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (super.field1826 != null) {
            super.field1826.method1338();
        }
        ++field3227;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIILme;Lme;IIJ)V")
    public static final void method1302(int arg0, int arg1, int arg2, int arg3, class67 arg4, class67 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class79 var10 = new class79();
            var10.field1222 = arg8;
            var10.field1234 = arg1 * 128 + 64;
            var10.field1224 = arg2 * 128 + 64;
            var10.field1230 = arg3;
            var10.field1221 = arg4;
            var10.field1235 = arg5;
            var10.field1228 = arg6;
            var10.field1219 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class286.field5048[var11][arg1][arg2] == null) {
                    class286.field5048[var11][arg1][arg2] = new class111(var11, arg1, arg2);
                }
            }
            class286.field5048[arg0][arg1][arg2].field1868 = var10;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLva;)V")
    public final void method1303(boolean arg0, class187 arg1) {
        ++field3212;
        arg1.field3169 = 0;
        int var3 = arg1.method1268(255);
        if ((2 & var3) != 2) {
            this.field3220 = 0;
            this.field3237 = 0;
        } else {
            this.field3237 = (short) (arg1.method1268(255) << 2);
            this.field3220 = (short) (arg1.method1268(255) << 2);
        }
        boolean var4 = (4 & var3) != 0;
        int var5 = 1 & var3;
        int var6 = super.method763(-1);
        this.method768(((57 & var3) >> 3) + 1, 24025);
        this.field3221 = 3 & var3 >> 6;
        int var7 = -1;
        int[] var8 = new int[12];
        super.field1799 += 64 * (this.method763(-1) - var6);
        super.field1793 += 64 * (-var6 + this.method763(-1));
        this.field3232 = arg1.method1269(255);
        this.field3222 = arg1.method1269(255);
        this.field3225 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg1.method1268(255);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method1268(255);
                int var12 = (var10 << 8) - -var11;
                if (~var9 == -1 && var12 == 65535) {
                    var7 = arg1.method1244(false);
                    break;
                }
                if (var12 >= 32768) {
                    int var23 = class139.field2371[var12 + -32768];
                    var8[var9] = class94.method617(var23, 1073741824);
                    int var24 = class9.method52(!arg0, var23).field4284;
                    if (~var24 != -1) {
                        this.field3225 = var24;
                    }
                } else {
                    var8[var9] = class94.method617(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var22 = arg1.method1268(255);
            if (~var22 > -1 || var22 >= class172.field2890[var14].length) {
                var22 = 0;
            }
            var13[var14] = var22;
        }
        super.field1767 = arg1.method1244(false);
        if (super.field1767 == 65535) {
            super.field1767 = -1;
        }
        super.field1790 = arg1.method1244(arg0);
        if (~super.field1790 == -65536) {
            super.field1790 = -1;
        }
        super.field1770 = super.field1790;
        super.field1827 = arg1.method1244(arg0);
        if (super.field1827 == 65535) {
            super.field1827 = -1;
        }
        super.field1803 = arg1.method1244(false);
        if (~super.field1803 == -65536) {
            super.field1803 = -1;
        }
        super.field1782 = arg1.method1244(false);
        if (super.field1782 == 65535) {
            super.field1782 = -1;
        }
        super.field1787 = arg1.method1244(false);
        if (~super.field1787 == -65536) {
            super.field1787 = -1;
        }
        super.field1764 = arg1.method1244(false);
        if (super.field1764 == 65535) {
            super.field1764 = -1;
        }
        long var15 = arg1.method1295(71);
        this.field3235 = class35.method201(var15, 2).method227(-98);
        this.field3241 = arg1.method1268(255);
        if (var4) {
            this.field3205 = arg1.method1244(false);
            this.field3216 = this.field3241;
            this.field3228 = -1;
        } else {
            this.field3205 = 0;
            this.field3216 = arg1.method1268(255);
            this.field3228 = arg1.method1268(255);
            if (this.field3228 == 255) {
                this.field3228 = -1;
            }
        }
        int var17 = this.field3215;
        this.field3215 = arg1.method1268(255);
        if (~this.field3215 != -1) {
            int var18 = this.field3224;
            int var19 = this.field3231;
            int var20 = this.field3202;
            this.field3224 = arg1.method1244(false);
            this.field3202 = arg1.method1244(false);
            this.field3231 = arg1.method1244(arg0);
            if (~this.field3215 != ~var17 || ~this.field3224 != ~var18 || this.field3202 != var20 || ~this.field3231 != ~var19) {
                class217.method1528(this, !arg0);
            }
        } else {
            class179.method1187(this, (byte) 112);
        }
        if (this.field3217 == null) {
            this.field3217 = new class285();
        }
        int var21 = this.field3217.field5027;
        this.field3217.method1905(var7, var8, var13, 12, var5 == 1);
        if (~var7 != ~var21) {
            super.field1799 = super.field1812[0] * 128 + 64 * this.method763(-1);
            super.field1793 = super.field1780[0] * 128 - -(this.method763(-1) * 64);
        }
        if (super.field1826 != null) {
            super.field1826.method1335();
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIBI)I")
    public static final int method1304(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -93) {
            return 57;
        } else {
            ++field3204;
            if ((class241.field4312[arg0][arg3][arg1] & 8) != 0) {
                return 0;
            } else {
                return arg0 > 0 && ~(class241.field4312[1][arg3][arg1] & 2) != -1 ? arg0 + -1 : arg0;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()I")
    public final int method308() {
        ++field3210;
        return super.field1762;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
    public static void method1305(int arg0) {
        field3207 = null;
        field3230 = null;
        field3223 = null;
        int var1 = 127 / ((34 - arg0) / 43);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)Leg;")
    public final class37 method1306(byte arg0) {
        ++field3238;
        class37 var2 = this.field3235;
        if (arg0 != 88) {
            this.method1301(126, -37, true, 45);
        }
        if (class19.field255 != null) {
            var2 = class156.method1061((byte) 36, new class37[] { class19.field255[this.field3221], var2 });
        }
        if (class269.field4705 != null) {
            var2 = class156.method1061((byte) 65, new class37[] { var2, class269.field4705[this.field3221] });
        }
        return var2;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIILbl;IIIIIILdk;II)V")
    private final void method1307(int arg0, int arg1, int arg2, int arg3, int arg4, class253 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class193 arg12, int arg13, int arg14) {
        ++field3240;
        int var16 = arg10 * arg10 + arg11 * arg11;
        if (var16 >= 16 && var16 <= 360000) {
            int var17 = (int) (325.949D * Math.atan2((double) arg10, (double) arg11)) & 2047;
            class253 var18 = class49.method321(super.field1822, super.field1799, (byte) 72, var17, arg8, arg5, super.field1793);
            if (arg6 == 0) {
                if (var18 != null) {
                    var18.method313(0, arg13, arg1, arg0, arg4, arg9, arg2, arg3, -1L, arg7, arg12);
                }
            }
        }
    }
}
