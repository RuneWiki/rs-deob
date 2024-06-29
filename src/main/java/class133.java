import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class133 {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
    public static int[] field2308 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lub;")
    public static class227 field2309 = class257.method1749("sch-Utteln:", 17263);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lub;")
    private static class227 field2314 = class257.method1749("Hidden", 17263);

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lub;")
    public static class227 field2310 = field2314;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "J")
    public long field2312;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lfh;")
    public class180 field2304;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
    public static int[] field2316;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
    public static final void method814(int arg0, byte arg1) {
        field2306++;
        class171 var2 = class184.method1170(arg0, 2, -198247328);
        var2.method1095((byte) 78);
        if (arg1 != -26) {
            method816(true);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IB)Lm;")
    public static final class178 method815(int arg0, byte arg1) {
        field2315++;
        class178 var2 = (class178) class98.field1712.method1735((long) arg0, (byte) -69);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class144.field2473.method884(class10.method47(arg0, (byte) 109), arg1 ^ 0x6B, class58.method356(arg1 ^ 0x2F7C7672, arg0));
        if (arg1 != -70) {
            field2310 = null;
        }
        class178 var4 = new class178();
        var4.field3039 = arg0;
        if (var3 != null) {
            var4.method1137(-120, new class226(var3));
        }
        var4.method1140(16086);
        if (var4.field3042 != -1) {
            var4.method1146(method815(var4.field3042, (byte) -70), method815(var4.field3055, (byte) -70), 11);
        }
        if (var4.field3005 != -1) {
            var4.method1129(94, method815(var4.field2991, (byte) -70), method815(var4.field3005, (byte) -70));
        }
        if (!class167.field2797 && var4.field3035) {
            var4.field2996 = false;
            var4.field3048 = class79.field1385;
            var4.field3057 = null;
            var4.field3058 = 0;
            var4.field3040 = null;
        }
        class98.field1712.method1730(var4, (long) arg0, (byte) -94);
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static void method816(boolean arg0) {
        field2316 = null;
        field2308 = null;
        field2309 = null;
        field2310 = null;
        if (arg0) {
            field2316 = null;
        }
        field2314 = null;
    }
}
