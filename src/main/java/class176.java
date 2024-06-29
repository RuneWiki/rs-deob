import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class176 extends OutputStream {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Lmb;")
    public static class96 field3057 = class243.method1708(" )2> ", (byte) 123);

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Z")
    public static boolean field3061 = false;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Lmb;")
    public static class96 field3065 = class243.method1708("(Z", (byte) 98);

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lmb;")
    public static class96 field3058 = class243.method1708("http:)4)4", (byte) 116);

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[Z")
    public static boolean[] field3059 = new boolean[100];

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Lmb;")
    public static class96 field3067 = class243.method1708("gr-Un:", (byte) 117);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "[I")
    public static int[] field3060;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[I")
    public static int[] field3064;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)I")
    public static final int method1257(byte arg0, int arg1, int arg2) {
        if (arg0 <= 111) {
            field3064 = null;
        }
        int var3 = arg1 >>> 31;
        field3054++;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method1258(int arg0) {
        field3057 = null;
        field3058 = null;
        field3065 = null;
        field3060 = null;
        field3059 = null;
        field3064 = null;
        if (arg0 != -1384) {
            method1259(119);
        }
        field3067 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Lrf;")
    public static final class30 method1259(int arg0) {
        field3055++;
        int var1 = -52 % ((69 - arg0) / 57);
        class30 var2 = new class30(class249.field4309, class109.field2019, class241.field4187[0], field3064[0], class31.field490[0], class170.field2982[0], class217.field3724[0], class139.field2492);
        class192.method1344(0);
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
    public static final void method1260(int arg0, int arg1) {
        class43 var2 = class270.method1847(arg0, -10277, arg1);
        field3056++;
        var2.method339(true);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V")
    public static final void method1261(int arg0, int arg1) {
        field3062++;
        class43 var2 = class270.method1847(arg0, -10277, 12);
        if (arg1 != 18037) {
            field3068 = -59;
        }
        var2.method339(true);
    }

    @OriginalMember(owner = "client!bi", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3066++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Z")
    public static final boolean method1262(byte arg0, int arg1) {
        field3063++;
        if (arg0 >= -100) {
            method1258(-2);
        }
        return arg1 >= 48 && arg1 <= 57;
    }
}
