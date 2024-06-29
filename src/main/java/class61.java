import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class61 extends class388 {

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lqp;")
    private class715 field989;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(III)I", line = 7)
    public static final int method569(int arg0, int arg1, int arg2) {
        field992++;
        if (arg2 != 29004) {
            method573(false);
        }
        int var3 = arg1 >>> 24;
        int var4 = ((arg1 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg1 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lsl;I)V", line = 24)
    public final void method570(class479 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                field993++;
                if (arg1 != 13371) {
                    this.field989 = null;
                    return;
                }
                return;
            }
            this.method574(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(Z)V", line = 45)
    public static final void method571(boolean arg0) {
        field990++;
        if (!class549.field7997) {
            return;
        }
        class146 var1 = class590.method3467(1, class231.field3475, class250.field3640);
        if (var1 != null && var1.field2075 != null) {
            class362 var2 = new class362();
            var2.field5297 = var1.field2075;
            var2.field5304 = var1;
            class529.method3207(var2);
        }
        class191.field2688 = -1;
        class549.field7997 = arg0;
        class548.field7953 = -1;
        if (var1 != null) {
            class401.method2439(1723, var1);
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(III)I", line = 75)
    public final int method572(int arg0, int arg1, int arg2) {
        field994++;
        if (this.field989 == null) {
            return arg1;
        }
        class177 var4 = (class177) this.field989.method4020((long) arg2, (byte) -115);
        if (arg0 != 16711935) {
            this.field989 = null;
        }
        return var4 == null ? arg1 : var4.field2473;
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(Z)Lg;", line = 95)
    public static final class592 method573(boolean arg0) {
        class367.field5374 = 0;
        if (arg0) {
            method576(36, 33);
        }
        field995++;
        return class644.method3713(31240);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZILsl;)V", line = 110)
    private final void method574(boolean arg0, int arg1, class479 arg2) {
        if (arg1 == 249) {
            int var4 = arg2.method2886(!arg0);
            if (this.field989 == null) {
                int var5 = class68.method609(var4, (byte) -125);
                this.field989 = new class715(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method2886(true) == 1;
                int var8 = arg2.method2865(255);
                class430 var9;
                if (var7) {
                    var9 = new class687(arg2.method2894(-13192));
                } else {
                    var9 = new class177(arg2.method2868(-34));
                }
                this.field989.method4022(var9, -40, (long) var8);
            }
        }
        field987++;
        if (arg0) {
            this.field989 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLjava/lang/String;I)Ljava/lang/String;", line = 160)
    public final String method575(boolean arg0, String arg1, int arg2) {
        field991++;
        if (this.field989 == null) {
            return arg1;
        }
        class687 var4 = (class687) this.field989.method4020((long) arg2, (byte) -79);
        if (var4 == null) {
            return arg1;
        } else if (arg0) {
            return null;
        } else {
            return var4.field9754;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)I", line = 181)
    public static final int method576(int arg0, int arg1) {
        if (arg0 == -345785720) {
            field988++;
            return arg1 >>> 8;
        } else {
            return -54;
        }
    }
}
