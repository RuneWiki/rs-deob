import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class45 {

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field781 = 0;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field783 = "Loaded update list";

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[Lhc;")
    public static class128[] field779;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I")
    public static final int method357(int arg0, int arg1) {
        field782++;
        if (arg1 != 1023) {
            method358((byte) -62);
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method358(byte arg0) {
        field783 = null;
        field779 = null;
        if (arg0 != -58) {
            field784 = -87;
        }
    }
}
