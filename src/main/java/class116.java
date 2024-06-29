import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class116 extends class86 {

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field1499 = 0;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
    public int[] field1490;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
    public int[] field1492;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
    public int[] field1496;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "[Lit;")
    public class439[] field1495;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "[Lit;")
    public class439[] field1498;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
    public byte[][][] field1488;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZII)V")
    public static final void method668(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return;
        }
        field1494++;
        if (arg2 == 1012) {
            class396.method2367(class98.field1320, arg3, arg0);
        } else if (arg2 == 1008) {
            class396.method2367(class172.field2345, arg3, arg0);
        } else if (arg2 == 1001) {
            class396.method2367(class248.field3563, arg3, arg0);
        } else if (arg2 == 1003) {
            class396.method2367(class309.field4501, arg3, arg0);
        } else if (arg2 == 1006) {
            class396.method2367(class234.field3286, arg3, arg0);
            return;
        }
    }
}
