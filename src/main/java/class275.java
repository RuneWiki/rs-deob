import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class275 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Ltm;")
    private class405 field4100 = new class405();

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lfp;")
    public static class437 field4104 = new class437(10, 2, 2, 0);

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field4108 = 1338;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Ltm;")
    private class405 field4110;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLtm;)V", line = 6)
    public final void method1708(byte arg0, class405 arg1) {
        if (arg1.field6101 != null) {
            arg1.method2440(-123);
        }
        field4107++;
        arg1.field6100 = this.field4100;
        arg1.field6101 = this.field4100.field6101;
        if (arg0 != -8) {
            this.field4110 = null;
        }
        arg1.field6101.field6100 = arg1;
        arg1.field6100.field6101 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 26)
    public final void method1709(byte arg0) {
        while (true) {
            class405 var2 = this.field4100.field6100;
            if (this.field4100 == var2) {
                field4109++;
                int var3 = 26 / ((48 - arg0) / 54);
                this.field4110 = null;
                return;
            }
            var2.method2440(-105);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 46)
    public static void method1710(byte arg0) {
        field4104 = null;
        if (arg0 > -98) {
            method1717(-101);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Ltm;", line = 56)
    public final class405 method1711(int arg0) {
        field4099++;
        if (arg0 < 19) {
            method1710((byte) 90);
        }
        class405 var2 = this.field4110;
        if (this.field4100 == var2) {
            this.field4110 = null;
            return null;
        } else {
            this.field4110 = var2.field6100;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)I", line = 77)
    public final int method1712(int arg0) {
        field4103++;
        int var2 = arg0;
        for (class405 var3 = this.field4100.field6100; var3 != this.field4100; var3 = var3.field6100) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Ltm;", line = 104)
    public final class405 method1713(int arg0) {
        field4102++;
        class405 var2 = this.field4100.field6100;
        if (arg0 != 105) {
            this.method1712(-4);
        }
        if (this.field4100 == var2) {
            this.field4110 = null;
            return null;
        } else {
            this.field4110 = var2.field6100;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V", line = 125)
    public static final void method1714(int arg0, int arg1, int arg2) {
        field4097++;
        if (class367.field5597 != arg2) {
            class379.field5711 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class379.field5711[var3] = (var3 << 12) / arg2;
            }
            class367.field5597 = arg2;
            class83.field1326 = arg2 - 1;
            class145.field2170 = arg2 * 32;
        }
        if (class372.field5635 != arg1) {
            if (class367.field5597 == arg1) {
                class170.field2509 = class379.field5711;
            } else {
                class170.field2509 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class170.field2509[var4] = (var4 << 12) / arg1;
                }
            }
            class372.field5635 = arg1;
            class142.field2133 = arg1 - 1;
        }
        if (arg0 < 74) {
            method1715((char) 65462, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(CB)C", line = 170)
    public static final char method1715(char arg0, byte arg1) {
        if (arg1 != 106) {
            return (char) 65419;
        }
        field4105++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLsr;)I", line = 565)
    public static final int method1716(boolean arg0, class351 arg1) {
        field4101++;
        class277 var2 = arg1.field5409;
        if (var2.field4148 != null) {
            var2 = var2.method1734((byte) -8, class307.field4619);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4149;
        class192 var4 = arg1.method2415(0);
        if (arg1.field5979) {
            var3 = var2.field4194;
        } else if (arg1.field6043 == var4.field2832 || arg1.field6043 == var4.field2834 || arg1.field6043 == var4.field2802 || arg1.field6043 == var4.field2815) {
            var3 = var2.field4134;
        } else if (arg1.field6043 == var4.field2814 || arg1.field6043 == var4.field2809 || arg1.field6043 == var4.field2813 || arg1.field6043 == var4.field2841) {
            var3 = var2.field4146;
        }
        return arg0 ? var3 : -70;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V", line = 602)
    public static final void method1717(int arg0) {
        field4098++;
        class448.field6610 = 0;
        class154.field2334.method2955(2131289328);
        class154.field2334.method2958(class274.field4088, (byte) 36);
        class448.field6610++;
        if (arg0 <= 15) {
            method1716(true, null);
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)Ltm;", line = 622)
    public final class405 method1718(byte arg0) {
        field4106++;
        class405 var2 = this.field4100.field6100;
        if (arg0 >= -61) {
            this.method1708((byte) 28, null);
        }
        if (this.field4100 == var2) {
            return null;
        } else {
            var2.method2440(-94);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 654)
    public class275() {
        this.field4100.field6100 = this.field4100;
        this.field4100.field6101 = this.field4100;
    }
}
