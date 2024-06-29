import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class182 extends class107 {

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    private int field3190 = 1638;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "Z")
    private boolean field3180 = true;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    private int field3187 = 4;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "[B")
    private byte[] field3181 = new byte[512];

    @OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
    private int field3201 = 0;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    private int field3197 = 4;

    @OriginalMember(owner = "client!bd", name = "nb", descriptor = "I")
    private int field3204 = 4;

    @OriginalMember(owner = "client!bd", name = "mb", descriptor = "I")
    public static int field3203 = 0;

    @OriginalMember(owner = "client!bd", name = "lb", descriptor = "Lub;")
    public static class88 field3202 = new class88();

    @OriginalMember(owner = "client!bd", name = "pb", descriptor = "Lpj;")
    public static class237 field3206 = class33.method353("Lade Sprites )2 ", 68);

    @OriginalMember(owner = "client!bd", name = "tb", descriptor = "Lpj;")
    public static class237 field3210 = class33.method353("Benutzen", 51);

    @OriginalMember(owner = "client!bd", name = "vb", descriptor = "Lpj;")
    public static class237 field3212 = class33.method353("welle2:", 114);

    @OriginalMember(owner = "client!bd", name = "rb", descriptor = "I")
    public static int field3208 = 0;

    @OriginalMember(owner = "client!bd", name = "sb", descriptor = "I")
    public static int field3209 = 99;

    @OriginalMember(owner = "client!bd", name = "qb", descriptor = "Lpj;")
    public static class237 field3207 = class33.method353("<col=00ff80>", 67);

    @OriginalMember(owner = "client!bd", name = "wb", descriptor = "[I")
    public static int[] field3213 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!bd", name = "ob", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!bd", name = "ub", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "Lfa;")
    public static class239 field3196;

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "[I")
    public static int[] field3199;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "[S")
    private short[] field3182;

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "[S")
    private short[] field3200;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field3181 = class130.method915(3, this.field3201);
        ++field3195;
        if (arg0 == 31) {
            this.method1251(true);
            for (int var2 = this.field3204 - 1; ~var2 <= -2; --var2) {
                short var3 = this.field3200[var2];
                if (~var3 < -9) {
                    return;
                }
                if (~var3 > 7) {
                    return;
                }
                --this.field3204;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class182() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)Z")
    public static final boolean method1245(byte arg0) {
        ++field3188;
        if (class53.field1106) {
            try {
                class141.field2508.method1622(class268.field4572.field1306, false);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -44) {
            field3206 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IBI)V")
    private final void method1246(int[] arg0, byte arg1, int arg2) {
        ++field3185;
        int var4 = class185.field3233[arg2] * this.field3187;
        int var5 = 96 / ((arg1 - 73) / 33);
        if (~this.field3204 != -2) {
            short var6 = this.field3200[0];
            if (var6 > 8 || ~var6 > 7) {
                int var7 = this.field3182[0] << 12;
                int var8 = this.field3187 * var7 >> 12;
                int var9 = this.field3197 * var7 >> 12;
                int var10 = var4 * var7 >> 12;
                int var11 = var10 >> 12;
                int var12 = this.field3181[var11 & 255] & 255;
                int var13 = var10 & 4095;
                int var14 = var11 - -1;
                int var15 = class178.field3133[var13];
                if (~var14 <= ~var8) {
                    var14 = 0;
                }
                int var16 = 255 & this.field3181[var14 & 255];
                for (int var17 = 0; ~class106.field1862 < ~var17; ++var17) {
                    int var37 = field3199[var17] * this.field3197;
                    int var38 = this.method1253((byte) -90, var7 * var37 >> 12, var12, var15, var9, var16, var13);
                    arg0[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; ~var18 > ~this.field3204; ++var18) {
                short var19 = this.field3200[var18];
                if (var19 > 8 || ~var19 > 7) {
                    int var20 = this.field3182[var18] << 12;
                    int var21 = this.field3197 * var20 >> 12;
                    int var22 = var4 * var20 >> 12;
                    int var23 = this.field3187 * var20 >> 12;
                    int var24 = var22 >> 12;
                    int var25 = this.field3181[255 & var24] & 255;
                    int var26 = var24 + 1;
                    if (var26 >= var23) {
                        var26 = 0;
                    }
                    int var27 = var22 & 4095;
                    int var28 = class178.field3133[var27];
                    int var29 = 255 & this.field3181[var26 & 255];
                    if (this.field3180 && this.field3204 + -1 == var18) {
                        for (int var30 = 0; class106.field1862 > var30; ++var30) {
                            int var31 = field3199[var30] * this.field3197;
                            int var32 = this.method1253((byte) -117, var20 * var31 >> 12, var25, var28, var21, var29, var27);
                            int var33 = arg0[var30] - -(var19 * var32 >> 12);
                            arg0[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; class106.field1862 > var34; ++var34) {
                            int var35 = field3199[var34] * this.field3197;
                            int var36 = this.method1253((byte) -120, var20 * var35 >> 12, var25, var28, var21, var29, var27);
                            arg0[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            short var39 = this.field3200[0];
            int var40 = this.field3182[0] << 12;
            int var41 = var4 * var40 >> 12;
            int var42 = this.field3187 * var40 >> 12;
            int var43 = var41 >> 12;
            int var44 = var41 & 4095;
            int var45 = this.field3181[255 & var43] & 255;
            int var46 = var43 + 1;
            int var47 = this.field3197 * var40 >> 12;
            if (var46 >= var42) {
                var46 = 0;
            }
            int var48 = this.field3181[255 & var46] & 255;
            int var49 = class178.field3133[var44];
            if (!this.field3180) {
                for (int var50 = 0; class106.field1862 > var50; ++var50) {
                    int var51 = field3199[var50] * this.field3197;
                    int var52 = this.method1253((byte) -104, var40 * var51 >> 12, var45, var49, var47, var48, var44);
                    arg0[var50] = var39 * var52 >> 12;
                }
            } else {
                for (int var53 = 0; ~var53 > ~class106.field1862; ++var53) {
                    int var54 = field3199[var53] * this.field3197;
                    int var55 = this.method1253((byte) -116, var40 * var54 >> 12, var45, var49, var47, var48, var44);
                    int var56 = var39 * var55 >> 12;
                    arg0[var53] = (var56 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
    public static void method1247(boolean arg0) {
        if (!arg0) {
            method1247(false);
        }
        field3212 = null;
        field3210 = null;
        field3202 = null;
        field3196 = null;
        field3199 = null;
        field3213 = null;
        field3207 = null;
        field3206 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBIII)V")
    public static final void method1248(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = -48 % ((arg1 - 44) / 49);
        ++field3191;
        if (~arg2 <= ~class89.field1637 && arg2 <= class94.field1676) {
            int var6 = class91.method689(arg3, class13.field215, class34.field727, (byte) 126);
            int var7 = class91.method689(arg4, class13.field215, class34.field727, (byte) -117);
            class24.method219(false, arg0, var6, var7, arg2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lfa;IZLfa;Z)Lek;")
    public static final class160 method1249(class239 arg0, int arg1, boolean arg2, class239 arg3, boolean arg4) {
        boolean var5 = true;
        int[] var6 = arg3.method1636(arg1, (byte) -34);
        ++field3184;
        if (arg4) {
            method1252(-107, 46, -100, -128, 127, -121, 86, 18);
        }
        for (int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = arg3.method1648(var6[var7], arg1, -128);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 255 | (255 & var8[0]) << 8;
                byte[] var10;
                if (!arg2) {
                    var10 = arg0.method1648(0, var9, 124);
                } else {
                    var10 = arg0.method1648(var9, 0, -114);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class160(arg3, arg0, arg1, arg2);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(B)V")
    public static final void method1250(byte arg0) {
        ++field3205;
        if (~class99.field1772 < -1) {
            class127.method900(true);
        } else {
            class153.field2729 = class127.field2219;
            class127.field2219 = null;
            class79.method610(40, (byte) 109);
            if (arg0 != -102) {
                method1247(true);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            return null;
        } else {
            int[] var3 = super.field1921.method1388(arg1, (byte) -26);
            ++field3192;
            if (super.field1921.field3539) {
                this.method1246(var3, (byte) -81, arg1);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
    private final void method1251(boolean arg0) {
        if (~this.field3190 >= -1) {
            if (this.field3200 != null && this.field3200.length == this.field3204) {
                this.field3182 = new short[this.field3204];
                for (int var2 = 0; this.field3204 > var2; ++var2) {
                    this.field3182[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field3200 = new short[this.field3204];
            this.field3182 = new short[this.field3204];
            for (int var3 = 0; this.field3204 > var3; ++var3) {
                this.field3200[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field3190 / 4096.0F), (double) var3)));
                this.field3182[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (!arg0) {
            method1245((byte) -111);
        }
        ++field3198;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field3186;
        if (arg2 != -32513) {
            method1245((byte) 48);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field3204 = arg0.method316((byte) -67);
            } else {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field3197 = this.field3187 = arg0.method316((byte) 123);
                        return;
                    }
                    if (~arg1 == -5) {
                        this.field3201 = arg0.method316((byte) -62);
                        return;
                    }
                    if (~arg1 == -6) {
                        this.field3197 = arg0.method316((byte) -16);
                        return;
                    }
                    if (arg1 == 6) {
                        this.field3187 = arg0.method316((byte) 115);
                        return;
                    }
                } else {
                    this.field3190 = arg0.method309(-489706920);
                    if (~this.field3190 > -1) {
                        this.field3200 = new short[this.field3204];
                        for (int var5 = 0; var5 < this.field3204; ++var5) {
                            this.field3200[var5] = (short) arg0.method309(-489706920);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field3180 = ~arg0.method316((byte) 126) == -2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3189;
        if (arg5 >= 128 && arg0 >= 128 && ~arg5 >= -13057 && arg0 <= 13056) {
            int var8 = class23.method216(-52, arg0, arg5, class274.field4798) - arg4;
            int var9 = class150.field2676[class214.field3654];
            int var10 = class150.field2670[class214.field3654];
            int var11 = var8 - class112.field1957;
            int var12 = arg5 - class20.field380;
            int var13 = class150.field2676[class189.field3289];
            int var14 = arg0 - class167.field2957;
            int var15 = class150.field2670[class189.field3289];
            int var16 = var12 * var13 + var14 * var15 >> 16;
            int var17 = var13 * var14 - var12 * var15 >> 16;
            int var19 = var9 * var11 - var10 * var17 >> 16;
            int var20 = var10 * var11 - -(var9 * var17) >> 16;
            if (~var20 > arg2) {
                class7.field105 = -1;
                class213.field3632 = -1;
            } else {
                class213.field3632 = (var19 << 9) / var20 + arg1;
                class7.field105 = arg7 - -((var16 << 9) / var20);
            }
        } else {
            class213.field3632 = -1;
            class7.field105 = -1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIIIII)I")
    private final int method1253(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3194;
        int var8 = arg6 + -4096;
        int var9 = arg1 >> 12;
        if (arg0 >= -83) {
            return 52;
        } else {
            int var10 = var9 + 1;
            int var11 = arg1 & 4095;
            int var12 = var11 - 4096;
            int var13 = class178.field3133[var11];
            int var14 = var9 & 255;
            if (var10 >= arg4) {
                var10 = 0;
            }
            int var15 = var10 & 255;
            int var16 = 3 & this.field3181[arg2 + var14];
            int var17;
            if (var16 <= 1) {
                var17 = ~var16 == -1 ? arg6 + var11 : arg6 - var11;
            } else {
                var17 = ~var16 == -3 ? -arg6 + var11 : -var11 - arg6;
            }
            int var18 = 3 & this.field3181[arg2 + var15];
            int var19;
            if (var18 > 1) {
                var19 = var18 == 2 ? var12 - arg6 : -arg6 + -var12;
            } else {
                var19 = ~var18 == -1 ? var12 - -arg6 : -var12 + arg6;
            }
            int var20 = this.field3181[var14 - -arg5] & 3;
            int var21 = ((-var17 + var19) * var13 >> 12) + var17;
            int var22;
            if (~var20 < -2) {
                var22 = var20 == 2 ? -var8 + var11 : -var8 + -var11;
            } else {
                var22 = ~var20 == -1 ? var8 + var11 : -var11 + var8;
            }
            int var23 = 3 & this.field3181[arg5 + var15];
            int var24;
            if (var23 > 1) {
                var24 = var23 != 2 ? -var8 + -var12 : -var8 + var12;
            } else {
                var24 = var23 != 0 ? -var12 + var8 : var12 - -var8;
            }
            int var25 = ((-var22 + var24) * var13 >> 12) + var22;
            return ((-var21 + var25) * arg3 >> 12) + var21;
        }
    }
}
