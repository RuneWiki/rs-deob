import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class28 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Ltb;")
    private class450 field409 = new class450(128);

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lpl;")
    private class612 field406;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public final void method186(int arg0) {
        class450 var2 = this.field409;
        synchronized (this.field409) {
            if (arg0 != 28804) {
                this.field406 = null;
            }
            this.field409.method2412((byte) 2);
        }
        field407++;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static final void method187(int arg0) {
        class318.field4070.method2406(18385);
        field408++;
        if (arg0 != -13609) {
            method191(-86);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
    public final void method188(boolean arg0, int arg1) {
        field404++;
        class450 var3 = this.field409;
        synchronized (this.field409) {
            this.field409.method2411(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static final void method189(int arg0) {
        field405++;
        if (arg0 != -2488) {
            method191(-88);
        }
        if (class198.field2501 < 0) {
            class330.field4217 = -1;
            class91.field1281 = -1;
            class198.field2501 = 0;
        }
        if (class656.field9259 < class198.field2501) {
            class198.field2501 = class656.field9259;
            class91.field1281 = -1;
            class330.field4217 = -1;
        }
        if (class635.field8898 < 0) {
            class635.field8898 = 0;
            class91.field1281 = -1;
            class330.field4217 = -1;
        }
        if (class635.field8898 > class656.field9273) {
            class635.field8898 = class656.field9273;
            class330.field4217 = -1;
            class91.field1281 = -1;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public final void method190(int arg0) {
        class450 var2 = this.field409;
        synchronized (this.field409) {
            this.field409.method2406(18385);
        }
        field411++;
        if (arg0 != 0) {
            method191(23);
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public static final void method191(int arg0) {
        field410++;
        if (class487.field6450 == null) {
            class487.field6450 = class203.method1223((byte) -47);
            class347.field4449 = class487.field6450[0];
            class472.field5996 = class571.method3150(arg0 ^ 0xFFFFFF96);
        }
        if (class407.field5098 == null) {
            class433.method2282(-128);
        }
        class203 var1 = class347.field4449;
        int var2 = class700.method3930(-14);
        if (class347.field4449 == var1) {
            class367.field4663 = class347.field4449.field2564.method476((byte) 96, class250.field3068);
            if (class347.field4449.field2560) {
                class25.field379 = (class347.field4449.field2566 - class347.field4449.field2568) * var2 / 100 + class347.field4449.field2568;
            }
            if (class347.field4449.field2563) {
                class367.field4663 = class367.field4663 + class25.field379 + "%";
            }
        } else if (class347.field4449 == class203.field2589) {
            class407.field5098 = null;
            class361.method1987(3, -114);
        } else {
            class367.field4663 = var1.field2558.method476((byte) -50, class250.field3068);
            if (class347.field4449.field2563) {
                class367.field4663 = class367.field4663 + var1.field2566 + "%";
            }
            class25.field379 = var1.field2566;
            if (class347.field4449.field2560 || var1.field2560) {
                class472.field5996 = class571.method3150(92);
            }
        }
        if (arg0 != -1 || class407.field5098 == null) {
            return;
        }
        class407.field5098.method669(class347.field4449, (byte) -124, class472.field5996, class25.field379, class367.field4663);
        if (class57.field812 == null) {
            return;
        }
        for (int var3 = class312.field4005 + 1; var3 < class57.field812.length; var3++) {
            if (class57.field812[var3].method778((byte) 77) >= 100 && (var3 - 1) == class312.field4005 && class504.field6675 >= 1 && class407.field5098.method671(true)) {
                try {
                    class57.field812[var3].method776(100);
                } catch (Exception var4) {
                    class57.field812 = null;
                    return;
                }
                class407.field5098.method666((byte) -126, class57.field812[var3]);
                class312.field4005++;
                if (class57.field812.length - 1 <= class312.field4005 && class57.field812.length > 1) {
                    class312.field4005 = class676.field9498.method2791((byte) -86) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(ZI)Lgda;")
    public final class48 method192(boolean arg0, int arg1) {
        field412++;
        if (arg0) {
            this.method188(true, 59);
        }
        class450 var3 = this.field409;
        class48 var4;
        synchronized (this.field409) {
            var4 = (class48) this.field409.method2418((long) arg1, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field406;
        byte[] var6;
        synchronized (this.field406) {
            var6 = this.field406.method3365(arg1, 42, 1);
        }
        class48 var7 = new class48();
        if (var6 != null) {
            var7.method307(new class630(var6), 54);
        }
        class450 var8 = this.field409;
        synchronized (this.field409) {
            this.field409.method2409((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lrf;ILpl;)V")
    public class28(class112 arg0, int arg1, class612 arg2) {
        this.field406 = arg2;
        this.field406.method3349(1, true);
    }
}
