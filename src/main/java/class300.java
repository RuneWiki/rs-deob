import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class300 {

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
    public boolean field3912;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "[I")
    public static int[] field3920 = new int[50];

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "Lho;")
    public class212 field3910;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "Lho;")
    public class212 field3911;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Lwu;")
    public static class557 field3919;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "Z")
    public boolean field3913;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "[I")
    public static int[] field3917;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
    public static void method1758(byte arg0) {
        field3917 = null;
        field3919 = null;
        if (arg0 < -8) {
            field3920 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
    public final void method1759(int arg0) {
        if (this.field3910 != null) {
            this.field3910.method1398(false);
        }
        if (arg0 != 2075817543) {
            this.field3911 = null;
        }
        field3914++;
        this.field3913 = false;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZLkc;)I")
    public static final int method1760(boolean arg0, class655 arg1) {
        field3916++;
        if (arg0) {
            method1758((byte) -36);
        }
        int var2 = arg1.field9266;
        class591 var3 = arg1.method3482(0);
        if (arg1.field8309 == -1 || arg1.field8352) {
            var2 = arg1.field9249;
        } else if (arg1.field8309 == var3.field8489 || arg1.field8309 == var3.field8501 || arg1.field8309 == var3.field8518 || arg1.field8309 == var3.field8491) {
            var2 = arg1.field9265;
        } else if (arg1.field8309 == var3.field8516 || arg1.field8309 == var3.field8476 || arg1.field8309 == var3.field8500 || arg1.field8309 == var3.field8496) {
            var2 = arg1.field9237;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)I")
    public static final int method1761(int arg0, int arg1, int arg2) {
        field3918++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (arg0 != 21257) {
            method1761(93, 28, -21);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)Z")
    public final boolean method1762(int arg0) {
        if (arg0 != 2075817543) {
            this.field3912 = false;
        }
        field3915++;
        return this.field3913 && !this.field3912;
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Z)V")
    public class300(boolean arg0) {
        this.field3912 = arg0;
    }
}
