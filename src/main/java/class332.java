import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class332 extends class236 {

    @OriginalMember(owner = "client!fi", name = "Ob", descriptor = "Liq;")
    public static class362 field4698 = new class362("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!fi", name = "Qb", descriptor = "[I")
    public static int[] field4700 = new int[] { 0, 0, 8, 0, 6, 10, 0, 0, 6, 0, 0, 7, 3, 7, 0, 6, 0, 0, 0, 0, 0, 0, 0, 14, 3, 0, 2, 0, 0, 0, 12, 17, 0, 12, 0, -2, 6, 0, 4, 0, 5, 0, 6, 0, 0, 0, 6, 0, 8, -1, 6, -1, 0, 6, 0, -1, 0, 0, -2, -2, 1, -2, -1, 0, 0, 0, 0, 6, 0, -1, 0, 0, 0, -1, 0, 0, 0, 1, 2, 0, 0, 3, 2, -1, 8, -1, 0, 0, 0, 8, 0, 0, 12, 0, 0, 0, 0, 0, 0, 8, 10, -1, 4, 0, 20, 0, 0, 8, 0, 0, -2, 0, 5, 10, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 3, 0, 0, -1, 0, 1, 3, 0, 0, -2, 4, 0, 14, 8, 0, 0, 10, 0, 8, 0, 12, 11, 0, 0, 6, 0, -2, 0, 0, 0, 2, 0, 6, 8, 2, 0, 0, 2, -2, 0, 0, -1, 0, 0, 0, 0, 0, -2, 0, 9, 15, 0, 8, 0, 0, 0, 0, 0, 0, 0, 3, 0, -1, -2, 0, 12, 2, -1, 7, 0, 0, -1, 15, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -2, 5, 7, 3, 0, 28, -2, 0, 0, 0, 0, 0, -1, 0, 0, 3, 1, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, -2, 1, 0, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!fi", name = "Pb", descriptor = "[I")
    public static int[] field4699 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fi", name = "Wb", descriptor = "Z")
    public static boolean field4706;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    private int field4688;

    @OriginalMember(owner = "client!fi", name = "Fb", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!fi", name = "Hb", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!fi", name = "Ib", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!fi", name = "Jb", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!fi", name = "Kb", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!fi", name = "Lb", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!fi", name = "Mb", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!fi", name = "Nb", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!fi", name = "Rb", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!fi", name = "Sb", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!fi", name = "Tb", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!fi", name = "Vb", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!fi", name = "Gb", descriptor = "Loq;")
    private class199 field4690;

    @OriginalMember(owner = "client!fi", name = "Ub", descriptor = "Lbg;")
    public static class271 field4704;

    static {
        new class362((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field4706 = true;
    }

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "(II)I", line = 6)
    public final int method2140(int arg0, int arg1) {
        if (arg0 != 14369) {
            return 54;
        } else {
            ++field4702;
            return arg1 * 8 + -this.field4688;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZB)I", line = 17)
    public static final int method2141(boolean arg0, byte arg1) {
        ++field4694;
        int var2 = 120 / ((66 - arg1) / 46);
        long var3 = class175.method1195(24);
        for (class164 var5 = arg0 ? (class164) class281.field3985.method1884(0) : (class164) class281.field3985.method1890(-1); var5 != null; var5 = (class164) class281.field3985.method1890(-1)) {
            if (~var3 < ~(var5.field2315 & 4611686018427387903L)) {
                if (~(4611686018427387904L & var5.field2315) != -1L) {
                    int var6 = (int) var5.field5855;
                    class4.field61[var6] = class151.field1865[var6];
                    var5.method2594((byte) -22);
                    return var6;
                }
                var5.method2594((byte) -22);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "(B)I", line = 54)
    public final int method2142(byte arg0) {
        int var2 = 6 % ((arg0 - 7) / 41);
        ++field4697;
        return super.field3364[super.field3320++] + -this.field4690.method1317((byte) -95) & 255;
    }

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "(II)V", line = 64)
    public final void method2143(int arg0, int arg1) {
        if (arg1 == -2) {
            ++field4691;
            super.field3364[super.field3320++] = (byte) (arg0 + this.field4690.method1317((byte) -108));
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[BBI)V", line = 87)
    public final void method2144(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field4692;
        int var5 = -4 % ((-57 - arg2) / 35);
        for (int var6 = 0; ~arg0 < ~var6; ++var6) {
            arg1[arg3 + var6] = (byte) (super.field3364[super.field3320++] + -this.field4690.method1317((byte) -100));
        }
    }

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "(B)V", line = 103)
    public final void method2145(byte arg0) {
        super.field3320 = (this.field4688 - -7) / 8;
        ++field4693;
        if (arg0 >= -13) {
            this.field4690 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(IB)I", line = 117)
    public final int method2146(int arg0, byte arg1) {
        ++field4687;
        if (arg1 != 52) {
            return -1;
        } else {
            int var3 = this.field4688 >> 3;
            int var4 = -(this.field4688 & 7) + 8;
            int var5 = 0;
            this.field4688 += arg0;
            while (var4 < arg0) {
                var5 += (class401.field5746[var4] & super.field3364[var3++]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg0 == var4) {
                var6 = (super.field3364[var3] & class401.field5746[var4]) + var5;
            } else {
                var6 = (super.field3364[var3] >> -arg0 + var4 & class401.field5746[arg0]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I[I)V", line = 147)
    public final void method2147(int arg0, int[] arg1) {
        ++field4696;
        this.field4690 = new class199(arg1);
        if (arg0 != 0) {
            this.method2147(73, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)V", line = 158)
    public static final void method2148(byte arg0, boolean arg1) {
        if (arg0 <= 80) {
            field4698 = null;
        }
        class210.field2997 = arg1;
        ++field4703;
        class212.field3012 = !class12.method93(1);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 170)
    public static final String method2149(String arg0, int arg1) {
        if (arg1 != 6) {
            method2151(50, 70, 34);
        }
        ++field4695;
        String var2 = class425.method2677(true, class193.method1310(arg0, (byte) 126));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "(I)V", line = 187)
    public final void method2150(int arg0) {
        if (arg0 != 1) {
            this.method2140(42, 41);
        }
        ++field4689;
        this.field4688 = super.field3320 * 8;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V", line = 209)
    public static final void method2151(int arg0, int arg1, int arg2) {
        ++field4701;
        class20 var3 = class369.method2351((byte) 96, 14, arg0);
        int var4 = -47 / ((35 - arg1) / 60);
        var3.method146(103);
        var3.field252 = arg2;
    }

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "(I)V", line = 223)
    public static void method2152(int arg0) {
        field4700 = null;
        field4698 = null;
        field4699 = null;
        if (arg0 == 12126) {
            field4704 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V", line = 241)
    public class332(int arg0) {
        super(arg0);
    }
}
