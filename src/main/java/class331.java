import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class331 {

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5153 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Ltl;")
    public static class222 field5155 = new class222(50);

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field5159 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Loi;")
    public static class334 field5160;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLkb;Lkb;)V", line = 5)
    public static final void method2287(byte arg0, class39 arg1, class39 arg2) {
        field5152++;
        int var3 = -56 % ((-arg0 - 27) / 44);
        class340.field5277 = arg2;
        class49.field671 = arg1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 35)
    public static final void method2288(int arg0) {
        field5156++;
        class324.field5065.method1623(1);
        if (arg0 != 19220) {
            method2288(-49);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 49)
    public static void method2289(int arg0) {
        if (arg0 != -1) {
            method2288(-90);
        }
        field5155 = null;
        field5153 = null;
        field5160 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 133)
    public static final String method2290(byte arg0, long arg1) {
        field5151++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            if (arg0 != 120) {
                method2288(106);
            }
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class149.field2261[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJIZZ)Ljava/lang/String;", line = 217)
    public static final String method2291(int arg0, long arg1, int arg2, boolean arg3, boolean arg4) {
        field5154++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        boolean var8 = false;
        if (arg1 < 0L) {
            arg1 = -arg1;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 == 2) {
            var7 = ' ';
        }
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (48 - ((int) arg1 * 10 - var11)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg1 * 10)));
            if (arg1 == 0L) {
                if (!arg3) {
                    field5160 = (class334) null;
                }
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }
}
