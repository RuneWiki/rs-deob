import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 implements Runnable {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lsc;")
    private class166 field390 = new class166();

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public int field401 = 0;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Z")
    private boolean field399 = false;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field398;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field393 = 0;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Z")
    public static boolean field402 = true;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLim;III)V")
    public static final void method158(boolean arg0, class178 arg1, int arg2, int arg3, int arg4) {
        field392++;
        int var5 = arg1.field2571;
        if (arg1.field2537 == 0) {
            arg1.field2571 = arg1.field2660;
        } else if (arg1.field2537 == 1) {
            arg1.field2571 = arg3 - arg1.field2660;
        } else if (arg1.field2537 == 2) {
            arg1.field2571 = arg1.field2660 * arg3 >> 14;
        } else if (arg1.field2537 == 3) {
            if (arg1.field2608 == 2) {
                arg1.field2571 = (arg1.field2660 - 1) * arg1.field2587 + arg1.field2660 * 32;
            } else if (arg1.field2608 == 7) {
                arg1.field2571 = (arg1.field2660 - 1) * arg1.field2587 + arg1.field2660 * 12;
            }
        }
        int var6 = arg1.field2529;
        if (~arg1.field2621 == arg2) {
            arg1.field2529 = arg1.field2530;
        } else if (arg1.field2621 == 1) {
            arg1.field2529 = arg4 - arg1.field2530;
        } else if (arg1.field2621 == 2) {
            arg1.field2529 = arg1.field2530 * arg4 >> 14;
        } else if (arg1.field2621 == 3) {
            if (arg1.field2608 == 2) {
                arg1.field2529 = (arg1.field2530 - 1) * arg1.field2624 + arg1.field2530 * 32;
            } else if (arg1.field2608 == 7) {
                arg1.field2529 = arg1.field2530 * 115 + ((arg1.field2530 - 1) * arg1.field2624);
            }
        }
        if (arg1.field2621 == 4) {
            arg1.field2529 = arg1.field2706 * arg1.field2571 / arg1.field2606;
        }
        if (arg1.field2537 == 4) {
            arg1.field2571 = arg1.field2606 * arg1.field2529 / arg1.field2706;
        }
        if (class16.field288 && (client.method2028(arg1).field4739 != 0 || arg1.field2608 == 0)) {
            if (arg1.field2571 < 5 && arg1.field2529 < 5) {
                arg1.field2571 = 5;
                arg1.field2529 = 5;
            } else {
                if (arg1.field2571 <= 0) {
                    arg1.field2571 = 5;
                }
                if (arg1.field2529 <= 0) {
                    arg1.field2529 = 5;
                }
            }
        }
        if (arg1.field2694 == 1337) {
            class215.field3250 = arg1;
        }
        if (arg0 && arg1.field2548 != null && arg1.field2529 != var6 || arg1.field2571 != var5) {
            class272 var7 = new class272();
            var7.field4340 = arg1.field2548;
            var7.field4337 = arg1;
            class303.field4846.method370((byte) -22, var7);
        }
    }

    @OriginalMember(owner = "client!lj", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field399) {
            class166 var1 = this.field390;
            class251 var2;
            synchronized (this.field390) {
                var2 = (class251) this.field390.method1063((byte) -99);
                if (var2 == null) {
                    try {
                        this.field390.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field401--;
            }
            try {
                if (var2.field3927 == 2) {
                    var2.field3919.method897(true, var2.field3926.length, (int) var2.field1793, var2.field3926);
                } else if (var2.field3927 == 3) {
                    var2.field3926 = var2.field3919.method896((int) var2.field1793, (byte) 119);
                }
            } catch (Exception var6) {
                class121.method780(160, (String) null, var6);
            }
            var2.field1712 = false;
        }
        field396++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static final void method159(byte arg0) {
        field395++;
        if (class11.method69((byte) -70) != 2) {
            return;
        }
        byte var1 = (byte) (class167.field2396 - 4 & 0xFF);
        int var2 = class167.field2396 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class51.field724[var3][var2][var16] = var1;
            }
        }
        if (arg0 < 30) {
            method158(false, (class178) null, -45, -117, 4);
        }
        if (class166.field2364 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class5.field48[var4] = -1000000;
            class72.field1037[var4] = 1000000;
            class31.field465[var4] = 0;
            class42.field625[var4] = 1000000;
            class136.field1863[var4] = 0;
        }
        if (class12.field203 != 1) {
            int var15 = class58.method360(class188.field2848, class178.field2603, false, class166.field2364);
            if (var15 - class27.field423 >= 800 || (class164.field2333[class166.field2364][class178.field2603 >> 7][class188.field2848 >> 7] & 0x4) == 0) {
                return;
            }
            class244.method1601(class188.field2848 >> 7, class246.field3856, 1, (byte) -101, class178.field2603 >> 7, false);
            return;
        }
        if ((class164.field2333[class166.field2364][class250.field3905.field4081 >> 7][class250.field3905.field4140 >> 7] & 0x4) != 0) {
            class244.method1601(class250.field3905.field4140 >> 7, class246.field3856, 0, (byte) -120, class250.field3905.field4081 >> 7, false);
        }
        if (class277.field4407 >= 310) {
            return;
        }
        int var5 = class178.field2603 >> 7;
        int var6 = class188.field2848 >> 7;
        int var7 = class250.field3905.field4081 >> 7;
        int var8 = class250.field3905.field4140 >> 7;
        int var9;
        if (var6 < var8) {
            var9 = var8 - var6;
        } else {
            var9 = var6 - var8;
        }
        int var10;
        if (var7 > var5) {
            var10 = var7 - var5;
        } else {
            var10 = var5 - var7;
        }
        if ((var10 != 0 || var9 != 0) && var10 > -104 && var10 < 104 && var9 > -104 && var9 < 104) {
            if (var9 < var10) {
                int var11 = 32768;
                int var12 = var9 * 65536 / var10;
                while (var5 != var7) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    if ((class164.field2333[class166.field2364][var5][var6] & 0x4) != 0) {
                        class244.method1601(var6, class246.field3856, 1, (byte) -127, var5, false);
                        return;
                    }
                    var11 += var12;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var8 > var6) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        if ((class164.field2333[class166.field2364][var5][var6] & 0x4) != 0) {
                            class244.method1601(var6, class246.field3856, 1, (byte) -90, var5, false);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class164.field2333[class166.field2364][var5][var6] & 0x4) != 0) {
                    class244.method1601(var6, class246.field3856, 1, (byte) -95, var5, false);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    var14 -= 65536;
                    if ((class164.field2333[class166.field2364][var5][var6] & 0x4) != 0) {
                        class244.method1601(var6, class246.field3856, 1, (byte) -127, var5, false);
                        return;
                    }
                }
            }
            return;
        }
        class121.method780(160, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class228.field3570 + "," + class170.field2421, (Throwable) null);
        return;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIILsk;Lsk;IIJ)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, class202 arg4, class202 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class180 var10 = new class180();
        var10.field2737 = arg8;
        var10.field2736 = arg1 * 128 + 64;
        var10.field2732 = arg2 * 128 + 64;
        var10.field2740 = arg3;
        var10.field2735 = arg4;
        var10.field2729 = arg5;
        var10.field2731 = arg6;
        var10.field2734 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class246.field3856[var11][arg1][arg2] == null) {
                class246.field3856[var11][arg1][arg2] = new class91(var11, arg1, arg2);
            }
        }
        class246.field3856[arg0][arg1][arg2].field1334 = var10;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (arg0 != 20004) {
            return;
        }
        this.field399 = true;
        field394++;
        class166 var2 = this.field390;
        synchronized (this.field390) {
            this.field390.notifyAll();
        }
        try {
            this.field398.join();
        } catch (InterruptedException var3) {
        }
        this.field398 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILki;Z)Ldk;")
    public final class251 method162(int arg0, class142 arg1, boolean arg2) {
        field403++;
        class251 var4 = new class251();
        var4.field3927 = 1;
        class166 var5 = this.field390;
        synchronized (this.field390) {
            class251 var6 = (class251) this.field390.method1059((byte) -106);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field1793 && var6.field3919 == arg1 && var6.field3927 == 2) {
                    var4.field1712 = false;
                    var4.field3926 = var6.field3926;
                    return var4;
                }
                var6 = (class251) this.field390.method1064((byte) -115);
            }
        }
        var4.field3926 = arg1.method896(arg0, (byte) 98);
        var4.field1712 = arg2;
        var4.field1719 = true;
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILki;I)Ldk;")
    public final class251 method163(int arg0, class142 arg1, int arg2) {
        field389++;
        class251 var4 = new class251();
        var4.field3919 = arg1;
        var4.field3927 = 3;
        if (arg2 >= -108) {
            this.field399 = false;
        }
        var4.field1719 = false;
        var4.field1793 = (long) arg0;
        this.method165(var4, 123);
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIILki;)Ldk;")
    public final class251 method164(byte[] arg0, int arg1, int arg2, class142 arg3) {
        field397++;
        class251 var5 = new class251();
        var5.field1793 = (long) arg1;
        var5.field1719 = false;
        var5.field3927 = 2;
        if (arg2 != 0) {
            this.run();
        }
        var5.field3919 = arg3;
        var5.field3926 = arg0;
        this.method165(var5, arg2 - 87);
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ldk;I)V")
    private final void method165(class251 arg0, int arg1) {
        field400++;
        class166 var3 = this.field390;
        synchronized (this.field390) {
            this.field390.method1068(arg0, (byte) -45);
            this.field401++;
            this.field390.notifyAll();
        }
        int var4 = 120 / ((69 - arg1) / 53);
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class25() {
        class286 var1 = class45.field667.method325((byte) -75, this, 5);
        while (var1.field4570 == 0) {
            class17.method116(125, 10L);
        }
        if (var1.field4570 == 2) {
            throw new RuntimeException();
        }
        this.field398 = (Thread) var1.field4567;
    }
}
