import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class600 {

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field8661 = 0;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "[Lqp;")
    public static class441[] field8657 = new class441[35];

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lfh;")
    public class600 field8656;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lfh;")
    public class600 field8658;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public static void method3419(int arg0) {
        field8657 = null;
        if (arg0 != 0) {
            method3420(null, true, true);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
    public static final byte[] method3420(Object arg0, boolean arg1, boolean arg2) {
        field8660++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class484.method2825(var3, -122) : var3;
        } else if (arg0 instanceof class691) {
            class691 var4 = (class691) arg0;
            return var4.method3365((byte) -68);
        } else {
            if (arg1) {
                method3419(24);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
    public final void method3421(int arg0) {
        field8659++;
        if (this.field8658 == null) {
            return;
        }
        this.field8658.field8656 = this.field8656;
        if (arg0 != 3) {
            field8661 = 21;
        }
        this.field8656.field8658 = this.field8658;
        this.field8656 = null;
        this.field8658 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
    public static final void method3422(int arg0, int arg1) {
        class293 var2 = class541.field7946[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class293 var4 = class541.field7946[var3][arg0][arg1] = class541.field7946[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class198 var5 = var4.field4097; var5 != null; var5 = var5.field3078) {
                    class144 var6 = var5.field3085;
                    if (var6.field2481 == arg0 && var6.field2484 == arg1) {
                        var6.field3158--;
                    }
                }
                if (var4.field4084 != null) {
                    var4.field4084.field3158--;
                }
                if (var4.field4091 != null) {
                    var4.field4091.field3158--;
                }
                if (var4.field4095 != null) {
                    var4.field4095.field3158--;
                }
                if (var4.field4093 != null) {
                    var4.field4093.field3158--;
                }
                if (var4.field4090 != null) {
                    var4.field4090.field3158--;
                }
            }
        }
        if (class541.field7946[0][arg0][arg1] == null) {
            class541.field7946[0][arg0][arg1] = new class293(0);
            class541.field7946[0][arg0][arg1].field4101 = 1;
        }
        class541.field7946[0][arg0][arg1].field4098 = var2;
        class541.field7946[3][arg0][arg1] = null;
    }
}
