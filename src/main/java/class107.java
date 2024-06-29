import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class107 {

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[I")
    private int[] field2649 = new int[256];

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[I")
    private int[] field2653 = new int[256];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lv;")
    private static class122 field2638 = class55.method425(-114, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lv;")
    public static class122 field2650 = class55.method425(-98, " x");

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lv;")
    public static class122 field2641 = class55.method425(-60, "(Y");

    @OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
    public static int[] field2652 = new int[99];

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Lv;")
    private static class122 field2658 = class55.method425(-84, "Error connecting to server)3");

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lv;")
    public static class122 field2643 = field2658;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "Lv;")
    public static class122 field2659 = field2638;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2657 = -1;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "Lv;")
    public static class122 field2662;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    private int field2647;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    private int field2651;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    private int field2654;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    private int field2655;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "J")
    public static long field2639;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2640;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2652[var1] = var0 / 4;
        }
        field2661 = 0;
        field2662 = class55.method425(-57, "Classic");
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I", line = 3)
    public final int method829(int arg0) {
        field2646++;
        if (this.field2647-- == 0) {
            this.method833(-1591506782);
            this.field2647 = 255;
        }
        int var2 = 34 % ((arg0 - 71) / 55);
        return this.field2649[this.field2647];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V", line = 22)
    public static final void method830(long arg0, int arg1) {
        field2648++;
        try {
            if (arg1 != -257) {
                method835(null, 49);
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 42)
    public static void method831(int arg0) {
        field2640 = null;
        field2650 = null;
        field2638 = null;
        field2659 = null;
        field2662 = null;
        field2652 = null;
        if (arg0 != -1591506782) {
            field2640 = null;
        }
        field2643 = null;
        field2641 = null;
        field2658 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBIIII)I", line = 80)
    public static final int method832(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg5;
            arg5 = var7;
        }
        field2660++;
        int var8 = arg0 & 0x3;
        if (arg2 >= -106) {
            field2652 = null;
        }
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg4 - arg6;
        } else {
            return 7 + 1 - arg1 - arg5;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 122)
    private final void method833(int arg0) {
        field2644++;
        this.field2655 += ++this.field2654;
        if (arg0 != -1591506782) {
            field2641 = null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2653[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2651 ^= this.field2651 << 13;
                } else {
                    this.field2651 ^= this.field2651 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2651 ^= this.field2651 << 2;
            } else {
                this.field2651 ^= this.field2651 >>> 16;
            }
            this.field2651 += this.field2653[var2 + 128 & 0xFF];
            int var4;
            this.field2653[var2] = var4 = this.field2655 + this.field2651 + this.field2653[class30.method286(var3, 1020) >> 2];
            this.field2649[var2] = this.field2655 = this.field2653[class30.method286(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILhe;)V", line = 173)
    public static final void method834(int arg0, class47 arg1) {
        class19.field482 = arg1;
        if (arg0 != -4) {
            method834(72, null);
        }
        field2645++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lv;I)V", line = 189)
    public static final void method835(class122 arg0, int arg1) {
        field2642++;
        if (arg0 == null || arg0.method946(70) == 0) {
            class5.field129 = 0;
            return;
        }
        class122 var2 = arg0;
        class122[] var3 = new class122[100];
        if (arg1 < 15) {
            return;
        }
        int var4 = 0;
        while (true) {
            int var5 = var2.method935(32, 68);
            if (var5 == -1) {
                class122 var6 = var2.method957(-66);
                if (var6.method946(70) > 0) {
                    var3[var4++] = var6.method962(40);
                }
                class5.field129 = 0;
                label51: for (int var7 = 0; var7 < class73.field1930; var7++) {
                    class10 var8 = class5.method69(var7, false);
                    if (var8.field233 == -1 && var8.field222 != null) {
                        class122 var9 = var8.field222.method962(40);
                        for (int var10 = 0; var10 < var4; var10++) {
                            if (var9.method955(24669, var3[var10]) == -1) {
                                continue label51;
                            }
                        }
                        class112.field2717[class5.field129] = var9;
                        class67.field1724[class5.field129] = var7;
                        class5.field129++;
                        if (class112.field2717.length <= class5.field129) {
                            return;
                        }
                    }
                }
                return;
            }
            class122 var11 = var2.method951(7835, var5, 0).method957(-66);
            if (var11.method946(70) > 0) {
                var3[var4++] = var11.method962(40);
            }
            var2 = var2.method960(var5 + 1, 125);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 277)
    private final void method836(byte arg0) {
        field2656++;
        if (arg0 <= 73) {
            return;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2649[var11] + var9;
            int var38 = this.field2649[var11 + 1] + var8;
            int var39 = this.field2649[var11 + 2] + var7;
            int var40 = this.field2649[var11 + 3] + var6;
            int var41 = this.field2649[var11 + 7] + var2;
            int var42 = this.field2649[var11 + 4] + var5;
            int var43 = this.field2649[var11 + 5] + var4;
            int var44 = var37 ^ var38 << 11;
            int var45 = this.field2649[var11 + 6] + var3;
            int var46 = var38 + var39;
            int var47 = var46 ^ var39 >>> 2;
            int var48 = var40 + var44;
            int var49 = var42 + var47;
            int var50 = var39 + var48;
            int var51 = var50 ^ var48 << 8;
            int var52 = var48 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var6 + var45;
            int var54 = var43 + var51;
            int var55 = var49 + var54;
            var5 = var55 ^ var54 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var41;
            var4 = var56 ^ var53 >>> 4;
            int var58 = var4 + var44;
            int var59 = var53 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var47;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field2653[var11] = var9;
            this.field2653[var11 + 1] = var8;
            var7 = var2 + var51;
            this.field2653[var11 + 2] = var7;
            this.field2653[var11 + 3] = var6;
            this.field2653[var11 + 4] = var5;
            this.field2653[var11 + 5] = var4;
            this.field2653[var11 + 6] = var3;
            this.field2653[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2653[var12 + 2] + var7;
            int var14 = this.field2653[var12 + 3] + var6;
            int var15 = this.field2653[var12 + 1] + var8;
            int var16 = this.field2653[var12 + 5] + var4;
            int var17 = this.field2653[var12 + 7] + var2;
            int var18 = this.field2653[var12] + var9;
            int var19 = var18 ^ var15 << 11;
            int var20 = var14 + var19;
            int var21 = this.field2653[var12 + 4] + var5;
            int var22 = this.field2653[var12 + 6] + var3;
            int var23 = var13 + var15;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var21 + var24;
            int var26 = var13 + var20;
            int var27 = var26 ^ var20 << 8;
            int var28 = var20 + var25;
            var6 = var28 ^ var25 >>> 16;
            int var29 = var6 + var22;
            int var30 = var16 + var27;
            int var31 = var25 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var29 + var30;
            var4 = var32 ^ var29 >>> 4;
            int var33 = var5 + var17;
            int var34 = var29 + var33;
            var3 = var34 ^ var33 << 8;
            int var35 = var4 + var19;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2653[var12] = var9;
            this.field2653[var12 + 1] = var8;
            this.field2653[var12 + 2] = var7;
            this.field2653[var12 + 3] = var6;
            this.field2653[var12 + 4] = var5;
            this.field2653[var12 + 5] = var4;
            this.field2653[var12 + 6] = var3;
            this.field2653[var12 + 7] = var2;
        }
        this.method833(-1591506782);
        this.field2647 = 256;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([I)V", line = 428)
    public class107(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2649[var2] = arg0[var2];
        }
        this.method836((byte) 125);
    }
}
