import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class277 extends class34 {

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "[S")
    private short[] field4269 = new short[257];

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    private int field4272 = 0;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field4267 = 0;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field4275 = 0;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "[I")
    private int[] field4273;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "[I")
    private int[] field4274;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "[[I")
    private int[][] field4264;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "[[[Ljc;")
    public static class201[][][] field4277;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)[I")
    private final int[] method1843(int arg0, int arg1) {
        ++field4266;
        if (~arg1 > -1) {
            return this.field4273;
        } else {
            if (arg0 != -30955) {
                method1846((int[]) null, -21, -7, 77, -96, 11);
            }
            return this.field4264.length <= arg1 ? this.field4274 : this.field4264[arg1];
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1844(byte arg0, String arg1) {
        ++field4263;
        if (~class149.field2165 <= -3) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class284.method1885((byte) 40);
                for (int var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() + -var3.freeMemory()) / 1024L);
                class260.method1759(0, (String) null, 128, "mem=" + var4 + "k");
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class284.method1885((byte) 82);
                for (int var5 = 0; var5 < 10; ++var5) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class260.method1759(0, (String) null, 128, "Memory before cleanup=" + var7 + "k");
                class157.method1063(0);
                class284.method1885((byte) 51);
                for (int var8 = 0; ~var8 > -11; ++var8) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                class260.method1759(0, (String) null, 128, "Memory after cleanup=" + var9 + "k");
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class260.method1759(0, (String) null, arg0 ^ -167, "Number of player models in cache:" + class12.method83(arg0 ^ -37));
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class210.method1383(7928);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class18.field329.method1110(true);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class18.field329.method1121((byte) -128);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class217.field3338.method178(65);
                class22.field369.method1722(97);
                class18.field329.method1114(23271);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class197.field2980 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class88.method668(true, 25);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class151.field2198 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class151.field2198 = false;
            }
            if (arg1.startsWith("::setba")) {
                class249.field3862 = class213.method1439(arg1.substring(8), arg0 ^ -45);
                class58.method479(class217.field3338, -230);
                class107.field1574 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class31.method214(class213.method1439(arg1.substring(15), 10));
                class58.method479(class217.field3338, arg0 + -191);
                class107.field1574 = false;
            }
            if (arg1.startsWith("::fps ") && class146.field2119 != 0) {
                class135.method928(class213.method1439(arg1.substring(6), 10), (byte) 70);
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class275.field4250 = class213.method1439(arg1.substring(12).trim(), 10);
                class260.method1759(0, (String) null, arg0 + 167, "rect_debug=" + class275.field4250);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class112.field1712 = true;
            }
            arg1.startsWith("::hdr");
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class253.field3900) {
                    class253.field3900 = false;
                    class260.method1759(0, (String) null, 128, "Forced tweening disabled.");
                } else {
                    class253.field3900 = true;
                    class260.method1759(0, (String) null, 128, "Forced tweening ENABLED!");
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class172.field2521) {
                    System.out.println("Shift-click disabled.");
                    class172.field2521 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class172.field2521 = true;
                }
            }
        }
        ++class167.field2458;
        class59.field964.method1540(90, (byte) -2);
        if (arg0 != -39) {
            field4267 = 68;
        }
        class59.field964.method437(true, -1 + arg1.length());
        class59.field964.method396(arg1.substring(2), false);
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
    private final void method1845(int arg0) {
        int var2 = this.field4272;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field4264.length + -1 > var5 && ~var4 <= ~this.field4264[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field4264[var5 + -1];
                    int[] var7 = this.field4264[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class21.field356[(8177 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field4269[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field4264.length - 1) && ~var13 <= ~this.field4264[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field4264[var14];
                    int[] var16 = this.field4264[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field4269[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field4264.length + -1) < ~var22 && ~this.field4264[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field4264[var22 + -1];
                int[] var24 = this.field4264[var22];
                int var25 = this.method1843(arg0 + -38741, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1843(arg0 + -38741, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var28 - var27 + -var25 + var26;
                int var31 = -var30 + var25 - var26;
                int var32 = var29 * var29 >> 12;
                int var33 = -var25 + var27;
                int var34 = var29 * var33 >> 12;
                int var35 = var31 * var32 >> 12;
                int var36 = (var29 * var30 >> 12) * var32 >> 12;
                int var38 = var35 + var36 - (-var34 - var26);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field4269[var20] = (short) var38;
            }
        }
        if (arg0 != 7786) {
            method1844((byte) -118, (String) null);
        }
        ++field4271;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class277() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg1 == 0) {
            this.field4272 = arg2.method407(255);
            this.field4264 = new int[arg2.method407(255)][2];
            for (int var4 = 0; ~this.field4264.length < ~var4; ++var4) {
                this.field4264[var4][0] = arg2.method423(104);
                this.field4264[var4][1] = arg2.method423(-76);
            }
        }
        if (arg0 != 6) {
            this.field4269 = null;
        }
        ++field4276;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIIIII)V")
    public static final void method1846(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class201 var6 = class3.field40[arg3][arg4][arg5];
        if (var6 != null) {
            class205 var7 = var6.field3023;
            if (var7 == null) {
                class291 var10 = var6.field3015;
                if (var10 != null) {
                    int var11 = var10.field4427;
                    int var12 = var10.field4419;
                    int var13 = var10.field4416;
                    int var14 = var10.field4426;
                    int[] var15 = class4.field57[var11];
                    int[] var16 = class25.field423[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field3069;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field4278;
        if (arg0 <= 75) {
            return null;
        } else {
            int[] var3 = super.field610.method228(24856, arg1);
            if (super.field610.field597) {
                int[] var4 = this.method230(arg1, -15337, 0);
                for (int var5 = 0; ~class226.field3527 < ~var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field4269[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
    public static void method1847(byte arg0) {
        if (arg0 > -110) {
            field4267 = 110;
        }
        field4277 = null;
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
    public static final void method1848(int arg0) {
        ++field4270;
        if (!class284.field4364) {
            class284.field4364 = true;
            class36.field641 = true;
            if (arg0 >= 89) {
                if (class117.field1767) {
                    class281.field4313 = (float) ((int) class281.field4313 + 47 & -16);
                } else {
                    class215.field3310 += (12.0F - class215.field3310) / 2.0F;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
    public static final void method1849(int arg0) {
        class23.field375.method944(65535);
        int var1 = -96 % ((31 - arg0) / 40);
        ++field4268;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
    private final void method1850(byte arg0) {
        ++field4265;
        if (arg0 > -113) {
            this.field4264 = null;
        }
        int[] var2 = this.field4264[1];
        int[] var3 = this.field4264[0];
        int[] var4 = this.field4264[this.field4264.length + -1];
        int[] var5 = this.field4264[this.field4264.length + -2];
        this.field4273 = new int[] { var3[0] + -var2[0] + var3[0], var3[1] + -var2[1] + var3[1] };
        this.field4274 = new int[] { var5[0] + -var4[0] + var5[0], var5[1] - (var4[1] - var5[1]) };
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        int var2 = -71 / ((arg0 - -2) / 43);
        ++field4279;
        if (this.field4264 == null) {
            this.field4264 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field4264.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field4272 == 2) {
                this.method1850((byte) -125);
            }
            class189.method1255((byte) 84);
            this.method1845(7786);
        }
    }
}
