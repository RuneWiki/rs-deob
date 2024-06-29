import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class173 extends class13 {

    @OriginalMember(owner = "client!pj", name = "Mb", descriptor = "[J")
    public static long[] field2981 = new long[100];

    @OriginalMember(owner = "client!pj", name = "Gb", descriptor = "Lcd;")
    public static class64 field2975 = class154.method1110(160, 17186);

    @OriginalMember(owner = "client!pj", name = "Ub", descriptor = "Lcd;")
    public static class64 field2989 = class44.method335((byte) 71, "weiss:");

    @OriginalMember(owner = "client!pj", name = "Sb", descriptor = "[I")
    public static int[] field2987 = new int[5];

    @OriginalMember(owner = "client!pj", name = "Fb", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!pj", name = "Hb", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!pj", name = "Ib", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!pj", name = "Jb", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!pj", name = "Kb", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!pj", name = "Lb", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!pj", name = "Nb", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!pj", name = "Ob", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!pj", name = "Qb", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!pj", name = "Rb", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!pj", name = "Vb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!pj", name = "Wb", descriptor = "I")
    private int field2991;

    @OriginalMember(owner = "client!pj", name = "Pb", descriptor = "Ldc;")
    private class102 field2984;

    @OriginalMember(owner = "client!pj", name = "Xb", descriptor = "Lqm;")
    public static class222 field2992;

    @OriginalMember(owner = "client!pj", name = "Tb", descriptor = "[[[B")
    public static byte[][][] field2988;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 13)
    public final void method1210(boolean arg0) {
        field2974++;
        if (!arg0) {
            method1212((byte) 106, -23);
        }
        this.field281 = (this.field2991 + 7) / 8;
    }

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "(I)V", line = 36)
    public static final void method1211(int arg0) {
        field2977++;
        if (arg0 > -112) {
            method1216(65, -73);
        }
        class74.method595();
        for (int var1 = 0; var1 < 4; var1++) {
            class91.field1637[var1].method413((byte) -114);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(BI)I", line = 64)
    public static final int method1212(byte arg0, int arg1) {
        if (arg0 == 100) {
            field2985++;
            return arg1 & 0x7F;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "([BIII)V", line = 75)
    public final void method1213(byte[] arg0, int arg1, int arg2, int arg3) {
        field2982++;
        for (int var5 = arg3; var5 < arg2; var5++) {
            arg0[arg1 + var5] = (byte) (this.field254[this.field281++] - this.field2984.method757(false));
        }
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(II)V", line = 96)
    public final void method1214(int arg0, int arg1) {
        this.field254[this.field281++] = (byte) (arg1 + this.field2984.method757(false));
        field2983++;
        if (arg0 >= 0) {
            this.field2991 = 106;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V", line = 108)
    public class173(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "(II)I", line = 112)
    public final int method1215(int arg0, int arg1) {
        if (arg0 == 8) {
            field2976++;
            return arg1 * 8 - this.field2991;
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "(II)I", line = 125)
    public static final int method1216(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "(B)V", line = 137)
    public final void method1217(byte arg0) {
        this.field2991 = this.field281 * 8;
        if (arg0 <= 49) {
            this.method1219((byte) 35);
        }
        field2990++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([II)V", line = 149)
    public final void method1218(int[] arg0, int arg1) {
        int var3 = 78 % ((-arg1 - 83) / 33);
        field2986++;
        this.field2984 = new class102(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "(B)I", line = 163)
    public final int method1219(byte arg0) {
        if (arg0 <= 125) {
            field2975 = (class64) null;
        }
        field2978++;
        return this.field254[this.field281++] - this.field2984.method757(false) & 0xFF;
    }

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "(II)I", line = 178)
    public final int method1220(int arg0, int arg1) {
        field2979++;
        int var3 = this.field2991 >> 3;
        int var4 = 8 - (this.field2991 & 0x7);
        this.field2991 += arg1;
        if (arg0 != -23932) {
            return -2;
        }
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (this.field254[var3++] & class160.field2823[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class160.field2823[var4] & this.field254[var3]) + var5;
        } else {
            var6 = (this.field254[var3] >> var4 - arg1 & class160.field2823[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)V", line = 213)
    public static void method1221(boolean arg0) {
        field2987 = null;
        field2988 = (byte[][][]) null;
        field2975 = null;
        field2989 = null;
        field2992 = null;
        if (arg0) {
            field2975 = (class64) null;
        }
        field2981 = null;
    }
}
