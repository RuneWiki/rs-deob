import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class84 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lqd;")
    public static class173 field1390 = new class173(64);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Ldk;")
    public static class251 field1393;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lam;")
    public static class314 field1392;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[Z")
    public static boolean[] field1389;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method575(byte arg0) {
        field1395++;
        int var1 = -64 / ((arg0 - 13) / 39);
        class243.field3871.method1257(-113);
        class94.field1519.method1257(-6);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method576(int arg0) {
        field1390 = null;
        int var1 = 55 / ((arg0 + 22) / 59);
        field1392 = null;
        field1393 = null;
        field1389 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JBZII)Ljava/lang/String;")
    public static final String method577(long arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field1391++;
        char var6 = '.';
        char var7 = ',';
        if (arg4 == 0) {
            var6 = ',';
            var7 = '.';
        }
        boolean var8 = false;
        if (arg4 == 2) {
            var6 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        int var10 = -12 % ((arg1 + 60) / 39);
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        if (arg3 > 0) {
            for (int var11 = 0; var11 < arg3; var11++) {
                int var12 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var12 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var7);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var14 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var13++;
                if (var13 % 3 == 0) {
                    var9.append(var6);
                }
            }
        }
    }
}
