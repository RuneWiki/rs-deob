import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class222 {

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "[Lpm;")
    public class133[] field2718 = null;

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "Lgba;")
    public class392 field2722 = null;

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "Lgba;")
    public class392 field2719 = null;

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "Lgba;")
    public class392 field2721 = null;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "[Lpm;")
    public class133[] field2715 = null;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "Z")
    public boolean field2714;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "Z")
    public static boolean field2717 = false;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field2716 = 0;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1309(String arg0, int arg1) {
        field2720++;
        class92.field1288 = arg0;
        if (class422.field5308 == null) {
            return;
        }
        try {
            String var2 = class422.field5308.getParameter("cookieprefix");
            if (arg1 != 7628) {
                field2717 = true;
            }
            String var3 = class422.field5308.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class6.method50(class571.method3150(105) + 94608000000L, (byte) 117) + "; Max-Age=" + 94608000L;
            }
            class371.method2026("document.cookie=\"" + var5 + "\"", (byte) -69, class422.field5308);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lqj;)V")
    public class222(class548 arg0) {
        this.field2714 = arg0.field7598;
        class139.method797(false, arg0);
        if (this.field2714) {
            byte[] var6 = class542.method2924(-7374, false, class569.field7969);
            this.field2722 = new class392(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class542.method2924(-7374, false, class188.field2360);
            this.field2719 = new class392(arg0, 6410, 128, 128, 16, var7, 6410);
            class619 var8 = arg0.field7476;
            if (var8.method3401((byte) -125)) {
                byte[] var9 = class542.method2924(-7374, false, class373.field4704);
                this.field2721 = new class392(arg0, 6408, 128, 128, 16);
                class392 var10 = new class392(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3402(this.field2721, var10, 2.0F, (byte) -113)) {
                    this.field2721.method3394(9566);
                } else {
                    this.field2721.method3392((byte) -9);
                    this.field2721 = null;
                }
                var10.method3392((byte) -67);
            }
        } else {
            this.field2718 = new class133[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class242.method1447(32768, (byte) 121, var2 * 128 * 128 * 2, class569.field7969);
                this.field2718[var2] = new class133(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field2715 = new class133[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class242.method1447(32768, (byte) 121, var3 * 2 * 128 * 128, class188.field2360);
                this.field2715[var3] = new class133(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
