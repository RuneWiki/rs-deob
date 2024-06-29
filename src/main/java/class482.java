import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class482 extends class115 {

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Lps;")
    public class63 field7118 = new class63();

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Lru;")
    public class130 field7122 = new class130();

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Lwt;")
    private class206 field7111;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field7109 = 0;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Ltl;")
    public static class445 field7110 = new class445(0, -1);

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)V", line = 3)
    public final void method708(int[] arg0, int arg1, int arg2) {
        field7112++;
        this.field7122.method708(arg0, arg1, arg2);
        for (class422 var4 = (class422) this.field7118.method445(33); var4 != null; var4 = (class422) this.field7118.method451(false)) {
            if (!this.field7111.method1397(-97, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field6429 >= var5) {
                        this.method2897(var4, var6, var5, arg0, var5 + var6, -102);
                        var4.field6429 -= var5;
                        break;
                    }
                    this.method2897(var4, var6, var4.field6429, arg0, var6 + var5, -12);
                    var6 += var4.field6429;
                    var5 -= var4.field6429;
                } while (!this.field7111.method1421(arg0, (byte) 62, var4, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 41)
    public final void method712(int arg0) {
        field7121++;
        this.field7122.method712(arg0);
        for (class422 var2 = (class422) this.field7118.method445(33); var2 != null; var2 = (class422) this.field7118.method451(false)) {
            if (!this.field7111.method1397(-127, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field6429) {
                        this.method2898(var2, var3, (byte) 106);
                        var2.field6429 -= var3;
                        break;
                    }
                    this.method2898(var2, var2.field6429, (byte) 106);
                    var3 -= var2.field6429;
                } while (!this.field7111.method1421(null, (byte) -103, var2, 0, var3));
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V", line = 77)
    public static void method2894(int arg0) {
        if (arg0 < 16) {
            method2896(31, -2, -67);
        }
        field7110 = null;
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V", line = 89)
    public static final void method2895(int arg0) {
        field7115++;
        if (class337.field5232 == -1) {
            return;
        }
        int var1 = class502.field7404.method2323((byte) -86);
        int var2 = class502.field7404.method2325(-128);
        class245 var3 = (class245) class212.field3001.method445(33);
        if (var3 != null) {
            var1 = var3.method1571(true);
            var2 = var3.method1567(-20707);
        }
        class412.method2537(class107.field1525, 0, arg0, class147.field1961, var1, var2, class337.field5232, 0, (byte) -116, 0);
        if (class120.field1643 != null) {
            class151.method988((byte) -128, var1, var2);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V", line = 115)
    public static final void method2896(int arg0, int arg1, int arg2) {
        if (class270.field3761 == 1) {
            class292.method1864((byte) 9, class336.field5212, arg1, arg0);
        } else if (class270.field3761 == 2) {
            class78.method540(8, arg0, arg1);
        }
        field7116++;
        class270.field3761 = 0;
        if (arg2 != 24177) {
            field7109 = 111;
        }
        class336.field5212 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Llk;II[III)V", line = 134)
    private final void method2897(class422 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        field7113++;
        if ((this.field7111.field2753[arg0.field6425] & 0x4) != 0 && arg0.field6433 < 0) {
            int var7 = this.field7111.field2748[arg0.field6425] / class56.field818;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field6442) / var7;
                if (var8 > arg2) {
                    arg0.field6442 += arg2 * var7;
                    break;
                }
                arg0.field6422.method708(arg3, arg1, var8);
                arg0.field6442 += var7 * var8 - 1048576;
                arg2 -= var8;
                arg1 += var8;
                int var9 = class56.field818 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class481 var11 = arg0.field6422;
                if (this.field7111.field2799[arg0.field6425] == 0) {
                    arg0.field6422 = class481.method2854(arg0.field6443, var11.method2876(), var11.method2862(), var11.method2890());
                } else {
                    arg0.field6422 = class481.method2854(arg0.field6443, var11.method2876(), 0, var11.method2890());
                    this.field7111.method1415(arg0.field6438.field1620[arg0.field6444] < 0, -32544, arg0);
                    arg0.field6422.method2874(var9, var11.method2862());
                }
                if (arg0.field6438.field1620[arg0.field6444] < 0) {
                    arg0.field6422.method2869(-1);
                }
                var11.method2877(var9);
                var11.method708(arg3, arg1, arg4 - arg1);
                if (var11.method2868()) {
                    this.field7122.method879(var11);
                }
            }
        }
        arg0.field6422.method708(arg3, arg1, arg2);
        int var12 = 92 / ((55 - arg5) / 61);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()Lwq;", line = 203)
    public final class115 method710() {
        field7120++;
        class422 var1;
        do {
            var1 = (class422) this.field7118.method451(false);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6422 == null);
        return var1.field6422;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()Lwq;", line = 224)
    public final class115 method714() {
        field7114++;
        class422 var1 = (class422) this.field7118.method445(33);
        if (var1 == null) {
            return null;
        } else if (var1.field6422 == null) {
            return this.method710();
        } else {
            return var1.field6422;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Llk;IB)V", line = 242)
    private final void method2898(class422 arg0, int arg1, byte arg2) {
        field7119++;
        if ((this.field7111.field2753[arg0.field6425] & 0x4) != 0 && arg0.field6433 < 0) {
            int var4 = this.field7111.field2748[arg0.field6425] / class56.field818;
            int var5 = (var4 + 1048575 - arg0.field6442) / var4;
            arg0.field6442 = arg1 * var4 + arg0.field6442 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field7111.field2799[arg0.field6425] == 0) {
                    arg0.field6422 = class481.method2854(arg0.field6443, arg0.field6422.method2876(), arg0.field6422.method2862(), arg0.field6422.method2890());
                } else {
                    arg0.field6422 = class481.method2854(arg0.field6443, arg0.field6422.method2876(), 0, arg0.field6422.method2890());
                    this.field7111.method1415(arg0.field6438.field1620[arg0.field6444] < 0, -32544, arg0);
                }
                if (arg0.field6438.field1620[arg0.field6444] < 0) {
                    arg0.field6422.method2869(-1);
                }
                arg1 = arg0.field6442 / var4;
            }
        }
        arg0.field6422.method712(arg1);
        if (arg2 != 106) {
            this.field7111 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()I", line = 281)
    public final int method709() {
        field7117++;
        return 0;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lwt;)V", line = 303)
    public class482(class206 arg0) {
        this.field7111 = arg0;
    }
}
