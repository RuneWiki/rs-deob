import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class699 {

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
    public static int[] field9859 = new int[2];

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Z")
    public static boolean field9857;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method3934(String arg0, boolean arg1, int arg2) {
        class277.method1660(82, -1, arg0, arg1, -1);
        field9856++;
        if (arg2 <= 44) {
            field9857 = false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;ZLio;)I")
    public static final int method3935(String arg0, boolean arg1, class157 arg2) {
        field9858++;
        int var3 = arg2.field2219;
        byte[] var4 = class118.method692(arg0, -733);
        arg2.method923(32768, var4.length);
        if (!arg1) {
            field9859 = null;
        }
        arg2.field2219 += class267.field3489.method3303((byte) 113, 0, arg2.field2199, arg2.field2219, var4, var4.length);
        return arg2.field2219 - var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method3936(int arg0) {
        field9859 = null;
        if (arg0 > -76) {
            field9859 = null;
        }
    }
}
