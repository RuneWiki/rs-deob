import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 extends class665 {

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Lpaa;")
    public class577 field174;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V", line = 6)
    public static final void method92(int arg0, int arg1, byte arg2) {
        int var3 = -126 / ((arg2 - 64) / 60);
        field175++;
        class191 var4 = class6.method38(7, -98, arg0);
        var4.method1285((byte) -1);
        var4.field2754 = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z", line = 22)
    public static final boolean method93(int arg0, int arg1) {
        if (arg0 != 4) {
            field173 = 46;
        }
        field172++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lpaa;)V", line = 33)
    public class16(class577 arg0) {
        this.field174 = arg0;
    }
}
