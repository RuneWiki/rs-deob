import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class264 implements class432 {

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "Luq;")
    private class172 field3883;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "Lsia;")
    public static class765 field3884 = new class765();

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public static int field3886 = -1;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "Lmq;")
    public static class534 field3887 = new class534();

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Lkt;")
    public final class168 method1775(int arg0) {
        field3881++;
        if (arg0 < 85) {
            method1776(118);
        }
        return class168.field2209;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
    public static void method1776(int arg0) {
        if (arg0 < 31) {
            method1776(-119);
        }
        field3887 = null;
        field3884 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)I")
    public final int method1777(boolean arg0) {
        field3882++;
        if (this.field3883.method1161((byte) 92)) {
            return 100;
        } else {
            if (!arg0) {
                field3884 = null;
            }
            return this.field3883.method1178((byte) -123);
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Luq;)V")
    public class264(class172 arg0) {
        this.field3883 = arg0;
    }
}
