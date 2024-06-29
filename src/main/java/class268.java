import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class268 extends class125 {

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "Llc;")
    public static class435 field3814 = new class435(102, 1);

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "Lkca;")
    public static class755 field3818 = new class755(1);

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        if (arg0 >= -32) {
            this.method156(false);
        }
        super.field1732 = arg1;
        ++field3813;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field3816;
        return !arg0 ? -82 : 1;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field3814 = null;
        field3818 = null;
        if (arg0 != 2048) {
            field3814 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = 91 / ((arg0 - -63) / 49);
        ++field3817;
        return 0;
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(Z)I")
    public final int method1758(boolean arg0) {
        if (arg0) {
            return -96;
        } else {
            ++field3811;
            return super.field1732;
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        ++field3812;
        if (!arg0) {
            field3814 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lgp;)V")
    public class268(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(ILgp;)V")
    public class268(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(III)Z")
    public static final boolean method1759(int arg0, int arg1, int arg2) {
        if (arg0 >= -26) {
            method1759(-57, -93, 18);
        }
        ++field3819;
        return ~(arg1 & 2048) != -1;
    }
}
