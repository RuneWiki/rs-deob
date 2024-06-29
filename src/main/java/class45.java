import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class45 extends class62 {

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "[B")
    public byte[] field706;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "[I")
    private int[] field697;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "[B")
    public byte[] field712;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "[S")
    public short[] field695;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "[B")
    public byte[] field703;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "[Lok;")
    public class93[] field700;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "[Lbk;")
    public class142[] field696;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field698 = -1;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field701 = 0;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field709 = -1;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "Leg;")
    public static class37 field702 = class174.method1167("Ausw-=hlen", 100);

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "Leg;")
    public static class37 field705 = class174.method1167("<col=ff7000>", -122);

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Z")
    public static boolean field707 = false;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "Ljl;")
    public static class101 field708;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "Lja;")
    public static class105 field710;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
    public static final void method294() {
        class59.field969 = 0;
        label191: for (int var0 = 0; var0 < class152.field2561; var0++) {
            class256 var1 = class66.field1054[var0];
            if (class255.field4525 != null) {
                for (int var2 = 0; var2 < class255.field4525.length; var2++) {
                    if (class255.field4525[var2] != -1000000 && (var1.field4553 <= class255.field4525[var2] || var1.field4538 <= class255.field4525[var2]) && (var1.field4539 <= class288.field5062[var2] || var1.field4540 <= class288.field5062[var2]) && (var1.field4539 >= class270.field4743[var2] || var1.field4540 >= class270.field4743[var2]) && (var1.field4550 <= class150.field2526[var2] || var1.field4542 <= class150.field2526[var2]) && (var1.field4550 >= class260.field4597[var2] || var1.field4542 >= class260.field4597[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4549 == 1) {
                int var3 = var1.field4534 + class257.field4562 - class111.field1853;
                if (var3 >= 0 && var3 <= class257.field4562 + class257.field4562) {
                    int var4 = var1.field4531 + class257.field4562 - class254.field4514;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4546 + class257.field4562 - class254.field4514;
                    if (var5 > class257.field4562 + class257.field4562) {
                        var5 = class257.field4562 + class257.field4562;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class181.field3036[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class23.field301 - var1.field4539;
                        if (var7 > 32) {
                            var1.field4543 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4543 = 2;
                            var7 = -var7;
                        }
                        var1.field4551 = (var1.field4550 - class184.field3099 << 8) / var7;
                        var1.field4532 = (var1.field4542 - class184.field3099 << 8) / var7;
                        var1.field4554 = (var1.field4553 - class120.field2032 << 8) / var7;
                        var1.field4535 = (var1.field4538 - class120.field2032 << 8) / var7;
                        class187.field3195[class59.field969++] = var1;
                    }
                }
            } else if (var1.field4549 == 2) {
                int var8 = var1.field4531 + class257.field4562 - class254.field4514;
                if (var8 >= 0 && var8 <= class257.field4562 + class257.field4562) {
                    int var9 = var1.field4534 + class257.field4562 - class111.field1853;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4552 + class257.field4562 - class111.field1853;
                    if (var10 > class257.field4562 + class257.field4562) {
                        var10 = class257.field4562 + class257.field4562;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class181.field3036[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class184.field3099 - var1.field4550;
                        if (var12 > 32) {
                            var1.field4543 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4543 = 4;
                            var12 = -var12;
                        }
                        var1.field4545 = (var1.field4539 - class23.field301 << 8) / var12;
                        var1.field4536 = (var1.field4540 - class23.field301 << 8) / var12;
                        var1.field4554 = (var1.field4553 - class120.field2032 << 8) / var12;
                        var1.field4535 = (var1.field4538 - class120.field2032 << 8) / var12;
                        class187.field3195[class59.field969++] = var1;
                    }
                }
            } else if (var1.field4549 == 4) {
                int var13 = var1.field4553 - class120.field2032;
                if (var13 > 128) {
                    int var14 = var1.field4531 + class257.field4562 - class254.field4514;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4546 + class257.field4562 - class254.field4514;
                    if (var15 > class257.field4562 + class257.field4562) {
                        var15 = class257.field4562 + class257.field4562;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4534 + class257.field4562 - class111.field1853;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4552 + class257.field4562 - class111.field1853;
                        if (var17 > class257.field4562 + class257.field4562) {
                            var17 = class257.field4562 + class257.field4562;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class181.field3036[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4543 = 5;
                            var1.field4545 = (var1.field4539 - class23.field301 << 8) / var13;
                            var1.field4536 = (var1.field4540 - class23.field301 << 8) / var13;
                            var1.field4551 = (var1.field4550 - class184.field3099 << 8) / var13;
                            var1.field4532 = (var1.field4542 - class184.field3099 << 8) / var13;
                            class187.field3195[class59.field969++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public static void method295(boolean arg0) {
        field702 = null;
        field705 = null;
        if (arg0) {
            field710 = null;
            field708 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lkl;B[B[I)Z")
    public final boolean method296(class32 arg0, byte arg1, byte[] arg2, int[] arg3) {
        boolean var5 = true;
        int var6 = 0;
        class142 var7 = null;
        field699++;
        if (arg1 >= -48) {
            return false;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field697[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method187(arg3, 77, var9 >> 2);
                        } else {
                            var7 = arg0.method189(var9 >> 2, -2, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field696[var8] = var7;
                        this.field697[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public final void method297(int arg0) {
        field713++;
        this.field697 = null;
        if (arg0 != 0) {
            this.method297(72);
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class45() {
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
    public class45(byte[] arg0) {
        this.field706 = new byte[128];
        this.field697 = new int[128];
        this.field712 = new byte[128];
        this.field695 = new short[128];
        this.field703 = new byte[128];
        this.field700 = new class93[128];
        this.field696 = new class142[128];
        class187 var2 = new class187(arg0);
        int var3;
        for (var3 = 0; var2.field3175[var2.field3169 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1269(255);
        }
        var2.field3169++;
        var3++;
        int var6 = 0;
        int var7 = var2.field3169;
        var2.field3169 += var3;
        while (var2.field3175[var2.field3169 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method1269(255);
        }
        var6++;
        var2.field3169++;
        int var10 = var2.field3169;
        var2.field3169 += var6;
        int var11;
        for (var11 = 0; var2.field3175[var2.field3169 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1269(255);
        }
        var11++;
        var2.field3169++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1268(255);
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
        class93[] var19 = new class93[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class93 var103 = var19[var20] = new class93();
            int var104 = var2.method1268(255);
            if (var104 > 0) {
                var103.field1458 = new byte[var104 * 2];
            }
            int var105 = var2.method1268(255);
            if (var105 > 0) {
                var103.field1461 = new byte[var105 * 2 + 2];
                var103.field1461[1] = 64;
            }
        }
        int var21 = var2.method1268(255);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = 0;
        int var24 = var2.method1268(255);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        while (var2.field3175[var2.field3169 + var23] != 0) {
            var23++;
        }
        byte[] var26 = new byte[var23];
        for (int var27 = 0; var27 < var23; var27++) {
            var26[var27] = var2.method1269(255);
        }
        var2.field3169++;
        var23++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1268(255);
            this.field695[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1268(255);
            this.field695[var31] = (short) (this.field695[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method1251(-1);
            }
            var32--;
            this.field695[var35] = (short) (this.field695[var35] + (class96.method626(var34 - 1, 2) << 14));
            this.field697[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field697[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field3175[var7++] - 1;
                    if (var4.length > var36) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                this.field712[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field697[var43] != 0) {
                if (var40 == 0) {
                    var42 = var2.field3175[var10++] + 16 << 2;
                    if (var8.length <= var41) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                }
                this.field703[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class93 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field697[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                var45--;
                this.field700[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 >= var26.length) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field697[var51] > 0) {
                    var50 = var2.method1268(255) + 1;
                }
            }
            this.field706[var51] = (byte) var50;
            var48--;
        }
        this.field711 = var2.method1268(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class93 var100 = var19[var52];
            if (var100.field1458 != null) {
                for (int var101 = 1; var101 < var100.field1458.length; var101 += 2) {
                    var100.field1458[var101] = var2.method1269(255);
                }
            }
            if (var100.field1461 != null) {
                for (int var102 = 3; var102 < var100.field1461.length - 2; var102 += 2) {
                    var100.field1461[var102] = var2.method1269(255);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1269(255);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var2.method1269(255);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class93 var97 = var19[var55];
            if (var97.field1461 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1461.length; var99 += 2) {
                    var98 = var2.method1268(255) + var98 + 1;
                    var97.field1461[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class93 var94 = var19[var56];
            if (var94.field1458 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1458.length; var96 += 2) {
                    var95 = var2.method1268(255) + var95 + 1;
                    var94.field1458[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1268(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method1268(255) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field706[var61] = (byte) (this.field706[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = client.method784(var67, (byte) 100, var65 - var59);
                    var67 += var66 - var60;
                    this.field706[var68] = (byte) (this.field706[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field706[var64] = (byte) (this.field706[var64] * var60 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var2.method1268(255);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var2.method1268(255) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field703[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field703[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = client.method784(var81, (byte) 107, var79 - var72);
                    var81 += var80 - var73;
                    int var84 = (this.field703[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field703[var82] = (byte) var84;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field703[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field703[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1460 = var2.method1268(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class93 var93 = var19[var87];
            if (var93.field1458 != null) {
                var93.field1462 = var2.method1268(255);
            }
            if (var93.field1461 != null) {
                var93.field1475 = var2.method1268(255);
            }
            if (var93.field1460 > 0) {
                var93.field1473 = var2.method1268(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1455 = var2.method1268(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class93 var92 = var19[var89];
            if (var92.field1455 > 0) {
                var92.field1454 = var2.method1268(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class93 var91 = var19[var90];
            if (var91.field1454 > 0) {
                var91.field1457 = var2.method1268(255);
            }
        }
    }
}
