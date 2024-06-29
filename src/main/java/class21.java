import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class21 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Ltl;")
    public static class59 field280 = class85.method639("null", 9588);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Ltl;")
    public static class59 field281 = class85.method639("gelb:", 9588);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Ltl;")
    private static class59 field283 = class85.method639("Loaded textures", 9588);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field282 = 0;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field285 = 0;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Ltl;")
    public static class59 field279 = field283;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lkl;")
    public static class64 field277 = new class64();

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Ltl;")
    public static class59 field286 = class85.method639("<)4col> x", 9588);

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Ltl;")
    public static class59 field287 = class85.method639("::clientdrop", 9588);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lmb;")
    public static class171 field284;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 24)
    public static void method140(byte arg0) {
        field287 = null;
        field284 = null;
        if (arg0 > -117) {
            method140((byte) 98);
        }
        field286 = null;
        field279 = null;
        field281 = null;
        field280 = null;
        field277 = null;
        field283 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 51)
    public static final void method141(int arg0, int arg1, int arg2) {
        field278++;
        class186 var3 = class67.method561(32, arg1, arg0);
        var3.method1380(arg0 ^ 0xCDA);
        var3.field3117 = arg2;
    }
}
