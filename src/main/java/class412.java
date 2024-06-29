import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class412 extends class381 {

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public int field6117;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public int field6115;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field6118 = -2;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field6120 = 0;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "[I")
    public static int[] field6119 = new int[5];

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method2519(int arg0) {
        if (arg0 == -10581) {
            field6119 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V")
    public class412(int arg0, int arg1) {
        this.field6117 = arg1;
        this.field6115 = arg0;
    }
}
