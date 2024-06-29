import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class293 {

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field3803 = -1;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Ltu;")
    public static class7 field3802 = new class7();

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILdn;II)Lov;")
    public static final class278 method1763(int arg0, class201 arg1, int arg2, int arg3) {
        field3800++;
        if (arg0 != 32516) {
            method1764((byte) 114);
        }
        byte[] var4 = arg1.method1313((byte) -105, arg3, arg2);
        return var4 == null ? null : new class278(var4);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public static void method1764(byte arg0) {
        if (arg0 < 18) {
            field3801 = -83;
        }
        field3802 = null;
    }
}
