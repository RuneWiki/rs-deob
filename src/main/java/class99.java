import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class99 extends class60 {

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[S")
    public short[] field1730;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[B")
    public byte[] field1722;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "[I")
    private int[] field1734;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[Lv;")
    public class143[] field1723;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "[B")
    public byte[] field1732;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "[Lw;")
    public class150[] field1719;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "[B")
    public byte[] field1720;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field1725 = 0;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "Z")
    public static boolean field1731 = false;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Lbc;")
    public static class201 field1728 = new class201(4096);

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "Lub;")
    public static class227 field1735 = class257.method1749("<col=ff9040>", 17263);

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field1737 = 0;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "Lta;")
    public static class105 field1738;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([BI[ILvj;)Z")
    public final boolean method607(byte[] arg0, int arg1, int[] arg2, class215 arg3) {
        field1726++;
        if (arg1 != -1) {
            this.method612(24);
        }
        boolean var5 = true;
        int var6 = 0;
        class150 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field1734[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1365(var9 >> 2, arg2, 0);
                        } else {
                            var7 = arg3.method1366(-2, arg2, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1719[var8] = var7;
                        this.field1734[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(BI)I")
    public static final int method608(byte arg0, int arg1) {
        field1729++;
        if (arg0 != 90) {
            field1738 = null;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ln;Ln;B)V")
    public static final void method609(class138 arg0, class138 arg1, byte arg2) {
        field1733++;
        class56.field1024 = class260.method1755(arg1, class44.field734, arg0, 0, arg2 + 18001);
        if (arg2 != 3) {
            field1725 = -94;
        }
        class88.field1526 = (class202) class56.field1024;
        class177.field2977 = class260.method1755(arg1, class67.field1212, arg0, 0, arg2 + 18001);
        class260.field4532 = class260.method1755(arg1, class172.field2871, arg0, 0, 18004);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method610(int arg0) {
        field1728 = null;
        field1735 = null;
        if (arg0 == -9090) {
            field1738 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static final void method611(int arg0) {
        class221.field3742.method1728(true);
        if (arg0 <= -33) {
            field1727++;
            class193.field3290.method1728(true);
            class180.field3089.method1728(true);
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
    public final void method612(int arg0) {
        this.field1734 = null;
        if (arg0 != -1) {
            method609((class138) null, (class138) null, (byte) 33);
        }
        field1736++;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class99() {
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "([B)V")
    public class99(byte[] arg0) {
        this.field1730 = new short[128];
        this.field1722 = new byte[128];
        this.field1734 = new int[128];
        this.field1723 = new class143[128];
        this.field1732 = new byte[128];
        this.field1719 = new class150[128];
        this.field1720 = new byte[128];
        int var2 = 0;
        class226 var3 = new class226(arg0);
        while (var3.field3901[var3.field3879 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1428(false);
        }
        var2++;
        var3.field3879++;
        int var6 = var3.field3879;
        int var7 = 0;
        var3.field3879 += var2;
        while (var3.field3901[var3.field3879 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1428(false);
        }
        var3.field3879++;
        var7++;
        int var10 = var3.field3879;
        var3.field3879 += var7;
        int var11;
        for (var11 = 0; var3.field3901[var3.field3879 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1428(false);
        }
        var3.field3879++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method1471(255);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class143[] var18 = new class143[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class143 var102 = var18[var19] = new class143();
            int var103 = var3.method1471(255);
            if (var103 > 0) {
                var102.field2468 = new byte[var103 * 2];
            }
            int var104 = var3.method1471(255);
            if (var104 > 0) {
                var102.field2458 = new byte[var104 * 2 + 2];
                var102.field2458[1] = 64;
            }
        }
        int var20 = var3.method1471(255);
        int var21 = 0;
        byte[] var22 = var20 > 0 ? new byte[var20 * 2] : null;
        int var23 = var3.method1471(255);
        while (var3.field3901[var3.field3879 + var21] != 0) {
            var21++;
        }
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        byte[] var25 = new byte[var21];
        for (int var26 = 0; var26 < var21; var26++) {
            var25[var26] = var3.method1428(false);
        }
        var3.field3879++;
        var21++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1471(255);
            this.field1730[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1471(255);
            this.field1730[var30] = (short) (this.field1730[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var32 == 0) {
                if (var31 < var25.length) {
                    var32 = var25[var31++];
                } else {
                    var32 = -1;
                }
                var33 = var3.method1446((byte) -120);
            }
            var32--;
            this.field1730[var34] = (short) (this.field1730[var34] + (class76.method446(2, var33 - 1) << 14));
            this.field1734[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1734[var38] != 0) {
                if (var37 == 0) {
                    var35 = var3.field3901[var6++] - 1;
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                var37--;
                this.field1720[var38] = (byte) var35;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1734[var42] != 0) {
                if (var41 == 0) {
                    var40 = var3.field3901[var10++] + 16 << 2;
                    if (var39 < var8.length) {
                        var41 = var8[var39++];
                    } else {
                        var41 = -1;
                    }
                }
                this.field1722[var42] = (byte) var40;
                var41--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class143 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1734[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                this.field1723[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length > var49) {
                    var47 = var25[var49++];
                } else {
                    var47 = -1;
                }
                if (this.field1734[var50] > 0) {
                    var48 = var3.method1471(255) + 1;
                }
            }
            this.field1732[var50] = (byte) var48;
            var47--;
        }
        this.field1724 = var3.method1471(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class143 var99 = var18[var51];
            if (var99.field2468 != null) {
                for (int var100 = 1; var100 < var99.field2468.length; var100 += 2) {
                    var99.field2468[var100] = var3.method1428(false);
                }
            }
            if (var99.field2458 != null) {
                for (int var101 = 3; var101 < (var99.field2458.length - 2); var101 += 2) {
                    var99.field2458[var101] = var3.method1428(false);
                }
            }
        }
        if (var22 != null) {
            for (int var52 = 1; var52 < var22.length; var52 += 2) {
                var22[var52] = var3.method1428(false);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method1428(false);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class143 var96 = var18[var54];
            if (var96.field2458 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2458.length; var98 += 2) {
                    var97 = var97 + var3.method1471(255) + 1;
                    var96.field2458[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class143 var93 = var18[var55];
            if (var93.field2468 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2468.length; var95 += 2) {
                    var94 = var3.method1471(255) + var94 + 1;
                    var93.field2468[var95] = (byte) var94;
                }
            }
        }
        if (var22 != null) {
            int var56 = var3.method1471(255);
            var22[0] = (byte) var56;
            for (int var57 = 2; var57 < var22.length; var57 += 2) {
                var56 = var56 + var3.method1471(255) + 1;
                var22[var57] = (byte) var56;
            }
            byte var58 = var22[1];
            byte var59 = var22[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field1732[var60] = (byte) (this.field1732[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var22.length) {
                byte var64 = var22[var61 + 1];
                byte var65 = var22[var61];
                var61 += 2;
                int var66 = (var65 - var59) / 2 + (var65 - var59) * var58;
                for (int var67 = var59; var67 < var65; var67++) {
                    int var68 = class15.method74(true, var66, var65 - var59);
                    var66 += var64 - var58;
                    this.field1732[var67] = (byte) (this.field1732[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var59; var63 < 128; var63++) {
                this.field1732[var63] = (byte) (this.field1732[var63] * var58 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var69 = var3.method1471(255);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 = var3.method1471(255) + var69 + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1722[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1722[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var24.length) {
                byte var78 = var24[var74];
                int var79 = var24[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class15.method74(true, var80, var78 - var71);
                    var80 += var79 - var72;
                    int var83 = (this.field1722[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1722[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field1722[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1722[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2465 = var3.method1471(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class143 var92 = var18[var86];
            if (var92.field2468 != null) {
                var92.field2462 = var3.method1471(255);
            }
            if (var92.field2458 != null) {
                var92.field2453 = var3.method1471(255);
            }
            if (var92.field2465 > 0) {
                var92.field2454 = var3.method1471(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2456 = var3.method1471(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class143 var91 = var18[var88];
            if (var91.field2456 > 0) {
                var91.field2467 = var3.method1471(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class143 var90 = var18[var89];
            if (var90.field2467 > 0) {
                var90.field2460 = var3.method1471(255);
            }
        }
    }
}
