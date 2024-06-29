import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class178 {

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Led;")
    public static class187 field2877 = new class187();

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2878 = "glow1:";

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "[I")
    public static int[] field2879 = new int[128];

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field2880 = 0;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "J")
    public static long field2885 = 0L;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field2886 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2887;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[I")
    public static int[] field2883;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1331(int arg0) {
        field2877 = null;
        field2879 = null;
        if (arg0 != -6657) {
            method1331(-94);
        }
        field2883 = null;
        field2887 = null;
        field2878 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
    public abstract int method3();

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static final void method1332(boolean arg0) {
        while (true) {
            if (class50.field732.method562((byte) 103, class221.field3534) >= 27) {
                int var1 = class50.field732.method554(15, -57);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class169.field2730[var1] == null) {
                        class169.field2730[var1] = new class18();
                        var2 = true;
                    }
                    class18 var3 = class169.field2730[var1];
                    class39.field556[class21.field235++] = var1;
                    var3.field1977 = class264.field4290;
                    if (var3.field205 != null && var3.field205.method1763((byte) -64)) {
                        class131.method941(var3, (byte) -92);
                    }
                    var3.method122(-3662, class234.method1657(0, class50.field732.method554(14, -55)));
                    int var4 = class50.field732.method554(5, -85);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class50.field732.method554(5, -76);
                    int var6 = class50.field732.method554(1, -53);
                    if (var6 == 1) {
                        class188.field3045[class121.field1773++] = var1;
                    }
                    int var7 = class63.field942[class50.field732.method554(3, -106)];
                    if (var2) {
                        var3.field1928 = var3.field1893 = var7;
                    }
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var8 = class50.field732.method554(1, -84);
                    var3.method923(var3.field205.field3997, false);
                    var3.field1940 = var3.field205.field4015;
                    var3.field1927 = var3.field205.field4008;
                    if (var3.field1940 == 0) {
                        var3.field1893 = 0;
                    }
                    var3.method925(0, class186.field2993.field1917[0] + var5, class186.field2993.field1974[0] + var4, var8 == 1, var3.method205(-55));
                    if (var3.field205.method1763((byte) -106)) {
                        class188.method1403(0, var3, var3.field1974[0], class58.field826, 127, (class36) null, var3.field1917[0], (class29) null);
                    }
                    continue;
                }
            }
            field2873++;
            class50.field732.method560(arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lwg;IIIZ)V")
    public void method1298(class178 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2874++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIJILbj;)V")
    public abstract void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class157 arg10);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Lwg;")
    public class178 method1287(int arg0, int arg1, int arg2) {
        field2876++;
        return this;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)[Lsi;")
    public static final class204[] method1333(int arg0) {
        field2875++;
        class204[] var1 = new class204[class143.field2318];
        for (int var2 = arg0; var2 < class143.field2318; var2++) {
            int var3 = class201.field3220[var2] * class19.field214[var2];
            byte[] var4 = class152.field2505[var2];
            if (class186.field3003[var2]) {
                byte[] var7 = class8.field83[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class244.method1747(class179.method1337(255, var7[var9]) << 24, class101.field1476[class179.method1337(var4[var9], 255)]);
                }
                var1[var2] = new class9(class262.field4258, class62.field912, class217.field3457[var2], class272.field4377[var2], class19.field214[var2], class201.field3220[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class101.field1476[class179.method1337(255, var4[var6])];
                }
                var1[var2] = new class140(class262.field4258, class62.field912, class217.field3457[var2], class272.field4377[var2], class19.field214[var2], class201.field3220[var2], var5);
            }
        }
        class188.method1398((byte) 97);
        return var1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V")
    public abstract void method4(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILqi;IZB)V")
    public static final void method1334(int arg0, class131 arg1, int arg2, boolean arg3, byte arg4) {
        int var5 = arg1.field2102;
        if (arg1.field2106 == 0) {
            arg1.field2102 = arg1.field2153;
        } else if (arg1.field2106 == 1) {
            arg1.field2102 = arg2 - arg1.field2153;
        } else if (arg1.field2106 == 2) {
            arg1.field2102 = arg1.field2153 * arg2 >> 14;
        } else if (arg1.field2106 == 3) {
            if (arg1.field2150 == 2) {
                arg1.field2102 = (arg1.field2153 - 1) * arg1.field2064 + arg1.field2153 * 32;
            } else if (arg1.field2150 == 7) {
                arg1.field2102 = (arg1.field2153 - 1) * arg1.field2064 + arg1.field2153 * 115;
            }
        }
        int var6 = arg1.field2167;
        field2884++;
        if (arg1.field2111 == 0) {
            arg1.field2167 = arg1.field2072;
        } else if (arg1.field2111 == 1) {
            arg1.field2167 = arg0 - arg1.field2072;
        } else if (arg1.field2111 == 2) {
            arg1.field2167 = arg1.field2072 * arg0 >> 14;
        } else if (arg1.field2111 == 3) {
            if (arg1.field2150 == 2) {
                arg1.field2167 = (arg1.field2072 - 1) * arg1.field2163 + arg1.field2072 * 32;
            } else if (arg1.field2150 == 7) {
                arg1.field2167 = arg1.field2072 * 12 + ((arg1.field2072 - 1) * arg1.field2163);
            }
        }
        if (arg4 != 105) {
            field2887 = null;
        }
        if (arg1.field2106 == 4) {
            arg1.field2102 = arg1.field2167 * arg1.field2080 / arg1.field2000;
        }
        if (arg1.field2111 == 4) {
            arg1.field2167 = arg1.field2102 * arg1.field2000 / arg1.field2080;
        }
        if (class36.field447 && (client.method1168(arg1).field1063 != 0 || arg1.field2150 == 0)) {
            if (arg1.field2167 < 5 && arg1.field2102 < 5) {
                arg1.field2102 = 5;
                arg1.field2167 = 5;
            } else {
                if (arg1.field2167 <= 0) {
                    arg1.field2167 = 5;
                }
                if (arg1.field2102 <= 0) {
                    arg1.field2102 = 5;
                }
            }
        }
        if (arg1.field2005 == 1337) {
            class264.field4291 = arg1;
        }
        if (arg3 && arg1.field2086 != null && arg1.field2102 != var5 || arg1.field2167 != var6) {
            class294 var7 = new class294();
            var7.field4664 = arg1.field2086;
            var7.field4668 = arg1;
            class120.field1747.method1385(var7, true);
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()Z")
    public boolean method1304() {
        field2881++;
        return false;
    }
}
