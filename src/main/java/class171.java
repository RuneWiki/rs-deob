import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class171 extends class91 {

    @OriginalMember(owner = "client!nc", name = "Bc", descriptor = "I")
    public int field2696 = 0;

    @OriginalMember(owner = "client!nc", name = "Dc", descriptor = "I")
    public int field2698 = -1;

    @OriginalMember(owner = "client!nc", name = "Ic", descriptor = "I")
    public int field2703 = -1;

    @OriginalMember(owner = "client!nc", name = "Tc", descriptor = "I")
    public int field2714 = 0;

    @OriginalMember(owner = "client!nc", name = "Mc", descriptor = "I")
    public int field2707 = -1;

    @OriginalMember(owner = "client!nc", name = "Xc", descriptor = "I")
    public int field2718 = 0;

    @OriginalMember(owner = "client!nc", name = "zc", descriptor = "I")
    public int field2694 = 0;

    @OriginalMember(owner = "client!nc", name = "Nc", descriptor = "I")
    public int field2708 = -1;

    @OriginalMember(owner = "client!nc", name = "bd", descriptor = "I")
    public int field2722 = 0;

    @OriginalMember(owner = "client!nc", name = "Vc", descriptor = "I")
    public int field2716 = 255;

    @OriginalMember(owner = "client!nc", name = "Zc", descriptor = "I")
    public int field2720 = -1;

    @OriginalMember(owner = "client!nc", name = "Rc", descriptor = "I")
    public int field2712 = -1;

    @OriginalMember(owner = "client!nc", name = "Kc", descriptor = "Z")
    public boolean field2705 = false;

    @OriginalMember(owner = "client!nc", name = "cd", descriptor = "I")
    public int field2723 = -1;

    @OriginalMember(owner = "client!nc", name = "ed", descriptor = "B")
    private byte field2725 = 0;

    @OriginalMember(owner = "client!nc", name = "kd", descriptor = "B")
    private byte field2731 = 0;

    @OriginalMember(owner = "client!nc", name = "id", descriptor = "Ljava/lang/String;")
    public static String field2729 = "Examine";

    @OriginalMember(owner = "client!nc", name = "Ac", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!nc", name = "Cc", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!nc", name = "Ec", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!nc", name = "Fc", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!nc", name = "Gc", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!nc", name = "Hc", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!nc", name = "Jc", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!nc", name = "Oc", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!nc", name = "Pc", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!nc", name = "Qc", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!nc", name = "Uc", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!nc", name = "Wc", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!nc", name = "ad", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!nc", name = "dd", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!nc", name = "fd", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!nc", name = "gd", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!nc", name = "hd", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!nc", name = "Sc", descriptor = "Lrn;")
    public static class18 field2713;

    @OriginalMember(owner = "client!nc", name = "jd", descriptor = "Loj;")
    public class207 field2730;

    @OriginalMember(owner = "client!nc", name = "Lc", descriptor = "Ljava/lang/String;")
    public String field2706;

    @OriginalMember(owner = "client!nc", name = "Yc", descriptor = "Ljava/lang/String;")
    public String field2719;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V", line = 9)
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2717++;
        if (!this.field1345) {
            if (this.field2730 == null) {
                return;
            }
            class93 var6 = this.field1343 != -1 && this.field1302 == 0 ? class126.method1091((byte) 119, this.field1343) : null;
            class93 var7 = this.field1350 == -1 || this.field2705 || this.field1350 == this.method813((byte) 88).field1663 && var6 != null ? null : class126.method1091((byte) 60, this.field1350);
            class52 var8 = this.field2730.method1535(var7, false, var6, false, this.field1331, this.field1310, this.field1293, this.field1309, this.field1369, 117, this.field1329, this.field1299);
            if (var8 == null) {
                return;
            }
            this.method825(var8, (class52) null, 60);
        }
        if (this.field1354 != null) {
            this.field1354.method2014(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)I", line = 48)
    public final int method814(int arg0) {
        if (arg0 != 0) {
            this.method32(-85, 3, 109, -84, -125);
        }
        field2721++;
        return this.field1379;
    }

    @OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V", line = 59)
    protected final void finalize() {
        if (this.field1354 != null) {
            this.field1354.method2013();
        }
        field2704++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZB)Ljava/lang/String;", line = 69)
    public final String method1344(boolean arg0, byte arg1) {
        if (arg1 != 2) {
            this.method811(121);
        }
        field2699++;
        return arg0 ? this.field2719 : this.field2706;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)Z", line = 84)
    public final boolean method811(int arg0) {
        if (arg0 != 256) {
            this.finalize();
        }
        field2715++;
        return this.field2730 != null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)V", line = 101)
    public static final void method1345(int arg0, int arg1) {
        class235.field3667.method649((byte) 75, arg0);
        class134.field2247.method649((byte) 75, arg0);
        if (arg1 != 17339) {
            field2695 = 109;
        }
        field2726++;
        class311.field4841.method649((byte) 75, arg0);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I", line = 116)
    public final int method808(int arg0) {
        field2701++;
        if (this.field2730 == null || this.field2730.field3197 == -1) {
            int var2 = 110 % ((arg0 - 42) / 37);
            return super.method808(-29);
        } else {
            return class343.method2417(this.field2730.field3197, (byte) 85).field2192;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIILhm;BIIIIILem;I)V", line = 131)
    private final void method1346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class52 arg7, byte arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class273 arg14, int arg15) {
        field2700++;
        int var17 = arg11 * arg11 + (arg10 * arg10);
        if (var17 < 16 || arg0 < var17 || arg8 < 76) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg11, (double) arg10) * 325.949D) & 0x7FF;
        class52 var19 = class317.method2240(arg1, this.field1359, var18, true, this.field1325, arg7, this.field1286);
        if (var19 == null) {
            return;
        }
        if (!class240.field3737) {
            var19.method27(0, arg4, arg2, arg5, arg13, arg6, arg12, arg15, -1L, arg3, arg14);
            return;
        }
        float var20 = class240.method1782();
        float var21 = class240.method1817();
        class240.method1791();
        class240.method1778(var20, var21 - 150.0F);
        var19.method27(0, arg4, arg2, arg5, arg13, arg6, arg12, arg15, -1L, arg3, arg14);
        class240.method1803();
        class240.method1778(var20, var21);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()I", line = 176)
    public final int method21() {
        field2697++;
        return this.field1367;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIJILem;)V", line = 195)
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class273 arg10) {
        field2724++;
        if (this.field2730 == null) {
            return;
        }
        class93 var13 = this.field1343 != -1 && this.field1302 == 0 ? class126.method1091((byte) 117, this.field1343) : null;
        class109 var14 = this.method813((byte) 120);
        boolean var15 = var14.field1662 != 0 || var14.field1653 != 0 || var14.field1641 != 0 || var14.field1636 != 0;
        class93 var16 = this.field1350 == -1 || this.field2705 || this.field1350 == this.method813((byte) 111).field1663 && var13 != null ? null : class126.method1091((byte) 116, this.field1350);
        class52 var17 = this.field2730.method1535(var16, var15, var13, true, this.field1331, this.field1310, this.field1293, this.field1309, this.field1369, 28, this.field1329, this.field1299);
        int var18 = class280.method2047(5000);
        if (class240.field3737 && class121.field1889 < 96 && var18 > 50) {
            class285.method2067(-100);
        }
        if (class232.field3624 != 0 && var18 < 50) {
            int var19 = 50 - var18;
            while (var19 > class239.field3714) {
                class149.field2448[class239.field3714] = new byte[102400];
                class239.field3714++;
            }
            while (var19 < class239.field3714) {
                class239.field3714--;
                class149.field2448[class239.field3714] = null;
            }
        }
        if (var17 == null) {
            return;
        }
        this.field1367 = var17.method21();
        if (class101.field1529 && (this.field2730.field3197 == -1 || class343.method2417(this.field2730.field3197, (byte) -91).field2160)) {
            class52 var20 = class149.method1243(var16 == null ? var13 : var16, this.field1325, 0, 1, false, 240, var17, 160, this.field1286, this.field1359, this.field1383, 0, var16 == null ? this.field1329 : this.field1299, arg0);
            if (class240.field3737) {
                float var21 = class240.method1782();
                float var22 = class240.method1817();
                class240.method1791();
                class240.method1778(var21, var22 - 150.0F);
                var20.method27(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class273) null);
                class240.method1803();
                class240.method1778(var21, var22);
            } else {
                var20.method27(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class273) null);
            }
        }
        if (class173.field2746 == this) {
            for (int var23 = class301.field4677.length - 1; var23 >= 0; var23--) {
                class68 var24 = class301.field4677[var23];
                if (var24 != null && var24.field1037 != -1) {
                    if (var24.field1036 == 1 && var24.field1035 >= 0 && var24.field1035 < class110.field1683.length) {
                        class244 var25 = class110.field1683[var24.field1035];
                        if (var25 != null) {
                            int var26 = var25.field1359 / 32 - class173.field2746.field1359 / 32;
                            int var27 = var25.field1286 / 32 - class173.field2746.field1286 / 32;
                            this.method1346(360000, var24.field1037, arg2, arg9, arg1, arg3, arg5, var17, (byte) 86, arg0, var27, var26, arg6, arg4, (class273) null, arg7);
                        }
                    }
                    if (var24.field1036 == 2) {
                        int var28 = (var24.field1051 - class358.field5696) * 4 + 2 - (class173.field2746.field1359 / 32);
                        int var29 = var24.field1043 * 4;
                        int var30 = var29 * var29;
                        int var31 = (var24.field1041 - class49.field755) * 4 + (2 - class173.field2746.field1286 / 32);
                        this.method1346(var30, var24.field1037, arg2, arg9, arg1, arg3, arg5, var17, (byte) 109, arg0, var31, var28, arg6, arg4, (class273) null, arg7);
                    }
                    if (var24.field1036 == 10 && var24.field1035 >= 0 && class177.field2795.length > var24.field1035) {
                        class171 var32 = class177.field2795[var24.field1035];
                        if (var32 != null) {
                            int var33 = var32.field1359 / 32 - (class173.field2746.field1359 / 32);
                            int var34 = var32.field1286 / 32 - (class173.field2746.field1286 / 32);
                            this.method1346(360000, var24.field1037, arg2, arg9, arg1, arg3, arg5, var17, (byte) 93, arg0, var34, var33, arg6, arg4, (class273) null, arg7);
                        }
                    }
                }
            }
        }
        this.method827(41, var17);
        class52 var35 = null;
        this.method824((byte) -105, var17, arg0);
        if (!this.field2705 && this.field1297 != -1 && this.field1326 != -1) {
            class281 var36 = class292.method2110(this.field1297, (byte) 50);
            var35 = var36.method2050(this.field1326, this.field1355, (byte) -127, this.field1392);
            if (var35 != null) {
                var35.method515(0, -this.field1308, 0);
                if (var36.field4338) {
                    if (class331.field5090 != 0) {
                        var35.method509(class331.field5090);
                    }
                    if (class93.field1427 != 0) {
                        var35.method498(class93.field1427);
                    }
                    if (class46.field722 != 0) {
                        var35.method515(0, class46.field722, 0);
                    }
                }
            }
        }
        class52 var37 = null;
        if (!this.field2705 && this.field1322 != null) {
            if (class360.field5718 >= this.field1388) {
                this.field1322 = null;
            }
            if (class360.field5718 >= this.field1370 && class360.field5718 < this.field1388) {
                if (this.field1322 instanceof class288) {
                    var37 = (class52) ((class288) this.field1322).method2084(0);
                } else {
                    var37 = (class52) this.field1322;
                }
                var37.method515(this.field1376 - this.field1359, -this.field1325 + this.field1337, this.field1378 - this.field1286);
                if (this.field1289 == 512) {
                    var37.method507();
                } else if (this.field1289 == 1024) {
                    var37.method493();
                } else if (this.field1289 == 1536) {
                    var37.method501();
                }
            }
        }
        if (class240.field3737) {
            this.method825(var17, var35, 79);
            var17.field800 = true;
            var17.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1354);
            if (var35 != null) {
                if (this.field1354 != null) {
                    class56 var38 = (class56) var35;
                    this.field1354.method2010(var38.field851, var38.field826, true, var38.field844, var38.field857, var38.field842);
                }
                var35.field800 = true;
                var35.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1354);
            }
        } else {
            if (var35 != null) {
                var17 = ((class124) var17).method1072(var35);
            }
            if (var37 != null) {
                var17 = ((class124) var17).method1072(var37);
            }
            this.method825(var17, var35, 101);
            var17.field800 = true;
            var17.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1354);
        }
        if (var37 == null) {
            return;
        }
        if (this.field1289 == 512) {
            var37.method501();
        } else if (this.field1289 == 1024) {
            var37.method493();
        } else if (this.field1289 == 1536) {
            var37.method507();
        }
        var37.method515(this.field1359 - this.field1376, this.field1325 - this.field1337, this.field1286 - this.field1378);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILrn;I)Lqn;", line = 460)
    public static final class361 method1347(int arg0, int arg1, class18 arg2, int arg3) {
        field2709++;
        if (class282.method2056(arg0, 0, arg2, arg1)) {
            if (arg3 != -6138) {
                field2729 = (String) null;
            }
            return class349.method2449(arg3 ^ 0x1D4A2547);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 474)
    public final String method1348(boolean arg0, int arg1) {
        if (arg1 < 27) {
            return (String) null;
        }
        String var3 = "";
        field2728++;
        if (class128.field2127 != null) {
            var3 = var3 + class128.field2127[this.field2725];
        }
        if (class153.field2477 != null && class153.field2477[this.field2725] != -1) {
            class81 var4 = class130.method1124(class153.field2477[this.field2725], false);
            if (var4.field1176 == 's') {
                var3 = var3 + var4.method730(-2, this.field2731 & 0xFF);
            } else {
                client.method1023((byte) -121, "gdn1", new Throwable());
                class153.field2477[this.field2725] = -1;
            }
        }
        String var5;
        if (arg0) {
            var5 = var3 + this.field2719;
        } else {
            var5 = var3 + this.field2706;
        }
        if (class283.field4380 != null) {
            var5 = var5 + class283.field4380[this.field2725];
        }
        return var5;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)I", line = 517)
    public final int method812(int arg0) {
        if (arg0 < 27) {
            return 105;
        } else {
            field2711++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(Z)V", line = 538)
    public static void method1349(boolean arg0) {
        if (arg0) {
            field2713 = null;
            field2729 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBZ)V", line = 552)
    public final void method1350(int arg0, int arg1, byte arg2, boolean arg3) {
        super.method819(this.method808(117), arg3, -1, arg1, arg0);
        if (arg2 < 108) {
            this.field2698 = -73;
        }
        field2702++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIJ)Z", line = 565)
    public static final boolean method1351(int arg0, int arg1, int arg2, long arg3) {
        class329 var5 = class170.field2689[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field5064 != null && var5.field5064.field3111 == arg3) {
            return true;
        } else if (var5.field5065 != null && var5.field5065.field4325 == arg3) {
            return true;
        } else if (var5.field5062 != null && var5.field5062.field701 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field5063; var6++) {
                if (var5.field5070[var6].field4611 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lug;IB)V", line = 613)
    public final void method1352(class25 arg0, int arg1, byte arg2) {
        arg0.field397 = 0;
        int var4 = arg0.method281(27);
        int var5 = var4 & 0x1;
        field2710++;
        boolean var6 = (var4 & 0x2) != 0;
        boolean var7 = (var4 & 0x4) != 0;
        int var8 = super.method808(123);
        this.method821(-68, (var4 >> 3 & 0x7) + 1);
        int var9 = -1;
        int[] var10 = new int[12];
        this.field2725 = (byte) (var4 >> 6 & 0x3);
        this.field1359 += (this.method808(79) - var8) * 64;
        this.field1286 += (this.method808(96) - var8) * 64;
        if (arg2 <= 102) {
            method1345(4, -106);
        }
        this.field2731 = arg0.method286((byte) 106);
        this.field2712 = arg0.method286((byte) 107);
        this.field2720 = arg0.method286((byte) 97);
        this.field2696 = 0;
        for (int var11 = 0; var11 < 12; var11++) {
            int var12 = arg0.method281(-126);
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method281(-128);
                int var14 = (var12 << 8) + var13;
                if (var11 == 0 && var14 == 65535) {
                    var9 = arg0.method314((byte) 76);
                    this.field2696 = arg0.method281(59);
                    break;
                }
                if (var14 >= 32768) {
                    int var15 = class116.field1773[var14 - 32768];
                    var10[var11] = class41.method426(var15, 1073741824);
                    int var16 = class48.method469(10, var15).field4050;
                    if (var16 != 0) {
                        this.field2696 = var16;
                    }
                } else {
                    var10[var11] = class41.method426(Integer.MIN_VALUE, var14 - 256);
                }
            }
        }
        int[] var17 = new int[5];
        for (int var18 = 0; var18 < 5; var18++) {
            int var19 = arg0.method281(68);
            if (var19 < 0 || var19 >= class296.field4596[var18].length) {
                var19 = 0;
            }
            var17[var18] = var19;
        }
        this.field1379 = arg0.method314((byte) 39);
        this.field2719 = arg0.method297((byte) -69);
        if (var6) {
            this.field2706 = arg0.method297((byte) -53);
        } else {
            this.field2706 = this.field2719;
        }
        this.field2722 = arg0.method281(38);
        if (var7) {
            this.field2694 = arg0.method314((byte) 59);
            this.field2698 = -1;
            this.field2714 = this.field2722;
        } else {
            this.field2694 = 0;
            this.field2714 = arg0.method281(-124);
            this.field2698 = arg0.method281(-125);
            if (this.field2698 == 255) {
                this.field2698 = -1;
            }
        }
        int var20 = this.field2718;
        this.field2718 = arg0.method281(103);
        if (this.field2718 == 0) {
            class46.method457((byte) -75, arg1, this);
        } else {
            int var21 = this.field2707;
            int var22 = this.field2723;
            int var23 = this.field2703;
            int var24 = this.field2716;
            int var25 = this.field2708;
            this.field2723 = arg0.method314((byte) 57);
            this.field2707 = arg0.method314((byte) 110);
            this.field2703 = arg0.method314((byte) 122);
            this.field2708 = arg0.method314((byte) 99);
            this.field2716 = arg0.method281(83);
            if (this.field2718 != var20 || this.field2723 != var22 || this.field2707 != var21 || this.field2703 != var23 || this.field2708 != var25 || this.field2716 != var24) {
                class264.method1951(-32043, arg1, this);
            }
        }
        if (this.field2730 == null) {
            this.field2730 = new class207();
        }
        int var26 = this.field2730.field3197;
        this.field2730.method1542(this.field1379, var17, var10, var5 == 1, var9, (byte) -116);
        if (var9 != var26) {
            this.field1359 = this.field1300[0] * 128 + (this.method808(-11) * 64);
            this.field1286 = this.field1290[0] * 128 + (this.method808(-57) * 64);
        }
        if (this.field1354 != null) {
            this.field1354.method1993();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V", line = 784)
    public static final void method1353(byte arg0, int arg1) {
        class310.field4800 = arg1;
        class332.field5098 = 100;
        class300.field4664 = 3;
        field2727++;
        if (arg0 == 60) {
            class155.field2503 = -1;
        }
    }
}
