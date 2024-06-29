import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class230 extends class196 {

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    private int field4012 = 4;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
    private int field4023 = 0;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    private int field4016 = 1638;

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "Z")
    private boolean field4025 = true;

    @OriginalMember(owner = "client!fa", name = "mb", descriptor = "I")
    private int field4029 = 4;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    private int field4019 = 4;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "[B")
    private byte[] field4011 = new byte[512];

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "Z")
    public static boolean field4009 = true;

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "Ldf;")
    public static class51 field4027 = class46.method233(" loggt sich ein)3", 100);

    @OriginalMember(owner = "client!fa", name = "lb", descriptor = "Ldf;")
    public static class51 field4028 = class46.method233("::qa_op_test", 100);

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!fa", name = "nb", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "J")
    public static long field4014;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "[S")
    private short[] field4007;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "[S")
    private short[] field4020;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLu;)Lcg;")
    public static final class156 method1583(int arg0, boolean arg1, class111 arg2) {
        ++field4008;
        if (!class241.method1656(arg0, 0, arg2)) {
            return null;
        } else {
            if (!arg1) {
                method1583(-115, false, (class111) null);
            }
            return class241.method1657(true);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lu;ILu;IZ)Lpi;")
    public static final class130 method1584(class111 arg0, int arg1, class111 arg2, int arg3, boolean arg4) {
        ++field4026;
        int[] var5 = arg0.method831(-126, arg3);
        boolean var6 = true;
        if (arg1 != -1724) {
            return null;
        } else {
            for (int var7 = 0; var5.length > var7; ++var7) {
                byte[] var8 = arg0.method813(var5[var7], arg3, arg1 + -10538);
                if (var8 == null) {
                    var6 = false;
                } else {
                    int var9 = 255 & var8[1] | 65280 & var8[0] << 8;
                    byte[] var10;
                    if (!arg4) {
                        var10 = arg2.method813(0, var9, -12262);
                    } else {
                        var10 = arg2.method813(var9, 0, -12262);
                    }
                    if (var10 == null) {
                        var6 = false;
                    }
                }
            }
            if (!var6) {
                return null;
            } else {
                try {
                    return new class130(arg0, arg2, arg3, arg4);
                } catch (Exception var11) {
                    return null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
    public static final void method1585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4015;
        if (~class74.field1182 > -101) {
            class208.method1432(arg2 ^ 29820);
        }
        class59.method390(arg4, arg1, arg4 - -arg0, arg1 + arg3);
        if (class74.field1182 < 100) {
            byte var5 = 20;
            int var6 = arg1 - (-(arg3 / 2) + 18) + -var5;
            int var7 = arg0 / 2 + arg4;
            class59.method393(arg4, arg1, arg0, arg3, 0);
            class59.method375(var7 + -152, var6, 304, 34, 9179409);
            class59.method375(var7 + -151, var6 + 1, 302, 32, 0);
            class59.method393(var7 + -150, var6 + 2, class74.field1182 * 3, 30, 9179409);
            class59.method393(var7 + -150 - -(class74.field1182 * 3), var6 + 2, -(class74.field1182 * 3) + 300, 30, 0);
            class239.field4161.method1333(class247.field4346, var7, var5 + var6, 16777215, -1);
        } else {
            class39.field615 = (int) ((float) (arg3 * 2) / class79.field1261);
            class179.field2959 = -((int) ((float) arg3 / class79.field1261)) + class169.field2758;
            class67.field1094 = (int) ((float) (arg0 * 2) / class79.field1261);
            class57.field951 = -((int) ((float) arg0 / class79.field1261)) + class44.field701;
            if (arg2 == -20170) {
                int var8 = class44.field701 - (int) ((float) arg0 / class79.field1261);
                int var9 = -((int) ((float) arg3 / class79.field1261)) + class169.field2758;
                int var10 = class169.field2758 - -((int) ((float) arg3 / class79.field1261));
                int var11 = (int) ((float) arg0 / class79.field1261) + class44.field701;
                class16.method81(var10, arg1, arg1 + arg3, (byte) 61, var9, var11, arg4, var8, arg0 + arg4);
                class247.method1688(var8, var10, arg1, 0, arg4, arg0 + arg4, var11, arg1 + arg3, var9);
                class34.method171(var9, -118, arg4, var10, var8, arg0 + arg4, arg1, var11, arg1 - -arg3);
                if (class55.field940 > 0) {
                    --class55.field940;
                }
                if (class172.field2812) {
                    int var12 = arg0 + arg4 + -5;
                    int var13 = arg1 - 8 + arg3;
                    class177.field2891.method1316(class20.method104(-122, new class51[] { class239.field4159, class51.method311(class135.field2247, 10) }), var12, var13, 16776960, -1);
                    Runtime var14 = Runtime.getRuntime();
                    int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
                    int var17 = var13 - 15;
                    int var16 = 16776960;
                    if (var15 > 65536) {
                        var16 = 16711680;
                    }
                    class177.field2891.method1316(class20.method104(arg2 + 20251, new class51[] { class149.field2501, class51.method311(var15, 10), class8.field94 }), var12, var17, var16, -1);
                    var13 = var17 - 15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 10565) {
            this.field4029 = -60;
        }
        ++field4013;
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            this.method1590(var3, (byte) -79, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
    private final void method1586(int arg0) {
        if (arg0 != -1158) {
            field4009 = true;
        }
        if (this.field4016 <= 0) {
            if (this.field4007 != null && this.field4007.length == this.field4029) {
                this.field4020 = new short[this.field4029];
                for (int var2 = 0; ~this.field4029 < ~var2; ++var2) {
                    this.field4020[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field4007 = new short[this.field4029];
            this.field4020 = new short[this.field4029];
            for (int var3 = 0; ~var3 > ~this.field4029; ++var3) {
                this.field4007[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field4016 / 4096.0F), (double) var3)));
                this.field4020[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field4010;
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field4027 = null;
        if (arg0 == 549421484) {
            field4028 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Lwc;I)V")
    public static final void method1588(int arg0, class213[] arg1, int arg2) {
        for (int var3 = 0; ~var3 > ~arg1.length; ++var3) {
            class213 var4 = arg1[var3];
            if (var4 != null && var4.field3689 == arg2 && (!var4.field3574 || !client.method1052(var4))) {
                if (var4.field3623 == 0) {
                    if (!var4.field3574 && client.method1052(var4) && class29.field416 != var4) {
                        continue;
                    }
                    method1588(-1, arg1, var4.field3703);
                    if (var4.field3556 != null) {
                        method1588(-1, var4.field3556, var4.field3703);
                    }
                    class42 var5 = (class42) class79.field1265.method1453((long) var4.field3703, 1);
                    if (var5 != null) {
                        class215.method1475(var5.field668, -1);
                    }
                }
                if (var4.field3623 == 6) {
                    if (var4.field3633 != -1 || ~var4.field3592 != 0) {
                        boolean var6 = class157.method1118(-126, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field3633;
                        } else {
                            var7 = var4.field3592;
                        }
                        if (var7 != -1) {
                            class151 var8 = class72.method501(var7, (byte) 83);
                            if (var8 != null) {
                                var4.field3618 += class225.field3945;
                                while (~var4.field3618 < ~var8.field2532[var4.field3697]) {
                                    var4.field3618 -= var8.field2532[var4.field3697];
                                    ++var4.field3697;
                                    if (var8.field2539.length <= var4.field3697) {
                                        var4.field3697 -= var8.field2526;
                                        if (~var4.field3697 > -1 || ~var4.field3697 <= ~var8.field2539.length) {
                                            var4.field3697 = 0;
                                        }
                                    }
                                    class25.method135(var4, -28014);
                                }
                            }
                        }
                    }
                    if (var4.field3602 != 0 && !var4.field3574) {
                        int var9 = var4.field3602 >> 16;
                        int var10 = var4.field3602 << 16 >> 16;
                        int var11 = class225.field3945 * var10;
                        var4.field3668 = 2047 & var4.field3668 - -var11;
                        int var12 = class225.field3945 * var9;
                        var4.field3586 = 2047 & var4.field3586 - -var12;
                        class25.method135(var4, arg0 ^ 28013);
                    }
                }
            }
        }
        ++field4030;
        if (arg0 != -1) {
            field4009 = true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljd;IILfi;BILm;I)V")
    public static final void method1589(class83 arg0, int arg1, int arg2, class103 arg3, byte arg4, int arg5, class108 arg6, int arg7) {
        class93 var8 = new class93();
        ++field4018;
        var8.field1543 = arg5;
        var8.field1536 = arg2 * 128;
        var8.field1558 = arg7 * 128;
        if (arg4 != -119) {
            method1589((class83) null, 23, 77, (class103) null, (byte) 20, -2, (class108) null, 58);
        }
        if (arg6 == null) {
            if (arg0 == null) {
                if (arg3 != null) {
                    var8.field1553 = (arg3.field4345 + arg7) * 128;
                    var8.field1555 = (arg3.field4345 + arg2) * 128;
                    var8.field1541 = arg3;
                    var8.field1534 = class76.method546(arg3, -76);
                    var8.field1548 = arg3.field1716 * 128;
                    class36.field556.method1447(79, arg3.field1711.method316(27), var8);
                    return;
                }
            } else {
                var8.field1542 = arg0;
                class11 var9 = arg0.field1392;
                if (var9.field120 != null) {
                    var8.field1556 = true;
                    var9 = var9.method60((byte) 58);
                }
                if (var9 != null) {
                    var8.field1553 = (var9.field118 + arg7) * 128;
                    var8.field1555 = (var9.field118 + arg2) * 128;
                    var8.field1534 = class180.method1283(arg0, (byte) -79);
                    var8.field1548 = var9.field170 * 128;
                }
                class179.field2958.method1709(arg4 + 239, var8);
            }
        } else {
            var8.field1534 = arg6.field1845;
            var8.field1554 = arg6;
            int var10 = arg6.field1824;
            var8.field1550 = arg6.field1775;
            var8.field1549 = arg6.field1825;
            var8.field1548 = arg6.field1794 * 128;
            var8.field1545 = arg6.field1787;
            int var11 = arg6.field1807;
            if (~arg1 == -2 || ~arg1 == -4) {
                var11 = arg6.field1824;
                var10 = arg6.field1807;
            }
            var8.field1555 = (arg2 - -var10) * 128;
            var8.field1553 = (arg7 + var11) * 128;
            if (arg6.field1796 != null) {
                var8.field1556 = true;
                var8.method701((byte) 89);
            }
            if (var8.field1545 != null) {
                var8.field1539 = var8.field1550 - -((int) (Math.random() * (double) (-var8.field1550 + var8.field1549)));
            }
            class209.field3485.method1709(88, var8);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 != 82) {
            this.field4020 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field4019 = arg1.method897(117);
                                }
                            } else {
                                this.field4012 = arg1.method897(-66);
                            }
                        } else {
                            this.field4023 = arg1.method897(116);
                        }
                    } else {
                        this.field4012 = this.field4019 = arg1.method897(108);
                    }
                } else {
                    this.field4016 = arg1.method884(14513);
                    if (this.field4016 < 0) {
                        this.field4007 = new short[this.field4029];
                        for (int var5 = 0; ~var5 > ~this.field4029; ++var5) {
                            this.field4007[var5] = (short) arg1.method884(14513);
                        }
                    }
                }
            } else {
                this.field4029 = arg1.method897(-49);
            }
        } else {
            this.field4025 = ~arg1.method897(-80) == -2;
        }
        ++field4024;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([IBI)V")
    private final void method1590(int[] arg0, byte arg1, int arg2) {
        ++field4017;
        int var4 = class161.field2639[arg2] * this.field4019;
        int var5 = 114 % ((21 - arg1) / 57);
        if (this.field4029 == 1) {
            int var6 = this.field4020[0] << 12;
            short var7 = this.field4007[0];
            int var8 = var4 * var6 >> 12;
            int var9 = this.field4019 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = 255 & this.field4011[var10 & 255];
            int var12 = this.field4012 * var6 >> 12;
            int var13 = var10 + 1;
            if (~var13 <= ~var9) {
                var13 = 0;
            }
            int var14 = var8 & 4095;
            int var15 = 255 & this.field4011[var13 & 255];
            int var16 = class78.field1250[var14];
            if (!this.field4025) {
                for (int var17 = 0; ~class49.field767 < ~var17; ++var17) {
                    int var18 = class211.field3510[var17] * this.field4012;
                    int var19 = this.method1591(var12, var11, (byte) -93, var15, var16, var14, var6 * var18 >> 12);
                    arg0[var17] = var7 * var19 >> 12;
                }
            } else {
                for (int var20 = 0; var20 < class49.field767; ++var20) {
                    int var21 = class211.field3510[var20] * this.field4012;
                    int var22 = this.method1591(var12, var11, (byte) -66, var15, var16, var14, var6 * var21 >> 12);
                    int var23 = var7 * var22 >> 12;
                    arg0[var20] = (var23 >> 1) + 2048;
                }
            }
        } else {
            short var24 = this.field4007[0];
            if (var24 > 8 || var24 < -8) {
                int var25 = this.field4020[0] << 12;
                int var26 = var4 * var25 >> 12;
                int var27 = this.field4012 * var25 >> 12;
                int var28 = this.field4019 * var25 >> 12;
                int var29 = var26 >> 12;
                int var30 = 255 & this.field4011[var29 & 255];
                int var31 = var29 + 1;
                if (var28 <= var31) {
                    var31 = 0;
                }
                int var32 = this.field4011[255 & var31] & 255;
                int var33 = var26 & 4095;
                int var34 = class78.field1250[var33];
                for (int var35 = 0; ~class49.field767 < ~var35; ++var35) {
                    int var55 = class211.field3510[var35] * this.field4012;
                    int var56 = this.method1591(var27, var30, (byte) -65, var32, var34, var33, var25 * var55 >> 12);
                    arg0[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; ~this.field4029 < ~var36; ++var36) {
                short var37 = this.field4007[var36];
                if (~var37 < -9 || var37 < -8) {
                    int var38 = this.field4020[var36] << 12;
                    int var39 = this.field4019 * var38 >> 12;
                    int var40 = var4 * var38 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = 255 & this.field4011[var41 & 255];
                    int var43 = var40 & 4095;
                    int var44 = this.field4012 * var38 >> 12;
                    int var45 = class78.field1250[var43];
                    int var46 = var41 + 1;
                    if (var39 <= var46) {
                        var46 = 0;
                    }
                    int var47 = 255 & this.field4011[255 & var46];
                    if (this.field4025 && ~(this.field4029 + -1) == ~var36) {
                        for (int var48 = 0; class49.field767 > var48; ++var48) {
                            int var49 = class211.field3510[var48] * this.field4012;
                            int var50 = this.method1591(var44, var42, (byte) -49, var47, var45, var43, var38 * var49 >> 12);
                            int var51 = (var37 * var50 >> 12) + arg0[var48];
                            arg0[var48] = 2048 - -(var51 >> 1);
                        }
                    } else {
                        for (int var52 = 0; ~var52 > ~class49.field767; ++var52) {
                            int var53 = class211.field3510[var52] * this.field4012;
                            int var54 = this.method1591(var44, var42, (byte) -90, var47, var45, var43, var38 * var53 >> 12);
                            arg0[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        int var2 = 67 % ((43 - arg0) / 41);
        this.field4011 = class240.method1650(127, this.field4023);
        this.method1586(-1158);
        ++field4021;
        for (int var3 = this.field4029 + -1; var3 >= 1; --var3) {
            short var4 = this.field4007[var3];
            if (var4 > 8 || ~var4 > 7) {
                return;
            }
            --this.field4029;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBIIII)I")
    private final int method1591(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4022;
        int var8 = arg5 + -4096;
        int var9 = arg6 >> 12;
        int var10 = var9 + 1;
        if (arg2 > -21) {
            this.field4011 = null;
        }
        if (~arg0 >= ~var10) {
            var10 = 0;
        }
        int var11 = arg6 & 4095;
        int var12 = var9 & 255;
        int var13 = class78.field1250[var11];
        int var14 = var10 & 255;
        int var15 = var11 - 4096;
        int var16 = this.field4011[arg1 + var12] & 3;
        int var17;
        if (~var16 < -2) {
            var17 = ~var16 != -3 ? -arg5 + -var11 : -arg5 + var11;
        } else {
            var17 = var16 != 0 ? arg5 - var11 : arg5 + var11;
        }
        int var18 = this.field4011[var14 - -arg1] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg5 + var15 : -var15 + arg5;
        } else {
            var19 = var18 == 2 ? -arg5 + var15 : -arg5 + -var15;
        }
        int var20 = this.field4011[arg3 + var12] & 3;
        int var21 = ((var19 - var17) * var13 >> 12) + var17;
        int var22;
        if (~var20 >= -2) {
            var22 = ~var20 == -1 ? var8 + var11 : -var11 + var8;
        } else {
            var22 = ~var20 != -3 ? -var8 + -var11 : -var8 + var11;
        }
        int var23 = this.field4011[arg3 + var14] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = var23 != 2 ? -var8 + -var15 : -var8 + var15;
        } else {
            var24 = var23 != 0 ? -var15 + var8 : var15 - -var8;
        }
        int var25 = ((-var22 + var24) * var13 >> 12) + var22;
        return ((-var21 + var25) * arg4 >> 12) + var21;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class230() {
        super(0, true);
    }
}
