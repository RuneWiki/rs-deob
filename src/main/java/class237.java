import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class237 extends class88 {

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "[B")
    public byte[] field4312;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "[B")
    public byte[] field4313;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "[B")
    public byte[] field4314;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "[Lva;")
    public class33[] field4302;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "[S")
    public short[] field4305;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "[Lk;")
    public class174[] field4311;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "[I")
    private int[] field4298;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "Lta;")
    public static class241 field4299 = new class241(20);

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    public static int field4310 = 0;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "J")
    public static long field4309;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
    public static final void method1672(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4303++;
        for (class259 var1 = (class259) class156.field2910.method768((byte) 57); var1 != null; var1 = (class259) class156.field2910.method760(-15725)) {
            int var2 = var1.field4640;
            if (class131.method971(var2, (byte) 66)) {
                boolean var3 = true;
                class50[] var4 = class116.field2222[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field763;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1685;
                    class50 var7 = client.method1144((byte) -9, var6);
                    if (var7 != null) {
                        class204.method1478(var7, !arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public final void method1673(int arg0) {
        field4304++;
        this.field4298 = null;
        if (arg0 != -23563) {
            field4309 = -60L;
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public static final void method1674(int arg0) {
        field4301++;
        int var1 = 71 % ((14 - arg0) / 49);
        class75.field1469.method1713(96);
        class11.field96.method1713(-88);
        class76.field1490.method1713(75);
        class258.field4631.method1713(95);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
    public static final int method1675(int arg0, int arg1) {
        if (arg0 != 14623) {
            method1677(false);
        }
        field4315++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B[B[ILpf;)Z")
    public final boolean method1676(byte arg0, byte[] arg1, int[] arg2, class271 arg3) {
        field4307++;
        if (arg0 > -44) {
            method1674(14);
        }
        boolean var5 = true;
        class174 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field4298[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg3.method1857(-891465236, arg2, var9 >> 2);
                        } else {
                            var6 = arg3.method1860(false, arg2, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field4311[var8] = var6;
                        this.field4298[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(Z)V")
    public static void method1677(boolean arg0) {
        if (arg0) {
            field4299 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class237() {
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B)V")
    public class237(byte[] arg0) {
        this.field4312 = new byte[128];
        this.field4313 = new byte[128];
        this.field4314 = new byte[128];
        this.field4302 = new class33[128];
        this.field4305 = new short[128];
        this.field4311 = new class174[128];
        this.field4298 = new int[128];
        class128 var2 = new class128(arg0);
        int var3;
        for (var3 = 0; var2.field2385[var2.field2379 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method950(1495791448);
        }
        var3++;
        var2.field2379++;
        int var6 = 0;
        int var7 = var2.field2379;
        var2.field2379 += var3;
        while (var2.field2385[var2.field2379 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method950(1495791448);
        }
        var2.field2379++;
        var6++;
        int var10 = var2.field2379;
        int var11 = 0;
        var2.field2379 += var6;
        while (var2.field2385[var2.field2379 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method950(1495791448);
        }
        var2.field2379++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method937(false);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class33[] var19 = new class33[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class33 var103 = var19[var20] = new class33();
            int var104 = var2.method937(false);
            if (var104 > 0) {
                var103.field466 = new byte[var104 * 2];
            }
            int var105 = var2.method937(false);
            if (var105 > 0) {
                var103.field450 = new byte[var105 * 2 + 2];
                var103.field450[1] = 64;
            }
        }
        int var21 = var2.method937(false);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method937(false);
        int var24;
        for (var24 = 0; var2.field2385[var2.field2379 + var24] != 0; var24++) {
        }
        byte[] var25 = var23 > 0 ? new byte[var23 * 2] : null;
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var2.method950(1495791448);
        }
        var24++;
        var2.field2379++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method937(false);
            this.field4305[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method937(false);
            this.field4305[var31] = (short) (this.field4305[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method910((byte) -86);
            }
            var32--;
            this.field4305[var35] = (short) (this.field4305[var35] + (class69.method443(2, var34 - 1) << 14));
            this.field4298[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4298[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field2385[var7++] - 1;
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                this.field4314[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4298[var43] != 0) {
                if (var40 == 0) {
                    var42 = var2.field2385[var10++] + 16 << 2;
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field4312[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class33 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4298[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field4302[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 < var26.length) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field4298[var51] > 0) {
                    var50 = var2.method937(false) + 1;
                }
            }
            this.field4313[var51] = (byte) var50;
            var49--;
        }
        this.field4306 = var2.method937(false) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class33 var100 = var19[var52];
            if (var100.field466 != null) {
                for (int var101 = 1; var101 < var100.field466.length; var101 += 2) {
                    var100.field466[var101] = var2.method950(1495791448);
                }
            }
            if (var100.field450 != null) {
                for (int var102 = 3; var102 < (var100.field450.length - 2); var102 += 2) {
                    var100.field450[var102] = var2.method950(1495791448);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method950(1495791448);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var2.method950(1495791448);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class33 var97 = var19[var55];
            if (var97.field450 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field450.length; var99 += 2) {
                    var98 = (var98 + var2.method937(false)) + 1;
                    var97.field450[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class33 var94 = var19[var56];
            if (var94.field466 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field466.length; var96 += 2) {
                    var95 = var2.method937(false) + var95 + 1;
                    var94.field466[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method937(false);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method937(false) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4313[var61] = (byte) (this.field4313[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class194.method1409(var65 - var59, var67, -110);
                    this.field4313[var68] = (byte) (this.field4313[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field4313[var63] = (byte) (this.field4313[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var2.method937(false);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var2.method937(false) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4312[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4312[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                int var79 = var25[var75 + 1] << 1;
                byte var80 = var25[var75];
                var75 += 2;
                int var81 = (var80 - var72) * var73 + ((var80 - var72) / 2);
                for (int var82 = var72; var82 < var80; var82++) {
                    int var83 = class194.method1409(var80 - var72, var81, -128);
                    int var84 = (this.field4312[var82] & 0xFF) + var83;
                    var81 += var79 - var73;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4312[var82] = (byte) var84;
                }
                var72 = var80;
                var73 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field4312[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4312[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field460 = var2.method937(false);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class33 var93 = var19[var87];
            if (var93.field466 != null) {
                var93.field455 = var2.method937(false);
            }
            if (var93.field450 != null) {
                var93.field469 = var2.method937(false);
            }
            if (var93.field460 > 0) {
                var93.field459 = var2.method937(false);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field452 = var2.method937(false);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class33 var92 = var19[var89];
            if (var92.field452 > 0) {
                var92.field464 = var2.method937(false);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class33 var91 = var19[var90];
            if (var91.field464 > 0) {
                var91.field456 = var2.method937(false);
            }
        }
    }
}
