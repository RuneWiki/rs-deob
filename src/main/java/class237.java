import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class237 {

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public int field2791 = 128;

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
    public int field2801 = 128;

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "Z")
    public static boolean field2792 = true;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "[Lkp;")
    public static class515[] field2796 = new class515[8];

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLbea;)V")
    public final void method1443(byte arg0, class237 arg1) {
        this.field2791 = arg1.field2791;
        this.field2794 = arg1.field2794;
        this.field2800 = arg1.field2800;
        this.field2801 = arg1.field2801;
        if (arg0 != 96) {
            this.field2799 = 109;
        }
        this.field2793 = arg1.field2793;
        field2797++;
        this.field2799 = arg1.field2799;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)Lbea;")
    public final class237 method1444(int arg0) {
        if (arg0 == -25014) {
            field2798++;
            return new class237(this.field2799, this.field2791, this.field2801, this.field2793, this.field2794, this.field2800);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Lmd;")
    public static final class570 method1445(int arg0, int arg1) {
        if (arg1 != 128) {
            field2792 = false;
        }
        field2795++;
        return new class570(arg0, false);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
    public static void method1446(byte arg0) {
        if (arg0 >= -4) {
            field2792 = true;
        }
        field2796 = null;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(I)V")
    public class237(int arg0) {
        this.field2799 = arg0;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(IIIIII)V")
    private class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2799 = arg0;
        this.field2793 = arg3;
        this.field2800 = arg5;
        this.field2791 = arg1;
        this.field2794 = arg4;
        this.field2801 = arg2;
    }
}
