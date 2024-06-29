import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class13 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Loe;")
    public static class127 field147 = new class127(56, 7);

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "F")
    public static float field148;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)I")
    public abstract int method65(int arg0, byte arg1);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public abstract void method66(int arg0);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method67(byte arg0) {
        if (arg0 != 116) {
            field147 = null;
        }
        field147 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (class355.field5296 <= arg4 && arg2 <= class320.field4818 && arg1 >= class248.field3808 && class478.field7310 >= arg3) {
            class504.method3016(arg0, arg1, arg3, arg2, arg4, 109);
        } else {
            class82.method594(arg2, arg3, arg1, arg4, 86, arg0);
        }
        field146++;
        if (arg5) {
            method67((byte) 127);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)J")
    public abstract long method69(byte arg0);
}
