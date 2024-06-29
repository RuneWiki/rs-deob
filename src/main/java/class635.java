import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class635 {

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Ljava/lang/String;")
    private String field8823 = "null";

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "[Lwq;")
    public static class169[] field8830 = new class169[2048];

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field8835 = 0;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "Lvea;")
    public static class276 field8833 = new class276(4, 1, 1, 1);

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "C")
    public char field8825;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "C")
    public char field8838;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    private int field8831;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Lwr;")
    public class459 field8821;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "Lwr;")
    private class459 field8832;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "[Lufa;")
    public static class680[] field8820;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lji;I)V", line = 4)
    public final void method3572(class611 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3428((byte) 115);
            if (var3 == 0) {
                field8828++;
                if (arg1 != 4) {
                    field8826 = 4;
                    return;
                }
                return;
            }
            this.method3579(arg1 - 4, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 28)
    public final String method3573(int arg0, byte arg1) {
        field8824++;
        if (this.field8821 == null) {
            return this.field8823;
        }
        class273 var3 = (class273) this.field8821.method2552((long) arg0, -1);
        if (var3 == null) {
            return this.field8823;
        } else {
            if (arg1 < 20) {
                method3576(126);
            }
            return var3.field3594;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)[Lvg;", line = 52)
    public static final class54[] method3574(byte arg0) {
        if (arg0 < 57) {
            field8830 = null;
        }
        field8827++;
        return new class54[] { class85.field1174, class391.field5546, class549.field7775 };
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(IB)Z", line = 72)
    public final boolean method3575(int arg0, byte arg1) {
        field8834++;
        if (this.field8821 == null) {
            return false;
        }
        if (this.field8832 == null) {
            this.method3578((byte) -59);
        }
        int var3 = 93 % ((arg1 + 21) / 49);
        class629 var4 = (class629) this.field8832.method2552((long) arg0, -1);
        return var4 != null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 93)
    public static void method3576(int arg0) {
        if (arg0 > 84) {
            field8830 = null;
            field8820 = null;
            field8833 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I", line = 107)
    public final int method3577(int arg0, int arg1) {
        field8829++;
        if (this.field8821 == null) {
            return this.field8831;
        }
        class629 var3 = (class629) this.field8821.method2552((long) arg0, -1);
        if (arg1 == -28629) {
            return var3 == null ? this.field8831 : var3.field8775;
        } else {
            return -113;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V", line = 126)
    private final void method3578(byte arg0) {
        field8836++;
        this.field8832 = new class459(this.field8821.method2559((byte) 106));
        class629 var2 = (class629) this.field8821.method2560(102);
        if (arg0 >= -19) {
            return;
        }
        while (var2 != null) {
            class629 var3 = new class629((int) var2.field556);
            this.field8832.method2558(var3, (long) var2.field8775, -1);
            var2 = (class629) this.field8821.method2557(-1);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILji;I)V", line = 151)
    private final void method3579(int arg0, class611 arg1, int arg2) {
        if (arg2 == 1) {
            this.field8825 = class14.method54(arg1.method3390((byte) -19), (byte) 121);
        } else if (arg2 == 2) {
            this.field8838 = class14.method54(arg1.method3390((byte) -19), (byte) 125);
        } else if (arg2 == 3) {
            this.field8823 = arg1.method3403((byte) 84);
        } else if (arg2 == 4) {
            this.field8831 = arg1.method3418(-2);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method3402((byte) 127);
            this.field8821 = new class459(class128.method814(423660257, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method3418(-2);
                class55 var7;
                if (arg2 == 5) {
                    var7 = new class273(arg1.method3403((byte) 84));
                } else {
                    var7 = new class629(arg1.method3418(-2));
                }
                this.field8821.method2558(var7, (long) var6, ~arg0);
            }
        }
        field8837++;
        if (arg0 != 0) {
            field8830 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V", line = 209)
    private final void method3580(int arg0) {
        field8822++;
        this.field8832 = new class459(this.field8821.method2559((byte) 53));
        for (class273 var2 = (class273) this.field8821.method2560(arg0 + 111); var2 != null; var2 = (class273) this.field8821.method2557(arg0 + 3)) {
            class106 var3 = new class106(var2.field3594, (int) var2.field556);
            this.field8832.method2558(var3, class566.method3184((byte) -121, var2.field3594), -1);
        }
        if (arg0 != -4) {
            method3576(-68);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 234)
    public final boolean method3581(String arg0, int arg1) {
        field8839++;
        if (this.field8821 == null) {
            return false;
        }
        if (this.field8832 == null) {
            this.method3580(-4);
        }
        class106 var3 = (class106) this.field8832.method2552(class566.method3184((byte) -124, arg0), -1);
        if (arg1 != -16972) {
            return false;
        }
        while (var3 != null) {
            if (var3.field1413.equals(arg0)) {
                return true;
            }
            var3 = (class106) this.field8832.method2555(126);
        }
        return false;
    }
}
