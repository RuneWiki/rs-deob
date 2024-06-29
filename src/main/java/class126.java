import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class126 extends class93 {

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    private int field2548 = 0;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    private int field2552 = 4096;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Ljd;")
    public static class92 field2544 = class202.method1325((byte) 90, "<col=40ff00>");

    @OriginalMember(owner = "client!na", name = "X", descriptor = "Ljd;")
    public static class92 field2549 = class202.method1325((byte) 90, "::noclip");

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field2545 = 0;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "Ljd;")
    public static class92 field2551 = class202.method1325((byte) 90, "<col=ff3000>");

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "Ljd;")
    private static class92 field2560 = class202.method1325((byte) 90, "Login server offline)3");

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "Ljd;")
    public static class92 field2554 = field2560;

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "Ljd;")
    private static class92 field2561 = class202.method1325((byte) 90, "Free world");

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "Ljd;")
    public static class92 field2557 = class202.method1325((byte) 90, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "Ljd;")
    public static class92 field2553 = field2561;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "Ldb;")
    public static class33 field2547 = new class33(4096);

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field2559;
        if (arg2 == 0) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    this.field2552 = arg1.method442(-21351);
                }
            } else {
                this.field2548 = arg1.method442(-21351);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLnh;ZLnh;)V")
    public static final void method842(byte arg0, class133 arg1, boolean arg2, class133 arg3) {
        class115.field2331 = arg2;
        class59.field1225 = arg3;
        if (arg0 < 110) {
            method845((byte) -39);
        }
        ++field2556;
        class105.field2145 = arg1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljd;BLnh;Ljd;)[Lsc;")
    public static final class173[] method843(class92 arg0, byte arg1, class133 arg2, class92 arg3) {
        int var4 = arg2.method880(arg3, false);
        ++field2550;
        int var5 = arg2.method881(var4, 1, arg0);
        if (arg1 <= 37) {
            method844(-49, (class91) null, 10, 97);
        }
        return class45.method281(var4, 52, var5, arg2);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjc;II)V")
    public static final void method844(int arg0, class91 arg1, int arg2, int arg3) {
        if (arg1.field215 == arg2 && ~arg2 != 0) {
            class22 var4 = class153.method978(arg2, arg3 + -3091);
            int var5 = var4.field522;
            if (var5 == 1) {
                arg1.field254 = arg0;
                arg1.field251 = 0;
                arg1.field260 = 0;
                arg1.field219 = 0;
                class212.method1376(var4, arg1.field260, class15.field423 == arg1, arg1.field208, 7330, arg1.field246);
            }
            if (var5 == 2) {
                arg1.field219 = 0;
            }
        } else if (arg2 == -1 || ~arg1.field215 == 0 || ~class153.method978(arg2, -115).field524 <= ~class153.method978(arg1.field215, -120).field524) {
            arg1.field251 = 0;
            arg1.field250 = arg1.field235;
            arg1.field219 = 0;
            arg1.field260 = 0;
            arg1.field215 = arg2;
            arg1.field254 = arg0;
            if (~arg1.field215 != 0) {
                class212.method1376(class153.method978(arg1.field215, -107), arg1.field260, class15.field423 == arg1, arg1.field208, 7330, arg1.field246);
            }
        }
        ++field2555;
        if (arg3 != 2980) {
            field2560 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(B)V")
    public static void method845(byte arg0) {
        field2554 = null;
        field2544 = null;
        if (arg0 != -73) {
            method844(-83, (class91) null, 74, 115);
        }
        field2560 = null;
        field2549 = null;
        field2547 = null;
        field2553 = null;
        field2557 = null;
        field2551 = null;
        field2561 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class126() {
        super(1, true);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field2546;
        int var3 = -117 / ((67 - arg1) / 42);
        int[] var4 = super.field1887.method916(arg0, -14);
        if (super.field1887.field2757) {
            int[] var5 = this.method648((byte) 70, arg0, 0);
            for (int var6 = 0; ~class150.field2985 < ~var6; ++var6) {
                int var7 = var5[var6];
                var4[var6] = this.field2548 <= var7 && ~this.field2552 <= ~var7 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)Lwh;")
    public static final class214 method846(int arg0, int arg1) {
        ++field2558;
        class214 var2 = (class214) class212.field4091.method930(59, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class59.field1225.method899((byte) 87, class135.method904(arg1, -26322), class209.method1357((byte) 16, arg1));
            class214 var4 = new class214();
            if (arg0 != 0) {
                method845((byte) -87);
            }
            var4.field4192 = arg1;
            if (var3 != null) {
                var4.method1387(17000, new class70(var3));
            }
            var4.method1389(false);
            if (var4.field4174) {
                var4.field4179 = false;
                var4.field4143 = 0;
            }
            class212.field4091.method927(24744, var4, (long) arg1);
            return var4;
        }
    }
}
