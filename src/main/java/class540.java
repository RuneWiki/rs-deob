import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class540 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Z")
    public static boolean field7591 = false;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public abstract void method1947(int arg0);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public abstract void method1939(int arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static final void method3039(byte arg0) {
        field7589++;
        class185.field2107.method949(((float) class639.field9075.field6763 * 0.1F + 0.7F) * class186.field2110);
        class185.field2107.method1032(class117.field1289, class362.field4858, class16.field128, (float) (class93.field950 << 2), (float) (class368.field5043 << 2), (float) (class119.field1327 << 2));
        class185.field2107.method947(class235.field2879);
        if (arg0 != -77) {
            field7591 = false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)Lkk;")
    public abstract class159 method1943(int arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)Z")
    public abstract boolean method1945(int arg0, boolean arg1);
}
