import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class68 extends class123 {

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field1270 = -1;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "[I")
    public static int[] field1279 = new int[2];

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "Leb;")
    private static class230 field1278 = method589(0, " from your friend list first)3");

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "Leb;")
    public static class230 field1271 = field1278;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "Leb;")
    public static class230 field1275 = null;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "[I")
    public static int[] field1280 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public static final void method587() {
        for (int var0 = 0; var0 < class166.field2933; ++var0) {
            class111 var1 = class61.field1175[var0];
            class44.method379(var1);
            class61.field1175[var0] = null;
        }
        class166.field2933 = 0;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V")
    public static final void method588(byte arg0) {
        ++field1277;
        class178 var1 = class173.field3059;
        synchronized (class173.field3059) {
            ++class24.field467;
            class65.field1226 = class217.field3753;
            if (class183.field3192 >= 0) {
                while (class264.field4685 != class183.field3192) {
                    int var2 = class213.field3697[class264.field4685];
                    class264.field4685 = class264.field4685 + 1 & 127;
                    if (~var2 > -1) {
                        class28.field515[~var2] = false;
                    } else {
                        class28.field515[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; ~var3 > -113; ++var3) {
                    class28.field515[var3] = false;
                }
                class183.field3192 = class264.field4685;
            }
            if (arg0 > -101) {
                method593(-122);
            }
            class217.field3753 = class156.field2783;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/lang/String;)Leb;")
    public static final class230 method589(int arg0, String arg1) {
        ++field1272;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = arg0;
        class230 var5 = new class230();
        var5.field3988 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 255;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 255;
                var5.field3988[var5.field3990++] = (byte) ((var6 - 40) * 43 + var7 + -48);
            } else if (var6 != 0) {
                var5.field3988[var5.field3990++] = (byte) var6;
            }
        }
        var5.method1631(-117);
        return var5.method1601(4096);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)Lmj;")
    public static final class111 method590(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field4058; ++var4) {
                class111 var5 = var3.field4050[var4];
                if ((var5.field2001 >> 29 & 3L) == 2L && var5.field1988 == arg1 && var5.field1994 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lhj;IIIII)V")
    public static final void method591(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class225.field3892 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class30.field553) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class117.field2102 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class233 var14 = class53.field916[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class106.field1912[var11][var12 + 1][var13] + class106.field1912[var11][var12][var13] + class106.field1912[var11][var12][var13 + 1] + class106.field1912[var11][var12 + 1][var13 + 1]) / 4 - (class106.field1912[arg1][arg2 + 1][arg3] + class106.field1912[arg1][arg2][arg3] + class106.field1912[arg1][arg2][arg3 + 1] + class106.field1912[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class108 var16 = var14.field4056;
                                    if (var16 != null) {
                                        if (var16.field1951.method607()) {
                                            arg0.method603(var16.field1951, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1950 != null && var16.field1950.method607()) {
                                            arg0.method603(var16.field1950, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4058; ++var17) {
                                        class111 var18 = var14.field4050[var17];
                                        if (var18 != null && var18.field1993.method607() && (var18.field1988 == var12 || var7 == var12) && (var18.field1994 == var13 || var9 == var13)) {
                                            int var19 = var18.field1989 - var18.field1988 + 1;
                                            int var20 = var18.field2002 - var18.field1994 + 1;
                                            arg0.method603(var18.field1993, (var18.field1988 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1994 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()V")
    public static final void method592() {
        if (class176.field3090 != null) {
            for (int var0 = 0; var0 < class176.field3090.length; ++var0) {
                for (int var1 = 0; var1 < class30.field553; ++var1) {
                    for (int var2 = 0; var2 < class117.field2102; ++var2) {
                        class176.field3090[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class228.field3938 != null) {
            for (int var3 = 0; var3 < class228.field3938.length; ++var3) {
                for (int var4 = 0; var4 < class30.field553; ++var4) {
                    for (int var5 = 0; var5 < class117.field2102; ++var5) {
                        class228.field3938[var3][var4][var5] = null;
                    }
                }
            }
        }
        class120.field2119 = 0;
        if (class80.field1456 != null) {
            for (int var6 = 0; var6 < class120.field2119; ++var6) {
                class80.field1456[var6] = null;
            }
        }
        if (class61.field1175 != null) {
            for (int var7 = 0; var7 < class166.field2933; ++var7) {
                class61.field1175[var7] = null;
            }
            class166.field2933 = 0;
        }
        if (class270.field4774 != null) {
            for (int var8 = 0; var8 < class270.field4774.length; ++var8) {
                class270.field4774[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = 10 % ((-24 - arg1) / 57);
        ++field1274;
        int[] var4 = super.field2160.method1323((byte) -93, arg0);
        if (super.field2160.field3243) {
            class43.method373(var4, 0, class140.field2505, class154.field2753[arg0]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
    public static void method593(int arg0) {
        field1271 = null;
        field1278 = null;
        field1279 = null;
        if (arg0 <= 54) {
            field1276 = -92;
        }
        field1275 = null;
        field1280 = null;
    }
}
