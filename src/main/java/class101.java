import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class101 extends class657 {

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BIIIFIZI)[I")
    public static final int[] method941(byte arg0, int arg1, int arg2, int arg3, float arg4, int arg5, boolean arg6, int arg7) {
        ++field1811;
        int[] var8 = new int[arg1];
        class512 var9 = new class512();
        var9.field7121 = (int) (arg4 * 4096.0F);
        var9.field7136 = arg7;
        var9.field7122 = arg2;
        var9.field7132 = arg6;
        var9.field7130 = arg3;
        var9.field7128 = arg5;
        var9.method711(110);
        class334.method2113(1, arg1, (byte) 115);
        var9.method3001(0, var8, (byte) 115);
        if (arg0 < 89) {
            method943(72, -40);
        }
        return var8;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public final void method728(byte arg0) {
        ++field1808;
        if (arg0 == 87) {
            ;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIZI[Lat;)V")
    public static final void method942(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, class378[] arg5) {
        ++field1809;
        if (!arg0) {
            for (int var6 = 0; ~arg5.length < ~var6; ++var6) {
                class378 var7 = arg5[var6];
                if (var7 != null && var7.field5510 == arg1) {
                    class555.method3193(arg2, -326, var7, arg3, arg4);
                    class114.method1003((byte) 115, arg2, arg4, var7);
                    if (~var7.field5423 < ~(-var7.field5385 + var7.field5374)) {
                        var7.field5423 = var7.field5374 - var7.field5385;
                    }
                    if (var7.field5423 < 0) {
                        var7.field5423 = 0;
                    }
                    if (~var7.field5431 < ~(var7.field5467 - var7.field5465)) {
                        var7.field5431 = var7.field5467 - var7.field5465;
                    }
                    if (var7.field5431 < 0) {
                        var7.field5431 = 0;
                    }
                    if (~var7.field5450 == -1) {
                        class296.method1942(arg3, -116, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
    public final void method730(int arg0, int arg1, int arg2) {
        ++field1814;
        if (arg0 != 10756) {
            this.method735(-42, false);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    public static final void method943(int arg0, int arg1) {
        class651.field8951 = arg0;
        ++field1812;
        class425.field6121.method999(arg1);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V")
    public final void method735(int arg0, boolean arg1) {
        ++field1815;
        if (arg0 == 15192) {
            ;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILdu;I)V")
    public final void method736(int arg0, class357 arg1, int arg2) {
        super.field9010.method4097((byte) 81, arg1);
        ++field1810;
        super.field9010.method4144(true, arg0);
        if (arg2 == -16776) {
            ;
        }
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)Z")
    public final boolean method731(int arg0) {
        ++field1813;
        if (arg0 >= -57) {
            this.method731(-90);
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZB)V")
    public final void method734(boolean arg0, byte arg1) {
        ++field1807;
        if (arg1 != -103) {
            this.method736(-12, (class357) null, 67);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lwga;)V")
    public class101(class745 arg0) {
        super(arg0);
    }
}
