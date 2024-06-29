import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class85 extends class22 {

    @OriginalMember(owner = "client!oa", name = "Cb", descriptor = "I")
    private int field2028 = 0;

    @OriginalMember(owner = "client!oa", name = "tb", descriptor = "I")
    private int field2019 = 0;

    @OriginalMember(owner = "client!oa", name = "Gb", descriptor = "Z")
    public boolean field2032 = false;

    @OriginalMember(owner = "client!oa", name = "Kb", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!oa", name = "Qb", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!oa", name = "zb", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!oa", name = "Ib", descriptor = "I")
    private int field2034;

    @OriginalMember(owner = "client!oa", name = "Hb", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!oa", name = "Mb", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!oa", name = "Ob", descriptor = "Lgd;")
    private class40 field2040;

    @OriginalMember(owner = "client!oa", name = "wb", descriptor = "Lwb;")
    public static class130 field2022 = class26.method212("runes", -32376);

    @OriginalMember(owner = "client!oa", name = "ub", descriptor = "Lwb;")
    public static class130 field2020 = class26.method212("oder ung-Ultiges Passwort)3", -32376);

    @OriginalMember(owner = "client!oa", name = "Bb", descriptor = "I")
    public static int field2027 = 0;

    @OriginalMember(owner = "client!oa", name = "xb", descriptor = "I")
    public static int field2023 = 1;

    @OriginalMember(owner = "client!oa", name = "Jb", descriptor = "Lwb;")
    public static class130 field2035 = class26.method212("backhmid1", -32376);

    @OriginalMember(owner = "client!oa", name = "Ab", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!oa", name = "Eb", descriptor = "Lwb;")
    public static class130 field2030 = class26.method212("Passwort: ", -32376);

    @OriginalMember(owner = "client!oa", name = "vb", descriptor = "Lwb;")
    public static class130 field2021 = class26.method212("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", -32376);

    @OriginalMember(owner = "client!oa", name = "Pb", descriptor = "I")
    public static int field2041 = 0;

    @OriginalMember(owner = "client!oa", name = "sb", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!oa", name = "yb", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!oa", name = "Db", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!oa", name = "Fb", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!oa", name = "Lb", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!oa", name = "Nb", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(B)Lr;", line = 16)
    public final class102 method10(byte arg0) {
        field2018++;
        class112 var2 = class21.method190(this.field2034, -9101);
        class102 var3;
        if (this.field2032) {
            var3 = var2.method863(-1, (byte) -106);
        } else {
            var3 = var2.method863(this.field2028, (byte) -106);
        }
        if (arg0 != -38) {
            method641(-91, 14);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V", line = 45)
    public final void method640(int arg0, int arg1) {
        field2037++;
        if (arg1 != -1) {
            method643((byte) -20, null);
        }
        if (this.field2032) {
            return;
        }
        this.field2019 += arg0;
        while (this.field2040.field1108[this.field2028] < this.field2019) {
            this.field2019 -= this.field2040.field1108[this.field2028];
            this.field2028++;
            if (this.field2028 >= this.field2040.field1106.length) {
                this.field2032 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lgd;", line = 84)
    public static final class40 method641(int arg0, int arg1) {
        class40 var2 = (class40) class119.field2905.method402((long) arg0, arg1 - 126);
        field2039++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == 12) {
            byte[] var3 = class58.field1472.method508(arg0, 0, 12);
            class40 var4 = new class40();
            if (var3 != null) {
                var4.method396(new class36(var3), true);
            }
            var4.method390(-13391);
            class119.field2905.method403((long) arg0, var4, (byte) -101);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIII)V", line = 295)
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2036 = arg2;
        this.field2042 = arg5 + arg6;
        this.field2025 = arg3;
        this.field2034 = arg0;
        this.field2033 = arg4;
        this.field2038 = arg1;
        int var8 = class21.method190(this.field2034, -9101).field2754;
        if (var8 == -1) {
            this.field2032 = true;
        } else {
            this.field2032 = false;
            this.field2040 = method641(var8, 12);
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 112)
    public static void method642(int arg0) {
        field2030 = null;
        field2020 = null;
        field2021 = null;
        field2022 = null;
        field2035 = null;
        if (arg0 <= 79) {
            field2030 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLod;)V", line = 137)
    public static final void method643(byte arg0, class88 arg1) {
        if (arg0 <= 3) {
            method641(95, -50);
        }
        field2031++;
        if (arg1.field2094 == 0) {
            return;
        }
        if (arg1.field2085 != -1 && arg1.field2085 < 32768) {
            class33 var2 = class26.field766[arg1.field2085];
            if (var2 != null) {
                int var3 = arg1.field2128 - var2.field2128;
                int var4 = arg1.field2071 - var2.field2071;
                if (var4 != 0 || var3 != 0) {
                    arg1.field2106 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2085 >= 32768) {
            int var5 = arg1.field2085 - 32768;
            if (class53.field1376 == var5) {
                var5 = 2047;
            }
            class59 var6 = class105.field2550[var5];
            if (var6 != null) {
                int var7 = arg1.field2071 - var6.field2071;
                int var8 = arg1.field2128 - var6.field2128;
                if (var7 != 0 || var8 != 0) {
                    arg1.field2106 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2116 != 0 || arg1.field2125 != 0) && (arg1.field2140 == 0 || arg1.field2136 > 0)) {
            int var9 = arg1.field2071 - (arg1.field2116 - class129.field3045 - class129.field3045) * 64;
            int var10 = arg1.field2128 - (arg1.field2125 - class42.field1172 - class42.field1172) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field2106 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field2116 = 0;
            arg1.field2125 = 0;
        }
        int var11 = arg1.field2106 - arg1.field2099 & 0x7FF;
        if (var11 == 0) {
            arg1.field2069 = 0;
            return;
        }
        arg1.field2069++;
        if (var11 > 1024) {
            arg1.field2099 -= arg1.field2094;
            boolean var12 = true;
            if (var11 < arg1.field2094 || 2048 - arg1.field2094 < var11) {
                arg1.field2099 = arg1.field2106;
                var12 = false;
            }
            if (arg1.field2101 == arg1.field2068 && (arg1.field2069 > 25 || var12)) {
                if (arg1.field2141 == -1) {
                    arg1.field2101 = arg1.field2086;
                } else {
                    arg1.field2101 = arg1.field2141;
                }
            }
        } else {
            arg1.field2099 += arg1.field2094;
            boolean var13 = true;
            if (arg1.field2094 > var11 || 2048 - arg1.field2094 < var11) {
                var13 = false;
                arg1.field2099 = arg1.field2106;
            }
            if (arg1.field2101 == arg1.field2068 && (arg1.field2069 > 25 || var13)) {
                if (arg1.field2124 == -1) {
                    arg1.field2101 = arg1.field2086;
                } else {
                    arg1.field2101 = arg1.field2124;
                }
            }
        }
        arg1.field2099 &= 0x7FF;
    }
}
