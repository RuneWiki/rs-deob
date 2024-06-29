import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class300 {

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lmo;")
    private class336 field4251 = new class336(128);

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Lnl;")
    private class435 field4253;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "Z")
    public static boolean field4246 = true;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "[Lpf;")
    public static class18[] field4249 = new class18[4];

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[S")
    public static short[] field4247 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field4252 = 0;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[Lrn;")
    public static class417[] field4244;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public final void method1930(byte arg0) {
        field4245++;
        class336 var2 = this.field4251;
        synchronized (this.field4251) {
            this.field4251.method2109(arg0 + 120);
        }
        if (arg0 != -121) {
            this.method1934(-65, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
    public final void method1931(byte arg0) {
        class336 var2 = this.field4251;
        synchronized (this.field4251) {
            this.field4251.method2119(0);
        }
        field4248++;
        if (arg0 < 36) {
            method1935(-17, -110);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method1932(int arg0) {
        field4249 = null;
        if (arg0 == 960) {
            field4244 = null;
            field4247 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
    public final void method1933(int arg0, int arg1) {
        field4243++;
        class336 var3 = this.field4251;
        synchronized (this.field4251) {
            this.field4251.method2120((byte) 56, arg1);
        }
        if (arg0 != 22464) {
            method1932(70);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)Lei;")
    public final class354 method1934(int arg0, byte arg1) {
        if (arg1 < 54) {
            field4247 = null;
        }
        field4254++;
        class336 var3 = this.field4251;
        class354 var4;
        synchronized (this.field4251) {
            var4 = (class354) this.field4251.method2113(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4253.method2633(1, arg0, 112);
        class354 var6 = new class354();
        if (var5 != null) {
            var6.method2180(new class161(var5), true);
        }
        class336 var7 = this.field4251;
        synchronized (this.field4251) {
            this.field4251.method2116((long) arg0, (byte) -54, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Llo;ILnl;)V")
    public class300(class280 arg0, int arg1, class435 arg2) {
        this.field4253 = arg2;
        this.field4253.method2638(1, 1);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V")
    public static final void method1935(int arg0, int arg1) {
        field4255++;
        class54.field805 = arg0;
        class408.field5588.method2109(-1);
        if (arg1 != -19490) {
            method1935(-31, -36);
        }
    }

    static {
        new class151("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
    }
}
