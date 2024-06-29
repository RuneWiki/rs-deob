import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class679 implements class437 {

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
    public int field9212;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
    public static int field9211 = -1;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)Lad;")
    public final class426 method119(byte arg0) {
        if (arg0 < 116) {
            method3813(81, 13, -51, -26);
        }
        field9209++;
        return class406.field5948;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)V")
    public static final void method3813(int arg0, int arg1, int arg2, int arg3) {
        field9208++;
        if (arg1 == -23697) {
            class594 var4 = class692.method3869(arg3, (byte) 105, 11);
            var4.method3378(arg1 - 1793);
            var4.field8126 = arg0;
            var4.field8125 = arg2;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(I)V")
    public class679(int arg0) {
        this.field9212 = arg0;
    }
}
