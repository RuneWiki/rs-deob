import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Ldj;")
    public static class314 field537;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[[[B")
    public static byte[][][] field536;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)Z", line = 22)
    public static final boolean method145(int arg0, byte arg1) {
        field539++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class117.field1979[arg0];
        if (arg1 > -39) {
            field540 = 115;
        }
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1006;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 49)
    public static void method146(byte arg0) {
        field536 = (byte[][][]) null;
        if (arg0 != 93) {
            method145(33, (byte) -53);
        }
        field537 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V", line = 75)
    public static final void method147(boolean arg0, int arg1) {
        if (arg1 != 64) {
            return;
        }
        field541++;
        if (class163.field2796.field478 >> 7 == class219.field3863 && class163.field2796.field418 >> 7 == class114.field1907) {
            class219.field3863 = 0;
        }
        int var2 = class75.field1404;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class123 var4;
            long var5;
            if (arg0) {
                var4 = class163.field2796;
                var5 = 8791798054912L;
            } else {
                var4 = class140.field2405[class203.field3593[var3]];
                var5 = (long) class203.field3593[var3] << 32;
            }
            if (var4 != null && var4.method122(false)) {
                var4.field2076 = false;
                if ((class22.field545 && class75.field1404 > 200 || class75.field1404 > 50) && !arg0 && var4.field482 == var4.field474) {
                    var4.field2076 = true;
                }
                int var7 = var4.field478 >> 7;
                int var8 = var4.field418 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field2056 == null || var4.field2088 > class293.field5011 || var4.field2094 <= class293.field5011) {
                        if (var4.method118(arg1 ^ 0xFFFFFFBF) == 1 && (var4.field478 & 0x7F) == 64 && (var4.field418 & 0x7F) == 64) {
                            if (class260.field4514[var7][var8] == class167.field2873) {
                                continue;
                            }
                            class260.field4514[var7][var8] = class167.field2873;
                        }
                        var4.field415 = class64.method427(var4.field478, var4.field418, class133.field2315, (byte) 93);
                        class252.method1791(class133.field2315, var4.field478, var4.field418, var4.field415, var4.method118(-1) * 64 + 60 - 64, var4, var4.field460, var5, var4.field445);
                    } else {
                        var4.field2076 = false;
                        var4.field415 = class64.method427(var4.field478, var4.field418, class133.field2315, (byte) 106);
                        class295.method2018(class133.field2315, var4.field478, var4.field418, var4.field415, var4, var4.field460, var5, var4.field2089, var4.field2059, var4.field2096, var4.field2080);
                    }
                }
            }
        }
    }
}
