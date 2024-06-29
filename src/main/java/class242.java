import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class242 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Lmga;")
    private class666 field3379 = new class666(128);

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Lmga;")
    public class666 field3389 = new class666(64);

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Lbi;")
    public class449 field3384;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Lbi;")
    private class449 field3388;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3380 = 1;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[[[I")
    public static int[][][] field3381;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)V")
    public static final void method1485(int arg0, int arg1, byte arg2) {
        field3385++;
        class382 var3 = class396.method2276(arg2 ^ 0xFFFFFFC2, 7, arg1);
        var3.method2232(arg2 ^ 0x10);
        var3.field5099 = arg0;
        if (arg2 != -74) {
            method1488(10);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public final void method1486(int arg0) {
        class666 var2 = this.field3379;
        synchronized (this.field3379) {
            this.field3379.method3739(arg0 ^ arg0);
        }
        field3390++;
        class666 var3 = this.field3389;
        synchronized (this.field3389) {
            this.field3389.method3739(0);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)Lee;")
    public final class634 method1487(int arg0, byte arg1) {
        if (arg1 != 115) {
            return null;
        }
        field3383++;
        class666 var3 = this.field3379;
        class634 var4;
        synchronized (this.field3379) {
            var4 = (class634) this.field3379.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field3388;
        byte[] var6;
        synchronized (this.field3388) {
            var6 = this.field3388.method2537(false, 36, arg0);
        }
        class634 var7 = new class634();
        var7.field8533 = arg0;
        var7.field8527 = this;
        if (var6 != null) {
            var7.method3510(true, new class335(var6));
        }
        var7.method3498(false);
        class666 var8 = this.field3379;
        synchronized (this.field3379) {
            this.field3379.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method1488(int arg0) {
        if (arg0 != 22256) {
            method1485(-39, 97, (byte) 42);
        }
        field3381 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)V")
    public final void method1489(int arg0, boolean arg1) {
        field3382++;
        if (!arg1) {
            field3381 = null;
        }
        class666 var3 = this.field3379;
        synchronized (this.field3379) {
            this.field3379.method3740((byte) 60, arg0);
        }
        class666 var4 = this.field3389;
        synchronized (this.field3389) {
            this.field3389.method3740((byte) 60, arg0);
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public final void method1490(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field3386++;
        class666 var2 = this.field3379;
        synchronized (this.field3379) {
            this.field3379.method3748(6);
        }
        class666 var3 = this.field3389;
        synchronized (this.field3389) {
            this.field3389.method3748(6);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
    public final void method1491(int arg0, int arg1, int arg2) {
        if (arg1 >= 1) {
            this.field3379 = new class666(arg2);
            field3387++;
            this.field3389 = new class666(arg0);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lpca;ILbi;Lbi;)V")
    public class242(class671 arg0, int arg1, class449 arg2, class449 arg3) {
        this.field3384 = arg3;
        this.field3388 = arg2;
        this.field3388.method2527(0, 36);
    }
}
