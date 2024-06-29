import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class80 {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1119 = "Started 3d Library";

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "[C")
    public static char[] field1120 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field1124 = 20;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field1125 = 128;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Llb;")
    public static class211 field1118;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Ljava/lang/String;")
    public String field1116;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method629(int arg0) {
        field1121++;
        if (arg0 != 13751) {
            method630(false);
        }
        try {
            if (class41.field616 == 1) {
                int var1 = class213.field3383.method847(true);
                if (var1 > 0 && class213.field3383.method858(88)) {
                    int var2 = var1 - class178.field2660;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class213.field3383.method841(-6260, var2);
                    return;
                }
                class213.field3383.method850(-10531);
                class213.field3383.method852(-1);
                class308.field4801 = null;
                class235.field3603 = null;
                if (class276.field4244 == null) {
                    class41.field616 = 0;
                } else {
                    class41.field616 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class213.field3383.method850(-10531);
            class41.field616 = 0;
            class276.field4244 = null;
            class235.field3603 = null;
            class308.field4801 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 51)
    public static void method630(boolean arg0) {
        if (arg0) {
            field1125 = 63;
        }
        field1118 = null;
        field1119 = null;
        field1120 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 83)
    public static final void method631(String arg0, boolean arg1, byte arg2) {
        if (arg2 != 118) {
            return;
        }
        field1117++;
        if (!arg1) {
            try {
                class262.field3908.getAppletContext().showDocument(new URL(class262.field3908.getCodeBase(), arg0), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class36.field534 && class302.field4729) {
            try {
                class226.method1609(-111, "openjs", new Object[] { (new URL(class262.field3908.getCodeBase(), arg0)).toString() }, class301.field4715.field285);
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class262.field3908.getAppletContext().showDocument(new URL(class262.field3908.getCodeBase(), arg0), "_blank");
        } catch (Exception var6) {
        }
    }
}
