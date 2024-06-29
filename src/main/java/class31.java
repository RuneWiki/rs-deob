import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 {

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lwd;")
    private static class150 field923 = class2.method9(true, "glow3:");

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lwd;")
    public static class150 field925 = field923;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lwd;")
    public static class150 field917 = field923;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lof;")
    public static class103 field916 = new class103();

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "J")
    public static long field926;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
    public static int[] field922;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I")
    public static final int method247(int arg0, int arg1, int arg2) {
        field921++;
        if (arg0 == -2) {
            return 12345678;
        }
        if (arg1 <= 52) {
            field916 = null;
        }
        if (arg0 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        }
        int var4 = (arg0 & 0x7F) * arg2 / 128;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg0 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static final void method248(byte arg0) {
        field924++;
        if (arg0 != 23 || class80.field1938 == null) {
            return;
        }
        class141 var1 = class80.field1938;
        class141 var2 = class146.method1096((byte) -70, var1);
        if (var2 == null) {
            class80.field1938 = null;
            return;
        }
        class54.field1426++;
        int var3 = class111.field2557;
        int var4 = class113.field2602;
        if (class137.field3221 == 0) {
            var3 -= 4;
            var4 -= 4;
        }
        if (class137.field3221 == 1) {
            var4 -= 205;
            var3 -= 553;
        }
        if (class137.field3221 == 2) {
            var3 -= 17;
            var4 -= 357;
        }
        int var5 = var3 - class95.field2209;
        int var6 = var4 - class55.field1444;
        int[] var7 = class88.method631(var2, (byte) -61);
        if (var7[0] > var5) {
            var5 = var7[0];
        }
        class141 var8 = class58.field1500[var1.field3323 >> 16][var1.field3298 & 0xFFFF];
        if (var7[0] + var2.field3321 < var5 - -var1.field3321) {
            var5 = var7[0] + var2.field3321 - var1.field3321;
        }
        int var9 = var5 + var2.field3390 - var7[0];
        if (var6 < var7[1]) {
            var6 = var7[1];
        }
        if (var7[1] + var2.field3326 < var1.field3326 + var6) {
            var6 = var2.field3326 + var7[1] - var1.field3326;
        }
        int var10 = var6 + var2.field3309 - var7[1];
        int[] var11 = class88.method631(var8, (byte) 125);
        int var12 = var8.field3390 + var5 - var11[0];
        int var13 = var6 + var8.field3309 - var11[1];
        int var14 = var12 - var1.field3304;
        int var15 = var13 - var1.field3353;
        int var10000;
        if (var14 <= var1.field3299 && -var1.field3299 <= var14 && var15 <= var1.field3299 && var15 >= -var1.field3299 && !class116.field2660) {
            var10 -= var15;
            var9 -= var14;
            var10000 = var12 - var14;
            boolean var17 = false;
            var10000 = var13 - var15;
            boolean var19 = false;
        } else if (class54.field1426 > var1.field3417 || class116.field2660) {
            class116.field2660 = true;
        } else {
            var10000 = var12 - var14;
            int var25 = var13 - var15;
            var9 -= var14;
            var10 -= var15;
            boolean var22 = false;
            boolean var23 = false;
        }
        if (class80.field1938.field3302 != null && class116.field2660) {
            class43.method331(var1.field3302, -124, null, 0, var10, var9, var1);
        }
        if (class143.field3466 != 0) {
            return;
        }
        if (class116.field2660) {
            class141 var24 = class28.method236(class55.field1444 + var10, class95.field2209 + var9, var1, arg0 - 31168, var2);
            if (class80.field1938.field3311 != null) {
                class43.method331(var1.field3311, -124, var24, 0, var10, var9, var1);
            }
            if (var24 != null && class49.method368(-5380, var1) != null) {
                class35.field974++;
                class143.field3451.method965(true, 46);
                class143.field3451.method1142(255, var24.field3322);
                class143.field3451.method1122((byte) 32, var1.field3323);
                class143.field3451.method1102((byte) -86, var24.field3323);
                class143.field3451.method1142(255, var1.field3322);
            }
        } else {
            if (class80.field1938.field3385 != null) {
                class43.method331(var1.field3385, -114, null, 0, var10, var9, var1);
            }
            if ((class96.field2215 == 1 || class46.method350(-9786, class125.field2900 - 1)) && class125.field2900 > 2) {
                client.method177(-53);
            } else if (class125.field2900 > 0) {
                class11.method67((byte) -93, class125.field2900 - 1);
            }
        }
        class80.field1938 = null;
        return;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILff;)I")
    public static final int method249(int arg0, class42 arg1) {
        int var2 = arg0;
        if (arg1.method317(class74.field1851, class126.field2928, 5875)) {
            var2 = arg0 + 1;
        }
        field915++;
        if (arg1.method317(class74.field1851, class5.field109, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class109.field2528, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class147.field3552, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class111.field2575, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class137.field3220, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class103.field2344, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class50.field1343, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class82.field1971, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class77.field1907, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class150.field3713, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class131.field3100, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class106.field2398, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class46.field1228, arg0 ^ 0x16F3)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class141.field3419, arg0 ^ 0x16F3)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class78.field1927, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class11.field284, arg0 + 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class65.field1659, 5875)) {
            var2++;
        }
        if (arg1.method317(class74.field1851, class10.field236, arg0 ^ 0x16F3)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)V")
    public static final void method250(int arg0, int arg1, int arg2) {
        field918++;
        class10 var3 = class9.method53(arg2, arg1 ^ 0x400);
        int var4 = var3.field238;
        int var5 = var3.field240;
        int var6 = var3.field235;
        if (arg1 != 0) {
            method251(55);
        }
        int var7 = class125.field2885[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class16.field423[var4] = class147.method1100(class94.method667(arg0 << var5, var8), class94.method667(class16.field423[var4], ~var8));
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method251(int arg0) {
        field916 = null;
        field925 = null;
        field917 = null;
        int var1 = 44 / ((-arg0 - 35) / 34);
        field922 = null;
        field923 = null;
    }
}
