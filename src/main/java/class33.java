import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class33 extends class123 {

    @OriginalMember(owner = "client!qh", name = "ic", descriptor = "I")
    public int field479 = -1;

    @OriginalMember(owner = "client!qh", name = "nc", descriptor = "I")
    public int field484 = 0;

    @OriginalMember(owner = "client!qh", name = "qc", descriptor = "I")
    public int field487 = -1;

    @OriginalMember(owner = "client!qh", name = "oc", descriptor = "I")
    public int field485 = -1;

    @OriginalMember(owner = "client!qh", name = "yc", descriptor = "I")
    public int field495 = -1;

    @OriginalMember(owner = "client!qh", name = "hc", descriptor = "I")
    public int field478 = -1;

    @OriginalMember(owner = "client!qh", name = "xc", descriptor = "I")
    public int field494 = 0;

    @OriginalMember(owner = "client!qh", name = "lc", descriptor = "I")
    public int field482 = 0;

    @OriginalMember(owner = "client!qh", name = "Dc", descriptor = "I")
    public int field500 = 255;

    @OriginalMember(owner = "client!qh", name = "tc", descriptor = "B")
    private byte field490 = 0;

    @OriginalMember(owner = "client!qh", name = "Jc", descriptor = "I")
    public int field506 = 0;

    @OriginalMember(owner = "client!qh", name = "Ic", descriptor = "I")
    public int field505 = 0;

    @OriginalMember(owner = "client!qh", name = "Kc", descriptor = "I")
    public int field507 = -1;

    @OriginalMember(owner = "client!qh", name = "Lc", descriptor = "Z")
    public boolean field508 = false;

    @OriginalMember(owner = "client!qh", name = "Ac", descriptor = "I")
    public int field497 = -1;

    @OriginalMember(owner = "client!qh", name = "wc", descriptor = "J")
    public static long field493 = 0L;

    @OriginalMember(owner = "client!qh", name = "Hc", descriptor = "Z")
    public static boolean field504 = false;

    @OriginalMember(owner = "client!qh", name = "Ec", descriptor = "Z")
    public static boolean field501 = false;

    @OriginalMember(owner = "client!qh", name = "fc", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!qh", name = "jc", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!qh", name = "kc", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!qh", name = "mc", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!qh", name = "pc", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!qh", name = "rc", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!qh", name = "sc", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!qh", name = "uc", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!qh", name = "vc", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!qh", name = "zc", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!qh", name = "Bc", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!qh", name = "Fc", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!qh", name = "Gc", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!qh", name = "Cc", descriptor = "Lid;")
    public class189 field499;

    @OriginalMember(owner = "client!qh", name = "gc", descriptor = "Ljava/lang/String;")
    public String field477;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Ljava/lang/String;", line = 5)
    public final String method272(int arg0) {
        field483++;
        String var2 = this.field477;
        if (class203.field3045 != null) {
            var2 = class203.field3045[this.field490] + var2;
        }
        if (arg0 == 27884) {
            if (class123.field1900 != null) {
                var2 = var2 + class123.field1900[this.field490];
            }
            return var2;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 23)
    public static final void method273(int arg0) {
        field503++;
        if (arg0 > -56) {
            return;
        }
        if (!class19.method150(48) && class276.field4262 != class205.field3101) {
            class205.method1457(class315.field4887, 103, class98.field1566.field1910[0], false, false, class98.field1566.field1938[0], class205.field3101, class81.field1272);
        } else if (class80.field1265 != class205.field3101 && class231.method1627(true, class205.field3101)) {
            class80.field1265 = class205.field3101;
            class98.method729((byte) 19);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lki;Lkh;II)V", line = 52)
    public static final void method274(class180 arg0, class166 arg1, int arg2, int arg3) {
        field480++;
        class176 var4 = new class176();
        var4.field2676 = arg1.method1178(arg3);
        var4.field2672 = arg1.method1137(83);
        var4.field2663 = new byte[var4.field2676][][];
        var4.field2662 = new class197[var4.field2676];
        var4.field2669 = new int[var4.field2676];
        var4.field2670 = new class197[var4.field2676];
        var4.field2664 = new int[var4.field2676];
        var4.field2667 = new int[var4.field2676];
        for (int var5 = 0; var5 < var4.field2676; var5++) {
            try {
                int var6 = arg1.method1178(0);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method1179((byte) -81);
                    String var8 = arg1.method1179((byte) 65);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method1137(-32);
                    }
                    var4.field2669[var5] = var6;
                    var4.field2664[var5] = var9;
                    var4.field2670[var5] = arg0.method1293(var8, arg3, class187.method1336(71, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method1179((byte) 56);
                    String var11 = arg1.method1179((byte) -79);
                    int var12 = arg1.method1178(0);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method1179((byte) -104);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method1137(arg3 + 85);
                            var15[var16] = new byte[var17];
                            arg1.method1124(0, var17, var15[var16], 3);
                        }
                    }
                    var4.field2669[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class187.method1336(87, var13[var19]);
                    }
                    var4.field2662[var5] = arg0.method1279(class187.method1336(arg3 + 22, var10), var11, (byte) -110, var18);
                    var4.field2663[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field2667[var5] = -1;
            } catch (SecurityException var26) {
                var4.field2667[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field2667[var5] = -3;
            } catch (Exception var28) {
                var4.field2667[var5] = -4;
            } catch (Throwable var29) {
                var4.field2667[var5] = -5;
            }
        }
        class240.field3835.method632(arg3 ^ 0xFFFFFF9D, var4);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILvh;IIIIIIIILwi;IIII)V", line = 164)
    private final void method275(int arg0, int arg1, class64 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class221 arg11, int arg12, int arg13, int arg14, int arg15) {
        int var17 = arg7 * arg7 + (arg9 * arg9);
        field492++;
        if (var17 < 16 || var17 > arg13 || arg6 != -1) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg7, (double) arg9) * 325.949D) & 0x7FF;
        class221 var19 = class344.method2379(this.field1868, var18, arg6 - 8358, this.field1905, arg11, arg0, this.field1909);
        if (var19 == null) {
            return;
        }
        if (!class94.field1516) {
            var19.method75(0, arg3, arg4, arg12, arg8, arg1, arg15, arg14, -1L, arg10, arg2);
            return;
        }
        float var20 = class94.method694();
        float var21 = class94.method672();
        class94.method674();
        class94.method680(var20, var21 - 150.0F);
        var19.method75(0, arg3, arg4, arg12, arg8, arg1, arg15, arg14, -1L, arg10, arg2);
        class94.method683();
        class94.method680(var20, var21);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZIII)V", line = 207)
    public final void method276(boolean arg0, int arg1, int arg2, int arg3) {
        super.method894(this.method280(false), arg0, arg1, arg3, (byte) -127);
        field489++;
        if (arg2 != -9749) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILkh;)V", line = 222)
    public final void method277(int arg0, class166 arg1) {
        arg1.field2532 = 0;
        int var3 = arg1.method1178(0);
        int var4 = var3 & 0x1;
        boolean var5 = (var3 & 0x4) != 0;
        field486++;
        int var6 = super.method280(false);
        this.method891(2047, (var3 >> 3 & 0x7) + 1);
        this.field490 = (byte) (var3 >> 6 & 0x3);
        int var7 = -1;
        this.field1905 += (this.method280(false) - var6) * 64;
        this.field1868 += (this.method280(false) - var6) * 64;
        int[] var8 = new int[12];
        this.field478 = arg1.method1143(88);
        this.field479 = arg1.method1143(arg0 - 38);
        this.field484 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method1178(0);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method1178(0);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg1.method1151(-55);
                    this.field484 = arg1.method1178(0);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class149.field2263[var12 - 32768];
                    var8[var9] = class222.method1577(var13, 1073741824);
                    int var14 = class237.method1657(2, var13).field4679;
                    if (var14 != 0) {
                        this.field484 = var14;
                    }
                } else {
                    var8[var9] = class222.method1577(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method1178(0);
            if (var17 < 0 || class83.field1302[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field1883 = arg1.method1151(-119);
        long var18 = arg1.method1165(0);
        this.field477 = class34.method289(-90, var18);
        if (arg0 != 128) {
            return;
        }
        this.field505 = arg1.method1178(0);
        if (var5) {
            this.field506 = arg1.method1151(arg0 ^ 0xFFFFFF1A);
            this.field495 = -1;
            this.field482 = this.field505;
        } else {
            this.field506 = 0;
            this.field482 = arg1.method1178(arg0 - 128);
            this.field495 = arg1.method1178(0);
            if (this.field495 == 255) {
                this.field495 = -1;
            }
        }
        int var20 = this.field494;
        this.field494 = arg1.method1178(0);
        if (this.field494 == 0) {
            class199.method1417(this, arg0 - 128);
        } else {
            int var21 = this.field487;
            int var22 = this.field507;
            int var23 = this.field485;
            int var24 = this.field497;
            int var25 = this.field500;
            this.field487 = arg1.method1151(arg0 - 179);
            this.field507 = arg1.method1151(-92);
            this.field497 = arg1.method1151(-86);
            this.field485 = arg1.method1151(arg0 ^ 0xFFFFFF4D);
            this.field500 = arg1.method1178(0);
            if (this.field494 != var20 || this.field487 != var21 || this.field507 != var22 || this.field497 != var24 || this.field485 != var23 || this.field500 != var25) {
                class308.method2102(0, this);
            }
        }
        if (this.field499 == null) {
            this.field499 = new class189();
        }
        int var26 = this.field499.field2845;
        this.field499.method1354(var7, -120, var4 == 1, var15, this.field1883, var8);
        if (var7 != var26) {
            this.field1905 = this.field1910[0] * 128 + this.method280(false) * 64;
            this.field1868 = this.field1938[0] * 128 + this.method280(false) * 64;
        }
        if (this.field1876 != null) {
            this.field1876.method491();
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)Z", line = 380)
    public final boolean method278(int arg0) {
        if (arg0 != -5324) {
            method274((class180) null, (class166) null, -51, -29);
        }
        field496++;
        return this.field499 != null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)I", line = 403)
    public final int method279(byte arg0) {
        field502++;
        return arg0 == 26 ? this.field1883 : 34;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V", line = 420)
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field481++;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)I", line = 433)
    public final int method280(boolean arg0) {
        if (arg0) {
            this.field497 = -23;
        }
        field491++;
        return this.field499 == null || this.field499.field2845 == -1 ? super.method280(false) : class231.method1630(-98, this.field499.field2845).field3118;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIIJILvh;)V", line = 455)
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        field488++;
        if (this.field499 == null) {
            return;
        }
        class281 var13 = this.field1912 != -1 && this.field1881 == 0 ? class133.method948(this.field1912, (byte) 33) : null;
        class281 var14 = this.field1872 == -1 || this.field508 || this.field1872 == this.method888(0).field5206 && var13 != null ? null : class133.method948(this.field1872, (byte) 33);
        class221 var15 = this.field499.method1348(this.field1954, true, this.field1880, var13, -24856, this.field1926, this.field1952, this.field1911, this.field1873, this.field1908, var14);
        int var16 = class160.method1091(127);
        if (class94.field1516 && class318.field4975 < 96 && var16 > 50) {
            class165.method1118((byte) 127);
        }
        if (class308.field4780 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class32.field461) {
                class188.field2812[class32.field461] = new byte[102400];
                class32.field461++;
            }
            while (var17 < class32.field461) {
                class32.field461--;
                class188.field2812[class32.field461] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field1927 = var15.method76();
        if (class217.field3303 && (this.field499.field2845 == -1 || class231.method1630(-75, this.field499.field2845).field3113)) {
            class221 var18 = class40.method328(true, this.field1909, 0, var15, this.field1868, 0, this.field1919, 240, this.field1905, 160, var14 == null ? this.field1952 : this.field1873, 1, var14 == null ? var13 : var14, arg0);
            if (class94.field1516) {
                float var19 = class94.method694();
                float var20 = class94.method672();
                class94.method674();
                class94.method680(var19, var20 - 150.0F);
                var18.method75(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class64) null);
                class94.method683();
                class94.method680(var19, var20);
            } else {
                var18.method75(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class64) null);
            }
        }
        if (class98.field1566 == this) {
            for (int var21 = class75.field1216.length - 1; var21 >= 0; var21--) {
                class235 var22 = class75.field1216[var21];
                if (var22 != null && var22.field3751 != -1) {
                    if (var22.field3761 == 1 && var22.field3757 >= 0 && var22.field3757 < class254.field3989.length) {
                        class313 var23 = class254.field3989[var22.field3757];
                        if (var23 != null) {
                            int var24 = var23.field1905 / 32 - (class98.field1566.field1905 / 32);
                            int var25 = var23.field1868 / 32 - class98.field1566.field1868 / 32;
                            this.method275(var22.field3751, arg5, (class64) null, arg1, arg2, arg0, -1, var24, arg4, var25, arg9, var15, arg3, 360000, arg7, arg6);
                        }
                    }
                    if (var22.field3761 == 2) {
                        int var26 = (var22.field3748 - class342.field5328) * 4 + 2 - class98.field1566.field1868 / 32;
                        int var27 = var22.field3754 * 4;
                        int var28 = (var22.field3746 - class213.field3249) * 4 + 2 - (class98.field1566.field1905 / 32);
                        int var29 = var27 * var27;
                        this.method275(var22.field3751, arg5, (class64) null, arg1, arg2, arg0, -1, var28, arg4, var26, arg9, var15, arg3, var29, arg7, arg6);
                    }
                    if (var22.field3761 == 10 && var22.field3757 >= 0 && var22.field3757 < class254.field3992.length) {
                        class33 var30 = class254.field3992[var22.field3757];
                        if (var30 != null) {
                            int var31 = var30.field1905 / 32 - (class98.field1566.field1905 / 32);
                            int var32 = var30.field1868 / 32 - (class98.field1566.field1868 / 32);
                            this.method275(var22.field3751, arg5, (class64) null, arg1, arg2, arg0, -1, var31, arg4, var32, arg9, var15, arg3, 360000, arg7, arg6);
                        }
                    }
                }
            }
        }
        class221 var33 = null;
        this.method892(var15, 64);
        this.method890(0, var15, arg0);
        if (!this.field508 && this.field1951 != -1 && this.field1885 != -1) {
            class265 var34 = class112.method831(this.field1951, true);
            var33 = var34.method1809(this.field1866, 2, this.field1904, this.field1885);
            if (var33 != null) {
                var33.method160(0, -this.field1934, 0);
                if (var34.field4125) {
                    if (class88.field1419 != 0) {
                        var33.method204(class88.field1419);
                    }
                    if (class97.field1554 != 0) {
                        var33.method168(class97.field1554);
                    }
                    if (class247.field3919 != 0) {
                        var33.method160(0, class247.field3919, 0);
                    }
                }
            }
        }
        class221 var35 = null;
        if (!this.field508 && this.field1893 != null) {
            if (this.field1889 <= class227.field3618) {
                this.field1893 = null;
            }
            if (this.field1931 <= class227.field3618 && this.field1889 > class227.field3618) {
                if ((this.field1893 instanceof class233)) {
                    var35 = (class221) ((class233) this.field1893).method1636((byte) -19);
                } else {
                    var35 = (class221) this.field1893;
                }
                var35.method160(this.field1922 - this.field1905, -this.field1909 + this.field1863, this.field1948 - this.field1868);
                if (this.field1858 == 512) {
                    var35.method181();
                } else if (this.field1858 == 1024) {
                    var35.method213();
                } else if (this.field1858 == 1536) {
                    var35.method180();
                }
            }
        }
        if (class94.field1516) {
            var15.field3534 = true;
            var15.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1876);
            if (var33 != null) {
                var33.field3534 = true;
                var33.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1876);
            }
        } else {
            if (var33 != null) {
                var15 = ((class66) var15).method498(var33);
            }
            if (var35 != null) {
                var15 = ((class66) var15).method498(var35);
            }
            var15.field3534 = true;
            var15.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1876);
        }
        if (var35 == null) {
            return;
        }
        if (this.field1858 == 512) {
            var35.method180();
        } else if (this.field1858 == 1024) {
            var35.method213();
        } else if (this.field1858 == 1536) {
            var35.method181();
        }
        var35.method160(this.field1905 - this.field1922, -this.field1863 + this.field1909, this.field1868 - this.field1948);
    }

    @OriginalMember(owner = "client!qh", name = "finalize", descriptor = "()V", line = 720)
    protected final void finalize() {
        field498++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()I", line = 761)
    public final int method76() {
        field476++;
        return this.field1927;
    }
}
