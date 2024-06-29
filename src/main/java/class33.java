import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class33 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Z")
    public static boolean field444 = true;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field446 = "Loading...";

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lcd;")
    public static class69 field448 = new class69(16);

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Ldb;")
    public static class102 field449 = new class102(64);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII)I", line = 10)
    public static final int method178(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 17) {
            return 3;
        } else {
            field447++;
            return arg1 <= arg2 ? (arg0 < arg2 ? arg0 : arg2) : arg1;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 25)
    public static final String method179(int arg0, long arg1) {
        field445++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % (long) arg0) == 0L) {
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
                var6.append(class323.field5017[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)I", line = 69)
    public static final int method180(int arg0, int arg1, int arg2) {
        field443++;
        class111 var3 = (class111) class76.field1064.method451((long) arg2, (byte) 100);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1643.length; var5++) {
                if (var3.field1644[var5] == arg1) {
                    var4 += var3.field1643[var5];
                }
            }
            if (arg0 != 3839) {
                method179(44, 57L);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 103)
    public static void method181(int arg0) {
        field446 = null;
        field449 = null;
        int var1 = 127 % ((-arg0 - 12) / 54);
        field448 = null;
    }
}
