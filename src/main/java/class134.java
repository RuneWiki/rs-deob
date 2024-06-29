import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class134 extends class196 {

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "[S")
    private short[] field2226 = new short[257];

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "I")
    private int field2241 = 0;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "Ldf;")
    private static class51 field2232 = class46.method233(" more options", 100);

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public static int field2237 = 0;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "Ldf;")
    public static class51 field2240 = field2232;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "Ldf;")
    public static class51 field2233 = class46.method233("3D)2Softwarebibliothek gestartet)3", 100);

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "Lu;")
    public static class111 field2225;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "[I")
    private int[] field2229;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "[I")
    private int[] field2235;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "[[I")
    private int[][] field2227;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([[II)V")
    public static final void method977(int[][] arg0, int arg1) {
        class80.field1324 = arg0;
        int var2 = -113 / ((56 - arg1) / 46);
        ++field2224;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
    private final void method978(int arg0) {
        int var2 = this.field2241;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field2227.length - 1 && ~var4 <= ~this.field2227[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2227[var5 + -1];
                    int[] var7 = this.field2227[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class118.field1975[(8162 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field2226[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field2227.length + -1 && ~this.field2227[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field2227[var14];
                    int[] var16 = this.field2227[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var16[1] * var18 - -(var15[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field2226[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field2227.length + -1) && ~this.field2227[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field2227[var22];
                int[] var24 = this.field2227[var22 + -1];
                int var25 = this.method982((byte) 86, var22 + -2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method982((byte) 86, var22 + 1)[1];
                int var29 = (-var24[0] + var21 << 12) / (var23[0] - var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var27;
                int var33 = var29 * var31 >> 12;
                int var34 = var28 - var27 + -var25 + var26;
                int var35 = (var29 * var34 >> 12) * var30 >> 12;
                int var36 = var25 - (var26 + var34);
                int var37 = var30 * var36 >> 12;
                int var38 = var33 + var35 + var37 - -var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2226[var20] = (short) var38;
            }
        }
        ++field2223;
        if (arg0 != -32767) {
            field2225 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field2236;
        if (arg2 == 82) {
            if (arg0 == 0) {
                this.field2241 = arg1.method897(-74);
                this.field2227 = new int[arg1.method897(-119)][2];
                for (int var4 = 0; ~this.field2227.length < ~var4; ++var4) {
                    this.field2227[var4][0] = arg1.method876(false);
                    this.field2227[var4][1] = arg1.method876(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field2228;
        if (arg1 != 10565) {
            this.method980(78);
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[] var4 = this.method1390(arg0, 0, -116);
            for (int var5 = 0; ~var5 > ~class49.field767; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2226[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
    public static final void method979(int arg0, byte arg1) {
        ++field2230;
        class254 var2;
        if (class182.field3004 == null) {
            var2 = new class254(512, 512);
        } else {
            var2 = (class254) class182.field3004;
        }
        int[] var3 = var2.field4447;
        int var4 = var3.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var25 = (103 - var6) * 512 * 4 + 24628;
            for (int var26 = 1; var26 < 103; ++var26) {
                if (~(class160.field2626[arg0][var26][var6] & 24) == -1) {
                    class234.method1624(var3, var25, 512, arg0, var26, var6);
                }
                if (arg0 < 3 && (class160.field2626[arg0 - -1][var26][var6] & 8) != 0) {
                    class234.method1624(var3, var25, 512, arg0 - -1, var26, var6);
                }
                var25 += 4;
            }
        }
        var2.method1738();
        int var7 = 238 + (int) (20.0D * Math.random()) - (10 - ((238 - -((int) (Math.random() * 20.0D)) + -10 << 16) - -(-10 + 238 + (int) (Math.random() * 20.0D) << 8)));
        int var8 = -10 + (int) (Math.random() * 20.0D) + 238 << 16;
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var24 = 1; ~var24 > -104; ++var24) {
                if (~(class160.field2626[arg0][var24][var9] & 24) == -1) {
                    class78.method554(false, var9, var8, arg0, var24, var7);
                }
                if (arg0 < 3 && ~(8 & class160.field2626[arg0 + 1][var24][var9]) != -1) {
                    class78.method554(false, var9, var8, arg0 + 1, var24, var7);
                }
            }
        }
        class74.field1183 = 0;
        int var10 = 35 / ((arg1 - 67) / 33);
        for (int var11 = 0; ~var11 > -105; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                long var13 = class45.method230(class257.field4496, var11, var12);
                if (~var13 != -1L) {
                    class108 var15 = class41.method210((int) (var13 >>> 32) & Integer.MAX_VALUE, (byte) 75);
                    int var16 = var15.field1826;
                    if (var15.field1796 != null) {
                        for (int var17 = 0; ~var17 > ~var15.field1796.length; ++var17) {
                            if (var15.field1796[var17] != -1) {
                                class108 var18 = class41.method210(var15.field1796[var17], (byte) 75);
                                if (~var18.field1826 <= -1) {
                                    var16 = var18.field1826;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var16 <= -1) {
                        int var19 = var11;
                        int var20 = var12;
                        if (var16 != 22 && ~var16 != -30 && var16 != 34 && var16 != 36 && ~var16 != -47 && ~var16 != -48 && var16 != 48) {
                            int[][] var21 = class159.field2605[class257.field4496].field2787;
                            for (int var22 = 0; ~var22 > -11; ++var22) {
                                int var23 = (int) (4.0D * Math.random());
                                if (var23 == 0 && var19 > 0 && ~var19 < ~(var11 + -3) && (var21[var19 + -1][var20] & 19661064) == 0) {
                                    --var19;
                                }
                                if (~var23 == -2 && var19 < 103 && ~var19 > ~(var11 + 3) && (var21[var19 - -1][var20] & 19661184) == 0) {
                                    ++var19;
                                }
                                if (var23 == 2 && var20 > 0 && ~(var12 + -3) > ~var20 && (19661058 & var21[var19][var20 + -1]) == 0) {
                                    --var20;
                                }
                                if (var23 == 3 && ~var20 > -104 && ~(var12 + 3) < ~var20 && ~(var21[var19][var20 + 1] & 19661088) == -1) {
                                    ++var20;
                                }
                            }
                        }
                        class49.field773[class74.field1183] = var15.field1799;
                        class93.field1538[class74.field1183] = var19;
                        class78.field1245[class74.field1183] = var20;
                        ++class74.field1183;
                    }
                }
            }
        }
        class182.field3004 = var2;
        class192.field3209.method126(102);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        ++field2239;
        if (this.field2227 == null) {
            this.field2227 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field2227.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2241 == -3) {
                this.method980(-25844);
            }
            class124.method930((byte) -68);
            int var2 = -51 % ((arg0 - 43) / 41);
            this.method978(-32767);
        }
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V")
    private final void method980(int arg0) {
        if (arg0 == -25844) {
            ++field2238;
            int[] var2 = this.field2227[1];
            int[] var3 = this.field2227[0];
            int[] var4 = this.field2227[this.field2227.length - 1];
            int[] var5 = this.field2227[this.field2227.length - 2];
            this.field2235 = new int[] { var5[0] + var5[0] + -var4[0], var5[1] + var5[1] + -var4[1] };
            this.field2229 = new int[] { var3[0] + -var2[0] + var3[0], var3[1] - (var2[1] + -var3[1]) };
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
    public static final void method981(boolean arg0, int arg1) {
        int var2 = -18 / ((arg1 - -16) / 53);
        ++field2231;
        byte[][] var3 = class105.field1732;
        byte var4 = 4;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            class190.method1361(205);
            for (int var6 = 0; ~var6 > -14; ++var6) {
                for (int var7 = 0; ~var7 > -14; ++var7) {
                    int var8 = class106.field1748[var5][var6][var7];
                    boolean var9 = false;
                    if (~var8 != 0) {
                        int var10 = var8 >> 24 & 3;
                        if (!arg0 || ~var10 == -1) {
                            int var11 = 3 & var8 >> 1;
                            int var12 = (var8 & 16764791) >> 14;
                            int var13 = (var8 & 16381) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; ~var15 > ~class101.field1681.length; ++var15) {
                                if (class101.field1681[var15] == var14 && var3[var15] != null) {
                                    var9 = true;
                                    class231.method1592(var3[var15], (byte) 117, var5, var7 * 8, var10, arg0, var11, class159.field2605, var6 * 8, (7 & var13) * 8, (7 & var12) * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var9) {
                        class5.method21(var7 * 8, var6 * 8, (byte) -85, 8, 8, var5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(BI)[I")
    private final int[] method982(byte arg0, int arg1) {
        ++field2234;
        if (~arg1 > -1) {
            return this.field2229;
        } else if (this.field2227.length <= arg1) {
            return this.field2235;
        } else {
            if (arg0 != 86) {
                this.field2235 = null;
            }
            return this.field2227[arg1];
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class134() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
    public static void method983(int arg0) {
        if (arg0 != 0) {
            method981(true, 91);
        }
        field2232 = null;
        field2233 = null;
        field2225 = null;
        field2240 = null;
    }
}
