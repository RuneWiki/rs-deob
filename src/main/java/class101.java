import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class101 {

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1788 = 0;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Z")
    public static boolean field1787 = false;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
    public static boolean field1789 = false;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lsb;")
    public static class98 field1785 = class47.method368("Eingabeprozedur geladen)3", 0);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lbj;")
    public static class80 field1794;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lsb;I)I")
    public static final int method779(class98 arg0, int arg1) {
        field1793++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class99.field1751; var2++) {
            if (arg0.method731((byte) -54, class49.field817[var2])) {
                return var2;
            }
        }
        if (arg1 != -1) {
            field1790 = 32;
        }
        return -1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method780(int arg0) {
        field1785 = null;
        field1794 = null;
        if (arg0 != 0) {
            method781((class75) null, -14);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ltg;I)V")
    public static final void method781(class75 arg0, int arg1) {
        field1791++;
        class129.field2297 = arg0.method564(class105.field1864, -14783);
        if (arg1 != -1) {
            method780(-14);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static final void method782(byte arg0) {
        field1795++;
        class23.field464.method1554((byte) -109);
        class255.field4528.method1554((byte) -109);
        if (arg0 < -21) {
            class255.field4509.method1554((byte) -109);
            class116.field2074.method1554((byte) -109);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)I")
    public static final int method783(byte arg0) {
        field1796++;
        if (arg0 >= -39) {
            field1785 = null;
        }
        return class8.field188;
    }
}
