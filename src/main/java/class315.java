import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class315 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lwl;")
    public static class452 field4768 = new class452(22, 12);

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4772 = new String[100];

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "[I")
    public static int[] field4773 = new int[32];

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Lpf;")
    public static class425 field4771 = new class425(48, 11);

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lpf;")
    public static class425 field4774;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "[Lkr;")
    public static class234[] field4775;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZZLsc;Ljava/lang/String;Z)V")
    public static final void method1923(boolean arg0, boolean arg1, class239 arg2, String arg3, boolean arg4) {
        field4770++;
        if (arg0) {
            if (class239.field3574.startsWith("win") && class239.field3584 != 3) {
                String var5 = null;
                if (arg2.field3583 != null) {
                    var5 = arg2.field3583.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class211 var6 = class452.method2807(82, arg3, arg2, 0);
                    class210.field3166 = arg3;
                    class100.field1372 = arg2;
                    class465.field6838 = var6;
                    return;
                }
            }
            if (class239.field3574.startsWith("mac")) {
                String var7 = null;
                if (arg2.field3583 != null) {
                    var7 = arg2.field3583.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg4) {
                    class452.method2807(-121, arg3, arg2, 1);
                    return;
                }
            }
            class452.method2807(119, arg3, arg2, 2);
        } else {
            class452.method2807(-111, arg3, arg2, 3);
        }
        if (!arg1) {
            field4773 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1924(int arg0, int arg1) {
        field4769++;
        if (arg0 == 100 && class396.field5925 > 0) {
            byte[] var2 = class302.field4571[--class396.field5925];
            class302.field4571[class396.field5925] = null;
            return var2;
        }
        if (arg1 != 2697) {
            field4772 = null;
        }
        if (arg0 == 5000 && class100.field1373 > 0) {
            byte[] var3 = class112.field1485[--class100.field1373];
            class112.field1485[class100.field1373] = null;
            return var3;
        } else if (arg0 == 30000 && class138.field1872 > 0) {
            byte[] var4 = class459.field6800[--class138.field1872];
            class459.field6800[class138.field1872] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIB)V")
    public static final void method1925(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class195.field2955 = arg1;
        class339.field5062 = arg2;
        field4767++;
        class19.field264 = arg0;
        class379.field5529 = arg3;
        if (arg4 != -114) {
            field4771 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method1926(int arg0) {
        field4774 = null;
        field4775 = null;
        field4768 = null;
        field4772 = null;
        field4771 = null;
        field4773 = null;
        if (arg0 != -251) {
            field4774 = null;
        }
    }

    static {
        new class151("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field4774 = new class425(66, 3);
    }
}
