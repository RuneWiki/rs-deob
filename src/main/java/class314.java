import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class314 extends InputStream {

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "J")
    public static long field4299 = -1L;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "[I")
    public static int[] field4301 = new int[250];

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field4302 = -50;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "[[I")
    public static int[][] field4297 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "Lom;")
    public static class210 field4303;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Lnq;")
    public static class268 field4298;

    @OriginalMember(owner = "client!tp", name = "read", descriptor = "()I")
    public final int read() {
        field4295++;
        class349.method2219(30000L, -98);
        return -1;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method2028(boolean arg0, String arg1, boolean arg2) {
        field4296++;
        if (arg1 == null) {
            return;
        }
        if (class197.field2709 >= 100) {
            class205.method1334(class92.field1291.method2763(-107, class210.field2935), (byte) 119);
            return;
        }
        String var3 = class427.method2690(arg1, -23289);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class197.field2709; var4++) {
            String var8 = class427.method2690(class249.field3517[var4], -23289);
            if (var8 != null && var8.equals(var3)) {
                class205.method1334(arg1 + class210.field2929.method2763(117, class210.field2935), (byte) 71);
                return;
            }
            if (class245.field3464[var4] != null) {
                String var9 = class427.method2690(class245.field3464[var4], -23289);
                if (var9 != null && var9.equals(var3)) {
                    class205.method1334(arg1 + class210.field2929.method2763(67, class210.field2935), (byte) 109);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class272.field3777; var5++) {
            String var6 = class427.method2690(class288.field4045[var5], -23289);
            if (var6 != null && var6.equals(var3)) {
                class205.method1334(class196.field2696.method2763(30, class210.field2935) + arg1 + class26.field461.method2763(109, class210.field2935), (byte) 77);
                return;
            }
            if (class22.field398[var5] != null) {
                String var7 = class427.method2690(class22.field398[var5], -23289);
                if (var7 != null && var7.equals(var3)) {
                    class205.method1334(class196.field2696.method2763(-92, class210.field2935) + arg1 + class26.field461.method2763(48, class210.field2935), (byte) 118);
                    return;
                }
            }
        }
        if (class427.method2690(class412.field5841.field1922, -23289).equals(var3)) {
            class205.method1334(class17.field307.method2763(77, class210.field2935), (byte) 101);
            return;
        }
        class103.field1420++;
        class46.field648.method1178(63, 113);
        class46.field648.method173(class273.method1782((byte) 25, arg1) + 1, 255);
        class46.field648.method160(arg1, arg2);
        class46.field648.method173(arg0 ? 1 : 0, 255);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIII)V")
    public static final void method2029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4300++;
        if (arg1 >= -58) {
            method2029(22, -73, -91, -18, -116, -74);
        }
        int var6 = arg5 - arg4;
        int var7 = arg0 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class89.method627(arg3, arg4, -1, arg2, arg0);
            }
        } else if (var7 == 0) {
            class218.method1406(arg3, arg4, -100, arg5, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (class154.field2161 > arg4) {
                var10 = (class154.field2161 * var8 >> 12) + var9;
                var11 = class154.field2161;
            } else if (arg4 <= class233.field3350) {
                var10 = arg3;
                var11 = arg4;
            } else {
                var10 = (class233.field3350 * var8 >> 12) + var9;
                var11 = class233.field3350;
            }
            int var12;
            int var13;
            if (arg5 < class154.field2161) {
                var12 = (class154.field2161 * var8 >> 12) + var9;
                var13 = class154.field2161;
            } else if (class233.field3350 < arg5) {
                var13 = class233.field3350;
                var12 = (class233.field3350 * var8 >> 12) + var9;
            } else {
                var12 = arg0;
                var13 = arg5;
            }
            if (var10 < class290.field4058) {
                var11 = (class290.field4058 - var9 << 12) / var8;
                var10 = class290.field4058;
            } else if (var10 > class442.field6212) {
                var10 = class442.field6212;
                var11 = (class442.field6212 - var9 << 12) / var8;
            }
            if (var12 < class290.field4058) {
                var12 = class290.field4058;
                var13 = (class290.field4058 - var9 << 12) / var8;
            } else if (class442.field6212 < var12) {
                var12 = class442.field6212;
                var13 = (class442.field6212 - var9 << 12) / var8;
            }
            class15.method236(var10, var13, var12, var11, (byte) 111, arg2);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method2030(int arg0) {
        field4298 = null;
        field4297 = null;
        if (arg0 != 12766) {
            field4298 = null;
        }
        field4303 = null;
        field4301 = null;
    }
}
