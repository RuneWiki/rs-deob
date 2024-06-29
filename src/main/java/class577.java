import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class577 {

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Lfba;")
    private class348 field8281 = new class348(64);

    @OriginalMember(owner = "client!po", name = "k", descriptor = "Lfba;")
    public class348 field8289 = new class348(2);

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Lla;")
    public class423 field8285;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Lla;")
    private class423 field8286;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Z")
    public static boolean field8287 = false;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "F")
    public static float field8288;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "[Ldv;")
    public static class86[] field8283;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static void method3418(int arg0) {
        if (arg0 <= -76) {
            field8283 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public final void method3419(int arg0) {
        class348 var2 = this.field8281;
        synchronized (this.field8281) {
            this.field8281.method2220(false);
        }
        field8284++;
        class348 var3 = this.field8289;
        synchronized (this.field8289) {
            this.field8289.method2220(false);
            if (arg0 != -310) {
                this.method3423(108, true);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
    public final void method3420(byte arg0) {
        class348 var2 = this.field8281;
        synchronized (this.field8281) {
            this.field8281.method2219(-5300);
        }
        field8279++;
        class348 var3 = this.field8289;
        synchronized (this.field8289) {
            int var4 = 65 / ((-arg0 - 61) / 62);
            this.field8289.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public static final void method3421(int arg0) {
        class352.field5212 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)Lqg;")
    public final class266 method3422(int arg0, byte arg1) {
        field8282++;
        class348 var3 = this.field8281;
        class266 var4;
        synchronized (this.field8281) {
            var4 = (class266) this.field8281.method2216(0, (long) arg0);
        }
        if (arg1 >= -56) {
            return null;
        } else if (var4 == null) {
            class423 var5 = this.field8286;
            byte[] var6;
            synchronized (this.field8286) {
                var6 = this.field8286.method2600(0, 33, arg0);
            }
            class266 var7 = new class266();
            var7.field3804 = this;
            if (var6 != null) {
                var7.method1754(new class479(var6), (byte) 87);
            }
            class348 var8 = this.field8281;
            synchronized (this.field8281) {
                this.field8281.method2213((byte) -16, (long) arg0, var7);
                return var7;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ)V")
    public final void method3423(int arg0, boolean arg1) {
        field8280++;
        class348 var3 = this.field8281;
        synchronized (this.field8281) {
            this.field8281.method2207(arg0, 1);
            if (!arg1) {
                this.method3422(-50, (byte) 19);
            }
        }
        class348 var4 = this.field8289;
        synchronized (this.field8289) {
            this.field8289.method2207(arg0, 1);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lmp;ILla;Lla;)V")
    public class577(class315 arg0, int arg1, class423 arg2, class423 arg3) {
        this.field8285 = arg3;
        this.field8286 = arg2;
        this.field8286.method2616(33, 0);
    }
}
