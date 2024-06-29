import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class186 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Ldh;")
    public static class320 field2217 = new class320(39, 4);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lsq;")
    public static class178 field2218 = new class178(8, 0, 4, 1);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method1146(boolean arg0, String arg1) {
        if (!arg0) {
            method1147((byte) -123);
        }
        field2215++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
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

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method1147(byte arg0) {
        field2217 = null;
        field2218 = null;
        if (arg0 > -121) {
            field2217 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2216++;
        if (arg2 - arg4 >= class338.field4355 && arg2 + arg4 <= class744.field10385 && class224.field2571 <= (arg6 - arg4) && arg4 + arg6 <= class578.field8182) {
            class200.method1207(arg6, arg4, arg3, arg1, (byte) 115, arg0, arg2);
        } else {
            class370.method2153((byte) 103, arg0, arg2, arg4, arg1, arg3, arg6);
        }
        if (arg5 >= -31) {
            method1147((byte) -33);
        }
    }
}
