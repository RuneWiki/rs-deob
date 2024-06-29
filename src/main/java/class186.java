import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class186 extends class578 {

    @OriginalMember(owner = "client!eia", name = "B", descriptor = "Z")
    private static boolean field2430 = false;

    @OriginalMember(owner = "client!eia", name = "C", descriptor = "I")
    private int field2407;

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "I")
    private int field2409;

    @OriginalMember(owner = "client!eia", name = "u", descriptor = "I")
    private static int field2412;

    @OriginalMember(owner = "client!eia", name = "I", descriptor = "I")
    private int field2413;

    @OriginalMember(owner = "client!eia", name = "p", descriptor = "I")
    private static int field2414;

    @OriginalMember(owner = "client!eia", name = "J", descriptor = "I")
    private int field2415;

    @OriginalMember(owner = "client!eia", name = "k", descriptor = "I")
    private static int field2416;

    @OriginalMember(owner = "client!eia", name = "r", descriptor = "I")
    private int field2417;

    @OriginalMember(owner = "client!eia", name = "A", descriptor = "I")
    private static int field2418;

    @OriginalMember(owner = "client!eia", name = "o", descriptor = "I")
    private int field2421;

    @OriginalMember(owner = "client!eia", name = "s", descriptor = "I")
    private int field2434;

    @OriginalMember(owner = "client!eia", name = "P", descriptor = "I")
    private int field2438;

    @OriginalMember(owner = "client!eia", name = "v", descriptor = "Z")
    private boolean field2423;

    @OriginalMember(owner = "client!eia", name = "i", descriptor = "Z")
    private boolean field2426;

    @OriginalMember(owner = "client!eia", name = "D", descriptor = "[B")
    private static byte[] field2420;

    @OriginalMember(owner = "client!eia", name = "O", descriptor = "[B")
    private byte[] field2435;

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "[F")
    private static float[] field2405;

    @OriginalMember(owner = "client!eia", name = "Q", descriptor = "[F")
    private static float[] field2406;

    @OriginalMember(owner = "client!eia", name = "z", descriptor = "[F")
    private float[] field2410;

    @OriginalMember(owner = "client!eia", name = "j", descriptor = "[F")
    private static float[] field2419;

    @OriginalMember(owner = "client!eia", name = "q", descriptor = "[F")
    private static float[] field2424;

    @OriginalMember(owner = "client!eia", name = "L", descriptor = "[F")
    private static float[] field2425;

    @OriginalMember(owner = "client!eia", name = "t", descriptor = "[F")
    private static float[] field2432;

    @OriginalMember(owner = "client!eia", name = "x", descriptor = "[F")
    private static float[] field2433;

    @OriginalMember(owner = "client!eia", name = "M", descriptor = "[I")
    private static int[] field2408;

    @OriginalMember(owner = "client!eia", name = "N", descriptor = "[I")
    private static int[] field2427;

    @OriginalMember(owner = "client!eia", name = "y", descriptor = "[I")
    private static int[] field2428;

    @OriginalMember(owner = "client!eia", name = "w", descriptor = "[Lkea;")
    private static class233[] field2436;

    @OriginalMember(owner = "client!eia", name = "H", descriptor = "[Lnk;")
    private static class366[] field2429;

    @OriginalMember(owner = "client!eia", name = "G", descriptor = "[Lsp;")
    public static class575[] field2411;

    @OriginalMember(owner = "client!eia", name = "E", descriptor = "[Lnf;")
    private static class773[] field2437;

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "[Z")
    private static boolean[] field2431;

    @OriginalMember(owner = "client!eia", name = "K", descriptor = "[[B")
    private byte[][] field2422;

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "(I)F", line = 7)
    public static final float method1531(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Llga;)Z", line = 26)
    private static final boolean method1532(class47 arg0) {
        if (!field2430) {
            byte[] var1 = arg0.method512(0, 0, (byte) -58);
            if (var1 == null) {
                return false;
            }
            method1536(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "([BI)V", line = 44)
    private static final void method1533(byte[] arg0, int arg1) {
        field2420 = arg0;
        field2418 = arg1;
        field2412 = 0;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "()I", line = 53)
    public static final int method1534() {
        int var0 = field2420[field2418] >> field2412 & 0x1;
        field2412++;
        field2418 += field2412 >> 3;
        field2412 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "([B)V", line = 62)
    private final void method1535(byte[] arg0) {
        class711 var2 = new class711(arg0);
        this.field2409 = var2.method5113(18443);
        this.field2417 = var2.method5113(18443);
        this.field2413 = var2.method5113(18443);
        this.field2415 = var2.method5113(18443);
        if (this.field2415 < 0) {
            this.field2415 = ~this.field2415;
            this.field2426 = true;
        }
        int var3 = var2.method5113(18443);
        this.field2422 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method5128(0);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method5117(var5, 0, var7, -125);
            this.field2422[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "([B)V", line = 106)
    private static final void method1536(byte[] arg0) {
        method1533(arg0, 0);
        field2414 = 0x1 << method1540(4);
        field2416 = 0x1 << method1540(4);
        field2424 = new float[field2416];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2414 : field2416;
            int var15 = var14 >> 1;
            int var16 = var14 >> 2;
            int var17 = var14 >> 3;
            float[] var18 = new float[var15];
            for (int var19 = 0; var19 < var16; var19++) {
                var18[var19 * 2] = (float) Math.cos((double) (var19 * 4) * 3.141592653589793D / (double) var14);
                var18[var19 * 2 + 1] = -((float) Math.sin((double) (var19 * 4) * 3.141592653589793D / (double) var14));
            }
            float[] var20 = new float[var15];
            for (int var21 = 0; var21 < var16; var21++) {
                var20[var21 * 2] = (float) Math.cos((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
                var20[var21 * 2 + 1] = (float) Math.sin((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
            }
            float[] var22 = new float[var16];
            for (int var23 = 0; var23 < var17; var23++) {
                var22[var23 * 2] = (float) Math.cos((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14);
                var22[var23 * 2 + 1] = -((float) Math.sin((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14));
            }
            int[] var24 = new int[var17];
            int var25 = class626.method4593(3, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class720.method5214(var26, (byte) 14, var25);
            }
            if (var1 == 0) {
                field2425 = var18;
                field2433 = var20;
                field2432 = var22;
                field2427 = var24;
            } else {
                field2405 = var18;
                field2406 = var20;
                field2419 = var22;
                field2428 = var24;
            }
        }
        int var2 = method1540(8) + 1;
        field2411 = new class575[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2411[var3] = new class575();
        }
        int var4 = method1540(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1540(16);
        }
        int var6 = method1540(6) + 1;
        field2436 = new class233[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2436[var7] = new class233();
        }
        int var8 = method1540(6) + 1;
        field2437 = new class773[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2437[var9] = new class773();
        }
        int var10 = method1540(6) + 1;
        field2429 = new class366[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2429[var11] = new class366();
        }
        int var12 = method1540(6) + 1;
        field2431 = new boolean[var12];
        field2408 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2431[var13] = method1534() != 0;
            method1540(16);
            method1540(16);
            field2408[var13] = method1540(8);
        }
        field2430 = true;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "([I)Lvfa;", line = 261)
    public final class313 method1537(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2435 == null) {
            this.field2407 = 0;
            this.field2410 = new float[field2416];
            this.field2435 = new byte[this.field2417];
            this.field2434 = 0;
            this.field2438 = 0;
        }
        while (this.field2438 < this.field2422.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1541(this.field2438);
            if (var3 != null) {
                int var4 = this.field2434;
                int var5 = var3.length;
                if (var5 > this.field2417 - var4) {
                    var5 = this.field2417 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2435[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2434;
                }
                this.field2434 = var4;
            }
            this.field2438++;
        }
        this.field2410 = null;
        byte[] var2 = this.field2435;
        this.field2435 = null;
        return new class313(this.field2409, var2, this.field2413, this.field2415, this.field2426);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Llga;II)Leia;", line = 319)
    public static final class186 method1538(class47 arg0, int arg1, int arg2) {
        if (method1532(arg0)) {
            byte[] var3 = arg0.method512(arg2, arg1, (byte) -6);
            return var3 == null ? null : new class186(var3);
        } else {
            arg0.method506(-65, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Llga;I)Leia;", line = 333)
    public static final class186 method1539(class47 arg0, int arg1) {
        if (method1532(arg0)) {
            byte[] var2 = arg0.method520((byte) 108, arg1);
            return var2 == null ? null : new class186(var2);
        } else {
            arg0.method530(false, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "([B)V", line = 350)
    private class186(byte[] arg0) {
        this.method1535(arg0);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)I", line = 366)
    public static final int method1540(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2412) {
            int var4 = 8 - field2412;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2420[field2418] >> field2412 & var5) << var2;
            field2412 = 0;
            field2418++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2420[field2418] >> field2412 & var3) << var2;
            field2412 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)[F", line = 393)
    private final float[] method1541(int arg0) {
        method1533(this.field2422[arg0], 0);
        method1534();
        int var2 = method1540(class626.method4593(3, field2408.length - 1));
        boolean var3 = field2431[var2];
        int var4 = var3 ? field2416 : field2414;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1534() != 0;
            var6 = method1534() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2414 >> 2);
            var9 = (field2414 >> 2) + (var4 >> 2);
            var10 = field2414 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2414 >> 2);
            var12 = (field2414 >> 2) + (var4 - (var4 >> 2));
            var13 = field2414 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class366 var14 = field2429[field2408[var2]];
        int var15 = var14.field5323;
        int var16 = var14.field5324[var15];
        boolean var17 = !field2436[var16].method1935();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5322; var19++) {
            class773 var95 = field2437[var14.field5321[var19]];
            float[] var96 = field2424;
            var95.method5565(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5323;
            int var21 = var14.field5324[var20];
            field2436[var21].method1932(field2424, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2424[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2424;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2405 : field2425;
            float[] var30 = var3 ? field2406 : field2433;
            float[] var31 = var3 ? field2419 : field2432;
            int[] var32 = var3 ? field2428 : field2427;
            for (int var33 = 0; var33 < var24; var33++) {
                float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
                float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
                float var93 = var29[var33 * 2];
                float var94 = var29[var33 * 2 + 1];
                var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
                var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
            }
            for (int var34 = 0; var34 < var25; var34++) {
                float var85 = var26[var34 * 4 + var23 + 3];
                float var86 = var26[var34 * 4 + var23 + 1];
                float var87 = var26[var34 * 4 + 3];
                float var88 = var26[var34 * 4 + 1];
                var26[var34 * 4 + var23 + 3] = var85 + var87;
                var26[var34 * 4 + var23 + 1] = var86 + var88;
                float var89 = var29[var23 - var34 * 4 - 4];
                float var90 = var29[var23 - var34 * 4 - 3];
                var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
                var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
            }
            int var35 = class626.method4593(3, var4 - 1);
            for (int var36 = 0; var36 < var35 - 3; var36++) {
                int var72 = var4 >> var36 + 2;
                int var73 = 0x8 << var36;
                for (int var74 = 0; var74 < 0x2 << var36; var74++) {
                    int var75 = var4 - var72 * 2 * var74;
                    int var76 = var4 - (var74 * 2 + 1) * var72;
                    for (int var77 = 0; var77 < var4 >> var36 + 4; var77++) {
                        int var78 = var77 * 4;
                        float var79 = var26[var75 - var78 - 1];
                        float var80 = var26[var75 - var78 - 3];
                        float var81 = var26[var76 - var78 - 1];
                        float var82 = var26[var76 - var78 - 3];
                        var26[var75 - var78 - 1] = var79 + var81;
                        var26[var75 - var78 - 3] = var80 + var82;
                        float var83 = var29[var73 * var77];
                        float var84 = var29[var73 * var77 + 1];
                        var26[var76 - var78 - 1] = (var79 - var81) * var83 - (var80 - var82) * var84;
                        var26[var76 - var78 - 3] = (var79 - var81) * var84 + (var80 - var82) * var83;
                    }
                }
            }
            for (int var37 = 1; var37 < var25 - 1; var37++) {
                int var65 = var32[var37];
                if (var37 < var65) {
                    int var66 = var37 * 8;
                    int var67 = var65 * 8;
                    float var68 = var26[var66 + 1];
                    var26[var66 + 1] = var26[var67 + 1];
                    var26[var67 + 1] = var68;
                    float var69 = var26[var66 + 3];
                    var26[var66 + 3] = var26[var67 + 3];
                    var26[var67 + 3] = var69;
                    float var70 = var26[var66 + 5];
                    var26[var66 + 5] = var26[var67 + 5];
                    var26[var67 + 5] = var70;
                    float var71 = var26[var66 + 7];
                    var26[var66 + 7] = var26[var67 + 7];
                    var26[var67 + 7] = var71;
                }
            }
            for (int var38 = 0; var38 < var23; var38++) {
                var26[var38] = var26[var38 * 2 + 1];
            }
            for (int var39 = 0; var39 < var25; var39++) {
                var26[var4 - var39 * 2 - 1] = var26[var39 * 4];
                var26[var4 - var39 * 2 - 2] = var26[var39 * 4 + 1];
                var26[var4 - var24 - var39 * 2 - 1] = var26[var39 * 4 + 2];
                var26[var4 - var24 - var39 * 2 - 2] = var26[var39 * 4 + 3];
            }
            for (int var40 = 0; var40 < var25; var40++) {
                float var57 = var31[var40 * 2];
                float var58 = var31[var40 * 2 + 1];
                float var59 = var26[var40 * 2 + var23];
                float var60 = var26[var40 * 2 + var23 + 1];
                float var61 = var26[var4 - var40 * 2 - 2];
                float var62 = var26[var4 - var40 * 2 - 1];
                float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
                var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
                var26[var4 - var40 * 2 - 2] = (var59 + var61 - var63) * 0.5F;
                float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
                var26[var40 * 2 + var23 + 1] = (var60 + var64 - var62) * 0.5F;
                var26[var4 - var40 * 2 - 1] = (var62 + var64 - var60) * 0.5F;
            }
            for (int var41 = 0; var41 < var24; var41++) {
                var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + var23 + 1];
                var26[var23 - var41 - 1] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + var23 + 1];
            }
            for (int var42 = 0; var42 < var24; var42++) {
                var26[var4 + var42 - var24] = -var26[var42];
            }
            for (int var43 = 0; var43 < var24; var43++) {
                var26[var43] = var26[var24 + var43];
            }
            for (int var44 = 0; var44 < var24; var44++) {
                var26[var24 + var44] = -var26[var24 - var44 - 1];
            }
            for (int var45 = 0; var45 < var24; var45++) {
                var26[var23 + var45] = var26[var4 - var45 - 1];
            }
            for (int var46 = var8; var46 < var9; var46++) {
                float var56 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field2424[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2424[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2407 > 0) {
            int var49 = this.field2407 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2423) {
                for (int var50 = 0; var50 < this.field2421; var50++) {
                    int var51 = (this.field2407 >> 1) + var50;
                    var48[var50] += this.field2410[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2424[var52];
                }
            }
        }
        float[] var54 = this.field2410;
        this.field2410 = field2424;
        field2424 = var54;
        this.field2407 = var4;
        this.field2421 = var12 - (var4 >> 1);
        this.field2423 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "()V", line = 806)
    public static void method1542() {
        field2420 = null;
        field2411 = null;
        field2436 = null;
        field2437 = null;
        field2429 = null;
        field2431 = null;
        field2408 = null;
        field2424 = null;
        field2425 = null;
        field2433 = null;
        field2432 = null;
        field2405 = null;
        field2406 = null;
        field2419 = null;
        field2427 = null;
        field2428 = null;
    }
}
