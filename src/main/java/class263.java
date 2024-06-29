import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class263 extends class217 {

    @OriginalMember(owner = "client!ah", name = "Jb", descriptor = "Lqu;")
    public static class65 field4042 = new class65(6, 0, 4, 2);

    @OriginalMember(owner = "client!ah", name = "Pb", descriptor = "Z")
    public static boolean field4048;

    @OriginalMember(owner = "client!ah", name = "Qb", descriptor = "Ltr;")
    public static class195 field4049;

    @OriginalMember(owner = "client!ah", name = "Cb", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!ah", name = "Db", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ah", name = "Fb", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ah", name = "Gb", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ah", name = "Hb", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ah", name = "Ib", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ah", name = "Kb", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ah", name = "Lb", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ah", name = "Mb", descriptor = "I")
    private int field4045;

    @OriginalMember(owner = "client!ah", name = "Nb", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ah", name = "Ob", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ah", name = "Rb", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ah", name = "Eb", descriptor = "Lke;")
    private class426 field4037;

    static {
        new class234("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field4048 = false;
        field4049 = new class195(13, 3);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V", line = 7)
    public class263(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "(I)Z", line = 13)
    public final boolean method1752(int arg0) {
        if (arg0 != 29951) {
            this.field4037 = null;
        }
        ++field4043;
        int var2 = 255 & super.field3572[super.field3556] + -this.field4037.method2661(124);
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(ZI)I", line = 29)
    public final int method1753(boolean arg0, int arg1) {
        ++field4038;
        if (arg0) {
            this.field4037 = null;
        }
        return arg1 * 8 + -this.field4045;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I[BII)V", line = 42)
    public final void method1754(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field4047;
        for (int var5 = 0; ~var5 > ~arg2; ++var5) {
            arg1[arg0 + var5] = (byte) (super.field3572[super.field3556++] + -this.field4037.method2660(2857));
        }
        int var6 = -76 % ((30 - arg3) / 48);
    }

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "(B)V", line = 60)
    public static void method1755(byte arg0) {
        field4049 = null;
        field4042 = null;
        if (arg0 != 76) {
            method1755((byte) -43);
        }
    }

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "(I)V", line = 81)
    public final void method1756(int arg0) {
        int var2 = -2 / ((68 - arg0) / 32);
        ++field4041;
        this.field4045 = super.field3556 * 8;
    }

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "(I)V", line = 92)
    public final void method1757(int arg0) {
        super.field3556 = (this.field4045 - -7) / 8;
        if (arg0 >= -92) {
            this.field4045 = 42;
        }
        ++field4035;
    }

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "(I)I", line = 107)
    public final int method1758(int arg0) {
        ++field4039;
        int var2 = 255 & super.field3572[super.field3556++] + -this.field4037.method2660(2857);
        return var2 < arg0 ? var2 : (var2 + -128 << 8) - -(255 & super.field3572[super.field3556++] + -this.field4037.method2660(2857));
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[I)V", line = 125)
    public final void method1759(byte arg0, int[] arg1) {
        if (arg0 == 0) {
            this.field4037 = new class426(arg1);
            ++field4044;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)I", line = 138)
    public final int method1760(int arg0, boolean arg1) {
        ++field4040;
        int var3 = this.field4045 >> 3;
        int var4 = -(7 & this.field4045) + 8;
        int var5 = 0;
        this.field4045 += arg0;
        if (!arg1) {
            return 29;
        } else {
            while (var4 < arg0) {
                var5 += (class363.field5378[var4] & super.field3572[var3++]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg0 == var4) {
                var6 = (super.field3572[var3] & class363.field5378[var4]) + var5;
            } else {
                var6 = (super.field3572[var3] >> -arg0 + var4 & class363.field5378[arg0]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "(BI)V", line = 168)
    public final void method1761(byte arg0, int arg1) {
        super.field3572[super.field3556++] = (byte) (this.field4037.method2660(class425.method2656(arg0, 2824)) + arg1);
        ++field4036;
        if (arg0 != 33) {
            this.field4037 = null;
        }
    }
}
