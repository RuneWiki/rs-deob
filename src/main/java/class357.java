import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class357 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Lbn;")
    public static class160 field5180 = new class160(25, -1);

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Lvq;")
    public static class24 field5182 = new class24(40, -2);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
    public static final void method2273(boolean arg0) {
        if (!arg0) {
            field5181++;
            class146.field1975 = new class395();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
    public static final boolean method2274(int arg0) {
        field5179++;
        if (arg0 != 25) {
            return true;
        }
        if (class354.field5166) {
            try {
                class73.method521(true, class267.field3963.field5023, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static void method2275(int arg0) {
        field5182 = null;
        int var1 = 116 % ((arg0 - 5) / 44);
        field5180 = null;
    }
}
