import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class389 {

    @OriginalMember(owner = "client!dc", name = "Db", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!dc", name = "Eb", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!dc", name = "Fb", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dc", name = "Gb", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!dc", name = "Hb", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dc", name = "Ib", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dc", name = "Jb", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dc", name = "Kb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dc", name = "Mb", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dc", name = "Nb", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!dc", name = "Ob", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dc", name = "Qb", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "Rb", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dc", name = "Lb", descriptor = "Lsb;")
    public static class264 field34;

    @OriginalMember(owner = "client!dc", name = "Sb", descriptor = "Lip;")
    private class656 field41;

    @OriginalMember(owner = "client!dc", name = "Pb", descriptor = "[I")
    public static int[] field38;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "(I)Z")
    public final boolean method23(int arg0) {
        ++field32;
        int var2 = 255 & super.field5205[super.field5195] - this.field41.method3711(false);
        return arg0 >= ~var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([IB)V")
    public final void method24(int[] arg0, byte arg1) {
        ++field39;
        int var3 = 100 % ((arg1 - -9) / 42);
        this.field41 = new class656(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "(II)I")
    public final int method25(int arg0, int arg1) {
        ++field35;
        if (arg1 != 255) {
            return 90;
        } else {
            int var3 = this.field29 >> 3;
            int var4 = -(7 & this.field29) + 8;
            this.field29 += arg0;
            int var5 = 0;
            while (arg0 > var4) {
                var5 += (class590.field8557[var4] & super.field5205[var3++]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg0 == ~var4) {
                var6 = (class590.field8557[var4] & super.field5205[var3]) + var5;
            } else {
                var6 = (super.field5205[var3] >> -arg0 + var4 & class590.field8557[arg0]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "(I)V")
    public final void method26(int arg0) {
        ++field28;
        this.field29 = super.field5195 * arg0;
    }

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "(I)I")
    public final int method27(int arg0) {
        ++field40;
        int var2 = super.field5205[super.field5195++] + -this.field41.method3709(-88) & arg0;
        return ~var2 > -129 ? var2 : (super.field5205[super.field5195++] - this.field41.method3709(-78) & 255) + (var2 - 128 << 8);
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(IB)I")
    public final int method28(int arg0, byte arg1) {
        if (arg1 != 53) {
            this.field41 = null;
        }
        ++field30;
        return arg0 * 8 + -this.field29;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLip;)V")
    public final void method29(boolean arg0, class656 arg1) {
        ++field36;
        this.field41 = arg1;
        if (arg0) {
            this.method35(-76, 114);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method30(byte arg0, String arg1) {
        if (arg0 < 37) {
            method33(-68, (byte) -43);
        }
        ++field33;
        System.exit(1);
    }

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "(I)V")
    public static void method31(int arg0) {
        field38 = null;
        if (arg0 == -129) {
            field34 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "(B)V")
    public final void method32(byte arg0) {
        ++field31;
        super.field5195 = (this.field29 - -7) / 8;
        if (arg0 > -122) {
            this.method26(-87);
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(IB)V")
    public static final void method33(int arg0, byte arg1) {
        class472 var2 = class228.field2961;
        synchronized (class228.field2961) {
            class228.field2961.method2777(arg0, 55);
            if (arg1 < 52) {
                method33(-51, (byte) -32);
            }
        }
        ++field26;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II[BI)V")
    public final void method34(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = 0; ~arg3 < ~var5; ++var5) {
            arg2[var5 - -arg1] = (byte) (super.field5205[super.field5195++] + -this.field41.method3709(-90));
        }
        ++field27;
        if (arg0 != 1024) {
            field38 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "(II)V")
    public final void method35(int arg0, int arg1) {
        ++field37;
        if (arg1 != 2) {
            field38 = null;
        }
        super.field5205[super.field5195++] = (byte) (arg0 + this.field41.method3709(arg1 + -120));
    }
}
