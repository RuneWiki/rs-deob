import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class class415 extends class363 {

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field6019 = -1;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "[I")
    public static int[] field6020 = new int[25];

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V", line = 17)
    public static void method2489(int arg0) {
        field6020 = null;
        if (arg0 != -1) {
            field6019 = -49;
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)Lgp;")
    public abstract class45 method2488(byte arg0);
}
