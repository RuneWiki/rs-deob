import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class229 extends class5 {

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lnq;")
    private class325 field3259;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Lbe;")
    private class28 field3267;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Le;")
    private class376 field3279;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    private int field3271;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    private int field3278;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    private int field3268;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "[[F")
    private float[][] field3255;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "[[F")
    private float[][] field3261;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "[[F")
    private float[][] field3276;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Lnj;")
    private class164 field3266;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lns;")
    private class283 field3256;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Llp;")
    private class272 field3270;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Lvf;")
    private class105 field3264;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lms;")
    private class541 field3251;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Lm;")
    private class129 field3277;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lm;")
    private class129 field3257;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "[J")
    public static long[] field3258 = new long[32];

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3263 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "Luu;")
    public static class191 field3273;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([[ZIIII)V")
    public final void method1537(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field3275++;
        if (this.field3264 == null || this.field3252 > arg1 + arg2 || this.field3271 < arg1 - arg2 || this.field3278 > (arg2 + arg3) || arg4 != 255 || arg3 - arg2 > this.field3268) {
            return;
        }
        for (int var6 = this.field3278; var6 <= this.field3268; var6++) {
            for (int var7 = this.field3252; var7 <= this.field3271; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg3;
                if ((-arg2) < var8 && arg2 > var8 && var9 > (-arg2) && var9 < arg2 && arg0[arg2 + var8][arg2 + var9]) {
                    this.field3259.method2073((byte) -114, (int) (this.field3267.method253(true) * 255.0F) << 24);
                    this.field3259.method2092(this.field3277, null, null, this.field3257, arg4 + 18249);
                    this.field3259.method2065(4, 0, this.field3253, this.field3264, 63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ll;ILqa;IIII)V")
    public static final void method1538(class15 arg0, int arg1, class165 arg2, int arg3, int arg4, int arg5, int arg6) {
        field3272++;
        if (class357.field5502 < 100) {
            class75.method528(17020, arg0, arg2);
        }
        arg2.method739(arg5, arg3, arg1 + arg5, arg3 - -arg4);
        if (class357.field5502 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg5;
            arg2.method747(arg5, arg3, arg1, arg4, -16777216, 0);
            int var9 = arg3 + (arg4 / 2) - var7 - 18;
            arg2.method810(var8 - 152, var9, 304, 34, class354.field5481[class525.field7712].getRGB(), 0);
            arg2.method747(var8 - 150, var9 + 2, class357.field5502 * 3, 30, class322.field4670[class525.field7712].getRGB(), 0);
            class199.field2653.method1714(class509.field7482.method2705((byte) 69, class257.field3556), false, class80.field1141[class525.field7712].getRGB(), var7 + var9, -1, var8);
            return;
        }
        int var10 = class267.field3712 - (int) ((float) arg1 / class12.field223);
        int var11 = (int) ((float) arg4 / class12.field223) + class253.field3514;
        int var12 = (int) ((float) arg1 / class12.field223) + class267.field3712;
        int var13 = class253.field3514 - ((int) ((float) arg4 / class12.field223));
        class393.field6016 = class253.field3514 - ((int) ((float) arg4 / class12.field223));
        int var14 = -36 / ((arg6 + 37) / 58);
        class114.field1588 = (int) ((float) (arg4 * 2) / class12.field223);
        class394.field6028 = class267.field3712 - (int) ((float) arg1 / class12.field223);
        class352.field5442 = (int) ((float) (arg1 * 2) / class12.field223);
        class12.method127(class12.field247 + var10, class12.field245 + var11, class12.field247 + var12, class12.field245 + var13, arg5, arg3, arg5 + arg1, arg3 + 1 + arg4);
        class12.method119(arg2);
        class63 var15 = class12.method121(arg2);
        class332.method2146(0, 118, var15, arg2, 0);
        if (class84.field1223 > 0) {
            class150.field1970--;
            if (class150.field1970 == 0) {
                class150.field1970 = 20;
                class84.field1223--;
            }
        }
        if (!class32.field469) {
            return;
        }
        int var16 = arg1 + arg5 - 5;
        int var17 = arg3 + arg4 - 8;
        class94.field1380.method1713(-1, "Fps:" + class184.field2502, var17, 16776960, -1, var16);
        int var21 = var17 - 15;
        Runtime var18 = Runtime.getRuntime();
        int var19 = (int) ((var18.totalMemory() - var18.freeMemory()) / 1024L);
        int var20 = 16776960;
        if (var19 > 65536) {
            var20 = 16711680;
        }
        class94.field1380.method1713(-1, "Mem:" + var19 + "k", var21, var20, -1, var16);
        var17 = var21 - 15;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIIII)V")
    public static final void method1539(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 41 / ((-arg0 - 6) / 44);
        if (arg1 > arg3) {
            class221.method1489(class466.field6955[arg2], arg3, arg1, (byte) -30, arg4);
        } else {
            class221.method1489(class466.field6955[arg2], arg1, arg3, (byte) -30, arg4);
        }
        field3269++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BS)V")
    private final void method1540(byte arg0, short arg1) {
        if (arg0 >= -28) {
            method1538(null, -97, null, 41, -89, -78, -61);
        }
        if (this.field3259.field4974) {
            this.field3266.method1114(arg1, 117);
        } else {
            this.field3266.method1111(arg1, 21251);
        }
        field3260++;
        this.field3253++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public static final void method1541(int arg0, int arg1) {
        if (arg1 != 30916) {
            field3273 = null;
        }
        field3250++;
        class177 var2 = class344.method2229(4, arg0, (byte) 85);
        var2.method1194(-55);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII)V")
    private final void method1542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3262++;
        long var8 = -1L;
        int var10 = (arg2 << this.field3279.field341) + arg4;
        int var11 = (arg0 << this.field3279.field341) + arg6;
        int var12 = this.field3279.method218(var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class5 var13 = this.field3270.method1747(var8, false);
            if (var13 != null) {
                this.method1540((byte) -70, ((class510) var13).field7492);
                return;
            }
        }
        short var14 = (short) (this.field3274++);
        if (var8 != -1L) {
            this.field3270.method1751(var8, -89, new class510(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg6 == 0) {
            var15 = this.field3276[arg3][arg1];
            var16 = this.field3255[arg3][arg1];
            var17 = this.field3261[arg3][arg1];
        } else if (this.field3279.field336 == arg4 && arg6 == 0) {
            var16 = this.field3255[arg3 + 1][arg1];
            var17 = this.field3261[arg3 + 1][arg1];
            var15 = this.field3276[arg3 + 1][arg1];
        } else if (this.field3279.field336 == arg4 && this.field3279.field336 == arg6) {
            var15 = this.field3276[arg3 + 1][arg1 + 1];
            var17 = this.field3261[arg3 + 1][arg1 + 1];
            var16 = this.field3255[arg3 + 1][arg1 + 1];
        } else if (arg4 == 0 && this.field3279.field336 == arg6) {
            var16 = this.field3255[arg3][arg1 + 1];
            var15 = this.field3276[arg3][arg1 + 1];
            var17 = this.field3261[arg3][arg1 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field3279.field336;
            float var19 = (float) arg6 / (float) this.field3279.field336;
            float var20 = this.field3261[arg3][arg1];
            float var21 = this.field3276[arg3][arg1];
            float var22 = this.field3255[arg3][arg1];
            float var23 = this.field3261[arg3 + 1][arg1];
            float var24 = this.field3276[arg3 + 1][arg1];
            float var25 = (this.field3261[arg3][arg1 + 1] - var20) * var18 + var20;
            float var26 = (this.field3255[arg3][arg1 + 1] - var22) * var18 + var22;
            float var27 = this.field3255[arg3 + 1][arg1];
            float var28 = (this.field3261[arg3 + 1][arg1 + 1] - var23) * var18 + var23;
            float var29 = (this.field3276[arg3][arg1 + 1] - var21) * var18 + var21;
            float var30 = (this.field3276[arg3 + 1][arg1 + 1] - var24) * var18 + var24;
            var17 = (var28 - var25) * var19 + var25;
            var15 = (var30 - var29) * var19 + var29;
            float var31 = (this.field3255[arg3 + 1][arg1 + 1] - var27) * var18 + var27;
            var16 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field3267.method257(-60) - var10);
        float var33 = (float) (this.field3267.method250((byte) 90) - var12);
        float var34 = (float) (this.field3267.method255(-7164) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field3267.method252(76);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3267.method254(true);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field3259.field4974) {
            this.field3256.method1821(-8443, (float) var10);
            this.field3256.method1821(-8443, (float) var12);
            this.field3256.method1821(-8443, (float) var11);
        } else {
            this.field3256.method1823(32, (float) var10);
            this.field3256.method1823(32, (float) var12);
            this.field3256.method1823(32, (float) var11);
        }
        this.field3256.method1072((byte) 102, var45);
        this.field3256.method1072((byte) 102, var46);
        this.field3256.method1072((byte) 102, var47);
        this.field3256.method1072((byte) 102, 255);
        int var48 = 75 / ((arg5 + 78) / 43);
        this.method1540((byte) -121, var14);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)V")
    public static final void method1543(boolean arg0, int arg1) {
        if (arg0 && class12.field209 != null) {
            class478.field7079 = class12.field209.field6643;
        } else {
            class478.field7079 = -1;
        }
        field3265++;
        class357.field5502 = 0;
        class372.field5663 = null;
        class12.field209 = null;
        class120.field1643 = null;
        class12.method113();
        class12.field216.method450((byte) 73);
        class370.field5640 = null;
        class291.field4259 = -1;
        class437.field6614 = null;
        class175.field2345 = null;
        class12.field219 = null;
        class331.field5169 = null;
        class376.field5712 = -1;
        class429.field6539 = null;
        class323.field4676 = null;
        class91.field1335 = null;
        class24.field354 = null;
        class112.field1564 = null;
        class12.field210.method1847(false);
        class12.field213.method974(arg1, 64, false);
        class12.field210.method1850(128, 64, arg1 - 59);
        class12.field211.method1869((byte) -124, 64);
        class102.field1481.method195(64, (byte) -42);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjt;)Z")
    public static final boolean method1544(int arg0, class68 arg1) {
        int var2 = 106 % ((-arg0 - 63) / 40);
        field3254++;
        class209 var3 = class432.field6575.method1872(arg1.method338(87), false);
        if (var3.field2939 == -1) {
            return true;
        } else {
            class53 var4 = class244.field3413.method976(false, var3.field2939);
            return var4.field745 == -1 ? true : var4.method391((byte) 55);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1545(int arg0) {
        field3258 = null;
        int var1 = 68 / ((arg0 + 25) / 63);
        field3273 = null;
        field3263 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lnq;Le;Lbe;[I)V")
    public class229(class325 arg0, class376 arg1, class28 arg2, int[] arg3) {
        this.field3259 = arg0;
        this.field3267 = arg2;
        this.field3279 = arg1;
        int var5 = this.field3267.method252(99) - (arg1.field336 >> 1);
        this.field3252 = this.field3267.method257(-42) - var5 >> arg1.field341;
        this.field3271 = var5 + this.field3267.method257(-41) >> arg1.field341;
        this.field3278 = this.field3267.method255(-7164) - var5 >> arg1.field341;
        this.field3268 = this.field3267.method255(-7164) + var5 >> arg1.field341;
        int var6 = this.field3271 + 1 - this.field3252;
        int var7 = this.field3268 + 1 - this.field3278;
        this.field3255 = new float[var6 + 1][var7 + 1];
        this.field3261 = new float[var6 + 1][var7 + 1];
        this.field3276 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field3278 + var8;
            if (var24 > 0 && this.field3279.field337 - 1 > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field3252 + var25;
                    if (var26 > 0 && var26 < this.field3279.field340 - 1) {
                        int var27 = arg1.method222(var26 + 1, var24) - arg1.method222(var26 - 1, var24);
                        int var28 = arg1.method222(var26, var24 + 1) - arg1.method222(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + var28 * var28 + 65536)));
                        this.field3261[var25][var8] = (float) var27 * var29;
                        this.field3276[var25][var8] = var29 * -256.0F;
                        this.field3255[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field3278; var11 <= this.field3268; var11++) {
            if (var11 >= 0 && var11 < arg1.field337) {
                for (int var21 = this.field3252; var21 <= this.field3271; var21++) {
                    if (var21 >= 0 && arg1.field340 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field5720[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field3271 - this.field3252;
            }
        }
        if (var9 > 0) {
            this.field3266 = new class164(var9 * 2);
            this.field3256 = new class283(var9 * 16);
            this.field3270 = new class272(class475.method2835(var9, -1));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field3278; var14 <= this.field3268; var14++) {
                if (var14 >= 0 && arg1.field337 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field3252; var16 <= this.field3271; var16++) {
                        if (var16 >= 0 && var16 < arg1.field340) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field5720[var16][var14];
                            int[] var19 = arg1.field5705[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1542(var14, var13, var16, var15, var18[var20], -121, var19[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method1542(var14, var13, var16, var15, 0, -9, 0);
                                    this.method1542(var14, var13, var16, var15, arg1.field336, 21, 0);
                                    this.method1542(var14, var13, var16, var15, 0, -125, arg1.field336);
                                } else if (var17 == 2) {
                                    this.method1542(var14, var13, var16, var15, arg1.field336, -123, 0);
                                    this.method1542(var14, var13, var16, var15, arg1.field336, 32, arg1.field336);
                                    this.method1542(var14, var13, var16, var15, 0, -124, 0);
                                } else if (var17 == 5) {
                                    this.method1542(var14, var13, var16, var15, arg1.field336, -123, arg1.field336);
                                    this.method1542(var14, var13, var16, var15, 0, -127, arg1.field336);
                                    this.method1542(var14, var13, var16, var15, arg1.field336, 14, 0);
                                } else if (var17 == 4) {
                                    this.method1542(var14, var13, var16, var15, 0, -122, arg1.field336);
                                    this.method1542(var14, var13, var16, var15, 0, 72, 0);
                                    this.method1542(var14, var13, var16, var15, arg1.field336, 38, arg1.field336);
                                }
                            }
                        }
                        var12++;
                        var15++;
                    }
                } else {
                    var12 += this.field3271 - this.field3252;
                }
                var13++;
            }
            this.field3264 = this.field3259.method2094(false, this.field3266.field2185, 5123, true, this.field3266.field2219);
            this.field3251 = this.field3259.method2048(this.field3256.field2219, this.field3256.field2185, -1, false, 16);
            this.field3277 = new class129(this.field3251, 5126, 3, 0);
            this.field3257 = new class129(this.field3251, 5121, 4, 12);
        } else {
            this.field3264 = null;
            this.field3251 = null;
            this.field3277 = null;
            this.field3257 = null;
        }
        this.field3266 = null;
        this.field3261 = this.field3276 = this.field3255 = null;
        this.field3270 = null;
        this.field3256 = null;
    }
}
