import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class122 extends class216 {

    @OriginalMember(owner = "client!sfa", name = "w", descriptor = "Ltg;")
    private class605 field1877 = new class605();

    @OriginalMember(owner = "client!sfa", name = "O", descriptor = "I")
    private int field1894 = 0;

    @OriginalMember(owner = "client!sfa", name = "L", descriptor = "I")
    private int field1891 = 256;

    @OriginalMember(owner = "client!sfa", name = "M", descriptor = "I")
    private int field1892 = 256;

    @OriginalMember(owner = "client!sfa", name = "E", descriptor = "I")
    private int field1884;

    @OriginalMember(owner = "client!sfa", name = "o", descriptor = "I")
    public static int field1869 = 0;

    @OriginalMember(owner = "client!sfa", name = "s", descriptor = "D")
    public static double field1873;

    @OriginalMember(owner = "client!sfa", name = "p", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!sfa", name = "q", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!sfa", name = "r", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!sfa", name = "t", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!sfa", name = "u", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!sfa", name = "v", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!sfa", name = "x", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!sfa", name = "y", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!sfa", name = "z", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!sfa", name = "B", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!sfa", name = "D", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!sfa", name = "F", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!sfa", name = "G", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!sfa", name = "H", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!sfa", name = "J", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!sfa", name = "K", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!sfa", name = "N", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!sfa", name = "C", descriptor = "Lhf;")
    public static class645 field1882;

    @OriginalMember(owner = "client!sfa", name = "I", descriptor = "Z")
    private boolean field1888;

    @OriginalMember(owner = "client!sfa", name = "P", descriptor = "Z")
    private boolean field1895;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)V")
    private final synchronized void method953(int arg0) {
        field1879++;
        class699 var2 = this.method961(127);
        if (arg0 < 110) {
            this.method961(112);
        }
        if (var2 != null) {
            var2.method636((byte) 97);
            this.field1889 = 0;
            this.field1894--;
            class73.field1101.method3894(var2, var2.method3885((byte) 118), 0);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(II)V")
    public final void method954(int arg0, int arg1) {
        field1883++;
        this.field1892 = arg1;
        if (arg0 < 125) {
            this.method568(122);
        }
        this.field1891 = arg1;
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "()Laca;")
    public final class216 method531() {
        field1880++;
        return null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BZ)V")
    public final synchronized void method955(byte arg0, boolean arg1) {
        field1874++;
        this.field1895 = arg1;
        if (arg0 != -97) {
            this.method531();
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "()Laca;")
    public final class216 method532() {
        field1878++;
        return null;
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V")
    public static void method956(int arg0) {
        field1882 = null;
        if (arg0 != 5952) {
            method963(-3, null, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "()I")
    public final int method552() {
        field1887++;
        return 1;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IID)Lgv;")
    public final class699 method957(int arg0, int arg1, double arg2) {
        field1890++;
        if (arg0 != -12492) {
            this.field1894 = -72;
        }
        long var5 = (long) (arg1 | this.field1884 << 0);
        class699 var7 = (class699) class73.field1101.method3893(arg0 + 12492, var5);
        if (var7 == null) {
            var7 = new class699(new short[this.field1884][arg1], arg2);
        } else {
            var7.field9890 = arg2;
            class73.field1101.method3892(var5, false);
        }
        return var7;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
    public final synchronized void method568(int arg0) {
        field1875++;
        if (this.field1895) {
            return;
        }
        while (true) {
            class699 var2 = this.method961(-87);
            if (var2 == null) {
                if (this.field1888) {
                    this.method636((byte) 97);
                    class73.field1101.method3895(2);
                }
                return;
            }
            if (arg0 < var2.field9886[0].length - this.field1889) {
                this.field1889 += arg0;
                return;
            }
            arg0 -= var2.field9886[0].length - this.field1889;
            this.method953(117);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "(I)D")
    public final synchronized double method958(int arg0) {
        field1893++;
        if (this.field1894 < 1) {
            return -1.0D;
        }
        if (arg0 < 20) {
            this.method962(true);
        }
        class699 var2 = (class699) this.field1877.method3463((byte) -50);
        return var2 == null ? -1.0D : var2.field9890 - (double) ((float) var2.field9886[0].length / (float) class608.field8585);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILgv;)V")
    public final synchronized void method959(int arg0, class699 arg1) {
        while (this.field1894 >= 100) {
            this.field1877.method3466(0);
            this.field1894--;
        }
        field1885++;
        if (arg0 != 0) {
            this.method961(-18);
        }
        this.field1877.method3472(114, arg1);
        this.field1894++;
    }

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "(I)I")
    public final synchronized int method960(int arg0) {
        field1876++;
        if (arg0 != 0) {
            this.method552();
        }
        return this.field1894;
    }

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "(I)Lgv;")
    private final synchronized class699 method961(int arg0) {
        int var2 = -65 % ((8 - arg0) / 60);
        field1872++;
        return (class699) this.field1877.method3463((byte) -50);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)V")
    public final synchronized void method962(boolean arg0) {
        if (arg0) {
            this.field1884 = -13;
        }
        field1886++;
        this.field1888 = true;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILha;B)Lit;")
    public static final class34 method963(int arg0, class544 arg1, byte arg2) {
        field1871++;
        int var3 = -115 / (arg2 / 40);
        class124 var4 = (class124) class662.field9426.method3512(true, (long) arg0);
        if (var4 != null) {
            class290 var5 = var4.field1904.method4076(true);
            var4.field1902 = true;
            if (var5 != null) {
                return var5.method1888(123, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "([III)V")
    public final synchronized void method563(int[] arg0, int arg1, int arg2) {
        field1881++;
        if (this.field1895) {
            return;
        }
        if (this.method961(87) != null) {
            int var4 = arg1 + arg2;
            if (class53.field849) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field1884 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class699 var7 = this.method961(-121);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field9886;
                while (var4 > arg1 && this.field1889 < var8[0].length) {
                    if (class53.field849) {
                        arg0[arg1++] = var8[var5][this.field1889] * this.field1891;
                        arg0[arg1++] = var8[var6][this.field1889] * this.field1892;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field1889] * this.field1891 + var8[var6][this.field1889] * this.field1892;
                    }
                    this.field1889++;
                }
                if (var8[0].length <= this.field1889) {
                    this.method953(120);
                }
            }
        } else if (this.field1888) {
            this.method636((byte) 97);
            class73.field1101.method3895(2);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(I)V")
    public class122(int arg0) {
        this.field1884 = arg0;
    }
}
