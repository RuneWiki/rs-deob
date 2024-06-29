import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class156 extends class224 {

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    private int field2469 = 4096;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Luf;")
    public static class168 field2462 = class148.method1019(-1720, "leuchten2:");

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Lej;")
    public static class204 field2465 = new class204(5);

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "[F")
    public static float[] field2470 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "Luf;")
    public static class168 field2472 = class148.method1019(-1720, ":duelstake:");

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Ldk;")
    public static class241 field2460;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "[[Lvk;")
    public static class192[][] field2471;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZLj;)V", line = 6)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field2469 = arg2.method1069(90);
        }
        field2464++;
        if (arg1) {
            field2471 = (class192[][]) ((class192[][]) null);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILtb;)V", line = 25)
    public static final void method1107(int arg0, class189 arg1) {
        arg1.field3045 = arg1.field3002;
        field2459++;
        if (arg1.field2997 == 0) {
            arg1.field3016 = 0;
            return;
        }
        if (arg1.field3044 != -1 && arg1.field3005 == 0) {
            class190 var2 = class119.method858(true, arg1.field3044);
            if (arg1.field3043 > 0 && var2.field3095 == 0) {
                arg1.field3016++;
                return;
            }
            if (arg1.field3043 <= 0 && var2.field3072 == 0) {
                arg1.field3016++;
                return;
            }
        }
        int var3 = arg1.field3027;
        int var4 = arg1.field3021;
        int var5 = arg1.field3020[arg1.field2997 - 1] * 128 + arg1.field3012 * 64;
        int var6 = arg1.field3033[arg1.field2997 - 1] * 128 + arg1.field3012 * 64;
        if (var5 - var3 > 256 || (var5 - var3) < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg1.field3027 = var5;
            arg1.field3021 = var6;
            return;
        }
        if (var5 <= var3) {
            if (var3 > var5) {
                if (var4 < var6) {
                    arg1.field3037 = 768;
                } else if (var6 >= var4) {
                    arg1.field3037 = 512;
                } else {
                    arg1.field3037 = 256;
                }
            } else if (var4 < var6) {
                arg1.field3037 = 1024;
            } else if (var6 < var4) {
                arg1.field3037 = 0;
            }
        } else if (var4 < var6) {
            arg1.field3037 = 1280;
        } else if (var4 > var6) {
            arg1.field3037 = 1792;
        } else {
            arg1.field3037 = 1536;
        }
        int var7 = arg1.field3037 - arg1.field3008 & 0x7FF;
        boolean var8 = true;
        if (arg0 < 54) {
            return;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg1.field3049;
        if (var7 >= -256 && var7 <= 256) {
            var9 = arg1.field3056;
        } else if (var7 >= 256 && var7 < 768) {
            var9 = arg1.field3038;
        } else if (var7 >= -768 && var7 <= -256) {
            var9 = arg1.field3024;
        }
        if (var9 == -1) {
            var9 = arg1.field3056;
        }
        int var10 = 4;
        arg1.field3045 = var9;
        if (arg1 instanceof class22) {
            var8 = ((class22) arg1).field267.field3214;
        }
        if (var8) {
            if (arg1.field3037 != arg1.field3008 && arg1.field3029 == -1 && arg1.field3052 != 0) {
                var10 = 2;
            }
            if (arg1.field2997 > 2) {
                var10 = 6;
            }
            if (arg1.field2997 > 3) {
                var10 = 8;
            }
            if (arg1.field3016 > 0 && arg1.field2997 > 1) {
                arg1.field3016--;
                var10 = 8;
            }
        } else {
            if (arg1.field2997 > 1) {
                var10 = 6;
            }
            if (arg1.field2997 > 2) {
                var10 = 8;
            }
            if (arg1.field3016 > 0 && arg1.field2997 > 1) {
                var10 = 8;
                arg1.field3016--;
            }
        }
        if (arg1.field3032[arg1.field2997 - 1]) {
            var10 <<= 0x1;
        }
        if (var5 > var3) {
            arg1.field3027 += var10;
            if (var5 < arg1.field3027) {
                arg1.field3027 = var5;
            }
        } else if (var5 < var3) {
            arg1.field3027 -= var10;
            if (var5 > arg1.field3027) {
                arg1.field3027 = var5;
            }
        }
        if (var4 < var6) {
            arg1.field3021 += var10;
            if (arg1.field3021 > var6) {
                arg1.field3021 = var6;
            }
        } else if (var4 > var6) {
            arg1.field3021 -= var10;
            if (arg1.field3021 < var6) {
                arg1.field3021 = var6;
            }
        }
        if (arg1.field3027 == var5 && arg1.field3021 == var6) {
            if (arg1.field3043 > 0) {
                arg1.field3043--;
            }
            arg1.field2997--;
        }
        if (var10 >= 8 && arg1.field3056 == arg1.field3045 && arg1.field3004 != -1) {
            arg1.field3045 = arg1.field3004;
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V", line = 236)
    public static final void method1108(byte arg0) {
        if (arg0 <= 66) {
            field2462 = (class168) null;
        }
        class284.method1960(0, 0, 15);
        field2461++;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V", line = 252)
    public static void method1109(int arg0) {
        if (arg0 != 1) {
            method1110((byte) 61, (class241) null, (class241) null);
        }
        field2470 = null;
        field2460 = null;
        field2462 = null;
        field2471 = (class192[][]) null;
        field2472 = null;
        field2465 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLdk;Ldk;)I", line = 278)
    public static final int method1110(byte arg0, class241 arg1, class241 arg2) {
        field2468++;
        int var3 = 0;
        if (arg0 != 115) {
            return -22;
        }
        if (arg2.method1648(class31.field384, false)) {
            var3++;
        }
        if (arg2.method1648(class17.field185, false)) {
            var3++;
        }
        if (arg2.method1648(class159.field2504, false)) {
            var3++;
        }
        if (arg1.method1648(class31.field384, false)) {
            var3++;
        }
        if (arg1.method1648(class17.field185, false)) {
            var3++;
        }
        if (arg1.method1648(class159.field2504, false)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)[I", line = 313)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = -71 / ((20 - arg0) / 51);
        field2467++;
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int[] var5 = this.method1537(class169.field2777 & arg1 - 1, 0, 0);
            int[] var6 = this.method1537(arg1, 0, 0);
            int[] var7 = this.method1537(class169.field2777 & arg1 + 1, 0, 0);
            for (int var8 = 0; var8 < class187.field2961; var8++) {
                int var9 = (var7[var8] - var5[var8]) * this.field2469;
                int var10 = var9 >> 12;
                int var11 = (var6[class205.field3363 & var8 + 1] - var6[var8 - 1 & class205.field3363]) * this.field2469;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = var10 * var10 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var14 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = var15 == 0 ? 0 : 16777216 / var15;
                var4[var8] = 4096 - var16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 369)
    public class156() {
        super(1, true);
    }
}
