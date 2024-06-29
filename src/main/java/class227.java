import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class227 extends class209 {

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lem;")
    public class282 field3688;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Z")
    public static volatile boolean field3683 = true;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "Luf;")
    public static class168 field3682 = class148.method1019(-1720, "null");

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "[S")
    public static short[] field3681 = new short[256];

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "Luf;")
    private static class168 field3687 = class148.method1019(-1720, "Starting 3d library");

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public static int field3685 = 0;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "Luf;")
    public static class168 field3684 = field3687;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "[[[I")
    public static int[][][] field3686;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V", line = 23)
    public static void method1549(byte arg0) {
        field3687 = null;
        field3686 = (int[][][]) null;
        field3684 = null;
        field3681 = null;
        field3682 = null;
        if (arg0 != -77) {
            field3681 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lem;)V", line = 50)
    public class227(class282 arg0) {
        this.field3688 = arg0;
    }
}
