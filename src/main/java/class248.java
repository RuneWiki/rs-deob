import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class248 {

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3335 = new String[200];

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "Lcb;")
    public static class318 field3339 = new class318(10, 12);

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "[I")
    public static int[] field3342 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "Lkca;")
    public static class537 field3341 = new class537();

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field3336;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)[Lrn;")
    public static final class380[] method1550(int arg0) {
        field3340++;
        if (arg0 > -88) {
            method1552(true);
        }
        return new class380[] { class618.field8412, class128.field1626, class483.field6508 };
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method1551(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3338++;
        class93.method519(0, arg4, arg1, arg7, arg6, arg3, arg5, arg8, arg2, (byte) 71);
        int var9 = 126 / ((-arg0 - 25) / 47);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)V")
    public static void method1552(boolean arg0) {
        field3341 = null;
        if (arg0) {
            method1551((byte) 95, -11, 36, -124, -40, 110, 38, -105, 109);
        }
        field3335 = null;
        field3342 = null;
        field3339 = null;
        field3336 = null;
    }
}
