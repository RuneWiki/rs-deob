import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class413 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6108 = "Starting 3d Library";

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field6110 = 0;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field6116 = -1;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lgh;")
    public static class325 field6111;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lmo;")
    public static class447 field6114;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)J")
    public abstract long method1369(byte arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method2585(int arg0) {
        field6108 = null;
        field6111 = null;
        if (arg0 != -27817) {
            field6107 = -53;
        }
        field6114 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IC)C")
    public static final char method2586(int arg0, char arg1) {
        field6113++;
        if (arg0 <= 86) {
            method2586(19, '8');
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public abstract void method1366(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(JLjava/lang/String;IIIILjava/lang/String;I)V")
    public static final void method2587(long arg0, String arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field6115++;
        if (class262.field4214 || class144.field2267 >= 500) {
            return;
        }
        int var9 = arg3 == -1 ? class50.field617 : arg3;
        if (arg7 != -233) {
            method2586(61, '|');
        }
        class418 var10 = new class418(arg1, arg6, var9, arg4, arg0, arg2, arg5);
        class86.field1089.method245(500, var10);
        class144.field2267++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Z")
    public static final boolean method2588(boolean arg0) {
        field6109++;
        try {
            if (!arg0) {
                method2586(-85, (char) 65503);
            }
            if (class417.field6178 == 2) {
                if (class70.field868 == null) {
                    class70.field868 = class93.method549(class390.field5860, class358.field5471, class277.field4419);
                    if (class70.field868 == null) {
                        return false;
                    }
                }
                if (class359.field5487 == null) {
                    class359.field5487 = new class115(class415.field6131, field6114);
                }
                if (class285.field4582.method1507(-1, 22050, class359.field5487, class70.field868, class241.field3994)) {
                    class285.field4582.method1525((byte) -113);
                    class285.field4582.method1527(82, class263.field4241);
                    class285.field4582.method1511(class150.field2350, (byte) 54, class70.field868);
                    class70.field868 = null;
                    class390.field5860 = null;
                    class359.field5487 = null;
                    class417.field6178 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class285.field4582.method1536(126);
            class359.field5487 = null;
            class417.field6178 = 0;
            class70.field868 = null;
            class390.field5860 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)I")
    public abstract int method1367(boolean arg0, int arg1);
}
