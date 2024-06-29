import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class230 extends class240 {

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    private int field3896 = 0;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    private int field3901 = 0;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    private int field3903 = 0;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3892 = -1;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "[I")
    public static int[] field3900 = new int[100];

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    private int field3894;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    private int field3898;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    private int field3902;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    private int field3905;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "I")
    private int field3907;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BIII)V", line = 23)
    private final void method1656(byte arg0, int arg1, int arg2, int arg3) {
        field3906++;
        int var5 = arg1 < arg3 ? arg1 : arg3;
        int var6 = arg1 > arg3 ? arg1 : arg3;
        int var7 = var5 > arg2 ? arg2 : var5;
        int var8 = var6 < arg2 ? arg2 : var6;
        int var9 = var8 - var7;
        this.field3895 = (var7 + var8) / 2;
        if (arg0 != -78) {
            return;
        }
        if (this.field3895 > 0 && this.field3895 < 4096) {
            this.field3907 = (var9 << 12) / (this.field3895 <= 2048 ? this.field3895 * 2 : 8192 - this.field3895 * 2);
        } else {
            this.field3907 = 0;
        }
        if (var9 <= 0) {
            this.field3894 = 0;
            return;
        }
        int var10 = (var8 - arg1 << 12) / var9;
        int var11 = (var8 - arg3 << 12) / var9;
        int var12 = (var8 - arg2 << 12) / var9;
        if (arg1 == var8) {
            this.field3894 = arg3 == var7 ? var12 + 20480 : -var11 + 4096;
        } else if (arg3 == var8) {
            this.field3894 = arg2 == var7 ? var10 + 4096 : -var12 + 12288;
        } else {
            this.field3894 = arg1 == var7 ? var11 + 12288 : -var10 + 20480;
        }
        this.field3894 /= 6;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(BIII)V", line = 77)
    private final void method1657(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 54) {
            field3900 = (int[]) null;
        }
        field3908++;
        int var5 = arg2 <= 2048 ? (arg3 + 4096) * arg2 >> 12 : arg3 + arg2 - (arg2 * arg3 >> 12);
        if (var5 <= 0) {
            this.field3898 = this.field3902 = this.field3905 = arg2;
            return;
        }
        int var6 = arg1 * 6;
        int var7 = arg2 + arg2 - var5;
        int var8 = var6 >> 12;
        int var9 = (var5 - var7 << 12) / var5;
        int var10 = var6 - (var8 << 12);
        int var12 = var9 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var8 == 0) {
            this.field3902 = var14;
            this.field3905 = var7;
            this.field3898 = var5;
        } else if (var8 == 1) {
            this.field3905 = var7;
            this.field3898 = var15;
            this.field3902 = var5;
        } else if (var8 == 2) {
            this.field3902 = var5;
            this.field3905 = var14;
            this.field3898 = var7;
        } else if (var8 == 3) {
            this.field3898 = var7;
            this.field3905 = var5;
            this.field3902 = var15;
        } else if (var8 == 4) {
            this.field3898 = var14;
            this.field3902 = var7;
            this.field3905 = var5;
        } else if (var8 == 5) {
            this.field3905 = var15;
            this.field3902 = var7;
            this.field3898 = var5;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lcd;B)V", line = 188)
    public static final void method1658(class64 arg0, byte arg1) {
        if (arg1 != -103) {
            method1658((class64) null, (byte) 66);
        }
        field3899++;
        class143.method1018(-100);
        class193.method1358(arg1 ^ 0x55, arg0);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 207)
    public class230() {
        super(1, false);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)[[I", line = 218)
    public final int[][] method286(byte arg0, int arg1) {
        int[][] var3 = this.field4095.method1797(arg1, -51);
        if (this.field4095.field4355) {
            int[][] var4 = this.method1746(-100, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class169.field2936; var11++) {
                this.method1656((byte) -78, var5[var11], var7[var11], var6[var11]);
                this.field3894 += this.field3896;
                this.field3895 += this.field3901;
                if (this.field3895 < 0) {
                    this.field3895 = 0;
                }
                if (this.field3895 > 4096) {
                    this.field3895 = 4096;
                }
                while (this.field3894 < 0) {
                    this.field3894 += 4096;
                }
                this.field3907 += this.field3903;
                while (this.field3894 > 4096) {
                    this.field3894 -= 4096;
                }
                if (this.field3907 < 0) {
                    this.field3907 = 0;
                }
                if (this.field3907 > 4096) {
                    this.field3907 = 4096;
                }
                this.method1657((byte) 54, this.field3894, this.field3895, this.field3907);
                var9[var11] = this.field3898;
                var10[var11] = this.field3902;
                var8[var11] = this.field3905;
            }
        }
        if (arg0 < 34) {
            field3892 = -88;
        }
        field3893++;
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILkh;)V", line = 311)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field3896 = arg2.method153(-74);
        } else if (arg1 == 1) {
            this.field3903 = (arg2.method150((byte) 111) << 12) / 100;
        } else if (arg1 == 2) {
            this.field3901 = (arg2.method150((byte) 109) << 12) / 100;
        }
        if (arg0 == 2) {
            field3904++;
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(B)V", line = 347)
    public static void method1659(byte arg0) {
        field3900 = null;
        if (arg0 != -127) {
            method1658((class64) null, (byte) -40);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLcd;)I", line = 361)
    public static final int method1660(boolean arg0, class64 arg1) {
        field3897++;
        if (arg1.method540(28981) == 0) {
            return -1;
        } else if (arg0) {
            for (int var2 = 0; var2 < class143.field2516.field4886; var2++) {
                if (class143.field2516.field4887[var2].method523(class182.field3124, 0, class188.field3212).method533(32, arg1)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lbd;Z)V", line = 390)
    public static final void method1661(class295 arg0, boolean arg1) {
        class132.field2349.method781(arg0, 10751);
        while (true) {
            class295 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class295[][] var7;
            class295 var78;
            do {
                class295 var77;
                do {
                    class295 var76;
                    do {
                        class295 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class295) class132.field2349.method780((byte) 72);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field5078);
                                            var3 = var2.field5094;
                                            var4 = var2.field5091;
                                            var5 = var2.field5084;
                                            var6 = var2.field5087;
                                            var7 = class304.field5203[var5];
                                            float var8 = 0.0F;
                                            if (class123.field2216) {
                                                if (class96.field1764 == class184.field3155) {
                                                    int var9 = class187.field3205[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class104.field1923 != var10) {
                                                        class104.field1923 = var10;
                                                        class122.method860(var10, -126);
                                                        class52.method394(class223.method1611(0));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class193.field3295 != var11) {
                                                        class193.field3295 = var11;
                                                        class262.method1844(var11, 119);
                                                    }
                                                    int var12 = class266.field4571[0][var3 + 1][var4] + class266.field4571[0][var3][var4] + class266.field4571[0][var3][var4 + 1] + class266.field4571[0][var3 + 1][var4 + 1] >> 2;
                                                    class125.method908(3, -5, -var12);
                                                    var8 = 201.5F;
                                                    class123.method875(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class123.method875(var8);
                                                }
                                            }
                                            if (!var2.field5096) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class295 var13 = class304.field5203[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field5078) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class89.field1614 && var3 > class69.field1323) {
                                                    class295 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field5078 && (var14.field5096 || (var2.field5082 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class89.field1614 && var3 < class278.field4797 - 1) {
                                                    class295 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field5078 && (var15.field5096 || (var2.field5082 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class172.field2968 && var4 > class246.field4290) {
                                                    class295 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field5078 && (var16.field5096 || (var2.field5082 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class172.field2968 && var4 < class265.field4550 - 1) {
                                                    class295 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field5078 && (var17.field5096 || (var2.field5082 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field5096 = false;
                                            if (var2.field5086 != null) {
                                                class295 var18 = var2.field5086;
                                                if (class123.field2216) {
                                                    class123.method875(201.5F - (float) (var18.field5087 + 1) * 50.0F);
                                                }
                                                if (var18.field5074 == null) {
                                                    if (var18.field5093 != null) {
                                                        if (class281.method1946(0, var3, var4)) {
                                                            class233.method1673(var18.field5093, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var3, var4, true);
                                                        } else {
                                                            class233.method1673(var18.field5093, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class281.method1946(0, var3, var4)) {
                                                    class63.method490(var18.field5074, 0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var3, var4, true);
                                                } else {
                                                    class63.method490(var18.field5074, 0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var3, var4, false);
                                                }
                                                class162 var19 = var18.field5092;
                                                if (var19 != null) {
                                                    if (class123.field2216) {
                                                        if ((var19.field2851 & var2.field5088) == 0) {
                                                            class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                        } else {
                                                            class177.method1251(var19.field2851, class165.field2900, class159.field2796, class249.field4331, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field2852.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var19.field2854 - class165.field2900, var19.field2846 - class159.field2796, var19.field2849 - class249.field4331, var19.field2848);
                                                }
                                                for (int var20 = 0; var20 < var18.field5075; var20++) {
                                                    class195 var21 = var18.field5090[var20];
                                                    if (var21 != null) {
                                                        if (class123.field2216) {
                                                            class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                        }
                                                        var21.field3330.method43(var21.field3326, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var21.field3329 - class165.field2900, var21.field3311 - class159.field2796, var21.field3320 - class249.field4331, var21.field3324);
                                                    }
                                                }
                                                if (class123.field2216) {
                                                    class123.method875(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field5074 == null) {
                                                if (var2.field5093 != null) {
                                                    if (class281.method1946(var6, var3, var4)) {
                                                        class233.method1673(var2.field5093, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class233.method1673(var2.field5093, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var3, var4, false);
                                                    }
                                                }
                                            } else if (class281.method1946(var6, var3, var4)) {
                                                class63.method490(var2.field5074, var6, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field5074.field3109 != 12345678 || class156.field2761 && var5 <= class193.field3294) {
                                                    class63.method490(var2.field5074, var6, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class37 var23 = var2.field5095;
                                                if (var23 != null && (var23.field593 & 0x80000000L) != 0L) {
                                                    if (class123.field2216 && var23.field592) {
                                                        class123.method875(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class123.field2216) {
                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                    }
                                                    var23.field599.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var23.field596 - class165.field2900, var23.field604 - class159.field2796, var23.field594 - class249.field4331, var23.field593);
                                                    if (class123.field2216 && var23.field592) {
                                                        class123.method875(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class162 var26 = var2.field5092;
                                            class184 var27 = var2.field5079;
                                            if (var26 != null || var27 != null) {
                                                if (class89.field1614 == var3) {
                                                    var24++;
                                                } else if (class89.field1614 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class172.field2968 == var4) {
                                                    var24 += 3;
                                                } else if (class172.field2968 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class195.field3325[var24];
                                                var2.field5088 = class104.field1921[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field2851 & class169.field2947[var24]) == 0) {
                                                    var2.field5077 = 0;
                                                } else if (var26.field2851 == 16) {
                                                    var2.field5077 = 3;
                                                    var2.field5080 = class121.field2183[var24];
                                                    var2.field5089 = 3 - var2.field5080;
                                                } else if (var26.field2851 == 32) {
                                                    var2.field5077 = 6;
                                                    var2.field5080 = class42.field687[var24];
                                                    var2.field5089 = 6 - var2.field5080;
                                                } else if (var26.field2851 == 64) {
                                                    var2.field5077 = 12;
                                                    var2.field5080 = class42.field682[var24];
                                                    var2.field5089 = 12 - var2.field5080;
                                                } else {
                                                    var2.field5077 = 9;
                                                    var2.field5080 = class72.field1397[var24];
                                                    var2.field5089 = 9 - var2.field5080;
                                                }
                                                if ((var26.field2851 & var25) != 0 && !class25.method230(var6, var3, var4, var26.field2851)) {
                                                    if (class123.field2216) {
                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                    }
                                                    var26.field2852.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var26.field2854 - class165.field2900, var26.field2846 - class159.field2796, var26.field2849 - class249.field4331, var26.field2848);
                                                }
                                                if ((var26.field2840 & var25) != 0 && !class25.method230(var6, var3, var4, var26.field2840)) {
                                                    if (class123.field2216) {
                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                    }
                                                    var26.field2842.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var26.field2854 - class165.field2900, var26.field2846 - class159.field2796, var26.field2849 - class249.field4331, var26.field2848);
                                                }
                                            }
                                            if (var27 != null && !class66.method551(var6, var3, var4, var27.field3151.method48())) {
                                                if (class123.field2216) {
                                                    class123.method875(var8 - 0.5F);
                                                }
                                                if ((var27.field3156 & var25) != 0) {
                                                    if (class123.field2216) {
                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                    }
                                                    var27.field3151.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var27.field3152 + var27.field3147 - class165.field2900, var27.field3154 - class159.field2796, var27.field3145 + var27.field3142 - class249.field4331, var27.field3141);
                                                } else if (var27.field3156 == 256) {
                                                    int var28 = var27.field3152 - class165.field2900;
                                                    int var29 = var27.field3154 - class159.field2796;
                                                    int var30 = var27.field3145 - class249.field4331;
                                                    int var31 = var27.field3149;
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
                                                        if (class123.field2216) {
                                                            class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                        }
                                                        var27.field3151.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var27.field3147 + var28, var29, var27.field3142 + var30, var27.field3141);
                                                    } else if (var27.field3143 != null) {
                                                        if (class123.field2216) {
                                                            class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                        }
                                                        var27.field3143.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var28, var29, var30, var27.field3141);
                                                    }
                                                }
                                                if (class123.field2216) {
                                                    class123.method875(var8);
                                                }
                                            }
                                            if (var22) {
                                                class37 var34 = var2.field5095;
                                                if (var34 != null && (var34.field593 & 0x80000000L) == 0L) {
                                                    if (class123.field2216 && var34.field592) {
                                                        class123.method875(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class123.field2216) {
                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                    }
                                                    var34.field599.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var34.field596 - class165.field2900, var34.field604 - class159.field2796, var34.field594 - class249.field4331, var34.field593);
                                                    if (class123.field2216 && var34.field592) {
                                                        class123.method875(var8);
                                                    }
                                                }
                                                class180 var35 = var2.field5083;
                                                if (var35 != null && var35.field3088 == 0) {
                                                    if (class123.field2216) {
                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                    }
                                                    if (var35.field3083 != null) {
                                                        var35.field3083.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var35.field3101 - class165.field2900, var35.field3090 - class159.field2796, var35.field3085 - class249.field4331, var35.field3080);
                                                    }
                                                    if (var35.field3094 != null) {
                                                        var35.field3094.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var35.field3101 - class165.field2900, var35.field3090 - class159.field2796, var35.field3085 - class249.field4331, var35.field3080);
                                                    }
                                                    if (var35.field3087 != null) {
                                                        var35.field3087.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var35.field3101 - class165.field2900, var35.field3090 - class159.field2796, var35.field3085 - class249.field4331, var35.field3080);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field5082;
                                            if (var36 != 0) {
                                                if (var3 < class89.field1614 && (var36 & 0x4) != 0) {
                                                    class295 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field5078) {
                                                        class132.field2349.method781(var37, 10751);
                                                    }
                                                }
                                                if (var4 < class172.field2968 && (var36 & 0x2) != 0) {
                                                    class295 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field5078) {
                                                        class132.field2349.method781(var38, 10751);
                                                    }
                                                }
                                                if (var3 > class89.field1614 && (var36 & 0x1) != 0) {
                                                    class295 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field5078) {
                                                        class132.field2349.method781(var39, 10751);
                                                    }
                                                }
                                                if (var4 > class172.field2968 && (var36 & 0x8) != 0) {
                                                    class295 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field5078) {
                                                        class132.field2349.method781(var40, 10751);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field5077 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field5075; var42++) {
                                                if (class226.field3837 != var2.field5090[var42].field3321 && (var2.field5076[var42] & var2.field5077) == var2.field5080) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class162 var43 = var2.field5092;
                                                if (!class25.method230(var6, var3, var4, var43.field2851)) {
                                                    if (class123.field2216) {
                                                        label882: {
                                                            if ((var43.field2848 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field2854 - class165.field2900;
                                                                int var45 = var43.field2849 - class249.field4331;
                                                                int var46 = (int) (var43.field2848 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class314.field5327 - 1) {
                                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class146.field2588 - 1 && var4 < class314.field5327 - 1) {
                                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class146.field2588 - 1 && var4 > 0) {
                                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field2852.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var43.field2854 - class165.field2900, var43.field2846 - class159.field2796, var43.field2849 - class249.field4331, var43.field2848);
                                                }
                                                var2.field5077 = 0;
                                            }
                                        }
                                        if (!var2.field5081) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field5075;
                                            var2.field5081 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class195 var50 = var2.field5090[var49];
                                                if (class226.field3837 != var50.field3321) {
                                                    for (int var51 = var50.field3313; var51 <= var50.field3328; var51++) {
                                                        for (int var52 = var50.field3322; var52 <= var50.field3323; var52++) {
                                                            class295 var53 = var7[var51][var52];
                                                            if (var53.field5096) {
                                                                var2.field5081 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field5077 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field3313) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field3328) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field3322) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field3323) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field5077) == var2.field5089) {
                                                                    var2.field5081 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class122.field2201[var48++] = var50;
                                                    int var55 = class89.field1614 - var50.field3313;
                                                    int var56 = var50.field3328 - class89.field1614;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class172.field2968 - var50.field3322;
                                                    int var58 = var50.field3323 - class172.field2968;
                                                    if (var58 > var57) {
                                                        var50.field3315 = var55 + var58;
                                                    } else {
                                                        var50.field3315 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class195 var62 = class122.field2201[var61];
                                                    if (class226.field3837 != var62.field3321) {
                                                        if (var62.field3315 > var59) {
                                                            var59 = var62.field3315;
                                                            var60 = var61;
                                                        } else if (var62.field3315 == var59) {
                                                            int var63 = var62.field3329 - class165.field2900;
                                                            int var64 = var62.field3320 - class249.field4331;
                                                            int var65 = class122.field2201[var60].field3329 - class165.field2900;
                                                            int var66 = class122.field2201[var60].field3320 - class249.field4331;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class195 var67 = class122.field2201[var60];
                                                var67.field3321 = class226.field3837;
                                                if (!class132.method948(var6, var67.field3313, var67.field3328, var67.field3322, var67.field3323, var67.field3330.method48())) {
                                                    if (class123.field2216) {
                                                        if ((var67.field3324 & 0xFC000L) == 147456L) {
                                                            class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                                                            int var68 = var67.field3329 - class165.field2900;
                                                            int var69 = var67.field3320 - class249.field4331;
                                                            int var70 = (int) (var67.field3324 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class177.method1238(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class177.method1238(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class177.method1238(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class177.method1238(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class177.method1248(class165.field2900, class159.field2796, class249.field4331, var5, var67.field3313, var67.field3322, var67.field3328, var67.field3323);
                                                        }
                                                    }
                                                    var67.field3330.method43(var67.field3326, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var67.field3329 - class165.field2900, var67.field3311 - class159.field2796, var67.field3320 - class249.field4331, var67.field3324);
                                                }
                                                for (int var71 = var67.field3313; var71 <= var67.field3328; var71++) {
                                                    for (int var72 = var67.field3322; var72 <= var67.field3323; var72++) {
                                                        class295 var73 = var7[var71][var72];
                                                        if (var73.field5077 != 0) {
                                                            class132.field2349.method781(var73, 10751);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field5078) {
                                                            class132.field2349.method781(var73, 10751);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field5081) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field5081 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field5078);
                            } while (var2.field5077 != 0);
                            if (var3 > class89.field1614 || var3 <= class69.field1323) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field5078);
                        if (var3 < class89.field1614 || var3 >= class278.field4797 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field5078);
                    if (var4 > class172.field2968 || var4 <= class246.field4290) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field5078);
                if (var4 < class172.field2968 || var4 >= class265.field4550 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field5078);
            var2.field5078 = false;
            class104.field1933--;
            class180 var79 = var2.field5083;
            if (var79 != null && var79.field3088 != 0) {
                if (class123.field2216) {
                    class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                }
                if (var79.field3083 != null) {
                    var79.field3083.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var79.field3101 - class165.field2900, var79.field3090 - class159.field2796 - var79.field3088, var79.field3085 - class249.field4331, var79.field3080);
                }
                if (var79.field3094 != null) {
                    var79.field3094.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var79.field3101 - class165.field2900, var79.field3090 - class159.field2796 - var79.field3088, var79.field3085 - class249.field4331, var79.field3080);
                }
                if (var79.field3087 != null) {
                    var79.field3087.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var79.field3101 - class165.field2900, var79.field3090 - class159.field2796 - var79.field3088, var79.field3085 - class249.field4331, var79.field3080);
                }
            }
            if (var2.field5088 != 0) {
                class184 var80 = var2.field5079;
                if (var80 != null && !class66.method551(var6, var3, var4, var80.field3151.method48())) {
                    if ((var80.field3156 & var2.field5088) != 0) {
                        if (class123.field2216) {
                            class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                        }
                        var80.field3151.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var80.field3152 + var80.field3147 - class165.field2900, var80.field3154 - class159.field2796, var80.field3145 + var80.field3142 - class249.field4331, var80.field3141);
                    } else if (var80.field3156 == 256) {
                        int var81 = var80.field3152 - class165.field2900;
                        int var82 = var80.field3154 - class159.field2796;
                        int var83 = var80.field3145 - class249.field4331;
                        int var84 = var80.field3149;
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
                            if (class123.field2216) {
                                class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                            }
                            var80.field3151.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var80.field3147 + var81, var82, var80.field3142 + var83, var80.field3141);
                        } else if (var80.field3143 != null) {
                            if (class123.field2216) {
                                class177.method1240(class165.field2900, class159.field2796, class249.field4331, var5, var3, var4);
                            }
                            var80.field3143.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var81, var82, var83, var80.field3141);
                        }
                    }
                }
                class162 var87 = var2.field5092;
                if (var87 != null) {
                    if ((var87.field2840 & var2.field5088) != 0 && !class25.method230(var6, var3, var4, var87.field2840)) {
                        if (class123.field2216) {
                            class177.method1251(var87.field2840, class165.field2900, class159.field2796, class249.field4331, var6, var3, var4);
                        }
                        var87.field2842.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var87.field2854 - class165.field2900, var87.field2846 - class159.field2796, var87.field2849 - class249.field4331, var87.field2848);
                    }
                    if ((var87.field2851 & var2.field5088) != 0 && !class25.method230(var6, var3, var4, var87.field2851)) {
                        if (class123.field2216) {
                            class177.method1251(var87.field2851, class165.field2900, class159.field2796, class249.field4331, var6, var3, var4);
                        }
                        var87.field2852.method43(0, class172.field2965, class296.field5101, class233.field3945, class216.field3630, var87.field2854 - class165.field2900, var87.field2846 - class159.field2796, var87.field2849 - class249.field4331, var87.field2848);
                    }
                }
            }
            if (var5 < class183.field3140 - 1) {
                class295 var88 = class304.field5203[var5 + 1][var3][var4];
                if (var88 != null && var88.field5078) {
                    class132.field2349.method781(var88, 10751);
                }
            }
            if (var3 < class89.field1614) {
                class295 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field5078) {
                    class132.field2349.method781(var89, 10751);
                }
            }
            if (var4 < class172.field2968) {
                class295 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field5078) {
                    class132.field2349.method781(var90, 10751);
                }
            }
            if (var3 > class89.field1614) {
                class295 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field5078) {
                    class132.field2349.method781(var91, 10751);
                }
            }
            if (var4 > class172.field2968) {
                class295 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field5078) {
                    class132.field2349.method781(var92, 10751);
                }
            }
        }
    }
}
