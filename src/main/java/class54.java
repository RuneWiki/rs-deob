import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class54 extends class1 {

    @OriginalMember(owner = "client!ei", name = "ob", descriptor = "I")
    private int field1091 = -1;

    @OriginalMember(owner = "client!ei", name = "vb", descriptor = "[J")
    public static long[] field1098 = new long[256];

    @OriginalMember(owner = "client!ei", name = "zb", descriptor = "Loc;")
    private static class151 field1102;

    @OriginalMember(owner = "client!ei", name = "Bb", descriptor = "Loc;")
    public static class151 field1104;

    @OriginalMember(owner = "client!ei", name = "xb", descriptor = "Loc;")
    public static class151 field1100;

    @OriginalMember(owner = "client!ei", name = "gb", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!ei", name = "hb", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ei", name = "ib", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ei", name = "jb", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ei", name = "kb", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ei", name = "lb", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ei", name = "mb", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ei", name = "nb", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ei", name = "pb", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ei", name = "qb", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ei", name = "rb", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ei", name = "sb", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ei", name = "ub", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!ei", name = "Ab", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ei", name = "yb", descriptor = "Luf;")
    public static class214 field1101;

    @OriginalMember(owner = "client!ei", name = "wb", descriptor = "Ljava/awt/Font;")
    public static Font field1099;

    @OriginalMember(owner = "client!ei", name = "tb", descriptor = "[I")
    public int[] field1096;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg0 == 0) {
            if (~arg1 == -1) {
                this.field1091 = arg2.method1490((byte) 73);
            }
            ++field1086;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)V")
    public static final void method367(int arg0, int arg1) {
        ++field1084;
        int[] var2 = class216.field3775.field1590;
        int var3 = var2.length;
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            var2[var4] = 1;
        }
        for (int var5 = 1; ~var5 > -104; ++var5) {
            int var21 = 24628 - -((52736 - var5 * 512) * 4);
            for (int var22 = 1; var22 < 103; ++var22) {
                if (~(class122.field2191[arg0][var22][var5] & 24) == -1) {
                    class115.method697(var2, var21, 512, arg0, var22, var5);
                }
                if (~arg0 > -4 && ~(class122.field2191[arg0 + 1][var22][var5] & 8) != -1) {
                    class115.method697(var2, var21, 512, arg0 + 1, var22, var5);
                }
                var21 += 4;
            }
        }
        class216.field3775.method533();
        int var6 = -10 - (-238 - (int) (20.0D * Math.random()) - ((-10 + (int) (Math.random() * 20.0D) + 238 << 16) + ((int) (20.0D * Math.random()) + 228 << 8)));
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; ++var8) {
            for (int var20 = 1; var20 < 103; ++var20) {
                if ((class122.field2191[arg0][var20][var8] & 24) == 0) {
                    class40.method291(var8, arg0, -3, var20, var6, var7);
                }
                if (~arg0 > -4 && ~(class122.field2191[arg0 + 1][var20][var8] & 8) != -1) {
                    class40.method291(var8, arg0 + 1, -3, var20, var6, var7);
                }
            }
        }
        class44.field921 = 0;
        if (arg1 < -21) {
            for (int var9 = 0; ~var9 > -105; ++var9) {
                for (int var10 = 0; var10 < 104; ++var10) {
                    long var11 = class28.method219(class234.field4325, var9, var10);
                    if (var11 != 0L) {
                        class93 var13 = class5.method32((byte) 74, (int) (var11 >>> 32) & Integer.MAX_VALUE);
                        int var14 = var13.field1708;
                        if (var14 >= 0) {
                            int var15 = var9;
                            int var16 = var10;
                            if (var14 != 22 && var14 != 29 && ~var14 != -35 && var14 != 36 && ~var14 != -47 && var14 != 47 && ~var14 != -49) {
                                int[][] var17 = class95.field1768[class234.field4325].field2512;
                                for (int var18 = 0; ~var18 > -11; ++var18) {
                                    int var19 = (int) (4.0D * Math.random());
                                    if (~var19 == -1 && var15 > 0 && var9 - 3 < var15 && (19661064 & var17[var15 + -1][var16]) == 0) {
                                        --var15;
                                    }
                                    if (~var19 == -2 && var15 < 103 && ~(var9 + 3) < ~var15 && ~(19661184 & var17[var15 + 1][var16]) == -1) {
                                        ++var15;
                                    }
                                    if (var19 == 2 && ~var16 < -1 && var10 + -3 < var16 && (var17[var15][var16 + -1] & 19661058) == 0) {
                                        --var16;
                                    }
                                    if (~var19 == -4 && ~var16 > -104 && var16 < var10 + 3 && ~(var17[var15][var16 + 1] & 19661088) == -1) {
                                        ++var16;
                                    }
                                }
                            }
                            class116.field2099[class44.field921] = var13.field1709;
                            class74.field1432[class44.field921] = var15;
                            class206.field3653[class44.field921] = var16;
                            ++class44.field921;
                        }
                    }
                }
            }
            class215.field3764.method1217((byte) 94);
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    public static void method368(int arg0) {
        field1100 = null;
        if (arg0 == 29392) {
            field1102 = null;
            field1099 = null;
            field1098 = null;
            field1101 = null;
            field1104 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)La;")
    public static final class1 method369(int arg0, byte arg1) {
        ++field1088;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (arg0 != 8) {
                                            if (arg0 != 9) {
                                                if (arg0 != 10) {
                                                    if (arg0 != 11) {
                                                        if (~arg0 != -13) {
                                                            if (~arg0 != -14) {
                                                                if (arg0 != 14) {
                                                                    if (~arg0 != -16) {
                                                                        if (arg0 != 16) {
                                                                            if (arg0 != 17) {
                                                                                if (~arg0 != -19) {
                                                                                    if (~arg0 != -20) {
                                                                                        if (~arg0 != -21) {
                                                                                            if (arg0 != 21) {
                                                                                                if (~arg0 != -23) {
                                                                                                    if (arg0 != 23) {
                                                                                                        if (arg0 != 24) {
                                                                                                            if (~arg0 != -26) {
                                                                                                                if (arg0 != 26) {
                                                                                                                    if (arg0 != 27) {
                                                                                                                        if (arg0 != 28) {
                                                                                                                            if (arg0 != 29) {
                                                                                                                                if (~arg0 != -31) {
                                                                                                                                    if (~arg0 != -32) {
                                                                                                                                        if (~arg0 != -33) {
                                                                                                                                            if (arg0 != 33) {
                                                                                                                                                if (~arg0 != -35) {
                                                                                                                                                    if (arg0 != 35) {
                                                                                                                                                        if (arg0 != 36) {
                                                                                                                                                            if (~arg0 != -38) {
                                                                                                                                                                if (arg0 != 38) {
                                                                                                                                                                    if (arg0 == 39) {
                                                                                                                                                                        return new class54();
                                                                                                                                                                    } else {
                                                                                                                                                                        if (arg1 >= -71) {
                                                                                                                                                                            method373(8, 43);
                                                                                                                                                                        }
                                                                                                                                                                        return null;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class71();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class50();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class14();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class204();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class137();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class113();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class179();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class53();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class81();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class190();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class28();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class222();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class7();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class114();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class150();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class121();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class237();
                                                                                                }
                                                                                            } else {
                                                                                                return new class48();
                                                                                            }
                                                                                        } else {
                                                                                            return new class57();
                                                                                        }
                                                                                    } else {
                                                                                        return new class51();
                                                                                    }
                                                                                } else {
                                                                                    return new class56();
                                                                                }
                                                                            } else {
                                                                                return new class196();
                                                                            }
                                                                        } else {
                                                                            return new class9();
                                                                        }
                                                                    } else {
                                                                        return new class59();
                                                                    }
                                                                } else {
                                                                    return new class111();
                                                                }
                                                            } else {
                                                                return new class189();
                                                            }
                                                        } else {
                                                            return new class133();
                                                        }
                                                    } else {
                                                        return new class92();
                                                    }
                                                } else {
                                                    return new class155();
                                                }
                                            } else {
                                                return new class176();
                                            }
                                        } else {
                                            return new class148();
                                        }
                                    } else {
                                        return new class26();
                                    }
                                } else {
                                    return new class89();
                                }
                            } else {
                                return new class103();
                            }
                        } else {
                            return new class153();
                        }
                    } else {
                        return new class200();
                    }
                } else {
                    return new class208();
                }
            } else {
                return new class134();
            }
        } else {
            return new class130();
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class54() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V")
    public static final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1092;
        if (~arg4 < ~arg1) {
            for (int var5 = arg1; ~arg4 < ~var5; ++var5) {
                class43.field887[var5][arg2] = arg3;
            }
        } else {
            for (int var6 = arg4; var6 < arg1; ++var6) {
                class43.field887[var6][arg2] = arg3;
            }
        }
        if (arg0 != 35) {
            field1099 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)Z")
    public final boolean method371(boolean arg0) {
        ++field1089;
        if (this.field1096 != null) {
            return true;
        } else if (this.field1091 >= 0) {
            class84 var2 = class1.method6(-93, this.field1091, class200.field3543);
            var2.method538();
            this.field1083 = var2.field1591;
            this.field1096 = var2.field1590;
            this.field1097 = var2.field1586;
            return true;
        } else {
            return !arg0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJ)V")
    public static final void method372(int arg0, long arg1) {
        ++field1093;
        if (arg1 != 0L) {
            if ((~class36.field758 > -101 || ~class64.field1246 == -2) && ~class36.field758 > -201) {
                class151 var3 = class155.method1016(0, arg1).method994(-112);
                for (int var4 = 0; class36.field758 > var4; ++var4) {
                    if (~class233.field4290[var4] == ~arg1) {
                        client.method246(0, (byte) -85, class134.field2441, class126.method761(new class151[] { var3, class79.field1527 }, 10260));
                        return;
                    }
                }
                for (int var5 = 0; class32.field658 > var5; ++var5) {
                    if (class224.field3909[var5] == arg1) {
                        client.method246(0, (byte) -94, class134.field2441, class126.method761(new class151[] { class45.field931, var3, class170.field3102 }, 10260));
                        return;
                    }
                }
                if (var3.method976(48, class228.field3975.field416)) {
                    client.method246(0, (byte) -118, class134.field2441, class169.field3084);
                } else {
                    ++class11.field205;
                    class146.field2616[class36.field758] = var3;
                    class233.field4290[class36.field758] = arg1;
                    class9.field138[class36.field758] = arg0;
                    class57.field1147[class36.field758] = class134.field2441;
                    class50.field1014[class36.field758] = 0;
                    class75.field1441 = class1.field35;
                    ++class36.field758;
                    class48.field984.method650(-13721, 52);
                    class48.field984.method1458((byte) 77, arg1);
                }
            } else {
                client.method246(0, (byte) -120, class134.field2441, class53.field1076);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[[I")
    public int[][] method14(int arg0, int arg1) {
        if (arg1 != -81) {
            this.field1091 = -103;
        }
        ++field1095;
        int[][] var3 = super.field13.method578(arg0, -1);
        if (super.field13.field1658 && this.method371(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = this.field1097 * (~class129.field2354 != ~this.field1083 ? this.field1083 * arg0 / class129.field2354 : arg0);
            int[] var7 = var3[2];
            if (~class202.field3603 != ~this.field1097) {
                for (int var8 = 0; var8 < class202.field3603; ++var8) {
                    int var9 = this.field1097 * var8 / class202.field3603;
                    int var10 = this.field1096[var6 + var9];
                    var7[var8] = class26.method206(var10, 255) << 4;
                    var5[var8] = class26.method206(65280, var10) >> 4;
                    var4[var8] = class26.method206(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class202.field3603 > var11; ++var11) {
                    int var12 = this.field1096[var6++];
                    var7[var11] = class26.method206(4080, var12 << 4);
                    var5[var11] = class26.method206(4080, var12 >> 4);
                    var4[var11] = class26.method206(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
    public final void method7(byte arg0) {
        ++field1087;
        super.method7(arg0);
        this.field1096 = null;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)I")
    public final int method10(byte arg0) {
        ++field1090;
        if (arg0 < 77) {
            field1099 = null;
        }
        return this.field1091;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(II)I")
    public static final int method373(int arg0, int arg1) {
        int var7 = arg0 - 1;
        ++field1094;
        int var2 = var7 | var7 >>> 1;
        if (arg1 < 53) {
            return -66;
        } else {
            int var3 = var2 | var2 >>> 2;
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 - -1;
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)Lcb;")
    public static final class25 method374(byte arg0) {
        if (class132.field2417 == null) {
            class132.field2417 = new class25();
        }
        if (arg0 != -17) {
            method374((byte) -71);
        }
        ++field1085;
        return class132.field2417;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if (~(1L & var1) == -2L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field1098[var0] = var1;
        }
        field1102 = class137.method873(2, "M");
        field1104 = field1102;
        field1100 = field1102;
    }
}
