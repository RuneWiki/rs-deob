import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class291 extends RuntimeException {

    @OriginalMember(owner = "client!es", name = "a", descriptor = "Ljava/lang/String;")
    public String field4164;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4171;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "[C")
    public static char[] field4170 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!es", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4172 = "Loaded client variable data";

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Llm;")
    public static class347 field4169;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "[I")
    public static int[] field4168;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
    public static void method1980(byte arg0) {
        field4168 = null;
        field4170 = null;
        field4172 = null;
        int var1 = -100 / ((arg0 + 9) / 42);
        field4169 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIII)V")
    public static final void method1981(int arg0, int arg1, int arg2, int arg3) {
        if (class282.field4111 != null) {
            class282.field4111[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class291(Throwable arg0, String arg1) {
        this.field4164 = arg1;
        this.field4171 = arg0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IC)C")
    public static final char method1982(int arg0, char arg1) {
        if (arg0 != -413) {
            field4170 = null;
        }
        field4167++;
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
}
