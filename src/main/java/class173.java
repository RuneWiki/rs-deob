import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class173 extends class8 {

    @OriginalMember(owner = "client!hh", name = "Bb", descriptor = "Lsg;")
    public static class30 field3224 = class167.method1221((byte) 33, "Konfig geladen)3");

    @OriginalMember(owner = "client!hh", name = "Db", descriptor = "Lgb;")
    public static class140 field3226 = null;

    @OriginalMember(owner = "client!hh", name = "Lb", descriptor = "Lsg;")
    public static class30 field3234 = null;

    @OriginalMember(owner = "client!hh", name = "Mb", descriptor = "Z")
    public static boolean field3235 = true;

    @OriginalMember(owner = "client!hh", name = "Pb", descriptor = "Lsg;")
    public static class30 field3238 = class167.method1221((byte) 33, "unzap");

    @OriginalMember(owner = "client!hh", name = "Qb", descriptor = "I")
    public static int field3239 = 0;

    @OriginalMember(owner = "client!hh", name = "Hb", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!hh", name = "Cb", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!hh", name = "Eb", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!hh", name = "Fb", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!hh", name = "Gb", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!hh", name = "Ib", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!hh", name = "Kb", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!hh", name = "Nb", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!hh", name = "Ob", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!hh", name = "Rb", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!hh", name = "Sb", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!hh", name = "Tb", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!hh", name = "Ub", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!hh", name = "Vb", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!hh", name = "Jb", descriptor = "Lqj;")
    private class210 field3232;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "(II)V")
    public final void method1267(int arg0, int arg1) {
        if (arg1 != -9) {
            method1275(false, -53);
        }
        super.field124[super.field146++] = (byte) (this.field3232.method1487(0) + arg0);
        ++field3229;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lsg;IB)V")
    public static final void method1268(class30 arg0, int arg1, byte arg2) {
        ++field3244;
        class68 var3 = class103.method830(arg1, 4, 2);
        if (arg2 == -82) {
            var3.method608(false);
            var3.field1483 = arg0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(B)V")
    public final void method1269(byte arg0) {
        this.field3236 = super.field146 * 8;
        ++field3227;
        if (arg0 != -70) {
            method1275(true, -84);
        }
    }

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "(II)I")
    public final int method1270(int arg0, int arg1) {
        ++field3242;
        int var3 = this.field3236 >> 3;
        int var4 = -(this.field3236 & 7) + 8;
        this.field3236 += arg1;
        int var5 = 0;
        if (arg0 >= -48) {
            return 82;
        } else {
            while (arg1 > var4) {
                var5 += (class4.field56[var4] & super.field124[var3++]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg1 != ~var4) {
                var6 = (super.field124[var3] >> -arg1 + var4 & class4.field56[arg1]) + var5;
            } else {
                var6 = (super.field124[var3] & class4.field56[var4]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(B)V")
    public final void method1271(byte arg0) {
        if (arg0 <= 85) {
            field3238 = null;
        }
        ++field3225;
        super.field146 = (this.field3236 + 7) / 8;
    }

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "(I)V")
    public static void method1272(int arg0) {
        field3238 = null;
        field3224 = null;
        field3226 = null;
        int var1 = -19 % ((-17 - arg0) / 47);
        field3234 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[I)V")
    public final void method1273(int arg0, int[] arg1) {
        ++field3228;
        if (arg0 <= -33) {
            this.field3232 = new class210(arg1);
        }
    }

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "(B)I")
    public final int method1274(byte arg0) {
        if (arg0 != -124) {
            return 121;
        } else {
            ++field3237;
            return super.field124[super.field146++] + -this.field3232.method1487(0) & 255;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)I")
    public static final int method1275(boolean arg0, int arg1) {
        ++field3241;
        if (arg0) {
            field3239 = 74;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BIIZ)V")
    public final void method1276(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.method1277(23, -51);
        }
        for (int var5 = 0; ~var5 > ~arg2; ++var5) {
            arg0[var5 - -arg1] = (byte) (super.field124[super.field146++] + -this.field3232.method1487(0));
        }
        ++field3240;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V")
    public class173(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "(II)I")
    public final int method1277(int arg0, int arg1) {
        if (arg1 != 8) {
            method1268((class30) null, -2, (byte) -75);
        }
        ++field3243;
        return arg0 * 8 + -this.field3236;
    }
}
