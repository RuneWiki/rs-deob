import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class202 extends class204 {

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[I")
    public static int[] field2836 = new int[8];

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lsi;")
    public static class769 field2835 = new class769();

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lv;")
    public static class165 field2841 = new class165();

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(ILfs;)V")
    public class202(int arg0, class607 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)I")
    public final int method1300(byte arg0) {
        ++field2839;
        return arg0 != -98 ? 77 : super.field2852;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public static void method1301(byte arg0) {
        field2836 = null;
        if (arg0 != -13) {
            method1302(47, false);
        }
        field2835 = null;
        field2841 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
    public static final void method1302(int arg0, boolean arg1) {
        if (!arg1) {
            ++field2834;
            class17 var2 = class245.method1634(1, (long) arg0, 1);
            var2.method69(13);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lfs;)V")
    public class202(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        ++field2838;
        super.field2852 = arg0;
        if (arg1 > -105) {
            this.method487(-74, -124);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        if (arg0 <= 83) {
            field2841 = null;
        }
        ++field2837;
        return 1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        ++field2832;
        int var3 = 45 / ((arg1 - -57) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            method1301((byte) 90);
        }
        ++field2833;
        if (~super.field2852 != -2 && super.field2852 != 0) {
            super.field2852 = this.method490((byte) 115);
        }
    }
}
