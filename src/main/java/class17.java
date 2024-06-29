import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class17 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[I")
    public static int[] field188 = new int[2];

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lc;")
    public static class436 field189;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
    public static boolean field185;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method99(int arg0) {
        field186++;
        int var1 = 69 / ((-arg0 - 29) / 63);
        class365 var2 = class121.field1383;
        synchronized (class121.field1383) {
            class121.field1383.method2290(13831);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static final void method100(int arg0) {
        field183++;
        int var1 = arg0;
        for (int var2 = 0; var2 < class22.field232; var2++) {
            for (int var3 = 0; var3 < class196.field2329; var3++) {
                if (class444.method2748((byte) -96, var2, var1, var3, true, class347.field4722)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static void method101(int arg0) {
        if (arg0 < 71) {
            field189 = null;
        }
        field188 = null;
        field189 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    public static final void method102(int arg0, int arg1) {
        class219.field2708.method2286(arg0, (byte) 36);
        field190++;
        if (arg1 != 0) {
            method101(21);
        }
    }
}
