import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class209 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[J")
    public static long[] field2945 = new long[100];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2942 = 1;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    public static int[] field2944 = new int[500];

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2946 = "Loading fonts - ";

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2949 = "cyan:";

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lwe;")
    public static class82 field2948;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lbc;III)[Lwj;")
    public static final class130[] method1330(class282 arg0, int arg1, int arg2, int arg3) {
        field2951++;
        if (arg3 != 13162) {
            field2946 = null;
        }
        return class282.method1875(arg0, arg2, 0, arg1) ? class176.method1140(arg3 ^ 0x336A) : null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1331(int arg0) {
        field2948 = null;
        field2946 = null;
        field2944 = null;
        field2949 = null;
        field2945 = null;
        if (arg0 != 4096) {
            field2942 = -68;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILqi;)V")
    public static final void method1332(int arg0, class216 arg1) {
        while (arg1.field3030.length > arg1.field3021) {
            int var2 = 0;
            int var3 = 0;
            boolean var4 = false;
            if (arg1.method1407(120) == 1) {
                var4 = true;
                var2 = arg1.method1407(117);
                var3 = arg1.method1407(116);
            }
            int var5 = arg1.method1407(123);
            int var6 = arg1.method1407(105);
            int var7 = var5 * 64 - class230.field3313;
            int var8 = class133.field1940 + class1.field1 - (var6 * 64) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < client.field4446 && class133.field1940 > var8) {
                int var9 = var8 >> 6;
                int var10 = var7 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var4 || var2 * 8 <= var11 && (var2 * 8 + 8) > var11 && var3 * 8 <= var12 && (var3 * 8 + 8) > var12) {
                            int var13 = arg1.method1407(105);
                            if (var13 != 0) {
                                if ((var13 & 0x1) == 1) {
                                    int var14 = arg1.method1407(103);
                                    if (class248.field3612[var10][var9] == null) {
                                        class248.field3612[var10][var9] = new byte[4096];
                                    }
                                    class248.field3612[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                }
                                if ((var13 & 0x2) == 2) {
                                    int var15 = arg1.method1382(-96);
                                    if (class261.field3791[var10][var9] == null) {
                                        class261.field3791[var10][var9] = new int[4096];
                                    }
                                    class261.field3791[var10][var9][(63 - var12 << 6) + var11] = var15;
                                }
                                if ((var13 & 0x4) == 4) {
                                    int var16 = arg1.method1382(-105);
                                    if (class105.field1428[var10][var9] == null) {
                                        class105.field1428[var10][var9] = new int[4096];
                                    }
                                    var16--;
                                    class273 var17 = class164.method1081(0, var16);
                                    if (var17.field3991 != null) {
                                        var17 = var17.method1751(-23199);
                                        if (var17 == null || var17.field4000 == -1) {
                                            continue;
                                        }
                                    }
                                    class105.field1428[var10][var9][(63 - var12 << 6) + var11] = var17.field4012 + 1;
                                    class261 var18 = new class261();
                                    var18.field3799 = var17.field4000;
                                    var18.field3796 = var7;
                                    var18.field3793 = var8;
                                    class119.field1704.method1522(var18, 105);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var19 = 0; var19 < (var4 ? 64 : 4096); var19++) {
                    int var20 = arg1.method1407(107);
                    if (var20 != 0) {
                        if ((var20 & 0x1) == 1) {
                            arg1.field3021++;
                        }
                        if ((var20 & 0x2) == 2) {
                            arg1.field3021 += 2;
                        }
                        if ((var20 & 0x4) == 4) {
                            arg1.field3021 += 3;
                        }
                    }
                }
            }
        }
        field2950++;
        if (arg0 < 118) {
            field2946 = null;
        }
    }
}
