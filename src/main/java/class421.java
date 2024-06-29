import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class421 extends class96 {

    @OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
    private int field5640 = 0;

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "[S")
    private short[] field5636 = new short[257];

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "Lhb;")
    public static class250 field5639 = new class250(56, 1);

    @OriginalMember(owner = "client!ft", name = "U", descriptor = "Loi;")
    public static class169 field5645 = new class169("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!ft", name = "V", descriptor = "I")
    public static int field5646 = 0;

    @OriginalMember(owner = "client!ft", name = "cb", descriptor = "[F")
    public static float[] field5653 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!ft", name = "Q", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!ft", name = "R", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!ft", name = "S", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!ft", name = "T", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!ft", name = "Y", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!ft", name = "Z", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!ft", name = "ab", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!ft", name = "W", descriptor = "Lbk;")
    public static class95 field5647;

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "[I")
    private int[] field5637;

    @OriginalMember(owner = "client!ft", name = "bb", descriptor = "[I")
    private int[] field5652;

    @OriginalMember(owner = "client!ft", name = "X", descriptor = "[[I")
    private int[][] field5648;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIB)I", line = 3)
    public static final int method2483(int arg0, int arg1, byte arg2) {
        ++field5649;
        int var3 = 0;
        int var4 = 62 / ((-64 - arg2) / 46);
        while (~arg1 < -1) {
            var3 = arg0 & 1 | var3 << 1;
            --arg1;
            arg0 >>>= 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I[[[BIBII)V", line = 22)
    public static final void method2484(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class206.field2685;
        class489.field7124 = 0;
        for (int var6 = class405.field5434; var6 < class412.field5495; ++var6) {
            class510[][] var17 = class470.field6877[var6];
            for (int var18 = class297.field3862; var18 < class411.field5491; ++var18) {
                for (int var19 = class83.field1027; var19 < class271.field3438; ++var19) {
                    class510 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class357.field4598[var18 - class225.field2922 + class18.field318][var19 - class477.field6969 + class18.field318] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field7504 = false;
                            var20.field7493 = false;
                            var20.field7503 = 0;
                            if (var18 >= class225.field2922 - 16 && var18 <= class225.field2922 + 16 && var19 >= class477.field6969 - 16 && var19 <= class477.field6969 + 16 && (var20.field7499 != null || var20.field7502 != null || var20.field7485 != null || var20.field7497 != null || var20.field7492 != null || var20.field7494 != null)) {
                                class522.field7748.method198(var20, -23985);
                            }
                        } else {
                            var20.field7504 = true;
                            var20.field7493 = true;
                            if (var20.field7494 != null) {
                                var20.field7487 = true;
                            } else {
                                var20.field7487 = false;
                            }
                            ++class489.field7124;
                        }
                    }
                }
            }
        }
        boolean var7 = class92.field1285 == class283.field3620;
        for (int var8 = class405.field5434; var8 < class412.field5495; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class372.field4831.method890() && var8 >= arg2 && arg1 != null) {
                int var10 = class357.field4598.length;
                if (class357.field4598.length + class297.field3862 > class166.field2155) {
                    var10 -= class357.field4598.length + class297.field3862 - class166.field2155;
                }
                int var11 = class357.field4598[0].length;
                if (class357.field4598[0].length + class83.field1027 > class13.field230) {
                    var11 -= class357.field4598[0].length + class83.field1027 - class13.field230;
                }
                int var12 = class503.field7392;
                while (true) {
                    if (var12 >= var10) {
                        class522.field7748.method201(class92.field1285[var8], var8, (byte) 118, var9, true);
                        break;
                    }
                    int var13 = class297.field3862 + var12 - class503.field7392;
                    for (int var14 = class448.field6236; var14 < var11; ++var14) {
                        class465.field6840[var12][var14] = false;
                        if (class357.field4598[var12][var14]) {
                            int var15 = class83.field1027 + var14 - class448.field6236;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (class470.field6877[var16][var13][var15] != null && class470.field6877[var16][var13][var15].field7500 == var8) {
                                    class465.field6840[var12][var14] = class470.field6877[var16][var13][var15].field7504;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class522.field7748.method201(class92.field1285[var8], var8, (byte) 115, var9, false);
            }
            class522.field7748.method202((byte) -115);
        }
        if (!class63.method361(true)) {
            class63.method361(false);
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)[I", line = 159)
    public final int[] method37(int arg0, int arg1) {
        ++field5650;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            field5647 = null;
        }
        if (super.field1331.field863) {
            int[] var4 = this.method657(0, arg0, -1);
            for (int var5 = 0; ~var5 > ~class269.field3403; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field5636[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V", line = 482)
    public class421() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)V", line = 215)
    private final void method2485(int arg0) {
        ++field5643;
        if (arg0 <= 125) {
            field5645 = null;
        }
        int var2 = this.field5640;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field5648.length + -1 && ~var4 <= ~this.field5648[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field5648[var5 + -1];
                    int[] var7 = this.field5648[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class234.field3041[(var8 & 8168) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5636[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field5648.length + -1) && ~var13 <= ~this.field5648[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field5648[var14 + -1];
                    int[] var16 = this.field5648[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5636[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field5648.length + -1) && this.field5648[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field5648[var22 + -1];
                int[] var24 = this.field5648[var22];
                int var25 = this.method2488((byte) 119, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2488((byte) 114, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + var26 - var25;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var37 - -var26 + (var35 - -var36);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5636[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)V", line = 400)
    private final void method2486(int arg0) {
        ++field5651;
        int[] var2 = this.field5648[arg0];
        int[] var3 = this.field5648[1];
        int[] var4 = this.field5648[this.field5648.length + -2];
        int[] var5 = this.field5648[this.field5648.length + -1];
        this.field5637 = new int[] { -var5[0] - (-var4[0] - var4[0]), var4[1] + var4[1] + -var5[1] };
        this.field5652 = new int[] { -var3[0] - -var2[0] + var2[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(B)V", line = 418)
    public static void method2487(byte arg0) {
        field5645 = null;
        field5647 = null;
        field5639 = null;
        field5653 = null;
        if (arg0 < 100) {
            method2484(68, (byte[][][]) null, 19, (byte) 73, -60, -115);
        }
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V", line = 436)
    public final void method390(int arg0) {
        ++field5644;
        if (arg0 <= 15) {
            method2483(-45, 59, (byte) 90);
        }
        if (this.field5648 == null) {
            this.field5648 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field5648.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field5640 == 2) {
                this.method2486(0);
            }
            class18.method112(-79);
            this.method2485(126);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILbt;)V", line = 458)
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (~arg0 == arg1) {
            this.field5640 = arg2.method617(2);
            this.field5648 = new int[arg2.method617(2)][2];
            for (int var4 = 0; var4 < this.field5648.length; ++var4) {
                this.field5648[var4][0] = arg2.method568((byte) 110);
                this.field5648[var4][1] = arg2.method568((byte) 110);
            }
        }
        ++field5638;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)[I", line = 485)
    private final int[] method2488(byte arg0, int arg1) {
        if (arg0 <= 95) {
            method2483(100, -123, (byte) 82);
        }
        ++field5642;
        if (arg1 < 0) {
            return this.field5652;
        } else {
            return ~this.field5648.length >= ~arg1 ? this.field5637 : this.field5648[arg1];
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z[B)Lpl;", line = 509)
    public static final class457 method2489(boolean arg0, byte[] arg1) {
        if (arg0) {
            method2487((byte) -34);
        }
        ++field5641;
        class457 var2 = new class457();
        class88 var3 = new class88(arg1);
        var3.field1176 = var3.field1223.length + -2;
        int var4 = var3.method568((byte) 110);
        int var5 = -var4 + -2 + var3.field1223.length + -12;
        var3.field1176 = var5;
        int var6 = var3.method578(106);
        var2.field6379 = var3.method568((byte) 110);
        var2.field6372 = var3.method568((byte) 110);
        var2.field6369 = var3.method568((byte) 110);
        var2.field6374 = var3.method568((byte) 110);
        int var7 = var3.method617(2);
        if (~var7 < -1) {
            var2.field6382 = new class357[var7];
            for (int var8 = 0; var7 > var8; ++var8) {
                int var9 = var3.method568((byte) 110);
                class357 var10 = new class357(class124.method788(var9, -128));
                var2.field6382[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method578(91);
                    int var12 = var3.method578(126);
                    var10.method2096((long) var11, new class206(var12), (byte) 76);
                }
            }
        }
        var3.field1176 = 0;
        var2.field6368 = var3.method569(-32248);
        var2.field6375 = new int[var6];
        var2.field6370 = new int[var6];
        var2.field6381 = new String[var6];
        int var13 = 0;
        while (~var3.field1176 > ~var5) {
            int var14 = var3.method568((byte) 110);
            if (var14 != 3) {
                if (var14 < 100 && var14 != 21 && var14 != 38 && var14 != 39) {
                    var2.field6370[var13] = var3.method578(98);
                } else {
                    var2.field6370[var13] = var3.method617(2);
                }
            } else {
                var2.field6381[var13] = var3.method591(20557).intern();
            }
            var2.field6375[var13++] = var14;
        }
        return var2;
    }
}
