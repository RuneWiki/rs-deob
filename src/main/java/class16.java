import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 {

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Lpa;")
    private class387 field267 = new class387(64);

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "Lcb;")
    private class544 field266;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "Lcb;")
    public class544 field264;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "Lve;")
    public static class527 field269 = new class527(3, 2);

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Ljava/lang/String;")
    public static String field272;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Ljava/lang/String;")
    public static String field273;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)V")
    public final void method138(boolean arg0, int arg1) {
        field268++;
        if (!arg0) {
            method142(-86);
        }
        class387 var3 = this.field267;
        synchronized (this.field267) {
            this.field267.method2366(arg1, 118);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public final void method139(byte arg0) {
        class387 var2 = this.field267;
        synchronized (this.field267) {
            this.field267.method2364(1);
        }
        if (arg0 < 13) {
            field269 = null;
        }
        field265++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    public final void method140(boolean arg0) {
        class387 var2 = this.field267;
        synchronized (this.field267) {
            if (!arg0) {
                this.field264 = null;
            }
            this.field267.method2369(-1);
        }
        field271++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)Lvb;")
    public final class205 method141(byte arg0, int arg1) {
        field270++;
        if (arg0 != 14) {
            this.method139((byte) -105);
        }
        class387 var3 = this.field267;
        class205 var4;
        synchronized (this.field267) {
            var4 = (class205) this.field267.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field266;
        byte[] var6;
        synchronized (this.field266) {
            var6 = this.field266.method3150(arg1, 117, 3);
        }
        class205 var7 = new class205();
        var7.field3003 = this;
        if (var6 != null) {
            var7.method1478(new class120(var6), -120);
        }
        class387 var8 = this.field267;
        synchronized (this.field267) {
            this.field267.method2362(var7, arg0 - 14, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static void method142(int arg0) {
        if (arg0 < 32) {
            field273 = null;
        }
        field273 = null;
        field272 = null;
        field269 = null;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Liv;ILcb;Lcb;)V")
    public class16(class106 arg0, int arg1, class544 arg2, class544 arg3) {
        this.field266 = arg2;
        this.field264 = arg3;
        this.field266.method3147(3, -103);
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
        field272 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field273 = var3.toLowerCase();
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
