import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class265 {

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lpp;")
    private class508 field3373 = new class508();

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[Lau;")
    public static class521[] field3366 = new class521[75];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lpp;")
    private class508 field3375;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3365++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) + arg1) * var11;
        int var19 = (var6 + 1) * var16;
        if (class289.field3595 <= arg5 && class159.field2063 >= arg5) {
            int var20 = class605.method3315(arg2 + arg4, arg1 ^ 0xFFFFF002, class263.field3294, class314.field4052);
            int var21 = class605.method3315(arg2 - arg4, 4095, class263.field3294, class314.field4052);
            class57.method362(var21, class550.field7650[arg5], arg0, var20, 16);
        }
        int var22 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var7--;
            var22 -= var15;
            var18 -= var15;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (class289.field3595 <= var24 && class159.field2063 >= var23) {
                int var25 = class605.method3315(arg2 + var6, 4095, class263.field3294, class314.field4052);
                int var26 = class605.method3315(arg2 - var6, 4095, class263.field3294, class314.field4052);
                if (var23 >= class289.field3595) {
                    class57.method362(var26, class550.field7650[var23], arg0, var25, 97);
                }
                if (var24 <= class159.field2063) {
                    class57.method362(var26, class550.field7650[var24], arg0, var25, -126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 102)
    public static void method1535(byte arg0) {
        field3366 = null;
        int var1 = -70 / ((arg0 + 6) / 47);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lpp;", line = 115)
    public final class508 method1536(int arg0) {
        field3370++;
        if (arg0 != 1252027233) {
            field3368 = 59;
        }
        class508 var2 = this.field3375;
        if (this.field3373 == var2) {
            this.field3375 = null;
            return null;
        } else {
            this.field3375 = var2.field6876;
            return var2;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lpp;", line = 136)
    public final class508 method1537(int arg0) {
        field3363++;
        class508 var2 = this.field3373.field6876;
        if (this.field3373 == var2) {
            return null;
        }
        if (arg0 != -21957) {
            field3368 = 69;
        }
        var2.method2744((byte) -92);
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 153)
    public static final Class method1538(int arg0, String arg1) throws ClassNotFoundException {
        field3361++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0 != 18944) {
            return null;
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

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Lbaa;", line = 199)
    public static final class593 method1539(byte arg0, int arg1) {
        field3362++;
        class593[] var2 = class597.method3285(-125);
        if (arg0 < 96) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field8333 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V", line = 229)
    public final void method1540(int arg0) {
        if (arg0 != 1252027233) {
            return;
        }
        field3369++;
        while (true) {
            class508 var2 = this.field3373.field6876;
            if (this.field3373 == var2) {
                this.field3375 = null;
                return;
            }
            var2.method2744((byte) -72);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILpp;)V", line = 254)
    public final void method1541(int arg0, class508 arg1) {
        field3360++;
        if (arg1.field6877 != null) {
            arg1.method2744((byte) -75);
        }
        arg1.field6876 = this.field3373;
        arg1.field6877 = this.field3373.field6877;
        arg1.field6877.field6876 = arg1;
        arg1.field6876.field6877 = arg1;
        if (arg0 != 75) {
            method1535((byte) 83);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLpp;)V", line = 274)
    public final void method1542(byte arg0, class508 arg1) {
        if (arg0 >= -113) {
            this.field3375 = null;
        }
        if (arg1.field6877 != null) {
            arg1.method2744((byte) -53);
        }
        field3367++;
        arg1.field6876 = this.field3373.field6876;
        arg1.field6877 = this.field3373;
        arg1.field6877.field6876 = arg1;
        arg1.field6876.field6877 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I", line = 292)
    public final int method1543(int arg0) {
        field3371++;
        int var2 = arg0;
        class508 var3 = this.field3373.field6876;
        while (this.field3373 != var3) {
            var3 = var3.field6876;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Lpp;", line = 310)
    public final class508 method1544(byte arg0) {
        field3376++;
        class508 var2 = this.field3373.field6877;
        if (this.field3373 == var2) {
            return null;
        }
        if (arg0 <= 126) {
            this.field3373 = null;
        }
        var2.method2744((byte) -87);
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V", line = 338)
    public static final void method1545(byte arg0) {
        field3374++;
        for (int var1 = 0; var1 < field3368; var1++) {
            class377 var2 = class572.field7993[var1];
            if (var2.field4754 == 3) {
                if (var2.field4749 == null) {
                    var2.field4759 = Integer.MIN_VALUE;
                } else {
                    class480.field6387.method1295(var2.field4749);
                }
            }
        }
        if (arg0 != 58) {
            method1534(-34, -60, -49, 36, -72, -111);
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 391)
    public class265() {
        this.field3373.field6876 = this.field3373;
        this.field3373.field6877 = this.field3373;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)Lpp;", line = 371)
    public final class508 method1546(byte arg0) {
        if (arg0 > -51) {
            field3372 = -15;
        }
        field3364++;
        class508 var2 = this.field3373.field6876;
        if (this.field3373 == var2) {
            this.field3375 = null;
            return null;
        } else {
            this.field3375 = var2.field6876;
            return var2;
        }
    }
}
