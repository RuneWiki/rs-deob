import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class417 extends class264 {

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "[B")
    public byte[] field6022;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Z")
    public static boolean field6025 = false;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "[C")
    public static char[] field6027 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Lbt;")
    public static class363 field6024 = new class363(64);

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Lil;")
    public static class274 field6028 = new class274(5, 6);

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field6029 = 0;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BC)Z", line = 5)
    public static final boolean method2585(byte arg0, char arg1) {
        if (arg0 == -110) {
            field6026++;
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V", line = 16)
    public class417(byte[] arg0) {
        this.field6022 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 25)
    public static void method2586(int arg0) {
        field6028 = null;
        field6027 = null;
        if (arg0 != -96) {
            method2586(-95);
        }
        field6024 = null;
    }
}
