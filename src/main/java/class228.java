import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class228 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lpm;")
    public class546 field2940 = new class546();

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Z")
    public boolean field2945 = false;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lrr;")
    public static class337 field2941 = null;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lra;")
    public static class98 field2942 = new class98();

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
    public static int[] field2948 = new int[2];

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
    public static int[] field2949 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "[C")
    private static char[] field2950 = new char[64];

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Lrr;")
    public static class337 field2952;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Luc;")
    public static class27 field2951;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field2947;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field2950[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field2950[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field2950[var2] = (char) (var2 + 48 - 52);
        }
        field2950[62] = '+';
        field2950[63] = '/';
        field2952 = null;
        field2951 = new class27(9, 2);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V", line = 9)
    public static final void method1375(int arg0, int arg1, int arg2) {
        if (arg1 > -20) {
            field2948 = null;
        }
        field2944++;
        class243 var3 = class546.method2926(arg0, 7, true);
        var3.method1457(49);
        var3.field3132 = arg2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1376(int arg0) {
        field2943++;
        if (arg0 != 19522) {
            return;
        }
        if (class185.field2182 != null) {
            class185.field2182.method2427(-15766);
        }
        while (true) {
            try {
                class455.field5683.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 51)
    public static void method1377(byte arg0) {
        field2951 = null;
        field2948 = null;
        field2941 = null;
        field2942 = null;
        if (arg0 != 120) {
            field2951 = null;
        }
        field2952 = null;
        field2949 = null;
        field2950 = null;
    }
}
