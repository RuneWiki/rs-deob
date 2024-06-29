import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[I")
    public static int[] field14 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
    public static int[] field16 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field18 = 0;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[I")
    public static int[] field20 = new int[1];

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lsf;")
    public static class397 field15;

    @OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field19++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method6(byte arg0) {
        if (arg0 < 26) {
            method6((byte) 85);
        }
        field16 = null;
        field14 = null;
        field20 = null;
        field15 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method7(int arg0, String arg1) {
        field17++;
        StringBuffer var2 = new StringBuffer();
        if (arg0 != -71) {
            method7(-99, null);
        }
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && var4 + 2 < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg1.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 + '\n' - 97;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + '\n' - 65;
                }
                var4 += 2;
                if (var11 != 0 && class442.method2611((byte) var11, (byte) 92)) {
                    var2.append(class36.method214((byte) var11, -129));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(II)V")
    public class2(int arg0, int arg1) {
    }
}
