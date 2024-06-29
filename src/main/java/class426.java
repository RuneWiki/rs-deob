import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class426 {

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field6481 = 0;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "[C")
    public static char[] field6482 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)V")
    public abstract void method2599(int arg0, int arg1);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)Lkm;")
    public abstract class241 method2600(byte arg0);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
    public static void method2601(byte arg0) {
        if (arg0 <= 10) {
            method2601((byte) 83);
        }
        field6482 = null;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)[B")
    public abstract byte[] method2602(int arg0, int arg1);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)I")
    public abstract int method2603(int arg0, byte arg1);
}
