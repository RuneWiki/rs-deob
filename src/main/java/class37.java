import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class37 implements Runnable {

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field680 = 0;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field682 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field673 = 0;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Lsd;")
    public static class166 field683 = class135.method935(")2", 0);

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Lsd;")
    private static class166 field684 = class135.method935("Unable to connect)3", 0);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lsd;")
    public static class166 field674 = class135.method935(" zuerst von Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lsd;")
    public static class166 field675 = field684;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Lsd;")
    public static class166 field678 = field684;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lb;")
    public static class11 field676 = new class11(64);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static final void method258(byte arg0) {
        if (arg0 == 34) {
            class108.field2095.method71(500);
            field685++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B[Lvd;I)V")
    public static final void method259(byte arg0, class193[] arg1, int arg2) {
        field677++;
        int var3 = 0;
        if (arg0 <= 108) {
            field680 = 28;
        }
        while (arg1.length > var3) {
            class193 var4 = arg1[var3];
            if (var4 != null && var4.field3762 == arg2 && (!var4.field3841 || !class11.method65(var4, -1))) {
                label97: {
                    if (var4.field3797 == 0) {
                        if (!var4.field3841 && class11.method65(var4, -1) && class160.field3065 != var4) {
                            break label97;
                        }
                        method259((byte) 116, arg1, var4.field3715);
                        if (var4.field3829 != null) {
                            method259((byte) 125, var4.field3829, var4.field3715);
                        }
                        class54 var5 = (class54) class103.field2017.method224(-1, (long) var4.field3715);
                        if (var5 != null) {
                            class99.method741(var5.field1023, (byte) -25);
                        }
                    }
                    if (var4.field3797 == 6) {
                        if (var4.field3802 != -1 || var4.field3800 != -1) {
                            boolean var6 = class169.method1168(0, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field3800;
                            } else {
                                var7 = var4.field3802;
                            }
                            if (var7 != -1) {
                                class62 var8 = class110.method798(var7, 12);
                                var4.field3732 += class187.field3570;
                                while (var8.field1268[var4.field3745] < var4.field3732) {
                                    var4.field3732 -= var8.field1268[var4.field3745];
                                    var4.field3745++;
                                    if (var4.field3745 >= var8.field1279.length) {
                                        var4.field3745 -= var8.field1267;
                                        if (var4.field3745 < 0 || var4.field3745 >= var8.field1279.length) {
                                            var4.field3745 = 0;
                                        }
                                    }
                                    class68.method550(var4, 15);
                                }
                            }
                        }
                        if (var4.field3763 != 0 && !var4.field3841) {
                            int var9 = var4.field3763 << 16 >> 16;
                            int var10 = var4.field3763 >> 16;
                            int var11 = class187.field3570 * var9;
                            var4.field3764 = var4.field3764 + var11 & 0x7FF;
                            int var12 = class187.field3570 * var10;
                            var4.field3709 = var4.field3709 + var12 & 0x7FF;
                            class68.method550(var4, 15);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method260(int arg0) {
        field683 = null;
        field678 = null;
        field674 = null;
        field675 = null;
        field684 = null;
        field676 = null;
        if (arg0 != 1) {
            field680 = 52;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static final void method261(boolean arg0) {
        class116.field2247.method71(500);
        field672++;
        class5.field106.method71(500);
        if (!arg0) {
            method261(false);
        }
    }

    @OriginalMember(owner = "client!dh", name = "run", descriptor = "()V")
    public final void run() {
        field679++;
        try {
            while (true) {
                class165 var1 = class137.field2671;
                class153 var2;
                synchronized (class137.field2671) {
                    var2 = (class153) class137.field2671.method1109((byte) -123);
                }
                if (var2 == null) {
                    class189.method1260(100L, 1);
                    Object var3 = class89.field1751;
                    synchronized (class89.field1751) {
                        if (class32.field586 <= 1) {
                            class32.field586 = 0;
                            class89.field1751.notifyAll();
                            return;
                        }
                        class32.field586--;
                    }
                } else {
                    if (var2.field2946 == 0) {
                        var2.field2948.method684(var2.field2953, 0, (int) var2.field2541, var2.field2953.length);
                        class165 var4 = class137.field2671;
                        synchronized (class137.field2671) {
                            var2.method915(0);
                        }
                    } else if (var2.field2946 == 1) {
                        var2.field2953 = var2.field2948.method689((int) var2.field2541, 255);
                        class165 var5 = class137.field2671;
                        synchronized (class137.field2671) {
                            class119.field2329.method1112(-1250931468, var2);
                        }
                    }
                    Object var6 = class89.field1751;
                    synchronized (class89.field1751) {
                        if (class32.field586 <= 1) {
                            class32.field586 = 0;
                            class89.field1751.notifyAll();
                            return;
                        }
                        class32.field586 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class32.method238((byte) -65, var17, null);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lvd;II)I")
    public static final int method262(class193 arg0, int arg1, int arg2) {
        field681++;
        if (arg0.field3714 == null || arg0.field3714.length <= arg2) {
            return -2;
        }
        try {
            int[] var3 = arg0.field3714[arg2];
            byte var4 = 0;
            int var5 = -73 % ((6 - arg1) / 50);
            int var6 = 0;
            int var7 = 0;
            while (true) {
                int var8 = var3[var6++];
                int var9 = 0;
                byte var10 = 0;
                if (var8 == 0) {
                    return var7;
                }
                if (var8 == 1) {
                    var9 = class135.field2609[var3[var6++]];
                }
                if (var8 == 15) {
                    var10 = 1;
                }
                if (var8 == 2) {
                    var9 = class60.field1231[var3[var6++]];
                }
                if (var8 == 16) {
                    var10 = 2;
                }
                if (var8 == 17) {
                    var10 = 3;
                }
                if (var8 == 3) {
                    var9 = class12.field238[var3[var6++]];
                }
                if (var8 == 4) {
                    int var11 = var3[var6++] << 16;
                    int var12 = var11 + var3[var6++];
                    class193 var13 = class90.method701(-31355, var12);
                    int var14 = var3[var6++];
                    if (var14 != -1 && (!class3.method19(var14, true).field1118 || class121.field2369)) {
                        for (int var15 = 0; var15 < var13.field3755.length; var15++) {
                            if (var14 + 1 == var13.field3755[var15]) {
                                var9 += var13.field3760[var15];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var9 = class91.field1785[var3[var6++]];
                }
                if (var8 == 6) {
                    var9 = class23.field390[class60.field1231[var3[var6++]] - 1];
                }
                if (var8 == 7) {
                    var9 = class91.field1785[var3[var6++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var9 = class41.field728.field2421;
                }
                if (var8 == 9) {
                    for (int var16 = 0; var16 < 25; var16++) {
                        if (class75.field1539[var16]) {
                            var9 += class60.field1231[var16];
                        }
                    }
                }
                if (var8 == 10) {
                    int var17 = var3[var6++] << 16;
                    int var18 = var17 + var3[var6++];
                    class193 var19 = class90.method701(-31355, var18);
                    int var20 = var3[var6++];
                    if (var20 != -1 && (!class3.method19(var20, true).field1118 || class121.field2369)) {
                        for (int var21 = 0; var21 < var19.field3755.length; var21++) {
                            if (var20 + 1 == var19.field3755[var21]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var9 = class10.field194;
                }
                if (var8 == 12) {
                    var9 = class42.field744;
                }
                if (var8 == 13) {
                    int var22 = class91.field1785[var3[var6++]];
                    int var23 = var3[var6++];
                    var9 = (0x1 << var23 & var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var24 = var3[var6++];
                    var9 = class88.method698(0, var24);
                }
                if (var8 == 18) {
                    var9 = (class41.field728.field3526 >> 7) + class170.field3279;
                }
                if (var8 == 19) {
                    var9 = (class41.field728.field3513 >> 7) + class147.field2901;
                }
                if (var8 == 20) {
                    var9 = var3[var6++];
                }
                if (var10 == 0) {
                    if (var4 == 0) {
                        var7 += var9;
                    }
                    if (var4 == 1) {
                        var7 -= var9;
                    }
                    if (var4 == 2 && var9 != 0) {
                        var7 /= var9;
                    }
                    if (var4 == 3) {
                        var7 *= var9;
                    }
                    var4 = 0;
                } else {
                    var4 = var10;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }
}
