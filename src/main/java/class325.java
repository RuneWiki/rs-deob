import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class325 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Laj;")
    private class287 field4761 = new class287(64);

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Laj;")
    private class287 field4767 = new class287(100);

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lom;")
    private class344 field4765;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lld;")
    public static class154 field4763 = new class154(0, 0);

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field4769 = 999999;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "[I")
    public static int[] field4768 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lom;")
    public static class344 field4766;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public final void method2098(byte arg0) {
        field4762++;
        class287 var2 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method1912(-2552);
        }
        if (arg0 <= -18) {
            class287 var3 = this.field4767;
            synchronized (this.field4767) {
                this.field4767.method1912(-2552);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)Las;")
    public final class138 method2099(int arg0, boolean arg1) {
        field4760++;
        class287 var3 = this.field4761;
        class138 var4;
        synchronized (this.field4761) {
            var4 = (class138) this.field4761.method1900((long) arg0, 110);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field4765;
        byte[] var6;
        synchronized (this.field4765) {
            var6 = this.field4765.method2216(class533.method3092((byte) -45, arg0), class480.method2913(127, arg0), arg1);
        }
        class138 var7 = new class138();
        var7.field2448 = this;
        var7.field2443 = arg0;
        if (var6 != null) {
            var7.method1129(new class61(var6), -120);
        }
        var7.method1134(arg1);
        class287 var8 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public final void method2100(int arg0) {
        class287 var2 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method1913(true);
            if (arg0 >= -11) {
                field4769 = 8;
            }
        }
        field4759++;
        class287 var3 = this.field4767;
        synchronized (this.field4767) {
            this.field4767.method1913(true);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method2101(int arg0) {
        field4768 = null;
        field4766 = null;
        if (arg0 < 80) {
            field4769 = -20;
        }
        field4763 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
    public final void method2102(int arg0, byte arg1) {
        field4764++;
        class287 var3 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method1908(arg0, (byte) -11);
            if (arg1 != -17) {
                field4768 = null;
            }
        }
        class287 var4 = this.field4767;
        synchronized (this.field4767) {
            this.field4767.method1908(arg0, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)Lrc;")
    public final class501 method2103(int arg0, byte arg1) {
        field4758++;
        if (arg1 != 41) {
            method2101(-15);
        }
        class287 var3 = this.field4767;
        synchronized (this.field4767) {
            class501 var4 = (class501) this.field4767.method1900((long) arg0, arg1 - 160);
            if (var4 == null) {
                var4 = new class501(arg0);
                this.field4767.method1904(var4, (long) arg0, -1);
            }
            return var4.method2986(-4782) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lmea;ILom;Lom;Lom;)V")
    public class325(class398 arg0, int arg1, class344 arg2, class344 arg3, class344 arg4) {
        this.field4765 = arg2;
        if (this.field4765 != null) {
            int var6 = this.field4765.method2245(0) - 1;
            this.field4765.method2236(var6, 0);
        }
        class156.method1207(2, arg3, arg4, 127);
    }
}
