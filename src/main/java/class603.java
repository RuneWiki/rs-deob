import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class603 extends class201 {

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "[I")
    public static int[] field8667 = new int[8];

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "Ljn;")
    public static class117 field8668 = new class117(260);

    @OriginalMember(owner = "client!rn", name = "T", descriptor = "I")
    public static int field8672 = 999999;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
    public int field8662;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!rn", name = "R", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!rn", name = "S", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!rn", name = "U", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "Lvm;")
    public class195 field8663;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "[B")
    public byte[] field8665;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(CI)Z")
    public static final boolean method3431(char arg0, int arg1) {
        ++field8669;
        if (~arg0 <= -33 && ~arg0 >= -127) {
            return true;
        } else if (~arg0 <= -161 && ~arg0 >= -256) {
            return true;
        } else {
            if (arg1 >= -107) {
                field8672 = 79;
            }
            return arg0 == 8364 || ~arg0 == -339 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lrd;")
    public static final class461 method3432(Throwable arg0, String arg1) {
        ++field8673;
        class461 var2;
        if (!(arg0 instanceof class461)) {
            var2 = new class461(arg0, arg1);
        } else {
            var2 = (class461) arg0;
            var2.field6632 = var2.field6632 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)I")
    public final int method1402(int arg0) {
        ++field8666;
        if (super.field3107) {
            return 0;
        } else {
            if (arg0 != 100) {
                this.method1402(-76);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)I")
    public static final int method3433(int arg0, int arg1, int arg2, int arg3) {
        ++field8671;
        if (class687.field9745 == null) {
            return 0;
        } else {
            int var4 = arg2 >> 9;
            int var5 = arg0 >> 9;
            if (~var4 <= -1 && ~var5 <= -1 && class430.field6136 - 1 >= var4 && class580.field8504 + -1 >= var5) {
                int var6 = arg1;
                if (~arg1 > -4 && (2 & class548.field8052[1][var4][var5]) != 0) {
                    var6 = arg1 + 1;
                }
                if (arg3 >= -28) {
                    field8668 = null;
                }
                return class687.field9745[var6].method3861((byte) -79, arg2, arg0);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
    public static void method3434(boolean arg0) {
        field8667 = null;
        if (arg0) {
            method3431((char) 65441, -31);
        }
        field8668 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)[B")
    public final byte[] method1400(int arg0) {
        ++field8670;
        if (arg0 != 32) {
            return null;
        } else if (super.field3107) {
            throw new RuntimeException();
        } else {
            return this.field8665;
        }
    }
}
