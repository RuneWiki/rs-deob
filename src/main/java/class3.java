import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class151 {

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[J")
    private long[] field54 = new long[10];

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    private int field74 = 256;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    private int field65 = 1;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    private int field73 = 0;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "J")
    private long field69 = class29.method235(-329);

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lic;")
    private static class59 field59 = class59.method433(0, " ");

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lic;")
    public static class59 field60 = class59.method433(0, "::errortest");

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field66 = 50;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lic;")
    public static class59 field61 = class59.method433(0, "Lade)3)3)3");

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Lic;")
    public static class59 field70 = class59.method433(0, " (X");

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Lic;")
    public static class59 field67 = class59.method433(0, "sl_button");

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lic;")
    public static class59 field55 = field59;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[I")
    public static int[] field62 = new int[2048];

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lic;")
    public static class59 field57 = class59.method433(0, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lq;")
    public static class111 field58;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIBI)Z")
    public static final boolean method12(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 >> 14 & 0x7FFF;
        field71++;
        int var5 = field58.method868(class44.field1127, arg3, arg0, arg1);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 >> 6 & 0x3;
        int var7 = var5 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class19 var8 = class53.method397(var4, 13415);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field418;
                var10 = var8.field434;
            } else {
                var9 = var8.field434;
                var10 = var8.field418;
            }
            int var11 = var8.field382;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], var11, var9, -25171, arg3, arg0, var10, true);
        } else {
            class121.method945(var7 + 1, var6, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 0, -25171, arg3, arg0, 0, true);
        }
        class158.field3500 = 0;
        class157.field3416 = field68;
        class18.field364 = 2;
        int var12 = -39 % ((-arg2 - 44) / 41);
        class88.field2220 = class81.field2005;
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static final void method13(int arg0) {
        if (arg0 < 68) {
            method12(11, -29, (byte) -85, -55);
        }
        if (class112.field2684 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class112.field2684 > 768) {
                    class155.field3370[var3] = class24.method149(1024 - class112.field2684, class130.field2916[var3], class26.field665[var3], true);
                } else if (class112.field2684 <= 256) {
                    class155.field3370[var3] = class24.method149(256 - class112.field2684, class26.field665[var3], class130.field2916[var3], true);
                } else {
                    class155.field3370[var3] = class130.field2916[var3];
                }
            }
        } else if (class19.field429 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class19.field429 > 768) {
                    class155.field3370[var1] = class24.method149(1024 - class19.field429, class30.field770[var1], class26.field665[var1], true);
                } else if (class19.field429 > 256) {
                    class155.field3370[var1] = class30.field770[var1];
                } else {
                    class155.field3370[var1] = class24.method149(256 - class19.field429, class26.field665[var1], class30.field770[var1], true);
                }
            }
        } else {
            for (int var2 = 0; var2 < 256; var2++) {
                class155.field3370[var2] = class26.field665[var2];
            }
        }
        field72++;
        short var4 = 256;
        int var5 = 0;
        int var6 = 0;
        int var7 = class147.field3200.field2957 * 9;
        for (int var8 = 1; var8 < var4 - 1; var8++) {
            int var21 = (var4 - var8) * class155.field3366[var8] / var4 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class118.field2745[var5++];
                int var25 = class147.field3200.field2953[var7++];
                if (var24 == 0) {
                    class88.field2223.field2953[var6++] = var25;
                } else {
                    int var26 = 256 - var24;
                    int var28 = class155.field3370[var24];
                    class88.field2223.field2953[var6++] = class24.method156(var24 * class24.method156(var28, 65280) + class24.method156(var25, 65280) * var26, 16711680) + class24.method156(var26 * class24.method156(16711935, var25) + var24 * class24.method156(var28, 16711935), -16711936) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class88.field2223.field2953[var6++] = class147.field3200.field2953[var7++];
            }
            var7 += class147.field3200.field2957 - 128;
        }
        int var9 = 0;
        int var10 = 0;
        class88.field2223.method1020(0, 9);
        int var11 = class147.field3200.field2957 * 9 + 128;
        for (int var12 = 1; var12 < var4 - 1; var12++) {
            int var13 = (var4 - var12) * class155.field3366[var12] / var4 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var9++;
                var11--;
                class138.field3083.field2953[var10001] = class147.field3200.field2953[var11];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                var11--;
                int var16 = class147.field3200.field2953[var11];
                int var17 = class118.field2745[var10++];
                if (var17 == 0) {
                    class138.field3083.field2953[var9++] = var16;
                } else {
                    int var18 = 256 - var17;
                    int var20 = class155.field3370[var17];
                    class138.field3083.field2953[var9++] = class24.method156(class24.method156(16711935, var20) * var17 + class24.method156(16711935, var16) * var18, -16711936) + class24.method156(class24.method156(var20, 65280) * var17 + class24.method156(65280, var16) * var18, 16711680) >> 8;
                }
            }
            var10 += var13;
            var11 += class147.field3200.field2957 + 128;
        }
        class138.field3083.method1020(637, 9);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
    public static void method14(byte arg0) {
        field62 = null;
        field57 = null;
        field60 = null;
        if (arg0 > -92) {
            field61 = null;
        }
        field61 = null;
        field55 = null;
        field70 = null;
        field59 = null;
        field67 = null;
        field58 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)I")
    public static final int method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field53++;
        if ((arg6 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg5;
            arg5 = var7;
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg0;
        }
        if (arg2 != 5210) {
            method15(-6, 80, -62, -93, 109, -127, -33);
        }
        if (var8 == 1) {
            return 1 + 7 - arg4 - arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg0 - arg5;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field54[var2] = 0L;
        }
        field64++;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V")
    public static final void method17(byte arg0) {
        field56++;
        class10.field213.method1062(false);
        int var1 = class10.field213.method1064(8, -7284);
        if (var1 < class103.field2510) {
            for (int var2 = var1; var2 < class103.field2510; var2++) {
                class2.field34[class59.field1445++] = class53.field1309[var2];
            }
        }
        if (class103.field2510 < var1) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0 <= 95) {
            field55 = null;
        }
        class103.field2510 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class53.field1309[var3];
            class90 var5 = class47.field1210[var4];
            int var6 = class10.field213.method1064(1, -7284);
            if (var6 == 0) {
                class53.field1309[class103.field2510++] = var4;
                var5.field1749 = class23.field561;
            } else {
                int var7 = class10.field213.method1064(2, -7284);
                if (var7 == 0) {
                    class53.field1309[class103.field2510++] = var4;
                    var5.field1749 = class23.field561;
                    field62[class106.field2526++] = var4;
                } else if (var7 == 1) {
                    class53.field1309[class103.field2510++] = var4;
                    var5.field1749 = class23.field561;
                    int var8 = class10.field213.method1064(3, -7284);
                    var5.method545(var8, false, 11978);
                    int var9 = class10.field213.method1064(1, -7284);
                    if (var9 == 1) {
                        field62[class106.field2526++] = var4;
                    }
                } else if (var7 == 2) {
                    class53.field1309[class103.field2510++] = var4;
                    var5.field1749 = class23.field561;
                    int var10 = class10.field213.method1064(3, -7284);
                    var5.method545(var10, true, 11978);
                    int var11 = class10.field213.method1064(3, -7284);
                    var5.method545(var11, true, 11978);
                    int var12 = class10.field213.method1064(1, -7284);
                    if (var12 == 1) {
                        field62[class106.field2526++] = var4;
                    }
                } else if (var7 == 3) {
                    class2.field34[class59.field1445++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class3() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field54[var1] = this.field69;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)I")
    public final int method18(int arg0, int arg1, int arg2) {
        if (arg2 != 23535) {
            this.method16(-89);
        }
        int var4 = this.field74;
        int var5 = this.field65;
        field75++;
        this.field74 = 300;
        this.field65 = 1;
        this.field69 = class29.method235(-329);
        if (this.field54[this.field63] == 0L) {
            this.field74 = var4;
            this.field65 = var5;
        } else if (this.field69 > this.field54[this.field63]) {
            this.field74 = (int) ((long) (arg1 * 2560) / (this.field69 - this.field54[this.field63]));
        }
        if (this.field74 < 25) {
            this.field74 = 25;
        }
        if (this.field74 > 256) {
            this.field74 = 256;
            this.field65 = (int) ((long) arg1 - (this.field69 - this.field54[this.field63]) / 10L);
        }
        if (this.field65 > arg1) {
            this.field65 = arg1;
        }
        this.field54[this.field63] = this.field69;
        this.field63 = (this.field63 + 1) % 10;
        if (this.field65 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field54[var6] != 0L) {
                    this.field54[var6] += this.field65;
                }
            }
        }
        if (arg0 > this.field65) {
            this.field65 = arg0;
        }
        int var7 = 0;
        class126.method962(false, (long) this.field65);
        while (this.field73 < 256) {
            var7++;
            this.field73 += this.field74;
        }
        this.field73 &= 0xFF;
        return var7;
    }
}
