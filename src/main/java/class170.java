import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class170 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2359 = "wave:";

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2361 = "Please wait...";

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
    public static int[] field2363 = new int[14];

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 7)
    public static void method1256(byte arg0) {
        field2359 = null;
        if (arg0 > -1) {
            method1257(false, (byte[]) null);
        }
        field2363 = null;
        field2361 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z[B)[B", line = 32)
    public static final byte[] method1257(boolean arg0, byte[] arg1) {
        field2362++;
        class299 var2 = new class299(arg1);
        int var3 = var2.method2096((byte) -122);
        int var4 = var2.method2062(-25795);
        if (!arg0) {
            field2360 = -85;
        }
        if (var4 < 0 || !(class333.field5182 == 0 || class333.field5182 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2079(120, 0, var4, var5);
            return var5;
        } else {
            int var6 = var2.method2062(-25795);
            if (var6 < 0 || class333.field5182 != 0 && class333.field5182 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class342.method2379(var7, var6, arg1, var4, 9);
            } else {
                class44.field545.method778(var2, (byte) -100, var7);
            }
            return var7;
        }
    }
}
