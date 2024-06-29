import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class606 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public int field8794 = 128;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field8804 = 128;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public int field8799;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public int field8806;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public int field8800;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field8802;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
    public static boolean field8795 = false;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "J")
    public static long field8796;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILha;IIIILwc;III)V")
    public static final void method3505(int arg0, int arg1, int arg2, class58 arg3, int arg4, int arg5, int arg6, int arg7, class66 arg8, int arg9, int arg10, int arg11) {
        if (arg9 > arg10 && arg9 < arg5 + arg10 && arg7 > arg11 - 13 && arg11 + 3 > arg7 && arg8.field1195) {
            arg6 = arg1;
        }
        field8801++;
        int[] var12 = null;
        if (class449.method2676(arg8.field1198, 113)) {
            var12 = class558.field7942.method721(-75, (int) arg8.field1194).field3672;
        } else if (arg8.field1191 != -1) {
            var12 = class558.field7942.method721(-95, arg8.field1191).field3672;
        } else if (class237.method1607(113, arg8.field1198)) {
            class272 var15 = (class272) class758.field10539.method4203(true, (long) ((int) arg8.field1194));
            if (var15 != null) {
                class84 var16 = var15.field3885;
                class488 var17 = var16.field1523;
                if (var17.field6923 != null) {
                    var17 = var17.method2926(8730, class742.field10408);
                }
                if (var17 != null) {
                    var12 = var17.field6935;
                }
            }
        } else if (class56.method513(arg8.field1198, (byte) 51)) {
            Object var13 = null;
            class414 var14;
            if (arg8.field1198 == 1012) {
                var14 = class66.field1181.method131(2, (int) arg8.field1194);
            } else {
                var14 = class66.field1181.method131(2, (int) (arg8.field1194 >>> 32 & 0x7FFFFFFFL));
            }
            if (var14.field5720 != null) {
                var14 = var14.method2513(class742.field10408, true);
            }
            if (var14 != null) {
                var12 = var14.field5727;
            }
        }
        String var18 = class439.method2636((byte) 106, arg8);
        if (var12 != null) {
            var18 = var18 + class387.method2418(var12, (byte) -104);
        }
        class537.field7568.method664(arg6, 0, arg10 + 3, arg11, var18, class698.field9810, class610.field8827, 127);
        if (arg8.field1196) {
            class388.field5429.method4135(arg10 - (-class419.field5896.method2075(false, var18) - 5), arg11 + -12);
        }
        int var19 = 52 % ((28 - arg0) / 58);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Lpe;")
    public final class606 method3506(byte arg0) {
        if (arg0 != 95) {
            this.field8804 = -84;
        }
        field8805++;
        return new class606(this.field8799, this.field8804, this.field8794, this.field8802, this.field8806, this.field8800);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(FIFF)F")
    public static final float method3507(float arg0, int arg1, float arg2, float arg3) {
        field8798++;
        if (arg1 != -5) {
            field8795 = false;
        }
        return (arg0 - arg3) * arg2 + arg3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILpe;)V")
    public final void method3508(int arg0, class606 arg1) {
        field8803++;
        this.field8800 = arg1.field8800;
        this.field8802 = arg1.field8802;
        this.field8794 = arg1.field8794;
        this.field8804 = arg1.field8804;
        this.field8799 = arg1.field8799;
        if (arg0 == 128) {
            this.field8806 = arg1.field8806;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
    public static final int method3509(int arg0, int arg1, int arg2) {
        if (arg0 <= 49) {
            field8796 = 84L;
        }
        field8797++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V")
    public class606(int arg0) {
        this.field8799 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIII)V")
    private class606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8794 = arg2;
        this.field8806 = arg4;
        this.field8800 = arg5;
        this.field8802 = arg3;
        this.field8799 = arg0;
        this.field8804 = arg1;
    }
}
