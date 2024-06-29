import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class356 extends class223 {

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "Lcq;")
    public static class110 field4782 = new class110(73, 2);

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "B")
    public byte field4778;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "Lnp;")
    public class115 field4783;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "[Lf;")
    public static class534[] field4786;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V")
    public static void method2098(byte arg0) {
        field4782 = null;
        if (arg0 != 106) {
            method2098((byte) -45);
        }
        field4786 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BZI)Ljava/lang/String;")
    public static final String method2099(byte arg0, boolean arg1, int arg2) {
        ++field4779;
        if (arg0 < 5) {
            return null;
        } else {
            return arg1 && arg2 >= 0 ? class130.method736(arg1, 6178, arg2, 10) : Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)[B")
    public final byte[] method1349(int arg0) {
        ++field4781;
        if (arg0 >= -16) {
            return null;
        } else if (!super.field2767 && ~this.field4783.field1218 <= ~(this.field4783.field1269.length + -this.field4778)) {
            return this.field4783.field1269;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BI)I")
    public static final int method2100(byte arg0, int arg1) {
        if (arg0 != -45) {
            field4782 = null;
        }
        ++field4784;
        if (~arg1 != -6407) {
            if (arg1 != 6409) {
                if (arg1 != 32841) {
                    if (arg1 == 6410) {
                        return 2;
                    } else if (~arg1 == -6408) {
                        return 3;
                    } else if (arg1 == 6408) {
                        return 4;
                    } else {
                        throw new IllegalArgumentException("");
                    }
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)I")
    public final int method1351(byte arg0) {
        ++field4780;
        int var2 = -51 / ((-53 - arg0) / 47);
        return this.field4783 == null ? 0 : this.field4783.field1218 * 100 / (this.field4783.field1269.length - this.field4778);
    }
}
