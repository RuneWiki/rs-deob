import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class134 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
    public static int[] field2390 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Ldj;")
    public static class44 field2396 = class89.method650(255, " <col=ffffff>");

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Ldj;")
    private static class44 field2398 = class89.method650(255, "Loaded config");

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ldj;")
    public static class44 field2392 = field2398;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Ldj;")
    public static class44 field2400 = class89.method650(255, "weiss:");

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2401 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lve;")
    public static class225 field2399;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Ldj;")
    public class44 field2404;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Z")
    public boolean field2405;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ldj;BLdj;Lve;)Lod;")
    public static final class155 method905(class44 arg0, byte arg1, class44 arg2, class225 arg3) {
        field2393++;
        int var4 = arg3.method1463(arg0, -109);
        if (arg1 != -121) {
            method907(58);
        }
        int var5 = arg3.method1461(var4, arg2, 0);
        return class170.method1082(true, arg3, var4, var5);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public static final void method906(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1304 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method907(int arg0) {
        field2399 = null;
        field2390 = null;
        field2392 = null;
        field2396 = null;
        field2400 = null;
        field2398 = null;
        if (arg0 != 0) {
            method905(null, (byte) 8, null, null);
        }
    }
}
