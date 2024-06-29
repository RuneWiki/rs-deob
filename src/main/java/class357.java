import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class357 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "F")
    public static float field5694;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "F")
    public static float field5696;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Lpr;")
    public static class412 field5693;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lri;")
    public static class97 field5695;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "[I")
    public static int[] field5692;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I", line = 12)
    public static int method2397(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 19)
    public static final String method2398(long arg0, int arg1) {
        field5691++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 != -15775) {
                return null;
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class267.field4351[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 58)
    public static void method2399(int arg0) {
        field5695 = null;
        field5693 = null;
        if (arg0 != 37) {
            field5694 = -1.463306F;
        }
        field5692 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 70)
    public static final boolean method2400(int arg0, String arg1) {
        if (arg0 == 10) {
            field5690++;
            return class102.method983((byte) 92, 10, arg1, true);
        } else {
            return false;
        }
    }
}
