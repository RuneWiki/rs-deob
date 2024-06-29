import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "c", descriptor = "[[I")
    public static int[][] field3 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!us", name = "e", descriptor = "J")
    public static long field5 = -1L;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "Lhf;")
    public static class363 field4 = new class363();

    @OriginalMember(owner = "client!us", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)V")
    public static final void method1(int arg0, byte arg1) {
        field1++;
        class233 var2 = class7.method44(arg0, 6, arg1 ^ 0x31);
        if (arg1 == -50) {
            var2.method1423(0);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public static void method2(int arg0) {
        if (arg0 != 10) {
            field6 = null;
        }
        field4 = null;
        field6 = null;
        field3 = null;
        field7 = null;
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
        field7 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field6 = var3.toLowerCase();
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
}
