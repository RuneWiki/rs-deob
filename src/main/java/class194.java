import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class194 extends class129 {

    @OriginalMember(owner = "client!te", name = "A", descriptor = "[B")
    public byte[] field3770;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "[Lne;")
    public class134[] field3762;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "[B")
    public byte[] field3767;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "[B")
    public byte[] field3774;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "[Loc;")
    public class142[] field3779;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "[I")
    private int[] field3775;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "[S")
    public short[] field3769;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public int field3776;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field3766 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Lrd;")
    public static class173 field3768 = class133.method843(" steht bereits auf Ihrer Freunde)2Liste(Q", -112);

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Lrd;")
    private static class173 field3763 = class133.method843("green:", 82);

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Lrd;")
    public static class173 field3764 = field3763;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "Lrd;")
    public static class173 field3780 = class133.method843("au", -76);

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lrd;")
    public static class173 field3777 = class133.method843("AUS", 92);

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field3778 = 0;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Lrd;")
    public static class173 field3781 = field3763;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "[I")
    public static int[] field3771;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIB)V")
    public static final void method1287(int arg0, int arg1, byte arg2) {
        if (arg2 != 25) {
            field3763 = null;
        }
        field3765++;
        if (class117.field2173 != arg0) {
            class138.field2585 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class138.field2585[var3] = (var3 << 12) / arg0;
            }
            class199.field3882 = arg0 == 64 ? 2048 : 4096;
            class117.field2173 = arg0;
            class125.field2347 = arg0 - 1;
        }
        if (class99.field1802 == arg1) {
            return;
        }
        class105.field1937 = new int[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            class105.field1937[var4] = (var4 << 12) / arg1;
        }
        class26.field545 = arg1 - 1;
        class99.field1802 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public static void method1288(int arg0) {
        field3763 = null;
        field3764 = null;
        field3781 = null;
        field3771 = null;
        field3780 = null;
        if (arg0 == 0) {
            field3768 = null;
            field3777 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
    public static final int method1289(int arg0, int arg1) {
        int var2 = -119 % ((arg1 - 56) / 47);
        field3773++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public final void method1290(int arg0) {
        this.field3775 = null;
        field3782++;
        if (arg0 != 0) {
            method1289(-125, -9);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([B[IBLpb;)Z")
    public final boolean method1291(byte[] arg0, int[] arg1, byte arg2, class151 arg3) {
        if (arg2 <= 18) {
            return true;
        }
        int var5 = 0;
        field3772++;
        class142 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field3775[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg3.method990(var9 >> 2, (byte) 115, arg1);
                        } else {
                            var6 = arg3.method988(var9 >> 2, arg1, -1);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3779[var8] = var6;
                        this.field3775[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class194() {
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B)V")
    public class194(byte[] arg0) {
        this.field3770 = new byte[128];
        this.field3762 = new class134[128];
        int var2 = 0;
        this.field3767 = new byte[128];
        this.field3774 = new byte[128];
        this.field3779 = new class142[128];
        this.field3775 = new int[128];
        this.field3769 = new short[128];
        class121 var3 = new class121(arg0);
        while (var3.field2218[var3.field2222 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method767(-104);
        }
        var2++;
        int var6 = 0;
        var3.field2222++;
        int var7 = var3.field2222;
        var3.field2222 += var2;
        while (var3.field2218[var3.field2222 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method767(-87);
        }
        var3.field2222++;
        int var10 = var3.field2222;
        var6++;
        var3.field2222 += var6;
        int var11;
        for (var11 = 0; var3.field2218[var3.field2222 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method767(-123);
        }
        var11++;
        var3.field2222++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            int var16 = 1;
            var14[1] = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method751((byte) -107);
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
        class134[] var18 = new class134[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class134 var102 = var18[var19] = new class134();
            int var103 = var3.method751((byte) -118);
            if (var103 > 0) {
                var102.field2543 = new byte[var103 * 2];
            }
            int var104 = var3.method751((byte) 119);
            if (var104 > 0) {
                var102.field2541 = new byte[var104 * 2 + 2];
                var102.field2541[1] = 64;
            }
        }
        int var20 = var3.method751((byte) 107);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method751((byte) -54);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var3.field2218[var3.field2222 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method767(-110);
        }
        var3.field2222++;
        int var27 = 0;
        var24++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method751((byte) 106);
            this.field3769[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method751((byte) -69);
            this.field3769[var30] = (short) (this.field3769[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var3.method757((byte) -7);
            }
            var31--;
            this.field3769[var34] = (short) (this.field3769[var34] + class209.method1383(32768, var33 - 1 << 14));
            this.field3775[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3775[var38] != 0) {
                if (var36 == 0) {
                    var35 = var3.field2218[var7++] - 1;
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field3770[var38] = (byte) var35;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3775[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field2218[var10++] + 16 << 2;
                    if (var39 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                }
                this.field3774[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class134 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3775[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field3762[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var49 == 0) {
                if (var25.length > var47) {
                    var49 = var25[var47++];
                } else {
                    var49 = -1;
                }
                if (this.field3775[var50] > 0) {
                    var48 = var3.method751((byte) -45) + 1;
                }
            }
            var49--;
            this.field3767[var50] = (byte) var48;
        }
        this.field3776 = var3.method751((byte) -104) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class134 var99 = var18[var51];
            if (var99.field2543 != null) {
                for (int var100 = 1; var100 < var99.field2543.length; var100 += 2) {
                    var99.field2543[var100] = var3.method767(-82);
                }
            }
            if (var99.field2541 != null) {
                for (int var101 = 3; var101 < var99.field2541.length - 2; var101 += 2) {
                    var99.field2541[var101] = var3.method767(-126);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method767(-100);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method767(-111);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class134 var96 = var18[var54];
            if (var96.field2541 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2541.length; var98 += 2) {
                    var97 += var3.method751((byte) 92) + 1;
                    var96.field2541[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class134 var93 = var18[var55];
            if (var93.field2543 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2543.length; var95 += 2) {
                    var94 = var94 + var3.method751((byte) 86) + 1;
                    var93.field2543[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method751((byte) 109);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var3.method751((byte) -110) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3767[var60] = (byte) (this.field3767[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var58) * var59 + (var64 - var58) / 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class108.method660(var64 - var58, var66, (byte) -30);
                    this.field3767[var67] = (byte) (this.field3767[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field3767[var62] = (byte) (this.field3767[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method751((byte) 94);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var3.method751((byte) -99) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3774[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3774[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class108.method660(var78 - var71, var80, (byte) -30);
                    var80 += var79 - var72;
                    int var83 = (this.field3774[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3774[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field3774[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3774[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2534 = var3.method751((byte) -41);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class134 var92 = var18[var86];
            if (var92.field2543 != null) {
                var92.field2545 = var3.method751((byte) 100);
            }
            if (var92.field2541 != null) {
                var92.field2537 = var3.method751((byte) -123);
            }
            if (var92.field2534 > 0) {
                var92.field2547 = var3.method751((byte) -91);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2540 = var3.method751((byte) 83);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class134 var91 = var18[var88];
            if (var91.field2540 > 0) {
                var91.field2546 = var3.method751((byte) 94);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class134 var90 = var18[var89];
            if (var90.field2546 > 0) {
                var90.field2544 = var3.method751((byte) 126);
            }
        }
    }
}
