import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class233 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lki;")
    public class170 field3628 = new class170();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field3627 = 0;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field3637 = 0;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[S")
    public static short[] field3639 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Lki;")
    private class170 field3641;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[[[Lqo;")
    public static class329[][][] field3638;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I", line = 9)
    public final int method1739(int arg0) {
        field3633++;
        int var2 = arg0;
        class170 var3 = this.field3628.field2693;
        while (this.field3628 != var3) {
            var3 = var3.field2693;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Lki;", line = 39)
    public final class170 method1740(byte arg0) {
        if (arg0 > -2) {
            method1750(true);
        }
        field3636++;
        class170 var2 = this.field3641;
        if (this.field3628 == var2) {
            this.field3641 = null;
            return null;
        } else {
            this.field3641 = var2.field2693;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIBII)V", line = 65)
    public static final void method1741(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (class160 var5 = (class160) class188.field2954.method2244((byte) -126); var5 != null; var5 = (class160) class188.field2954.method2241(arg2 + 19)) {
            class176.method1376(100, arg1, arg4, arg3, arg0, var5);
        }
        if (arg2 != -20) {
            method1741(-73, 90, (byte) 121, -69, 95);
        }
        for (class160 var6 = (class160) class210.field3232.method2244((byte) -125); var6 != null; var6 = (class160) class210.field3232.method2241(-1)) {
            byte var7 = 1;
            class109 var8 = var6.field2549.method813((byte) 115);
            if (var6.field2549.field1350 == var8.field1663) {
                var7 = 0;
            } else if (var6.field2549.field1350 == var8.field1673 || var6.field2549.field1350 == var8.field1660 || var6.field2549.field1350 == var8.field1635 || var6.field2549.field1350 == var8.field1652) {
                var7 = 2;
            } else if (var6.field2549.field1350 == var8.field1666 || var6.field2549.field1350 == var8.field1634 || var6.field2549.field1350 == var8.field1656 || var6.field2549.field1350 == var8.field1649) {
                var7 = 3;
            }
            if (var6.field2558 != var7) {
                int var9 = class106.method918(var6.field2549, true);
                if (var6.field2547 != var9) {
                    if (var6.field2563 != null) {
                        class19.field316.method109(var6.field2563);
                        var6.field2563 = null;
                    }
                    var6.field2547 = var9;
                }
                var6.field2558 = var7;
            }
            var6.field2556 = var6.field2549.field1359;
            var6.field2555 = var6.field2549.field1359 + (var6.field2549.method808(-25) * 64);
            var6.field2564 = var6.field2549.field1286;
            var6.field2560 = var6.field2549.field1286 + (var6.field2549.method808(106) * 64);
            class176.method1376(100, arg1, arg4, arg3, arg0, var6);
        }
        for (class160 var10 = (class160) class328.field5044.method371(-19139); var10 != null; var10 = (class160) class328.field5044.method378((byte) -64)) {
            byte var11 = 1;
            class109 var12 = var10.field2541.method813((byte) 108);
            if (var10.field2541.field1350 == var12.field1663) {
                var11 = 0;
            } else if (var10.field2541.field1350 == var12.field1673 || var10.field2541.field1350 == var12.field1660 || var10.field2541.field1350 == var12.field1635 || var10.field2541.field1350 == var12.field1652) {
                var11 = 2;
            } else if (var10.field2541.field1350 == var12.field1666 || var10.field2541.field1350 == var12.field1634 || var10.field2541.field1350 == var12.field1656 || var10.field2541.field1350 == var12.field1649) {
                var11 = 3;
            }
            if (var10.field2558 != var11) {
                int var13 = class50.method482(var10.field2541, true);
                if (var10.field2547 != var13) {
                    if (var10.field2563 != null) {
                        class19.field316.method109(var10.field2563);
                        var10.field2563 = null;
                    }
                    var10.field2547 = var13;
                }
                var10.field2558 = var11;
            }
            var10.field2556 = var10.field2541.field1359;
            var10.field2555 = var10.field2541.field1359 + var10.field2541.method808(-103) * 64;
            var10.field2564 = var10.field2541.field1286;
            var10.field2560 = var10.field2541.field1286 + (var10.field2541.method808(arg2 + 6) * 64);
            class176.method1376(100, arg1, arg4, arg3, arg0, var10);
        }
        field3634++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/String;)I", line = 177)
    public static final int method1742(int arg0, String arg1) {
        field3642++;
        for (int var2 = 0; var2 < class50.field784.length; var2++) {
            if (class50.field784[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        if (arg0 == 25680) {
            return -1;
        } else {
            return 53;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 408)
    public class233() {
        this.field3628.field2690 = this.field3628;
        this.field3628.field2693 = this.field3628;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)Z", line = 203)
    public static final boolean method1743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class76.field1115[arg0][var8][var9] == -class105.field1577) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class277.field4290[arg0][arg1][arg3] + arg5;
            if (!class112.method965(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class112.method965(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class112.method965(var10, var12, var14)) {
                return false;
            } else if (class112.method965(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class62.method625(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class112.method965(var6 + 1, class277.field4290[arg0][arg1][arg3] + arg5, var7 + 1) && class112.method965(var6 + 128 - 1, class277.field4290[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class112.method965(var6 + 128 - 1, class277.field4290[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class112.method965(var6 + 1, class277.field4290[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 265)
    public static final String method1744(long arg0, byte arg1) {
        field3631++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 >= -81) {
                method1742(-79, (String) null);
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class19.field315[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILki;)V", line = 305)
    public final void method1745(int arg0, class170 arg1) {
        if (arg1.field2690 != null) {
            arg1.method1340(96);
        }
        arg1.field2690 = this.field3628.field2690;
        field3635++;
        arg1.field2693 = this.field3628;
        arg1.field2690.field2693 = arg1;
        arg1.field2693.field2690 = arg1;
        if (arg0 != 1) {
            this.field3628 = (class170) null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Lki;", line = 332)
    public final class170 method1746(byte arg0) {
        field3630++;
        if (arg0 != -25) {
            return (class170) null;
        }
        class170 var2 = this.field3628.field2693;
        if (this.field3628 == var2) {
            this.field3641 = null;
            return null;
        } else {
            this.field3641 = var2.field2693;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lug;ILjava/lang/String;)I", line = 355)
    public static final int method1747(class25 arg0, int arg1, String arg2) {
        int var3 = arg0.field397;
        field3632++;
        byte[] var4 = class284.method2066((byte) -121, arg2);
        int var5 = -79 % ((arg1 + 17) / 58);
        arg0.method277(var4.length, (byte) 93);
        arg0.field397 += class61.field941.method1322(true, var4.length, arg0.field448, var4, 0, arg0.field397);
        return arg0.field397 - var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([Ljava/lang/String;B[S)V", line = 369)
    public static final void method1748(String[] arg0, byte arg1, short[] arg2) {
        class301.method2171(arg0.length - 1, 0, arg0, (byte) 82, arg2);
        if (arg1 <= 83) {
            field3638 = (class329[][][]) ((class329[][][]) null);
        }
        field3629++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 384)
    public static final void method1749(Component arg0, int arg1) {
        arg0.addMouseListener(class236.field3674);
        arg0.addMouseMotionListener(class236.field3674);
        if (arg1 != 8825) {
            field3637 = 25;
        }
        arg0.addFocusListener(class236.field3674);
        field3640++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 399)
    public static void method1750(boolean arg0) {
        field3639 = null;
        field3638 = (class329[][][]) null;
        if (arg0) {
            method1742(-16, (String) null);
        }
    }
}
