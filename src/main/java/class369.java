import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class369 extends class25 {

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "[[I")
    public static int[][] field5273 = new int[6][];

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "Ldg;")
    public static class376 field5274 = new class376(39, 15);

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 3)
    public static void method2236(byte arg0) {
        field5273 = null;
        if (arg0 > -58) {
            field5273 = null;
        }
        field5274 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 15)
    public static final String method2237(long arg0, boolean arg1) {
        field5275++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (!arg1) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class23.field314[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}
