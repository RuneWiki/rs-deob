import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class35 {

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Lhd;")
    public static class595 field498 = new class595();

    @OriginalMember(owner = "client!it", name = "e", descriptor = "[I")
    public static int[] field501 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "[[[Z")
    public static boolean[][][] field502;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Lgfa;")
    public static final class753 method246(int arg0) {
        field499++;
        if (class531.field7437 == null || class120.field1649 == null) {
            return null;
        }
        class753 var1 = (class753) class120.field1649.method313(1000);
        if (arg0 != -8156) {
            return null;
        }
        while (var1 != null) {
            class185 var2 = class531.field7421.method1971(var1.field10459, -23851);
            if (var2 != null && var2.field2704 && var2.method1242(class531.field7422, (byte) -55)) {
                return var1;
            }
            var1 = (class753) class120.field1649.method313(1000);
        }
        return null;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public static void method247(int arg0) {
        field502 = null;
        field498 = null;
        field501 = null;
        if (arg0 != 19758) {
            field498 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lvj;I)Ldf;")
    public static final class621 method248(class26 arg0, int arg1) {
        field497++;
        if (arg1 == 2447) {
            class555 var2 = class456.method2740(-123, arg0);
            int var3 = arg0.method173(-3);
            return new class621(var2.field9569, var2.field9563, var2.field9562, var2.field9570, var2.field9575, var2.field9561, var2.field9568, var2.field9572, var2.field9571, var2.field7831, var2.field7827, var2.field7834, var2.field7832, var2.field7837, var2.field7833, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lwu;IZ)Lue;")
    public static final class191 method249(class557 arg0, int arg1, boolean arg2) {
        field500++;
        if (!arg2) {
            field501 = null;
        }
        byte[] var3 = arg0.method3318(8941, arg1);
        return var3 == null ? null : new class191(var3);
    }
}
