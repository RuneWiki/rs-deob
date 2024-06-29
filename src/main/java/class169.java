import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class169 extends class134 {

    @OriginalMember(owner = "client!oh", name = "Tb", descriptor = "Lce;")
    public static class126 field3011 = class206.method1445(-7923, "<)4col> x");

    @OriginalMember(owner = "client!oh", name = "Nb", descriptor = "[Lce;")
    public static class126[] field3005 = new class126[100];

    @OriginalMember(owner = "client!oh", name = "Mb", descriptor = "Lce;")
    public static class126 field3004 = class206.method1445(-7923, "<img=1>");

    @OriginalMember(owner = "client!oh", name = "ac", descriptor = "I")
    public static int field3018 = 0;

    @OriginalMember(owner = "client!oh", name = "Kb", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!oh", name = "Lb", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!oh", name = "Ob", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!oh", name = "Pb", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!oh", name = "Rb", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!oh", name = "Sb", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!oh", name = "Ub", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!oh", name = "Vb", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!oh", name = "Wb", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!oh", name = "Xb", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!oh", name = "Yb", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!oh", name = "Zb", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!oh", name = "Qb", descriptor = "Lub;")
    private class11 field3008;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "(B)V", line = 4)
    public final void method1233(byte arg0) {
        this.field3012 = this.field2299 * 8;
        field3014++;
        int var2 = 17 / ((-arg0 - 21) / 50);
    }

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "(I)I", line = 14)
    public final int method1234(int arg0) {
        if (arg0 != 7) {
            method1236(83);
        }
        field3010++;
        return this.field2282[this.field2299++] - this.field3008.method66(255) & 0xFF;
    }

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "(II)V", line = 25)
    public static final void method1235(int arg0, int arg1) {
        field3003++;
        int var2 = 89 % ((42 - arg1) / 51);
        class245 var3 = class139.method1022(8, (byte) -112, arg0);
        var3.method1682(109);
    }

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "(I)V", line = 39)
    public static void method1236(int arg0) {
        field3004 = null;
        field3011 = null;
        if (arg0 != -14936) {
            method1240(12, (byte) -75);
        }
        field3005 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)I", line = 51)
    public final int method1237(int arg0, boolean arg1) {
        if (arg1) {
            return -22;
        } else {
            field3002++;
            return arg0 * 8 - this.field3012;
        }
    }

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "(II)V", line = 63)
    public final void method1238(int arg0, int arg1) {
        this.field2282[this.field2299++] = (byte) (this.field3008.method66(255) + arg0);
        field3007++;
        if (arg1 <= 59) {
            field3018 = 78;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[BII)V", line = 78)
    public final void method1239(int arg0, byte[] arg1, int arg2, int arg3) {
        field3006++;
        int var5 = 0;
        if (arg3 == 1620031587) {
            while (arg0 > var5) {
                arg1[arg2 + var5] = (byte) (this.field2282[this.field2299++] - this.field3008.method66(255));
                var5++;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(IB)Z", line = 96)
    public static final boolean method1240(int arg0, byte arg1) {
        field3013++;
        if (arg1 != -74) {
            field3016 = 9;
        }
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "(II)I", line = 113)
    public final int method1241(int arg0, int arg1) {
        field3015++;
        int var3 = 8 - (this.field3012 & 0x7);
        int var4 = this.field3012 >> 3;
        this.field3012 += arg0;
        int var5 = 0;
        int var6 = 120 % ((arg1 + 70) / 39);
        while (var3 < arg0) {
            var5 += (class30.field422[var3] & this.field2282[var4++]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var7;
        if (arg0 == var3) {
            var7 = (this.field2282[var4] & class30.field422[var3]) + var5;
        } else {
            var7 = (this.field2282[var4] >> var3 - arg0 & class30.field422[arg0]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[I)V", line = 164)
    public final void method1242(int arg0, int[] arg1) {
        this.field3008 = new class11(arg1);
        field3017++;
        if (arg0 != 8) {
            this.method1233((byte) 29);
        }
    }

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "(I)V", line = 177)
    public final void method1243(int arg0) {
        if (arg0 != -29800) {
            this.field3012 = 79;
        }
        this.field2299 = (this.field3012 + 7) / 8;
        field3009++;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V", line = 197)
    public class169(int arg0) {
        super(arg0);
    }
}
