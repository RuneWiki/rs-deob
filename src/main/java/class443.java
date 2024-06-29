import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class443 extends class573 {

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field6115 = -1;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "Lrh;")
    public static class59 field6114 = new class59();

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field6117 = 0;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2547(long arg0, int arg1) {
        field6113++;
        if (arg0 <= (long) arg1 || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
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
                char var9 = class327.field4768[(int) (var7 - (arg0 * 37L))];
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

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Loa;Lbo;III)V")
    public static final void method2548(class689 arg0, class631 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class149.field1872) {
            class651 var5 = class145.field1841[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field9227 != null && var5.field9227.method135(0)) {
                arg1.method133(var5.field9227, 0, arg0, class33.field327, -8763, 0, true);
            }
        }
        if (arg4 < class149.field1872) {
            class651 var6 = class145.field1841[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field9227 != null && var6.field9227.method135(0)) {
                arg1.method133(var6.field9227, 0, arg0, 0, -8763, class33.field327, true);
            }
        }
        if (arg3 < class149.field1872 && arg4 < class334.field4887) {
            class651 var7 = class145.field1841[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field9227 != null && var7.field9227.method135(0)) {
                arg1.method133(var7.field9227, 0, arg0, class33.field327, -8763, class33.field327, true);
            }
        }
        if (arg3 < class149.field1872 && arg4 > 0) {
            class651 var8 = class145.field1841[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field9227 != null && var8.field9227.method135(0)) {
                arg1.method133(var8.field9227, 0, arg0, class33.field327, -8763, -class33.field327, true);
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public static void method2549(int arg0) {
        if (arg0 == 23685) {
            field6114 = null;
        }
    }
}
