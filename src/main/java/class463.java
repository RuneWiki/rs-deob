import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class463 implements class264 {

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "Lmea;")
    public class395 field6912;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    public int field6923;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public int field6909;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public int field6917;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "Lja;")
    public class254 field6922;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    public int field6916;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "Z")
    public boolean field6914;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public int field6911;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public int field6910;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public int field6918;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "Lor;")
    public static class594 field6919 = new class594();

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "[[[I")
    public static int[][][] field6924;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILjava/lang/String;I)Z", line = 6)
    public static final boolean method2895(int arg0, String arg1, int arg2) {
        field6921++;
        if (arg2 != -21117) {
            field6919 = null;
        }
        if (class402.field6207.field7655) {
            class221.field3591 = new class470();
            class221.field3591.field6959 = arg1;
            class221.field3591.field6971 = arg0;
            if (class660.field9192 != class182.field3060) {
                class221.field3591.field6966 = class221.field3591.field6971 + 50000;
                class221.field3591.field6960 = class221.field3591.field6971 + 40000;
            }
            if (arg0 < class231.field3683.length && class231.field3683[arg0] != null) {
                class375.field5855 = class231.field3683[arg0].field9193;
            }
            return true;
        }
        String var3 = "";
        if (class660.field9192 != class182.field3060) {
            var3 = ":" + (arg0 + 7000);
        }
        String var4 = "";
        if (class98.field1592 != null) {
            var4 = "/p=" + class98.field1592;
        }
        String var5 = "http://" + arg1 + var3 + "/l=" + class135.field2206 + "/a=" + class611.field8698 + var4 + "/j" + (class184.field3108 ? "1" : "0") + ",o" + (class615.field8740 ? "1" : "0") + ",a2";
        try {
            class157.field2684.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)Leu;", line = 58)
    public final class444 method1247(int arg0) {
        if (arg0 != 3848) {
            this.method1247(-4);
        }
        field6920++;
        return class673.field9482;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(ILja;Lmea;IIIIIIIZ)V", line = 79)
    public class463(int arg0, class254 arg1, class395 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field6912 = arg2;
        this.field6913 = arg7;
        this.field6923 = arg9;
        this.field6909 = arg6;
        this.field6917 = arg5;
        this.field6922 = arg1;
        this.field6916 = arg8;
        this.field6914 = arg10;
        this.field6911 = arg3;
        this.field6910 = arg4;
        this.field6918 = arg0;
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V", line = 98)
    public static void method2896(int arg0) {
        if (arg0 != 0) {
            method2895(-30, null, 79);
        }
        field6919 = null;
        field6924 = null;
    }
}
