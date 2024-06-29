import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class684 {

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "[I")
    private int[] field9709;

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "[I")
    private int[] field9714;

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "Lgr;")
    public static class530 field9718 = new class530(35, 8);

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "Lwk;")
    public static class431 field9720 = new class431();

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "Llc;")
    public static class435 field9721 = new class435(64, 3);

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "Lufa;")
    public static class740 field9722 = new class740(7, 3);

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    private int field9707;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
    private int field9711;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
    private int field9713;

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
    private int field9716;

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)I", line = 5)
    public final int method3879(boolean arg0) {
        field9710++;
        if (!arg0) {
            this.field9711 = 8;
        }
        if (this.field9707 == 0) {
            this.method3880((byte) -72);
            this.field9707 = 256;
        }
        return this.field9709[--this.field9707];
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V", line = 22)
    private final void method3880(byte arg0) {
        field9712++;
        int var2 = -71 % ((53 - arg0) / 44);
        this.field9711 += ++this.field9716;
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field9714[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field9713 ^= this.field9713 << 13;
                } else {
                    this.field9713 ^= this.field9713 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field9713 ^= this.field9713 << 2;
            } else {
                this.field9713 ^= this.field9713 >>> 16;
            }
            this.field9713 += this.field9714[var3 + 128 & 0xFF];
            int var5;
            this.field9714[var3] = var5 = this.field9714[class368.method2314(255, var4 >> 2)] + this.field9713 + this.field9711;
            this.field9709[var3] = this.field9711 = var4 + this.field9714[class368.method2314(255, var5 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILha;IZ)V", line = 68)
    public static final void method3881(int arg0, class543 arg1, int arg2, boolean arg3) {
        field9717++;
        if (arg2 < 0 || arg0 < 0 || class654.field9364 == 0 || class487.field7022 == 0) {
            return;
        }
        int var4;
        int var5;
        int var6;
        int var7;
        class121 var8;
        int var9;
        int var10;
        if (class416.field5919) {
            class550.method3312(-118, false);
            var8 = arg1.method304();
            int[] var11 = arg1.method247();
            var5 = var11[1];
            var4 = var11[3];
            var6 = var11[2];
            var7 = var11[0];
            var9 = arg2 + class294.method1843(false, false);
            var10 = class326.method2016(false, (byte) -24) + arg0;
        } else {
            arg1.method398(class551.field8041, class456.field6493, class654.field9364, class487.field7022);
            var4 = class487.field7022;
            var5 = class456.field6493;
            var6 = class654.field9364;
            var7 = class551.field8041;
            arg1.method297(class510.field7391, class756.field10525, class654.field9364, class487.field7022);
            var8 = arg1.method348();
            var8.method854(class166.field2357, class240.field3554, class542.field7858, class31.field291, class389.field5610, class30.field278);
            arg1.method364(var8);
            var9 = arg2;
            var10 = arg0;
        }
        if (var4 == 0) {
            var4 = 1;
        }
        if (var6 == 0) {
            var6 = 1;
        }
        class451.method2763(-85, arg3);
        if (class491.field7079 != null && (!class549.field7997 || (class538.field7820 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg1.method387();
            int var15 = arg1.method227();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class100.field1447) {
                var19 = var17 = (var10 - var5) * class680.field9660 / var4;
                var16 = var18 = (var9 - var7) * class680.field9660 / var6;
            } else {
                var16 = (var9 - var7) * var14 / var6;
                var17 = (var10 - var5) * var15 / var4;
                var18 = (var9 - var7) * var15 / var6;
                var19 = (var10 - var5) * var14 / var4;
            }
            int[] var20 = new int[] { var16, var19, var14 };
            int[] var21 = new int[] { var18, var17, var15 };
            var8.method846(var20);
            var8.method846(var21);
            float var22 = class342.method2100((float) var21[0], (float) var20[2], (float) var21[1], 4, (float) var20[1], 69, (float) var20[0], (float) var21[2]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class108.field1536.method2053(true) - 1 << 8) >> 9;
                var13 = var26 + (class108.field1536.method2053(arg3) - 1 << 8) >> 9;
                byte var27 = class108.field1536.field3920;
                if (var27 < 3 && (class160.field2297[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class549.field7997 && (class538.field7820 & 0x40) != 0) {
                    class146 var28 = class590.method3467(1, class231.field3475, class250.field3640);
                    if (var28 == null) {
                        class61.method571(!arg3);
                    } else {
                        class145.method1016(class297.field4060, true, var13, true, " ->", -128, var12, (long) (var12 << 0 | var13), class243.field3582, 0L, 47, -1, false);
                    }
                } else {
                    if (class348.field5156) {
                        class145.method1016(class608.field8647.method3543(-24350, class45.field748), true, var13, true, "", -123, var12, (long) (var13 | var12 << 0), -1, 0L, 18, -1, false);
                    }
                    class165.field2342++;
                    class145.method1016(class527.field7652, true, var13, true, "", -118, var12, (long) (var13 | var12 << 0), class121.field1646, 0L, 5, -1, false);
                }
            }
        }
        if (class416.field5919) {
            class142.method1000(-102);
        }
        for (int var29 = 0; var29 < (class416.field5919 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class678 var31 = var30 ? class465.field6628 : class639.field9052;
            int var32 = arg2;
            int var33 = arg0;
            if (class416.field5919) {
                class550.method3312(-103, var30);
                var32 = arg2 + class294.method1843(false, var30);
                var33 = arg0 + class326.method2016(var30, (byte) -24);
            }
            class215 var34 = var31.field9626;
            for (class603 var35 = (class603) var34.method1527(99); var35 != null; var35 = (class603) var34.method1523(true)) {
                if ((class370.field5399 || class108.field1536.field3920 == var35.field8541.field3920) && var35.method3509((byte) -66, var32, arg1, var33)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if (var35.field8541 instanceof class638) {
                        var38 = ((class638) var35.field8541).field9035;
                        var39 = ((class638) var35.field8541).field9038;
                    } else {
                        var39 = var35.field8541.field3923 >> 9;
                        var38 = var35.field8541.field3916 >> 9;
                    }
                    if (var35.field8541 instanceof class639) {
                        class639 var40 = (class639) var35.field8541;
                        int var41 = var40.method2053(true);
                        if ((var41 & 0x1) == 0 && (var40.field3923 & 0x1FF) == 0 && (var40.field3916 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field3923 & 0x1FF) == 256 && (var40.field3916 & 0x1FF) == 256) {
                            int var42 = var40.field3923 - (var40.method2053(true) - 1 << 8);
                            int var43 = var40.field3916 - (var40.method2053(arg3) - 1 << 8);
                            for (int var44 = 0; var44 < class619.field8816; var44++) {
                                class63 var51 = (class63) class389.field5608.method4020((long) class545.field7927[var44], (byte) -86);
                                if (var51 != null) {
                                    class571 var52 = var51.field1004;
                                    if (class703.field9918 != var52.field4627 && var52.field4612) {
                                        int var53 = var52.field3923 - (var52.field8235.field7512 - 1 << 8);
                                        int var54 = var52.field3916 - (var52.field8235.field7512 - 1 << 8);
                                        if (var42 <= var53 && var52.field8235.field7512 <= var40.method2053(true) - (var53 - var42 >> 9) && var54 >= var43 && var52.field8235.field7512 <= var40.method2053(arg3) - (var54 - var43 >> 9)) {
                                            class385.method2374(class108.field1536.field3920 != var35.field8541.field3920, -1, var52);
                                            var52.field4627 = class703.field9918;
                                        }
                                    }
                                }
                            }
                            int var45 = class468.field6665;
                            int[] var46 = class38.field500;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class639 var48 = class536.field7796[var46[var47]];
                                if (var48 != null && class703.field9918 != var48.field4627 && var40 != var48 && var48.field4612) {
                                    int var49 = var48.field3923 - (var48.method2053(arg3) - 1 << 8);
                                    int var50 = var48.field3916 - (var48.method2053(arg3) - 1 << 8);
                                    if (var42 <= var49 && var48.method2053(true) <= var40.method2053(arg3) - (var49 - var42 >> 9) && var43 <= var50 && var48.method2053(arg3) <= (var40.method2053(true) - (var50 - var43 >> 9))) {
                                        class457.method2786((byte) 118, var48, class108.field1536.field3920 != var35.field8541.field3920);
                                        var48.field4627 = class703.field9918;
                                    }
                                }
                            }
                        }
                        if (class703.field9918 == var40.field4627) {
                            continue;
                        }
                        class457.method2786((byte) -118, var40, class108.field1536.field3920 != var35.field8541.field3920);
                        var40.field4627 = class703.field9918;
                    }
                    if (var35.field8541 instanceof class571) {
                        class571 var55 = (class571) var35.field8541;
                        if (var55.field8235 != null) {
                            if ((var55.field8235.field7512 & 0x1) == 0 && (var55.field3923 & 0x1FF) == 0 && (var55.field3916 & 0x1FF) == 0 || (var55.field8235.field7512 & 0x1) == 1 && (var55.field3923 & 0x1FF) == 256 && (var55.field3916 & 0x1FF) == 256) {
                                int var56 = var55.field3923 - (var55.field8235.field7512 - 1 << 8);
                                int var57 = var55.field3916 - (var55.field8235.field7512 - 1 << 8);
                                for (int var58 = 0; var58 < class619.field8816; var58++) {
                                    class63 var65 = (class63) class389.field5608.method4020((long) class545.field7927[var58], (byte) -93);
                                    if (var65 != null) {
                                        class571 var66 = var65.field1004;
                                        if (class703.field9918 != var66.field4627 && var55 != var66 && var66.field4612) {
                                            int var67 = var66.field3923 - (var66.field8235.field7512 - 1 << 8);
                                            int var68 = var66.field3916 - (var66.field8235.field7512 - 1 << 8);
                                            if (var67 >= var56 && var55.field8235.field7512 - (var67 - var56 >> 9) >= var66.field8235.field7512 && var57 <= var68 && var66.field8235.field7512 <= var55.field8235.field7512 - (var68 - var57 >> 9)) {
                                                class385.method2374(class108.field1536.field3920 != var35.field8541.field3920, -1, var66);
                                                var66.field4627 = class703.field9918;
                                            }
                                        }
                                    }
                                }
                                int var59 = class468.field6665;
                                int[] var60 = class38.field500;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class639 var62 = class536.field7796[var60[var61]];
                                    if (var62 != null && class703.field9918 != var62.field4627 && var62.field4612) {
                                        int var63 = var62.field3923 - (var62.method2053(true) - 1 << 8);
                                        int var64 = var62.field3916 - (var62.method2053(true) - 1 << 8);
                                        if (var56 <= var63 && var62.method2053(true) <= (var55.field8235.field7512 - (var63 - var56 >> 9)) && var64 >= var57 && var62.method2053(true) <= var55.field8235.field7512 - (var64 - var57 >> 9)) {
                                            class457.method2786((byte) 109, var62, class108.field1536.field3920 != var35.field8541.field3920);
                                            var62.field4627 = class703.field9918;
                                        }
                                    }
                                }
                            }
                            if (class703.field9918 == var55.field4627) {
                                continue;
                            }
                            class385.method2374(class108.field1536.field3920 != var35.field8541.field3920, -1, var55);
                            var55.field4627 = class703.field9918;
                        }
                    }
                    if (var35.field8541 instanceof class227) {
                        int var69 = var39 + class41.field693;
                        int var70 = class71.field1085 + var38;
                        class340 var71 = (class340) class591.field8409.method4020((long) (var35.field8541.field3920 << 28 | var70 << 14 | var69), (byte) -106);
                        if (var71 != null) {
                            int var72 = 0;
                            class428 var73 = (class428) var71.field4685.method3564((byte) -95);
                            while (var73 != null) {
                                class424 var74 = class425.field6147.method4144(var73.field6169, 126);
                                if (class549.field7997 && class108.field1536.field3920 == var35.field8541.field3920) {
                                    class167 var75 = class76.field1107 == -1 ? null : class332.field4513.method1901(-4115, class76.field1107);
                                    if ((class538.field7820 & 0x1) != 0 && (var75 == null || var74.method2634(var75.field2364, class76.field1107, !arg3) != var75.field2364)) {
                                        class592.field8413++;
                                        class145.method1016(class297.field4060, true, var38, false, class377.field5459 + " -> <col=ff9040>" + var74.field6070, -123, var39, (long) var72, class243.field3582, (long) var73.field6169, 57, -1, false);
                                    }
                                }
                                if (class108.field1536.field3920 == var35.field8541.field3920) {
                                    String[] var76 = var74.field6139;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            int var79 = class474.field6744;
                                            if (var77 == 0) {
                                                var78 = 51;
                                            }
                                            if (var77 == 1) {
                                                var78 = 11;
                                            }
                                            if (var77 == 2) {
                                                var78 = 2;
                                            }
                                            if (var77 == 3) {
                                                var78 = 60;
                                            }
                                            if (var74.field6071 == var77) {
                                                var79 = var74.field6103;
                                            }
                                            if (var77 == 4) {
                                                var78 = 48;
                                            }
                                            if (var74.field6144 == var77) {
                                                var79 = var74.field6125;
                                            }
                                            class292.field4018++;
                                            class145.method1016(var76[var77], true, var38, false, "<col=ff9040>" + var74.field6070, -122, var39, (long) var72, var79, (long) var73.field6169, var78, -1, false);
                                        }
                                    }
                                }
                                class145.method1016(class608.field8642.method3543(-24350, class45.field748), true, var38, false, "<col=ff9040>" + var74.field6070, -120, var39, (long) var72, class730.field10241, (long) var73.field6169, 1011, -1, class108.field1536.field3920 != var35.field8541.field3920);
                                class282.field3950++;
                                var73 = (class428) var71.field4685.method3562(0);
                                var72++;
                            }
                        }
                    }
                    if (var35.field8541 instanceof class324) {
                        class324 var80 = (class324) var35.field8541;
                        class482 var81 = class375.field5421.method2680(var80.method601((byte) 93), (byte) 91);
                        if (var81.field6900 != null) {
                            var81 = var81.method2952(-1, class226.field3372);
                        }
                        if (var81 != null) {
                            if (class549.field7997 && class108.field1536.field3920 == var35.field8541.field3920) {
                                class167 var82 = class76.field1107 == -1 ? null : class332.field4513.method1901(-4115, class76.field1107);
                                if ((class538.field7820 & 0x4) != 0 && (var82 == null || var81.method2948(105, var82.field2364, class76.field1107) != var82.field2364)) {
                                    class703.field9916++;
                                    class145.method1016(class297.field4060, true, var38, false, class377.field5459 + " -> <col=00ffff>" + var81.field6969, -124, var39, (long) var80.hashCode(), class243.field3582, class235.method1640(var39, var80, var38, 2026763566), 8, -1, false);
                                }
                            }
                            if (class108.field1536.field3920 == var35.field8541.field3920) {
                                String[] var83 = var81.field6940;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            if (var84 == 0) {
                                                var85 = 6;
                                            }
                                            int var86 = class474.field6744;
                                            if (var84 == 1) {
                                                var85 = 15;
                                            }
                                            if (var84 == 2) {
                                                var85 = 30;
                                            }
                                            if (var84 == 3) {
                                                var85 = 44;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1012;
                                            }
                                            if (var81.field6947 == var84) {
                                                var86 = var81.field6973;
                                            }
                                            if (var81.field6907 == var84) {
                                                var86 = var81.field6938;
                                            }
                                            class316.field4265++;
                                            class145.method1016(var83[var84], true, var38, false, "<col=00ffff>" + var81.field6969, -127, var39, (long) var80.hashCode(), var86, class235.method1640(var39, var80, var38, 2026763566), var85, -1, false);
                                        }
                                    }
                                }
                                class614.field8764++;
                                class145.method1016(class608.field8642.method3543(-24350, class45.field748), true, var38, false, "<col=00ffff>" + var81.field6969, -125, var39, (long) var80.hashCode(), class730.field10241, (long) var81.field6965, 1009, -1, class108.field1536.field3920 != var35.field8541.field3920);
                            }
                        }
                    }
                }
            }
            if (class416.field5919) {
                class142.method1000(21);
            }
        }
        class451.method2763(-98, false);
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(B)I", line = 608)
    public final int method3882(byte arg0) {
        if (this.field9707 == 0) {
            this.method3880((byte) 115);
            this.field9707 = 256;
        }
        if (arg0 >= -118) {
            method3881(27, null, 32, true);
        }
        field9705++;
        return this.field9709[this.field9707 - 1];
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(BIIII)V", line = 626)
    public static final void method3883(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 125 / ((79 - arg0) / 45);
        field9715++;
        if (arg3 <= arg4) {
            class518.method3153(arg4, arg3, class193.field2839[arg1], -7, arg2);
        } else {
            class518.method3153(arg3, arg4, class193.field2839[arg1], -7, arg2);
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIBIIII)V", line = 644)
    public static final void method3884(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field9706++;
        int var9 = -80 / ((15 - arg4) / 51);
        class160.field2308[class445.field6359++] = new class151(arg7, arg2, arg5, arg6, arg6, arg5, arg1, arg3, arg3, arg1, arg0, arg0, arg8, arg8);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V", line = 656)
    private final void method3885(int arg0) {
        field9719++;
        if (arg0 != 2) {
            method3886(75);
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field9709[var11 + 5] + var4;
            int var38 = this.field9709[var11 + 1] + var8;
            int var39 = this.field9709[var11 + 6] + var3;
            int var40 = this.field9709[var11 + 4] + var5;
            int var41 = this.field9709[var11 + 2] + var7;
            int var42 = this.field9709[var11 + 7] + var2;
            int var43 = this.field9709[var11 + 3] + var6;
            int var44 = this.field9709[var11] + var9;
            int var45 = var44 ^ var38 << 11;
            int var46 = var43 + var45;
            int var47 = var38 + var41;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var41 + var46;
            int var50 = var40 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var37 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            int var55 = var6 + var39;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var42;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field9714[var11] = var9;
            this.field9714[var11 + 1] = var8;
            this.field9714[var11 + 2] = var7;
            this.field9714[var11 + 3] = var6;
            this.field9714[var11 + 4] = var5;
            this.field9714[var11 + 5] = var4;
            this.field9714[var11 + 6] = var3;
            this.field9714[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field9714[var12] + var9;
            int var14 = this.field9714[var12 + 2] + var7;
            int var15 = this.field9714[var12 + 3] + var6;
            int var16 = this.field9714[var12 + 6] + var3;
            int var17 = this.field9714[var12 + 4] + var5;
            int var18 = this.field9714[var12 + 7] + var2;
            int var19 = this.field9714[var12 + 1] + var8;
            int var20 = this.field9714[var12 + 5] + var4;
            int var21 = var13 ^ var19 << 11;
            int var22 = var15 + var21;
            int var23 = var14 + var19;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var14 + var22;
            int var26 = var17 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var20 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var16;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var18;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field9714[var12] = var9;
            this.field9714[var12 + 1] = var8;
            this.field9714[var12 + 2] = var7;
            this.field9714[var12 + 3] = var6;
            this.field9714[var12 + 4] = var5;
            this.field9714[var12 + 5] = var4;
            this.field9714[var12 + 6] = var3;
            this.field9714[var12 + 7] = var2;
        }
        this.method3880((byte) -47);
        this.field9707 = 256;
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)V", line = 805)
    public static void method3886(int arg0) {
        field9722 = null;
        field9720 = null;
        field9721 = null;
        field9718 = null;
        if (arg0 != -7132) {
            field9721 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILsl;)Lih;", line = 820)
    public static final class739 method3887(int arg0, class479 arg1) {
        arg1.method2886(true);
        if (arg0 != 21347) {
            field9718 = null;
        }
        field9708++;
        int var2 = arg1.method2886(true);
        class739 var3 = class159.method1135((byte) -29, var2);
        var3.field10318 = arg1.method2886(true);
        int var4 = arg1.method2886(true);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method2886(true);
            var3.method112(arg1, var6, (byte) 1);
        }
        var3.method628(63);
        return var3;
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "()V", line = 857)
    private class684() {
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "([I)V", line = 859)
    public class684(int[] arg0) {
        this.field9709 = new int[256];
        this.field9714 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field9709[var2] = arg0[var2];
        }
        this.method3885(2);
    }
}
