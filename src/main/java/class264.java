import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class264 {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3687 = 0;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field3689;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "[[I")
    public static int[][] field3691;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Z")
    public static final boolean method1734(int arg0, int arg1, int arg2) {
        if (arg1 <= 91) {
            return true;
        } else {
            field3685++;
            return (arg2 & 0x180) != 0;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static void method1735(boolean arg0) {
        field3689 = null;
        field3691 = null;
        if (!arg0) {
            method1736(78, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
    public static final void method1736(int arg0, byte arg1) {
        if (arg1 != -66) {
            field3688 = -19;
        }
        field3686++;
        class314 var2 = class483.method2819(3, arg0, 21303);
        var2.method1962((byte) 0);
    }

    @OriginalMember(owner = "client!vc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3684++;
        throw new IllegalStateException();
    }
}
