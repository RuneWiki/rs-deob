import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class515 extends class261 {

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public int field7475;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "[F")
    public static float[] field7476 = new float[4];

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Llb;")
    public static class383 field7472 = new class383("WTWIP", 3);

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "[I")
    public static int[] field7477 = new int[1024];

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "F")
    public static float field7478;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "J")
    public static long field7479;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 6)
    public static void method3069(int arg0) {
        field7477 = null;
        if (arg0 == 3) {
            field7472 = null;
            field7476 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZILgh;I)V", line = 19)
    public static final void method3070(boolean arg0, int arg1, class388 arg2, int arg3) {
        field7473++;
        if (class253.field3885 != null || class76.field1543 || arg2 == null || class287.method1801(-2093830196, arg2) == null) {
            return;
        }
        class253.field3885 = arg2;
        class44.field779 = class287.method1801(-2093830196, arg2);
        class247.field3812 = 0;
        class239.field3704 = arg3;
        class460.field6855 = arg1;
        class387.field5659 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(II)V", line = 39)
    public class515(int arg0, int arg1) {
        this.field7474 = arg1;
        this.field7475 = arg0;
    }
}
