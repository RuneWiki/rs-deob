import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class461 extends class670 {

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "[I")
    public static int[] field6559 = new int[6];

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "S")
    public static short field6561 = 256;

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "Ltf;")
    public static class701 field6558;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "Ljava/awt/Image;")
    public static Image field6560;

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIIIIF)V")
    public class461(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIB)V")
    public final void method257(int arg0, int arg1, int arg2, byte arg3) {
        super.field9336 = arg2;
        super.field9327 = arg1;
        super.field9338 = arg0;
        ++field6556;
        int var5 = 82 % ((-11 - arg3) / 61);
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V")
    public static void method2651(int arg0) {
        field6560 = null;
        if (arg0 >= -100) {
            method2651(74);
        }
        field6559 = null;
        field6558 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(FI)V")
    public final void method258(float arg0, int arg1) {
        if (arg1 != -3989) {
            field6558 = null;
        }
        ++field6557;
        super.field9332 = arg0;
    }
}
