import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class377 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
    public static int[] field5333 = null;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[[B")
    public static byte[][] field5331;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method2191(int arg0) {
        field5333 = null;
        field5331 = null;
        if (arg0 != 7640) {
            method2191(73);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
    public final int method2192(int arg0, int arg1, int arg2) {
        field5332++;
        int var4 = arg0 < class124.field1711 ? class124.field1711 : arg0;
        if (arg1 != 2) {
            field5331 = null;
        }
        if (class607.field8453 == this) {
            return 0;
        } else if (class228.field3272 == this) {
            return var4 - arg2;
        } else if (class264.field3747 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5334++;
        throw new IllegalStateException();
    }
}
