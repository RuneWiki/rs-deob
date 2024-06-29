import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class774 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[Ldaa;")
    private class454[] field10650;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    private int field10653;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Lhl;")
    public static class353 field10651 = new class353(0, 1);

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Lsv;")
    public static class570 field10659 = new class570(39, 6);

    @OriginalMember(owner = "client!io", name = "k", descriptor = "S")
    public static short field10660 = 32767;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field10654;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field10655;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field10656;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field10657;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public static int field10661;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "J")
    private long field10658;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Ldaa;")
    private class454 field10652;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lww;")
    public static final class338 method4266(int arg0, int arg1, int arg2) {
        class172 var3 = class514.field7096[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2600;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ldaa;JI)V")
    public final void method4267(class454 arg0, long arg1, int arg2) {
        if (arg0.field6211 != null) {
            arg0.method2665(24902);
        }
        field10654++;
        class454 var5 = this.field10650[(int) (arg1 & (long) (this.field10653 - arg2))];
        arg0.field6213 = var5;
        arg0.field6211 = var5.field6211;
        arg0.field6211.field6213 = arg0;
        arg0.field6213.field6211 = arg0;
        arg0.field6209 = arg1;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)Ldaa;")
    public final class454 method4268(byte arg0) {
        field10657++;
        if (this.field10652 == null) {
            return null;
        }
        class454 var2 = this.field10650[(int) (this.field10658 & (long) (this.field10653 - 1))];
        while (this.field10652 != var2) {
            if (this.field10652.field6209 == this.field10658) {
                class454 var3 = this.field10652;
                this.field10652 = this.field10652.field6213;
                return var3;
            }
            this.field10652 = this.field10652.field6213;
        }
        this.field10652 = null;
        if (arg0 != 69) {
            method4269(81);
        }
        return null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method4269(int arg0) {
        field10651 = null;
        if (arg0 != 2388) {
            field10660 = -95;
        }
        field10659 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(JB)Ldaa;")
    public final class454 method4270(long arg0, byte arg1) {
        this.field10658 = arg0;
        field10655++;
        if (arg1 < 53) {
            return null;
        }
        class454 var4 = this.field10650[(int) (arg0 & (long) (this.field10653 - 1))];
        for (this.field10652 = var4.field6213; this.field10652 != var4; this.field10652 = this.field10652.field6213) {
            if (this.field10652.field6209 == arg0) {
                class454 var5 = this.field10652;
                this.field10652 = this.field10652.field6213;
                return var5;
            }
        }
        this.field10652 = null;
        return null;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V")
    public class774(int arg0) {
        this.field10650 = new class454[arg0];
        this.field10653 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class454 var3 = this.field10650[var2] = new class454();
            var3.field6213 = var3;
            var3.field6211 = var3;
        }
    }
}
