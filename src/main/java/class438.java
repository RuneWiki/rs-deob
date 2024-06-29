import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class438 extends class97 {

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "[Lsr;")
    public class308[] field6446;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "[B")
    public byte[] field6449;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "[I")
    private int[] field6443;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "[B")
    public byte[] field6436;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "[S")
    public short[] field6447;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "[Lar;")
    public class2[] field6442;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "[B")
    public byte[] field6444;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public int field6437;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "[I")
    public static int[] field6445 = new int[50];

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "Lef;")
    public static class385 field6448 = new class385(new byte[5000]);

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
    public static int field6450 = 255;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field6451 = new CRC32();

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "[I")
    public static int[] field6453 = new int[32];

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lga;[B[IB)Z")
    public final boolean method2687(class217 arg0, byte[] arg1, int[] arg2, byte arg3) {
        field6440++;
        if (arg3 != 4) {
            method2688(-76);
        }
        boolean var5 = true;
        int var6 = 0;
        class2 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field6443[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method1318((byte) 120, arg2, var9 >> 2);
                        } else {
                            var7 = arg0.method1320(arg2, var9 >> 2, 0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6442[var8] = var7;
                        this.field6443[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
    public static void method2688(int arg0) {
        field6445 = null;
        field6448 = null;
        field6453 = null;
        int var1 = -61 / ((-arg0 - 55) / 58);
        field6451 = null;
    }

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)V")
    public final void method2689(int arg0) {
        this.field6443 = null;
        field6439++;
        if (arg0 != 2) {
            this.field6442 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILik;II)Lmb;")
    public static final class201 method2690(int arg0, class463 arg1, int arg2, int arg3) {
        if (arg0 >= -62) {
            return null;
        }
        field6438++;
        int var4 = arg1.field6827 | arg2 << 8;
        class201 var5 = (class201) class440.field6472.method927((long) var4 << 16, -33);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class241.field3627.method825(class241.field3627.method811(var4, (byte) 55), 0);
        if (var6 == null) {
            int var8 = arg1.field6827 | arg3 + 65536 << 8;
            class201 var9 = (class201) class440.field6472.method927((long) var8 << 16, -120);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class241.field3627.method825(class241.field3627.method811(var8, (byte) 55), 0);
            if (var10 == null) {
                int var12 = arg1.field6827 | 0xFFFF00;
                class201 var13 = (class201) class440.field6472.method927((long) var12 << 16, -110);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class241.field3627.method825(class241.field3627.method811(var12, (byte) 55), 0);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class201 var15 = class184.method1125((byte) -123, var14);
                    var15.field3027 = arg1;
                    class440.field6472.method929((long) var12 << 16, var15, false);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class201 var11 = class184.method1125((byte) -128, var10);
                var11.field3027 = arg1;
                class440.field6472.method929((long) var8 << 16, var11, false);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class201 var7 = class184.method1125((byte) -123, var6);
            var7.field3027 = arg1;
            class440.field6472.method929((long) var4 << 16, var7, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
    public class438() {
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([B)V")
    public class438(byte[] arg0) {
        this.field6446 = new class308[128];
        this.field6449 = new byte[128];
        this.field6443 = new int[128];
        this.field6436 = new byte[128];
        this.field6447 = new short[128];
        this.field6442 = new class2[128];
        this.field6444 = new byte[128];
        class385 var2 = new class385(arg0);
        int var3;
        for (var3 = 0; var2.field5685[var2.field5666 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2341((byte) 54);
        }
        var2.field5666++;
        var3++;
        int var6 = var2.field5666;
        var2.field5666 += var3;
        int var7;
        for (var7 = 0; var2.field5685[var2.field5666 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2341((byte) 54);
        }
        var7++;
        var2.field5666++;
        int var10 = var2.field5666;
        var2.field5666 += var7;
        int var11;
        for (var11 = 0; var2.field5685[var2.field5666 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2341((byte) 54);
        }
        var11++;
        var2.field5666++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2343(255);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class308[] var18 = new class308[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class308 var102 = var18[var19] = new class308();
            int var103 = var2.method2343(255);
            if (var103 > 0) {
                var102.field4645 = new byte[var103 * 2];
            }
            int var104 = var2.method2343(255);
            if (var104 > 0) {
                var102.field4643 = new byte[var104 * 2 + 2];
                var102.field4643[1] = 64;
            }
        }
        int var20 = var2.method2343(255);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method2343(255);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field5685[var2.field5666 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2341((byte) 54);
        }
        var2.field5666++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2343(255);
            this.field6447[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2343(255);
            this.field6447[var30] = (short) (this.field6447[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length <= var32) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method2353(124);
            }
            this.field6447[var34] = (short) (this.field6447[var34] + (class406.method2552(var33 - 1, 2) << 14));
            var31--;
            this.field6443[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field6443[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field5685[var6++] - 1;
                    if (var36 >= var4.length) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                }
                this.field6449[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field6443[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                    var41 = var2.field5685[var10++] + 16 << 2;
                }
                var39--;
                this.field6444[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class308 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field6443[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field6446[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 < var25.length) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field6443[var50] > 0) {
                    var49 = var2.method2343(255) + 1;
                }
            }
            this.field6436[var50] = (byte) var49;
            var48--;
        }
        this.field6437 = var2.method2343(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class308 var99 = var18[var51];
            if (var99.field4645 != null) {
                for (int var100 = 1; var100 < var99.field4645.length; var100 += 2) {
                    var99.field4645[var100] = var2.method2341((byte) 54);
                }
            }
            if (var99.field4643 != null) {
                for (int var101 = 3; var101 < var99.field4643.length - 2; var101 += 2) {
                    var99.field4643[var101] = var2.method2341((byte) 54);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2341((byte) 54);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2341((byte) 54);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class308 var96 = var18[var54];
            if (var96.field4643 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4643.length; var98 += 2) {
                    var97 = var2.method2343(255) + (var97 + 1);
                    var96.field4643[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class308 var93 = var18[var55];
            if (var93.field4645 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4645.length; var95 += 2) {
                    var94 = var2.method2343(255) + var94 + 1;
                    var93.field4645[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2343(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = (var56 + var2.method2343(255)) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field6436[var60] = (byte) (this.field6436[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class154.method954(110, var66, var64 - var58);
                    var66 += var65 - var59;
                    this.field6436[var67] = (byte) (this.field6436[var67] * var68 + 32 >> 6);
                }
                var61 += 2;
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field6436[var62] = (byte) (this.field6436[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method2343(255);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method2343(255) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field6444[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field6444[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class154.method954(112, var80, var78 - var71);
                    int var83 = (this.field6444[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field6444[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field6444[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field6444[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4644 = var2.method2343(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class308 var92 = var18[var86];
            if (var92.field4645 != null) {
                var92.field4646 = var2.method2343(255);
            }
            if (var92.field4643 != null) {
                var92.field4641 = var2.method2343(255);
            }
            if (var92.field4644 > 0) {
                var92.field4640 = var2.method2343(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4649 = var2.method2343(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class308 var91 = var18[var88];
            if (var91.field4649 > 0) {
                var91.field4648 = var2.method2343(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class308 var90 = var18[var89];
            if (var90.field4648 > 0) {
                var90.field4642 = var2.method2343(255);
            }
        }
    }
}
