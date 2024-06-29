import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class700 extends class424 {

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public int field9761 = -1;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "Z")
    public boolean field9766 = false;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Lbc;")
    public static class9 field9763 = new class9(8);

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "Lki;")
    public static class364 field9768 = new class364();

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "Lrba;")
    public static class101 field9769 = new class101("", 12);

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field9770 = new String[100];

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public int field9759;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public int field9760;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
    public int field9764;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public int field9765;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
    public int field9767;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "Lmd;")
    public static class245 field9771;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public static void method3831(int arg0) {
        field9769 = null;
        field9770 = null;
        if (arg0 == 12) {
            field9763 = null;
            field9771 = null;
            field9768 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method3832(String arg0, int arg1, String arg2, int arg3) {
        if (arg1 < 41) {
            method3832(null, -37, null, 73);
        }
        class222.field2906 = arg3;
        class57.field769 = 2;
        field9762++;
        class540.method2866(false, arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V")
    public class700(int arg0) {
        this.field9761 = arg0;
    }
}
