import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class class482 extends class205 {

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "Z")
    public volatile boolean field6952 = true;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "Z")
    public boolean field6953;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "Z")
    public boolean field6954;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)[B")
    public abstract byte[] method12(int arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILrs;III)Lsb;")
    public static final class89 method2913(int arg0, class166 arg1, int arg2, int arg3, int arg4) {
        field6951++;
        if (arg0 != 34037) {
            method2913(-120, null, -66, -117, -46);
        }
        if (!arg1.field2818 && (!class668.method3743((byte) -120, arg4) || !class668.method3743((byte) -122, arg2))) {
            return arg1.field2824 ? new class89(arg1, 34037, arg3, arg4, arg2) : new class89(arg1, arg3, arg4, arg2, class567.method3292(arg4, -122), class567.method3292(arg2, -66));
        } else {
            return new class89(arg1, 3553, arg3, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)I")
    public abstract int method11(byte arg0);
}
