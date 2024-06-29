import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class439 {

    @OriginalMember(owner = "client!uda", name = "k", descriptor = "Lfba;")
    private class348 field6272 = new class348(128);

    @OriginalMember(owner = "client!uda", name = "l", descriptor = "Lfba;")
    public class348 field6273 = new class348(64);

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "Lla;")
    public class423 field6269;

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "Lla;")
    private class423 field6271;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "Lmfa;")
    public static class407 field6267;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public final void method2686(int arg0) {
        field6262++;
        class348 var2 = this.field6272;
        synchronized (this.field6272) {
            this.field6272.method2220(false);
        }
        class348 var3 = this.field6273;
        synchronized (this.field6273) {
            this.field6273.method2220(false);
            if (arg0 != -14237) {
                this.method2690(35, -3, -55);
            }
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lbm;")
    public final class463 method2687(int arg0, int arg1) {
        field6263++;
        class348 var3 = this.field6272;
        class463 var4;
        synchronized (this.field6272) {
            var4 = (class463) this.field6272.method2216(arg1 ^ 0x24, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field6271;
        byte[] var6;
        synchronized (this.field6271) {
            var6 = this.field6271.method2600(0, arg1, arg0);
        }
        class463 var7 = new class463();
        var7.field6600 = arg0;
        var7.field6614 = this;
        if (var6 != null) {
            var7.method2813(arg1 ^ 0xFFFFFFC9, new class479(var6));
        }
        var7.method2810(113);
        class348 var8 = this.field6272;
        synchronized (this.field6272) {
            this.field6272.method2213((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
    public final void method2688(int arg0) {
        field6270++;
        if (arg0 >= -41) {
            return;
        }
        class348 var2 = this.field6272;
        synchronized (this.field6272) {
            this.field6272.method2219(-5300);
        }
        class348 var3 = this.field6273;
        synchronized (this.field6273) {
            this.field6273.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BFIFFFLqi;IIFI)[B")
    public static final byte[] method2689(byte arg0, float arg1, int arg2, float arg3, float arg4, float arg5, class291 arg6, int arg7, int arg8, float arg9, int arg10) {
        field6268++;
        if (arg0 != -46) {
            method2689((byte) -54, -0.5355456F, -57, 0.09531779F, -0.9054724F, 1.6925043F, null, 44, 34, 1.4560244F, 35);
        }
        byte[] var11 = new byte[arg7 * arg10 * arg2];
        class514.method3123(var11, 0, true, arg9, arg5, arg7, arg6, arg4, arg8, arg3, arg2, arg1, arg10);
        return var11;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)V")
    public final void method2690(int arg0, int arg1, int arg2) {
        field6265++;
        this.field6272 = new class348(arg1);
        this.field6273 = new class348(arg2);
        if (arg0 != 64) {
            this.method2688(-3);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
    public static void method2691(byte arg0) {
        field6267 = null;
        if (arg0 != -118) {
            field6264 = 32;
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)V")
    public final void method2692(int arg0, int arg1) {
        field6266++;
        class348 var3 = this.field6272;
        synchronized (this.field6272) {
            this.field6272.method2207(arg0, 1);
        }
        class348 var4 = this.field6273;
        synchronized (this.field6273) {
            this.field6273.method2207(arg0, 1);
            if (arg1 != 36) {
                method2691((byte) 81);
            }
        }
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lmp;ILla;Lla;)V")
    public class439(class315 arg0, int arg1, class423 arg2, class423 arg3) {
        this.field6269 = arg3;
        this.field6271 = arg2;
        this.field6271.method2616(36, 0);
    }
}
