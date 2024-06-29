import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class104 extends class264 {

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "[[I")
    public static int[][] field1296 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            field1296 = null;
        }
        ++field1303;
        if (super.field3731.method3633(92)) {
            return 2;
        } else {
            return super.field3731.field9002.method2259(-1) && class329.method2127((byte) -127, super.field3731.field9002.method2258((byte) -64)) ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Z")
    public final boolean method710(int arg0) {
        ++field1297;
        if (arg0 != 14996) {
            field1296 = null;
        }
        return !super.field3731.method3633(arg0 ^ 15087);
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(ILmfa;)V")
    public class104(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lmfa;)V")
    public class104(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)Z")
    public static final boolean method711(int arg0, byte arg1) {
        ++field1299;
        int var2 = -40 / ((arg1 - 21) / 43);
        return arg0 == 7 || ~arg0 == -10;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)I")
    public final int method712(byte arg0) {
        ++field1301;
        if (arg0 > -31) {
            this.method712((byte) 87);
        }
        return super.field3733;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        int var2 = 114 / ((1 - arg0) / 41);
        ++field1300;
        if (super.field3731.method3633(102)) {
            super.field3733 = 2;
        }
        if (~super.field3733 > -1 || ~super.field3733 < -3) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field1298;
        if (super.field3731.method3633(83)) {
            return 3;
        } else {
            return arg0 != 112 ? -14 : 1;
        }
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)V")
    public static void method713(int arg0) {
        if (arg0 <= -40) {
            field1296 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        ++field1302;
        super.field3733 = arg1;
        if (arg0 > -114) {
            method713(86);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIII)V")
    public static final void method714(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1304;
        if (arg1 >= 118) {
            class678 var5 = class630.method3597(29636, 19, (long) arg2 << 32 | (long) arg3);
            var5.method3834((byte) 102);
            var5.field9649 = arg4;
            var5.field9639 = arg0;
        }
    }
}
