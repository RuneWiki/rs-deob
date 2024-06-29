import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class123 extends class128 {

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "F")
    public static float field1743 = 0.0F;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "S")
    public static short field1742 = 32767;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "[[B")
    public static byte[][] field1744 = new byte[1000][];

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method645(int arg0);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)Z")
    public abstract boolean method644(byte arg0);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method793(boolean arg0) {
        if (!arg0) {
            method793(false);
        }
        field1744 = null;
    }
}
