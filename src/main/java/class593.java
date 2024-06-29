import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class593 {

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "Lkaa;")
    public static class47 field7705 = new class47(63, 0);

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field7707 = 0;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
    public static final boolean method3224(int arg0, int arg1, int arg2) {
        field7706++;
        if (arg2 != 22926) {
            method3226(-72L, 3);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
    public static void method3225(int arg0) {
        if (arg0 != 0) {
            method3226(12L, -5);
        }
        field7705 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method3226(long arg0, int arg1) {
        field7704++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 != 13754) {
                method3225(-117);
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class284.field4005[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }
}
