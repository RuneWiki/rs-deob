import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class445 extends class449 {

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public volatile int field6347 = -1;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field6345;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "[I")
    public static int[] field6346 = new int[4096];

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Lth;")
    public static class74 field6349;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public static final void method2702(int arg0) {
        field6348++;
        if (arg0 != 23770) {
            method2702(-117);
        }
        class303.field4310 = 0;
        class6.field38.method773(-1568);
        class6.field38.method766(class107.field1502, -1);
        class303.field4310++;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public static void method2703(int arg0) {
        if (arg0 == 3794) {
            field6346 = null;
            field6349 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class445(String arg0) {
        this.field6345 = arg0;
    }
}
