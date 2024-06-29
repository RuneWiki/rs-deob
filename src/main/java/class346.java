import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class346 {

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ll;")
    public static class66 field5504 = new class66(30);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lbi;")
    public static class145 field5506;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 6)
    public static void method2439(byte arg0) {
        field5506 = null;
        field5504 = null;
        if (arg0 != 22) {
            field5507 = 51;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lrn;I)V", line = 17)
    public static final void method2440(class18 arg0, int arg1) {
        if (arg1 == -101) {
            field5502++;
            class301.field4678 = arg0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)[B", line = 29)
    public static final synchronized byte[] method2441(boolean arg0, int arg1) {
        if (!arg0) {
            method2440((class18) null, 106);
        }
        field5501++;
        if (arg1 == 100 && class328.field5040 > 0) {
            byte[] var2 = class271.field4191[--class328.field5040];
            class271.field4191[class328.field5040] = null;
            return var2;
        } else if (arg1 == 5000 && class311.field4826 > 0) {
            byte[] var3 = class249.field3859[--class311.field4826];
            class249.field3859[class311.field4826] = null;
            return var3;
        } else if (arg1 == 30000 && class15.field242 > 0) {
            byte[] var4 = class202.field3122[--class15.field242];
            class202.field3122[class15.field242] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;)V", line = 76)
    public static final void method2442(byte arg0, String arg1) {
        field5503++;
        class181.field2853 = arg1;
        if (class340.field5234.field4975 == null) {
            return;
        }
        try {
            String var2 = class340.field5234.field4975.getParameter("cookieprefix");
            String var3 = class340.field5234.field4975.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            if (arg0 >= -66) {
                method2441(false, -90);
            }
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class20.method226(-2, class156.method1273((byte) -87) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class141.method1178(class340.field5234.field4975, -19351, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var7) {
        }
    }
}
