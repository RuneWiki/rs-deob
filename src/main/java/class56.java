import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class56 {

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lqk;")
    public static class207 field1040 = class24.method212(255, "Annuler");

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lqk;")
    private static class207 field1048 = class24.method212(255, "M");

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field1042 = 0;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lqk;")
    public static class207 field1046 = field1048;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lqk;")
    public static class207 field1047 = field1048;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "[I")
    public static int[] field1051 = new int[5];

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lbf;")
    public static class199 field1041 = new class199(100);

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lpk;")
    public static class99 field1050;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static final void method420(int arg0) {
        class65.field1179 = 0;
        field1045++;
        class160.field2838 = arg0;
        class36.method260(false);
        class57.method425(false);
        class156.method1145(23680);
        class279.method1895((byte) -92);
        for (int var1 = 0; var1 < class160.field2838; var1++) {
            int var3 = class11.field150[var1];
            if (class160.field2844 != class169.field2953[var3].field5034) {
                if (class169.field2953[var3].field219 > 0) {
                    class149.method1036(class169.field2953[var3], arg0 ^ 0x7C);
                }
                class169.field2953[var3] = null;
            }
        }
        if (class245.field4437 != class17.field262.field2593) {
            throw new RuntimeException("gpp1 pos:" + class17.field262.field2593 + " psize:" + class245.field4437);
        }
        for (int var2 = 0; var2 < class31.field629; var2++) {
            if (class169.field2953[class10.field149[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class31.field629);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method421(int arg0) {
        field1047 = null;
        field1046 = null;
        int var1 = -126 % ((-arg0 - 42) / 46);
        field1050 = null;
        field1041 = null;
        field1048 = null;
        field1051 = null;
        field1040 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class56() {
        new class208();
    }
}
