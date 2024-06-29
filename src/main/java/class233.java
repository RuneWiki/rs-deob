import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class233 {

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Lmo;")
    private class336 field3400 = new class336(64);

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "Lnl;")
    private class435 field3404;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "Lap;")
    public static class310 field3394 = new class310(40, -1);

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "Lrc;")
    public static class108 field3401 = new class108(52, 12);

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "Lap;")
    public static class310 field3403 = new class310(22, -1);

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "Lap;")
    public static class310 field3405 = new class310(58, 7);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Lnl;")
    public static class435 field3399;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lvh;B)I", line = 7)
    public static final int method1632(class84 arg0, byte arg1) {
        field3396++;
        if (arg1 <= 39) {
            return 21;
        }
        int var2 = arg0.method712(false, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method712(false, 5);
        } else if (var2 == 2) {
            var3 = arg0.method712(false, 8);
        } else {
            var3 = arg0.method712(false, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V", line = 36)
    public static void method1633(boolean arg0) {
        field3399 = null;
        field3403 = null;
        if (!arg0) {
            method1636(-42);
        }
        field3405 = null;
        field3394 = null;
        field3401 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 52)
    public final void method1634(int arg0) {
        class336 var2 = this.field3400;
        synchronized (this.field3400) {
            this.field3400.method2109(arg0 ^ 0xFFFFFFFD);
        }
        if (arg0 == 2) {
            field3398++;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)Llg;", line = 71)
    public final class129 method1635(int arg0, boolean arg1) {
        field3395++;
        class336 var3 = this.field3400;
        class129 var4;
        synchronized (this.field3400) {
            if (arg1) {
                field3403 = null;
            }
            var4 = (class129) this.field3400.method2113(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3404.method2633(11, arg0, -50);
        class129 var6 = new class129();
        if (var5 != null) {
            var6.method967(-4, new class161(var5));
        }
        class336 var7 = this.field3400;
        synchronized (this.field3400) {
            this.field3400.method2116((long) arg0, (byte) -73, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 98)
    public static final void method1636(int arg0) {
        field3392++;
        if (arg0 != 482) {
            field3405 = null;
        }
        class389.field5383.method1101((byte) 126);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 110)
    public final void method1637(byte arg0) {
        if (arg0 != -9) {
            field3394 = null;
        }
        field3397++;
        class336 var2 = this.field3400;
        synchronized (this.field3400) {
            this.field3400.method2119(0);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)V", line = 129)
    public final void method1638(byte arg0, int arg1) {
        field3393++;
        class336 var3 = this.field3400;
        synchronized (this.field3400) {
            this.field3400.method2120((byte) -93, arg1);
            if (arg0 < 26) {
                this.method1634(-42);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 150)
    public class233(class280 arg0, int arg1, class435 arg2) {
        this.field3404 = arg2;
        if (this.field3404 != null) {
            this.field3404.method2638(1, 11);
        }
    }
}
