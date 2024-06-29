import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class547 {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Ljava/lang/String;")
    private String field7942 = "null";

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "C")
    public char field7947;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "C")
    public char field7950;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    private int field7946;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lqp;")
    public class715 field7944;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lqp;")
    private class715 field7945;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 7)
    public final boolean method3285(byte arg0, String arg1) {
        field7951++;
        if (arg0 > -63) {
            return true;
        } else if (this.field7944 == null) {
            return false;
        } else {
            if (this.field7945 == null) {
                this.method3286(111);
            }
            for (class292 var3 = (class292) this.field7945.method4020(class196.method1382((byte) 125, arg1), (byte) -70); var3 != null; var3 = (class292) this.field7945.method4018((byte) 99)) {
                if (var3.field4020.equals(arg1)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 36)
    private final void method3286(int arg0) {
        field7939++;
        this.field7945 = new class715(this.field7944.method4015(-1694));
        for (class687 var2 = (class687) this.field7944.method4023((byte) -127); var2 != null; var2 = (class687) this.field7944.method4021((byte) 80)) {
            class292 var4 = new class292(var2.field9754, (int) var2.field6188);
            this.field7945.method4022(var4, -107, class196.method1382((byte) 125, var2.field9754));
        }
        int var3 = -127 / ((arg0 - 53) / 34);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILsl;)V", line = 58)
    private final void method3287(int arg0, int arg1, class479 arg2) {
        field7943++;
        if (arg0 == arg1) {
            this.field7950 = class520.method3162(-19480, arg2.method2915(-114));
        } else if (arg1 == 2) {
            this.field7947 = class520.method3162(-19480, arg2.method2915(-118));
        } else if (arg1 == 3) {
            this.field7942 = arg2.method2894(-13192);
        } else if (arg1 == 4) {
            this.field7946 = arg2.method2868(arg0 ^ 0xFFFFFF94);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method2882(-1);
            this.field7944 = new class715(class68.method609(var4, (byte) -127));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2868(-54);
                class430 var7;
                if (arg1 == 5) {
                    var7 = new class687(arg2.method2894(-13192));
                } else {
                    var7 = new class177(arg2.method2868(-65));
                }
                this.field7944.method4022(var7, arg0 - 100, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)I", line = 109)
    public final int method3288(boolean arg0, int arg1) {
        field7940++;
        if (this.field7944 == null) {
            return this.field7946;
        }
        class177 var3 = (class177) this.field7944.method4020((long) arg1, (byte) -68);
        if (var3 == null) {
            return this.field7946;
        } else {
            if (arg0) {
                this.field7944 = null;
            }
            return var3.field2473;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 139)
    public final String method3289(int arg0, byte arg1) {
        field7948++;
        if (this.field7944 == null) {
            return this.field7942;
        }
        class687 var3 = (class687) this.field7944.method4020((long) arg0, (byte) -62);
        if (arg1 >= -117) {
            this.field7945 = null;
        }
        return var3 == null ? this.field7942 : var3.field9754;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 164)
    private final void method3290(int arg0) {
        this.field7945 = new class715(this.field7944.method4015(-1694));
        field7941++;
        int var2 = -103 % ((58 - arg0) / 41);
        for (class177 var3 = (class177) this.field7944.method4023((byte) -122); var3 != null; var3 = (class177) this.field7944.method4021((byte) 80)) {
            class177 var4 = new class177((int) var3.field6188);
            this.field7945.method4022(var4, -111, (long) var3.field2473);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I", line = 185)
    public static final int method3291(int arg0, int arg1, int arg2) {
        if (arg0 >= -31) {
            return 11;
        }
        field7949++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII)Z", line = 212)
    public static final boolean method3292(byte arg0, int arg1, int arg2) {
        field7938++;
        if (arg2 < 0 || arg1 < 0 || arg2 >= class160.field2297[1].length || class160.field2297[1][arg2].length <= arg1) {
            return false;
        } else if ((class160.field2297[1][arg2][arg1] & 0x2) == 0) {
            return arg0 >= -73;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)Z", line = 229)
    public final boolean method3293(int arg0, boolean arg1) {
        field7936++;
        if (this.field7944 == null) {
            return false;
        }
        if (this.field7945 == null) {
            this.method3290(108);
        }
        class177 var3 = (class177) this.field7945.method4020((long) arg0, (byte) -63);
        if (arg1) {
            method3295(-3);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILsl;)V", line = 252)
    public final void method3294(int arg0, class479 arg1) {
        while (true) {
            int var3 = arg1.method2886(true);
            if (var3 == 0) {
                field7937++;
                if (arg0 < 88) {
                    method3295(-56);
                    return;
                }
                return;
            }
            this.method3287(1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V", line = 274)
    public static final void method3295(int arg0) {
        class36.field325.method1966(true);
        field7935++;
        int var1 = -109 % ((22 - arg0) / 42);
        class11.field98 = null;
        class445.field6358 = null;
        class249.field3628 = 1;
    }
}
