import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class642 extends class278 {

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "[Luaa;")
    public class436[] field9083;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Lps;")
    public static class469 field9081 = new class469(6, 7);

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "[Lhs;")
    public static class589[] field9080;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static final void method3608(int arg0) {
        field9082++;
        class403.field5401.method80((byte) -64);
        if (arg0 != 1188163656) {
            field9080 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)I")
    public static final int method3609(byte arg0, int arg1) {
        int var2 = 20 % ((80 - arg0) / 40);
        field9079++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public static void method3610(int arg0) {
        if (arg0 != 6) {
            field9081 = null;
        }
        field9081 = null;
        field9080 = null;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "([Luaa;)V")
    public class642(class436[] arg0) {
        this.field9083 = arg0;
    }
}
