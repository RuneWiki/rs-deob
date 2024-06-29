import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class377 extends class118 {

    @OriginalMember(owner = "client!us", name = "O", descriptor = "I")
    private int field5498 = 4;

    @OriginalMember(owner = "client!us", name = "U", descriptor = "I")
    private int field5504 = 4;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "I")
    public static int field5497 = 1;

    @OriginalMember(owner = "client!us", name = "S", descriptor = "Lnn;")
    public static class151 field5502 = new class151("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!us", name = "K", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!us", name = "P", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!us", name = "Q", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!us", name = "R", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!us", name = "T", descriptor = "Liq;")
    public static class134 field5503;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIILrm;II)V")
    public static final void method2267(int arg0, int arg1, int arg2, class71 arg3, int arg4, int arg5) {
        ++field5501;
        if (arg3.field921 != -1 || arg3.field925 != null) {
            int var6 = 0;
            if (~arg1 < ~arg3.field908) {
                var6 += -arg3.field908 + arg1;
            } else if (~arg3.field923 < ~arg1) {
                var6 += -arg1 + arg3.field923;
            }
            int var7 = client.field6666 * arg3.field909 >> 8;
            if (arg3.field929 < arg5) {
                var6 += -arg3.field929 + arg5;
            } else if (arg5 < arg3.field927) {
                var6 += arg3.field927 - arg5;
            }
            if (~arg3.field910 != -1 && var6 - 64 <= arg3.field910 && ~client.field6666 != -1 && ~arg3.field924 == ~arg4) {
                var6 -= 64;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (arg0 != -4935) {
                    method2270((class170) null, 38, (class261) null);
                }
                int var8 = (arg3.field910 - var6) * var7 / arg3.field910;
                if (arg3.field919 == null) {
                    if (~arg3.field921 <= -1) {
                        class23 var9 = class23.method146(class435.field6408, arg3.field921, 0);
                        if (var9 != null) {
                            class2 var10 = var9.method148().method18(class165.field2298);
                            class444 var11 = class444.method2740(var10, 100, var8);
                            var11.method2737(-1);
                            class267.field4077.method2133(var11);
                            arg3.field919 = var11;
                        }
                    }
                } else {
                    arg3.field919.method2721(var8);
                }
                if (arg3.field916 == null) {
                    if (arg3.field925 != null && (arg3.field922 -= arg2) <= 0) {
                        int var12 = (int) ((double) arg3.field925.length * Math.random());
                        class23 var13 = class23.method146(class435.field6408, arg3.field925[var12], 0);
                        if (var13 != null) {
                            class2 var14 = var13.method148().method18(class165.field2298);
                            class444 var15 = class444.method2740(var14, 100, var8);
                            var15.method2737(0);
                            class267.field4077.method2133(var15);
                            arg3.field916 = var15;
                            arg3.field922 = (int) (Math.random() * (double) (-arg3.field912 + arg3.field907)) + arg3.field912;
                            return;
                        }
                    }
                } else {
                    arg3.field916.method2721(var8);
                    if (arg3.field916.method624(arg0 + 23586)) {
                        return;
                    }
                    arg3.field916 = null;
                }
            } else {
                if (arg3.field919 != null) {
                    class267.field4077.method2135(arg3.field919);
                    arg3.field919 = null;
                }
                if (arg3.field916 != null) {
                    class267.field4077.method2135(arg3.field916);
                    arg3.field916 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field5494;
        if (arg0) {
            this.method195(false, -108);
        }
        int[][] var3 = super.field1549.method2013(arg1, !arg0);
        if (super.field1549.field4903) {
            int var4 = class440.field6474 / this.field5498;
            int var5 = class289.field4403 / this.field5504;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method708(0, (byte) 72, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method708(class289.field4403 * var7 / var5, (byte) -90, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class440.field6474 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class440.field6474 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "(I)V")
    public static void method2268(int arg0) {
        field5503 = null;
        field5502 = null;
        if (arg0 != -9724) {
            method2269((byte) 1);
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V")
    public static final void method2269(byte arg0) {
        class131.field1670.method1485(-22032);
        ++field5491;
        if (arg0 < 94) {
            field5497 = -116;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 != 1) {
            method2270((class170) null, 41, (class261) null);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field5504 = arg2.method2343(255);
            }
        } else {
            this.field5498 = arg2.method2343(255);
        }
        ++field5492;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lfh;ILdr;)V")
    public static final void method2270(class170 arg0, int arg1, class261 arg2) {
        ++field5499;
        if (arg1 == 0) {
            boolean var3 = class186.field2796.method1115(arg0.field2539 | -16777216, arg0.field2545, -67, arg0.field2543, arg0.field2592, arg2, arg0.field2593, arg0.field2532 ? class113.field1500.field2443 : null) == null;
            if (var3) {
                class55.field735.method2504(42, new class450(arg0.field2592, arg0.field2545, arg0.field2593, arg0.field2539 | -16777216, arg0.field2543, arg0.field2532));
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field5495;
        int[] var3 = super.field1537.method2395(arg0 + 30962, arg1);
        if (arg0 != 1) {
            method2267(35, 124, 39, (class71) null, -1, -128);
        }
        if (super.field1537.field5756) {
            int var4 = class440.field6474 / this.field5498;
            int var5 = class289.field4403 / this.field5504;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method703(0, class289.field4403 * var6 / var5, -2);
            } else {
                var7 = this.method703(0, 0, -2);
            }
            for (int var8 = 0; ~class440.field6474 < ~var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class440.field6474 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
    public class377() {
        super(1, false);
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(III)V")
    public static final void method2271(int arg0, int arg1, int arg2) {
        if (class440.field6474 != arg2) {
            class6.field73 = new int[arg2];
            for (int var3 = 0; ~arg2 < ~var3; ++var3) {
                class6.field73[var3] = (var3 << 12) / arg2;
            }
            class440.field6474 = arg2;
            class87.field1230 = arg2 + -1;
            class466.field6857 = arg2 * 32;
        }
        if (arg1 != 2016454732) {
            field5497 = 96;
        }
        ++field5493;
        if (class289.field4403 != arg0) {
            if (~class440.field6474 != ~arg0) {
                class160.field2210 = new int[arg0];
                for (int var4 = 0; ~var4 > ~arg0; ++var4) {
                    class160.field2210[var4] = (var4 << 12) / arg0;
                }
            } else {
                class160.field2210 = class6.field73;
            }
            class289.field4403 = arg0;
            class438.field6441 = arg0 + -1;
        }
    }

    @OriginalMember(owner = "client!us", name = "g", descriptor = "(I)V")
    public static final void method2272(int arg0) {
        ++field5500;
        if (arg0 != 30396) {
            method2268(59);
        }
        class241 var1 = class295.field4482;
        synchronized (class295.field4482) {
            class295.field4482.method1485(-22032);
        }
        class241 var2 = class186.field2797;
        synchronized (class186.field2797) {
            class186.field2797.method1485(-22032);
        }
    }
}
