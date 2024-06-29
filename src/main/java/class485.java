import java.applet.Applet;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class485 extends class666 {

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    private int field7066 = 0;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    private int field7064 = 4096;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field7061 = new String[200];

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field7063 = -1;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Lco;")
    public static class106 field7071;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "Ljava/applet/Applet;")
    public static Applet field7068;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "[Z")
    public static boolean[] field7070;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public static final boolean method2815(String arg0, int arg1, int arg2) {
        ++field7065;
        if (class623.field8837.field7924) {
            class277.field3494 = new class305();
            class277.field3494.field3992 = arg0;
            class277.field3494.field3986 = arg2;
            if (class73.field771 != class553.field7884) {
                class277.field3494.field3991 = class277.field3494.field3986 + 40000;
                class277.field3494.field3989 = class277.field3494.field3986 + 50000;
            }
            if (arg2 < class520.field7448.length && class520.field7448[arg2] != null) {
                class250.field3228 = class520.field7448[arg2].field7626;
            }
            return true;
        } else {
            if (arg1 != -32012) {
                method2815((String) null, 124, 100);
            }
            String var3 = "";
            if (class73.field771 != class553.field7884) {
                var3 = ":" + (arg2 - -7000);
            }
            String var4 = "";
            if (class68.field738 != null) {
                var4 = "/p=" + class68.field738;
            }
            String var5 = "http://" + arg0 + var3 + "/l=" + class226.field2899 + "/a=" + class559.field7965 + var4 + "/j" + (!class140.field1599 ? "0" : "1") + ",o" + (!class373.field4842 ? "0" : "1") + ",a2";
            try {
                class239.field3025.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class485() {
        super(1, true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field7062;
        int[] var3 = super.field9466.method1811(arg1, 6);
        if (super.field9466.field4172) {
            int[] var4 = this.method3739(0, -126, arg1);
            for (int var5 = 0; class501.field7222 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field7066 <= var6 && ~this.field7064 <= ~var6 ? 4096 : 0;
            }
        }
        return arg0 > -21 ? null : var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        ++field7069;
        if (!arg2) {
            field7067 = 82;
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field7064 = arg1.method2574(-1758460248);
            }
        } else {
            this.field7066 = arg1.method2574(-1758460248);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method2816(byte arg0) {
        field7068 = null;
        field7070 = null;
        field7061 = null;
        field7071 = null;
        int var1 = 4 % ((-36 - arg0) / 56);
    }
}
