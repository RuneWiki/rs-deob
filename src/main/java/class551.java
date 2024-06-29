import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class551 {

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "Lfba;")
    private class348 field8035 = new class348(16);

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "Lla;")
    private class423 field8038;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "Llc;")
    public static class435 field8037 = new class435(45, 6);

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public static int field8042 = 0;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "Lla;")
    public static class423 field8040;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIILsea;)Ltr;")
    public final class564 method3314(int arg0, int arg1, int arg2, int arg3, int arg4, class281 arg5) {
        if (arg1 != 45) {
            method3316((byte) -39);
        }
        field8039++;
        class557[] var7 = null;
        class517 var8 = this.method3318((byte) 2, arg3);
        if (var8.field7449 != null) {
            var7 = new class557[var8.field7449.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class640 var10 = arg5.method1798(var8.field7449[var9], 27392);
                var7[var9] = new class557(var10.field9107, var10.field9106, var10.field9100, var10.field9114, var10.field9103, var10.field9109, var10.field9104, var10.field9101);
            }
        }
        return new class564(var8.field7455, var7, var8.field7457, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
    public final void method3315(int arg0) {
        field8031++;
        class348 var2 = this.field8035;
        synchronized (this.field8035) {
            if (arg0 == -20696) {
                this.field8035.method2220(false);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
    public static void method3316(byte arg0) {
        field8037 = null;
        field8040 = null;
        if (arg0 != -68) {
            method3316((byte) -99);
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V")
    public final void method3317(int arg0) {
        field8036++;
        if (arg0 > -124) {
            field8042 = -118;
        }
        class348 var2 = this.field8035;
        synchronized (this.field8035) {
            this.field8035.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BI)Lpc;")
    private final class517 method3318(byte arg0, int arg1) {
        field8032++;
        class348 var3 = this.field8035;
        class517 var4;
        synchronized (this.field8035) {
            var4 = (class517) this.field8035.method2216(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field8038;
        byte[] var6;
        synchronized (this.field8038) {
            var6 = this.field8038.method2600(0, 29, arg1);
        }
        class517 var7 = new class517();
        if (var6 != null) {
            var7.method3142(new class479(var6), (byte) -100);
        }
        class348 var8 = this.field8035;
        synchronized (this.field8035) {
            this.field8035.method2213((byte) -16, (long) arg1, var7);
        }
        return arg0 == 2 ? var7 : null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IB)V")
    public final void method3319(int arg0, byte arg1) {
        field8034++;
        class348 var3 = this.field8035;
        synchronized (this.field8035) {
            if (arg1 < 120) {
                this.field8038 = null;
            }
            this.field8035.method2207(arg0, 1);
        }
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lmp;ILla;)V")
    public class551(class315 arg0, int arg1, class423 arg2) {
        this.field8038 = arg2;
        this.field8038.method2616(29, 0);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
    public static final void method3320(boolean arg0) {
        field8033++;
        if (class15.field149 <= 1) {
            class243.field3580.method3301(2, 24, class243.field3580.field7995);
        } else {
            class243.field3580.method3301(4, 24, class243.field3580.field7995);
        }
        if (!arg0) {
            field8040 = null;
        }
    }
}
