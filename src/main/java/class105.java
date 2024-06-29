import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class105 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lvp;")
    public static class123 field1520 = new class123();

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "[[B")
    public static byte[][] field1525 = new byte[1000][];

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Ltr;")
    public static class191 field1524;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lic;")
    public static class491 field1522;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Z")
    public boolean field1518;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lqa;Lwc;B)I")
    public static final int method650(class162 arg0, class47 arg1, byte arg2) {
        field1521++;
        if (arg1.field745 != -1) {
            return arg1.field745;
        }
        if (arg1.field755 != -1) {
            class321 var3 = arg0.field2379.method838(true, arg0.method1073() ? arg1.field755 : arg1.field758);
            if (!var3.field4593) {
                return var3.field4602;
            }
        }
        if (arg2 != -53) {
            field1525 = null;
        }
        return arg1.field759;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method651(int arg0) {
        field1522 = null;
        field1520 = null;
        field1524 = null;
        field1525 = null;
        if (arg0 != -1) {
            method651(21);
        }
    }
}
