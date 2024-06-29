import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class595 {

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Ltf;")
    public static class264 field8419 = new class264(4, 3);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 5)
    public static void method3366(int arg0) {
        if (arg0 != 1197785896) {
            method3369(null, false);
        }
        field8419 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I", line = 15)
    public static final int method3367(int arg0, int arg1) {
        if (arg1 != 4) {
            method3366(-106);
        }
        field8418++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)[I", line = 37)
    public static final int[] method3368(byte arg0) {
        field8420++;
        int var1 = 4 / ((77 - arg0) / 32);
        return new int[] { class254.field3904, class132.field1956, class77.field1335 };
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lde;Z)I", line = 47)
    public static final int method3369(class491 arg0, boolean arg1) {
        if (arg1) {
            return 113;
        }
        field8417++;
        int var2 = arg0.field6994;
        class87 var3 = arg0.method2544(2);
        if (arg0.field6230) {
            var2 = arg0.field6997;
        } else if (arg0.field6226 == var3.field1418 || arg0.field6226 == var3.field1451 || arg0.field6226 == var3.field1433 || arg0.field6226 == var3.field1440) {
            var2 = arg0.field6979;
        } else if (arg0.field6226 == var3.field1414 || arg0.field6226 == var3.field1464 || arg0.field6226 == var3.field1454 || arg0.field6226 == var3.field1423) {
            var2 = arg0.field6961;
        }
        return var2;
    }
}
