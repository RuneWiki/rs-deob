import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class111 extends class145 {

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    private int field2024 = -32768;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "[[[I")
    public static int[][][] field2026 = new int[4][13][13];

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field2029 = 0;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
    public static int[] field2023;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[[[B")
    public static byte[][][] field2022;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()I")
    public final int method88() {
        field2027++;
        return this.field2024;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2033++;
        class30 var11 = class71.method472(this.field2032, (byte) -95).method1027(this.field2031, 1, 0, null);
        if (var11 != null) {
            var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2024 = var11.method88();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Li;Z)V")
    public static final void method766(class88 arg0, boolean arg1) {
        field2028++;
        class20.field319 = arg0;
        if (!arg1) {
            field2023 = null;
        }
        class201.method1380(-61);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)Li;")
    public static final class88 method767(int arg0, String arg1) {
        field2030++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class88 var3 = new class88();
        var3.field1660 = 0;
        var3.field1643 = var2;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field1660++] = var2[var4];
            }
        }
        if (arg0 <= 53) {
            return null;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method768(byte arg0) {
        field2022 = null;
        field2023 = null;
        field2026 = null;
        if (arg0 != -58) {
            field2022 = null;
        }
    }
}
