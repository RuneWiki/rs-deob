import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class99 {

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "[S")
    public static short[] field79 = new short[] { 11, 26, 28, 47, 41, 44, 35, 10 };

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "Lha;")
    public static class46 field89 = class271.method1828("leuchten2:", -46);

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Lbj;")
    public static class190 field77;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "Lhi;")
    public static class24 field81;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Lkb;")
    public class73 field88;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "[B")
    public byte[] field80;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "[S")
    public static short[] field84;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
    public static final void method17(byte arg0) {
        ++field87;
        for (class269 var1 = (class269) class154.field2719.method264(-92); var1 != null; var1 = (class269) class154.field2719.method269((byte) 7)) {
            if (var1.field4665) {
                var1.method1800(0);
            }
        }
        if (arg0 == -14) {
            for (class269 var2 = (class269) class6.field101.method264(-82); var2 != null; var2 = (class269) class6.field101.method269((byte) 7)) {
                if (var2.field4665) {
                    var2.method1800(arg0 + 14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static final void method18(boolean arg0) {
        ++field82;
        if (arg0) {
            class129.field2361.method84(-32377);
            class152.field2698.method84(-32377);
            class142.field2589.method84(-32377);
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
    public static void method19(int arg0) {
        field79 = null;
        if (arg0 >= -103) {
            field77 = null;
        }
        field84 = null;
        field77 = null;
        field89 = null;
        field81 = null;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)[B")
    public final byte[] method20(int arg0) {
        ++field86;
        if (super.field1834) {
            throw new RuntimeException();
        } else {
            return arg0 >= -95 ? null : this.field80;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)I")
    public final int method21(int arg0) {
        ++field83;
        if (arg0 < 95) {
            method18(true);
        }
        return super.field1834 ? 0 : 100;
    }
}
