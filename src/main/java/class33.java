import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class33 extends class139 {

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
    public static int field425 = 0;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "Lus;")
    public static class1 field426 = new class1(25, -1);

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "B")
    public static byte field427;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
    public static final void method225(int arg0) {
        ++field428;
        if (arg0 != -31083) {
            method226(-13);
        }
        class51.field698.method1475(0);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field429;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            class415.method2446(var3, 0, class356.field5147, class237.field3559[arg0]);
        }
        if (arg1 != 27782) {
            field426 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class33() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)V")
    public static void method226(int arg0) {
        if (arg0 == -3921) {
            field426 = null;
        }
    }
}
