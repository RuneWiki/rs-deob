import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class540 implements class396 {

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Lcd;")
    public class333 field7476;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "Luq;")
    private class172 field7473;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "Luq;")
    public class172 field7471;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "Lmw;")
    public static class517 field7478 = new class517(9, 7);

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field7482 = -1;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    private int field7469;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "J")
    private long field7470;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Lda;")
    private class67 field7481;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lha;ILmea;)I")
    public static final int method3124(class66 arg0, int arg1, class452 arg2) {
        field7472++;
        if (arg2.field6488 != -1) {
            return arg2.field6488;
        }
        if (arg2.field6494 != -1) {
            class577 var3 = arg0.field913.method1114(arg2.field6494, -71);
            if (!var3.field7868) {
                return var3.field7854;
            }
        }
        return arg1 == -19590 ? arg2.field6481 : -88;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZI)V")
    public final void method209(boolean arg0, int arg1) {
        field7483++;
        int var3 = this.field7476.field4711.method3710(0, class67.field933, this.field7476.field4708) + this.field7476.field4713;
        int var4 = this.field7476.field4715.method3920(this.field7476.field4710, class187.field2450, -63) + this.field7476.field4709;
        this.method1267(var3, arg1 - 27308, arg0, var4);
        this.method1265(arg0, 10, var3, var4);
        String var5 = class180.field2361.method1008(-106);
        if (arg1 != 7582) {
            this.field7469 = 3;
        }
        if (class401.method2440(false) - this.field7470 > 10000L) {
            var5 = var5 + " (" + class180.field2361.method1006(124).method1558((byte) 120) + ")";
        }
        this.field7481.method561(this.field7476.field4707, var5, -1, 125, this.field7476.field4710 / 2 + var4 + this.field7476.field4712 + 4, var3 - -(this.field7476.field4708 / 2));
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(ZI)V")
    public static final void method3125(boolean arg0, int arg1) {
        class324.method2095(arg1 ^ 0xFFFFFF9D);
        field7475++;
        if (!class487.method2845(class780.field10712, (byte) 26)) {
            return;
        }
        class701.field9282++;
        if (class701.field9282 < 50 && !arg0) {
            return;
        }
        class701.field9282 = arg1;
        if (!class160.field2151 && class710.field9707 != null) {
            class442.field6360++;
            class43 var2 = class492.method2903(class378.field5520, 0, class73.field983);
            class409.method2457((byte) -100, var2);
            try {
                class345.method2186((byte) 127);
            } catch (IOException var3) {
                class160.field2151 = true;
            }
        }
        class324.method2095(-89);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZIII)V")
    public abstract void method1265(boolean arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIZI)V")
    public abstract void method1267(int arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public void method211(byte arg0) {
        if (arg0 > -107) {
            field7482 = 122;
        }
        field7479++;
        class651 var2 = class588.method3309(true, this.field7476.field4706, this.field7473);
        this.field7481 = class375.field5490.method502(var2, class162.method1124(this.field7471, this.field7476.field4706), true);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public static void method3126(int arg0) {
        field7478 = null;
        if (arg0 != 14) {
            method3127((byte) 41, -25);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)V")
    public static final void method3127(byte arg0, int arg1) {
        field7468++;
        if (arg0 != -94) {
            field7478 = null;
        }
        class778 var2 = class389.method2406(110, (long) arg1, 14);
        var2.method4276(0);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3128(byte arg0, String arg1) {
        if (arg0 < 90) {
            field7482 = -53;
        }
        field7480++;
        class26.method148(0, arg1, -128, "", 0, "", "");
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
    public boolean method210(int arg0) {
        if (arg0 != 16125) {
            this.field7471 = null;
        }
        field7477++;
        boolean var2 = true;
        if (!this.field7471.method1185(this.field7476.field4706, 9330)) {
            var2 = false;
        }
        if (!this.field7473.method1185(this.field7476.field4706, arg0 - 6795)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)I")
    public final int method3129(int arg0) {
        field7474++;
        int var2 = class180.field2361.method999(-1);
        int var3 = var2 * 100;
        if (this.field7469 == var2 && var2 != 0) {
            int var4 = class180.field2361.method1004(123);
            if (var2 < var4) {
                long var5 = this.field7470 - class180.field2361.method1012(arg0 ^ 0xFFDF7B);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class401.method2440(false) - this.field7470) * 10000L;
                    if (var7 <= var9) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + ((long) (var2 * 100)));
                    }
                }
            }
        } else {
            this.field7469 = var2;
            this.field7470 = class401.method2440(false);
        }
        if (arg0 != 8324) {
            this.field7471 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Luq;Luq;Lcd;)V")
    public class540(class172 arg0, class172 arg1, class333 arg2) {
        this.field7476 = arg2;
        this.field7473 = arg1;
        this.field7471 = arg0;
    }
}
