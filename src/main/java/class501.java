import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class501 extends class337 {

    @OriginalMember(owner = "client!qja", name = "n", descriptor = "[B")
    public byte[] field6436;

    @OriginalMember(owner = "client!qja", name = "l", descriptor = "Luw;")
    public static class208 field6434 = new class208(55, 6);

    @OriginalMember(owner = "client!qja", name = "o", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!qja", name = "m", descriptor = "Ltea;")
    public static class589 field6435;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(B)V", line = 5)
    public static void method2784(byte arg0) {
        field6435 = null;
        if (arg0 != -67) {
            method2784((byte) 116);
        }
        field6434 = null;
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IZ)V", line = 19)
    public static final void method2785(int arg0, boolean arg1) {
        class207.field2846 = -1;
        field6437++;
        class670.field8696 = arg0;
        if (!arg1) {
            class568.field7179 = 3;
            class317.field3954 = 100;
        }
    }

    @OriginalMember(owner = "client!qja", name = "<init>", descriptor = "([B)V", line = 37)
    public class501(byte[] arg0) {
        this.field6436 = arg0;
    }
}
