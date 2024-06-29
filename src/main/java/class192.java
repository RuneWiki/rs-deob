import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class192 {

    @OriginalMember(owner = "client!co", name = "m", descriptor = "[I")
    private int[] field2432;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "[I")
    private int[] field2428;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "[I")
    public static int[] field2423 = new int[250];

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    private int field2433;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 9)
    private final void method1028(int arg0) {
        field2427++;
        if (arg0 <= 76) {
            this.field2433 = 121;
        }
        this.field2430 += ++this.field2433;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2432[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2431 ^= this.field2431 << 13;
                } else {
                    this.field2431 ^= this.field2431 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2431 ^= this.field2431 << 2;
            } else {
                this.field2431 ^= this.field2431 >>> 16;
            }
            this.field2431 += this.field2432[var2 + 128 & 0xFF];
            int var4;
            this.field2432[var2] = var4 = this.field2432[class262.method1461(255, var3 >> 2)] + this.field2431 + this.field2430;
            this.field2428[var2] = this.field2430 = var3 + this.field2432[class262.method1461(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(CI)Z", line = 58)
    public static final boolean method1029(char arg0, int arg1) {
        field2425++;
        if (arg1 != -17255) {
            field2423 = null;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V", line = 74)
    private final void method1030(int arg0) {
        field2429++;
        if (arg0 != -2) {
            method1032(-30, 0, -21, -48);
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
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2428[var11] + var9;
            int var38 = this.field2428[var11 + 2] + var7;
            int var39 = this.field2428[var11 + 4] + var5;
            int var40 = this.field2428[var11 + 1] + var8;
            int var41 = this.field2428[var11 + 5] + var4;
            int var42 = this.field2428[var11 + 6] + var3;
            int var43 = this.field2428[var11 + 7] + var2;
            int var44 = this.field2428[var11 + 3] + var6;
            int var45 = var37 ^ var40 << 11;
            int var46 = var44 + var45;
            int var47 = var38 + var40;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var39 + var48;
            int var50 = var38 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var41 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var42;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var43;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field2432[var11] = var9;
            this.field2432[var11 + 1] = var8;
            this.field2432[var11 + 2] = var7;
            this.field2432[var11 + 3] = var6;
            this.field2432[var11 + 4] = var5;
            this.field2432[var11 + 5] = var4;
            this.field2432[var11 + 6] = var3;
            this.field2432[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2432[var12] + var9;
            int var14 = this.field2432[var12 + 2] + var7;
            int var15 = this.field2432[var12 + 6] + var3;
            int var16 = this.field2432[var12 + 4] + var5;
            int var17 = this.field2432[var12 + 1] + var8;
            int var18 = this.field2432[var12 + 3] + var6;
            int var19 = this.field2432[var12 + 7] + var2;
            int var20 = this.field2432[var12 + 5] + var4;
            int var21 = var13 ^ var17 << 11;
            int var22 = var18 + var21;
            int var23 = var14 + var17;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var16 + var24;
            int var26 = var14 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var20 + var27;
            int var29 = var22 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var15;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var19;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field2432[var12] = var9;
            this.field2432[var12 + 1] = var8;
            this.field2432[var12 + 2] = var7;
            this.field2432[var12 + 3] = var6;
            this.field2432[var12 + 4] = var5;
            this.field2432[var12 + 5] = var4;
            this.field2432[var12 + 6] = var3;
            this.field2432[var12 + 7] = var2;
        }
        this.method1028(85);
        this.field2422 = 256;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)I", line = 225)
    public final int method1031(int arg0) {
        if (arg0 >= -5) {
            this.field2432 = null;
        }
        if (this.field2422-- == 0) {
            this.method1028(100);
            this.field2422 = 255;
        }
        field2426++;
        return this.field2428[this.field2422];
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)V", line = 245)
    public static final void method1032(int arg0, int arg1, int arg2, int arg3) {
        field2424++;
        if (arg2 == 0) {
            class10.field92++;
            class281.field3857.method295(20579, 135);
        }
        if (arg2 == 1) {
            class131.field1680++;
            class281.field3857.method295(20579, 169);
        }
        class281.field3857.method1360(class291.field3961 + arg3, -119);
        class281.field3857.method1360(class70.field767 + arg0, -114);
        class281.field3857.method1354(class249.field3361[82] ? 1 : 0, -96);
        class6.field52 = false;
        if (arg1 == 256) {
            class149.field1894 = arg3;
            class324.field4321 = arg0;
            class200.method1075(9);
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V", line = 274)
    public static void method1033(int arg0) {
        field2423 = null;
        if (arg0 < 31) {
            method1032(-4, 119, 33, 61);
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V", line = 290)
    private class192() {
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "([I)V", line = 292)
    public class192(int[] arg0) {
        this.field2432 = new int[256];
        this.field2428 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2428[var2] = arg0[var2];
        }
        this.method1030(-2);
    }
}
