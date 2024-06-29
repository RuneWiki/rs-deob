import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class178 extends class86 {

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field2665 = 0;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Z")
    public static boolean field2668 = false;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "[I")
    public static int[] field2666;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
    public static final void method1187(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2664++;
        for (int var5 = arg0; var5 < class145.field2254; var5++) {
            if (class249.field3841[var5] + class228.field3568[var5] > arg2 && (arg2 + arg3) > class228.field3568[var5] && arg1 < class237.field3675[var5] + class148.field2291[var5] && arg1 + arg4 > class148.field2291[var5]) {
                class37.field632[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(II)V")
    public class178(int arg0, int arg1) {
        this.field2663 = arg1;
        this.field2667 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method1188(byte arg0) {
        int var1 = -41 / ((arg0 + 10) / 51);
        field2666 = null;
    }
}
