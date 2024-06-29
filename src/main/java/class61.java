import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class61 {

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "[I")
    public static int[] field843 = new int[8];

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field845 = 0;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Z")
    public boolean field842;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public static void method353(boolean arg0) {
        field843 = null;
        if (!arg0) {
            field843 = null;
        }
    }
}
