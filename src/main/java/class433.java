import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class433 {

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "[I")
    public static int[] field6356 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field6357 = 0;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "Lll;")
    public static class235 field6361;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "Ldv;")
    public static class451 field6358;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static final void method2532(int arg0) {
        field6360++;
        if (arg0 != -24632) {
            method2533(false);
        }
        class288 var1 = class33.field452;
        synchronized (class33.field452) {
            class33.field452.method1749((byte) -101);
        }
        class288 var2 = class93.field1667;
        synchronized (class93.field1667) {
            class93.field1667.method1749((byte) 127);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V")
    public static void method2533(boolean arg0) {
        field6358 = null;
        field6361 = null;
        if (arg0) {
            field6356 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
    public static final String[] method2534(String[] arg0, boolean arg1) {
        field6359++;
        if (!arg1) {
            return null;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }
}
