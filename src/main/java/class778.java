import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class778 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    public static int[] field10683 = new int[2];

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[F")
    public static float[] field10684 = new float[4];

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[I")
    public static int[] field10686 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field10685;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 7)
    public static void method4304(int arg0) {
        field10686 = null;
        if (arg0 >= -43) {
            method4304(123);
        }
        field10684 = null;
        field10683 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 25)
    public static final void method4305(int arg0) {
        class373.field5401 = -1;
        class462.field6396 = null;
        class298.field4325 = null;
        class669.field9399 = -1;
        class122.field1781 = -1;
        class671.field9443 = arg0;
        field10685++;
        class468.field6495 = null;
        class269.field3968 = null;
        class205.field2686 = null;
        class86.field1200 = null;
        class198.field2650 = null;
        class712.field9964.method91(0);
    }
}
