import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class167 extends class601 {

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "I")
    private int field2584;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
    public static int field2585 = 0;

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "Ldia;")
    public static class235 field2586 = new class235("", 14);

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V")
    public class167() {
        this(4096);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        ++field2583;
        if (~arg2 == -1) {
            this.field2584 = (arg0.method3821((byte) -88) << 12) / 255;
        }
        if (arg1 != -61) {
            field2586 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V")
    public class167(int arg0) {
        super(0, true);
        this.field2584 = 4096;
        this.field2584 = arg0;
    }

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "(I)V")
    public static void method1200(int arg0) {
        if (arg0 < 4) {
            field2586 = null;
        }
        field2586 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        if (arg0 != -40) {
            field2587 = 23;
        }
        ++field2582;
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            class335.method2021(var3, 0, class171.field2624, this.field2584);
        }
        return var3;
    }
}
