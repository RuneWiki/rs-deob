import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class42 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
    private int[] field508;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[I")
    private int[] field520;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Lef;")
    public static class241 field514 = new class241(16);

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[I")
    public static int[] field521 = new int[14];

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[Lwj;")
    public static class130[] field517;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIII)V")
    public static final void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -108 % ((54 - arg5) / 53);
        if (arg2 >= class177.field2514 && class279.field4238 >= arg1 && class286.field4431 <= arg4 && arg3 <= class230.field3302) {
            class99.method598(arg1, arg2, arg0, -7533, arg3, arg4);
        } else {
            class241.method1569(arg2, arg3, 116, arg1, arg0, arg4);
        }
        field509++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZII)V")
    public static final void method262(boolean arg0, int arg1, int arg2) {
        field505++;
        if (!arg0) {
            method262(true, -7, -29);
        }
        int var3 = class137.field1989 * arg2 >> 8;
        if (arg1 == -1 && !class19.field240) {
            class6.method35(71);
        } else if (arg1 != -1 && (class34.field400 != arg1 || !class35.method216(0)) && var3 != 0 && !class19.field240) {
            class79.method477(false, 1, arg1, var3, class163.field2346, 2, 0);
        }
        class34.field400 = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILwe;)Lwe;")
    public static final class82 method263(int arg0, class82 arg1) {
        field506++;
        if (arg1.field1101 != -1) {
            return class182.method1187((byte) -41, arg1.field1101);
        }
        int var2 = arg1.field1025 >>> 16;
        class72 var3 = new class72(class189.field2705);
        for (class166 var4 = (class166) var3.method446(5915); var4 != null; var4 = (class166) var3.method443(32)) {
            if (var4.field2395 == var2) {
                return class182.method1187((byte) -41, (int) var4.field4489);
            }
        }
        if (arg0 > -77) {
            field517 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
    public final int method264(int arg0) {
        if (arg0 != -28992) {
            return -16;
        }
        if (this.field515-- == 0) {
            this.method265(255);
            this.field515 = 255;
        }
        field518++;
        return this.field520[this.field515];
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    private final void method265(int arg0) {
        if (arg0 != 255) {
            return;
        }
        field511++;
        this.field507 += ++this.field513;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field508[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field512 ^= this.field512 << 13;
                } else {
                    this.field512 ^= this.field512 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field512 ^= this.field512 << 2;
            } else {
                this.field512 ^= this.field512 >>> 16;
            }
            this.field512 += this.field508[var2 + 128 & 0xFF];
            int var4;
            this.field508[var2] = var4 = this.field512 + this.field508[class5.method26(255, var3 >> 2)] + this.field507;
            this.field520[var2] = this.field507 = var3 + this.field508[class5.method26(var4 >> 8, 1020) >> 2];
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    private final void method266(int arg0) {
        field516++;
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
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var5 + var63;
            int var66 = var7 + var64;
            int var67 = var66 ^ var64 << 8;
            int var68 = var64 + var65;
            int var69 = var4 + var67;
            var6 = var68 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            var4 = var72 ^ var70 >>> 4;
            int var73 = var2 + var5;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var63;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        if (arg0 > -29) {
            return;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field520[var11] + var9;
            int var38 = this.field520[var11 + 1] + var8;
            int var39 = var37 ^ var38 << 11;
            int var40 = this.field520[var11 + 6] + var3;
            int var41 = this.field520[var11 + 7] + var2;
            int var42 = this.field520[var11 + 5] + var4;
            int var43 = this.field520[var11 + 2] + var7;
            int var44 = var38 + var43;
            int var45 = this.field520[var11 + 3] + var6;
            int var46 = var44 ^ var43 >>> 2;
            int var47 = var39 + var45;
            int var48 = this.field520[var11 + 4] + var5;
            int var49 = var46 + var48;
            int var50 = var43 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var42 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var40;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var41;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var39;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var46;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field508[var11] = var9;
            this.field508[var11 + 1] = var8;
            var7 = var2 + var51;
            this.field508[var11 + 2] = var7;
            this.field508[var11 + 3] = var6;
            this.field508[var11 + 4] = var5;
            this.field508[var11 + 5] = var4;
            this.field508[var11 + 6] = var3;
            this.field508[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field508[var12 + 5] + var4;
            int var14 = this.field508[var12 + 7] + var2;
            int var15 = this.field508[var12 + 3] + var6;
            int var16 = this.field508[var12 + 6] + var3;
            int var17 = this.field508[var12 + 4] + var5;
            int var18 = this.field508[var12 + 1] + var8;
            int var19 = this.field508[var12] + var9;
            int var20 = var19 ^ var18 << 11;
            int var21 = var15 + var20;
            int var22 = this.field508[var12 + 2] + var7;
            int var23 = var18 + var22;
            int var24 = var23 ^ var22 >>> 2;
            int var25 = var21 + var22;
            int var26 = var25 ^ var21 << 8;
            int var27 = var13 + var26;
            int var28 = var17 + var24;
            int var29 = var21 + var28;
            var6 = var29 ^ var28 >>> 16;
            int var30 = var27 + var28;
            var5 = var30 ^ var27 << 10;
            int var31 = var5 + var14;
            int var32 = var6 + var16;
            int var33 = var27 + var32;
            var4 = var33 ^ var32 >>> 4;
            int var34 = var4 + var20;
            int var35 = var31 + var32;
            var3 = var35 ^ var31 << 8;
            int var36 = var31 + var34;
            var2 = var36 ^ var34 >>> 9;
            var8 = var3 + var24;
            var7 = var2 + var26;
            var9 = var8 + var34;
            this.field508[var12] = var9;
            this.field508[var12 + 1] = var8;
            this.field508[var12 + 2] = var7;
            this.field508[var12 + 3] = var6;
            this.field508[var12 + 4] = var5;
            this.field508[var12 + 5] = var4;
            this.field508[var12 + 6] = var3;
            this.field508[var12 + 7] = var2;
        }
        this.method265(255);
        this.field515 = 256;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public static void method267(int arg0) {
        if (arg0 != -1) {
            method267(-118);
        }
        field514 = null;
        field517 = null;
        field521 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public static final void method268(int arg0, int arg1) {
        field510++;
        if (arg1 != 0) {
            field517 = null;
        }
        class51.field590.method62(-44, arg0);
        class54.field623.method62(arg1 ^ 0xFFFFFFED, arg0);
        class38.field464.method62(-51, arg0);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    private class42() {
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([I)V")
    public class42(int[] arg0) {
        this.field508 = new int[256];
        this.field520 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field520[var2] = arg0[var2];
        }
        this.method266(-75);
    }
}
