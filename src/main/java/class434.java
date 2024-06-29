import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class434 {

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "Z")
    public static boolean field6122 = false;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "Lmq;")
    public static class78 field6116 = new class78(86, 1);

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "I")
    public int field6117;

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "I")
    public int field6118;

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!rha", name = "e", descriptor = "I")
    public int field6120;

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "I")
    public int field6121;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Z)I")
    public static final int method2574(boolean arg0) {
        if (arg0) {
            return -115;
        } else {
            field6119++;
            return class266.field3369;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
    public static void method2575(int arg0) {
        field6116 = null;
        if (arg0 != 3858) {
            field6122 = false;
        }
    }
}
