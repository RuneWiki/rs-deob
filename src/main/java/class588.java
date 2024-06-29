import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class588 {

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Laj;")
    private class287 field8473 = new class287(128);

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Laj;")
    public class287 field8477 = new class287(64);

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Lom;")
    public class344 field8476;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lom;")
    private class344 field8470;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "[Lkb;")
    public static class643[] field8472 = new class643[100];

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lom;")
    public static class344 field8467;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)Lcd;")
    public final class288 method3355(int arg0, byte arg1) {
        field8475++;
        class287 var3 = this.field8473;
        class288 var4;
        synchronized (this.field8473) {
            var4 = (class288) this.field8473.method1900((long) arg0, 88);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field8470;
        byte[] var6;
        synchronized (this.field8470) {
            var6 = this.field8470.method2216(36, arg0, true);
        }
        class288 var7 = new class288();
        var7.field4294 = arg0;
        var7.field4329 = this;
        int var8 = 47 % ((arg1 + 75) / 46);
        if (var6 != null) {
            var7.method1921(new class61(var6), -1);
        }
        var7.method1920(-1403);
        class287 var9 = this.field8473;
        synchronized (this.field8473) {
            this.field8473.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
    public final void method3356(byte arg0, int arg1, int arg2) {
        field8474++;
        if (arg0 < 109) {
            this.method3355(-12, (byte) 106);
        }
        this.field8473 = new class287(arg2);
        this.field8477 = new class287(arg1);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    public final void method3357(boolean arg0) {
        field8468++;
        if (arg0) {
            return;
        }
        class287 var2 = this.field8473;
        synchronized (this.field8473) {
            this.field8473.method1912(-2552);
        }
        class287 var3 = this.field8477;
        synchronized (this.field8477) {
            this.field8477.method1912(-2552);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method3358(int arg0) {
        field8472 = null;
        int var1 = -21 % ((69 - arg0) / 49);
        field8467 = null;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public final void method3359(int arg0) {
        if (arg0 > -5) {
            return;
        }
        field8469++;
        class287 var2 = this.field8473;
        synchronized (this.field8473) {
            this.field8473.method1913(true);
        }
        class287 var3 = this.field8477;
        synchronized (this.field8477) {
            this.field8477.method1913(true);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(IB)V")
    public final void method3360(int arg0, byte arg1) {
        class287 var3 = this.field8473;
        synchronized (this.field8473) {
            this.field8473.method1908(arg0, (byte) -11);
        }
        if (arg1 != 29) {
            this.method3355(-51, (byte) -62);
        }
        field8471++;
        class287 var4 = this.field8477;
        synchronized (this.field8477) {
            this.field8477.method1908(arg0, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lmea;ILom;Lom;)V")
    public class588(class398 arg0, int arg1, class344 arg2, class344 arg3) {
        this.field8476 = arg3;
        this.field8470 = arg2;
        this.field8470.method2236(36, 0);
    }
}
