import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class517 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
    public static int[] field7656 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
    public static int[] field7659 = new int[13];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
    public static int[] field7658 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method3045(byte arg0) {
        field7659 = null;
        field7656 = null;
        field7658 = null;
        if (arg0 <= 0) {
            field7656 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method3046(String arg0, byte arg1) {
        field7660++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        if (arg1 < 6) {
            return null;
        }
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
