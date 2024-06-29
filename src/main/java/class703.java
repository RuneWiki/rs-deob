import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class703 implements class21 {

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public int field9903;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "Z")
    public static boolean field9904 = false;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Lcc;")
    public static class685 field9901;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "[[[Lfba;")
    public static class24[][][] field9899;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method3887(int arg0) {
        field9899 = null;
        if (arg0 != 5) {
            field9904 = false;
        }
        field9901 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Los;")
    public final class412 method193(byte arg0) {
        field9902++;
        if (arg0 > -21) {
            method3887(-105);
        }
        return class625.field8374;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIB)V")
    public static final void method3888(int arg0, int arg1, byte arg2) {
        field9900++;
        if (arg2 > 98) {
            class382 var3 = class396.method2276(123, 5, arg1);
            var3.method2232(-31);
            var3.field5099 = arg0;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V")
    public class703(int arg0) {
        this.field9903 = arg0;
    }
}
