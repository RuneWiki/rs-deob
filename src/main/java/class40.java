import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class40 extends class452 {

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Lcp;")
    public class512 field537;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field535 = 0;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field541 = 0;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Ll;")
    public static class16 field534;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Z")
    public abstract boolean method378(byte arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIII)I")
    public static final int method379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        field538++;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg4;
            arg4 = var8;
        }
        if (arg1 > -79) {
            return 100;
        } else if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 8 - arg2 - arg5;
        } else {
            return 7 + 1 - arg6 - arg4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)[Lie;")
    public static final class6[] method380(byte arg0) {
        field536++;
        return arg0 == 125 ? new class6[] { class482.field6927, class179.field2701, class146.field2227 } : null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method381(boolean arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method382(int arg0) {
        field534 = null;
        if (arg0 >= -86) {
            method380((byte) 100);
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lcp;I)V")
    public class40(class512 arg0, int arg1) {
        this.field537 = arg0;
        this.field533 = arg1;
    }
}
