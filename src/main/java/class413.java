import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class413 {

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Ljp;")
    private class236 field5716 = new class236(64);

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "Ljp;")
    public class236 field5720 = new class236(50);

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Lko;")
    public class348 field5721 = new class348(250);

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "Lee;")
    private class476 field5722 = new class476();

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Z")
    private boolean field5708;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "Lct;")
    private class97 field5723;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field5703;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Lpc;")
    public class473 field5700;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Lpc;")
    private class473 field5709;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public int field5697;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field5724;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field5725;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field5715 = 0;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Lvj;")
    public static class304 field5712 = new class304("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "Z")
    public static boolean field5718 = false;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Z")
    public static boolean field5717 = true;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public int field5726;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Lf;")
    public static class529 field5714;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 3)
    public final void method2389(int arg0) {
        int var2 = 78 / ((-arg0 - 5) / 37);
        field5701++;
        class348 var3 = this.field5721;
        synchronized (this.field5721) {
            this.field5721.method2036(16196);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lbs;", line = 22)
    public final class482 method2390(int arg0, int arg1) {
        if (arg0 <= 32) {
            return null;
        }
        field5698++;
        class236 var3 = this.field5716;
        class482 var4;
        synchronized (this.field5716) {
            var4 = (class482) this.field5716.method1456((long) arg1, 117);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5709.method2708(class445.method2564(arg1, true), class447.method2567(1431, arg1), (byte) 54);
        class482 var6 = new class482();
        var6.field6661 = this;
        var6.field6674 = arg1;
        var6.field6662 = new String[] { null, null, class129.field1884.method1764(this.field5703, false), null, null };
        var6.field6691 = new String[] { null, null, null, null, class152.field2209.method1764(this.field5703, false) };
        if (var5 != null) {
            var6.method2777(-1, new class379(var5));
        }
        var6.method2769((byte) -122);
        if (var6.field6639 != -1) {
            var6.method2775(this.method2390(93, var6.field6702), this.method2390(78, var6.field6639), -24274);
        }
        if (var6.field6665 != -1) {
            var6.method2779(this.method2390(97, var6.field6665), this.method2390(87, var6.field6713), (byte) -35);
        }
        if (!this.field5708 && var6.field6689) {
            var6.field6697 = class329.field4341.method1764(this.field5703, false);
            var6.field6691 = this.field5725;
            var6.field6656 = 0;
            var6.field6662 = this.field5724;
            var6.field6650 = false;
            var6.field6693 = null;
            if (var6.field6659 != null) {
                boolean var7 = false;
                for (class42 var8 = var6.field6659.method181((byte) -70); var8 != null; var8 = var6.field6659.method179(1)) {
                    class495 var9 = this.field5723.method693((int) var8.field622, 127);
                    if (var9.field6872) {
                        var8.method300(false);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field6659 = null;
                }
            }
        }
        class236 var10 = this.field5716;
        synchronized (this.field5716) {
            this.field5716.method1462(var6, (long) arg1, -68);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)V", line = 95)
    public final void method2391(int arg0, byte arg1) {
        this.field5726 = arg0;
        field5711++;
        class236 var3 = this.field5720;
        synchronized (this.field5720) {
            this.field5720.method1458((byte) 61);
            if (arg1 > -75) {
                this.field5700 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lqa;IIBIIILag;)Lf;", line = 109)
    public final class529 method2392(class162 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class480 arg7) {
        this.field5722.field6564 = arg0.field2378;
        this.field5722.field6559 = arg4;
        this.field5722.field6567 = arg1;
        field5706++;
        this.field5722.field6562 = arg6;
        if (arg3 < 99) {
            return null;
        } else {
            this.field5722.field6558 = arg5;
            this.field5722.field6561 = arg2;
            this.field5722.field6568 = arg7 != null;
            return (class529) this.field5721.method2035(this.field5722, 0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 130)
    public final void method2393(byte arg0) {
        class236 var2 = this.field5720;
        synchronized (this.field5720) {
            this.field5720.method1458((byte) -66);
        }
        int var3 = -40 / ((arg0 + 8) / 54);
        field5702++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V", line = 146)
    public static final void method2394(int arg0, String arg1, String arg2, String arg3, int arg4, int arg5, String arg6, int arg7) {
        field5710++;
        for (int var8 = 99; var8 > 0; var8--) {
            class28.field481[var8] = class28.field481[var8 - 1];
            class172.field2508[var8] = class172.field2508[var8 - 1];
            class169.field2473[var8] = class169.field2473[var8 - 1];
            class340.field4445[var8] = class340.field4445[var8 - 1];
            class364.field4924[var8] = class364.field4924[var8 - 1];
            class233.field3141[var8] = class233.field3141[var8 - 1];
            class456.field6275[var8] = class456.field6275[var8 - 1];
        }
        class28.field481[0] = arg7;
        class169.field2473[0] = arg3;
        class172.field2508[0] = arg5;
        if (arg0 != -4694) {
            return;
        }
        class340.field4445[0] = arg2;
        class364.field4924[0] = arg1;
        class456.field6275[0] = arg4;
        class402.field5383 = class308.field4051;
        class156.field2282++;
        class233.field3141[0] = arg6;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)V", line = 181)
    public final void method2395(int arg0, int arg1) {
        field5719++;
        class236 var3 = this.field5716;
        synchronized (this.field5716) {
            this.field5716.method1461(arg0 - 4, arg1);
        }
        class236 var4 = this.field5720;
        synchronized (this.field5720) {
            this.field5720.method1461(-5, arg1);
        }
        class348 var5 = this.field5721;
        synchronized (this.field5721) {
            this.field5721.method2028(1, arg1);
        }
        if (arg0 != -1) {
            this.field5721 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILpc;IIIZ)V", line = 200)
    public static final void method2396(int arg0, int arg1, class473 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class60.field943 = arg2;
        class342.field4520 = 1;
        class177.field2570 = arg6;
        field5713++;
        class433.field5910 = arg3;
        if (arg0 != -16224) {
            field5712 = null;
        }
        class49.field759 = arg5;
        class528.field7808 = arg1;
        class108.field1575 = arg4;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 219)
    public static void method2397(int arg0) {
        field5712 = null;
        if (arg0 != 0) {
            method2397(-78);
        }
        field5714 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BZ)V", line = 236)
    public final void method2398(byte arg0, boolean arg1) {
        field5699++;
        if (this.field5708 == arg1) {
            return;
        }
        if (arg0 != 19) {
            this.method2391(-123, (byte) 13);
        }
        this.field5708 = arg1;
        this.method2401(10551);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZLqa;IIZILag;Lqa;ILoa;ZI)Lf;", line = 251)
    public final class529 method2399(boolean arg0, class162 arg1, int arg2, int arg3, boolean arg4, int arg5, class480 arg6, class162 arg7, int arg8, class489 arg9, boolean arg10, int arg11) {
        field5707++;
        class529 var13 = this.method2392(arg1, arg8, arg2, (byte) 111, arg3, arg11, arg5, arg6);
        if (var13 != null) {
            return var13;
        }
        if (!arg10) {
            this.field5703 = 120;
        }
        class482 var14 = this.method2390(97, arg5);
        if (arg8 > 1 && var14.field6707 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg8 >= var14.field6679[var16] && var14.field6679[var16] != 0) {
                    var15 = var14.field6707[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2390(106, var15);
            }
        }
        int[] var17 = var14.method2782(arg11, arg8, arg2, arg3, arg1, (byte) -18, arg0, arg9, arg7, arg6);
        if (var17 == null) {
            return null;
        }
        class529 var18;
        if (arg4) {
            var18 = arg7.method598(var17, 0, 36, 36, 32);
        } else {
            var18 = arg1.method598(var17, 0, 36, 36, 32);
        }
        if (!arg4) {
            class476 var19 = new class476();
            var19.field6567 = arg8;
            var19.field6562 = arg5;
            var19.field6558 = arg11;
            var19.field6568 = arg6 != null;
            var19.field6559 = arg3;
            var19.field6561 = arg2;
            var19.field6564 = arg1.field2378;
            this.field5721.method2033(81, var19, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 317)
    public final void method2400(int arg0) {
        field5705++;
        class236 var2 = this.field5716;
        synchronized (this.field5716) {
            this.field5716.method1459(19088);
            if (arg0 < 86) {
                this.method2392(null, -47, 7, (byte) 44, -67, -121, -77, null);
            }
        }
        class236 var3 = this.field5720;
        synchronized (this.field5720) {
            this.field5720.method1459(19088);
        }
        class348 var4 = this.field5721;
        synchronized (this.field5721) {
            this.field5721.method2031((byte) -72);
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 340)
    public final void method2401(int arg0) {
        class236 var2 = this.field5716;
        synchronized (this.field5716) {
            this.field5716.method1458((byte) -64);
        }
        field5704++;
        class236 var3 = this.field5720;
        synchronized (this.field5720) {
            this.field5720.method1458((byte) -83);
        }
        class348 var4 = this.field5721;
        synchronized (this.field5721) {
            if (arg0 != 10551) {
                this.field5720 = null;
            }
            this.field5721.method2036(16196);
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lrb;IZLct;Lpc;Lpc;)V", line = 389)
    public class413(class234 arg0, int arg1, boolean arg2, class97 arg3, class473 arg4, class473 arg5) {
        this.field5708 = arg2;
        this.field5723 = arg3;
        this.field5703 = arg1;
        this.field5700 = arg5;
        this.field5709 = arg4;
        if (this.field5709 == null) {
            this.field5697 = 0;
        } else {
            int var7 = this.field5709.method2724(0) - 1;
            this.field5697 = var7 * 256 + this.field5709.method2710(var7, (byte) -102);
        }
        this.field5724 = new String[] { null, null, class129.field1884.method1764(this.field5703, false), null, null };
        this.field5725 = new String[] { null, null, null, null, class152.field2209.method1764(this.field5703, false) };
    }
}
