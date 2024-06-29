import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class259 extends class417 {

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "[Lqk;")
    public class16[] field3706;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[B")
    public byte[] field3700;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "[Luv;")
    public class306[] field3704;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[S")
    public short[] field3701;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[I")
    private int[] field3696;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[B")
    public byte[] field3699;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[B")
    public byte[] field3697;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lh;")
    public static class572 field3705 = new class572("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lm;")
    public static class165 field3707;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 6)
    public static void method1644(byte arg0) {
        if (arg0 >= -11) {
            field3708 = -91;
        }
        field3707 = null;
        field3705 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Liba;I[I[B)Z", line = 22)
    public final boolean method1645(class453 arg0, int arg1, int[] arg2, byte[] arg3) {
        field3703++;
        boolean var5 = true;
        int var6 = 0;
        class16 var7 = null;
        int var8 = -99 % ((-arg1 - 70) / 41);
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg3 == null || arg3[var9] != 0) {
                int var10 = this.field3696[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg0.method2758(125, arg2, var10 >> 2);
                        } else {
                            var7 = arg0.method2750(arg2, 99, var10 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3706[var9] = var7;
                        this.field3696[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 81)
    public final void method1646(int arg0) {
        if (arg0 != 32768) {
            this.field3699 = null;
        }
        field3698++;
        this.field3696 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 96)
    public class259() {
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V", line = 98)
    public class259(byte[] arg0) {
        this.field3706 = new class16[128];
        this.field3700 = new byte[128];
        this.field3704 = new class306[128];
        this.field3701 = new short[128];
        this.field3696 = new int[128];
        this.field3699 = new byte[128];
        this.field3697 = new byte[128];
        class148 var2 = new class148(arg0);
        int var3;
        for (var3 = 0; var2.field2146[var2.field2177 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1062(-21188);
        }
        var2.field2177++;
        var3++;
        int var6 = var2.field2177;
        var2.field2177 += var3;
        int var7;
        for (var7 = 0; var2.field2146[var2.field2177 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1062(-21188);
        }
        var2.field2177++;
        var7++;
        int var10 = var2.field2177;
        var2.field2177 += var7;
        int var11;
        for (var11 = 0; var2.field2146[var2.field2177 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1062(-21188);
        }
        var11++;
        var2.field2177++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1032((byte) -33);
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
        class306[] var18 = new class306[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class306 var102 = var18[var19] = new class306();
            int var103 = var2.method1032((byte) -33);
            if (var103 > 0) {
                var102.field4199 = new byte[var103 * 2];
            }
            int var104 = var2.method1032((byte) -33);
            if (var104 > 0) {
                var102.field4194 = new byte[var104 * 2 + 2];
                var102.field4194[1] = 64;
            }
        }
        int var20 = var2.method1032((byte) -33);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1032((byte) -33);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field2146[var2.field2177 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1062(-21188);
        }
        var24++;
        var2.field2177++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1032((byte) -33);
            this.field3701[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1032((byte) -33);
            this.field3701[var30] = (short) (this.field3701[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length <= var32) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method1021((byte) 89);
            }
            this.field3701[var34] = (short) (this.field3701[var34] + class37.method245(32768, var33 - 1 << 14));
            this.field3696[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3696[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var35) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var2.field2146[var6++] - 1;
                }
                var36--;
                this.field3697[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3696[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field2146[var10++] + 16 << 2;
                    if (var8.length > var39) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field3699[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class306 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3696[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field3704[var46] = var45;
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
                if (this.field3696[var50] > 0) {
                    var49 = var2.method1032((byte) -33) + 1;
                }
            }
            var47--;
            this.field3700[var50] = (byte) var49;
        }
        this.field3702 = var2.method1032((byte) -33) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class306 var99 = var18[var51];
            if (var99.field4199 != null) {
                for (int var100 = 1; var100 < var99.field4199.length; var100 += 2) {
                    var99.field4199[var100] = var2.method1062(-21188);
                }
            }
            if (var99.field4194 != null) {
                for (int var101 = 3; var101 < var99.field4194.length - 2; var101 += 2) {
                    var99.field4194[var101] = var2.method1062(-21188);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1062(-21188);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1062(-21188);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class306 var96 = var18[var54];
            if (var96.field4194 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4194.length; var98 += 2) {
                    var97 = var97 + var2.method1032((byte) -33) + 1;
                    var96.field4194[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class306 var93 = var18[var55];
            if (var93.field4199 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4199.length; var95 += 2) {
                    var94 = (var94 + var2.method1032((byte) -33)) + 1;
                    var93.field4199[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1032((byte) -33);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method1032((byte) -33) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3700[var60] = (byte) (this.field3700[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class285.method1774((byte) 97, var66, var64 - var58);
                    var66 += var65 - var59;
                    this.field3700[var67] = (byte) (this.field3700[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field3700[var63] = (byte) (this.field3700[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method1032((byte) -33);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = (var69 + var2.method1032((byte) -33)) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3699[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3699[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class285.method1774((byte) 120, var80, var78 - var71);
                    int var83 = (this.field3699[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3699[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field3699[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3699[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4196 = var2.method1032((byte) -33);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class306 var92 = var18[var86];
            if (var92.field4199 != null) {
                var92.field4200 = var2.method1032((byte) -33);
            }
            if (var92.field4194 != null) {
                var92.field4195 = var2.method1032((byte) -33);
            }
            if (var92.field4196 > 0) {
                var92.field4204 = var2.method1032((byte) -33);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4203 = var2.method1032((byte) -33);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class306 var91 = var18[var88];
            if (var91.field4203 > 0) {
                var91.field4192 = var2.method1032((byte) -33);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class306 var90 = var18[var89];
            if (var90.field4192 > 0) {
                var90.field4193 = var2.method1032((byte) -33);
            }
        }
        if (class507.field7200) {
        }
    }
}
