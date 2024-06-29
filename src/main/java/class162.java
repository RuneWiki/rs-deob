import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class162 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lwea;")
    public static class259 field2133 = new class259(7, 2);

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[S")
    private static short[] field2134 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[S")
    private static short[] field2137 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[S")
    private static short[] field2135 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Z")
    public static boolean field2138 = false;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[S")
    private static short[] field2139 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[[S")
    public static short[][] field2136 = new short[][] { field2135, field2137, field2134, field2139 };

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!gb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2131++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method932(byte arg0) {
        field2135 = null;
        if (arg0 < 60) {
            method932((byte) 59);
        }
        field2134 = null;
        field2133 = null;
        field2139 = null;
        field2137 = null;
        field2136 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrj;I)[Lro;")
    public static final class170[] method933(class648 arg0, int arg1) {
        field2132++;
        if (!arg0.method3635(false)) {
            return new class170[0];
        }
        class264 var2 = arg0.method3630((byte) -96);
        while (var2.field3358 == 0) {
            class419.method2233(-28448, 10L);
        }
        if (var2.field3358 == 2) {
            return new class170[0];
        }
        int[] var3 = (int[]) var2.field3356;
        class170[] var4 = new class170[var3.length >> 2];
        if (arg1 <= 114) {
            method932((byte) 5);
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class170 var6 = new class170();
            var4[var5] = var6;
            var6.field2216 = var3[var5 << 2];
            var6.field2213 = var3[(var5 << 2) + 1];
            var6.field2218 = var3[(var5 << 2) + 2];
            var6.field2214 = var3[(var5 << 2) + 3];
        }
        return var4;
    }
}
