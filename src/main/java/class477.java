import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class477 extends class127 {

    @OriginalMember(owner = "client!oja", name = "B", descriptor = "J")
    public static long field6697 = -1L;

    @OriginalMember(owner = "client!oja", name = "A", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!oja", name = "D", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!oja", name = "E", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!oja", name = "F", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!oja", name = "G", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2824(int arg0, byte arg1, int arg2) {
        ++field6700;
        int var3 = 37 % ((-70 - arg1) / 52);
        return ~(arg2 & 2048) != -1;
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(BIII)V")
    public final void method905(byte arg0, int arg1, int arg2, int arg3) {
        super.field1742 = arg1;
        super.field1748 = arg3;
        int var5 = 89 % ((arg0 - -54) / 34);
        super.field1747 = arg2;
        ++field6698;
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(IF)V")
    public final void method906(int arg0, float arg1) {
        super.field1746 = arg1;
        if (arg0 == -17359) {
            ++field6701;
        }
    }

    @OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(IIIIIF)V")
    public class477(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
