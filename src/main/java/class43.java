import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class43 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field757 = 0;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Ljava/lang/String;")
    public static String field758 = "Walk here";

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Ljava/lang/String;")
    public static String field762 = "Starting 3d Library";

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field761 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Lta;")
    public static class198 field763;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 7)
    public static void method349(byte arg0) {
        field758 = null;
        field763 = null;
        if (arg0 < 86) {
            method350((byte) -3, 116, 112, 46);
        }
        field762 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BIII)I", line = 19)
    public static final int method350(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field760++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg0 != 53) {
                field761 = -89;
            }
            return var4 == 2 ? 7 - arg2 : 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Lfk;", line = 45)
    public static final class45 method351(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4220; var4++) {
            class45 var5 = var3.field4217[var4];
            if ((var5.field776 >> 29 & 0x3L) == 2L && var5.field770 == arg1 && var5.field772 == arg2) {
                class125.method937(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Z", line = 95)
    public static final boolean method352(int arg0, byte arg1) {
        if (arg1 != 96) {
            method352(121, (byte) -32);
        }
        field759++;
        class120 var2 = class183.method1379(arg1 ^ 0xFFFFFFC6, arg0);
        if (var2 == null) {
            return false;
        } else if (class325.field5048 == 1 || class325.field5048 == 2 || class76.field1162 == 2) {
            class92.field1521 = var2.field1931;
            class193.field3072 = var2.field1932;
            if (class76.field1162 != 0) {
                class309.field4866 = class193.field3072 + 50000;
                class215.field3418 = class193.field3072 + 40000;
                class42.field754 = class215.field3418;
            }
            return true;
        } else {
            String var3 = "";
            if (class76.field1162 != 0) {
                var3 = ":" + (var2.field1932 + 7000);
            }
            String var4 = "";
            if (class232.field3677 != null) {
                var4 = "/p=" + class232.field3677;
            }
            String var5 = "http://" + var2.field1931 + var3 + "/l=" + class195.field3111 + "/a=" + class132.field2118 + var4 + "/j" + (class280.field4332 ? "1" : "0") + ",o" + (class289.field4412 ? "1" : "0") + ",a2,m" + (class177.field2778 ? "1" : "0");
            try {
                class114.field1866.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }
}
