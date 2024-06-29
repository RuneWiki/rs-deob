import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 {

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Lmq;")
    private class472 field297 = new class472(64);

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Lmq;")
    public class472 field317 = new class472(50);

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "Lqp;")
    public class608 field318 = new class608(250);

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "Lhga;")
    private class156 field319 = new class156();

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "Z")
    private boolean field301;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "Ljn;")
    private class668 field312;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "Ltd;")
    private class420 field322;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Ljn;")
    public class668 field305;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field320;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "[Ljava/lang/String;")
    private String[] field323;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Z")
    public static boolean field296 = false;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
    public static int[] field307 = new int[256];

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "F")
    public static float field311 = 0.0F;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Z")
    public static boolean field298 = false;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Lgfa;")
    public static class696 field294 = new class696(13, 0, 1, 0);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "[[I")
    public static int[][] field315;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 3)
    public final void method177(byte arg0) {
        int var2 = -50 / ((arg0 - 10) / 49);
        field314++;
        class472 var3 = this.field297;
        synchronized (this.field297) {
            this.field297.method2776(false);
        }
        class472 var4 = this.field317;
        synchronized (this.field317) {
            this.field317.method2776(false);
        }
        class608 var5 = this.field318;
        synchronized (this.field318) {
            this.field318.method3490((byte) 50);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)Loba;", line = 31)
    public final class238 method178(boolean arg0, int arg1) {
        field316++;
        class472 var3 = this.field297;
        class238 var4;
        synchronized (this.field297) {
            var4 = (class238) this.field297.method2766(-125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field312;
        byte[] var6;
        synchronized (this.field312) {
            var6 = this.field312.method3800(class541.method3172(arg1, 28292), class412.method2484(arg1, 118), (byte) -92);
        }
        class238 var7 = new class238();
        var7.field3237 = arg1;
        var7.field3240 = this;
        var7.field3208 = new String[] { null, null, class424.field6045.method2561(this.field293, 0), null, null };
        var7.field3205 = new String[] { null, null, null, null, class424.field6046.method2561(this.field293, 0) };
        if (var6 != null) {
            var7.method1451(new class389(var6), 50);
        }
        var7.method1467(40);
        if (arg0) {
            this.field321 = -39;
        }
        if (var7.field3203 != -1) {
            var7.method1450(this.method178(false, var7.field3203), this.method178(false, var7.field3238), false);
        }
        if (var7.field3195 != -1) {
            var7.method1463(this.method178(false, var7.field3213), this.method178(false, var7.field3195), 5);
        }
        if (!this.field301 && var7.field3193) {
            var7.field3261 = class424.field6043.method2561(this.field293, 0);
            var7.field3210 = null;
            var7.field3260 = false;
            var7.field3205 = this.field323;
            var7.field3231 = 0;
            var7.field3208 = this.field320;
            if (var7.field3209 != null) {
                boolean var8 = false;
                for (class513 var9 = var7.field3209.method3669((byte) 28); var9 != null; var9 = var7.field3209.method3676((byte) -12)) {
                    class184 var10 = this.field322.method2536((byte) -121, (int) var9.field7519);
                    if (var10.field2251) {
                        var9.method3045(true);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field3209 = null;
                }
            }
        }
        class472 var11 = this.field297;
        synchronized (this.field297) {
            this.field297.method2772(var7, true, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Leaa;I)V", line = 107)
    public static final void method179(class465 arg0, int arg1) {
        field306++;
        class263.field3622 = arg0;
        if (arg1 != -30855) {
            field307 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)V", line = 118)
    public final void method180(int arg0, boolean arg1) {
        field295++;
        if (this.field301 == arg1) {
            return;
        }
        this.field301 = arg1;
        this.method177((byte) 74);
        if (arg0 != 0) {
            this.field310 = -46;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 147)
    public final void method181(int arg0) {
        field309++;
        class608 var2 = this.field318;
        synchronized (this.field318) {
            this.field318.method3490((byte) 50);
            if (arg0 >= -79) {
                field294 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 160)
    public final void method182(byte arg0) {
        if (arg0 != -123) {
            this.field317 = null;
        }
        class472 var2 = this.field297;
        synchronized (this.field297) {
            this.field297.method2778((byte) 109);
        }
        field302++;
        class472 var3 = this.field317;
        synchronized (this.field317) {
            this.field317.method2778((byte) 124);
        }
        class608 var4 = this.field318;
        synchronized (this.field318) {
            this.field318.method3487(-19432);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 180)
    public static final void method183(int arg0) {
        field304++;
        class470.field6570 = new class385(8);
        class496.field6931 = arg0;
        for (class684 var1 = (class684) class24.field580.method2070((byte) -19); var1 != null; var1 = (class684) class24.field580.method2068(arg0 - 2001)) {
            var1.method3881();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)V", line = 198)
    public final void method184(int arg0, byte arg1) {
        class472 var3 = this.field297;
        synchronized (this.field297) {
            this.field297.method2777(arg0, 99);
        }
        if (arg1 != 70) {
            return;
        }
        field300++;
        class472 var4 = this.field317;
        synchronized (this.field317) {
            this.field317.method2777(arg0, 63);
        }
        class608 var5 = this.field318;
        synchronized (this.field318) {
            this.field318.method3497(arg0, (byte) -2);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lr;IIIIBIZLjaa;Lr;ZLla;)Lf;", line = 220)
    public final class701 method185(class165 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7, class569 arg8, class165 arg9, boolean arg10, class419 arg11) {
        field313++;
        if (arg5 != -74) {
            field311 = 0.48484334F;
        }
        class701 var13 = this.method189(arg8, arg1, arg0, arg3, arg6, arg4, arg5 + 15, arg2);
        if (var13 != null) {
            return var13;
        }
        class238 var14 = this.method178(false, arg2);
        if (arg1 > 1 && var14.field3219 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg1 >= var14.field3256[var16] && var14.field3256[var16] != 0) {
                    var15 = var14.field3219[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method178(false, var15);
            }
        }
        int[] var17 = var14.method1460(arg7, arg3, -80, arg8, arg9, arg1, arg4, arg11, arg6, arg0);
        if (var17 == null) {
            return null;
        }
        class701 var18;
        if (arg10) {
            var18 = arg9.method311(var17, 0, 36, 36, 32);
        } else {
            var18 = arg0.method311(var17, 0, 36, 36, 32);
        }
        if (!arg10) {
            class156 var19 = new class156();
            var19.field1912 = arg8 != null;
            var19.field1901 = arg4;
            var19.field1913 = arg1;
            var19.field1905 = arg0.field2018;
            var19.field1906 = arg6;
            var19.field1911 = arg3;
            var19.field1904 = arg2;
            this.field318.method3485((byte) -119, var19, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)Ljava/lang/String;", line = 288)
    public static final String method186(int arg0) {
        field292++;
        if (class361.field4805 || class590.field8544 == null) {
            return "";
        } else {
            if (arg0 != -14084) {
                method179(null, -75);
            }
            return class590.field8544.field5059;
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 304)
    public static void method187(int arg0) {
        field294 = null;
        int var1 = -101 / ((arg0 + 75) / 36);
        field307 = null;
        field315 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V", line = 315)
    public final void method188(int arg0, int arg1) {
        field299++;
        this.field321 = arg0;
        if (arg1 <= 57) {
            this.method185(null, -62, 81, 48, 80, (byte) 123, -68, true, null, null, false, null);
        }
        class472 var3 = this.field317;
        synchronized (this.field317) {
            this.field317.method2776(false);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljaa;ILr;IIIII)Lf;", line = 332)
    public final class701 method189(class569 arg0, int arg1, class165 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field319.field1906 = arg4;
        this.field319.field1901 = arg5;
        this.field319.field1912 = arg0 != null;
        this.field319.field1911 = arg3;
        field303++;
        this.field319.field1905 = arg2.field2018;
        this.field319.field1904 = arg7;
        this.field319.field1913 = arg1;
        int var9 = 63 % ((11 - arg6) / 48);
        return (class701) this.field318.method3489(221, this.field319);
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V", line = 349)
    public final void method190(int arg0) {
        if (arg0 != 6589) {
            this.field323 = null;
        }
        class472 var2 = this.field317;
        synchronized (this.field317) {
            this.field317.method2776(false);
        }
        field308++;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ler;IZLtd;Ljn;Ljn;)V", line = 394)
    public class16(class90 arg0, int arg1, boolean arg2, class420 arg3, class668 arg4, class668 arg5) {
        this.field301 = arg2;
        this.field293 = arg1;
        this.field312 = arg4;
        this.field322 = arg3;
        this.field305 = arg5;
        if (this.field312 == null) {
            this.field310 = 0;
        } else {
            int var7 = this.field312.method3779(5) - 1;
            this.field310 = this.field312.method3805(var7, false) + var7 * 256;
        }
        this.field320 = new String[] { null, null, class424.field6045.method2561(this.field293, 0), null, null };
        this.field323 = new String[] { null, null, null, null, class424.field6046.method2561(this.field293, 0) };
    }
}
