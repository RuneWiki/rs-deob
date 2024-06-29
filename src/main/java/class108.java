import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class108 extends class256 {

    @OriginalMember(owner = "client!ge", name = "Kb", descriptor = "I")
    public static int field1468 = 0;

    @OriginalMember(owner = "client!ge", name = "Eb", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ge", name = "Fb", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ge", name = "Gb", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ge", name = "Ib", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ge", name = "Jb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ge", name = "Lb", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ge", name = "Mb", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client!ge", name = "Nb", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ge", name = "Ob", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ge", name = "Pb", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ge", name = "Qb", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ge", name = "Hb", descriptor = "Lfa;")
    private class411 field1465;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "(II)V", line = 3)
    public final void method767(int arg0, int arg1) {
        super.field3764[super.field3762++] = (byte) (this.field1465.method2557(1) + arg1);
        if (arg0 != 8) {
            this.field1470 = -23;
        }
        ++field1466;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(ZI)I", line = 15)
    public final int method768(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1470 = -51;
        }
        ++field1474;
        return arg1 * 8 + -this.field1470;
    }

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "(I)I", line = 26)
    public final int method769(int arg0) {
        int var2 = -87 % ((-47 - arg0) / 51);
        ++field1464;
        int var3 = super.field3764[super.field3762++] - this.field1465.method2557(1) & 255;
        return ~var3 > -129 ? var3 : (var3 + -128 << 8) + (super.field3764[super.field3762++] + -this.field1465.method2557(1) & 255);
    }

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "(I)V", line = 56)
    public final void method770(int arg0) {
        this.field1470 = super.field3762 * arg0;
        ++field1467;
    }

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "(B)V", line = 64)
    public final void method771(byte arg0) {
        ++field1469;
        if (arg0 < 96) {
            this.method767(88, -26);
        }
        super.field3762 = (this.field1470 + 7) / 8;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([II)V", line = 75)
    public final void method772(int[] arg0, int arg1) {
        this.field1465 = new class411(arg0);
        if (arg1 == -129) {
            ++field1473;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V", line = 88)
    public class108(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(IB)I", line = 94)
    public final int method773(int arg0, byte arg1) {
        ++field1472;
        int var3 = 101 % ((arg1 - -45) / 58);
        int var4 = this.field1470 >> 3;
        int var5 = -(this.field1470 & 7) + 8;
        int var6 = 0;
        this.field1470 += arg0;
        while (~var5 > ~arg0) {
            var6 += (super.field3764[var4++] & class111.field1534[var5]) << -var5 + arg0;
            arg0 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg0 == var5) {
            var7 = (class111.field1534[var5] & super.field3764[var4]) + var6;
        } else {
            var7 = (super.field3764[var4] >> -arg0 + var5 & class111.field1534[arg0]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II[BI)V", line = 128)
    public final void method774(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 <= 66) {
            field1468 = -5;
        }
        for (int var5 = 0; ~arg1 < ~var5; ++var5) {
            arg2[arg0 + var5] = (byte) (super.field3764[super.field3762++] + -this.field1465.method2557(1));
        }
        ++field1462;
    }

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "(I)Z", line = 145)
    public final boolean method775(int arg0) {
        ++field1471;
        int var2 = super.field3764[super.field3762] + -this.field1465.method2552(0) & 255;
        if (arg0 != -5846) {
            field1463 = 27;
        }
        return var2 >= 128;
    }
}
