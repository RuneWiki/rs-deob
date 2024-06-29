import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class469 extends class487 {

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public int field6800;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public int field6807;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public int field6813;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public int field6806;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public int field6812;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public int field6811;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public int field6801;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Lqv;")
    public static class316 field6803 = new class316(71, 8);

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V")
    public static void method2778(boolean arg0) {
        field6803 = null;
        if (!arg0) {
            method2778(false);
        }
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)I")
    public abstract int method910(int arg0);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIILqa;ZLee;Z)V")
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        field6808++;
        if (!arg4) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I")
    public static final int method2779(int arg0, int arg1) {
        if (arg1 != 255) {
            method2780(false);
        }
        field6809++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)[Lrj;")
    public static final class430[] method2780(boolean arg0) {
        field6802++;
        if (arg0) {
            method2781((byte) 65, -57, 34);
        }
        return new class430[] { class438.field6237, class30.field408, class116.field1798, class2.field3, class339.field5023, class319.field4739 };
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)Z")
    public final boolean method556(int arg0) {
        if (arg0 != -1) {
            this.field6807 = 83;
        }
        field6810++;
        return false;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BII)Z")
    public static final boolean method2781(byte arg0, int arg1, int arg2) {
        field6804++;
        if (arg0 < 59) {
            field6803 = null;
        }
        return class355.method2212(arg1, 28, arg2) || class259.method1669(arg1, arg2, -15209);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public final void method549(boolean arg0) {
        field6805++;
        if (!arg0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIII)V")
    public class469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6800 = arg3;
        this.field6807 = arg0;
        this.field6813 = arg6;
        this.field6806 = arg2;
        this.field6812 = arg5;
        this.field6811 = arg4;
        this.field6801 = arg1;
    }
}
