import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class185 extends class134 {

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
    public int[] field2725;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "[I")
    public int[] field2720;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[I")
    public static int[] field2726 = new int[5];

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field2723 = 0;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field2727 = 0;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "F")
    public static float field2721;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(Z)V")
    public static void method1437(boolean arg0) {
        if (arg0) {
            field2721 = 0.8671044F;
        }
        field2726 = null;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(Z)I")
    public static final int method1438(boolean arg0) {
        if (!arg0) {
            field2727 = -2;
        }
        field2724++;
        return class102.field1572;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II[I[I)V")
    public class185(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2725 = arg3;
        this.field2720 = arg2;
    }
}
