import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class518 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public int field6592;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public int field6594;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field6595;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lpf;")
    public static class759 field6593 = new class759();

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field6597 = 1;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
    public static int[] field6598 = new int[2];

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2862(boolean arg0) {
        if (arg0) {
            field6598 = null;
            field6593 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(III)V", line = 26)
    public class518(int arg0, int arg1, int arg2) {
        this.field6592 = arg2;
        this.field6594 = arg1;
        this.field6595 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIB)V")
    public abstract void method1041(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIB)V")
    public abstract void method1044(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
    public abstract void method1042(int arg0, int arg1, int arg2);
}
