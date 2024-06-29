import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class92 extends class117 {

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public int field1272 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public int field1277 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public int field1275 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public int field1274 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public int field1276 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public int field1273 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public int field1284 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public int field1287 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lgi;")
    public class287 field1270;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field1279 = -1;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "[Lo;")
    public static class96[] field1269 = new class96[4];

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1285 = "yellow:";

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static volatile int field1281 = 0;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lqf;")
    public static class359 field1271;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "[Lin;")
    public static class177[] field1282;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method720(int arg0, byte arg1) {
        field1288++;
        if (arg1 <= 35) {
            method722(-116);
        }
        int var2 = class137.field1991;
        int var3 = class166.field2385;
        int var4 = class129.field1871;
        int var5 = class362.field5746;
        int var6 = class335.field5216;
        int var7 = (int) class103.field1476;
        if ((class291.field4409 / 256) > var7) {
            var7 = class291.field4409 / 256;
        }
        if (class71.field1021[4] && var7 < (class97.field1371[4] + 128)) {
            var7 = class97.field1371[4] + 128;
        }
        int var8 = (int) class36.field535 + class321.field4832 & 0x7FF;
        class19.method118(class150.field2184, arg0, class112.field1623, var8, var7, 0, class71.method584(class321.field4835, class1.field55.field5137, -85, class1.field55.field5165) - 50, 600 - -(var7 * 3));
        if (class137.field1991 == var2 && class129.field1871 == var4 && class166.field2385 == var3 && class362.field5746 == var5 && class335.field5216 == var6) {
            class86.field1208 = 1;
            return;
        }
        class272.field4121 = 10;
        class288.field4364 = 10;
        int var9 = class335.field5216 - var6;
        class38.field563 = 10;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (class137.field1991 > var2) {
            var2 += class38.field563 + ((class137.field1991 - var2) * class272.field4121 / 1000);
            if (var2 < class137.field1991) {
                class137.field1991 = var2;
            }
        }
        if (var3 < class166.field2385) {
            var3 += (class166.field2385 - var3) * class272.field4121 / 1000 + class38.field563;
            if (class166.field2385 > var3) {
                class166.field2385 = var3;
            }
        }
        if (var4 < class129.field1871) {
            var4 += (class129.field1871 - var4) * class272.field4121 / 1000 + class38.field563;
            if (class129.field1871 > var4) {
                class129.field1871 = var4;
            }
        }
        if (var2 > class137.field1991) {
            int var10 = var2 - (class38.field563 + ((var2 - class137.field1991) * class272.field4121 / 1000));
            if (class137.field1991 < var10) {
                class137.field1991 = var10;
            }
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        class76.field1116 = 10;
        if (var3 > class166.field2385) {
            int var11 = var3 - (class38.field563 + ((var3 - class166.field2385) * class272.field4121 / 1000));
            if (var11 > class166.field2385) {
                class166.field2385 = var11;
            }
        }
        if (var9 > 0) {
            int var12 = class288.field4364 * var9 / 1000 + class76.field1116 + var6;
            var6 = var12 & 0x7FF;
        }
        if (class129.field1871 < var4) {
            int var13 = var4 - ((var4 - class129.field1871) * class272.field4121 / 1000 + class38.field563);
            if (class129.field1871 < var13) {
                class129.field1871 = var13;
            }
        }
        if (class362.field5746 > var5) {
            var5 += (class362.field5746 - var5) * class288.field4364 / 1000 + class76.field1116;
            if (class362.field5746 > var5) {
                class362.field5746 = var5;
            }
        }
        if (var9 < 0) {
            int var14 = var6 - (-var9 * class288.field4364 / 1000 + class76.field1116);
            var6 = var14 & 0x7FF;
        }
        if (var5 > class362.field5746) {
            int var15 = var5 - ((var5 - class362.field5746) * class288.field4364 / 1000 + class76.field1116);
            if (var15 > class362.field5746) {
                class362.field5746 = var15;
            }
        }
        int var16 = class335.field5216 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var9 <= 0 || var16 > 0 && var9 < 0) {
            class335.field5216 = var6;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)Lsb;", line = 163)
    public static final class190 method721(byte arg0) {
        field1283++;
        class190 var1 = new class190(34);
        var1.method1355((byte) -116, 11);
        var1.method1355((byte) -123, class257.field3849);
        var1.method1355((byte) -121, class11.field176 ? 1 : 0);
        var1.method1355((byte) -121, class197.field2863 ? 1 : 0);
        var1.method1355((byte) -128, class229.field3472 ? 1 : 0);
        var1.method1355((byte) -121, class299.field4475 ? 1 : 0);
        var1.method1355((byte) -124, class86.field1219 ? 1 : 0);
        var1.method1355((byte) -111, class324.field4888 ? 1 : 0);
        var1.method1355((byte) -125, class291.field4410 ? 1 : 0);
        var1.method1355((byte) -126, class221.field3304 ? 1 : 0);
        var1.method1355((byte) -120, class173.field2497);
        var1.method1355((byte) -115, class98.field1379 ? 1 : 0);
        var1.method1355((byte) -125, class267.field4078 ? 1 : 0);
        var1.method1355((byte) -109, class128.field1862 ? 1 : 0);
        var1.method1355((byte) -109, class149.field2173);
        var1.method1355((byte) -117, class177.field2547 ? 1 : 0);
        var1.method1355((byte) -117, class38.field565);
        var1.method1355((byte) -118, class267.field4077);
        int var2 = -67 % ((11 - arg0) / 57);
        var1.method1355((byte) -126, class207.field3035);
        var1.method1361(class96.field1365, (byte) 126);
        var1.method1361(class285.field4298, (byte) 125);
        var1.method1355((byte) -117, class155.method1114());
        var1.method1354(class249.field3703, (byte) -92);
        var1.method1355((byte) -109, class135.field1971);
        var1.method1355((byte) -126, class130.field1879 ? 1 : 0);
        var1.method1355((byte) -124, class274.field4156 ? 1 : 0);
        var1.method1355((byte) -109, class93.field1299);
        var1.method1355((byte) -126, class133.field1948 ? 1 : 0);
        var1.method1355((byte) -126, class123.field1795 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lln;", line = 204)
    public static final class118 method722(int arg0) {
        field1286++;
        int var1 = class59.field871[0] * class225.field3397[arg0];
        byte[] var2 = class225.field3385[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class206.field3015[class287.method2076(255, var2[var4])];
        }
        class118 var5 = new class118(class255.field3816, class22.field336, class199.field2896[0], class160.field2319[0], class59.field871[0], class225.field3397[0], var3);
        class321.method2235(-2182);
        return var5;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V", line = 228)
    public static void method723(byte arg0) {
        if (arg0 > -11) {
            field1269 = (class96[]) null;
        }
        field1271 = null;
        field1282 = null;
        field1285 = null;
        field1269 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lgi;)V", line = 314)
    public class92(class287 arg0) {
        this.field1270 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([Ljava/lang/Object;[II)V", line = 247)
    public static final void method724(Object[] arg0, int[] arg1, int arg2) {
        field1280++;
        class265.method1965(arg0, arg2 - 29359, arg1, arg1.length - 1, 0);
        if (arg2 != 29361) {
            method721((byte) -15);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z", line = 294)
    public final boolean method725(int arg0, int arg1, int arg2) {
        field1278++;
        if (this.field1277 <= arg1 && this.field1274 >= arg1 && arg2 >= this.field1272 && this.field1275 >= arg2) {
            return true;
        } else if (this.field1276 <= arg1 && this.field1284 >= arg1 && this.field1273 <= arg2 && this.field1287 >= arg2) {
            return true;
        } else {
            int var4 = -48 % ((arg0 + 34) / 49);
            return false;
        }
    }
}
