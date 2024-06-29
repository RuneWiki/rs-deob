import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 extends class289 {

    @OriginalMember(owner = "client!ha", name = "Lb", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!ha", name = "Qb", descriptor = "I")
    public static int field598 = 0;

    @OriginalMember(owner = "client!ha", name = "Sb", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ha", name = "Tb", descriptor = "Lrn;")
    public static class177 field601;

    @OriginalMember(owner = "client!ha", name = "Fb", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!ha", name = "Gb", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ha", name = "Hb", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ha", name = "Ib", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ha", name = "Kb", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ha", name = "Mb", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!ha", name = "Nb", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ha", name = "Ob", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ha", name = "Pb", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ha", name = "Rb", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ha", name = "Jb", descriptor = "Lib;")
    private class108 field591;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "(B)Z")
    public final boolean method260(byte arg0) {
        ++field590;
        if (arg0 > -118) {
            this.method268(26);
        }
        int var2 = super.field4408[super.field4399] - this.field591.method918((byte) 58) & 255;
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "(II)I")
    public final int method261(int arg0, int arg1) {
        ++field596;
        int var3 = this.field594 >> 3;
        int var4 = -(7 & this.field594) + 8;
        this.field594 += arg0;
        int var5 = arg1;
        while (~var4 > ~arg0) {
            var5 += (super.field4408[var3++] & class212.field3380[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (class212.field3380[var4] & super.field4408[var3]) + var5;
        } else {
            var6 = (super.field4408[var3] >> var4 - arg0 & class212.field3380[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "(II)I")
    public final int method262(int arg0, int arg1) {
        if (arg1 != 30881) {
            return 113;
        } else {
            ++field595;
            return arg0 * 8 + -this.field594;
        }
    }

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "(B)V")
    public static void method263(byte arg0) {
        if (arg0 >= 109) {
            field601 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "(I)V")
    public final void method264(int arg0) {
        ++field588;
        super.field4399 = (this.field594 + 7) / 8;
        int var2 = 107 % ((-78 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BIZI)V")
    public final void method265(byte[] arg0, int arg1, boolean arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            arg0[var5 - -arg3] = (byte) (super.field4408[super.field4399++] + -this.field591.method922((byte) 69));
        }
        ++field599;
        if (arg2) {
            this.field591 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(BI)V")
    public final void method266(byte arg0, int arg1) {
        if (arg0 != -74) {
            this.method269((byte) 101);
        }
        super.field4408[super.field4399++] = (byte) (this.field591.method922((byte) 111) + arg1);
        ++field589;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V")
    public class43(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[I)V")
    public final void method267(int arg0, int[] arg1) {
        this.field591 = new class108(arg1);
        if (arg0 == 15119) {
            ++field587;
        }
    }

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "(I)V")
    public final void method268(int arg0) {
        if (arg0 == -29708) {
            ++field592;
            this.field594 = super.field4399 * 8;
        }
    }

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "(B)I")
    public final int method269(byte arg0) {
        ++field597;
        int var2 = super.field4408[super.field4399++] + -this.field591.method922((byte) 67) & 255;
        if (arg0 <= 22) {
            this.field591 = null;
        }
        return ~var2 > -129 ? var2 : (var2 + -128 << 8) - -(super.field4408[super.field4399++] - this.field591.method922((byte) 74) & 255);
    }

    static {
        new class309((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field600 = 100;
        field601 = new class177();
    }
}
