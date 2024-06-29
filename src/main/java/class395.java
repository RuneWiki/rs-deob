import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class395 {

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public static int field5741 = 0;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field5743 = 0;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "Lqu;")
    public static class364 field5740 = new class364(38, 8);

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILjava/net/Socket;I)Llda;")
    public static final class192 method2375(int arg0, Socket arg1, int arg2) throws IOException {
        field5745++;
        if (arg0 != -12523) {
            method2376(-71);
        }
        return new class345(arg1, arg2);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
    public static void method2376(int arg0) {
        if (arg0 == 0) {
            field5740 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILjava/lang/String;I)Z")
    public static final boolean method2377(int arg0, String arg1, int arg2) {
        field5744++;
        if (class353.field5140 != 3) {
            class536.field7933 = new class455();
            class536.field7933.field6633 = arg0;
            class536.field7933.field6630 = arg1;
            if (class643.field9339 != class582.field8561) {
                class536.field7933.field6627 = class536.field7933.field6633 + 40000;
                class536.field7933.field6631 = class536.field7933.field6633 + 50000;
            }
            if (arg0 < class626.field9173.length && class626.field9173[arg0] != null) {
                class83.field981 = class626.field9173[arg0].field5316;
            }
            return true;
        } else if (arg2 == -2) {
            String var3 = "";
            if (class643.field9339 != class582.field8561) {
                var3 = ":" + (arg0 + 7000);
            }
            String var4 = "";
            if (class311.field4583 != null) {
                var4 = "/p=" + class311.field4583;
            }
            String var5 = "http://" + arg1 + var3 + "/l=" + class77.field889 + "/a=" + class555.field8240 + var4 + "/j" + (class606.field8951 ? "1" : "0") + ",o" + (class187.field2854 ? "1" : "0") + ",a2";
            try {
                class621.field9076.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
    public static final void method2378(boolean arg0, int arg1) {
        field5742++;
        if (class545.field8138.length() == 0) {
            return;
        }
        class492.method2982("--> " + class545.field8138, (byte) 110);
        class77.method449(arg0, false, 118, class545.field8138);
        class393.field5722 = arg1;
        class545.field8138 = "";
        class538.field7973 = 0;
    }
}
