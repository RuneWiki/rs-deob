import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class12 extends class81 {

    @OriginalMember(owner = "client!md", name = "Hb", descriptor = "Lhh;")
    private static class163 field180 = class137.method1065("flash1:", 17);

    @OriginalMember(owner = "client!md", name = "Kb", descriptor = "Lhh;")
    public static class163 field183 = field180;

    @OriginalMember(owner = "client!md", name = "Gb", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!md", name = "Mb", descriptor = "Lhh;")
    public static class163 field185 = field180;

    @OriginalMember(owner = "client!md", name = "Fb", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!md", name = "Ib", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!md", name = "Jb", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!md", name = "Lb", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!md", name = "Nb", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!md", name = "Pb", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!md", name = "Qb", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!md", name = "Rb", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!md", name = "Sb", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!md", name = "Ub", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!md", name = "Vb", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!md", name = "Wb", descriptor = "Lgh;")
    private class172 field195;

    @OriginalMember(owner = "client!md", name = "Tb", descriptor = "Loh;")
    public static class79 field192;

    @OriginalMember(owner = "client!md", name = "Ob", descriptor = "Z")
    public static boolean field187;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(BI)I")
    public final int method74(byte arg0, int arg1) {
        ++field178;
        int var3 = this.field184 >> 3;
        int var4 = -47 / ((arg0 - -17) / 58);
        int var5 = -(this.field184 & 7) + 8;
        this.field184 += arg1;
        int var6 = 0;
        while (var5 < arg1) {
            var6 += (super.field1562[var3++] & class6.field114[var5]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (~arg1 == ~var5) {
            var7 = (super.field1562[var3] & class6.field114[var5]) + var6;
        } else {
            var7 = (super.field1562[var3] >> -arg1 + var5 & class6.field114[arg1]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!md", name = "m", descriptor = "(II)V")
    public final void method75(int arg0, int arg1) {
        ++field182;
        if (arg1 < 23) {
            this.method84((int[]) null, (byte) -95);
        }
        super.field1562[super.field1541++] = (byte) (this.field195.method1281(0) + arg0);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(JB)Lhh;")
    public static final class163 method76(long arg0, byte arg1) {
        ++field193;
        if (~arg0 < -1L && ~arg0 > -6582952005840035282L) {
            if (arg1 <= 22) {
                field192 = null;
            }
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                long var3 = arg0;
                int var5 = 0;
                while (~var3 != -1L) {
                    var3 /= 37L;
                    ++var5;
                }
                byte[] var6 = new byte[var5];
                while (arg0 != 0L) {
                    long var8 = arg0;
                    arg0 /= 37L;
                    --var5;
                    var6[var5] = class75.field1419[(int) (-(arg0 * 37L) + var8)];
                }
                class163 var7 = new class163();
                var7.field3020 = var6;
                var7.field2990 = var6.length;
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "h", descriptor = "(B)V")
    public static void method77(byte arg0) {
        field180 = null;
        if (arg0 >= -35) {
            method76(16L, (byte) -4);
        }
        field185 = null;
        field192 = null;
        field183 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lpa;IZLpa;)V")
    public static final void method78(class123 arg0, int arg1, boolean arg2, class123 arg3) {
        class204.field3697 = arg0;
        class139.field2666 = arg3;
        class88.field1635 = arg2;
        ++field194;
        if (arg1 != 17674) {
            field187 = true;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)I")
    public final int method79(boolean arg0, int arg1) {
        if (arg0) {
            field192 = null;
        }
        ++field191;
        return arg1 * 8 + -this.field184;
    }

    @OriginalMember(owner = "client!md", name = "i", descriptor = "(B)I")
    public final int method80(byte arg0) {
        ++field190;
        if (arg0 != 87) {
            method76(119L, (byte) -60);
        }
        return super.field1562[super.field1541++] + -this.field195.method1281(0) & 255;
    }

    @OriginalMember(owner = "client!md", name = "u", descriptor = "(I)V")
    public final void method81(int arg0) {
        super.field1541 = (this.field184 + arg0) / 8;
        ++field188;
    }

    @OriginalMember(owner = "client!md", name = "v", descriptor = "(I)V")
    public final void method82(int arg0) {
        ++field181;
        this.field184 = super.field1541 * arg0;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
    public class12(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI[BI)V")
    public final void method83(byte arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg3; ++var5) {
            arg2[var5 - -arg1] = (byte) (super.field1562[super.field1541++] + -this.field195.method1281(0));
        }
        int var6 = 102 / ((53 - arg0) / 58);
        ++field186;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([IB)V")
    public final void method84(int[] arg0, byte arg1) {
        ++field189;
        if (arg1 != 49) {
            field192 = null;
        }
        this.field195 = new class172(arg0);
    }
}
