import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class150 extends class461 {

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "I")
    private int field2233 = 0;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
    private int field2243 = 0;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "I")
    private int field2241 = 0;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
    private int field2228 = 0;

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "Z")
    private boolean field2235 = false;

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "I")
    private int field2238;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    private int field2250;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "Lgj;")
    private class580 field2256;

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "Lhr;")
    private class483 field2258;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "Z")
    private boolean field2252;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "Z")
    private boolean field2253;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "Z")
    private boolean field2231;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "Z")
    private boolean field2259;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "Ldu;")
    public static class324 field2236 = new class324("LIVE", 0);

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!dfa", name = "EA", descriptor = "(IIII)V")
    public final void method34(int arg0, int arg1, int arg2, int arg3) {
        this.field2243 = arg0;
        field2239++;
        this.field2233 = arg1;
        this.field2228 = arg2;
        this.field2241 = arg3;
        this.field2235 = this.field2243 != 0 || this.field2233 != 0 || this.field2228 != 0 || this.field2241 != 0;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
    public static void method1051(int arg0) {
        field2236 = null;
        if (arg0 != 0) {
            method1053(null, -12);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "()I")
    public final int method26() {
        field2248++;
        return this.field2250;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILfa;II)V")
    public final void method23(int arg0, int arg1, class212 arg2, int arg3, int arg4) {
        field2257++;
        class644 var6 = (class644) arg2;
        int var7 = this.field2243 + arg0;
        int var8 = this.field2233 + arg1;
        class483 var9 = var6.field9144;
        this.field2258.method131((byte) 123, class13.field214);
        this.field2256.method3187(108);
        this.field2256.method3232(false, this.field2258);
        this.field2256.method3242(-2, 1);
        this.field2256.method3229(1, 12);
        class367 var10 = this.field2256.method3216(1);
        var10.method2154((float) this.field2238, (byte) 69, 0.0F, (float) this.field2250);
        var10.method1285(var7, var8, 0);
        this.field2256.method3228(true);
        class367 var11 = this.field2256.method3204(108);
        var11.method2154(this.field2258.method781((float) this.field2238, -8639), (byte) 69, 1.0F, this.field2258.method787((float) this.field2250, (byte) 66));
        this.field2256.method3201(-17, class133.field1868);
        this.field2256.method3220(1, -23809);
        this.field2256.method3232(false, var9);
        this.field2256.method3193(class24.field325, class137.field1929, 0);
        this.field2256.method3177(0, 111, class85.field1174);
        class367 var12 = this.field2256.method3204(127);
        var12.method2154(var9.method781((float) this.field2238, -8639), (byte) 69, 1.0F, var9.method787((float) this.field2250, (byte) 73));
        var12.method2148(26921, 0.0F, var9.method787((float) (var8 - arg4), (byte) 102), var9.method781((float) (var7 - arg3), -8639));
        this.field2256.method3201(-17, class133.field1868);
        this.field2256.method3188((byte) 45);
        this.field2256.method3198((byte) -87);
        this.field2256.method3177(0, 93, class558.field7530);
        this.field2256.method3193(class137.field1929, class137.field1929, 0);
        this.field2256.method3232(false, null);
        this.field2256.method3220(0, -23809);
        this.field2256.method3198((byte) -87);
    }

    @OriginalMember(owner = "client!dfa", name = "KA", descriptor = "(IIIIIII)V")
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2229++;
        class367 var8 = this.field2256.method3216(1);
        class367 var9 = this.field2256.method3204(114);
        this.field2258.method131((byte) 82, this.field2252 || this.field2253 ? class13.field214 : class81.field1132);
        this.field2256.method3187(111);
        this.field2256.method3232(false, this.field2258);
        this.field2256.method3242(-2, arg6);
        this.field2256.method3229(arg4, 12);
        this.field2256.method3177(1, 100, class22.field305);
        this.field2256.method3235(class22.field305, -12912, 1);
        this.field2256.method3248((byte) 13, arg5);
        var9.method2154(this.field2258.method781((float) this.field2238, -8639), (byte) 69, 1.0F, this.field2258.method787((float) this.field2250, (byte) 59));
        if (this.field2235) {
            arg2 = this.field2238 * arg2 / this.method33();
            arg3 = this.field2250 * arg3 / this.method29();
            arg0 += this.field2243 * arg2 / this.field2238;
            arg1 += this.field2233 * arg3 / this.field2250;
        }
        var8.method2154((float) arg2, (byte) 69, 0.0F, (float) arg3);
        var8.method1285(arg0, arg1, 0);
        this.field2256.method3201(-17, class133.field1868);
        this.field2256.method3228(true);
        this.field2256.method3188((byte) 45);
        this.field2256.method3198((byte) -87);
        this.field2256.method3177(1, 80, class85.field1174);
        this.field2256.method3235(class85.field1174, -12912, 1);
    }

    @OriginalMember(owner = "client!dfa", name = "AA", descriptor = "()I")
    public final int method33() {
        field2261++;
        return this.field2243 + this.field2238 + this.field2228;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIII[III)V")
    private final void method1052(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field2258.method782(arg0, arg2, arg1, arg6, arg5, arg4, arg3, -77);
        field2232++;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lkda;I)I")
    public static final int method1053(class354 arg0, int arg1) {
        field2246++;
        int var2 = 52 % ((-arg1 - 13) / 36);
        if (class9.field198 == arg0) {
            return 9216;
        } else if (class198.field2926 == arg0) {
            return 34065;
        } else if (class209.field3087 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IBLtfa;FIFFIFFI)[B")
    public static final byte[] method1054(int arg0, byte arg1, class31 arg2, float arg3, int arg4, float arg5, float arg6, int arg7, float arg8, float arg9, int arg10) {
        field2237++;
        if (arg1 != 103) {
            field2236 = null;
        }
        byte[] var11 = new byte[arg7 * arg10 * arg0];
        class174.method1197(arg6, arg7, arg9, arg10, arg2, var11, (byte) -126, arg8, 0, arg4, arg5, arg0, arg3);
        return var11;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method22(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class212 arg6, int arg7, int arg8) {
        field2255++;
        class367 var10 = this.field2256.method3216(1);
        class367 var11 = this.field2256.method3204(114);
        class644 var12 = (class644) arg6;
        class483 var13 = var12.field9144;
        this.field2258.method131((byte) 115, class81.field1132);
        this.field2256.method3187(105);
        this.field2256.method3232(false, this.field2258);
        this.field2256.method3242(-2, 1);
        this.field2256.method3229(1, 12);
        if (this.field2235) {
            float var14 = (float) this.field2238 / (float) this.method33();
            float var15 = (float) this.field2250 / (float) this.method29();
            var10.method2143((arg5 - arg1) * var15, (arg2 - arg0) * var14, 0.0F, 0.0F, 0.0F, (arg3 - arg1) * var14, 26176, 1.0F, 0.0F, (arg4 - arg0) * var15);
            var10.method2148(26921, 0.0F, ((float) this.field2233 + arg1) * var15, ((float) this.field2243 + arg0) * var14);
        } else {
            var10.method2143(arg5 - arg1, -arg0 + arg2, 0.0F, 0.0F, 0.0F, arg3 - arg1, 26176, 1.0F, 0.0F, arg4 - arg0);
            var10.method2148(26921, 0.0F, arg1, arg0);
        }
        var11.method2154(this.field2258.method781((float) this.field2238, -8639), (byte) 69, 1.0F, this.field2258.method787((float) this.field2250, (byte) 65));
        this.field2256.method3201(-17, class133.field1868);
        this.field2256.method3220(1, -23809);
        this.field2256.method3232(false, var13);
        this.field2256.method3193(class24.field325, class137.field1929, 0);
        this.field2256.method3177(0, 87, class85.field1174);
        class367 var16 = this.field2256.method3204(112);
        var16.method1298(var10);
        var16.method1285(-arg7, -arg8, 0);
        var16.method2157(var13.method781(1.0F, -8639), -23619, 1.0F, var13.method787(1.0F, (byte) 29));
        this.field2256.method3201(-17, class133.field1868);
        this.field2256.method3228(true);
        this.field2256.method3188((byte) 45);
        this.field2256.method3198((byte) -87);
        this.field2256.method3177(0, 70, class558.field7530);
        this.field2256.method3193(class137.field1929, class137.field1929, 0);
        this.field2256.method3232(false, null);
        this.field2256.method3220(0, -23809);
        this.field2256.method3198((byte) -87);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
    public static final String method1055(boolean arg0, int arg1, byte arg2) {
        field2230++;
        if (arg0 && arg1 >= 0) {
            if (arg2 > -105) {
                method1056(62, -99, true);
            }
            return class281.method1701(10, arg1, -99, arg0);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "(III)V")
    public final void method182(int arg0, int arg1, int arg2) {
        field2260++;
    }

    @OriginalMember(owner = "client!dfa", name = "GA", descriptor = "(IIIIII)V")
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2251++;
        int[] var7 = this.field2256.method360(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class266.method1624(var7[var8], -16777216);
            }
            this.method1052(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "sa", descriptor = "(FFFFFFIII)V")
    public final void method24(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field2240++;
        class367 var10 = this.field2256.method3216(1);
        class367 var11 = this.field2256.method3204(125);
        this.field2258.method131((byte) 50, this.field2252 || this.field2253 ? class13.field214 : class81.field1132);
        this.field2256.method3187(119);
        this.field2256.method3232(false, this.field2258);
        this.field2256.method3242(-2, arg8);
        this.field2256.method3229(arg6, 12);
        this.field2256.method3177(1, 100, class22.field305);
        this.field2256.method3235(class22.field305, -12912, 1);
        this.field2256.method3248((byte) -126, arg7);
        if (this.field2235) {
            float var12 = (float) this.method33();
            float var13 = (float) this.method29();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field2233 * var16;
            float var19 = (float) this.field2233 * var17;
            float var20 = (float) this.field2243 * var14;
            float var21 = (float) this.field2243 * var15;
            float var22 = (float) this.field2228 * -var14;
            float var23 = (float) this.field2228 * -var15;
            float var24 = (float) this.field2241 * -var16;
            float var25 = (float) this.field2241 * -var17;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        var10.method2143(arg5 - arg1, -arg0 + arg2, 0.0F, 0.0F, 0.0F, arg3 - arg1, 26176, 1.0F, 0.0F, arg4 - arg0);
        var10.method2148(26921, 0.0F, arg1, arg0);
        var11.method2154(this.field2258.method781((float) this.field2238, -8639), (byte) 69, 1.0F, this.field2258.method787((float) this.field2250, (byte) 49));
        this.field2256.method3201(-17, class133.field1868);
        this.field2256.method3228(true);
        this.field2256.method3188((byte) 45);
        this.field2256.method3198((byte) -87);
        this.field2256.method3177(1, 118, class85.field1174);
        this.field2256.method3235(class85.field1174, -12912, 1);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1056(int arg0, int arg1, boolean arg2) {
        field2234++;
        if (arg2) {
            method1055(true, -38, (byte) -123);
        }
        return class354.method2100(arg1, -1, arg0) | (arg1 & 0x70000) != 0 || class513.method2846(arg1, arg0, (byte) 94);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZLuea;)V")
    public static final void method1057(int arg0, boolean arg1, class286 arg2) {
        field2249++;
        if (class315.field4697 >= 400) {
            return;
        }
        if (arg0 != -1) {
            field2245 = -94;
        }
        if (class253.field3576 != arg2) {
            String var3;
            if (arg2.field3959 == 0) {
                boolean var4 = true;
                if (class253.field3576.field3984 != -1 && arg2.field3984 != -1) {
                    int var5 = class253.field3576.field3948 > arg2.field3948 ? class253.field3576.field3948 : arg2.field3948;
                    int var6 = class253.field3576.field3984 < arg2.field3984 ? class253.field3576.field3984 : arg2.field3984;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class253.field3576.field3948 - arg2.field3948;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class350.field5045 == class158.field2374 ? class9.field164.method42(class666.field9377, 19572) : class9.field162.method42(class666.field9377, 19572);
                if (arg2.field3973 > arg2.field3948) {
                    var3 = arg2.method1717(true, (byte) 123) + (var4 ? class198.method1341((byte) -10, arg2.field3948, class253.field3576.field3948) : "<col=ffffff>") + " (" + var9 + arg2.field3948 + "+" + (arg2.field3973 - arg2.field3948) + ")";
                } else {
                    var3 = arg2.method1717(true, (byte) 126) + (var4 ? class198.method1341((byte) -10, arg2.field3948, class253.field3576.field3948) : "<col=ffffff>") + " (" + var9 + arg2.field3948 + ")";
                }
            } else if (arg2.field3959 == -1) {
                var3 = arg2.method1717(true, (byte) 125);
            } else {
                var3 = arg2.method1717(true, (byte) 123) + " (" + class9.field163.method42(class666.field9377, arg0 + 19573) + arg2.field3959 + ")";
            }
            if (class457.field6455 && !arg1 && (class414.field5858 & 0x8) != 0) {
                class92.method678(class73.field1010 + " -> <col=ffffff>" + var3, 0, 10, -1, 0, (long) arg2.field6388, class561.field7575, true, class281.field3927, (byte) -74, false);
                class63.field831++;
            }
            if (arg1) {
                class92.method678("", 0, -1, 0, 0, 0L, -1, false, "<col=cccccc>" + var3, (byte) -74, true);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class425.field5986[var10] != null) {
                        short var11 = 0;
                        if (class161.field2419 == class158.field2374 && class425.field5986[var10].equalsIgnoreCase(class9.field157.method42(class666.field9377, 19572))) {
                            if (arg2.field3948 > class253.field3576.field3948) {
                                var11 = 2000;
                            }
                            if (class253.field3576.field3988 != 0 && arg2.field3988 != 0) {
                                if (class253.field3576.field3988 == arg2.field3988) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class423.field5968[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class666.field9376[var10] + var11);
                        int var13 = class474.field6629[var10] == -1 ? class258.field3691 : class474.field6629[var10];
                        class174.field2603++;
                        class92.method678("<col=ffffff>" + var3, 0, var12, -1, 0, (long) arg2.field6388, var13, true, class425.field5986[var10], (byte) -74, false);
                    }
                }
            }
            if (!arg1) {
                for (class345 var14 = (class345) class487.field6761.method1270((byte) -25); var14 != null; var14 = (class345) class487.field6761.method1282(0)) {
                    if (var14.field4983 == 21) {
                        var14.field4985 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class457.field6455 && (class414.field5858 & 0x10) != 0) {
            class92.method678(class73.field1010 + " -> <col=ffffff>" + class9.field171.method42(class666.field9377, arg0 + 19573), 0, 51, -1, 0, 0L, class561.field7575, true, class281.field3927, (byte) -74, false);
            class271.field3828++;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "ba", descriptor = "(IIIIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2247++;
        class367 var8 = this.field2256.method3216(1);
        class367 var9 = this.field2256.method3204(117);
        this.field2258.method131((byte) 52, class13.field214);
        this.field2256.method3187(116);
        this.field2256.method3232(false, this.field2258);
        this.field2256.method3242(-2, arg6);
        this.field2256.method3229(arg4, 12);
        this.field2256.method3177(1, 85, class22.field305);
        this.field2256.method3235(class22.field305, -12912, 1);
        this.field2256.method3248((byte) 25, arg5);
        boolean var10 = this.field2259 && this.field2233 == 0 && this.field2241 == 0;
        boolean var11 = this.field2231 && this.field2243 == 0 && this.field2228 == 0;
        if ((var11 & var10)) {
            var9.method2154(this.field2258.method781((float) arg2, -8639), (byte) 69, 1.0F, this.field2258.method787((float) arg3, (byte) 57));
            var8.method2154((float) arg2, (byte) 69, 0.0F, (float) arg3);
            var8.method1285(arg0, arg1, 0);
            this.field2256.method3201(-17, class133.field1868);
            this.field2256.method3228(true);
            this.field2256.method3188((byte) 45);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method29();
            var9.method2154(this.field2258.method781((float) arg2, -8639), (byte) 69, 1.0F, this.field2258.method787((float) this.field2250, (byte) 30));
            this.field2256.method3201(-17, class133.field1868);
            int var32 = arg1 + this.field2233;
            for (int var33 = this.field2250 + var32; var33 <= var30; var33 += var31) {
                var8.method2154((float) arg2, (byte) 69, 0.0F, (float) this.field2250);
                var8.method1285(arg0, var32, 0);
                this.field2256.method3228(true);
                this.field2256.method3188((byte) 45);
                var32 += var31;
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method2154(this.field2258.method781((float) arg2, -8639), (byte) 69, 1.0F, this.field2258.method787((float) var34, (byte) 112));
                this.field2256.method3201(-17, class133.field1868);
                var8.method2154((float) arg2, (byte) 69, 0.0F, (float) var34);
                var8.method1285(arg0, var32, 0);
                this.field2256.method3228(true);
                this.field2256.method3188((byte) 45);
            }
        } else if (var10) {
            int var12 = arg0 + arg2;
            int var13 = this.method33();
            var9.method2154(this.field2258.method781((float) this.field2238, -8639), (byte) 69, 1.0F, this.field2258.method787((float) arg3, (byte) 63));
            this.field2256.method3201(-17, class133.field1868);
            int var14 = arg0 + this.field2243;
            int var15 = var14 + this.field2238;
            while (var12 >= var15) {
                var8.method2154((float) this.field2238, (byte) 69, 0.0F, (float) arg3);
                var8.method1285(var14, arg1, 0);
                this.field2256.method3228(true);
                var15 += var13;
                var14 += var13;
                this.field2256.method3188((byte) 45);
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method2154(this.field2258.method781((float) var16, -8639), (byte) 69, 1.0F, this.field2258.method787((float) arg3, (byte) 60));
                this.field2256.method3201(-17, class133.field1868);
                var8.method2154((float) var16, (byte) 69, 0.0F, (float) arg3);
                var8.method1285(var14, arg1, 0);
                this.field2256.method3228(true);
                this.field2256.method3188((byte) 45);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method33();
            int var20 = this.method29();
            int var21 = arg1 + this.field2233;
            for (int var22 = this.field2250 + var21; var22 <= var17; var22 += var20) {
                var9.method2154(this.field2258.method781((float) this.field2238, -8639), (byte) 69, 1.0F, this.field2258.method787((float) this.field2250, (byte) 80));
                this.field2256.method3201(-17, class133.field1868);
                int var27 = this.field2243 + arg0;
                int var28 = var27 + this.field2238;
                while (var28 <= var18) {
                    var8.method2154((float) this.field2238, (byte) 69, 0.0F, (float) this.field2250);
                    var8.method1285(var27, var21, 0);
                    this.field2256.method3228(true);
                    var28 += var19;
                    this.field2256.method3188((byte) 45);
                    var27 += var19;
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method2154(this.field2258.method781((float) var29, -8639), (byte) 69, 1.0F, this.field2258.method787((float) this.field2250, (byte) 59));
                    this.field2256.method3201(-17, class133.field1868);
                    var8.method2154((float) var29, (byte) 69, 0.0F, (float) this.field2250);
                    var8.method1285(var27, var21, 0);
                    this.field2256.method3228(true);
                    this.field2256.method3188((byte) 45);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method2154(this.field2258.method781((float) this.field2238, -8639), (byte) 69, 1.0F, this.field2258.method787((float) var23, (byte) 118));
                this.field2256.method3201(-17, class133.field1868);
                int var24 = arg0 + this.field2243;
                for (int var25 = this.field2238 + var24; var25 <= var18; var25 += var19) {
                    var8.method2154((float) this.field2238, (byte) 69, 0.0F, (float) var23);
                    var8.method1285(var24, var21, 0);
                    this.field2256.method3228(true);
                    this.field2256.method3188((byte) 45);
                    var24 += var19;
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method2154(this.field2258.method781((float) var26, -8639), (byte) 69, 1.0F, this.field2258.method787((float) var23, (byte) 77));
                    this.field2256.method3201(-17, class133.field1868);
                    var8.method2154((float) var26, (byte) 69, 0.0F, (float) var23);
                    var8.method1285(var24, var21, 0);
                    this.field2256.method3228(true);
                    this.field2256.method3188((byte) 45);
                }
            }
        }
        this.field2256.method3198((byte) -87);
        this.field2256.method3177(1, 73, class85.field1174);
        this.field2256.method3235(class85.field1174, -12912, 1);
    }

    @OriginalMember(owner = "client!dfa", name = "QA", descriptor = "()I")
    public final int method31() {
        field2242++;
        return this.field2238;
    }

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "(IIIII)V")
    public final void method30(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2244++;
        class367 var6 = this.field2256.method3216(1);
        class367 var7 = this.field2256.method3204(120);
        int var8 = this.field2243 + arg0;
        int var9 = this.field2233 + arg1;
        this.field2258.method131((byte) 86, class13.field214);
        this.field2256.method3187(112);
        this.field2256.method3232(false, this.field2258);
        this.field2256.method3242(-2, arg4);
        this.field2256.method3229(arg2, 12);
        this.field2256.method3177(1, 84, class22.field305);
        this.field2256.method3235(class22.field305, -12912, 1);
        this.field2256.method3248((byte) -114, arg3);
        var6.method2154((float) this.field2238, (byte) 69, 0.0F, (float) this.field2250);
        var6.method1285(var8, var9, 0);
        var7.method2154(this.field2258.method781((float) this.field2238, -8639), (byte) 69, 1.0F, this.field2258.method787((float) this.field2250, (byte) 50));
        this.field2256.method3201(-17, class133.field1868);
        this.field2256.method3228(true);
        this.field2256.method3188((byte) 45);
        this.field2256.method3198((byte) -87);
        this.field2256.method3177(1, 76, class85.field1174);
        this.field2256.method3235(class85.field1174, -12912, 1);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "()I")
    public final int method29() {
        field2254++;
        return this.field2250 + this.field2241 + this.field2233;
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lgj;IIZ)V")
    public class150(class580 arg0, int arg1, int arg2, boolean arg3) {
        this.field2238 = arg1;
        this.field2250 = arg2;
        this.field2256 = arg0;
        this.field2258 = arg0.method303(arg3 ? class583.field8126 : class145.field2161, -8, arg2, class82.field1147, arg1);
        this.field2252 = this.field2258.method780((byte) -93) != arg1;
        this.field2253 = this.field2258.method785(-74) != arg2;
        this.field2231 = !this.field2252 && this.field2258.method788(false);
        this.field2259 = !this.field2253 && this.field2258.method788(false);
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lgj;II[III)V")
    public class150(class580 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field2256 = arg0;
        this.field2238 = arg1;
        this.field2250 = arg2;
        this.field2258 = arg0.method311(arg3, 15, false, arg4, arg1, arg5, arg2);
        this.field2252 = arg1 != this.field2258.method780((byte) -93);
        this.field2253 = arg2 != this.field2258.method785(-104);
        this.field2231 = !this.field2252 && this.field2258.method788(false);
        this.field2259 = !this.field2253 && this.field2258.method788(false);
    }
}
