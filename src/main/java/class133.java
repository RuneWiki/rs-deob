import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class133 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field1842 = 0;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field1846 = 0;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Lla;")
    public static class423 field1843;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public static void method939(int arg0) {
        field1843 = null;
        if (arg0 != 0) {
            field1843 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method940(String arg0, int arg1) {
        if (arg1 != -32068) {
            field1842 = 109;
        }
        field1845++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1841++;
        if (arg7 != 23352) {
            method941(-119, 125, -103, -94, -15, -57, 103, 119);
        }
        if (arg2 == arg6) {
            class35.method181(arg0, (byte) 116, arg2, arg5, arg1, arg4, arg3);
        } else if (class200.field2976 <= arg4 - arg2 && arg2 + arg4 <= class204.field3061 && arg1 - arg6 >= class377.field5458 && (arg1 + arg6) <= class362.field5291) {
            class310.method1926(arg4, arg1, arg3, arg2, arg0, arg6, (byte) 101, arg5);
        } else {
            class26.method111(-21406, arg1, arg6, arg5, arg2, arg4, arg0, arg3);
        }
    }
}
