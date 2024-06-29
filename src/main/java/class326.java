import java.awt.Font;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class326 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field4829;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 9)
    public static void method2040(byte arg0) {
        if (arg0 == 74) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Luf;IILjava/lang/String;)Lbca;", line = 23)
    public static final class286 method2041(class353 arg0, int arg1, int arg2, String arg3) {
        field4830++;
        if (arg1 != -8346) {
            field4829 = null;
        }
        if (arg2 == 0) {
            return arg0.method2181(arg3, arg1 + 8470);
        } else if (arg2 == 1) {
            try {
                class222.method1462(arg0.field5129, "openjs", true, new Object[] { (new URL(arg0.field5129.getCodeBase(), arg3)).toString() });
                class286 var4 = new class286();
                var4.field4208 = 1;
                return var4;
            } catch (Throwable var10) {
                class286 var5 = new class286();
                var5.field4208 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg0.field5129.getAppletContext().showDocument(new URL(arg0.field5129.getCodeBase(), arg3), "_blank");
                class286 var6 = new class286();
                var6.field4208 = 1;
                return var6;
            } catch (Exception var11) {
                class286 var7 = new class286();
                var7.field4208 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class222.method1460(false, "loggedout", arg0.field5129);
            } catch (Throwable var13) {
            }
            try {
                arg0.field5129.getAppletContext().showDocument(new URL(arg0.field5129.getCodeBase(), arg3), "_top");
                class286 var8 = new class286();
                var8.field4208 = 1;
                return var8;
            } catch (Exception var12) {
                class286 var9 = new class286();
                var9.field4208 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
