import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class92 implements class78 {

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Loe;")
    private class89 field2106 = new class89();

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    private int field2119 = 0;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    private int field2120 = 128;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "D")
    private double field2123 = 1.0D;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    private int field2121;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "Lrb;")
    private class103 field2125;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "[Lae;")
    private class6[] field2100;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lhb;")
    public static class43 field2094 = new class43(5000);

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field2096 = 0;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lgd;")
    public static class40 field2101 = class14.method90(false, "");

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field2102 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "[I")
    public static int[] field2098 = new int[5];

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Lgd;")
    public static class40 field2107 = field2101;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2099 = 0;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "[I")
    public static int[] field2109 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lgd;")
    public static class40 field2095 = field2101;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lgd;")
    public static class40 field2097 = field2101;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Lgd;")
    public static class40 field2113 = field2101;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Lgd;")
    public static class40 field2110 = class14.method90(false, "Passwort: ");

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "Lgd;")
    public static class40 field2117 = field2101;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "[Z")
    public static boolean[] field2116 = new boolean[5];

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Lgd;")
    public static class40 field2112 = field2101;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "Lgd;")
    private static class40 field2124 = class14.method90(false, "Hidden");

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "Lgd;")
    public static class40 field2126 = field2124;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Lu;")
    public static class123 field2104;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Loc;")
    public static class86 field2111;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)[I", line = 5)
    public final int[] method524(int arg0, int arg1) {
        field2118++;
        class6 var3 = this.field2100[arg0];
        if (arg1 != 740) {
            field2102 = 95;
        }
        if (var3 != null) {
            if (var3.field161 != null) {
                this.field2106.method591(var3, -112);
                var3.field167 = true;
                return var3.field161;
            }
            boolean var4 = var3.method34(this.field2123, this.field2120, this.field2125);
            if (var4) {
                if (this.field2119 == 0) {
                    class6 var5 = (class6) this.field2106.method595(105);
                    var5.method35();
                } else {
                    this.field2119--;
                }
                this.field2106.method591(var3, arg1 ^ 0xFFFFFD2C);
                var3.field167 = true;
                return var3.field161;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)V", line = 52)
    public final void method618(byte arg0, int arg1) {
        field2103++;
        if (arg0 != 91) {
            this.method524(-64, -116);
        }
        for (int var3 = 0; var3 < this.field2100.length; var3++) {
            class6 var4 = this.field2100[var3];
            if (var4 != null && var4.field165 != 0 && var4.field167) {
                var4.method33(arg1);
                var4.field167 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z", line = 83)
    public final boolean method523(int arg0, int arg1) {
        if (arg0 != -4622) {
            method623(-30, 21, null, (byte) -88);
        }
        field2115++;
        return this.field2100[arg1].field159;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 94)
    public static final void method619(byte arg0) {
        field2108++;
        if (class74.field1713 == 0) {
            return;
        }
        int var1 = 0;
        if (class82.field1856 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class30.field664[var2] != null) {
                int var3 = class52.field1316[var2];
                class40 var4 = class10.field247[var2];
                if (var4 != null && var4.method276(36, class7.field196)) {
                    var4 = var4.method240(-28427, 5);
                }
                if (var4 != null && var4.method276(36, class55.field1408)) {
                    var4 = var4.method240(-28427, 5);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class94.field2163 == 0 || class94.field2163 == 1 && class66.method478(true, var4))) {
                    int var5 = 329 - var1 * 13;
                    if (class40.field1001 > 4 && class135.field3282 - 4 > var5 + -10 && class135.field3282 - 4 <= var5 + 3) {
                        int var6 = class133.field3238.method367(client.method114(true, new class40[] { class100.field2372, class89.field2007, var4, class30.field664[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (var6 + 4 > class40.field1001) {
                            class40.field978++;
                            class35.field881++;
                            if (class107.field2610 >= 1) {
                                class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var4 }), class128.field3061, 2058, 0, -1);
                                class63.field1539++;
                            }
                            class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var4 }), class106.field2577, 2009, 0, -1);
                            class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var4 }), class56.field1452, 2027, 0, -1);
                        }
                    }
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class94.field2163 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
        if (arg0 <= 40) {
            field2102 = -92;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 209)
    public final void method620(int arg0) {
        if (arg0 <= 26) {
            this.method622(0.5680871347880142D, (byte) -128);
        }
        field2091++;
        for (int var2 = 0; var2 < this.field2100.length; var2++) {
            if (this.field2100[var2] != null) {
                this.field2100[var2].method35();
            }
        }
        this.field2106 = new class89();
        this.field2119 = this.field2121;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)Z", line = 238)
    public final boolean method525(int arg0, int arg1) {
        field2127++;
        if (arg1 != 16338) {
            field2124 = null;
        }
        return this.field2120 == 64;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLrb;II)[B", line = 249)
    public static final byte[] method621(int arg0, byte arg1, class103 arg2, int arg3, int arg4) {
        field2088++;
        long var5 = ((long) arg4 << 32) + (long) (arg3 << 16) + (long) (arg3 * 37 + arg0 & 0xFFFF);
        if (class130.field3130 != null) {
            class10 var7 = (class10) class130.field3130.method39(93, var5);
            if (var7 != null) {
                return var7.field261;
            }
        }
        byte[] var8 = arg2.method731(arg0, arg3, (byte) -104);
        if (arg1 <= 27) {
            method623(-75, 46, null, (byte) 87);
        }
        if (var8 == null) {
            return null;
        } else {
            if (class130.field3130 != null) {
                class130.field3130.method38(new class10(var8), var5, true);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(DB)V", line = 284)
    public final void method622(double arg0, byte arg1) {
        if (arg1 != 64) {
            field2109 = null;
        }
        field2122++;
        this.field2123 = arg0;
        this.method620(31);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILrb;B)Lhd;", line = 298)
    public static final class46 method623(int arg0, int arg1, class103 arg2, byte arg3) {
        field2093++;
        if (class126.method1000(arg0, arg2, arg1, true)) {
            if (arg3 != 114) {
                field2098 = null;
            }
            return class136.method1075(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 369)
    public static void method624(byte arg0) {
        field2110 = null;
        field2098 = null;
        field2104 = null;
        field2094 = null;
        field2126 = null;
        field2124 = null;
        field2107 = null;
        field2116 = null;
        field2112 = null;
        field2109 = null;
        if (arg0 != -20) {
            method624((byte) 95);
        }
        field2095 = null;
        field2101 = null;
        field2113 = null;
        field2117 = null;
        field2097 = null;
        field2111 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lrb;Lrb;IDI)V", line = 450)
    public class92(class103 arg0, class103 arg1, int arg2, double arg3, int arg4) {
        this.field2121 = arg2;
        this.field2125 = arg1;
        this.field2123 = arg3;
        this.field2120 = arg4;
        this.field2119 = this.field2121;
        int[] var7 = arg0.method739(true, 0);
        int var8 = var7.length;
        this.field2100 = new class6[arg0.method729(1, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class104 var10 = new class104(arg0.method731(var7[var9], 0, (byte) -123));
            this.field2100[var7[var9]] = new class6(var10);
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)I", line = 429)
    public final int method526(int arg0, int arg1) {
        field2089++;
        if (arg1 != 20597) {
            this.field2125 = null;
        }
        return this.field2100[arg0] == null ? 0 : this.field2100[arg0].field157;
    }
}
