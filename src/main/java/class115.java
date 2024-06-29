import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class115 {

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field1767 = 0;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field1765 = 0;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1771 = "Loading wordpack - ";

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Z")
    public static boolean field1768 = false;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "F")
    public static float field1769;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lrn;")
    public static class18 field1766;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lug;B)Lld;", line = 18)
    public static final class294 method989(class25 arg0, byte arg1) {
        field1764++;
        if (arg1 != -101) {
            field1769 = 1.0935218F;
        }
        return new class294(arg0.method296(-128), arg0.method296(-102), arg0.method296(-106), arg0.method296(-76), arg0.method265(true), arg0.method281(44));
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 35)
    public static void method991(int arg0) {
        if (arg0 == 0) {
            field1766 = null;
            field1771 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
    public abstract void method988(int arg0, byte arg1);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
    public abstract int method990(int arg0, int arg1);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[B")
    public abstract byte[] method992(int arg0, int arg1);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Lfd;")
    public abstract class319 method993(int arg0);
}
