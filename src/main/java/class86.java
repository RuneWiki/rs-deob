import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class86 {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field1451 = 0;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[Lvi;")
    public static class197[] field1450 = new class197[32768];

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[Z")
    public static boolean[] field1454 = new boolean[200];

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lmb;")
    public static class96 field1449 = class243.method1708("Titelbild geladen)3", (byte) 93);

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Z")
    public static boolean field1453 = false;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "[I")
    public static int[] field1452;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILrg;)V")
    private final void method622(int arg0, int arg1, class239 arg2) {
        if (arg0 == 5) {
            this.field1451 = arg2.method1663((byte) -72);
        }
        field1447++;
        if (arg1 != 0) {
            field1454 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method623(int arg0) {
        field1449 = null;
        field1452 = null;
        field1450 = null;
        field1454 = null;
        if (arg0 != 5) {
            field1453 = true;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    public static final void method624(int arg0, int arg1) {
        field1448++;
        class43 var2 = class270.method1847(arg0, -10277, 6);
        var2.method339(true);
        if (arg1 < 24) {
            field1449 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILrg;)V")
    public final void method625(int arg0, class239 arg1) {
        while (true) {
            int var3 = arg1.method1651(4139);
            if (var3 == 0) {
                field1446++;
                if (arg0 != 0) {
                    field1452 = null;
                    return;
                }
                return;
            }
            this.method622(var3, 0, arg1);
        }
    }
}
