import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class300 extends class601 {

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    private int field3582;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "[I")
    public static int[] field3592 = new int[2];

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "Lhj;")
    public static class596 field3593 = new class596(70, 28);

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    private int field3581;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    private int field3594;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "Lqq;")
    public static class502 field3598;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "Liaa;")
    public static class521 field3596;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "[B")
    private byte[] field3595;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Z")
    public static final boolean method1750(int arg0) {
        if (arg0 > -42) {
            return false;
        }
        field3588++;
        try {
            return class255.method1516(1);
        } catch (IOException var4) {
            class415.method2481(29116);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class320.field3967 == null ? -1 : class320.field3967.method3409(-127)) + "," + (class322.field3995 == null ? -1 : class322.field3995.method3409(119)) + "," + (class102.field1321 == null ? -1 : class102.field1321.method3409(127)) + " - " + class647.field8807 + "," + (field3596.field3453[0] + class632.field8626) + "," + (field3596.field3455[0] + class620.field8435) + " - ";
            for (int var3 = 0; var3 < class647.field8807 && var3 < 50; var3++) {
                var2 = var2 + class583.field7964.field5275[var3] + ",";
            }
            class705.method4008(var5, var2, -123);
            class268.method1590(12, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
    public final void method1751(int arg0, int arg1, int arg2) {
        field3587++;
        if (arg0 != 345741388) {
            return;
        }
        if (arg1 == 0) {
            this.field3586 = this.field3582 - (arg2 >= 0 ? arg2 : -arg2);
            this.field3581 = 4096;
            this.field3586 = this.field3586 * this.field3586 >> 12;
            this.field3585 = this.field3586;
            return;
        }
        this.field3581 = this.field3591 * this.field3586 >> 12;
        if (this.field3581 < 0) {
            this.field3581 = 0;
        } else if (this.field3581 > 4096) {
            this.field3581 = 4096;
        }
        this.field3586 = this.field3582 - (arg2 >= 0 ? arg2 : -arg2);
        this.field3586 = this.field3586 * this.field3586 >> 12;
        this.field3586 = this.field3586 * this.field3581 >> 12;
        this.field3585 += this.field3589 * this.field3586 >> 12;
        this.field3589 = this.field3589 * this.field3583 >> 12;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public final void method1752(byte arg0) {
        this.field3589 = this.field3583;
        field3590++;
        this.field3585 >>= 0x4;
        if (this.field3585 < 0) {
            this.field3585 = 0;
        } else if (this.field3585 > 255) {
            this.field3585 = 255;
        }
        this.method1201(-256, this.field3594++, (byte) this.field3585);
        this.field3585 = 0;
        if (arg0 > -70) {
            this.field3591 = 49;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
    public final void method1753(byte arg0) {
        this.field3594 = 0;
        field3584++;
        int var2 = 31 % ((arg0 - 69) / 36);
        this.field3585 = 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIB)V")
    public void method1201(int arg0, int arg1, byte arg2) {
        this.field3595[arg1] = arg2;
        if (arg0 == -256) {
            field3600++;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)V")
    public static void method1754(boolean arg0) {
        field3596 = null;
        field3593 = null;
        field3598 = null;
        if (!arg0) {
            method1750(-54);
        }
        field3592 = null;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class300(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3591 = (int) (arg7 * 4096.0F);
        this.field3582 = (int) (arg6 * 4096.0F);
        this.field3589 = this.field3583 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
