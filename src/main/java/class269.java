import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class269 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field3772 = 0;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public int field3771 = 0;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lpja;")
    private class43 field3777 = new class43(64);

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lpu;")
    private class589 field3782 = null;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lgj;")
    private class662 field3776;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lgj;")
    private class662 field3773;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3770 = -1;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[S")
    public static short[] field3774 = new short[256];

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "[I")
    public static int[] field3780;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lbda;")
    public final class533 method1747(int arg0, int arg1) {
        field3778++;
        class533 var3 = (class533) this.field3777.method266((byte) -127, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        if (arg0 != 1) {
            method1749(-64);
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field3773.method3732(arg1 & 0x7FFF, arg0 + 8905, 1);
        } else {
            var4 = this.field3776.method3732(arg1, 8906, 1);
        }
        class533 var5 = new class533();
        var5.field7212 = this;
        if (var4 != null) {
            var5.method3028(2, new class93(var4));
        }
        if (arg1 >= 32768) {
            var5.method3029(32768);
        }
        this.field3777.method270(var5, (long) arg1, -123);
        return var5;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)Llt;")
    public static final class704 method1748(byte arg0) {
        field3775++;
        int var1 = 90 / ((-arg0 - 8) / 33);
        class704 var2 = (class704) class84.field1147.method1591((byte) 98);
        if (var2 == null) {
            return new class704();
        } else {
            class478.field6465--;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1749(int arg0) {
        field3780 = null;
        if (arg0 > -23) {
            method1750(126, 71, 72, 41, null, -125, -8, 32, -61, null, -107, -93);
        }
        field3774 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIILv;IIIILha;II)V")
    public static final void method1750(int arg0, int arg1, int arg2, int arg3, class606 arg4, int arg5, int arg6, int arg7, int arg8, class66 arg9, int arg10, int arg11) {
        field3779++;
        if (arg6 <= 120) {
            field3774 = null;
        }
        if (arg3 > arg10 && (arg8 + arg10) > arg3 && arg0 > (arg2 - 13) && arg2 + 3 > arg0) {
            arg5 = arg11;
        }
        String var12 = class480.method2753((byte) -62, arg4);
        class557.field7861.method608(arg10 + 3, arg2, class201.field3054, var12, 0, arg5, 0, class146.field2462);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(JBLwg;[I)Ljava/lang/String;")
    public final String method1751(long arg0, byte arg1, class450 arg2, int[] arg3) {
        field3781++;
        if (this.field3782 != null) {
            String var6 = this.field3782.method75(arg0, true, arg3, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        int var7 = -104 % ((arg1 - 35) / 55);
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ILgj;Lgj;Lpu;)V")
    public class269(int arg0, class662 arg1, class662 arg2, class589 arg3) {
        this.field3782 = arg3;
        this.field3776 = arg1;
        this.field3773 = arg2;
        if (this.field3776 != null) {
            this.field3772 = this.field3776.method3730((byte) 32, 1);
        }
        if (this.field3773 != null) {
            this.field3771 = this.field3773.method3730((byte) -118, 1);
        }
    }
}
