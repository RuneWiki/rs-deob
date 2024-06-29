import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field607 = -1;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lik;")
    public static class267 field608 = new class267(64);

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Z")
    public static boolean field610 = false;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[I")
    public static int[] field612 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Ljava/lang/String;")
    public static String field611 = "Loading...";

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method275(byte arg0, boolean arg1, String arg2) {
        field609++;
        if (arg0 <= 47) {
            field610 = false;
        }
        if (arg1) {
            try {
                client.field2385.getAppletContext().showDocument(new URL(client.field2385.getCodeBase(), arg2), "_blank");
            } catch (Exception var3) {
            }
            return;
        }
        try {
            class73.method498(class209.field3147.field150, "loggedout", (byte) 124);
        } catch (Throwable var5) {
        }
        try {
            client.field2385.getAppletContext().showDocument(new URL(client.field2385.getCodeBase(), arg2), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLjava/lang/String;I)I")
    public static final int method276(boolean arg0, String arg1, int arg2) {
        if (arg0) {
            field606++;
            return class162.method1002(arg1, true, arg2, false);
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method277(int arg0) {
        field611 = null;
        field608 = null;
        field612 = null;
        if (arg0 != 76) {
            method277(122);
        }
    }
}
