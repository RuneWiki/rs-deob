import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class156 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "[I")
    private int[] field2549;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[I")
    private int[] field2544;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2541 = "Loading config - ";

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Z")
    public static boolean field2546 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field2545;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    private int field2548;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    private int field2550;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lsb;")
    public static class124 field2540;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    private final void method1124(int arg0) {
        field2539++;
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
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var64 + var65;
            var6 = var68 ^ var64 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var64 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            var4 = var72 ^ var69 >>> 4;
            int var73 = var4 + var61;
            int var74 = var2 + var5;
            int var75 = var69 + var74;
            var3 = var75 ^ var74 << 8;
            int var76 = var73 + var74;
            var2 = var76 ^ var73 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var63;
            var9 = var8 + var73;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2544[var11 + 1] + var8;
            int var38 = this.field2544[var11 + 7] + var2;
            int var39 = this.field2544[var11 + 5] + var4;
            int var40 = this.field2544[var11 + 3] + var6;
            int var41 = this.field2544[var11 + 6] + var3;
            int var42 = this.field2544[var11] + var9;
            int var43 = var42 ^ var37 << 11;
            int var44 = this.field2544[var11 + 2] + var7;
            int var45 = this.field2544[var11 + 4] + var5;
            int var46 = var40 + var43;
            int var47 = var37 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var45 + var48;
            int var50 = var44 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var39 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var41;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var38;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var4 + var43;
            int var59 = var54 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field2549[var11] = var9;
            var7 = var2 + var51;
            this.field2549[var11 + 1] = var8;
            this.field2549[var11 + 2] = var7;
            this.field2549[var11 + 3] = var6;
            this.field2549[var11 + 4] = var5;
            this.field2549[var11 + 5] = var4;
            this.field2549[var11 + 6] = var3;
            this.field2549[var11 + 7] = var2;
        }
        if (arg0 != -825334652) {
            return;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2549[var12 + 1] + var8;
            int var14 = this.field2549[var12 + 5] + var4;
            int var15 = this.field2549[var12 + 6] + var3;
            int var16 = this.field2549[var12 + 2] + var7;
            int var17 = this.field2549[var12 + 7] + var2;
            int var18 = this.field2549[var12 + 4] + var5;
            int var19 = this.field2549[var12] + var9;
            int var20 = var19 ^ var13 << 11;
            int var21 = this.field2549[var12 + 3] + var6;
            int var22 = var20 + var21;
            int var23 = var13 + var16;
            int var24 = var23 ^ var16 >>> 2;
            int var25 = var18 + var24;
            int var26 = var16 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var14 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var15;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            var4 = var32 ^ var30 >>> 4;
            int var33 = var5 + var17;
            int var34 = var30 + var33;
            int var35 = var4 + var20;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var8 = var3 + var24;
            var9 = var8 + var35;
            this.field2549[var12] = var9;
            this.field2549[var12 + 1] = var8;
            this.field2549[var12 + 2] = var7;
            this.field2549[var12 + 3] = var6;
            this.field2549[var12 + 4] = var5;
            this.field2549[var12 + 5] = var4;
            this.field2549[var12 + 6] = var3;
            this.field2549[var12 + 7] = var2;
        }
        this.method1128(-1);
        this.field2545 = 256;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method1125(int arg0) {
        field2538++;
        class143.field2360.method608(1);
        int var1 = class143.field2360.method612(8, -127);
        if (class7.field88 > var1) {
            for (int var2 = var1; var2 < class7.field88; var2++) {
                class6.field80[class38.field640++] = class287.field4587[var2];
            }
        }
        if (class7.field88 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class7.field88 = 0;
        if (arg0 != 2) {
            method1126(false);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class287.field4587[var3];
            class139 var5 = class3.field45[var4];
            int var6 = class143.field2360.method612(1, -123);
            if (var6 == 0) {
                class287.field4587[class7.field88++] = var4;
                var5.field2846 = class207.field3336;
            } else {
                int var7 = class143.field2360.method612(2, -121);
                if (var7 == 0) {
                    class287.field4587[class7.field88++] = var4;
                    var5.field2846 = class207.field3336;
                    class200.field3251[class254.field4039++] = var4;
                } else if (var7 == 1) {
                    class287.field4587[class7.field88++] = var4;
                    var5.field2846 = class207.field3336;
                    int var8 = class143.field2360.method612(3, -121);
                    var5.method1228(var8, false, 1);
                    int var9 = class143.field2360.method612(1, -125);
                    if (var9 == 1) {
                        class200.field3251[class254.field4039++] = var4;
                    }
                } else if (var7 == 2) {
                    class287.field4587[class7.field88++] = var4;
                    var5.field2846 = class207.field3336;
                    if (class143.field2360.method612(1, -127) == 1) {
                        int var11 = class143.field2360.method612(3, -126);
                        var5.method1228(var11, false, 2);
                        int var12 = class143.field2360.method612(3, -119);
                        var5.method1228(var12, false, 2);
                    } else {
                        int var10 = class143.field2360.method612(3, arg0 ^ 0xFFFFFF80);
                        var5.method1228(var10, false, 0);
                    }
                    int var13 = class143.field2360.method612(1, -119);
                    if (var13 == 1) {
                        class200.field3251[class254.field4039++] = var4;
                    }
                } else if (var7 == 3) {
                    class6.field80[class38.field640++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method1126(boolean arg0) {
        field2541 = null;
        field2540 = null;
        if (!arg0) {
            field2546 = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)I")
    public final int method1127(int arg0) {
        if (arg0 != 29778) {
            this.field2545 = -59;
        }
        if ((this.field2545--) == 0) {
            this.method1128(arg0 ^ 0xFFFF8BAD);
            this.field2545 = 255;
        }
        field2542++;
        return this.field2544[this.field2545];
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
    private final void method1128(int arg0) {
        if (arg0 != -1) {
            this.field2537 = 105;
        }
        field2543++;
        this.field2550 += ++this.field2537;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2549[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2548 ^= this.field2548 << 13;
                } else {
                    this.field2548 ^= this.field2548 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2548 ^= this.field2548 << 2;
            } else {
                this.field2548 ^= this.field2548 >>> 16;
            }
            this.field2548 += this.field2549[var2 + 128 & 0xFF];
            int var4;
            this.field2549[var2] = var4 = this.field2549[class64.method498(255, var3 >> 2)] - (-this.field2550 - this.field2548);
            this.field2544[var2] = this.field2550 = this.field2549[class64.method498(var4, 261201) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lfl;IZIZILfl;)I")
    public static final int method1129(class80 arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, class80 arg6) {
        field2547++;
        int var7 = class282.method1892(arg2, 11746, arg0, arg6, arg1);
        if (arg3 >= -60) {
            field2540 = null;
        }
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class282.method1892(arg4, 11746, arg0, arg6, arg5);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    private class156() {
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([I)V")
    public class156(int[] arg0) {
        this.field2549 = new int[256];
        this.field2544 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2544[var2] = arg0[var2];
        }
        this.method1124(-825334652);
    }
}
