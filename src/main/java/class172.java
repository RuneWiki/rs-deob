import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class172 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
    private int[] field3146;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[I")
    private int[] field3153;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "J")
    public static volatile long field3149 = 0L;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    private int field3152;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    private int field3155;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    private int field3159;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[[[I")
    public static int[][][] field3157;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    private final void method1279(int arg0) {
        if (arg0 <= 126) {
            field3147 = 103;
        }
        field3158++;
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
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var8 = var3 + var64;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3153[var11 + 3] + var6;
            int var38 = this.field3153[var11 + 5] + var4;
            int var39 = this.field3153[var11 + 7] + var2;
            int var40 = this.field3153[var11 + 2] + var7;
            int var41 = this.field3153[var11 + 1] + var8;
            int var42 = this.field3153[var11] + var9;
            int var43 = this.field3153[var11 + 6] + var3;
            int var44 = var42 ^ var41 << 11;
            int var45 = var40 + var41;
            int var46 = this.field3153[var11 + 4] + var5;
            int var47 = var37 + var44;
            int var48 = var45 ^ var40 >>> 2;
            int var49 = var40 + var47;
            int var50 = var49 ^ var47 << 8;
            int var51 = var46 + var48;
            int var52 = var38 + var50;
            int var53 = var47 + var51;
            var6 = var53 ^ var51 >>> 16;
            int var54 = var6 + var43;
            int var55 = var51 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var39;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var44;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var50;
            this.field3146[var11] = var9;
            this.field3146[var11 + 1] = var8;
            this.field3146[var11 + 2] = var7;
            this.field3146[var11 + 3] = var6;
            this.field3146[var11 + 4] = var5;
            this.field3146[var11 + 5] = var4;
            this.field3146[var11 + 6] = var3;
            this.field3146[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3146[var12 + 4] + var5;
            int var14 = this.field3146[var12 + 7] + var2;
            int var15 = this.field3146[var12 + 3] + var6;
            int var16 = this.field3146[var12] + var9;
            int var17 = this.field3146[var12 + 2] + var7;
            int var18 = this.field3146[var12 + 1] + var8;
            int var19 = var16 ^ var18 << 11;
            int var20 = this.field3146[var12 + 6] + var3;
            int var21 = var15 + var19;
            int var22 = this.field3146[var12 + 5] + var4;
            int var23 = var17 + var18;
            int var24 = var23 ^ var17 >>> 2;
            int var25 = var17 + var21;
            int var26 = var13 + var24;
            int var27 = var25 ^ var21 << 8;
            int var28 = var22 + var27;
            int var29 = var21 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var6 + var20;
            int var31 = var26 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            int var33 = var5 + var14;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var19;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field3146[var12] = var9;
            this.field3146[var12 + 1] = var8;
            this.field3146[var12 + 2] = var7;
            this.field3146[var12 + 3] = var6;
            this.field3146[var12 + 4] = var5;
            this.field3146[var12 + 5] = var4;
            this.field3146[var12 + 6] = var3;
            this.field3146[var12 + 7] = var2;
        }
        this.method1280(838);
        this.field3152 = 256;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    private final void method1280(int arg0) {
        this.field3159 += ++this.field3155;
        field3148++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3146[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3150 ^= this.field3150 << 13;
                } else {
                    this.field3150 ^= this.field3150 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3150 ^= this.field3150 << 2;
            } else {
                this.field3150 ^= this.field3150 >>> 16;
            }
            this.field3150 += this.field3146[var2 + 128 & 0xFF];
            int var4;
            this.field3146[var2] = var4 = this.field3159 + this.field3150 + this.field3146[class7.method50(1020, var3) >> 2];
            this.field3153[var2] = this.field3159 = var3 + this.field3146[class7.method50(255, var4 >> 8 >> 2)];
        }
        if (arg0 != 838) {
            this.field3152 = -46;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)I")
    public final int method1281(int arg0) {
        if ((this.field3152--) == 0) {
            this.method1280(arg0 ^ 0x346);
            this.field3152 = 255;
        }
        field3154++;
        return arg0 == 0 ? this.field3153[this.field3152] : -13;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
    public static final void method1282(int arg0, boolean arg1) {
        field3156++;
        byte var2 = 4;
        byte[][] var3 = class160.field2943;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class199.field3572[var5] & 0xFF) * 64 - class257.field4500;
            byte[] var12 = var3[var5];
            int var13 = (class199.field3572[var5] >> 8) * 64 - class62.field1035;
            if (var12 != null) {
                class229.method1593(-115);
                class7.method52(class140.field2670, 17379, arg1, var11, var12, var13, (class102.field1965 - 6) * 8, (class29.field467 - 6) * 8);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class199.field3572[var6] >> 8) * 64 - class62.field1035;
            int var8 = (class199.field3572[var6] & 0xFF) * 64 - class257.field4500;
            byte[] var9 = var3[var6];
            if (var9 == null && class29.field467 < 800) {
                class229.method1593(-116);
                for (int var10 = 0; var10 < var2; var10++) {
                    method1283(64, var7, 64, var8, -124, var10);
                }
            }
        }
        if (arg0 != -257) {
            method1284(-43);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    private class172() {
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([I)V")
    public class172(int[] arg0) {
        this.field3146 = new int[256];
        this.field3153 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3153[var2] = arg0[var2];
        }
        this.method1279(127);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3151++;
        for (int var6 = arg3; var6 <= (arg0 + arg3); var6++) {
            for (int var12 = arg1; var12 <= arg1 + arg2; var12++) {
                if (var12 >= 0 && var12 < 104 && var6 >= 0 && var6 < 104) {
                    class119.field2241[arg5][var12][var6] = 127;
                }
            }
        }
        int var7 = -57 % ((78 - arg4) / 46);
        for (int var8 = arg3; var8 < arg3 + arg0; var8++) {
            for (int var11 = arg1; var11 < (arg1 + arg2); var11++) {
                if (var11 >= 0 && var11 < 104 && var8 >= 0 && var8 < 104) {
                    class228.field4107[arg5][var11][var8] = arg5 <= 0 ? 0 : class228.field4107[arg5 - 1][var11][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var9 = arg3 + 1; var9 < (arg0 + arg3); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class228.field4107[arg5][arg1][var9] = class228.field4107[arg5][arg1 - 1][var9];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg2; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class228.field4107[arg5][var10][arg3] = class228.field4107[arg5][var10][arg3 - 1];
                }
            }
        }
        if (arg1 < 0 || arg3 < 0 || arg1 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 > 0 && class228.field4107[arg5][arg1 - 1][arg3] != 0) {
                class228.field4107[arg5][arg1][arg3] = class228.field4107[arg5][arg1 - 1][arg3];
                return;
            }
            if (arg3 > 0 && class228.field4107[arg5][arg1][arg3 - 1] != 0) {
                class228.field4107[arg5][arg1][arg3] = class228.field4107[arg5][arg1][arg3 - 1];
                return;
            }
            if (arg1 > 0 && arg3 > 0 && class228.field4107[arg5][arg1 - 1][arg3 - 1] != 0) {
                class228.field4107[arg5][arg1][arg3] = class228.field4107[arg5][arg1 - 1][arg3 - 1];
                return;
            }
        } else if (arg1 <= 0 || class228.field4107[arg5 - 1][arg1 - 1][arg3] == class228.field4107[arg5][arg1 - 1][arg3]) {
            if (arg3 > 0 && class228.field4107[arg5][arg1][arg3 - 1] != class228.field4107[arg5 - 1][arg1][arg3 - 1]) {
                class228.field4107[arg5][arg1][arg3] = class228.field4107[arg5][arg1][arg3 - 1];
                return;
            }
            if (arg1 > 0 && arg3 > 0 && class228.field4107[arg5 - 1][arg1 - 1][arg3 - 1] != class228.field4107[arg5][arg1 - 1][arg3 - 1]) {
                class228.field4107[arg5][arg1][arg3] = class228.field4107[arg5][arg1 - 1][arg3 - 1];
                return;
            }
            return;
        } else {
            class228.field4107[arg5][arg1][arg3] = class228.field4107[arg5][arg1 - 1][arg3];
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public static void method1284(int arg0) {
        if (arg0 > -26) {
            field3149 = -125L;
        }
        field3157 = null;
    }
}
