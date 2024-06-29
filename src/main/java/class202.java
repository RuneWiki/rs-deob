import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class202 extends Exception {

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "Lpfa;")
    public static class275 field2352;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)V")
    public static void method1181(byte arg0) {
        if (arg0 != 37) {
            method1181((byte) 7);
        }
        field2352 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BIJZI)Ljava/lang/String;")
    public static final String method1182(byte arg0, int arg1, long arg2, boolean arg3, int arg4) {
        field2353++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg2 < 0L) {
            arg2 = -arg2;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                if (arg0 >= -65) {
                    field2352 = null;
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }
}
