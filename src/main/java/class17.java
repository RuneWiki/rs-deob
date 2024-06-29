import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class17 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Loe;")
    private class65 field331 = new class65();

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Luj;")
    private class132 field336;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field338 = 0;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field346 = 0;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field344 = -2;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
    public static int[] field348 = new int[100];

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field347 = "cyan:";

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lmd;")
    public static class273 field339;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method93(int arg0) {
        field348 = null;
        if (arg0 <= -8) {
            field347 = null;
            field339 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public final void method94(int arg0) {
        for (class274 var2 = (class274) this.field331.method452(1576); var2 != null; var2 = (class274) this.field331.method448(arg0 + 631244896)) {
            if (var2.method136((byte) 104)) {
                var2.method993(32);
                var2.method1174(-25741);
                this.field343++;
            }
        }
        if (arg0 != 34) {
            field338 = -55;
        }
        field333++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZJ)V")
    public final void method95(boolean arg0, long arg1) {
        field340++;
        class274 var4 = (class274) this.field336.method987(-99, arg1);
        if (var4 != null) {
            var4.method993(32);
            var4.method1174(-25741);
            this.field343++;
        }
        if (arg0) {
            field337 = -11;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLaj;)V")
    public static final void method96(byte arg0, class151 arg1) {
        field349++;
        if (arg0 < 37) {
            field344 = -33;
        }
        class113.field1930 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    public final void method97(int arg0) {
        field350++;
        this.field331.method455(-22178);
        this.field336.method990((byte) 44);
        this.field343 = this.field345;
        if (arg0 < 65) {
            this.field331 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public final void method98(int arg0, int arg1) {
        if (class36.field567 != null) {
            for (class274 var3 = (class274) this.field331.method452(1576); var3 != null; var3 = (class274) this.field331.method448(631244930)) {
                if (var3.method136((byte) 89)) {
                    if (var3.method138((byte) -123) == null) {
                        var3.method993(arg0 + 31);
                        var3.method1174(-25741);
                        this.field343++;
                    }
                } else if ((long) arg1 < ++var3.field2570) {
                    class274 var4 = class36.field567.method1699(var3, (byte) -81);
                    this.field336.method986(var3.field2213, true, var4);
                    class51.method326((byte) 53, var3, var4);
                    var3.method993(arg0 ^ 0x21);
                    var3.method1174(-25741);
                }
            }
        }
        field335++;
        if (arg0 != 1) {
            method93(-41);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
    public final Object method99(long arg0, boolean arg1) {
        field334++;
        class274 var4 = (class274) this.field336.method987(-96, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method138((byte) -36);
        if (var5 == null) {
            var4.method993(32);
            var4.method1174(-25741);
            this.field343++;
            return null;
        }
        if (var4.method136((byte) 111)) {
            class21 var6 = new class21(var5);
            this.field336.method986(var4.field2213, true, var6);
            this.field331.method449((byte) -64, var6);
            var6.field2570 = 0L;
            var4.method993(32);
            var4.method1174(-25741);
        } else {
            this.field331.method449((byte) -64, var4);
            var4.field2570 = 0L;
        }
        if (!arg1) {
            method96((byte) -93, (class151) null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
    public class17(int arg0) {
        this.field345 = arg0;
        this.field343 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field336 = new class132(var2);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method100(long arg0, Object arg1, int arg2) {
        field341++;
        this.method95(false, arg0);
        if (this.field343 == 0) {
            class274 var5 = (class274) this.field331.method451(-43);
            var5.method993(32);
            var5.method1174(-25741);
        } else {
            this.field343--;
        }
        if (arg2 < 43) {
            field348 = null;
        }
        class21 var6 = new class21(arg1);
        this.field336.method986(arg0, true, var6);
        this.field331.method449((byte) -64, var6);
        var6.field2570 = 0L;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)Lib;")
    public static final class81 method101(int arg0, int arg1) {
        field332++;
        class81 var2 = (class81) class238.field4007.method99((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class259.field4358.method1149(arg1, (byte) 97, arg0);
        class81 var4 = new class81();
        if (var3 != null) {
            var4.method561(new class249(var3), true, arg0);
        }
        class238.field4007.method100((long) arg0, var4, 106);
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
    public final int method102(int arg0) {
        field342++;
        int var2 = arg0;
        for (class274 var3 = (class274) this.field331.method452(1576); var3 != null; var3 = (class274) this.field331.method448(631244930)) {
            if (!var3.method136((byte) 110)) {
                var2++;
            }
        }
        return var2;
    }
}
