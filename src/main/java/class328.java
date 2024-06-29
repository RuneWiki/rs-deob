import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class328 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
    private int[] field4650;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Lek;")
    public static class295 field4655 = new class295();

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field4656 = 0;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field4657 = -1;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "B")
    public static byte field4658;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lnd;Lli;IIZLae;)Z")
    public static final boolean method2121(class324 arg0, class246 arg1, int arg2, int arg3, boolean arg4, class134 arg5) {
        field4652++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field3503 != null) {
            var7 = (arg1.field3501 - (class308.field4376 - arg0.field4615)) * (class308.field4374 - class308.field4358) / (class308.field4357 - class308.field4376) + class308.field4358;
            var8 = class308.field4373 - ((arg1.field3491 + arg0.field4609 - class308.field4371) * (class308.field4373 - class308.field4375) / (class308.field4363 - class308.field4371));
            var6 = (arg0.field4615 + arg1.field3485 - class308.field4376) * (class308.field4374 - class308.field4358) / (class308.field4357 - class308.field4376) + class308.field4358;
            var9 = class308.field4373 - ((arg0.field4609 + arg1.field3517 - class308.field4371) * (class308.field4373 - class308.field4375) / (class308.field4363 - class308.field4371));
        }
        class381 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (!arg4) {
            field4655 = null;
        }
        if (arg1.field3490 != -1) {
            if (arg0.field4617 && arg1.field3495 != -1) {
                var10 = arg1.method1669(false, arg5, true);
            } else {
                var10 = arg1.method1669(false, arg5, false);
            }
            if (var10 != null) {
                var11 = arg0.field4611 - (var10.method762() + 1 >> 1);
                var12 = arg0.field4611 + (var10.method762() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg0.field4616 - (var10.method761() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg0.field4616 + (var10.method761() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class60 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg1.field3500 != null) {
            var15 = class152.method924((byte) 58, arg1.field3512);
            if (var15 != null) {
                var16 = class152.field1879.method2262(arg1.field3500, (int[]) null, (class381[]) null, class249.field3556, -21293);
                int var23 = arg0.field4616;
                if (var10 == null) {
                    var17 = var23 - var15.method354() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method761() >> 1) + (var15.method352() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class249.field3556[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method351(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg3 + arg0.field4611 - (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = arg0.field4611 + (var18 / 2) + arg3;
                var21 = var17 + arg2;
                if (var20 > var7) {
                    var7 = var20;
                }
                var22 = var17 + (var15.method352() * var16) + arg2;
                if (var21 < var8) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class308.field4358 > var7 || class308.field4374 < var6 || class308.field4375 > var9 || var8 > class308.field4373) {
            return true;
        }
        if (arg1.field3503 != null) {
            int[] var27 = new int[arg1.field3503.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg1.field3503[var28 * 2] + arg0.field4615;
                int var31 = arg1.field3503[var28 * 2 + 1] + arg0.field4609;
                var27[var28 * 2] = (class308.field4374 - class308.field4358) * (var30 - class308.field4376) / (class308.field4357 - class308.field4376) + class308.field4358;
                var27[var28 * 2 + 1] = class308.field4373 - ((class308.field4373 - class308.field4375) * (var31 - class308.field4371) / (class308.field4363 - class308.field4371));
            }
            class407.method2606(arg5, var27, arg1.field3514);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg5.method822(var27[(var29 + 1) * 2], var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 1], var27[var29 * 2], 120, arg1.field3502);
            }
            arg5.method822(var27[0], var27[1], var27[var27.length - 1], var27[var27.length - 2], 123, arg1.field3502);
        }
        if (var10 != null) {
            if (class327.field4643 > 0 && (class3.field27 != -1 && class3.field27 == arg0.field4613 || class204.field2928 != -1 && class204.field2928 == arg1.field3481)) {
                int var32;
                if (class152.field1877 > 50) {
                    var32 = (100 - class152.field1877) * 2;
                } else {
                    var32 = class152.field1877 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg5.method823(arg0.field4616, var10.method765() / 2 + 7, var33, (byte) 127, arg0.field4611);
                arg5.method823(arg0.field4616, var10.method765() / 2 + 5, var33, (byte) 126, arg0.field4611);
                arg5.method823(arg0.field4616, var10.method765() / 2 + 3, var33, (byte) 127, arg0.field4611);
                arg5.method823(arg0.field4616, var10.method765() / 2 + 1, var33, (byte) 127, arg0.field4611);
                arg5.method823(arg0.field4616, var10.method765() / 2, var33, (byte) 127, arg0.field4611);
            }
            var10.method2446(arg0.field4611 - (var10.method762() >> 1), arg0.field4616 - (var10.method761() >> 1));
        }
        if (arg1.field3500 != null && var15 != null) {
            class188.method1285(var15, 126, var17, arg5, arg0, var16, var18, arg1);
        }
        if (arg1.field3490 != -1 || arg1.field3500 != null) {
            class377 var34 = new class377(arg0);
            var34.field5321 = var12;
            var34.field5311 = var14;
            var34.field5317 = var20;
            var34.field5313 = var21;
            var34.field5312 = var13;
            var34.field5314 = var19;
            var34.field5322 = var22;
            var34.field5310 = var11;
            class174.field2393.method509((byte) 122, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static void method2122(byte arg0) {
        if (arg0 == -9) {
            field4655 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)I")
    public static final int method2123(int arg0, int arg1) {
        field4654++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 != 20867) {
            method2121((class324) null, (class246) null, 64, -128, true, (class134) null);
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([I)V")
    public class328(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4650 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4650[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4650[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field4650[var5 + var5] = arg0[var4];
            this.field4650[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)I")
    public final int method2124(int arg0, int arg1) {
        if (arg1 < 10) {
            field4656 = -118;
        }
        field4651++;
        int var3 = (this.field4650.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field4650[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4650[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
