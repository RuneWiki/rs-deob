import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class293 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Z")
    private boolean field4800 = false;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public int field4813 = 0;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field4809 = 0;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4807 = "glow2:";

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[Lpb;")
    public static class141[] field4805 = new class141[29];

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[C")
    public static char[] field4810 = new char[128];

    @OriginalMember(owner = "client!el", name = "A", descriptor = "[I")
    public static int[] field4821 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Loe;")
    public static class65 field4806 = new class65();

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public static int field4824 = 0;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "Ljava/lang/String;")
    public static String field4822 = "Loading fonts - ";

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field4799;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    private int field4808;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public int field4819;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "J")
    public long field4796;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Lka;")
    public static class144 field4798;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "[[S")
    public static short[][] field4823;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
    public static final int method2024(int arg0) {
        int var1 = 79 % ((65 - arg0) / 60);
        field4818++;
        return ((class289.field4767 == 0 ? 0 : 1) << 21) + ((class283.field4682 == 0 ? 0 : 1) << 20) + ((class186.field2977 ? 1 : 0) << 19) + (class16.field328 << 17) + ((class197.field3201 ? 1 : 0) << 13) + ((class145.field2388 ? 1 : 0) << 6) + ((class79.field1325 ? 1 : 0) << 4) + (class15.field304 & 0x7) + ((class243.field4075 ? 1 : 0) << 3) + ((class162.field2636 ? 1 : 0) << 5) + ((class259.field4357 ? 1 : 0) << 7) + (class139.method1035() << 23) - (-((class54.field916 ? 1 : 0) << 8) + -((class190.field3044 ? 1 : 0) << 9) + -((class68.field1142 ? 1 : 0) << 10) - (((class162.field2631 & 0x3) << 11) + ((class113.field1934 ? 1 : 0) << 15) + (((class141.field2337 ? 1 : 0) << 16) - -((class292.field4785 == 0 ? 0 : 1) << 22))));
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static void method2025(int arg0) {
        field4798 = null;
        field4810 = null;
        field4822 = null;
        if (arg0 < 82) {
            field4806 = null;
        }
        field4807 = null;
        field4823 = null;
        field4806 = null;
        field4821 = null;
        field4805 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILab;)V")
    public final void method2026(int arg0, class249 arg1) {
        if (arg0 != 0) {
            return;
        }
        field4814++;
        while (true) {
            int var3 = arg1.method1802((byte) -121);
            if (var3 == 0) {
                return;
            }
            this.method2030(var3, arg1, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class23.field423 <= arg1 && arg5 <= class272.field4552 && arg4 >= class55.field972 && arg6 <= class240.field4053) {
            if (arg0 == 1) {
                class312.method2113(arg5, arg6, arg4, arg1, (byte) -114, arg2);
            } else {
                class275.method1934(arg6, arg4, arg2, 98, arg5, arg1, arg0);
            }
        } else if (arg0 == 1) {
            class234.method1681(-122, arg5, arg2, arg4, arg6, arg1);
        } else {
            class282.method1966(2059372100, arg0, arg2, arg5, arg6, arg1, arg4);
        }
        field4811++;
        if (arg3 != 4660) {
            method2027(-75, 102, -27, -29, -68, 103, 70);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/String;BI[BI)I")
    public static final int method2028(int arg0, String arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        field4812++;
        int var6 = arg3 - arg5;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg0 + var7] = -97;
            } else {
                arg4[arg0 + var7] = 63;
            }
        }
        if (arg2 <= 90) {
            method2029(false, 81);
        }
        return var6;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)Lkb;")
    public static final class290 method2029(boolean arg0, int arg1) {
        class290 var2 = (class290) class248.field4139.method99((long) arg1, arg0);
        field4797++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class274.field4581.method1149(29, (byte) 62, arg1);
        class290 var4 = new class290();
        if (var3 != null) {
            var4.method2016(arg1, new class249(var3), (byte) -112);
        }
        class248.field4139.method100((long) arg1, var4, 115);
        return var4;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILab;B)V")
    private final void method2030(int arg0, class249 arg1, byte arg2) {
        int var4 = -125 % ((arg2 + 78) / 46);
        field4801++;
        if (arg0 == 1) {
            this.field4808 = arg1.method1821((byte) 51);
        } else if (arg0 == 2) {
            arg1.method1802((byte) -125);
        } else if (arg0 == 3) {
            this.field4803 = arg1.method1800(-123);
            this.field4815 = arg1.method1800(-71);
            this.field4804 = arg1.method1800(-64);
        } else if (arg0 == 4) {
            this.field4799 = arg1.method1802((byte) 81);
            this.field4817 = arg1.method1800(-122);
        } else if (arg0 == 6) {
            this.field4802 = arg1.method1802((byte) 118);
        } else if (arg0 == 8) {
            this.field4809 = 1;
        } else if (arg0 == 9) {
            this.field4813 = 1;
            return;
        } else if (arg0 == 10) {
            this.field4800 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public final void method2031(byte arg0) {
        field4795++;
        this.field4820 = class128.field2130[this.field4808];
        int var2 = -113 % ((-arg0 - 82) / 36);
        this.field4816 = (int) Math.sqrt((double) (this.field4803 * this.field4803 - (-(this.field4815 * this.field4815) - this.field4804 * this.field4804)));
        if (this.field4817 == 0) {
            this.field4817 = 1;
        }
        if (this.field4799 == 0) {
            this.field4796 = 2147483647L;
        } else if (this.field4799 == 1) {
            this.field4796 = (long) (this.field4816 * 8 / this.field4817);
            this.field4796 *= this.field4796;
        } else if (this.field4799 == 2) {
            this.field4796 = (long) (this.field4816 * 8 / this.field4817);
        }
        if (this.field4800) {
            this.field4816 *= -1;
        }
    }
}
