import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class664 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "[I")
    public static int[] field9376 = new int[1000];

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
    public static boolean field9377 = false;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 9)
    public static void method3738(int arg0) {
        field9376 = null;
        if (arg0 != 1000) {
            method3739(109, -52);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V", line = 19)
    public static final void method3739(int arg0, int arg1) {
        class215.field2671 = new int[arg1];
        class389.field4915 = new int[arg1];
        if (arg0 != 1000) {
            method3738(-48);
        }
        class289.field3588 = new int[arg1];
        class540.field7233 = new int[arg1];
        class693.field9833 = new int[arg1];
        field9375++;
    }
}
