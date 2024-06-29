import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class609 {

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Ldm;")
    private class98 field8672;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field8675 = 0;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Lww;")
    private class287 field8669;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
    public static int[] field8671;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Z")
    public static final boolean method3560(int arg0, int arg1, int arg2) {
        if (arg2 != 458752) {
            field8671 = null;
        }
        field8674++;
        return class104.method702((byte) 117, arg1, arg0) | (arg1 & 0x70000) != 0 || class705.method3964(arg0, arg1, (byte) 109);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
    public static void method3561(boolean arg0) {
        field8671 = null;
        if (arg0) {
            method3561(false);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Lww;")
    public final class287 method3562(byte arg0) {
        field8670++;
        if (arg0 < 1) {
            field8673 = 99;
        }
        class287 var2 = this.field8672.field1417.field3781;
        if (this.field8672.field1417 == var2) {
            this.field8669 = null;
            return null;
        } else {
            this.field8669 = var2.field3781;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
    public class609() {
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Lww;")
    public final class287 method3563(int arg0) {
        field8676++;
        class287 var2 = this.field8669;
        if (arg0 > -60) {
            field8675 = 27;
        }
        if (this.field8672.field1417 == var2) {
            this.field8669 = null;
            return null;
        } else {
            this.field8669 = var2.field3781;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ldm;)V")
    public class609(class98 arg0) {
        this.field8672 = arg0;
    }
}
