import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class320 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lada;")
    public static class144 field4419 = new class144(103, 17);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lpc;Z)Z", line = 6)
    public static final boolean method1933(class577 arg0, boolean arg1) {
        boolean var2 = class165.field2609 == class114.field1609;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method943(63);
        if (arg0.field8504 < 0 || arg0.field8509 < 0 || arg0.field8508 >= class145.field2083 || arg0.field8499 >= class384.field5282) {
            return false;
        }
        for (int var6 = arg0.field8504; var6 <= arg0.field8508; var6++) {
            for (int var9 = arg0.field8509; var9 <= arg0.field8499; var9++) {
                class205 var10 = class441.method2562(arg0.field8501, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field8504) {
                        var11++;
                    }
                    if (var6 < arg0.field8508) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field8509) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field8499) {
                        var11 += 2;
                    }
                    class636 var12 = class170.method1210(8, var11, arg0);
                    class636 var13 = var10.field3029;
                    if (var13 == null) {
                        var10.field3029 = var12;
                    } else {
                        while (var13.field9302 != null) {
                            var13 = var13.field9302;
                        }
                        var13.field9302 = var12;
                    }
                    var10.field3038 = (byte) (var10.field3038 | var11);
                    if (var2 && (class188.field2797[var6][var9] & 0xFF000000) != 0) {
                        var3 = class188.field2797[var6][var9];
                        var4 = class188.field2803[var6][var9];
                        var5 = class557.field8282[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field8504; var7 <= arg0.field8508; var7++) {
                for (int var8 = arg0.field8509; var8 <= arg0.field8499; var8++) {
                    if ((class188.field2797[var7][var8] & 0xFF000000) == 0) {
                        class188.field2797[var7][var8] = var3;
                        class188.field2803[var7][var8] = var4;
                        class557.field8282[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class583.field8562[class635.field9298++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 115)
    public static void method1934(int arg0) {
        field4419 = null;
        int var1 = 84 % ((-arg0 - 25) / 44);
    }
}
