import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public abstract class class463 {

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Lio;")
    public static class439 field6817 = new class439(2, 2);

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static void method2820(byte arg0) {
        field6817 = null;
        if (arg0 > -117) {
            method2820((byte) -73);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B[B)V")
    public abstract void method2821(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)[B")
    public abstract byte[] method2822(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)[B")
    public abstract byte[] method2823(byte arg0);
}
