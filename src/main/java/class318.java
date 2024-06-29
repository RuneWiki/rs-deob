import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class318 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static volatile int field4232 = 0;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[S")
    public static short[] field4240 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Z")
    public static boolean field4237 = false;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Lpi;")
    public static class220 field4233;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lam;")
    public static class286 field4234;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 7)
    public static void method1832(int arg0) {
        field4240 = null;
        field4234 = null;
        if (arg0 == 22464) {
            field4233 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZJIII)Ljava/lang/String;", line = 22)
    public static final String method1833(boolean arg0, long arg1, int arg2, int arg3, int arg4) {
        field4238++;
        char var6 = ',';
        if (arg4 != -20112) {
            return null;
        }
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg1 < 0L) {
            arg1 = -arg1;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg1 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg1 * 10)));
            if (arg1 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V", line = 108)
    public static final void method1834(int arg0, byte arg1) {
        field4239++;
        class29.field276.method614(arg1 - 246, arg0);
        if (arg1 == 126) {
            class189.field2388.method614(-124, arg0);
        }
    }
}
