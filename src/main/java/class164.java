import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class164 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[I")
    public static int[] field2665 = new int[50];

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[I")
    public static int[] field2666 = new int[5];

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[I")
    public static int[] field2664 = new int[2];

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method1145(int arg0, int arg1) {
        if (arg0 == 0) {
            field2667++;
            class235.field3751.method1832(arg1, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1146(int arg0) {
        field2664 = null;
        int var1 = -12 / ((arg0 + 62) / 58);
        field2666 = null;
        field2665 = null;
    }
}
