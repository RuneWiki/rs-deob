import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class73 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[Lac;")
    private class135[] field1033;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1034 = 0;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field1037 = -1;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field1040 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Ldl;")
    public static class123 field1039;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static final void method497(byte arg0) {
        if (class52.field715 == 2) {
            if (class134.field1947 == class106.field1634 && class236.field3780 == class178.field2781) {
                class52.field715 = 0;
                if (class129.field1890 && class123.field1844[81] && class245.field3920 > 2) {
                    class65.method446(2, class245.field3920 - 2);
                } else {
                    class65.method446(2, class245.field3920 - 1);
                }
            }
        } else if (class59.field836 == class106.field1634 && class236.field3780 == class145.field2140) {
            class52.field715 = 0;
            if (class129.field1890 && class123.field1844[81] && class245.field3920 > 2) {
                class65.method446(2, class245.field3920 - 2);
            } else {
                class65.method446(2, class245.field3920 - 1);
            }
        } else {
            class52.field715 = 2;
            class134.field1947 = class59.field836;
            class178.field2781 = class145.field2140;
        }
        field1032++;
        if (arg0 != 38) {
            method501(-71, 102);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method498(int arg0) {
        if (arg0 != 11286) {
            field1034 = 37;
        }
        field1039 = null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
    public class73(int arg0) {
        this.field1033 = new class135[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class135 var3 = this.field1033[var2] = new class135();
            var3.field1955 = var3;
            var3.field1959 = var3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
    public static final void method499(byte arg0, int arg1) {
        field1035++;
        if (arg0 == 100 && arg1 >= 0 && arg1 < class224.field3628.length) {
            class224.field3628[arg1] = !class224.field3628[arg1];
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method500(int arg0, String[] arg1) {
        field1036++;
        String[] var2 = new String[5];
        if (arg0 != 81) {
            method500(53, (String[]) null);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
    public static final int method501(int arg0, int arg1) {
        if (arg1 != 21717) {
            method501(-113, -42);
        }
        field1038++;
        return arg0 & 0x7F;
    }
}
