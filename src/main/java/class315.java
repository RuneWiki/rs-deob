import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class315 extends class227 {

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Z")
    public boolean field4996 = false;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Ltj;")
    public class197 field4982;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public int field4995;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public int field4990;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "S")
    private short field4991;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "S")
    private short field4988;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "S")
    private short field4992;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "S")
    private short field4986;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "S")
    private short field4984;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    private int field4983;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    private static int field4993 = 12;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    private int field4994;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "S")
    public short field4989;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ltj;IIIIIIIII)V", line = 3)
    public final void method2167(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4982 = arg0;
        this.field4985 = arg1 << field4993;
        this.field4987 = arg2 << field4993;
        this.field4995 = arg3 << field4993;
        this.field4990 = arg9;
        this.field4988 = this.field4991 = (short) arg8;
        this.field4992 = (short) arg4;
        this.field4986 = (short) arg5;
        this.field4984 = (short) arg6;
        this.field4983 = arg7;
        this.method2169();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()V", line = 27)
    private final void method2168() {
        this.field4982.field3381.field1014[this.field4989] = null;
        class65.field1031[class65.field1013] = this;
        class65.field1013 = class65.field1013 + 1 & 0x3FF;
        this.field4982 = null;
        this.method1849((byte) -64);
        this.method1650((byte) 33);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()V", line = 37)
    private final void method2169() {
        int var1 = this.field4982.field3381.field1028;
        if (this.field4982.field3381.field1014[var1] != null) {
            this.field4982.field3381.field1014[var1].method2168();
        }
        this.field4982.field3381.field1014[var1] = this;
        this.field4989 = (short) this.field4982.field3381.field1028;
        this.field4982.field3381.field1028 = var1 + 1 & 0x1FFF;
        this.field4982.field3373.method1689(this, 9893);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(JI)V", line = 50)
    public final void method2170(long arg0, int arg1) {
        if (this.field4982 == null) {
            return;
        }
        this.field4991 = (short) (this.field4991 - arg1);
        if (this.field4991 <= 0) {
            this.method2168();
            return;
        }
        int var4 = this.field4985 >> field4993;
        int var5 = this.field4987 >> field4993;
        int var6 = this.field4995 >> field4993;
        class65 var7 = this.field4982.field3381;
        class195 var8 = this.field4982.field3353;
        if (var8.field3289 != 0) {
            if (this.field4988 - this.field4991 <= var8.field3326) {
                int var9 = var8.field3264 * arg1 + (this.field4994 >> 16 & 0xFF) + (this.field4990 >> 8 & 0xFF00);
                int var10 = var8.field3269 * arg1 + (this.field4994 >> 8 & 0xFF) + (this.field4990 & 0xFF00);
                int var11 = var8.field3288 * arg1 + (this.field4990 & 0xFF << 8) + (this.field4994 & 0xFF);
                if (var9 < 0) {
                    var9 = 0;
                } else if (var9 > 65535) {
                    var9 = 65535;
                }
                if (var10 < 0) {
                    var10 = 0;
                } else if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 65535) {
                    var11 = 65535;
                }
                this.field4990 &= 0xFF000000;
                this.field4990 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field4994 &= 0xFF000000;
                this.field4994 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field4988 - this.field4991 <= var8.field3286) {
                int var12 = var8.field3287 * arg1 + (this.field4994 >> 24 & 0xFF) + (this.field4990 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field4990 &= 0xFFFFFF;
                this.field4990 |= (var12 & 0xFF00) << 16;
                this.field4994 &= 0xFFFFFF;
                this.field4994 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field3265 != -1 && this.field4988 - this.field4991 <= var8.field3290) {
            this.field4983 += var8.field3318 * arg1;
        }
        int var13 = this.field4992;
        int var14 = this.field4986;
        int var15 = this.field4984;
        boolean var16 = false;
        if (var8.field3313 == 1) {
            int var17 = var4 - this.field4982.field3360;
            int var18 = var5 - this.field4982.field3380;
            int var19 = var6 - this.field4982.field3383;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field3270 * var20 * arg1);
            this.field4983 = (int) ((long) this.field4983 - ((long) this.field4983 * var21 >> 18));
        } else if (var8.field3313 == 2) {
            int var23 = var4 - this.field4982.field3360;
            int var24 = var5 - this.field4982.field3380;
            int var25 = var6 - this.field4982.field3383;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field3270 * var26 * arg1);
            this.field4983 = (int) ((long) this.field4983 - ((long) this.field4983 * var27 >> 28));
        }
        class320 var29 = var7.field1030.field5269;
        for (class320 var30 = var29.field5068; var30 != var29; var30 = var30.field5068) {
            class234 var31 = (class234) var30;
            class303 var32 = var31.field3875.field1370;
            if (var32.field4786 != 1) {
                int var33 = var4 - var31.field3880;
                int var34 = var5 - var31.field3879;
                int var35 = var6 - var31.field3873;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field4799) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field3872 * var35 + var31.field3877 * var33 + var32.field4805 * var34) * 65535L / (long) (var32.field4804 * var38);
                    if (var39 >= (long) var32.field4795) {
                        int var41 = 0;
                        if (var32.field4807 == 1) {
                            var41 = (var38 >> 4) * var32.field4794;
                        } else if (var32.field4807 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field4794;
                        }
                        if (var32.field4803 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field4804;
                            int var43 = (var34 << 15) / var38 * var32.field4804;
                            int var44 = (var35 << 15) / var38 * var32.field4804;
                            if (var32.field4808 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field4985 += arg1 * var42 >> 15;
                                this.field4987 += arg1 * var43 >> 15;
                                this.field4995 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field4808 == 0) {
                            var13 += (var31.field3877 - var41) * arg1;
                            var14 += (var32.field4805 - var41) * arg1;
                            var15 += (var31.field3872 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field4985 += (var31.field3877 - var41) * arg1;
                            this.field4987 += (var32.field4805 - var41) * arg1;
                            this.field4995 += (var31.field3872 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field3305 != null) {
            for (int var45 = 0; var45 < var8.field3305.length; var45++) {
                class234 var46 = (class234) class65.field1012.method2389(false, (long) var8.field3305[var45]);
                while (var46 != null) {
                    class303 var47 = var46.field3875.field1370;
                    int var48 = var4 - var46.field3880;
                    int var49 = var5 - var46.field3879;
                    int var50 = var6 - var46.field3873;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field4799) {
                        var46 = (class234) class65.field1012.method2392((byte) -88);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field3872 * var50 + var46.field3877 * var48 + var47.field4805 * var49) * 65535L / (long) (var47.field4804 * var53);
                        if (var54 < (long) var47.field4795) {
                            var46 = (class234) class65.field1012.method2392((byte) -88);
                        } else {
                            int var56 = 0;
                            if (var47.field4807 == 1) {
                                var56 = (var53 >> 4) * var47.field4794;
                            } else if (var47.field4807 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field4794;
                            }
                            if (var47.field4803 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field4804;
                                int var58 = (var49 << 15) / var53 * var47.field4804;
                                int var59 = (var50 << 15) / var53 * var47.field4804;
                                if (var47.field4808 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field4985 += arg1 * var57 >> 15;
                                    this.field4987 += arg1 * var58 >> 15;
                                    this.field4995 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field4808 == 0) {
                                var13 += (var46.field3877 - var56) * arg1;
                                var14 += (var47.field4805 - var56) * arg1;
                                var15 += (var46.field3872 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field4985 += (var46.field3877 - var56) * arg1;
                                this.field4987 += (var47.field4805 - var56) * arg1;
                                this.field4995 += (var46.field3872 - var56) * arg1;
                            }
                            var46 = (class234) class65.field1012.method2392((byte) -88);
                        }
                    }
                }
            }
        }
        if (var8.field3302 != null) {
            if (var8.field3284 == null) {
                var8.field3284 = new int[var8.field3302.length];
                for (int var60 = 0; var60 < var8.field3302.length; var60++) {
                    class166.method1303(1, var8.field3302[var60]);
                    var8.field3284[var60] = ((class142) class131.field2248.method732((long) var8.field3302[var60], true)).field2601;
                }
            }
            for (int var61 = 0; var61 < var8.field3284.length; var61++) {
                class303 var62 = class194.field3252[var8.field3284[var61]];
                if (var62.field4808 == 0) {
                    var13 += var62.field4792 * arg1;
                    var14 += var62.field4805 * arg1;
                    var15 += var62.field4806 * arg1;
                    var16 = true;
                } else {
                    this.field4985 += var62.field4792 * arg1;
                    this.field4987 += var62.field4805 * arg1;
                    this.field4995 += var62.field4806 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field4992 = (short) var13;
                    this.field4986 = (short) var14;
                    this.field4984 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field4983 <<= 0x1;
            }
        }
        this.field4985 = (int) ((long) this.field4985 + ((long) this.field4992 * (long) this.field4983 >> 23) * (long) arg1);
        this.field4987 = (int) ((long) this.field4987 + ((long) this.field4986 * (long) this.field4983 >> 23) * (long) arg1);
        this.field4995 = (int) ((long) this.field4995 + ((long) this.field4984 * (long) this.field4983 >> 23) * (long) arg1);
        int var63 = this.field4985 >> 19;
        int var64 = this.field4995 >> 19;
        int var65 = this.field4987 >> field4993;
        if (var65 > 0 || var65 < -65535 || var63 < 0 || var63 >= class123.field2134 || var64 < 0 || var64 >= class185.field3144) {
            this.method2168();
            return;
        }
        int[][][] var66 = class137.field2487;
        int var67 = var66[var7.field1035][var63][var64];
        int var68;
        if (var7.field1035 < 3) {
            var68 = var66[var7.field1035 + 1][var63][var64];
        } else {
            var68 = var66[var7.field1035][var63][var64] - 1024;
        }
        if (var8.field3267) {
            if (var8.field3295 == -1 && var65 > var67) {
                this.method2168();
                return;
            }
            if (var8.field3295 >= 0 && var65 > var66[var8.field3295][var63][var64]) {
                this.method2168();
                return;
            }
            if (var8.field3321 == -1 && var65 < var68) {
                this.method2168();
                return;
            }
            if (var8.field3321 >= 0 && var65 < var66[var8.field3321 + 1][var63][var64]) {
                this.method2168();
                return;
            }
        }
        if (var63 >= var7.field1046 && var63 <= var7.field1037 && var64 >= var7.field1041 && var64 <= var7.field1039 && var65 <= var7.field1044 && var65 >= var7.field1043) {
            this.field4996 = false;
            return;
        }
        this.field4996 = true;
        byte var69 = 3;
        if (var65 > var66[1][var63][var64]) {
            var69 = 0;
        } else if (var65 > var66[2][var63][var64]) {
            var69 = 1;
        } else if (var65 > var66[3][var63][var64]) {
            var69 = 2;
        } else if (var65 < var66[3][var63][var64] - 1024) {
            this.method2168();
            return;
        }
        class257 var70 = class279.field4430[var69][var63][var64];
        if (var70 == null) {
            var70 = class279.field4430[var69][var63][var64] = new class257(var69, var63, var64);
        }
        if (var70.field4155 == null) {
            var70.field4155 = new class64();
            var70.field4162 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var70.field4162) {
            var70.field4155.method609(144);
            var70.field4162 = (byte) ((int) (arg0 & 0xFFL));
        }
        var70.field4155.method603(17354, this);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Ltj;IIIIIIIII)V", line = 521)
    public class315(class197 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4982 = arg0;
        this.field4985 = arg1 << field4993;
        this.field4987 = arg2 << field4993;
        this.field4995 = arg3 << field4993;
        this.field4990 = arg9;
        this.field4988 = this.field4991 = (short) arg8;
        this.field4992 = (short) arg4;
        this.field4986 = (short) arg5;
        this.field4984 = (short) arg6;
        this.field4983 = arg7;
        this.method2169();
    }
}
