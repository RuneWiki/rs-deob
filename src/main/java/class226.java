import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class226 extends class221 {

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "Z")
    public boolean field3978 = false;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "Lai;")
    public class126 field3980;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public int field3971;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "S")
    private short field3979;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "S")
    private short field3967;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "S")
    private short field3972;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "S")
    private short field3970;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "S")
    private short field3976;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    private int field3966;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    private static int field3977 = 12;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    private int field3974;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "S")
    public short field3968;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lai;IIIIIIIII)V", line = 4)
    public final void method1527(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3980 = arg0;
        this.field3969 = arg1 << field3977;
        this.field3975 = arg2 << field3977;
        this.field3971 = arg3 << field3977;
        this.field3973 = arg9;
        this.field3967 = this.field3979 = (short) arg8;
        this.field3972 = (short) arg4;
        this.field3970 = (short) arg5;
        this.field3976 = (short) arg6;
        this.field3966 = arg7;
        this.method1528();
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V", line = 27)
    private final void method1528() {
        int var1 = this.field3980.field2112.field2942;
        if (this.field3980.field2112.field2948[var1] != null) {
            this.field3980.field2112.field2948[var1].method1530();
        }
        this.field3980.field2112.field2948[var1] = this;
        this.field3968 = (short) this.field3980.field2112.field2942;
        this.field3980.field2112.field2942 = var1 + 1 & 0x1FFF;
        this.field3980.field2147.method2171(this, 82);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(JI)V", line = 43)
    public final void method1529(long arg0, int arg1) {
        if (this.field3980 == null) {
            return;
        }
        this.field3979 = (short) (this.field3979 - arg1);
        if (this.field3979 <= 0) {
            this.method1530();
            return;
        }
        int var4 = this.field3969 >> field3977;
        int var5 = this.field3975 >> field3977;
        int var6 = this.field3971 >> field3977;
        class165 var7 = this.field3980.field2112;
        class180 var8 = this.field3980.field2127;
        if (var8.field3302 != 0) {
            if (this.field3967 - this.field3979 <= var8.field3295) {
                int var9 = var8.field3303 * arg1 + (this.field3974 >> 16 & 0xFF) + (this.field3973 >> 8 & 0xFF00);
                int var10 = var8.field3264 * arg1 + (this.field3974 >> 8 & 0xFF) + (this.field3973 & 0xFF00);
                int var11 = var8.field3317 * arg1 + (this.field3973 & 0xFF << 8) + (this.field3974 & 0xFF);
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
                this.field3973 &= 0xFF000000;
                this.field3973 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field3974 &= 0xFF000000;
                this.field3974 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field3967 - this.field3979 <= var8.field3262) {
                int var12 = var8.field3310 * arg1 + (this.field3974 >> 24 & 0xFF) + (this.field3973 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field3973 &= 0xFFFFFF;
                this.field3973 |= (var12 & 0xFF00) << 16;
                this.field3974 &= 0xFFFFFF;
                this.field3974 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field3296 != -1 && this.field3967 - this.field3979 <= var8.field3274) {
            this.field3966 += var8.field3256 * arg1;
        }
        int var13 = this.field3972;
        int var14 = this.field3970;
        int var15 = this.field3976;
        boolean var16 = false;
        if (var8.field3292 == 1) {
            int var17 = var4 - this.field3980.field2116;
            int var18 = var5 - this.field3980.field2133;
            int var19 = var6 - this.field3980.field2128;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field3318 * var20 * arg1);
            this.field3966 = (int) ((long) this.field3966 - ((long) this.field3966 * var21 >> 18));
        } else if (var8.field3292 == 2) {
            int var23 = var4 - this.field3980.field2116;
            int var24 = var5 - this.field3980.field2133;
            int var25 = var6 - this.field3980.field2128;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field3318 * var26 * arg1);
            this.field3966 = (int) ((long) this.field3966 - ((long) this.field3966 * var27 >> 28));
        }
        class184 var29 = var7.field2956.field8;
        for (class184 var30 = var29.field3373; var30 != var29; var30 = var30.field3373) {
            class105 var31 = (class105) var30;
            class78 var32 = var31.field1815.field199;
            if (var32.field1170 != 1) {
                int var33 = var4 - var31.field1830;
                int var34 = var5 - var31.field1820;
                int var35 = var6 - var31.field1824;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field1177) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field1831 * var35 + var31.field1829 * var33 + var32.field1189 * var34) * 65535L / (long) (var32.field1194 * var38);
                    if (var39 >= (long) var32.field1185) {
                        int var41 = 0;
                        if (var32.field1182 == 1) {
                            var41 = (var38 >> 4) * var32.field1171;
                        } else if (var32.field1182 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field1171;
                        }
                        if (var32.field1173 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field1194;
                            int var43 = (var34 << 15) / var38 * var32.field1194;
                            int var44 = (var35 << 15) / var38 * var32.field1194;
                            if (var32.field1191 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field3969 += arg1 * var42 >> 15;
                                this.field3975 += arg1 * var43 >> 15;
                                this.field3971 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field1191 == 0) {
                            var13 += (var31.field1829 - var41) * arg1;
                            var14 += (var32.field1189 - var41) * arg1;
                            var15 += (var31.field1831 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field3969 += (var31.field1829 - var41) * arg1;
                            this.field3975 += (var32.field1189 - var41) * arg1;
                            this.field3971 += (var31.field1831 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field3316 != null) {
            for (int var45 = 0; var45 < var8.field3316.length; var45++) {
                class105 var46 = (class105) class165.field2938.method1344((long) var8.field3316[var45], (byte) 69);
                while (var46 != null) {
                    class78 var47 = var46.field1815.field199;
                    int var48 = var4 - var46.field1830;
                    int var49 = var5 - var46.field1820;
                    int var50 = var6 - var46.field1824;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field1177) {
                        var46 = (class105) class165.field2938.method1341((byte) 117);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field1831 * var50 + var46.field1829 * var48 + var47.field1189 * var49) * 65535L / (long) (var47.field1194 * var53);
                        if (var54 < (long) var47.field1185) {
                            var46 = (class105) class165.field2938.method1341((byte) 100);
                        } else {
                            int var56 = 0;
                            if (var47.field1182 == 1) {
                                var56 = (var53 >> 4) * var47.field1171;
                            } else if (var47.field1182 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field1171;
                            }
                            if (var47.field1173 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field1194;
                                int var58 = (var49 << 15) / var53 * var47.field1194;
                                int var59 = (var50 << 15) / var53 * var47.field1194;
                                if (var47.field1191 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field3969 += arg1 * var57 >> 15;
                                    this.field3975 += arg1 * var58 >> 15;
                                    this.field3971 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field1191 == 0) {
                                var13 += (var46.field1829 - var56) * arg1;
                                var14 += (var47.field1189 - var56) * arg1;
                                var15 += (var46.field1831 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field3969 += (var46.field1829 - var56) * arg1;
                                this.field3975 += (var47.field1189 - var56) * arg1;
                                this.field3971 += (var46.field1831 - var56) * arg1;
                            }
                            var46 = (class105) class165.field2938.method1341((byte) 102);
                        }
                    }
                }
            }
        }
        if (var8.field3308 != null) {
            for (int var60 = 0; var60 < var8.field3308.length; var60++) {
                class78 var61 = class61.method423(false, var8.field3308[var60]);
                if (var61.field1191 == 0) {
                    var13 += var61.field1176 * arg1;
                    var14 += var61.field1189 * arg1;
                    var15 += var61.field1190 * arg1;
                    var16 = true;
                } else {
                    this.field3969 += var61.field1176 * arg1;
                    this.field3975 += var61.field1189 * arg1;
                    this.field3971 += var61.field1190 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field3972 = (short) var13;
                    this.field3970 = (short) var14;
                    this.field3976 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field3966 <<= 0x1;
            }
        }
        this.field3969 = (int) ((long) this.field3969 + ((long) this.field3972 * (long) this.field3966 >> 23) * (long) arg1);
        this.field3975 = (int) ((long) this.field3975 + ((long) this.field3970 * (long) this.field3966 >> 23) * (long) arg1);
        this.field3971 = (int) ((long) this.field3971 + ((long) this.field3976 * (long) this.field3966 >> 23) * (long) arg1);
        int var62 = this.field3969 >> 19;
        int var63 = this.field3971 >> 19;
        int var64 = this.field3975 >> field3977;
        if (var64 > 0 || var64 < -65535 || var62 < 0 || var62 >= class320.field5489 || var63 < 0 || var63 >= class325.field5535) {
            this.method1530();
            return;
        }
        int[][][] var65 = class278.field4883;
        int var66 = var65[var7.field2976][var62][var63];
        int var67;
        if (var7.field2976 < 3) {
            var67 = var65[var7.field2976 + 1][var62][var63];
        } else {
            var67 = var65[var7.field2976][var62][var63] - 1024;
        }
        if (var8.field3267) {
            if (var8.field3320 == -1 && var64 > var66) {
                this.method1530();
                return;
            }
            if (var8.field3320 >= 0 && var64 > var65[var8.field3320][var62][var63]) {
                this.method1530();
                return;
            }
            if (var8.field3283 == -1 && var64 < var67) {
                this.method1530();
                return;
            }
            if (var8.field3283 >= 0 && var64 < var65[var8.field3283 + 1][var62][var63]) {
                this.method1530();
                return;
            }
        }
        if (var62 >= var7.field2974 && var62 <= var7.field2975 && var63 >= var7.field2966 && var63 <= var7.field2970 && var64 <= var7.field2965 && var64 >= var7.field2977) {
            this.field3978 = false;
            return;
        }
        this.field3978 = true;
        byte var68 = 3;
        if (var64 > var65[1][var62][var63]) {
            var68 = 0;
        } else if (var64 > var65[2][var62][var63]) {
            var68 = 1;
        } else if (var64 > var65[3][var62][var63]) {
            var68 = 2;
        } else if (var64 < var65[3][var62][var63] - 1024) {
            this.method1530();
            return;
        }
        class74 var69 = class99.field1759[var68][var62][var63];
        if (var69 == null) {
            var69 = class99.field1759[var68][var62][var63] = new class74(var68, var62, var63);
        }
        if (var69.field1129 == null) {
            var69.field1129 = new class260();
            var69.field1134 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var69.field1134) {
            var69.field1129.method1847(25);
            var69.field1134 = (byte) ((int) (arg0 & 0xFFL));
        }
        var69.field1129.method1848(this, 123);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lai;IIIIIIIII)V", line = 506)
    public class226(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3980 = arg0;
        this.field3969 = arg1 << field3977;
        this.field3975 = arg2 << field3977;
        this.field3971 = arg3 << field3977;
        this.field3973 = arg9;
        this.field3967 = this.field3979 = (short) arg8;
        this.field3972 = (short) arg4;
        this.field3970 = (short) arg5;
        this.field3976 = (short) arg6;
        this.field3966 = arg7;
        this.method1528();
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()V", line = 497)
    private final void method1530() {
        this.field3980.field2112.field2948[this.field3968] = null;
        class165.field2950[class165.field2949] = this;
        class165.field2949 = class165.field2949 + 1 & 0x3FF;
        this.field3980 = null;
        this.method268(17450);
        this.method1516(255);
    }
}
