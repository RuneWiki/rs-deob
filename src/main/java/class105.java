import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class105 {

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public static int field1751 = 0;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "Z")
    public static boolean field1749 = false;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "Lkba;")
    public class105 field1746;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "Lkba;")
    public class105 field1750;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "Laga;")
    public static class663 field1752;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(B)V")
    public static final void method906(byte arg0) {
        field1747++;
        int var1 = 92 / ((-arg0 - 55) / 61);
        if (class688.field9704 == null) {
            return;
        }
        class549[] var2 = class688.field9704;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class549 var4 = var2[var3];
            var4.method1634(false);
        }
    }

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
    public static void method907(int arg0) {
        field1752 = null;
        if (arg0 >= -91) {
            field1752 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZI)Les;")
    public static final class380 method908(int arg0, boolean arg1, int arg2) {
        if (arg0 != 0) {
            field1749 = false;
        }
        field1748++;
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
        return (class380) class416.field5830.method4203(true, var3);
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V")
    public final void method909(int arg0) {
        field1753++;
        if (this.field1746 == null) {
            return;
        }
        this.field1746.field1750 = this.field1750;
        this.field1750.field1746 = this.field1746;
        this.field1750 = null;
        this.field1746 = null;
        int var2 = 122 / ((-arg0 - 47) / 43);
    }
}
