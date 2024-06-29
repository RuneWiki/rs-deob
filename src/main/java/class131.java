import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class131 {

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "Lsd;")
    public static class74 field1602 = new class74(47, -1);

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static void method622(byte arg0) {
        if (arg0 > -36) {
            field1602 = null;
        }
        field1602 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method623(int arg0, String arg1) {
        field1603++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        int var6 = 0;
        if (arg0 != 60) {
            field1602 = null;
        }
        while (var2 > var6) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
            var6++;
        }
        return var5.toString();
    }
}
