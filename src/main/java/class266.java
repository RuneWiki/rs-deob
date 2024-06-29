import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class266 extends class300 {

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    private int field4315 = 4096;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    private int field4322 = 3216;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "[I")
    private int[] field4324 = new int[3];

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
    private int field4327 = 3216;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "Z")
    public static boolean field4316 = false;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field4321 = 0;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field4326 = 0;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "[Lod;")
    public static class24[] field4318 = new class24[14];

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Lmi;")
    public static class256 field4325;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "Lvl;")
    public static class73 field4331;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "[Ljb;")
    public static class27[] field4330;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field4329;
        this.method1856((byte) 88);
        if (arg0 < 126) {
            method1857((byte) -97);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
    public static final void method1854(int arg0, boolean arg1) {
        ++field4320;
        class31.method163(-11565);
        if (~class40.field480 == -31 || class40.field480 == 25) {
            ++class134.field1897;
            if (arg0 < -57) {
                if (~class134.field1897 <= -51 || arg1) {
                    class134.field1897 = 0;
                    if (!class120.field1733 && class270.field4405 != null) {
                        ++class10.field149;
                        class150.field2218.method445(71, 7);
                        try {
                            class270.field4405.method562(class150.field2218.field2676, class150.field2218.field2650, 0, 126);
                            class150.field2218.field2676 = 0;
                        } catch (IOException var2) {
                            class120.field1733 = true;
                        }
                    }
                    class31.method163(-11565);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field4327 = arg0.method1186((byte) -70);
                }
            } else {
                this.field4322 = arg0.method1186((byte) -77);
            }
        } else {
            this.field4315 = arg0.method1186((byte) -97);
        }
        ++field4319;
        if (arg1 >= -43) {
            method1858(107);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field4323;
        if (arg1 != -957953300) {
            return null;
        } else {
            int[] var3 = super.field4797.method217(arg0, true);
            if (super.field4797.field470) {
                int var4 = class232.field3751 * this.field4315 >> 12;
                int[] var5 = this.method2018(0, arg1 ^ 957953299, arg0 + -1 & class285.field4611);
                int[] var6 = this.method2018(0, arg1 + 957953299, arg0);
                int[] var7 = this.method2018(0, -1, arg0 - -1 & class285.field4611);
                for (int var8 = 0; ~class180.field2826 < ~var8; ++var8) {
                    int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                    int var10 = (var6[class277.field4503 & var8 - 1] + -var6[var8 + 1 & class277.field4503]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    int var12 = var9 >> 4;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class104.field1516[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = this.field4324[1] * var15 >> 12;
                    int var17 = this.field4324[2] * var14 >> 12;
                    int var18 = var10 * var13 >> 8;
                    int var19 = this.field4324[0] * var18 >> 12;
                    var3[var8] = var16 + var19 + var17;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public static final void method1855(int arg0) {
        if (arg0 != 0) {
            method1855(76);
        }
        ++field4314;
        class191.field3022.method1511((byte) 125);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
    private final void method1856(byte arg0) {
        if (arg0 != 88) {
            this.field4327 = -21;
        }
        double var2 = Math.cos((double) ((float) this.field4327 / 4096.0F));
        ++field4317;
        this.field4324[0] = (int) (4096.0D * Math.sin((double) ((float) this.field4322 / 4096.0F)) * var2);
        this.field4324[1] = (int) (var2 * Math.cos((double) ((float) this.field4322 / 4096.0F)) * 4096.0D);
        this.field4324[2] = (int) (4096.0D * Math.sin((double) ((float) this.field4327 / 4096.0F)));
        int var4 = this.field4324[2] * this.field4324[2] >> 12;
        int var5 = this.field4324[0] * this.field4324[0] >> 12;
        int var6 = this.field4324[1] * this.field4324[1] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (~var7 != -1) {
            this.field4324[2] = (this.field4324[2] << 12) / var7;
            this.field4324[1] = (this.field4324[1] << 12) / var7;
            this.field4324[0] = (this.field4324[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class266() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V")
    public static void method1857(byte arg0) {
        field4325 = null;
        field4331 = null;
        if (arg0 < -36) {
            field4318 = null;
            field4330 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public static final void method1858(int arg0) {
        if (~class40.field480 == -31) {
            class95.method651(25, (byte) 76);
        }
        ++field4328;
        if (arg0 != 27644) {
            field4333 = 115;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZB)V")
    public static final void method1859(boolean arg0, byte arg1) {
        ++field4332;
        if (arg1 == 64) {
            class161.field2415 = arg0;
            if (!class161.field2415) {
                int var2 = class175.field2763.method1186((byte) -80);
                int var3 = class175.field2763.method1200(128);
                int var4 = (-class175.field2763.field2676 + class262.field4252) / 16;
                class140.field2014 = new int[var4][4];
                for (int var5 = 0; var5 < var4; ++var5) {
                    for (int var15 = 0; var15 < 4; ++var15) {
                        class140.field2014[var5][var15] = class175.field2763.method1190(6345);
                    }
                }
                int var6 = class175.field2763.method1200(128);
                int var7 = class175.field2763.method1182((byte) -99);
                boolean var8 = class237.method1662(class175.field2763.method1196((byte) 82), 104);
                int var9 = class175.field2763.method1186((byte) -59);
                class250.field4072 = new int[var4];
                class199.field3148 = new byte[var4][];
                class127.field1823 = new int[var4];
                class129.field1840 = new byte[var4][];
                class73.field1085 = new int[var4];
                boolean var10 = false;
                class254.field4153 = null;
                class44.field527 = null;
                if ((var3 / 8 == 48 || ~(var3 / 8) == -50) && var2 / 8 == 48) {
                    var10 = true;
                }
                class313.field5014 = new int[var4];
                class161.field2410 = new int[var4];
                int var11 = 0;
                if (~(var3 / 8) == -49 && var2 / 8 == 148) {
                    var10 = true;
                }
                for (int var12 = (var3 + -6) / 8; ~var12 >= ~((var3 + 6) / 8); ++var12) {
                    for (int var13 = (var2 - 6) / 8; ~var13 >= ~((var2 - -6) / 8); ++var13) {
                        int var14 = (var12 << 8) + var13;
                        if (!var10 || var13 != 49 && var13 != 149 && ~var13 != -148 && ~var12 != -51 && (var12 != 49 || ~var13 != -48)) {
                            class250.field4072[var11] = var14;
                            class73.field1085[var11] = class135.field1951.method498(0, "m" + var12 + "_" + var13);
                            class127.field1823[var11] = class135.field1951.method498(0, "l" + var12 + "_" + var13);
                            class313.field5014[var11] = class135.field1951.method498(0, "um" + var12 + "_" + var13);
                            class161.field2410[var11] = class135.field1951.method498(0, "ul" + var12 + "_" + var13);
                        } else {
                            class250.field4072[var11] = var14;
                            class73.field1085[var11] = -1;
                            class127.field1823[var11] = -1;
                            class313.field5014[var11] = -1;
                            class161.field2410[var11] = -1;
                        }
                        ++var11;
                    }
                }
                class281.method1934(var2, var3, var8, var7, var9, 2048, false, var6);
            } else {
                boolean var16 = class237.method1662(class175.field2763.method1196((byte) 79), arg1 + 40);
                int var17 = class175.field2763.method1200(arg1 + 64);
                int var18 = class175.field2763.method1211(120);
                int var19 = class175.field2763.method1200(128);
                int var20 = class175.field2763.method1189(-113);
                class175.field2763.method443((byte) 78);
                for (int var21 = 0; ~var21 > -5; ++var21) {
                    for (int var37 = 0; var37 < 13; ++var37) {
                        for (int var38 = 0; ~var38 > -14; ++var38) {
                            int var39 = class175.field2763.method439(103, 1);
                            if (var39 == 1) {
                                class276.field4478[var21][var37][var38] = class175.field2763.method439(114, 26);
                            } else {
                                class276.field4478[var21][var37][var38] = -1;
                            }
                        }
                    }
                }
                class175.field2763.method440(7551);
                int var22 = (-class175.field2763.field2676 + class262.field4252) / 16;
                class140.field2014 = new int[var22][4];
                for (int var23 = 0; ~var22 < ~var23; ++var23) {
                    for (int var36 = 0; ~var36 > -5; ++var36) {
                        class140.field2014[var23][var36] = class175.field2763.method1190(6345);
                    }
                }
                int var24 = class175.field2763.method1172(true);
                class73.field1085 = new int[var22];
                class127.field1823 = new int[var22];
                class129.field1840 = new byte[var22][];
                class254.field4153 = null;
                class250.field4072 = new int[var22];
                class313.field5014 = new int[var22];
                class44.field527 = null;
                class161.field2410 = new int[var22];
                class199.field3148 = new byte[var22][];
                int var25 = 0;
                for (int var26 = 0; var26 < 4; ++var26) {
                    for (int var27 = 0; ~var27 > -14; ++var27) {
                        for (int var28 = 0; var28 < 13; ++var28) {
                            int var29 = class276.field4478[var26][var27][var28];
                            if (~var29 != 0) {
                                int var30 = 2047 & var29 >> 3;
                                int var31 = (16769494 & var29) >> 14;
                                int var32 = (var31 / 8 << 8) - -(var30 / 8);
                                for (int var33 = 0; ~var33 > ~var25; ++var33) {
                                    if (class250.field4072[var33] == var32) {
                                        var32 = -1;
                                        break;
                                    }
                                }
                                if (~var32 != 0) {
                                    class250.field4072[var25] = var32;
                                    int var34 = 255 & var32 >> 8;
                                    int var35 = var32 & 255;
                                    class73.field1085[var25] = class135.field1951.method498(0, "m" + var34 + "_" + var35);
                                    class127.field1823[var25] = class135.field1951.method498(class299.method2011(arg1, 64), "l" + var34 + "_" + var35);
                                    class313.field5014[var25] = class135.field1951.method498(0, "um" + var34 + "_" + var35);
                                    class161.field2410[var25] = class135.field1951.method498(0, "ul" + var34 + "_" + var35);
                                    ++var25;
                                }
                            }
                        }
                    }
                }
                class281.method1934(var17, var24, var16, var18, var19, 2048, false, var20);
            }
        }
    }
}
