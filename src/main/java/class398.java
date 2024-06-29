import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class398 {

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[Z")
    public static boolean[] field5595 = new boolean[100];

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lsm;")
    public static class156 field5596;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lbi;")
    public static final class282 method2496(int arg0, int arg1) {
        field5592++;
        class15 var2 = class19.field256;
        class282 var3;
        synchronized (class19.field256) {
            var3 = (class282) class19.field256.method99(true, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class154.field2284.method643(class275.method1866(arg1, (byte) -89), class288.method1963((byte) -23, arg1), true);
        class282 var5 = new class282();
        var5.field4094 = arg1;
        if (var4 != null) {
            var5.method1945((byte) 93, new class130(var4));
        }
        var5.method1938((byte) -106);
        if (var5.field4081) {
            var5.field4042 = false;
            var5.field4079 = 0;
        }
        if (!class306.field4456 && var5.field4067) {
            var5.field4084 = null;
            var5.field4073 = null;
        }
        class15 var6 = class19.field256;
        synchronized (class19.field256) {
            if (arg0 >= -110) {
                return null;
            } else {
                class19.field256.method90(var5, (long) arg1, 0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
    public static final void method2497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5591++;
        int var6 = class209.method1485(class240.field3547, 1667, class245.field3659, arg0);
        if (arg4 != -256) {
            method2499((byte) 38);
        }
        int var7 = class209.method1485(class240.field3547, arg4 ^ 0xFFFFF983, class245.field3659, arg3);
        int var8 = class209.method1485(class231.field3415, 1667, class408.field5789, arg2);
        int var9 = class209.method1485(class231.field3415, 1667, class408.field5789, arg1);
        for (int var10 = var6; var10 <= var7; var10++) {
            class5.method17(class440.field6288[var10], var9, arg5, (byte) 77, var8);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IC)Z")
    public static final boolean method2498(int arg0, char arg1) {
        field5594++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg0 != arg1) {
            char[] var2 = class408.field5785;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method2499(byte arg0) {
        field5595 = null;
        int var1 = 52 / ((arg0 + 47) / 61);
        field5596 = null;
    }
}
