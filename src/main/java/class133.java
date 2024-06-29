import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class133 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    private int field2738 = -1;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    private int field2742 = 0;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lcf;")
    private class25 field2737 = new class25();

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "Z")
    public boolean field2757 = false;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    private int field2754;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "[[[I")
    private int[][][] field2751;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[Lwg;")
    private class204[] field2753;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    private int field2739;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[I")
    public static int[] field2744 = new int[256];

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Lcd;")
    public static class23 field2748;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "[I")
    public static int[] field2756;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "[S")
    public static short[] field2750;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILje;)V")
    public static final void method845(int arg0, class85 arg1) {
        field2749++;
        if (class151.field3026) {
            class110.method710(false, arg1);
            return;
        }
        if (class43.field911 == 1 && class65.field1535 >= 715 && class43.field912 >= 453) {
            class175.field3489 = !class175.field3489;
            if (class175.field3489) {
                class156.method959(1);
            } else {
                class39.method323(255, class105.field2280, false, class108.field2299, class193.field3812, (byte) -5);
            }
        }
        if (arg0 > -25) {
            method851(54);
        }
        if (class52.field1239 == 5) {
            return;
        }
        class49.field1190++;
        if (class52.field1239 != 10) {
            return;
        }
        if (class124.field2552 != 2 && class145.field2956 == 0) {
            if (class43.field911 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 100;
                byte var5 = 35;
                if (class65.field1535 >= var2 && var2 + var4 >= class65.field1535 && class43.field912 >= var3 && class43.field912 <= var3 + var5) {
                    method847(0);
                    return;
                }
            }
            if (class144.field2947 != null) {
                method847(0);
            }
        }
        int var6 = class43.field911;
        int var7 = class65.field1535;
        int var8 = class43.field912;
        if (class21.field441 == 0) {
            short var9 = 302;
            short var10 = 291;
            if (var6 == 1 && var9 - 75 <= var7 && var7 <= var9 + 75 && var8 >= var10 - 20 && var8 <= var10 + 20) {
                class74.field1694 = 0;
                class21.field441 = 3;
            }
            short var11 = 462;
            boolean var12 = false;
            if (class199.field3894 != 0) {
                while (class81.method552((byte) 53)) {
                    if (class67.field1581 == 84) {
                        var12 = true;
                        break;
                    }
                }
            }
            if (var12 || var6 == 1 && var11 - 75 <= var7 && var11 + 75 >= var7 && var10 - 20 <= var8 && var10 + 20 >= var8) {
                class21.field441 = 2;
                class105.field2276 = class39.field808;
                class105.field2268 = class199.field3915;
                class105.field2278 = class39.field835;
                class74.field1694 = 0;
            }
        } else if (class21.field441 == 2) {
            short var13 = 231;
            int var21 = var13 + 30;
            if (var6 == 1 && var8 >= var21 - 15 && var21 > var8) {
                class74.field1694 = 0;
            }
            var21 += 15;
            short var14 = 302;
            if (var6 == 1 && var21 - 15 <= var8 && var8 < var21) {
                class74.field1694 = 1;
            }
            var21 += 15;
            short var15 = 321;
            if (var6 == 1 && var7 >= var14 - 75 && var7 <= var14 + 75 && var15 - 20 <= var8 && var8 <= var15 + 20) {
                class105.field2284 = class105.field2284.method167(-101).method164(-12065);
                if (class105.field2284.method143(-41) == 0) {
                    class180.method1118(class84.field1790, class39.field817, 24353, class39.field809);
                } else if (class105.field2274.method143(-41) == 0) {
                    class180.method1118(class10.field188, class39.field829, 24353, class39.field820);
                } else {
                    class180.method1118(class134.field2793, class39.field826, 24353, class39.field840);
                    class48.method379(20, (byte) 18);
                }
            } else {
                short var16 = 462;
                if (var6 == 1 && var7 >= var16 - 75 && var7 <= var16 + 75 && var15 - 20 <= var8 && var15 + 20 >= var8) {
                    class21.field441 = 0;
                    class105.field2274 = class105.field2280;
                    class105.field2284 = class105.field2280;
                }
                while (true) {
                    boolean var17;
                    label243: do {
                        while (class81.method552((byte) 53)) {
                            var17 = false;
                            for (int var18 = 0; var18 < class20.field416.method143(-41); var18++) {
                                if (class168.field3351 == class20.field416.method160(var18, 255)) {
                                    var17 = true;
                                    break;
                                }
                            }
                            if (class74.field1694 != 0) {
                                continue label243;
                            }
                            if (class67.field1581 == 85 && class105.field2284.method143(-41) > 0) {
                                class105.field2284 = class105.field2284.method156(0, class105.field2284.method143(-41) - 1, -118);
                            }
                            if (class67.field1581 == 84 || class67.field1581 == 80) {
                                class74.field1694 = 1;
                            }
                            if (var17 && class105.field2284.method143(-41) < 12) {
                                class105.field2284 = class105.field2284.method157((byte) -103, class168.field3351);
                            }
                        }
                        return;
                    } while (class74.field1694 != 1);
                    if (class67.field1581 == 85 && class105.field2274.method143(-41) > 0) {
                        class105.field2274 = class105.field2274.method156(0, class105.field2274.method143(-41) - 1, -85);
                    }
                    if (class67.field1581 == 84 || class67.field1581 == 80) {
                        class74.field1694 = 0;
                    }
                    if (class199.field3894 != 0 && class67.field1581 == 84) {
                        class105.field2284 = class105.field2284.method167(-75).method164(-12065);
                        if (class105.field2284.method143(-41) == 0) {
                            class180.method1118(class84.field1790, class39.field817, 24353, class39.field809);
                            return;
                        }
                        if (class105.field2274.method143(-41) == 0) {
                            class180.method1118(class10.field188, class39.field829, 24353, class39.field820);
                            return;
                        }
                        class180.method1118(class134.field2793, class39.field826, 24353, class39.field840);
                        class48.method379(20, (byte) 18);
                        return;
                    }
                    if (var17 && class105.field2274.method143(-41) < 20) {
                        class105.field2274 = class105.field2274.method157((byte) -123, class168.field3351);
                    }
                }
            }
        } else if (class21.field441 == 3) {
            short var19 = 382;
            short var20 = 321;
            if (var6 == 1 && var7 >= var19 - 75 && var19 + 75 >= var7 && var20 - 20 <= var8 && var8 <= var20 + 20) {
                class21.field441 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
    public final int[][] method846(int arg0, int arg1) {
        field2747++;
        if (arg0 != 7287) {
            this.field2742 = -84;
        }
        if (this.field2754 == this.field2739) {
            this.field2757 = this.field2753[arg1] == null;
            this.field2753[arg1] = class86.field1850;
            return this.field2751[arg1];
        } else if (this.field2739 == 1) {
            this.field2757 = this.field2738 != arg1;
            this.field2738 = arg1;
            return this.field2751[0];
        } else {
            class204 var3 = this.field2753[arg1];
            if (this.field2757 = var3 == null) {
                if (this.field2739 <= this.field2742) {
                    class204 var4 = (class204) this.field2737.method184(-1001);
                    var3 = new class204(arg1, var4.field4017);
                    this.field2753[var4.field4018] = null;
                    var4.method1018(15789);
                } else {
                    var3 = new class204(arg1, this.field2742);
                    this.field2742++;
                }
                this.field2753[arg1] = var3;
            }
            this.field2737.method192(1, var3);
            return this.field2751[var3.field4017];
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    private static final void method847(int arg0) {
        try {
            if (class144.field2947 == null) {
                class144.field2947 = new class10(class60.field1398, class3.method14(true, new class23[] { class191.field3794, class66.field1553, class69.field1617 }).method172((byte) 97));
            } else {
                byte[] var1 = class144.field2947.method58((byte) -86);
                if (var1 != null) {
                    class189 var2 = new class189(var1);
                    class5.field99 = var2.method1197(-1);
                    class159.field3188 = new class21[class5.field99];
                    int var3 = 0;
                    while (true) {
                        if (class5.field99 <= var3) {
                            class203.method1329(class170.field3392, class189.field3742, (byte) 99, class159.field3188, 0, class159.field3188.length - 1);
                            class144.field2947 = null;
                            class151.field3026 = true;
                            break;
                        }
                        class21 var4 = class159.field3188[var3] = new class21();
                        int var5 = var2.method1197(-1);
                        var4.field449 = var5 & 0x7FFF;
                        var4.field431 = (var5 & 0x8000) != 0;
                        var4.field439 = var2.method1193((byte) -70);
                        var4.field448 = var2.method1196(false);
                        var4.field436 = var3;
                        var4.field435 = class151.method938(var4.field439, (byte) -14);
                        var3++;
                    }
                }
            }
            if (arg0 != 0) {
                method849(40, -16, 113, 82, -88, -87, -123, 2, 102, 59);
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class144.field2947 = null;
        }
        field2743++;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        if (arg0 != 100) {
            this.field2757 = true;
        }
        field2752++;
        for (int var2 = 0; var2 < this.field2739; var2++) {
            this.field2751[var2][0] = null;
            this.field2751[var2][1] = null;
            this.field2751[var2][2] = null;
            this.field2751[var2] = null;
        }
        this.field2753 = null;
        this.field2751 = null;
        this.field2737.method190((byte) 90);
        this.field2737 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2745++;
        class153 var10 = (class153) class178.field3534.method188((byte) 54);
        class153 var11 = null;
        while (var10 != null) {
            if (var10.field3062 == arg5 && var10.field3053 == arg0 && var10.field3059 == arg8 && var10.field3063 == arg7) {
                var11 = var10;
                break;
            }
            var10 = (class153) class178.field3534.method185((byte) -102);
        }
        if (arg1 != 19468) {
            return;
        }
        if (var11 == null) {
            var11 = new class153();
            var11.field3059 = arg8;
            var11.field3063 = arg7;
            var11.field3062 = arg5;
            var11.field3053 = arg0;
            class117.method738(var11, (byte) 120);
            class178.field3534.method186(var11, -26692);
        }
        var11.field3054 = arg3;
        var11.field3048 = arg4;
        var11.field3051 = arg2;
        var11.field3056 = arg6;
        var11.field3066 = arg9;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI)V")
    public static final void method850(int arg0, byte arg1, int arg2) {
        if (arg1 <= 78) {
            method852(122);
        }
        field2741++;
        class66.field1554++;
        class159.field3190.method631(48, -1);
        class159.field3190.method1198(arg0, -2053);
        class159.field3190.method1186(arg2, -12);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public static void method851(int arg0) {
        field2748 = null;
        if (arg0 == 19802) {
            field2756 = null;
            field2750 = null;
            field2744 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public static final void method852(int arg0) {
        if (arg0 != -8885) {
            method850(103, (byte) 45, -120);
        }
        field2740++;
        while (true) {
            class25 var1 = class36.field740;
            class20 var2;
            synchronized (class36.field740) {
                var2 = (class20) class100.field2109.method189((byte) -99);
            }
            if (var2 == null) {
                return;
            }
            var2.field421.method448(false, false, (int) var2.field3317, var2.field411, var2.field413);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V")
    public class133(int arg0, int arg1, int arg2) {
        this.field2754 = arg1;
        this.field2751 = new int[arg0][3][arg2];
        this.field2753 = new class204[arg1];
        this.field2739 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2744[var0] = var1;
        }
        field2746 = 0;
        field2748 = class54.method414("me", -1);
    }
}
