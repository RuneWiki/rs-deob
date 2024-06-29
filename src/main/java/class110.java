import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class110 {

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "[I")
    public static int[] field1371 = new int[14];

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "Z")
    public static boolean field1374 = false;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILwn;)V")
    public static final void method766(int arg0, class678 arg1) {
        if (arg0 != -29814) {
            method767(-120);
        }
        field1375++;
        class2.field12 = arg1;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public static void method767(int arg0) {
        field1371 = null;
        if (arg0 != 14) {
            field1371 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZIIZ)V")
    public static final void method768(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field1372++;
        class55.method397(arg0, arg4, arg1, class704.field9858.length - 1, arg3, (byte) -79, arg2);
        class223.field2713 = null;
        class613.field8338 = 0;
    }
}
