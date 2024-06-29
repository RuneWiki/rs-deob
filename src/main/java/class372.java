import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class372 extends class299 {

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "Lbv;")
    public class568 field5173 = new class568();

    @OriginalMember(owner = "client!pt", name = "B", descriptor = "Lfea;")
    public class47 field5186 = new class47();

    @OriginalMember(owner = "client!pt", name = "A", descriptor = "Lom;")
    private class333 field5185;

    @OriginalMember(owner = "client!pt", name = "x", descriptor = "I")
    public static int field5182 = 0;

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "Z")
    public static boolean field5181 = true;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!pt", name = "z", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "[Lha;")
    public static class116[] field5172;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "([III)V")
    public final void method252(int[] arg0, int arg1, int arg2) {
        field5175++;
        this.field5186.method252(arg0, arg1, arg2);
        for (class325 var4 = (class325) this.field5173.method3188((byte) -100); var4 != null; var4 = (class325) this.field5173.method3182((byte) -111)) {
            if (!this.field5185.method2122(var4, 16)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field4457 >= var5) {
                        this.method2270(var6, var4, (byte) -32, var5 + var6, arg0, var5);
                        var4.field4457 -= var5;
                        break;
                    }
                    this.method2270(var6, var4, (byte) -32, var5 + var6, arg0, var4.field4457);
                    var6 += var4.field4457;
                    var5 -= var4.field4457;
                } while (!this.field5185.method2094(arg0, 0, var4, var5, var6));
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "()I")
    public final int method258() {
        field5177++;
        return 0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILvd;Z)V")
    private final void method2269(int arg0, class325 arg1, boolean arg2) {
        if ((this.field5185.field4647[arg1.field4472] & 0x4) != 0 && arg1.field4459 < 0) {
            int var4 = this.field5185.field4638[arg1.field4472] / class10.field98;
            int var5 = (var4 + 1048575 - arg1.field4474) / var4;
            arg1.field4474 = arg0 * var4 + arg1.field4474 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field5185.field4597[arg1.field4472] == 0) {
                    arg1.field4464 = class213.method1352(arg1.field4468, arg1.field4464.method1367(), arg1.field4464.method1373(), arg1.field4464.method1372());
                } else {
                    arg1.field4464 = class213.method1352(arg1.field4468, arg1.field4464.method1367(), 0, arg1.field4464.method1372());
                    this.field5185.method2095(arg1, (byte) -115, arg1.field4462.field4361[arg1.field4466] < 0);
                }
                if (arg1.field4462.field4361[arg1.field4466] < 0) {
                    arg1.field4464.method1353(-1);
                }
                arg0 = arg1.field4474 / var4;
            }
        }
        field5176++;
        if (arg2) {
            field5183 = 93;
        }
        arg1.field4464.method254(arg0);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "()Lgv;")
    public final class299 method259() {
        field5179++;
        class325 var1 = (class325) this.field5173.method3188((byte) -100);
        if (var1 == null) {
            return null;
        } else if (var1.field4464 == null) {
            return this.method249();
        } else {
            return var1.field4464;
        }
    }

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "()Lgv;")
    public final class299 method249() {
        field5178++;
        class325 var1;
        do {
            var1 = (class325) this.field5173.method3182((byte) -77);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4464 == null);
        return var1.field4464;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public final void method254(int arg0) {
        field5174++;
        this.field5186.method254(arg0);
        for (class325 var2 = (class325) this.field5173.method3188((byte) -100); var2 != null; var2 = (class325) this.field5173.method3182((byte) -37)) {
            if (!this.field5185.method2122(var2, 16)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4457) {
                        this.method2269(var3, var2, false);
                        var2.field4457 -= var3;
                        break;
                    }
                    this.method2269(var2.field4457, var2, false);
                    var3 -= var2.field4457;
                } while (!this.field5185.method2094(null, 0, var2, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILvd;BI[II)V")
    private final void method2270(int arg0, class325 arg1, byte arg2, int arg3, int[] arg4, int arg5) {
        if ((this.field5185.field4647[arg1.field4472] & 0x4) != 0 && arg1.field4459 < 0) {
            int var7 = this.field5185.field4638[arg1.field4472] / class10.field98;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field4474) / var7;
                if (arg5 < var8) {
                    arg1.field4474 += arg5 * var7;
                    break;
                }
                arg1.field4464.method252(arg4, arg0, var8);
                arg1.field4474 += var7 * var8 - 1048576;
                arg0 += var8;
                arg5 -= var8;
                int var9 = class10.field98 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class213 var11 = arg1.field4464;
                if (this.field5185.field4597[arg1.field4472] == 0) {
                    arg1.field4464 = class213.method1352(arg1.field4468, var11.method1367(), var11.method1373(), var11.method1372());
                } else {
                    arg1.field4464 = class213.method1352(arg1.field4468, var11.method1367(), 0, var11.method1372());
                    this.field5185.method2095(arg1, (byte) -115, arg1.field4462.field4361[arg1.field4466] < 0);
                    arg1.field4464.method1380(var9, var11.method1373());
                }
                if (arg1.field4462.field4361[arg1.field4466] < 0) {
                    arg1.field4464.method1353(-1);
                }
                var11.method1388(var9);
                var11.method252(arg4, arg0, arg3 - arg0);
                if (var11.method1385()) {
                    this.field5186.method257(var11);
                }
            }
        }
        field5180++;
        if (arg2 != -32) {
            method2272(-25, (byte) 117);
        }
        arg1.field4464.method252(arg4, arg0, arg5);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public static void method2271(byte arg0) {
        field5172 = null;
        int var1 = -11 / ((-arg0 - 11) / 46);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)V")
    public static final void method2272(int arg0, byte arg1) {
        int var2 = 8 % ((-arg1 - 24) / 46);
        field5184++;
        if (class554.field7754 == 1) {
            class599.field8655 = arg0;
        } else if (class554.field7754 == 2 || class554.field7754 == 3) {
            class18.field206 = arg0;
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lom;)V")
    public class372(class333 arg0) {
        this.field5185 = arg0;
    }
}
