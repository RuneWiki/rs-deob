import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class247 extends class217 {

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    private int field2997;

    @OriginalMember(owner = "client!cca", name = "w", descriptor = "I")
    private int field3005;

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
    private int field2999;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
    private int field2998;

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "Lkn;")
    public static class737 field3000 = new class737();

    @OriginalMember(owner = "client!cca", name = "t", descriptor = "Ldh;")
    public static class320 field3002 = new class320(95, 3);

    @OriginalMember(owner = "client!cca", name = "v", descriptor = "[F")
    public static float[] field3004 = new float[16384];

    @OriginalMember(owner = "client!cca", name = "u", descriptor = "[F")
    public static float[] field3003 = new float[16384];

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!cca", name = "s", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!cca", name = "y", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!cca", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field3006;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
    public static void method1494(int arg0) {
        field3006 = null;
        field3000 = null;
        if (arg0 != 1724786764) {
            field3003 = null;
        }
        field3002 = null;
        field3004 = null;
        field3003 = null;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(IIIIIII)V")
    public class247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2997 = arg3;
        this.field3005 = arg2;
        this.field2999 = arg1;
        this.field2998 = arg0;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIZ)V")
    public final void method1265(int arg0, int arg1, boolean arg2) {
        ++field2996;
        int var4 = this.field2998 * arg0 >> 12;
        int var5 = this.field3005 * arg0 >> 12;
        int var6 = this.field2999 * arg1 >> 12;
        if (!arg2) {
            field3004 = null;
        }
        int var7 = this.field2997 * arg1 >> 12;
        class359.method2116(var6, false, var7, var4, super.field2515, var5);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
    public final void method1267(int arg0, int arg1, int arg2) {
        if (arg0 != -5) {
            this.field3005 = -61;
        }
        ++field3001;
        int var4 = this.field2998 * arg2 >> 12;
        int var5 = this.field3005 * arg2 >> 12;
        int var6 = this.field2999 * arg1 >> 12;
        int var7 = this.field2997 * arg1 >> 12;
        class296.method1760(var7, var5, var4, super.field2515, var6, super.field2524, 109, super.field2520);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIB)V")
    public final void method1268(int arg0, int arg1, byte arg2) {
        ++field2995;
        if (arg2 != -39) {
            field3000 = null;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field3004[var2] = (float) Math.sin((double) var2 * var0);
            field3003[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
