import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "J")
    public static volatile long field226 = 0L;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "La;")
    public static class1 field229 = class113.method934(-11538, "::hiddenbuttontest");

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Z")
    public static boolean field225 = false;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "La;")
    public static class1 field233 = class113.method934(-11538, "Einloggen");

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "La;")
    public static class1 field235 = class113.method934(-11538, "mapdots");

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "La;")
    private static class1 field228 = class113.method934(-11538, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "La;")
    public static class1 field232 = field228;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lkd;")
    public static class64 field231 = null;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
    public static int[] field230;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 15)
    public static void method124(byte arg0) {
        field229 = null;
        field232 = null;
        int var1 = 18 % ((arg0 - 8) / 59);
        field235 = null;
        field230 = null;
        field228 = null;
        field233 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)I", line = 61)
    public static final int method125(int arg0, int arg1, int arg2, int arg3) {
        field238++;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg3 / arg2;
        int var6 = arg2 - 1 & arg3;
        int var7 = arg0 / arg2;
        int var8 = class5.method122(arg1 - 15177, var7, var5);
        int var9 = class5.method122(arg1 ^ arg1, var7 + 1, var5);
        int var10 = class5.method122(0, var7, var5 + 1);
        int var11 = class5.method122(0, var7 + 1, var5 + 1);
        int var12 = class64.method630(var8, arg2, var9, true, var4);
        int var13 = class64.method630(var10, arg2, var11, true, var4);
        return class64.method630(var12, arg2, var13, true, var6);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 128)
    public static final void method126(int arg0) {
        field239++;
        if (arg0 != 128) {
            field225 = false;
        }
        for (int var1 = 0; var1 < class36.field966; var1++) {
            int var10002 = class22.field685[var1]--;
            if (class22.field685[var1] >= -10) {
                class77 var3 = class36.field956[var1];
                if (var3 == null) {
                    var3 = class77.method714(class80.field2034, class95.field2372[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class22.field685[var1] += var3.method712();
                    class36.field956[var1] = var3;
                }
                if (class22.field685[var1] < 0) {
                    int var10;
                    if (class60.field1524[var1] == 0) {
                        var10 = class9.field323;
                    } else {
                        int var4 = (class60.field1524[var1] & 0xFF) * 128;
                        int var5 = class60.field1524[var1] >> 16 & 0xFF;
                        int var6 = class60.field1524[var1] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - class104.field2624.field1966;
                        int var8 = var5 * 128 + 64 - class104.field2624.field1975;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var9 > var4) {
                            class22.field685[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class62.field1562 / var4;
                    }
                    class135 var11 = var3.method713().method1058(class108.field2708);
                    class61 var12 = class61.method593(var11, 100, var10);
                    var12.method588(class115.field2848[var1] - 1);
                    class99.field2438.method127(var12);
                    class22.field685[var1] = -100;
                }
            } else {
                class36.field966--;
                for (int var2 = var1; var2 < class36.field966; var2++) {
                    class95.field2372[var2] = class95.field2372[var2 + 1];
                    class36.field956[var2] = class36.field956[var2 + 1];
                    class115.field2848[var2] = class115.field2848[var2 + 1];
                    class22.field685[var2] = class22.field685[var2 + 1];
                    class60.field1524[var2] = class60.field1524[var2 + 1];
                }
                var1--;
            }
        }
        if (class75.field1863 <= 0) {
            return;
        }
        class75.field1863 -= 20;
        if (class75.field1863 < 0) {
            class75.field1863 = 0;
        }
        if (class75.field1863 == 0 && class62.field1557 != 0 && class122.field3040 != -1) {
            class72.method684(false, 0, class122.field3040, class62.field1557, 0, class108.field2705, -1);
            return;
        }
    }
}
