import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class225 extends class54 {

    @OriginalMember(owner = "client!uj", name = "Mb", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!uj", name = "Nb", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!uj", name = "Ob", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!uj", name = "Qb", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!uj", name = "Rb", descriptor = "I")
    private int field3518;

    @OriginalMember(owner = "client!uj", name = "Sb", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!uj", name = "Tb", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!uj", name = "Vb", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!uj", name = "Wb", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!uj", name = "Xb", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!uj", name = "Ub", descriptor = "Ls;")
    private class162 field3521;

    @OriginalMember(owner = "client!uj", name = "Pb", descriptor = "[I")
    public static int[] field3516;

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V")
    public class225(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[I)V")
    public final void method1535(int arg0, int[] arg1) {
        ++field3515;
        this.field3521 = new class162(arg1);
        if (arg0 != 0) {
            this.field3518 = 107;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[BI)V")
    public final void method1536(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = 0;
        if (arg3 >= -118) {
            field3516 = null;
        }
        while (~var5 > ~arg0) {
            arg2[arg1 + var5] = (byte) (super.field848[super.field887++] + -this.field3521.method1090((byte) -106));
            ++var5;
        }
        ++field3523;
    }

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "(I)V")
    public static void method1537(int arg0) {
        field3516 = null;
        if (arg0 >= -68) {
            method1537(-66);
        }
    }

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "(B)V")
    public final void method1538(byte arg0) {
        super.field887 = (this.field3518 - -7) / 8;
        if (arg0 <= 59) {
            this.field3521 = null;
        }
        ++field3514;
    }

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "(I)I")
    public final int method1539(int arg0) {
        ++field3524;
        return arg0 != 255 ? -25 : super.field848[super.field887++] - this.field3521.method1090((byte) -106) & 255;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(IB)V")
    public final void method1540(int arg0, byte arg1) {
        ++field3520;
        super.field848[super.field887++] = (byte) (arg0 + this.field3521.method1090((byte) -106));
        if (arg1 != -2) {
            this.method1540(-58, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "(B)V")
    public final void method1541(byte arg0) {
        ++field3522;
        int var2 = -26 / ((arg0 - -34) / 55);
        this.field3518 = super.field887 * 8;
    }

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "(II)I")
    public final int method1542(int arg0, int arg1) {
        if (arg0 != 8) {
            return -111;
        } else {
            ++field3517;
            return arg1 * 8 + -this.field3518;
        }
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(IB)V")
    public static final void method1543(int arg0, byte arg1) {
        ++field3519;
        if (arg1 < 90) {
            method1537(6);
        }
        class286.field4383.method938(arg0, (byte) -123);
        class12.field183.method938(arg0, (byte) -123);
    }

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "(II)I")
    public final int method1544(int arg0, int arg1) {
        ++field3513;
        int var3 = this.field3518 >> 3;
        int var4 = 8 - (7 & this.field3518);
        this.field3518 += arg1;
        int var5 = 8 % ((arg0 - 27) / 44);
        int var6 = 0;
        while (~arg1 < ~var4) {
            var6 += (super.field848[var3++] & class126.field1855[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 != var4) {
            var7 = (super.field848[var3] >> var4 - arg1 & class126.field1855[arg1]) + var6;
        } else {
            var7 = (super.field848[var3] & class126.field1855[var4]) + var6;
        }
        return var7;
    }
}
