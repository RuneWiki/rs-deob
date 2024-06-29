import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class456 extends class82 {

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "[I")
    public static int[] field6284 = new int[1];

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "Z")
    public static boolean field6282 = false;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "[I")
    public static int[] field6285 = new int[8];

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 4)
    public class456() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)[I", line = 7)
    public final int[] method201(int arg0, int arg1) {
        field6283++;
        return arg1 == 12218 ? class366.field4817 : null;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V", line = 21)
    public static void method2664(int arg0) {
        field6285 = null;
        field6284 = null;
        if (arg0 != 0) {
            method2664(-51);
        }
    }
}
