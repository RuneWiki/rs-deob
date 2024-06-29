import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class115 extends class89 {

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    private int field2033 = 0;

    @OriginalMember(owner = "client!uj", name = "jb", descriptor = "I")
    private int field2048 = 2048;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    private int field2038 = 12288;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    private int field2040 = 2048;

    @OriginalMember(owner = "client!uj", name = "pb", descriptor = "I")
    private int field2054 = 8192;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    private int field2034 = 0;

    @OriginalMember(owner = "client!uj", name = "mb", descriptor = "I")
    private int field2051 = 4096;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Lda;")
    public static class275 field2032 = class255.method1672(103, "::replacecanvas");

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "Lda;")
    private static class275 field2030 = class255.method1672(97, "Sat");

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static volatile int field2035 = 0;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "Lda;")
    private static class275 field2037 = class255.method1672(101, "Wed");

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "Lda;")
    private static class275 field2044 = class255.method1672(103, "Sun");

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "Lda;")
    private static class275 field2043 = class255.method1672(109, "Mon");

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "Lda;")
    private static class275 field2041 = class255.method1672(111, "Thu");

    @OriginalMember(owner = "client!uj", name = "ib", descriptor = "Lda;")
    private static class275 field2047 = class255.method1672(101, "Tue");

    @OriginalMember(owner = "client!uj", name = "lb", descriptor = "Lda;")
    private static class275 field2050 = class255.method1672(93, "Fri");

    @OriginalMember(owner = "client!uj", name = "kb", descriptor = "[Lda;")
    public static class275[] field2049 = new class275[1000];

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "[Lda;")
    public static class275[] field2029 = new class275[] { field2044, field2043, field2047, field2037, field2041, field2050, field2030 };

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!uj", name = "nb", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!uj", name = "ob", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "[[B")
    public static byte[][] field2045;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 == -20503) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (arg2 == 6) {
                                        this.field2054 = arg1.method608(60);
                                    }
                                } else {
                                    this.field2051 = arg1.method608(39);
                                }
                            } else {
                                this.field2038 = arg1.method608(arg0 ^ -20583);
                            }
                        } else {
                            this.field2040 = arg1.method608(101);
                        }
                    } else {
                        this.field2033 = arg1.method608(57);
                    }
                } else {
                    this.field2034 = arg1.method608(63);
                }
            } else {
                this.field2048 = arg1.method608(79);
            }
            ++field2052;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZI)Z")
    private final boolean method836(int arg0, boolean arg1, int arg2) {
        ++field2039;
        int var4 = (arg0 + arg2) * this.field2038 >> 12;
        int var5 = class159.field2791[(var4 * 255 & 1045441) >> 12];
        int var6 = (var5 << 12) / this.field2038;
        int var7 = (var6 << 12) / this.field2054;
        int var8 = this.field2051 * var7 >> 12;
        if (arg1) {
            this.field2051 = -26;
        }
        return ~(-arg2 + arg0) > ~var8 && -var8 < -arg2 + arg0;
    }

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "(I)V")
    public static void method837(int arg0) {
        field2049 = null;
        field2050 = null;
        field2041 = null;
        field2030 = null;
        field2029 = null;
        if (arg0 == 18149) {
            field2044 = null;
            field2032 = null;
            field2045 = null;
            field2047 = null;
            field2043 = null;
            field2037 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)Z")
    private final boolean method838(int arg0, byte arg1, int arg2) {
        ++field2042;
        int var4 = (-arg2 + arg0) * this.field2038 >> 12;
        int var5 = class159.field2791[(var4 * 255 & 1048123) >> 12];
        int var6 = (var5 << 12) / this.field2038;
        int var7 = (var6 << 12) / this.field2054;
        int var8 = -88 / (-arg1 / 57);
        int var9 = this.field2051 * var7 >> 12;
        return arg2 - -arg0 < var9 && ~(arg2 - -arg0) < ~(-var9);
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(III)J")
    public static final long method839(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        return var3 != null && var3.field41 != null ? var3.field41.field2142 : 0L;
    }

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "(I)V")
    public static final void method840(int arg0) {
        ++field2036;
        if (arg0 == 63) {
            int var1 = class120.field2152.length;
            for (int var2 = 0; ~var1 < ~var2; ++var2) {
                if (class120.field2152[var2] != null) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class146.field2548; ++var4) {
                        if (~class61.field1031[var2] == ~class171.field2980[var4]) {
                            var3 = var4;
                            break;
                        }
                    }
                    if (var3 == -1) {
                        class171.field2980[class146.field2548] = class61.field1031[var2];
                        var3 = class146.field2548++;
                    }
                    class85 var5 = new class85(class120.field2152[var2]);
                    int var6 = 0;
                    while (~var5.field1392 > ~class120.field2152[var2].length && ~var6 > -512) {
                        int var7 = var5.method608(65);
                        int var8 = (8082 & var7) >> 7;
                        int var9 = var7 >> 14;
                        int var10 = (class61.field1031[var2] >> 8) * 64 - class16.field237 + var8;
                        int var11 = var6++ << 6 | var3;
                        int var12 = 63 & var7;
                        int var13 = (class61.field1031[var2] & 255) * 64 + -class234.field4083 + var12;
                        class23 var14 = class30.method176(arg0 + -66, var5.method608(76));
                        if (class31.field478[var11] == null && ~(var14.field354 & 1) < -1 && ~class122.field2185 == ~var9 && ~var10 <= -1 && ~(var14.field399 + var10) > -105 && var13 >= 0 && ~(var13 - -var14.field399) > -105) {
                            class31.field478[var11] = new class165();
                            class165 var15 = class31.field478[var11];
                            class228.field3851[class181.field3118++] = var11;
                            var15.field1739 = class35.field576;
                            var15.field2873 = var14;
                            var15.method744(-85, var15.field2873.field399);
                            var15.field1774 = var15.field2873.field377;
                            var15.field1786 = var15.field2873.field404;
                            var15.field1736 = var15.field2873.field363;
                            var15.field1750 = var15.field2873.field361;
                            var15.field1747 = var15.field2873.field359;
                            var15.field1769 = var15.field2873.field365;
                            var15.field1741 = var15.field2873.field375;
                            var15.field1778 = var15.field2873.field351;
                            if (var15.field1774 == 0) {
                                var15.field1787 = 0;
                            }
                            var15.method751(var13, var15.method750((byte) -112), true, (byte) 34, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field2046;
        if (arg1) {
            this.method838(16, (byte) 64, -60);
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -109);
        if (super.field1503.field664) {
            int var4 = class91.field1552[arg0] + -2048;
            for (int var5 = 0; class65.field1070 > var5; ++var5) {
                int var6 = class185.field3172[var5] + -2048;
                int var7 = this.field2048 + var6;
                int var8 = var7 < -2048 ? var7 - -4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field2033 + var6;
                int var11 = this.field2034 + var4;
                int var12 = var11 < -2048 ? var11 + 4096 : var11;
                int var13 = this.field2040 + var4;
                int var14 = ~var13 > 2047 ? var13 - -4096 : var13;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = ~var12 >= -2049 ? var12 : var12 - 4096;
                int var17 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method838(var16, (byte) 73, var9) && !this.method836(var15, arg1, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 != 1) {
            field2030 = null;
        }
        class250.method1642((byte) 124);
        ++field2053;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V")
    public static final void method841(byte arg0) {
        if (arg0 > -30) {
            method837(122);
        }
        ++field2031;
        class36.field587.method993(113);
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(III)V")
    public static final void method842(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class221.field3751; ++var3) {
            for (int var4 = 0; var4 < class247.field4359; ++var4) {
                for (int var5 = 0; var5 < class172.field2997; ++var5) {
                    class3 var6 = class235.field4101[var3][var4][var5];
                    if (var6 != null) {
                        class139 var7 = var6.field50;
                        if (var7 != null && var7.field2444.method1523()) {
                            class182.method1217(var7.field2444, var3, var4, var5, 1, 1);
                            if (var7.field2446 != null && var7.field2446.method1523()) {
                                class182.method1217(var7.field2446, var3, var4, var5, 1, 1);
                                var7.field2444.method1527(var7.field2446, 0, 0, 0, false);
                                var7.field2446 = var7.field2446.method1524(arg0, arg1, arg2);
                            }
                            var7.field2444 = var7.field2444.method1524(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field29; ++var8) {
                            class37 var10 = var6.field48[var8];
                            if (var10 != null && var10.field612.method1523()) {
                                class182.method1217(var10.field612, var3, var4, var5, var10.field610 - var10.field616 + 1, var10.field604 - var10.field617 + 1);
                                var10.field612 = var10.field612.method1524(arg0, arg1, arg2);
                            }
                        }
                        class214 var9 = var6.field39;
                        if (var9 != null && var9.field3648.method1523()) {
                            class235.method1533(var9.field3648, var3, var4, var5);
                            var9.field3648 = var9.field3648.method1524(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class115() {
        super(0, true);
    }
}
