import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class603 {

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    private int[] field8425;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
    private int[] field8431;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    public static int[] field8423 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    private int field8424;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    private int field8427;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    private int field8428;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    private int field8434;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    public static boolean field8422;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[Ltq;")
    public static class92[] field8421;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 13)
    public static void method3357(int arg0) {
        field8421 = null;
        if (arg0 != 0) {
            method3359((byte) 59, 96, -17, 113, 82, 35);
        }
        field8423 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 30)
    private final void method3358(int arg0) {
        field8430++;
        if (arg0 != 42113161) {
            this.method3362((byte) -52);
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
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field8425[var11 + 2] + var7;
            int var38 = this.field8425[var11 + 4] + var5;
            int var39 = this.field8425[var11 + 6] + var3;
            int var40 = this.field8425[var11 + 1] + var8;
            int var41 = this.field8425[var11 + 3] + var6;
            int var42 = this.field8425[var11 + 5] + var4;
            int var43 = this.field8425[var11 + 7] + var2;
            int var44 = this.field8425[var11] + var9;
            int var45 = var44 ^ var40 << 11;
            int var46 = var41 + var45;
            int var47 = var37 + var40;
            int var48 = var47 ^ var37 >>> 2;
            int var49 = var38 + var48;
            int var50 = var37 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var42 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var39;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var43;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field8431[var11] = var9;
            this.field8431[var11 + 1] = var8;
            this.field8431[var11 + 2] = var7;
            this.field8431[var11 + 3] = var6;
            this.field8431[var11 + 4] = var5;
            this.field8431[var11 + 5] = var4;
            this.field8431[var11 + 6] = var3;
            this.field8431[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field8431[var12 + 4] + var5;
            int var14 = this.field8431[var12 + 1] + var8;
            int var15 = this.field8431[var12] + var9;
            int var16 = this.field8431[var12 + 7] + var2;
            int var17 = this.field8431[var12 + 5] + var4;
            int var18 = this.field8431[var12 + 6] + var3;
            int var19 = this.field8431[var12 + 3] + var6;
            int var20 = this.field8431[var12 + 2] + var7;
            int var21 = var15 ^ var14 << 11;
            int var22 = var14 + var20;
            int var23 = var19 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var13 + var24;
            int var26 = var20 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var17 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var18;
            var5 = var30 ^ var29 << 10;
            int var32 = var5 + var16;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field8431[var12] = var9;
            this.field8431[var12 + 1] = var8;
            this.field8431[var12 + 2] = var7;
            this.field8431[var12 + 3] = var6;
            this.field8431[var12 + 4] = var5;
            this.field8431[var12 + 5] = var4;
            this.field8431[var12 + 6] = var3;
            this.field8431[var12 + 7] = var2;
        }
        this.method3362((byte) 12);
        this.field8427 = 256;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIIIII)V", line = 177)
    public static final void method3359(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8420++;
        if (arg0 != -41) {
            method3357(-102);
        }
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg4 * arg4;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class6.field66 <= arg1 && arg1 <= class151.field2071) {
            int var20 = class496.method2826(arg3 + arg4, (byte) 36, class281.field3703, class255.field3350);
            int var21 = class496.method2826(arg3 - arg4, (byte) 36, class281.field3703, class255.field3350);
            class285.method1691(var20, class315.field4224[arg1], arg0 ^ 0x2E, var21, arg5);
        }
        int var22 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var13 += -var22;
            var14 += -var18;
            var22 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg1 - var7;
            int var24 = arg1 + var7;
            if (class6.field66 <= var24 && var23 <= class151.field2071) {
                int var25 = class496.method2826(arg3 + var6, (byte) 36, class281.field3703, class255.field3350);
                int var26 = class496.method2826(arg3 - var6, (byte) 36, class281.field3703, class255.field3350);
                if (class6.field66 <= var23) {
                    class285.method1691(var25, class315.field4224[var23], arg0 + 34, var26, arg5);
                }
                if (class151.field2071 >= var24) {
                    class285.method1691(var25, class315.field4224[var24], -7, var26, arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I", line = 279)
    public final int method3360(int arg0) {
        if (this.field8427 == 0) {
            this.method3362((byte) 12);
            this.field8427 = 256;
        }
        field8432++;
        return arg0 == 256 ? this.field8425[--this.field8427] : 30;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 299)
    private class603() {
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I", line = 302)
    public final int method3361(int arg0) {
        if (this.field8427 == 0) {
            this.method3362((byte) 12);
            this.field8427 = 256;
        }
        field8426++;
        if (arg0 != 1) {
            this.method3360(-41);
        }
        return this.field8425[this.field8427 - 1];
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 319)
    private final void method3362(byte arg0) {
        field8429++;
        if (arg0 != 12) {
            this.method3358(96);
        }
        this.field8434 += ++this.field8428;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field8431[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field8424 ^= this.field8424 << 13;
                } else {
                    this.field8424 ^= this.field8424 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field8424 ^= this.field8424 << 2;
            } else {
                this.field8424 ^= this.field8424 >>> 16;
            }
            this.field8424 += this.field8431[var2 + 128 & 0xFF];
            int var4;
            this.field8431[var2] = var4 = this.field8424 + this.field8431[class15.method97(1020, var3) >> 2] + this.field8434;
            this.field8425[var2] = this.field8434 = var3 + this.field8431[class15.method97(1020, var4 >> 8) >> 2];
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([I)V", line = 360)
    public class603(int[] arg0) {
        this.field8425 = new int[256];
        this.field8431 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field8425[var2] = arg0[var2];
        }
        this.method3358(42113161);
    }
}
