import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class244 {

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "[I")
    private int[] field3681;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
    private int[] field3677;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field3687 = 0;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[J")
    public static long[] field3679 = new long[10];

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    private int field3675;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    private int field3684;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    private int field3686;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    private int field3688;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Lfu;")
    public static class360 field3690;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)I")
    public final int method1613(int arg0) {
        if (this.field3688 == 0) {
            this.method1614(-1);
            this.field3688 = 256;
        }
        if (arg0 < 93) {
            method1620(-5);
        }
        field3682++;
        return this.field3681[this.field3688 - 1];
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    private final void method1614(int arg0) {
        field3678++;
        this.field3675 += ++this.field3684;
        if (arg0 != -1) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3677[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3686 ^= this.field3686 << 13;
                } else {
                    this.field3686 ^= this.field3686 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3686 ^= this.field3686 << 2;
            } else {
                this.field3686 ^= this.field3686 >>> 16;
            }
            this.field3686 += this.field3677[var2 + 128 & 0xFF];
            int var4;
            this.field3677[var2] = var4 = this.field3677[class481.method2919(var3, 1020) >> 2] + this.field3686 + this.field3675;
            this.field3681[var2] = this.field3675 = this.field3677[class481.method2919(1020, var4 >> 8) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)I")
    public final int method1615(int arg0) {
        if (~this.field3688 == arg0) {
            this.method1614(-1);
            this.field3688 = 256;
        }
        field3680++;
        return this.field3681[--this.field3688];
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public static void method1616(int arg0) {
        field3690 = null;
        field3679 = null;
        if (arg0 != -13411) {
            method1620(-119);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
    private final void method1617(boolean arg0) {
        field3689++;
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
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3681[var11 + 6] + var3;
            int var38 = this.field3681[var11 + 3] + var6;
            int var39 = this.field3681[var11 + 7] + var2;
            int var40 = this.field3681[var11 + 5] + var4;
            int var41 = this.field3681[var11] + var9;
            int var42 = this.field3681[var11 + 2] + var7;
            int var43 = this.field3681[var11 + 1] + var8;
            int var44 = this.field3681[var11 + 4] + var5;
            int var45 = var41 ^ var43 << 11;
            int var46 = var38 + var45;
            int var47 = var42 + var43;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var42 + var46;
            int var50 = var44 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var40 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var37;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var39;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field3677[var11] = var9;
            this.field3677[var11 + 1] = var8;
            this.field3677[var11 + 2] = var7;
            this.field3677[var11 + 3] = var6;
            this.field3677[var11 + 4] = var5;
            this.field3677[var11 + 5] = var4;
            this.field3677[var11 + 6] = var3;
            this.field3677[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3677[var12 + 6] + var3;
            int var14 = this.field3677[var12 + 7] + var2;
            int var15 = this.field3677[var12 + 4] + var5;
            int var16 = this.field3677[var12 + 5] + var4;
            int var17 = this.field3677[var12 + 2] + var7;
            int var18 = this.field3677[var12 + 3] + var6;
            int var19 = this.field3677[var12] + var9;
            int var20 = this.field3677[var12 + 1] + var8;
            int var21 = var19 ^ var20 << 11;
            int var22 = var17 + var20;
            int var23 = var18 + var21;
            int var24 = var22 ^ var17 >>> 2;
            int var25 = var17 + var23;
            int var26 = var15 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var16 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var13;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var14;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field3677[var12] = var9;
            this.field3677[var12 + 1] = var8;
            this.field3677[var12 + 2] = var7;
            this.field3677[var12 + 3] = var6;
            this.field3677[var12 + 4] = var5;
            this.field3677[var12 + 5] = var4;
            this.field3677[var12 + 6] = var3;
            this.field3677[var12 + 7] = var2;
        }
        if (!arg0) {
            this.field3675 = -55;
        }
        this.method1614(-1);
        this.field3688 = 256;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public static final void method1618(int arg0) {
        if (arg0 != -7) {
            field3679 = null;
        }
        field3685++;
        class194.field3046.method1913(true);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    private class244() {
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
    public static final void method1619(int arg0) {
        field3683++;
        if (arg0 != 81) {
            field3679 = null;
        }
        class441 var1 = (class441) class488.field6985.method1224(-2);
        boolean var2 = class44.field1094 != null || class386.field5665 > 0;
        if (var2) {
            class455.field6492 = 1;
        }
        if (class66.field1450 && class486.field6965.method2194(81, (byte) -58) && class481.field6904 > 2) {
            if (var2) {
                class509.field7215 = (class300) class126.field2292.field2700.field6139.field6139;
            } else {
                class602.method3443(var1.method1093(arg0 - 76), (byte) 116, var1.method1092(arg0 ^ 0xFFFFFFD1), (class300) class126.field2292.field2700.field6139.field6139);
            }
        } else if (var2) {
            class509.field7215 = (class300) class126.field2292.field2700.field6139;
        } else {
            class602.method3443(var1.method1093(5), (byte) 96, var1.method1092(-126), (class300) class126.field2292.field2700.field6139);
        }
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
    public static final void method1620(int arg0) {
        if (arg0 <= 67) {
            method1620(-87);
        }
        field3676++;
        class290.field4368.method1913(true);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "([I)V")
    public class244(int[] arg0) {
        this.field3681 = new int[256];
        this.field3677 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3681[var2] = arg0[var2];
        }
        this.method1617(true);
    }
}
