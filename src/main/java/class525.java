import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class525 {

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Ljava/lang/String;")
    private String field7734 = "null";

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field7722 = 0;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "C")
    public char field7720;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "C")
    public char field7730;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    private int field7725;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lbu;")
    public class407 field7717;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Lbu;")
    private class407 field7728;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Ldv;")
    public static class83 field7719;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)Z")
    public final boolean method3102(byte arg0, int arg1) {
        field7718++;
        if (this.field7717 == null) {
            return false;
        }
        if (this.field7728 == null) {
            this.method3112((byte) -43);
        }
        int var3 = 73 % ((arg0 + 70) / 54);
        class22 var4 = (class22) this.field7728.method2516((long) arg1, -1);
        return var4 != null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)V")
    public static final void method3103(int arg0, boolean arg1, int arg2) {
        class150.field2406 = 3;
        field7732++;
        if (arg0 != -1) {
            method3113(-77, 2, 65, -122, -39);
        }
        class111.field1965 = arg2;
        class463.method2761(class100.field1657.field7139, class100.field1657.field7133, false);
        if (arg1) {
            class147.method1069(true, "", "");
        } else {
            class49.method351(123);
            class147.method1069(true, class201.field3192, class139.field2321);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)I")
    public final int method3104(int arg0, boolean arg1) {
        if (arg1) {
            this.method3108(null, -27);
        }
        field7721++;
        if (this.field7717 == null) {
            return this.field7725;
        } else {
            class22 var3 = (class22) this.field7717.method2516((long) arg0, -1);
            return var3 == null ? this.field7725 : var3.field238;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method3105(int arg0) {
        if (arg0 == -3) {
            field7719 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method3106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7735++;
        if (arg5 != -13930) {
            field7719 = null;
        }
        if ((arg1 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg0;
            arg0 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 - (arg2 + arg3 - 7);
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg6;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lia;I)V")
    public final void method3107(class23 arg0, int arg1) {
        if (arg1 < 18) {
            this.field7720 = (char) 65413;
        }
        while (true) {
            int var3 = arg0.method126((byte) -113);
            if (var3 == 0) {
                field7736++;
                return;
            }
            this.method3111(var3, arg0, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method3108(String arg0, int arg1) {
        field7729++;
        if (this.field7717 == null) {
            return false;
        }
        if (this.field7728 == null) {
            this.method3109((byte) 29);
        }
        for (class139 var3 = (class139) this.field7728.method2516(class171.method1158(arg0, 0), -1); var3 != null; var3 = (class139) this.field7728.method2526(-125)) {
            if (var3.field2319.equals(arg0)) {
                return true;
            }
        }
        int var4 = 2 / ((-arg1 - 81) / 42);
        return false;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    private final void method3109(byte arg0) {
        field7724++;
        this.field7728 = new class407(this.field7717.method2519(-99));
        if (arg0 == 29) {
            for (class17 var2 = (class17) this.field7717.method2518(arg0 ^ 0xFFFFFF99); var2 != null; var2 = (class17) this.field7717.method2524(arg0 ^ 0x1D)) {
                class139 var3 = new class139(var2.field192, (int) var2.field4542);
                this.field7728.method2517(var3, class171.method1158(var2.field192, arg0 - 29), (byte) 92);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(BI)Ljava/lang/String;")
    public final String method3110(byte arg0, int arg1) {
        field7726++;
        if (this.field7717 == null) {
            return this.field7734;
        }
        class17 var3 = (class17) this.field7717.method2516((long) arg1, -1);
        if (arg0 < 56) {
            return null;
        } else if (var3 == null) {
            return this.field7734;
        } else {
            return var3.field192;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILia;B)V")
    private final void method3111(int arg0, class23 arg1, byte arg2) {
        field7723++;
        if (arg0 == 1) {
            this.field7730 = class260.method1745(arg1.method167(-2), 255);
        } else if (arg0 == 2) {
            this.field7720 = class260.method1745(arg1.method167(-2), 255);
        } else if (arg0 == 3) {
            this.field7734 = arg1.method156((byte) -45);
        } else if (arg0 == 4) {
            this.field7725 = arg1.method143(-3230);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method132(39);
            this.field7717 = new class407(class206.method1351(var4, 83));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method143(arg2 ^ 0xCC9);
                class276 var7;
                if (arg0 == 5) {
                    var7 = new class17(arg1.method156((byte) -23));
                } else {
                    var7 = new class22(arg1.method143(-3230));
                }
                this.field7717.method2517(var7, (long) var6, (byte) 89);
            }
        }
        if (arg2 != -85) {
            this.method3111(-66, null, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    private final void method3112(byte arg0) {
        if (arg0 != -43) {
            field7719 = null;
        }
        field7731++;
        this.field7728 = new class407(this.field7717.method2519(-108));
        for (class22 var2 = (class22) this.field7717.method2518(23); var2 != null; var2 = (class22) this.field7717.method2524(arg0 + 43)) {
            class22 var3 = new class22((int) var2.field4542);
            this.field7728.method2517(var3, (long) var2.field238, (byte) 58);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V")
    public static final void method3113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7733++;
        float var5 = (float) class210.field3342 / (float) class210.field3343;
        int var6 = arg2;
        int var7 = arg4;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        if (arg0 <= 1) {
            field7722 = 125;
        }
        int var8 = arg3 - (arg4 - var7) / 2;
        int var9 = arg1 - (arg2 - var6) / 2;
        class471.field6970 = class210.field3342 - (class210.field3342 * var8 / var7);
        class494.field7217 = class210.field3343 * var9 / var6;
        class129.field2226 = -1;
        class435.field6504 = -1;
        class430.method2621((byte) 127);
    }
}
