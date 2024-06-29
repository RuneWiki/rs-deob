import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class276 extends class157 {

    @OriginalMember(owner = "client!je", name = "H", descriptor = "Ljc;")
    public static class303 field4063 = new class303("LIVE", 0);

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Lbf;")
    public static class372 field4068 = new class372(5, 14);

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field4070 = 0;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Lbf;")
    public static class372 field4069 = new class372(14, 7);

    @OriginalMember(owner = "client!je", name = "L", descriptor = "B")
    public byte field4067;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Lsv;")
    public static class468 field4060;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Liv;")
    public class65 field4064;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1774(int arg0, byte arg1, int arg2) {
        if (arg1 <= 77) {
            field4069 = null;
        }
        ++field4062;
        return (65536 & arg2) != 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)I")
    public final int method1122(int arg0) {
        if (arg0 <= 23) {
            return 110;
        } else {
            ++field4066;
            return this.field4064 == null ? 0 : this.field4064.field827 * 100 / (this.field4064.field783.length + -this.field4067);
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public static void method1775(int arg0) {
        field4063 = null;
        field4068 = null;
        field4069 = null;
        field4060 = null;
        int var1 = 106 % ((-57 - arg0) / 51);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)[B")
    public final byte[] method1123(boolean arg0) {
        ++field4061;
        if (arg0) {
            return null;
        } else if (!super.field2230 && this.field4064.field827 >= this.field4064.field783.length - this.field4067) {
            return this.field4064.field783;
        } else {
            throw new RuntimeException();
        }
    }
}
