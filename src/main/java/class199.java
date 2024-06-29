import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class199 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "[I")
    private int[] field3483;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[I")
    private int[] field3474;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[I")
    public static int[] field3478 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3475 = 0;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Ljf;")
    public static class229 field3484 = class212.method1457((byte) 120, "brillant1:");

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Ljf;")
    public static class229 field3481 = class212.method1457((byte) 109, ")0");

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    private int field3476;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    private int field3477;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    private int field3487;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1389(boolean arg0) {
        field3478 = null;
        field3481 = null;
        if (!arg0) {
            field3486 = 85;
        }
        field3484 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIII)V", line = 23)
    public static final void method1390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3482++;
        int var6 = class129.method909(class56.field991, 0, arg2, class142.field2458);
        int var7 = class129.method909(class56.field991, arg1 - 625350280, arg3, class142.field2458);
        int var8 = class129.method909(class149.field2578, 0, arg0, class327.field5490);
        int var9 = class129.method909(class149.field2578, arg1 ^ arg1, arg5, class327.field5490);
        for (int var10 = var6; var10 <= var7; var10++) {
            class34.method306(var8, class173.field3021[var10], (byte) 114, var9, arg4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)I", line = 60)
    public final int method1391(byte arg0) {
        field3480++;
        if (arg0 != 41) {
            return -115;
        }
        if ((this.field3487--) == 0) {
            this.method1393(true);
            this.field3487 = 255;
        }
        return this.field3483[this.field3487];
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 84)
    private class199() {
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 88)
    private final void method1392(int arg0) {
        field3473++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var5 + var14;
            int var17 = var15 ^ var12 << 8;
            int var18 = var12 + var16;
            var6 = var18 ^ var16 >>> 16;
            int var19 = var4 + var17;
            int var20 = var3 + var6;
            int var21 = var16 + var19;
            var5 = var21 ^ var19 << 10;
            int var22 = var2 + var5;
            int var23 = var19 + var20;
            var4 = var23 ^ var20 >>> 4;
            int var24 = var4 + var11;
            int var25 = var20 + var22;
            var3 = var25 ^ var22 << 8;
            var8 = var3 + var14;
            int var26 = var22 + var24;
            var2 = var26 ^ var24 >>> 9;
            var7 = var2 + var17;
            var9 = var8 + var24;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field3483[var27 + 1] + var8;
            int var29 = this.field3483[var27] + var9;
            int var30 = this.field3483[var27 + 5] + var4;
            int var31 = this.field3483[var27 + 3] + var6;
            int var32 = var29 ^ var28 << 11;
            int var33 = var31 + var32;
            int var34 = this.field3483[var27 + 6] + var3;
            int var35 = this.field3483[var27 + 2] + var7;
            int var36 = this.field3483[var27 + 7] + var2;
            int var37 = var28 + var35;
            int var38 = var37 ^ var35 >>> 2;
            int var39 = this.field3483[var27 + 4] + var5;
            int var40 = var33 + var35;
            int var41 = var40 ^ var33 << 8;
            int var42 = var30 + var41;
            int var43 = var38 + var39;
            int var44 = var33 + var43;
            var6 = var44 ^ var43 >>> 16;
            int var45 = var6 + var34;
            int var46 = var42 + var43;
            var5 = var46 ^ var42 << 10;
            int var47 = var5 + var36;
            int var48 = var42 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var4 + var32;
            int var50 = var45 + var47;
            var3 = var50 ^ var47 << 8;
            var8 = var3 + var38;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var41;
            var9 = var8 + var49;
            this.field3474[var27] = var9;
            this.field3474[var27 + 1] = var8;
            this.field3474[var27 + 2] = var7;
            this.field3474[var27 + 3] = var6;
            this.field3474[var27 + 4] = var5;
            this.field3474[var27 + 5] = var4;
            this.field3474[var27 + 6] = var3;
            this.field3474[var27 + 7] = var2;
        }
        for (int var52 = arg0; var52 < 256; var52 += 8) {
            int var53 = this.field3474[var52 + 2] + var7;
            int var54 = this.field3474[var52 + 4] + var5;
            int var55 = this.field3474[var52 + 1] + var8;
            int var56 = this.field3474[var52 + 3] + var6;
            int var57 = this.field3474[var52] + var9;
            int var58 = this.field3474[var52 + 7] + var2;
            int var59 = var57 ^ var55 << 11;
            int var60 = this.field3474[var52 + 6] + var3;
            int var61 = var56 + var59;
            int var62 = this.field3474[var52 + 5] + var4;
            int var63 = var53 + var55;
            int var64 = var63 ^ var53 >>> 2;
            int var65 = var54 + var64;
            int var66 = var53 + var61;
            int var67 = var66 ^ var61 << 8;
            int var68 = var62 + var67;
            int var69 = var61 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var6 + var60;
            int var72 = var5 + var58;
            int var73 = var68 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var59;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
            this.field3474[var52] = var9;
            this.field3474[var52 + 1] = var8;
            this.field3474[var52 + 2] = var7;
            this.field3474[var52 + 3] = var6;
            this.field3474[var52 + 4] = var5;
            this.field3474[var52 + 5] = var4;
            this.field3474[var52 + 6] = var3;
            this.field3474[var52 + 7] = var2;
        }
        this.method1393(true);
        this.field3487 = 256;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([I)V", line = 230)
    public class199(int[] arg0) {
        this.field3483 = new int[256];
        this.field3474 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3483[var2] = arg0[var2];
        }
        this.method1392(0);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V", line = 254)
    private final void method1393(boolean arg0) {
        this.field3472 += ++this.field3476;
        int var2 = 0;
        if (!arg0) {
            field3478 = (int[]) null;
        }
        while (var2 < 256) {
            int var3 = this.field3474[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3477 ^= this.field3477 << 13;
                } else {
                    this.field3477 ^= this.field3477 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3477 ^= this.field3477 << 2;
            } else {
                this.field3477 ^= this.field3477 >>> 16;
            }
            this.field3477 += this.field3474[var2 + 128 & 0xFF];
            int var4;
            this.field3474[var2] = var4 = this.field3472 + this.field3474[class305.method2086(255, var3 >> 2)] + this.field3477;
            this.field3483[var2] = this.field3472 = var3 + this.field3474[class305.method2086(var4 >> 8, 1020) >> 2];
            var2++;
        }
        field3479++;
    }
}
