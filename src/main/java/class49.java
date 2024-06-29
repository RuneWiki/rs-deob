import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class49 {

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "J")
    public long field575;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "Lte;")
    private class527 field570;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "Lkda;")
    public static class328 field572;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
    public static void method298(byte arg0) {
        field572 = null;
        if (arg0 != 118) {
            method299(null, (byte) -6, false, -56, 19, 116);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "([Lvp;BZIII)V")
    public static final void method299(class162[] arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field573++;
        if (arg1 > -60) {
            return;
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class162 var7 = arg0[var6];
            if (var7 != null && var7.field2483 == arg4) {
                class46.method289(-5, arg2, arg3, var7, arg5);
                class120.method857(var7, (byte) -108, arg5, arg3);
                if (var7.field2521 > (var7.field2561 - var7.field2527)) {
                    var7.field2521 = var7.field2561 - var7.field2527;
                }
                if (var7.field2404 > var7.field2505 - var7.field2459) {
                    var7.field2404 = var7.field2505 - var7.field2459;
                }
                if (var7.field2521 < 0) {
                    var7.field2521 = 0;
                }
                if (var7.field2404 < 0) {
                    var7.field2404 = 0;
                }
                if (var7.field2552 == 0) {
                    class100.method761(var7, -101, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field571++;
        this.field570.method3167(-7, this.field575);
        super.finalize();
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lte;J[Lwe;)V")
    public class49(class527 arg0, long arg1, class346[] arg2) {
        this.field575 = arg1;
        this.field570 = arg0;
    }
}
