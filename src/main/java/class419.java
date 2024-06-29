import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class419 {

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Ljd;")
    public class496 field6029 = new class496();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[[I")
    public static int[][] field6013 = new int[6][];

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[[B")
    public static byte[][] field6015 = new byte[250][];

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
    public static int[] field6020 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[I")
    public static int[] field6023 = new int[1000];

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field6027 = 0;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Ljd;")
    private class496 field6031;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 4)
    public static void method2486(int arg0) {
        field6015 = null;
        field6013 = null;
        field6023 = null;
        field6020 = null;
        if (arg0 != 11422) {
            field6020 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLrk;)V", line = 18)
    public final void method2487(byte arg0, class419 arg1) {
        if (arg0 == 114) {
            field6025++;
            this.method2497(arg1, (byte) 41, this.field6029.field7469);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z", line = 30)
    public final boolean method2488(byte arg0) {
        if (arg0 < 98) {
            this.method2499(-52);
        }
        field6032++;
        return this.field6029.field7469 == this.field6029;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLjd;)V", line = 42)
    public final void method2489(boolean arg0, class496 arg1) {
        field6030++;
        if (arg1.field7466 != null) {
            arg1.method2997(1);
        }
        arg1.field7466 = this.field6029;
        arg1.field7469 = this.field6029.field7469;
        arg1.field7466.field7469 = arg1;
        arg1.field7469.field7466 = arg1;
        if (!arg0) {
            field6013 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Ljd;", line = 64)
    public final class496 method2490(int arg0) {
        field6028++;
        class496 var2 = this.field6029.field7466;
        if (arg0 != 0) {
            this.method2499(-123);
        }
        if (this.field6029 == var2) {
            this.field6031 = null;
            return null;
        } else {
            this.field6031 = var2.field7466;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I", line = 86)
    public final int method2491(int arg0) {
        field6021++;
        int var2 = 0;
        class496 var3 = this.field6029.field7469;
        if (arg0 != -18626) {
            this.method2487((byte) -112, null);
        }
        while (this.field6029 != var3) {
            var3 = var3.field7469;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljd;B)V", line = 110)
    public final void method2492(class496 arg0, byte arg1) {
        field6026++;
        if (arg0.field7466 != null) {
            arg0.method2997(1);
        }
        arg0.field7469 = this.field6029;
        arg0.field7466 = this.field6029.field7466;
        arg0.field7466.field7469 = arg0;
        arg0.field7469.field7466 = arg0;
        int var3 = -81 / ((arg1 + 26) / 54);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIB)V", line = 127)
    public static final void method2493(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 >= -14) {
            field6023 = null;
        }
        for (int var6 = arg3; var6 <= arg0; var6++) {
            class69.method418(arg4, class47.field558[var6], arg2, (byte) 117, arg1);
        }
        field6016++;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)Ljd;", line = 148)
    public final class496 method2494(int arg0) {
        field6014++;
        class496 var2 = this.field6031;
        if (this.field6029 == var2) {
            this.field6031 = null;
            return null;
        } else {
            this.field6031 = var2.field7469;
            return arg0 <= 19 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Ljd;", line = 174)
    public final class496 method2495(byte arg0) {
        field6024++;
        if (arg0 != 121) {
            field6020 = null;
        }
        class496 var2 = this.field6031;
        if (this.field6029 == var2) {
            this.field6031 = null;
            return null;
        } else {
            this.field6031 = var2.field7466;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)Ljd;", line = 198)
    public final class496 method2496(byte arg0) {
        field6018++;
        int var2 = -86 / ((arg0 + 46) / 50);
        class496 var3 = this.field6029.field7469;
        if (this.field6029 == var3) {
            this.field6031 = null;
            return null;
        } else {
            this.field6031 = var3.field7469;
            return var3;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lrk;BLjd;)V", line = 217)
    private final void method2497(class419 arg0, byte arg1, class496 arg2) {
        field6022++;
        class496 var4 = this.field6029.field7466;
        this.field6029.field7466 = arg2.field7466;
        if (arg1 < 9) {
            this.method2496((byte) -63);
        }
        arg2.field7466.field7469 = this.field6029;
        if (this.field6029 != arg2) {
            arg2.field7466 = arg0.field6029.field7466;
            arg2.field7466.field7469 = arg2;
            var4.field7469 = arg0.field6029;
            arg0.field6029.field7466 = var4;
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)Ljd;", line = 247)
    public final class496 method2498(byte arg0) {
        field6017++;
        class496 var2 = this.field6029.field7469;
        if (arg0 < 7) {
            return null;
        } else if (this.field6029 == var2) {
            return null;
        } else {
            var2.method2997(1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 307)
    public class419() {
        this.field6029.field7469 = this.field6029;
        this.field6029.field7466 = this.field6029;
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V", line = 286)
    public final void method2499(int arg0) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class496 var2 = this.field6029.field7469;
            if (this.field6029 == var2) {
                field6019++;
                this.field6031 = null;
                return;
            }
            var2.method2997(arg0 + 1);
        }
    }
}
