import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class83 extends class1 {

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "Lqg;")
    public class106 field1328;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field1331 = 0;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "F")
    public static float field1327 = 128.0F;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static final void method547(int arg0) {
        int var1 = 52 / ((28 - arg0) / 55);
        while (true) {
            class69 var2;
            class153 var4;
            do {
                var2 = (class69) class97.field1530.method989(4);
                if (var2 == null) {
                    field1332++;
                    return;
                }
                if (var2.field1079 < 0) {
                    int var3 = -var2.field1079 - 1;
                    if (class221.field3334 == var3) {
                        var4 = class165.field2537;
                    } else {
                        var4 = class96.field1521[var3];
                    }
                } else {
                    int var5 = var2.field1079 - 1;
                    var4 = class18.field220[var5];
                }
            } while (var4 == null);
            class288 var6 = class274.method1816(105, var2.field1086);
            int var7;
            int var8;
            if (var2.field1084 == 1 || var2.field1084 == 3) {
                var8 = var6.field4383;
                var7 = var6.field4307;
            } else {
                var7 = var6.field4383;
                var8 = var6.field4307;
            }
            int var9 = (var7 + 1 >> 1) + var2.field1093;
            int var10 = (var8 + 1 >> 1) + var2.field1082;
            int[][] var11 = class67.field1072[class99.field1557];
            int var12 = (var7 >> 1) + var2.field1093;
            int var13 = (var8 >> 1) + var2.field1082;
            int var14 = var11[var12][var13] + var11[var12][var10] + var11[var9][var10] + var11[var9][var13] >> 2;
            class114 var15 = null;
            int var16 = class293.field4607[var2.field1085];
            if (var16 == 0) {
                class162 var20 = class276.method1834(class99.field1557, var2.field1093, var2.field1082);
                if (var20 != null) {
                    var15 = var20.field2489;
                }
            } else if (var16 == 1) {
                class183 var19 = class230.method1468(class99.field1557, var2.field1093, var2.field1082);
                if (var19 != null) {
                    var15 = var19.field2768;
                }
            } else if (var16 == 2) {
                class2 var17 = class97.method627(class99.field1557, var2.field1093, var2.field1082);
                if (var17 != null) {
                    var15 = var17.field31;
                }
            } else if (var16 == 3) {
                class108 var18 = class256.method1689(class99.field1557, var2.field1093, var2.field1082);
                if (var18 != null) {
                    var15 = var18.field1684;
                }
            }
            if (var15 != null) {
                class107.method673(var2.field1080 + 1, 0, class99.field1557, -1, var2.field1083 + 1, var2.field1082, var2.field1093, (byte) 93, 0, var16);
                var4.field2203 = var2.field1080 + class270.field4058;
                var4.field2267 = var15;
                var4.field2300 = var14;
                int var21 = var2.field1096;
                var4.field2240 = class270.field4058 + var2.field1083;
                var4.field2232 = var2.field1093 * 128 + var7 * 64;
                int var22 = var2.field1087;
                int var23 = var2.field1088;
                var4.field2244 = var2.field1082 * 128 + var8 * 64;
                int var24 = var2.field1089;
                if (var23 > var21) {
                    int var25 = var23;
                    var23 = var21;
                    var21 = var25;
                }
                if (var24 < var22) {
                    int var26 = var22;
                    var22 = var24;
                    var24 = var26;
                }
                var4.field2245 = var2.field1093 + var21;
                var4.field2243 = var2.field1082 + var22;
                var4.field2223 = var2.field1082 + var24;
                var4.field2288 = var2.field1093 + var23;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lqg;)V")
    public class83(class106 arg0) {
        this.field1328 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(B)Lsb;")
    public static final class230 method548(byte arg0) {
        field1330++;
        int var1 = class82.field1312[0] * class220.field3315[0];
        byte[] var2 = class10.field129[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class183.field2775[class94.method598(255, var2[var4])];
        }
        class201 var5 = new class201(class162.field2494, class256.field3915, class10.field139[0], class273.field4104[0], class220.field3315[0], class82.field1312[0], var3);
        class82.method537(0);
        if (arg0 <= 104) {
            method549(-76, 49, 70);
        }
        return var5;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)I")
    public static final int method549(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 31 & arg1 - 1;
        if (arg0 != 10833) {
            method549(85, -114, -99);
        }
        field1329++;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }
}
