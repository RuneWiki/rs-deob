import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class436 {

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Lpca;")
    private class714 field6190 = new class714(64);

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Lfp;")
    private class323 field6186;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public int field6188;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6191;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6187;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Z")
    public static boolean field6192;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
    public static void method2640(byte arg0) {
        if (arg0 < 37) {
            method2640((byte) 0);
        }
        field6191 = null;
        field6187 = null;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lsaa;ILfp;)V")
    public class436(class326 arg0, int arg1, class323 arg2) {
        this.field6186 = arg2;
        this.field6188 = this.field6186.method2084(19, 0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IZ)Lgt;")
    public final class455 method2641(int arg0, boolean arg1) {
        field6189++;
        class714 var3 = this.field6190;
        class455 var4;
        synchronized (this.field6190) {
            var4 = (class455) this.field6190.method4022((long) arg0, (byte) -86);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field6186;
        byte[] var6;
        synchronized (this.field6186) {
            var6 = this.field6186.method2100(arg0, (byte) 112, 19);
        }
        class455 var7 = new class455();
        if (arg1) {
            return null;
        }
        if (var6 != null) {
            var7.method2703(60, new class675(var6));
        }
        class714 var8 = this.field6190;
        synchronized (this.field6190) {
            this.field6190.method4018((byte) 125, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZIZ)V")
    public static final void method2642(boolean arg0, int arg1, boolean arg2) {
        if (!arg0) {
            field6192 = true;
        }
        if (arg2) {
            class519 var3 = class357.method2293(class427.field5994, class402.field5704, (byte) 119);
            var3.field7384.method3745(-121, arg1);
            class151.method1027(var3, -57);
        } else {
            class241.method1539(class466.field6604, arg1, -1);
        }
        field6185++;
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
        field6191 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field6187 = var3.toLowerCase();
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
        field6192 = false;
    }
}
