import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class49 extends class89 {

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "[B")
    private byte[] field834 = new byte[512];

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "I")
    private int field840 = 0;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    private int field841 = 1638;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    private int field833 = 4;

    @OriginalMember(owner = "client!bk", name = "hb", descriptor = "I")
    private int field849 = 4;

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "Z")
    private boolean field848 = true;

    @OriginalMember(owner = "client!bk", name = "mb", descriptor = "I")
    private int field854 = 4;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "Lha;")
    public static class46 field838 = class271.method1828("details", -46);

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "Lha;")
    public static class46 field835 = class271.method1828("(U2", -46);

    @OriginalMember(owner = "client!bk", name = "ib", descriptor = "Lha;")
    public static class46 field850 = class271.method1828("Starte 3D)2Softwarebibliothek)3", -46);

    @OriginalMember(owner = "client!bk", name = "lb", descriptor = "Lha;")
    public static class46 field853 = class271.method1828("blinken3:", -46);

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!bk", name = "jb", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!bk", name = "nb", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "[S")
    private short[] field847;

    @OriginalMember(owner = "client!bk", name = "kb", descriptor = "[S")
    private short[] field852;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[II)V")
    private final void method360(int arg0, int[] arg1, int arg2) {
        ++field845;
        int var4 = class87.field1652[arg2] * this.field854;
        if (arg0 == 19960) {
            if (~this.field833 != -2) {
                short var5 = this.field852[0];
                if (var5 > 8 || ~var5 > 7) {
                    int var6 = this.field847[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = this.field849 * var6 >> 12;
                    int var9 = var7 >> 12;
                    int var10 = this.field834[var9 & 255] & 255;
                    int var11 = this.field854 * var6 >> 12;
                    int var12 = var7 & 4095;
                    int var13 = class7.field117[var12];
                    int var14 = var9 + 1;
                    if (~var11 >= ~var14) {
                        var14 = 0;
                    }
                    int var15 = this.field834[var14 & 255] & 255;
                    for (int var16 = 0; var16 < class241.field4284; ++var16) {
                        int var36 = class259.field4523[var16] * this.field849;
                        int var37 = this.method364(var13, var15, (byte) -114, var10, var8, var12, var6 * var36 >> 12);
                        arg1[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~this.field833 < ~var17; ++var17) {
                    short var18 = this.field852[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field847[var17] << 12;
                        int var20 = var4 * var19 >> 12;
                        int var21 = this.field854 * var19 >> 12;
                        int var22 = var20 >> 12;
                        int var23 = this.field849 * var19 >> 12;
                        int var24 = var20 & 4095;
                        int var25 = var22 + 1;
                        int var26 = class7.field117[var24];
                        if (~var25 <= ~var21) {
                            var25 = 0;
                        }
                        int var27 = this.field834[255 & var22] & 255;
                        int var28 = this.field834[var25 & 255] & 255;
                        if (this.field848 && this.field833 - 1 == var17) {
                            for (int var29 = 0; var29 < class241.field4284; ++var29) {
                                int var30 = class259.field4523[var29] * this.field849;
                                int var31 = this.method364(var26, var28, (byte) -66, var27, var23, var24, var19 * var30 >> 12);
                                int var32 = (var18 * var31 >> 12) + arg1[var29];
                                arg1[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~class241.field4284; ++var33) {
                                int var34 = class259.field4523[var33] * this.field849;
                                int var35 = this.method364(var26, var28, (byte) -99, var27, var23, var24, var19 * var34 >> 12);
                                arg1[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field852[0];
                int var39 = this.field847[0] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = var40 >> 12;
                int var42 = this.field834[var41 & 255] & 255;
                int var43 = var40 & 4095;
                int var44 = class7.field117[var43];
                int var45 = this.field854 * var39 >> 12;
                int var46 = this.field849 * var39 >> 12;
                int var47 = var41 - -1;
                if (var47 >= var45) {
                    var47 = 0;
                }
                int var48 = 255 & this.field834[255 & var47];
                if (this.field848) {
                    for (int var49 = 0; var49 < class241.field4284; ++var49) {
                        int var50 = class259.field4523[var49] * this.field849;
                        int var51 = this.method364(var44, var48, (byte) -94, var42, var46, var43, var39 * var50 >> 12);
                        int var52 = var38 * var51 >> 12;
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; class241.field4284 > var53; ++var53) {
                        int var54 = class259.field4523[var53] * this.field849;
                        int var55 = this.method364(var44, var48, (byte) -73, var42, var46, var43, var39 * var54 >> 12);
                        arg1[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        this.field834 = class10.method53(0, this.field840);
        this.method363(0);
        if (!arg0) {
            this.field847 = null;
        }
        for (int var2 = this.field833 + -1; var2 >= 1; --var2) {
            short var3 = this.field852[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field833;
        }
        ++field844;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class49() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field846;
        int[] var3 = super.field1688.method936(1, arg0);
        int var4 = -31 / ((51 - arg1) / 44);
        if (super.field1688.field2200) {
            this.method360(19960, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)V")
    public static void method361(byte arg0) {
        if (arg0 != -113) {
            method365((byte) 98);
        }
        field850 = null;
        field835 = null;
        field838 = null;
        field853 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (~class31.field585 == -1) {
            int var7 = class144.field2623;
            ++class174.field3125;
            int var8 = class52.field897;
            int var9 = class20.field269;
            int var10 = class261.field4546;
            int var11 = (-arg6 + arg0) * (-var10 + var9) / arg1 + var10;
            int var12 = (arg2 - arg4) * (-var7 + var8) / arg3 + var7;
            if (class187.field3339 && (class248.field4382 & 64) == 64) {
                class24 var13 = class108.method841(class194.field3477, class275.field4793, -1);
                if (var13 == null) {
                    class20.method103(120);
                } else {
                    class39.method267((short) 15, class64.field1083, var11, class216.field3832, var12, 0L, -1);
                }
            } else {
                class39.method267((short) 6, class268.field4634, var11, class85.field1613, var12, 0L, -1);
            }
        }
        ++field855;
        long var14 = -1L;
        for (int var16 = 0; class263.field4568 > var16; ++var16) {
            long var17 = class38.field677[var16];
            int var19 = 127 & (int) var17;
            int var20 = (int) var17 >> 7 & 127;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var22 = ((int) var17 & 1766090285) >> 29;
            if (var14 != var17) {
                var14 = var17;
                if (~var22 == -3 && class251.method1704(class135.field2450, var19, var20, var17)) {
                    class236 var23 = class157.method1158(var21, 123);
                    if (var23.field4142 != null) {
                        var23 = var23.method1610(-22);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (~class31.field585 == -2) {
                        ++class222.field3901;
                        class39.method267((short) 1, class89.field1687, var20, class109.method855(0, new class46[] { class32.field606, class92.field1720, var23.field4111 }), var19, var17, -1);
                    } else if (!class187.field3339) {
                        ++class105.field1891;
                        class46[] var24 = var23.field4145;
                        if (class156.field2795) {
                            var24 = class141.method1070(123, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; --var25) {
                                if (var24[var25] != null) {
                                    short var26 = 0;
                                    ++class149.field2671;
                                    if (var25 == 0) {
                                        var26 = 13;
                                    }
                                    if (~var25 == -2) {
                                        var26 = 23;
                                    }
                                    if (~var25 == -3) {
                                        var26 = 58;
                                    }
                                    if (~var25 == -4) {
                                        var26 = 4;
                                    }
                                    if (~var25 == -5) {
                                        var26 = 1003;
                                    }
                                    class39.method267(var26, var24[var25], var20, class109.method855(0, new class46[] { class198.field3556, var23.field4111 }), var19, var17, -1);
                                }
                            }
                        }
                        class39.method267((short) 1006, class202.field3622, var20, class109.method855(0, new class46[] { class198.field3556, var23.field4111 }), var19, (long) var23.field4146, -1);
                    } else if ((class248.field4382 & 4) == 4) {
                        ++class186.field3330;
                        class39.method267((short) 12, class64.field1083, var20, class109.method855(0, new class46[] { class16.field232, class92.field1720, var23.field4111 }), var19, var17, -1);
                    }
                }
                if (~var22 == -2) {
                    class26 var27 = class2.field29[var21];
                    if (var27.field511.field1440 == 1 && (127 & var27.field2585) == 64 && ~(127 & var27.field2546) == -65) {
                        for (int var28 = 0; var28 < class51.field888; ++var28) {
                            class26 var31 = class2.field29[class33.field612[var28]];
                            if (var31 != null && var27 != var31 && ~var31.field511.field1440 == -2 && var27.field2585 == var31.field2585 && var27.field2546 == var31.field2546) {
                                class216.method1512(var31.field511, var19, class33.field612[var28], var20, -1);
                            }
                        }
                        for (int var29 = 0; ~var29 > ~class156.field2783; ++var29) {
                            class81 var30 = class1.field6[class129.field2373[var29]];
                            if (var30 != null && ~var27.field2585 == ~var30.field2585 && ~var27.field2546 == ~var30.field2546) {
                                class20.method106(var30, var20, (byte) 108, var19, class129.field2373[var29]);
                            }
                        }
                    }
                    class216.method1512(var27.field511, var19, var21, var20, -1);
                }
                if (var22 == 0) {
                    class81 var32 = class1.field6[var21];
                    if (~(var32.field2585 & 127) == -65 && ~(127 & var32.field2546) == -65) {
                        for (int var33 = 0; var33 < class51.field888; ++var33) {
                            class26 var36 = class2.field29[class33.field612[var33]];
                            if (var36 != null && var36.field511.field1440 == 1 && var32.field2585 == var36.field2585 && ~var32.field2546 == ~var36.field2546) {
                                class216.method1512(var36.field511, var19, class33.field612[var33], var20, -1);
                            }
                        }
                        for (int var34 = 0; ~var34 > ~class156.field2783; ++var34) {
                            class81 var35 = class1.field6[class129.field2373[var34]];
                            if (var35 != null && var32 != var35 && ~var32.field2585 == ~var35.field2585 && var32.field2546 == var35.field2546) {
                                class20.method106(var35, var20, (byte) -97, var19, class129.field2373[var34]);
                            }
                        }
                    }
                    class20.method106(var32, var20, (byte) 126, var19, var21);
                }
                if (var22 == 3) {
                    class39 var37 = class103.field1874[class135.field2450][var19][var20];
                    if (var37 != null) {
                        for (class254 var38 = (class254) var37.method262((byte) 125); var38 != null; var38 = (class254) var37.method270(true)) {
                            int var39 = var38.field4456.field2609;
                            class71 var40 = class80.method633(var39, 0);
                            if (~class31.field585 == -2) {
                                class39.method267((short) 29, class89.field1687, var20, class109.method855(0, new class46[] { class32.field606, class217.field3842, var40.field1213 }), var19, (long) var39, -1);
                                ++class180.field3218;
                            } else if (class187.field3339) {
                                if ((1 & class248.field4382) == 1) {
                                    ++class197.field3524;
                                    class39.method267((short) 37, class64.field1083, var20, class109.method855(0, new class46[] { class16.field232, class217.field3842, var40.field1213 }), var19, (long) var39, -1);
                                }
                            } else {
                                ++class78.field1443;
                                class46[] var41 = var40.field1220;
                                if (class156.field2795) {
                                    var41 = class141.method1070(112, var41);
                                }
                                for (int var42 = 4; ~var42 <= -1; --var42) {
                                    if (var41 != null && var41[var42] != null) {
                                        ++class111.field2102;
                                        byte var43 = 0;
                                        if (~var42 == -1) {
                                            var43 = 19;
                                        }
                                        if (~var42 == -2) {
                                            var43 = 9;
                                        }
                                        if (~var42 == -3) {
                                            var43 = 57;
                                        }
                                        if (~var42 == -4) {
                                            var43 = 14;
                                        }
                                        if (~var42 == -5) {
                                            var43 = 36;
                                        }
                                        class39.method267(var43, var41[var42], var20, class109.method855(0, new class46[] { class95.field1776, var40.field1213 }), var19, (long) var39, -1);
                                    } else if (var42 == 2) {
                                        class39.method267((short) 57, class206.field3690, var20, class109.method855(0, new class46[] { class95.field1776, var40.field1213 }), var19, (long) var39, -1);
                                        ++class200.field3576;
                                    }
                                }
                                class39.method267((short) 1002, class202.field3622, var20, class109.method855(0, new class46[] { class95.field1776, var40.field1213 }), var19, (long) var39, -1);
                            }
                        }
                    }
                }
            }
        }
        if (arg5 <= 66) {
            method362(11, -103, -16, 86, -19, (byte) -101, -49);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 == -641641492) {
            ++field839;
            if (arg2 != 0) {
                if (arg2 == 1) {
                    this.field833 = arg0.method558(1);
                } else {
                    if (arg2 != 2) {
                        if (~arg2 == -4) {
                            this.field849 = this.field854 = arg0.method558(1);
                            return;
                        }
                        if (arg2 == 4) {
                            this.field840 = arg0.method558(arg1 + 641641493);
                            return;
                        }
                        if (arg2 == 5) {
                            this.field849 = arg0.method558(1);
                            return;
                        }
                        if (arg2 == 6) {
                            this.field854 = arg0.method558(arg1 + 641641493);
                            return;
                        }
                    } else {
                        this.field841 = arg0.method591(true);
                        if (~this.field841 > -1) {
                            this.field852 = new short[this.field833];
                            for (int var5 = 0; ~var5 > ~this.field833; ++var5) {
                                this.field852[var5] = (short) arg0.method591(true);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field848 = arg0.method558(1) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    private final void method363(int arg0) {
        if (arg0 != 0) {
            field835 = null;
        }
        if (~this.field841 < -1) {
            this.field852 = new short[this.field833];
            this.field847 = new short[this.field833];
            for (int var2 = 0; ~this.field833 < ~var2; ++var2) {
                this.field852[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field841 / 4096.0F), (double) var2)));
                this.field847[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field852 != null && this.field852.length == this.field833) {
            this.field847 = new short[this.field833];
            for (int var3 = 0; var3 < this.field833; ++var3) {
                this.field847[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field843;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBIIII)I")
    private final int method364(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= -52) {
            this.method8(false);
        }
        ++field837;
        int var8 = arg5 - 4096;
        int var9 = arg6 >> 12;
        int var10 = var9 + 1;
        int var11 = arg6 & 4095;
        int var12 = var9 & 255;
        int var13 = var11 + -4096;
        if (arg4 <= var10) {
            var10 = 0;
        }
        int var14 = this.field834[arg3 + var12] & 3;
        int var15 = class7.field117[var11];
        int var16 = var10 & 255;
        int var17;
        if (var14 <= 1) {
            var17 = var14 == 0 ? arg5 + var11 : -var11 + arg5;
        } else {
            var17 = var14 == 2 ? -arg5 + var11 : -var11 - arg5;
        }
        int var18 = this.field834[arg3 + var16] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 != 0 ? arg5 - var13 : arg5 + var13;
        } else {
            var19 = var18 != 2 ? -arg5 + -var13 : -arg5 + var13;
        }
        int var20 = this.field834[arg1 + var12] & 3;
        int var21 = var17 - -((var19 - var17) * var15 >> 12);
        int var22;
        if (~var20 >= -2) {
            var22 = var20 != 0 ? -var11 + var8 : var8 + var11;
        } else {
            var22 = var20 != 2 ? -var11 - var8 : -var8 + var11;
        }
        int var23 = 3 & this.field834[arg1 + var16];
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 != -3 ? -var8 + -var13 : -var8 + var13;
        } else {
            var24 = ~var23 == -1 ? var8 + var13 : -var13 + var8;
        }
        int var25 = ((var24 - var22) * var15 >> 12) + var22;
        return ((-var21 + var25) * arg0 >> 12) + var21;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(B)V")
    public static final void method365(byte arg0) {
        ++field851;
        if (class260.field4541 == null || class142.field2594 == null) {
            class142.field2594 = new int[256];
            class260.field4541 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class260.field4541[var1] = (int) (4096.0D * Math.sin(var2));
                class142.field2594[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 <= 121) {
            method361((byte) 115);
        }
    }
}
