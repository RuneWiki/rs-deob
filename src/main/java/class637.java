import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class637 extends class740 implements class543 {

    @OriginalMember(owner = "client!av", name = "I", descriptor = "Ljm;")
    private class687 field9161;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "[Lsda;")
    public static class258[] field9153 = new class258[6];

    @OriginalMember(owner = "client!av", name = "y", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!av", name = "B", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!av", name = "D", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!av", name = "E", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!av", name = "G", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!av", name = "H", descriptor = "Lnc;")
    public static class24 field9160;

    @OriginalMember(owner = "client!av", name = "F", descriptor = "Lne;")
    public static class317 field9158;

    @OriginalMember(owner = "client!av", name = "C", descriptor = "[[[B")
    public static byte[][][] field9155;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Z")
    public final boolean method266(int arg0) {
        ++field9156;
        return arg0 != -19067 ? false : super.method4119(super.field10341.field8497, arg0 + 19067);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V")
    public final void method262(boolean arg0) {
        if (!arg0) {
            this.method262(true);
        }
        ++field9151;
        super.method262(arg0);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method263(int arg0, boolean arg1) {
        ++field9159;
        if (arg0 != 13931) {
            this.method265(false);
        }
        return super.method4120(super.field10341.field8497, arg1, (byte) -92);
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)I")
    public final int method265(boolean arg0) {
        if (!arg0) {
            this.method265(true);
        }
        ++field9154;
        return super.method265(true);
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(Z)Ljm;")
    public final class687 method264(boolean arg0) {
        ++field9157;
        if (arg0) {
            this.method262(true);
        }
        return this.field9161;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lai;Ljm;Z)V")
    public class637(class597 arg0, class687 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field9161 = arg1;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
    public final void method267(int arg0, int arg1) {
        ++field9152;
        if (arg0 != 30903) {
            this.method263(-32, false);
        }
        super.method267(arg0, this.field9161.field9690 * arg1);
    }

    @OriginalMember(owner = "client!av", name = "f", descriptor = "(I)V")
    public static void method3649(int arg0) {
        field9155 = null;
        field9158 = null;
        field9153 = null;
        field9160 = null;
        if (arg0 < 55) {
            method3649(-110);
        }
    }
}
