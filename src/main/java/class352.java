import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class352 extends class101 {

    @OriginalMember(owner = "client!b", name = "G", descriptor = "Lok;")
    private class266 field4942 = new class266();

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    private int field4943 = 256;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    private int field4944 = 0;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    private int field4945 = 256;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    private int field4925;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    private int field4948;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Lwia;")
    public static class791 field4936;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "Z")
    private boolean field4946;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "Z")
    private boolean field4947;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lct;I)V")
    public final synchronized void method2225(class155 arg0, int arg1) {
        field4949++;
        while (this.field4944 >= 100) {
            this.field4942.method1736(0);
            this.field4944--;
        }
        int var3 = 63 % ((45 - arg1) / 57);
        this.field4942.method1727(arg0, (byte) 118);
        this.field4944++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
    public final synchronized void method2226(boolean arg0, int arg1) {
        this.field4946 = arg0;
        field4932++;
        if (arg1 != 256) {
            this.field4946 = false;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Lct;")
    private final synchronized class155 method2227(int arg0) {
        field4941++;
        if (arg0 != 0) {
            this.method191();
        }
        return (class155) this.field4942.method1731((byte) -123);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lwia;I)V")
    public static final void method2228(class791 arg0, int arg1) {
        class357.field5023 = 0;
        field4937++;
        class207.field3213 = 0;
        class20.field339 = new class343();
        class220.field3417 = new class272[1024];
        class195.field3000 = new class593[class267.field3892[class715.field9934] + 1];
        class403.field5514 = 0;
        class445.field6050 = 0;
        class70.method582(arg0, arg1 + 58346);
        class245.method1626(arg0, (byte) -76);
        if (arg1 != -25952) {
            field4936 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IID)Lct;")
    public final class155 method2229(int arg0, int arg1, double arg2) {
        field4927++;
        long var5 = (long) (arg0 | this.field4925 << 0);
        class155 var7 = (class155) class685.field9474.method4039(0, var5);
        if (var7 == null) {
            var7 = new class155(new short[this.field4925][arg0], arg2);
        } else {
            var7.field2198 = arg2;
            class685.field9474.method4035(var5, (byte) 111);
        }
        return arg1 == -14805 ? var7 : null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public final synchronized void method182(int arg0) {
        field4940++;
        if (this.field4946) {
            return;
        }
        while (true) {
            class155 var2 = this.method2227(0);
            if (var2 == null) {
                if (this.field4947) {
                    this.method3387((byte) -120);
                    class685.field9474.method4038(-15210);
                }
                return;
            }
            if (arg0 < var2.field2194[0].length - this.field4948) {
                this.field4948 += arg0;
                return;
            }
            arg0 -= var2.field2194[0].length - this.field4948;
            this.method2233((byte) 62);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([III)V")
    public final synchronized void method203(int[] arg0, int arg1, int arg2) {
        field4933++;
        if (this.field4946) {
            return;
        }
        if (this.method2227(0) != null) {
            int var4 = arg1 + arg2;
            if (class488.field6898) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field4925 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class155 var7 = this.method2227(0);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field2194;
                while (arg1 < var4 && var8[0].length > this.field4948) {
                    if (class488.field6898) {
                        arg0[arg1++] = var8[var5][this.field4948] * this.field4945;
                        arg0[arg1++] = var8[var6][this.field4948] * this.field4943;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field4948] * this.field4945 + var8[var6][this.field4948] * this.field4943;
                    }
                    this.field4948++;
                }
                if (this.field4948 >= var8[0].length) {
                    this.method2233((byte) 97);
                }
            }
        } else if (this.field4947) {
            this.method3387((byte) 126);
            class685.field9474.method4038(-15210);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)D")
    public final synchronized double method2230(boolean arg0) {
        field4928++;
        if (!arg0) {
            method2232(48);
        }
        if (this.field4944 < 1) {
            return -1.0D;
        } else {
            class155 var2 = (class155) this.field4942.method1731((byte) -123);
            return var2 == null ? -1.0D : var2.field2198 - (double) ((float) var2.field2194[0].length / (float) class114.field1746);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "()Lsd;")
    public final class101 method191() {
        field4939++;
        return null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)I")
    public static final int method2231(byte arg0) {
        field4931++;
        return arg0 <= 14 ? -79 : class250.field3696++;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method2232(int arg0) {
        field4936 = null;
        if (arg0 != -28435) {
            field4936 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "()Lsd;")
    public final class101 method176() {
        field4950++;
        return null;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
    private final synchronized void method2233(byte arg0) {
        field4929++;
        if (arg0 < 33) {
            return;
        }
        class155 var2 = this.method2227(0);
        if (var2 != null) {
            var2.method3387((byte) -126);
            this.field4944--;
            this.field4948 = 0;
            class685.field9474.method4037(var2, var2.method1063(3899), false);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
    public final int method210() {
        field4938++;
        return 1;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
    public final synchronized void method2234(boolean arg0) {
        this.field4947 = arg0;
        field4926++;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
    public static final void method2235(int arg0) {
        class730.field10110 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)I")
    public final synchronized int method2236(boolean arg0) {
        if (arg0) {
            field4935++;
            return this.field4944;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
    public final void method2237(byte arg0, int arg1) {
        this.field4943 = arg1;
        if (arg0 >= -86) {
            this.field4945 = 46;
        }
        field4930++;
        this.field4945 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
    public static final void method2238(int arg0, int arg1, int arg2) {
        field4934++;
        class313 var3 = class312.method1998((long) arg0, 6, -1);
        if (arg2 != -122277056) {
            field4936 = null;
        }
        var3.method2001((byte) -56);
        var3.field4464 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V")
    public class352(int arg0) {
        this.field4925 = arg0;
    }
}
