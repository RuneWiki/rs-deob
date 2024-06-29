import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class167 {

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "[I")
    private int[] field2531 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "Lpb;")
    public class600 field2525;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "[I")
    private int[] field2530;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "[S")
    private short[] field2518;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "[S")
    private short[] field2529;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "[S")
    private short[] field2532;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "[S")
    private short[] field2533;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILjr;)V")
    public final void method1148(int arg0, class96 arg1) {
        field2523++;
        while (true) {
            int var3 = arg1.method718(120);
            if (var3 == 0) {
                if (arg0 >= -105) {
                    this.method1156((byte) -32);
                    return;
                } else {
                    return;
                }
            }
            this.method1151(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)Z")
    public final boolean method1149(byte arg0) {
        field2521++;
        if (this.field2530 == null) {
            return true;
        }
        if (arg0 != -96) {
            method1153(-62, 96, -72, false, -54);
        }
        boolean var2 = true;
        class132 var3 = this.field2525.field8332;
        synchronized (this.field2525.field8332) {
            for (int var4 = 0; var4 < this.field2530.length; var4++) {
                if (!this.field2525.field8332.method931((byte) 115, 0, this.field2530[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)V")
    public static final void method1150(int arg0, int arg1, int arg2) {
        field2527++;
        class667 var3 = class568.field7648[arg0][arg2];
        if (var3 != null) {
            class320.field4739 = var3.field9380;
            class502.field6875 = var3.field9391;
            class216.field3136 = var3.field9398;
        }
        if (arg1 == -4) {
            class308.method1895((byte) -63);
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IILjr;)V")
    private final void method1151(int arg0, int arg1, class96 arg2) {
        field2528++;
        if (arg0 != 0) {
            this.method1154(114);
        }
        if (arg1 == 1) {
            arg2.method718(-84);
        } else if (arg1 == 2) {
            int var8 = arg2.method718(127);
            this.field2530 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2530[var9] = arg2.method743((byte) -54);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var4 = arg2.method718(-70);
                this.field2532 = new short[var4];
                this.field2529 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2529[var5] = (short) arg2.method743((byte) -23);
                    this.field2532[var5] = (short) arg2.method743((byte) -60);
                }
                return;
            }
            if (arg1 == 41) {
                int var6 = arg2.method718(79);
                this.field2533 = new short[var6];
                this.field2518 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2533[var7] = (short) arg2.method743((byte) -57);
                    this.field2518[var7] = (short) arg2.method743((byte) -11);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field2531[arg1 - 60] = arg2.method743((byte) -51);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)Z")
    public final boolean method1152(byte arg0) {
        field2526++;
        boolean var2 = true;
        class132 var3 = this.field2525.field8332;
        synchronized (this.field2525.field8332) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field2531[var4] != -1 && !this.field2525.field8332.method931((byte) 105, 0, this.field2531[var4])) {
                    var2 = false;
                }
                var4++;
            }
        }
        int var5 = -94 / ((-arg0 - 82) / 39);
        return var2;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIZI)V")
    public static final void method1153(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2522++;
        class288.field4014.field1301 = 0;
        class288.field4014.method746((byte) -119, class599.field8317.field2617);
        class288.field4014.method746((byte) -89, arg4);
        class288.field4014.method746((byte) -106, arg2);
        class288.field4014.method731(-2045573048, arg0);
        class288.field4014.method731(-2045573048, arg1);
        class179.field2650 = 0;
        class595.field8273 = 1;
        if (arg3) {
            method1153(-80, 91, 24, true, 70);
        }
        class17.field262 = -3;
        class394.field5486 = 0;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Lhn;")
    public final class661 method1154(int arg0) {
        field2520++;
        if (this.field2530 == null) {
            return null;
        }
        class661[] var2 = new class661[this.field2530.length];
        if (arg0 != 12759) {
            return null;
        }
        class132 var3 = this.field2525.field8332;
        synchronized (this.field2525.field8332) {
            int var4 = 0;
            while (true) {
                if (this.field2530.length <= var4) {
                    break;
                }
                var2[var4] = class383.method2210(false, 0, this.field2525.field8332, this.field2530[var4]);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field2530.length; var5++) {
            if (var2[var5].field9323 < 13) {
                var2[var5].method3660((byte) 67, 2);
            }
        }
        class661 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class661(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2529 != null) {
            for (int var7 = 0; var7 < this.field2529.length; var7++) {
                var6.method3666(this.field2529[var7], false, this.field2532[var7]);
            }
        }
        if (this.field2533 != null) {
            for (int var8 = 0; var8 < this.field2533.length; var8++) {
                var6.method3667(-109, this.field2518[var8], this.field2533[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1155(String arg0, byte arg1) {
        field2524++;
        class240.field3454 = arg0;
        if (class188.field2779 == null) {
            return;
        }
        try {
            String var2 = class188.field2779.getParameter("cookieprefix");
            String var3 = class188.field2779.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class455.method2607(true, class680.method3756(-82) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class2.method9(-59, class188.field2779, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var7) {
        }
        int var6 = -11 % ((arg1 - 68) / 53);
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)Lhn;")
    public final class661 method1156(byte arg0) {
        field2519++;
        class661[] var2 = new class661[5];
        int var3 = 0;
        class132 var4 = this.field2525.field8332;
        synchronized (this.field2525.field8332) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    if (arg0 < 70) {
                        method1155(null, (byte) -79);
                    }
                    break;
                }
                if (this.field2531[var5] != -1) {
                    var2[var3++] = class383.method2210(false, 0, this.field2525.field8332, this.field2531[var5]);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field9323 < 13) {
                var2[var6].method3660((byte) 126, 2);
            }
        }
        class661 var7 = new class661(var2, var3);
        if (this.field2529 != null) {
            for (int var8 = 0; var8 < this.field2529.length; var8++) {
                var7.method3666(this.field2529[var8], false, this.field2532[var8]);
            }
        }
        if (this.field2533 != null) {
            for (int var9 = 0; var9 < this.field2533.length; var9++) {
                var7.method3667(-105, this.field2518[var9], this.field2533[var9]);
            }
        }
        return var7;
    }
}
