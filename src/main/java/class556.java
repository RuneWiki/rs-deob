import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class556 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Lcq;")
    public static class466 field7796 = new class466(true);

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Lsaa;")
    public static class326 field7800 = new class326("runescape", 0);

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "F")
    public static float field7802;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)I", line = 13)
    public static final int method3210(byte arg0, boolean arg1) {
        if (arg0 != 41) {
            return -3;
        }
        field7797++;
        int var2 = class221.field2883;
        if (var2 == 0) {
            return arg1 ? 0 : class143.field2043;
        } else if (var2 == 1) {
            return class143.field2043;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZIJI)Ljava/lang/String;", line = 54)
    public static final String method3211(byte arg0, boolean arg1, int arg2, long arg3, int arg4) {
        field7798++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        if (arg0 < 20) {
            return null;
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 140)
    public static void method3212(boolean arg0) {
        field7800 = null;
        field7796 = null;
        if (arg0) {
            field7802 = 3.0636134F;
        }
    }
}
