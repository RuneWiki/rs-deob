import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class354 {

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    private int field4545 = 1;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    private int field4549 = 0;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    private int field4550 = 0;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    private int field4553 = 1;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lki;")
    private class364 field4555 = new class364();

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "Z")
    private boolean field4565 = true;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Z")
    private boolean field4564 = false;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    private int field4571 = -1;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Z")
    private boolean field4569 = true;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "Z")
    private boolean field4572 = true;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "[Lvga;")
    private class239[] field4573 = new class239[2];

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    private int field4577 = 0;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "Z")
    private boolean field4575 = true;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lji;")
    private class622 field4558;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lqf;")
    private class701 field4559;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Lqf;")
    private class701 field4563;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lqf;")
    private class701 field4543;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lnj;")
    public static class415 field4552 = new class415(55, 4);

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "Lki;")
    public static class364 field4574 = new class364();

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "[I")
    public static int[] field4578 = new int[2];

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lvga;")
    private class239 field4566;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Lwj;")
    private class565 field4568;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "Lwj;")
    private class565 field4570;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Z")
    private boolean field4547;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Z")
    private final boolean method2029(int arg0) {
        if (this.field4572) {
            if (this.field4570 != null) {
                this.field4570.method3019(-14494);
                this.field4570 = null;
            }
            if (this.field4566 != null) {
                this.field4566.method3904((byte) -121);
                this.field4566 = null;
            }
            if (this.field4543 != null) {
                this.field4570 = new class565(this.field4558, 6402, this.field4545, this.field4553, this.field4558.field8561);
            }
            if (this.field4564) {
                this.field4566 = new class239(this.field4558, 34037, 6402, this.field4545, this.field4553);
            } else if (this.field4570 == null) {
                this.field4570 = new class565(this.field4558, 6402, this.field4545, this.field4553);
            }
            this.field4572 = false;
            this.field4569 = true;
            this.field4565 = true;
        }
        field4562++;
        if (this.field4575) {
            if (this.field4568 != null) {
                this.field4568.method3019(arg0 - 30878);
                this.field4568 = null;
            }
            if (this.field4573[0] != null) {
                this.field4573[0].method3904((byte) -113);
                this.field4573[0] = null;
            }
            if (this.field4573[1] != null) {
                this.field4573[1].method3904((byte) -118);
                this.field4573[1] = null;
            }
            if (this.field4543 != null) {
                this.field4568 = new class565(this.field4558, this.field4571, this.field4545, this.field4553, this.field4558.field8561);
            }
            this.field4573[0] = new class239(this.field4558, 34037, this.field4571, this.field4545, this.field4553);
            this.field4573[1] = this.field4577 > 1 ? new class239(this.field4558, 34037, this.field4571, this.field4545, this.field4553) : null;
            this.field4575 = false;
            this.field4569 = true;
            this.field4565 = true;
        }
        if (arg0 != 16384) {
            this.method2035(-38, null);
        }
        if (this.field4565) {
            if (this.field4543 == null) {
                this.field4558.method3395(18469, this.field4559);
                this.field4559.method3843(-26732, 0);
                this.field4559.method3843(-26732, 1);
                this.field4559.method3843(-26732, 8);
                this.field4559.method3841(this.field4573[0], 0, (byte) 125);
                if (this.field4577 > 1) {
                    this.field4559.method3841(this.field4573[1], 1, (byte) -112);
                }
                if (this.field4564) {
                    this.field4559.method3841(this.field4566, 8, (byte) 102);
                } else {
                    this.field4559.method3839(-15959, 8, this.field4570);
                }
                this.field4558.method3390(-22078, this.field4559);
            } else {
                this.field4558.method3395(18469, this.field4559);
                this.field4559.method3843(-26732, 0);
                this.field4559.method3843(arg0 ^ 0xFFFFD794, 1);
                this.field4559.method3843(-26732, 8);
                this.field4559.method3841(this.field4573[0], 0, (byte) -124);
                if (this.field4577 > 1) {
                    this.field4559.method3841(this.field4573[1], 1, (byte) -106);
                }
                if (this.field4564) {
                    this.field4559.method3841(this.field4566, 8, (byte) -122);
                }
                this.field4558.method3390(-22078, this.field4559);
                this.field4558.method3395(arg0 + 2085, this.field4543);
                this.field4543.method3843(-26732, 0);
                this.field4543.method3843(-26732, 8);
                this.field4543.method3839(-15959, 0, this.field4568);
                this.field4543.method3839(-15959, 8, this.field4570);
                this.field4558.method3390(-22078, this.field4543);
            }
            this.field4569 = true;
            this.field4565 = false;
        }
        if (this.field4569) {
            this.field4558.method3395(18469, this.field4563);
            this.field4569 = !this.field4563.method3833(22734);
            this.field4558.method3390(-22078, this.field4563);
        }
        return !this.field4569;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static void method2030(boolean arg0) {
        field4552 = null;
        field4574 = null;
        field4578 = null;
        if (!arg0) {
            method2036(false, 46, 111, null);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILom;)Z")
    public final boolean method2031(int arg0, class353 arg1) {
        field4551++;
        if (this.field4563 != null) {
            if (arg1.method971(48) || arg1.method974(35632)) {
                this.field4555.method2087(arg1, -124);
                this.method2032((byte) 83);
                if (this.method2029(16384)) {
                    if (this.field4545 != -1 && this.field4553 != -1) {
                        arg1.method978(this.field4553, this.field4545, 0);
                    }
                    arg1.field4535 = true;
                    return true;
                }
            }
            this.method2035(12699, arg1);
        }
        int var3 = 31 / ((arg0 + 50) / 55);
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    private final void method2032(byte arg0) {
        field4561++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 83) {
            this.field4568 = null;
        }
        for (class353 var5 = (class353) this.field4555.method2090(true); var5 != null; var5 = (class353) this.field4555.method2088(-152)) {
            int var9 = var5.method981(100);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method2028(false);
            var2 |= var5.method2025(true);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4571 != var6) {
            this.field4575 = true;
            this.field4571 = var6;
        }
        int var7 = this.field4577 > 2 ? 2 : this.field4577;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var7 != var8) {
            this.field4565 = this.field4575 = true;
        }
        if (var2 != this.field4564) {
            this.field4564 = var2;
            this.field4572 = true;
        }
        this.field4577 = var4;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    public final void method2033(byte arg0) {
        this.field4563 = this.field4543 = this.field4559 = null;
        field4557++;
        if (arg0 != 105) {
            method2034(-34, 0.5057741F, 62, 0.975995F, -0.379394F, -57, null, 64, (byte) -120, 24, 117, -127, 66);
        }
        this.field4573 = null;
        this.field4566 = null;
        this.field4568 = null;
        this.field4570 = null;
        if (!this.field4555.method2093(-2)) {
            for (class424 var2 = this.field4555.method2090(true); var2 != this.field4555.field4702; var2 = var2.field5500) {
                ((class353) var2).method972(-1);
            }
        }
        this.field4545 = this.field4553 = 1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IFIFFI[FIBIIII)V")
    public static final void method2034(int arg0, float arg1, int arg2, float arg3, float arg4, int arg5, float[] arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg0 - arg9;
        field4544++;
        int var14 = arg12 - arg10;
        int var15 = arg5 - arg2;
        float var16 = arg6[2] * (float) var13 + arg6[0] * (float) var14 + arg6[1] * (float) var15;
        float var17 = arg6[5] * (float) var13 + arg6[4] * (float) var15 + arg6[3] * (float) var14;
        float var18 = arg6[8] * (float) var13 + arg6[6] * (float) var14 + arg6[7] * (float) var15;
        if (arg8 >= -30) {
            field4560 = 51;
        }
        float var19;
        float var20;
        if (arg7 == 0) {
            var19 = arg1 + 0.5F - var18;
            var20 = arg3 + var16 + 0.5F;
        } else if (arg7 == 1) {
            var19 = arg1 + var18 + 0.5F;
            var20 = arg3 + var16 + 0.5F;
        } else if (arg7 == 2) {
            var19 = arg4 + 0.5F - var17;
            var20 = arg3 + 0.5F - var16;
        } else if (arg7 == 3) {
            var20 = arg3 + var16 + 0.5F;
            var19 = arg4 + 0.5F - var17;
        } else if (arg7 == 4) {
            var19 = arg4 + 0.5F - var17;
            var20 = arg1 + var18 + 0.5F;
        } else {
            var20 = arg1 + 0.5F - var18;
            var19 = arg4 + 0.5F - var17;
        }
        if (arg11 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg11 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg11 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class573.field7462 = var20;
        class229.field3055 = var19;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(ILom;)V")
    public final void method2035(int arg0, class353 arg1) {
        if (arg0 != 12699) {
            return;
        }
        field4567++;
        arg1.field4535 = false;
        arg1.method972(arg0 ^ 0xFFFFCE64);
        arg1.method2438((byte) 116);
        this.method2032((byte) 83);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIILoa;)V")
    public static final void method2036(boolean arg0, int arg1, int arg2, class43 arg3) {
        field4546++;
        if (arg2 < 0 || arg1 < 0 || class646.field9012 == 0 || class72.field991 == 0) {
            return;
        }
        arg3.method393(class433.field5580, class626.field8757, class646.field9012, class72.field991);
        arg3.method376(class686.field9409, class518.field6789, class646.field9012, class72.field991);
        class151 var4 = arg3.method346();
        var4.method144(class448.field5869, class579.field7893, class213.field2748, class195.field2549, class590.field8006, class626.field8758);
        arg3.method342(var4);
        if (class353.field4540 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg3.method343();
            int var8 = (arg2 - class433.field5580) * var7 / class646.field9012;
            int var9 = (arg1 - class626.field8757) * var7 / class72.field991;
            int var10 = arg3.method361();
            int var11 = (arg2 - class433.field5580) * var10 / class646.field9012;
            int var12 = (arg1 - class626.field8757) * var10 / class72.field991;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method132(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method132(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && var20 < class611.field8258 && class656.field9155 > var22) {
                    int var23 = class233.field3130.field508;
                    if (var23 < 3 && (class159.field1994[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class353.field4540[var23].method669(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class233.field3130.method1265(88) - 1 << 8) + var19 >> 9;
                        var6 = var21 + (class233.field3130.method1265(110) - 1 << 8) >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class499.field6560 && (class345.field4410 & 0x40) != 0) {
                    class477 var24 = class386.method2203(class634.field8832, 0, class34.field499);
                    if (var24 == null) {
                        class695.method3778((byte) 22);
                    } else {
                        class47.method433(var6, " ->", 0L, class295.field3842, 19, -1, false, class368.field4752, var5, true, (byte) 120);
                    }
                } else {
                    if (class50.field699 == class153.field1947) {
                        class47.method433(var6, "", 0L, class604.field8151.method3280((byte) 125, class144.field1890), 3, -1, false, -1, var5, true, (byte) 119);
                    }
                    class634.field8825++;
                    class47.method433(var6, "", 0L, class407.field5172, 30, -1, false, class460.field6041, var5, true, (byte) 127);
                }
            }
        }
        class365 var25 = class509.field6675;
        for (class215 var26 = (class215) var25.method2101(260); var26 != null; var26 = (class215) var25.method2098((byte) 57)) {
            if ((class630.field8788 || class233.field3130.field508 == var26.field2769) && var26.method1378(arg1, arg3, arg2, 0)) {
                if (var26.field2767 instanceof class193) {
                    class193 var27 = (class193) var26.field2767;
                    int var28 = var27.method1265(81);
                    if ((var28 & 0x1) == 0 && (var27.field506 & 0x1FF) == 0 && (var27.field503 & 0x1FF) == 0 || (var28 & 0x1) == 1 && (var27.field506 & 0x1FF) == 256 && (var27.field503 & 0x1FF) == 256) {
                        int var29 = var27.field506 - (var27.method1265(116) - 1 << 8);
                        int var30 = var27.field503 - (var27.method1265(120) - 1 << 8);
                        for (int var31 = 0; var31 < class248.field3351; var31++) {
                            class234 var38 = (class234) class505.field6640.method39((long) class40.field558[var31], 31750);
                            if (var38 != null) {
                                class532 var39 = var38.field3131;
                                if (class424.field5503 != var39.field2965 && var39.field2983) {
                                    int var40 = var39.field506 - (var39.field6914.field9711 - 1 << 8);
                                    int var41 = var39.field503 - (var39.field6914.field9711 - 1 << 8);
                                    if (var29 <= var40 && var39.field6914.field9711 <= var27.method1265(63) - (var40 - var29 >> 9) && var41 >= var30 && var39.field6914.field9711 <= (var27.method1265(123) - (var41 - var30 >> 9))) {
                                        class239.method1503(class233.field3130.field508 != var26.field2769, 3314, var39);
                                        var39.field2965 = class424.field5503;
                                    }
                                }
                            }
                        }
                        int var32 = class260.field3508;
                        int[] var33 = class135.field1779;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class193 var35 = class592.field8019[var33[var34]];
                            if (var35 != null && class424.field5503 != var35.field2965 && var27 != var35 && var35.field2983) {
                                int var36 = var35.field506 - (var35.method1265(77) - 1 << 8);
                                int var37 = var35.field503 - (var35.method1265(65) - 1 << 8);
                                if (var36 >= var29 && var35.method1265(103) <= (var27.method1265(74) - (var36 - var29 >> 9)) && var30 <= var37 && var35.method1265(89) <= var27.method1265(70) - (var37 - var30 >> 9)) {
                                    class171.method1165(class233.field3130.field508 != var26.field2769, var35, 6);
                                    var35.field2965 = class424.field5503;
                                }
                            }
                        }
                    }
                    if (class424.field5503 == var27.field2965) {
                        continue;
                    }
                    class171.method1165(class233.field3130.field508 != var26.field2769, var27, 6);
                    var27.field2965 = class424.field5503;
                }
                if (var26.field2767 instanceof class532) {
                    class532 var42 = (class532) var26.field2767;
                    if (var42.field6914 != null) {
                        if ((var42.field6914.field9711 & 0x1) == 0 && (var42.field506 & 0x1FF) == 0 && (var42.field503 & 0x1FF) == 0 || (var42.field6914.field9711 & 0x1) == 1 && (var42.field506 & 0x1FF) == 256 && (var42.field503 & 0x1FF) == 256) {
                            int var43 = var42.field506 - (var42.field6914.field9711 - 1 << 8);
                            int var44 = var42.field503 - (var42.field6914.field9711 - 1 << 8);
                            for (int var45 = 0; var45 < class248.field3351; var45++) {
                                class234 var52 = (class234) class505.field6640.method39((long) class40.field558[var45], 31750);
                                if (var52 != null) {
                                    class532 var53 = var52.field3131;
                                    if (class424.field5503 != var53.field2965 && var42 != var53 && var53.field2983) {
                                        int var54 = var53.field506 - (var53.field6914.field9711 - 1 << 8);
                                        int var55 = var53.field503 - (var53.field6914.field9711 - 1 << 8);
                                        if (var54 >= var43 && var42.field6914.field9711 - (var54 - var43 >> 9) >= var53.field6914.field9711 && var55 >= var44 && var53.field6914.field9711 <= (var42.field6914.field9711 - (var55 - var44 >> 9))) {
                                            class239.method1503(class233.field3130.field508 != var26.field2769, 3314, var53);
                                            var53.field2965 = class424.field5503;
                                        }
                                    }
                                }
                            }
                            int var46 = class260.field3508;
                            int[] var47 = class135.field1779;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class193 var49 = class592.field8019[var47[var48]];
                                if (var49 != null && class424.field5503 != var49.field2965 && var49.field2983) {
                                    int var50 = var49.field506 - (var49.method1265(121) - 1 << 8);
                                    int var51 = var49.field503 - (var49.method1265(96) - 1 << 8);
                                    if (var43 <= var50 && var49.method1265(127) <= (var42.field6914.field9711 - (var50 - var43 >> 9)) && var51 >= var44 && var49.method1265(97) <= (var42.field6914.field9711 - (var51 - var44 >> 9))) {
                                        class171.method1165(class233.field3130.field508 != var26.field2769, var49, 6);
                                        var49.field2965 = class424.field5503;
                                    }
                                }
                            }
                        }
                        if (class424.field5503 == var42.field2965) {
                            continue;
                        }
                        class239.method1503(class233.field3130.field508 != var26.field2769, 3314, var42);
                        var42.field2965 = class424.field5503;
                    }
                }
                if (var26.field2767 instanceof class376) {
                    int var56 = var26.field2764 + class100.field1326;
                    int var57 = class186.field2376 + var26.field2759;
                    class37 var58 = (class37) class197.field2589.method39((long) (var57 << 14 | var26.field2769 << 28 | var56), 31750);
                    if (var58 != null) {
                        for (class558 var59 = (class558) var58.field542.method2081(-121); var59 != null; var59 = (class558) var58.field542.method2086((byte) 106)) {
                            class696 var60 = class232.field3109.method1292(0, var59.field7283);
                            if (class499.field6560 && class233.field3130.field508 == var26.field2769) {
                                class428 var61 = class203.field2642 == -1 ? null : class191.field2445.method1075((byte) -65, class203.field2642);
                                if ((class345.field4410 & 0x1) != 0 && (var61 == null || var60.method3782(!arg0, var61.field5546, class203.field2642) != var61.field5546)) {
                                    class47.method433(var26.field2759, class542.field7044 + " -> <col=ff9040>" + var60.field9569, (long) var59.field7283, class295.field3842, 21, -1, false, class368.field4752, var26.field2764, true, (byte) -51);
                                    class651.field9062++;
                                }
                            }
                            if (class233.field3130.field508 == var26.field2769) {
                                String[] var62 = var60.field9556;
                                for (int var63 = 4; var63 >= 0; var63--) {
                                    if (var62 != null && var62[var63] != null) {
                                        byte var64 = 0;
                                        if (var63 == 0) {
                                            var64 = 16;
                                        }
                                        int var65 = class384.field4916;
                                        if (var63 == 1) {
                                            var64 = 51;
                                        }
                                        if (var63 == 2) {
                                            var64 = 44;
                                        }
                                        if (var63 == 3) {
                                            var64 = 23;
                                        }
                                        if (var60.field9508 == var63) {
                                            var65 = var60.field9531;
                                        }
                                        if (var63 == 4) {
                                            var64 = 4;
                                        }
                                        if (var60.field9510 == var63) {
                                            var65 = var60.field9544;
                                        }
                                        class289.field3737++;
                                        class47.method433(var26.field2759, "<col=ff9040>" + var60.field9569, (long) var59.field7283, var62[var63], var64, -1, false, var65, var26.field2764, true, (byte) 123);
                                    }
                                }
                            }
                            class47.method433(var26.field2759, "<col=ff9040>" + var60.field9569, (long) var59.field7283, class604.field8146.method3280((byte) -98, class144.field1890), 1002, -1, class233.field3130.field508 != var26.field2769, class482.field6415, var26.field2764, true, (byte) 119);
                            class107.field1401++;
                        }
                    }
                }
                if (var26.field2767 instanceof class620) {
                    class620 var66 = (class620) var26.field2767;
                    class698 var67 = class348.field4436.method1900(-112, var66.method76((byte) -112));
                    if (var67.field9630 != null) {
                        var67 = var67.method3815(65535, class397.field5054);
                    }
                    if (var67 != null) {
                        if (class499.field6560 && class233.field3130.field508 == var26.field2769) {
                            class428 var68 = class203.field2642 == -1 ? null : class191.field2445.method1075((byte) -65, class203.field2642);
                            if ((class345.field4410 & 0x4) != 0 && (var68 == null || var67.method3810(var68.field5546, 127, class203.field2642) != var68.field5546)) {
                                class47.method433(var26.field2759, class542.field7044 + " -> <col=00ffff>" + var67.field9645, class50.method453(var26.field2759, var66, 7, var26.field2764), class295.field3842, 60, -1, false, class368.field4752, var26.field2764, true, (byte) 121);
                                class230.field3070++;
                            }
                        }
                        if (class233.field3130.field508 == var26.field2769) {
                            String[] var69 = var67.field9657;
                            if (var69 != null) {
                                for (int var70 = 4; var70 >= 0; var70--) {
                                    if (var69[var70] != null) {
                                        short var71 = 0;
                                        if (var70 == 0) {
                                            var71 = 49;
                                        }
                                        int var72 = class384.field4916;
                                        if (var70 == 1) {
                                            var71 = 48;
                                        }
                                        if (var70 == 2) {
                                            var71 = 18;
                                        }
                                        if (var70 == 3) {
                                            var71 = 57;
                                        }
                                        if (var70 == 4) {
                                            var71 = 1006;
                                        }
                                        if (var67.field9596 == var70) {
                                            var72 = var67.field9594;
                                        }
                                        if (var67.field9593 == var70) {
                                            var72 = var67.field9638;
                                        }
                                        class625.field8741++;
                                        class47.method433(var26.field2759, "<col=00ffff>" + var67.field9645, class50.method453(var26.field2759, var66, 10, var26.field2764), var69[var70], var71, -1, false, var72, var26.field2764, true, (byte) -10);
                                    }
                                }
                            }
                        }
                        class47.method433(var26.field2759, "<col=00ffff>" + var67.field9645, (long) var67.field9625, class604.field8146.method3280((byte) -110, class144.field1890), 1004, -1, class233.field3130.field508 != var26.field2769, class482.field6415, var26.field2764, true, (byte) 119);
                        class66.field891++;
                    }
                }
            }
        }
        if (!arg0) {
            field4576 = -119;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIII)Z")
    public final boolean method2037(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4542++;
        if (this.field4563 == null || this.field4555.method2093(-2)) {
            return false;
        }
        if (this.field4545 != arg4 || this.field4553 != arg3) {
            this.field4553 = arg3;
            this.field4545 = arg4;
            for (class424 var6 = this.field4555.method2090(!arg0); var6 != this.field4555.field4702; var6 = var6.field5500) {
                ((class353) var6).method978(this.field4553, this.field4545, 0);
            }
            this.field4565 = true;
            this.field4575 = true;
            this.field4572 = true;
        }
        if (arg0) {
            return false;
        } else if (this.method2029(16384)) {
            this.field4547 = true;
            this.field4550 = arg2;
            this.field4549 = arg1;
            this.field4558.method3395(18469, this.field4563);
            this.field4563.method3840((byte) 107, 0);
            this.field4558.method3410(-this.field4550, -109, this.field4553 + this.field4549 - this.field4558.field8407);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public final void method2038(int arg0) {
        field4554++;
        if (!this.field4547) {
            return;
        }
        if (this.field4543 != null) {
            this.field4558.method3465(this.field4543, (byte) 42);
            int var2 = 16384;
            this.field4558.method3402(this.field4559, (byte) -51);
            this.field4543.method3835(56, 0);
            this.field4559.method3840((byte) 77, 0);
            if (this.field4564) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field4545, this.field4553, 0, 0, this.field4545, this.field4553, var2, 9728);
            this.field4558.method3419(120, this.field4543);
            this.field4558.method3442(this.field4559, -122);
        }
        this.field4558.method3441(6369);
        this.field4558.method3403(0, -3);
        this.field4558.method3443(1, true);
        this.field4558.method396();
        int var3 = 0;
        int var4 = 1;
        if (arg0 < 96) {
            this.field4553 = -41;
        }
        class353 var6;
        for (class353 var5 = (class353) this.field4555.method2090(true); var5 != null; var5 = var6) {
            var6 = (class353) this.field4555.method2088(-152);
            int var7 = var5.method2028(false);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method980(this.field4566, this.field4573[var3], var8, -1);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field4558.method3390(-22078, this.field4559);
                    this.field4558.method3410(0, -91, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4553);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4550, this.field4549);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4550, this.field4553 + this.field4549);
                    OpenGL.glTexCoord2f((float) this.field4545, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4550 + this.field4545, this.field4549 - -this.field4553);
                    OpenGL.glTexCoord2f((float) this.field4545, (float) this.field4553);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4550 + this.field4545, this.field4549);
                    OpenGL.glEnd();
                } else {
                    this.field4559.method3840((byte) 17, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4553);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field4553);
                    OpenGL.glTexCoord2f((float) this.field4545, (float) this.field4553);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4545, this.field4553);
                    OpenGL.glTexCoord2f((float) this.field4545, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4545, 0);
                    OpenGL.glEnd();
                }
                var5.method979(0, var8);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field4547 = false;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Z")
    public final boolean method2039(int arg0) {
        field4556++;
        if (arg0 == 4) {
            return this.field4563 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)I")
    public static final int method2040(int arg0, byte arg1, int arg2) {
        field4548++;
        int var3 = arg0 >>> 24;
        int var4 = 121 % ((arg1 - 32) / 36);
        int var5 = 255 - var3;
        int var6 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var6;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lji;)V")
    public class354(class622 arg0) {
        this.field4558 = arg0;
        if (this.field4558.field8640 && this.field4558.field8650) {
            this.field4563 = this.field4559 = new class701(this.field4558);
            if (this.field4558.field8561 > 1 && this.field4558.field8707 && this.field4558.field8689) {
                this.field4563 = this.field4543 = new class701(this.field4558);
                return;
            }
        }
    }
}
