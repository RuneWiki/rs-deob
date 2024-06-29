import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class371 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILni;I)Ltba;")
    public static final class164 method2189(int arg0, class522 arg1, int arg2) {
        if (arg2 > -20) {
            field5187 = -75;
        }
        field5188++;
        byte[] var3 = arg1.method2873(arg0, -119);
        return var3 == null ? null : new class164(var3);
    }
}
