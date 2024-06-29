import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class6 {

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field75 = "Please remove ";

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public static int[] field73;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public static final void method55(int arg0, int arg1, int arg2) {
        int var3 = class188.field2789 * arg2 >> 8;
        field72++;
        if (arg0 != 1787537640) {
            method55(-109, -11, -40);
        }
        if (arg1 == -1 && !class233.field3601) {
            class258.method1737((byte) 127);
        } else if (arg1 != -1 && (class175.field2558 != arg1 || !class145.method988(122)) && var3 != 0 && !class233.field3601) {
            class278.method1853(var3, false, arg1, 0, true, 2, class220.field3404);
        }
        class175.field2558 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lca;IB)V")
    public static final void method56(class54 arg0, int arg1, byte arg2) {
        field77++;
        if (arg2 != -19) {
            field75 = null;
        }
        if (class185.field2703 == null) {
            return;
        }
        try {
            class185.field2703.method955(0L, 23010);
            class185.field2703.method959(arg0.field848, arg1, true, 24);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)I")
    public static final int method57(boolean arg0, int arg1) {
        if (!arg0) {
            method57(true, 25);
        }
        field76++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)I")
    public static final int method58(int arg0, byte arg1) {
        int var2 = 110 / ((-arg1 - 72) / 37);
        field74++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method59(byte arg0) {
        field73 = null;
        if (arg0 == -117) {
            field75 = null;
        }
    }
}
