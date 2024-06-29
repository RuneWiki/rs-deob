import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class72 extends class376 {

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Z")
    public boolean field1107;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1108 = "Loaded world list data";

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Z")
    public static boolean field1114 = true;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V")
    public static void method483(byte arg0) {
        field1108 = null;
        if (arg0 != -75) {
            field1108 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)Lkr;")
    public static final class445 method484(byte arg0) {
        field1110++;
        if (arg0 < 32) {
            return null;
        }
        try {
            return (class445) Class.forName("oq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Z")
    public static final boolean method485(byte arg0, int arg1) {
        field1109++;
        class31 var2 = class430.method2708(arg1, 1);
        if (var2 == null) {
            return false;
        } else if (class351.field4889 == 3) {
            String var3 = "";
            if (class67.field1043 != 0) {
                var3 = ":" + (var2.field481 + 7000);
            }
            if (arg0 != 91) {
                return false;
            }
            String var4 = "";
            if (class441.field6390 != null) {
                var4 = "/p=" + class441.field6390;
            }
            String var5 = "http://" + var2.field474 + var3 + "/l=" + class40.field608 + "/a=" + class237.field3231 + var4 + "/j" + (class318.field4370 ? "1" : "0") + ",o" + (class188.field2614 ? "1" : "0") + ",a2";
            try {
                class331.field4489.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class7.field115 = var2.field474;
            class393.field5755 = var2.field481;
            if (class67.field1043 != 0) {
                class276.field3748 = class393.field5755 + 40000;
                class281.field3863 = class393.field5755 + 50000;
                class254.field3489 = class276.field3748;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIIIIZ)V")
    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1115 = arg1;
        this.field1113 = arg3;
        this.field1112 = arg0;
        this.field1111 = arg2;
        this.field1107 = arg5;
        this.field1105 = arg4;
    }
}
