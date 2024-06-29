import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class367 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public int field4756;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public int field4757;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public int field4760;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Ll;")
    public static class16 field4755;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method2103(int arg0) {
        if (arg0 != -22901) {
            method2104(46);
        }
        field4754++;
        return class503.field7268;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 15)
    public static final void method2104(int arg0) {
        field4759++;
        if (class347.field4463 != null) {
            class347.field4463.method83(-61);
        }
        if (arg0 <= 11) {
            field4755 = null;
        }
        if (class407.field5820 != null) {
            class407.field5820.method83(-41);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 34)
    public static void method2105(byte arg0) {
        if (arg0 < -87) {
            field4755 = null;
        }
    }
}
