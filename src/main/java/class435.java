import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class435 implements Runnable {

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Lm;")
    private class242 field6318 = new class242();

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field6314 = new Thread(this);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lir;")
    public static class185 field6307;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public static void method2714(boolean arg0) {
        field6307 = null;
        if (arg0) {
            method2717(-61, (class193) null);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method2715(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field6316++;
        if (class338.method2195(arg3, 6173)) {
            client.method418(class4.field71[arg3], -1, arg2, arg7, arg6, arg1, arg4, arg0);
            if (arg5 > -123) {
                field6313 = -39;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZIII)I")
    public static final int method2716(boolean arg0, int arg1, int arg2, int arg3) {
        field6308++;
        class387 var4 = (class387) class67.field982.method2826(false, (long) arg3);
        if (arg1 >= -33) {
            return 121;
        } else if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field5658.length; var6++) {
                if (var4.field5658[var6] >= 0 && class15.field234 > var4.field5658[var6]) {
                    class159 var7 = class129.method915(126, var4.field5658[var6]);
                    int var8 = var7.method1058(0, arg2, class410.method2595(-22867, arg2).field1960);
                    if (arg0) {
                        var5 += var4.field5657[var6] * var8;
                    } else {
                        var5 += var8;
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILda;)V")
    public static final void method2717(int arg0, class193 arg1) {
        class266.field3950[arg0] = arg1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILob;)V")
    private final void method2718(int arg0, class418 arg1) {
        class242 var3 = this.field6318;
        synchronized (this.field6318) {
            this.field6318.method1560(-99, arg1);
            if (arg0 != 16) {
                this.method2720(85, (String) null);
            }
            this.field6318.notify();
        }
        field6309++;
    }

    @OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
    public final void run() {
        field6312++;
        while (true) {
            class242 var1 = this.field6318;
            class217 var3;
            synchronized (this.field6318) {
                class418 var2;
                for (var2 = this.field6318.method1569(24502); var2 == null; var2 = this.field6318.method1569(24502)) {
                    try {
                        this.field6318.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class217)) {
                    return;
                }
                var3 = (class217) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3035).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3034 = var5;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZIIII)V")
    public static final void method2719(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field6311++;
        if (arg1) {
            class170.method1141(-1);
        }
        if (class211.field2872 != null && (arg3 != 3 || class289.field4338 != arg4 || class197.field2724 != arg5)) {
            class90.method718(class211.field2872, class63.field948, -16783);
            class211.field2872 = null;
        }
        if (arg3 == 3 && class211.field2872 == null) {
            class211.field2872 = class184.method1196(class63.field948, 0, 115, arg4, arg5, 0);
            if (class211.field2872 != null) {
                class289.field4338 = arg4;
                class197.field2724 = arg5;
                class212.method1398(-124, class63.field948);
            }
        }
        if (arg3 == 3 && class211.field2872 == null) {
            method2719(arg0, true, 0, class195.field2700, -1, -1);
            return;
        }
        Container var6;
        if (class211.field2872 != null) {
            var6 = class211.field2872;
            class159.field2075 = arg4;
            class331.field4882 = arg5;
        } else if (class428.field6222 == null) {
            var6 = class63.field948.field5381;
            class159.field2075 = var6.getSize().width;
            class331.field4882 = var6.getSize().height;
        } else {
            Insets var7 = class428.field6222.getInsets();
            class159.field2075 = class428.field6222.getSize().width - var7.right - var7.left;
            int var10001 = var7.top + var7.bottom;
            class331.field4882 = class428.field6222.getSize().height - var10001;
            var6 = class428.field6222;
        }
        if (arg3 == 1) {
            field6313 = 503;
            class244.field3436 = 0;
            class357.field5298 = 765;
            class420.field6109 = (class159.field2075 - 765) / 2;
        } else if (class393.field5727 < 96 && class397.field5796 == 0) {
            int var8 = class159.field2075 <= 1024 ? class159.field2075 : 1024;
            class420.field6109 = (class159.field2075 - var8) / 2;
            class357.field5298 = var8;
            int var9 = class331.field4882 <= 768 ? class331.field4882 : 768;
            class244.field3436 = 0;
            field6313 = var9;
        } else {
            class244.field3436 = 0;
            class420.field6109 = 0;
            class357.field5298 = class159.field2075;
            field6313 = class331.field4882;
        }
        if (class72.field1026 != 0) {
            boolean var10000;
            if (class357.field5298 < 1024 && field6313 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class169.method1127((byte) -105, class397.field5796);
        } else {
            class422.field6138.setSize(class357.field5298, field6313);
            if (class126.field1647 != null) {
                class126.field1647.method454();
            }
            if (class428.field6222 == var6) {
                Insets var10 = class428.field6222.getInsets();
                class422.field6138.setLocation(class420.field6109 + var10.left, var10.top - -class244.field3436);
            } else {
                class422.field6138.setLocation(class420.field6109, class244.field3436);
            }
        }
        if (arg3 >= 2) {
            class424.field6183 = true;
        } else {
            class424.field6183 = false;
        }
        if (class233.field3246 != -1) {
            class453.method2813((byte) -108, true);
        }
        if (class290.field4380 != null && (class381.field5579 == 30 || class381.field5579 == 25)) {
            class132.method944((byte) 102);
        }
        for (int var11 = arg2; var11 < 100; var11++) {
            class33.field536[var11] = true;
        }
        class381.field5586 = true;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;)Loh;")
    public final class217 method2720(int arg0, String arg1) {
        field6315++;
        if (this.field6314 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class217 var3 = new class217(arg1);
            this.method2718(16, var3);
            if (arg0 >= -106) {
                method2717(95, (class193) null);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)V")
    public static final void method2721(int arg0, int arg1, int arg2, int arg3) {
        class77 var4 = class106.field1405[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class236 var5 = var4.field1063;
        class236 var6 = var4.field1076;
        if (var5 != null) {
            var5.field3300 = var5.field3300 * arg3 / 16;
            var5.field3298 = var5.field3298 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field3300 = var6.field3300 * arg3 / 16;
            var6.field3298 = var6.field3298 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public final void method2722(int arg0) {
        field6305++;
        if (this.field6314 == null) {
            return;
        }
        this.method2718(16, new class418());
        if (arg0 != 27277) {
            method2724(-50);
        }
        try {
            this.field6314.join();
        } catch (InterruptedException var2) {
        }
        this.field6314 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IBIII)V")
    public static final void method2723(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6306++;
        int var5 = -46 / ((-arg1 - 54) / 49);
        for (int var6 = 0; var6 < class400.field5854; var6++) {
            Rectangle var7 = class418.field6092[var6];
            if (arg4 < var7.x + var7.width && (arg2 + arg4) > var7.x && arg3 < (var7.y + var7.height) && var7.y < (arg0 + arg3)) {
                class33.field536[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
    public static final void method2724(int arg0) {
        class71.method586(-1);
        field6319++;
        class144.field1829 = null;
        class117.field1529 = null;
        class232.field3224 = null;
        class422.field6134 = null;
        class243.field3405 = null;
        if (arg0 > -61) {
            field6307 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ltj;IIILbd;Lw;)Z")
    public static final boolean method2725(class298 arg0, int arg1, int arg2, int arg3, class27 arg4, class170 arg5) {
        field6310++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg5.field2326 != null) {
            var7 = (arg5.field2340 + arg4.field464 - class200.field2772) * (class200.field2790 - class200.field2784) / (class200.field2780 - class200.field2772) + class200.field2784;
            var6 = (arg5.field2296 + arg4.field464 - class200.field2772) * (class200.field2790 - class200.field2784) / (class200.field2780 - class200.field2772) + class200.field2784;
            var9 = class200.field2787 - ((arg5.field2297 + arg4.field467 - class200.field2785) * (class200.field2787 - class200.field2791) / (class200.field2786 - class200.field2785));
            var8 = class200.field2787 - ((class200.field2787 - class200.field2791) * (arg4.field467 + arg5.field2333 - class200.field2785) / (class200.field2786 - class200.field2785));
        }
        class315 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg5.field2328 != -1) {
            if (arg4.field458 && arg5.field2325 != -1) {
                var10 = arg5.method1143(true, true, arg0);
            } else {
                var10 = arg5.method1143(false, true, arg0);
            }
            if (var10 != null) {
                var11 = arg4.field459 - (var10.method199() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg4.field459 + (var10.method199() + 1 >> 1);
                var13 = arg4.field470 - (var10.method207() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg4.field470 + (var10.method207() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class414 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = arg2;
        int var22 = 0;
        if (arg5.field2320 != null) {
            var15 = class4.method26(arg5.field2303, (byte) -125);
            if (var15 != null) {
                var16 = class276.field4054.method2690((byte) 67, (int[]) null, arg5.field2320, class238.field3334, (class315[]) null);
                int var23 = arg4.field470;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2611() / 2;
                } else {
                    var17 = var23 - ((var10.method207() >> 1) + var15.method2615() * var16);
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class238.field3334[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2612(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg4.field459 - (var18 / 2 - arg3);
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg4.field459 + arg3;
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = var17 + arg1;
                var22 = arg1 + var16 * var15.method2615() + var17;
                if (var21 < var8) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class200.field2784 > var7 || class200.field2790 < var6 || class200.field2791 > var9 || class200.field2787 < var8) {
            return true;
        }
        if (arg5.field2326 != null) {
            int[] var27 = new int[arg5.field2326.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg5.field2326[var28 * 2] + arg4.field464;
                int var31 = arg5.field2326[var28 * 2 + 1] + arg4.field467;
                var27[var28 * 2] = class200.field2784 + ((class200.field2790 - class200.field2784) * (var30 - class200.field2772) / (class200.field2780 - class200.field2772));
                var27[var28 * 2 + 1] = class200.field2787 - ((class200.field2787 - class200.field2791) * (var31 - class200.field2785) / (class200.field2786 - class200.field2785));
            }
            class419.method2644(arg0, var27, arg5.field2319);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg0.method2021((byte) -99, var27[var29 * 2 + 2], var27[var29 * 2 + 1 + 2], var27[var29 * 2], var27[var29 * 2 + 1], arg5.field2327);
            }
            arg0.method2021((byte) -76, var27[0], var27[1], var27[var27.length - 2], var27[var27.length - 1], arg5.field2327);
        }
        if (var10 != null) {
            if (class280.field4118 > 0 && (class169.field2281 != -1 && class169.field2281 == arg4.field462 || class396.field5784 != -1 && class396.field5784 == arg5.field2299)) {
                int var32;
                if (class184.field2463 <= 50) {
                    var32 = class184.field2463 * 2;
                } else {
                    var32 = (100 - class184.field2463) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg0.method2015(arg4.field459, arg4.field470, var10.method208() / 2 + 7, false, var33);
                arg0.method2015(arg4.field459, arg4.field470, var10.method208() / 2 + 5, false, var33);
                arg0.method2015(arg4.field459, arg4.field470, var10.method208() / 2 + 3, false, var33);
                arg0.method2015(arg4.field459, arg4.field470, var10.method208() / 2 + 1, false, var33);
                arg0.method2015(arg4.field459, arg4.field470, var10.method208() / 2, false, var33);
            }
            var10.method2070(arg4.field459 - (var10.method199() >> 1), arg4.field470 - (var10.method207() >> 1));
        }
        if (arg5.field2320 != null && var15 != null) {
            class133.method948(var17, var16, arg4, var18, (byte) 120, var15, arg5, arg0);
        }
        if (arg5.field2328 != -1 || arg5.field2320 != null) {
            class167 var34 = new class167(arg4);
            var34.field2267 = var12;
            var34.field2269 = var20;
            var34.field2263 = var14;
            var34.field2265 = var22;
            var34.field2253 = var19;
            var34.field2257 = var11;
            var34.field2259 = var13;
            var34.field2256 = var21;
            class394.field5730.method1560(arg2 - 118, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
    public class435() {
        this.field6314.setDaemon(true);
        this.field6314.start();
    }
}
