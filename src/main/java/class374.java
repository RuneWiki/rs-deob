import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class374 {

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "Ljava/lang/String;")
    private String field4578 = "null";

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "Lrn;")
    public static class633 field4580 = new class633(49, -1);

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "Lrn;")
    public static class633 field4581 = new class633(23, 2);

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "C")
    public char field4567;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "C")
    public char field4571;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    private int field4565;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    private int field4566;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "Lrda;")
    private class467 field4569;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "Lrda;")
    public class467 field4575;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "[Lpl;")
    public static class641[] field4582;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 12)
    public static final String method2139(String arg0, int arg1) {
        field4570++;
        String var2 = class737.method4003(32, class538.method2936(arg1 - 6300, arg0));
        if (arg1 != -3) {
            method2139(null, -73);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)V", line = 33)
    public static final void method2140(int arg0, int arg1, int arg2) {
        class244.field3356++;
        field4572++;
        class13 var3 = class659.method3587(class68.field909, 98, class187.field2614);
        var3.field130.method1502(arg1, 65280);
        var3.field130.method1499((byte) -4, arg2);
        class116.method679(var3, 0);
        if (arg0 < 60) {
            field4580 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILmc;)V", line = 52)
    private final void method2141(int arg0, int arg1, class234 arg2) {
        if (arg0 == 1) {
            this.field4571 = class752.method4080(arg2.method1554(arg1 + 27800), (byte) 109);
        } else if (arg0 == 2) {
            this.field4567 = class752.method4080(arg2.method1554(27806), (byte) 96);
        } else if (arg0 == 3) {
            this.field4578 = arg2.method1540((byte) -111);
        } else if (arg0 == 4) {
            this.field4565 = arg2.method1497((byte) 47);
        } else if (arg0 == 5 || arg0 == 6) {
            this.field4566 = arg2.method1553((byte) -107);
            this.field4575 = new class467(class483.method2714(this.field4566, (byte) -127));
            for (int var4 = 0; var4 < this.field4566; var4++) {
                int var5 = arg2.method1497((byte) 26);
                class337 var6;
                if (arg0 == 5) {
                    var6 = new class55(arg2.method1540((byte) -100));
                } else {
                    var6 = new class405(arg2.method1497((byte) 74));
                }
                this.field4575.method2619(var6, (long) var5, -1);
            }
        }
        if (arg1 != 6) {
            this.method2143(null, (byte) 117);
        }
        field4564++;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V", line = 108)
    private final void method2142(int arg0) {
        field4568++;
        this.field4569 = new class467(this.field4575.method2614((byte) -128));
        if (arg0 != 11136) {
            method2139(null, 70);
        }
        for (class405 var2 = (class405) this.field4575.method2610((byte) -83); var2 != null; var2 = (class405) this.field4575.method2620(0)) {
            class405 var3 = new class405((int) var2.field4108);
            this.field4569.method2619(var3, (long) var2.field5378, -1);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lmc;B)V", line = 130)
    public final void method2143(class234 arg0, byte arg1) {
        field4579++;
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                int var4 = -115 / ((56 - arg1) / 54);
                return;
            }
            this.method2141(var3, 6, arg0);
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V", line = 150)
    public static void method2144(int arg0) {
        field4581 = null;
        field4582 = null;
        if (arg0 >= -90) {
            field4581 = null;
        }
        field4580 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)I", line = 163)
    public final int method2145(int arg0, int arg1) {
        field4574++;
        if (this.field4575 == null) {
            return this.field4565;
        }
        class405 var3 = (class405) this.field4575.method2616((long) arg0, (byte) -110);
        if (arg1 != -1) {
            this.method2142(-128);
        }
        return var3 == null ? this.field4565 : var3.field5378;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 184)
    public final boolean method2146(int arg0, String arg1) {
        field4576++;
        if (arg0 != 49) {
            this.method2148((byte) 122, -97);
        }
        if (this.field4575 == null) {
            return false;
        }
        if (this.field4569 == null) {
            this.method2149(0);
        }
        for (class761 var3 = (class761) this.field4569.method2616(class786.method4308(-606477371, arg1), (byte) 0); var3 != null; var3 = (class761) this.field4569.method2615(8)) {
            if (var3.field10378.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)Z", line = 213)
    public final boolean method2147(int arg0, int arg1) {
        field4573++;
        if (arg0 != -21147) {
            field4582 = null;
        }
        if (this.field4575 == null) {
            return false;
        }
        if (this.field4569 == null) {
            this.method2142(11136);
        }
        class405 var3 = (class405) this.field4569.method2616((long) arg1, (byte) 10);
        return var3 != null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 238)
    public final String method2148(byte arg0, int arg1) {
        field4563++;
        if (arg0 > -82) {
            field4580 = null;
        }
        if (this.field4575 == null) {
            return this.field4578;
        } else {
            class55 var3 = (class55) this.field4575.method2616((long) arg1, (byte) -86);
            return var3 == null ? this.field4578 : var3.field715;
        }
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V", line = 264)
    private final void method2149(int arg0) {
        field4577++;
        this.field4569 = new class467(this.field4575.method2614((byte) -118));
        if (arg0 != 0) {
            field4581 = null;
        }
        for (class55 var2 = (class55) this.field4575.method2610((byte) -82); var2 != null; var2 = (class55) this.field4575.method2620(0)) {
            class761 var3 = new class761(var2.field715, (int) var2.field4108);
            this.field4569.method2619(var3, class786.method4308(-606477371, var2.field715), -1);
        }
    }
}
