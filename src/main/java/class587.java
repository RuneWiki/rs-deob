import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class587 {

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lsea;")
    public static class648 field8255;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method3336(byte arg0) {
        field8255 = null;
        if (arg0 != -18) {
            method3337(null, 64, 74);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public static final boolean method3337(String arg0, int arg1, int arg2) {
        field8256++;
        if (arg1 != 50000) {
            method3337(null, -7, 2);
        }
        if (class543.field7374.field1456) {
            class651.field9040 = new class171();
            class651.field9040.field2472 = arg0;
            class651.field9040.field2475 = arg2;
            if (class603.field8404 != class164.field2358) {
                class651.field9040.field2479 = class651.field9040.field2475 + 50000;
                class651.field9040.field2464 = class651.field9040.field2475 + 40000;
            }
            if (arg2 < class362.field4777.length && class362.field4777[arg2] != null) {
                class603.field8399 = class362.field4777[arg2].field3535;
            }
            return true;
        }
        String var3 = "";
        if (class603.field8404 != class164.field2358) {
            var3 = ":" + (arg2 + 7000);
        }
        String var4 = "";
        if (class400.field5614 != null) {
            var4 = "/p=" + class400.field5614;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class697.field9900 + "/a=" + class254.field3462 + var4 + "/j" + (class123.field1686 ? "1" : "0") + ",o" + (class652.field9067 ? "1" : "0") + ",a2";
        try {
            class647.field8937.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }
}
