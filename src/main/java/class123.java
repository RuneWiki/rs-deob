import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class123 extends class190 {

    @OriginalMember(owner = "client!ld", name = "ic", descriptor = "Z")
    public boolean field2182 = false;

    @OriginalMember(owner = "client!ld", name = "jc", descriptor = "S")
    private short field2183 = 0;

    @OriginalMember(owner = "client!ld", name = "qc", descriptor = "S")
    private short field2190 = 0;

    @OriginalMember(owner = "client!ld", name = "ec", descriptor = "I")
    public int field2178 = 0;

    @OriginalMember(owner = "client!ld", name = "zc", descriptor = "I")
    public int field2199 = -1;

    @OriginalMember(owner = "client!ld", name = "wc", descriptor = "I")
    public int field2196 = 0;

    @OriginalMember(owner = "client!ld", name = "kc", descriptor = "I")
    public int field2184 = 0;

    @OriginalMember(owner = "client!ld", name = "sc", descriptor = "I")
    public int field2192 = -1;

    @OriginalMember(owner = "client!ld", name = "hc", descriptor = "I")
    public int field2181 = 0;

    @OriginalMember(owner = "client!ld", name = "Jc", descriptor = "I")
    public int field2209 = 0;

    @OriginalMember(owner = "client!ld", name = "vc", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2195 = new CRC32();

    @OriginalMember(owner = "client!ld", name = "Cc", descriptor = "Ldc;")
    public static class37 field2202 = class185.method1233((byte) 86, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!ld", name = "Ic", descriptor = "I")
    public static int field2208 = 0;

    @OriginalMember(owner = "client!ld", name = "Ec", descriptor = "Ldc;")
    public static class37 field2204 = class185.method1233((byte) 86, "<)4col>");

    @OriginalMember(owner = "client!ld", name = "Lc", descriptor = "I")
    public static int field2211 = 0;

    @OriginalMember(owner = "client!ld", name = "dc", descriptor = "I")
    public int field2177;

    @OriginalMember(owner = "client!ld", name = "fc", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ld", name = "gc", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ld", name = "lc", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!ld", name = "mc", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ld", name = "oc", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!ld", name = "pc", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!ld", name = "tc", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!ld", name = "uc", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!ld", name = "xc", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ld", name = "yc", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ld", name = "Bc", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!ld", name = "Dc", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ld", name = "Fc", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ld", name = "Gc", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ld", name = "rc", descriptor = "Lkg;")
    public class115 field2191;

    @OriginalMember(owner = "client!ld", name = "Ac", descriptor = "La;")
    public class1 field2200;

    @OriginalMember(owner = "client!ld", name = "nc", descriptor = "Ldc;")
    public class37 field2187;

    @OriginalMember(owner = "client!ld", name = "Hc", descriptor = "Ldj;")
    public static class44 field2207;

    @OriginalMember(owner = "client!ld", name = "Kc", descriptor = "[I")
    public static int[] field2210;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Z")
    public final boolean method482(byte arg0) {
        ++field2198;
        if (arg0 != -108) {
            method836(94);
        }
        return this.field2191 != null;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)Lsd;")
    public static final class200 method836(int arg0) {
        ++field2197;
        if (class104.field1801 == null) {
            class104.field1801 = new class200();
        }
        if (arg0 != -1) {
            field2204 = null;
        }
        return class104.field1801;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Lnb;")
    public static final class143 method837(int arg0) {
        ++field2205;
        if (arg0 != 0) {
            return null;
        } else {
            try {
                return (class143) Class.forName("eb").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILce;)V")
    public final void method838(int arg0, class28 arg1) {
        ++field2203;
        arg1.field526 = 0;
        int var3 = arg1.method215(-1797813752);
        int var4 = var3 & 1;
        if (~(var3 & 2) == -3) {
            this.field2190 = (short) (arg1.method215(-1797813752) << 2);
            this.field2183 = (short) (arg1.method215(-1797813752) << 2);
        } else {
            this.field2190 = 0;
            this.field2183 = 0;
        }
        boolean var5 = (4 & var3) != 0;
        super.field3499 = (var3 >> 3) + 1;
        this.field2199 = arg1.method206(-16933672);
        this.field2192 = arg1.method206(-16933672);
        int[] var6 = new int[arg0];
        int var7 = -1;
        this.field2196 = 0;
        for (int var8 = 0; var8 < 12; ++var8) {
            int var9 = arg1.method215(arg0 + -1797813764);
            if (var9 == 0) {
                var6[var8] = 0;
            } else {
                int var10 = arg1.method215(-1797813752);
                int var11 = (var9 << 8) + var10;
                if (var8 == 0 && var11 == 65535) {
                    var7 = arg1.method230((byte) -123);
                    break;
                }
                if (var11 >= 32768) {
                    int var15 = class235.field4280[var11 - 32768];
                    var6[var8] = class138.method960(var15, 1073741824);
                    int var16 = class223.method1471(-73, var15).field2273;
                    if (~var16 != -1) {
                        this.field2196 = var16;
                    }
                } else {
                    var6[var8] = class138.method960(Integer.MIN_VALUE, var11 + -256);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; ~var13 > -6; ++var13) {
            int var14 = arg1.method215(-1797813752);
            if (~var14 > -1 || ~class101.field1752[var13].length >= ~var14) {
                var14 = 0;
            }
            var12[var13] = var14;
        }
        super.field3466 = arg1.method230((byte) -107);
        if (super.field3466 == 65535) {
            super.field3466 = -1;
        }
        super.field3484 = arg1.method230((byte) -102);
        if (super.field3484 == 65535) {
            super.field3484 = -1;
        }
        super.field3522 = super.field3484;
        super.field3472 = arg1.method230((byte) -119);
        if (~super.field3472 == -65536) {
            super.field3472 = -1;
        }
        super.field3486 = arg1.method230((byte) -119);
        if (super.field3486 == 65535) {
            super.field3486 = -1;
        }
        super.field3531 = arg1.method230((byte) -100);
        if (super.field3531 == 65535) {
            super.field3531 = -1;
        }
        super.field3509 = arg1.method230((byte) -125);
        if (super.field3509 == 65535) {
            super.field3509 = -1;
        }
        super.field3504 = arg1.method230((byte) -103);
        if (super.field3504 == 65535) {
            super.field3504 = -1;
        }
        this.field2187 = class184.method1228(arg0 + -13, arg1.method222(-98)).method317((byte) 59);
        this.field2181 = arg1.method215(arg0 ^ -1797813756);
        if (var5) {
            this.field2184 = arg1.method230((byte) -110);
        } else {
            this.field2184 = 0;
        }
        if (this.field2191 == null) {
            this.field2191 = new class115();
        }
        this.field2191.method806(var4 == 1, -13, var12, var7, var6);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2179;
        if (this.field2191 != null) {
            class208 var11 = ~super.field3524 != 0 && super.field3537 == 0 ? class16.method113(super.field3524, (byte) 72) : null;
            class208 var12 = super.field3465 == -1 || this.field2182 || ~super.field3466 == ~super.field3465 && var11 != null ? null : class16.method113(super.field3465, (byte) 87);
            class1 var13 = this.field2191.method808(super.field3540, super.field3473, (byte) -52, var12, var11);
            if (var13 != null) {
                super.field3516 = var13.method5();
                if (class238.field4382 == this) {
                    for (int var14 = class246.field4504.length - 1; var14 >= 0; --var14) {
                        class25 var15 = class246.field4504[var14];
                        if (var15 != null && var15.field439 != -1) {
                            if (var15.field429 == 1 && var15.field435 >= 0 && ~class70.field1262.length < ~var15.field435) {
                                class66 var16 = class70.field1262[var15.field435];
                                if (var16 != null) {
                                    int var17 = var16.field3505 / 32 + -(class238.field4382.field3505 / 32);
                                    int var18 = var16.field3490 / 32 + -(class238.field4382.field3490 / 32);
                                    this.method841(-1, arg5, var17, arg3, arg6, var15.field439, var13, arg1, arg0, var18, arg4, arg2, arg7);
                                }
                            }
                            if (var15.field429 == 2) {
                                int var19 = (-class99.field1735 + var15.field437) * 4 - (class238.field4382.field3505 / 32 + -2);
                                int var20 = (var15.field438 - class124.field2212) * 4 + -(class238.field4382.field3490 / 32) - -2;
                                this.method841(-1, arg5, var19, arg3, arg6, var15.field439, var13, arg1, arg0, var20, arg4, arg2, arg7);
                            }
                            if (var15.field429 == 10 && var15.field435 >= 0 && var15.field435 < class8.field107.length) {
                                class123 var21 = class8.field107[var15.field435];
                                if (var21 != null) {
                                    int var22 = var21.field3490 / 32 - class238.field4382.field3490 / 32;
                                    int var23 = var21.field3505 / 32 + -(class238.field4382.field3505 / 32);
                                    this.method841(-1, arg5, var23, arg3, arg6, var15.field439, var13, arg1, arg0, var22, arg4, arg2, arg7);
                                }
                            }
                        }
                    }
                }
                int var24 = 0;
                int var25 = 0;
                int var26 = 0;
                if (this.field2190 != 0 && this.field2183 != 0) {
                    int var27 = class169.field3211[arg0];
                    int var28 = class169.field3220[arg0];
                    short var29 = this.field2183;
                    int var30 = -var29 / 2;
                    short var31 = this.field2190;
                    int var32 = -var31 / 2;
                    int var33 = -var29 / 2;
                    int var34 = var28 * var30 + -(var27 * var32) >> 16;
                    int var35 = var27 * var30 + var28 * var32 >> 16;
                    int var36 = var31 / 2;
                    int var37 = var27 * var33 + var28 * var36 >> 16;
                    int var38 = -var31 / 2;
                    int var39 = class145.method1008(class125.field2246, super.field3505 + var35, super.field3490 + var34, (byte) 103);
                    int var40 = var28 * var33 + -(var27 * var36) >> 16;
                    int var41 = class145.method1008(class125.field2246, super.field3505 - -var37, super.field3490 + var40, (byte) -94);
                    int var42 = var29 / 2;
                    int var43 = var27 * var42 + var28 * var38 >> 16;
                    int var44 = var28 * var42 + -(var27 * var38) >> 16;
                    int var45 = class145.method1008(class125.field2246, super.field3505 + var43, super.field3490 + var44, (byte) 126);
                    int var46 = var29 / 2;
                    int var47 = var31 / 2;
                    int var48 = var27 * var46 + var28 * var47 >> 16;
                    int var49 = var28 * var46 + -(var27 * var47) >> 16;
                    int var50 = ~var39 <= ~var41 ? var41 : var39;
                    int var51 = class145.method1008(class125.field2246, super.field3505 - -var48, super.field3490 + var49, (byte) 123);
                    int var52 = var39 + var51;
                    int var53 = ~var41 <= ~var51 ? var51 : var41;
                    int var54 = var45 <= var39 ? var45 : var39;
                    if (var52 > var41 - -var45) {
                        var52 = var41 + var45;
                    }
                    int var55 = var51 <= var45 ? var51 : var45;
                    var24 = (int) (Math.atan2((double) (-var55 + var50), (double) var29) * 325.95D) & 2047;
                    if (~var24 != -1) {
                        var13.method21(var24);
                    }
                    var25 = (int) (325.95D * Math.atan2((double) (-var53 + var54), (double) var31)) & 2047;
                    if (~var25 != -1) {
                        var13.method9(var25);
                    }
                    var26 = (var52 >> 1) + -super.field3487;
                    if (~var26 != -1) {
                        var13.method14(0, var26, 0);
                    }
                }
                class1 var56 = null;
                if (!this.field2182 && super.field3541 != -1 && super.field3526 != -1) {
                    class191 var57 = class207.method1370(super.field3541, (byte) -124);
                    var56 = var57.method1271(super.field3526, (byte) 95);
                    if (var56 != null) {
                        var56.method14(0, -super.field3478, 0);
                        if (var57.field3554) {
                            if (var24 != 0) {
                                var56.method21(var24);
                            }
                            if (var25 != 0) {
                                var56.method9(var25);
                            }
                            if (var26 != 0) {
                                var56.method14(0, var26, 0);
                            }
                        }
                    }
                }
                class1 var58 = null;
                if (!this.field2182 && this.field2200 != null) {
                    if (class203.field3758 >= this.field2209) {
                        this.field2200 = null;
                    }
                    if (~class203.field3758 <= ~this.field2178 && ~this.field2209 < ~class203.field3758) {
                        var58 = this.field2200;
                        var58.method14(-super.field3505 + this.field2193, -super.field3487 + this.field2201, this.field2177 - super.field3490);
                        if (~super.field3513 != -513) {
                            if (super.field3513 != 1024) {
                                if (super.field3513 == 1536) {
                                    var58.method10();
                                }
                            } else {
                                var58.method7();
                            }
                        } else {
                            var58.method8();
                        }
                    }
                }
                if (var56 != null) {
                    var13 = ((class42) var13).method368(var56);
                }
                if (var58 != null) {
                    var13 = ((class42) var13).method368(var58);
                }
                var13.field1 = true;
                var13.method19(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var58 != null) {
                    if (super.field3513 == 512) {
                        var58.method10();
                    } else if (super.field3513 != 1024) {
                        if (~super.field3513 == -1537) {
                            var58.method8();
                        }
                    } else {
                        var58.method7();
                    }
                    var58.method14(-this.field2193 + super.field3505, -this.field2201 + super.field3487, -this.field2177 + super.field3490);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
    public static void method839(int arg0) {
        field2195 = null;
        field2202 = null;
        field2204 = null;
        if (arg0 != -1803925744) {
            field2204 = null;
        }
        field2210 = null;
        field2207 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()I")
    public final int method5() {
        ++field2186;
        return super.field3516;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILci;Ldj;)V")
    public static final void method840(int arg0, int arg1, class32 arg2, class44 arg3) {
        ++field2206;
        if (arg0 < 58) {
            field2195 = null;
        }
        class83 var4 = new class83();
        var4.field1066 = (long) arg1;
        var4.field1473 = 1;
        var4.field1464 = arg3;
        var4.field1465 = arg2;
        class203 var5 = class160.field3015;
        synchronized (class160.field3015) {
            class160.field3015.method1340(90, var4);
        }
        class231.method1494((byte) -61);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIILa;IIIIII)V")
    private final void method841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class1 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field2180;
        int var14 = arg2 * arg2 + arg9 * arg9;
        if (~var14 <= -17 && var14 <= 360000) {
            int var15 = 2047 & (int) (Math.atan2((double) arg2, (double) arg9) * 325.949D);
            class1 var16 = class88.method591(arg6, super.field3505, super.field3490, var15, -630, arg5, super.field3487);
            if (var16 != null) {
                var16.method19(0, arg7, arg11, arg3, arg10, arg1, arg4, arg12, -1L);
            }
            if (arg0 != -1) {
                this.field2190 = 42;
            }
        }
    }
}
