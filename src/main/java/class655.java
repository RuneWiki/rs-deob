import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class655 {

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "Lsb;")
    public static class266 field9421 = new class266(59, -1);

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method3728(String arg0, boolean arg1) {
        field9419++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class33.method515(arg0.charAt(var2), 45)) {
            var2++;
        }
        if (!arg1) {
            return null;
        }
        while (var3 > var2 && class33.method515(arg0.charAt(var3 - 1), 45)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class66.method766(var7, (byte) 126)) {
                char var8 = class379.method2367(var7, 19848);
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

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V")
    public static void method3729(byte arg0) {
        field9421 = null;
        if (arg0 != 59) {
            method3729((byte) 23);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BLog;)V")
    public static final void method3730(byte arg0, class602 arg1) {
        field9420++;
        if (arg0 != -112) {
            field9421 = null;
        }
        class509 var2 = (class509) class518.field7304.method2596((long) arg1.field8728, 105);
        if (var2 == null) {
            return;
        }
        if (var2.field7212 != null) {
            class50.field1184.method2073(var2.field7212);
            var2.field7212 = null;
        }
        var2.method2588(300);
    }
}
