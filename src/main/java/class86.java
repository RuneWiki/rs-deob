import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class86 extends class209 {

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "[B")
    public byte[] field1336;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "Luf;")
    public static class168 field1337 = class148.method1019(-1720, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static volatile int field1333 = 0;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V", line = 5)
    public static final void method591(int arg0) {
        if (arg0 != 128) {
            return;
        }
        field1338++;
        class272.field4573 = 0;
        int var1 = (class266.field4489.field3027 >> 7) + class182.field2916;
        int var2 = (class266.field4489.field3021 >> 7) + class276.field4641;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class272.field4573 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class272.field4573 = 1;
        }
        if (class272.field4573 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class272.field4573 = 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V", line = 38)
    public static final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1331++;
        if (arg1 != -22446) {
            return;
        }
        class203.field3328 = arg0;
        class285.field4823 = arg4;
        class287.field4836 = arg3;
        class233.field3748 = arg2;
        class165.field2645 = arg5;
        if (class203.field3328 >= 100) {
            int var6 = class233.field3748 * 128 + 64;
            int var7 = class165.field2645 * 128 + 64;
            int var8 = class62.method349(arg1 ^ 0xFFFFA8D2, class79.field1127, var7, var6) - class287.field4836;
            int var9 = var6 - class248.field4249;
            int var10 = var8 - class143.field2208;
            int var11 = var7 - class157.field2483;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class105.field1624 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class288.field4847 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 0x7FF;
            if (class105.field1624 < 128) {
                class105.field1624 = 128;
            }
            if (class105.field1624 > 383) {
                class105.field1624 = 383;
            }
        }
        class289.field4867 = 2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)[Lwa;", line = 86)
    public static final class284[] method593(boolean arg0) {
        field1334++;
        class284[] var1 = new class284[class201.field3305];
        if (arg0) {
            method594(100);
        }
        for (int var2 = 0; var2 < class201.field3305; var2++) {
            int var3 = class214.field3490[var2] * class205.field3374[var2];
            byte[] var4 = class236.field3779[var2];
            if (class78.field1086[var2]) {
                byte[] var7 = class303.field5115[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class80.method492(class159.method1119(var7[var9] << 24, -16777216), class123.field1905[class159.method1119(255, var4[var9])]);
                }
                var1[var2] = new class66(class56.field724, class206.field3381, class154.field2430[var2], class254.field4341[var2], class205.field3374[var2], class214.field3490[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class123.field1905[class159.method1119(255, var4[var6])];
                }
                var1[var2] = new class258(class56.field724, class206.field3381, class154.field2430[var2], class254.field4341[var2], class205.field3374[var2], class214.field3490[var2], var5);
            }
        }
        class244.method1679(-14642);
        return var1;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V", line = 149)
    public static void method594(int arg0) {
        if (arg0 != 8511) {
            field1337 = (class168) null;
        }
        field1337 = null;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V", line = 159)
    public static final void method595(int arg0) {
        field1335++;
        if (class85.method580(arg0) != 2) {
            return;
        }
        int var1 = class134.field2091 % 104;
        byte var2 = (byte) (class134.field2091 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class291.field4914[var3][var1][var4] = var2;
            }
        }
        if (class79.field1127 == 3) {
            return;
        }
        for (int var5 = arg0; var5 < 2; var5++) {
            class284.field4814[var5] = -1000000;
            class50.field613[var5] = 1000000;
            class126.field1938[var5] = 0;
            class114.field1781[var5] = 1000000;
            class200.field3302[var5] = 0;
        }
        if (class289.field4867 != 1) {
            int var6 = class62.method349(128, class79.field1127, class157.field2483, class248.field4249);
            if ((var6 - class143.field2208) < 800 && (class159.field2520[class79.field1127][class248.field4249 >> 7][class157.field2483 >> 7] & 0x4) != 0) {
                class238.method1599(false, class92.field1424, 1, class157.field2483 >> 7, 21849, class248.field4249 >> 7);
            }
            return;
        }
        if ((class159.field2520[class79.field1127][class266.field4489.field3027 >> 7][class266.field4489.field3021 >> 7] & 0x4) != 0) {
            class238.method1599(false, class92.field1424, 0, class266.field4489.field3021 >> 7, 21849, class266.field4489.field3027 >> 7);
        }
        if (class105.field1624 >= 310) {
            return;
        }
        int var7 = class248.field4249 >> 7;
        int var8 = class157.field2483 >> 7;
        int var9 = class266.field4489.field3027 >> 7;
        int var10;
        if (var9 <= var7) {
            var10 = var7 - var9;
        } else {
            var10 = var9 - var7;
        }
        int var11 = class266.field4489.field3021 >> 7;
        int var12;
        if (var8 < var11) {
            var12 = var11 - var8;
        } else {
            var12 = var8 - var11;
        }
        if (var12 >= var10) {
            int var15 = var10 * 65536 / var12;
            int var16 = 32768;
            while (var8 != var11) {
                if (var11 > var8) {
                    var8++;
                } else if (var11 < var8) {
                    var8--;
                }
                if ((class159.field2520[class79.field1127][var7][var8] & 0x4) != 0) {
                    class238.method1599(false, class92.field1424, 1, var8, 21849, var7);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var7 < var9) {
                        var7++;
                    } else if (var9 < var7) {
                        var7--;
                    }
                    var16 -= 65536;
                    if ((class159.field2520[class79.field1127][var7][var8] & 0x4) != 0) {
                        class238.method1599(false, class92.field1424, 1, var8, 21849, var7);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var10;
        int var14 = 32768;
        while (var7 != var9) {
            if (var7 < var9) {
                var7++;
            } else if (var7 > var9) {
                var7--;
            }
            if ((class159.field2520[class79.field1127][var7][var8] & 0x4) != 0) {
                class238.method1599(false, class92.field1424, 1, var8, 21849, var7);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var8 < var11) {
                    var8++;
                } else if (var8 > var11) {
                    var8--;
                }
                if ((class159.field2520[class79.field1127][var7][var8] & 0x4) != 0) {
                    class238.method1599(false, class92.field1424, 1, var8, 21849, var7);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([B)V", line = 338)
    public class86(byte[] arg0) {
        this.field1336 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIIIII)V", line = 351)
    public static final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 2072) {
            method592(43, -84, 53, 12, 123, 111);
        }
        class25.field300[0].method1363(arg1, arg5);
        int var6 = (arg4 - 32) * arg4 / arg2;
        field1332++;
        class25.field300[1].method1363(arg1, arg4 + arg5 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg3 / (arg2 - arg4);
        class228.method1560(arg1, arg5 + 16, 16, arg4 - 32, class204.field3349);
        class228.method1560(arg1, var7 + arg5 + 16, 16, var6, class214.field3493);
        class228.method1556(arg1, arg5 + var7 + 16, var6, class15.field167);
        class228.method1556(arg1 + 1, var7 + 16 + arg5, var6, class15.field167);
        class228.method1564(arg1, arg5 + var7 + 16, 16, class15.field167);
        class228.method1564(arg1, arg5 + var7 + 17, 16, class15.field167);
        class228.method1556(arg1 + 15, arg5 - -16 + var7, var6, class278.field4670);
        class228.method1556(arg1 + 14, arg5 - (-var7 + -17), var6 - 1, class278.field4670);
        class228.method1564(arg1, arg5 + var7 + var6 + 15, 16, class278.field4670);
        class228.method1564(arg1 + 1, arg5 + 14 + var7 + var6, 15, class278.field4670);
    }
}
