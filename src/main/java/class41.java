import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class41 {

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Ljw;")
    public static class259 field518 = new class259(0, 4);

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Leba;")
    public static class550 field519 = new class550(40, -2);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field520;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLio;)Lqm;")
    public static final class376 method224(byte arg0, class157 arg1) {
        field517++;
        if (arg0 <= 30) {
            method226((byte) 99);
        }
        return new class376(arg1.method928(2016790224), arg1.method928(2016790224), arg1.method928(2016790224), arg1.method928(2016790224), arg1.method933((byte) 1), arg1.method933((byte) 1), arg1.method930(255));
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Lia;")
    public static final class190 method225(int arg0, int arg1, int arg2) {
        class207 var3 = class153.field2168[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2768;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
    public static void method226(byte arg0) {
        field520 = null;
        field519 = null;
        field518 = null;
        if (arg0 < 124) {
            field518 = null;
        }
    }
}
