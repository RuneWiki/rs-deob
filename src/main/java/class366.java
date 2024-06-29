import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class366 {

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
    public static int[] field5375 = new int[200];

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lbg;")
    public static class310 field5374 = new class310(71, 7);

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lbg;")
    public static class310 field5377 = new class310(34, 4);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
    public static final int method2211(int arg0, int arg1) {
        field5376++;
        if (arg0 > -108) {
            field5378 = 108;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2212(int arg0, int arg1, byte arg2) {
        field5372++;
        if (arg2 != 93) {
            method2214(-1, 4, null);
        }
        return class111.method799(1, arg0, arg1) & class65.method448(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!nd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5370++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method2213(byte arg0) {
        field5374 = null;
        field5377 = null;
        if (arg0 != 120) {
            method2213((byte) 101);
        }
        field5375 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method2214(int arg0, int arg1, byte[] arg2) {
        field5373++;
        byte[] var3 = new byte[arg0];
        class356.method2184(arg2, arg1, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method2215(int arg0, boolean arg1, byte[] arg2) {
        field5371++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class368.field5404) {
            try {
                class22 var3 = (class22) Class.forName("eg").getDeclaredConstructor().newInstance();
                var3.method112(-13520, arg2);
                return var3;
            } catch (Throwable var4) {
                class368.field5404 = true;
            }
        }
        if (arg0 != -1705415604) {
            field5375 = null;
        }
        return arg1 ? class241.method1447(0, arg2) : arg2;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
    public class366(int arg0, int arg1) {
    }
}
