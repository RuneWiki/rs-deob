import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class422 {

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Luf;")
    private class380 field5534 = new class380(16);

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Lga;")
    private class332 field5537;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "J")
    public static long field5536 = 0L;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field5538 = -1;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field5539 = 0;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field5535 = 0;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field5543 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 12)
    public final void method2377(byte arg0) {
        if (arg0 > -47) {
            field5536 = 13L;
        }
        field5531++;
        class380 var2 = this.field5534;
        synchronized (this.field5534) {
            this.field5534.method2172(-15112);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 30)
    public final void method2378(int arg0) {
        if (arg0 != -1176) {
            this.method2381(20, (byte) -113);
        }
        class380 var2 = this.field5534;
        synchronized (this.field5534) {
            this.field5534.method2168((byte) -113);
        }
        field5542++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILpu;IIII)Lnda;", line = 47)
    public final class586 method2379(int arg0, class234 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5532++;
        class238[] var7 = null;
        if (arg4 != 0) {
            this.method2381(108, (byte) -115);
        }
        class230 var8 = this.method2381(arg3, (byte) 123);
        if (var8.field2978 != null) {
            var7 = new class238[var8.field2978.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class568 var10 = arg1.method1454(var8.field2978[var9], (byte) 71);
                var7[var9] = new class238(var10.field7730, var10.field7736, var10.field7741, var10.field7737, var10.field7734, var10.field7740, var10.field7731, var10.field7742);
            }
        }
        return new class586(var8.field2976, var7, var8.field2975, arg0, arg2, arg5);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V", line = 78)
    public final void method2380(byte arg0, int arg1) {
        field5533++;
        class380 var3 = this.field5534;
        synchronized (this.field5534) {
            this.field5534.method2179(false, arg1);
        }
        if (arg0 <= 70) {
            field5536 = -126L;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 166)
    public class422(class650 arg0, int arg1, class332 arg2) {
        this.field5537 = arg2;
        this.field5537.method1939(0, 29);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)Lor;", line = 101)
    private final class230 method2381(int arg0, byte arg1) {
        field5541++;
        class380 var3 = this.field5534;
        class230 var4;
        synchronized (this.field5534) {
            var4 = (class230) this.field5534.method2176(-127, (long) arg0);
        }
        if (arg1 < 111) {
            this.method2381(84, (byte) 15);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field5537;
        byte[] var6;
        synchronized (this.field5537) {
            var6 = this.field5537.method1938(arg0, 29, -17);
        }
        class230 var7 = new class230();
        if (var6 != null) {
            var7.method1425(-1, new class157(var6));
        }
        class380 var8 = this.field5534;
        synchronized (this.field5534) {
            this.field5534.method2174(var7, (long) arg0, (byte) -3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLkt;)Z", line = 139)
    public static final boolean method2382(boolean arg0, class83 arg1) {
        field5540++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field965) {
            return false;
        } else if (arg1.method445(true, class672.field9549)) {
            if (arg0) {
                method2382(true, null);
            }
            if (class662.field9434.method3057(1, (long) arg1.field980) == null) {
                return class218.field2863.method3057(1, (long) arg1.field991) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
