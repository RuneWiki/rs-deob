import java.io.File;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class607 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lns;")
    public static class375 field8276 = new class375();

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[I")
    public static int[] field8280 = new int[25];

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field8279;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field8281;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public int field8275;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Ljava/lang/String;")
    public String field8278;

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
        field8279 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field8281 = var3.toLowerCase();
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

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 3)
    public final Socket method3376(int arg0) throws IOException {
        if (arg0 != 25) {
            field8279 = null;
        }
        field8277++;
        return new Socket(this.field8278, this.field8275);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 18)
    public static void method3377(boolean arg0) {
        if (!arg0) {
            field8276 = null;
        }
        field8279 = null;
        field8281 = null;
        field8280 = null;
        field8276 = null;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method757(int arg0) throws IOException;
}
