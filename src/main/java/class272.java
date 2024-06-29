import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class272 extends class260 {

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    private int field4795 = 32768;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field4790 = 0;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Loh;")
    public static class263 field4793 = class253.method1681(-117, "k");

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "Z")
    public static boolean field4802 = false;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "[Lw;")
    public static class141[] field4794;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lw;Lpc;IIIIZ)V")
    public static final void method1850(class141 arg0, class21 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field4801;
        if (arg6) {
            if (arg0 != null) {
                int var7 = 2047 & class241.field4230 + class201.field3625;
                int var8 = arg3 * arg3 + arg4 * arg4;
                int var9 = Math.max(arg1.field539 / 2, arg1.field479 / 2) + 10;
                if (var9 * var9 >= var8) {
                    int var10 = class270.field4769[var7];
                    int var11 = var10 * 256 / (class121.field2255 + 256);
                    int var12 = class270.field4762[var7];
                    int var13 = var12 * 256 / (class121.field2255 - -256);
                    int var14 = arg3 * var13 + arg4 * var11 >> 16;
                    int var15 = arg4 * var13 + -(arg3 * var11) >> 16;
                    ((class140) arg0).method930(arg1.field539 / 2 + -(arg0.field2574 / 2) + arg2 - -var14, -(arg0.field2580 / 2) + -var15 + arg5 - -(arg1.field479 / 2), arg1.field543, arg1.field512);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field4791;
        if (arg1 != 5701) {
            this.method17(87, 66);
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field4505 = arg2.method1301(arg1 + -14018) == 1;
            }
        } else {
            this.field4795 = arg2.method1294((byte) 3) << 4;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class272() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V")
    public static final void method1851(byte arg0, int arg1) {
        ++field4796;
        class140 var2;
        if (class157.field2836 == null) {
            var2 = new class140(512, 512);
        } else {
            var2 = (class140) class157.field2836;
        }
        int[] var3 = var2.field2571;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 1;
        }
        for (int var6 = 1; ~var6 > -104; ++var6) {
            int var24 = (-var6 + 103) * 2048 + 24628;
            for (int var25 = 1; ~var25 > -104; ++var25) {
                if (~(class77.field1576[arg1][var25][var6] & 24) == -1) {
                    class83.method559(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (class77.field1576[arg1 + 1][var25][var6] & 8) != 0) {
                    class83.method559(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method913();
        int var7 = 238 + (int) (20.0D * Math.random()) + -10 + (-10 + 238 + (int) (Math.random() * 20.0D) << 8) + ((int) (20.0D * Math.random()) + 238 + -10 << 16);
        int var8 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; ~var23 > -104; ++var23) {
                if (~(class77.field1576[arg1][var23][var9] & 24) == -1) {
                    class99.method676(arg1, var23, var9, var7, var8, arg0 ^ -1513);
                }
                if (arg1 < 3 && ~(class77.field1576[arg1 - -1][var23][var9] & 8) != -1) {
                    class99.method676(arg1 + 1, var23, var9, var7, var8, arg0 + 1525);
                }
            }
        }
        class165.field3004 = 0;
        for (int var10 = 0; ~var10 > -105; ++var10) {
            for (int var11 = 0; ~var11 > -105; ++var11) {
                long var12 = class13.method103(class12.field321, var10, var11);
                if (~var12 != -1L) {
                    class12 var14 = class117.method763(Integer.MAX_VALUE & (int) (var12 >>> 32), (byte) -108);
                    int var15 = var14.field271;
                    if (var14.field328 != null) {
                        for (int var16 = 0; ~var16 > ~var14.field328.length; ++var16) {
                            if (var14.field328[var16] != -1) {
                                class12 var17 = class117.method763(var14.field328[var16], (byte) 11);
                                if (~var17.field271 <= -1) {
                                    var15 = var17.field271;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var15 <= -1) {
                        int var18 = var10;
                        int var19 = var11;
                        if (~var15 != -23 && ~var15 != -30 && ~var15 != -35 && var15 != 36 && ~var15 != -47 && ~var15 != -48 && ~var15 != -49) {
                            int[][] var20 = class103.field1954[class12.field321].field1527;
                            for (int var21 = 0; ~var21 > -11; ++var21) {
                                int var22 = (int) (4.0D * Math.random());
                                if (~var22 == -1 && var18 > 0 && var10 + -3 < var18 && (var20[var18 + -1][var19] & 19661064) == 0) {
                                    --var18;
                                }
                                if (var22 == 1 && ~var18 > -104 && ~(var10 + 3) < ~var18 && ~(var20[var18 + 1][var19] & 19661184) == -1) {
                                    ++var18;
                                }
                                if (var22 == 2 && ~var19 < -1 && var11 - 3 < var19 && ~(var20[var18][var19 + -1] & 19661058) == -1) {
                                    --var19;
                                }
                                if (var22 == 3 && ~var19 > -104 && var11 + 3 > var19 && ~(19661088 & var20[var18][var19 + 1]) == -1) {
                                    ++var19;
                                }
                            }
                        }
                        class165.field3006[class165.field3004] = var14.field335;
                        class234.field4100[class165.field3004] = var18;
                        class116.field2170[class165.field3004] = var19;
                        ++class165.field3004;
                    }
                }
            }
        }
        class157.field2836 = var2;
        class255.field4454.method1690(-128);
        if (arg0 != -103) {
            method1851((byte) -22, 93);
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
    public static final void method1852(byte arg0) {
        if (arg0 != -126) {
            field4793 = null;
        }
        class277.method1886();
        for (int var1 = 0; var1 < 4; ++var1) {
            class103.field1954[var1].method490(-7);
        }
        ++field4798;
        System.gc();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field4800;
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (arg1 != 5) {
            field4794 = null;
        }
        if (super.field4509.field4346) {
            int[] var4 = this.method1711(arg0, 1, false);
            int[] var5 = this.method1711(arg0, 2, false);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; class49.field1052 > var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1045750) >> 12;
                int var11 = var5[var9] * this.field4795 >> 12;
                int var12 = class251.field4374[var10] * var11 >> 12;
                int var13 = class1.field13[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + arg0 & class277.field4846;
                int var15 = var9 - -(var12 >> 12) & class166.field3024;
                int[][] var16 = this.method1712((byte) -126, 0, var14);
                var7[var9] = var16[0][var15];
                var6[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public static void method1853(int arg0) {
        if (arg0 != -22664) {
            field4794 = null;
        }
        field4793 = null;
        field4794 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V")
    public static final void method1854(int arg0, byte arg1) {
        ++field4797;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class230.field4026 += arg0 * 128;
        if (~class230.field4026 < ~class4.field73.length) {
            class230.field4026 -= class4.field73.length;
            int var3 = (int) (12.0D * Math.random());
            class111.method731(class230.field4029[var3], (byte) -19);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (-arg0 + var2) * 128;
        for (int var7 = 0; var7 < var6; ++var7) {
            int var26 = class159.field2886[var4 - -var5] + -(class4.field73[class4.field73.length + -1 & class230.field4026 + var4] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class159.field2886[var4++] = var26;
        }
        for (int var8 = -arg0 + var2; ~var2 < ~var8; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; ~var24 > -129; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (~var25 > -51 && ~var24 < -11 && var24 < 118) {
                    class159.field2886[var23 + var24] = 255;
                } else {
                    class159.field2886[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; -arg0 + var2 > var9; ++var9) {
            class142.field2600[var9] = class142.field2600[arg0 + var9];
        }
        for (int var10 = -arg0 + var2; var2 > var10; ++var10) {
            class142.field2600[var10] = (int) (Math.sin((double) class160.field2918 / 14.0D) * 16.0D + Math.sin((double) class160.field2918 / 15.0D) * 14.0D + Math.sin((double) class160.field2918 / 16.0D) * 12.0D);
            ++class160.field2918;
        }
        if (arg1 < 54) {
            field4802 = true;
        }
        class185.field3346 += arg0;
        int var11 = ((1 & class228.field4012) + arg0) / 2;
        if (~var11 < -1) {
            for (int var12 = 0; class185.field3346 > var12; ++var12) {
                int var21 = 2 + (int) (Math.random() * 124.0D);
                int var22 = (int) (Math.random() * 128.0D) + 128;
                class159.field2886[(var22 << 7) + var21] = 192;
            }
            class185.field3346 = 0;
            for (int var13 = 0; var2 > var13; ++var13) {
                int var18 = var13 * 128;
                int var19 = 0;
                for (int var20 = -var11; var20 < 128; ++var20) {
                    if (~(var11 + var20) > -129) {
                        var19 += class159.field2886[var18 + var20 - -var11];
                    }
                    if (~(-var11 + -1 + var20) <= -1) {
                        var19 -= class159.field2886[-1 - var11 + var18 + var20];
                    }
                    if (~var20 <= -1) {
                        class72.field1480[var20 - -var18] = var19 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; var16 < var2; ++var16) {
                    int var17 = var16 * 128;
                    if (var11 + var16 < var2) {
                        var15 += class72.field1480[var14 + var17 - -(var11 * 128)];
                    }
                    if (~(var16 - 1 - var11) <= -1) {
                        var15 -= class72.field1480[var14 + var17 + -((var11 + 1) * 128)];
                    }
                    if (~var16 <= -1) {
                        class159.field2886[var14 + var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public final void method88(int arg0) {
        class217.method1481((byte) 61);
        ++field4792;
        if (arg0 < 81) {
            method1850((class141) null, (class21) null, -111, 72, 108, -55, true);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field4799;
        int[] var3 = super.field4511.method304(arg0, false);
        if (arg1 != 255) {
            field4793 = null;
        }
        if (super.field4511.field1029) {
            int[] var4 = this.method1711(arg0, 1, false);
            int[] var5 = this.method1711(arg0, 2, false);
            for (int var6 = 0; ~var6 > ~class49.field1052; ++var6) {
                int var7 = (4082 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field4795 >> 12;
                int var9 = class251.field4374[var7] * var8 >> 12;
                int var10 = class166.field3024 & var6 - -(var9 >> 12);
                int var11 = class1.field13[var7] * var8 >> 12;
                int var12 = class277.field4846 & (var11 >> 12) + arg0;
                int[] var13 = this.method1711(var12, 0, false);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }
}
