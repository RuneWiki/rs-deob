import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class225 extends class272 {

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "Lfk;")
    public static class23 field3322 = null;

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "[Lao;")
    public static class116[] field3325 = new class116[50];

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "I")
    public static int field3326 = 0;

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V")
    public static final void method1696(int arg0) {
        field3323++;
        class157.field2400 = new class278(class387.field5543, "", class436.field6354, (short) arg0, 0L, 0, 0);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLdp;)V")
    public static final void method1697(byte arg0, class174 arg1) {
        field3324++;
        class239.field3441 = arg1;
        int var2 = -121 % ((46 - arg0) / 51);
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
    public static void method1698(int arg0) {
        field3325 = null;
        field3322 = null;
        if (arg0 != -16922) {
            field3325 = null;
        }
    }
}
