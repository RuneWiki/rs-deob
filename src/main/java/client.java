import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class580 {

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    public static boolean field4662 = true;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Lcb;")
    public static class544 field4674;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Ljava/lang/Class;")
    public static Class field4676;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method2042(int arg0) {
        if (class733.field10237) {
            class511.field7306 = 64;
        }
        field4672++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class151.method1077(arg0 ^ 0xC0);
        class687.field9739 = new class257(class27.field395);
        class451.field6478 = new class766();
        class252.method1674(false, new int[] { 1000, 100 }, new int[] { 20, 260 });
        if (class256.field3599 != class177.field2704) {
            class781.field10761 = new byte[50][];
        }
        class145.field1852 = class141.method983(arg0 + 59);
        if (class256.field3599 == class177.field2704) {
            class190.field2837.field6987 = this.getCodeBase().getHost();
        } else if (class204.method1460(class256.field3599, -114)) {
            class190.field2837.field6987 = this.getCodeBase().getHost();
            class190.field2837.field6980 = class190.field2837.field6989 + 40000;
            class458.field6560.field6980 = class458.field6560.field6989 + 40000;
            class190.field2837.field6984 = class190.field2837.field6989 + 50000;
            class775.field10674.field6980 = class775.field10674.field6989 + 40000;
            class458.field6560.field6984 = class458.field6560.field6989 + 50000;
            class775.field10674.field6984 = class775.field10674.field6989 + 50000;
        } else if (class543.field7609 == class256.field3599) {
            class190.field2837.field6987 = "127.0.0.1";
            class458.field6560.field6987 = "127.0.0.1";
            class190.field2837.field6980 = class190.field2837.field6989 + 40000;
            class775.field10674.field6987 = "127.0.0.1";
            class458.field6560.field6980 = class458.field6560.field6989 + 40000;
            class775.field10674.field6980 = class775.field10674.field6989 + 40000;
            class190.field2837.field6984 = class190.field2837.field6989 + 50000;
            class458.field6560.field6984 = class458.field6560.field6989 + 50000;
            class775.field10674.field6984 = class775.field10674.field6989 + 50000;
        }
        if (class536.field7555 == class234.field3384) {
            class467.field6638 = false;
        }
        class444.field6319 = class190.field2837;
        if (class536.field7555 == class23.field344) {
            class573.field8112 = 16777215;
            class771.field10626 = 0;
            class126.field1651 = class595.field8372;
            class481.field6844 = class644.field9066;
            class733.field10233 = true;
        } else if (class536.field7555 == class397.field5634) {
            class481.field6844 = class355.field5161;
            class126.field1651 = class551.field7838;
        } else {
            class126.field1651 = class257.field3617;
            class481.field6844 = class226.field3241;
        }
        class500.field7092 = class432.field6153 = class728.field10190 = class637.field8966 = new short[256];
        try {
            class53.field745 = class364.field5270.getToolkit().getSystemClipboard();
            if (arg0 != 64) {
                field4674 = null;
            }
        } catch (Exception var4) {
        }
        class311.field4630 = class457.method2727(class359.field5219, (byte) -41);
        class694.field9812 = class689.method3881(17, true, class359.field5219);
        try {
            if (class27.field395.field8343 != null) {
                class305.field4567 = new class373(class27.field395.field8343, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class485.field6881[var3] = new class373(class27.field395.field8324[var3], 6000, 0);
                }
                class185.field2789 = new class373(class27.field395.field8344, 6000, 0);
                class427.field6004 = new class23(255, class305.field4567, class185.field2789, 500000);
                class421.field5942 = new class373(class27.field395.field8333, 24, 0);
                class27.field395.field8333 = null;
                class27.field395.field8324 = null;
                class27.field395.field8343 = null;
                class27.field395.field8344 = null;
            }
        } catch (IOException var5) {
            class185.field2789 = null;
            class421.field5942 = null;
            class305.field4567 = null;
            class427.field6004 = null;
        }
        if (class256.field3599 != class177.field2704) {
            class558.field7931 = true;
        }
        class601.field8479 = class674.field9563.method3825((byte) -10, class526.field7494);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method2043(int arg0) {
        field4666++;
        if (class757.field10456 == 14) {
            return;
        }
        long var2 = class444.method2673(125) / 1000000L - class388.field5532;
        class388.field5532 = class444.method2673(56) / 1000000L;
        boolean var4 = class138.method971((byte) 116);
        if (var4 && class709.field9995 && class262.field3703 != null) {
            class262.field3703.method1644(-16659);
        }
        if (class250.method1670(-11052, class757.field10456)) {
            if (class746.field10379 != 0L && class746.field10379 < class109.method731(79)) {
                class725.method4080(class345.field5085, class100.method704(0), class453.field6522, false, 0);
            } else if (!class638.field8979.method424() && class206.field3026) {
                class723.method4074(-1);
            }
        }
        if (class677.field9637 == null) {
            Container var5;
            if (class463.field6617 != null) {
                var5 = class463.field6617;
            } else if (class535.field7544 == null) {
                var5 = class119.field1498;
            } else {
                var5 = class535.field7544;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class463.field6617 == var5) {
                Insets var8 = class463.field6617.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class133.field1735 != var6 || class711.field10013 != var7 || class654.field9234) {
                if (class638.field8979 == null || class638.field8979.method436()) {
                    class151.method1077(128);
                } else {
                    class133.field1735 = var6;
                    class711.field10013 = var7;
                }
                class746.field10379 = class109.method731(91) + 500L;
                class654.field9234 = false;
            }
        }
        if (class677.field9637 != null && !class130.field1709 && class250.method1670(-11052, class757.field10456)) {
            class725.method4080(-1, class145.field1852.field8987.method2724((byte) -78), -1, false, 0);
        }
        boolean var9 = false;
        if (class241.field3464) {
            var9 = true;
            class241.field3464 = false;
        }
        if (var9) {
            class127.method926(-1);
        }
        if (class638.field8979 != null && class638.field8979.method424() || class100.method704(0) != 1) {
            class149.method1028(-19376);
        }
        if (class512.method2988((byte) 96, class757.field10456)) {
            class458.method2732(var9, -16876);
        } else if (class144.method990(class757.field10456, (byte) 122)) {
            class745.method4161(-45);
        } else if (class104.method711(class757.field10456, (byte) -101)) {
            class745.method4161(-66);
        } else if (class685.method3866(class757.field10456, -1)) {
            if (class671.field9407 == 1) {
                if (class216.field3104 < class358.field5207) {
                    class216.field3104 = class358.field5207;
                }
                int var10 = (class216.field3104 - class358.field5207) * 50 / class216.field3104;
                class54.method348(class157.field2343, false, class564.field8008, class638.field8979, true, class674.field9563.method3825((byte) -10, class526.field7494) + "<br>(" + var10 + "%)");
            } else if (class671.field9407 == 2) {
                if (class696.field9826 > class341.field5059) {
                    class341.field5059 = class696.field9826;
                }
                int var11 = (class341.field5059 - class696.field9826) * 50 / class341.field5059 + 50;
                class54.method348(class157.field2343, false, class564.field8008, class638.field8979, true, class674.field9563.method3825((byte) -10, class526.field7494) + "<br>(" + var11 + "%)");
            } else {
                class54.method348(class157.field2343, false, class564.field8008, class638.field8979, true, class674.field9563.method3825((byte) -10, class526.field7494));
            }
        } else if (class757.field10456 == 10) {
            class792.method4325((byte) -71, var2);
        } else if (class757.field10456 == 13) {
            class54.method348(class157.field2343, false, class564.field8008, class638.field8979, false, class674.field9565.method3825((byte) -10, class526.field7494) + "<br>" + class674.field9566.method3825((byte) -10, class526.field7494));
        }
        if (class566.field8013 == 3) {
            for (int var12 = 0; var12 < class351.field5115; var12++) {
                Rectangle var13 = class667.field9385[var12];
                if (class73.field987[var12]) {
                    class638.field8979.method467(var13.y, var13.width, (byte) 117, var13.height, -65281, var13.x);
                } else if (class89.field1151[var12]) {
                    class638.field8979.method467(var13.y, var13.width, (byte) 116, var13.height, -65536, var13.x);
                } else {
                    class638.field8979.method467(var13.y, var13.width, (byte) 124, var13.height, -16711936, var13.x);
                }
            }
        }
        if (class315.method2070(-21415)) {
            class149.method1033(class638.field8979, 10);
        }
        if (class27.field395.field8345 && class250.method1670(-11052, class757.field10456) && class566.field8013 == 0 && class100.method704(0) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class351.field5115; var17++) {
                if (class89.field1151[var17]) {
                    class89.field1151[var17] = false;
                    class377.field5426[var16++] = class667.field9385[var17];
                }
            }
            try {
                if (class607.field8578) {
                    class100.method702(class377.field5426, 0, var16);
                } else {
                    class638.field8979.method486(var16, class377.field5426, 0);
                }
            } catch (class138 var19) {
            }
        } else if (!class512.method2988((byte) 126, class757.field10456)) {
            for (int var14 = 0; var14 < class351.field5115; var14++) {
                class89.field1151[var14] = false;
            }
            try {
                if (class607.field8578) {
                    class360.method2260((byte) 107);
                } else {
                    class638.field8979.method416((byte) -63);
                }
            } catch (class138 var20) {
                class329.method2129(var20.getMessage() + " (Recovered) " + this.method2065((byte) -29), false, var20);
                class226.method1559((byte) 92, false, 0);
            }
        }
        class524.method3053(-43);
        int var18 = class145.field1852.field9006.method3645((byte) -72);
        if (var18 == 0) {
            class117.method820(false, 15L);
        } else if (var18 == 1) {
            class117.method820(false, 10L);
        } else if (var18 == 2) {
            class117.method820(false, 5L);
        } else if (var18 == 3) {
            class117.method820(false, 2L);
        }
        if (arg0 >= -83) {
            return;
        }
        if (class489.field6914) {
            class277.method1800(3);
        }
        if (class145.field1852.field8989.method1619((byte) -96) == 1 && class757.field10456 == 3 && class251.field3546 != -1) {
            class145.field1852.method3632(class145.field1852.field8989, true, 0);
            class781.method4285(3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method2044(byte arg0) {
        field4670++;
        if (arg0 != 108) {
            return;
        }
        if (class145.field1852.field9002.method2258((byte) -86) != 2) {
            this.method2043(-113);
            return;
        }
        try {
            this.method2043(-123);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class329.method2129(var5.getMessage() + " (Recovered) " + this.method2065((byte) -29), false, var5);
            class162.field2385 = true;
            class226.method1559((byte) 71, false, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method2045(int arg0) {
        int var2 = 18 % ((-arg0 - 32) / 35);
        field4667++;
        boolean var3 = class451.field6478.method4213(4480);
        if (!var3) {
            this.method2048(71);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method2046(int arg0) {
        field4671++;
        if (class387.field5502) {
            class711.method4025(arg0 ^ 0xFFFFB762);
        }
        class452.method2720(true);
        if (class638.field8979 != null) {
            class638.field8979.method450(1);
        }
        if (arg0 != 1773) {
            return;
        }
        if (class677.field9637 != null) {
            class646.method3693(class27.field395, (byte) 78, class677.field9637);
            class677.field9637 = null;
        }
        if (class76.field1025 != null) {
            class76.field1025.method201(21);
            class76.field1025 = null;
        }
        class113.method808(99);
        class451.field6478.method4224((byte) -120);
        class687.field9739.method1689(4884);
        if (class188.field2817 != null) {
            class188.field2817.method4126((byte) 96);
            class188.field2817 = null;
        }
        try {
            class305.field4567.method2317((byte) -19);
            for (int var2 = 0; var2 < 37; var2++) {
                class485.field6881[var2].method2317((byte) -19);
            }
            class185.field2789.method2317((byte) -19);
            class421.field5942.method2317((byte) -19);
            class595.method3448(-112);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwq;IIIIIIIIIII)V")
    public static final void method2047(class176[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class176 var13 = arg0[var12];
            if (var13 != null && var13.field2661 == arg1) {
                int var14 = var13.field2599 + arg6;
                int var15 = var13.field2578 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field2560 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field2673 + var14;
                    int var21 = var13.field2664 + var15;
                    if (var13.field2560 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field2560 == 0 || var13.field2571 || method2049(var13).field9229 != 0 || class731.field10218 == var13 || class574.field8117 == var13.field2551 || class356.field5170 == var13.field2551) {
                    if (!method2063(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class607.field8578) {
                            var22 = class17.method143(-128);
                            var23 = class638.method3629(19728);
                        }
                        if (class169.field2433 == var13 && class102.method709(-101, class169.field2433) != null) {
                            class739.field10309 = true;
                            class550.field7779 = var14;
                            class373.field5386 = var15;
                        }
                        if (var13.field2622 || var16 < var18 && var17 < var19) {
                            if (var13.field2665 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class140 var24 = (class140) class526.field7486.method2508((byte) -109); var24 != null; var24 = (class140) class526.field7486.method2505((byte) -55)) {
                                    if (var24.field1803) {
                                        var24.method3117((byte) 123);
                                        var24.field1802.field2645 = false;
                                    }
                                }
                                if (class428.field6017 == 0) {
                                    class169.field2433 = null;
                                    class731.field10218 = null;
                                }
                                class391.field5549 = 0;
                                class519.field7423 = false;
                                class745.field10374 = false;
                                if (!class422.field5962) {
                                    class626.method3588(false);
                                }
                            }
                            boolean var25;
                            if (class694.field9812.method3201((byte) 121) + var22 >= var16 && class694.field9812.method3197((byte) -124) + var23 >= var17 && class694.field9812.method3201((byte) 117) + var22 < var18 && class694.field9812.method3197((byte) -123) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class26.field382 && var25) {
                                if (var13.field2587 >= 0) {
                                    class303.field4540 = var13.field2587;
                                } else if (var13.field2665) {
                                    class303.field4540 = -1;
                                }
                            }
                            if (!class422.field5962 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class60.method370(true, arg10 - var14, arg11 - var15, var13);
                            }
                            boolean var26 = false;
                            if (class694.field9812.method3199(-1) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class218 var28 = (class218) class585.field8267.method2508((byte) -103);
                            if (var28 != null && var28.method1511((byte) 124) == 0 && var28.method1508((byte) 109) + var22 >= var16 && var28.method1506((byte) 90) + var23 >= var17 && var28.method1508((byte) 126) + var22 < var18 && var28.method1506((byte) -89) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field2601 != null && !class315.method2070(-21415)) {
                                for (int var29 = 0; var29 < var13.field2601.length; var29++) {
                                    if (class311.field4630.method2733(79, var13.field2601[var29])) {
                                        if (var13.field2499 == null || class673.field9441 >= var13.field2499[var29]) {
                                            byte var30 = var13.field2641[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class311.field4630.method2733(125, 86) && !class311.field4630.method2733(79, 82) && !class311.field4630.method2733(90, 81)) && ((var30 & 0x2) == 0 || class311.field4630.method2733(121, 86)) && ((var30 & 0x1) == 0 || class311.field4630.method2733(97, 82)) && ((var30 & 0x4) == 0 || class311.field4630.method2733(98, 81))) {
                                                if (var29 < 10) {
                                                    class587.method3405(-1, var29 + 1, true, "", var13.field2588);
                                                } else if (var29 == 10) {
                                                    class272.method1770(-1);
                                                    class654 var31 = method2049(var13);
                                                    class574.method3337((byte) 84, var13, var31.field9230, var31.method3748(102));
                                                    class361.field5239 = class573.method3324((byte) 98, var13);
                                                    if (class361.field5239 == null) {
                                                        class361.field5239 = "Null";
                                                    }
                                                    class373.field5373 = var13.field2662 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field2590[var29];
                                                if (var13.field2499 == null) {
                                                    var13.field2499 = new int[var13.field2601.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field2499[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field2499[var29] = class673.field9441 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field2499 != null) {
                                        var13.field2499[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class423.method2526(var22 + var28.method1508((byte) 121) - var14, true, var13, var23 + var28.method1506((byte) 92) - var15);
                            }
                            if (class169.field2433 != null && class169.field2433 != var13 && var25 && method2049(var13).method3746((byte) -112)) {
                                class788.field10825 = var13;
                            }
                            if (class731.field10218 == var13) {
                                class595.field8382 = true;
                                class157.field2327 = var14;
                                class374.field5400 = var15;
                            }
                            if (var13.field2571 || var13.field2551 != 0) {
                                if (var25 && class516.field7387 != 0 && var13.field2533 != null) {
                                    class140 var33 = new class140();
                                    var33.field1803 = true;
                                    var33.field1802 = var13;
                                    var33.field1809 = class516.field7387;
                                    var33.field1808 = var13.field2533;
                                    class526.field7486.method2510(var33, false);
                                }
                                if (class169.field2433 != null || class422.field5962 || class451.field6497 != var13.field2551 && class391.field5549 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field2551 != 0) {
                                    if (class11.field239 == var13.field2551 || class331.field4939 == var13.field2551) {
                                        class586.field8296 = var13;
                                        if (class656.field9247 != null) {
                                            class656.field9247.method3845(var13.field2664, 0, class638.field8979);
                                        }
                                        if (class11.field239 == var13.field2551) {
                                            if (class422.field5962 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class652.method3738(arg8, class638.field8979, arg9, (byte) 53);
                                            class758 var34 = (class758) class633.field8933.method2033(0);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field10466 && arg10 < var34.field10460 && arg11 >= var34.field10464 && arg11 < var34.field10463) {
                                                    class626.method3588(false);
                                                    class757.method4185(true, var34.field10468);
                                                }
                                                var34 = (class758) class633.field8933.method2025((byte) -88);
                                            }
                                        }
                                    }
                                    if (class574.field8117 == var13.field2551) {
                                        if (var13.method1323(-21340, class638.field8979) == null || class2.field22 != 0 && class2.field22 != 3 || class422.field5962 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field2625[var36];
                                        if (var35 < var37 || var35 > var13.field2509[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field2673 / 2;
                                        int var39 = var36 - var13.field2664 / 2;
                                        int var40;
                                        if (class763.field10510 == 4) {
                                            var40 = (int) class562.field8001 & 0x3FFF;
                                        } else {
                                            var40 = (int) class562.field8001 + class77.field1042 & 0x3FFF;
                                        }
                                        int var41 = class601.field8476[var40];
                                        int var42 = class601.field8473[var40];
                                        if (class763.field10510 != 4) {
                                            var41 = (class611.field8630 + 256) * var41 >> 8;
                                            var42 = (class611.field8630 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class763.field10510 == 4) {
                                            var45 = (class75.field1009 >> 9) + (var43 >> 2);
                                            var46 = (class579.field8185 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class251.field3549.method2692((byte) 98) - 1) * 256;
                                            var45 = (class251.field3549.field7718 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class251.field3549.field7719 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class26.field382 && (class641.field9043 & 0x40) != 0) {
                                            class176 var48 = class333.method2152(false, class76.field1018, class483.field6863);
                                            if (var48 == null) {
                                                class272.method1770(-1);
                                            } else {
                                                class502.method2933(12, " ->", true, var13.field2540, 6947, class361.field5239, class75.field1013, (long) (var13.field2612 << 0 | var13.field2588), false, true, var45, var46, 1L);
                                            }
                                            continue;
                                        }
                                        if (class536.field7555 == class23.field344) {
                                            class502.method2933(44, "", true, -1, 6947, class674.field9578.method3825((byte) -10, class526.field7494), -1, 0L, false, true, var45, var46, 1L);
                                        }
                                        class502.method2933(18, "", true, -1, 6947, class190.field2841, class402.field5697, 0L, false, true, var45, var46, 1L);
                                        continue;
                                    }
                                    if (class451.field6497 == var13.field2551) {
                                        class271.field3793 = var13;
                                        if (var25) {
                                            class519.field7423 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1508((byte) -43) - var14 - var13.field2673 / 2) * 2.0D / (double) class436.field6216);
                                            int var50 = (int) (-((double) (var23 + var28.method1506((byte) -85) - var15 - var13.field2664 / 2) * 2.0D / (double) class436.field6216));
                                            int var51 = class459.field6580 + var49 + class436.field6239;
                                            int var52 = class450.field6465 + var50 + class436.field6233;
                                            class614 var53 = class652.method3735(true);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method3527(var54, 61, var51, var52);
                                            if (var54 != null) {
                                                if (class311.field4630.method2733(116, 82) && class282.field4334 > 0) {
                                                    class460.method2740(var54[1], (byte) 81, var54[0], var54[2]);
                                                    continue;
                                                }
                                                class745.field10374 = true;
                                                class640.field8983 = var54[0];
                                                class203.field2973 = var54[1];
                                                class464.field6624 = var54[2];
                                            }
                                            class391.field5549 = 1;
                                            class18.field298 = false;
                                            class655.field9236 = class694.field9812.method3201((byte) 113);
                                            class117.field1461 = class694.field9812.method3197((byte) -123);
                                            continue;
                                        }
                                        if (var26 && class391.field5549 > 0) {
                                            if (class391.field5549 == 1 && (class655.field9236 != class694.field9812.method3201((byte) 14) || class117.field1461 != class694.field9812.method3197((byte) -122))) {
                                                class477.field6782 = class459.field6580;
                                                class395.field5609 = class450.field6465;
                                                class391.field5549 = 2;
                                            }
                                            if (class391.field5549 == 2) {
                                                class18.field298 = true;
                                                class519.method3019(0, class477.field6782 + (int) ((double) (class655.field9236 - class694.field9812.method3201((byte) 33)) * 2.0D / (double) class436.field6217));
                                                class25.method192(0, class395.field5609 - (int) ((double) (class117.field1461 - class694.field9812.method3197((byte) -125)) * 2.0D / (double) class436.field6217));
                                            }
                                            continue;
                                        }
                                        if (class391.field5549 > 0 && !class18.field298) {
                                            if ((class4.field56 == 1 || class204.method1468((byte) -109)) && class543.field7608 > 2) {
                                                class463.method2748(78, class117.field1461, class655.field9236);
                                            } else if (class662.method3775(false)) {
                                                class463.method2748(80, class117.field1461, class655.field9236);
                                            }
                                        }
                                        class391.field5549 = 0;
                                        continue;
                                    }
                                    if (class411.field5803 == var13.field2551) {
                                        if (var26) {
                                            class510.method2982(2, var22 + class694.field9812.method3201((byte) 47) - var14, var13.field2664, var13.field2673, var23 + class694.field9812.method3197((byte) -127) - var15);
                                        }
                                        continue;
                                    }
                                    if (class356.field5170 == var13.field2551) {
                                        class694.method3913(var14, var13, var15, true);
                                        continue;
                                    }
                                }
                                if (!var13.field2574 && var27) {
                                    var13.field2574 = true;
                                    if (var13.field2531 != null) {
                                        class140 var55 = new class140();
                                        var55.field1803 = true;
                                        var55.field1802 = var13;
                                        var55.field1807 = var22 + var28.method1508((byte) 111) - var14;
                                        var55.field1809 = var23 + var28.method1506((byte) -65) - var15;
                                        var55.field1808 = var13.field2531;
                                        class526.field7486.method2510(var55, false);
                                    }
                                }
                                if (var13.field2574 && var26 && var13.field2535 != null) {
                                    class140 var56 = new class140();
                                    var56.field1803 = true;
                                    var56.field1802 = var13;
                                    var56.field1807 = var22 + class694.field9812.method3201((byte) 80) - var14;
                                    var56.field1809 = var23 + class694.field9812.method3197((byte) -123) - var15;
                                    var56.field1808 = var13.field2535;
                                    class526.field7486.method2510(var56, false);
                                }
                                if (var13.field2574 && !var26) {
                                    var13.field2574 = false;
                                    if (var13.field2561 != null) {
                                        class140 var57 = new class140();
                                        var57.field1803 = true;
                                        var57.field1802 = var13;
                                        var57.field1807 = var22 + class694.field9812.method3201((byte) 101) - var14;
                                        var57.field1809 = var23 + class694.field9812.method3197((byte) -126) - var15;
                                        var57.field1808 = var13.field2561;
                                        class325.field4866.method2510(var57, false);
                                    }
                                }
                                if (var26 && var13.field2522 != null) {
                                    class140 var58 = new class140();
                                    var58.field1803 = true;
                                    var58.field1802 = var13;
                                    var58.field1807 = var22 + class694.field9812.method3201((byte) 93) - var14;
                                    var58.field1809 = var23 + class694.field9812.method3197((byte) -125) - var15;
                                    var58.field1808 = var13.field2522;
                                    class526.field7486.method2510(var58, false);
                                }
                                if (!var13.field2645 && var25) {
                                    var13.field2645 = true;
                                    if (var13.field2586 != null) {
                                        class140 var59 = new class140();
                                        var59.field1803 = true;
                                        var59.field1802 = var13;
                                        var59.field1807 = var22 + class694.field9812.method3201((byte) 17) - var14;
                                        var59.field1809 = var23 + class694.field9812.method3197((byte) -123) - var15;
                                        var59.field1808 = var13.field2586;
                                        class526.field7486.method2510(var59, false);
                                    }
                                }
                                if (var13.field2645 && var25 && var13.field2572 != null) {
                                    class140 var60 = new class140();
                                    var60.field1803 = true;
                                    var60.field1802 = var13;
                                    var60.field1807 = var22 + class694.field9812.method3201((byte) 35) - var14;
                                    var60.field1809 = var23 + class694.field9812.method3197((byte) -124) - var15;
                                    var60.field1808 = var13.field2572;
                                    class526.field7486.method2510(var60, false);
                                }
                                if (var13.field2645 && !var25) {
                                    var13.field2645 = false;
                                    if (var13.field2552 != null) {
                                        class140 var61 = new class140();
                                        var61.field1803 = true;
                                        var61.field1802 = var13;
                                        var61.field1807 = var22 + class694.field9812.method3201((byte) 63) - var14;
                                        var61.field1809 = var23 + class694.field9812.method3197((byte) -122) - var15;
                                        var61.field1808 = var13.field2552;
                                        class325.field4866.method2510(var61, false);
                                    }
                                }
                                if (var13.field2596 != null) {
                                    class140 var62 = new class140();
                                    var62.field1802 = var13;
                                    var62.field1808 = var13.field2596;
                                    class430.field6138.method2510(var62, false);
                                }
                                if (var13.field2657 != null && class457.field6557 > var13.field2647) {
                                    if (var13.field2594 == null || class457.field6557 - var13.field2647 > 32) {
                                        class140 var67 = new class140();
                                        var67.field1802 = var13;
                                        var67.field1808 = var13.field2657;
                                        class526.field7486.method2510(var67, false);
                                    } else {
                                        label711: for (int var63 = var13.field2647; var63 < class457.field6557; var63++) {
                                            int var64 = class502.field7183[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field2594.length; var65++) {
                                                if (var13.field2594[var65] == var64) {
                                                    class140 var66 = new class140();
                                                    var66.field1802 = var13;
                                                    var66.field1808 = var13.field2657;
                                                    class526.field7486.method2510(var66, false);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2647 = class457.field6557;
                                }
                                if (var13.field2644 != null && class191.field2853 > var13.field2524) {
                                    if (var13.field2545 == null || class191.field2853 - var13.field2524 > 32) {
                                        class140 var72 = new class140();
                                        var72.field1802 = var13;
                                        var72.field1808 = var13.field2644;
                                        class526.field7486.method2510(var72, false);
                                    } else {
                                        label687: for (int var68 = var13.field2524; var68 < class191.field2853; var68++) {
                                            int var69 = class64.field850[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field2545.length; var70++) {
                                                if (var13.field2545[var70] == var69) {
                                                    class140 var71 = new class140();
                                                    var71.field1802 = var13;
                                                    var71.field1808 = var13.field2644;
                                                    class526.field7486.method2510(var71, false);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2524 = class191.field2853;
                                }
                                if (var13.field2583 != null && class217.field3114 > var13.field2646) {
                                    if (var13.field2555 == null || class217.field3114 - var13.field2646 > 32) {
                                        class140 var77 = new class140();
                                        var77.field1802 = var13;
                                        var77.field1808 = var13.field2583;
                                        class526.field7486.method2510(var77, false);
                                    } else {
                                        label663: for (int var73 = var13.field2646; var73 < class217.field3114; var73++) {
                                            int var74 = class526.field7492[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field2555.length; var75++) {
                                                if (var13.field2555[var75] == var74) {
                                                    class140 var76 = new class140();
                                                    var76.field1802 = var13;
                                                    var76.field1808 = var13.field2583;
                                                    class526.field7486.method2510(var76, false);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2646 = class217.field3114;
                                }
                                if (var13.field2617 != null && class477.field6780 > var13.field2605) {
                                    if (var13.field2559 == null || class477.field6780 - var13.field2605 > 32) {
                                        class140 var82 = new class140();
                                        var82.field1802 = var13;
                                        var82.field1808 = var13.field2617;
                                        class526.field7486.method2510(var82, false);
                                    } else {
                                        label639: for (int var78 = var13.field2605; var78 < class477.field6780; var78++) {
                                            int var79 = class148.field1899[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field2559.length; var80++) {
                                                if (var13.field2559[var80] == var79) {
                                                    class140 var81 = new class140();
                                                    var81.field1802 = var13;
                                                    var81.field1808 = var13.field2617;
                                                    class526.field7486.method2510(var81, false);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2605 = class477.field6780;
                                }
                                if (var13.field2606 != null && class444.field6320 > var13.field2663) {
                                    if (var13.field2650 == null || class444.field6320 - var13.field2663 > 32) {
                                        class140 var87 = new class140();
                                        var87.field1802 = var13;
                                        var87.field1808 = var13.field2606;
                                        class526.field7486.method2510(var87, false);
                                    } else {
                                        label615: for (int var83 = var13.field2663; var83 < class444.field6320; var83++) {
                                            int var84 = class512.field7319[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field2650.length; var85++) {
                                                if (var13.field2650[var85] == var84) {
                                                    class140 var86 = new class140();
                                                    var86.field1802 = var13;
                                                    var86.field1808 = var13.field2606;
                                                    class526.field7486.method2510(var86, false);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field2663 = class444.field6320;
                                }
                                if (class74.field1001 > var13.field2500 && var13.field2507 != null) {
                                    class140 var88 = new class140();
                                    var88.field1802 = var13;
                                    var88.field1808 = var13.field2507;
                                    class526.field7486.method2510(var88, false);
                                }
                                if (class543.field7610 > var13.field2500 && var13.field2600 != null) {
                                    class140 var89 = new class140();
                                    var89.field1802 = var13;
                                    var89.field1808 = var13.field2600;
                                    class526.field7486.method2510(var89, false);
                                }
                                if (class786.field10802 > var13.field2500 && var13.field2570 != null) {
                                    class140 var90 = new class140();
                                    var90.field1802 = var13;
                                    var90.field1808 = var13.field2570;
                                    class526.field7486.method2510(var90, false);
                                }
                                if (class37.field564 > var13.field2500 && var13.field2567 != null) {
                                    class140 var91 = new class140();
                                    var91.field1802 = var13;
                                    var91.field1808 = var13.field2567;
                                    class526.field7486.method2510(var91, false);
                                }
                                if (class270.field3785 > var13.field2500 && var13.field2582 != null) {
                                    class140 var92 = new class140();
                                    var92.field1802 = var13;
                                    var92.field1808 = var13.field2582;
                                    class526.field7486.method2510(var92, false);
                                }
                                if (class219.field3127 > var13.field2500 && var13.field2630 != null) {
                                    class140 var93 = new class140();
                                    var93.field1802 = var13;
                                    var93.field1808 = var13.field2630;
                                    class526.field7486.method2510(var93, false);
                                }
                                if (class778.field10735 > var13.field2500 && var13.field2562 != null) {
                                    class140 var94 = new class140();
                                    var94.field1802 = var13;
                                    var94.field1808 = var13.field2562;
                                    class526.field7486.method2510(var94, false);
                                }
                                var13.field2500 = class717.field10086;
                                if (var13.field2607 != null) {
                                    for (int var95 = 0; var95 < class33.field440; var95++) {
                                        class140 var96 = new class140();
                                        var96.field1802 = var13;
                                        var96.field1801 = class190.field2829[var95].method2709((byte) -127);
                                        var96.field1797 = class190.field2829[var95].method2710(-9159);
                                        var96.field1808 = var13.field2607;
                                        class526.field7486.method2510(var96, false);
                                    }
                                }
                                if (class631.field8917 && var13.field2660 != null) {
                                    class140 var97 = new class140();
                                    var97.field1802 = var13;
                                    var97.field1808 = var13.field2660;
                                    class526.field7486.method2510(var97, false);
                                }
                            }
                            if (var13.field2560 == 5 && var13.field2585 != -1) {
                                var13.method1334(class510.field7302, 118, class684.field9714).method3845(var13.field2664, 0, class638.field8979);
                            }
                            class7.method35(var13, (byte) 114);
                            if (var13.field2560 == 0) {
                                method2047(arg0, var13.field2588, var16, var17, var18, var19, var14 - var13.field2620, var15 - var13.field2508, arg8, arg9, arg10, arg11);
                                if (var13.field2543 != null) {
                                    method2047(var13.field2543, var13.field2588, var16, var17, var18, var19, var14 - var13.field2620, var15 - var13.field2508, arg8, arg9, arg10, arg11);
                                }
                                class329 var98 = (class329) class251.field3547.method380((byte) -3, (long) var13.field2588);
                                if (var98 != null) {
                                    if (class536.field7555 == class234.field3384 && var98.field4914 == 0 && !class422.field5962 && var25 && !class52.field744) {
                                        class626.method3588(false);
                                    }
                                    class372.method2308(true, var19, arg10, var16, var17, var15, var98.field4912, var14, arg8, var18, arg9, arg11);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class7.method35(var13, (byte) 104);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method2048(int arg0) {
        field4663++;
        if (class451.field6478.field10572 > class513.field7333) {
            class444.field6319.method2878(3128);
            class288.field4397 = (class451.field6478.field10572 * 50 - 50) * 5;
            if (class288.field4397 > 3000) {
                class288.field4397 = 3000;
            }
            if (class451.field6478.field10572 >= 2 && class451.field6478.field10574 == 6) {
                this.method3372(-1, "js5connect_outofdate");
                class757.field10456 = 14;
                return;
            }
            if (class451.field6478.field10572 >= 4 && class451.field6478.field10574 == -1) {
                this.method3372(-1, "js5crc");
                class757.field10456 = 14;
                return;
            }
            if (class451.field6478.field10572 >= 4 && class512.method2988((byte) 101, class757.field10456)) {
                if (class451.field6478.field10574 == 7 || class451.field6478.field10574 == 9) {
                    this.method3372(-1, "js5connect_full");
                } else if (class451.field6478.field10574 <= 0) {
                    this.method3372(-1, "js5io");
                } else if (class21.field325 == null) {
                    this.method3372(-1, "js5connect");
                } else {
                    this.method3372(-1, "js5proxy_" + class21.field325.trim());
                }
                class757.field10456 = 14;
                return;
            }
        }
        class513.field7333 = class451.field6478.field10572;
        if (class288.field4397 > 0) {
            class288.field4397--;
            return;
        }
        try {
            if (class579.field8182 == 0) {
                class697.field9849 = class444.field6319.method2876(-1, class27.field395);
                class579.field8182++;
            }
            if (arg0 >= 18) {
                if (class579.field8182 == 1) {
                    if (class697.field9849.field5314 == 2) {
                        if (class697.field9849.field5317 != null) {
                            class21.field325 = (String) class697.field9849.field5317;
                        }
                        this.method2058(1000, -66);
                        return;
                    }
                    if (class697.field9849.field5314 == 1) {
                        class579.field8182++;
                    }
                }
                if (class579.field8182 == 2) {
                    class446.field6331 = new class153((Socket) class697.field9849.field5317, class27.field395, 25000);
                    class120 var2 = new class120(5);
                    var2.method851((byte) -2, class17.field279.field8702);
                    var2.method879((byte) 106, 644);
                    class446.field6331.method1174(var2.field1556, 0, 5, 3);
                    class579.field8182++;
                    class124.field1628 = class109.method731(18);
                }
                if (class579.field8182 == 3) {
                    if (class512.method2988((byte) 95, class757.field10456) || class446.field6331.method1173(8122) > 0) {
                        int var3 = class446.field6331.method1172(-69);
                        if (var3 != 0) {
                            this.method2058(var3, -81);
                            return;
                        }
                        class579.field8182++;
                    } else if ((class109.method731(103) - class124.field1628) > 30000L) {
                        this.method2058(1001, -93);
                        return;
                    }
                }
                if (class579.field8182 == 4) {
                    boolean var4 = class512.method2988((byte) 118, class757.field10456) || class95.method672(class757.field10456, 6) || class312.method2037((byte) 104, class757.field10456);
                    class490[] var5 = class490.method2866(31);
                    class120 var6 = new class120(var5.length * 4);
                    class446.field6331.method1179(var6.field1556.length, 0, 0, var6.field1556);
                    for (int var7 = 0; var7 < var5.length; var7++) {
                        var5[var7].method2867(var6.method871(23995), false);
                    }
                    class451.field6478.method4217(class446.field6331, !var4, (byte) 54);
                    class697.field9849 = null;
                    class579.field8182 = 0;
                    class446.field6331 = null;
                }
            }
        } catch (IOException var8) {
            this.method2058(1002, -99);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwq;)Lpda;")
    public static final class654 method2049(class176 arg0) {
        class654 var1 = (class654) class180.field2727.method380((byte) -3, ((long) arg0.field2588 << 32) + (long) arg0.field2612);
        return var1 == null ? arg0.field2510 : var1;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method2050(int arg0) {
        int var2 = -94 % ((22 - arg0) / 49);
        field4669++;
        if (class145.field1852.field9002.method2258((byte) -75) != 2) {
            this.method2061(-3);
            return;
        }
        try {
            this.method2061(-3);
        } catch (ThreadDeath var5) {
            throw var5;
        } catch (Throwable var6) {
            class329.method2129(var6.getMessage() + " (Recovered) " + this.method2065((byte) -29), false, var6);
            class162.field2385 = true;
            class226.method1559((byte) 119, false, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method2051(int arg0) {
        int var1 = class147.field1873;
        int[] var2 = class568.field8045;
        for (int var3 = 0; var3 < class26.field379 + var1; var3++) {
            class449 var4;
            if (var3 < var1) {
                var4 = class581.field8250[var2[var3]];
            } else {
                var4 = ((class14) class543.field7606.method380((byte) -3, (long) class790.field10846[var3 - var1])).field262;
            }
            if (var4.field7710 == arg0 && var4.field6369 >= 0) {
                int var5 = var4.method2692((byte) -32);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field7718 & 0x1FF) != 0 || (var4.field7719 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field7718 & 0x1FF) != 256 || (var4.field7719 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field7718 >> 9;
                    int var7 = var4.field7719 >> 9;
                    if (var4.field6369 > class303.field4547[var6][var7]) {
                        class303.field4547[var6][var7] = var4.field6369;
                        class502.field7185[var6][var7] = 1;
                    } else if (class303.field4547[var6][var7] == var4.field6369) {
                        var10002 = class502.field7185[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field7718 - var8 >> 9;
                    int var10 = var4.field7719 - var8 >> 9;
                    int var11 = var4.field7718 + var8 >> 9;
                    int var12 = var4.field7719 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field6369 > class303.field4547[var13][var14]) {
                                class303.field4547[var13][var14] = var4.field6369;
                                class502.field7185[var13][var14] = 1;
                            } else if (class303.field4547[var13][var14] == var4.field6369) {
                                var10002 = class502.field7185[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final synchronized void method2052(int arg0) {
        field4673++;
        if (class535.field7544 != null && class359.field5219 == null && !class27.field395.field8345) {
            try {
                Class var2 = class535.field7544.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class359.field5219 = (Canvas) var3.get(class535.field7544);
                var3.set(class535.field7544, null);
                if (class359.field5219 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method2052(arg0);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static final void method2053(byte arg0) {
        field4675++;
        class709.field9993 = null;
        if (arg0 < 107) {
            return;
        }
        if (class607.field8578 && class100.method704(0) != 1) {
            class583.method3383(class644.method3680(116), -1428115959, class757.field10456 == 3 || ~class757.field10456 == -8, 0, class288.method1924((byte) -75), 0);
        }
        int var1 = 0;
        int var2 = 0;
        if (class607.field8578) {
            var1 = class17.method143(-128);
            var2 = class638.method3629(19728);
        }
        class581.method3380(-1, var1, var2, class638.field8980 + var1, class251.field3546, var2, class512.field7325 + var2, var1, 0);
        if (class709.field9993 != null) {
            class235.method1621(class249.field3538, class709.field9993, true, -1412584499, var1 + class638.field8980, 12, class731.field10218.field2512, var1, class512.field7325 + var2, class502.field7188, var2);
            class709.field9993 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4659++;
        if (!this.method3370(-30697)) {
            return;
        }
        class190.field2837 = new class492();
        class190.field2837.field6989 = Integer.parseInt(this.getParameter("worldid"));
        class458.field6560 = new class492();
        class458.field6560.field6989 = Integer.parseInt(this.getParameter("lobbyid"));
        class458.field6560.field6987 = this.getParameter("lobbyaddress");
        class775.field10674 = new class492();
        class775.field10674.field6989 = Integer.parseInt(this.getParameter("demoid"));
        class775.field10674.field6987 = this.getParameter("demoaddress");
        class256.field3599 = class567.method3295(Integer.parseInt(this.getParameter("modewhere")), 0);
        if (class543.field7609 == class256.field3599) {
            class256.field3599 = class492.field6986;
        } else if (!class204.method1460(class256.field3599, -105) && class256.field3599 != class177.field2704) {
            class256.field3599 = class177.field2704;
        }
        class482.field6854 = class619.method3539((byte) 94, Integer.parseInt(this.getParameter("modewhat")));
        if (class624.field8798 != class482.field6854 && class567.field8017 != class482.field6854 && class482.field6854 != class21.field311) {
            class482.field6854 = class21.field311;
        }
        try {
            class526.field7494 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class526.field7494 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class553.field7873 = true;
        } else {
            class553.field7873 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class777.field10722 = true;
        } else {
            class777.field10722 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class395.field5587 = true;
        } else {
            class395.field5587 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class536.field7555 = class234.field3384;
            } else if (var4.equals("1")) {
                class536.field7555 = class23.field344;
            } else if (var4.equals("2")) {
                class536.field7555 = class6.field61;
            } else if (var4.equals("3")) {
                class536.field7555 = class397.field5634;
            }
        }
        try {
            class87.field1139 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class87.field1139 = 0;
        }
        class648.field9118 = this.getParameter("quiturl");
        class491.field6979 = this.getParameter("settings");
        if (class491.field6979 == null) {
            class491.field6979 = "";
        }
        class621.field8760 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class139.field1795 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class139.field1795 = 0;
            }
        }
        class108.field1311 = Integer.parseInt(this.getParameter("colourid"));
        if (class108.field1311 < 0 || class185.field2786.length <= class108.field1311) {
            class108.field1311 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class277.field3868 = true;
            class279.field3936 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class82.field1092 = true;
        }
        class669.field9400 = this.getParameter("sskey");
        if (class669.field9400 != null && class669.field9400.length() < 2) {
            class669.field9400 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class733.field10237 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class722.field10136 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class411.field5802 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class557.field7920 = this.getParameter("additionalInfo");
        if (class557.field7920 != null && class557.field7920.length() > 50) {
            class557.field7920 = null;
        }
        if (class536.field7555 == class234.field3384) {
            class785.field10790 = 765;
            class264.field3734 = 503;
        } else if (class536.field7555 == class23.field344) {
            class785.field10790 = 640;
            class264.field3734 = 480;
        }
        class364.field5270 = this;
        this.method3376(class536.field7555.field1306, class482.field6854.method2662((byte) -46) + 32, (byte) 97, class264.field3734, class785.field10790, 644, 37);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2054() {
        int var0 = class147.field1873;
        int[] var1 = class568.field8045;
        int var2 = class145.field1852.field9033.method4094((byte) -60);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class559 var14 = class581.field8250[var1[var4]];
            if (!var14.method3241(0)) {
                var14.field6369 = -1;
            } else if (var14.field7945) {
                var14.field6369 = -1;
            } else {
                var14.method247(1449008457);
                if (var14.field10733 >= 0 && var14.field10730 >= 0 && var14.field10727 < class109.field1314 && var14.field10736 < class760.field10479) {
                    var14.field7969 = var14.field6358 ? var3 : false;
                    if (class251.field3549 == var14) {
                        var14.field6369 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field6430) {
                            var15++;
                        }
                        if (var14.field6436 > class673.field9441) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method2692((byte) -15) << 2);
                        if (var14.field7950 || var14.field7948) {
                            var16 += 512;
                        } else {
                            if (class547.field7725 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field6369 = var16 + 1;
                    }
                } else {
                    var14.field6369 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class26.field379; var5++) {
            class645 var11 = ((class14) class543.field7606.method380((byte) -3, (long) class790.field10846[var5])).field262;
            if (var11.method3688(0) && var11.field9071.method1814(class271.field3796, false)) {
                var11.method247(1449008457);
                if (var11.field10733 >= 0 && var11.field10730 >= 0 && var11.field10727 < class109.field1314 && var11.field10736 < class760.field10479) {
                    int var12 = 0;
                    if (!var11.field6430) {
                        var12++;
                    }
                    if (var11.field6436 > class673.field9441) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method2692((byte) 74) << 2);
                    if (class547.field7725 == 0) {
                        if (var11.field9071.field3928) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class547.field7725 == 1) {
                        if (var11.field9071.field3928) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field9071.field3907) {
                        var13 += 1024;
                    } else if (!var11.field9071.field3911) {
                        var13 += 256;
                    }
                    var11.field6369 = var13 + 1;
                } else {
                    var11.field6369 = -1;
                }
            } else {
                var11.field6369 = -1;
            }
        }
        for (int var6 = 0; var6 < class443.field6310.length; var6++) {
            class253 var7 = class443.field6310[var6];
            if (var7 != null) {
                if (var7.field3558 == 1) {
                    class14 var8 = (class14) class543.field7606.method380((byte) -3, (long) var7.field3565);
                    if (var8 != null) {
                        class645 var9 = var8.field262;
                        if (var9.field6369 >= 0) {
                            var9.field6369 += 2048;
                        }
                    }
                } else if (var7.field3558 == 10) {
                    class559 var10 = class581.field8250[var7.field3565];
                    if (var10 != null && class251.field3549 != var10 && var10.field6369 >= 0) {
                        var10.field6369 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwq;)Lwq;")
    public static final class176 method2055(class176 arg0) {
        int var1 = method2049(arg0).method3747(16480);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class518.method3014(arg0.field2661, 82);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public static final void method2056(int arg0) {
        int var1 = class147.field1873;
        int[] var2 = class568.field8045;
        int var3 = class755.field10445 ? var1 : class26.field379 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class449 var5;
            if (var4 < var1) {
                var5 = class581.field8250[var2[var4]];
            } else {
                var5 = ((class14) class543.field7606.method380((byte) -3, (long) class790.field10846[var4 - var1])).field262;
            }
            if (var5.field7710 == arg0) {
                var5.field6407 = 0;
                if (var5.field6369 < 0) {
                    var5.field6430 = false;
                } else {
                    int var6 = var5.method2692((byte) 82);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field7718 & 0x1FF) != 0 || (var5.field7719 & 0x1FF) != 0) {
                            var5.field6430 = false;
                            continue;
                        }
                    } else if ((var5.field7718 & 0x1FF) != 256 || (var5.field7719 & 0x1FF) != 256) {
                        var5.field6430 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field7718 >> 9;
                        int var8 = var5.field7719 >> 9;
                        if (class303.field4547[var7][var8] != var5.field6369) {
                            var5.field6430 = true;
                            continue;
                        }
                        if (class502.field7185[var7][var8] > 1) {
                            var10002 = class502.field7185[var7][var8]--;
                            var5.field6430 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field7718 - var9 >> 9;
                        int var11 = var5.field7719 - var9 >> 9;
                        int var12 = var5.field7718 + var9 >> 9;
                        int var13 = var5.field7719 + var9 >> 9;
                        if (!class593.method3434(var5.field6369, var10, var13, -2, var11, var12)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class303.field4547[var14][var15] == var5.field6369) {
                                        var10002 = class502.field7185[var14][var15]--;
                                    }
                                }
                            }
                            var5.field6430 = true;
                            continue;
                        }
                    }
                    var5.field6430 = false;
                    var5.field7723 = class580.method3366(var5.field7710, (byte) -95, var5.field7719, var5.field7718);
                    class513.method2991(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public static void method2057(int arg0) {
        if (arg0 < 17) {
            method2066();
        }
        field4674 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method2058(int arg0, int arg1) {
        class451.field6478.field10572++;
        class579.field8182 = 0;
        field4661++;
        class446.field6331 = null;
        class697.field9849 = null;
        class451.field6478.field10574 = arg0;
        if (arg1 > -63) {
            field4674 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2059() {
        class218.field3119 = 0;
        for (int var0 = 0; var0 < class26.field379; var0++) {
            class645 var1 = ((class14) class543.field7606.method380((byte) -3, (long) class790.field10846[var0])).field262;
            if (var1.field6430 && var1.method2688(-26473) != -1) {
                int var2 = (var1.method2692((byte) 70) - 1) * 256 + 252;
                int var3 = var1.field7718 - var2 >> 9;
                int var4 = var1.field7719 - var2 >> 9;
                class449 var5 = class167.method1291(var1.field7710, var3, var4, (byte) -99);
                if (var5 != null) {
                    int var6 = var5.field6361;
                    if (var5 instanceof class645) {
                        var6 += 2048;
                    }
                    if (var5.field6407 == 0 && var5.method2688(-26473) != -1) {
                        class685.field9722[class218.field3119] = var6;
                        class464.field6625[class218.field3119] = var6;
                        class218.field3119++;
                        var5.field6407++;
                    }
                    class685.field9722[class218.field3119] = var6;
                    class464.field6625[class218.field3119] = var1.field6361 + 2048;
                    class218.field3119++;
                    var5.field6407++;
                }
            }
        }
        class318.method2080(class685.field9722, class464.field6625, class218.field3119 - 1, 0, 0);
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    private final void method2060(int arg0) {
        field4658++;
        if (class757.field10456 == 7 && class237.field3423 == 0) {
            if (class638.field8975 > 1) {
                class778.field10735 = class717.field10086;
                class638.field8975--;
            }
            if (!class422.field5962) {
                class626.method3588(false);
            }
            for (int var2 = 0; var2 < 100 && class703.method3983((byte) -66); var2++) {
            }
        }
        class55.field755++;
        class145.method998(-126, null, -1, -1);
        class694.method3913(-1, null, -1, true);
        class45.method304(-114);
        class717.field10086++;
        for (int var3 = 0; var3 < class662.field9292; var3++) {
            class645 var4 = class642.field9044[var3].field262;
            if (var4 != null) {
                byte var5 = var4.field9071.field3920;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2692((byte) -127);
                    if ((var5 & 0x2) != 0 && var4.field6443 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field6448[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class109.field1314 - var6 - 1 < var9) {
                                var9 = class109.field1314 - var6 - 1;
                            }
                            int var10 = var4.field6445[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > class760.field10479 - var6 - 1) {
                                var10 = class760.field10479 - var6 - 1;
                            }
                            int var11 = class579.method3365(var9, arg0 - 129, var6, var6, var4.field6448[0], -1, class234.field3394[var4.field7710], class302.field4527, 0, 0, true, class667.field9390, var4.field6445[0], var6, var10);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field6448[var12] = class302.field4527[var11 - var12 - 1];
                                    var4.field6445[var12] = class667.field9390[var11 - var12 - 1];
                                    var4.field6446[var12] = 1;
                                }
                                var4.field6443 = var11;
                            }
                        }
                    }
                    class701.method3975(-74, var4, true);
                    int var13 = class48.method315(-11, var4);
                    class73.method575(var4, (byte) 54);
                    class403.method2435(class663.field9305, false, class498.field7079, var13, var4);
                    class271.method1768(var4, class498.field7079, false);
                    class301.method2001(var4, (byte) -128);
                }
            }
        }
        if (class237.field3423 == 0 && class284.field4365 == 0) {
            if (class763.field10510 == 2) {
                class368.method2284((byte) -82);
            } else {
                class437.method2636(1);
            }
            if ((class277.field3866 >> 9) < 14 || class109.field1314 - 14 <= class277.field3866 >> 9 || class359.field5216 >> 9 < 14 || (class359.field5216 >> 9) >= (class760.field10479 - 14)) {
                class133.method949(-492594876);
            }
        }
        while (true) {
            class140 var14;
            class176 var15;
            class176 var16;
            do {
                var14 = (class140) class430.field6138.method2507(-116);
                if (var14 == null) {
                    while (true) {
                        class140 var17;
                        class176 var18;
                        class176 var19;
                        do {
                            var17 = (class140) class325.field4866.method2507(-109);
                            if (var17 == null) {
                                while (true) {
                                    class140 var20;
                                    class176 var21;
                                    class176 var22;
                                    do {
                                        var20 = (class140) class526.field7486.method2507(arg0 ^ 0xFFFFFF89);
                                        if (var20 == null) {
                                            if (class169.field2433 != null) {
                                                class607.method3502(0);
                                            }
                                            if (class673.field9441 % 1500 == 0) {
                                                class783.method4289(arg0 - 97);
                                            }
                                            if (class757.field10456 == 7 && class237.field3423 == 0) {
                                                class647.method3696(11410);
                                            }
                                            class694.method3917(arg0 ^ arg0);
                                            if (class387.field5502 && class696.field9827 < (class109.method731(27) - 60000L)) {
                                                class711.method4025(-20081);
                                            }
                                            for (class464 var23 = (class464) class619.field8724.method2033(arg0); var23 != null; var23 = (class464) class619.field8724.method2025((byte) -88)) {
                                                if ((class109.method731(117) / 1000L - 5L) > ((long) var23.field6619)) {
                                                    if (var23.field6618 > 0) {
                                                        class422.method2520(5, 0, var23.field6620 + class674.field9570.method3825((byte) -10, class526.field7494), "", "", arg0 ^ 0xFFFFFF9C, "");
                                                    }
                                                    if (var23.field6618 == 0) {
                                                        class422.method2520(5, 0, var23.field6620 + class674.field9571.method3825((byte) -10, class526.field7494), "", "", -114, "");
                                                    }
                                                    var23.method592(2);
                                                }
                                            }
                                            if (class757.field10456 == 7 && class237.field3423 == 0) {
                                                if (class76.field1025 == null) {
                                                    class599.method3460(true, false);
                                                    return;
                                                }
                                                class403.field5707++;
                                                if (class403.field5707 > 50) {
                                                    class475.field6758++;
                                                    class731 var24 = class155.method1222(260, class481.field6846, class237.field3417);
                                                    class533.method3088(var24, 0);
                                                }
                                                try {
                                                    class663.method3778(102);
                                                    return;
                                                } catch (IOException var25) {
                                                    class599.method3460(true, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field1802;
                                        if (var21.field2612 < 0) {
                                            break;
                                        }
                                        var22 = class518.method3014(var21.field2661, -62);
                                    } while (var22 == null || var22.field2543 == null || var22.field2543.length <= var21.field2612 || var22.field2543[var21.field2612] != var21);
                                    class353.method2219(var20);
                                }
                            }
                            var18 = var17.field1802;
                            if (var18.field2612 < 0) {
                                break;
                            }
                            var19 = class518.method3014(var18.field2661, -123);
                        } while (var19 == null || var19.field2543 == null || var18.field2612 >= var19.field2543.length || var19.field2543[var18.field2612] != var18);
                        class353.method2219(var17);
                    }
                }
                var15 = var14.field1802;
                if (var15.field2612 < 0) {
                    break;
                }
                var16 = class518.method3014(var15.field2661, 92);
            } while (var16 == null || var16.field2543 == null || var16.field2543.length <= var15.field2612 || var16.field2543[var15.field2612] != var15);
            class353.method2219(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    private final void method2061(int arg0) {
        field4664++;
        if (class757.field10456 == 14) {
            return;
        }
        class673.field9441++;
        if (class673.field9441 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class600.field8465 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class681.field9660.setSeed((long) class600.field8465);
        }
        if (class673.field9441 % 50 == 0) {
            class757.field10458 = class511.field7307;
            class511.field7307 = 0;
            class725.field10181 = class301.field4522;
            class301.field4522 = 0;
        }
        this.method2045(-125);
        if (class126.field1654 != null) {
            class126.field1654.method3853(arg0 ^ 0xFFFFFFFD);
        }
        class522.method3039((byte) -123);
        class368.method2283(-1);
        class311.field4630.method2735(0);
        class694.field9812.method3205((byte) 121);
        if (class638.field8979 != null) {
            class638.field8979.method473((int) class109.method731(47));
        }
        class444.method2676(arg0 - 24481);
        class33.field440 = 0;
        class593.field8366 = 0;
        for (class706 var3 = class311.field4630.method2731(arg0 ^ arg0); var3 != null; var3 = class311.field4630.method2731(0)) {
            int var6 = var3.method2714(arg0 + 18926);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2710(-9159);
                if (class372.method2307((byte) 45) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class315.method2070(-21415)) {
                        class268.method1755(24638);
                    } else {
                        class678.method3839(0);
                    }
                } else if (class33.field440 < 128) {
                    class190.field2829[class33.field440] = var3;
                    class33.field440++;
                }
            } else if (var6 == 0 && class593.field8366 < 75) {
                class673.field9513[class593.field8366] = var3;
                class593.field8366++;
            }
        }
        class516.field7387 = 0;
        for (class218 var4 = class694.field9812.method3209(13606); var4 != null; var4 = class694.field9812.method3209(13606)) {
            int var5 = var4.method1511((byte) 125);
            if (var5 == -1) {
                class157.field2329.method2510(var4, false);
            } else if (var5 == 6) {
                class516.field7387 += var4.method1509(-8567);
            } else if (class124.method916(var5, 123)) {
                class585.field8267.method2510(var4, false);
                if (class585.field8267.method2504(arg0 ^ 0xFFFFFFFD) > 10) {
                    class585.field8267.method2507(-109);
                }
            }
        }
        if (class315.method2070(arg0 ^ 0x53A4)) {
            class687.method3878((byte) 74);
        }
        if (class512.method2988((byte) 101, class757.field10456)) {
            class511.method2985(-110);
            class489.method2859(13102);
        } else if (class685.method3866(class757.field10456, arg0 + 2)) {
            class554.method3222((byte) -100);
        }
        if (class95.method672(class757.field10456, 6) && !class685.method3866(class757.field10456, arg0 ^ 0x2)) {
            this.method2060(0);
            class339.method2178((byte) -120);
            class669.method3799(92);
        } else if (class312.method2037((byte) 91, class757.field10456) && !class685.method3866(class757.field10456, -1)) {
            this.method2060(0);
            class669.method3799(113);
        } else if (class757.field10456 == 12) {
            class669.method3799(93);
        } else if (class264.method1739(class757.field10456, 3580) && !class685.method3866(class757.field10456, -1)) {
            class470.method2783(~arg0);
        } else if (class757.field10456 == 13) {
            class669.method3799(97);
            if (class661.field9289 != -3 && class661.field9289 != 2 && class661.field9289 != 15) {
                class599.method3460(true, false);
            }
        }
        class739.method4141(-127, class638.field8979);
        class585.field8267.method2507(-90);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method2062(int arg0) {
        field4660++;
        method2057(109);
        class688.method3879((byte) -99);
        class593.method3435(0);
        class674.method3826((byte) -102);
        class458.method2729(arg0 ^ 0x569B);
        class45.method307(arg0 ^ 0x8);
        class752.method4175((byte) 117);
        class490.method2863(-31501);
        class356.method2238(-1);
        class195.method1417(64);
        class406.method2448(-10315);
        class219.method1513(arg0 ^ 0xFFFFF212);
        class540.method3115(-2);
        class413.method2478(8212);
        class64.method390(false);
        class580.method3371(true);
        class148.method1023(arg0 ^ 0xFFFFF3FA);
        class680.method3842(10);
        class106.method717(false);
        class378.method2335(-8045);
        class640.method3636(arg0 ^ 0x43);
        class276.method1788(-106);
        class420.method2502(-125);
        class153.method1176((byte) 124);
        class257.method1688((byte) -106);
        class682.method3851(1);
        class544.method3128(-1);
        class373.method2314(-69);
        class23.method173((byte) 106);
        class387.method2376(arg0 ^ 0x52);
        class671.method3802(arg0 + 8076);
        class299.method1993(arg0 - 49);
        class35.method238(27975);
        class696.method3927((byte) 119);
        class744.method4156(arg0 ^ 0x16);
        class16.method142(103);
        class697.method3932((byte) -103);
        class49.method324(arg0 - 192);
        class649.method3707(128);
        class553.method3219((byte) 115);
        class204.method1467(50);
        class624.method3560(arg0 + 9830);
        class233.method1610(1340);
        class289.method1934(false);
        class539.method3109(arg0 ^ arg0);
        class75.method588(false);
        class224.method1553(-1);
        class71.method561((byte) 42);
        class517.method3011(arg0 ^ 0x11A);
        class89.method632((byte) 111);
        class145.method1000((byte) 88);
        class779.method4279((byte) 114);
        class234.method1615((byte) -120);
        class14.method129(-16314);
        class346.method2195(arg0 + 42);
        class120.method843(-77);
        class622.method3556(arg0 ^ 0x56);
        class737.method4129((byte) -115);
        class321.method2083((byte) 1);
        class438.method2641(63);
        class487.method2848(true);
        class614.method3528((byte) 127);
        class681.method3849(82);
        class310.method2028((byte) 92);
        class176.method1319(0);
        class251.method1673(-116);
        class69.method537(Integer.MIN_VALUE);
        class554.method3223(4);
        class731.method4096(-14596);
        class449.method2695((byte) -2);
        class379.method2338(-1);
        class101.method707(106);
        class6.method33(-50);
        class654.method3752(arg0 ^ 0xFFFFFFEA);
        class132.method945((byte) 38);
        class76.method593(29754);
        class214.method1494(27276);
        class546.method3177((byte) 112);
        class445.method2679((byte) -113);
        class162.method1272(arg0 - 207);
        class492.method2875(arg0 ^ 0x22);
        class446.method2682((byte) -18);
        class600.method3471(arg0 ^ 0xFFFFD254);
        class347.method2199(59);
        class663.method3779(2588);
        class638.method3631(88);
        class170.method1298(-3878);
        class515.method3004((byte) 121);
        class457.method2728(-116);
        class520.method3028((byte) 59);
        class129.method936((byte) 114);
        class61.method372(6);
        class495.method2895(-127);
        class713.method4039(0);
        class710.method4021(4);
        class250.method1671(0);
        class322.method2098(-2);
        class229.method1585((byte) -128);
        class469.method2782(0);
        class292.method1975(-859);
        class67.method530((byte) 65);
        class489.method2855((byte) -76);
        class558.method3234(true);
        class502.method2932(25746);
        class259.method1708(arg0 - 179);
        class788.method4315(-112);
        class212.method1489((byte) 120);
        class187.method1386(-128);
        class730.method4093((byte) 90);
        class137.method970((byte) 127);
        class552.method3210(arg0 ^ 0x20);
        class262.method1725((byte) -18);
        class194.method1414((byte) 89);
        class482.method2827(27649);
        class104.method713(-95);
        class258.method1698(0);
        class288.method1921(0);
        class355.method2233(2);
        class467.method2755(1);
        class416.method2493(82);
        class453.method2723((byte) -68);
        class704.method3984(1);
        class641.method3644((byte) -114);
        class375.method2327(256);
        class235.method1618((byte) -119);
        class141.method981(arg0 ^ 0xFFFFFFD1);
        class323.method2103((byte) 92);
        class264.method1738(-5499);
        class642.method3647((byte) -107);
        class689.method3882((byte) -121);
        class510.method2981(2);
        class432.method2596(-5287);
        class443.method2671(arg0 ^ 0x152);
        class578.method3359(1);
        class511.method2984((byte) -128);
        class547.method3181(false);
        class110.method766(arg0 + 2);
        class243.method1647(0);
        class549.method3188((byte) -68);
        class472.method2791(53);
        class353.method2220();
        class351.method2213(0);
        class460.method2742(-123);
        class1.method1(arg0 - 83);
        class776.method4263(-124);
        class220.method1520(false);
        class410.method2463(35);
        class430.method2586(true);
        class271.method1766((byte) 67);
        class662.method3777(99);
        class174.method1306((byte) -71);
        class496.method2897(true);
        class359.method2254(arg0 - 95);
        class318.method2077(0);
        class672.method3811(arg0 ^ 0xD553FF62);
        class197.method1425(arg0 ^ 0xFFFFA469);
        class217.method1503((byte) -92);
        class99.method694((byte) 109);
        class277.method1797(true);
        class757.method4180((byte) 30);
        class436.method2609();
        class87.method621((byte) -47);
        class728.method4085(true);
        class163.method1277(arg0 ^ 0x385B);
        class196.method1422((byte) 104);
        class474.method2798((byte) -85);
        class336.method2165((byte) -39);
        class185.method1375(2);
        class701.method3976(arg0 - 50);
        class278.method1805(-2930);
        class650.method3720(0);
        class733.method4100(arg0 ^ 0x76);
        class426.method2538((byte) 65);
        class32.method227(true);
        class24.method181();
        class607.method3497(-20787);
        class784.method4295(arg0 ^ 0xFFFFFF93);
        class516.method3008((byte) 6);
        class386.method2359((byte) -109);
        class405.method2438(2048);
        class684.method3862((byte) -102);
        class221.method1523(arg0 - 245);
        class497.method2903((byte) -59);
        class665.method3791((byte) 87);
        class734.method4106();
        class617.method3535(-11820);
        class34.method235(2);
        class191.method1403((byte) 1);
        class667.method3794((byte) -66);
        class140.method977(-125);
        class433.method2597((byte) -79);
        class481.method2821(true);
        class334.method2158(arg0 - 66);
        class38.method272(true);
        class698.method3935(10);
        class303.method2006((byte) -69);
        class719.method4051((byte) -45);
        class239.method1635((byte) -110);
        class393.method2399(arg0 ^ 0x3);
        class620.method3541();
        class338.method2168(true);
        class297.method1989(false);
        class414.method2482((byte) 84);
        class81.method604();
        class364.method2272(9549);
        class574.method3327(-69);
        class55.method354((byte) 1);
        class484.method2833(0);
        class685.method3863((byte) -116);
        class434.method2601((byte) 112);
        class198.method1435();
        class746.method4162((byte) -96);
        class711.method4024(3);
        class30.method216((byte) -85);
        class572.method3320(true);
        class164.method1280((byte) -23);
        class205.method1476((byte) -117);
        class155.method1227((byte) 98);
        class632.method3608(false);
        class427.method2546(false);
        class330.method2130(true);
        class385.method2355(8660);
        class648.method3704(4);
        class216.method1497(arg0 ^ 0x4B11);
        class74.method578(-27656);
        class550.method3194(-22250);
        class771.method4241(arg0 + 17);
        class604.method3487(false);
        class31.method219((byte) 57);
        class127.method927(0);
        class655.method3757(false);
        class118.method822(11745);
        class478.method2815(arg0 - 16105);
        class455.method2725(-5558);
        class423.method2525((byte) -119);
        class201.method1449((byte) -13);
        class571.method3318(false);
        class758.method4187(arg0 - 74);
        class505.method2940((byte) -22);
        class541.method3119(92);
        class576.method3345((byte) 126);
        class693.method3899(-1);
        class275.method1780(124);
        class25.method191((byte) -120);
        class88.method627(-7152);
        class709.method4019(-81);
        class603.method3482(-13);
        class377.method2333(-2);
        class230.method1597((byte) -98);
        class412.method2473((byte) -125);
        class371.method2295(false);
        class91.method653((byte) -37);
        class130.method940((byte) 53);
        class750.method4167(-1);
        class551.method3207((byte) -113);
        class527.method3061(arg0 ^ 0x2C);
        class22.method164((byte) -110);
        class328.method2124(-7065);
        class543.method3125((byte) 111);
        class366.method2280((byte) -99);
        class82.method607(122);
        class211.method1487((byte) -73);
        class555.method3228(255);
        class365.method2278(true);
        class390.method2387((byte) 102);
        class419.method2501((byte) -108);
        class557.method3231((byte) -117);
        class135.method955((byte) -66);
        class181.method1359((byte) -56);
        class610.method3515(arg0 ^ 0xFFFFF55C);
        class3.method22(-5);
        class686.method3873(112);
        class399.method2424(arg0 ^ 0xFDC);
        class636.method3624(arg0 - 81);
        class238.method1631((byte) 126);
        class302.method2003(-9508);
        class477.method2812(2);
        class630.method3599(-74);
        class471.method2787((byte) 127);
        class361.method2264(6);
        class180.method1356(arg0 ^ 0xFFFFDF84);
        class644.method3682((byte) -6);
        class669.method3798(29);
        class113.method807(4);
        class581.method3379((byte) 87);
        class528.method3066();
        class451.method2717(false);
        class213.method1493(-3034);
        class368.method2287((byte) 25);
        class333.method2153(32768);
        class26.method197((byte) 12);
        class421.method2518(true);
        class175.method1313((byte) -73);
        class596.method3449(true);
        class117.method821(108);
        class149.method1030(28168);
        class265.method1748((byte) -121);
        class633.method3611(arg0 + 25);
        class533.method3087((byte) -103);
        class367.method2282(-31530);
        class241.method1642(-28736);
        class146.method1008(200);
        class435.method2604(arg0 - 209);
        class707.method4008();
        class326.method2114((byte) 84);
        class56.method361();
        class39.method276();
        class566.method3292(0);
        class156.method1233();
        class564.method3272((byte) -92);
        class500.method2908((byte) 102);
        class751.method4174((byte) 114);
        class626.method3589(arg0 ^ 0x52);
        class305.method2011((byte) -87);
        class225.method1556((byte) 116);
        class402.method2430(arg0 - 79);
        class284.method1915((byte) -68);
        class656.method3759((byte) 61);
        class62.method376((byte) 86);
        class269.method1759(12519);
        class190.method1400(100);
        class512.method2987(true);
        class173.method1305((byte) -119);
        class285.method1917((byte) 116);
        class126.method925(true);
        class777.method4272(false);
        class380.method2344(0);
        class12.method127(-1);
        class560.method3251();
        class222.method1530(55);
        class425.method2531(453851608);
        class411.method2472(97);
        class462.method2745(100);
        class324.method2107((byte) 5);
        class621.method3551(52);
        class775.method4251(-7648);
        class313.method2038(0);
        class325.method2112((byte) 92);
        class237.method1625(21);
        class601.method3475((byte) -111);
        class631.method3600((byte) 26);
        class452.method2721(true);
        class791.method4323(-127);
        class563.method3269(-126);
        class567.method3297((byte) 74);
        class48.method316((byte) 61);
        class637.method3627(false);
        class677.method3831(arg0 - 82);
        class772.method4242(126);
        class509.method2979(41);
        class280.method1883(arg0 ^ 0x34E9);
        class415.method2485(0);
        class705.method3998((byte) 20);
        class136.method960((byte) -127);
        class283.method1911((byte) 53);
        class712.method4029(arg0 + 7984);
        class327.method2119((byte) -66);
        class50.method331((byte) 117);
        class599.method3458(0);
        class403.method2431((byte) 43);
        class759.method4190(-128);
        class186.method1382(-427312600);
        class314.method2040((byte) -81);
        class151.method1067((byte) 121);
        class652.method3736(-16478);
        class770.method4237(125);
        class785.method4298((byte) -47);
        class468.method2778(1);
        class428.method2548(0);
        class171.method1300((byte) -125);
        class783.method4290(-120);
        class394.method2401(-76);
        class577.method3348(arg0 - 18);
        class715.method4044(false);
        class9.method107(5);
        class345.method2192(false);
        class789.method4319((byte) -119);
        class762.method4196((byte) 123);
        class491.method2871(arg0 ^ 0xFFFFAE4C);
        class583.method3385(true);
        class673.method3817((byte) 67);
        class718.method4048((byte) -71);
        class743.method4148();
        class763.method4199(492193860);
        class161.method1270(arg0 + 8110);
        class513.method2990(20112);
        class683.method3858(0);
        class584.method3388(-123);
        class456.method2726(119);
        class439.method2659(4096);
        class418.method2499(124);
        class369.method2291(arg0 + 390407058);
        class308.method2020((byte) 90);
        class17.method148(true);
        class606.method3496(-123);
        class687.method3877(1289);
        class535.method3096(127);
        class437.method2635(0);
        class530.method3078(true);
        class270.method1761((byte) -14);
        class470.method2785((byte) 55);
        class358.method2252(-19715);
        class725.method4081(-8);
        class58.method364(-57);
        class203.method1455(0);
        class260.method1709((byte) -84);
        class408.method2461((byte) 98);
        class79.method603(32324);
        class657.method3763(0);
        class595.method3445(22);
        class473.method2796();
        class372.method2310(126);
        class70.method557(true);
        class357.method2248((byte) 111);
        class124.method915((byte) 74);
        class293.method1982(71);
        class575.method3344(arg0 ^ 0x50);
        class96.method681((byte) 71);
        class395.method2408(-2);
        class341.method2187(-30495);
        class480.method2816(true);
        class223.method1545(0);
        class569.method3305((byte) 38);
        class694.method3914(-1967);
        class200.method1443(-1192);
        class664.method3781(0);
        class10.method121(true);
        class519.method3026(26583);
        class679.method3841(-12352);
        class729.method4089(1);
        class703.method3979(false);
        class177.method1337(false);
        class602.method3479(false);
        class459.method2737((byte) 112);
        class738.method4132((byte) 127);
        class306.method2012(false);
        class761.method4194(false);
        class588.method3407((byte) 85);
        class653.method3745(25678);
        class300.method1999((byte) -112);
        class668.method3795((byte) 112);
        class431.method2593(7080);
        class226.method1562(82);
        class256.method1684((byte) -112);
        class179.method1349(-33);
        class363.method2270(-26160);
        class206.method1481(false);
        class747.method4164(-36);
        class597.method3452(36070);
        class90.method638(-126);
        class611.method3522(true);
        class488.method2852(-6408);
        class184.method1371(arg0 - 140);
        class266.method1751(true);
        class780.method4282(arg0 + 43);
        class739.method4140((byte) -25);
        class157.method1236(-16490);
        class524.method3054(false);
        class790.method4320(21915);
        class444.method2677((byte) 10);
        class514.method2993(17619);
        class792.method4326((byte) 81);
        class391.method2391(0);
        class111.method775(0);
        class609.method3513(-1);
        class634.method3612(109);
        class77.method597(8);
        class651.method3732(-126);
        class7.method44((byte) 127);
        class139.method973(false);
        class397.method2419(34336);
        class182.method1362(13922);
        class73.method574(15079);
        class754.method4178(1);
        class147.method1018(16235);
        class417.method2497(false);
        class144.method991(arg0 - 201);
        class115.method815((byte) 115);
        class291.method1969(1);
        class573.method3326(arg0 ^ 0x3C);
        class53.method346(-15790);
        class13.method128((byte) 99);
        class767.method4228(1);
        class125.method919(-1);
        class568.method3299(arg0 ^ 0x7D39);
        class134.method951(15);
        class464.method2752((byte) 49);
        class768.method4234(-113);
        class33.method230(false);
        class542.method3124(-24618);
        class376.method2328(arg0 + 22567);
        class272.method1772(arg0 - 198);
        class485.method2834((byte) 123);
        class619.method3536((byte) 123);
        class646.method3695(14058);
        class724.method4076(false);
        class4.method29(10);
        class312.method2035(126);
        class86.method613((byte) 113);
        class298.method1990(arg0 ^ 0xD2);
        class95.method671(-6);
        class499.method2907(-1);
        class787.method4313(true);
        class781.method4286((byte) -27);
        class286.method1919((byte) 29);
        class268.method1753(32296);
        class676.method3829(arg0 ^ 0x38);
        class518.method3017(arg0 ^ 0xFFFFFFD2);
        class536.method3103(arg0 - 81);
        class526.method3059(123);
        class296.method1985((byte) 123);
        class450.method2716(true);
        class311.method2034(117);
        class247.method1658(91);
        class586.method3397((byte) -76);
        class60.method371(true);
        class54.method347(32427);
        class400.method2429(-7957);
        class760.method4192((byte) -71);
        class534.method3092(256);
        class745.method4159(arg0 ^ 0x53);
        class483.method2828((byte) 113);
        class714.method4040(63);
        class424.method2527((byte) -70);
        class169.method1294((byte) -70);
        class388.method2378(122);
        class84.method609((byte) -106);
        class585.method3392((byte) -55);
        class463.method2749(77);
        class498.method2904(-1169593501);
        class587.method3402(-3);
        class21.method158(arg0 ^ 0x37);
        class27.method203((byte) -94);
        class273.method1773(true);
        class188.method1392(2);
        if (class580.field8224) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwq;)Z")
    public static final boolean method2063(class176 arg0) {
        if (class52.field744) {
            if (method2049(arg0).field9229 != 0) {
                return false;
            }
            if (arg0.field2560 == 0) {
                return false;
            }
        }
        return arg0.field2591;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field4668++;
        try {
            if (arg0.length != 6) {
                class511.method2983(-2371, "Argument count");
            }
            class190.field2837 = new class492();
            class190.field2837.field6989 = Integer.parseInt(arg0[0]);
            class458.field6560 = new class492();
            class458.field6560.field6989 = Integer.parseInt(arg0[1]);
            class775.field10674 = new class492();
            class775.field10674.field6989 = Integer.parseInt(arg0[2]);
            class256.field3599 = class543.field7609;
            if (arg0[3].equals("live")) {
                class482.field6854 = class21.field311;
            } else if (arg0[3].equals("rc")) {
                class482.field6854 = class567.field8017;
            } else if (arg0[3].equals("wip")) {
                class482.field6854 = class624.field8798;
            } else {
                class511.method2983(-2371, "modewhat");
            }
            class526.field7494 = class336.method2163(-1, arg0[4]);
            if (class526.field7494 == -1) {
                if (arg0[4].equals("english")) {
                    class526.field7494 = 0;
                } else if (arg0[4].equals("german")) {
                    class526.field7494 = 1;
                } else {
                    class511.method2983(-2371, "language");
                }
            }
            class553.field7873 = false;
            class777.field10722 = false;
            if (arg0[5].equals("game0")) {
                class536.field7555 = class234.field3384;
            } else if (arg0[5].equals("game1")) {
                class536.field7555 = class23.field344;
            } else if (arg0[5].equals("game2")) {
                class536.field7555 = class6.field61;
            } else if (arg0[5].equals("game3")) {
                class536.field7555 = class397.field5634;
            } else {
                class511.method2983(-2371, "game");
            }
            class108.field1311 = class536.field7555.field1305;
            class491.field6979 = "";
            class557.field7920 = null;
            class277.field3868 = true;
            class279.field3936 = true;
            class82.field1092 = false;
            class139.field1795 = 0;
            class669.field9400 = null;
            class411.field5802 = 0L;
            class87.field1139 = 0;
            class733.field10237 = false;
            class722.field10136 = 0;
            client var1 = new client();
            class364.field5270 = var1;
            var1.method3369(class536.field7555.field1306, 644, 768, false, 37, 1024, -109, class482.field6854.method2662((byte) -121) + 32);
            class463.field6617.setLocation(40, 40);
        } catch (Exception var3) {
            class329.method2129(null, false, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2064() {
        int var0 = class147.field1873;
        int[] var1 = class568.field8045;
        int var2 = class755.field10445 ? var0 : class26.field379 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class449 var4;
            if (var3 < var0) {
                var4 = class581.field8250[var1[var3]];
            } else {
                var4 = ((class14) class543.field7606.method380((byte) -3, (long) class790.field10846[var3 - var0])).field262;
            }
            if (var4.field6369 >= 0) {
                int var5 = var4.method2692((byte) -127);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field7718 & 0x1FF) == 0 && (var4.field7719 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field7718 & 0x1FF) == 256 && (var4.field7719 & 0x1FF) == 256) {
                    continue;
                }
                var4.field7723 = class580.method3366(var4.field7710, (byte) -95, var4.field7719, var4.field7718);
                class513.method2991(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method2065(byte arg0) {
        field4665++;
        String var2 = null;
        try {
            var2 = "[1)" + class103.field1295 + "," + class175.field2496 + "," + class109.field1314 + "," + class760.field10479 + "|";
            if (class251.field3549 != null) {
                var2 = var2 + "2)" + class410.field5771 + "," + (class251.field3549.field6448[0] + class103.field1295) + "," + (class251.field3549.field6445[0] + class175.field2496) + "|";
            }
            var2 = var2 + "3)" + class145.field1852.field9002.method2258((byte) -84) + "|4)" + class145.field1852.field9023.method1399((byte) -39) + "|5)" + class100.method704(0) + "|6)" + class638.field8980 + "," + class512.field7325 + "|";
            var2 = var2 + "7)" + class145.field1852.field8986.method968((byte) -100) + "|";
            var2 = var2 + "8)" + class145.field1852.field9017.method3212((byte) -58) + "|";
            var2 = var2 + "9)" + class145.field1852.field9011.method2495((byte) -115) + "|";
            var2 = var2 + "10)" + class145.field1852.field9031.method2235((byte) -68) + "|";
            if (arg0 != -29) {
                return null;
            }
            var2 = var2 + "11)" + class145.field1852.field8981.method3235((byte) -117) + "|";
            var2 = var2 + "12)" + class145.field1852.field9018.method2757((byte) -49) + "|";
            var2 = var2 + "13)" + class511.field7306 + "|";
            var2 = var2 + "14)" + class757.field10456;
            if (class357.field5197 != null) {
                var2 = var2 + "|15)" + class357.field5197.field1506;
            }
            try {
                if (class145.field1852.field9002.method2258((byte) -125) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4676 == null ? (field4676 = method2067("client")) : field4676).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2066() {
        for (int var0 = 0; var0 < class109.field1314; var0++) {
            int[] var1 = class303.field4547[var0];
            for (int var2 = 0; var2 < class760.field10479; var2++) {
                var1[var2] = 0;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2067(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
