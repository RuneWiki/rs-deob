import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class311 extends class488 {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "[I")
    public static int[] field4618 = new int[1];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lkk;")
    public static class173 field4616;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static void method1909(int arg0) {
        if (arg0 >= -25) {
            field4618 = null;
        }
        field4618 = null;
        field4616 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method1910(String arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field4619++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }
}
