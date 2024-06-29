import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class178 {

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
    private int[] field3286;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
    private int[] field3290;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[J")
    public static long[] field3282 = new long[100];

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field3281 = 3;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "J")
    public static long field3284 = 0L;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
    public static int[] field3283 = new int[4000];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    private int field3276;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    private int field3277;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    private int field3287;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    private int field3288;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    private final void method1149(int arg0) {
        field3285++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var62 = var9 ^ var8 << 11;
            int var63 = var7 + var8;
            int var64 = var6 + var62;
            int var65 = var63 ^ var7 >>> 2;
            int var66 = var5 + var65;
            int var67 = var7 + var64;
            int var68 = var67 ^ var64 << 8;
            int var69 = var64 + var66;
            int var70 = var4 + var68;
            var6 = var69 ^ var66 >>> 16;
            int var71 = var3 + var6;
            int var72 = var66 + var70;
            var5 = var72 ^ var70 << 10;
            int var73 = var70 + var71;
            int var74 = var2 + var5;
            var4 = var73 ^ var71 >>> 4;
            int var75 = var4 + var62;
            int var76 = var71 + var74;
            var3 = var76 ^ var74 << 8;
            var8 = var3 + var65;
            int var77 = var74 + var75;
            var2 = var77 ^ var75 >>> 9;
            var7 = var2 + var68;
            var9 = var8 + var75;
        }
        int var11 = 22 / ((arg0 + 1) / 33);
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var38 = this.field3286[var12] + var9;
            int var39 = this.field3286[var12 + 4] + var5;
            int var40 = this.field3286[var12 + 3] + var6;
            int var41 = this.field3286[var12 + 6] + var3;
            int var42 = this.field3286[var12 + 1] + var8;
            int var43 = this.field3286[var12 + 5] + var4;
            int var44 = this.field3286[var12 + 7] + var2;
            int var45 = var38 ^ var42 << 11;
            int var46 = this.field3286[var12 + 2] + var7;
            int var47 = var40 + var45;
            int var48 = var42 + var46;
            int var49 = var48 ^ var46 >>> 2;
            int var50 = var46 + var47;
            int var51 = var39 + var49;
            int var52 = var50 ^ var47 << 8;
            int var53 = var47 + var51;
            int var54 = var43 + var52;
            var6 = var53 ^ var51 >>> 16;
            int var55 = var6 + var41;
            int var56 = var51 + var54;
            var5 = var56 ^ var54 << 10;
            int var57 = var54 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var5 + var44;
            int var59 = var4 + var45;
            int var60 = var55 + var58;
            var3 = var60 ^ var58 << 8;
            var8 = var3 + var49;
            int var61 = var58 + var59;
            var2 = var61 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field3290[var12] = var9;
            var7 = var2 + var52;
            this.field3290[var12 + 1] = var8;
            this.field3290[var12 + 2] = var7;
            this.field3290[var12 + 3] = var6;
            this.field3290[var12 + 4] = var5;
            this.field3290[var12 + 5] = var4;
            this.field3290[var12 + 6] = var3;
            this.field3290[var12 + 7] = var2;
        }
        for (int var13 = 0; var13 < 256; var13 += 8) {
            int var14 = this.field3290[var13 + 6] + var3;
            int var15 = this.field3290[var13 + 1] + var8;
            int var16 = this.field3290[var13 + 3] + var6;
            int var17 = this.field3290[var13 + 4] + var5;
            int var18 = this.field3290[var13 + 7] + var2;
            int var19 = this.field3290[var13 + 5] + var4;
            int var20 = this.field3290[var13 + 2] + var7;
            int var21 = this.field3290[var13] + var9;
            int var22 = var21 ^ var15 << 11;
            int var23 = var16 + var22;
            int var24 = var15 + var20;
            int var25 = var24 ^ var20 >>> 2;
            int var26 = var20 + var23;
            int var27 = var17 + var25;
            int var28 = var26 ^ var23 << 8;
            int var29 = var19 + var28;
            int var30 = var23 + var27;
            var6 = var30 ^ var27 >>> 16;
            int var31 = var27 + var29;
            int var32 = var6 + var14;
            var5 = var31 ^ var29 << 10;
            int var33 = var5 + var18;
            int var34 = var29 + var32;
            var4 = var34 ^ var32 >>> 4;
            int var35 = var4 + var22;
            int var36 = var32 + var33;
            var3 = var36 ^ var33 << 8;
            var8 = var3 + var25;
            int var37 = var33 + var35;
            var2 = var37 ^ var35 >>> 9;
            var7 = var2 + var28;
            var9 = var8 + var35;
            this.field3290[var13] = var9;
            this.field3290[var13 + 1] = var8;
            this.field3290[var13 + 2] = var7;
            this.field3290[var13 + 3] = var6;
            this.field3290[var13 + 4] = var5;
            this.field3290[var13 + 5] = var4;
            this.field3290[var13 + 6] = var3;
            this.field3290[var13 + 7] = var2;
        }
        this.method1153((byte) 125);
        this.field3288 = 256;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static final void method1150(int arg0) {
        class167.method1097(class47.field813, 61, class45.field784, class187.field3461);
        if (arg0 != -7251) {
            field3282 = null;
        }
        field3280++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I")
    public final int method1151(byte arg0) {
        int var2 = -74 / ((81 - arg0) / 43);
        field3289++;
        if (this.field3288-- == 0) {
            this.method1153((byte) 113);
            this.field3288 = 255;
        }
        return this.field3286[this.field3288];
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public static void method1152(byte arg0) {
        field3282 = null;
        field3283 = null;
        if (arg0 > -86) {
            method1152((byte) 73);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
    private final void method1153(byte arg0) {
        field3278++;
        this.field3276 += ++this.field3277;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3290[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3287 ^= this.field3287 << 13;
                } else {
                    this.field3287 ^= this.field3287 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3287 ^= this.field3287 << 2;
            } else {
                this.field3287 ^= this.field3287 >>> 16;
            }
            this.field3287 += this.field3290[var2 + 128 & 0xFF];
            int var4;
            this.field3290[var2] = var4 = this.field3287 + this.field3276 + this.field3290[class75.method450(1020, var3) >> 2];
            this.field3286[var2] = this.field3276 = var3 + this.field3290[class75.method450(1020, var4 >> 8) >> 2];
        }
        if (arg0 < 106) {
            this.field3290 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
    public static final void method1154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= arg1) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class61.field1033[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class61.field1033[var6][arg4] = arg0;
            }
        }
        field3279++;
        int var7 = -43 % ((32 - arg2) / 62);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    private class178() {
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([I)V")
    public class178(int[] arg0) {
        this.field3286 = new int[256];
        this.field3290 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3286[var2] = arg0[var2];
        }
        this.method1149(-36);
    }
}
