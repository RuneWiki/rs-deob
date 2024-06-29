import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class114 extends class89 {

    @OriginalMember(owner = "client!me", name = "qb", descriptor = "Z")
    private volatile boolean field2132 = false;

    @OriginalMember(owner = "client!me", name = "zb", descriptor = "Z")
    private boolean field2141 = false;

    @OriginalMember(owner = "client!me", name = "yb", descriptor = "I")
    private int field2140 = -1;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "Lge;")
    private class61 field2121;

    @OriginalMember(owner = "client!me", name = "mb", descriptor = "Lge;")
    private class61 field2128;

    @OriginalMember(owner = "client!me", name = "pb", descriptor = "I")
    private int field2131;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "Lkb;")
    public static class93 field2114 = class76.method390("M", 0);

    @OriginalMember(owner = "client!me", name = "db", descriptor = "[I")
    public static int[] field2119 = new int[200];

    @OriginalMember(owner = "client!me", name = "kb", descriptor = "Lkb;")
    public static class93 field2126 = class76.method390(" )2> <col=ffff00>", 0);

    @OriginalMember(owner = "client!me", name = "vb", descriptor = "Lkb;")
    private static class93 field2137 = class76.method390("glow1:", 0);

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "Lkb;")
    public static class93 field2122 = field2137;

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "Lkb;")
    private static class93 field2124 = class76.method390("New User", 0);

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "Lkb;")
    public static class93 field2115 = field2124;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "Lkb;")
    public static class93 field2116 = field2137;

    @OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
    private int field2118;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!me", name = "rb", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!me", name = "tb", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!me", name = "ub", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!me", name = "wb", descriptor = "I")
    private int field2138;

    @OriginalMember(owner = "client!me", name = "xb", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!me", name = "Ab", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!me", name = "Bb", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!me", name = "Cb", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!me", name = "Db", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!me", name = "Eb", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!me", name = "lb", descriptor = "Lna;")
    public static class119 field2127;

    @OriginalMember(owner = "client!me", name = "sb", descriptor = "Loc;")
    public static class130 field2134;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "[Z")
    private volatile boolean[] field2117;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(II)I")
    private final int method624(int arg0, int arg1) {
        ++field2139;
        if (arg0 < 89) {
            return 94;
        } else if (super.field1625[arg1] != null) {
            return 100;
        } else {
            return this.field2117[arg1] ? 100 : class53.method286(arg1, this.field2131, 1572585255);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static void method625(int arg0) {
        field2127 = null;
        field2134 = null;
        if (arg0 == 128) {
            field2122 = null;
            field2126 = null;
            field2124 = null;
            field2137 = null;
            field2115 = null;
            field2119 = null;
            field2114 = null;
            field2116 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)V")
    public final void method453(int arg0, byte arg1) {
        ++field2143;
        class204.method1327(this.field2131, arg0, arg1 + -2);
        if (arg1 != 2) {
            this.field2132 = false;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(IB)V")
    public final void method467(int arg0, byte arg1) {
        if (this.field2128 != null && this.field2117 != null && this.field2117[arg0]) {
            class72.method381(this.field2128, this, arg0, -96);
        } else {
            class103.method572(0, arg0, true, this.field2131, (byte) 2, this, super.field1620[arg0]);
        }
        ++field2123;
        int var3 = -76 / ((57 - arg1) / 61);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lge;Lge;IZZZ)V")
    public class114(class61 arg0, class61 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2121 = arg1;
        this.field2141 = arg5;
        this.field2128 = arg0;
        this.field2131 = arg2;
        class115.method639(this.field2131, false, this);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)I")
    public final int method626(int arg0) {
        ++field2135;
        if (arg0 != 0) {
            method632(104);
        }
        if (this.field2132) {
            return 100;
        } else if (super.field1625 != null) {
            return 99;
        } else {
            int var2 = class53.method286(this.field2131, 255, 1572585255);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(II)Z")
    public static final boolean method627(int arg0, int arg1) {
        ++field2144;
        int var2 = -10 / ((arg1 - 21) / 39);
        return (arg0 & 1) != 0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZ)V")
    public final void method628(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field2132 = true;
        }
        this.field2118 = arg1;
        this.field2138 = arg0;
        if (this.field2121 != null) {
            class72.method381(this.field2121, this, this.field2131, -64);
        } else {
            class103.method572(0, this.field2131, true, 255, (byte) 0, this, this.field2118);
        }
        ++field2142;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z[BBZI)V")
    public final void method629(boolean arg0, byte[] arg1, byte arg2, boolean arg3, int arg4) {
        int var6 = 8 / ((-4 - arg2) / 34);
        ++field2136;
        if (arg0) {
            if (this.field2132) {
                throw new RuntimeException();
            } else {
                if (this.field2121 != null) {
                    class128.method727(arg1, this.field2121, this.field2131, 0);
                }
                this.method460(arg1, 144);
                this.method631((byte) -109);
            }
        } else {
            arg1[arg1.length + -2] = (byte) (super.field1608[arg4] >> 8);
            arg1[arg1.length + -1] = (byte) super.field1608[arg4];
            if (this.field2128 != null) {
                class128.method727(arg1, this.field2128, arg4, 0);
                this.field2117[arg4] = true;
            }
            if (arg3) {
                super.field1625[arg4] = class60.method311(arg1, false, -95);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)I")
    public final int method630(int arg0) {
        int var2 = 0;
        ++field2120;
        if (arg0 < 109) {
            return 33;
        } else {
            int var3 = 0;
            for (int var4 = 0; ~super.field1625.length < ~var4; ++var4) {
                if (super.field1619[var4] > 0) {
                    var3 += this.method624(97, var4);
                    var2 += 100;
                }
            }
            if (var2 == 0) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    private final void method631(byte arg0) {
        ++field2133;
        this.field2117 = new boolean[super.field1625.length];
        for (int var2 = 0; ~this.field2117.length < ~var2; ++var2) {
            this.field2117[var2] = false;
        }
        if (arg0 > -68) {
            this.method626(-107);
        }
        if (this.field2128 == null) {
            this.field2132 = true;
        } else {
            this.field2140 = -1;
            for (int var3 = 0; this.field2117.length > var3; ++var3) {
                if (super.field1619[var3] > 0) {
                    class64.method325(this, this.field2128, var3, 22);
                    this.field2140 = var3;
                }
            }
            if (~this.field2140 == 0) {
                this.field2132 = true;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
    public static final void method632(int arg0) {
        if (class82.field1504 <= 0) {
            if (~class101.field1867 >= -1) {
                for (int var1 = 0; ~var1 > -257; ++var1) {
                    class1.field27[var1] = class73.field1350[var1];
                }
            } else {
                for (int var2 = 0; ~var2 > -257; ++var2) {
                    if (class101.field1867 <= 768) {
                        if (class101.field1867 <= 256) {
                            class1.field27[var2] = class89.method447(16711935, -class101.field1867 + 256, class89.field1611[var2], class73.field1350[var2]);
                        } else {
                            class1.field27[var2] = class89.field1611[var2];
                        }
                    } else {
                        class1.field27[var2] = class89.method447(arg0 + -1992794601, -class101.field1867 + 1024, class73.field1350[var2], class89.field1611[var2]);
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (~class82.field1504 < -769) {
                    class1.field27[var3] = class89.method447(class29.method159(arg0, 2000265751), 1024 - class82.field1504, class73.field1350[var3], class34.field544[var3]);
                } else if (class82.field1504 > 256) {
                    class1.field27[var3] = class34.field544[var3];
                } else {
                    class1.field27[var3] = class89.method447(16711935, -class82.field1504 + 256, class34.field544[var3], class73.field1350[var3]);
                }
            }
        }
        ++field2130;
        short var4 = 256;
        int var5 = class145.field2825.field2446 * 9;
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; ~var8 > ~(var4 + -1); ++var8) {
            int var21 = (-var8 + var4) * class25.field382[var8] / var4 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var7 += var21;
            for (int var22 = var21; var22 < 128; ++var22) {
                int var24 = class145.field2825.field2450[var5++];
                int var25 = class64.field1029[var7++];
                if (var25 == 0) {
                    class97.field1794.field2450[var6++] = var24;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class1.field27[var25];
                    class97.field1794.field2450[var6++] = class91.method479(-16711936, var27 * class91.method479(16711935, var24) + var25 * class91.method479(16711935, var28)) + class91.method479(16711680, var27 * class91.method479(65280, var24) + class91.method479(65280, var28) * var25) >> 8;
                }
            }
            for (int var23 = 0; ~var21 < ~var23; ++var23) {
                class97.field1794.field2450[var6++] = class145.field2825.field2450[var5++];
            }
            var5 += class145.field2825.field2446 - 128;
        }
        int var9 = 0;
        class97.field1794.method745(0, 9);
        if (arg0 != 2009506536) {
            method633(-81, -95, 105, -93, 81);
        }
        int var10 = 0;
        int var11 = class145.field2825.field2446 * 9 + 128;
        for (int var12 = 1; ~(var4 - 1) < ~var12; ++var12) {
            int var13 = (-var12 + var4) * class25.field382[var12] / var4 + 22;
            if (~var13 > -1) {
                var13 = 0;
            }
            for (int var14 = 0; ~var14 > ~var13; ++var14) {
                int var10001 = var10++;
                --var11;
                class47.field759.field2450[var10001] = class145.field2825.field2450[var11];
            }
            for (int var15 = var13; var15 < 128; ++var15) {
                --var11;
                int var16 = class145.field2825.field2450[var11];
                int var17 = class64.field1029[var9++];
                if (~var17 == -1) {
                    class47.field759.field2450[var10++] = var16;
                } else {
                    int var19 = -var17 + 256;
                    int var20 = class1.field27[var17];
                    class47.field759.field2450[var10++] = class91.method479(var19 * class91.method479(16711935, var16) + var17 * class91.method479(var20, 16711935), -16711936) + class91.method479(class91.method479(var20, 65280) * var17 - -(var19 * class91.method479(65280, var16)), 16711680) >> 8;
                }
            }
            var9 += var13;
            var11 += class145.field2825.field2446 - -128;
        }
        class47.field759.method745(637, 9);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
    public static final void method633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2146;
        class118.method656(arg1, arg0, arg1 + arg2, arg0 + arg3);
        class150.method918();
        ++class49.field793;
        class49.method262(true, -51);
        class30.method177(true, true);
        class49.method262(false, -51);
        class30.method177(false, true);
        class93.method488((byte) 75);
        class55.method302(-129);
        if (!class140.field2721) {
            int var5 = class113.field2108;
            int var6 = 2047 & class30.field510 + class160.field3217;
            if (var5 < class82.field1508 / 256) {
                var5 = class82.field1508 / 256;
            }
            if (class189.field3697[4] && class37.field628[4] + 128 > var5) {
                var5 = class37.field628[4] - -128;
            }
            class64.method329(-123, var5, class203.field3926, var5 * 3 + 600, class4.field70, -50 + class189.method1226(class106.field1940.field2045, -1, class106.field1940.field2032, field2145), var6);
        }
        int var7;
        if (class140.field2721) {
            var7 = class36.method199((byte) 112);
        } else {
            var7 = class85.method433(arg4 + 6911);
        }
        int var8 = class184.field3629;
        int var9 = class152.field2939;
        int var10 = class108.field1965;
        int var11 = class81.field1497;
        int var12 = class141.field2763;
        for (int var13 = 0; var13 < 5; ++var13) {
            if (class189.field3697[var13]) {
                int var16 = (int) ((double) (class49.field788[var13] * 2 - -1) * Math.random() - (double) class49.field788[var13] + Math.sin((double) class24.field369[var13] / 100.0D * (double) class93.field1709[var13]) * (double) class37.field628[var13]);
                if (var13 == 1) {
                    class108.field1965 += var16;
                }
                if (var13 == 4) {
                    class184.field3629 += var16;
                    if (class184.field3629 < 128) {
                        class184.field3629 = 128;
                    }
                    if (class184.field3629 > 383) {
                        class184.field3629 = 383;
                    }
                }
                if (var13 == 2) {
                    class81.field1497 += var16;
                }
                if (~var13 == -4) {
                    class141.field2763 = 2047 & class141.field2763 - -var16;
                }
                if (var13 == 0) {
                    class152.field2939 += var16;
                }
            }
        }
        int var14 = class97.field1826;
        int var15 = class170.field3380;
        if (var14 >= arg1 && ~var14 > ~(arg1 + arg2) && arg0 <= var15 && arg0 + arg3 > var15) {
            class52.field870 = 0;
            class52.field868 = true;
            class52.field859 = -arg1 + class97.field1826;
            class52.field850 = -arg0 + class170.field3380;
        } else {
            class52.field868 = false;
            class52.field870 = 0;
        }
        class201.method1316(0);
        class118.method651(arg1, arg0, arg2, arg3, 0);
        class201.method1316(0);
        class175.field3458.method836(class152.field2939, class108.field1965, class81.field1497, class184.field3629, class141.field2763, var7);
        class201.method1316(0);
        class175.field3458.method840();
        class29.method162(arg0, false, arg2, arg1, arg3);
        class106.method585(arg1, (byte) -7, arg0);
        ((class200) class150.field2894).method1309(56, class24.field363);
        class182.method1188(arg1, -2, arg2, arg3, arg0);
        class184.field3629 = var8;
        class108.field1965 = var10;
        class141.field2763 = var12;
        class81.field1497 = var11;
        if (arg4 == -128) {
            class152.field2939 = var9;
            if (class69.field1270 && class77.method395(false, true, -75) == 0) {
                class69.field1270 = false;
            }
            if (class69.field1270) {
                class118.method651(arg1, arg0, arg2, arg3, 0);
                class157.method1024(class34.field542, false, 250);
            }
            if (!class69.field1270 && !class121.field2241 && ~arg1 >= ~var14 && arg1 + arg2 > var14 && ~var15 <= ~arg0 && var15 < arg0 + arg3) {
                class112.method606(true, var14, arg1, arg0, var15);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lge;I[BIZ)V")
    public final void method634(class61 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        ++field2125;
        if (this.field2121 == arg0) {
            if (this.field2132) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class103.method572(0, this.field2131, true, 255, (byte) 0, this, this.field2118);
                return;
            }
            class112.field2080.reset();
            class112.field2080.update(arg2, 0, arg2.length);
            int var6 = (int) class112.field2080.getValue();
            class158 var7 = new class158(class15.method90(98, arg2));
            int var8 = var7.method1054(128);
            if (var8 != 5 && ~var8 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var8);
            }
            int var9 = 0;
            if (~var8 <= -7) {
                var9 = var7.method1076(arg1 ^ -24022);
            }
            if (this.field2118 != var6 || this.field2138 != var9) {
                class103.method572(0, this.field2131, true, 255, (byte) 0, this, this.field2118);
                return;
            }
            this.method460(arg2, 144);
            this.method631((byte) -122);
        } else {
            if (!arg4 && ~this.field2140 == ~arg3) {
                this.field2132 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2117[arg3] = false;
                if (this.field2141 || arg4) {
                    class103.method572(0, arg3, arg4, this.field2131, (byte) 2, this, super.field1620[arg3]);
                }
                return;
            }
            class112.field2080.reset();
            class112.field2080.update(arg2, 0, arg2.length + -2);
            int var10 = (int) class112.field2080.getValue();
            int var11 = (arg2[arg2.length + -2] << 8 & 65280) + (arg2[arg2.length + -1] & 255);
            if (~super.field1620[arg3] != ~var10 || super.field1608[arg3] != var11) {
                this.field2117[arg3] = false;
                if (this.field2141 || arg4) {
                    class103.method572(0, arg3, arg4, this.field2131, (byte) 2, this, super.field1620[arg3]);
                }
                return;
            }
            this.field2117[arg3] = true;
            if (arg4) {
                super.field1625[arg3] = class60.method311(arg2, false, -54);
            }
        }
        if (arg1 != -769) {
            field2124 = null;
        }
    }
}
