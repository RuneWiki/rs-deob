import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class638 extends class216 {

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
    private int field9062;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
    private int field9064;

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "I")
    private int field9075;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
    private int field9063;

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "Lqk;")
    public static class148 field9066 = new class148(69, 12);

    @OriginalMember(owner = "client!caa", name = "u", descriptor = "[J")
    public static long[] field9070 = new long[10];

    @OriginalMember(owner = "client!caa", name = "x", descriptor = "Lmha;")
    public static class701 field9073 = new class701(11, 0, 1, 2);

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!caa", name = "r", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!caa", name = "s", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!caa", name = "t", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!caa", name = "v", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!caa", name = "w", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!caa", name = "y", descriptor = "Ljava/lang/String;")
    public static String field9074;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZII)V")
    public final void method328(boolean arg0, int arg1, int arg2) {
        ++field9067;
        if (arg0) {
            method3711(97);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IBI)V")
    public final void method327(int arg0, byte arg1, int arg2) {
        ++field9068;
        if (arg1 != 23) {
            this.method330(-121, 74, -111);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
    public static final void method3708(byte arg0) {
        ++field9071;
        int var1 = class147.field2030;
        if (arg0 <= 102) {
            field9066 = null;
        }
        int[] var2 = class351.field4456;
        for (int var3 = 0; var1 > var3; ++var3) {
            class655 var4 = class40.field563[var2[var3]];
            if (var4 != null) {
                class5.method19(-1430, var4, var4.method3470(-1));
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)V")
    public final void method330(int arg0, int arg1, int arg2) {
        ++field9060;
        int var4 = this.field9062 * arg0 >> 12;
        int var5 = this.field9075 * arg0 >> 12;
        if (arg2 != 382254306) {
            method3708((byte) 118);
        }
        int var6 = this.field9064 * arg1 >> 12;
        int var7 = this.field9063 * arg1 >> 12;
        class241.method1534(var7, true, var6, super.field3062, var5, var4);
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(IIIIII)V")
    public class638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field9062 = arg0;
        this.field9064 = arg1;
        this.field9075 = arg2;
        this.field9063 = arg3;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public static void method3709(int arg0) {
        field9073 = null;
        field9074 = null;
        field9070 = null;
        field9066 = null;
        if (arg0 < 84) {
            field9070 = null;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3710(String arg0, byte arg1) {
        ++field9061;
        if (arg0 != null) {
            if ((~class713.field10110 > -201 || class290.field3796) && class713.field10110 < 200) {
                String var3 = class53.method357(arg0, 1);
                if (var3 != null) {
                    for (int var4 = 0; ~var4 > ~class713.field10110; ++var4) {
                        String var9 = class53.method357(class570.field8079[var4], 1);
                        if (var9 != null && var9.equals(var3)) {
                            class216.method1417(arg0 + class138.field1874.method891(-2041650704, class369.field4721), (byte) -79, 4);
                            return;
                        }
                        if (class82.field1117[var4] != null) {
                            String var10 = class53.method357(class82.field1117[var4], 1);
                            if (var10 != null && var10.equals(var3)) {
                                class216.method1417(arg0 + class138.field1874.method891(-2041650704, class369.field4721), (byte) 122, 4);
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; ~class458.field6302 < ~var5; ++var5) {
                        String var7 = class53.method357(class46.field674[var5], 1);
                        if (var7 != null && var7.equals(var3)) {
                            class216.method1417(class138.field1879.method891(-2041650704, class369.field4721) + arg0 + class138.field1880.method891(-2041650704, class369.field4721), (byte) -111, 4);
                            return;
                        }
                        if (class270.field3639[var5] != null) {
                            String var8 = class53.method357(class270.field3639[var5], 1);
                            if (var8 != null && var8.equals(var3)) {
                                class216.method1417(class138.field1879.method891(-2041650704, class369.field4721) + arg0 + class138.field1880.method891(-2041650704, class369.field4721), (byte) -121, 4);
                                return;
                            }
                        }
                    }
                    if (class53.method357(class473.field6483.field9272, 1).equals(var3)) {
                        class216.method1417(class138.field1877.method891(-2041650704, class369.field4721), (byte) 114, 4);
                    } else if (arg1 >= 26) {
                        ++class455.field6265;
                        class120 var6 = class292.method1716(class608.field8668, true, class683.field9600);
                        var6.field1653.method184(class678.method3882(arg0, (byte) 109), -49);
                        var6.field1653.method187(arg0, (byte) -109);
                        class471.method2805(99, var6);
                    }
                }
            } else {
                class216.method1417(class138.field1846.method891(-2041650704, class369.field4721), (byte) 115, 4);
                String var2 = class138.field1847.method891(-2041650704, class369.field4721);
                if (var2 != null) {
                    class216.method1417(var2, (byte) -48, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
    public static final void method3711(int arg0) {
        if (arg0 != 182763116) {
            method3708((byte) -124);
        }
        class114.method760((byte) -105);
        ++field9072;
        class484.field6549 = false;
        class746.method4149(class248.field3438, class463.field6345, class148.field2046, (byte) 106, class140.field1930);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IILul;I)V")
    public static final void method3712(int arg0, int arg1, class364 arg2, int arg3) {
        class87.field1201[arg3][arg0] = arg2;
        ++field9065;
        if (arg1 != -1958) {
            method3712(45, -88, (class364) null, -61);
        }
    }
}
