import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class43 extends class86 {

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "[I")
    private int[] field697;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "[Lhh;")
    public class119[] field693;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "[B")
    public byte[] field702;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "[S")
    public short[] field696;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "[B")
    public byte[] field699;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "[B")
    public byte[] field694;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "[Lul;")
    public class192[] field701;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Z")
    public static boolean field688 = true;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field691 = new String[5];

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Luf;")
    public static class176 field690;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "Lqd;")
    public static class3 field698;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
    public static void method363(boolean arg0) {
        if (arg0) {
            field691 = null;
        }
        field691 = null;
        field690 = null;
        field698 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public final void method364(byte arg0) {
        this.field697 = null;
        field695++;
        if (arg0 != -45) {
            method363(true);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILuf;)V")
    public static final void method365(int arg0, class176 arg1) {
        field692++;
        class4.field57 = arg1;
        if (arg0 != -31450) {
            field688 = true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([I[BZLok;)Z")
    public final boolean method366(int[] arg0, byte[] arg1, boolean arg2, class41 arg3) {
        if (arg2) {
            this.field694 = null;
        }
        field689++;
        boolean var5 = true;
        int var6 = 0;
        class192 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field697[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method352((byte) 123, arg0, var9 >> 2);
                        } else {
                            var7 = arg3.method347(var9 >> 2, 0, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field701[var8] = var7;
                        this.field697[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class43() {
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "([B)V")
    public class43(byte[] arg0) {
        this.field697 = new int[128];
        this.field693 = new class119[128];
        this.field702 = new byte[128];
        this.field696 = new short[128];
        this.field699 = new byte[128];
        this.field694 = new byte[128];
        this.field701 = new class192[128];
        class37 var2 = new class37(arg0);
        int var3;
        for (var3 = 0; var2.field583[var2.field588 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method322((byte) 17);
        }
        var2.field588++;
        var3++;
        int var6 = var2.field588;
        var2.field588 += var3;
        int var7;
        for (var7 = 0; var2.field583[var2.field588 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method322((byte) 70);
        }
        var2.field588++;
        var7++;
        int var10 = var2.field588;
        var2.field588 += var7;
        int var11;
        for (var11 = 0; var2.field583[var2.field588 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method322((byte) 98);
        }
        var11++;
        var2.field588++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method333((byte) -59);
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
        class119[] var18 = new class119[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class119 var102 = var18[var19] = new class119();
            int var103 = var2.method333((byte) -59);
            if (var103 > 0) {
                var102.field1847 = new byte[var103 * 2];
            }
            int var104 = var2.method333((byte) -59);
            if (var104 > 0) {
                var102.field1848 = new byte[var104 * 2 + 2];
                var102.field1848[1] = 64;
            }
        }
        int var20 = var2.method333((byte) -59);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method333((byte) -59);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field583[var2.field588 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method322((byte) 35);
        }
        int var27 = 0;
        var2.field588++;
        var24++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method333((byte) -59);
            this.field696[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method333((byte) -59);
            this.field696[var30] = (short) (this.field696[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var33) {
                    var31 = var25[var33++];
                } else {
                    var31 = -1;
                }
                var32 = var2.method292(true);
            }
            var31--;
            this.field696[var34] = (short) (this.field696[var34] + (class3.method48(2, var32 - 1) << 14));
            this.field697[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field697[var38] != 0) {
                if (var37 == 0) {
                    var35 = var2.field583[var6++] - 1;
                    if (var36 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                this.field694[var38] = (byte) var35;
                var37--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field697[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field583[var10++] + 16 << 2;
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field702[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class119 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field697[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                var43--;
                this.field693[var46] = var45;
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
                if (this.field697[var50] > 0) {
                    var48 = var2.method333((byte) -59) + 1;
                }
            }
            this.field699[var50] = (byte) var48;
            var47--;
        }
        this.field700 = var2.method333((byte) -59) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class119 var99 = var18[var51];
            if (var99.field1847 != null) {
                for (int var100 = 1; var100 < var99.field1847.length; var100 += 2) {
                    var99.field1847[var100] = var2.method322((byte) 120);
                }
            }
            if (var99.field1848 != null) {
                for (int var101 = 3; var101 < var99.field1848.length - 2; var101 += 2) {
                    var99.field1848[var101] = var2.method322((byte) 59);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method322((byte) 94);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method322((byte) 55);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class119 var96 = var18[var54];
            if (var96.field1848 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1848.length; var98 += 2) {
                    var97 = var97 + var2.method333((byte) -59) + 1;
                    var96.field1848[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class119 var93 = var18[var55];
            if (var93.field1847 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1847.length; var95 += 2) {
                    var94 = var2.method333((byte) -59) + var94 + 1;
                    var93.field1847[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method333((byte) -59);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 -= -var2.method333((byte) -59) - 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field699[var60] = (byte) (this.field699[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                int var65 = (var64 - var58) / 2 + (var64 - var58) * var59;
                byte var66 = var21[var61 + 1];
                var61 += 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class90.method714(var65, (byte) -89, var64 - var58);
                    this.field699[var67] = (byte) (this.field699[var67] * var68 + 32 >> 6);
                    var65 += var66 - var59;
                }
                var59 = var66;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field699[var62] = (byte) (this.field699[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method333((byte) -59);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method333((byte) -59) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field702[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field702[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class90.method714(var80, (byte) -89, var78 - var71);
                    var80 += var79 - var72;
                    int var83 = (this.field702[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field702[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field702[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field702[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1849 = var2.method333((byte) -59);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class119 var92 = var18[var86];
            if (var92.field1847 != null) {
                var92.field1831 = var2.method333((byte) -59);
            }
            if (var92.field1848 != null) {
                var92.field1840 = var2.method333((byte) -59);
            }
            if (var92.field1849 > 0) {
                var92.field1844 = var2.method333((byte) -59);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1839 = var2.method333((byte) -59);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class119 var91 = var18[var88];
            if (var91.field1839 > 0) {
                var91.field1833 = var2.method333((byte) -59);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class119 var90 = var18[var89];
            if (var90.field1833 > 0) {
                var90.field1832 = var2.method333((byte) -59);
            }
        }
        if (class134.field2104) {
        }
    }
}
