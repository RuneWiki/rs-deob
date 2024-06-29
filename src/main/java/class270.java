import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class270 extends class529 implements class369 {

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4310 = "";

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "[C")
    public static char[] field4308 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "[I")
    public static int[] field4319 = new int[1];

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "C")
    public char field4316;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
    public int field4314;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "J")
    public long field4307;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
    public static void method1826(boolean arg0) {
        field4310 = null;
        field4319 = null;
        field4308 = null;
        if (arg0) {
            field4308 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIII)V")
    public static final void method1827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4313++;
        if (arg5 != 353) {
            method1826(true);
        }
        int var6 = arg3 - arg2;
        int var7 = arg4 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class109.method715(arg1, arg4, arg0, arg2, -1);
            }
        } else if (var7 == 0) {
            class31.method202((byte) 96, arg3, arg0, arg2, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (class178.field2609 > arg3) {
                var10 = class178.field2609;
                var11 = (class178.field2609 * var8 >> 12) + var9;
            } else if (arg3 <= class460.field7096) {
                var11 = arg4;
                var10 = arg3;
            } else {
                var11 = (class460.field7096 * var8 >> 12) + var9;
                var10 = class460.field7096;
            }
            int var12;
            int var13;
            if (arg2 < class178.field2609) {
                var12 = (class178.field2609 * var8 >> 12) + var9;
                var13 = class178.field2609;
            } else if (class460.field7096 < arg2) {
                var13 = class460.field7096;
                var12 = var9 + (class460.field7096 * var8 >> 12);
            } else {
                var12 = arg1;
                var13 = arg2;
            }
            if (var12 < class462.field7105) {
                var13 = (class462.field7105 - var9 << 12) / var8;
                var12 = class462.field7105;
            } else if (class222.field3750 < var12) {
                var12 = class222.field3750;
                var13 = (class222.field3750 - var9 << 12) / var8;
            }
            if (class462.field7105 > var11) {
                var11 = class462.field7105;
                var10 = (class462.field7105 - var9 << 12) / var8;
            } else if (class222.field3750 < var11) {
                var10 = (class222.field3750 - var9 << 12) / var8;
                var11 = class222.field3750;
            }
            class74.method541(var13, var10, arg0, (byte) -40, var12, var11);
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)I")
    public final int method1828(byte arg0) {
        int var2 = -43 % ((arg0 + 7) / 45);
        field4312++;
        return this.field4317;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)C")
    public final char method1829(int arg0) {
        field4320++;
        return arg0 == -32393 ? this.field4316 : '\u0001';
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
    public final int method1830(int arg0) {
        field4309++;
        if (arg0 > -55) {
            method1826(false);
        }
        return this.field4314;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)J")
    public final long method1831(int arg0) {
        if (arg0 < 78) {
            field4308 = null;
        }
        field4311++;
        return this.field4307;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)I")
    public final int method1832(byte arg0) {
        field4318++;
        return arg0 <= 44 ? 103 : this.field4306;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILjq;B)J")
    public static final long method1833(int arg0, int arg1, class267 arg2, byte arg3) {
        if (arg3 >= -53) {
            field4310 = null;
        }
        field4315++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class156 var10 = class454.field7029.method3002(-1, arg2.method96((byte) 91));
        long var11 = (long) (arg2.method99((byte) 68) << 14 | arg1 << 7 | arg0 | arg2.method106((byte) 18) << 20 | 0x40000000);
        if (var10.field2079 == 0) {
            var11 |= var8;
        }
        if (var10.field2114 == 1) {
            var11 |= var4;
        }
        if (var10.field2086) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method96((byte) 99) << 32;
    }
}
