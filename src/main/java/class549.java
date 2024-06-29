import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class549 {

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "[S")
    public static short[] field7633 = new short[] { 51, 19, 10, 50, 11, 49, 22, 5 };

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field7632 = 0;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
    public static int field7634 = 0;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)V")
    public static void method3175(boolean arg0) {
        if (arg0) {
            field7634 = 2;
        }
        field7633 = null;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method3176(boolean arg0, long arg1) {
        field7635++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else if (arg0) {
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
                var6.append(class224.field3288[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II[B)I")
    public static final int method3177(int arg0, int arg1, byte[] arg2) {
        if (arg1 != -26861) {
            field7634 = -36;
        }
        field7631++;
        return class368.method2200(arg0, 0, arg2, (byte) -66);
    }
}
