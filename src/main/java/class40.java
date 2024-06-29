import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class40 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lha;")
    public static class46 field695 = class271.method1828("Update)2Liste geladen)3", -46);

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "J")
    public static volatile long field700 = 0L;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field698 = -2;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Laa;")
    public static class39 field696 = new class39();

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Z")
    public static boolean field701 = false;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[I")
    public static int[] field703 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILhi;)Lhi;")
    public static final class24 method271(int arg0, class24 arg1) {
        field702++;
        class24 var2 = client.method1818(arg1);
        if (var2 == null) {
            var2 = arg1.field443;
        }
        return arg0 < 71 ? null : var2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
    public static final void method272(int arg0, int arg1) {
        class89.field1691 = new int[arg1];
        if (arg0 != 0) {
            return;
        }
        class15.field228 = new int[arg1];
        class98.field1825 = new int[arg1];
        class102.field1860 = new int[arg1];
        class84.field1606 = new int[arg1];
        field699++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method273(int arg0) {
        if (arg0 != 7885) {
            method273(73);
        }
        field703 = null;
        field695 = null;
        field696 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
    public static final void method274(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field697++;
        if (class4.field70 <= arg0 && class70.field1205 >= arg0) {
            int var5 = class15.method77(arg2, class135.field2445, class73.field1309, -92);
            int var6 = class15.method77(arg4, class135.field2445, class73.field1309, -113);
            class264.method1778(var5, var6, arg3, 1878, arg0);
        }
        if (arg1 != 4) {
            method273(-14);
        }
    }
}
