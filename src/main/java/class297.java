import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class297 {

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "Loo;")
    private class652 field4309 = new class652(16);

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "Lwia;")
    private class791 field4317;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIILkp;)V")
    public static final void method1930(int arg0, int arg1, int arg2, int arg3, int arg4, class513 arg5) {
        field4315++;
        if (arg5.field7266 == -1 && arg5.field7255 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg5.field7234 * class21.field353.field10095.method2896(-109) >> 8;
        if (arg5.field7262 < arg4) {
            var6 += arg4 - arg5.field7262;
        } else if (arg4 < arg5.field7256) {
            var6 += arg5.field7256 - arg4;
        }
        if (arg2 > arg5.field7258) {
            var6 += arg2 - arg5.field7258;
        } else if (arg2 < arg5.field7264) {
            var6 += arg5.field7264 - arg2;
        }
        if (arg5.field7253 == 0 || (var6 - 256) > arg5.field7253 || class21.field353.field10095.method2896(-20) == 0 || arg5.field7259 != arg0) {
            if (arg5.field7236 != null) {
                class184.field2828.method426(arg5.field7236);
                arg5.field7236 = null;
                arg5.field7238 = null;
                arg5.field7240 = null;
            }
            if (arg5.field7252 != null) {
                class184.field2828.method426(arg5.field7252);
                arg5.field7246 = null;
                arg5.field7260 = null;
                arg5.field7252 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg5.field7253 - arg5.field7249;
        if (var8 < 0) {
            var8 = arg5.field7253;
        }
        int var9 = -91 / (arg1 / 56);
        int var10 = var7;
        int var11 = var6 - arg5.field7249;
        if (var11 > 0 && var8 > 0) {
            var10 = (var8 - var11) * var7 / var8;
        }
        class210.field3250.method2102(true);
        int var12 = 8192;
        int var13 = (arg5.field7262 + arg5.field7256) / 2 - arg4;
        int var14 = (arg5.field7264 + arg5.field7258) / 2 - arg2;
        if (var13 != 0 || var14 != 0) {
            int var15 = -class544.field7813 - ((int) (Math.atan2((double) var13, (double) var14) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var15 > 8192) {
                var15 = 16384 - var15;
            }
            int var16;
            if (var6 <= 0) {
                var16 = 8192;
            } else if (var6 >= 4096) {
                var16 = 16384;
            } else {
                var16 = var6 * 8192 / 4096 + 8192;
            }
            var12 = (16384 - var16 >> 1) + var15 * var16 / 8192;
        }
        if (arg5.field7236 != null) {
            arg5.field7236.method175(var10);
            arg5.field7236.method192(var12);
        } else if (arg5.field7266 >= 0) {
            int var17 = arg5.field7265 == 256 && arg5.field7247 == 256 ? 256 : class298.method1938(arg5.field7265, arg5.field7247, (byte) -42);
            if (arg5.field7244) {
                if (arg5.field7238 == null) {
                    arg5.field7238 = class175.method1273(class486.field6846, arg5.field7266);
                }
                if (arg5.field7238 != null) {
                    if (arg5.field7240 == null) {
                        arg5.field7240 = arg5.field7238.method1271(new int[] { 22050 });
                    }
                    if (arg5.field7240 != null) {
                        class18 var21 = class18.method194(arg5.field7240, var17, var10 << 6, var12);
                        var21.method179(-1);
                        class184.field2828.method424(var21);
                        arg5.field7236 = var21;
                    }
                }
            } else {
                class382 var18 = class382.method2377(class602.field8436, arg5.field7266, 0);
                if (var18 != null) {
                    class218 var19 = var18.method2380().method1498(class451.field6328);
                    class18 var20 = class18.method194(var19, var17, var10 << 6, var12);
                    var20.method179(-1);
                    class184.field2828.method424(var20);
                    arg5.field7236 = var20;
                }
            }
        }
        if (arg5.field7252 != null) {
            arg5.field7252.method175(var10);
            arg5.field7252.method192(var12);
            if (!arg5.field7252.method3386((byte) 53)) {
                arg5.field7260 = null;
                arg5.field7246 = null;
                arg5.field7252 = null;
            }
        } else if (arg5.field7255 != null && (arg5.field7235 -= arg3) <= 0) {
            int var22 = arg5.field7265 == 256 && arg5.field7247 == 256 ? 256 : arg5.field7247 + (int) ((double) (arg5.field7265 - arg5.field7247) * Math.random());
            if (arg5.field7242) {
                if (arg5.field7246 == null) {
                    int var23 = (int) (Math.random() * (double) arg5.field7255.length);
                    arg5.field7246 = class175.method1273(class486.field6846, arg5.field7255[var23]);
                }
                if (arg5.field7246 != null) {
                    if (arg5.field7260 == null) {
                        arg5.field7260 = arg5.field7246.method1271(new int[] { 22050 });
                    }
                    if (arg5.field7260 != null) {
                        class18 var24 = class18.method194(arg5.field7260, var22, var10 << 6, var12);
                        var24.method179(0);
                        class184.field2828.method424(var24);
                        arg5.field7235 = (int) ((double) (arg5.field7243 - arg5.field7250) * Math.random()) + arg5.field7250;
                        arg5.field7252 = var24;
                        return;
                    }
                }
                return;
            }
            int var25 = (int) ((double) arg5.field7255.length * Math.random());
            class382 var26 = class382.method2377(class602.field8436, arg5.field7255[var25], 0);
            if (var26 != null) {
                class218 var27 = var26.method2380().method1498(class451.field6328);
                class18 var28 = class18.method194(var27, var22, var10 << 6, var12);
                var28.method179(0);
                class184.field2828.method424(var28);
                arg5.field7252 = var28;
                arg5.field7235 = arg5.field7250 + ((int) (Math.random() * (double) (arg5.field7243 - arg5.field7250)));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(III)Z")
    public static final boolean method1931(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field4312++;
            return (arg0 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(BI)V")
    public final void method1932(byte arg0, int arg1) {
        class652 var3 = this.field4309;
        synchronized (this.field4309) {
            this.field4309.method3741(arg1, 0);
        }
        field4308++;
        if (arg0 < 19) {
            this.method1934((byte) -10);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
    public final void method1933(byte arg0) {
        field4316++;
        class652 var2 = this.field4309;
        synchronized (this.field4309) {
            this.field4309.method3735(2);
            if (arg0 < 83) {
                this.field4317 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)V")
    public final void method1934(byte arg0) {
        if (arg0 != 41) {
            this.field4309 = null;
        }
        field4311++;
        class652 var2 = this.field4309;
        synchronized (this.field4309) {
            this.field4309.method3743(8);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method1935(int arg0, String arg1, byte arg2) {
        field4310++;
        int var3 = -45 / ((-arg2 - 57) / 59);
        class313 var4 = class312.method1998((long) arg0, 2, -1);
        var4.method2001((byte) 127);
        var4.field4460 = arg1;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ZI)Lnl;")
    private final class576 method1936(boolean arg0, int arg1) {
        field4313++;
        class652 var3 = this.field4309;
        class576 var4;
        synchronized (this.field4309) {
            var4 = (class576) this.field4309.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field4317;
        byte[] var6;
        synchronized (this.field4317) {
            var6 = this.field4317.method4339(arg1, 0, 29);
        }
        class576 var7 = new class576();
        if (var6 != null) {
            var7.method3383((byte) 119, new class494(var6));
        }
        class652 var8 = this.field4309;
        synchronized (this.field4309) {
            this.field4309.method3739((long) arg1, (byte) 16, var7);
        }
        return arg0 ? var7 : null;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIILnn;)Liaa;")
    public final class519 method1937(int arg0, int arg1, int arg2, int arg3, int arg4, class436 arg5) {
        field4314++;
        if (arg1 < 88) {
            method1930(-63, -124, 30, 95, 36, null);
        }
        class364[] var7 = null;
        class576 var8 = this.method1936(true, arg4);
        if (var8.field8122 != null) {
            var7 = new class364[var8.field8122.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class398 var10 = arg5.method2609(var8.field8122[var9], -81);
                var7[var9] = new class364(var10.field5468, var10.field5461, var10.field5462, var10.field5470, var10.field5463, var10.field5471, var10.field5466, var10.field5467);
            }
        }
        return new class519(var8.field8121, var7, var8.field8116, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class297(class252 arg0, int arg1, class791 arg2) {
        this.field4317 = arg2;
        this.field4317.method4353(29, true);
    }
}
