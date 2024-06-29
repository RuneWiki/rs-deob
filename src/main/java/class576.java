import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class576 extends class175 {

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field8144;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "Lqfa;")
    public static class98 field8142 = new class98(15, 10);

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "[[F")
    public static float[][] field8146 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 4)
    public class576(Object arg0, int arg1) {
        super(arg1);
        this.field8144 = arg0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)Z", line = 12)
    public static final boolean method3292(byte arg0, int arg1, int arg2) {
        field8145++;
        int var3 = -40 / ((arg0 + 38) / 62);
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 22)
    public final Object method1116(int arg0) {
        if (arg0 <= 43) {
            return null;
        } else {
            field8143++;
            return this.field8144;
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)Z", line = 33)
    public final boolean method1118(byte arg0) {
        field8141++;
        if (arg0 <= 97) {
            method3293((byte) 71);
        }
        return false;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V", line = 45)
    public static void method3293(byte arg0) {
        field8146 = null;
        field8142 = null;
        if (arg0 > -117) {
            field8142 = null;
        }
    }
}
