import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class121 {

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lsg;")
    public static class30 field2381 = class167.method1221((byte) 33, "<)4col>");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Llk;")
    public static class232 field2376 = new class232(500);

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "[[I")
    public static int[][] field2391 = new int[104][104];

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
    public static int[] field2388;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "[[I")
    public static int[][] field2390;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method919(int arg0) {
        if (arg0 != 0) {
            method920((byte) -75);
        }
        field2382++;
        class75.field1665.method1650(86);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static final void method920(byte arg0) {
        field2383++;
        class153.field2908 = 0;
        int var1 = (class247.field4394.field1360 >> 7) + class22.field421;
        int var2 = (class247.field4394.field1336 >> 7) + class196.field3547;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class153.field2908 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class153.field2908 = 1;
        }
        if (arg0 != -71) {
            method924(true);
        }
        if (class153.field2908 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class153.field2908 = 0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
    public static void method921(byte arg0) {
        field2390 = null;
        if (arg0 > 73) {
            field2381 = null;
            field2376 = null;
            field2391 = null;
            field2388 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)V")
    public static final void method922(int arg0, byte arg1, int arg2) {
        short var3 = 256;
        field2386++;
        int var4 = 0;
        if (class124.field2432 > 0) {
            class224.method1607(class124.field2432, 59);
            class124.field2432 = 0;
        }
        int var5 = class188.field3436 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class245.field4372[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class131.field2588[var4++];
                int var12 = class188.field3437[var5++ + arg0];
                if (var11 == 0) {
                    class120.field2338.field2904[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - var11 - 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class106.field2134[var11];
                    class120.field2338.field2904[var6++] = class68.method612(class68.method612(var15, 16711935) * var13 + (class68.method612(var12, 16711935) * var14), -16711936) + class68.method612(16711680, class68.method612(65280, var15) * var13 + (class68.method612(var12, 65280) * var14)) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class120.field2338.field2904[var6++] = class188.field3437[var5++ + arg0];
            }
            var5 += class188.field3436 - 128;
        }
        if (arg1 <= 76) {
            field2388 = null;
        }
        class120.field2338.method450(arg0, arg2);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)I")
    public static final int method923(int arg0) {
        field2384++;
        if ((double) class29.field562 == 3.0D) {
            return 37;
        } else if ((double) class29.field562 == 4.0D) {
            return 50;
        } else if ((double) class29.field562 == 6.0D) {
            return 75;
        } else {
            if (arg0 != -26357) {
                field2389 = -122;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lpj;")
    public static final class152 method924(boolean arg0) {
        field2377++;
        if (arg0) {
            field2381 = null;
        }
        byte[] var1 = class222.field3992[0];
        int var2 = class62.field1329[0] * class2.field33[0];
        class152 var5;
        if (class250.field4423[0]) {
            byte[] var6 = class197.field3559[0];
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class182.method1314(class68.method612(var6[var8] << 24, -16777216), class191.field3475[class68.method612(var1[var8], 255)]);
            }
            var5 = new class248(class190.field3464, class273.field4774, class142.field2752[0], class37.field895[0], class62.field1329[0], class2.field33[0], var7);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class191.field3475[class68.method612(var1[var4], 255)];
            }
            var5 = new class152(class190.field3464, class273.field4774, class142.field2752[0], class37.field895[0], class62.field1329[0], class2.field33[0], var3);
        }
        class175.method1285((byte) 53);
        return var5;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZ)V")
    public static final void method925(int arg0, int arg1, boolean arg2) {
        field2380++;
        class142.field2741[arg0] = arg1;
        if (!arg2) {
            field2376 = null;
        }
        class277 var3 = (class277) class176.field3268.method1168(-3, (long) arg0);
        if (var3 == null) {
            class277 var4 = new class277(class111.method874(30351) + 500L);
            class176.field3268.method1164((byte) -92, (long) arg0, var4);
        } else {
            var3.field4824 = class111.method874(30351) + 500L;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public static final void method926(int arg0, int arg1) {
        field2385++;
        if (arg0 != -1) {
            method920((byte) -74);
        }
        class68.field1495.method1642(arg1, 79);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method927(byte arg0, int arg1) {
        field2379++;
        if (arg1 == 100 && class29.field566 > 0) {
            byte[] var2 = class127.field2478[--class29.field566];
            class127.field2478[class29.field566] = null;
            return var2;
        } else if (arg0 != -98) {
            return null;
        } else if (arg1 == 5000 && class262.field4619 > 0) {
            byte[] var3 = class135.field2635[--class262.field4619];
            class135.field2635[class262.field4619] = null;
            return var3;
        } else if (arg1 == 30000 && class126.field2457 > 0) {
            byte[] var4 = class90.field1822[--class126.field2457];
            class90.field1822[class126.field2457] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
    public static final void method928(boolean arg0) {
        field2387++;
        class132.field2600.method1650(101);
        if (!arg0) {
            field2389 = -74;
        }
        class9.field168.method1650(91);
        class261.field4606.method1650(86);
    }
}
