import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class188 extends class69 {

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "[B")
    public byte[] field3015;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[S")
    public static short[] field3007 = new short[256];

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field3012 = 0;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "Z")
    public static boolean field3014 = false;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3010 = "Drop";

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lgk;")
    public static class6 field3011 = new class6();

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "B")
    public static byte field3009;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)I")
    public static final int method1283(int arg0, byte arg1) {
        field3013++;
        if (arg1 >= -30) {
            method1283(35, (byte) -54);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method1284(byte arg0) {
        if (arg0 != 83) {
            method1285(117);
        }
        field3011 = null;
        field3007 = null;
        field3010 = null;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public static final void method1285(int arg0) {
        while (true) {
            if (class166.field2709.method1237(class73.field1001, 8) >= 27) {
                int var1 = class166.field2709.method1239(99, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class198.field3193[var1] == null) {
                        var2 = true;
                        class198.field3193[var1] = new class275();
                    }
                    class275 var3 = class198.field3193[var1];
                    class134.field2250[class251.field4027++] = var1;
                    var3.field656 = class9.field141;
                    if (var3.field4439 != null && var3.field4439.method1803(-1)) {
                        class87.method616(4096, var3);
                    }
                    int var4 = class166.field2709.method1239(119, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class166.field2709.method1239(arg0 - 8881, 1);
                    if (var5 == 1) {
                        class28.field335[class61.field834++] = var1;
                    }
                    int var6 = class166.field2709.method1239(arg0 ^ 0x2239, 5);
                    int var7 = class62.field845[class166.field2709.method1239(-4, 3)];
                    if (var2) {
                        var3.field691 = var3.field657 = var7;
                    }
                    var3.method1857(class104.method741((byte) -51, class166.field2709.method1239(-112, 14)), arg0 ^ 0x3EDB);
                    int var8 = class166.field2709.method1239(-87, 1);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    var3.method389(var3.field4439.field4262, (byte) 98);
                    var3.field611 = var3.field4439.field4290;
                    var3.field631 = var3.field4439.field4250;
                    if (var3.field611 == 0) {
                        var3.field657 = 0;
                    }
                    var3.method379(class197.field3179.field610[0] + var6, (byte) 82, var3.method385((byte) -104), var8 == 1, class197.field3179.field692[0] + var4);
                    if (var3.field4439.method1803(-1)) {
                        class142.method963(var3.field610[0], var3.field692[0], (class94) null, 0, class28.field336, var3, 128, (class235) null);
                    }
                    continue;
                }
            }
            field3008++;
            if (arg0 != 8775) {
                return;
            }
            class166.field2709.method1241((byte) 0);
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 0;
        if (arg8 != 28734) {
            method1283(-11, (byte) 12);
        }
        while (class225.field3572.field1086 > var9) {
            if (class225.field3572.method593(29988, var9)) {
                int[] var10 = class247.field3968.method871(-8251, class225.field3572.field1088[var9] >> 28 & 0x3, class225.field3572.field1088[var9] & 0x3FFF, (class225.field3572.field1088[var9] & 0xFFFDD61) >> 14);
                if (var10 != null) {
                    int var11 = var10[1] - class129.field2149;
                    int var12 = class73.field1002 + class225.field3569 - (var10[2] + 1);
                    int var13 = arg4 + ((arg7 - arg4) * (var11 - arg5) / (arg0 - arg5));
                    int var14 = (var12 - arg1) * (arg3 - arg2) / (arg6 - arg1) + arg2;
                    int var15 = class225.field3572.method592(260, var9);
                    int var16 = 16777215;
                    class36 var17 = null;
                    if (var15 == 0) {
                        if ((double) class130.field2168 == 3.0D) {
                            var17 = class6.field82;
                        }
                        if ((double) class130.field2168 == 4.0D) {
                            var17 = class99.field1514;
                        }
                        if ((double) class130.field2168 == 6.0D) {
                            var17 = class184.field2937;
                        }
                        if ((double) class130.field2168 >= 8.0D) {
                            var17 = class26.field316;
                        }
                    }
                    if (var15 == 1) {
                        if ((double) class130.field2168 == 3.0D) {
                            var17 = class184.field2937;
                        }
                        if ((double) class130.field2168 == 4.0D) {
                            var17 = class26.field316;
                        }
                        if ((double) class130.field2168 == 6.0D) {
                            var17 = class157.field2518;
                        }
                        if ((double) class130.field2168 >= 8.0D) {
                            var17 = class111.field1922;
                        }
                    }
                    if (var15 == 2) {
                        var16 = 16755200;
                        if ((double) class130.field2168 == 3.0D) {
                            var17 = class157.field2518;
                        }
                        if ((double) class130.field2168 == 4.0D) {
                            var17 = class111.field1922;
                        }
                        if ((double) class130.field2168 == 6.0D) {
                            var17 = class168.field2732;
                        }
                        if ((double) class130.field2168 >= 8.0D) {
                            var17 = class249.field3989;
                        }
                    }
                    if (class225.field3572.field1087[var9] != -1) {
                        var16 = class225.field3572.field1087[var9];
                    }
                    if (var17 != null) {
                        int var18 = class122.field2050.method1140(class225.field3572.field1083[var9], (int[]) null, class79.field1079);
                        int var19 = var14 - var17.method287() * (var18 - 1) / 2;
                        int var20 = var19 + var17.method294() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class79.field1079[var21];
                            if (var21 < var18 - 1) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var17.method289(var22, var13, var20, var16, true);
                            var20 += var17.method287();
                        }
                    }
                }
            }
            var9++;
        }
        field3006++;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([B)V")
    public class188(byte[] arg0) {
        this.field3015 = arg0;
    }
}
