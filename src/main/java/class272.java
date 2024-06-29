import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class272 implements Runnable {

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "Lje;")
    private class367 field3707 = new class367();

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public int field3712 = 0;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "Z")
    private boolean field3714 = false;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field3711;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "[[I")
    public static int[][] field3702 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "S")
    public static short field3705 = 32767;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!mu", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        while (!this.field3714) {
            class367 var1 = this.field3707;
            class68 var2;
            synchronized (this.field3707) {
                var2 = (class68) this.field3707.method2116(4);
                if (var2 == null) {
                    try {
                        this.field3707.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field3712--;
            }
            try {
                if (var2.field922 == 2) {
                    var2.field927.method3344((byte) -98, var2.field923, (int) var2.field8154, var2.field923.length);
                } else if (var2.field922 == 3) {
                    var2.field923 = var2.field927.method3345((int) var2.field8154, 7);
                }
            } catch (Exception var7) {
                class413.method2400(null, var7, (byte) -37);
            }
            var2.field8762 = false;
        }
        field3706++;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLr;I)Lvn;", line = 49)
    public static final class283 method1664(byte arg0, class166 arg1, int arg2) {
        field3700++;
        class486 var3 = class280.method1725(arg2, (byte) -123, true, arg1);
        if (var3 == null) {
            return null;
        } else if (arg0 <= 64) {
            return null;
        } else {
            return var3.field6680;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLsp;I)Law;", line = 66)
    public final class68 method1665(byte arg0, class589 arg1, int arg2) {
        field3703++;
        class68 var4 = new class68();
        var4.field8154 = arg2;
        var4.field927 = arg1;
        var4.field922 = 3;
        var4.field8763 = false;
        this.method1670(false, var4);
        int var5 = 68 % ((arg0 + 53) / 43);
        return var4;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILsp;[BI)Law;", line = 83)
    public final class68 method1666(int arg0, class589 arg1, byte[] arg2, int arg3) {
        if (arg0 > -20) {
            return null;
        }
        field3704++;
        class68 var5 = new class68();
        var5.field922 = 2;
        var5.field8154 = arg3;
        var5.field923 = arg2;
        var5.field927 = arg1;
        var5.field8763 = false;
        this.method1670(false, var5);
        return var5;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V", line = 103)
    public final void method1667(byte arg0) {
        field3708++;
        this.field3714 = true;
        class367 var2 = this.field3707;
        synchronized (this.field3707) {
            this.field3707.notifyAll();
            if (arg0 < 1) {
                this.field3707 = null;
            }
        }
        try {
            this.field3711.join();
        } catch (InterruptedException var3) {
        }
        this.field3711 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILsp;)Law;", line = 126)
    public final class68 method1668(int arg0, int arg1, class589 arg2) {
        field3709++;
        class68 var4 = new class68();
        var4.field922 = 1;
        if (arg0 != 5) {
            this.field3707 = null;
        }
        class367 var5 = this.field3707;
        synchronized (this.field3707) {
            class68 var6 = (class68) this.field3707.method2126(-1);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field8154 && var6.field927 == arg2 && var6.field922 == 2) {
                    var4.field8762 = false;
                    var4.field923 = var6.field923;
                    return var4;
                }
                var6 = (class68) this.field3707.method2117(100);
            }
        }
        var4.field923 = arg2.method3345(arg1, 7);
        var4.field8762 = false;
        var4.field8763 = true;
        return var4;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V", line = 160)
    public static void method1669(byte arg0) {
        if (arg0 == 58) {
            field3702 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZLaw;)V", line = 182)
    private final void method1670(boolean arg0, class68 arg1) {
        field3713++;
        class367 var3 = this.field3707;
        synchronized (this.field3707) {
            if (arg0) {
                this.field3707 = null;
            }
            this.field3707.method2123(arg1, -1);
            this.field3712++;
            this.field3707.notifyAll();
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Z", line = 197)
    public static final boolean method1671(int arg0, int arg1, int arg2) {
        if (arg2 != 55) {
            field3705 = -112;
        }
        field3701++;
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BJ)V", line = 208)
    public static final void method1672(byte arg0, long arg1) {
        field3710++;
        if (class295.field4051 != null) {
            if (class203.field2863 == 1 || class203.field2863 == 5) {
                class162.method1143((byte) -94, arg1);
            } else if (class203.field2863 == 4) {
                class89.method652(arg1, 91);
            }
        }
        class406.method2362(0, (long) class186.field2697, class334.field4506);
        if (class631.field8758 != -1) {
            class22.method231(class631.field8758, (byte) 51);
        }
        for (int var3 = 0; var3 < class84.field1247; var3++) {
            if (class130.field1872[var3]) {
                class325.field4428[var3] = true;
            }
            class633.field8764[var3] = class130.field1872[var3];
            class130.field1872[var3] = false;
        }
        class98.field1374 = class186.field2697;
        if (class631.field8758 != -1) {
            class84.field1247 = 0;
            class450.method2560(127);
        }
        class334.field4506.method193();
        class465.method2624(true, class334.field4506);
        int var4 = class475.method2679(16);
        if (var4 == -1) {
            var4 = class112.field1563;
        }
        if (var4 == -1) {
            var4 = class236.field3252;
        }
        int var5 = 66 / ((arg0 + 80) / 44);
        class267.method1626((byte) 10, var4);
        int var6 = class143.field2063.method881(-118) << 8;
        class559.method3124(class143.field2063.field4053, 58, class143.field2063.field4042 + var6, class143.field2063.field4047 + var6, class41.field479);
        class41.field479 = 0;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Llaa;)V", line = 284)
    public class272(class105 arg0) {
        class70 var2 = arg0.method757((byte) 102, 5, this);
        while (var2.field948 == 0) {
            class519.method2960(88, 10L);
        }
        if (var2.field948 == 2) {
            throw new RuntimeException();
        }
        this.field3711 = (Thread) var2.field946;
    }
}
