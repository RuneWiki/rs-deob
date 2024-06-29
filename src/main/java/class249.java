import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class249 extends class114 {

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field3890 = 0;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field3891 = 0;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field3894 = 0;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field3895 = 0;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field3889 = -1;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field3897 = 0;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "Lnh;")
    public static class305 field3892;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V")
    public static final void method1623(int arg0) {
        ++field3893;
        if (arg0 != 1217) {
            method1623(-94);
        }
        for (int var1 = -1; var1 < class171.field2437; ++var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class160.field2235[var1];
            }
            class314 var3 = class48.field689[var2];
            if (var3 != null) {
                class195.method1234((byte) 66, var3, var3.method1683(-81));
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "(I)V")
    public static void method1624(int arg0) {
        if (arg0 >= -45) {
            field3889 = 31;
        }
        field3892 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            field3890 = -40;
        }
        ++field3896;
        int[] var3 = super.field1630.method302(arg0, -121);
        if (super.field1630.field710) {
            class285.method1877(var3, 0, class145.field2009, class159.field2209[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class249() {
        super(0, true);
    }
}
