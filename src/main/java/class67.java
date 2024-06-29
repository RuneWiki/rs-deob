import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class67 extends class35 {

    @OriginalMember(owner = "client!gh", name = "Ac", descriptor = "I")
    public int field1290 = -1;

    @OriginalMember(owner = "client!gh", name = "sc", descriptor = "I")
    public int field1282 = 0;

    @OriginalMember(owner = "client!gh", name = "zc", descriptor = "S")
    private short field1289 = 0;

    @OriginalMember(owner = "client!gh", name = "pc", descriptor = "I")
    public int field1279 = 0;

    @OriginalMember(owner = "client!gh", name = "Cc", descriptor = "S")
    private short field1292 = 0;

    @OriginalMember(owner = "client!gh", name = "Bc", descriptor = "Z")
    public boolean field1291 = false;

    @OriginalMember(owner = "client!gh", name = "tc", descriptor = "I")
    public int field1283 = -1;

    @OriginalMember(owner = "client!gh", name = "Ec", descriptor = "I")
    public int field1294 = 0;

    @OriginalMember(owner = "client!gh", name = "vc", descriptor = "I")
    public int field1285 = 0;

    @OriginalMember(owner = "client!gh", name = "Ic", descriptor = "I")
    public int field1298 = 0;

    @OriginalMember(owner = "client!gh", name = "wc", descriptor = "Ltg;")
    public static class184 field1286 = class135.method812("W-=hlen Sie eine Welt", 3);

    @OriginalMember(owner = "client!gh", name = "oc", descriptor = "Lnd;")
    public static class127 field1278 = new class127(200);

    @OriginalMember(owner = "client!gh", name = "Lc", descriptor = "Ltg;")
    public static class184 field1301 = class135.method812("Ladevorgang )2 bitte warten Sie)3", 3);

    @OriginalMember(owner = "client!gh", name = "kc", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!gh", name = "mc", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!gh", name = "nc", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!gh", name = "qc", descriptor = "I")
    public int field1280;

    @OriginalMember(owner = "client!gh", name = "rc", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!gh", name = "uc", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!gh", name = "xc", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!gh", name = "yc", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!gh", name = "Dc", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!gh", name = "Gc", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!gh", name = "Hc", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!gh", name = "Kc", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!gh", name = "Mc", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!gh", name = "Nc", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!gh", name = "Fc", descriptor = "Loh;")
    public class140 field1295;

    @OriginalMember(owner = "client!gh", name = "Jc", descriptor = "Ltg;")
    public class184 field1299;

    @OriginalMember(owner = "client!gh", name = "lc", descriptor = "Lwc;")
    public class207 field1275;

    @OriginalMember(owner = "client!gh", name = "Oc", descriptor = "[I")
    public static int[] field1304;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)Z")
    public final boolean method213(int arg0) {
        ++field1287;
        if (this.field1275 == null) {
            return false;
        } else {
            if (arg0 != -30610) {
                this.method213(63);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "(I)V")
    public static void method392(int arg0) {
        field1278 = null;
        if (arg0 >= -58) {
            field1286 = null;
        }
        field1304 = null;
        field1301 = null;
        field1286 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lka;I)Lba;")
    public static final class12 method393(class97 arg0, int arg1) {
        ++field1284;
        int var2 = arg0.method588((byte) -51);
        int var3 = arg0.method588((byte) -97);
        Class var4 = class87.method516(var3, 14204);
        try {
            class12 var5 = (class12) var4.newInstance();
            if (arg1 != 0) {
                return null;
            } else {
                if (var5 != null) {
                    var5.field226 = var2;
                    var5.field221 = arg0.method588((byte) -37);
                    int var6 = arg0.method588((byte) -81);
                    for (int var7 = 0; ~var7 > ~var6; ++var7) {
                        int var8 = arg0.method588((byte) -123);
                        var5.method59(arg0, var8, false);
                    }
                }
                var5.method78((byte) 57);
                return var5;
            }
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1288;
        if (this.field1275 != null) {
            class188 var11 = super.field612 != -1 && ~super.field630 == -1 ? class83.method465(super.field612, -1) : null;
            class188 var12 = super.field655 == -1 || this.field1291 || ~super.field655 == ~super.field596 && var11 != null ? null : class83.method465(super.field655, -1);
            class140 var13 = this.field1275.method1314(5, var11, super.field643, super.field600, var12);
            if (var13 != null) {
                var13.method870();
                super.field949 = var13.field949;
                if (~this.field1289 != -1 && ~this.field1292 != -1) {
                    int var14 = class23.field422[arg0];
                    int var15 = class23.field434[arg0];
                    short var16 = this.field1289;
                    short var17 = this.field1292;
                    int var18 = -var17 / 2;
                    int var19 = -var16 / 2;
                    int var20 = var15 * var18 + -(var14 * var19) >> 16;
                    int var21 = var16 / 2;
                    int var22 = var14 * var18 + var15 * var19 >> 16;
                    int var23 = class115.method706(super.field635 - -var22, class47.field892, 127, super.field614 + var20);
                    int var24 = -var17 / 2;
                    int var25 = var14 * var24 + var15 * var21 >> 16;
                    int var26 = var15 * var24 - var14 * var21 >> 16;
                    int var27 = class115.method706(super.field635 + var25, class47.field892, 127, super.field614 + var26);
                    int var28 = -var16 / 2;
                    int var29 = var17 / 2;
                    int var30 = var17 / 2;
                    int var31 = var16 / 2;
                    int var32 = var15 * var29 + -(var14 * var28) >> 16;
                    int var33 = var14 * var30 + var15 * var31 >> 16;
                    int var34 = var14 * var29 - -(var15 * var28) >> 16;
                    int var35 = class115.method706(super.field635 - -var34, class47.field892, 127, super.field614 + var32);
                    int var36 = var15 * var30 + -(var14 * var31) >> 16;
                    int var37 = class115.method706(super.field635 + var33, class47.field892, 127, super.field614 + var36);
                    int var38 = ~var37 < ~var27 ? var27 : var37;
                    int var39 = var27 <= var23 ? var27 : var23;
                    int var40 = ~var37 < ~var35 ? var35 : var37;
                    int var41 = 2047 & (int) (Math.atan2((double) (-var40 + var39), (double) var17) * 320.0D);
                    int var42 = var35 <= var23 ? var35 : var23;
                    var13.method862(var41);
                    int var43 = (var39 + var40 - (-var38 - var42)) / 4;
                    int var44 = 2047 & (int) (320.0D * Math.atan2((double) (-var38 + var42), (double) var16));
                    var13.method871(var44);
                    var13.method869(0, var43 - super.field599, 0);
                }
                class140 var45 = null;
                class140 var46 = null;
                if (!this.field1291 && super.field619 != -1 && super.field660 != -1) {
                    var46 = class74.method438((byte) 82, super.field619).method304(super.field660, 217);
                    if (var46 != null) {
                        var46.method869(0, -super.field638, 0);
                    }
                }
                if (!this.field1291 && this.field1295 != null) {
                    if (this.field1294 <= class161.field2903) {
                        this.field1295 = null;
                    }
                    if (~class161.field2903 <= ~this.field1279 && ~this.field1294 < ~class161.field2903) {
                        var45 = this.field1295;
                        var45.method869(this.field1303 - super.field635, -super.field599 + this.field1293, -super.field614 + this.field1277);
                        if (~super.field649 != -513) {
                            if (~super.field649 != -1025) {
                                if (super.field649 == 1536) {
                                    var45.method864();
                                }
                            } else {
                                var45.method864();
                                var45.method864();
                            }
                        } else {
                            var45.method864();
                            var45.method864();
                            var45.method864();
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class95) var13).method556(var46);
                }
                if (var45 != null) {
                    var13 = ((class95) var13).method556(var45);
                }
                var13.field2537 = true;
                var13.method289(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var45 != null) {
                    if (~super.field649 == -513) {
                        var45.method864();
                    } else if (super.field649 == 1024) {
                        var45.method864();
                        var45.method864();
                    } else if (~super.field649 == -1537) {
                        var45.method864();
                        var45.method864();
                        var45.method864();
                    }
                    var45.method869(super.field635 - this.field1303, -this.field1293 + super.field599, -this.field1277 + super.field614);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLka;)V")
    public final void method394(byte arg0, class97 arg1) {
        ++field1276;
        arg1.field1834 = 0;
        int var3 = arg1.method588((byte) -122);
        if (~(var3 & 2) != -3) {
            this.field1289 = 0;
            this.field1292 = 0;
        } else {
            this.field1289 = (short) (arg1.method588((byte) -115) << 2);
            this.field1292 = (short) (arg1.method588((byte) -49) << 2);
        }
        super.field651 = (var3 >> 3) + 1;
        boolean var4 = ~(var3 & 4) != -1;
        int var5 = -1;
        int var6 = var3 & 1;
        int[] var7 = new int[12];
        this.field1283 = arg1.method591(arg0 + 65277);
        if (arg0 == 3) {
            this.field1290 = arg1.method591(65280);
            this.field1285 = 0;
            for (int var8 = 0; var8 < 12; ++var8) {
                int var9 = arg1.method588((byte) -41);
                if (var9 == 0) {
                    var7[var8] = 0;
                } else {
                    int var10 = arg1.method588((byte) -99);
                    int var11 = (var9 << 8) + var10;
                    if (var8 == 0 && ~var11 == -65536) {
                        var5 = arg1.method611(false);
                        break;
                    }
                    if (~var11 <= -32769) {
                        int var15 = class200.field3883[var11 + -32768];
                        var7[var8] = class123.method748(var15, 1073741824);
                        int var16 = class60.method336(var15, 10).field2226;
                        if (~var16 != -1) {
                            this.field1285 = var16;
                        }
                    } else {
                        var7[var8] = class123.method748(Integer.MIN_VALUE, var11 - 256);
                    }
                }
            }
            int[] var12 = new int[5];
            for (int var13 = 0; ~var13 > -6; ++var13) {
                int var14 = arg1.method588((byte) -102);
                if (~var14 > -1 || var14 >= class133.field2409[var13].length) {
                    var14 = 0;
                }
                var12[var13] = var14;
            }
            super.field596 = arg1.method611(false);
            if (~super.field596 == -65536) {
                super.field596 = -1;
            }
            super.field663 = arg1.method611(false);
            if (super.field663 == 65535) {
                super.field663 = -1;
            }
            super.field656 = super.field663;
            super.field627 = arg1.method611(false);
            if (~super.field627 == -65536) {
                super.field627 = -1;
            }
            super.field604 = arg1.method611(false);
            if (~super.field604 == -65536) {
                super.field604 = -1;
            }
            super.field626 = arg1.method611(false);
            if (super.field626 == 65535) {
                super.field626 = -1;
            }
            super.field629 = arg1.method611(false);
            if (~super.field629 == -65536) {
                super.field629 = -1;
            }
            super.field597 = arg1.method611(false);
            if (super.field597 == 65535) {
                super.field597 = -1;
            }
            this.field1299 = class119.method719(arg1.method615(113), 37).method1147(true);
            this.field1282 = arg1.method588((byte) -85);
            if (var4) {
                this.field1298 = arg1.method611(false);
            }
            if (this.field1275 == null) {
                this.field1275 = new class207();
            }
            this.field1275.method1312(var5, var12, ~var6 == -2, 123, var7);
        }
    }

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "(I)V")
    public static final void method395(int arg0) {
        ++field1300;
        if (class129.field2326 == 0) {
            class200.method1280(4, 104, 104, class179.field3418);
            for (int var1 = 0; var1 < 4; ++var1) {
                class159.field2883[var1] = new class65(104, 104);
            }
            class129.field2330 = new class137(512, 512);
            class188.field3622 = class127.field2278;
            class47.field895 = 5;
            class129.field2326 = 20;
        } else if (class129.field2326 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; ~var3 > -10; ++var3) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class23.field422[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class196.method1247(var2, 500, 800, 512, 334, 25, 3500);
            class188.field3622 = class109.field1972;
            class47.field895 = 10;
            class129.field2326 = 30;
        } else {
            if (arg0 != 8) {
                field1278 = null;
            }
            if (~class129.field2326 == -31) {
                class164.field2953 = class128.method779(false, true, true, 7568, 0);
                class200.field3884 = class128.method779(false, true, true, 7568, 1);
                class146.field2631 = class128.method779(true, false, true, 7568, 2);
                class170.field3229 = class128.method779(false, true, true, 7568, 3);
                class7.field128 = class128.method779(false, true, true, arg0 + 7560, 4);
                class17.field324 = class128.method779(true, true, true, 7568, 5);
                class180.field3427 = class128.method779(true, true, false, 7568, 6);
                class3.field62 = class128.method779(false, true, true, 7568, 7);
                class117.field2124 = class128.method779(false, true, true, 7568, 8);
                class19.field355 = class128.method779(true, false, true, 7568, 9);
                class126.field2270 = class128.method779(false, true, true, 7568, 10);
                class14.field279 = class128.method779(false, true, true, 7568, 11);
                class174.field3291 = class128.method779(false, true, true, arg0 + 7560, 12);
                class111.field2013 = class128.method779(true, false, true, 7568, 13);
                class15.field296 = class128.method779(false, true, false, 7568, 14);
                class46.field868 = class128.method779(false, true, true, 7568, 15);
                class188.field3622 = class141.field2568;
                class47.field895 = 20;
                class129.field2326 = 40;
            } else if (class129.field2326 == 40) {
                byte var7 = 0;
                int var8 = var7 + class164.field2953.method1217(0) * 4 / 100;
                int var9 = var8 + class200.field3884.method1217(0) * 4 / 100;
                int var10 = var9 + 2 * class146.field2631.method1217(arg0 + -8) / 100;
                int var11 = var10 + 2 * class170.field3229.method1217(0) / 100;
                int var12 = var11 + 6 * class7.field128.method1217(0) / 100;
                int var13 = var12 + 4 * class17.field324.method1217(0) / 100;
                int var14 = var13 + 2 * class180.field3427.method1217(arg0 + -8) / 100;
                int var15 = var14 + class3.field62.method1217(0) * 60 / 100;
                int var16 = var15 + class117.field2124.method1217(0) * 2 / 100;
                int var17 = var16 + 2 * class19.field355.method1217(0) / 100;
                int var18 = var17 + class126.field2270.method1217(0) * 2 / 100;
                int var19 = var18 + 2 * class14.field279.method1217(arg0 ^ 8) / 100;
                int var20 = var19 + class174.field3291.method1217(0) * 2 / 100;
                int var21 = var20 + 2 * class111.field2013.method1217(0) / 100;
                int var22 = var21 + 2 * class15.field296.method1217(0) / 100;
                int var23 = var22 + class46.field868.method1217(arg0 ^ 8) * 2 / 100;
                if (~var23 != -101) {
                    if (~var23 != -1) {
                        class188.field3622 = class144.method884(arg0 + -8, new class184[] { class25.field452, class170.method1060(var23, arg0 + -135), class159.field2866 });
                    }
                    class47.field895 = 30;
                } else {
                    class188.field3622 = class7.field135;
                    class47.field895 = 30;
                    class191.method1221(64, class180.field3427, class117.field2124, class126.field2270);
                    class129.field2326 = 45;
                }
            } else if (class129.field2326 == 45) {
                class2.method9(2, (byte) 122, !class55.field970, 22050);
                class84 var24 = new class84();
                var24.method468(128, -107, 9);
                class157.field2820 = class208.method1326(arg0 + -105, class129.field2344, 0, class98.field1841, 22050);
                class157.field2820.method1334((byte) 102, var24);
                class58.method310(var24, class46.field868, class7.field128, class15.field296, arg0 ^ -10);
                class90.field1667 = class208.method1326(arg0 + -129, class129.field2344, 1, class98.field1841, 2048);
                class26.field467 = new class22();
                class90.field1667.method1334((byte) 58, class26.field467);
                class37.field693 = new class44(22050, class210.field4018);
                class129.field2326 = 50;
                class188.field3622 = class103.field1886;
                class47.field895 = 35;
            } else if (~class129.field2326 == -51) {
                int var25 = 0;
                if (class122.field2185 == null) {
                    class122.field2185 = class197.method1263(class1.field29, class117.field2124, class111.field2013, class170.field3242, (byte) -20);
                } else {
                    ++var25;
                }
                if (class157.field2814 != null) {
                    ++var25;
                } else {
                    class157.field2814 = class122.field2185;
                }
                if (class182.field3517 == null) {
                    class182.field3517 = class197.method1263(class37.field688, class117.field2124, class111.field2013, class170.field3242, (byte) -20);
                } else {
                    ++var25;
                }
                if (class125.field2261 == null) {
                    class125.field2261 = class197.method1263(class100.field1860, class117.field2124, class111.field2013, class170.field3242, (byte) -20);
                } else {
                    ++var25;
                }
                if (~var25 > -5) {
                    class188.field3622 = class144.method884(arg0 + -8, new class184[] { class47.field888, class170.method1060(var25 * 100 / 4, -109), class159.field2866 });
                    class47.field895 = 40;
                } else {
                    class129.field2326 = 60;
                    class47.field895 = 40;
                    class188.field3622 = class87.field1600;
                }
            } else if (~class129.field2326 == -61) {
                int var26 = class73.method428(class117.field2124, arg0 + 626, class126.field2270);
                int var27 = class127.method765(6);
                if (~var27 < ~var26) {
                    class188.field3622 = class144.method884(0, new class184[] { class29.field488, class170.method1060(var26 * 100 / var27, -111), class159.field2866 });
                    class47.field895 = 50;
                } else {
                    class188.field3622 = class87.field1607;
                    class47.field895 = 50;
                    class161.method972(5, (byte) 119);
                    class129.field2326 = 70;
                }
            } else if (~class129.field2326 == -71) {
                if (!class146.field2631.method1266(0)) {
                    class188.field3622 = class144.method884(0, new class184[] { class10.field176, class170.method1060(class146.field2631.method1214(0), -128), class159.field2866 });
                    class47.field895 = 60;
                } else {
                    class189.method1197(arg0 + -75, class146.field2631);
                    class92.method535(true, class146.field2631);
                    class175.method1078(class3.field62, (byte) 111, class146.field2631);
                    class129.method785(class146.field2631, class55.field970, class3.field62, (byte) -18);
                    class97.method576(class146.field2631, arg0 ^ 11, class3.field62);
                    class32.method199(class3.field62, class47.field882, class146.field2631, class157.field2814, (byte) 90);
                    class105.method657(0, class200.field3884, class164.field2953, class146.field2631);
                    class84.method495(-13452, class146.field2631, class3.field62);
                    class101.method625(false, class146.field2631);
                    class186.method1176((byte) -85, class146.field2631);
                    class101.method626(class170.field3229, arg0 + -8, class111.field2013, class117.field2124, class3.field62);
                    class87.method521(-7, class146.field2631);
                    class128.method783(class146.field2631, 113);
                    class188.field3622 = class49.field906;
                    class47.field895 = 60;
                    class68.method398(0);
                    class129.field2326 = 80;
                }
            } else if (class129.field2326 != 80) {
                if (~class129.field2326 == -91) {
                    if (!class19.field355.method1266(0)) {
                        class188.field3622 = class144.method884(0, new class184[] { class149.field2679, class170.method1060(class19.field355.method1214(0), arg0 + -119), class159.field2866 });
                        class47.field895 = 90;
                    } else {
                        class64 var35 = new class64(class19.field355, class117.field2124, 20, class55.field970 ? 64 : 128);
                        class23.method147(var35);
                        class23.method155(0.7F);
                        class129.field2326 = 110;
                        class47.field895 = 90;
                        class188.field3622 = class1.field30;
                    }
                } else if (class129.field2326 == 110) {
                    class43.field825 = new class106();
                    class98.field1841.method903(10, -124, class43.field825);
                    class188.field3622 = class115.field2093;
                    class47.field895 = 94;
                    class129.field2326 = 120;
                } else if (~class129.field2326 == -121) {
                    if (!class126.field2270.method1256(class196.field3798, arg0 ^ 22, class170.field3242)) {
                        class188.field3622 = class144.method884(0, new class184[] { class174.field3289, class79.field1438 });
                        class47.field895 = 96;
                    } else {
                        class138 var36 = new class138(class126.field2270.method1258(0, class170.field3242, class196.field3798));
                        class127.method771((byte) 4, var36);
                        class47.field895 = 96;
                        class129.field2326 = 130;
                        class188.field3622 = class146.field2643;
                    }
                } else if (~class129.field2326 == -131) {
                    if (!class170.field3229.method1266(0)) {
                        class188.field3622 = class144.method884(0, new class184[] { class74.field1387, class170.method1060(class170.field3229.method1214(0) * 4 / 5, -108), class159.field2866 });
                        class47.field895 = 100;
                    } else if (!class174.field3291.method1266(0)) {
                        class188.field3622 = class144.method884(0, new class184[] { class74.field1387, class170.method1060(class174.field3291.method1214(0) / 6 + 80, -102), class159.field2866 });
                        class47.field895 = 100;
                    } else if (!class111.field2013.method1266(0)) {
                        class188.field3622 = class144.method884(0, new class184[] { class74.field1387, class170.method1060(class111.field2013.method1214(0) / 20 + 96, -126), class159.field2866 });
                        class47.field895 = 100;
                    } else {
                        class188.field3622 = class109.field1977;
                        class47.field895 = 100;
                        class129.field2326 = 140;
                    }
                } else if (~class129.field2326 == -141) {
                    class17.field324.method1250((byte) -59, false, true);
                    class180.field3427.method1250((byte) -59, true, true);
                    class117.field2124.method1250((byte) -59, true, true);
                    class111.field2013.method1250((byte) -59, true, true);
                    class126.field2270.method1250((byte) -59, true, true);
                    class161.method972(10, (byte) 113);
                }
            } else {
                int var28 = 0;
                if (class169.field3201 != null) {
                    ++var28;
                } else {
                    class169.field3201 = class92.method533(class170.field3242, class87.field1606, class117.field2124, (byte) -120);
                }
                if (class202.field3896 != null) {
                    ++var28;
                } else {
                    class202.field3896 = class60.method332(class170.field3242, class117.field2124, class193.field3746, 0);
                }
                if (class149.field2676 != null) {
                    ++var28;
                } else {
                    class149.field2676 = class149.method913(class117.field2124, class182.field3486, class170.field3242, -22537);
                }
                if (class9.field166 != null) {
                    ++var28;
                } else {
                    class9.field166 = class149.method913(class117.field2124, class1.field32, class170.field3242, arg0 + -22545);
                }
                if (class153.field2746 == null) {
                    class153.field2746 = class149.method913(class117.field2124, class136.field2479, class170.field3242, -22537);
                } else {
                    ++var28;
                }
                if (class167.field3070 != null) {
                    ++var28;
                } else {
                    class167.field3070 = class149.method913(class117.field2124, class197.field3856, class170.field3242, -22537);
                }
                if (class120.field2159 != null) {
                    ++var28;
                } else {
                    class120.field2159 = class149.method913(class117.field2124, class130.field2358, class170.field3242, arg0 ^ -22529);
                }
                if (class39.field735 == null) {
                    class39.field735 = class149.method913(class117.field2124, class19.field361, class170.field3242, -22537);
                } else {
                    ++var28;
                }
                if (class206.field3952 != null) {
                    ++var28;
                } else {
                    class206.field3952 = class149.method913(class117.field2124, class10.field189, class170.field3242, -22537);
                }
                if (class35.field623 != null) {
                    ++var28;
                } else {
                    class35.field623 = class92.method533(class170.field3242, class44.field837, class117.field2124, (byte) -107);
                }
                if (class196.field3802 == null) {
                    class196.field3802 = class149.method913(class117.field2124, class154.field2751, class170.field3242, -22537);
                } else {
                    ++var28;
                }
                if (class7.field129 != null) {
                    ++var28;
                } else {
                    class7.field129 = class149.method913(class117.field2124, class210.field4028, class170.field3242, -22537);
                }
                if (class78.field1406 == null) {
                    class78.field1406 = class60.method332(class170.field3242, class117.field2124, class208.field3994, 0);
                } else {
                    ++var28;
                }
                if (class125.field2250 == null) {
                    class125.field2250 = class60.method332(class170.field3242, class117.field2124, class63.field1197, 0);
                } else {
                    ++var28;
                }
                if (~var28 > -15) {
                    class188.field3622 = class144.method884(0, new class184[] { class11.field197, class170.method1060(var28 * 100 / 13, arg0 + -109), class159.field2866 });
                    class47.field895 = 70;
                } else {
                    class122.field2185.method1363(class125.field2250, (int[]) null);
                    class182.field3517.method1363(class125.field2250, (int[]) null);
                    class125.field2261.method1363(class125.field2250, (int[]) null);
                    if (class157.field2814 != class122.field2185) {
                        class157.field2814.method1363(class125.field2250, (int[]) null);
                    }
                    for (int var29 = 0; class206.field3952.length > var29; ++var29) {
                        class206.field3952[var29].method825();
                    }
                    int var30 = (int) (Math.random() * 21.0D) + -10;
                    int var31 = (int) (21.0D * Math.random()) + -10;
                    class169.field3201.method825();
                    int var32 = (int) (41.0D * Math.random()) + -20;
                    int var33 = -10 + (int) (Math.random() * 21.0D);
                    for (int var34 = 0; ~class149.field2676.length < ~var34; ++var34) {
                        class149.field2676[var34].method826(var30 - -var32, var31 + var32, var32 + var33);
                    }
                    class202.field3896[0].method1064(var30 + var32, var31 + var32, var32 + var33);
                    class47.field895 = 70;
                    class188.field3622 = class164.field2956;
                    class129.field2326 = 90;
                }
            }
        }
    }
}
