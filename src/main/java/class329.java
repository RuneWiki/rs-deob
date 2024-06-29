import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class329 implements class95 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lak;")
    public static class172 field5080;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 10)
    public static final String method2301(String arg0, int arg1) {
        if (arg1 != 1) {
            return (String) null;
        }
        String var2 = class33.method179(37, class204.method1491(-26916, arg0));
        if (var2 == null) {
            var2 = "";
        }
        field5081++;
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 25)
    public static void method2302(int arg0) {
        field5080 = null;
        if (arg0 != -30182) {
            field5080 = (class172) null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)I", line = 36)
    public static final int method2303(int arg0, boolean arg1) {
        field5077++;
        if (!arg1) {
            field5080 = (class172) null;
        }
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ[II)Ljava/lang/String;", line = 61)
    public final String method630(byte arg0, long arg1, int[] arg2, int arg3) {
        field5082++;
        if (arg0 > -75) {
            method2302(61);
        }
        if (arg3 == 0) {
            class184 var6 = class256.method1845(arg2[0], -4203);
            return var6.method1378((int) arg1, -24986);
        } else if (arg3 == 1 || arg3 == 10) {
            class330 var7 = class285.method2054((int) arg1, 0);
            return var7.field5135;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class256.method1845(arg2[0], -4203).method1378((int) arg1, -24986);
        } else {
            return null;
        }
    }
}
