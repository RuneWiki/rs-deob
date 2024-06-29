import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class207 {

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "[I")
    private int[] field3684;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[I")
    private int[] field3691;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3682 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Le;")
    private static class191 field3681 = class54.method368("Loaded sprites", 2047);

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "[I")
    public static int[] field3692 = new int[32];

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Le;")
    public static class191 field3678 = field3681;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "[J")
    public static long[] field3693 = new long[100];

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field3680 = 100;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    private int field3687;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    private int field3688;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    private int field3689;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    private int field3694;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "[S")
    public static short[] field3696;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)I")
    public static final int method1422(int arg0, int arg1, int arg2, int arg3) {
        field3695++;
        int var4 = arg1 / arg0;
        int var5 = arg3 / arg0;
        int var6 = arg0 - 1 & arg1;
        int var7 = arg0 - 1 & arg3;
        int var8 = 49 / ((-arg2 - 35) / 47);
        int var9 = class107.method686(87, var4, var5);
        int var10 = class107.method686(112, var4 + 1, var5);
        int var11 = class107.method686(92, var4, var5 + 1);
        int var12 = class107.method686(96, var4 + 1, var5 + 1);
        int var13 = class262.method1798(arg0, var9, var10, -39, var6);
        int var14 = class262.method1798(arg0, var11, var12, 87, var6);
        return class262.method1798(arg0, var13, var14, -39, var7);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static void method1423(boolean arg0) {
        if (!arg0) {
            field3681 = null;
        }
        field3681 = null;
        field3692 = null;
        field3696 = null;
        field3693 = null;
        field3678 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)I")
    public final int method1424(byte arg0) {
        int var2 = -116 % ((-arg0 - 42) / 44);
        field3677++;
        if (this.field3687-- == 0) {
            this.method1428(true);
            this.field3687 = 255;
        }
        return this.field3691[this.field3687];
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Le;BILe;)V")
    public static final void method1425(class191 arg0, byte arg1, int arg2, class191 arg3) {
        class26.field375 = arg0;
        if (arg1 != 32) {
            return;
        }
        class105.field1749 = false;
        class26.field381 = arg3;
        class233.field4154 = arg2;
        field3675++;
        class100.field1602 = 0;
        if (class26.field381.method1317(-27518, class26.field385) || class26.field375.method1317(-27518, class26.field385)) {
            class49.field894 = 0;
            class240.field4263 = 3;
        } else {
            class210.field3732 = 0;
            class240.field4263 = -3;
            class49.field894 = 1;
            class209.field3703 = 0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    private final void method1426(int arg0) {
        field3679++;
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
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var72 << 8;
            int var75 = var4 + var61;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var64;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3691[var11 + 7] + var2;
            int var38 = this.field3691[var11 + 3] + var6;
            int var39 = this.field3691[var11 + 6] + var3;
            int var40 = this.field3691[var11 + 2] + var7;
            int var41 = this.field3691[var11 + 4] + var5;
            int var42 = this.field3691[var11] + var9;
            int var43 = this.field3691[var11 + 1] + var8;
            int var44 = this.field3691[var11 + 5] + var4;
            int var45 = var42 ^ var43 << 11;
            int var46 = var40 + var43;
            int var47 = var46 ^ var40 >>> 2;
            int var48 = var41 + var47;
            int var49 = var38 + var45;
            int var50 = var40 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var44 + var51;
            int var53 = var48 + var49;
            var6 = var53 ^ var48 >>> 16;
            int var54 = var6 + var39;
            int var55 = var48 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var37;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var47;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field3684[var11] = var9;
            var7 = var2 + var51;
            this.field3684[var11 + 1] = var8;
            this.field3684[var11 + 2] = var7;
            this.field3684[var11 + 3] = var6;
            this.field3684[var11 + 4] = var5;
            this.field3684[var11 + 5] = var4;
            this.field3684[var11 + 6] = var3;
            this.field3684[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3684[var12 + 2] + var7;
            int var14 = this.field3684[var12 + 1] + var8;
            int var15 = this.field3684[var12 + 3] + var6;
            int var16 = this.field3684[var12 + 6] + var3;
            int var17 = this.field3684[var12 + 7] + var2;
            int var18 = this.field3684[var12 + 5] + var4;
            int var19 = this.field3684[var12] + var9;
            int var20 = this.field3684[var12 + 4] + var5;
            int var21 = var19 ^ var14 << 11;
            int var22 = var13 + var14;
            int var23 = var22 ^ var13 >>> 2;
            int var24 = var15 + var21;
            int var25 = var20 + var23;
            int var26 = var13 + var24;
            int var27 = var26 ^ var24 << 8;
            int var28 = var18 + var27;
            int var29 = var24 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var16;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var17;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            var3 = var34 ^ var32 << 8;
            int var35 = var4 + var21;
            int var36 = var32 + var35;
            var8 = var3 + var23;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field3684[var12] = var9;
            this.field3684[var12 + 1] = var8;
            this.field3684[var12 + 2] = var7;
            this.field3684[var12 + 3] = var6;
            this.field3684[var12 + 4] = var5;
            this.field3684[var12 + 5] = var4;
            this.field3684[var12 + 6] = var3;
            this.field3684[var12 + 7] = var2;
        }
        if (arg0 != -1910903096) {
            field3682 = -56;
        }
        this.method1428(true);
        this.field3687 = 256;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V")
    public static final void method1427(int arg0, int arg1) {
        field3676++;
        class137.field2307.method990(113, arg0);
        class248.field4397.method990(70, arg0);
        if (arg1 != 2) {
            method1422(96, 38, -22, 6);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V")
    private final void method1428(boolean arg0) {
        field3683++;
        this.field3694 += ++this.field3689;
        if (!arg0) {
            this.method1424((byte) 111);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3684[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3688 ^= this.field3688 << 13;
                } else {
                    this.field3688 ^= this.field3688 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3688 ^= this.field3688 << 2;
            } else {
                this.field3688 ^= this.field3688 >>> 16;
            }
            this.field3688 += this.field3684[var2 + 128 & 0xFF];
            int var4;
            this.field3684[var2] = var4 = this.field3684[class167.method1128(var3, 1020) >> 2] - (-this.field3688 - this.field3694);
            this.field3691[var2] = this.field3694 = this.field3684[class167.method1128(261124, var4) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lji;B)Lpb;")
    public static final class243 method1429(class225 arg0, byte arg1) {
        field3685++;
        if (arg1 != -27) {
            field3681 = null;
        }
        return new class243(arg0.method1568(112), arg0.method1568(118), arg0.method1568(119), arg0.method1568(123), arg0.method1591(2), arg0.method1591(2), arg0.method1580(-70));
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    private class207() {
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "([I)V")
    public class207(int[] arg0) {
        this.field3684 = new int[256];
        this.field3691 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3691[var2] = arg0[var2];
        }
        this.method1426(-1910903096);
    }
}
