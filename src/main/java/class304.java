import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class304 {

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lfc;")
    private class262 field4124 = new class262(64);

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lni;")
    private class522 field4123;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field4125 = 0;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Llga;")
    public static class712 field4119 = new class712(27, 3);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "J")
    public static long field4128;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BII)I", line = 5)
    public static final int method1837(byte arg0, int arg1, int arg2) {
        if (arg0 != 6) {
            field4119 = null;
        }
        field4122++;
        int var3 = arg2 - 1 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V", line = 18)
    public final void method1838(int arg0, byte arg1) {
        field4118++;
        if (arg1 > -76) {
            this.field4123 = null;
        }
        class262 var3 = this.field4124;
        synchronized (this.field4124) {
            this.field4124.method1563(92);
            this.field4124 = new class262(arg0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IB)Lwc;", line = 33)
    public final class68 method1839(int arg0, byte arg1) {
        field4120++;
        if (arg1 < 19) {
            field4119 = null;
        }
        class262 var3 = this.field4124;
        class68 var4;
        synchronized (this.field4124) {
            var4 = (class68) this.field4124.method1571(-125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field4123;
        byte[] var6;
        synchronized (this.field4123) {
            var6 = this.field4123.method2885(class170.method988(arg0, (byte) -79), class591.method3285(arg0, -123), false);
        }
        class68 var7 = new class68();
        if (var6 != null) {
            var7.method513(new class611(var6), -6364);
        }
        class262 var8 = this.field4124;
        synchronized (this.field4124) {
            this.field4124.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V", line = 63)
    public final void method1840(byte arg0, int arg1) {
        if (arg0 < 125) {
            return;
        }
        field4121++;
        class262 var3 = this.field4124;
        synchronized (this.field4124) {
            this.field4124.method1569((byte) 62, arg1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 88)
    public static void method1841(boolean arg0) {
        if (arg0) {
            method1841(false);
        }
        field4119 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 101)
    public final void method1842(int arg0) {
        field4127++;
        class262 var2 = this.field4124;
        synchronized (this.field4124) {
            this.field4124.method1575((byte) -127);
            if (arg0 != 0) {
                field4119 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lrga;ILni;)V", line = 119)
    public class304(class242 arg0, int arg1, class522 arg2) {
        this.field4123 = arg2;
        if (this.field4123 != null) {
            int var4 = this.field4123.method2892((byte) -11) - 1;
            this.field4123.method2901(0, var4);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 143)
    public final void method1843(int arg0) {
        field4126++;
        class262 var2 = this.field4124;
        synchronized (this.field4124) {
            if (arg0 == -4742) {
                this.field4124.method1563(64);
            }
        }
    }
}
