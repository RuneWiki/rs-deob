import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class537 extends class450 {

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lhda;")
    public static class752 field7070 = new class752(37, 7);

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Lkaa;")
    public static class47 field7075 = new class47(31, -1);

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "[I")
    public static int[] field7076 = new int[3];

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lup;)V", line = 4)
    public class537(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V", line = 8)
    public final void method67(boolean arg0, int arg1) {
        if (arg0) {
            ++field7071;
            super.field6170 = arg1;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V", line = 19)
    public static void method2978(boolean arg0) {
        field7075 = null;
        field7076 = null;
        field7070 = null;
        if (arg0) {
            field7075 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I", line = 31)
    public final int method75(int arg0, int arg1) {
        ++field7074;
        if (arg0 != 0) {
            method2978(false);
        }
        return 3;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(ILup;)V", line = 47)
    public class537(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)I", line = 53)
    public final int method68(boolean arg0) {
        if (arg0) {
            this.method2979(true);
        }
        ++field7072;
        return !super.field6171.method1672(0) ? 0 : 1;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)I", line = 69)
    public final int method2979(boolean arg0) {
        ++field7073;
        if (!arg0) {
            this.method67(true, 14);
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 80)
    public final void method73(byte arg0) {
        super.field6170 = this.method68(false);
        if (arg0 != 98) {
            field7076 = null;
        }
        ++field7068;
    }
}
