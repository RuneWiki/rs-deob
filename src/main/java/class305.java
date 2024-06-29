import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class305 extends class398 {

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "Lgw;")
    public class118 field4516 = new class118();

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "Ltc;")
    public class240 field4524 = new class240();

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "Ldb;")
    private class217 field4514;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "Lqt;")
    public static class459 field4517 = new class459(77, -1);

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1944(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "([III)V")
    public final void method717(int[] arg0, int arg1, int arg2) {
        field4513++;
        this.field4524.method717(arg0, arg1, arg2);
        for (class399 var4 = (class399) this.field4516.method863(-1); var4 != null; var4 = (class399) this.field4516.method865(-1)) {
            if (!this.field4514.method1466(var4, (byte) -67)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field5659) {
                        this.method1945(112, arg0, var4, var5 + var6, var6, var5);
                        var4.field5659 -= var5;
                        break;
                    }
                    this.method1945(96, arg0, var4, var5 + var6, var6, var4.field5659);
                    var5 -= var4.field5659;
                    var6 += var4.field5659;
                } while (!this.field4514.method1456(var5, var4, -18999, var6, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[ILsi;III)V")
    private final void method1945(int arg0, int[] arg1, class399 arg2, int arg3, int arg4, int arg5) {
        if ((this.field4514.field3265[arg2.field5669] & 0x4) != 0 && arg2.field5671 < 0) {
            int var7 = this.field4514.field3249[arg2.field5669] / class120.field1877;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field5672) / var7;
                if (arg5 < var8) {
                    arg2.field5672 += arg5 * var7;
                    break;
                }
                arg2.field5668.method717(arg1, arg4, var8);
                arg2.field5672 += var7 * var8 - 1048576;
                arg4 += var8;
                arg5 -= var8;
                int var9 = class120.field1877 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class93 var11 = arg2.field5668;
                if (this.field4514.field3242[arg2.field5669] == 0) {
                    arg2.field5668 = class93.method688(arg2.field5674, var11.method719(), var11.method694(), var11.method689());
                } else {
                    arg2.field5668 = class93.method688(arg2.field5674, var11.method719(), 0, var11.method689());
                    this.field4514.method1463(arg2, arg2.field5678.field6911[arg2.field5667] < 0, -28760);
                    arg2.field5668.method699(var9, var11.method694());
                }
                if (arg2.field5678.field6911[arg2.field5667] < 0) {
                    arg2.field5668.method691(-1);
                }
                var11.method690(var9);
                var11.method717(arg1, arg4, arg3 - arg4);
                if (var11.method710()) {
                    this.field4524.method1586(var11);
                }
            }
        }
        if (arg0 < 39) {
            this.field4516 = null;
        }
        field4519++;
        arg2.field5668.method717(arg1, arg4, arg5);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILsi;)V")
    private final void method1946(int arg0, int arg1, class399 arg2) {
        if (arg0 != -1) {
            this.field4514 = null;
        }
        if ((this.field4514.field3265[arg2.field5669] & 0x4) != 0 && arg2.field5671 < 0) {
            int var4 = this.field4514.field3249[arg2.field5669] / class120.field1877;
            int var5 = (var4 + 1048575 - arg2.field5672) / var4;
            arg2.field5672 = arg1 * var4 + arg2.field5672 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field4514.field3242[arg2.field5669] == 0) {
                    arg2.field5668 = class93.method688(arg2.field5674, arg2.field5668.method719(), arg2.field5668.method694(), arg2.field5668.method689());
                } else {
                    arg2.field5668 = class93.method688(arg2.field5674, arg2.field5668.method719(), 0, arg2.field5668.method689());
                    this.field4514.method1463(arg2, arg2.field5678.field6911[arg2.field5667] < 0, -28760);
                }
                if (arg2.field5678.field6911[arg2.field5667] < 0) {
                    arg2.field5668.method691(-1);
                }
                arg1 = arg2.field5672 / var4;
            }
        }
        field4515++;
        arg2.field5668.method697(arg1);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public static final void method1947(byte arg0) {
        field4523++;
        if (arg0 != -6) {
            method1949((byte) 107);
        }
        if (!class261.method1687(-18337)) {
            return;
        }
        if (class290.field4298 == null) {
            class460.method2730((byte) -102);
        }
        class501.field7241 = 0;
        class335.field4964 = true;
        try {
            class226.field3410 = class212.field3194.getToolkit().getSystemClipboard();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "()I")
    public final int method692() {
        field4520++;
        return 0;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
    public static void method1948(int arg0) {
        int var1 = -115 % ((-arg0 - 80) / 44);
        field4517 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public final void method697(int arg0) {
        field4526++;
        this.field4524.method697(arg0);
        for (class399 var2 = (class399) this.field4516.method863(-1); var2 != null; var2 = (class399) this.field4516.method865(-1)) {
            if (!this.field4514.method1466(var2, (byte) -67)) {
                int var3 = arg0;
                do {
                    if (var2.field5659 >= var3) {
                        this.method1946(-1, var3, var2);
                        var2.field5659 -= var3;
                        break;
                    }
                    this.method1946(-1, var2.field5659, var2);
                    var3 -= var2.field5659;
                } while (!this.field4514.method1456(var3, var2, -18999, 0, null));
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "()Lpo;")
    public final class398 method693() {
        field4518++;
        class399 var1 = (class399) this.field4516.method863(-1);
        if (var1 == null) {
            return null;
        } else if (var1.field5668 == null) {
            return this.method700();
        } else {
            return var1.field5668;
        }
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)V")
    public static final void method1949(byte arg0) {
        field4528++;
        int var1 = 0;
        if (arg0 != 51) {
            method1947((byte) -77);
        }
        if (class220.field3371.method1215(class74.field1211, -4)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class220.field3371.field2583) {
            var1 |= 0x40;
        }
        class218.method1479(80, var1);
        class277.field4139.method568(var1, -12);
        class58.field1052.method1652(var1, true);
        class117.field1812.method2309(var1, false);
        class69.field1133.method1314(8890, var1);
        class156.method1092(var1, arg0 ^ 0x13DA505B);
        class78.method600(var1, (byte) -55);
        class494.method2899(5000, var1);
        class461.method2734(-70, var1);
        class519.method3046(-109);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BBILki;I)V")
    public static final void method1950(byte arg0, byte arg1, int arg2, class510 arg3, int arg4) {
        if (arg0 != 49) {
            field4517 = null;
        }
        field4522++;
        int var5 = arg3.field343[0];
        int var6 = arg3.field344[0];
        if (var5 < 0 || var5 >= class69.field1139 || var6 < 0 || class255.field3763 <= var6 || arg4 < 0 || arg4 >= class69.field1139 || arg2 < 0 || arg2 >= class255.field3763) {
            return;
        }
        int var7 = class121.method899(0, 0, arg3.method135((byte) 72), -4, true, class206.field3142, true, var6, 0, arg4, class22.field232, var5, 0, class19.field213[arg3.field6956], arg2);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg3.method2975(class206.field3142[var8], (byte) -92, class22.field232[var8], arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "()Lpo;")
    public final class398 method700() {
        field4521++;
        class399 var1;
        do {
            var1 = (class399) this.field4516.method865(-1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5668 == null);
        return var1.field5668;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Ldb;)V")
    public class305(class217 arg0) {
        this.field4514 = arg0;
    }

    static {
        new class44("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field4527 = 0;
    }
}
