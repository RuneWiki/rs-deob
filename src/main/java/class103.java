import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class103 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
    public static boolean field1598 = true;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Llb;")
    public static class130 field1597 = new class130();

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Lii;")
    public static class256 field1600;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "[[I")
    public static int[][] field1601;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static final void method681(byte arg0) {
        field1599++;
        if (class59.field831 > 0) {
            class147.method984((byte) 101);
            return;
        }
        class53.field733 = class240.field3833;
        if (arg0 != -107) {
            field1601 = null;
        }
        class240.field3833 = null;
        class245.method1650(40, (byte) -75);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method682(int arg0) {
        field1601 = null;
        int var1 = -43 % ((-arg0 - 55) / 43);
        field1597 = null;
        field1600 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lac;BLac;)V")
    public static final void method683(class135 arg0, byte arg1, class135 arg2) {
        field1596++;
        if (arg0.field1959 != null) {
            arg0.method912(-121);
        }
        if (arg1 > -114) {
            method683((class135) null, (byte) 126, (class135) null);
        }
        arg0.field1955 = arg2.field1955;
        arg0.field1959 = arg2;
        arg0.field1959.field1955 = arg0;
        arg0.field1955.field1959 = arg0;
    }
}
