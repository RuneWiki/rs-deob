import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class299 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "S")
    public static short field5113 = 205;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Ltl;")
    public static class59 field5114 = class85.method639("null", 9588);

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field5116 = 0;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "J")
    public static long field5117 = 0L;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[Ls;")
    public static class170[] field5119 = new class170[2048];

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Ltl;")
    private static class59 field5112 = class85.method639(" ", 9588);

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Ltl;")
    public static class59 field5120 = field5112;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Ltl;")
    public static class59 field5118 = class85.method639("(U3", 9588);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLvi;)V", line = 19)
    public static final void method2093(byte arg0, class128 arg1) {
        class114.method818(200000, (byte) -127, arg1);
        if (arg0 < 31) {
            field5113 = -107;
        }
        field5115++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V", line = 40)
    public static final void method2094(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = class4.method25(arg2, arg1, arg0);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x347BDF) >> 20;
            int var9 = ((int) var6 & 0x7EEFE) >> 14;
            int var10 = arg4;
            if (var6 > 0L) {
                var10 = arg3;
            }
            int[] var11 = class272.field4709;
            int var12 = (52736 - (arg0 * 512)) * 4 + arg1 * 4 + 24624;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class180 var14 = class188.method1390(var13, false);
            if (var14.field2943 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 512 + 3] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 1539] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class5 var15 = null;
                if (!var14.field2952) {
                    var15 = class43.field643[var14.field2943];
                } else if (var8 == 0) {
                    var15 = class43.field643[var14.field2943];
                } else if (var8 == 1) {
                    var15 = class12.field163[var14.field2943];
                } else if (var8 == 2) {
                    var15 = class159.field2593[var14.field2943];
                } else if (var8 == 3) {
                    var15 = class11.field152[var14.field2943];
                }
                if (var15 != null) {
                    int var16 = (var14.field3006 * 4 - var15.field3162) / 2;
                    int var17 = (var14.field2976 * 4 - var15.field3157) / 2;
                    var15.method38(arg1 * 4 + var16 + 48, (104 - var14.field2976 + -arg0) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class316.method2179(arg2, arg1, arg0);
        field5111++;
        if (arg5 <= 53) {
            return;
        }
        if (var18 != 0L) {
            int var20 = (int) var18 >> 14 & 0x1F;
            int var21 = ((int) var18 & 0x39DF39) >> 20;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class180 var23 = class188.method1390(var22, false);
            if (var23.field2943 != -1) {
                class5 var24 = null;
                if (!var23.field2952) {
                    var24 = class43.field643[var23.field2943];
                } else if (var21 == 0) {
                    var24 = class43.field643[var23.field2943];
                } else if (var21 == 1) {
                    var24 = class12.field163[var23.field2943];
                } else if (var21 == 2) {
                    var24 = class159.field2593[var23.field2943];
                } else if (var21 == 3) {
                    var24 = class11.field152[var23.field2943];
                }
                if (var24 != null) {
                    int var25 = (var23.field3006 * 4 - var24.field3162) / 2;
                    int var26 = (var23.field2976 * 4 - var24.field3157) / 2;
                    var24.method38(arg1 * 4 + var25 + 48, (104 - var23.field2976 + -arg0) * 4 + 48 - -var26);
                }
            } else if (var20 == 9) {
                int var27 = 15658734;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                int[] var28 = class272.field4709;
                int var29 = arg1 * 4 + (((52736 - (arg0 * 512)) * 4) + 24624);
                if (var21 == 0 || var21 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1 + 1024] = var27;
                    var28[var29 + 512 + 2] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 512 + 1] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 1536 + 3] = var27;
                }
            }
        }
        long var30 = class1.method10(arg2, arg1, arg0);
        if (var30 == 0L) {
            return;
        }
        int var32 = ((int) var30 & 0x38AAAA) >> 20;
        int var33 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class180 var34 = class188.method1390(var33, false);
        if (var34.field2943 == -1) {
            return;
        }
        class5 var35 = null;
        if (!var34.field2952) {
            var35 = class43.field643[var34.field2943];
        } else if (var32 == 0) {
            var35 = class43.field643[var34.field2943];
        } else if (var32 == 1) {
            var35 = class12.field163[var34.field2943];
        } else if (var32 == 2) {
            var35 = class159.field2593[var34.field2943];
        } else if (var32 == 3) {
            var35 = class11.field152[var34.field2943];
        }
        if (var35 != null) {
            int var36 = (var34.field2976 * 4 - var35.field3157) / 2;
            int var37 = (var34.field3006 * 4 - var35.field3162) / 2;
            var35.method38(arg1 * 4 + var37 + 48, (-var34.field2976 + 104 + -arg0) * 4 + 48 + var36);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 355)
    public static void method2095(int arg0) {
        field5114 = null;
        field5112 = null;
        field5119 = null;
        field5120 = null;
        if (arg0 != 512) {
            field5120 = (class59) null;
        }
        field5118 = null;
    }
}
