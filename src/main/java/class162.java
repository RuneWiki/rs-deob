import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class162 extends class126 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "Lvr;")
    private class306 field2361 = new class306();

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "Lvr;")
    private class306 field2373 = new class306();

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "Z")
    private boolean field2379;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Lui;")
    public static class375 field2344 = new class375(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "F")
    public static float field2366;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    private int field2364;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    private int field2374;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    private int field2375;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    private int field2377;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Lwk;")
    public static class171 field2346;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "Ljava/awt/Component;")
    private Component field2378;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method802(boolean arg0) {
        field2376++;
        if (!arg0) {
            field2366 = 0.81007165F;
        }
        return (this.field2371 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 17)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field2377 = -1;
        field2353++;
        this.field2374 = -1;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLqa;Lm;)V", line = 28)
    public static final void method1147(byte arg0, class496 arg1, class373 arg2) {
        field2365++;
        if (class135.field1952 == null) {
            return;
        }
        if (class369.field5668 < 10) {
            if (!class135.field1957.method2636(21946, class135.field1952.field4831)) {
                class369.field5668 = class149.field2158.method2646(0, class135.field1952.field4831) / 10;
                return;
            }
            class492.method2921((byte) -24);
            class369.field5668 = 10;
        }
        if (class369.field5668 == 10) {
            class135.field1969 = class135.field1952.field4837 >> 6 << 6;
            class135.field1974 = class135.field1952.field4834 >> 6 << 6;
            class135.field1986 = (class135.field1952.field4819 >> 6 << 6) + 64 - class135.field1969;
            class135.field1968 = (class135.field1952.field4817 >> 6 << 6) + 64 - class135.field1974;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class135.field1952.method2051(0, (class339.field5365.field2217 >> 7) + class82.field1105, class339.field5365.field2210, (class339.field5365.field2215 >> 7) + class437.field6477, var3)) {
                var5 = var3[2] - class135.field1974;
                var4 = var3[1] - class135.field1969;
            }
            if (!class304.field4475 && var4 >= 0 && var4 < class135.field1986 && var5 >= 0 && var5 < class135.field1968) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class277.field3839 = var7;
                class501.field7487 = var6;
            } else if (class95.field1387 == -1 || class458.field6730 == -1) {
                class135.field1952.method2049(arg0 ^ 0xFFFFFF5A, class135.field1952.field4836 >> 14 & 0x3FFF, class135.field1952.field4836 & 0x3FFF, var3);
                class277.field3839 = var3[1] - class135.field1969;
                class501.field7487 = var3[2] - class135.field1974;
            } else {
                class135.field1952.method2049(155, class95.field1387, class458.field6730, var3);
                if (var3 != null) {
                    class501.field7487 = var3[2] - class135.field1974;
                    class277.field3839 = var3[1] - class135.field1969;
                }
                class458.field6730 = -1;
                class95.field1387 = -1;
                class304.field4475 = false;
            }
            if (class135.field1952.field4818 == 37) {
                class135.field1961 = 3.0F;
                class135.field1966 = 3.0F;
            } else if (class135.field1952.field4818 == 50) {
                class135.field1961 = 4.0F;
                class135.field1966 = 4.0F;
            } else if (class135.field1952.field4818 == 75) {
                class135.field1961 = 6.0F;
                class135.field1966 = 6.0F;
            } else if (class135.field1952.field4818 == 100) {
                class135.field1961 = 8.0F;
                class135.field1966 = 8.0F;
            } else if (class135.field1952.field4818 == 200) {
                class135.field1961 = 16.0F;
                class135.field1966 = 16.0F;
            } else {
                class135.field1961 = 8.0F;
                class135.field1966 = 8.0F;
            }
            class135.field1964 = (int) class135.field1961 >> 1;
            class135.field1958 = class483.method2887(0, class135.field1964);
            class504.method3016((byte) -47);
            class135.method877();
            class178.field2537 = new class306();
            class135.field1960 += (int) (Math.random() * 5.0D) - 2;
            if (class135.field1960 < -8) {
                class135.field1960 = -8;
            }
            if (class135.field1960 > 8) {
                class135.field1960 = 8;
            }
            class135.field1965 += (int) (Math.random() * 5.0D) - 2;
            if (class135.field1965 < -16) {
                class135.field1965 = -16;
            }
            if (class135.field1965 > 16) {
                class135.field1965 = 16;
            }
            class135.method895(arg2, class135.field1960 >> 2 << 10, class135.field1965 >> 1);
            class135.field1953.method358((byte) 127, 1024, 256);
            class135.field1950.method328((byte) 29, 256, 256);
            class135.field1951.method2032(-32232, 4096);
            class144.field2075.method650(256, arg0 ^ 0xFFFFFFC1);
            class369.field5668 = 20;
        } else if (class369.field5668 == 20) {
            class483.method2882(true, arg0 ^ 0xFFFFE00C);
            class135.method896(arg1, class135.field1960, class135.field1965);
            class369.field5668 = 60;
            class483.method2882(true, arg0 + 8204);
            class55.method373(arg0 + 63);
        } else if (class369.field5668 == 60) {
            if (class135.field1957.method2633((byte) -114, class135.field1952.field4831 + "_staticelements")) {
                if (!class135.field1957.method2636(21946, class135.field1952.field4831 + "_staticelements")) {
                    return;
                }
                class135.field1963 = class530.method3130(class289.field4305, class135.field1957, -108, class135.field1952.field4831 + "_staticelements");
            } else {
                class135.field1963 = new class338(0);
            }
            class135.method891();
            class369.field5668 = 70;
            class483.method2882(true, 8141);
            class55.method373(0);
        } else if (class369.field5668 == 70) {
            class270.field3761 = new class171(arg1, 11, true, class245.field3430);
            class369.field5668 = 73;
            class483.method2882(true, 8141);
            class55.method373(arg0 ^ 0xFFFFFFC1);
        } else if (class369.field5668 == 73) {
            class219.field3059 = new class171(arg1, 12, true, class245.field3430);
            class369.field5668 = 76;
            class483.method2882(true, 8141);
            class55.method373(0);
        } else if (class369.field5668 == 76) {
            class40.field623 = new class171(arg1, 14, true, class245.field3430);
            class369.field5668 = 79;
            class483.method2882(true, 8141);
            class55.method373(arg0 + 63);
        } else if (class369.field5668 == 79) {
            class499.field7393 = new class171(arg1, 17, true, class245.field3430);
            class369.field5668 = 82;
            class483.method2882(true, 8141);
            class55.method373(0);
        } else if (class369.field5668 == 82) {
            class180.field2571 = new class171(arg1, 19, true, class245.field3430);
            class369.field5668 = 85;
            class483.method2882(true, 8141);
            class55.method373(0);
        } else {
            if (arg0 != -63) {
                field2366 = -1.1402252F;
            }
            if (class369.field5668 == 85) {
                class149.field2144 = new class171(arg1, 22, true, class245.field3430);
                class369.field5668 = 88;
                class483.method2882(true, 8141);
                class55.method373(0);
            } else if (class369.field5668 == 88) {
                field2346 = new class171(arg1, 26, true, class245.field3430);
                class369.field5668 = 91;
                class483.method2882(true, arg0 + 8204);
                class55.method373(0);
            } else {
                class413.field6207 = new class171(arg1, 30, true, class245.field3430);
                class369.field5668 = 100;
                class483.method2882(true, 8141);
                class55.method373(arg0 + 63);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 252)
    public final void method804(int arg0) {
        this.method1150((byte) 52);
        field2362++;
        if (arg0 != -1) {
            this.field2379 = true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 263)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2356++;
        this.method1149((byte) 8, arg0);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Z", line = 271)
    public final boolean method806(int arg0) {
        if (arg0 == 29194) {
            field2350++;
            return (this.field2371 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I", line = 286)
    private final int method1148(boolean arg0, MouseEvent arg1) {
        field2347++;
        if (!arg0) {
            return 111;
        }
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)I", line = 327)
    public final int method811(boolean arg0) {
        if (arg0) {
            return 51;
        } else {
            field2355++;
            return this.field2368;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V", line = 338)
    private final void method1149(byte arg0, MouseEvent arg1) {
        if (arg0 != 8) {
            this.field2377 = 19;
        }
        this.field2374 = arg1.getX();
        field2370++;
        this.field2377 = arg1.getY();
        if (this.field2379) {
            this.method1152(-1, arg1.getY(), 1336147968, arg1.getX());
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Z", line = 357)
    public final boolean method803(byte arg0) {
        if (arg0 < 111) {
            return true;
        } else {
            field2358++;
            return (this.field2371 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!pl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 369)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2357++;
        int var2 = this.method1148(true, arg0);
        if ((var2 & this.field2375) == 0) {
            var2 = this.field2375;
        }
        if ((var2 & 0x1) != 0) {
            this.method1152(3, arg0.getY(), 1336147968, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1152(5, arg0.getY(), 1336147968, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1152(4, arg0.getY(), 1336147968, arg0.getX());
        }
        this.field2375 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 399)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2348++;
        this.method1149((byte) 8, arg0);
    }

    @OriginalMember(owner = "client!pl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 410)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2352++;
        int var2 = this.method1148(true, arg0);
        if (var2 == 1) {
            this.method1152(0, arg0.getY(), 1336147968, arg0.getX());
        } else if (var2 == 4) {
            this.method1152(2, arg0.getY(), 1336147968, arg0.getX());
        } else if (var2 == 2) {
            this.method1152(1, arg0.getY(), 1336147968, arg0.getX());
        }
        this.field2375 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 440)
    private final void method1150(byte arg0) {
        field2369++;
        if (this.field2378 == null) {
            return;
        }
        this.field2378.removeMouseListener(this);
        this.field2378.removeMouseMotionListener(this);
        this.field2373 = null;
        this.field2361 = null;
        this.field2378 = null;
        if (arg0 > 3) {
            this.field2364 = this.field2368 = this.field2371 = 0;
            this.field2374 = this.field2377 = this.field2375 = 0;
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)I", line = 469)
    public final int method812(boolean arg0) {
        if (arg0) {
            return -47;
        } else {
            field2351++;
            return this.field2364;
        }
    }

    @OriginalMember(owner = "client!pl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 482)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2354++;
        this.method1149((byte) 8, arg0);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 490)
    private final void method1151(Component arg0, boolean arg1) {
        this.method1150((byte) 86);
        if (!arg1) {
            this.mouseDragged(null);
        }
        field2359++;
        this.field2378 = arg0;
        this.field2378.addMouseListener(this);
        this.field2378.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)Luj;", line = 504)
    public final class414 method808(int arg0) {
        if (arg0 <= 24) {
            this.method811(false);
        }
        field2360++;
        return (class414) this.field2361.method1962(0);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)V", line = 516)
    private final void method1152(int arg0, int arg1, int arg2, int arg3) {
        field2349++;
        class107 var5 = new class107();
        if (arg2 != 1336147968) {
            return;
        }
        var5.field1509 = arg0;
        var5.field1521 = arg3;
        var5.field1511 = arg1;
        var5.field1514 = class264.method1698(true);
        this.field2373.method1958(var5, arg2 - 1336147968);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lho;I)V", line = 536)
    public static final void method1153(class218 arg0, int arg1) {
        if (arg1 <= 26) {
            return;
        }
        arg0.field3020 = false;
        field2345++;
        if (arg0.field3021 != null) {
            arg0.field3021.field2969 = 0;
        }
        for (class218 var2 = arg0.method1251(); var2 != null; var2 = arg0.method1260()) {
            method1153(var2, 27);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILwq;IIIIIIZIII)Z", line = 557)
    public static final boolean method1154(int arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field2372++;
        int var12 = arg3;
        int var13 = arg2;
        if (!arg8) {
            field2346 = null;
        }
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg3 - var14;
        int var17 = arg2 - var15;
        class91.field1335[var14][var15] = 99;
        class77.field1063[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class498.field7264[var18] = arg3;
        int var35 = var18 + 1;
        class510.field7589[var18] = arg2;
        int[][] var20 = arg1.field5678;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class96.field1400 = var12;
                                    class411.field6181 = var13;
                                    return false;
                                }
                                var12 = class498.field7264[var19];
                                var13 = class510.field7589[var19];
                                var21 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var12 - var16;
                                var23 = var12 - arg1.field5692;
                                var24 = var13 - arg1.field5669;
                                if (arg0 == -4) {
                                    if (arg9 == var12 && arg10 == var13) {
                                        class411.field6181 = var13;
                                        class96.field1400 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -3) {
                                    if (class231.method1574(var13, arg5, arg7, arg6, arg10, 2, arg9, arg7, var12)) {
                                        class411.field6181 = var13;
                                        class96.field1400 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -2) {
                                    if (arg1.method2313(var12, arg7, arg6, true, arg4, var13, arg7, arg10, arg5, arg9)) {
                                        class411.field6181 = var13;
                                        class96.field1400 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -1) {
                                    if (arg1.method2317(arg6, 123, arg7, arg9, var12, arg10, arg5, var13, arg4)) {
                                        class411.field6181 = var13;
                                        class96.field1400 = var12;
                                        return true;
                                    }
                                } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                                    if (arg1.method2308(arg0, arg10, var12, (byte) -78, arg11, var13, arg7, arg9)) {
                                        class96.field1400 = var12;
                                        class411.field6181 = var13;
                                        return true;
                                    }
                                } else if (arg1.method2307(arg9, -117, arg0, var12, arg7, var13, arg11, arg10)) {
                                    class411.field6181 = var13;
                                    class96.field1400 = var12;
                                    return true;
                                }
                                var26 = class77.field1063[var22][var21] + 1;
                                if (var22 > 0 && class91.field1335[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg7 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg7 - 1) <= var27) {
                                            class498.field7264[var35] = var12 - 1;
                                            class510.field7589[var35] = var13;
                                            class91.field1335[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class77.field1063[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < (128 - arg7) && class91.field1335[var22 + 1][var21] == 0 && (var20[arg7 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg7][arg7 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg7 - 1) {
                                            class498.field7264[var35] = var12 + 1;
                                            class510.field7589[var35] = var13;
                                            class91.field1335[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class77.field1063[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg7][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class91.field1335[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg7 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg7 - 1 <= var29) {
                                            class498.field7264[var35] = var12;
                                            class510.field7589[var35] = var13 - 1;
                                            class91.field1335[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class77.field1063[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (128 - arg7 > var21 && class91.field1335[var22][var21 + 1] == 0 && (var20[var23][arg7 + var24] & 0x4E240000) == 0 && (var20[arg7 + var23 - 1][arg7 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg7 - 1)) {
                                            class498.field7264[var35] = var12;
                                            class510.field7589[var35] = var13 + 1;
                                            class91.field1335[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class77.field1063[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg7] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class91.field1335[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg7 <= var31) {
                                            class498.field7264[var35] = var12 - 1;
                                            class510.field7589[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class91.field1335[var22 - 1][var21 - 1] = 3;
                                            class77.field1063[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 - (1 - var31)][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < 128 - arg7 && var21 > 0 && class91.field1335[var22 + 1][var21 - 1] == 0 && (var20[arg7 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg7 <= var32) {
                                            class498.field7264[var35] = var12 + 1;
                                            class510.field7589[var35] = var13 - 1;
                                            class91.field1335[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class77.field1063[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg7 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < 128 - arg7 && class91.field1335[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg7 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg7; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg7 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class498.field7264[var35] = var12 - 1;
                                    class510.field7589[var35] = var13 + 1;
                                    class91.field1335[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class77.field1063[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= (128 - arg7));
                        } while (var21 >= 128 - arg7);
                    } while (class91.field1335[var22 + 1][var21 + 1] != 0);
                } while ((var20[var23 + arg7][arg7 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg7; var34++) {
                    if ((var20[var23 + var34][arg7 + var24] & 0x7E240000) != 0 || (var20[var23 + arg7][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class498.field7264[var35] = var12 + 1;
                class510.field7589[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class91.field1335[var22 + 1][var21 + 1] = 12;
                class77.field1063[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 993)
    public final synchronized void method801(int arg0) {
        this.field2371 = this.field2375;
        field2367++;
        if (arg0 != -8379) {
            return;
        }
        this.field2368 = this.field2377;
        this.field2364 = this.field2374;
        class306 var2 = this.field2361;
        this.field2361 = this.field2373;
        this.field2373 = var2;
        this.field2373.method1959((byte) 113);
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)V", line = 1016)
    public static void method1155(int arg0) {
        if (arg0 == -1) {
            field2344 = null;
            field2346 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 1028)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2363++;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 1052)
    public class162(Component arg0, boolean arg1) {
        this.method1151(arg0, true);
        this.field2379 = arg1;
    }
}
