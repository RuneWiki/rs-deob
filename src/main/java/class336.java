import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class336 {

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public int field4526 = 128;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public int field4535 = 128;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field4533 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Lbi;", line = 3)
    public final class336 method1920(int arg0) {
        if (arg0 > -97) {
            this.field4523 = -5;
        }
        field4534++;
        return new class336(this.field4523, this.field4526, this.field4535, this.field4527, this.field4528, this.field4531);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)I", line = 18)
    public static final int method1921(int arg0, byte arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        field4525++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        int var4 = 100 / ((arg1 - 45) / 32);
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V", line = 153)
    public class336(int arg0) {
        this.field4523 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIII)V", line = 160)
    private class336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4531 = arg5;
        this.field4528 = arg4;
        this.field4535 = arg2;
        this.field4526 = arg1;
        this.field4523 = arg0;
        this.field4527 = arg3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILbi;)V", line = 42)
    public final void method1922(int arg0, class336 arg1) {
        if (arg0 != 128) {
            this.method1922(68, null);
        }
        this.field4526 = arg1.field4526;
        this.field4527 = arg1.field4527;
        this.field4523 = arg1.field4523;
        this.field4531 = arg1.field4531;
        this.field4535 = arg1.field4535;
        this.field4528 = arg1.field4528;
        field4524++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)V", line = 58)
    public static final void method1923(int arg0, String arg1) {
        field4529++;
        if (class290.field4026 == null) {
            return;
        }
        class491.method2878((byte) 92, class59.field717);
        class451.field6645++;
        int var2 = -40 % ((-arg0 - 40) / 59);
        class481.field7027.method2302(-4, class252.method1507(arg1, true));
        class481.field7027.method2349(arg1, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 77)
    public static final String method1924(int arg0, int arg1, byte arg2) {
        field4530++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (arg2 != -125) {
            return null;
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Leh;", line = 118)
    public static final class242 method1925(int arg0, int arg1) {
        field4532++;
        class242 var2 = (class242) class106.field1592.method3117((long) arg0, 114);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class481.field7022.method727(0, arg0, 15);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class242 var4 = class265.method1589(var3, 3);
        class106.field1592.method3113(var4, (byte) -47, (long) arg0);
        if (arg1 >= -93) {
            field4522 = -48;
        }
        return var4;
    }
}
