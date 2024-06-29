import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class163 extends class452 {

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    private int field2115;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    private int field2113;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    private int field2121;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field2123 = -1;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lhq;")
    public static class174 field2118 = class358.method2352(false);

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method1014(int arg0) {
        if (arg0 == 0) {
            field2118 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
    public final void method492(int arg0, int arg1, int arg2) {
        ++field2114;
        if (arg2 != 0) {
            method1014(60);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;Lro;)Ljava/lang/String;")
    public static final String method1015(int arg0, String arg1, class249 arg2) {
        if (arg0 != ~arg1.indexOf("%")) {
            label52: while (true) {
                int var3 = arg1.indexOf("%1");
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (~var6 == 0) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (~var8 == 0) {
                                                            break label52;
                                                        }
                                                        String var9 = "";
                                                        if (class35.field569 != null) {
                                                            if (class35.field569.field4262 == null) {
                                                                var9 = class318.method1974(false, class35.field569.field4260);
                                                            } else {
                                                                var9 = (String) class35.field569.field4262;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class340.method2247(117, class10.method77(arg0 ^ 117, 4, arg2)) + arg1.substring(var7 - -2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class340.method2247(arg0 ^ 113, class10.method77(112, 3, arg2)) + arg1.substring(var6 - -2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class340.method2247(119, class10.method77(102, 2, arg2)) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class340.method2247(93, class10.method77(41, 1, arg2)) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class340.method2247(113, class10.method77(73, 0, arg2)) + arg1.substring(var3 + 2);
            }
        }
        ++field2116;
        return arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)V")
    public final void method496(int arg0, int arg1, byte arg2) {
        if (arg2 != 75) {
            this.field2119 = 33;
        }
        ++field2124;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIII)V")
    public class163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2115 = arg1;
        this.field2113 = arg0;
        this.field2121 = arg3;
        this.field2119 = arg2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZI)V")
    public final void method493(int arg0, boolean arg1, int arg2) {
        ++field2122;
        int var4 = this.field2113 * arg2 >> 12;
        int var5 = this.field2119 * arg2 >> 12;
        int var6 = this.field2115 * arg0 >> 12;
        int var7 = this.field2121 * arg0 >> 12;
        class100.method678(super.field6585, var4, var5, arg1, var6, var7);
    }
}
