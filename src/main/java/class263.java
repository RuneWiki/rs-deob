import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class263 extends class31 {

    @OriginalMember(owner = "client!jl", name = "Gb", descriptor = "I")
    public static int field4169 = -1;

    @OriginalMember(owner = "client!jl", name = "Cb", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!jl", name = "Db", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!jl", name = "Eb", descriptor = "I")
    private int field4167;

    @OriginalMember(owner = "client!jl", name = "Hb", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!jl", name = "Ib", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!jl", name = "Kb", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!jl", name = "Lb", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!jl", name = "Mb", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!jl", name = "Nb", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!jl", name = "Ob", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!jl", name = "Fb", descriptor = "Lfh;")
    public static class136 field4168;

    @OriginalMember(owner = "client!jl", name = "Jb", descriptor = "Lec;")
    private class24 field4172;

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
    public class263(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(IZ)V")
    public final void method1762(int arg0, boolean arg1) {
        super.field560[super.field541++] = (byte) (this.field4172.method209(27244) + arg0);
        if (arg1) {
            ++field4165;
        }
    }

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "(I)V")
    public final void method1763(int arg0) {
        if (arg0 != -1) {
            this.field4167 = 41;
        }
        this.field4167 = super.field541 * 8;
        ++field4177;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[BIZ)V")
    public final void method1764(int arg0, byte[] arg1, int arg2, boolean arg3) {
        for (int var5 = 0; ~arg2 < ~var5; ++var5) {
            arg1[arg0 + var5] = (byte) (super.field560[super.field541++] + -this.field4172.method209(27244));
        }
        if (arg3) {
            ++field4175;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(IB)I")
    public final int method1765(int arg0, byte arg1) {
        ++field4170;
        int var3 = this.field4167 >> 3;
        int var4 = -59 / ((-81 - arg1) / 33);
        int var5 = -(7 & this.field4167) + 8;
        this.field4167 += arg0;
        int var6 = 0;
        while (~var5 > ~arg0) {
            var6 += (super.field560[var3++] & class64.field1018[var5]) << -var5 + arg0;
            arg0 -= var5;
            var5 = 8;
        }
        int var7;
        if (~arg0 == ~var5) {
            var7 = (super.field560[var3] & class64.field1018[var5]) + var6;
        } else {
            var7 = (super.field560[var3] >> -arg0 + var5 & class64.field1018[arg0]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(IB)I")
    public final int method1766(int arg0, byte arg1) {
        ++field4176;
        int var3 = 105 % ((22 - arg1) / 52);
        return arg0 * 8 - this.field4167;
    }

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "(B)V")
    public static void method1767(byte arg0) {
        if (arg0 != 58) {
            method1768(-127, (byte) -14);
        }
        field4168 = null;
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(IB)Lbg;")
    public static final class250 method1768(int arg0, byte arg1) {
        ++field4171;
        class250 var2 = (class250) class231.field3665.method1173((long) arg0, true);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class232.field3672.method721((byte) -117, class15.method114(true, arg0), class37.method339((byte) 120, arg0));
            class250 var4 = new class250();
            if (arg1 != -46) {
                return null;
            } else {
                if (var3 != null) {
                    var4.method1701((byte) -126, new class31(var3));
                }
                class231.field3665.method1167((byte) 127, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "(I)V")
    public final void method1769(int arg0) {
        super.field541 = (this.field4167 - arg0) / 8;
        ++field4166;
    }

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "(B)I")
    public final int method1770(byte arg0) {
        ++field4174;
        int var2 = 31 / ((-59 - arg0) / 37);
        return 255 & super.field560[super.field541++] + -this.field4172.method209(27244);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "([II)V")
    public final void method1771(int[] arg0, int arg1) {
        if (arg1 == -7) {
            this.field4172 = new class24(arg0);
            ++field4173;
        }
    }
}
