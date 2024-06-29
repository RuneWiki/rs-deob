import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class268 extends class600 {

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lar;")
    public class4 field3385;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lae;")
    public static class40 field3387 = new class40();

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lrga;")
    public static class280 field3389 = new class280(22, 7);

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method1550(byte arg0) {
        int var1 = -89 / ((arg0 + 44) / 51);
        field3387 = null;
        field3389 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1551(int arg0, byte arg1, int arg2) {
        if (arg1 < 10) {
            return false;
        } else {
            field3388++;
            return (arg2 & 0x70000) != 0 | class159.method912(arg0, arg2, false) || class167.method955(arg2, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lqj;II[B)V")
    public class268(class548 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3385 = class581.method3206(arg2, false, arg0, 97, arg3, arg1, 6406, 6406);
        this.field3385.method774(false, (byte) -124, false);
    }
}
