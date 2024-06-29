import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class42 {

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field805 = 0;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Z")
    public static boolean field806 = false;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lke;")
    public static class256 field803 = class316.method2202("Chargement de la liste des serveurs", 27626);

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field809 = 0;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lng;")
    public static class138 field808;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 4)
    public static final void method368(int arg0) {
        field804++;
        if (class4.field53.toLowerCase().indexOf("microsoft") == -1) {
            class289.field4991[44] = 71;
            class289.field4991[47] = 73;
            if (class4.field73 == null) {
                class289.field4991[222] = 59;
                class289.field4991[192] = 58;
            } else {
                class289.field4991[222] = 58;
                class289.field4991[192] = 28;
                class289.field4991[520] = 59;
            }
            class289.field4991[91] = 42;
            class289.field4991[45] = 26;
            class289.field4991[93] = 43;
            class289.field4991[61] = 27;
            class289.field4991[92] = 74;
            class289.field4991[59] = 57;
            class289.field4991[46] = 72;
        } else {
            class289.field4991[219] = 42;
            class289.field4991[186] = 57;
            class289.field4991[192] = 58;
            class289.field4991[221] = 43;
            class289.field4991[222] = 59;
            class289.field4991[187] = 27;
            class289.field4991[220] = 74;
            class289.field4991[188] = 71;
            class289.field4991[191] = 73;
            class289.field4991[189] = 26;
            class289.field4991[223] = 28;
            class289.field4991[190] = 72;
        }
        if (arg0 != 57) {
            field809 = 4;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z", line = 55)
    public static final boolean method369(int arg0, int arg1) {
        field807++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            if (arg0 != 1007) {
                method368(-41);
            }
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 95)
    public static void method370(int arg0) {
        if (arg0 != 192) {
            field803 = (class256) null;
        }
        field803 = null;
        field808 = null;
    }
}
