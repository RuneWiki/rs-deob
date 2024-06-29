import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class371 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[Lr;")
    public static class63[] field5513 = new class63[29];

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lro;")
    public static class249 field5518 = null;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "F")
    public static float field5516;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lqj;")
    public static class238 field5519;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Ldc;")
    public static class376 field5514;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method2441(String arg0, boolean arg1, byte arg2) {
        field5517++;
        if (arg0 == null) {
            return;
        }
        if (class244.field3409 >= 100) {
            class135.method908(class170.field2243, (byte) 53);
            return;
        }
        String var3 = class295.method1881((byte) 79, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class244.field3409; var4++) {
            String var8 = class295.method1881((byte) 43, class272.field3982[var4]);
            if (var8 != null && var8.equals(var3)) {
                class135.method908(arg0 + class6.field61, (byte) 53);
                return;
            }
            if (class155.field2035[var4] != null) {
                String var9 = class295.method1881((byte) 122, class155.field2035[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class135.method908(arg0 + class6.field61, (byte) 53);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class26.field463; var5++) {
            String var6 = class295.method1881((byte) 118, class164.field2128[var5]);
            if (var6 != null && var6.equals(var3)) {
                class135.method908(class224.field3177 + arg0 + class398.field5952, (byte) 53);
                return;
            }
            if (class124.field1654[var5] != null) {
                String var7 = class295.method1881((byte) 121, class124.field1654[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class135.method908(class224.field3177 + arg0 + class398.field5952, (byte) 53);
                    return;
                }
            }
        }
        if (class295.method1881((byte) 67, class100.field1350.field2756).equals(var3)) {
            class135.method908(class177.field2313, (byte) 53);
            return;
        }
        if (arg2 >= -90) {
            method2442((byte) 82);
        }
        class1.field2++;
        class232.field3279.method756(0, 82);
        class232.field3279.method1707(8, class410.method2668((byte) -103, arg0) + 1);
        class232.field3279.method1662(arg0, (byte) -7);
        class232.field3279.method1707(-32, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static void method2442(byte arg0) {
        field5514 = null;
        field5519 = null;
        if (arg0 >= -97) {
            field5519 = null;
        }
        field5513 = null;
        field5518 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lil;")
    public static final class265 method2443(int arg0) {
        field5515++;
        class265 var1 = new class265(37);
        var1.method1707(-127, 14);
        var1.method1707(-120, class357.field5234);
        var1.method1707(5, class17.field203 ? 1 : 0);
        var1.method1707(-28, class161.field2103 ? 1 : 0);
        var1.method1707(-116, class258.field3768 ? 1 : 0);
        var1.method1707(72, class449.field6561 ? 1 : 0);
        var1.method1707(arg0 ^ 0x3E0E, 0);
        var1.method1707(-17, class158.field2076 ? 1 : 0);
        var1.method1707(arg0 + 15870, class261.field3804 ? 1 : 0);
        var1.method1707(53, class451.field6576 ? 1 : 0);
        var1.method1707(18, class176.field2300);
        var1.method1707(-117, class417.field6217 ? 1 : 0);
        var1.method1707(27, class273.field4024 ? 1 : 0);
        var1.method1707(-113, class413.field6165 ? 1 : 0);
        var1.method1707(-122, class292.field4222);
        var1.method1707(78, class101.field1366 ? 1 : 0);
        var1.method1707(-108, class23.field409);
        var1.method1707(50, class407.field6101);
        var1.method1707(arg0 + 15888, class358.field5243);
        var1.method1693(class401.field5968, (byte) 88);
        var1.method1693(class284.field4158, (byte) 121);
        var1.method1707(arg0 ^ 0x3E02, class135.method909(-101));
        var1.method1704(class189.field2559, (byte) 126);
        var1.method1707(-110, class161.field2107);
        var1.method1707(112, class248.field3460 ? 1 : 0);
        var1.method1707(-117, class329.field4714 ? 1 : 0);
        var1.method1707(83, class445.field6478);
        var1.method1707(-115, class396.field5947 ? 1 : 0);
        var1.method1707(-118, class200.field2869 ? 1 : 0);
        if (arg0 == -15996) {
            var1.method1707(arg0 ^ 0xFFFFC1BB, class264.field3845);
            var1.method1707(80, class363.field5313 ? 1 : 0);
            var1.method1707(-120, class215.field3082);
            return var1;
        } else {
            return null;
        }
    }
}
