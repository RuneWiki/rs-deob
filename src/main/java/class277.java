import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class277 extends class86 {

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "[[B")
    public static byte[][] field4250 = new byte[50][];

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4249 = "wishes to trade with you.";

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "S")
    public static short field4256 = 1;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4261 = "white:";

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "Lei;")
    public static class196 field4264;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "Lhj;")
    private class29 field4262;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "[I")
    public static int[] field4255;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "[[[B")
    public static byte[][][] field4260;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Llm;", line = 7)
    public static final class49 method1943(Throwable arg0, String arg1) {
        class49 var2;
        if (arg0 instanceof class49) {
            var2 = (class49) arg0;
            var2.field758 = var2.field758 + ' ' + arg1;
        } else {
            var2 = new class49(arg0, arg1);
        }
        field4251++;
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Ltd;", line = 24)
    public static final class241 method1944(int arg0) {
        field4257++;
        int var1 = -45 / ((-arg0 - 37) / 59);
        try {
            return (class241) Class.forName("qa").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)I", line = 39)
    public final int method1945(int arg0, int arg1, int arg2) {
        field4258++;
        if (arg1 != 2322) {
            this.field4262 = (class29) null;
        }
        if (this.field4262 == null) {
            return arg2;
        } else {
            class181 var4 = (class181) this.field4262.method203(arg1 - 612, (long) arg0);
            return var4 == null ? arg2 : var4.field2713;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIILgd;Lgd;IIIIJ)V", line = 61)
    public static final void method1946(int arg0, int arg1, int arg2, int arg3, class310 arg4, class310 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class290 var12 = new class290();
        var12.field4550 = arg10;
        var12.field4551 = arg1 * 128 + 64;
        var12.field4548 = arg2 * 128 + 64;
        var12.field4559 = arg3;
        var12.field4563 = arg4;
        var12.field4549 = arg5;
        var12.field4564 = arg6;
        var12.field4557 = arg7;
        var12.field4556 = arg8;
        var12.field4552 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class250.field3746[var13][arg1][arg2] == null) {
                class250.field3746[var13][arg1][arg2] = new class99(var13, arg1, arg2);
            }
        }
        class250.field3746[arg0][arg1][arg2].field1474 = var12;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 94)
    public final String method1947(int arg0, int arg1, String arg2) {
        field4263++;
        if (this.field4262 == null) {
            return arg2;
        }
        class255 var4 = (class255) this.field4262.method203(1710, (long) arg1);
        if (arg0 != 0) {
            method1952(-4);
        }
        return var4 == null ? arg2 : var4.field3809;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIBII)V", line = 119)
    public static final void method1948(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4248++;
        if (arg2 != 45) {
            field4264 = (class196) null;
        }
        class278 var5 = (class278) class171.field2547.method203(arg2 + 1665, (long) arg4);
        if (var5 == null) {
            var5 = new class278();
            class171.field2547.method208(var5, (long) arg4, 0);
        }
        if (arg1 >= var5.field4272.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field4272.length; var8++) {
                var6[var8] = var5.field4272[var8];
                var7[var8] = var5.field4274[var8];
            }
            for (int var9 = var5.field4272.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4274 = var7;
            var5.field4272 = var6;
        }
        var5.field4272[arg1] = arg0;
        var5.field4274[arg1] = arg3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lhb;B)V", line = 171)
    public final void method1949(class35 arg0, byte arg1) {
        field4247++;
        while (true) {
            int var3 = arg0.method273(65280);
            if (var3 == 0) {
                if (arg1 < 36) {
                    method1946(-127, 74, 37, -64, (class310) null, (class310) null, 108, 71, 11, -60, -47L);
                }
                return;
            }
            this.method1953(127, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLjava/lang/String;)I", line = 200)
    public static final int method1950(byte arg0, String arg1) {
        field4253++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 != -106) {
            field4250 = (byte[][]) ((byte[][]) null);
        }
        for (int var2 = 0; var2 < class314.field4873; var2++) {
            if (arg1.equalsIgnoreCase(class119.field1874[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V", line = 226)
    public static final void method1951(boolean arg0) {
        class314.field4862.method1433(30);
        field4246++;
        if (arg0) {
            method1954(-71, -37, (class117) null, 18, -27, 115);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V", line = 237)
    public static void method1952(int arg0) {
        field4249 = null;
        if (arg0 != -1) {
            return;
        }
        field4250 = (byte[][]) null;
        field4260 = (byte[][][]) null;
        field4261 = null;
        field4255 = null;
        field4264 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILhb;I)V", line = 254)
    private final void method1953(int arg0, class35 arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg1.method273(65280);
            if (this.field4262 == null) {
                int var5 = class230.method1638((byte) 81, var4);
                this.field4262 = new class29(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method273(65280) == 1;
                int var8 = arg1.method269(false);
                class217 var9;
                if (var7) {
                    var9 = new class255(arg1.method279(107));
                } else {
                    var9 = new class181(arg1.method299(-98));
                }
                this.field4262.method208(var9, (long) var8, 0);
            }
        }
        field4252++;
        if (arg0 < 126) {
            method1943((Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILbc;III)V", line = 304)
    public static final void method1954(int arg0, int arg1, class117 arg2, int arg3, int arg4, int arg5) {
        field4259++;
        if (arg2.field1837 == -1 && arg2.field1835 == null) {
            return;
        }
        int var6 = 0;
        if (arg2.field1819 < arg5) {
            var6 += arg5 - arg2.field1819;
        } else if (arg5 < arg2.field1827) {
            var6 += arg2.field1827 - arg5;
        }
        if (arg2.field1844 < arg0) {
            var6 += arg0 - arg2.field1844;
        } else if (arg0 < arg2.field1843) {
            var6 += arg2.field1843 - arg0;
        }
        if (arg2.field1830 == 0 || arg2.field1830 < var6 - 64 || class238.field3618 == 0 || arg2.field1840 != arg1) {
            if (arg2.field1842 != null) {
                class200.field3165.method2162(arg2.field1842);
                arg2.field1842 = null;
            }
            if (arg2.field1848 != null) {
                class200.field3165.method2162(arg2.field1848);
                arg2.field1848 = null;
            }
            return;
        }
        int var7 = -92 / ((68 - arg3) / 47);
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field1830 - var6) * class238.field3618 / arg2.field1830;
        if (arg2.field1842 != null) {
            arg2.field1842.method660(var8);
        } else if (arg2.field1837 >= 0) {
            class229 var9 = class229.method1627(class232.field3582, arg2.field1837, 0);
            if (var9 != null) {
                class259 var10 = var9.method1624().method1798(class293.field4599);
                class82 var11 = class82.method671(var10, 100, var8);
                var11.method639(-1);
                class200.field3165.method2156(var11);
                arg2.field1842 = var11;
            }
        }
        if (arg2.field1848 != null) {
            arg2.field1848.method660(var8);
            if (!arg2.field1848.method1553((byte) -68)) {
                arg2.field1848 = null;
            }
        } else if (arg2.field1835 != null && (arg2.field1839 -= arg4) <= 0) {
            int var12 = (int) ((double) arg2.field1835.length * Math.random());
            class229 var13 = class229.method1627(class232.field3582, arg2.field1835[var12], 0);
            if (var13 != null) {
                class259 var14 = var13.method1624().method1798(class293.field4599);
                class82 var15 = class82.method671(var14, 100, var8);
                var15.method639(0);
                class200.field3165.method2156(var15);
                arg2.field1839 = (int) (Math.random() * (double) (arg2.field1847 - arg2.field1820)) + arg2.field1820;
                arg2.field1848 = var15;
            }
        }
    }
}
