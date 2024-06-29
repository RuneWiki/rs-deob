import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class256 {

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[Lvk;")
    private static class209[] field3822 = new class209[14];

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "S")
    public static short field3827 = 1;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field3831 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "J")
    private long field3818;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "J")
    private long field3821;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Lhf;")
    public static class330 field3833;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Z")
    public boolean field3836;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[I")
    private int[] field3819;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "[I")
    public int[] field3837;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "[[I")
    private int[][] field3840;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIBI)V", line = 5)
    public static final void method1876(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class96.field1364 < 100) {
            client.method355(22781);
        }
        field3824++;
        if (class141.field2031) {
            class205.method1503(arg2, arg1, arg2 + arg4, arg0 + arg1);
        } else {
            class44.method326(arg2, arg1, arg2 + arg4, arg0 + arg1);
        }
        if (class96.field1364 < 100) {
            byte var16 = 20;
            int var17 = arg4 / 2 + arg2;
            int var18 = arg0 / 2 + arg1 - var16 - 18;
            if (class141.field2031) {
                class205.method1499(arg2, arg1, arg4, arg0, 0);
                class205.method1487(var17 - 152, var18, 304, 34, 9179409);
                class205.method1499(var17 - 150, var18 - -2, class96.field1364 * 3, 30, 9179409);
            } else {
                class44.method317(arg2, arg1, arg4, arg0, 0);
                class44.method316(var17 - 152, var18, 304, 34, 9179409);
                class44.method317(var17 - 150, var18 + 2, class96.field1364 * 3, 30, 9179409);
            }
            class126.field1846.method197(class76.field1109, var17, var16 + var18, 16777215, -1);
            return;
        }
        class116.field1653 = class147.field2114 - (int) ((float) arg4 / class105.field1506);
        class133.field1943 = (int) ((float) (arg0 * 2) / class105.field1506);
        class306.field4586 = (int) ((float) (arg4 * 2) / class105.field1506);
        int var5 = class147.field2114 - (int) ((float) arg4 / class105.field1506);
        int var6 = class147.field2114 + ((int) ((float) arg4 / class105.field1506));
        class197.field2864 = class124.field1810 - ((int) ((float) arg0 / class105.field1506));
        if (arg3 <= 1) {
            method1883(-126, (String) null, true);
        }
        int var7 = class124.field1810 - ((int) ((float) arg0 / class105.field1506));
        int var8 = (int) ((float) arg0 / class105.field1506) + class124.field1810;
        if (class141.field2031) {
            if (class191.field2784 == null || class191.field2784.field2536 != arg4 || class191.field2784.field2553 != arg0) {
                class191.field2784 = null;
                class191.field2784 = new class118(arg4, arg0);
            }
            class44.method325(class191.field2784.field1665, arg4, arg0);
            class105.method809(var5, var7, var6, var8, 0, 0, arg4, arg0 + 1);
            class105.method811();
            class16 var10 = class105.method801();
            class203.method1475(arg2, arg1, -10, var10);
            class191.field2784.method884();
            class205.method1497(class191.field2784.field1665, arg2, arg1, arg4, arg0);
            class44.field624 = null;
        } else {
            class105.method809(var5, var7, var6, var8, arg2, arg1, arg2 + arg4, arg0 + arg1 + 1);
            class105.method811();
            class16 var9 = class105.method801();
            class203.method1475(0, 0, -10, var9);
        }
        if (class107.field1528 > 0) {
            class68.field994--;
            if (class68.field994 == 0) {
                class68.field994 = 20;
                class107.field1528--;
            }
        }
        if (!class91.field1265) {
            return;
        }
        int var11 = arg0 + arg1 - 8;
        int var12 = arg2 + arg4 - 5;
        class99.field1425.method201("Fps:" + class19.field306, var12, var11, 16776960, -1);
        Runtime var13 = Runtime.getRuntime();
        int var14 = (int) ((var13.totalMemory() - var13.freeMemory()) / 1024L);
        int var15 = 16776960;
        int var19 = var11 - 15;
        if (var14 > 65536) {
            var15 = 16711680;
        }
        class99.field1425.method201("Mem:" + var14 + "k", var12, var19, var15, -1);
        var11 = var19 - 15;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V", line = 126)
    public final void method1877(int arg0, int arg1, int arg2) {
        field3820++;
        int var4 = class300.field4486[arg2];
        if (this.field3819[var4] != 0 && arg0 == 2 && class220.method1607((byte) -114, arg1) != null) {
            this.field3819[var4] = class81.method666(arg1, Integer.MIN_VALUE);
            this.method1878((byte) -57);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 149)
    private final void method1878(byte arg0) {
        field3834++;
        long var2 = this.field3818;
        long[] var4 = class11.field179;
        this.field3818 = -1L;
        this.field3818 = var4[(int) (((long) (this.field3839 >> 8) ^ this.field3818) & 0xFFL)] ^ this.field3818 >>> 8;
        this.field3818 = this.field3818 >>> 8 ^ var4[(int) ((this.field3818 ^ (long) this.field3839) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3818 = this.field3818 >>> 8 ^ var4[(int) ((this.field3818 ^ (long) (this.field3819[var5] >> 24)) & 0xFFL)];
            this.field3818 = var4[(int) (((long) (this.field3819[var5] >> 16) ^ this.field3818) & 0xFFL)] ^ this.field3818 >>> 8;
            this.field3818 = var4[(int) (((long) (this.field3819[var5] >> 8) ^ this.field3818) & 0xFFL)] ^ this.field3818 >>> 8;
            this.field3818 = var4[(int) (((long) this.field3819[var5] ^ this.field3818) & 0xFFL)] ^ this.field3818 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3818 = var4[(int) (((long) this.field3837[var6] ^ this.field3818) & 0xFFL)] ^ this.field3818 >>> 8;
        }
        this.field3818 = var4[(int) (((long) (this.field3836 ? 1 : 0) ^ this.field3818) & 0xFFL)] ^ this.field3818 >>> 8;
        int var7 = -3 / ((arg0 - 43) / 58);
        if (var2 != 0L && this.field3818 != var2) {
            class57.field845.method459(var2, (byte) -86);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V", line = 197)
    public final void method1879(int arg0, int arg1, int arg2) {
        if (arg0 == -5971) {
            this.field3837[arg1] = arg2;
            this.method1878((byte) -102);
            field3825++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)I", line = 209)
    public final int method1880(boolean arg0) {
        field3817++;
        if (arg0) {
            this.method1886((class248) null, 27, 121, 24, -77, 46, 63, (class124[]) null, -96, true, (class248) null, true);
        }
        return this.field3830 == -1 ? (this.field3837[0] << 25) - (-(this.field3819[11] << 5) - this.field3819[1] - (this.field3819[8] << 10) - (this.field3837[4] << 20) - (this.field3819[0] << 15)) : 305419896 - -class343.method2393((byte) -27, this.field3830).field3121;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([IZB[III)V", line = 224)
    public final void method1881(int[] arg0, boolean arg1, byte arg2, int[] arg3, int arg4, int arg5) {
        if (this.field3839 != arg5) {
            this.field3839 = arg5;
            this.field3840 = (int[][]) null;
        }
        int var7 = -12 / ((-arg2 - 34) / 40);
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var8 = 0; var8 < 8; var8++) {
                for (int var9 = 0; var9 < class211.field3062; var9++) {
                    class262 var10 = class220.method1607((byte) -94, var9);
                    if (var10 != null && !var10.field3991 && var10.field3990 == (arg1 ? class135.field1967[var8] : class216.field3185[var8])) {
                        arg3[class300.field4486[var8]] = class81.method666(Integer.MIN_VALUE, var9);
                        break;
                    }
                }
            }
        }
        field3838++;
        this.field3836 = arg1;
        this.field3830 = arg4;
        this.field3837 = arg0;
        this.field3819 = arg3;
        this.method1878((byte) -28);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILtc;IIIIII)Lhc;", line = 277)
    public final class151 method1882(int arg0, class248 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3829++;
        long var9 = (long) (arg5 << 16) | (long) arg6 << 32 | (long) arg7;
        class151 var11 = (class151) class292.field4423.method461((byte) 120, var9);
        if (var11 == null) {
            class46[] var12 = new class46[3];
            int var13 = 0;
            if (!class220.method1607((byte) -93, arg7).method1938(arg4 ^ 0x335C) || !class220.method1607((byte) -85, arg5).method1938(117) || !class220.method1607((byte) -65, arg6).method1938(112)) {
                return null;
            }
            class46 var14 = class220.method1607((byte) -105, arg7).method1940(true);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class46 var15 = class220.method1607((byte) -110, arg5).method1940(true);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class46 var16 = class220.method1607((byte) -96, arg6).method1940(true);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class46 var17 = new class46(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class119.field1674[var18].length > this.field3837[var18]) {
                    var17.method372(class330.field4971[var18], class119.field1674[var18][this.field3837[var18]]);
                }
                if (this.field3837[var18] < class110.field1591[var18].length) {
                    var17.method372(class189.field2700[var18], class110.field1591[var18][this.field3837[var18]]);
                }
            }
            var11 = var17.method393(64, 768, -50, -10, -50);
            class292.field4423.method460(var11, -26089, var9);
        }
        if (arg1 != null) {
            var11 = arg1.method1818(var11, arg3, arg2, arg0, true);
        }
        if (arg4 != 13173) {
            this.method1877(5, -51, -83);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 343)
    public static final void method1883(int arg0, String arg1, boolean arg2) {
        if (arg0 <= 26) {
            method1883(-71, (String) null, true);
        }
        field3835++;
        if (!arg2) {
            try {
                class114.method858("loggedout", (byte) -67, class54.field787.field878);
            } catch (Throwable var9) {
            }
            try {
                class27.field363.getAppletContext().showDocument(new URL(class27.field363.getCodeBase(), arg1), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class141.field2031 && class321.field4841) {
            try {
                class114.method857(new Object[] { (new URL(class27.field363.getCodeBase(), arg1)).toString() }, "openjs", class54.field787.field878, false);
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class27.field363.getAppletContext().showDocument(new URL(class27.field363.getCodeBase(), arg1), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V", line = 401)
    public final void method1884(boolean arg0, int arg1) {
        this.field3836 = arg0;
        field3828++;
        this.method1878((byte) -62);
        if (arg1 <= 12) {
            field3822 = (class209[]) null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILtc;)Lhc;", line = 416)
    public final class151 method1885(int arg0, int arg1, int arg2, int arg3, class248 arg4) {
        if (arg0 != 12) {
            field3831 = 15;
        }
        field3841++;
        if (this.field3830 != -1) {
            return class343.method2393((byte) -27, this.field3830).method1540(arg1, arg3, arg4, (byte) 109, arg2);
        }
        class151 var6 = (class151) class292.field4423.method461((byte) 120, this.field3818);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field3819[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((var9 & Integer.MIN_VALUE) != 0 && !class220.method1607((byte) -74, var9 & 0x3FFFFFFF).method1938(35)) {
                        var7 = true;
                    }
                } else if (!class175.method1228((byte) 54, var9 & 0x3FFFFFFF).method915(true, this.field3836)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class46[] var10 = new class46[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field3819[var12];
                if ((var13 & 0x40000000) != 0) {
                    class46 var15 = class175.method1228((byte) 54, var13 & 0x3FFFFFFF).method906((byte) -104, this.field3836);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var13) != 0) {
                    class46 var14 = class220.method1607((byte) -124, var13 & 0x3FFFFFFF).method1940(true);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                }
            }
            class46 var16 = new class46(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (this.field3837[var17] < class119.field1674[var17].length) {
                    var16.method372(class330.field4971[var17], class119.field1674[var17][this.field3837[var17]]);
                }
                if (this.field3837[var17] < class110.field1591[var17].length) {
                    var16.method372(class189.field2700[var17], class110.field1591[var17][this.field3837[var17]]);
                }
            }
            var6 = var16.method393(64, 768, -50, -10, -50);
            class292.field4423.method460(var6, -26089, this.field3818);
        }
        if (arg4 != null) {
            var6 = arg4.method1818(var6, arg1, arg3, arg2, true);
        }
        return var6;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ltc;IIIIII[Lfi;IZLtc;Z)Lhc;", line = 543)
    public final class151 method1886(class248 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class124[] arg7, int arg8, boolean arg9, class248 arg10, boolean arg11) {
        field3823++;
        if (this.field3830 != -1) {
            return class343.method2393((byte) -27, this.field3830).method1546(arg7, arg2, arg10, (byte) 125, arg6, arg1, arg8, arg0, arg3, arg4);
        }
        long var13 = this.field3818;
        int[] var15 = this.field3819;
        if (arg0 != null && (arg0.field3696 >= 0 || arg0.field3692 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field3819[var16];
            }
            if (arg0.field3696 >= 0) {
                if (arg0.field3696 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var15[5] = 0;
                } else {
                    var15[5] = class81.method666(arg0.field3696, 1073741824);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg0.field3692 >= 0) {
                if (arg0.field3692 == 65535) {
                    var15[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var15[3] = class81.method666(arg0.field3692, 1073741824);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class151 var17 = (class151) class57.field845.method461((byte) 120, var13);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var20 = var15[var19];
                if ((var20 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var20) != 0 && !class220.method1607((byte) -61, var20 & 0x3FFFFFFF).method1937(66)) {
                        var18 = true;
                    }
                } else if (!class175.method1228((byte) 54, var20 & 0x3FFFFFFF).method921(this.field3836, 0)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field3821 != -1L) {
                    var17 = (class151) class57.field845.method461((byte) 120, this.field3821);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class46[] var21 = new class46[12];
                for (int var22 = 0; var22 < 12; var22++) {
                    int var23 = var15[var22];
                    if ((var23 & 0x40000000) != 0) {
                        class46 var25 = class175.method1228((byte) 54, var23 & 0x3FFFFFFF).method911(126, this.field3836);
                        if (var25 != null) {
                            var21[var22] = var25;
                        }
                    } else if ((Integer.MIN_VALUE & var23) != 0) {
                        class46 var24 = class220.method1607((byte) -113, var23 & 0x3FFFFFFF).method1939(false);
                        if (var24 != null) {
                            var21[var22] = var24;
                        }
                    }
                }
                class15 var26 = null;
                if (this.field3839 != -1) {
                    var26 = class38.method279(127, this.field3839);
                }
                if (var26 != null && var26.field233 != null) {
                    for (int var27 = 0; var27 < var26.field233.length; var27++) {
                        if (var26.field233[var27] != null && var21[var27] != null) {
                            int var28 = var26.field233[var27][0];
                            int var29 = var26.field233[var27][2];
                            int var30 = var26.field233[var27][1];
                            int var31 = var26.field233[var27][3];
                            int var32 = var26.field233[var27][4];
                            int var33 = var26.field233[var27][5];
                            if (this.field3840 == null) {
                                this.field3840 = new int[var26.field233.length][];
                            }
                            if (this.field3840[var27] == null) {
                                int[] var34 = this.field3840[var27] = new int[15];
                                if (var31 == 0 && var32 == 0 && var33 == 0) {
                                    var34[12] = -var28;
                                    var34[13] = -var30;
                                    var34[0] = var34[4] = var34[8] = 32768;
                                    var34[14] = -var29;
                                } else {
                                    int var35 = class345.field5343[var31] >> 1;
                                    int var36 = class345.field5339[var31] >> 1;
                                    int var37 = class345.field5343[var33] >> 1;
                                    int var38 = class345.field5343[var32] >> 1;
                                    int var39 = class345.field5339[var32] >> 1;
                                    int var40 = class345.field5339[var33] >> 1;
                                    var34[8] = var35 * var38 + 16384 >> 15;
                                    var34[2] = var35 * var39 + 16384 >> 15;
                                    var34[4] = var35 * var37 + 16384 >> 15;
                                    int var41 = var36 * var37 + 16384 >> 15;
                                    var34[5] = -var36;
                                    var34[3] = var35 * var40 + 16384 >> 15;
                                    var34[7] = -var39 * -var40 + var38 * var41 + 16384 >> 15;
                                    var34[1] = -var40 * var38 + var39 * var41 + 16384 >> 15;
                                    var34[14] = var34[2] * -var28 - (-(var34[5] * -var30) - (var34[8] * -var29 + 16384)) >> 15;
                                    var34[13] = var34[4] * -var30 + (var34[7] * -var29) + var34[1] * -var28 + 16384 >> 15;
                                    int var42 = var36 * var40 + 16384 >> 15;
                                    var34[0] = var37 * var38 + var39 * var42 + 16384 >> 15;
                                    var34[6] = -var39 * var37 + (var38 * var42) + 16384 >> 15;
                                    var34[12] = var34[6] * -var29 + var34[3] * -var30 + var34[0] * -var28 + 16384 >> 15;
                                }
                                var34[11] = var29;
                                var34[9] = var28;
                                var34[10] = var30;
                            }
                            if (var31 != 0 || var32 != 0 || var33 != 0) {
                                var21[var27].method385(var31, var32, var33);
                            }
                            if (var28 != 0 || var30 != 0 || var29 != 0) {
                                var21[var27].method370(var28, var30, var29);
                            }
                        }
                    }
                }
                class46 var43 = new class46(var21, var21.length);
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class119.field1674[var44].length > this.field3837[var44]) {
                        var43.method372(class330.field4971[var44], class119.field1674[var44][this.field3837[var44]]);
                    }
                    if (this.field3837[var44] < class110.field1591[var44].length) {
                        var43.method372(class189.field2700[var44], class110.field1591[var44][this.field3837[var44]]);
                    }
                }
                var17 = var43.method393(64, 850, -30, -50, -30);
                if (class141.field2031) {
                    ((class218) var17).method1589(false, false, true, true, false, false, true);
                }
                if (arg11) {
                    class57.field845.method460(var17, -26089, var13);
                    this.field3821 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg7 == null ? 0 : arg7.length;
        boolean var48 = false;
        boolean var49 = false;
        for (int var50 = 0; var50 < var47; var50++) {
            if (arg7[var50] != null) {
                class248 var51 = class119.method893(arg7[var50].field1796, (byte) -41);
                if (var51.field3667 != null) {
                    var45 = true;
                    class8.field148[var50] = var51;
                    int var52 = arg7[var50].field1798;
                    int var53 = arg7[var50].field1799;
                    int var54 = var51.field3667[var53];
                    field3822[var50] = class116.method867(false, var54 >>> 16);
                    int var55 = var54 & 0xFFFF;
                    class248.field3699[var50] = var55;
                    if (field3822[var50] != null) {
                        var49 |= field3822[var50].method1526(var55, (byte) 67);
                        var48 |= field3822[var50].method1524(21474, var55);
                        var46 |= var51.field3673;
                    }
                    if ((var51.field3678 || class22.field335) && var52 != -1 && var52 < var51.field3667.length) {
                        class342.field5289[var50] = var51.field3694[var53];
                        class309.field4626[var50] = arg7[var50].field1802;
                        int var56 = var51.field3667[var52];
                        class343.field5298[var50] = class116.method867(false, var56 >>> 16);
                        int var57 = var56 & 0xFFFF;
                        class86.field1218[var50] = var57;
                        if (class343.field5298[var50] != null) {
                            var49 |= class343.field5298[var50].method1526(var57, (byte) 67);
                            var48 |= class343.field5298[var50].method1524(arg5 ^ 0x53E9, var57);
                        }
                    } else {
                        class342.field5289[var50] = 0;
                        class309.field4626[var50] = 0;
                        class343.field5298[var50] = null;
                        class86.field1218[var50] = -1;
                    }
                }
            }
        }
        if (var45 || arg0 != null || arg10 != null) {
            int var58 = -1;
            int var59 = 0;
            int var60 = -1;
            class209 var61 = null;
            class209 var62 = null;
            if (arg0 != null) {
                int var63 = arg0.field3667[arg3];
                int var64 = var63 >>> 16;
                var58 = var63 & 0xFFFF;
                var62 = class116.method867(false, var64);
                if (var62 != null) {
                    var49 |= var62.method1526(var58, (byte) 67);
                    var48 |= var62.method1524(21474, var58);
                    var46 |= arg0.field3673;
                }
                if ((arg0.field3678 || class22.field335) && arg1 != -1 && arg1 < arg0.field3667.length) {
                    var59 = arg0.field3694[arg3];
                    int var65 = arg0.field3667[arg1];
                    int var66 = var65 >>> 16;
                    var60 = var65 & 0xFFFF;
                    if (var64 == var66) {
                        var61 = var62;
                    } else {
                        var61 = class116.method867(false, var60 >>> 16);
                    }
                    if (var61 != null) {
                        var49 |= var61.method1526(var60, (byte) 67);
                        var48 |= var61.method1524(arg5 ^ 0x53E9, var60);
                    }
                }
            }
            class209 var67 = null;
            int var68 = -1;
            int var69 = 0;
            int var70 = -1;
            class209 var71 = null;
            if (arg10 != null) {
                int var72 = arg10.field3667[arg6];
                int var73 = var72 >>> 16;
                var67 = class116.method867(false, var73);
                var68 = var72 & 0xFFFF;
                if (var67 != null) {
                    var49 |= var67.method1526(var68, (byte) 67);
                    var48 |= var67.method1524(21474, var68);
                    var46 |= arg10.field3673;
                }
                if ((arg10.field3678 || class22.field335) && arg8 != -1 && arg10.field3667.length > arg8) {
                    int var74 = arg10.field3667[arg8];
                    var69 = arg10.field3694[arg6];
                    int var75 = var74 >>> 16;
                    var70 = var74 & 0xFFFF;
                    if (var73 == var75) {
                        var71 = var67;
                    } else {
                        var71 = class116.method867(false, var70 >>> 16);
                    }
                    if (var71 != null) {
                        var49 |= var71.method1526(var70, (byte) 67);
                        var48 |= var71.method1524(21474, var70);
                    }
                }
            }
            class151 var76 = var17.method1083(!var48, !var49, !var46);
            if (arg5 != 11) {
                return (class151) null;
            }
            int var77 = 0;
            int var78 = 1;
            while (var47 > var77) {
                if (field3822[var77] != null) {
                    var76.method1076(field3822[var77], class248.field3699[var77], class343.field5298[var77], class86.field1218[var77], class309.field4626[var77] - 1, class342.field5289[var77], var78, class8.field148[var77].field3673, this.field3840[var77]);
                }
                var78 <<= 0x1;
                var77++;
            }
            if (var62 != null && var67 != null) {
                var76.method1075(var62, var58, var61, var60, arg4 - 1, var59, var67, var68, var71, var70, arg2 - 1, var69, arg0.field3682, arg10.field3673 | arg0.field3673);
            } else if (var62 != null) {
                var76.method1066(var62, var58, var61, var60, arg4 - 1, var59, arg0.field3673);
            } else if (var67 != null) {
                var76.method1066(var67, var68, var71, var70, arg2 - 1, var69, arg10.field3673);
            }
            for (int var79 = 0; var79 < var47; var79++) {
                field3822[var79] = null;
                class343.field5298[var79] = null;
                class8.field148[var79] = null;
            }
            return var76;
        } else if (arg9) {
            return var17.method1083(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Z", line = 1026)
    public static final boolean method1887(int arg0, int arg1) {
        field3826++;
        if (class121.field1709[arg0]) {
            return true;
        } else if (class3.field104.method2532(false, arg0)) {
            int var2 = class3.field104.method2539(true, arg0);
            if (~var2 == arg1) {
                class121.field1709[arg0] = true;
                return true;
            }
            if (class119.field1677[arg0] == null) {
                class119.field1677[arg0] = new class359[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class119.field1677[arg0][var3] == null) {
                    byte[] var4 = class3.field104.method2520(arg0, var3, (byte) -25);
                    if (var4 != null) {
                        class359 var5 = class119.field1677[arg0][var3] = new class359();
                        var5.field5521 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method2494(new class190(var4), (byte) 52);
                        } else {
                            var5.method2486(-128, new class190(var4));
                        }
                    }
                }
            }
            class121.field1709[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V", line = 1090)
    public static void method1888(boolean arg0) {
        field3822 = null;
        field3833 = null;
        if (arg0) {
            method1883(-117, (String) null, true);
        }
    }
}
