import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class608 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Z")
    public static boolean field8556 = false;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[C")
    private static char[] field8558 = new char[64];

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Ljava/applet/Applet;")
    public static Applet field8561;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    public static int[] field8557;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field8558[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field8558[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field8558[var2] = (char) (var2 + 48 - 52);
        }
        field8558[62] = '+';
        field8558[63] = '/';
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)I", line = 9)
    public static final int method3411(byte arg0, int arg1) {
        field8559++;
        int var2 = 0;
        if (arg0 > -87) {
            field8558 = null;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 56)
    public static final void method3412(int arg0) {
        class689.field9707 = -1;
        field8560++;
        class460.field6579 = 1;
        long var1 = 0L;
        if (class87.field1469 == null) {
            class516.method2951((byte) 97, 35);
            return;
        }
        class695 var3 = new class695(class353.method2163(class114.method894(class87.field1469, 0), 0));
        long var4 = var3.method3854((byte) -12);
        class609.field8565 = var3.method3854((byte) -12);
        class296.method1912(true, class477.method2797(var4, 12095), "", false);
        if (arg0 != 8) {
            method3412(119);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 92)
    public static void method3413(int arg0) {
        field8558 = null;
        if (arg0 != 1) {
            method3411((byte) 92, -107);
        }
        field8561 = null;
        field8557 = null;
    }
}
