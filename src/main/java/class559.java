import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class559 {

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "Lnea;")
    public static class664 field7885 = new class664(100, 8);

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Lqs;")
    public static class559 field7887 = new class559();

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "Ldg;")
    public static class376 field7888 = new class376(31, 7);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 3)
    public static void method3194(byte arg0) {
        field7887 = null;
        if (arg0 != 100) {
            field7885 = null;
        }
        field7888 = null;
        field7885 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)I", line = 17)
    public static final int method3195(int arg0, byte arg1) {
        int var2 = -115 % (-arg1 / 57);
        field7883++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V", line = 41)
    public static final void method3196(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7886++;
        class191 var5 = class6.method38(8, -115, arg1);
        var5.method1285((byte) -1);
        var5.field2754 = arg2;
        var5.field2760 = arg0;
        var5.field2755 = arg3;
        if (arg4 <= 12) {
            method3196(99, -121, -81, 11, 94);
        }
    }

    @OriginalMember(owner = "client!qs", name = "toString", descriptor = "()Ljava/lang/String;", line = 57)
    public final String toString() {
        field7884++;
        throw new IllegalStateException();
    }
}
