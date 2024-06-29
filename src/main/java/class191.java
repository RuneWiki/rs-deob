import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class191 extends class346 {

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "Z")
    public static boolean field2655 = false;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field2660 = 0;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)I", line = 3)
    public static final int method1270(int arg0) {
        ++field2654;
        if (arg0 != -20129) {
            method1272((byte) -29, -23);
        }
        return 15;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)[I", line = 17)
    public final int[] method45(int arg0, int arg1) {
        ++field2657;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (arg1 != 3) {
            field2655 = false;
        }
        if (super.field5152.field3004) {
            int var4 = class436.field6337[arg0];
            for (int var5 = 0; var5 < class134.field1753; ++var5) {
                var3[var5] = this.method1274(false, var4, class361.field5340[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZLtj;)V", line = 50)
    public static final void method1271(int arg0, boolean arg1, class298 arg2) {
        ++field2656;
        class420.method2646(arg2);
        if (!arg1) {
            field2655 = false;
        }
        if (arg0 > 1) {
            for (int var3 = 0; class351.field5217 > var3; ++var3) {
                for (int var4 = 0; ~var4 > ~class143.field1815; ++var4) {
                    if ((class406.field5912[1][var3][var4] & 2) == 2) {
                        class147.method1017(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~arg0 < ~var5; ++var5) {
            for (int var6 = 0; class143.field1815 >= var6; ++var6) {
                for (int var7 = 0; ~class351.field5217 <= ~var7; ++var7) {
                    if ((class173.field2355[var5][var7][var6] & 1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (~var8 < -1 && ~(1 & class173.field2355[var5][var7][var8 + -1]) != -1) {
                            --var8;
                        }
                        while (~var9 > ~class143.field1815 && ~(class173.field2355[var5][var7][var9 - -1] & 1) != -1) {
                            ++var9;
                        }
                        int var11 = var5;
                        label169: while (~var10 < -1) {
                            for (int var12 = var8; var12 <= var9; ++var12) {
                                if ((class173.field2355[var10 + -1][var7][var12] & 1) == 0) {
                                    break label169;
                                }
                            }
                            --var10;
                        }
                        label158: while (var11 < 3) {
                            for (int var13 = var8; var9 >= var13; ++var13) {
                                if ((1 & class173.field2355[var11 + 1][var7][var13]) == 0) {
                                    break label158;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 - -1) * (-var10 + 1 + var11);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class164.field2231[var11][var7][var8] + -var15;
                            int var17 = class164.field2231[var10][var7][var8];
                            class129.method905(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var11 >= var18; ++var18) {
                                for (int var19 = var8; var19 <= var9; ++var19) {
                                    class173.field2355[var18][var7][var19] = (byte) class394.method2529(class173.field2355[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class173.field2355[var5][var7][var6] & 2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (class351.field5217 > var21 && (2 & class173.field2355[var5][var21 + 1][var6]) != 0) {
                            ++var21;
                        }
                        while (~var20 < -1 && ~(2 & class173.field2355[var5][var20 + -1][var6]) != -1) {
                            --var20;
                        }
                        label223: while (var22 > 0) {
                            for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                if (~(2 & class173.field2355[var22 + -1][var24][var6]) == -1) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (~var23 > -4) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if (~(2 & class173.field2355[var23 + 1][var25][var6]) == -1) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 - (var22 + -1)) * (var21 - var20 + 1);
                        if (~var26 <= -3) {
                            short var27 = 240;
                            int var28 = class164.field2231[var23][var20][var6] + -var27;
                            int var29 = class164.field2231[var22][var20][var6];
                            class129.method905(2, var20 * 128, var21 * 128 - -128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    class173.field2355[var30][var31][var6] = (byte) class394.method2529(class173.field2355[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & class173.field2355[var5][var7][var6]) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && (class173.field2355[var5][var7][var34 + -1] & 4) != 0) {
                            --var34;
                        }
                        while (~var35 > ~class143.field1815 && ~(4 & class173.field2355[var5][var7][var35 - -1]) != -1) {
                            ++var35;
                        }
                        label276: while (~var32 < -1) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if ((class173.field2355[var5][var32 + -1][var36] & 4) == 0) {
                                    break label276;
                                }
                            }
                            --var32;
                        }
                        label265: while (~class351.field5217 < ~var33) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if ((4 & class173.field2355[var5][var33 + 1][var37]) == 0) {
                                    break label265;
                                }
                            }
                            ++var33;
                        }
                        if (~((var33 - var32 - -1) * (var35 + 1 - var34)) <= -5) {
                            int var38 = class164.field2231[var5][var32][var34];
                            class129.method905(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 - -128, var38, var38);
                            for (int var39 = var32; ~var33 <= ~var39; ++var39) {
                                for (int var40 = var34; var40 <= var35; ++var40) {
                                    class173.field2355[var5][var39][var40] = (byte) class394.method2529(class173.field2355[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 343)
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V", line = 347)
    public static final void method1272(byte arg0, int arg1) {
        if (arg0 == 59) {
            ++field2653;
            if (!class389.field5689) {
                arg1 = -1;
            }
            if (class264.field3892 != arg1) {
                if (~arg1 != 0) {
                    class289 var2 = class147.method1013((byte) 92, arg1);
                    class10 var3 = var2.method1963((byte) -15);
                    if (var3 != null) {
                        class63.field948.method2394(var3.method81(), class422.field6138, arg0 + 40, new Point(var2.field4333, var2.field4330), var3.method76(), var3.method84());
                        class264.field3892 = arg1;
                    } else {
                        arg1 = -1;
                    }
                }
                if (~arg1 == 0 && class264.field3892 != -1) {
                    class63.field948.method2394(-1, class422.field6138, 107, new Point(), -1, (int[]) null);
                    class264.field3892 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V", line = 386)
    public static final void method1273(int arg0) {
        class425 var1 = class410.field5954;
        synchronized (class410.field5954) {
            ++class298.field4499;
            class21.field388 = class118.field1530;
            class277.field4060 = class194.field2694;
            if (arg0 != 1) {
                field2655 = false;
            }
            class217.field3032 = class71.field1014;
            class219.field3054 = class211.field2882;
            class278.field4085 = class185.field2527;
            class402.field5871 = class17.field278;
            class101.field1340 = class264.field3882;
            class211.field2882 = 0;
        }
        ++field2661;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZII)I", line = 422)
    private final int method1274(boolean arg0, int arg1, int arg2) {
        ++field2659;
        if (arg0) {
            method1272((byte) 3, 100);
        }
        int var4 = arg2 - -(arg1 * 57);
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }
}
