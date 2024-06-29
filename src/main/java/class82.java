import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class82 {

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field1106 = 0;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1110 = new String[100];

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!haa", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field1109++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V", line = 19)
    public static void method604(byte arg0) {
        if (arg0 == 54) {
            field1110 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/awt/Canvas;IILd;)Lha;", line = 30)
    public static final class60 method605(Canvas arg0, int arg1, int arg2, class152 arg3) {
        field1107++;
        if (arg1 != 2) {
            method605(null, -100, 122, null);
        }
        return new class541(arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIB)I", line = 42)
    public final int method606(int arg0, int arg1, byte arg2) {
        field1108++;
        int var4 = class512.field6932 <= arg1 ? arg1 : class512.field6932;
        if (class315.field4249 == this) {
            return 0;
        }
        if (arg2 != -56) {
            field1106 = -104;
        }
        if (class60.field648 == this) {
            return var4 - arg0;
        } else if (class233.field3019 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }
}
