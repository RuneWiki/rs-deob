import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 extends class99 {

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "[B")
    public byte[] field1639;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "[Lnb;")
    public class92[] field1638;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "[Lqf;")
    public class117[] field1628;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "[B")
    public byte[] field1621;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "[S")
    public short[] field1637;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "[B")
    public byte[] field1626;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "[I")
    private int[] field1636;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "Lr;")
    public static class118 field1629 = class153.method1136(127, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "Z")
    public static boolean field1627 = false;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "Lr;")
    private static class118 field1624 = class153.method1136(88, " has logged in)3");

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public static int field1623 = 0;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Lr;")
    public static class118 field1620 = field1624;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "Lr;")
    public static class118 field1632 = class153.method1136(116, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "Ldf;")
    public static class28 field1640;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "Ljf;")
    public static class68 field1633;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BLs;[I)Z")
    public final boolean method594(int arg0, byte[] arg1, class125 arg2, int[] arg3) {
        field1634++;
        if (arg0 > -32) {
            method599((byte) -65);
        }
        boolean var5 = true;
        int var6 = 0;
        class117 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1636[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method974(126, var9 >> 2, arg3);
                        } else {
                            var7 = arg2.method969(arg3, (byte) 103, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1628[var8] = var7;
                        this.field1636[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method595(int arg0) {
        class94.field2237 = null;
        class124.field2836 = null;
        field1630++;
        if (arg0 >= 111) {
            class34.field856 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public final void method596(int arg0) {
        field1635++;
        if (arg0 < 12) {
            method599((byte) -100);
        }
        this.field1636 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([Lke;II)V")
    public static final void method597(class74[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class74 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field1807 == 0) {
                    if (var4.field1729 != null) {
                        method597(var4.field1729, 76, arg2);
                    }
                    class87 var5 = (class87) class31.field797.method297((long) var4.field1703, -1);
                    if (var5 != null) {
                        class113.method882((byte) -82, arg2, var5.field2114);
                    }
                }
                if (arg2 == 0 && var4.field1728 != null) {
                    class136 var6 = new class136();
                    var6.field3077 = var4;
                    var6.field3067 = var4.field1728;
                    class83.method681(var6, (byte) -116);
                }
                if (arg2 == 1 && var4.field1704 != null) {
                    if (var4.field1764 >= 0) {
                        class74 var7 = class99.method770(-4894, var4.field1703);
                        if (var7 == null || var7.field1729 == null || var7.field1729.length <= var4.field1764 || var7.field1729[var4.field1764] != var4) {
                            continue;
                        }
                    }
                    class136 var8 = new class136();
                    var8.field3077 = var4;
                    var8.field3067 = var4.field1704;
                    class83.method681(var8, (byte) -99);
                }
            }
        }
        if (arg1 < 63) {
            method597(null, 14, -115);
        }
        field1625++;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
    public static void method598(int arg0) {
        int var1 = 22 / ((39 - arg0) / 42);
        field1624 = null;
        field1620 = null;
        field1633 = null;
        field1629 = null;
        field1640 = null;
        field1632 = null;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
    public static final void method599(byte arg0) {
        if (class151.field3395 != null) {
            class75 var1 = class151.field3395;
            synchronized (class151.field3395) {
                class151.field3395 = null;
            }
        }
        if (arg0 > -49) {
            method600(-2);
        }
        field1631++;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
    public static final void method600(int arg0) {
        field1622++;
        class141.field3193.method394(arg0 ^ 0x521);
        if (arg0 != 13492) {
            field1623 = 38;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class70() {
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
    public class70(byte[] arg0) {
        this.field1639 = new byte[128];
        this.field1638 = new class92[128];
        this.field1628 = new class117[128];
        this.field1621 = new byte[128];
        this.field1637 = new short[128];
        this.field1626 = new byte[128];
        this.field1636 = new int[128];
        int var2 = 0;
        class105 var3 = new class105(arg0);
        while (var3.field2405[var3.field2404 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method807(false);
        }
        var2++;
        int var6 = 0;
        var3.field2404++;
        int var7 = var3.field2404;
        var3.field2404 += var2;
        while (var3.field2405[var3.field2404 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method807(false);
        }
        var3.field2404++;
        var6++;
        int var10 = var3.field2404;
        int var11 = 0;
        var3.field2404 += var6;
        while (var3.field2405[var3.field2404 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method807(false);
        }
        var11++;
        var3.field2404++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method831((byte) 76);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class92[] var19 = new class92[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class92 var103 = var19[var20] = new class92();
            int var104 = var3.method831((byte) 76);
            if (var104 > 0) {
                var103.field2191 = new byte[var104 * 2];
            }
            int var105 = var3.method831((byte) 76);
            if (var105 > 0) {
                var103.field2190 = new byte[var105 * 2 + 2];
                var103.field2190[1] = 64;
            }
        }
        int var21 = var3.method831((byte) 76);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method831((byte) 76);
        int var24;
        for (var24 = 0; var3.field2405[var3.field2404 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method807(false);
        }
        var24++;
        int var27 = 0;
        byte[] var28 = var23 > 0 ? new byte[var23 * 2] : null;
        var3.field2404++;
        for (int var29 = 0; var29 < 128; var29++) {
            var27 += var3.method831((byte) 76);
            this.field1637[var29] = (short) var27;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method831((byte) 76);
            this.field1637[var31] = (short) (this.field1637[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var34 == 0) {
                if (var25.length <= var32) {
                    var34 = -1;
                } else {
                    var34 = var25[var32++];
                }
                var33 = var3.method793((byte) -102);
            }
            this.field1637[var35] = (short) (this.field1637[var35] + class79.method669(var33 - 1 << 14, 32768));
            var34--;
            this.field1636[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1636[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field2405[var7++] - 1;
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                var36--;
                this.field1626[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1636[var43] != 0) {
                if (var41 == 0) {
                    var42 = var3.field2405[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field1639[var43] = (byte) var42;
            }
        }
        class92 var44 = null;
        int var45 = 0;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1636[var47] != 0) {
                if (var46 == 0) {
                    var44 = var19[var14[var45]];
                    if (var12.length > var45) {
                        var46 = var12[var45++];
                    } else {
                        var46 = -1;
                    }
                }
                this.field1638[var47] = var44;
                var46--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var25.length <= var49) {
                    var48 = -1;
                } else {
                    var48 = var25[var49++];
                }
                if (this.field1636[var51] > 0) {
                    var50 = var3.method831((byte) 76) + 1;
                }
            }
            this.field1621[var51] = (byte) var50;
            var48--;
        }
        this.field1619 = var3.method831((byte) 76) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class92 var100 = var19[var52];
            if (var100.field2191 != null) {
                for (int var101 = 1; var101 < var100.field2191.length; var101 += 2) {
                    var100.field2191[var101] = var3.method807(false);
                }
            }
            if (var100.field2190 != null) {
                for (int var102 = 3; var102 < var100.field2190.length - 2; var102 += 2) {
                    var100.field2190[var102] = var3.method807(false);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method807(false);
            }
        }
        if (var28 != null) {
            for (int var54 = 1; var54 < var28.length; var54 += 2) {
                var28[var54] = var3.method807(false);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class92 var97 = var19[var55];
            if (var97.field2190 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2190.length; var99 += 2) {
                    var98 = var3.method831((byte) 76) + var98 + 1;
                    var97.field2190[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class92 var94 = var19[var56];
            if (var94.field2191 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2191.length; var96 += 2) {
                    var95 = var95 + var3.method831((byte) 76) + 1;
                    var94.field2191[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method831((byte) 76);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method831((byte) 76) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1621[var61] = (byte) (this.field1621[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                var62 += 2;
                int var67 = (var66 - var59) * var60 + (var66 - var59) / 2;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class2.method8(var67, var66 - var59, false);
                    this.field1621[var68] = (byte) (this.field1621[var68] * var69 + 32 >> 6);
                    var67 += var65 - var60;
                }
                var60 = var65;
                var59 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field1621[var64] = (byte) (this.field1621[var64] * var60 + 32 >> 6);
            }
        }
        if (var28 != null) {
            int var70 = var3.method831((byte) 76);
            var28[0] = (byte) var70;
            for (int var71 = 2; var71 < var28.length; var71 += 2) {
                var70 = var3.method831((byte) 76) + var70 + 1;
                var28[var71] = (byte) var70;
            }
            byte var72 = var28[0];
            int var73 = var28[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1639[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1639[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var28.length > var75) {
                byte var79 = var28[var75];
                int var80 = var28[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class2.method8(var81, var79 - var72, false);
                    var81 += var80 - var73;
                    int var84 = (this.field1639[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field1639[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field1639[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1639[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2206 = var3.method831((byte) 76);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class92 var93 = var19[var87];
            if (var93.field2191 != null) {
                var93.field2196 = var3.method831((byte) 76);
            }
            if (var93.field2190 != null) {
                var93.field2202 = var3.method831((byte) 76);
            }
            if (var93.field2206 > 0) {
                var93.field2198 = var3.method831((byte) 76);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2199 = var3.method831((byte) 76);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class92 var92 = var19[var89];
            if (var92.field2199 > 0) {
                var92.field2211 = var3.method831((byte) 76);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class92 var91 = var19[var90];
            if (var91.field2211 > 0) {
                var91.field2201 = var3.method831((byte) 76);
            }
        }
    }
}
