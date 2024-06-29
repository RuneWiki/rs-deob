import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class29 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lpn;")
    public static class72 field376 = new class72(49, 16);

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lbd;")
    public static class327 field379;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 8)
    public static void method151(boolean arg0) {
        if (!arg0) {
            method152((byte) 64, (class280) null);
        }
        field376 = null;
        field379 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLoj;)V", line = 27)
    public static final void method152(byte arg0, class280 arg1) {
        field378++;
        int var2 = class150.field1822;
        int var3 = class274.field3913;
        int var4 = class345.field4933;
        int var5 = class77.field925;
        int var6 = 102 / ((arg0 - 48) / 49);
        int var7 = -10660793;
        arg1.method1759(-6923, var5, var4, var3, var7, var2);
        arg1.method1759(-6923, 16, var4 - 2, var3 + 1, -16777216, var2 + 1);
        arg1.method1755(-4867, var5 - 19, var2 + 1, var4 - 2, -16777216, var3 + 18);
        class101.field1230.method1132(-1, var3 + 14, var2 + 3, var7, class440.field6302.method205((byte) 105, class68.field849), -28115);
        int var8 = class278.field3966.method837(-1);
        int var9 = class278.field3966.method838(28);
        int var10 = 0;
        for (class158 var11 = (class158) class485.field6882.method802((byte) 106); var11 != null; var11 = (class158) class485.field6882.method806((byte) 104)) {
            int var12 = (class223.field3099 - var10 - 1) * 16 + var3 + 31;
            short var13 = -1;
            if (var2 < var8 && (var2 + var4) > var8 && var9 > (var12 - 13) && var9 < (var12 + 3) && var11.field1878) {
                var13 = -256;
            }
            int[] var14 = null;
            if (class419.method2493(var11.field1889, 22383)) {
                var14 = class422.field6096.method121((int) var11.field1883, -1).field5520;
            } else if (var11.field1887 != -1) {
                var14 = class422.field6096.method121(var11.field1887, -1).field5520;
            } else if (class45.method242(var11.field1889, (byte) -46)) {
                class137 var15 = class448.field6366[(int) var11.field1883];
                if (var15 != null) {
                    class476 var16 = var15.field1643;
                    if (var16.field6694 != null) {
                        var16 = var16.method2812(class75.field909, true);
                    }
                    if (var16 != null) {
                        var14 = var16.field6683;
                    }
                }
            } else if (class432.method2587(var11.field1889, (byte) -128)) {
                Object var17 = null;
                class415 var18;
                if (var11.field1889 == 1004) {
                    var18 = class173.field2084.method2297(50, (int) var11.field1883);
                } else {
                    var18 = class173.field2084.method2297(50, (int) (var11.field1883 >>> 32 & 0x7FFFFFFFL));
                }
                if (var18.field5951 != null) {
                    var18 = var18.method2473(-18648, class75.field909);
                }
                if (var18 != null) {
                    var14 = var18.field5922;
                }
            }
            String var19 = class125.method597(var11, -78);
            if (var14 != null) {
                var19 = var19 + class349.method2115(14160, var14);
            }
            class101.field1230.method1137(class430.field6222, var19, var13, var2 + 3, var12, class298.field4460, 116, 0);
            if (var11.field1879) {
                class408.field5780.method2363((var2 + class453.field6394.method2419(false, var19)) + 5, var12 - 12);
            }
            var10++;
        }
        class470.method2762((byte) 75, class345.field4933, class274.field3913, class77.field925, class150.field1822);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 132)
    public class29(String arg0, int arg1) {
        this.field375 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "toString", descriptor = "()Ljava/lang/String;", line = 142)
    public final String toString() {
        field377++;
        throw new IllegalStateException();
    }
}
