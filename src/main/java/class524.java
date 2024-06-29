import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class524 extends class20 {

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "S")
    public short field7691;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "Lsb;")
    public static class264 field7687 = new class264("RC", 1);

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "Lf;")
    public static class701 field7695;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "[Lf;")
    public static class701[] field7696;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "(I)Z", line = 5)
    public final boolean method339(int arg0) {
        ++field7693;
        int var2 = 24 % ((arg0 - 51) / 47);
        return class616.field8849[(super.field530 >> class295.field3981) + -class591.field8564 + class119.field1526][(super.field531 >> class295.field3981) + -class33.field663 + class119.field1526];
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILr;IIIII)Lda;", line = 16)
    public static final class55 method3099(int arg0, class165 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 69) {
            method3099(-46, (class165) null, -27, 89, 92, 19, -67);
        }
        ++field7692;
        long var7 = (long) arg2;
        class55 var9 = (class55) class231.field3009.method2766(-123, var7);
        short var10 = 2055;
        if (var9 == null) {
            class173 var11 = class110.method797((byte) 104, 0, class123.field1589, arg2);
            if (var11 == null) {
                return null;
            }
            if (var11.field2137 < 13) {
                var11.method1097(2, (byte) -39);
            }
            var9 = arg1.method274(var11, var10, class280.field3805, 64, 768);
            class231.field3009.method2772(var9, true, var7);
        }
        class55 var12 = var9.method97((byte) 2, var10, true);
        if (arg5 != 0) {
            var12.method74(arg5);
        }
        if (arg0 != 0) {
            var12.method126(arg0);
        }
        if (~arg4 != -1) {
            var12.method91(arg4);
        }
        if (arg6 != 0) {
            var12.method64(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIII)V", line = 67)
    public class524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field531 = arg2;
        this.field7691 = (short) arg5;
        super.field532 = (byte) arg3;
        super.field527 = arg1;
        super.field535 = (byte) arg4;
        super.field530 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 80)
    public static void method3100(boolean arg0) {
        field7696 = null;
        field7687 = null;
        if (arg0) {
            field7694 = 123;
        }
        field7695 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([Lul;I)I", line = 92)
    public final int method340(class530[] arg0, int arg1) {
        ++field7688;
        if (arg1 != -1) {
            field7696 = null;
        }
        return this.method336(arg0, 124, super.field531 >> class295.field3981, super.field530 >> class295.field3981);
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)Z", line = 106)
    public final boolean method335(byte arg0) {
        int var2 = -64 / ((-19 - arg0) / 60);
        ++field7689;
        return class124.method860(super.field531 >> class295.field3981, false, super.field535, super.field530 >> class295.field3981);
    }
}
