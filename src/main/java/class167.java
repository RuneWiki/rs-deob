import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class167 extends class130 {

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "Ljp;")
    public static class55 field2530 = new class55(85, 4);

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public int field2523;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
    public int field2532;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dt", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field2533;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method1189(int arg0) {
        field2530 = null;
        if (arg0 != -6) {
            field2530 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZII)V")
    public static final void method1190(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2521++;
        class188 var5 = class10.method48((byte) 91, 4, arg1);
        var5.method1308(false);
        var5.field2876 = arg3;
        var5.field2882 = arg0;
        var5.field2873 = arg4;
        if (!arg2) {
            field2530 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method1191(int arg0, String arg1, int arg2, String arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg0 <= 26) {
            field2530 = null;
        }
        for (int var8 = 99; var8 > 0; var8--) {
            class155.field2383[var8] = class155.field2383[var8 - 1];
            class169.field2571[var8] = class169.field2571[var8 - 1];
            class8.field100[var8] = class8.field100[var8 - 1];
            class138.field2088[var8] = class138.field2088[var8 - 1];
            class451.field6714[var8] = class451.field6714[var8 - 1];
            class59.field897[var8] = class59.field897[var8 - 1];
            class291.field4509[var8] = class291.field4509[var8 - 1];
        }
        field2522++;
        class155.field2383[0] = arg7;
        class8.field100[0] = arg1;
        class169.field2571[0] = arg2;
        class138.field2088[0] = arg5;
        class451.field6714[0] = arg4;
        class292.field4511 = class348.field5194;
        class291.field4509[0] = arg6;
        class168.field2539++;
        class59.field897[0] = arg3;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLdk;ZLdk;I)I")
    public static final int method1192(byte arg0, class424 arg1, boolean arg2, class424 arg3, int arg4) {
        field2518++;
        if (arg4 == 1) {
            int var5 = arg1.field2206;
            int var6 = arg3.field2206;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class352.method2255(0, arg3.method2638(-93).field4981, arg1.method2638(-89).field4981, class345.field5141);
        } else if (arg4 == 3) {
            if (arg1.field6230.equals("-")) {
                if (arg3.field6230.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field6230.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class352.method2255(0, arg3.field6230, arg1.field6230, class345.field5141);
            }
        } else if (arg4 == 4) {
            if (arg1.method1060(0)) {
                return arg3.method1060(0) ? 0 : 1;
            } else if (arg3.method1060(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg1.method1054(55)) {
                return arg3.method1054(55) ? 0 : 1;
            } else if (arg3.method1054(55)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 < 36) {
            return 0;
        } else if (arg4 == 6) {
            if (arg1.method1055(false)) {
                return arg3.method1055(false) ? 0 : 1;
            } else if (arg3.method1055(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg1.method1057(false)) {
                return arg3.method1057(false) ? 0 : 1;
            } else if (arg3.method1057(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg1.field6222;
            int var8 = arg3.field6222;
            if (arg2) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg1.field6227 - arg3.field6227;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILza;)Le;")
    public final class289 method1193(int arg0, int arg1, class299 arg2) {
        field2515++;
        int var4 = class184.field2828[this.field2532];
        if (~var4 == arg1) {
            class501 var11 = class454.method2781(this.field2526, this.field2517, this.field2525);
            if (var11 instanceof class435) {
                class435 var12 = (class435) var11;
                if (var12.field6478 != null) {
                    return ((class161) var12.field6478).method111(arg2, arg0, true);
                }
            }
        } else if (var4 == 1) {
            class202 var9 = class124.method921(this.field2526, this.field2517, this.field2525);
            if (var9 instanceof class275) {
                class275 var10 = (class275) var9;
                if (var10.field4321 != null) {
                    return ((class161) var10.field4321).method111(arg2, arg0, true);
                }
            }
        } else if (var4 == 2) {
            class76 var7 = class35.method217(this.field2526, this.field2517, this.field2525, field2533 == null ? (field2533 = method1194("bs")) : field2533);
            if (var7 instanceof class451) {
                class451 var8 = (class451) var7;
                if (var8.field6699 != null) {
                    return ((class161) var8.field6699).method111(arg2, arg0, true);
                }
            }
        } else if (var4 == 3) {
            class481 var5 = class404.method2542(this.field2526, this.field2517, this.field2525);
            if (var5 instanceof class195) {
                class195 var6 = (class195) var5;
                if (var6.field3048 != null) {
                    return ((class161) var6.field3048).method111(arg2, arg0, true);
                }
            }
        }
        return null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1194(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
