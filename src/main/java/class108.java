import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class108 {

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "[I")
    private int[] field2093 = new int[256];

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "[I")
    private int[] field2075 = new int[256];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
    public static int[] field2060 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "[Z")
    public static boolean[] field2067 = new boolean[5];

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "[I")
    public static int[] field2074 = new int[25];

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Led;")
    private static class43 field2073 = class191.method1219("Prepared sound engine", false);

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field2064 = 0;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field2084 = 0;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "Led;")
    private static class43 field2092 = class191.method1219("Please try using a different world)3", false);

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Led;")
    public static class43 field2065 = field2073;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "Led;")
    public static class43 field2091 = field2092;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Led;")
    public static class43 field2086 = field2092;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "Led;")
    public static class43 field2088 = field2092;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Led;")
    public static class43 field2070 = field2092;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "Led;")
    public static class43 field2094 = field2092;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Led;")
    public static class43 field2085 = field2092;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    private int field2068;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lga;")
    public static class58 field2062;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Lig;")
    public static class80 field2069;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Ljava/awt/Font;")
    public static Font field2079;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static final void method663(byte arg0) {
        int var1 = -67 / ((10 - arg0) / 51);
        class148.field3023.method1108((byte) -90);
        class128.field2565.method1108((byte) -90);
        field2077++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Z")
    public static final boolean method664(int arg0, byte arg1) {
        field2061++;
        if (arg0 < 32) {
            return false;
        }
        int var2 = -29 / ((arg1 - 31) / 49);
        if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
    public final int method665(int arg0) {
        if (arg0 < 14) {
            method672(null, null, null, null, (byte) -105);
        }
        field2082++;
        if (this.field2076-- == 0) {
            this.method667((byte) -37);
            this.field2076 = 255;
        }
        return this.field2075[this.field2076];
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static final void method666(int arg0) {
        if (arg0 != -1) {
            method673(121);
        }
        if (class144.field2959 != null) {
            class66 var1 = class144.field2959;
            synchronized (class144.field2959) {
                class144.field2959 = null;
            }
        }
        field2078++;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    private final void method667(byte arg0) {
        this.field2083 += ++this.field2068;
        if (arg0 != -37) {
            this.field2076 = -60;
        }
        field2087++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2093[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2089 ^= this.field2089 << 13;
                } else {
                    this.field2089 ^= this.field2089 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2089 ^= this.field2089 << 2;
            } else {
                this.field2089 ^= this.field2089 >>> 16;
            }
            this.field2089 += this.field2093[var2 + 128 & 0xFF];
            int var4;
            this.field2093[var2] = var4 = this.field2083 + this.field2093[class7.method38(255, var3 >> 2)] + this.field2089;
            this.field2075[var2] = this.field2083 = this.field2093[class7.method38(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)I")
    public static final int method668(int arg0, int arg1, int arg2, int arg3) {
        field2063++;
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1 & 0x7F;
        int var7 = arg3;
        if (arg3 < 3 && (class15.field232[1][var4][var5] & 0x2) == 2) {
            var7 = arg3 + 1;
        }
        int var8 = arg0 & 0x7F;
        if (arg2 >= -126) {
            method671(-116, (byte) -125, 44);
        }
        int var9 = (128 - var6) * class158.field3203[var7][var4][var5] + class158.field3203[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = (128 - var6) * class158.field3203[var7][var4][var5 - -1] + class158.field3203[var7][var4 + 1][var5 + 1] * var6 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public static void method669(int arg0) {
        field2085 = null;
        if (arg0 != -25424) {
            field2067 = null;
        }
        field2067 = null;
        field2062 = null;
        field2086 = null;
        field2065 = null;
        field2073 = null;
        field2069 = null;
        field2070 = null;
        field2074 = null;
        field2094 = null;
        field2092 = null;
        field2088 = null;
        field2060 = null;
        field2079 = null;
        field2091 = null;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    private final void method670(int arg0) {
        field2090++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 < 54) {
            field2065 = null;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2075[var11] + var9;
            int var38 = this.field2075[var11 + 4] + var5;
            int var39 = this.field2075[var11 + 1] + var8;
            int var40 = this.field2075[var11 + 7] + var2;
            int var41 = this.field2075[var11 + 3] + var6;
            int var42 = var37 ^ var39 << 11;
            int var43 = this.field2075[var11 + 5] + var4;
            int var44 = var41 + var42;
            int var45 = this.field2075[var11 + 6] + var3;
            int var46 = this.field2075[var11 + 2] + var7;
            int var47 = var39 + var46;
            int var48 = var47 ^ var46 >>> 2;
            int var49 = var38 + var48;
            int var50 = var44 + var46;
            int var51 = var50 ^ var44 << 8;
            int var52 = var44 + var49;
            int var53 = var43 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var45;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var40;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var59 = var4 + var42;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2093[var11] = var9;
            this.field2093[var11 + 1] = var8;
            this.field2093[var11 + 2] = var7;
            this.field2093[var11 + 3] = var6;
            this.field2093[var11 + 4] = var5;
            this.field2093[var11 + 5] = var4;
            this.field2093[var11 + 6] = var3;
            this.field2093[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2093[var12] + var9;
            int var14 = this.field2093[var12 + 6] + var3;
            int var15 = this.field2093[var12 + 5] + var4;
            int var16 = this.field2093[var12 + 3] + var6;
            int var17 = this.field2093[var12 + 1] + var8;
            int var18 = this.field2093[var12 + 4] + var5;
            int var19 = this.field2093[var12 + 7] + var2;
            int var20 = this.field2093[var12 + 2] + var7;
            int var21 = var13 ^ var17 << 11;
            int var22 = var17 + var20;
            int var23 = var16 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var20 + var23;
            int var26 = var25 ^ var23 << 8;
            int var27 = var18 + var24;
            int var28 = var23 + var27;
            var6 = var28 ^ var27 >>> 16;
            int var29 = var6 + var14;
            int var30 = var15 + var26;
            int var31 = var27 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var5 + var19;
            int var33 = var29 + var30;
            var4 = var33 ^ var29 >>> 4;
            int var34 = var29 + var32;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var35 = var4 + var21;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var26;
            var9 = var8 + var35;
            this.field2093[var12] = var9;
            this.field2093[var12 + 1] = var8;
            this.field2093[var12 + 2] = var7;
            this.field2093[var12 + 3] = var6;
            this.field2093[var12 + 4] = var5;
            this.field2093[var12 + 5] = var4;
            this.field2093[var12 + 6] = var3;
            this.field2093[var12 + 7] = var2;
        }
        this.method667((byte) -37);
        this.field2076 = 256;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)V")
    public static final void method671(int arg0, byte arg1, int arg2) {
        field2072++;
        if (class41.field796 != 0 && arg0 != -1) {
            class206.method1334(arg0, true, class41.field796, class80.field1596, false, 0);
            class40.field767 = true;
        }
        if (arg1 < 51) {
            method664(65, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Led;Led;Lga;Lga;B)Lwc;")
    public static final class202 method672(class43 arg0, class43 arg1, class58 arg2, class58 arg3, byte arg4) {
        int var5 = arg2.method347(arg0, (byte) 74);
        field2066++;
        if (arg4 > -30) {
            field2084 = 127;
        }
        int var6 = arg2.method362(arg1, (byte) -47, var5);
        return class207.method1340(arg2, -70, var6, arg3, var5);
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    public static final void method673(int arg0) {
        field2071++;
        if (class160.field3235.toLowerCase().indexOf("microsoft") == -1) {
            class115.field2257[91] = 42;
            class115.field2257[59] = 57;
            class115.field2257[46] = 72;
            if (class160.field3244 == null) {
                class115.field2257[222] = 59;
                class115.field2257[192] = 58;
            } else {
                class115.field2257[520] = 59;
                class115.field2257[192] = 28;
                class115.field2257[222] = 58;
            }
            class115.field2257[44] = 71;
            class115.field2257[93] = 43;
            class115.field2257[47] = 73;
            class115.field2257[61] = 27;
            class115.field2257[45] = 26;
            class115.field2257[92] = 74;
        } else {
            class115.field2257[192] = 58;
            class115.field2257[189] = 26;
            class115.field2257[220] = 74;
            class115.field2257[219] = 42;
            class115.field2257[186] = 57;
            class115.field2257[187] = 27;
            class115.field2257[188] = 71;
            class115.field2257[191] = 73;
            class115.field2257[223] = 28;
            class115.field2257[190] = 72;
            class115.field2257[222] = 59;
            class115.field2257[221] = 43;
        }
        if (arg0 != 26) {
            method671(-122, (byte) -102, 95);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([I)V")
    public class108(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2075[var2] = arg0[var2];
        }
        this.method670(124);
    }
}
