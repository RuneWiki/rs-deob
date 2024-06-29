import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class432 {

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public int field6403 = 1;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Ljo;")
    public static class382 field6402 = new class382(64);

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[I")
    public static int[] field6406 = new int[6];

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "C")
    public char field6404;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 14)
    public static void method2551(int arg0) {
        field6406 = null;
        field6402 = null;
        if (arg0 != -21585) {
            method2551(21);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lgk;II)V", line = 29)
    private final void method2552(class468 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field6404 = class245.method1490(arg0.method2714((byte) -68), arg2 - 19046);
        } else if (arg1 == 2) {
            this.field6403 = 0;
        }
        if (arg2 != 19045) {
            this.field6403 = -17;
        }
        field6405++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lgk;B)V", line = 50)
    public final void method2553(class468 arg0, byte arg1) {
        if (arg1 > -74) {
            return;
        }
        while (true) {
            int var3 = arg0.method2765(56);
            if (var3 == 0) {
                field6401++;
                return;
            }
            this.method2552(arg0, var3, 19045);
        }
    }
}
