import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class311 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Ljo;")
    public static class303 field4023;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Ljo;")
    public static class303 field4025;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V")
    public static final void method1762(int arg0, byte arg1) {
        field4027++;
        class530 var2 = class242.method1402(-126, 5, arg0);
        var2.method3027((byte) -77);
        if (arg1 != -73) {
            method1763(10, 119, -80);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Z")
    public static final boolean method1763(int arg0, int arg1, int arg2) {
        field4026++;
        int var3 = -5 % (-arg2 / 38);
        return class214.method1276(arg0, arg1, -65537) || class349.method1937((byte) 19, arg0, arg1);
    }

    @OriginalMember(owner = "client!dj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4024++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method1764(int arg0) {
        field4023 = null;
        field4025 = null;
        if (arg0 != 5) {
            field4022 = 66;
        }
    }
}
