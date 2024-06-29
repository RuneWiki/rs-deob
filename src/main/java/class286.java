import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class286 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field3598 = 7000;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field3600 = field3598;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lkg;")
    public static class275 field3597 = new class275(34, 6);

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Lkg;")
    public static class275 field3603 = new class275(35, 28);

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZIZIIIII)V")
    public static final void method1700(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2) {
            method1703(22);
        }
        field3601++;
        if ((arg0 ? class748.field10451.field10428.method4186((byte) 56) : class748.field10451.field10434.method4186((byte) 92)) != 0 && arg5 != 0 && class3.field26 < 50 && arg6 != -1) {
            class742.field10360[class3.field26++] = new class268((byte) (arg0 ? 3 : 2), arg6, arg5, arg4, arg3, arg7, arg1, null);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1701(int arg0, String arg1) {
        field3599++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class292.method1753((byte) -1, arg1.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class292.method1753((byte) -1, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class324.method1896(var7, 117)) {
                char var8 = class633.method3551(var7, 207);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (~var5.length() == arg0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)Z")
    public static final boolean method1702(byte arg0, int arg1) {
        field3602++;
        if (arg0 != 90) {
            method1700(false, -75, false, -55, -92, -84, 51, -37);
        }
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static void method1703(int arg0) {
        field3597 = null;
        int var1 = 50 % ((-arg0 - 39) / 49);
        field3603 = null;
    }
}
