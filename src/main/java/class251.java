import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class251 extends class435 {

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "[Ltk;")
    public class95[] field3632;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "[B")
    public byte[] field3628;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "[I")
    private int[] field3629;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "[Law;")
    public class506[] field3635;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "[B")
    public byte[] field3624;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "[B")
    public byte[] field3633;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "[S")
    public short[] field3637;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3625 = null;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field3627 = -1;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static void method1602(int arg0) {
        if (arg0 == 32) {
            field3625 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBII)I")
    public static final int method1603(int arg0, byte arg1, int arg2, int arg3) {
        field3631++;
        if ((class548.field8052[arg0][arg3][arg2] & 0x8) == 0) {
            if (arg1 != 111) {
                method1602(122);
            }
            return arg0 <= 0 || (class548.field8052[1][arg3][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
    public static final void method1604(int arg0, int arg1) {
        if (arg0 < 23) {
            method1604(-7, -45);
        }
        field3626++;
        class238.method1551(-115, class343.field4761.method2059(class238.field3511, true), arg1);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
    public final void method1605(int arg0) {
        if (arg0 != -1) {
            this.field3632 = null;
        }
        this.field3629 = null;
        field3636++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([BLap;[IB)Z")
    public final boolean method1606(byte[] arg0, class450 arg1, int[] arg2, byte arg3) {
        field3634++;
        boolean var5 = true;
        int var6 = 1 % ((-arg3 - 79) / 40);
        int var7 = 0;
        class95 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg0 == null || arg0[var9] != 0) {
                int var10 = this.field3629[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg1.method2624(var10 >> 2, arg2, -124);
                        } else {
                            var8 = arg1.method2619(arg2, var10 >> 2, (byte) -96);
                        }
                        if (var8 == null) {
                            var5 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field3632[var9] = var8;
                        this.field3629[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class251() {
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([B)V")
    public class251(byte[] arg0) {
        this.field3632 = new class95[128];
        this.field3628 = new byte[128];
        this.field3629 = new int[128];
        this.field3635 = new class506[128];
        this.field3624 = new byte[128];
        this.field3633 = new byte[128];
        this.field3637 = new short[128];
        class465 var2 = new class465(arg0);
        int var3;
        for (var3 = 0; var2.field6719[var2.field6710 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2712(-104);
        }
        var3++;
        var2.field6710++;
        int var6 = var2.field6710;
        var2.field6710 += var3;
        int var7;
        for (var7 = 0; var2.field6719[var2.field6710 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2712(-92);
        }
        var7++;
        var2.field6710++;
        int var10 = var2.field6710;
        var2.field6710 += var7;
        int var11;
        for (var11 = 0; var2.field6719[var2.field6710 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2712(-70);
        }
        var11++;
        var2.field6710++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2705(-119);
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
        class506[] var18 = new class506[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class506 var102 = var18[var19] = new class506();
            int var103 = var2.method2705(-69);
            if (var103 > 0) {
                var102.field7518 = new byte[var103 * 2];
            }
            int var104 = var2.method2705(-117);
            if (var104 > 0) {
                var102.field7526 = new byte[var104 * 2 + 2];
                var102.field7526[1] = 64;
            }
        }
        int var20 = var2.method2705(-88);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method2705(-101);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field6719[var2.field6710 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2712(-70);
        }
        var24++;
        var2.field6710++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2705(-121);
            this.field3637[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2705(-60);
            this.field3637[var30] = (short) (this.field3637[var30] + (var29 << 8));
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
                var33 = var2.method2713((byte) 96);
            }
            this.field3637[var34] = (short) (this.field3637[var34] + class248.method1593(32768, var33 - 1 << 14));
            var31--;
            this.field3629[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3629[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field6719[var6++] - 1;
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field3633[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3629[var42] != 0) {
                if (var39 == 0) {
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var2.field6719[var10++] + 16 << 2;
                }
                var39--;
                this.field3628[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class506 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3629[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field3635[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length <= var48) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field3629[var50] > 0) {
                    var49 = var2.method2705(-85) + 1;
                }
            }
            var47--;
            this.field3624[var50] = (byte) var49;
        }
        this.field3630 = var2.method2705(-82) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class506 var99 = var18[var51];
            if (var99.field7518 != null) {
                for (int var100 = 1; var100 < var99.field7518.length; var100 += 2) {
                    var99.field7518[var100] = var2.method2712(-117);
                }
            }
            if (var99.field7526 != null) {
                for (int var101 = 3; var101 < (var99.field7526.length - 2); var101 += 2) {
                    var99.field7526[var101] = var2.method2712(-92);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2712(-128);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2712(-90);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class506 var96 = var18[var54];
            if (var96.field7526 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field7526.length; var98 += 2) {
                    var97 += var2.method2705(-100) + 1;
                    var96.field7526[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class506 var93 = var18[var55];
            if (var93.field7518 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field7518.length; var95 += 2) {
                    var94 = var2.method2705(-49) + var94 + 1;
                    var93.field7518[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2705(-35);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = (var56 + var2.method2705(-61)) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3624[var60] = (byte) (this.field3624[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class646.method3627(-46, var64 - var58, var66);
                    var66 += var65 - var59;
                    this.field3624[var67] = (byte) (this.field3624[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field3624[var63] = (byte) (this.field3624[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method2705(-23);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method2705(-28) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3628[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3628[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class646.method3627(-66, var78 - var71, var80);
                    int var83 = (this.field3628[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field3628[var81] = (byte) var83;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field3628[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3628[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field7525 = var2.method2705(-88);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class506 var92 = var18[var86];
            if (var92.field7518 != null) {
                var92.field7516 = var2.method2705(-84);
            }
            if (var92.field7526 != null) {
                var92.field7519 = var2.method2705(-120);
            }
            if (var92.field7525 > 0) {
                var92.field7523 = var2.method2705(-21);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field7524 = var2.method2705(-62);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class506 var91 = var18[var88];
            if (var91.field7524 > 0) {
                var91.field7517 = var2.method2705(-20);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class506 var90 = var18[var89];
            if (var90.field7517 > 0) {
                var90.field7521 = var2.method2705(-125);
            }
        }
    }
}
