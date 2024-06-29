import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class525 {

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    private int field7758;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public int field7769;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "B")
    public byte field7751;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public int field7756;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public int field7765;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Le;")
    public class525 field7767;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
    public static int[] field7760 = new int[16384];

    @OriginalMember(owner = "client!e", name = "n", descriptor = "[I")
    public static int[] field7763 = new int[16384];

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lcm;")
    public static class449 field7772;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "[I")
    public static int[] field7773;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public int field7750;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public int field7753;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public int field7754;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public int field7755;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public int field7757;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public int field7761;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public int field7764;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public int field7766;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public int field7768;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lmm;")
    public static class37 field7770;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7760[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field7763[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field7772 = new class449(16, 4);
        field7773 = new int[] { 28, 35, 40, 44 };
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)Ljl;", line = 25)
    public final class485 method3110(boolean arg0) {
        field7759++;
        if (arg0) {
            this.method3110(true);
        }
        return class322.method2089((byte) 114, this.field7758);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 37)
    public static void method3111(int arg0) {
        field7773 = null;
        if (arg0 <= 72) {
            field7770 = null;
        }
        field7772 = null;
        field7760 = null;
        field7770 = null;
        field7763 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZI)V", line = 51)
    public static final void method3112(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            class183.field2585--;
            if (class183.field2585 == 0) {
                class88.field1208 = null;
            }
        }
        if (arg2 >= -15) {
            field7773 = null;
        }
        field7771++;
        if (!arg0) {
            return;
        }
        class445.field6610--;
        if (class445.field6610 == 0) {
            class249.field3466 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)Le;", line = 80)
    public final class525 method3113(int arg0, int arg1, int arg2, int arg3) {
        field7752++;
        return arg0 == -11167 ? new class525(this.field7758, arg2, arg3, arg1, this.field7751) : null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIB)V", line = 96)
    public class525(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field7758 = arg0;
        this.field7769 = arg3;
        this.field7751 = arg4;
        this.field7756 = arg1;
        this.field7765 = arg2;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Le;I)V", line = 123)
    public class525(class525 arg0, int arg1) {
        this.field7767 = arg0;
        this.field7751 = this.field7767.field7751;
        this.field7765 = this.field7767.field7765 + arg1;
        this.field7756 = this.field7767.field7756 + arg1;
        this.field7769 = this.field7767.field7769 + arg1;
        this.field7758 = this.field7767.field7758;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Luf;", line = 136)
    public static final class349 method3114(byte arg0) {
        if (arg0 != -110) {
            field7773 = null;
        }
        field7762++;
        class296.field4376 = 0;
        return class219.method1481((byte) 53);
    }
}
