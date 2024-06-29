import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class238 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3804 = "K";

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Z")
    public static boolean field3806 = false;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lek;")
    public static class167 field3803;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lba;")
    public static class170 field3808;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BIILlc;)Lvd;")
    public static final class4 method1670(byte arg0, int arg1, int arg2, class86 arg3) {
        field3807++;
        int var4 = -14 / ((arg0 + 1) / 32);
        return class156.method1155(arg1, arg3, 116, arg2) ? class275.method1903((byte) -56) : null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static final void method1671(int arg0) {
        if (arg0 != 29621) {
            field3806 = false;
        }
        class235.field3794.method1558(-54);
        field3805++;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static void method1672(int arg0) {
        field3808 = null;
        if (arg0 <= 96) {
            method1670((byte) -78, 68, 126, (class86) null);
        }
        field3804 = null;
        field3803 = null;
    }
}
