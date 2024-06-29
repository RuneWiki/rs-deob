import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class17 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lai;")
    public static class206 field217;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Ljava/lang/String;")
    public String field213;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static final void method83(int arg0) {
        field215++;
        if (arg0 != 0) {
            method83(103);
        }
        for (class192 var1 = (class192) class63.field842.method1382(27901); var1 != null; var1 = (class192) class63.field842.method1383(false)) {
            if (var1.field2791.method3860(true)) {
                class49.method334((byte) -87, var1.field2789);
            } else {
                var1.field2791.method305(false);
                try {
                    var1.field2791.method3851(0);
                } catch (Exception var5) {
                    class233.method1495((byte) -91, var5, "TV: " + var1.field2789);
                    class49.method334((byte) -98, var1.field2789);
                }
                if (!var1.field2782 && !var1.field2788) {
                    class168 var3 = var1.field2791.method3862(arg0 ^ 0xFFFFFF90);
                    if (var3 != null) {
                        class560 var4 = var3.method1064((byte) -41);
                        if (var4 != null) {
                            var4.method3352(30693, var1.field2785);
                            class237.field3299.method3760(var4);
                            var1.field2782 = true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method84(byte arg0) {
        if (arg0 != -8) {
            field217 = null;
        }
        field217 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lwu;Lhh;BLwu;Lqc;Lwu;)Z")
    public static final boolean method85(class557 arg0, class529 arg1, byte arg2, class557 arg3, class379 arg4, class557 arg5) {
        class263.field3587 = arg3;
        field214++;
        class169.field2314 = new int[16];
        if (arg2 < 117) {
            method85(null, null, (byte) -10, null, null, null);
        }
        class474.field6485 = arg5;
        class169.field2312 = arg0;
        class336.field4314 = arg4;
        class614.field8742 = arg1;
        for (int var6 = 0; var6 < 16; var6++) {
            class169.field2314[var6] = 255;
        }
        return true;
    }
}
