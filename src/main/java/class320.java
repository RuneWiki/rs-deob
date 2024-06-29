import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class320 extends class316 {

    @OriginalMember(owner = "client!lh", name = "Nb", descriptor = "I")
    public static int field4868 = 99;

    @OriginalMember(owner = "client!lh", name = "Ib", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!lh", name = "Jb", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!lh", name = "Kb", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!lh", name = "Lb", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!lh", name = "Mb", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!lh", name = "Ob", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!lh", name = "Pb", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!lh", name = "Qb", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!lh", name = "Rb", descriptor = "I")
    private int field4872;

    @OriginalMember(owner = "client!lh", name = "Sb", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!lh", name = "Tb", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!lh", name = "Ub", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!lh", name = "Vb", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!lh", name = "Wb", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!lh", name = "Hb", descriptor = "Ldh;")
    private class193 field4862;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "(I)V", line = 7)
    public final void method2233(int arg0) {
        field4864++;
        this.field4777 = (this.field4872 + 7) / arg0;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(BI)I", line = 16)
    public final int method2234(byte arg0, int arg1) {
        if (arg0 != -104) {
            field4877 = 81;
        }
        field4870++;
        return arg1 * 8 - this.field4872;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[I)V", line = 28)
    public final void method2235(int arg0, int[] arg1) {
        this.field4862 = new class193(arg1);
        if (arg0 == 338) {
            field4866++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BIII)V", line = 41)
    public final void method2236(byte[] arg0, int arg1, int arg2, int arg3) {
        field4867++;
        for (int var5 = 0; var5 < arg3; var5++) {
            arg0[arg2 + var5] = (byte) (this.field4798[this.field4777++] - this.field4862.method1355((byte) 101));
        }
        if (arg1 >= -118) {
            field4877 = -16;
        }
    }

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "(B)J", line = 59)
    public static final long method2237(byte arg0) {
        if (arg0 > -6) {
            return -117L;
        } else {
            field4875++;
            return class47.field580.method654(26);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V", line = 70)
    public final void method2238(int arg0, byte arg1) {
        field4865++;
        if (arg1 == -128) {
            this.field4798[this.field4777++] = (byte) (arg0 + this.field4862.method1355((byte) 105));
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ[BIILjava/lang/String;)I", line = 91)
    public static final int method2239(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, String arg5) {
        int var6 = arg3 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg4 + var7] = -97;
            } else {
                arg2[arg4 + var7] = 63;
            }
        }
        if (!arg1) {
            field4868 = -48;
        }
        field4876++;
        return var6;
    }

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "(I)V", line = 227)
    public final void method2240(int arg0) {
        this.field4872 = this.field4777 * arg0;
        field4863++;
    }

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "(I)V", line = 238)
    public static final void method2241(int arg0) {
        field4869++;
        class326.field4932.method717((byte) 56);
        class251.field3600.method717((byte) 75);
        class306.field4591.method717((byte) 41);
        int var1 = 102 % ((71 - arg0) / 53);
    }

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "(II)I", line = 250)
    public final int method2242(int arg0, int arg1) {
        field4873++;
        int var3 = 8 - (this.field4872 & 0x7);
        if (arg1 != -14970) {
            this.method2235(8, (int[]) null);
        }
        int var4 = this.field4872 >> 3;
        this.field4872 += arg0;
        int var5 = 0;
        while (var3 < arg0) {
            var5 += (class54.field723[var3] & this.field4798[var4++]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (this.field4798[var4] & class54.field723[var3]) + var5;
        } else {
            var6 = (this.field4798[var4] >> var3 - arg0 & class54.field723[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V", line = 279)
    public class320(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "(B)I", line = 290)
    public final int method2243(byte arg0) {
        if (arg0 >= -44) {
            return 28;
        } else {
            field4871++;
            return this.field4798[this.field4777++] - this.field4862.method1355((byte) 102) & 0xFF;
        }
    }
}
