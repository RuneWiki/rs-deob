import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class120 extends class529 {

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "[B")
    public byte[] field1641;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[Lsn;")
    public class501[] field1640;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "[Llf;")
    public class391[] field1637;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "[B")
    public byte[] field1647;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[B")
    public byte[] field1639;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[I")
    private int[] field1643;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "[S")
    public short[] field1644;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lvk;")
    public static class305 field1642 = new class305(0);

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lo;")
    public static class139 field1645;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lmn;")
    public static class162 field1646;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static void method756(boolean arg0) {
        if (!arg0) {
            field1646 = null;
        }
        field1646 = null;
        field1642 = null;
        field1645 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[B[ILek;)Z")
    public final boolean method757(int arg0, byte[] arg1, int[] arg2, class355 arg3) {
        field1635++;
        if (arg0 >= -12) {
            this.field1647 = null;
        }
        boolean var5 = true;
        int var6 = 0;
        class391 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1643[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method2341(var9 >> 2, 0, arg2);
                        } else {
                            var7 = arg3.method2344(arg2, var9 >> 2, -124);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1637[var8] = var7;
                        this.field1643[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final void method758(byte arg0) {
        int var2 = -62 / (-arg0 / 33);
        this.field1643 = null;
        field1636++;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class120() {
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
    public class120(byte[] arg0) {
        this.field1641 = new byte[128];
        this.field1640 = new class501[128];
        this.field1637 = new class391[128];
        this.field1647 = new byte[128];
        this.field1639 = new byte[128];
        this.field1643 = new int[128];
        this.field1644 = new short[128];
        class208 var2 = new class208(arg0);
        int var3;
        for (var3 = 0; var2.field3193[var2.field3162 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1427(false);
        }
        var3++;
        var2.field3162++;
        int var6 = var2.field3162;
        var2.field3162 += var3;
        int var7;
        for (var7 = 0; var2.field3193[var2.field3162 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1427(false);
        }
        var2.field3162++;
        var7++;
        int var10 = var2.field3162;
        var2.field3162 += var7;
        int var11;
        for (var11 = 0; var2.field3193[var2.field3162 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1427(false);
        }
        var11++;
        var2.field3162++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1445(90);
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
        class501[] var18 = new class501[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class501 var102 = var18[var19] = new class501();
            int var103 = var2.method1445(38);
            if (var103 > 0) {
                var102.field7511 = new byte[var103 * 2];
            }
            int var104 = var2.method1445(-120);
            if (var104 > 0) {
                var102.field7519 = new byte[var104 * 2 + 2];
                var102.field7519[1] = 64;
            }
        }
        int var20 = var2.method1445(-80);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1445(-86);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field3193[var2.field3162 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1427(false);
        }
        var2.field3162++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1445(117);
            this.field1644[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1445(22);
            this.field1644[var30] = (short) (this.field1644[var30] + (var29 << 8));
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
                var33 = var2.method1469((byte) -112);
            }
            this.field1644[var34] = (short) (this.field1644[var34] + class272.method1842(var33 - 1 << 14, 32768));
            this.field1643[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1643[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field3193[var6++] - 1;
                    if (var4.length <= var35) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                }
                this.field1641[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1643[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field3193[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field1639[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class501 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1643[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field1640[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 < var25.length) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field1643[var50] > 0) {
                    var49 = var2.method1445(83) + 1;
                }
            }
            var47--;
            this.field1647[var50] = (byte) var49;
        }
        this.field1638 = var2.method1445(-87) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class501 var99 = var18[var51];
            if (var99.field7511 != null) {
                for (int var100 = 1; var100 < var99.field7511.length; var100 += 2) {
                    var99.field7511[var100] = var2.method1427(false);
                }
            }
            if (var99.field7519 != null) {
                for (int var101 = 3; var101 < (var99.field7519.length - 2); var101 += 2) {
                    var99.field7519[var101] = var2.method1427(false);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1427(false);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1427(false);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class501 var96 = var18[var54];
            if (var96.field7519 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field7519.length; var98 += 2) {
                    var97 = var97 + var2.method1445(-112) + 1;
                    var96.field7519[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class501 var93 = var18[var55];
            if (var93.field7511 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field7511.length; var95 += 2) {
                    var94 -= -var2.method1445(-87) - 1;
                    var93.field7511[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1445(-87);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method1445(116) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1647[var60] = (byte) (this.field1647[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class435.method2738(var64 - var58, var66, (byte) -34);
                    var66 += var65 - var59;
                    this.field1647[var67] = (byte) (this.field1647[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field1647[var63] = (byte) (this.field1647[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method1445(20);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method1445(88) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1639[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1639[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class435.method2738(var78 - var71, var80, (byte) -34);
                    int var83 = (this.field1639[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field1639[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field1639[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1639[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field7523 = var2.method1445(117);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class501 var92 = var18[var86];
            if (var92.field7511 != null) {
                var92.field7522 = var2.method1445(-101);
            }
            if (var92.field7519 != null) {
                var92.field7512 = var2.method1445(-121);
            }
            if (var92.field7523 > 0) {
                var92.field7521 = var2.method1445(-97);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field7520 = var2.method1445(115);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class501 var91 = var18[var88];
            if (var91.field7520 > 0) {
                var91.field7518 = var2.method1445(-100);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class501 var90 = var18[var89];
            if (var90.field7518 > 0) {
                var90.field7513 = var2.method1445(-116);
            }
        }
    }
}
