import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public abstract class class147 extends class766 {

    @OriginalMember(owner = "client!ofa", name = "p", descriptor = "D")
    public static double field2361;

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!ofa", name = "q", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1160(int arg0, String arg1) {
        field2362++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class293.method1860(arg1.charAt(var2), -33)) {
            var2++;
        }
        while (var2 < var3 && class293.method1860(arg1.charAt(var3 - 1), -33)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var8 = arg1.charAt(var6);
            if (class791.method4320((byte) 109, var8)) {
                char var9 = class628.method3592(6075, var8);
                if (var9 != '\u0000') {
                    var5.append(var9);
                }
            }
        }
        int var7 = -40 / ((-arg0 - 65) / 40);
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lhi;B)V")
    public abstract void method1161(class465 arg0, byte arg1);

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lol;I)V")
    public abstract void method1162(class431 arg0, int arg1);
}
