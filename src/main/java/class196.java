import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public abstract class class196 {

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "[S")
    public static short[] field2525 = new short[256];

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "F")
    public static float field2526 = 0.25F;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lsb;")
    public static class193 field2528;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static void method1121(int arg0) {
        field2525 = null;
        if (arg0 != 9196) {
            method1122(-81, 64);
        }
        field2528 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)Z")
    public static final boolean method1122(int arg0, int arg1) {
        if (arg0 == 28263) {
            field2527++;
            return arg1 == 44 || arg1 == 9 || arg1 == 1012 || arg1 == 18 || arg1 == 16;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V")
    public static final void method1123(byte arg0, int arg1) {
        class53.field615 = 100;
        class307.field4117 = -1;
        class509.field7386 = 3;
        class183.field2379 = arg1;
        field2524++;
        if (arg0 != 105) {
            method1122(-36, 70);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLhc;)Lhc;")
    public abstract class95 method1124(byte arg0, class95 arg1);
}
