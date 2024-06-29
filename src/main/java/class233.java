import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class233 extends class28 {

    @OriginalMember(owner = "client!vf", name = "Hb", descriptor = "[Z")
    public static boolean[] field4246 = new boolean[5];

    @OriginalMember(owner = "client!vf", name = "Sb", descriptor = "Ldc;")
    private static class37 field4257 = class185.method1233((byte) 86, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!vf", name = "Rb", descriptor = "I")
    public static int field4256 = 0;

    @OriginalMember(owner = "client!vf", name = "Mb", descriptor = "Ldc;")
    public static class37 field4251 = field4257;

    @OriginalMember(owner = "client!vf", name = "Db", descriptor = "Lqb;")
    public static class176 field4242 = new class176(50);

    @OriginalMember(owner = "client!vf", name = "Eb", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!vf", name = "Fb", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!vf", name = "Gb", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!vf", name = "Ib", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!vf", name = "Kb", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!vf", name = "Lb", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!vf", name = "Nb", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!vf", name = "Ob", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!vf", name = "Pb", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!vf", name = "Qb", descriptor = "I")
    private int field4255;

    @OriginalMember(owner = "client!vf", name = "Jb", descriptor = "Lni;")
    private class150 field4248;

    @OriginalMember(owner = "client!vf", name = "Tb", descriptor = "[I")
    public static int[] field4258;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(Z)V")
    public static void method1501(boolean arg0) {
        field4242 = null;
        field4257 = null;
        if (arg0) {
            field4251 = null;
        }
        field4246 = null;
        field4258 = null;
        field4251 = null;
    }

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "(I)V")
    public final void method1502(int arg0) {
        ++field4253;
        super.field526 = (this.field4255 + 7) / 8;
        if (arg0 > -23) {
            field4242 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "(II)V")
    public final void method1503(int arg0, int arg1) {
        super.field502[super.field526++] = (byte) (this.field4248.method1030(class237.method1535(arg1, 2720)) + arg0);
        if (arg1 == 2976) {
            ++field4245;
        }
    }

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "(I)V")
    public final void method1504(int arg0) {
        this.field4255 = super.field526 * 8;
        ++field4252;
        if (arg0 != 0) {
            this.method1502(40);
        }
    }

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "(II)I")
    public final int method1505(int arg0, int arg1) {
        ++field4247;
        if (arg0 != 1693770787) {
            this.method1504(47);
        }
        return arg1 * 8 + -this.field4255;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(BI)I")
    public final int method1506(byte arg0, int arg1) {
        if (arg0 <= 109) {
            method1501(true);
        }
        ++field4243;
        int var3 = this.field4255 >> 3;
        int var4 = 0;
        int var5 = -(this.field4255 & 7) + 8;
        this.field4255 += arg1;
        while (arg1 > var5) {
            var4 += (class50.field1013[var5] & super.field502[var3++]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg1 == var5) {
            var6 = (class50.field1013[var5] & super.field502[var3]) + var4;
        } else {
            var6 = (super.field502[var3] >> -arg1 + var5 & class50.field1013[arg1]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III[B)V")
    public final void method1507(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 < -28) {
            for (int var5 = 0; arg1 > var5; ++var5) {
                arg3[arg2 + var5] = (byte) (super.field502[super.field526++] + -this.field4248.method1030(256));
            }
            ++field4244;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
    public class233(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "(B)I")
    public final int method1508(byte arg0) {
        if (arg0 != 47) {
            this.method1505(-18, -51);
        }
        ++field4249;
        return super.field502[super.field526++] + -this.field4248.method1030(256) & 255;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[I)V")
    public final void method1509(byte arg0, int[] arg1) {
        ++field4250;
        if (arg0 < -96) {
            this.field4248 = new class150(arg1);
        }
    }
}
