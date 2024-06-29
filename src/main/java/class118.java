import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class118 extends class5 {

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "[B")
    public byte[] field1622;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[Ljp;")
    public class242[] field1612;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "[I")
    private int[] field1614;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "[B")
    public byte[] field1625;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "[S")
    public short[] field1620;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "[Lfk;")
    public class471[] field1619;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "[B")
    public byte[] field1626;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "[I")
    public static int[] field1616 = new int[14];

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1618 = 0;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "F")
    public static float field1617;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 3)
    public final void method725(int arg0) {
        this.field1614 = null;
        if (arg0 == -16) {
            field1624++;
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V", line = 23)
    public static void method726(int arg0) {
        field1616 = null;
        if (arg0 >= -79) {
            method726(95);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lwj;B)V", line = 39)
    public static final void method727(class275 arg0, byte arg1) {
        if (arg1 < 25) {
            method726(3);
        }
        field1615++;
        int var2 = arg0.field3817 - class393.field6017;
        int var3 = arg0.field3830 * 128 + (arg0.method637((byte) 113) * 64);
        int var4 = arg0.field3857 * 128 + (arg0.method637((byte) 62) * 64);
        arg0.field1862 += (var4 - arg0.field1862) / var2;
        arg0.field3914 = 0;
        arg0.field1867 += (var3 - arg0.field1867) / var2;
        if (arg0.field3814 == 0) {
            arg0.method1766((byte) -128, 8192);
        }
        if (arg0.field3814 == 1) {
            arg0.method1766((byte) -117, 12288);
        }
        if (arg0.field3814 == 2) {
            arg0.method1766((byte) -127, 0);
        }
        if (arg0.field3814 == 3) {
            arg0.method1766((byte) -127, 4096);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([II[BLf;)Z", line = 76)
    public final boolean method728(int[] arg0, int arg1, byte[] arg2, class540 arg3) {
        field1613++;
        int var5 = 51 % ((arg1 + 61) / 60);
        boolean var6 = true;
        int var7 = 0;
        class242 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg2 == null || arg2[var9] != 0) {
                int var10 = this.field1614[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg3.method3191(arg0, 0, var10 >> 2);
                        } else {
                            var8 = arg3.method3187(var10 >> 2, (byte) 47, arg0);
                        }
                        if (var8 == null) {
                            var6 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field1612[var9] = var8;
                        this.field1614[var9] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 138)
    public class118() {
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)V", line = 141)
    public static final void method729(int arg0) {
        field1623++;
        if (class256.field3541) {
            return;
        }
        class256.field3541 = true;
        if (class203.field2716.field1180) {
            class536.field7870 = ((int) class536.field7870 + 47 & 0xFFFFFFF0);
        } else {
            class172.field2319 += (12.0F - class172.field2319) / 2.0F;
        }
        class508.field7475 = true;
        if (arg0 != 2) {
            method729(-32);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([B)V", line = 168)
    public class118(byte[] arg0) {
        this.field1622 = new byte[128];
        this.field1612 = new class242[128];
        this.field1614 = new int[128];
        this.field1625 = new byte[128];
        this.field1620 = new short[128];
        this.field1619 = new class471[128];
        this.field1626 = new byte[128];
        class164 var2 = new class164(arg0);
        int var3;
        for (var3 = 0; var2.field2219[var2.field2185 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1088((byte) 51);
        }
        var2.field2185++;
        var3++;
        int var6 = var2.field2185;
        var2.field2185 += var3;
        int var7;
        for (var7 = 0; var2.field2219[var2.field2185 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1088((byte) 86);
        }
        var2.field2185++;
        var7++;
        int var10 = var2.field2185;
        var2.field2185 += var7;
        int var11;
        for (var11 = 0; var2.field2219[var2.field2185 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1088((byte) 52);
        }
        var11++;
        var2.field2185++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1087(false);
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
        class471[] var18 = new class471[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class471 var102 = var18[var19] = new class471();
            int var103 = var2.method1087(false);
            if (var103 > 0) {
                var102.field7023 = new byte[var103 * 2];
            }
            int var104 = var2.method1087(false);
            if (var104 > 0) {
                var102.field7025 = new byte[var104 * 2 + 2];
                var102.field7025[1] = 64;
            }
        }
        int var20 = var2.method1087(false);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method1087(false);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field2219[var2.field2185 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1088((byte) 52);
        }
        var24++;
        var2.field2185++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1087(false);
            this.field1620[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1087(false);
            this.field1620[var30] = (short) (this.field1620[var30] + (var29 << 8));
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
                var33 = var2.method1069(-5316);
            }
            this.field1620[var34] = (short) (this.field1620[var34] + (class519.method3092(var33 - 1, 2) << 14));
            var31--;
            this.field1614[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1614[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field2219[var6++] - 1;
                    if (var4.length > var36) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                this.field1625[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1614[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field2219[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                }
                this.field1626[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class471 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1614[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field1619[var46] = var45;
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
                if (this.field1614[var50] > 0) {
                    var49 = var2.method1087(false) + 1;
                }
            }
            var47--;
            this.field1622[var50] = (byte) var49;
        }
        this.field1611 = var2.method1087(false) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class471 var99 = var18[var51];
            if (var99.field7023 != null) {
                for (int var100 = 1; var100 < var99.field7023.length; var100 += 2) {
                    var99.field7023[var100] = var2.method1088((byte) 67);
                }
            }
            if (var99.field7025 != null) {
                for (int var101 = 3; var101 < var99.field7025.length - 2; var101 += 2) {
                    var99.field7025[var101] = var2.method1088((byte) 45);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1088((byte) -127);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1088((byte) 97);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class471 var96 = var18[var54];
            if (var96.field7025 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field7025.length; var98 += 2) {
                    var97 = var97 + var2.method1087(false) + 1;
                    var96.field7025[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class471 var93 = var18[var55];
            if (var93.field7023 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field7023.length; var95 += 2) {
                    var94 = var2.method1087(false) + var94 + 1;
                    var93.field7023[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1087(false);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method1087(false) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1622[var60] = (byte) (this.field1622[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class134.method906(var66, -123, var64 - var58);
                    this.field1622[var67] = (byte) (this.field1622[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field1622[var63] = (byte) (this.field1622[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method1087(false);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 -= -var2.method1087(false) - 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1626[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1626[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class134.method906(var80, -121, var78 - var71);
                    int var83 = (this.field1626[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field1626[var81] = (byte) var83;
                }
                var72 = var79;
                var74 += 2;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field1626[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1626[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field7024 = var2.method1087(false);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class471 var92 = var18[var86];
            if (var92.field7023 != null) {
                var92.field7018 = var2.method1087(false);
            }
            if (var92.field7025 != null) {
                var92.field7027 = var2.method1087(false);
            }
            if (var92.field7024 > 0) {
                var92.field7017 = var2.method1087(false);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field7022 = var2.method1087(false);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class471 var91 = var18[var88];
            if (var91.field7022 > 0) {
                var91.field7026 = var2.method1087(false);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class471 var90 = var18[var89];
            if (var90.field7026 > 0) {
                var90.field7019 = var2.method1087(false);
            }
        }
    }
}
