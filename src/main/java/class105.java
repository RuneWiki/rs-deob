import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class105 extends class321 {

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Z")
    public static boolean field1131 = false;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "[I")
    public static int[] field1133 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 3)
    public static void method570(int arg0) {
        if (arg0 != 21369) {
            method570(57);
        }
        field1133 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 15)
    public static final String method571(int arg0, long arg1) {
        field1132++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % (long) arg0) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class645.field9105[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)I", line = 66)
    public static int method572(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(I)V", line = 82)
    public class105(int arg0) {
        this.field1134 = arg0;
    }
}
