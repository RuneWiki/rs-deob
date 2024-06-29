import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class305 {

    @OriginalMember(owner = "client!os", name = "h", descriptor = "Lfi;")
    private class388 field4015 = new class388();

    @OriginalMember(owner = "client!os", name = "f", descriptor = "[I")
    public static int[] field4013 = new int[25];

    @OriginalMember(owner = "client!os", name = "g", descriptor = "Lvj;")
    public static class304 field4014 = new class304("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!os", name = "l", descriptor = "[I")
    public static int[] field4019 = new int[16384];

    @OriginalMember(owner = "client!os", name = "o", descriptor = "[I")
    public static int[] field4022 = new int[16384];

    @OriginalMember(owner = "client!os", name = "q", descriptor = "Lcu;")
    public static class145 field4024;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "Lfi;")
    private class388 field4021;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "[[B")
    public static byte[][] field4025;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Lfi;")
    public final class388 method1765(int arg0) {
        field4010++;
        if (arg0 != 21621) {
            return null;
        }
        class388 var2 = this.field4015.field5271;
        if (this.field4015 == var2) {
            this.field4021 = null;
            return null;
        } else {
            this.field4021 = var2.field5271;
            return var2;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLfi;)V")
    public final void method1766(byte arg0, class388 arg1) {
        field4012++;
        if (arg1.field5271 != null) {
            arg1.method2291(-93);
        }
        arg1.field5274 = this.field4015;
        arg1.field5271 = this.field4015.field5271;
        arg1.field5271.field5274 = arg1;
        if (arg0 < 23) {
            field4025 = null;
        }
        arg1.field5274.field5271 = arg1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)Lfi;")
    public final class388 method1767(byte arg0) {
        field4009++;
        class388 var2 = this.field4015.field5274;
        if (this.field4015 == var2) {
            return null;
        } else {
            var2.method2291(-92);
            return arg0 == -17 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)I")
    public final int method1768(int arg0) {
        field4016++;
        int var2 = 0;
        class388 var3 = this.field4015.field5274;
        if (arg0 != -2245) {
            this.method1775((byte) -53);
        }
        while (this.field4015 != var3) {
            var3 = var3.field5274;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V")
    public static void method1769(int arg0) {
        field4013 = null;
        if (arg0 != 10157) {
            method1772(-1, (byte) -4);
        }
        field4025 = null;
        field4014 = null;
        field4019 = null;
        field4024 = null;
        field4022 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lbi;IIII)V")
    public static final void method1770(class334 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class503.method2873(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class439.field6036) {
            class503.method2873(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class503.method2873(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class318.field4170) {
            class503.method2873(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class318.field4170) {
            class503.method2873(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class439.field6036 && arg4 <= class318.field4170) {
            class503.method2873(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class503.method2873(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class439.field6036 && arg4 > 0) {
            class503.method2873(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(I)Lfi;")
    public final class388 method1771(int arg0) {
        field4017++;
        class388 var2 = this.field4015.field5274;
        int var3 = -108 / ((arg0 - 72) / 40);
        if (this.field4015 == var2) {
            this.field4021 = null;
            return null;
        } else {
            this.field4021 = var2.field5274;
            return var2;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V")
    public static final void method1772(int arg0, byte arg1) {
        field4011++;
        class412.field5694 = -1;
        if (arg1 > -54) {
            field4025 = null;
        }
        class391.field5300 = arg0;
        class412.field5694 = -1;
        class268.method1614(1604);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)Z")
    public final boolean method1773(byte arg0) {
        int var2 = 18 / ((4 - arg0) / 51);
        field4018++;
        return this.field4015.field5274 == this.field4015;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(B)Lfi;")
    public final class388 method1774(byte arg0) {
        field4020++;
        class388 var2 = this.field4021;
        if (this.field4015 == var2) {
            this.field4021 = null;
            return null;
        }
        if (arg0 > -10) {
            this.method1771(-47);
        }
        this.field4021 = var2.field5274;
        return var2;
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V")
    public final void method1775(byte arg0) {
        field4008++;
        if (arg0 < 126) {
            field4013 = null;
        }
        while (true) {
            class388 var2 = this.field4015.field5274;
            if (this.field4015 == var2) {
                this.field4021 = null;
                return;
            }
            var2.method2291(-92);
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
    public class305() {
        this.field4015.field5271 = this.field4015;
        this.field4015.field5274 = this.field4015;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4019[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4022[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field4024 = new class145(45, 3);
    }
}
