import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class146 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    private int[] field2729;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[I")
    private int[] field2745;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2731 = 0;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "[Li;")
    public static class88[] field2743 = new class88[100];

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Li;")
    private static class88 field2737 = class208.method1425(105, "Location");

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "[I")
    public static int[] field2747 = new int[1000];

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Li;")
    public static class88 field2736 = field2737;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field2753 = 1;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lae;")
    public static class6 field2749 = new class6(5000);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    private int field2730;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    private int field2739;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    private int field2746;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Loi;")
    public static class161 field2740;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
    public static int[] field2733;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "[S")
    public static short[] field2752;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
    public static final void method974(byte arg0, int arg1) {
        if (arg0 >= -77) {
            method978(true);
        }
        field2734++;
        if (arg1 == -1 || !class211.method1447(0, arg1)) {
            return;
        }
        class174[] var2 = class78.field1418[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class174 var4 = var2[var3];
            if (var4.field3438 != null) {
                class39 var5 = new class39();
                var5.field678 = var4;
                var5.field681 = var4.field3438;
                class135.method904((byte) 112, var5, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)V")
    public static final void method975(int arg0, long arg1) {
        field2742++;
        if ((long) arg0 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < class67.field1221; var3++) {
            if (class95.field1765[var3] == arg1) {
                class59.field1111++;
                class67.field1221--;
                for (int var4 = var3; var4 < class67.field1221; var4++) {
                    class95.field1765[var4] = class95.field1765[var4 + 1];
                    field2743[var4] = field2743[var4 + 1];
                }
                class20.field313 = class67.field1211;
                field2749.method30((byte) -67, 126);
                field2749.method328(arg1, (byte) -122);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
    public static final void method976(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field962; var4++) {
            class108 var5 = var3.field963[var4];
            if ((var5.field1950 >> 29 & 0x3L) == 2L && var5.field1935 == arg1 && var5.field1938 == arg2) {
                class137.method917(var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static final void method977(int arg0) {
        if (arg0 != 52776016) {
            field2743 = null;
        }
        field2735++;
        if (class166.field3190 != null) {
            class53 var1 = class166.field3190;
            synchronized (class166.field3190) {
                class166.field3190 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method978(boolean arg0) {
        field2749 = null;
        field2740 = null;
        field2733 = null;
        field2737 = null;
        field2747 = null;
        if (arg0) {
            field2744 = -120;
        }
        field2736 = null;
        field2743 = null;
        field2752 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method979(byte arg0) {
        Object var1 = class33.field533;
        synchronized (class33.field533) {
            if (class225.field4233 == 0) {
                class126.field2326.method1289(2, new class31(), 5);
            }
            class225.field4233 = 600;
            if (arg0 >= -126) {
                method976(-24, -125, -72);
            }
        }
        field2741++;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
    public final int method980(int arg0) {
        if (arg0 != 255) {
            method979((byte) 85);
        }
        field2748++;
        if (this.field2751-- == 0) {
            this.method982(-68);
            this.field2751 = 255;
        }
        return this.field2745[this.field2751];
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
    private final void method981(boolean arg0) {
        field2750++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0) {
            this.method980(-71);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var64 >>> 16;
            int var70 = var64 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var63;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2745[var11 + 6] + var3;
            int var38 = this.field2745[var11 + 3] + var6;
            int var39 = this.field2745[var11] + var9;
            int var40 = this.field2745[var11 + 4] + var5;
            int var41 = this.field2745[var11 + 7] + var2;
            int var42 = this.field2745[var11 + 1] + var8;
            int var43 = this.field2745[var11 + 2] + var7;
            int var44 = this.field2745[var11 + 5] + var4;
            int var45 = var39 ^ var42 << 11;
            int var46 = var38 + var45;
            int var47 = var42 + var43;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var40 + var48;
            int var50 = var43 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var44 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var37;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var41;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var59 = var4 + var45;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2729[var11] = var9;
            this.field2729[var11 + 1] = var8;
            this.field2729[var11 + 2] = var7;
            this.field2729[var11 + 3] = var6;
            this.field2729[var11 + 4] = var5;
            this.field2729[var11 + 5] = var4;
            this.field2729[var11 + 6] = var3;
            this.field2729[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2729[var12 + 1] + var8;
            int var14 = this.field2729[var12 + 4] + var5;
            int var15 = this.field2729[var12 + 3] + var6;
            int var16 = this.field2729[var12 + 2] + var7;
            int var17 = this.field2729[var12 + 5] + var4;
            int var18 = this.field2729[var12 + 6] + var3;
            int var19 = this.field2729[var12] + var9;
            int var20 = this.field2729[var12 + 7] + var2;
            int var21 = var19 ^ var13 << 11;
            int var22 = var13 + var16;
            int var23 = var15 + var21;
            int var24 = var22 ^ var16 >>> 2;
            int var25 = var16 + var23;
            int var26 = var25 ^ var23 << 8;
            int var27 = var17 + var26;
            int var28 = var14 + var24;
            int var29 = var23 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var6 + var18;
            int var31 = var27 + var28;
            var5 = var31 ^ var27 << 10;
            int var32 = var27 + var30;
            var4 = var32 ^ var30 >>> 4;
            int var33 = var5 + var20;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var8 = var3 + var24;
            var9 = var8 + var34;
            this.field2729[var12] = var9;
            var7 = var2 + var26;
            this.field2729[var12 + 1] = var8;
            this.field2729[var12 + 2] = var7;
            this.field2729[var12 + 3] = var6;
            this.field2729[var12 + 4] = var5;
            this.field2729[var12 + 5] = var4;
            this.field2729[var12 + 6] = var3;
            this.field2729[var12 + 7] = var2;
        }
        this.method982(34);
        this.field2751 = 256;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    private final void method982(int arg0) {
        this.field2746 += ++this.field2739;
        int var2 = -45 % ((-arg0 - 20) / 41);
        field2732++;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field2729[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field2730 ^= this.field2730 << 13;
                } else {
                    this.field2730 ^= this.field2730 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field2730 ^= this.field2730 << 2;
            } else {
                this.field2730 ^= this.field2730 >>> 16;
            }
            this.field2730 += this.field2729[var3 + 128 & 0xFF];
            int var5;
            this.field2729[var3] = var5 = this.field2730 + this.field2729[class70.method470(1020, var4) >> 2] + this.field2746;
            this.field2745[var3] = this.field2746 = var4 + this.field2729[class70.method470(1020, var5 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    private class146() {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([I)V")
    public class146(int[] arg0) {
        this.field2729 = new int[256];
        this.field2745 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2745[var2] = arg0[var2];
        }
        this.method981(false);
    }
}
