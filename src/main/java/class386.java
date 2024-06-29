import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class386 {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public int field5312;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Loia;")
    private class97 field5314;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method2349(int arg0, boolean arg1) {
        field5317++;
        class309.method1971(class359.field4911, class108.field1697, arg1, 8, class732.field10098);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLha;II)Lfha;", line = 21)
    public static final class401 method2350(boolean arg0, class66 arg1, int arg2, int arg3) {
        field5313++;
        if (arg3 == -1) {
            return null;
        }
        if (class668.field9303 != null) {
            for (int var4 = 0; var4 < class668.field9303.length; var4++) {
                if (class668.field9303[var4] == arg3) {
                    return class34.field569[var4];
                }
            }
        }
        class401 var5 = (class401) class276.field3827.method266((byte) -104, (long) arg3);
        if (arg2 < 21) {
            return null;
        } else if (var5 == null) {
            class49[] var7 = class49.method372(class488.field6592, arg3);
            if (var7 == null) {
                return null;
            }
            class145 var8 = class502.method2871(-1, arg3, class3.field40);
            if (var8 == null) {
                return null;
            }
            class401 var9;
            if (arg0) {
                var9 = new class401(arg1.method476(var8, var7, true), var8);
            } else {
                var9 = new class401(arg1.method476(var8, var7, true));
            }
            class276.field3827.method270(var9, (long) arg3, -125);
            return var9;
        } else {
            if (arg0 && var5.field5522 == null) {
                class145 var6 = class502.method2871(-1, arg3, class3.field40);
                if (var6 == null) {
                    return null;
                }
                var5.field5522 = var6;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ll", name = "finalize", descriptor = "()V", line = 89)
    protected final void finalize() throws Throwable {
        field5316++;
        this.field5314.method859(false, this.field5312);
        super.finalize();
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Loia;II)V", line = 101)
    public class386(class97 arg0, int arg1, int arg2) {
        this.field5312 = arg2;
        this.field5314 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILlb;III)V", line = 112)
    public static final void method2351(int arg0, int arg1, class570 arg2, int arg3, int arg4, int arg5) {
        field5315++;
        if (arg2.field8102 == -1 && arg2.field8123 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg2.field8110 * class111.field1911.field6766.method925((byte) 92) >> 8;
        if (arg2.field8109 < arg0) {
            var6 += arg0 - arg2.field8109;
        } else if (arg2.field8112 > arg0) {
            var6 += arg2.field8112 - arg0;
        }
        if (arg2.field8107 < arg1) {
            var6 += arg1 - arg2.field8107;
        } else if (arg1 < arg2.field8131) {
            var6 += arg2.field8131 - arg1;
        }
        if (arg2.field8122 == 0 || arg2.field8122 < var6 - 256 || class111.field1911.field6766.method925((byte) 54) == 0 || arg2.field8113 != arg5) {
            if (arg2.field8114 != null) {
                class456.field6213.method352(arg2.field8114);
                arg2.field8114 = null;
                arg2.field8129 = null;
                arg2.field8106 = null;
            }
            if (arg2.field8119 != null) {
                class456.field6213.method352(arg2.field8119);
                arg2.field8105 = null;
                arg2.field8127 = null;
                arg2.field8119 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg2.field8122 - arg2.field8125;
        if (var8 < 0) {
            var8 = arg2.field8122;
        }
        int var9 = var7;
        int var10 = var6 - arg2.field8125;
        if (var10 > 0 && var8 > 0) {
            var9 = (var8 - var10) * var7 / var8;
        }
        class235.field3379.method2342((byte) 0);
        int var11 = 8192;
        int var12 = (arg2.field8112 + arg2.field8109) / 2 - arg0;
        int var13 = (arg2.field8131 + arg2.field8107) / 2 - arg1;
        if (var12 != 0 || var13 != 0) {
            int var14 = (-((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D)) - 4096) - class460.field6249 & 0x3FFF;
            if (var14 > 8192) {
                var14 = 16384 - var14;
            }
            int var15;
            if (var6 <= 0) {
                var15 = 8192;
            } else if (var6 < 4096) {
                var15 = var6 * 8192 / 4096 + 8192;
            } else {
                var15 = 16384;
            }
            var11 = (16384 - var15 >> 1) + var14 * var15 / 8192;
        }
        if (arg2.field8114 != null) {
            arg2.field8114.method1235(var9);
            arg2.field8114.method1246(var11);
        } else if (arg2.field8102 >= 0) {
            int var16 = arg2.field8103 == 256 && arg2.field8117 == 256 ? 256 : class1.method10(arg2.field8103, false, arg2.field8117);
            if (arg2.field8108) {
                if (arg2.field8106 == null) {
                    arg2.field8106 = class253.method1660(class295.field4032, arg2.field8102);
                }
                if (arg2.field8106 != null) {
                    if (arg2.field8129 == null) {
                        arg2.field8129 = arg2.field8106.method1668(new int[] { 22050 });
                    }
                    if (arg2.field8129 != null) {
                        class161 var17 = class161.method1234(arg2.field8129, var16, var9 << 6, var11);
                        var17.method1237(-1);
                        class456.field6213.method350(var17);
                        arg2.field8114 = var17;
                    }
                }
            } else {
                class40 var18 = class40.method245(class312.field4256, arg2.field8102, 0);
                if (var18 != null) {
                    class221 var19 = var18.method243().method1516(class508.field6983);
                    class161 var20 = class161.method1234(var19, var16, var9 << 6, var11);
                    var20.method1237(-1);
                    class456.field6213.method350(var20);
                    arg2.field8114 = var20;
                }
            }
        }
        if (arg2.field8119 != null) {
            arg2.field8119.method1235(var9);
            arg2.field8119.method1246(var11);
            if (!arg2.field8119.method1208(-116)) {
                arg2.field8127 = null;
                arg2.field8119 = null;
                arg2.field8105 = null;
            }
        } else if (arg2.field8123 != null && (arg2.field8126 -= arg4) <= 0) {
            int var21 = arg2.field8103 == 256 && arg2.field8117 == 256 ? 256 : (int) (Math.random() * (double) (arg2.field8103 - arg2.field8117)) + arg2.field8117;
            if (arg2.field8118) {
                if (arg2.field8127 == null) {
                    int var26 = (int) ((double) arg2.field8123.length * Math.random());
                    arg2.field8127 = class253.method1660(class295.field4032, arg2.field8123[var26]);
                }
                if (arg2.field8127 != null) {
                    if (arg2.field8105 == null) {
                        arg2.field8105 = arg2.field8127.method1668(new int[] { 22050 });
                    }
                    if (arg2.field8105 != null) {
                        class161 var27 = class161.method1234(arg2.field8105, var21, var9 << 6, var11);
                        var27.method1237(0);
                        class456.field6213.method350(var27);
                        arg2.field8119 = var27;
                        arg2.field8126 = (int) (Math.random() * (double) (arg2.field8124 - arg2.field8111)) + arg2.field8111;
                    }
                }
            } else {
                int var22 = (int) (Math.random() * (double) arg2.field8123.length);
                class40 var23 = class40.method245(class312.field4256, arg2.field8123[var22], 0);
                if (var23 != null) {
                    class221 var24 = var23.method243().method1516(class508.field6983);
                    class161 var25 = class161.method1234(var24, var21, var9 << 6, var11);
                    var25.method1237(0);
                    class456.field6213.method350(var25);
                    arg2.field8119 = var25;
                    arg2.field8126 = (int) ((double) (arg2.field8124 - arg2.field8111) * Math.random()) + arg2.field8111;
                }
            }
        }
        int var28 = -116 % ((48 - arg3) / 38);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lbi;Lgka;Lha;I)V", line = 377)
    public static final void method2352(class508 arg0, class393 arg1, class66 arg2, int arg3) {
        field5311++;
        class604 var4 = arg1.method2385((byte) 9, arg2);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method220();
        if (var5 < var4.method214()) {
            var5 = var4.method214();
        }
        byte var6 = 10;
        int var7 = arg0.field6977;
        int var8 = arg0.field6981;
        int var9 = 0;
        if (arg3 != -3) {
            method2351(7, 22, null, -107, 104, -63);
        }
        int var10 = 0;
        int var11 = 0;
        if (arg1.field5395 != null) {
            var9 = class440.field5967.method1163(arg1.field5395, true, null, null, class207.field3114);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class207.field3114[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class410.field5616.method3366(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class410.field5616.method3364() * var9 + (class410.field5616.method3362() / 2);
        }
        int var15 = var5 / 2 + arg0.field6977;
        int var16 = arg0.field6981;
        if (var7 < (class64.field894 + var5)) {
            var15 = var5 / 2 + var6 + var10 / 2 + class64.field894 + 5;
            var7 = class64.field894;
        } else if (var7 > (class64.field908 - var5)) {
            var7 = class64.field908 - var5;
            var15 = class64.field908 - (var5 / 2 + var6) - (var10 / 2) - 5;
        }
        if (var8 < class64.field898 + var5) {
            var16 = class64.field898 + var6 + (var5 / 2);
            var8 = class64.field898;
        } else if (var8 > class64.field912 - var5) {
            var8 = class64.field912 - var5;
            var16 = class64.field912 - var6 - var11 - (var5 / 2);
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg0.field6977), (double) (var8 - arg0.field6981)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method3431((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg1.field5395 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var18 + var10 + 10;
            var21 = class410.field5616.method3364() * var9 + (var16 + 3);
            if (arg1.field5424 != 0) {
                arg2.method472(25692, var21 - var16, var18, var20 - var18, arg1.field5424, var16);
            }
            if (arg1.field5406 != 0) {
                arg2.method568(arg1.field5406, var18, var20 - var18, -123, var21 - var16, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class207.field3114[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class410.field5616.method3365(arg2, var23, var15, var16, arg1.field5396, true);
                var16 += class410.field5616.method3364();
            }
        }
        if (arg1.field5401 == -1 && arg1.field5395 == null) {
            return;
        }
        class24 var24 = new class24(arg0);
        int var25 = var5 >> 1;
        var24.field490 = var8 - var25;
        var24.field486 = var8 + var25;
        var24.field492 = var19;
        var24.field491 = var7 + var25;
        var24.field484 = var7 - var25;
        var24.field488 = var18;
        var24.field489 = var20;
        var24.field487 = var21;
        class497.field6805.method3594((byte) 118, var24);
    }
}
