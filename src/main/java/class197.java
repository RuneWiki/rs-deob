import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class197 extends class44 {

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Lkb;")
    public static class93 field3835 = class76.method390("sl_button", 0);

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lkb;")
    public static class93 field3836 = class76.method390("(U1", 0);

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Lkb;")
    public static class93 field3834 = class76.method390(" zuerst von Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Lkb;")
    private static class93 field3839 = class76.method390("Checking for updates )2 ", 0);

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lkb;")
    public static class93 field3837 = field3839;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "Ljg;")
    public static class89 field3842;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "[[[B")
    public static byte[][][] field3841;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public static final void method1261(int arg0, int arg1) {
        field3844++;
        if (class24.field365 == 0) {
            class142.field2784.method986(16384, arg0);
        } else {
            class88.field1593 = arg0;
        }
        if (arg1 != 26138) {
            method1263((byte) 75);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I")
    public static final int method1262(int arg0, int arg1, int arg2) {
        field3843++;
        class36 var3 = (class36) client.field496.method616((long) arg2, -1);
        if (arg1 >= -47) {
            return -33;
        } else if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field594.length) {
            return var3.field594[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static void method1263(byte arg0) {
        field3842 = null;
        if (arg0 >= -95) {
            return;
        }
        field3839 = null;
        field3834 = null;
        field3836 = null;
        field3837 = null;
        field3841 = null;
        field3835 = null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class197() {
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
    public class197(int arg0) {
        this.field3840 = arg0;
    }
}
