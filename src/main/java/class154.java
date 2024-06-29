import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class154 {

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2206 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!re", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2207 = null;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Laj;")
    public static class210 field2202;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
    public static int[] field2201;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 5)
    public static void method1104(byte arg0) {
        field2202 = null;
        field2206 = null;
        if (arg0 <= 9) {
            field2207 = (String[]) null;
        }
        field2207 = null;
        field2201 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BC)C", line = 25)
    public static final char method1105(byte arg0, char arg1) {
        field2204++;
        if (arg0 != -36) {
            method1104((byte) -61);
        }
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 60)
    public static final void method1106(int arg0) {
        field2205++;
        if (class126.field1834) {
            return;
        }
        class126.field1834 = true;
        if (class274.field4156) {
            class36.field535 = (float) ((int) class36.field535 + 191 & 0xFFFFFF80);
        } else {
            class257.field3844 += (24.0F - class257.field3844) / 2.0F;
        }
        class71.field1010 = true;
        if (arg0 != 159) {
            field2202 = (class210) null;
        }
    }
}
