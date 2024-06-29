import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class787 {

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "D")
    public static double field10797;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
    public static int field10798;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field10799;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field10801;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public int field10802;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "Ljava/lang/String;")
    public String field10800;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)Z", line = 7)
    public static final boolean method4288(int arg0, byte arg1) {
        int var2 = 20 / ((arg1 - 21) / 51);
        field10799++;
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIB)Z", line = 20)
    public static final boolean method4289(int arg0, int arg1, byte arg2) {
        if (arg2 <= 57) {
            method4288(-114, (byte) -102);
        }
        field10798++;
        return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V", line = 32)
    public static final void method4290(int arg0) {
        field10801++;
        class761.field10485 = false;
        class622.method3506(89);
        if (arg0 != -20016) {
            field10797 = -0.7434292808985488D;
        }
    }
}
