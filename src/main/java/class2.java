import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field8 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Ljk;")
    public class276 field7;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "[[Z")
    public static boolean[][] field12;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method3(int arg0) {
        if (arg0 != 0) {
            method4(-72);
        }
        field8 = null;
        field12 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)I")
    public static final int method4(int arg0) {
        field6++;
        return arg0 == 37 ? class189.field2903 : 31;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([[II)V")
    public static final void method5(int[][] arg0, int arg1) {
        if (arg1 != 37) {
            method4(-33);
        }
        class130.field2005 = arg0;
        field9++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method6(long arg0, byte arg1) {
        field5++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        if (arg1 <= 123) {
            field12 = null;
        }
        if ((arg0 % 37L) == 0L) {
            return null;
        }
        long var3 = arg0;
        int var5 = 0;
        while (var3 != 0L) {
            var5++;
            var3 /= 37L;
        }
        StringBuffer var6 = new StringBuffer(var5);
        while (arg0 != 0L) {
            long var7 = arg0;
            arg0 /= 37L;
            var6.append(class184.field2865[(int) (var7 - (arg0 * 37L))]);
        }
        return var6.reverse().toString();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZILfa;I)[Lh;")
    public static final class294[] method7(boolean arg0, int arg1, class273 arg2, int arg3) {
        field13++;
        if (arg0) {
            return class163.method1081(0, arg2, arg1, arg3) ? class268.method1843(-103) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static final void method8(int arg0) {
        int var1 = -107 % ((arg0 - 33) / 48);
        class258.field4247.method145(-128);
        field11++;
    }
}
