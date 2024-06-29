import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class109 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1556 = 0;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[F")
    public static float[] field1557 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Z")
    public static boolean field1558 = false;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lbi;")
    public static class104 field1554 = new class104(13, -2);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
    public static final void method715(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -1) {
            return;
        }
        if (arg3 >= class178.field2609 && class460.field7096 >= arg3) {
            int var5 = class405.method2598(class222.field3750, class462.field7105, arg0, (byte) 84);
            int var6 = class405.method2598(class222.field3750, class462.field7105, arg1, (byte) 117);
            class510.method3085(var5, var6, arg3, true, arg2);
        }
        field1555++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method716(int arg0) {
        if (arg0 == 0) {
            field1557 = null;
            field1554 = null;
        }
    }
}
