import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class682 extends class675 {

    @OriginalMember(owner = "client!ag", name = "Hb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field9351 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ag", name = "Db", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!ag", name = "Fb", descriptor = "I")
    private int field9349;

    @OriginalMember(owner = "client!ag", name = "Gb", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!ag", name = "Ib", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!ag", name = "Jb", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!ag", name = "Kb", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!ag", name = "Lb", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!ag", name = "Mb", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!ag", name = "Nb", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!ag", name = "Ob", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!ag", name = "Pb", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!ag", name = "Qb", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!ag", name = "Tb", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!ag", name = "Ub", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!ag", name = "Rb", descriptor = "Llj;")
    public static class607 field9361;

    @OriginalMember(owner = "client!ag", name = "Eb", descriptor = "Lpea;")
    private class724 field9348;

    @OriginalMember(owner = "client!ag", name = "Sb", descriptor = "[Lu;")
    public static class73[] field9362;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "(I)V")
    public static final void method3818(int arg0) {
        ++field9354;
        if (arg0 != -5685) {
            field9361 = null;
        }
        for (class101 var1 = (class101) class400.field5666.method1176(24490); var1 != null; var1 = (class101) class400.field5666.method1178((byte) 71)) {
            class748.method4158(var1.field1202, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIIII)V")
    public static final void method3819(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9364;
        if (~arg2 <= ~class143.field2050 && ~class461.field6495 <= ~arg2) {
            int var5 = class24.method150(arg4, class71.field960, false, class549.field7665);
            int var6 = class24.method150(arg1, class71.field960, false, class549.field7665);
            class366.method2341(var5, arg2, (byte) 97, arg0, var6);
        }
        int var7 = 13 % ((arg3 - 36) / 62);
    }

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "(B)I")
    public final int method3820(byte arg0) {
        ++field9350;
        int var2 = super.field9154[super.field9146++] + -this.field9348.method4069(-94) & 255;
        if (arg0 != -21) {
            return 59;
        } else {
            return var2 < 128 ? var2 : (var2 + -128 << 8) + (super.field9154[super.field9146++] + -this.field9348.method4069(-19) & 255);
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(IB)I")
    public final int method3821(int arg0, byte arg1) {
        if (arg1 != 108) {
            this.method3821(-105, (byte) -1);
        }
        ++field9357;
        int var3 = this.field9349 >> 3;
        int var4 = -(this.field9349 & 7) + 8;
        this.field9349 += arg0;
        int var5 = 0;
        while (~var4 > ~arg0) {
            var5 += (class221.field2885[var4] & super.field9154[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (super.field9154[var3] & class221.field2885[var4]) + var5;
        } else {
            var6 = (super.field9154[var3] >> var4 - arg0 & class221.field2885[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
    public class682(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "(B)Z")
    public final boolean method3822(byte arg0) {
        ++field9360;
        int var2 = 111 / ((arg0 - 23) / 57);
        int var3 = super.field9154[super.field9146] - this.field9348.method4071(256) & 255;
        return ~var3 <= -129;
    }

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "(B)V")
    public static void method3823(byte arg0) {
        int var1 = -5 % ((-49 - arg0) / 47);
        field9362 = null;
        field9361 = null;
        field9351 = null;
    }

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "(II)V")
    public final void method3824(int arg0, int arg1) {
        if (arg0 != -16073) {
            method3825(-33, -72, 30);
        }
        super.field9154[super.field9146++] = (byte) (arg1 + this.field9348.method4069(arg0 + 16188));
        ++field9355;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)Lnu;")
    public static final class592 method3825(int arg0, int arg1, int arg2) {
        ++field9359;
        class592 var3 = (class592) class542.field7579.method1180((byte) 26, (long) arg2 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class592(arg1, arg2);
            class542.field7579.method1179(var3.field2546, var3, (byte) -26);
        }
        return arg0 != -652872096 ? null : var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lpea;I)V")
    public final void method3826(class724 arg0, int arg1) {
        this.field9348 = arg0;
        if (arg1 != 12693) {
            this.method3822((byte) -86);
        }
        ++field9352;
    }

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "(B)V")
    public final void method3827(byte arg0) {
        super.field9146 = (this.field9349 - -7) / 8;
        if (arg0 <= 103) {
            method3823((byte) 93);
        }
        ++field9347;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([II)V")
    public final void method3828(int[] arg0, int arg1) {
        if (arg1 != -16797) {
            this.method3829(-93, 48);
        }
        ++field9358;
        this.field9348 = new class724(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "(II)I")
    public final int method3829(int arg0, int arg1) {
        if (arg1 != -3) {
            field9361 = null;
        }
        ++field9353;
        return arg0 * 8 + -this.field9349;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZII[B)V")
    public final void method3830(boolean arg0, int arg1, int arg2, byte[] arg3) {
        for (int var5 = 0; var5 < arg2; ++var5) {
            arg3[arg1 + var5] = (byte) (super.field9154[super.field9146++] + -this.field9348.method4069(-107));
        }
        ++field9356;
        if (!arg0) {
            method3823((byte) -73);
        }
    }

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "(I)V")
    public final void method3831(int arg0) {
        ++field9363;
        this.field9349 = super.field9146 * 8;
        if (arg0 != 7) {
            method3818(-83);
        }
    }
}
