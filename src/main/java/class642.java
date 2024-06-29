import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class642 {

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lifa;")
    public static class450 field8761 = new class450();

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "Lida;")
    public static class250 field8763;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "[Lws;")
    public static class378[] field8764;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "[Lgda;")
    public static class61[] field8765;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "[[Lkq;")
    public static class620[][] field8762;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V", line = 3)
    public static void method3595(byte arg0) {
        field8762 = null;
        field8763 = null;
        field8764 = null;
        field8761 = null;
        field8765 = null;
        if (arg0 != 122) {
            field8765 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)I", line = 25)
    public static final int method3596(byte arg0) {
        if (arg0 != 119) {
            field8759 = 84;
        }
        field8766++;
        byte var1;
        if (class730.field10230 < 96) {
            var1 = 1;
            class368.method2142(arg0 - 23275, true);
        } else {
            int var2 = class531.method3162(8306);
            if (var2 <= 100) {
                class108.method875(28007);
                var1 = 4;
            } else if (var2 <= 500) {
                var1 = 3;
                class576.method3329(-10);
            } else if (var2 <= 1000) {
                var1 = 2;
                class490.method2898(arg0 ^ 0x77);
            } else {
                class368.method2142(-23156, true);
                var1 = 1;
            }
        }
        if (class118.field1503.field10665.method1903(arg0 ^ 0x77) != 0) {
            class118.field1503.method4295(class118.field1503.field10653, 0, false);
            class677.method3810(true, 0, false);
        }
        class14.method194(true);
        return var1;
    }
}
