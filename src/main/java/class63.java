import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class63 {

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1053 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Z")
    public static boolean field1051 = false;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lda;")
    public static class275 field1056 = class255.method1672(127, "(U(Y");

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lda;")
    public static class275 field1058 = class255.method1672(110, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method434(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class145.field2546 == 2) {
            if (class208.field3525 == class181.field3101 && class174.field3016 == class161.field2826) {
                class145.field2546 = 0;
                class67.method450(-111, class52.field863 - 1);
            }
        } else if (class181.field3101 == class162.field2834 && class185.field3174 == class161.field2826) {
            class145.field2546 = 0;
            class67.method450(-126, class52.field863 - 1);
        } else {
            class145.field2546 = 2;
            class174.field3016 = class185.field3174;
            class208.field3525 = class162.field2834;
        }
        field1052++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([BI)Lrh;")
    public static final class21 method435(byte[] arg0, int arg1) {
        field1055++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == -1) {
            class260 var2 = new class260(arg0, class114.field2010, class246.field4357, class152.field2662, class32.field480, class67.field1101);
            class134.method978(arg1 + 88);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method436(byte arg0) {
        field1058 = null;
        field1056 = null;
        if (arg0 != -121) {
            field1054 = -78;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILda;)V")
    public static final void method437(int arg0, int arg1, class275 arg2) {
        field1057++;
        if (arg0 >= -19) {
            field1056 = null;
        }
        class184 var3 = class147.method1044(2, (byte) 58, arg1);
        var3.method1226((byte) 26);
        var3.field3146 = arg2;
    }
}
