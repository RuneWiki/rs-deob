import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class437 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lfq;")
    public static class137 field6377;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 6)
    public static void method2683(int arg0) {
        field6377 = null;
        if (arg0 != -10506) {
            field6377 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 20)
    public static final String method2684(int arg0, String arg1) {
        field6378++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class343.method1996(arg1.charAt(var2), 99)) {
            var2++;
        }
        while (var2 < var3 && class343.method1996(arg1.charAt(var3 - 1), 86)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        if (arg0 > -57) {
            method2684(-90, null);
        }
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class281.method1697(var7, 0)) {
                char var8 = class61.method366(true, var7);
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

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 78)
    public static final String method2685(int arg0, byte arg1) {
        field6379++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class478.field7082.method1823(class374.field5072, (byte) -88) + " (" + var2 + ")</col>";
        } else {
            int var4 = -67 % ((43 - arg1) / 44);
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class220.field2974.method1823(class374.field5072, (byte) -88) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }
}
