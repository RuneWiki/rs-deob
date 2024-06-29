import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class27 extends class390 {

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
    public int field303 = -1;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "[S")
    public static short[] field305 = new short[] { 18, 15, 20, 50, 13, 8, 25, 48 };

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "Ltm;")
    public static class349 field304 = new class349(16);

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "[B")
    public static byte[] field307 = new byte[520];

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "[I")
    public static int[] field309;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "Laq;")
    public static class453 field306;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "Ljava/lang/String;")
    public String field301;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "Ljava/lang/String;")
    public String field302;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V")
    public static void method170(int arg0) {
        field306 = null;
        field305 = null;
        field307 = null;
        int var1 = 101 % ((-13 - arg0) / 58);
        field304 = null;
        field309 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)Leb;")
    public final class54 method171(boolean arg0) {
        ++field300;
        if (!arg0) {
            this.method171(true);
        }
        return class419.field5724[super.field5318];
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
    public static final void method172(int arg0, int arg1) {
        ++field298;
        class59.field751.method2286(arg0, (byte) 36);
        class344.field4678.method2286(arg0, (byte) 36);
        if (arg1 != 25) {
            field304 = null;
        }
        class28.field313.method2286(arg0, (byte) 36);
        class91.field1062.method2286(arg0, (byte) 36);
        class278.field3607.method2286(arg0, (byte) 36);
    }

    static {
        Math.sqrt(8192.0D);
        field309 = new int[13];
    }
}
