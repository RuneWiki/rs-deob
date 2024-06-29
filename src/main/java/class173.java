import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class173 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Lnc;")
    private class144 field3094 = new class144(256);

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Lnc;")
    private class144 field3107 = new class144(256);

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Leh;")
    private class52 field3105;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Leh;")
    private class52 field3100;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Lqe;")
    private static class179 field3104 = class206.method1380("Could not complete login)3", (byte) 113);

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Lqe;")
    public static class179 field3099 = class206.method1380("<col=ffff00>", (byte) 85);

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Lqe;")
    private static class179 field3097 = class206.method1380("Please remove ", (byte) -127);

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lqe;")
    public static class179 field3093 = field3097;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lqe;")
    public static class179 field3103 = field3097;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Lqe;")
    public static class179 field3106 = field3104;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[[B")
    public static byte[][] field3102;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([IIB)Lcb;")
    public final class24 method1093(int[] arg0, int arg1, byte arg2) {
        field3098++;
        if (arg2 < 123) {
            return null;
        } else if (this.field3100.method339(-95) == 1) {
            return this.method1095(0, (byte) 12, arg0, arg1);
        } else if (this.field3100.method336((byte) 80, arg1) == 1) {
            return this.method1095(arg1, (byte) 12, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "([IIB)Lcb;")
    public final class24 method1094(int[] arg0, int arg1, byte arg2) {
        field3101++;
        if (this.field3105.method339(-94) == 1) {
            return this.method1098(0, 6436, arg0, arg1);
        }
        if (arg2 < 79) {
            this.method1098(-21, -90, null, -18);
        }
        if (this.field3105.method336((byte) -122, arg1) != 1) {
            throw new RuntimeException();
        }
        return this.method1098(arg1, 6436, arg0, 0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB[II)Lcb;")
    private final class24 method1095(int arg0, byte arg1, int[] arg2, int arg3) {
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFFC) ^ arg3;
        field3092++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class24 var9 = (class24) this.field3107.method909(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class20 var10 = (class20) this.field3094.method909(-1, var7);
            if (var10 == null) {
                var10 = class20.method140(this.field3100, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3094.method914(var7, var10, true);
            }
            class24 var11 = var10.method147(arg2);
            if (var11 == null) {
                return null;
            }
            var10.method592((byte) -128);
            if (arg1 != 12) {
                method1097((byte) 88);
            }
            this.field3107.method914(var7, var11, true);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
    public static final void method1096(int arg0, byte arg1) {
        class126 var2;
        if (class125.field2311 == null) {
            var2 = new class126(512, 512);
        } else {
            var2 = (class126) class125.field2311;
        }
        field3091++;
        int[] var3 = var2.field2315;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        if (arg1 != -81) {
            method1097((byte) 45);
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var22 = (103 - var6) * 512 * 4 + 24628;
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class9.field265[arg0][var23][var6] & 0x18) == 0) {
                    class183.method1192(var3, var22, 512, arg0, var23, var6);
                }
                if (arg0 < 3 && (class9.field265[arg0 + 1][var23][var6] & 0x8) != 0) {
                    class183.method1192(var3, var22, 512, arg0 + 1, var23, var6);
                }
                var22 += 4;
            }
        }
        int var7 = (int) (Math.random() * 20.0D) + 228 << 16;
        int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        var2.method795();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class9.field265[arg0][var21][var9] & 0x18) == 0) {
                    class185.method1235(var9, 26130, var21, var8, arg0, var7);
                }
                if (arg0 < 3 && (class9.field265[arg0 + 1][var21][var9] & 0x8) != 0) {
                    class185.method1235(var9, 26130, var21, var8, arg0 + 1, var7);
                }
            }
        }
        class78.field1515 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class108.method707(class49.field1038, var10, var11);
                if (var12 != 0L) {
                    class134 var14 = class114.method735((byte) -77, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                    int var15 = var14.field2423;
                    if (var15 >= 0) {
                        int var16 = var10;
                        int var17 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = class135.field2492[class49.field1038].field855;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var10 - 3 < var16 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var10 + 3 > var16 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var11 - 3 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var17 < var11 + 3 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        class168.field3036[class78.field1515] = var14.field2461;
                        class163.field2947[class78.field1515] = var16;
                        class222.field4097[class78.field1515] = var17;
                        class78.field1515++;
                    }
                }
            }
        }
        class125.field2311 = var2;
        class217.field4010.method462(38);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1097(byte arg0) {
        field3106 = null;
        field3093 = null;
        field3099 = null;
        field3097 = null;
        field3103 = null;
        if (arg0 > -115) {
            method1096(-84, (byte) -86);
        }
        field3104 = null;
        field3102 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[II)Lcb;")
    private final class24 method1098(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = arg3 ^ ((arg0 & 0x20000FFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        field3095++;
        class24 var9 = (class24) this.field3107.method909(arg1 - 6437, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class200 var10 = class200.method1331(this.field3105, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            class24 var11 = var10.method1329();
            this.field3107.method914(var7, var11, true);
            if (arg2 != null) {
                arg2[0] -= var11.field578.length;
            }
            return arg1 == 6436 ? var11 : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Leh;Leh;)V")
    public class173(class52 arg0, class52 arg1) {
        this.field3105 = arg0;
        this.field3100 = arg1;
    }
}
