import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class48 extends class103 {

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "[S")
    public short[] field810;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "[B")
    public byte[] field794;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "[B")
    public byte[] field804;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "[Lre;")
    public class208[] field815;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "[Lgj;")
    public class128[] field795;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "[B")
    public byte[] field797;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "[I")
    private int[] field800;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Z")
    public static boolean field798 = true;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field799 = 2;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "[I")
    public static int[] field801 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Lda;")
    public static class275 field796 = class255.method1672(115, "rect_debug=");

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field805 = 0;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "Lda;")
    public static class275 field814 = class255.method1672(115, "Fallen lassen");

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "B")
    public static byte field809;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "Lma;")
    public static class105 field808;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "Lma;")
    public static class105 field813;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "Llb;")
    public static class274 field803;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public static final void method305(int arg0, int arg1) {
        field816++;
        class9.field146.method988(arg0, -76);
        class123.field2202.method988(arg0, -96);
        class104.field1732.method988(arg0, arg1 - 125);
        if (arg1 != 0) {
            method306(76);
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
    public static void method306(int arg0) {
        field801 = null;
        field796 = null;
        field814 = null;
        field803 = null;
        field808 = null;
        if (arg0 == -32223) {
            field813 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)V")
    public static final void method307(int arg0, int arg1, int arg2, int arg3) {
        class229 var4 = class182.method1219((byte) 114, arg3, arg1);
        if (var4 != null && var4.field3895 != null) {
            class99 var5 = new class99();
            var5.field1677 = var4;
            var5.field1678 = var4.field3895;
            class177.method1192(var5, 200000);
        }
        field802++;
        class156.field2748 = arg3;
        class97.field1646 = arg1;
        class144.field2523 = true;
        if (arg0 != -1) {
            field808 = null;
        }
        class150.field2619 = arg2;
        class40.method231(var4, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Laf;[B[II)Z")
    public final boolean method308(class261 arg0, byte[] arg1, int[] arg2, int arg3) {
        if (arg3 != 128) {
            field805 = -21;
        }
        int var5 = 0;
        field812++;
        class128 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field800[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg0.method1703(arg2, false, var9 >> 2);
                        } else {
                            var6 = arg0.method1710(arg2, arg3 - 225, var9 >> 2);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field795[var8] = var6;
                        this.field800[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public final void method309(int arg0) {
        if (arg0 < 75) {
            this.method308((class261) null, (byte[]) null, (int[]) null, -115);
        }
        this.field800 = null;
        field807++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lij;ILda;)I")
    public static final int method310(class85 arg0, int arg1, class275 arg2) {
        if (arg1 != -11052) {
            field803 = null;
        }
        field806++;
        int var3 = arg0.field1392;
        arg0.method561((byte) -44, arg2.field4752);
        arg0.field1392 += class31.field474.method682((byte) -76, 0, arg0.field1392, arg2.field4749, arg0.field1381, arg2.field4752);
        return arg0.field1392 - var3;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class48() {
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([B)V")
    public class48(byte[] arg0) {
        this.field810 = new short[128];
        this.field794 = new byte[128];
        this.field804 = new byte[128];
        this.field815 = new class208[128];
        this.field795 = new class128[128];
        this.field797 = new byte[128];
        this.field800 = new int[128];
        int var2 = 0;
        class85 var3 = new class85(arg0);
        while (var3.field1381[var3.field1392 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method581(8);
        }
        var3.field1392++;
        var2++;
        int var6 = var3.field1392;
        var3.field1392 += var2;
        int var7;
        for (var7 = 0; var3.field1381[var3.field1392 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method581(8);
        }
        var3.field1392++;
        int var10 = var3.field1392;
        var7++;
        var3.field1392 += var7;
        int var11;
        for (var11 = 0; var3.field1381[var3.field1392 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method581(8);
        }
        var3.field1392++;
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
                int var105 = var3.method564((byte) 125);
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
        class208[] var18 = new class208[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class208 var102 = var18[var19] = new class208();
            int var103 = var3.method564((byte) 91);
            if (var103 > 0) {
                var102.field3524 = new byte[var103 * 2];
            }
            int var104 = var3.method564((byte) 121);
            if (var104 > 0) {
                var102.field3514 = new byte[var104 * 2 + 2];
                var102.field3514[1] = 64;
            }
        }
        int var20 = var3.method564((byte) 73);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var3.method564((byte) 90);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var3.field1381[var3.field1392 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method581(8);
        }
        var3.field1392++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method564((byte) 104);
            this.field810[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method564((byte) 86);
            this.field810[var30] = (short) (this.field810[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 < var25.length) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var3.method574(true);
            }
            this.field810[var34] = (short) (this.field810[var34] + (class19.method98(2, var33 - 1) << 14));
            this.field800[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field800[var38] != 0) {
                if (var36 == 0) {
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var3.field1381[var6++] - 1;
                }
                var36--;
                this.field794[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field800[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field1381[var10++] + 16 << 2;
                    if (var39 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                }
                var40--;
                this.field797[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        class208 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field800[var46] != 0) {
                if (var43 == 0) {
                    var44 = var18[var14[var45]];
                    if (var45 < var12.length) {
                        var43 = var12[var45++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field815[var46] = var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length > var48) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field800[var50] > 0) {
                    var49 = var3.method564((byte) 87) + 1;
                }
            }
            var47--;
            this.field804[var50] = (byte) var49;
        }
        this.field811 = var3.method564((byte) 50) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class208 var99 = var18[var51];
            if (var99.field3524 != null) {
                for (int var100 = 1; var100 < var99.field3524.length; var100 += 2) {
                    var99.field3524[var100] = var3.method581(8);
                }
            }
            if (var99.field3514 != null) {
                for (int var101 = 3; var101 < (var99.field3514.length - 2); var101 += 2) {
                    var99.field3514[var101] = var3.method581(8);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method581(8);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method581(8);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class208 var96 = var18[var54];
            if (var96.field3514 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3514.length; var98 += 2) {
                    var97 = var97 + var3.method564((byte) 74) + 1;
                    var96.field3514[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class208 var93 = var18[var55];
            if (var93.field3524 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3524.length; var95 += 2) {
                    var94 = var3.method564((byte) 100) + var94 + 1;
                    var93.field3524[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method564((byte) 78);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method564((byte) 126) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field804[var60] = (byte) (this.field804[var60] * var58 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var59) / 2 + (var64 - var59) * var58;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class226.method1465(var66, var64 - var59, -106);
                    var66 += var65 - var58;
                    this.field804[var67] = (byte) (this.field804[var67] * var68 + 32 >> 6);
                }
                var58 = var65;
                var59 = var64;
            }
            Object var62 = null;
            for (int var63 = var59; var63 < 128; var63++) {
                this.field804[var63] = (byte) (this.field804[var63] * var58 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var3.method564((byte) 57);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var3.method564((byte) 55) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            int var71 = var23[1] << 1;
            byte var72 = var23[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field797[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field797[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                int var78 = var23[var74 + 1] << 1;
                byte var79 = var23[var74];
                var74 += 2;
                int var80 = (var79 - var72) / 2 + (var79 - var72) * var71;
                for (int var81 = var72; var81 < var79; var81++) {
                    int var82 = class226.method1465(var80, var79 - var72, -110);
                    var80 += var78 - var71;
                    int var83 = (this.field797[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field797[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var72; var76 < 128; var76++) {
                int var77 = (this.field797[var76] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field797[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3518 = var3.method564((byte) 48);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class208 var92 = var18[var86];
            if (var92.field3524 != null) {
                var92.field3515 = var3.method564((byte) 111);
            }
            if (var92.field3514 != null) {
                var92.field3521 = var3.method564((byte) 111);
            }
            if (var92.field3518 > 0) {
                var92.field3522 = var3.method564((byte) 63);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3520 = var3.method564((byte) 82);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class208 var91 = var18[var88];
            if (var91.field3520 > 0) {
                var91.field3523 = var3.method564((byte) 99);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class208 var90 = var18[var89];
            if (var90.field3523 > 0) {
                var90.field3517 = var3.method564((byte) 114);
            }
        }
    }
}
