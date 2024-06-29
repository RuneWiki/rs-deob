import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class36 extends class260 {

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "Lfba;")
    public static class27 field476 = new class27(73, 8);

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "[I")
    public static int[] field481 = new int[13];

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!tfa", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field484 = new String[200];

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!tfa", name = "s", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lwia;")
    public static class791 field474;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        if (arg0 < 102) {
            this.method123(54);
        }
        ++field479;
    }

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "(II)Z")
    public static final boolean method284(int arg0, int arg1) {
        ++field482;
        if (arg0 < 74) {
            method286((class65) null, false);
        }
        return ~arg1 == -5 || arg1 == 8 || ~arg1 == -12;
    }

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "(I)V")
    public static void method285(int arg0) {
        field476 = null;
        field484 = null;
        if (arg0 != 8) {
            field476 = null;
        }
        field481 = null;
        field474 = null;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lha;Z)V")
    public static final void method286(class65 arg0, boolean arg1) {
        if (class463.field6530) {
            class662.method3778(-4, arg0);
        } else {
            class529.method3194(!arg1, arg0);
        }
        if (arg1) {
            method285(80);
        }
        ++field477;
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        ++field485;
        if (arg0 != -1) {
            this.method123(-67);
        }
        return 1;
    }

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "(I)I")
    public final int method287(int arg0) {
        ++field480;
        return arg0 >= -14 ? 39 : super.field3828;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        if (arg1 != 122) {
            field481 = null;
        }
        super.field3828 = arg0;
        ++field475;
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lgn;)V")
    public class36(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        ++field478;
        if (arg0 != 4377) {
            method286((class65) null, true);
        }
        return 0;
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(ILgn;)V")
    public class36(int arg0, class729 arg1) {
        super(arg0, arg1);
    }
}
