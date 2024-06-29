import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class238 extends class248 {

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lri;")
    public class114 field4043;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[I")
    public static int[] field4041 = new int[100];

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lij;")
    public static class50 field4040 = class78.method578(125, "headicons_prayer");

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field4039 = 0;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field4037 = -1;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field4044 = 0;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "[I")
    public static int[] field4046 = new int[100];

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "Llb;")
    public static class224 field4045;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[Lce;")
    public static class10[] field4042;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public static void method1612(int arg0) {
        field4045 = null;
        if (arg0 == 0) {
            field4046 = null;
            field4042 = null;
            field4041 = null;
            field4040 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lri;)V")
    public class238(class114 arg0) {
        this.field4043 = arg0;
    }
}
