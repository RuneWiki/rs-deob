import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class24 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Z")
    public static boolean field239 = false;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lfi;")
    public static class331 field241 = new class331(4);

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field243 = -1;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "J")
    public static long field244 = 0L;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lam;IZLjava/lang/String;)Lep;")
    public static final class241 method152(class378 arg0, int arg1, boolean arg2, String arg3) {
        field240++;
        if (!arg2) {
            field244 = 71L;
        }
        if (arg1 == 0) {
            return arg0.method2388(arg3, 0);
        } else if (arg1 == 1) {
            try {
                class250.method1567("openjs", (byte) -81, new Object[] { (new URL(arg0.field5559.getCodeBase(), arg3)).toString() }, arg0.field5559);
                class241 var4 = new class241();
                var4.field3268 = 1;
                return var4;
            } catch (Throwable var10) {
                class241 var5 = new class241();
                var5.field3268 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                arg0.field5559.getAppletContext().showDocument(new URL(arg0.field5559.getCodeBase(), arg3), "_blank");
                class241 var6 = new class241();
                var6.field3268 = 1;
                return var6;
            } catch (Exception var11) {
                class241 var7 = new class241();
                var7.field3268 = 2;
                return var7;
            }
        } else if (arg1 == 3) {
            try {
                class250.method1569("loggedout", arg0.field5559, 18050);
            } catch (Throwable var13) {
            }
            try {
                arg0.field5559.getAppletContext().showDocument(new URL(arg0.field5559.getCodeBase(), arg3), "_top");
                class241 var8 = new class241();
                var8.field3268 = 1;
                return var8;
            } catch (Exception var12) {
                class241 var9 = new class241();
                var9.field3268 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public static void method153(boolean arg0) {
        field241 = null;
        if (!arg0) {
            method153(false);
        }
    }
}
