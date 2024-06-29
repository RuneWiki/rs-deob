import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class105 extends class179 {

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    private int field1869 = 12288;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    private int field1872 = 2048;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    private int field1874 = 0;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    private int field1870 = 2048;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    private int field1871 = 8192;

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    private int field1882 = 0;

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "I")
    private int field1880 = 4096;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "Lke;")
    public static class256 field1881 = class316.method2202(" de votre liste d(Wamis)3", 27626);

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "Lke;")
    public static class256 field1876 = class316.method2202("<img=0>", 27626);

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "Lke;")
    public static class256 field1878 = class316.method2202("settings=", 27626);

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "[I")
    public static int[] field1875 = new int[50];

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "Lvm;")
    public static class297 field1883 = new class297(50);

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "Lvm;")
    public static class297 field1884 = new class297(4);

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "I")
    public static int field1886 = 0;

    @OriginalMember(owner = "client!fc", name = "lb", descriptor = "I")
    public static int field1887 = 0;

    @OriginalMember(owner = "client!fc", name = "nb", descriptor = "Z")
    public static volatile boolean field1889 = true;

    @OriginalMember(owner = "client!fc", name = "mb", descriptor = "F")
    public static float field1888;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!fc", name = "ob", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 4)
    public final void method418(byte arg0) {
        class118.method803((byte) -109);
        field1877++;
        if (arg0 != -110) {
            this.field1872 = -23;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 25)
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIII)V", line = 42)
    public static final void method745(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1867++;
        if (arg1 > -30) {
            method745(108, 9, -21, 100, 79);
        }
        class185 var5 = (class185) class254.field4355.method1744((byte) 125, (long) arg2);
        if (var5 == null) {
            var5 = new class185();
            class254.field4355.method1749(true, var5, (long) arg2);
        }
        if (arg4 >= var5.field3254.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field3254.length; var8++) {
                var6[var8] = var5.field3254[var8];
                var7[var8] = var5.field3256[var8];
            }
            for (int var9 = var5.field3254.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3254 = var6;
            var5.field3256 = var7;
        }
        var5.field3254[arg4] = arg3;
        var5.field3256[arg4] = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)Z", line = 98)
    private final boolean method746(int arg0, byte arg1, int arg2) {
        field1873++;
        int var4 = (arg0 - arg2) * this.field1869 >> 12;
        int var5 = class321.field5494[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field1869;
        int var7 = (var6 << 12) / this.field1871;
        if (arg1 != -89) {
            this.method418((byte) -80);
        }
        int var8 = this.field1880 * var7 >> 12;
        return arg2 + arg0 < var8 && arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIB)Z", line = 118)
    private final boolean method747(int arg0, int arg1, byte arg2) {
        int var4 = (arg0 + arg1) * this.field1869 >> 12;
        field1868++;
        int var5 = class321.field5494[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field1869;
        int var7 = 89 % ((arg2 - 49) / 37);
        int var8 = (var6 << 12) / this.field1871;
        int var9 = this.field1880 * var8 >> 12;
        return var9 > arg0 - arg1 && (-var9) < (arg0 - arg1);
    }

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "(I)V", line = 149)
    public static void method748(int arg0) {
        field1881 = null;
        field1876 = null;
        field1878 = null;
        field1883 = null;
        if (arg0 != 64) {
            method749((class271) null, true);
        }
        field1875 = null;
        field1884 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I", line = 185)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            return (int[]) null;
        }
        field1866++;
        int[] var3 = this.field3157.method1258(arg1 + 31533, arg0);
        if (this.field3157.field3081) {
            int var4 = class292.field5049[arg0] - 2048;
            for (int var5 = 0; var5 < class161.field2858; var5++) {
                int var6 = class290.field5017[var5] - 2048;
                int var7 = this.field1872 + var6;
                int var8 = this.field1882 + var6;
                int var9 = var7 < -2048 ? var7 + 4096 : var7;
                int var10 = this.field1874 + var4;
                int var11 = var9 <= 2048 ? var9 : var9 - 4096;
                int var12 = this.field1870 + var4;
                int var13 = var8 >= -2048 ? var8 : var8 + 4096;
                int var14 = var13 > 2048 ? var13 - 4096 : var13;
                int var15 = var12 >= -2048 ? var12 : var12 + 4096;
                int var16 = var15 <= 2048 ? var15 : var15 - 4096;
                int var17 = var10 < -2048 ? var10 + 4096 : var10;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method746(var18, (byte) -89, var11) || this.method747(var16, var14, (byte) -37) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILra;I)V", line = 237)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg0 < 108) {
            this.field1880 = -89;
        }
        field1879++;
        if (arg2 == 0) {
            this.field1872 = arg1.method346(-16);
        } else if (arg2 == 1) {
            this.field1874 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field1882 = arg1.method346(-16);
        } else if (arg2 == 3) {
            this.field1870 = arg1.method346(-16);
        } else if (arg2 == 4) {
            this.field1869 = arg1.method346(-16);
        } else if (arg2 == 5) {
            this.field1880 = arg1.method346(-16);
        } else if (arg2 == 6) {
            this.field1871 = arg1.method346(-16);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lmh;Z)V", line = 315)
    public static final void method749(class271 arg0, boolean arg1) {
        class207.field3746.method1269(false, arg0);
        while (true) {
            class271 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class271[][] var7;
            class271 var78;
            do {
                class271 var77;
                do {
                    class271 var76;
                    do {
                        class271 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class271) class207.field3746.method1267(122);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4635);
                                            var3 = var2.field4620;
                                            var4 = var2.field4621;
                                            var5 = var2.field4622;
                                            var6 = var2.field4633;
                                            var7 = class41.field790[var5];
                                            float var8 = 0.0F;
                                            if (class253.field4323) {
                                                if (class222.field3884 == class118.field2090) {
                                                    int var9 = class11.field167[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class41.field777 != var10) {
                                                        class41.field777 = var10;
                                                        class166.method1214(4, var10);
                                                        class169.method1236(class247.method1667(true));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class295.field5121 != var11) {
                                                        class295.field5121 = var11;
                                                        class252.method1698(var11, (byte) -41);
                                                    }
                                                    int var12 = class72.field1329[0][var3 + 1][var4] + class72.field1329[0][var3][var4] + class72.field1329[0][var3][var4 + 1] + class72.field1329[0][var3 + 1][var4 + 1] >> 2;
                                                    class277.method1910(-var12, 3, -19856);
                                                    var8 = 201.5F;
                                                    class253.method1718(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class253.method1718(var8);
                                                }
                                            }
                                            if (!var2.field4644) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class271 var13 = class41.field790[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field4635) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class91.field1661 && var3 > class284.field4935) {
                                                    class271 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field4635 && (var14.field4644 || (var2.field4634 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class91.field1661 && var3 < class173.field3069 - 1) {
                                                    class271 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field4635 && (var15.field4644 || (var2.field4634 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class93.field1683 && var4 > class36.field599) {
                                                    class271 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field4635 && (var16.field4644 || (var2.field4634 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class93.field1683 && var4 < class186.field3273 - 1) {
                                                    class271 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field4635 && (var17.field4644 || (var2.field4634 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4644 = false;
                                            if (var2.field4619 != null) {
                                                class271 var18 = var2.field4619;
                                                if (class253.field4323) {
                                                    class253.method1718(201.5F - (float) (var18.field4633 + 1) * 50.0F);
                                                }
                                                if (var18.field4631 == null) {
                                                    if (var18.field4625 != null) {
                                                        if (class233.method1582(0, var3, var4)) {
                                                            class59.method461(var18.field4625, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var3, var4, true);
                                                        } else {
                                                            class59.method461(var18.field4625, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class233.method1582(0, var3, var4)) {
                                                    class75.method572(var18.field4631, 0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var3, var4, true);
                                                } else {
                                                    class75.method572(var18.field4631, 0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var3, var4, false);
                                                }
                                                class197 var19 = var18.field4639;
                                                if (var19 != null) {
                                                    if (class253.field4323) {
                                                        if ((var19.field3600 & var2.field4637) == 0) {
                                                            class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                        } else {
                                                            class245.method1654(var19.field3600, class310.field5346, class59.field1079, class271.field4623, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field3597.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var19.field3609 - class310.field5346, var19.field3602 - class59.field1079, var19.field3604 - class271.field4623, var19.field3601, var5, (class283) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field4641; var20++) {
                                                    class269 var21 = var18.field4624[var20];
                                                    if (var21 != null) {
                                                        if (class253.field4323) {
                                                            class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                        }
                                                        var21.field4590.method150(var21.field4600, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var21.field4592 - class310.field5346, var21.field4593 - class59.field1079, var21.field4591 - class271.field4623, var21.field4601, var5, (class283) null);
                                                    }
                                                }
                                                if (class253.field4323) {
                                                    class253.method1718(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field4631 == null) {
                                                if (var2.field4625 != null) {
                                                    if (class233.method1582(var6, var3, var4)) {
                                                        class59.method461(var2.field4625, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class59.method461(var2.field4625, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var3, var4, false);
                                                    }
                                                }
                                            } else if (class233.method1582(var6, var3, var4)) {
                                                class75.method572(var2.field4631, var6, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field4631.field3623 != 12345678 || class14.field187 && var5 <= class90.field1651) {
                                                    class75.method572(var2.field4631, var6, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class223 var23 = var2.field4628;
                                                if (var23 != null && (var23.field3902 & 0x80000000L) != 0L) {
                                                    if (class253.field4323 && var23.field3903) {
                                                        class253.method1718(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class253.field4323) {
                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                    }
                                                    var23.field3905.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var23.field3904 - class310.field5346, var23.field3900 - class59.field1079, var23.field3901 - class271.field4623, var23.field3902, var5, (class283) null);
                                                    if (class253.field4323 && var23.field3903) {
                                                        class253.method1718(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class197 var26 = var2.field4639;
                                            class39 var27 = var2.field4643;
                                            if (var26 != null || var27 != null) {
                                                if (class91.field1661 == var3) {
                                                    var24++;
                                                } else if (class91.field1661 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class93.field1683 == var4) {
                                                    var24 += 3;
                                                } else if (class93.field1683 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class144.field2542[var24];
                                                var2.field4637 = class261.field4509[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field3600 & class167.field2957[var24]) == 0) {
                                                    var2.field4626 = 0;
                                                } else if (var26.field3600 == 16) {
                                                    var2.field4626 = 3;
                                                    var2.field4630 = class206.field3729[var24];
                                                    var2.field4642 = 3 - var2.field4630;
                                                } else if (var26.field3600 == 32) {
                                                    var2.field4626 = 6;
                                                    var2.field4630 = class313.field5382[var24];
                                                    var2.field4642 = 6 - var2.field4630;
                                                } else if (var26.field3600 == 64) {
                                                    var2.field4626 = 12;
                                                    var2.field4630 = class71.field1306[var24];
                                                    var2.field4642 = 12 - var2.field4630;
                                                } else {
                                                    var2.field4626 = 9;
                                                    var2.field4630 = class59.field1065[var24];
                                                    var2.field4642 = 9 - var2.field4630;
                                                }
                                                if ((var26.field3600 & var25) != 0 && !class145.method1063(var6, var3, var4, var26.field3600)) {
                                                    if (class253.field4323) {
                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                    }
                                                    var26.field3597.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var26.field3609 - class310.field5346, var26.field3602 - class59.field1079, var26.field3604 - class271.field4623, var26.field3601, var5, (class283) null);
                                                }
                                                if ((var26.field3607 & var25) != 0 && !class145.method1063(var6, var3, var4, var26.field3607)) {
                                                    if (class253.field4323) {
                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                    }
                                                    var26.field3596.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var26.field3609 - class310.field5346, var26.field3602 - class59.field1079, var26.field3604 - class271.field4623, var26.field3601, var5, (class283) null);
                                                }
                                            }
                                            if (var27 != null && !class286.method2004(var6, var3, var4, var27.field700.method154())) {
                                                if (class253.field4323) {
                                                    class253.method1718(var8 - 0.5F);
                                                }
                                                if ((var27.field709 & var25) != 0) {
                                                    if (class253.field4323) {
                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                    }
                                                    var27.field700.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var27.field705 + var27.field699 - class310.field5346, var27.field703 - class59.field1079, var27.field715 + var27.field708 - class271.field4623, var27.field712, var5, (class283) null);
                                                } else if (var27.field709 == 256) {
                                                    int var28 = var27.field705 - class310.field5346;
                                                    int var29 = var27.field703 - class59.field1079;
                                                    int var30 = var27.field715 - class271.field4623;
                                                    int var31 = var27.field706;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class253.field4323) {
                                                            class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                        }
                                                        var27.field700.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var27.field699 + var28, var29, var27.field708 + var30, var27.field712, var5, (class283) null);
                                                    } else if (var27.field711 != null) {
                                                        if (class253.field4323) {
                                                            class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                        }
                                                        var27.field711.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var28, var29, var30, var27.field712, var5, (class283) null);
                                                    }
                                                }
                                                if (class253.field4323) {
                                                    class253.method1718(var8);
                                                }
                                            }
                                            if (var22) {
                                                class223 var34 = var2.field4628;
                                                if (var34 != null && (var34.field3902 & 0x80000000L) == 0L) {
                                                    if (class253.field4323 && var34.field3903) {
                                                        class253.method1718(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class253.field4323) {
                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                    }
                                                    var34.field3905.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var34.field3904 - class310.field5346, var34.field3900 - class59.field1079, var34.field3901 - class271.field4623, var34.field3902, var5, (class283) null);
                                                    if (class253.field4323 && var34.field3903) {
                                                        class253.method1718(var8);
                                                    }
                                                }
                                                class139 var35 = var2.field4632;
                                                if (var35 != null && var35.field2453 == 0) {
                                                    if (class253.field4323) {
                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                    }
                                                    if (var35.field2459 != null) {
                                                        var35.field2459.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var35.field2456 - class310.field5346, var35.field2460 - class59.field1079, var35.field2448 - class271.field4623, var35.field2457, var5, (class283) null);
                                                    }
                                                    if (var35.field2455 != null) {
                                                        var35.field2455.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var35.field2456 - class310.field5346, var35.field2460 - class59.field1079, var35.field2448 - class271.field4623, var35.field2457, var5, (class283) null);
                                                    }
                                                    if (var35.field2451 != null) {
                                                        var35.field2451.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var35.field2456 - class310.field5346, var35.field2460 - class59.field1079, var35.field2448 - class271.field4623, var35.field2457, var5, (class283) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field4634;
                                            if (var36 != 0) {
                                                if (var3 < class91.field1661 && (var36 & 0x4) != 0) {
                                                    class271 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field4635) {
                                                        class207.field3746.method1269(false, var37);
                                                    }
                                                }
                                                if (var4 < class93.field1683 && (var36 & 0x2) != 0) {
                                                    class271 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field4635) {
                                                        class207.field3746.method1269(false, var38);
                                                    }
                                                }
                                                if (var3 > class91.field1661 && (var36 & 0x1) != 0) {
                                                    class271 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field4635) {
                                                        class207.field3746.method1269(false, var39);
                                                    }
                                                }
                                                if (var4 > class93.field1683 && (var36 & 0x8) != 0) {
                                                    class271 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field4635) {
                                                        class207.field3746.method1269(false, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4626 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field4641; var42++) {
                                                if (class121.field2131 != var2.field4624[var42].field4595 && (var2.field4627[var42] & var2.field4626) == var2.field4630) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class197 var43 = var2.field4639;
                                                if (!class145.method1063(var6, var3, var4, var43.field3600)) {
                                                    if (class253.field4323) {
                                                        label882: {
                                                            if ((var43.field3601 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3609 - class310.field5346;
                                                                int var45 = var43.field3604 - class271.field4623;
                                                                int var46 = (int) (var43.field3601 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class57.field1051 - 1) {
                                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class129.field2264 - 1 && var4 < class57.field1051 - 1) {
                                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class129.field2264 - 1 && var4 > 0) {
                                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field3597.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var43.field3609 - class310.field5346, var43.field3602 - class59.field1079, var43.field3604 - class271.field4623, var43.field3601, var5, (class283) null);
                                                }
                                                var2.field4626 = 0;
                                            }
                                        }
                                        if (!var2.field4636) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field4641;
                                            var2.field4636 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class269 var50 = var2.field4624[var49];
                                                if (class121.field2131 != var50.field4595) {
                                                    for (int var51 = var50.field4594; var51 <= var50.field4597; var51++) {
                                                        for (int var52 = var50.field4587; var52 <= var50.field4599; var52++) {
                                                            class271 var53 = var7[var51][var52];
                                                            if (var53.field4644) {
                                                                var2.field4636 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field4626 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4594) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4597) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4587) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4599) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field4626) == var2.field4642) {
                                                                    var2.field4636 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class134.field2332[var48++] = var50;
                                                    int var55 = class91.field1661 - var50.field4594;
                                                    int var56 = var50.field4597 - class91.field1661;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class93.field1683 - var50.field4587;
                                                    int var58 = var50.field4599 - class93.field1683;
                                                    if (var58 > var57) {
                                                        var50.field4603 = var55 + var58;
                                                    } else {
                                                        var50.field4603 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class269 var62 = class134.field2332[var61];
                                                    if (class121.field2131 != var62.field4595) {
                                                        if (var62.field4603 > var59) {
                                                            var59 = var62.field4603;
                                                            var60 = var61;
                                                        } else if (var62.field4603 == var59) {
                                                            int var63 = var62.field4592 - class310.field5346;
                                                            int var64 = var62.field4591 - class271.field4623;
                                                            int var65 = class134.field2332[var60].field4592 - class310.field5346;
                                                            int var66 = class134.field2332[var60].field4591 - class271.field4623;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class269 var67 = class134.field2332[var60];
                                                var67.field4595 = class121.field2131;
                                                if (!class189.method1379(var6, var67.field4594, var67.field4597, var67.field4587, var67.field4599, var67.field4590.method154())) {
                                                    if (class253.field4323) {
                                                        if ((var67.field4601 & 0xFC000L) == 147456L) {
                                                            class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                                                            int var68 = var67.field4592 - class310.field5346;
                                                            int var69 = var67.field4591 - class271.field4623;
                                                            int var70 = (int) (var67.field4601 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class245.method1658(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class245.method1658(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class245.method1658(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class245.method1658(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class245.method1653(class310.field5346, class59.field1079, class271.field4623, var5, var67.field4594, var67.field4587, var67.field4597, var67.field4599);
                                                        }
                                                    }
                                                    var67.field4590.method150(var67.field4600, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var67.field4592 - class310.field5346, var67.field4593 - class59.field1079, var67.field4591 - class271.field4623, var67.field4601, var5, (class283) null);
                                                }
                                                for (int var71 = var67.field4594; var71 <= var67.field4597; var71++) {
                                                    for (int var72 = var67.field4587; var72 <= var67.field4599; var72++) {
                                                        class271 var73 = var7[var71][var72];
                                                        if (var73.field4626 != 0) {
                                                            class207.field3746.method1269(false, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field4635) {
                                                            class207.field3746.method1269(false, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4636) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field4636 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4635);
                            } while (var2.field4626 != 0);
                            if (var3 > class91.field1661 || var3 <= class284.field4935) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field4635);
                        if (var3 < class91.field1661 || var3 >= class173.field3069 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field4635);
                    if (var4 > class93.field1683 || var4 <= class36.field599) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field4635);
                if (var4 < class93.field1683 || var4 >= class186.field3273 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field4635);
            var2.field4635 = false;
            class48.field863--;
            class139 var79 = var2.field4632;
            if (var79 != null && var79.field2453 != 0) {
                if (class253.field4323) {
                    class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                }
                if (var79.field2459 != null) {
                    var79.field2459.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var79.field2456 - class310.field5346, var79.field2460 - class59.field1079 - var79.field2453, var79.field2448 - class271.field4623, var79.field2457, var5, (class283) null);
                }
                if (var79.field2455 != null) {
                    var79.field2455.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var79.field2456 - class310.field5346, var79.field2460 - class59.field1079 - var79.field2453, var79.field2448 - class271.field4623, var79.field2457, var5, (class283) null);
                }
                if (var79.field2451 != null) {
                    var79.field2451.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var79.field2456 - class310.field5346, var79.field2460 - class59.field1079 - var79.field2453, var79.field2448 - class271.field4623, var79.field2457, var5, (class283) null);
                }
            }
            if (var2.field4637 != 0) {
                class39 var80 = var2.field4643;
                if (var80 != null && !class286.method2004(var6, var3, var4, var80.field700.method154())) {
                    if ((var80.field709 & var2.field4637) != 0) {
                        if (class253.field4323) {
                            class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                        }
                        var80.field700.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var80.field705 + var80.field699 - class310.field5346, var80.field703 - class59.field1079, var80.field715 + var80.field708 - class271.field4623, var80.field712, var5, (class283) null);
                    } else if (var80.field709 == 256) {
                        int var81 = var80.field705 - class310.field5346;
                        int var82 = var80.field703 - class59.field1079;
                        int var83 = var80.field715 - class271.field4623;
                        int var84 = var80.field706;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class253.field4323) {
                                class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                            }
                            var80.field700.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var80.field699 + var81, var82, var80.field708 + var83, var80.field712, var5, (class283) null);
                        } else if (var80.field711 != null) {
                            if (class253.field4323) {
                                class245.method1657(class310.field5346, class59.field1079, class271.field4623, var5, var3, var4);
                            }
                            var80.field711.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var81, var82, var83, var80.field712, var5, (class283) null);
                        }
                    }
                }
                class197 var87 = var2.field4639;
                if (var87 != null) {
                    if ((var87.field3607 & var2.field4637) != 0 && !class145.method1063(var6, var3, var4, var87.field3607)) {
                        if (class253.field4323) {
                            class245.method1654(var87.field3607, class310.field5346, class59.field1079, class271.field4623, var6, var3, var4);
                        }
                        var87.field3596.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var87.field3609 - class310.field5346, var87.field3602 - class59.field1079, var87.field3604 - class271.field4623, var87.field3601, var5, (class283) null);
                    }
                    if ((var87.field3600 & var2.field4637) != 0 && !class145.method1063(var6, var3, var4, var87.field3600)) {
                        if (class253.field4323) {
                            class245.method1654(var87.field3600, class310.field5346, class59.field1079, class271.field4623, var6, var3, var4);
                        }
                        var87.field3597.method150(0, class93.field1680, class255.field4374, class119.field2113, class135.field2355, var87.field3609 - class310.field5346, var87.field3602 - class59.field1079, var87.field3604 - class271.field4623, var87.field3601, var5, (class283) null);
                    }
                }
            }
            if (var5 < class86.field1547 - 1) {
                class271 var88 = class41.field790[var5 + 1][var3][var4];
                if (var88 != null && var88.field4635) {
                    class207.field3746.method1269(false, var88);
                }
            }
            if (var3 < class91.field1661) {
                class271 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field4635) {
                    class207.field3746.method1269(false, var89);
                }
            }
            if (var4 < class93.field1683) {
                class271 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field4635) {
                    class207.field3746.method1269(false, var90);
                }
            }
            if (var3 > class91.field1661) {
                class271 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field4635) {
                    class207.field3746.method1269(false, var91);
                }
            }
            if (var4 > class93.field1683) {
                class271 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field4635) {
                    class207.field3746.method1269(false, var92);
                }
            }
        }
    }
}
