import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class533 {

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "Lus;")
    public static class1 field7939 = new class1();

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    public static int field7942 = 0;

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "I")
    public static int field7941 = -50;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "[I")
    public static int[] field7940 = new int[25];

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "Lha;")
    public static class53 field7937;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3213(boolean arg0) {
        field7939 = null;
        field7937 = null;
        field7940 = null;
        if (!arg0) {
            field7939 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 19)
    public static final String method3214(int arg0, String arg1) {
        field7938++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class629.method3668(arg1.charAt(var2), true)) {
            var2++;
        }
        while (var2 < var3 && class629.method3668(arg1.charAt(var3 - 1), true)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class426.method2502(0, var7)) {
                char var8 = class297.method1827(var7, 223);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (arg0 == ~var5.length()) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
