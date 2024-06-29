import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class294 extends class544 {

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "[I")
    private int[] field3793;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "[B")
    public byte[] field3787;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "[B")
    public byte[] field3798;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "[Lmr;")
    public class123[] field3799;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "[S")
    public short[] field3801;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "[B")
    public byte[] field3795;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "[Lsj;")
    public class388[] field3790;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public int field3796;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lrg;")
    public static class548 field3791;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "[Lvaa;")
    public static class397[] field3802;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field3800;

    static {
        new class180("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field3797 = 0;
        field3791 = new class548(76, 4);
        field3802 = new class397[128];
        new class180("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZII)V", line = 16)
    public static final void method1640(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        field3792++;
        class557 var3 = class93.method564(15, -14073, 0);
        var3.method3257(1948);
        var3.field8207 = arg1;
        var3.field8201 = arg2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 34)
    public static void method1641(int arg0) {
        field3791 = null;
        field3802 = null;
        if (arg0 != 128) {
            field3791 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ldda;I)V", line = 49)
    public static final void method1642(class319 arg0, int arg1) {
        arg0.field4064 = null;
        field3789++;
        if (class279.field3678 < arg1) {
            class272.field3537.method1991(arg0, arg1 ^ 0xFFFFFF97);
            class279.field3678++;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljca;I[I[B)Z", line = 64)
    public final boolean method1643(class585 arg0, int arg1, int[] arg2, byte[] arg3) {
        if (arg1 != 128) {
            this.method1644((byte) -85);
        }
        field3788++;
        boolean var5 = true;
        int var6 = 0;
        class123 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3793[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method3399((byte) 83, var9 >> 2, arg2);
                        } else {
                            var7 = arg0.method3402(arg2, -30667, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3799[var8] = var7;
                        this.field3793[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 130)
    public final void method1644(byte arg0) {
        field3794++;
        this.field3793 = null;
        if (arg0 != 84) {
            this.method1643(null, -87, null, null);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)Z", line = 141)
    public static final boolean method1645(int arg0, int arg1, int arg2) {
        field3800++;
        if (arg2 != 1) {
            method1645(89, 35, -63);
        }
        return class558.method3269(78, arg0, arg1) | (arg0 & 0x70000) != 0 || class264.method1476(10, arg0, arg1);
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 154)
    public class294() {
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V", line = 161)
    public class294(byte[] arg0) {
        this.field3793 = new int[128];
        this.field3787 = new byte[128];
        this.field3798 = new byte[128];
        this.field3799 = new class123[128];
        this.field3801 = new short[128];
        this.field3795 = new byte[128];
        this.field3790 = new class388[128];
        class374 var2 = new class374(arg0);
        int var3;
        for (var3 = 0; var2.field4929[var2.field4966 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2124(21);
        }
        var2.field4966++;
        var3++;
        int var6 = var2.field4966;
        var2.field4966 += var3;
        int var7;
        for (var7 = 0; var2.field4929[var2.field4966 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2124(-120);
        }
        var7++;
        var2.field4966++;
        int var10 = var2.field4966;
        var2.field4966 += var7;
        int var11;
        for (var11 = 0; var2.field4929[var2.field4966 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2124(81);
        }
        var2.field4966++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2129(-122);
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
        class388[] var18 = new class388[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class388 var102 = var18[var19] = new class388();
            int var103 = var2.method2129(-83);
            if (var103 > 0) {
                var102.field5123 = new byte[var103 * 2];
            }
            int var104 = var2.method2129(-83);
            if (var104 > 0) {
                var102.field5130 = new byte[var104 * 2 + 2];
                var102.field5130[1] = 64;
            }
        }
        int var20 = var2.method2129(-118);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method2129(-111);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field4929[var2.field4966 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2124(-128);
        }
        var24++;
        var2.field4966++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2129(-67);
            this.field3801[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2129(-109);
            this.field3801[var30] = (short) (this.field3801[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method2104(19644);
            }
            this.field3801[var34] = (short) (this.field3801[var34] + class288.method1624(var33 - 1 << 14, 32768));
            var31--;
            this.field3793[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3793[var38] != 0) {
                if (var35 == 0) {
                    if (var4.length > var36) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var2.field4929[var6++] - 1;
                }
                var35--;
                this.field3795[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3793[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field4929[var10++] + 16 << 2;
                    if (var8.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                }
                var40--;
                this.field3798[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class388 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3793[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 >= var12.length) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                this.field3790[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 >= var25.length) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field3793[var50] > 0) {
                    var49 = var2.method2129(-64) + 1;
                }
            }
            this.field3787[var50] = (byte) var49;
            var47--;
        }
        this.field3796 = var2.method2129(-107) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class388 var99 = var18[var51];
            if (var99.field5123 != null) {
                for (int var100 = 1; var100 < var99.field5123.length; var100 += 2) {
                    var99.field5123[var100] = var2.method2124(-123);
                }
            }
            if (var99.field5130 != null) {
                for (int var101 = 3; var101 < var99.field5130.length - 2; var101 += 2) {
                    var99.field5130[var101] = var2.method2124(-117);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2124(91);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2124(71);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class388 var96 = var18[var54];
            if (var96.field5130 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field5130.length; var98 += 2) {
                    var97 = var2.method2129(-78) + var97 + 1;
                    var96.field5130[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class388 var93 = var18[var55];
            if (var93.field5123 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field5123.length; var95 += 2) {
                    var94 = var94 + var2.method2129(-116) + 1;
                    var93.field5123[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2129(-116);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method2129(-85) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3787[var60] = (byte) (this.field3787[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class272.method1521(var66, var64 - var58, 12);
                    this.field3787[var67] = (byte) (this.field3787[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field3787[var63] = (byte) (this.field3787[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method2129(-68);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method2129(-96) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3798[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3798[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class272.method1521(var80, var78 - var71, 8);
                    int var83 = (this.field3798[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3798[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var72 = var79;
                var74 += 2;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field3798[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3798[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field5127 = var2.method2129(-128);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class388 var92 = var18[var86];
            if (var92.field5123 != null) {
                var92.field5120 = var2.method2129(-107);
            }
            if (var92.field5130 != null) {
                var92.field5118 = var2.method2129(-75);
            }
            if (var92.field5127 > 0) {
                var92.field5124 = var2.method2129(-69);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field5121 = var2.method2129(-108);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class388 var91 = var18[var88];
            if (var91.field5121 > 0) {
                var91.field5119 = var2.method2129(-79);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class388 var90 = var18[var89];
            if (var90.field5119 > 0) {
                var90.field5131 = var2.method2129(-118);
            }
        }
    }
}
