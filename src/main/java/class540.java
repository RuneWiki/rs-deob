import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class540 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2966(int arg0, String arg1) {
        field7314++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class352.method2045(arg1.charAt(var2), 95)) {
            var2++;
        }
        while (var2 < var3 && class352.method2045(arg1.charAt(var3 - 1), 95)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        if (arg0 != -1) {
            field7311 = 84;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class293.method1748((byte) 105, var7)) {
                char var8 = class469.method2638(var7, arg0 + 1);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBII)V")
    public static final void method2967(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7312++;
        if (arg2 >= -92) {
            field7311 = 87;
        }
        class252 var5 = class150.method916(arg1, -114, 8);
        var5.method1502((byte) -103);
        var5.field3251 = arg3;
        var5.field3250 = arg0;
        var5.field3247 = arg4;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
    public static final void method2968(int arg0, int arg1, int arg2) {
        if (class284.field3756 == 1) {
            class436.method2474(arg0, (byte) 78, arg1, class320.field4305);
        } else if (class284.field3756 == 2) {
            if (class247.field3206) {
                class372.method2190(arg0 + class231.method1364(false), arg1 - -class63.method488((byte) 42), true);
            } else {
                class372.method2190(arg0, arg1, true);
            }
        }
        field7313++;
        class284.field3756 = 0;
        class320.field4305 = null;
        if (arg2 != -2) {
            method2966(-15, null);
        }
    }
}
