import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class668 {

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Ltb;")
    private class450 field9418 = new class450(64);

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Ltb;")
    public class450 field9420 = new class450(64);

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lpl;")
    public class612 field9414;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lpl;")
    private class612 field9412;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Z")
    public static boolean field9413 = false;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Lwp;")
    public static class453 field9419 = new class453(29, 6);

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Z")
    public static boolean field9425 = true;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Lwp;")
    public static class453 field9422 = new class453(85, 28);

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Lrga;")
    public static class280 field9426 = new class280(50, 3);

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field9427 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3750(int arg0, int arg1, int arg2) {
        if (arg1 != 85) {
            method3754(false);
        }
        field9424++;
        return (arg0 & 0x40000) != 0 | class532.method2887(arg0, arg2, (byte) 36) || class638.method3573(arg1 - 82, arg0, arg2);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 16)
    public final void method3751(int arg0) {
        class450 var2 = this.field9418;
        synchronized (this.field9418) {
            if (arg0 != -1) {
                method3754(false);
            }
            this.field9418.method2412((byte) 42);
        }
        field9416++;
        class450 var3 = this.field9420;
        synchronized (this.field9420) {
            this.field9420.method2412((byte) 5);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 42)
    public final void method3752(int arg0) {
        if (arg0 >= -84) {
            this.method3756(-54, -5);
        }
        class450 var2 = this.field9418;
        synchronized (this.field9418) {
            this.field9418.method2406(18385);
        }
        field9417++;
        class450 var3 = this.field9420;
        synchronized (this.field9420) {
            this.field9420.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)Lwi;", line = 58)
    public final class542 method3753(int arg0, byte arg1) {
        field9421++;
        class450 var3 = this.field9418;
        class542 var4;
        synchronized (this.field9418) {
            var4 = (class542) this.field9418.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field9412;
        byte[] var6;
        synchronized (this.field9412) {
            var6 = this.field9412.method3365(arg0, -127, 34);
        }
        class542 var7 = new class542();
        var7.field7248 = this;
        if (var6 != null) {
            var7.method2927(new class630(var6), -1);
        }
        class450 var8 = this.field9418;
        synchronized (this.field9418) {
            this.field9418.method2409((long) arg0, var7, 1);
        }
        return arg1 <= 7 ? null : var7;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 91)
    public static final void method3754(boolean arg0) {
        field9411++;
        if (class367.field4671 == 6) {
            class367.field4671 = 7;
            if (arg0) {
                method3754(false);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZ)V", line = 105)
    public final void method3755(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field9418 = new class450(arg0);
            field9423++;
            this.field9420 = new class450(arg1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V", line = 119)
    public final void method3756(int arg0, int arg1) {
        class450 var3 = this.field9418;
        synchronized (this.field9418) {
            this.field9418.method2411(true, arg1);
        }
        if (arg0 != 29) {
            return;
        }
        field9415++;
        class450 var4 = this.field9420;
        synchronized (this.field9420) {
            this.field9420.method2411(true, arg1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 137)
    public static void method3757(int arg0) {
        field9426 = null;
        field9422 = null;
        field9419 = null;
        if (arg0 != 29) {
            field9422 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lrf;ILpl;Lpl;)V", line = 171)
    public class668(class112 arg0, int arg1, class612 arg2, class612 arg3) {
        this.field9414 = arg3;
        this.field9412 = arg2;
        this.field9412.method3349(34, true);
    }
}
