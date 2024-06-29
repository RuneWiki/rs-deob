import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class129 extends class405 {

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "[B")
    public byte[] field1921;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Laa;")
    public static class76 field1919 = new class76(6, 8);

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "Z")
    public static boolean field1922 = true;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method948(int arg0) {
        if (arg0 == 8) {
            field1919 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([J[Ljava/lang/Object;Z)V")
    public static final void method949(long[] arg0, Object[] arg1, boolean arg2) {
        field1920++;
        if (arg2) {
            field1919 = null;
        }
        class209.method1354(arg0, arg1, -49, arg0.length - 1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "([B)V")
    public class129(byte[] arg0) {
        this.field1921 = arg0;
    }
}
