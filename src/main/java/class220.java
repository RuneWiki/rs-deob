import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class220 {

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    private int field3710 = 0;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Luj;")
    private class132 field3702;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lob;")
    private class134 field3705;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lnd;")
    public static class191 field3703;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Lob;")
    public final class134 method1563(byte arg0) {
        this.field3710 = 0;
        field3706++;
        return arg0 > -103 ? null : this.method1564(-1);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Lob;")
    public final class134 method1564(int arg0) {
        field3707++;
        if (arg0 > ~this.field3710 && this.field3702.field2175[this.field3710 - 1] != this.field3705) {
            class134 var2 = this.field3705;
            this.field3705 = var2.field2209;
            return var2;
        }
        while (this.field3710 < this.field3702.field2180) {
            class134 var3 = this.field3702.field2175[this.field3710++].field2209;
            if (this.field3702.field2175[this.field3710 - 1] != var3) {
                this.field3705 = var3.field2209;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
    public static final void method1565(int arg0, boolean arg1) {
        field3708++;
        if (arg0 == -1 || !class169.field2730[arg0]) {
            return;
        }
        class90.field1483.method1129(arg0, false);
        if (class208.field3515[arg0] == null) {
            return;
        }
        boolean var2 = arg1;
        for (int var3 = 0; var3 < class208.field3515[arg0].length; var3++) {
            if (class208.field3515[arg0][var3] != null) {
                if (class208.field3515[arg0][var3].field3376 == 2) {
                    var2 = false;
                } else {
                    class208.field3515[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class208.field3515[arg0] = null;
        }
        class169.field2730[arg0] = false;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public static final void method1566(byte arg0) {
        class34.field537.method94(34);
        if (arg0 >= -18) {
            field3703 = null;
        }
        field3709++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method1567(int arg0) {
        field3703 = null;
        if (arg0 < 25) {
            field3704 = -2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Luj;)V")
    public class220(class132 arg0) {
        this.field3702 = arg0;
    }
}
