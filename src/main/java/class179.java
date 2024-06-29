import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class179 implements Runnable {

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "[Lhh;")
    public volatile class529[] field2533 = new class529[2];

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Z")
    public volatile boolean field2529 = false;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Z")
    public volatile boolean field2531 = false;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lag;")
    public static class214 field2532 = new class214(4, 1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Lmr;")
    public class613 field2530;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLjava/awt/Canvas;ILd;I)Lha;", line = 6)
    public static final class545 method1173(byte arg0, Canvas arg1, int arg2, class268 arg3, int arg4) {
        if (arg0 > -29) {
            return null;
        } else {
            field2528++;
            return new class406(arg1, arg3, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 17)
    public static void method1174(byte arg0) {
        if (arg0 == -18) {
            field2532 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLvea;)Z", line = 28)
    public static final boolean method1175(boolean arg0, class649 arg1) {
        if (arg0) {
            field2532 = null;
        }
        field2534++;
        class30 var2 = class264.field3604.method3188(arg1.method275(24263), (byte) -57);
        if (var2.field404 == -1) {
            return true;
        } else {
            class403 var3 = class625.field8924.method900(-29491, var2.field404);
            return var3.field5600 == -1 ? true : var3.method2451(0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "run", descriptor = "()V", line = 50)
    public final void run() {
        this.field2531 = true;
        field2527++;
        try {
            while (!this.field2529) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class529 var2 = this.field2533[var1];
                    if (var2 != null) {
                        var2.method3139((byte) 109);
                    }
                }
                class740.method4124(10L, 82);
                class187.method1254(null, this.field2530, false);
            }
        } catch (Exception var9) {
            class233.method1495((byte) 47, var9, null);
        } finally {
            Object var6 = null;
            this.field2531 = false;
        }
    }
}
