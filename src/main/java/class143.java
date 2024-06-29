import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class143 {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field2362 = 0;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field2365 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Lme;")
    public static class295 field2361;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "[I")
    public static int[] field2363;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[Ltl;)[Ltl;", line = 6)
    public static final class59[] method1044(int arg0, class59[] arg1) {
        if (arg0 != -992) {
            return (class59[]) null;
        }
        field2360++;
        class59[] var2 = new class59[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class233.method1630(new class59[] { class81.method619((byte) -113, var3), class249.field4142 }, -2883);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class233.method1630(new class59[] { var2[var3], arg1[var3] }, -2883);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 32)
    public static void method1045(int arg0) {
        field2363 = null;
        if (arg0 != 11346) {
            field2361 = (class295) null;
        }
        field2361 = null;
    }
}
