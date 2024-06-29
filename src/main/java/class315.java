import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class315 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Ldq;")
    private class490 field4299;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lya;")
    private class38 field4305;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Lmn;")
    public static class247 field4315 = new class247(16);

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field4321 = 20;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lri;")
    public static class74 field4320 = new class74(5, 7);

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Lqp;")
    public static class466 field4322 = new class466(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lbm;")
    public static class75 field4300;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[I[Ll;Ljava/lang/String;IBI)V")
    public final void method1827(int arg0, int arg1, int[] arg2, class16[] arg3, String arg4, int arg5, byte arg6, int arg7) {
        field4310++;
        if (arg4 == null) {
            return;
        }
        if (arg6 != -24) {
            field4320 = null;
        }
        this.method1842(arg1, arg6 - 74, arg7);
        this.method1845(0, arg3, 0, null, 14455, arg4, arg0, arg2, arg5);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1828(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        if (arg6 != 29969) {
            this.field4305 = null;
        }
        field4309++;
        if (arg4 == null) {
            return;
        }
        this.method1842(arg0, -83, arg3);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1838(arg1, var9, arg4, 0, null, null, null, arg2 - this.field4299.method2867(arg4, (byte) -70) / 2);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLma;II)V")
    public abstract void method1058(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Ll;Ljava/util/Random;ILjava/lang/String;[IIII)I")
    public final int method1829(int arg0, int arg1, class16[] arg2, Random arg3, int arg4, String arg5, int[] arg6, int arg7, int arg8, int arg9) {
        field4311++;
        if (arg5 == null) {
            return 0;
        }
        arg3.setSeed((long) arg7);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method1842(var11 << 24 | arg4 & 0xFFFFFF, -77, arg8 & 0xFFFFFF | var11 << 24);
        int var12 = arg5.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        int var15 = 0;
        int var16 = -99 / ((62 - arg1) / 61);
        while (var15 < var12) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
            var15++;
        }
        this.method1838(arg9, null, arg5, 0, var13, arg6, arg2, arg0);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[II[ILjava/lang/String;I[Ll;ILjava/util/Random;IIIIII)I")
    public final int method1830(int arg0, int[] arg1, int arg2, int[] arg3, String arg4, int arg5, class16[] arg6, int arg7, Random arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field4308++;
        if (arg4 == null) {
            return 0;
        }
        arg8.setSeed((long) arg0);
        int var16 = (arg8.nextInt() & 0x1F) + 192;
        this.method1842(var16 << 24 | arg13 & 0xFFFFFF, 40, arg14 & 0xFFFFFF | var16 << 24);
        int var17 = arg4.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg8.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg12;
        int var22 = this.field4299.field7165 + arg2;
        if (arg11 == 1) {
            var22 += (arg9 - this.field4299.field7165 - this.field4299.field7155) / 2;
        } else if (arg11 == 2) {
            var22 = arg2 + arg9 - this.field4299.field7155;
        }
        int var23 = -1;
        if (arg5 == 1) {
            var23 = var19 + this.field4299.method2867(arg4, (byte) -70);
            var21 = (arg7 - var23) / 2 + arg12;
        } else if (arg5 == 2) {
            var23 = var19 + this.field4299.method2867(arg4, (byte) -70);
            var21 = arg7 + arg12 - var23;
        }
        this.method1838(var22, null, arg4, arg10 ^ arg10, var18, arg1, arg6, var21);
        if (arg3 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field4299.method2867(arg4, (byte) -70);
            }
            arg3[2] = var23;
            arg3[3] = this.field4299.field7165 + this.field4299.field7155;
            arg3[1] = var22 - this.field4299.field7165;
            arg3[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBILjava/lang/String;I)V")
    public final void method1831(int arg0, int arg1, byte arg2, int arg3, String arg4, int arg5) {
        field4314++;
        if (arg4 == null) {
            return;
        }
        this.method1842(arg1, 31, arg5);
        if (arg2 != 3) {
            this.method1839(72, 105, 116, 20, -99, 4, null, 58);
        }
        this.method1845(0, null, 0, null, arg2 ^ 0x3874, arg4, arg0, null, arg3 - this.field4299.method2867(arg4, (byte) -70));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILma;IIIILjava/lang/String;IIIII[Ll;I[II)I")
    public final int method1832(int arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class16[] arg12, int arg13, int[] arg14, int arg15) {
        field4304++;
        if (arg15 != 1) {
            this.field4299 = null;
        }
        return this.method1841(arg14, false, arg0, arg9, arg8, 0, arg11, arg3, arg10, arg1, arg7, arg12, arg6, arg5, arg2, arg13, arg4);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method1833(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4312++;
        if (arg3 > 5 && arg1 != null) {
            this.method1842(arg2, 105, arg5);
            this.method1845(0, null, 0, null, 14455, arg1, arg4, null, arg0);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1834(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field4313++;
        if (arg3 == null) {
            return;
        }
        this.method1842(arg2, 43, arg0);
        int var8 = arg3.length();
        if (arg5 != -12700) {
            this.field4299 = null;
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1838(arg6, var10, arg3, 0, var9, null, null, arg4 - this.field4299.method2867(arg3, (byte) -70) / 2);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILma;ILl;IILem;)V")
    public static final void method1835(int arg0, int arg1, class10 arg2, int arg3, class16 arg4, int arg5, int arg6, class150 arg7) {
        field4319++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class491.field7168 == 4) {
            var8 = (int) class498.field7255 & 0x3FFF;
        } else {
            var8 = (int) class498.field7255 + class302.field4143 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field2204 / 2, arg7.field2322 / 2) + 10;
        int var10 = arg0 * arg0 + (arg5 * arg5);
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class183.field2684[var8];
        if (arg1 != 0) {
            method1837(null, null);
        }
        int var12 = class183.field2678[var8];
        if (class491.field7168 != 4) {
            var12 = var12 * 256 / (class162.field2435 + 256);
            var11 = var11 * 256 / (class162.field2435 + 256);
        }
        int var13 = arg0 * var12 + arg5 * var11 >> 15;
        int var14 = arg5 * var12 - (arg0 * var11) >> 15;
        arg4.method95(arg7.field2204 / 2 + arg3 + var13 - (arg4.method84() / 2), arg7.field2322 / 2 + -var14 + arg6 + -(arg4.method93() / 2), arg2, arg3, arg6);
    }

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method1057(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method1836(byte arg0) {
        field4315 = null;
        field4320 = null;
        if (arg0 != 87) {
            field4300 = null;
        }
        field4322 = null;
        field4300 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Leo;Lhg;)V")
    public static final void method1837(class194 arg0, class486 arg1) {
        if (!arg1.field7108) {
            return;
        }
        short var2 = arg1.field7102;
        short var3 = arg1.field7120;
        byte var4 = arg1.field7107;
        byte var5 = arg1.field7101;
        int var6 = (var2 << class523.field7736) + class131.field1925;
        int var7 = (var3 << class523.field7736) + class131.field1925;
        class486[][] var8 = class89.field1305[var4];
        float var9;
        if (class89.field1302 == class211.field2950) {
            class449.field6615.method305(class385.field5608[0].method361(var6, var7), class398.method2393(var2, var3), class11.method54(var2, var3), class140.method937(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class449.field6615.method245(3000.0F, var9 * 1.5F);
        if (arg1.field7109) {
            if (class209.field2912) {
                if (var4 > 0) {
                    class486 var10 = class89.field1305[var4 - 1][var2][var3];
                    if (var10 != null && var10.field7108) {
                        return;
                    }
                }
                if (var2 <= class368.field5398 && var2 > class214.field2997) {
                    class486 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field7108 && (var11.field7109 || (arg1.field7099 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class368.field5398 && var2 < class127.field1887 - 1) {
                    class486 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field7108 && (var12.field7109 || (arg1.field7099 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class403.field5916 && var3 > class149.field2153) {
                    class486 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field7108 && (var13.field7109 || (arg1.field7099 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class403.field5916 && var3 < class526.field7780 - 1) {
                    class486 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field7108 && (var14.field7109 || (arg1.field7099 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class209.field2912 = true;
            }
            arg1.field7109 = false;
            if (arg1.field7112 != null) {
                class486 var15 = arg1.field7112;
                class449.field6615.method245(3000.0F, (201.5F - (float) (var15.field7101 + 1) * 50.0F) * 1.5F);
                if (!class442.method2635(var15.field7101, var2, var3)) {
                    class211.field2950[var15.field7101].method358(var2, var3);
                }
                class90 var16 = var15.field7114;
                if (var16 != null) {
                    if (class211.field2948) {
                        if ((var16.field1315 & arg1.field7104) == 0) {
                            class36.method217(arg0, var4, var2, var3);
                        } else {
                            class102.method761(arg0, var16.field1315, var5, var2, var3);
                        }
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    var16.method484(class449.field6615, (byte) 118);
                }
                for (class164 var17 = var15.field7115; var17 != null; var17 = var17.field2467) {
                    class116 var18 = var17.field2468;
                    if (var18 != null) {
                        if (class211.field2948) {
                            class36.method217(arg0, var4, var2, var3);
                            class449.field6615.method255(arg0.field2765, arg0.field2763);
                        }
                        var18.method484(class449.field6615, (byte) 122);
                    }
                }
                class449.field6615.method245(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class442.method2635(var5, var2, var3);
            if (var19) {
                class211.field2950[var5].method358(var2, var3);
                class117 var20 = arg1.field7100;
                if (var20 != null && var20.field1751) {
                    if (var20.field1745) {
                        class449.field6615.method245(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class211.field2948) {
                        class36.method217(arg0, var4, var2, var3);
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    class289 var21 = var20.method484(class449.field6615, (byte) 121);
                    if (var21 != null) {
                        var21.field4005 = var20;
                        var21.field4002 = var4;
                        var21.field4006 = var2;
                        var21.field4008 = var3;
                        class296.field4069.method2454(-9946, var21);
                    }
                    if (var20.field1745) {
                        class449.field6615.method245(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class90 var24 = arg1.field7114;
            class147 var25 = arg1.field7103;
            if (var24 != null || var25 != null) {
                if (class368.field5398 == var2) {
                    var22++;
                } else if (class368.field5398 < var2) {
                    var22 += 2;
                }
                if (class403.field5916 == var3) {
                    var22 += 3;
                } else if (class403.field5916 > var3) {
                    var22 += 6;
                }
                var23 = class183.field2686[var22];
                arg1.field7104 = class372.field5439[var22];
            }
            if (var24 != null) {
                if ((var24.field1315 & class44.field533[var22]) == 0) {
                    arg1.field7113 = 0;
                } else if (var24.field1315 == 16) {
                    arg1.field7113 = 3;
                    arg1.field7111 = class348.field5089[var22];
                    arg1.field7106 = (byte) (3 - arg1.field7111);
                } else if (var24.field1315 == 32) {
                    arg1.field7113 = 6;
                    arg1.field7111 = class435.field6375[var22];
                    arg1.field7106 = (byte) (6 - arg1.field7111);
                } else if (var24.field1315 == 64) {
                    arg1.field7113 = 12;
                    arg1.field7111 = class196.field2786[var22];
                    arg1.field7106 = (byte) (12 - arg1.field7111);
                } else {
                    arg1.field7113 = 9;
                    arg1.field7111 = class510.field7568[var22];
                    arg1.field7106 = (byte) (9 - arg1.field7111);
                }
                if ((var24.field1315 & var23) != 0 && !class133.method911(var5, var2, var3, var24.field1315)) {
                    if (class211.field2948) {
                        class36.method217(arg0, var4, var2, var3);
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    class289 var26 = var24.method484(class449.field6615, (byte) 120);
                    if (var26 != null) {
                        var26.field4005 = var24;
                        var26.field4002 = var4;
                        var26.field4006 = var2;
                        var26.field4008 = var3;
                        class296.field4069.method2454(-9946, var26);
                    }
                }
                class90 var27 = arg1.field7118;
                if (var27 != null && (var27.field1315 & var23) != 0 && !class133.method911(var5, var2, var3, var27.field1315)) {
                    if (class211.field2948) {
                        class36.method217(arg0, var4, var2, var3);
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    class289 var28 = var27.method484(class449.field6615, (byte) 117);
                    if (var28 != null) {
                        var28.field4005 = var27;
                        var28.field4002 = var4;
                        var28.field4006 = var2;
                        var28.field4008 = var3;
                        class296.field4069.method2454(-9946, var28);
                    }
                }
            }
            if (var25 != null && !class398.method2402(var5, var2, var3, var25.method988(123))) {
                class147 var29 = arg1.field7105;
                class449.field6615.method245(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field2133 & var23) != 0) {
                    if (class211.field2948) {
                        class36.method217(arg0, var4, var2, var3);
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    class289 var30 = var25.method484(class449.field6615, (byte) 113);
                    if (var30 != null) {
                        var30.field4005 = var25;
                        var30.field4002 = var4;
                        var30.field4006 = var2;
                        var30.field4008 = var3;
                        class296.field4069.method2454(-9946, var30);
                    }
                } else if (var25.field2133 == 256) {
                    int var31 = var25.field2119 - class181.field2671;
                    int var32 = var25.field2121 - class13.field201;
                    int var33 = var25.field2132;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class211.field2948) {
                        class36.method217(arg0, var4, var2, var3);
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    if (var35 < var34) {
                        class289 var36 = var25.method484(class449.field6615, (byte) 123);
                        if (var36 != null) {
                            var36.field4005 = var25;
                            var36.field4002 = var4;
                            var36.field4006 = var2;
                            var36.field4008 = var3;
                            class296.field4069.method2454(-9946, var36);
                        }
                    } else if (var29 != null) {
                        class289 var37 = var29.method484(class449.field6615, (byte) 119);
                        if (var37 != null) {
                            var37.field4005 = var29;
                            var37.field4002 = var4;
                            var37.field4006 = var2;
                            var37.field4008 = var3;
                            class296.field4069.method2454(-9946, var37);
                        }
                    }
                }
                class449.field6615.method245(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class117 var38 = arg1.field7100;
                if (var38 != null && !var38.field1751) {
                    if (var38.field1745) {
                        class449.field6615.method245(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class211.field2948) {
                        class36.method217(arg0, var4, var2, var3);
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    class289 var39 = var38.method484(class449.field6615, (byte) 122);
                    if (var39 != null) {
                        var39.field4005 = var38;
                        var39.field4002 = var4;
                        var39.field4006 = var2;
                        var39.field4008 = var3;
                        class296.field4069.method2454(-9946, var39);
                    }
                    if (var38.field1745) {
                        class449.field6615.method245(3000.0F, var9 * 1.5F);
                    }
                }
                class413 var40 = arg1.field7097;
                if (var40 != null && !var40.field6034) {
                    if (class211.field2948) {
                        class36.method217(arg0, var4, var2, var3);
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    class289 var41 = var40.method484(class449.field6615, (byte) 118);
                    if (var41 != null) {
                        var41.field4005 = var40;
                        var41.field4002 = var4;
                        var41.field4006 = var2;
                        var41.field4008 = var3;
                        class296.field4069.method2454(-9946, var41);
                    }
                }
            }
            byte var42 = arg1.field7099;
            if (var42 != 0) {
                if (var2 < class368.field5398 && (var42 & 0x4) != 0) {
                    class486 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field7108) {
                        class361.field5270.method2154(var43, -4093);
                    }
                }
                if (var3 < class403.field5916 && (var42 & 0x2) != 0) {
                    class486 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field7108) {
                        class361.field5270.method2154(var44, -4093);
                    }
                }
                if (var2 > class368.field5398 && (var42 & 0x1) != 0) {
                    class486 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field7108) {
                        class361.field5270.method2154(var45, -4093);
                    }
                }
                if (var3 > class403.field5916 && (var42 & 0x8) != 0) {
                    class486 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field7108) {
                        class361.field5270.method2154(var46, -4093);
                    }
                }
            }
        }
        if (arg1.field7113 != 0) {
            boolean var47 = true;
            for (class164 var48 = arg1.field7115; var48 != null; var48 = var48.field2467) {
                if (class328.field4485 != var48.field2468.field1740 && (var48.field2469 & arg1.field7113) == arg1.field7111) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class90 var49 = arg1.field7114;
                if (!class133.method911(var5, var2, var3, var49.field1315)) {
                    if (class211.field2948) {
                        label682: {
                            if (var49.field1315 >= 16) {
                                int var50 = var2 - class368.field5398;
                                int var51 = var3 - class403.field5916;
                                if (var49.field1315 == 16) {
                                    int var52 = var50 - class131.field1925;
                                    int var53 = class131.field1925 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class371.field5427) {
                                        class36.method217(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field1315 == 32) {
                                    int var54 = class131.field1925 + var50;
                                    int var55 = class131.field1925 + var51;
                                    if (var55 < -var54 && var2 < class206.field2881 && var3 < class371.field5427) {
                                        class36.method217(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field1315 == 64) {
                                    int var56 = class131.field1925 + var50;
                                    int var57 = var51 - class131.field1925;
                                    if (var57 > var56 && var2 < class206.field2881 && var3 > 0) {
                                        class36.method217(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field1315 == 128) {
                                    int var58 = var50 - class131.field1925;
                                    int var59 = var51 - class131.field1925;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class36.method217(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class36.method217(arg0, var4, var2, var3);
                        }
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    class289 var60 = var49.method484(class449.field6615, (byte) 121);
                    if (var60 != null) {
                        var60.field4005 = var49;
                        var60.field4002 = var4;
                        var60.field4006 = var2;
                        var60.field4008 = var3;
                        class296.field4069.method2454(-9946, var60);
                    }
                }
                arg1.field7113 = 0;
            }
        }
        if (arg1.field7098) {
            try {
                arg1.field7098 = false;
                int var61 = 0;
                label625: for (class164 var62 = arg1.field7115; var62 != null; var62 = var62.field2467) {
                    class116 var63 = var62.field2468;
                    if (class328.field4485 != var63.field1740) {
                        for (int var64 = var63.field1729; var64 <= var63.field1736; var64++) {
                            for (int var65 = var63.field1730; var65 <= var63.field1742; var65++) {
                                class486 var66 = var8[var64][var65];
                                if (var66.field7109) {
                                    arg1.field7098 = true;
                                    continue label625;
                                }
                                if (var66.field7113 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field1729) {
                                        var67++;
                                    }
                                    if (var64 < var63.field1736) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field1730) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field1742) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field7113) == arg1.field7106) {
                                        arg1.field7098 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class368.field5398 - var63.field1729;
                        int var69 = var63.field1736 - class368.field5398;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class403.field5916 - var63.field1730;
                        int var71 = var63.field1742 - class403.field5916;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field2760[var61] = var63;
                        arg0.field2764[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class116 var75 = arg0.field2760[var74];
                        if (class328.field4485 != var75.field1740) {
                            int var76 = arg0.field2764[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field1732 - class181.field2671;
                                int var78 = var75.field1735 - class13.field201;
                                int var79 = arg0.field2760[var73].field1732 - class181.field2671;
                                int var80 = arg0.field2760[var73].field1735 - class13.field201;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class116 var81 = arg0.field2760[var73];
                    var81.field1740 = class328.field4485;
                    if (!class411.method2463(var5, var81.field1729, var81.field1736, var81.field1730, var81.field1742, var81.method792(true))) {
                        if (class211.field2948) {
                            if (var81.field1733 == 0) {
                                class477.method2801(arg0, var4, var81.field1729, var81.field1730, var81.field1736, var81.field1742);
                            } else {
                                class36.method217(arg0, var4, var2, var3);
                                int var82 = var2 - class368.field5398;
                                int var83 = var3 - class403.field5916;
                                if (var81.field1733 == 2) {
                                    if (var83 > -var82) {
                                        class200.method1245(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class200.method1245(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class200.method1245(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class200.method1245(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class449.field6615.method255(arg0.field2765, arg0.field2763);
                        }
                        class289 var84 = var81.method484(class449.field6615, (byte) 116);
                        if (var84 != null) {
                            var84.field4005 = var81;
                            var84.field4002 = var4;
                            var84.field4006 = var81.field1729;
                            var84.field4008 = var81.field1730;
                            class296.field4069.method2454(-9946, var84);
                        }
                    }
                    for (int var85 = var81.field1729; var85 <= var81.field1736; var85++) {
                        for (int var86 = var81.field1730; var86 <= var81.field1742; var86++) {
                            class486 var87 = var8[var85][var86];
                            if (var87.field7113 != 0) {
                                class361.field5270.method2154(var87, -4093);
                            } else if ((var2 != var85 || var3 != var86) && var87.field7108) {
                                class361.field5270.method2154(var87, -4093);
                            }
                        }
                    }
                }
                if (arg1.field7098) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field7098 = false;
            }
        }
        if (arg1.field7119 != null && (byte) (class230.field3251 & 0xFF) == arg1.field7117) {
            class523 var88 = arg1.field7119;
            int var89 = class211.field2950[var4].method351(var2, var3);
            int var90;
            if (var4 < class253.field3523 - 1) {
                var90 = class211.field2950[var4].method351(var2, var3) - class211.field2950[var4 + 1].method351(var2, var3);
            } else {
                var90 = 0x8 << class523.field7736;
            }
            class258.field3593.method178(var6, var89, var7, arg0.field2771);
            int var91 = arg0.field2771[2];
            class258.field3593.method178(var6, var89 - var90, var7, arg0.field2771);
            int var92 = arg0.field2771[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class402.field5901;
            int var96 = class402.field5901 + var94;
            var88.field7744 = var95;
            var88.field7742 = var96;
            var88.field7743 = true;
            class449.field6615.method316(var88);
        }
        if (!arg1.field7108) {
            return;
        }
        if (arg1.field7113 != 0) {
            return;
        }
        if (var2 <= class368.field5398 && var2 > class214.field2997) {
            class486 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field7108) {
                return;
            }
        }
        if (var2 >= class368.field5398 && var2 < class127.field1887 - 1) {
            class486 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field7108) {
                return;
            }
        }
        if (var3 <= class403.field5916 && var3 > class149.field2153) {
            class486 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field7108) {
                return;
            }
        }
        if (var3 >= class403.field5916 && var3 < class526.field7780 - 1) {
            class486 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field7108) {
                return;
            }
        }
        arg1.field7108 = false;
        class294.field4053--;
        class413 var101 = arg1.field7097;
        if (var101 != null && var101.field6034) {
            if (class211.field2948) {
                class36.method217(arg0, var4, var2, var3);
                class449.field6615.method255(arg0.field2765, arg0.field2763);
            }
            class289 var102 = var101.method484(class449.field6615, (byte) 118);
            if (var102 != null) {
                var102.field4005 = var101;
                var102.field4002 = var4;
                var102.field4006 = var2;
                var102.field4008 = var3;
                class296.field4069.method2454(-9946, var102);
            }
        }
        if (arg1.field7104 != 0) {
            class147 var103 = arg1.field7103;
            if (var103 != null && !class398.method2402(var5, var2, var3, var103.method988(111))) {
                if ((var103.field2133 & arg1.field7104) != 0) {
                    if (class211.field2948) {
                        class36.method217(arg0, var4, var2, var3);
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    class289 var104 = var103.method484(class449.field6615, (byte) 119);
                    if (var104 != null) {
                        var104.field4005 = var103;
                        var104.field4002 = var4;
                        var104.field4006 = var2;
                        var104.field4008 = var3;
                        class296.field4069.method2454(-9946, var104);
                    }
                } else if (var103.field2133 == 256) {
                    int var105 = var103.field2119 - class181.field2671;
                    int var106 = var103.field2121 - class13.field201;
                    int var107 = var103.field2132;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class211.field2948) {
                        class36.method217(arg0, var4, var2, var3);
                        class449.field6615.method255(arg0.field2765, arg0.field2763);
                    }
                    class147 var110 = arg1.field7105;
                    if (var109 > var108) {
                        class289 var111 = var103.method484(class449.field6615, (byte) 117);
                        if (var111 != null) {
                            var111.field4005 = var103;
                            var111.field4002 = var4;
                            var111.field4006 = var2;
                            var111.field4008 = var3;
                            class296.field4069.method2454(-9946, var111);
                        }
                    } else if (var110 != null) {
                        class289 var112 = var110.method484(class449.field6615, (byte) 124);
                        if (var112 != null) {
                            var112.field4005 = var110;
                            var112.field4002 = var4;
                            var112.field4006 = var2;
                            var112.field4008 = var3;
                            class296.field4069.method2454(-9946, var112);
                        }
                    }
                }
            }
            class90 var113 = arg1.field7114;
            class90 var114 = arg1.field7118;
            if (var114 != null && (var114.field1315 & arg1.field7104) != 0 && !class133.method911(var5, var2, var3, var114.field1315)) {
                if (class211.field2948) {
                    class102.method761(arg0, var114.field1315, var4, var2, var3);
                    class449.field6615.method255(arg0.field2765, arg0.field2763);
                }
                class289 var115 = var114.method484(class449.field6615, (byte) 118);
                if (var115 != null) {
                    var115.field4005 = var114;
                    var115.field4002 = var4;
                    var115.field4006 = var2;
                    var115.field4008 = var3;
                    class296.field4069.method2454(-9946, var115);
                }
            }
            if (var113 != null && (var113.field1315 & arg1.field7104) != 0 && !class133.method911(var5, var2, var3, var113.field1315)) {
                if (class211.field2948) {
                    class102.method761(arg0, var113.field1315, var4, var2, var3);
                    class449.field6615.method255(arg0.field2765, arg0.field2763);
                }
                class289 var116 = var113.method484(class449.field6615, (byte) 120);
                if (var116 != null) {
                    var116.field4005 = var113;
                    var116.field4002 = var4;
                    var116.field4006 = var2;
                    var116.field4008 = var3;
                    class296.field4069.method2454(-9946, var116);
                }
            }
        }
        if (var4 < class253.field3523 - 1) {
            class486 var117 = class89.field1305[var4 + 1][var2][var3];
            if (var117 != null && var117.field7108) {
                class361.field5270.method2158(var117, true);
            }
        }
        if (var2 < class368.field5398) {
            class486 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field7108) {
                class361.field5270.method2154(var118, -4093);
            }
        }
        if (var3 < class403.field5916) {
            class486 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field7108) {
                class361.field5270.method2154(var119, -4093);
            }
        }
        if (var2 > class368.field5398) {
            class486 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field7108) {
                class361.field5270.method2154(var120, -4093);
            }
        }
        if (var3 > class403.field5916) {
            class486 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field7108) {
                class361.field5270.method2154(var121, -4093);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[ILjava/lang/String;I[I[I[Ll;I)V")
    private final void method1838(int arg0, int[] arg1, String arg2, int arg3, int[] arg4, int[] arg5, class16[] arg6, int arg7) {
        int var9 = arg0 - this.field4299.field7153;
        field4318++;
        int var10 = -1;
        int var11 = -1;
        int var12 = arg3;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class80.method649(110, arg2.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg2.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg1 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg1[var12];
                                    }
                                    var12++;
                                    int var19 = class104.method765(var16.substring(4), 128);
                                    class16 var20 = arg6[var19];
                                    int var21 = arg5 == null ? var20.method93() : arg5[var19];
                                    var20.method100(arg7 + var17, -var21 + this.field4299.field7153 + var9 + var18, 1, 0, 1);
                                    arg7 += arg6[var19].method84();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1844(var16, 4);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field4299.method2874(var15, true, var11);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg1 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg1[var12];
                    }
                    if (var15 != ' ') {
                        if ((class214.field2986 & 0xFF000000) != 0) {
                            this.method1057(var15, var22 + arg7 + 1, var9 + 1 + var23, class214.field2986, true);
                        }
                        this.method1057(var15, arg7 + var22, var9 - -var23, class421.field6177, false);
                    } else if (class77.field1057 > 0) {
                        class517.field7627 += class77.field1057;
                        arg7 += class517.field7627 >> 8;
                        class517.field7627 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4299.method2868(-97, var15);
                    if (class437.field6399 != -1) {
                        this.field4305.method230(class437.field6399, var24, (int) ((double) this.field4299.field7153 * 0.7D) + var9, (byte) 72, arg7);
                    }
                    if (class220.field3131 != -1) {
                        this.field4305.method230(class220.field3131, var24, this.field4299.field7153 + var9, (byte) 74, arg7);
                    }
                    arg7 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
    public final void method1839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field4301++;
        if (arg2 >= -40) {
            method1837(null, null);
        }
        if (arg6 == null) {
            return;
        }
        this.method1842(arg7, 39, arg4);
        double var9 = 7.0D - (double) arg5 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg3));
        }
        this.method1838(arg0, var12, arg6, 0, null, null, null, arg1 - (this.field4299.method2867(arg6, (byte) -70) / 2));
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lya;Ldq;)V")
    public class315(class38 arg0, class490 arg1) {
        this.field4299 = arg1;
        this.field4305 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLjava/lang/String;III)V")
    public final void method1840(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        field4302++;
        if (!arg1) {
            method1836((byte) 107);
        }
        if (arg2 != null) {
            this.method1842(arg3, -106, arg0);
            this.method1845(0, null, 0, null, 14455, arg2, arg4, null, arg5 - this.field4299.method2867(arg2, (byte) -70) / 2);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IZIIIIIIILma;I[Ll;Ljava/lang/String;IIII)I")
    public final int method1841(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class10 arg9, int arg10, class16[] arg11, String arg12, int arg13, int arg14, int arg15, int arg16) {
        if (arg1) {
            return -28;
        }
        field4306++;
        if (arg12 == null) {
            return 0;
        }
        this.method1842(arg10, 18, arg16);
        if (arg6 == 0) {
            arg6 = this.field4299.field7153;
        }
        int[] var18;
        if (arg14 < (this.field4299.field7165 + this.field4299.field7155 + arg6) && arg14 < (arg6 + arg6)) {
            var18 = null;
        } else {
            var18 = new int[] { arg15 };
        }
        if (arg5 == -1) {
            arg5 = arg14 / arg6;
            if (arg5 <= 0) {
                arg5 = 1;
            }
        }
        int var19 = this.field4299.method2875(class378.field5539, 0, arg11, arg12, var18);
        if (arg5 > 0 && arg5 <= var19) {
            class378.field5539[arg5 - 1] = this.field4299.method2872(arg15, 0, arg11, class378.field5539[arg5 - 1]);
            var19 = arg5;
        }
        if (arg2 == 3 && var19 == 1) {
            arg2 = 1;
        }
        int var20;
        if (arg2 == 0) {
            var20 = this.field4299.field7165 + arg8;
        } else if (arg2 == 1) {
            var20 = (arg14 - this.field4299.field7165 - this.field4299.field7155 - (var19 + -1) * arg6) / 2 + (arg8 + this.field4299.field7165);
        } else if (arg2 == 2) {
            var20 = arg8 + arg14 - this.field4299.field7155 - (var19 + -1) * arg6;
        } else {
            int var21 = (arg14 - this.field4299.field7165 - this.field4299.field7155 - (var19 + -1) * arg6) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field4299.field7165 + var21 + arg8;
            arg6 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg4 == 0) {
                this.method1845(arg3, arg11, arg13, arg9, 14455, class378.field5539[var22], var20, arg0, arg7);
            } else if (arg4 == 1) {
                this.method1845(arg3, arg11, arg13, arg9, 14455, class378.field5539[var22], var20, arg0, arg7 + ((arg15 - this.field4299.method2867(class378.field5539[var22], (byte) -70)) / 2));
            } else if (arg4 == 2) {
                this.method1845(arg3, arg11, arg13, arg9, 14455, class378.field5539[var22], var20, arg0, arg15 + (arg7 - this.field4299.method2867(class378.field5539[var22], (byte) -70)));
            } else if (var19 - 1 == var22) {
                this.method1845(arg3, arg11, arg13, arg9, 14455, class378.field5539[var22], var20, arg0, arg7);
            } else {
                this.method1843(class378.field5539[var22], arg15, (byte) 106);
                this.method1845(arg3, arg11, arg13, arg9, 14455, class378.field5539[var22], var20, arg0, arg7);
                class77.field1057 = 0;
            }
            var20 += arg6;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    private final void method1842(int arg0, int arg1, int arg2) {
        class77.field1057 = 0;
        field4307++;
        int var4 = -31 % ((arg1 + 26) / 35);
        class517.field7627 = 0;
        class437.field6399 = -1;
        class220.field3131 = -1;
        class343.field4940 = arg2;
        class421.field6177 = arg2;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class328.field4476 = arg0;
        class214.field2986 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    private final void method1843(String arg0, int arg1, byte arg2) {
        field4316++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg0.length(); var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg2 != 106) {
            field4300 = null;
        }
        if (var4 > 0) {
            class77.field1057 = (arg1 - this.field4299.method2867(arg0, (byte) -70) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method1844(String arg0, int arg1) {
        field4317++;
        if (arg1 != 4) {
            field4315 = null;
        }
        try {
            if (arg0.startsWith("col=")) {
                class421.field6177 = class421.field6177 & 0xFF000000 | class524.method3112(arg0.substring(4), 28071, 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class421.field6177 = class421.field6177 & 0xFF000000 | class343.field4940 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class421.field6177 = class524.method3112(arg0.substring(5), arg1 ^ 0x6DA3, 16);
            } else if (arg0.equals("/argb")) {
                class421.field6177 = class343.field4940;
            } else if (arg0.startsWith("str=")) {
                class437.field6399 = class524.method3112(arg0.substring(4), 28071, 16) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class437.field6399 = -8388608;
            } else if (arg0.equals("/str")) {
                class437.field6399 = -1;
            } else if (arg0.startsWith("u=")) {
                class220.field3131 = class524.method3112(arg0.substring(2), arg1 + 28067, 16) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class220.field3131 = -16777216;
            } else if (arg0.equals("/u")) {
                class220.field3131 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class214.field2986 = 0;
            } else if (arg0.startsWith("shad=")) {
                class214.field2986 = class524.method3112(arg0.substring(5), 28071, 16) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class214.field2986 = -16777216;
            } else if (arg0.equals("/shad")) {
                class214.field2986 = class328.field4476;
                return;
            } else if (arg0.equals("br")) {
                this.method1842(class328.field4476, -128, class343.field4940);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Ll;ILma;ILjava/lang/String;I[II)V")
    private final void method1845(int arg0, class16[] arg1, int arg2, class10 arg3, int arg4, String arg5, int arg6, int[] arg7, int arg8) {
        if (arg4 != 14455) {
            field4315 = null;
        }
        int var10 = arg6 - this.field4299.field7153;
        field4303++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class80.method649(107, arg5.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg5.substring(var11 + 1, var14);
                    var11 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17 = class104.method765(var16.substring(4), 128);
                                    class16 var18 = arg1[var17];
                                    int var19 = arg7 == null ? var18.method93() : arg7[var17];
                                    if ((class421.field6177 & 0xFF000000) == -16777216) {
                                        var18.method100(arg8, this.field4299.field7153 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method100(arg8, var10 + this.field4299.field7153 - var19, 0, class421.field6177 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg8 += arg1[var17].method84();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1844(var16, arg4 ^ 0x3873);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg8 += this.field4299.method2874(var15, true, var12);
                    }
                    if (var15 == ' ') {
                        if (class77.field1057 > 0) {
                            class517.field7627 += class77.field1057;
                            arg8 += class517.field7627 >> 8;
                            class517.field7627 &= 0xFF;
                        }
                    } else if (arg3 == null) {
                        if ((class214.field2986 & 0xFF000000) != 0) {
                            this.method1057(var15, arg8 + 1, var10 + 1, class214.field2986, true);
                        }
                        this.method1057(var15, arg8, var10, class421.field6177, false);
                    } else {
                        if ((class214.field2986 & 0xFF000000) != 0) {
                            this.method1058(var15, arg8 + 1, var10 + 1, class214.field2986, true, arg3, arg2, arg0);
                        }
                        this.method1058(var15, arg8, var10, class421.field6177, false, arg3, arg2, arg0);
                    }
                    int var20 = this.field4299.method2868(arg4 ^ 0xFFFFC7EF, var15);
                    if (class437.field6399 != -1) {
                        this.field4305.method230(class437.field6399, var20, var10 + ((int) ((double) this.field4299.field7153 * 0.7D)), (byte) -93, arg8);
                    }
                    if (class220.field3131 != -1) {
                        this.field4305.method230(class220.field3131, var20, var10 + this.field4299.field7153 + 1, (byte) 125, arg8);
                    }
                    arg8 += var20;
                    var12 = var15;
                }
            }
        }
    }
}
