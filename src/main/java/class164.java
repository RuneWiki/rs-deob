import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class164 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Loc;")
    public static class151 field2958 = class137.method873(2, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "J")
    public static long field2965 = 0L;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Z")
    private static boolean field2966 = false;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lnd;")
    public static class142 field2960;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lnd;")
    public static class142 field2964;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lwd;")
    public static class232 field2962;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
    public static int[] field2963;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public abstract void method319(int arg0);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
    public static final Object method1056(byte[] arg0, boolean arg1, byte arg2) {
        field2957++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 != -104) {
            field2966 = false;
        }
        if (arg0.length > 136 && !field2966) {
            try {
                class75 var3 = (class75) Class.forName("fd").getDeclaredConstructor().newInstance();
                var3.method397(arg0, 62);
                return var3;
            } catch (Throwable var4) {
                field2966 = true;
            }
        }
        return arg1 ? class42.method301(arg0, arg2 ^ 0xFFFFFFE5) : arg0;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public static void method1057(int arg0) {
        field2958 = null;
        field2964 = null;
        field2963 = null;
        int var1 = -8 / ((arg0 + 12) / 44);
        field2962 = null;
        field2960 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
    public abstract int method320(int arg0, int arg1, int arg2);
}
