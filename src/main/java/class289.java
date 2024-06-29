import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class289 {

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Loh;")
    public static class258 field4983 = class153.method1046("<)4col> x", 96);

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Loh;")
    private static class258 field4985 = class153.method1046("wave:", 95);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Loh;")
    public static class258 field4982 = class153.method1046("Lade Texturen )2 ", 111);

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Loh;")
    public static class258 field4984 = field4985;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Loh;")
    public static class258 field4988 = field4985;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Lgb;")
    public static class213 field4987;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Llk;", line = 19)
    public static final class250 method2036(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class250 var4 = var3.field3931;
            var3.field3931 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 46)
    public static void method2037(byte arg0) {
        field4987 = null;
        field4982 = null;
        field4983 = null;
        field4984 = null;
        field4988 = null;
        if (arg0 == -15) {
            field4985 = null;
        }
    }
}
