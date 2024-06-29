import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 extends class25 {

    @OriginalMember(owner = "client!ee", name = "Sb", descriptor = "Z")
    public static boolean field892 = false;

    @OriginalMember(owner = "client!ee", name = "ac", descriptor = "I")
    public static int field900 = 0;

    @OriginalMember(owner = "client!ee", name = "Pb", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!ee", name = "dc", descriptor = "Lfc;")
    public static class39 field903 = class90.method774("Schrifts-=tze geladen)3", -94);

    @OriginalMember(owner = "client!ee", name = "fc", descriptor = "[I")
    public static int[] field905 = new int[100];

    @OriginalMember(owner = "client!ee", name = "ec", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!ee", name = "Zb", descriptor = "Ljava/lang/Object;")
    public static Object field899 = new Object();

    @OriginalMember(owner = "client!ee", name = "Mb", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ee", name = "Nb", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ee", name = "Qb", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ee", name = "Tb", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ee", name = "Ub", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "client!ee", name = "Vb", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!ee", name = "Wb", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ee", name = "Xb", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ee", name = "Yb", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ee", name = "bc", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ee", name = "cc", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ee", name = "Ob", descriptor = "Lja;")
    private class63 field888;

    @OriginalMember(owner = "client!ee", name = "Rb", descriptor = "[Lb;")
    public static class8[] field891;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([II)V", line = 5)
    public final void method388(int[] arg0, int arg1) {
        if (arg1 != 2937) {
            this.method390((byte) -108);
        }
        this.field888 = new class63(arg0);
        ++field901;
    }

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "(B)V", line = 20)
    public static final void method389(byte arg0) {
        class104.field2632.method349(512);
        for (int var1 = 0; var1 < 32; ++var1) {
            class24.field647[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class124.field3190[var2] = 0L;
        }
        if (arg0 != 127) {
            field899 = null;
        }
        field897 = 0;
        ++field902;
    }

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "(B)V", line = 46)
    public final void method390(byte arg0) {
        this.field894 = super.field710 * 8;
        int var2 = 89 / ((55 - arg0) / 50);
        ++field893;
    }

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "(I)V", line = 58)
    public static void method391(int arg0) {
        field891 = null;
        if (arg0 == 17517) {
            field899 = null;
            field905 = null;
            field903 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(IB)I", line = 72)
    public final int method392(int arg0, byte arg1) {
        ++field886;
        if (arg1 != -97) {
            field892 = false;
        }
        return arg0 * 8 + -this.field894;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(BI)V", line = 90)
    public final void method393(byte arg0, int arg1) {
        if (arg0 == -14) {
            super.field711[super.field710++] = (byte) (arg1 + this.field888.method618((byte) 121));
            ++field895;
        }
    }

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "(B)I", line = 117)
    public final int method394(byte arg0) {
        ++field890;
        if (arg0 > -78) {
            field905 = null;
        }
        return 255 & super.field711[super.field710++] + -this.field888.method618((byte) 47);
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V", line = 136)
    public class34(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "(B)V", line = 140)
    public final void method395(byte arg0) {
        super.field710 = (this.field894 - -7) / 8;
        if (arg0 <= 81) {
            method391(-46);
        }
        ++field887;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(IB)I", line = 163)
    public final int method396(int arg0, byte arg1) {
        if (arg1 <= 97) {
            field905 = null;
        }
        ++field896;
        int var3 = this.field894 >> 3;
        int var4 = -(7 & this.field894) + 8;
        this.field894 += arg0;
        int var5 = 0;
        while (var4 < arg0) {
            var5 += (super.field711[var3++] & class16.field464[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field711[var3] >> -arg0 + var4 & class16.field464[arg0]) + var5;
        } else {
            var6 = (class16.field464[var4] & super.field711[var3]) + var5;
        }
        return var6;
    }
}
