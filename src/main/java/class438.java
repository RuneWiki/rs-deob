import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class438 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public int field6113;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lti;")
    public static class438 field6111 = new class438(1);

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lti;")
    public static class438 field6115 = new class438(2);

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Lti;")
    public static class438 field6116 = new class438(4);

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Lti;")
    public static class438 field6117 = new class438(1);

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Lti;")
    public static class438 field6118 = new class438(2);

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lti;")
    public static class438 field6119 = new class438(4);

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Lti;")
    public static class438 field6120 = new class438(2);

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Lti;")
    public static class438 field6121 = new class438(4);

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field6123 = 64;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Ljw;")
    public static class551 field6122 = new class551(1, 2);

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!ti", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6114++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I)V")
    private class438(int arg0) {
        this.field6113 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIILdm;)V")
    public static final void method2634(int arg0, int arg1, int arg2, class50 arg3) {
        field6112++;
        if (arg0 != 64) {
            method2634(-60, 113, 48, null);
        }
        if (arg3 == null) {
            return;
        }
        if (arg3.field805 != null) {
            class604 var4 = new class604();
            var4.field8773 = arg3.field805;
            var4.field8782 = arg3;
            class357.method2223(var4);
        }
        class54.field1033 = arg3.field861;
        class31.field415 = arg3.field792;
        class41.field600 = arg2;
        class40.field590 = arg3.field807;
        class737.field10375 = true;
        class458.field6611 = arg3.field797;
        class23.field299 = arg3.field770;
        class464.field6709 = arg1;
        class262.method1776(0, arg3);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method2635(byte arg0) {
        field6122 = null;
        if (arg0 > -92) {
            field6116 = null;
        }
        field6115 = null;
        field6119 = null;
        field6116 = null;
        field6118 = null;
        field6117 = null;
        field6121 = null;
        field6120 = null;
        field6111 = null;
    }
}
