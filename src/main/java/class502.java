import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class502 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
    public static final byte[] method2908(Object arg0, int arg1, boolean arg2) {
        field6995++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 0) {
            method2908(null, -48, false);
        }
        if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class524.method3019(var3, false) : var3;
        } else if (arg0 instanceof class271) {
            class271 var4 = (class271) arg0;
            return var4.method1764(arg1 ^ 0x3E8);
        } else {
            throw new IllegalArgumentException();
        }
    }

    static {
        new class104(null, "Dieses System darf nicht missbraucht werden!", null, null);
    }
}
