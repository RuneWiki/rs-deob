import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class169 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    private int field2824 = 0;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public int field2831 = -1;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    private int field2827 = 128;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    private int field2825 = 128;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "Z")
    public boolean field2839 = false;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    private int field2846 = 0;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    private int field2830 = 0;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "[I")
    public static int[] field2843 = new int[2];

    @OriginalMember(owner = "client!im", name = "u", descriptor = "Loh;")
    public static class15 field2844 = new class15(64);

    @OriginalMember(owner = "client!im", name = "z", descriptor = "Lbe;")
    public static class283 field2849 = class153.method941(126, "Sprites geladen)3");

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    private int field2826;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Lek;")
    public static class172 field2832;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "Lcm;")
    public static class181 field2848;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "[S")
    private short[] field2834;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "[S")
    private short[] field2835;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "[S")
    private short[] field2842;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "[S")
    private short[] field2845;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IILdh;IIIIZIILhk;III)Lhk;", line = 8)
    public static final class289 method1069(int arg0, int arg1, class157 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, class289 arg10, int arg11, int arg12, int arg13) {
        field2829++;
        long var14 = ((long) arg0 << 32) + ((long) ((arg5 << 24) + (arg8 << 16) + arg9) + ((long) arg11 << 48));
        class289 var16 = (class289) class231.field3922.method1629(-75, var14);
        if (var16 == null) {
            byte var17;
            if (arg9 == 1) {
                var17 = 9;
            } else if (arg9 == 2) {
                var17 = 12;
            } else if (arg9 == 3) {
                var17 = 15;
            } else if (arg9 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class165 var19 = new class165((var17 * var18) + 1, var17 * 2 * var18 + -var17, 0);
            int[] var20 = new int[] { 64, 96, 128 };
            int[][] var21 = new int[var18][var17];
            int var22 = var19.method1010(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var20[var23];
                int var25 = var20[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class139.field2316[var27] * var25 + arg4 >> 16;
                    int var29 = class139.field2309[var27] * var24 + arg12 >> 16;
                    var21[var23][var26] = var19.method1010(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                short var33 = (short) (((arg0 & 0xFC00) * var32 + (arg11 & 0xFC00) * var31 & 0xFC0000) + ((arg0 & 0x7F) * var32 + (arg11 & 0x7F) * var31 & 0x7F00) + ((arg0 & 0x380) * var32 + (arg11 & 0x380) * var31 & 0x38000) >> 8);
                byte var34 = (byte) (arg5 * var31 + arg8 * var32 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var19.method1002(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var33, var34);
                    } else {
                        var19.method1002(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var19.method1002(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var19.method1012(64, 768, -50, -10, -50);
            class231.field3922.method1630(true, var14, var16);
        }
        int var36 = arg9 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        if (arg6 != 1) {
            method1077(70, true, (class104[]) null);
        }
        int var39 = var36;
        int var40 = var36;
        if (arg7) {
            if (arg3 > 1152 && arg3 < 1920) {
                var39 = var36 + 128;
            }
            if (arg3 > 1664 || arg3 < 384) {
                var37 -= 128;
            }
            if (arg3 > 640 && arg3 < 1408) {
                var40 = var36 + 128;
            }
            if (arg3 > 128 && arg3 < 896) {
                var38 -= 128;
            }
        }
        int var41 = arg10.method1346();
        if (var41 < var38) {
            var41 = var38;
        }
        int var42 = arg10.method1327();
        int var43 = arg10.method1358();
        if (var43 < var37) {
            var43 = var37;
        }
        int var44 = arg10.method1370();
        if (var42 > var39) {
            var42 = var39;
        }
        if (var40 < var44) {
            var44 = var40;
        }
        class42 var45 = null;
        if (arg2 != null) {
            int var46 = arg2.field2578[arg13];
            var45 = class242.method1635(arg6 ^ 0x1, var46 >> 16);
            arg13 = var46 & 0xFFFF;
        }
        class289 var47;
        if (var45 == null) {
            var47 = var16.method1365(true, true);
            var47.method1334((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method1325((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method1365(!var45.method257(12, arg13), true);
            var47.method1334((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method1325((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method1348(var45, arg13);
        }
        if (arg3 != 0) {
            var47.method1356(arg3);
        }
        class206 var48 = (class206) var47;
        if (arg1 != class42.method254(class61.field850, arg4 + var43, arg12 + var41, -20341) || class42.method254(class61.field850, arg4 + var44, arg12 + var42, -20341) != arg1) {
            for (int var49 = 0; var49 < var48.field3511; var49++) {
                var48.field3508[var49] += class42.method254(class61.field850, var48.field3515[var49] + arg4, var48.field3532[var49] - -arg12, -20341) - arg1;
            }
            var48.field3512.field340 = false;
            var48.field3537.field324 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIII)I", line = 219)
    public static final int method1070(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        field2841++;
        int var6 = arg1 / arg3;
        int var7 = class223.method1462(var4, var6, 28778);
        int var8 = arg1 & arg3 - 1;
        if (arg2 >= -105) {
            return 7;
        }
        int var9 = class223.method1462(var4 + 1, var6, 28778);
        int var10 = class223.method1462(var4, var6 + 1, 28778);
        int var11 = class223.method1462(var4 + 1, var6 + 1, 28778);
        int var12 = class15.method80(var7, arg3, false, var5, var9);
        int var13 = class15.method80(var10, arg3, false, var5, var11);
        return class15.method80(var12, arg3, false, var8, var13);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lfe;ZI)V", line = 260)
    private final void method1071(class229 arg0, boolean arg1, int arg2) {
        field2838++;
        if (arg2 == 1) {
            this.field2826 = arg0.method1496(true);
        } else if (arg2 == 2) {
            this.field2831 = arg0.method1496(true);
        } else if (arg2 == 4) {
            this.field2825 = arg0.method1496(true);
        } else if (arg2 == 5) {
            this.field2827 = arg0.method1496(true);
        } else if (arg2 == 6) {
            this.field2830 = arg0.method1496(true);
        } else if (arg2 == 7) {
            this.field2846 = arg0.method1535((byte) 125);
        } else if (arg2 == 8) {
            this.field2824 = arg0.method1535((byte) 87);
        } else if (arg2 == 9) {
            this.field2839 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method1535((byte) 105);
            this.field2842 = new short[var4];
            this.field2845 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2845[var5] = (short) arg0.method1496(true);
                this.field2842[var5] = (short) arg0.method1496(true);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1535((byte) 96);
            this.field2834 = new short[var6];
            this.field2835 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2835[var7] = (short) arg0.method1496(arg1);
                this.field2834[var7] = (short) arg0.method1496(true);
            }
        }
        if (!arg1) {
            method1077(-32, true, (class104[]) null);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BZ)V", line = 344)
    public static final void method1072(byte arg0, boolean arg1) {
        for (class183 var2 = (class183) class58.field797.method1812((byte) 67); var2 != null; var2 = (class183) class58.field797.method1813((byte) 69)) {
            if (var2.field3155 != null) {
                class301.field5089.method1275(var2.field3155);
                var2.field3155 = null;
            }
            if (var2.field3135 != null) {
                class301.field5089.method1275(var2.field3135);
                var2.field3135 = null;
            }
            var2.method557((byte) -89);
        }
        if (arg0 != -95) {
            field2849 = (class283) null;
        }
        if (arg1) {
            for (class183 var3 = (class183) class259.field4397.method1812((byte) -111); var3 != null; var3 = (class183) class259.field4397.method1813((byte) 104)) {
                if (var3.field3155 != null) {
                    class301.field5089.method1275(var3.field3155);
                    var3.field3155 = null;
                }
                var3.method557((byte) -89);
            }
            for (class183 var4 = (class183) class172.field2899.method1607(arg0 + 95); var4 != null; var4 = (class183) class172.field2899.method1604((byte) 127)) {
                if (var4.field3155 != null) {
                    class301.field5089.method1275(var4.field3155);
                    var4.field3155 = null;
                }
                var4.method557((byte) -89);
            }
        }
        field2828++;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 414)
    public static void method1073(int arg0) {
        field2843 = null;
        field2848 = null;
        field2844 = null;
        field2832 = null;
        field2849 = null;
        if (arg0 != -1153) {
            method1072((byte) -126, true);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lhk;", line = 442)
    public final class289 method1074(int arg0, int arg1) {
        field2833++;
        class289 var3 = (class289) class107.field1824.method1629(106, (long) this.field2847);
        if (var3 == null) {
            class165 var4 = class165.method1018(class92.field1563, this.field2826, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2845 != null) {
                for (int var5 = 0; var5 < this.field2845.length; var5++) {
                    var4.method1003(this.field2845[var5], this.field2842[var5]);
                }
            }
            if (this.field2835 != null) {
                for (int var6 = 0; var6 < this.field2835.length; var6++) {
                    var4.method1011(this.field2835[var6], this.field2834[var6]);
                }
            }
            var3 = var4.method1012(this.field2846 + 64, 850 - -this.field2824, -30, -50, -30);
            class107.field1824.method1630(true, (long) this.field2847, var3);
        }
        class289 var7;
        if (this.field2831 == -1 || arg0 == -1) {
            var7 = var3.method1365(true, true);
        } else {
            var7 = class132.method821(128, this.field2831).method961(var3, arg0, (byte) 82);
        }
        if (arg1 <= 18) {
            this.field2824 = 11;
        }
        if (this.field2825 != 128 || this.field2827 != 128) {
            var7.method1334(this.field2825, this.field2827, this.field2825);
        }
        if (this.field2830 != 0) {
            if (this.field2830 == 90) {
                var7.method1368();
            }
            if (this.field2830 == 180) {
                var7.method1360();
            }
            if (this.field2830 == 270) {
                var7.method1339();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lfe;B)V", line = 534)
    public final void method1075(class229 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1535((byte) 113);
            if (var3 == 0) {
                field2840++;
                if (arg1 != -35) {
                    this.method1074(94, 45);
                }
                return;
            }
            this.method1071(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 554)
    public static final void method1076(byte arg0) {
        int var1 = -56 % ((-arg0 - 62) / 52);
        field2836++;
        for (class6 var2 = (class6) class205.field3496.method1812((byte) -112); var2 != null; var2 = (class6) class205.field3496.method1813((byte) 53)) {
            class247 var3 = var2.field57;
            if (class61.field850 != var3.field4211 || class75.field1309 > var3.field4197) {
                var2.method557((byte) -89);
            } else if (var3.field4203 <= class75.field1309) {
                if (var3.field4208 > 0) {
                    class60 var4 = class33.field493[var3.field4208 - 1];
                    if (var4 != null && var4.field1193 >= 0 && var4.field1193 < 13312 && var4.field1210 >= 0 && var4.field1210 < 13312) {
                        var3.method1683(var4.field1210, var4.field1193, class75.field1309, false, class42.method254(var3.field4211, var4.field1210, var4.field1193, -20341) - var3.field4201);
                    }
                }
                if (var3.field4208 < 0) {
                    int var5 = -var3.field4208 - 1;
                    class191 var6;
                    if (class213.field3622 == var5) {
                        var6 = class213.field3624;
                    } else {
                        var6 = class149.field2436[var5];
                    }
                    if (var6 != null && var6.field1193 >= 0 && var6.field1193 < 13312 && var6.field1210 >= 0 && var6.field1210 < 13312) {
                        var3.method1683(var6.field1210, var6.field1193, class75.field1309, false, class42.method254(var3.field4211, var6.field1210, var6.field1193, -20341) - var3.field4201);
                    }
                }
                var3.method1679((byte) 65, class44.field606);
                class81.method532(class61.field850, (int) var3.field4225, (int) var3.field4214, (int) var3.field4204, 60, var3, var3.field4222, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ[Lpk;)V", line = 607)
    public static final void method1077(int arg0, boolean arg1, class104[] arg2) {
        field2837++;
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class252.field4282[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class252.field4282[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method692(var6, arg0 ^ 0xFFFFFF8F, var5);
                            }
                        }
                    }
                }
            }
            class114.field1915 += (int) (Math.random() * 5.0D) - 2;
            if (class114.field1915 < -16) {
                class114.field1915 = -16;
            }
            class157.field2565 += (int) (Math.random() * 5.0D) - 2;
            if (class114.field1915 > 16) {
                class114.field1915 = 16;
            }
            if (class157.field2565 < -8) {
                class157.field2565 = -8;
            }
            if (class157.field2565 > 8) {
                class157.field2565 = 8;
            }
        }
        int[][] var8 = new int[104][104];
        int var9 = class114.field1915 >> 1;
        int var10 = class157.field2565 >> 2 << 10;
        int[][] var11 = new int[104][104];
        int var12 = 0;
        if (arg0 != -5) {
            method1072((byte) 86, true);
        }
        while (var12 < var3) {
            byte[][] var13 = class111.field1877[var12];
            if (class44.field601) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        byte var16 = 74;
                        int var17 = (var13[var15][var14 + 1] >> 3) + (var13[var15 - 1][var14] >> 2) + (var13[var15 + 1][var14] >> 3) - (-(var13[var15][var14 + -1] >> 2) - (var13[var15][var14] >> 1));
                        var11[var15][var14] = var16 - var17;
                    }
                }
            } else {
                int var18 = (int) class59.field811[0];
                int var19 = (int) class59.field811[2];
                int var20 = (int) class59.field811[1];
                int var21 = (int) Math.sqrt((double) (var20 * var20 + var18 * var18 + var19 * var19));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        byte var25 = 96;
                        int var26 = class65.field890[var12][var24 + 1][var23] - class65.field890[var12][var24 - 1][var23];
                        int var27 = class65.field890[var12][var24][var23 + 1] - class65.field890[var12][var24][var23 - 1];
                        int var28 = (int) Math.sqrt((double) (var26 * var26 + var27 * var27 + 65536));
                        int var29 = (var26 << 8) / var28;
                        int var30 = -65536 / var28;
                        int var31 = (var27 << 8) / var28;
                        int var32 = (var18 * var29 + var19 * var31 + (var20 * var30)) / var22 + var25;
                        int var33 = (var13[var24][var23 + 1] >> 3) + (var13[var24][var23 - 1] >> 2) + (var13[var24 + -1][var23] >> 2) + ((var13[var24 + 1][var23] >> 3) - -(var13[var24][var23] >> 1));
                        var11[var24][var23] = var32 - ((int) ((float) var33 * 1.7F));
                    }
                }
            }
            for (int var34 = 0; var34 < 104; var34++) {
                class92.field1573[var34] = 0;
                class180.field3101[var34] = 0;
                class288.field4891[var34] = 0;
                class97.field1659[var34] = 0;
                class248.field4236[var34] = 0;
            }
            for (int var35 = -5; var35 < 104; var35++) {
                for (int var36 = 0; var36 < 104; var36++) {
                    int var37 = var35 + 5;
                    int var10002;
                    if (var37 < 104) {
                        int var38 = class301.field5092[var12][var37][var36] & 0xFF;
                        if (var38 > 0) {
                            class196 var39 = class151.method931(94, var38 - 1);
                            class92.field1573[var36] += var39.field3349;
                            class180.field3101[var36] += var39.field3340;
                            class288.field4891[var36] += var39.field3350;
                            class97.field1659[var36] += var39.field3335;
                            var10002 = class248.field4236[var36]++;
                        }
                    }
                    int var40 = var35 - 5;
                    if (var40 >= 0) {
                        int var41 = class301.field5092[var12][var40][var36] & 0xFF;
                        if (var41 > 0) {
                            class196 var42 = class151.method931(105, var41 - 1);
                            class92.field1573[var36] -= var42.field3349;
                            class180.field3101[var36] -= var42.field3340;
                            class288.field4891[var36] -= var42.field3350;
                            class97.field1659[var36] -= var42.field3335;
                            var10002 = class248.field4236[var36]--;
                        }
                    }
                }
                if (var35 >= 0) {
                    int var43 = 0;
                    int var44 = 0;
                    int var45 = 0;
                    int var46 = 0;
                    int var47 = 0;
                    for (int var48 = -5; var48 < 104; var48++) {
                        int var49 = var48 + 5;
                        if (var49 < 104) {
                            var45 += class288.field4891[var49];
                            var47 += class248.field4236[var49];
                            var43 += class180.field3101[var49];
                            var44 += class92.field1573[var49];
                            var46 += class97.field1659[var49];
                        }
                        int var50 = var48 - 5;
                        if (var50 >= 0) {
                            var47 -= class248.field4236[var50];
                            var43 -= class180.field3101[var50];
                            var44 -= class92.field1573[var50];
                            var45 -= class288.field4891[var50];
                            var46 -= class97.field1659[var50];
                        }
                        if (var48 >= 0 && var47 > 0) {
                            var8[var35][var48] = class14.method75(var45 / var47, 4626, var43 / var47, var44 * 256 / var46);
                        }
                    }
                }
            }
            for (int var51 = 1; var51 < 103; var51++) {
                label737: for (int var52 = 1; var52 < 103; var52++) {
                    if (arg1 || class96.method622((byte) 0) || (class252.field4282[0][var51][var52] & 0x2) != 0 || (class252.field4282[var12][var51][var52] & 0x10) == 0 && class269.method1817(25694, var52, var12, var51) == class83.field1405) {
                        if (var12 < class124.field2068) {
                            class124.field2068 = var12;
                        }
                        int var53 = class301.field5092[var12][var51][var52] & 0xFF;
                        int var54 = class122.field2034[var12][var51][var52] & 0xFF;
                        if (var53 > 0 || var54 > 0) {
                            int var55 = class65.field890[var12][var51][var52];
                            int var56 = class65.field890[var12][var51 + 1][var52 + 1];
                            int var57 = class65.field890[var12][var51 + 1][var52];
                            int var58 = class65.field890[var12][var51][var52 + 1];
                            if (var12 > 0) {
                                boolean var59 = true;
                                if (var53 == 0 && class54.field736[var12][var51][var52] != 0) {
                                    var59 = false;
                                }
                                if (var54 > 0 && !class174.method1135(var54 - 1, 114).field2399) {
                                    var59 = false;
                                }
                                if (var59 && var55 == var57 && var55 == var56 && var55 == var58) {
                                    class82.field1398[var12][var51][var52] = class53.method337(class82.field1398[var12][var51][var52], 4);
                                }
                            }
                            int var60;
                            int var63;
                            if (var53 > 0) {
                                var60 = var8[var51][var52];
                                int var61 = (var60 & 0x7F) + var9;
                                if (var61 < 0) {
                                    var61 = 0;
                                } else if (var61 > 127) {
                                    var61 = 127;
                                }
                                int var62 = (var10 + var60 & 0xFC00) + (var60 & 0x380) + var61;
                                var63 = class139.field2317[class64.method411(96, var62, (byte) 108)];
                            } else {
                                var60 = -1;
                                var63 = 0;
                            }
                            int var64 = var11[var51][var52];
                            int var65 = var11[var51 + 1][var52];
                            int var66 = var11[var51 + 1][var52 + 1];
                            int var67 = var11[var51][var52 + 1];
                            if (var54 == 0) {
                                class245.method1665(var12, var51, var52, 0, 0, -1, var55, var57, var56, var58, class64.method411(var64, var60, (byte) 57), class64.method411(var65, var60, (byte) 69), class64.method411(var66, var60, (byte) 112), class64.method411(var67, var60, (byte) 52), 0, 0, 0, 0, var63, 0);
                                if (var12 > 0 && var60 != -1 && class151.method931(53, var53 - 1).field3346) {
                                    class212.method1398(0, 0, true, false, var51, var52, var55 - class65.field890[0][var51][var52], -class65.field890[0][var51 + 1][var52] + var57, var56 - class65.field890[0][var51 + 1][var52 + 1], -class65.field890[0][var51][var52 + 1] + var58);
                                }
                                if (!arg1 && class140.field2329 != null && var12 == 0) {
                                    for (int var83 = var51 - 1; var83 <= var51 + 1; var83++) {
                                        for (int var84 = var52 - 1; var84 <= (var52 + 1); var84++) {
                                            if ((var51 != var83 || var52 != var84) && var83 >= 0 && var83 < 104 && var84 >= 0 && var84 < 104) {
                                                int var85 = class122.field2034[var12][var83][var84] & 0xFF;
                                                if (var85 != 0) {
                                                    class145 var86 = class174.method1135(var85 - 1, arg0 ^ 0xFFFFFFBB);
                                                    if (var86.field2397 != -1 && class139.field2315.method629(arg0 + 125, var86.field2397) == 4) {
                                                        class140.field2329[var51][var52] = (var86.field2389 << 24) + var86.field2395;
                                                        continue label737;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var68 = class177.field3035[var12][var51][var52];
                                int var69 = class54.field736[var12][var51][var52] + 1;
                                class145 var70 = class174.method1135(var54 - 1, 65);
                                if (!arg1 && class140.field2329 != null && var12 == 0) {
                                    if (var70.field2397 != -1 && class139.field2315.method629(arg0 - 69, var70.field2397) == 4) {
                                        class140.field2329[var51][var52] = (var70.field2389 << 24) + var70.field2395;
                                    } else {
                                        label704: for (int var71 = var51 - 1; var71 <= var51 + 1; var71++) {
                                            for (int var72 = var52 - 1; var72 <= (var52 + 1); var72++) {
                                                if ((var51 != var71 || var52 != var72) && var71 >= 0 && var71 < 104 && var72 >= 0 && var72 < 104) {
                                                    int var73 = class122.field2034[var12][var71][var72] & 0xFF;
                                                    if (var73 != 0) {
                                                        class145 var74 = class174.method1135(var73 - 1, arg0 ^ 0xFFFFFF8A);
                                                        if (var74.field2397 != -1 && class139.field2315.method629(-101, var74.field2397) == 4) {
                                                            class140.field2329[var51][var52] = (var74.field2389 << 24) + var74.field2395;
                                                            break label704;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var75 = var70.field2397;
                                if (var75 >= 0 && !class139.field2315.method652(var75, (byte) 95)) {
                                    var75 = -1;
                                }
                                int var76;
                                int var79;
                                if (var75 >= 0) {
                                    var76 = -1;
                                    var79 = class139.field2317[class36.method230(96, class139.field2315.method641(var75, (byte) -92), 126)];
                                } else if (var70.field2405 == -1) {
                                    var79 = 0;
                                    var76 = -2;
                                } else {
                                    var76 = var70.field2405;
                                    int var77 = (var76 & 0x7F) + var9;
                                    if (var77 < 0) {
                                        var77 = 0;
                                    } else if (var77 > 127) {
                                        var77 = 127;
                                    }
                                    int var78 = (var10 + var76 & 0xFC00) - (-(var76 & 0x380) - var77);
                                    var79 = class139.field2317[class36.method230(96, var78, 126)];
                                }
                                if (var70.field2402 >= 0) {
                                    int var80 = var70.field2402;
                                    int var81 = (var80 & 0x7F) + var9;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var10 + var80 & 0xFC00) + (var80 & 0x380) + var81;
                                    var79 = class139.field2317[class36.method230(96, var82, arg0 ^ 0xFFFFFF85)];
                                }
                                class245.method1665(var12, var51, var52, var69, var68, var75, var55, var57, var56, var58, class64.method411(var64, var60, (byte) 86), class64.method411(var65, var60, (byte) 72), class64.method411(var66, var60, (byte) 57), class64.method411(var67, var60, (byte) 62), class36.method230(var64, var76, arg0 + 131), class36.method230(var65, var76, 126), class36.method230(var66, var76, 126), class36.method230(var67, var76, arg0 + 131), var63, var79);
                                if (var12 > 0) {
                                    class212.method1398(var69, var68, var76 == -2 || !var70.field2392, var60 == -1 || !class151.method931(123, var53 - 1).field3346, var51, var52, var55 - class65.field890[0][var51][var52], -class65.field890[0][var51 - -1][var52] + var57, var56 - class65.field890[0][var51 + 1][var52 + 1], -class65.field890[0][var51][var52 + 1] + var58);
                                }
                            }
                        }
                    }
                }
            }
            float[][] var87 = new float[105][105];
            float[][] var88 = new float[105][105];
            int[][] var89 = class65.field890[var12];
            float[][] var90 = new float[105][105];
            for (int var91 = 1; var91 <= 103; var91++) {
                for (int var92 = 1; var92 <= 103; var92++) {
                    int var93 = var89[var92 + 1][var91] - var89[var92 - 1][var91];
                    int var94 = var89[var92][var91 + 1] - var89[var92][var91 - 1];
                    float var95 = (float) Math.sqrt((double) (var93 * var93 + (var94 * var94) + 65536));
                    var87[var92][var91] = (float) var93 / var95;
                    var88[var92][var91] = -256.0F / var95;
                    var90[var92][var91] = (float) var94 / var95;
                }
            }
            if (arg1) {
                class100[] var96 = class259.method1755(class252.field4282, class54.field736[var12], false, var87, class65.field890[var12], class1.field12[0], var90, var11, class177.field3035[var12], var12, class140.field2329, var8, class122.field2034[var12], var88, class301.field5092[var12]);
                class38.method237(var12, var96);
            } else {
                class100[] var97 = class259.method1755(class252.field4282, class54.field736[var12], false, var87, class65.field890[var12], (int[][]) null, var90, var11, class177.field3035[var12], var12, (int[][]) null, var8, class122.field2034[var12], var88, class301.field5092[var12]);
                class100[] var98 = class1.method5((byte) -77, class122.field2034[var12], var87, var90, class252.field4282, class54.field736[var12], class301.field5092[var12], var11, var12, class177.field3035[var12], class65.field890[var12], var88);
                class100[] var99 = new class100[var97.length + var98.length];
                for (int var100 = 0; var100 < var97.length; var100++) {
                    var99[var100] = var97[var100];
                }
                for (int var101 = 0; var101 < var98.length; var101++) {
                    var99[var97.length + var101] = var98[var101];
                }
                class38.method237(var12, var99);
                class186.method1224(var12, class65.field890[var12], class17.field198, class54.field736[var12], var87, (byte) 83, var90, class122.field2034[var12], var88, class301.field5092[var12], class177.field3035[var12], class17.field192);
            }
            class301.field5092[var12] = (byte[][]) null;
            class122.field2034[var12] = (byte[][]) null;
            class54.field736[var12] = (byte[][]) null;
            class177.field3035[var12] = (byte[][]) null;
            class111.field1877[var12] = (byte[][]) null;
            var12++;
        }
        class166.method1022(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var102 = 0; var102 < 104; var102++) {
            for (int var103 = 0; var103 < 104; var103++) {
                if ((class252.field4282[1][var102][var103] & 0x2) == 2) {
                    class50.method290(var102, var103);
                }
            }
        }
        for (int var104 = 0; var104 < 4; var104++) {
            for (int var105 = 0; var105 <= 104; var105++) {
                for (int var106 = 0; var106 <= 104; var106++) {
                    if ((class82.field1398[var104][var106][var105] & 0x1) != 0) {
                        int var107;
                        for (var107 = var105; var107 > 0 && (class82.field1398[var104][var106][var107 - 1] & 0x1) != 0; var107--) {
                        }
                        int var108;
                        for (var108 = var105; var108 < 104 && (class82.field1398[var104][var106][var108 + 1] & 0x1) != 0; var108++) {
                        }
                        int var109;
                        label435: for (var109 = var104; var109 > 0; var109--) {
                            for (int var110 = var107; var110 <= var108; var110++) {
                                if ((class82.field1398[var109 - 1][var106][var110] & 0x1) == 0) {
                                    break label435;
                                }
                            }
                        }
                        int var111;
                        label423: for (var111 = var104; var111 < 3; var111++) {
                            for (int var112 = var107; var112 <= var108; var112++) {
                                if ((class82.field1398[var111 + 1][var106][var112] & 0x1) == 0) {
                                    break label423;
                                }
                            }
                        }
                        int var113 = (var108 + 1 - var107) * (var111 + 1 - var109);
                        if (var113 >= 8) {
                            short var114 = 240;
                            int var115 = class65.field890[var111][var106][var107] - var114;
                            int var116 = class65.field890[var109][var106][var107];
                            class199.method1277(1, var106 * 128, var106 * 128, var107 * 128, var108 * 128 + 128, var115, var116);
                            for (int var117 = var109; var117 <= var111; var117++) {
                                for (int var118 = var107; var118 <= var108; var118++) {
                                    class82.field1398[var117][var106][var118] = class178.method1174(class82.field1398[var117][var106][var118], -2);
                                }
                            }
                        }
                    }
                    if ((class82.field1398[var104][var106][var105] & 0x2) != 0) {
                        int var119 = var106;
                        int var120;
                        for (var120 = var106; var120 < 104 && (class82.field1398[var104][var120 + 1][var105] & 0x2) != 0; var120++) {
                        }
                        int var121 = var104;
                        while (var119 > 0 && (class82.field1398[var104][var119 - 1][var105] & 0x2) != 0) {
                            var119--;
                        }
                        label491: while (var121 > 0) {
                            for (int var122 = var119; var122 <= var120; var122++) {
                                if ((class82.field1398[var121 - 1][var122][var105] & 0x2) == 0) {
                                    break label491;
                                }
                            }
                            var121--;
                        }
                        int var123;
                        label479: for (var123 = var104; var123 < 3; var123++) {
                            for (int var124 = var119; var124 <= var120; var124++) {
                                if ((class82.field1398[var123 + 1][var124][var105] & 0x2) == 0) {
                                    break label479;
                                }
                            }
                        }
                        int var125 = (var120 + 1 - var119) * (var123 + 1 - var121);
                        if (var125 >= 8) {
                            short var126 = 240;
                            int var127 = class65.field890[var123][var119][var105] - var126;
                            int var128 = class65.field890[var121][var119][var105];
                            class199.method1277(2, var119 * 128, var120 * 128 + 128, var105 * 128, var105 * 128, var127, var128);
                            for (int var129 = var121; var129 <= var123; var129++) {
                                for (int var130 = var119; var130 <= var120; var130++) {
                                    class82.field1398[var129][var130][var105] = class178.method1174(class82.field1398[var129][var130][var105], -3);
                                }
                            }
                        }
                    }
                    if ((class82.field1398[var104][var106][var105] & 0x4) != 0) {
                        int var131;
                        for (var131 = var105; var131 > 0 && (class82.field1398[var104][var106][var131 - 1] & 0x4) != 0; var131--) {
                        }
                        int var132 = var106;
                        int var133 = var106;
                        int var134;
                        for (var134 = var105; var134 < 104 && (class82.field1398[var104][var106][var134 + 1] & 0x4) != 0; var134++) {
                        }
                        label545: while (var132 > 0) {
                            for (int var135 = var131; var135 <= var134; var135++) {
                                if ((class82.field1398[var104][var132 - 1][var135] & 0x4) == 0) {
                                    break label545;
                                }
                            }
                            var132--;
                        }
                        label534: while (var133 < 104) {
                            for (int var136 = var131; var136 <= var134; var136++) {
                                if ((class82.field1398[var104][var133 + 1][var136] & 0x4) == 0) {
                                    break label534;
                                }
                            }
                            var133++;
                        }
                        if ((var133 + 1 - var132) * (var134 + 1 - var131) >= 4) {
                            int var137 = class65.field890[var104][var132][var131];
                            class199.method1277(4, var132 * 128, var133 * 128 + 128, var131 * 128, var134 * 128 + 128, var137, var137);
                            for (int var138 = var132; var138 <= var133; var138++) {
                                for (int var139 = var131; var139 <= var134; var139++) {
                                    class82.field1398[var104][var138][var139] = class178.method1174(class82.field1398[var104][var138][var139], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
