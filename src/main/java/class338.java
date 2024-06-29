import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class338 extends class186 {

    @OriginalMember(owner = "client!hj", name = "Nb", descriptor = "Lal;")
    public static class52 field5247 = new class52(50);

    @OriginalMember(owner = "client!hj", name = "Pb", descriptor = "I")
    public static int field5249 = -1;

    @OriginalMember(owner = "client!hj", name = "Ob", descriptor = "[Ljava/lang/String;")
    public static String[] field5248 = new String[200];

    @OriginalMember(owner = "client!hj", name = "Rb", descriptor = "Ljava/lang/String;")
    public static String field5251 = null;

    @OriginalMember(owner = "client!hj", name = "Bb", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!hj", name = "Cb", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!hj", name = "Db", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!hj", name = "Eb", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!hj", name = "Gb", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!hj", name = "Hb", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!hj", name = "Ib", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!hj", name = "Jb", descriptor = "I")
    private int field5243;

    @OriginalMember(owner = "client!hj", name = "Kb", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!hj", name = "Lb", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!hj", name = "Mb", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!hj", name = "Fb", descriptor = "Lik;")
    private class114 field5239;

    @OriginalMember(owner = "client!hj", name = "Qb", descriptor = "[Z")
    public static boolean[] field5250;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "(I)V", line = 6)
    public final void method2223(int arg0) {
        ++field5245;
        this.field5243 = super.field3044 * arg0;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(IB)V", line = 18)
    public final void method2224(int arg0, byte arg1) {
        ++field5241;
        if (arg1 != 0) {
            this.method2227((byte) 56);
        }
        super.field3066[super.field3044++] = (byte) (this.field5239.method834((byte) 55) + arg0);
    }

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "(II)I", line = 29)
    public final int method2225(int arg0, int arg1) {
        ++field5237;
        int var3 = this.field5243 >> 3;
        int var4 = 8 - (this.field5243 & 7);
        int var5 = 0;
        this.field5243 += arg1;
        while (~arg1 < ~var4) {
            var5 += (class179.field2926[var4] & super.field3066[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6 = 53 / ((arg0 - 4) / 52);
        int var7;
        if (~arg1 == ~var4) {
            var7 = (super.field3066[var3] & class179.field2926[var4]) + var5;
        } else {
            var7 = (super.field3066[var3] >> -arg1 + var4 & class179.field2926[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V", line = 60)
    public class338(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "(I)V", line = 64)
    public final void method2226(int arg0) {
        ++field5238;
        super.field3044 = (this.field5243 + arg0) / 8;
    }

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "(B)I", line = 77)
    public final int method2227(byte arg0) {
        ++field5240;
        if (arg0 != -101) {
            method2228(5, 97);
        }
        return super.field3066[super.field3044++] + -this.field5239.method834((byte) 55) & 255;
    }

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "(II)I", line = 88)
    public static final int method2228(int arg0, int arg1) {
        ++field5236;
        class42 var2 = class395.method2490(arg0, (byte) 104);
        int var3 = var2.field524;
        if (arg1 >= -103) {
            field5248 = null;
        }
        int var4 = var2.field526;
        int var5 = var2.field530;
        int var6 = class348.field5350[var5 - var4];
        return class403.field6014[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "(II)I", line = 109)
    public final int method2229(int arg0, int arg1) {
        if (arg1 != 0) {
            field5251 = null;
        }
        ++field5244;
        return arg0 * 8 + -this.field5243;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([BBII)V", line = 123)
    public final void method2230(byte[] arg0, byte arg1, int arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg3; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field3066[super.field3044++] + -this.field5239.method834((byte) 55));
        }
        if (arg1 != -19) {
            this.method2224(-46, (byte) 7);
        }
        ++field5235;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "([IB)V", line = 142)
    public final void method2231(int[] arg0, byte arg1) {
        ++field5242;
        if (arg1 != 16) {
            this.method2223(72);
        }
        this.field5239 = new class114(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(Z)V", line = 157)
    public static void method2232(boolean arg0) {
        field5248 = null;
        field5251 = null;
        field5250 = null;
        field5247 = null;
        if (!arg0) {
            field5250 = null;
        }
    }
}
