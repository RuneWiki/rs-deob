import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class519 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    private int field7224;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7225;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7220;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field7222;

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
        field7225 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field7220 = var3.toLowerCase();
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

    @OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field7221++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I", line = 16)
    public static int method3018(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 25)
    public static void method3019(int arg0) {
        field7225 = null;
        field7220 = null;
        if (arg0 > -12) {
            method3019(-1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I", line = 36)
    public final int method3020(byte arg0) {
        field7222++;
        return arg0 == -13 ? this.field7224 : 14;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V", line = 47)
    public class519(int arg0, int arg1) {
        this.field7223 = arg1;
        this.field7224 = arg0;
    }
}
