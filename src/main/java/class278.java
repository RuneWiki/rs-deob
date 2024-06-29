import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class278 extends class109 {

    @OriginalMember(owner = "client!ve", name = "kc", descriptor = "I")
    public int field4257 = -1;

    @OriginalMember(owner = "client!ve", name = "nc", descriptor = "I")
    public int field4260 = -1;

    @OriginalMember(owner = "client!ve", name = "Bc", descriptor = "I")
    public int field4274 = 0;

    @OriginalMember(owner = "client!ve", name = "tc", descriptor = "I")
    public int field4266 = -1;

    @OriginalMember(owner = "client!ve", name = "yc", descriptor = "I")
    public int field4271 = -1;

    @OriginalMember(owner = "client!ve", name = "oc", descriptor = "I")
    public int field4261 = 0;

    @OriginalMember(owner = "client!ve", name = "Ec", descriptor = "I")
    public int field4277 = -1;

    @OriginalMember(owner = "client!ve", name = "Hc", descriptor = "I")
    public int field4280 = 255;

    @OriginalMember(owner = "client!ve", name = "Lc", descriptor = "I")
    public int field4284 = 0;

    @OriginalMember(owner = "client!ve", name = "qc", descriptor = "I")
    public int field4263 = -1;

    @OriginalMember(owner = "client!ve", name = "Jc", descriptor = "Z")
    public boolean field4282 = false;

    @OriginalMember(owner = "client!ve", name = "Dc", descriptor = "I")
    public int field4276 = 0;

    @OriginalMember(owner = "client!ve", name = "Oc", descriptor = "I")
    public int field4287 = -1;

    @OriginalMember(owner = "client!ve", name = "Ac", descriptor = "I")
    public int field4273 = 0;

    @OriginalMember(owner = "client!ve", name = "Pc", descriptor = "B")
    private byte field4288 = 0;

    @OriginalMember(owner = "client!ve", name = "pc", descriptor = "[Lhj;")
    public static class76[] field4262 = new class76[50];

    @OriginalMember(owner = "client!ve", name = "Nc", descriptor = "I")
    public static int field4286 = 0;

    @OriginalMember(owner = "client!ve", name = "jc", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!ve", name = "lc", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ve", name = "mc", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ve", name = "rc", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ve", name = "sc", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ve", name = "uc", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ve", name = "vc", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ve", name = "xc", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ve", name = "zc", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ve", name = "Cc", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ve", name = "Fc", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ve", name = "Gc", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ve", name = "Kc", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ve", name = "Mc", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ve", name = "Ic", descriptor = "Ljc;")
    public class230 field4281;

    @OriginalMember(owner = "client!ve", name = "wc", descriptor = "Ljava/lang/String;")
    public String field4269;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 7)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class275 arg10) {
        field4278++;
        if (this.field4281 == null) {
            return;
        }
        class260 var13 = this.field1897 != -1 && this.field1921 == 0 ? class279.method1882(25397, this.field1897) : null;
        class260 var14 = this.field1893 == -1 || this.field4282 || this.field1893 == this.method698(12).field4907 && var13 != null ? null : class279.method1882(25397, this.field1893);
        class309 var15 = this.field4281.method1521(this.field1901, this.field1935, this.field1920, var14, this.field1903, (byte) 125, var13, true, this.field1945, this.field1908, this.field1882);
        int var16 = class125.method834(5);
        if (class249.field3893 && class318.field4807 < 96 && var16 > 50) {
            class29.method237(-21650);
        }
        if (class201.field3204 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class219.field3482) {
                class325.field4974[class219.field3482] = new byte[102400];
                class219.field3482++;
            }
            while (class219.field3482 > var17) {
                class219.field3482--;
                class325.field4974[class219.field3482] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field1883 = var15.method39();
        if (class259.field4030 && (this.field4281.field3628 == -1 || class19.method130(this.field4281.field3628, -5881).field877)) {
            class309 var18 = class67.method514(var14 == null ? var13 : var14, 0, 1, var14 == null ? this.field1908 : this.field1903, 240, this.field1872, 0, 160, arg0, this.field1891, this.field1869, this.field1898, -95, var15);
            if (class249.field3893) {
                float var19 = class249.method1675();
                float var20 = class249.method1671();
                class249.method1650();
                class249.method1688(var19, var20 - 150.0F);
                var18.method26(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class275) null);
                class249.method1659();
                class249.method1688(var19, var20);
            } else {
                var18.method26(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class275) null);
            }
        }
        if (class66.field1265 == this) {
            for (int var21 = class342.field5313.length - 1; var21 >= 0; var21--) {
                class339 var22 = class342.field5313[var21];
                if (var22 != null && var22.field5252 != -1) {
                    if (var22.field5260 == 1 && var22.field5258 >= 0 && var22.field5258 < class8.field179.length) {
                        class255 var23 = class8.field179[var22.field5258];
                        if (var23 != null) {
                            int var24 = var23.field1869 / 32 - class66.field1265.field1869 / 32;
                            int var25 = var23.field1872 / 32 - (class66.field1265.field1872 / 32);
                            this.method1867(var15, arg9, arg0, 60, 360000, arg7, arg6, (class275) null, var25, arg4, arg2, arg1, arg3, arg5, var22.field5252, var24);
                        }
                    }
                    if (var22.field5260 == 2) {
                        int var26 = (var22.field5250 - class101.field1769) * 4 + (2 - class66.field1265.field1872 / 32);
                        int var27 = var22.field5259 * 4;
                        int var28 = var27 * var27;
                        int var29 = (var22.field5254 - class246.field3818) * 4 + 2 - (class66.field1265.field1869 / 32);
                        this.method1867(var15, arg9, arg0, 60, var28, arg7, arg6, (class275) null, var26, arg4, arg2, arg1, arg3, arg5, var22.field5252, var29);
                    }
                    if (var22.field5260 == 10 && var22.field5258 >= 0 && var22.field5258 < class97.field1715.length) {
                        class278 var30 = class97.field1715[var22.field5258];
                        if (var30 != null) {
                            int var31 = var30.field1869 / 32 - class66.field1265.field1869 / 32;
                            int var32 = var30.field1872 / 32 - (class66.field1265.field1872 / 32);
                            this.method1867(var15, arg9, arg0, 60, 360000, arg7, arg6, (class275) null, var32, arg4, arg2, arg1, arg3, arg5, var22.field5252, var31);
                        }
                    }
                }
            }
        }
        this.method700((byte) 92, var15);
        this.method707(var15, (byte) -97, arg0);
        class309 var33 = null;
        if (!this.field4282 && this.field1856 != -1 && this.field1884 != -1) {
            class8 var34 = class87.method609(this.field1856, (byte) 77);
            var33 = var34.method72(true, this.field1875, this.field1952, this.field1884);
            if (var33 != null) {
                var33.method163(0, -this.field1919, 0);
                if (var34.field185) {
                    if (class106.field1838 != 0) {
                        var33.method145(class106.field1838);
                    }
                    if (class236.field3716 != 0) {
                        var33.method136(class236.field3716);
                    }
                    if (class281.field4326 != 0) {
                        var33.method163(0, class281.field4326, 0);
                    }
                }
            }
        }
        class309 var35 = null;
        if (!this.field4282 && this.field1904 != null) {
            if (this.field1885 <= class25.field494) {
                this.field1904 = null;
            }
            if (this.field1860 <= class25.field494 && this.field1885 > class25.field494) {
                if (this.field1904 instanceof class331) {
                    var35 = (class309) ((class331) this.field1904).method2290(-115);
                } else {
                    var35 = (class309) this.field1904;
                }
                var35.method163(this.field1956 - this.field1869, this.field1938 - this.field1898, this.field1864 - this.field1872);
                if (this.field1886 == 512) {
                    var35.method149();
                } else if (this.field1886 == 1024) {
                    var35.method157();
                } else if (this.field1886 == 1536) {
                    var35.method131();
                }
            }
        }
        if (class249.field3893) {
            var15.field4704 = true;
            var15.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1861);
            if (var33 != null) {
                var33.field4704 = true;
                var33.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1861);
            }
        } else {
            if (var33 != null) {
                var15 = ((class20) var15).method148(var33);
            }
            if (var35 != null) {
                var15 = ((class20) var15).method148(var35);
            }
            var15.field4704 = true;
            var15.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1861);
        }
        if (var35 == null) {
            return;
        }
        if (this.field1886 == 512) {
            var35.method131();
        } else if (this.field1886 == 1024) {
            var35.method157();
        } else if (this.field1886 == 1536) {
            var35.method149();
        }
        var35.method163(this.field1869 - this.field1956, -this.field1938 + this.field1898, this.field1872 - this.field1864);
    }

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "(I)I", line = 260)
    public final int method710(int arg0) {
        field4268++;
        if (this.field4281 == null || this.field4281.field3628 == -1) {
            return arg0 == -1 ? super.method710(-1) : 7;
        } else {
            return class19.method130(this.field4281.field3628, -5881).field882;
        }
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)I", line = 275)
    public final int method704(int arg0) {
        if (arg0 <= 120) {
            return 0;
        } else {
            field4279++;
            return this.field1902;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lbg;IIIIIILgl;IIIIIIII)V", line = 286)
    private final void method1867(class309 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class275 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field4259++;
        int var17 = arg15 * arg15 + (arg8 * arg8);
        if (var17 < 16 || var17 > arg4) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg15, (double) arg8) * 325.949D) & 0x7FF;
        if (arg3 != 60) {
            this.field4280 = -25;
        }
        class309 var19 = class327.method2262(var18, this.field1898, arg0, arg14, false, this.field1869, this.field1872);
        if (var19 == null) {
            return;
        }
        if (!class249.field3893) {
            var19.method26(0, arg11, arg10, arg12, arg9, arg13, arg6, arg5, -1L, arg1, arg7);
            return;
        }
        float var20 = class249.method1675();
        float var21 = class249.method1671();
        class249.method1650();
        class249.method1688(var20, var21 - 150.0F);
        var19.method26(0, arg11, arg10, arg12, arg9, arg13, arg6, arg5, -1L, arg1, arg7);
        class249.method1659();
        class249.method1688(var20, var21);
    }

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "(I)V", line = 328)
    public static void method1868(int arg0) {
        field4262 = null;
        if (arg0 != 255) {
            field4262 = (class76[]) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)Z", line = 342)
    public final boolean method701(int arg0) {
        field4267++;
        if (this.field4281 == null) {
            return false;
        } else {
            if (arg0 != -7080) {
                this.field4287 = -70;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 361)
    public static final void method1869(byte arg0) {
        field4275++;
        for (int var1 = 0; var1 < class48.field986; var1++) {
            int var10002 = class328.field5034[var1]--;
            if (class328.field5034[var1] >= -10) {
                class76 var3 = field4262[var1];
                if (var3 == null) {
                    var3 = class76.method568(class221.field3508, class135.field2266[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class328.field5034[var1] += var3.method567();
                    field4262[var1] = var3;
                }
                if (class328.field5034[var1] < 0) {
                    int var4;
                    if (class2.field35[var1] == 0) {
                        var4 = class72.field1500[var1] * class202.field3278 >> 8;
                    } else {
                        int var5 = (class2.field35[var1] & 0xFF) * 128;
                        int var6 = class2.field35[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class66.field1265.field1869;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class2.field35[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class66.field1265.field1872;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class328.field5034[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class80.field1573 * class72.field1500[var1] / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class5 var11 = var3.method566().method59(class290.field4449);
                        class315 var12 = class315.method2139(var11, 100, var4);
                        var12.method2162(class202.field3283[var1] - 1);
                        class11.field230.method1229(var12);
                    }
                    class328.field5034[var1] = -100;
                }
            } else {
                class48.field986--;
                for (int var2 = var1; var2 < class48.field986; var2++) {
                    class135.field2266[var2] = class135.field2266[var2 + 1];
                    field4262[var2] = field4262[var2 + 1];
                    class202.field3283[var2] = class202.field3283[var2 + 1];
                    class328.field5034[var2] = class328.field5034[var2 + 1];
                    class2.field35[var2] = class2.field35[var2 + 1];
                    class72.field1500[var2] = class72.field1500[var2 + 1];
                }
                var1--;
            }
        }
        int var13 = -117 / ((arg0) / 34);
        if (class146.field2389 && !class123.method799(false)) {
            if (class171.field2751 != 0 && class328.field5039 != -1) {
                class164.method1048(0, class75.field1530, (byte) -108, class328.field5039, false, class171.field2751);
            }
            class146.field2389 = false;
        } else if (class171.field2751 != 0 && class328.field5039 != -1 && !class123.method799(false)) {
            class77.field1537++;
            class14.field263.method80(163, (byte) 121);
            class14.field263.method1359(16705, class328.field5039);
            class328.field5039 = -1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()I", line = 491)
    public final int method39() {
        field4285++;
        return this.field1883;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZI)V", line = 509)
    public final void method1870(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 != 65535) {
            this.method1867((class309) null, -40, -14, -53, -98, 16, -49, (class275) null, -44, 35, 106, -107, -2, 81, 22, 120);
        }
        super.method706(arg1, this.method710(-1), arg0 - 65535, arg2, arg3);
        field4270++;
    }

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "(I)Ljava/lang/String;", line = 526)
    public final String method1871(int arg0) {
        field4265++;
        if (arg0 >= -37) {
            this.field4280 = 28;
        }
        String var2 = this.field4269;
        if (class288.field4437 != null) {
            var2 = class288.field4437[this.field4288] + var2;
        }
        if (class263.field4090 != null) {
            var2 = var2 + class263.field4090[this.field4288];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "finalize", descriptor = "()V", line = 548)
    protected final void finalize() {
        field4256++;
    }

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "(I)V", line = 562)
    public static final void method1872(int arg0) {
        field4283++;
        if (arg0 < -62) {
            class225.method1489(false, (byte) -54);
            System.gc();
            class9.method79((byte) -101, 25);
        }
    }

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "(I)V", line = 577)
    public static final void method1873(int arg0) {
        while (true) {
            if (class190.field3082.method78(-22887, class250.field3926) >= 11) {
                int var1 = class190.field3082.method81(7, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class97.field1715[var1] == null) {
                        var2 = true;
                        class97.field1715[var1] = new class278();
                        if (class51.field1026[var1] != null) {
                            class97.field1715[var1].method1874(true, class51.field1026[var1]);
                        }
                    }
                    class283.field4384[class305.field4623++] = var1;
                    class278 var3 = class97.field1715[var1];
                    var3.field1855 = class25.field494;
                    int var4 = class190.field3082.method81(arg0 ^ 0x27, 1);
                    int var5 = class154.field2515[class190.field3082.method81(7, 3)];
                    if (var2) {
                        var3.field1886 = var3.field1927 = var5;
                    }
                    int var6 = class190.field3082.method81(7, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class190.field3082.method81(arg0 ^ 0x27, 5);
                    int var8 = class190.field3082.method81(arg0 - 25, 1);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var8 == 1) {
                        class130.field2206[class248.field3865++] = var1;
                    }
                    var3.method1870(65535, class66.field1265.field1899[0] + var6, var4 == 1, class66.field1265.field1871[0] + var7);
                    continue;
                }
            }
            if (arg0 != 32) {
                return;
            }
            field4272++;
            class190.field3082.method84(-117);
            return;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLag;)V", line = 641)
    public final void method1874(boolean arg0, class202 arg1) {
        field4258++;
        arg1.field3249 = 0;
        int var3 = -1;
        int var4 = arg1.method1317((byte) -110);
        int[] var5 = new int[12];
        int var6 = var4 & 0x1;
        int var7 = super.method710(-1);
        boolean var8 = (var4 & 0x4) != 0;
        this.method697(((var4 & 0x3C) >> 3) + 1, -2424);
        this.field4288 = (byte) (var4 >> 6 & 0x3);
        this.field1869 += (this.method710(-1) - var7) * 64;
        this.field1872 += (this.method710(-1) - var7) * 64;
        this.field4271 = arg1.method1333(-128);
        this.field4257 = arg1.method1333(-127);
        this.field4276 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method1317((byte) -110);
            if (var10 == 0) {
                var5[var9] = 0;
            } else {
                int var11 = arg1.method1317((byte) -125);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var3 = arg1.method1315(14289);
                    this.field4276 = arg1.method1317((byte) -81);
                    break;
                }
                if (var12 < 32768) {
                    var5[var9] = class212.method1434(var12 - 256, Integer.MIN_VALUE);
                } else {
                    int var13 = class203.field3303[var12 - 32768];
                    var5[var9] = class212.method1434(1073741824, var13);
                    int var14 = class95.method636(22111, var13).field5177;
                    if (var14 != 0) {
                        this.field4276 = var14;
                    }
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method1317((byte) -83);
            if (var17 < 0 || var17 >= class44.field859[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field1902 = arg1.method1315(14289);
        long var18 = arg1.method1297(false);
        this.field4269 = class159.method1024(var18, (byte) 83);
        this.field4261 = arg1.method1317((byte) -88);
        if (var8) {
            this.field4284 = arg1.method1315(14289);
            this.field4274 = this.field4261;
            this.field4287 = -1;
        } else {
            this.field4284 = 0;
            this.field4274 = arg1.method1317((byte) -92);
            this.field4287 = arg1.method1317((byte) -116);
            if (this.field4287 == 255) {
                this.field4287 = -1;
            }
        }
        int var20 = this.field4273;
        this.field4273 = arg1.method1317((byte) -106);
        if (this.field4273 == 0) {
            class93.method626(50, this);
        } else {
            int var21 = this.field4266;
            int var22 = this.field4277;
            int var23 = this.field4263;
            int var24 = this.field4260;
            int var25 = this.field4280;
            this.field4266 = arg1.method1315(14289);
            this.field4277 = arg1.method1315(14289);
            this.field4263 = arg1.method1315(14289);
            this.field4260 = arg1.method1315(14289);
            this.field4280 = arg1.method1317((byte) -79);
            if (this.field4273 != var20 || this.field4266 != var21 || this.field4277 != var22 || this.field4263 != var23 || this.field4260 != var24 || this.field4280 != var25) {
                class324.method2248(0, this);
            }
        }
        if (this.field4281 == null) {
            this.field4281 = new class230();
        }
        int var26 = this.field4281.field3628;
        this.field4281.method1520(var6 == 1, var15, var3, var5, this.field1902, 4);
        if (var3 != var26) {
            this.field1869 = this.field1871[0] * 128 + (this.method710(-1) * 64);
            this.field1872 = this.field1899[0] * 128 + (this.method710(-1) * 64);
        }
        if (this.field1861 != null) {
            this.field1861.method1844();
        }
        if (!arg0) {
            method1868(-2);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V", line = 803)
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4264++;
    }
}
