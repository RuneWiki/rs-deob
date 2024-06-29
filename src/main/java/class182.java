import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class182 extends class577 implements class490 {

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    private int field2752;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "B")
    public static byte field2757;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqo;I[BI)V")
    public class182(class22 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2752 = arg1;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqo;ILjaclib/memory/Buffer;)V")
    public class182(class22 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field2752 = arg1;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)J")
    public final long method964(byte arg0) {
        if (arg0 != 42) {
            method1333((class59) null, (byte) -124);
        }
        ++field2759;
        return super.field7931.getAddress();
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lha;B)V")
    public static final void method1333(class59 arg0, byte arg1) {
        ++field2755;
        if ((~class192.field2844 <= -3 || class184.field2785) && class591.field8071 == null) {
            if (arg1 >= -71) {
                method1333((class59) null, (byte) -41);
            }
            String var2;
            if (class184.field2785 && class192.field2844 < 2) {
                var2 = class133.field2242 + class497.field6923.method2936(class607.field8336, 544) + class133.field2241 + " ->";
            } else if (class304.field4240 && class117.field1992.method1346(81, -121) && class192.field2844 > 2) {
                var2 = class693.method3875((byte) 125, class693.field9372);
            } else {
                class324 var3 = class693.field9372;
                if (var3 == null) {
                    return;
                }
                var2 = class693.method3875((byte) -52, var3);
                int[] var4 = null;
                if (!class474.method2790(-12081, var3.field4505)) {
                    if (var3.field4496 != -1) {
                        var4 = class721.field9801.method162(98, var3.field4496).field4915;
                    } else if (class79.method729(var3.field4505, (byte) 107)) {
                        class751 var5 = (class751) class86.field1546.method1465((long) ((int) var3.field4502), -6008);
                        if (var5 != null) {
                            class9 var6 = var5.field10510;
                            class334 var7 = var6.field126;
                            if (var7.field4694 != null) {
                                var7 = var7.method2110(class390.field5635, -1);
                            }
                            if (var7 != null) {
                                var4 = var7.field4659;
                            }
                        }
                    } else if (class339.method2143(8806, var3.field4505)) {
                        Object var8 = null;
                        class99 var9;
                        if (var3.field4505 != 1001) {
                            var9 = class76.field1366.method1680(0, (int) (var3.field4502 >>> 32 & 2147483647L));
                        } else {
                            var9 = class76.field1366.method1680(0, (int) var3.field4502);
                        }
                        if (var9.field1780 != null) {
                            var9 = var9.method925(class390.field5635, (byte) 47);
                        }
                        if (var9 != null) {
                            var4 = var9.field1752;
                        }
                    }
                } else {
                    var4 = class721.field9801.method162(-73, (int) var3.field4502).field4915;
                }
                if (var4 != null) {
                    var2 = var2 + class609.method3465(var4, true);
                }
            }
            if (class192.field2844 > 2) {
                var2 = var2 + "<col=ffffff> / " + (class192.field2844 - 2) + class497.field6916.method2936(class607.field8336, 544);
            }
            if (class33.field848 != null) {
                class60 var10 = class33.field848.method2386(arg0, (byte) 68);
                if (var10 == null) {
                    var10 = class168.field2634;
                }
                var10.method647(class195.field2889, class33.field848.field5385, class236.field3436, class33.field848.field5376, class33.field848.field5425, class33.field848.field5465, class33.field848.field5485, class349.field4872, class33.field848.field5438, class155.field2514, class213.field3025, -33, class344.field4821, var2, class637.field8748);
                class633.method3613(class637.field8748[0], class637.field8748[2], class637.field8748[1], 0, class637.field8748[3]);
            } else if (class569.field7820 != null && class582.field7970 == class456.field6431) {
                int var11 = class168.field2634.method634(-1, class213.field3025, class195.field2889, var2, 16777215, 0, class236.field3436, class75.field1351 + 16, class679.field9211 + 4, class349.field4872);
                class633.method3613(class679.field9211 - -4, class140.field2316.method3389(true, var2) + var11, class75.field1351, 0, 16);
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)I")
    public final int method959(byte arg0) {
        ++field2754;
        return arg0 != -97 ? -87 : this.field2752;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II[BI)V")
    public final void method960(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field2760;
        this.method3324(arg2, arg1);
        this.field2752 = arg0;
        if (arg3 != -9894) {
            this.method962(false);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)I")
    public final int method962(boolean arg0) {
        ++field2756;
        if (!arg0) {
            this.method960(126, 120, (byte[]) null, -73);
        }
        return 0;
    }
}
