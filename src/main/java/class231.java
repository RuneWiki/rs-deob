import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class231 extends class209 {

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "Ljava/lang/String;")
    private String field3662 = "null";

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "[I")
    public static int[] field3660 = new int[14];

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    public static int field3667 = -2;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "Lnf;")
    public static class162 field3665 = new class162(64);

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "C")
    public char field3654;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "C")
    public char field3661;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    private int field3658;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "Lpf;")
    private class305 field3663;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "Lpf;")
    public class305 field3666;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "[I")
    public static int[] field3650;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lha;I)V")
    public final void method1585(class31 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method265(-107);
            if (var3 == 0) {
                field3656++;
                if (arg1 != 5370) {
                    this.method1589(-15, (class31) null, -70);
                    return;
                }
                return;
            }
            this.method1589(-123, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1586(String arg0, byte arg1) {
        field3652++;
        if (this.field3666 == null) {
            return false;
        }
        if (this.field3663 == null) {
            this.method1593((byte) 110);
        }
        for (class77 var3 = (class77) this.field3663.method2043(class301.method2016((byte) 120, arg0), arg1 ^ 0x6); var3 != null; var3 = (class77) this.field3663.method2045(3408)) {
            if (var3.field1180.equals(arg0)) {
                return true;
            }
        }
        if (arg1 != -7) {
            this.method1594((byte) -45);
        }
        return false;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Z")
    public final boolean method1587(byte arg0, int arg1) {
        field3664++;
        if (this.field3666 == null) {
            return false;
        }
        if (this.field3663 == null) {
            this.method1594((byte) -24);
        }
        class283 var3 = (class283) this.field3663.method2043((long) arg1, -1);
        if (var3 == null) {
            return false;
        } else {
            int var4 = -90 / (-arg0 / 58);
            return true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1588(int arg0, int arg1) {
        field3653++;
        if (this.field3666 == null) {
            return this.field3662;
        }
        class63 var3 = (class63) this.field3666.method2043((long) arg0, -1);
        if (arg1 != -16375) {
            this.field3658 = -125;
        }
        return var3 == null ? this.field3662 : var3.field993;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILha;I)V")
    private final void method1589(int arg0, class31 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3661 = class31.method292(-25717, arg1.method266(-129));
        } else if (arg2 == 2) {
            this.field3654 = class31.method292(-25717, arg1.method266(-129));
        } else if (arg2 == 3) {
            this.field3662 = arg1.method262(11386);
        } else if (arg2 == 4) {
            this.field3658 = arg1.method300((byte) -30);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method260((byte) -67);
            this.field3666 = new class305(class126.method945(var4, true));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method300((byte) -30);
                class134 var7;
                if (arg2 == 5) {
                    var7 = new class63(arg1.method262(11386));
                } else {
                    var7 = new class283(arg1.method300((byte) -30));
                }
                this.field3666.method2046(var7, -71, (long) var6);
            }
        }
        field3657++;
        int var8 = -25 % ((arg0 - 1) / 56);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lha;II)Lp;")
    public static final class303 method1590(class31 arg0, int arg1, int arg2) {
        field3659++;
        class303 var3 = new class303(arg1, arg0.method262(11386), arg0.method262(11386), arg0.method300((byte) -30), arg0.method300((byte) -30), arg0.method265(-116) == 1, arg0.method265(-114));
        int var4 = arg0.method265(-98);
        if (arg2 > -1) {
            return null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4866.method12(new class15(arg0.method265(-110), arg0.method265(-94), arg0.method260((byte) -67), arg0.method260((byte) -67), arg0.method260((byte) -67), arg0.method260((byte) -67), arg0.method260((byte) -67), arg0.method260((byte) -67), arg0.method260((byte) -67), arg0.method260((byte) -67)), 12);
        }
        var3.method2035(101);
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)I")
    public final int method1591(int arg0, int arg1) {
        field3651++;
        if (this.field3666 == null) {
            return this.field3658;
        }
        class283 var3 = (class283) this.field3666.method2043((long) arg0, arg1 ^ 0x4);
        if (var3 == null) {
            return this.field3658;
        } else {
            if (arg1 != -5) {
                this.field3666 = null;
            }
            return var3.field4457;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
    public static void method1592(int arg0) {
        field3665 = null;
        int var1 = 73 % ((-arg0 - 4) / 50);
        field3660 = null;
        field3650 = null;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V")
    private final void method1593(byte arg0) {
        this.field3663 = new class305(this.field3666.method2048(-1));
        field3655++;
        class63 var2 = (class63) this.field3666.method2049(0);
        if (arg0 != 110) {
            this.method1591(20, -65);
        }
        while (var2 != null) {
            class77 var3 = new class77(var2.field993, (int) var2.field2009);
            this.field3663.method2046(var3, -45, class301.method2016((byte) 79, var2.field993));
            var2 = (class63) this.field3666.method2047(-108);
        }
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(B)V")
    private final void method1594(byte arg0) {
        field3668++;
        this.field3663 = new class305(this.field3666.method2048(-1));
        for (class283 var2 = (class283) this.field3666.method2049(arg0 ^ 0xFFFFFFE8); var2 != null; var2 = (class283) this.field3666.method2047(73)) {
            class283 var3 = new class283((int) var2.field2009);
            this.field3663.method2046(var3, -127, (long) var2.field4457);
        }
        if (arg0 != -24) {
            this.method1585((class31) null, 5);
        }
    }
}
