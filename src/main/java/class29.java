import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 extends class61 {

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "[B")
    public byte[] field537;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "[Ljg;")
    public class163[] field535;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "[B")
    public byte[] field528;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "[Lqa;")
    public class148[] field543;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "[S")
    public short[] field540;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "[I")
    private int[] field533;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "[B")
    public byte[] field542;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "J")
    public static long field525 = 0L;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "[Z")
    public static boolean[] field531 = new boolean[100];

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "Leb;")
    public static class230 field541 = class68.method589(0, "_labels");

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Leb;")
    public static class230 field523 = class68.method589(0, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Leb;")
    public static class230 field539 = class68.method589(0, "scrollen:");

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "Lkk;")
    public static class223 field532;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "Lkk;")
    public static class223 field534;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Lclient;")
    public static client field536;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(II)I")
    public static final int method267(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lkk;ILkk;)V")
    public static final void method268(class223 arg0, int arg1, class223 arg2) {
        field527++;
        class105.field1909 = arg2;
        class24.field466 = arg0;
        if (arg1 != 2) {
            method270(-42);
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)V")
    public final void method269(byte arg0) {
        field538++;
        this.field533 = null;
        int var2 = 113 % ((33 - arg0) / 43);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method270(int arg0) {
        field541 = null;
        field539 = null;
        field531 = null;
        field536 = null;
        field523 = null;
        if (arg0 <= -63) {
            field534 = null;
            field532 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static final void method271(int arg0) {
        if (class263.field4679 != -1) {
            class112.method902(86, class263.field4679);
        }
        field529++;
        for (int var1 = 0; var1 < class72.field1318; var1++) {
            if (class71.field1300[var1]) {
                class125.field2198[var1] = true;
            }
            field531[var1] = class71.field1300[var1];
            class71.field1300[var1] = false;
        }
        class37.field701 = -1;
        class177.field3116 = -1;
        class192.field3413 = null;
        int var2 = 17 % ((arg0 + 38) / 58);
        class127.field2215 = class259.field4584;
        if (class263.field4679 != -1) {
            class72.field1318 = 0;
            class223.method1547(0, class180.field3155, 0, 0, class263.field4679, 0, -1, -1, class135.field2434);
        }
        class87.method700();
        class219.field3771 = 0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([IZLb;[B)Z")
    public final boolean method272(int[] arg0, boolean arg1, class82 arg2, byte[] arg3) {
        field524++;
        boolean var5 = true;
        int var6 = 0;
        if (arg1) {
            method267(-114, 86);
        }
        class148 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field533[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method664(var9 >> 2, arg0, (byte) 78);
                        } else {
                            var7 = arg2.method666(arg0, var9 >> 2, -117);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field543[var8] = var7;
                        this.field533[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class29() {
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([B)V")
    public class29(byte[] arg0) {
        this.field537 = new byte[128];
        this.field535 = new class163[128];
        this.field528 = new byte[128];
        this.field543 = new class148[128];
        this.field540 = new short[128];
        this.field533 = new int[128];
        this.field542 = new byte[128];
        class14 var2 = new class14(arg0);
        int var3;
        for (var3 = 0; var2.field269[var2.field318 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method198(false);
        }
        var2.field318++;
        var3++;
        int var6 = var2.field318;
        var2.field318 += var3;
        int var7;
        for (var7 = 0; var2.field269[var2.field318 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method198(false);
        }
        var2.field318++;
        var7++;
        int var10 = var2.field318;
        int var11 = 0;
        var2.field318 += var7;
        while (var2.field269[var2.field318 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method198(false);
        }
        var11++;
        var2.field318++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method200(255);
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
        class163[] var18 = new class163[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class163 var102 = var18[var19] = new class163();
            int var103 = var2.method200(255);
            if (var103 > 0) {
                var102.field2918 = new byte[var103 * 2];
            }
            int var104 = var2.method200(255);
            if (var104 > 0) {
                var102.field2903 = new byte[var104 * 2 + 2];
                var102.field2903[1] = 64;
            }
        }
        int var20 = var2.method200(255);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method200(255);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field269[var2.field318 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method198(false);
        }
        var24++;
        var2.field318++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method200(255);
            this.field540[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method200(255);
            this.field540[var30] = (short) (this.field540[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var33 == 0) {
                if (var32 < var25.length) {
                    var33 = var25[var32++];
                } else {
                    var33 = -1;
                }
                var31 = var2.method195(-98);
            }
            this.field540[var34] = (short) (this.field540[var34] + class189.method1350(32768, var31 - 1 << 14));
            var33--;
            this.field533[var34] = var31;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field533[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field269[var6++] - 1;
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                var35--;
                this.field528[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field533[var42] != 0) {
                if (var39 == 0) {
                    if (var41 < var8.length) {
                        var39 = var8[var41++];
                    } else {
                        var39 = -1;
                    }
                    var40 = var2.field269[var10++] + 16 << 2;
                }
                var39--;
                this.field542[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        class163 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field533[var46] != 0) {
                if (var45 == 0) {
                    var44 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var43++];
                    }
                }
                this.field535[var46] = var44;
                var45--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length <= var47) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field533[var50] > 0) {
                    var49 = var2.method200(255) + 1;
                }
            }
            var48--;
            this.field537[var50] = (byte) var49;
        }
        this.field526 = var2.method200(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class163 var99 = var18[var51];
            if (var99.field2918 != null) {
                for (int var100 = 1; var100 < var99.field2918.length; var100 += 2) {
                    var99.field2918[var100] = var2.method198(false);
                }
            }
            if (var99.field2903 != null) {
                for (int var101 = 3; var101 < var99.field2903.length - 2; var101 += 2) {
                    var99.field2903[var101] = var2.method198(false);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method198(false);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method198(false);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class163 var96 = var18[var54];
            if (var96.field2903 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2903.length; var98 += 2) {
                    var97 += var2.method200(255) + 1;
                    var96.field2903[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class163 var93 = var18[var55];
            if (var93.field2918 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2918.length; var95 += 2) {
                    var94 = var94 + var2.method200(255) + 1;
                    var93.field2918[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method200(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method200(255) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field537[var60] = (byte) (this.field537[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var59) / 2 + (var64 - var59) * var58;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class21.method238(var66, true, var64 - var59);
                    var66 += var65 - var58;
                    this.field537[var67] = (byte) (this.field537[var67] * var68 + 32 >> 6);
                }
                var59 = var64;
                var58 = var65;
            }
            Object var62 = null;
            for (int var63 = var59; var63 < 128; var63++) {
                this.field537[var63] = (byte) (this.field537[var63] * var58 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method200(255);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method200(255) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field542[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field542[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                var74 += 2;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class21.method238(var80, true, var78 - var71);
                    var80 += var79 - var72;
                    int var83 = (this.field542[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field542[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field542[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field542[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2901 = var2.method200(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class163 var92 = var18[var86];
            if (var92.field2918 != null) {
                var92.field2910 = var2.method200(255);
            }
            if (var92.field2903 != null) {
                var92.field2912 = var2.method200(255);
            }
            if (var92.field2901 > 0) {
                var92.field2902 = var2.method200(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2906 = var2.method200(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class163 var91 = var18[var88];
            if (var91.field2906 > 0) {
                var91.field2913 = var2.method200(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class163 var90 = var18[var89];
            if (var90.field2913 > 0) {
                var90.field2909 = var2.method200(255);
            }
        }
    }
}
