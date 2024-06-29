import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class24 extends class124 {

    @OriginalMember(owner = "client!ca", name = "Ob", descriptor = "S")
    private short field400 = 0;

    @OriginalMember(owner = "client!ca", name = "Eb", descriptor = "S")
    private short field390 = 0;

    @OriginalMember(owner = "client!ca", name = "Ub", descriptor = "I")
    public int field406 = 0;

    @OriginalMember(owner = "client!ca", name = "ec", descriptor = "I")
    public int field416 = -1;

    @OriginalMember(owner = "client!ca", name = "ac", descriptor = "I")
    public int field412 = 0;

    @OriginalMember(owner = "client!ca", name = "Yb", descriptor = "Z")
    public boolean field410 = false;

    @OriginalMember(owner = "client!ca", name = "Wb", descriptor = "I")
    public int field408 = 0;

    @OriginalMember(owner = "client!ca", name = "gc", descriptor = "I")
    public int field418 = 0;

    @OriginalMember(owner = "client!ca", name = "Rb", descriptor = "I")
    public int field403 = 0;

    @OriginalMember(owner = "client!ca", name = "ic", descriptor = "I")
    public int field420 = -1;

    @OriginalMember(owner = "client!ca", name = "Lb", descriptor = "I")
    private static int field397 = 0;

    @OriginalMember(owner = "client!ca", name = "Xb", descriptor = "Ldj;")
    public static class44 field409 = class89.method650(255, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ca", name = "Fb", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ca", name = "Gb", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ca", name = "Hb", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "client!ca", name = "Ib", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!ca", name = "Kb", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!ca", name = "Mb", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!ca", name = "Nb", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!ca", name = "Pb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ca", name = "Qb", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!ca", name = "Sb", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!ca", name = "Tb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ca", name = "Zb", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ca", name = "bc", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ca", name = "cc", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!ca", name = "fc", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ca", name = "hc", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ca", name = "dc", descriptor = "Llg;")
    public class127 field415;

    @OriginalMember(owner = "client!ca", name = "Vb", descriptor = "Ldb;")
    public class36 field407;

    @OriginalMember(owner = "client!ca", name = "Jb", descriptor = "Ldj;")
    public class44 field395;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        ++field411;
        if (this.field407 == null) {
            return false;
        } else {
            if (arg0 != 2047) {
                this.method67();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([Ldj;I)[Ldj;")
    public static final class44[] method172(class44[] arg0, int arg1) {
        ++field405;
        class44[] var2 = new class44[arg1];
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = class70.method555(new class44[] { class199.method1287(var3, -1), class19.field320 }, class13.method116(arg1, -8));
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class70.method555(new class44[] { var2[var3], arg0[var3] }, -3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLfj;)V")
    public final void method173(byte arg0, class66 arg1) {
        arg1.field1195 = 0;
        ++field417;
        int var3 = arg1.method506(255);
        boolean var4 = ~(var3 & 4) != -1;
        int var5 = var3 & 1;
        int var6 = -1;
        if ((var3 & 2) == 2) {
            this.field390 = (short) (arg1.method506(255) << 2);
            this.field400 = (short) (arg1.method506(255) << 2);
        } else {
            this.field400 = 0;
            this.field390 = 0;
        }
        super.field2231 = (var3 >> 3) + 1;
        this.field416 = arg1.method505(false);
        this.field420 = arg1.method505(false);
        this.field403 = 0;
        int[] var7 = new int[12];
        int var8 = 12 % ((arg0 - 76) / 49);
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg1.method506(255);
            if (~var10 == -1) {
                var7[var9] = 0;
            } else {
                int var11 = arg1.method506(255);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var6 = arg1.method500(36);
                    break;
                }
                if (var12 >= 32768) {
                    int var16 = class237.field4388[var12 + -32768];
                    var7[var9] = class238.method1545(1073741824, var16);
                    int var17 = class192.method1227(-31700, var16).field3834;
                    if (var17 != 0) {
                        this.field403 = var17;
                    }
                } else {
                    var7[var9] = class238.method1545(Integer.MIN_VALUE, var12 + -256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var15 = arg1.method506(255);
            if (var15 < 0 || ~var15 <= ~class162.field2802[var14].length) {
                var15 = 0;
            }
            var13[var14] = var15;
        }
        super.field2196 = arg1.method500(47);
        if (super.field2196 == 65535) {
            super.field2196 = -1;
        }
        super.field2258 = arg1.method500(97);
        if (~super.field2258 == -65536) {
            super.field2258 = -1;
        }
        super.field2256 = super.field2258;
        super.field2197 = arg1.method500(64);
        if (~super.field2197 == -65536) {
            super.field2197 = -1;
        }
        super.field2242 = arg1.method500(41);
        if (~super.field2242 == -65536) {
            super.field2242 = -1;
        }
        super.field2253 = arg1.method500(57);
        if (~super.field2253 == -65536) {
            super.field2253 = -1;
        }
        super.field2251 = arg1.method500(86);
        if (~super.field2251 == -65536) {
            super.field2251 = -1;
        }
        super.field2257 = arg1.method500(96);
        if (~super.field2257 == -65536) {
            super.field2257 = -1;
        }
        this.field395 = class38.method263((byte) 3, arg1.method491((byte) 28)).method320(false);
        this.field406 = arg1.method506(255);
        if (var4) {
            this.field412 = arg1.method500(55);
        } else {
            this.field412 = 0;
        }
        if (this.field407 == null) {
            this.field407 = new class36();
        }
        this.field407.method244((byte) 127, var7, var13, ~var5 == -2, var6);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field391;
        if (this.field407 != null) {
            class204 var11 = super.field2243 != -1 && ~super.field2222 == -1 ? class94.method672(super.field2243, -95) : null;
            class204 var12 = super.field2264 == -1 || this.field410 || super.field2264 == super.field2196 && var11 != null ? null : class94.method672(super.field2264, 99);
            class127 var13 = this.field407.method246(super.field2252, var12, super.field2249, var11, (byte) -110);
            if (var13 != null) {
                super.field2263 = var13.method67();
                if (class96.field1774 == this) {
                    for (int var14 = class61.field1132.length - 1; var14 >= 0; --var14) {
                        class97 var15 = class61.field1132[var14];
                        if (var15 != null && var15.field1789 != -1) {
                            if (~var15.field1795 == -2 && var15.field1797 >= 0 && ~var15.field1797 > ~class170.field2960.length) {
                                class121 var16 = class170.field2960[var15.field1797];
                                if (var16 != null) {
                                    int var17 = var16.field2260 / 32 + -(class96.field1774.field2260 / 32);
                                    int var18 = var16.field2195 / 32 + -(class96.field1774.field2195 / 32);
                                    this.method178(arg1, var13, var17, arg3, arg5, arg6, arg7, arg2, var15.field1789, arg0, (byte) 32, var18, arg4);
                                }
                            }
                            if (~var15.field1795 == -3) {
                                int var19 = (-class222.field4020 + var15.field1798) * 4 + 2 + -(class96.field1774.field2260 / 32);
                                int var20 = (-class143.field2550 + var15.field1790) * 4 + 2 + -(class96.field1774.field2195 / 32);
                                this.method178(arg1, var13, var19, arg3, arg5, arg6, arg7, arg2, var15.field1789, arg0, (byte) 32, var20, arg4);
                            }
                            if (~var15.field1795 == -11 && ~var15.field1797 <= -1 && ~var15.field1797 > ~class122.field2168.length) {
                                class24 var21 = class122.field2168[var15.field1797];
                                if (var21 != null) {
                                    int var22 = var21.field2260 / 32 + -(class96.field1774.field2260 / 32);
                                    int var23 = var21.field2195 / 32 + -(class96.field1774.field2195 / 32);
                                    this.method178(arg1, var13, var22, arg3, arg5, arg6, arg7, arg2, var15.field1789, arg0, (byte) 32, var23, arg4);
                                }
                            }
                        }
                    }
                }
                int var24 = 0;
                int var25 = 0;
                int var26 = 0;
                if (this.field390 != 0 && ~this.field400 != -1) {
                    int var27 = class206.field3684[arg0];
                    int var28 = class206.field3700[arg0];
                    short var29 = this.field400;
                    short var30 = this.field390;
                    int var31 = -var30 / 2;
                    int var32 = -var29 / 2;
                    int var33 = var27 * var32 - -(var28 * var31) >> 16;
                    int var34 = var28 * var32 + -(var27 * var31) >> 16;
                    int var35 = class40.method278(super.field2195 - -var34, class194.field3403, super.field2260 + var33, (byte) 101);
                    int var36 = var30 / 2;
                    int var37 = -var29 / 2;
                    int var38 = var27 * var37 + var28 * var36 >> 16;
                    int var39 = var28 * var37 + -(var27 * var36) >> 16;
                    int var40 = class40.method278(super.field2195 + var39, class194.field3403, super.field2260 + var38, (byte) 101);
                    int var41 = -var30 / 2;
                    int var42 = var29 / 2;
                    int var43 = var27 * var42 + var28 * var41 >> 16;
                    int var44 = var30 / 2;
                    int var45 = var29 / 2;
                    int var46 = var28 * var42 + -(var27 * var41) >> 16;
                    int var47 = var28 * var45 + -(var27 * var44) >> 16;
                    int var48 = class40.method278(super.field2195 + var46, class194.field3403, super.field2260 - -var43, (byte) 101);
                    int var49 = var27 * var45 + var28 * var44 >> 16;
                    int var50 = class40.method278(super.field2195 + var47, class194.field3403, super.field2260 - -var49, (byte) 101);
                    int var51 = var35 - -var50;
                    if (var40 - -var48 < var51) {
                        var51 = var40 + var48;
                    }
                    int var52 = ~var40 >= ~var35 ? var40 : var35;
                    int var53 = ~var48 > ~var50 ? var48 : var50;
                    var24 = 2047 & (int) (325.95D * Math.atan2((double) (-var53 + var52), (double) var29));
                    if (~var24 != -1) {
                        var13.method43(var24);
                    }
                    int var54 = var50 > var40 ? var40 : var50;
                    int var55 = var48 <= var35 ? var48 : var35;
                    var25 = 2047 & (int) (325.95D * Math.atan2((double) (-var54 + var55), (double) var30));
                    if (var25 != 0) {
                        var13.method54(var25);
                    }
                    var26 = (var51 >> 1) + -super.field2206;
                    if (var26 != 0) {
                        var13.method62(0, var26, 0);
                    }
                }
                class127 var56 = null;
                if (!this.field410 && ~super.field2205 != 0 && super.field2221 != -1) {
                    class13 var57 = class79.method606(super.field2205, -1830);
                    var56 = var57.method117(false, super.field2221);
                    if (var56 != null) {
                        var56.method62(0, -super.field2209, 0);
                        if (var57.field255) {
                            if (~var24 != -1) {
                                var56.method43(var24);
                            }
                            if (var25 != 0) {
                                var56.method54(var25);
                            }
                            if (var26 != 0) {
                                var56.method62(0, var26, 0);
                            }
                        }
                    }
                }
                class127 var58 = null;
                if (!this.field410 && this.field415 != null) {
                    if (class46.field868 >= this.field418) {
                        this.field415 = null;
                    }
                    if (this.field408 <= class46.field868 && class46.field868 < this.field418) {
                        var58 = this.field415;
                        var58.method62(-super.field2260 + this.field399, -super.field2206 + this.field393, -super.field2195 + this.field396);
                        if (super.field2211 == 512) {
                            var58.method45();
                        } else if (super.field2211 == 1024) {
                            var58.method44();
                        } else if (super.field2211 == 1536) {
                            var58.method64();
                        }
                    }
                }
                if (var56 != null) {
                    var13 = ((class6) var13).method57(var56);
                }
                if (var58 != null) {
                    var13 = ((class6) var13).method57(var58);
                }
                var13.field2274 = true;
                var13.method42(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var58 != null) {
                    if (~super.field2211 != -513) {
                        if (super.field2211 == 1024) {
                            var58.method44();
                        } else if (super.field2211 == 1536) {
                            var58.method45();
                        }
                    } else {
                        var58.method64();
                    }
                    var58.method62(-this.field399 + super.field2260, -this.field393 + super.field2206, super.field2195 - this.field396);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(BIII)V")
    public static final void method174(byte arg0, int arg1, int arg2, int arg3) {
        ++field419;
        if (class122.method835(arg3, 31)) {
            if (arg0 < 124) {
                field409 = null;
            }
            class9.method85(arg2, class4.field52[arg3], -1, (byte) 29, arg1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lm;")
    public static final class131 method175(int arg0, int arg1) {
        ++field392;
        class131 var2 = (class131) class74.field1416.method1178((long) arg1, 14176);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class29.field514.method1466(3, arg1, (byte) -121);
            class131 var4 = new class131();
            if (var3 != null) {
                var4.method894((byte) -9, new class66(var3));
            }
            class74.field1416.method1183((byte) 118, var4, (long) arg1);
            int var5 = -46 % ((arg0 - 26) / 38);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
    public static final void method176(int arg0) {
        if (!class130.field2324[98]) {
            if (!class130.field2324[99]) {
                class104.field1896 /= 2;
            } else {
                class104.field1896 += (-class104.field1896 + -12) / 2;
            }
        } else {
            class104.field1896 += (-class104.field1896 + 12) / 2;
        }
        class62.field1168 += class104.field1896 / 2;
        ++field413;
        if (class130.field2324[96]) {
            field397 += (-field397 + -24) / 2;
        } else if (class130.field2324[97]) {
            field397 += (-field397 + 24) / 2;
        } else {
            field397 /= 2;
        }
        int var1 = class224.field4178 + class96.field1774.field2260;
        int var2 = 84 % ((-67 - arg0) / 57);
        class73.field1384 += field397 / 2;
        int var3 = class32.field553 + class96.field1774.field2195;
        if (~(-var1 + class98.field1814) > 499 || ~(-var1 + class98.field1814) < -501 || -var3 + class182.field3171 < -500 || -var3 + class182.field3171 > 500) {
            class98.field1814 = var1;
            class182.field3171 = var3;
        }
        if (class182.field3171 != var3) {
            class182.field3171 += (-class182.field3171 + var3) / 16;
        }
        if (class98.field1814 != var1) {
            class98.field1814 += (var1 - class98.field1814) / 16;
        }
        class67.method541(2047);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
    public final int method67() {
        ++field401;
        return super.field2263;
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V")
    public static void method177(int arg0) {
        if (arg0 == -1637445112) {
            field409 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILlg;IIIIIIIIBII)V")
    private final void method178(int arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, int arg12) {
        if (arg10 != 32) {
            this.method42(84, 79, 24, -36, -40, 55, -115, -71, -70L);
        }
        ++field394;
        if (arg2 * arg2 + arg11 * arg11 <= 360000) {
            int var14 = 2047 & (int) (Math.atan2((double) arg2, (double) arg11) * 325.949D);
            class127 var15 = class152.method984(arg1, super.field2206, super.field2195, super.field2260, arg8, false, var14);
            if (var15 != null) {
                var15.method42(0, arg0, arg7, arg3, arg12, arg4, arg5, arg6, -1L);
            }
        }
    }
}
