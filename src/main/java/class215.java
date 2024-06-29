import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class215 {

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "Lkh;")
    private class13 field3498 = new class13(64);

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "Lkh;")
    public class13 field3504 = new class13(30);

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "Lul;")
    private class406 field3494;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "Lul;")
    public class406 field3490;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field3489 = 2;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public static int field3493 = 0;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public int field3505;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V", line = 3)
    public final void method1484(byte arg0) {
        class13 var2 = this.field3498;
        synchronized (this.field3498) {
            if (arg0 <= 106) {
                method1488(-40, 70, -41);
            }
            this.field3498.method88(122);
        }
        field3496++;
        class13 var3 = this.field3504;
        synchronized (this.field3504) {
            this.field3504.method88(92);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method1485(int arg0, byte arg1) {
        field3501++;
        if (arg1 <= 53) {
            method1489(-114, -70, -30);
        }
        class211 var2 = class452.method2749(3, 126, arg0);
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V", line = 41)
    public final void method1486(int arg0, int arg1) {
        field3491++;
        class13 var3 = this.field3498;
        synchronized (this.field3498) {
            if (arg1 != 5521) {
                this.field3494 = null;
            }
            this.field3498.method91(40, arg0);
        }
        class13 var4 = this.field3504;
        synchronized (this.field3504) {
            this.field3504.method91(58, arg0);
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)V", line = 59)
    public final void method1487(byte arg0) {
        field3500++;
        class13 var2 = this.field3498;
        synchronized (this.field3498) {
            if (arg0 != 32) {
                this.method1493(-94, 45);
            }
            this.field3498.method93((byte) 117);
        }
        class13 var3 = this.field3504;
        synchronized (this.field3504) {
            this.field3504.method93((byte) 113);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)Z", line = 82)
    public static final boolean method1488(int arg0, int arg1, int arg2) {
        field3499++;
        if (arg2 == 0) {
            return (arg1 & 0x84080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(III)Z", line = 94)
    public static final boolean method1489(int arg0, int arg1, int arg2) {
        field3492++;
        if (arg1 != -1) {
            method1488(37, 18, -56);
        }
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)Lci;", line = 111)
    public final class316 method1490(int arg0, boolean arg1) {
        field3502++;
        class13 var3 = this.field3498;
        class316 var4;
        synchronized (this.field3498) {
            var4 = (class316) this.field3498.method87((long) arg0, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field3494;
        byte[] var6;
        synchronized (this.field3494) {
            var6 = this.field3494.method2536(class49.method489((byte) 117, arg0), 0, class108.method832(99, arg0));
            if (!arg1) {
                method1488(-125, 119, 60);
            }
        }
        class316 var7 = new class316();
        var7.field4762 = this;
        var7.field4768 = arg0;
        if (var6 != null) {
            var7.method2024(new class217(var6), 25568);
        }
        class13 var8 = this.field3498;
        synchronized (this.field3498) {
            this.field3498.method84((long) arg0, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 143)
    public static final void method1491(int arg0) {
        field3497++;
        int var1 = 27 % ((-arg0 - 31) / 46);
        class13 var2 = class425.field6331;
        synchronized (class425.field6331) {
            class425.field6331.method93((byte) 125);
        }
        class13 var3 = class315.field4745;
        synchronized (class315.field4745) {
            class315.field4745.method93((byte) 83);
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lee;ILul;Lul;)V", line = 219)
    public class215(class480 arg0, int arg1, class406 arg2, class406 arg3) {
        this.field3494 = arg2;
        this.field3490 = arg3;
        int var5 = this.field3494.method2561(-99) - 1;
        this.field3494.method2551(var5, -26070);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 162)
    public static final Class method1492(int arg0, String arg1) throws ClassNotFoundException {
        field3488++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg0 != 0) {
            return null;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)V", line = 200)
    public final void method1493(int arg0, int arg1) {
        this.field3505 = arg1;
        if (arg0 != 2) {
            this.field3490 = null;
        }
        field3503++;
        class13 var3 = this.field3504;
        synchronized (this.field3504) {
            this.field3504.method93((byte) 75);
        }
    }
}
