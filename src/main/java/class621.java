import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class621 extends class239 {

    @OriginalMember(owner = "client!th", name = "M", descriptor = "Ljava/lang/String;")
    public static String field8734;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "Ljava/lang/String;")
    public static String field8728;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "Z")
    public static boolean field8736;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "Lfba;")
    public static class27 field8735;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Lfba;")
    public static class27 field8737;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "[B")
    private byte[] field8733;

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class621() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V")
    public static final void method3582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8732++;
        int var10 = arg2 + 1;
        class434.method2601(class746.field10330[arg2], arg0, arg5, (byte) -62, arg4);
        int var9 = arg1 - 1;
        class434.method2601(class746.field10330[arg1], arg0, arg5, (byte) -62, arg4);
        int var6 = -120 / ((-arg3 - 5) / 63);
        for (int var7 = var10; var7 <= var9; var7++) {
            int[] var8 = class746.field10330[var7];
            var8[arg0] = var8[arg4] = arg5;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3583(int arg0, int arg1, int arg2, int arg3) {
        field8731++;
        if (arg1 <= 13) {
            this.method1596((byte) -61, 80, (byte) 54);
        }
        this.field8733 = new byte[arg2 * arg3 * 2 * arg0];
        this.method158(arg0, 110, arg3, arg2);
        return this.field8733;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V")
    public static void method3584(boolean arg0) {
        field8735 = null;
        field8728 = null;
        field8737 = null;
        field8734 = null;
        if (arg0) {
            field8737 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIB)V")
    public final void method1596(byte arg0, int arg1, byte arg2) {
        field8729++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field8733[var10001] = (byte) (var5 * 3 >> 5);
        if (arg0 != 91) {
            method3582(-124, -100, -113, 5, -21, 30);
        }
        this.field8733[var6] = (byte) (var5 * 3 >> 5);
    }

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
        field8734 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field8728 = var3.toLowerCase();
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
        field8736 = false;
        field8735 = new class27(10, 7);
        field8737 = new class27(19, 2);
    }
}
