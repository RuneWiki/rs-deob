import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class440 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field6451 = 0;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[[I")
    public static int[][] field6449;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public static void method2710(byte arg0) {
        field6449 = null;
        int var1 = 43 / ((-arg0 - 15) / 56);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
    public static final void method2711(int arg0, int arg1) {
        field6450++;
        if (arg1 < 53) {
            method2710((byte) 58);
        }
        if (class417.field6178 == 0) {
            class285.field4582.method1527(102, arg0);
        } else {
            class263.field4241 = arg0;
        }
    }
}
