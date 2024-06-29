import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class174 {

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "Ler;")
    private class157 field2494 = new class157(64);

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "Ler;")
    public class157 field2505 = new class157(50);

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "Ler;")
    public class157 field2506 = new class157(5);

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Lns;")
    public class438 field2495;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "Z")
    public boolean field2500;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "Lns;")
    private class438 field2502;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "Lqj;")
    public static class388 field2499 = new class388(0, -1);

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Lpg;")
    public static class492 field2503 = new class492(86, 8);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public int field2507;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZB)V")
    public final void method1210(boolean arg0, byte arg1) {
        field2496++;
        if (this.field2500 != arg0) {
            this.field2500 = arg0;
            if (arg1 == -53) {
                this.method1219(true);
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)V")
    public static final void method1211(int arg0, byte arg1) {
        field2497++;
        class80.field1072 = arg0;
        class480.field7013 = 100;
        if (arg1 <= -65) {
            class56.field756 = 3;
            class13.field207 = -1;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public static void method1212(byte arg0) {
        field2499 = null;
        field2503 = null;
        if (arg0 >= -106) {
            field2499 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)V")
    public final void method1213(byte arg0, int arg1) {
        class157 var3 = this.field2494;
        synchronized (this.field2494) {
            this.field2494.method1016(arg1, (byte) 125);
        }
        if (arg0 > -110) {
            field2499 = null;
        }
        field2490++;
        class157 var4 = this.field2505;
        synchronized (this.field2505) {
            this.field2505.method1016(arg1, (byte) 124);
        }
        class157 var5 = this.field2506;
        synchronized (this.field2506) {
            this.field2506.method1016(arg1, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)Ljo;")
    public static final class255 method1214(int arg0, int arg1, int arg2) {
        class420 var3 = class380.field5802[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6277;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public final void method1215(int arg0) {
        field2501++;
        class157 var2 = this.field2505;
        synchronized (this.field2505) {
            this.field2505.method1015((byte) 89);
        }
        if (arg0 == 100) {
            class157 var3 = this.field2506;
            synchronized (this.field2506) {
                this.field2506.method1015((byte) 82);
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)Lul;")
    public final class329 method1216(int arg0, boolean arg1) {
        field2498++;
        class157 var3 = this.field2494;
        class329 var4;
        synchronized (this.field2494) {
            var4 = (class329) this.field2494.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2502.method2650(class217.method1471(127, arg0), -96, class303.method1942(arg0, -114));
        class329 var6 = new class329();
        var6.field5045 = this;
        var6.field5097 = arg0;
        if (var5 != null) {
            var6.method2121(new class91(var5), -150);
        }
        var6.method2122(!arg1);
        class157 var7 = this.field2494;
        synchronized (this.field2494) {
            this.field2494.method1012(-110, (long) arg0, var6);
        }
        return arg1 ? null : var6;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lqa;B)V")
    public static final void method1217(class496 arg0, byte arg1) {
        field2491++;
        if (class99.field1423 == class339.field5365.field2210 || class380.field5802 == null) {
            return;
        }
        if (arg1 != -49) {
            method1211(27, (byte) 109);
        }
        if (class346.method2208(arg1 ^ 0xDD, class339.field5365.field2210, arg0)) {
            class99.field1423 = class339.field5365.field2210;
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
    public final void method1218(int arg0) {
        field2492++;
        class157 var2 = this.field2494;
        synchronized (this.field2494) {
            this.field2494.method1022((byte) -34);
        }
        class157 var3 = this.field2505;
        synchronized (this.field2505) {
            this.field2505.method1022((byte) -34);
            int var4 = 60 % ((5 - arg0) / 36);
        }
        class157 var5 = this.field2506;
        synchronized (this.field2506) {
            this.field2506.method1022((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
    public final void method1219(boolean arg0) {
        class157 var2 = this.field2494;
        synchronized (this.field2494) {
            this.field2494.method1015((byte) 126);
        }
        field2504++;
        class157 var3 = this.field2505;
        synchronized (this.field2505) {
            this.field2505.method1015((byte) 117);
        }
        class157 var4 = this.field2506;
        synchronized (this.field2506) {
            this.field2506.method1015((byte) 106);
        }
        if (!arg0) {
            this.field2507 = 95;
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(IB)V")
    public final void method1220(int arg0, byte arg1) {
        field2493++;
        this.field2507 = arg0;
        class157 var3 = this.field2505;
        synchronized (this.field2505) {
            if (arg1 != 12) {
                this.method1220(121, (byte) 124);
            }
            this.field2505.method1015((byte) 123);
        }
        class157 var4 = this.field2506;
        synchronized (this.field2506) {
            this.field2506.method1015((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lgo;IZLns;Lns;)V")
    public class174(class331 arg0, int arg1, boolean arg2, class438 arg3, class438 arg4) {
        this.field2495 = arg4;
        this.field2500 = arg2;
        this.field2502 = arg3;
        if (this.field2502 != null) {
            int var6 = this.field2502.method2649(108) - 1;
            this.field2502.method2645(1, var6);
        }
    }
}
