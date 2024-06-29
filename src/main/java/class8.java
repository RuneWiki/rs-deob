import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class8 extends class130 {

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field81 = -1;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Z")
    public static boolean field76 = false;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lqj;")
    public static class196 field82 = class80.method502("(U3", -48);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "B")
    public byte field86;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lbk;")
    public static class136 field77;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lqj;")
    public class196 field83;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lqj;")
    public class196 field85;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method30(int arg0) {
        field82 = null;
        field77 = null;
        if (arg0 != 0) {
            method31(-61, 107);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
    public static final void method31(int arg0, int arg1) {
        if (arg0 != 26155) {
            method31(-16, -122);
        }
        class247.field4393.method130(66, arg1);
        field87++;
        class218.field3903.method130(-59, arg1);
    }
}
