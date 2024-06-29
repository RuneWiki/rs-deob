import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class231 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "[I")
    public static int[] field3396 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lkn;")
    public static class530 field3398 = new class530("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method1428(int arg0) {
        if (arg0 != -2) {
            method1429(53, (byte) 108, null);
        }
        field3398 = null;
        field3396 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBLjava/lang/String;)Z")
    public static final boolean method1429(int arg0, byte arg1, String arg2) {
        field3395++;
        if (arg1 >= -32) {
            return true;
        } else if (class151.field2158 == 3) {
            String var3 = "";
            if (class293.field4292 != class257.field3825) {
                var3 = ":" + (arg0 + 7000);
            }
            String var4 = "";
            if (class284.field4166 != null) {
                var4 = "/p=" + class284.field4166;
            }
            String var5 = "http://" + arg2 + var3 + "/l=" + class149.field1979 + "/a=" + class496.field7034 + var4 + "/j" + (class190.field2712 ? "1" : "0") + ",o" + (class522.field7685 ? "1" : "0") + ",a2";
            try {
                class534.field7831.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class426.field5989 = new class418();
            class426.field5989.field5885 = arg0;
            class426.field5989.field5883 = arg2;
            if (class293.field4292 != class257.field3825) {
                class426.field5989.field5887 = class426.field5989.field5885 + 40000;
                class426.field5989.field5889 = class426.field5989.field5885 + 50000;
            }
            return true;
        }
    }
}
