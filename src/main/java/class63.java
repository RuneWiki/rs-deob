import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class63 extends class539 {

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "[B")
    public byte[] field833;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "[I")
    private int[] field840;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "[B")
    public byte[] field836;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "[B")
    public byte[] field847;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "[S")
    public short[] field843;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "[Ljk;")
    public class579[] field839;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "[Lqr;")
    public class59[] field832;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "[I")
    public static int[] field846 = new int[3];

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "Lat;")
    public static class344 field837;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
    public static final void method513(int arg0) {
        field841++;
        class473 var1 = (class473) class364.field5199.method1270((byte) -25);
        if (arg0 != -1191) {
            method515(null, -94, -13, null);
        }
        while (var1 != null) {
            class641 var2 = var1.field6603;
            if (var2.field9081 < class239.field3440) {
                var1.method2971(arg0 + 1192);
                var2.method3570(arg0 ^ 0x33BB0F10);
            } else if (var2.field9093 <= class239.field3440) {
                if (var2.field9080 > 0) {
                    class178 var3 = (class178) class323.field4762.method2061(-17305, (long) (var2.field9080 - 1));
                    if (var3 != null) {
                        class225 var4 = var3.field2634;
                        if (var4.field509 >= 0 && var4.field509 < (class86.field1185 * 512) && var4.field514 >= 0 && var4.field514 < (class526.field7212 * 512)) {
                            var2.method3576(var4.field509, var4.field514, class203.method1355(var4.field514, var4.field509, arg0 ^ 0xFFFFFB5D, var2.field520) - var2.field9117, -2, class239.field3440);
                        }
                    }
                }
                if (var2.field9080 < 0) {
                    int var5 = -var2.field9080 - 1;
                    class286 var6;
                    if (class27.field343 == var5) {
                        var6 = class253.field3576;
                    } else {
                        var6 = class495.field6821[var5];
                    }
                    if (var6 != null && var6.field509 >= 0 && class86.field1185 * 512 > var6.field509 && var6.field514 >= 0 && var6.field514 < class526.field7212 * 512) {
                        var2.method3576(var6.field509, var6.field514, class203.method1355(var6.field514, var6.field509, 4, var2.field520) - var2.field9117, -22, class239.field3440);
                    }
                }
                var2.method3575(class371.field5290, (byte) 118);
                class580.method3224(var2, true);
            }
            var1 = (class473) class364.field5199.method1282(0);
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)V")
    public static void method514(boolean arg0) {
        if (arg0) {
            method514(true);
        }
        field837 = null;
        field846 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ltt;IILjr;)V")
    public static final void method515(class79 arg0, int arg1, int arg2, class96 arg3) {
        field845++;
        class200 var4 = new class200();
        var4.field2956 = arg3.method718(-74);
        var4.field2948 = arg3.method714(false);
        var4.field2955 = new byte[var4.field2956][][];
        var4.field2945 = new int[var4.field2956];
        var4.field2946 = new int[var4.field2956];
        var4.field2949 = new class260[var4.field2956];
        var4.field2952 = new class260[var4.field2956];
        var4.field2950 = new int[var4.field2956];
        if (arg2 <= 34) {
            method516((byte) -40);
        }
        for (int var5 = 0; var5 < var4.field2956; var5++) {
            try {
                int var6 = arg3.method718(93);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg3.method739(-105);
                    String var18 = arg3.method739(-104);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method714(false);
                    }
                    var4.field2950[var5] = var6;
                    var4.field2946[var5] = var19;
                    var4.field2949[var5] = arg0.method614((byte) -123, var18, class514.method2856(var17, 0));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg3.method739(-117);
                    String var8 = arg3.method739(-99);
                    int var9 = arg3.method718(101);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg3.method739(5);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method714(false);
                            var12[var13] = new byte[var14];
                            arg3.method719(var12[var13], var14, -7861, 0);
                        }
                    }
                    var4.field2950[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class514.method2856(var10[var16], 0);
                    }
                    var4.field2952[var5] = arg0.method622(var15, var8, (byte) -96, class514.method2856(var7, 0));
                    var4.field2955[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2945[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2945[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2945[var5] = -3;
            } catch (Exception var23) {
                var4.field2945[var5] = -4;
            } catch (Throwable var24) {
                var4.field2945[var5] = -5;
            }
        }
        class81.field1135.method1273(var4, (byte) 122);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
    public static final void method516(byte arg0) {
        field842++;
        for (int var1 = 0; var1 < class357.field5108; var1++) {
            class629 var2 = class604.field8394[var1];
            boolean var3 = false;
            if (var2.field8787 == null) {
                var2.field8779--;
                if (var2.field8779 >= (var2.method3496((byte) 2) ? -1500 : -10)) {
                    if (var2.field8775 == 1 && var2.field8783 == null) {
                        var2.field8783 = class90.method671(class417.field5882, var2.field8780, 0);
                        if (var2.field8783 == null) {
                            continue;
                        }
                        var2.field8779 += var2.field8783.method670();
                    } else if (var2.method3496((byte) 2) && (var2.field8784 == null || var2.field8776 == null)) {
                        if (var2.field8784 == null) {
                            var2.field8784 = class111.method834(class465.field6542, var2.field8780);
                        }
                        if (var2.field8784 == null) {
                            continue;
                        }
                        if (var2.field8776 == null) {
                            var2.field8776 = var2.field8784.method830(new int[] { 22050 });
                            if (var2.field8776 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field8779 < 0) {
                        int var11;
                        if (var2.field8777 == 0) {
                            var11 = var2.field8774 * (var2.field8775 == 3 ? class274.field3872.field909 : class274.field3872.field896) >> 8;
                        } else {
                            int var4 = var2.field8777 >> 24 & 0x3;
                            if (class253.field3576.field520 == var4) {
                                int var5 = (var2.field8777 & 0xFF) << 9;
                                int var6 = (var2.field8777 & 0xFF949C) >> 16;
                                int var7 = (var6 << 9) + 256 - class253.field3576.field509;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = var2.field8777 >> 8 & 0xFF;
                                int var9 = (var8 << 9) + 256 - class253.field3576.field514;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 512;
                                if (var10 > var5) {
                                    var2.field8779 = -99999;
                                    continue;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var11 = (var5 - var10) * class274.field3872.field905 * var2.field8774 / var5 >> 8;
                            } else {
                                var11 = 0;
                            }
                        }
                        if (var11 > 0) {
                            class59 var12 = null;
                            if (var2.field8775 == 1) {
                                var12 = var2.field8783.method672().method504(class182.field2682);
                            } else if (var2.method3496((byte) 2)) {
                                var12 = var2.field8776;
                            }
                            class559 var13 = var2.field8787 = class559.method3078(var12, 100, var11);
                            var13.method3100(var2.field8778 - 1);
                            class135.field1907.method3310(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field8787.method2972(1)) {
                var3 = true;
            }
            if (var3) {
                class357.field5108--;
                for (int var14 = var1; var14 < class357.field5108; var14++) {
                    class604.field8394[var14] = class604.field8394[var14 + 1];
                }
                var1--;
            }
        }
        if (arg0 >= -23) {
            method519(61, 106, -49, -105, 10);
        }
        if (class267.field3792 && !class218.method1411((byte) 1)) {
            if (class274.field3872.field906 != 0 && class623.field8670 != -1) {
                class103.method791(false, class623.field8670, 0, class74.field1027, class274.field3872.field906, false);
            }
            class267.field3792 = false;
        } else if (class274.field3872.field906 != 0 && class623.field8670 != -1 && !class218.method1411((byte) 1)) {
            class1.method5(1, class52.field751);
            class379.field5340++;
            class288.field4014.method741(class623.field8670, (byte) 27);
            class623.field8670 = -1;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "([IZLme;[B)Z")
    public final boolean method517(int[] arg0, boolean arg1, class177 arg2, byte[] arg3) {
        field835++;
        boolean var5 = true;
        int var6 = 0;
        class59 var7 = null;
        if (arg1) {
            method516((byte) -118);
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field840[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1205(arg0, (byte) -87, var9 >> 2);
                        } else {
                            var7 = arg2.method1204(var9 >> 2, arg0, 0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field832[var8] = var7;
                        this.field840[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
    public final void method518(byte arg0) {
        this.field840 = null;
        if (arg0 <= 50) {
            method516((byte) -12);
        }
        field834++;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class326.field4815 != null) {
            class326.field4815[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class144.field2144 != null) {
            class144.field2144[arg0][arg1] = (short) arg3;
        }
        if (class198.field2927 != null) {
            class198.field2927[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
    public class63() {
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([B)V")
    public class63(byte[] arg0) {
        this.field833 = new byte[128];
        this.field840 = new int[128];
        this.field836 = new byte[128];
        this.field847 = new byte[128];
        this.field843 = new short[128];
        this.field839 = new class579[128];
        this.field832 = new class59[128];
        class96 var2 = new class96(arg0);
        int var3;
        for (var3 = 0; var2.field1316[var2.field1301 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method748(-813976688);
        }
        var2.field1301++;
        var3++;
        int var6 = var2.field1301;
        var2.field1301 += var3;
        int var7;
        for (var7 = 0; var2.field1316[var2.field1301 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method748(-813976688);
        }
        var7++;
        var2.field1301++;
        int var10 = var2.field1301;
        var2.field1301 += var7;
        int var11;
        for (var11 = 0; var2.field1316[var2.field1301 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method748(-813976688);
        }
        var11++;
        var2.field1301++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method718(-68);
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
        class579[] var18 = new class579[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class579 var102 = var18[var19] = new class579();
            int var103 = var2.method718(98);
            if (var103 > 0) {
                var102.field7777 = new byte[var103 * 2];
            }
            int var104 = var2.method718(110);
            if (var104 > 0) {
                var102.field7770 = new byte[var104 * 2 + 2];
                var102.field7770[1] = 64;
            }
        }
        int var20 = var2.method718(76);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method718(127);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field1316[var2.field1301 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method748(-813976688);
        }
        var2.field1301++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method718(125);
            this.field843[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method718(101);
            this.field843[var30] = (short) (this.field843[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method728((byte) -114);
            }
            this.field843[var34] = (short) (this.field843[var34] + class249.method1537(32768, var33 - 1 << 14));
            var31--;
            this.field840[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field840[var38] != 0) {
                if (var36 == 0) {
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var2.field1316[var6++] - 1;
                }
                var36--;
                this.field833[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field840[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                    var41 = var2.field1316[var10++] + 16 << 2;
                }
                var39--;
                this.field836[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class579 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field840[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                this.field839[var46] = var45;
                var43--;
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
                if (this.field840[var50] > 0) {
                    var49 = var2.method718(-126) + 1;
                }
            }
            this.field847[var50] = (byte) var49;
            var47--;
        }
        this.field844 = var2.method718(120) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class579 var99 = var18[var51];
            if (var99.field7777 != null) {
                for (int var100 = 1; var100 < var99.field7777.length; var100 += 2) {
                    var99.field7777[var100] = var2.method748(-813976688);
                }
            }
            if (var99.field7770 != null) {
                for (int var101 = 3; var101 < var99.field7770.length - 2; var101 += 2) {
                    var99.field7770[var101] = var2.method748(-813976688);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method748(-813976688);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method748(-813976688);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class579 var96 = var18[var54];
            if (var96.field7770 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field7770.length; var98 += 2) {
                    var97 = var2.method718(-124) + var97 + 1;
                    var96.field7770[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class579 var93 = var18[var55];
            if (var93.field7777 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field7777.length; var95 += 2) {
                    var94 = var94 + var2.method718(118) + 1;
                    var93.field7777[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method718(-104);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = (var56 + var2.method718(77)) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field847[var60] = (byte) (this.field847[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class298.method1858(var64 - var58, var66, (byte) -94);
                    var66 += var65 - var59;
                    this.field847[var67] = (byte) (this.field847[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field847[var63] = (byte) (this.field847[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method718(-68);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method718(-100) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field836[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field836[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class298.method1858(var78 - var71, var80, (byte) -94);
                    int var83 = (this.field836[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field836[var81] = (byte) var83;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field836[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field836[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field7767 = var2.method718(103);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class579 var92 = var18[var86];
            if (var92.field7777 != null) {
                var92.field7775 = var2.method718(-109);
            }
            if (var92.field7770 != null) {
                var92.field7771 = var2.method718(89);
            }
            if (var92.field7767 > 0) {
                var92.field7776 = var2.method718(123);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field7769 = var2.method718(126);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class579 var91 = var18[var88];
            if (var91.field7769 > 0) {
                var91.field7768 = var2.method718(-124);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class579 var90 = var18[var89];
            if (var90.field7768 > 0) {
                var90.field7773 = var2.method718(121);
            }
        }
    }
}
