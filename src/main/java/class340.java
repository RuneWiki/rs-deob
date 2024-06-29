import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class340 extends class430 {

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "Lmr;")
    public class611 field4685 = new class611();

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
    public static int field4683 = 0;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "[Lmo;")
    public static class731[] field4682;

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "[S")
    public static short[] field4686;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V", line = 5)
    public static void method2090(int arg0) {
        field4686 = null;
        field4682 = null;
        if (arg0 != 0) {
            field4686 = null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIII)V", line = 18)
    public static final void method2091(int arg0, int arg1, int arg2, int arg3) {
        field4681++;
        class123 var4 = class680.field9653[arg3][arg0];
        class175.method1261(var4 == null ? class567.field8197 : var4, arg1, (byte) 127);
        if (arg2 != 160) {
            method2091(86, -39, 67, 15);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 33)
    public static final String method2092(int arg0, long arg1) {
        field4684++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else if (arg0 <= 87) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class274.field3872[(int) (var7 - (arg1 * 37L))];
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
