import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class563 extends class739 {

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field8153 = 0;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "[I")
    public static int[] field8152 = new int[4096];

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Ljava/lang/String;")
    public static String field8155;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Ljava/lang/String;")
    public static String field8154;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Liea;")
    public static class11 field8157;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field8155 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field8154 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)[I", line = 3)
    public final int[] method445(boolean arg0, int arg1) {
        field8156++;
        return arg0 ? null : class604.field8580;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 14)
    public class563() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 18)
    public static void method3367(byte arg0) {
        field8152 = null;
        field8155 = null;
        field8157 = null;
        if (arg0 != 109) {
            method3367((byte) -111);
        }
        field8154 = null;
    }
}
