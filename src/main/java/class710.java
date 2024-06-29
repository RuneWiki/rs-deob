import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class710 {

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "Leda;")
    private class14 field9990 = new class14(256);

    @OriginalMember(owner = "client!tia", name = "i", descriptor = "Ld;")
    private class267 field9997;

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "Lpj;")
    private class38 field9991;

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "Lln;")
    public static class472 field9994 = new class472(10, 2, 2, 0);

    @OriginalMember(owner = "client!tia", name = "k", descriptor = "[I")
    public static int[] field9999 = new int[256];

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "I")
    public static int field9992;

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "I")
    public static int field9993;

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!tia", name = "h", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!tia", name = "j", descriptor = "I")
    public static int field9998;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V", line = 5)
    public final void method3929(int arg0) {
        field9998++;
        this.field9990.method68(arg0 - 7778, 5);
        if (arg0 != -9100) {
            method3930((byte) 27);
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(B)V", line = 16)
    public static final void method3930(byte arg0) {
        field9992++;
        int var1 = 0;
        if (class654.field9289.field5447.method4104(3) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class654.field9289.field5448.method3596(3) == 0) {
            var1 |= 0x40;
        }
        class541.method3167(1, var1);
        class576.field8167.method3066(var1, 32);
        class556.field7917.method740(var1, 71);
        class740.field10382.method3440(126, var1);
        class41.field718.method1532((byte) -94, var1);
        if (arg0 < 9) {
            method3930((byte) 13);
        }
        class753.method4198(127, var1);
        class289.method1886((byte) 49, var1);
        class636.method3602(-127, var1);
        class89.method768(10794, var1);
        class508.method3063((byte) -111);
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)V", line = 54)
    public final void method3931(int arg0) {
        field9996++;
        if (arg0 != 32) {
            this.method3931(-27);
        }
        this.field9990.method76(48);
    }

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "(I)V", line = 71)
    public static final void method3932(int arg0) {
        class344.method2205(-3639);
        field9995++;
        int var1 = 65 % ((-arg0 - 28) / 39);
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "([I[Ljava/lang/Object;B)V", line = 82)
    public static final void method3933(int[] arg0, Object[] arg1, byte arg2) {
        field9993++;
        class47.method477(0, arg0, -4991, arg0.length - 1, arg1);
        if (arg2 != 98) {
            field9999 = null;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Lrm;", line = 93)
    public final class90 method3934(int arg0, int arg1) {
        field9989++;
        Object var3 = this.field9990.method80((byte) -50, (long) arg1);
        if (var3 != null) {
            return (class90) var3;
        }
        int var4 = -55 % ((arg0 + 84) / 34);
        if (!this.field9997.method1772(-5919, arg1)) {
            return null;
        }
        class569 var5 = this.field9997.method1774(106, arg1);
        int var6 = var5.field8067 ? 64 : this.field9991.field615;
        class90 var8;
        if (var5.field8070 && this.field9991.method1237()) {
            float[] var7 = this.field9997.method1775(var6, false, 0.7F, var6, -27353, arg1);
            var8 = this.field9991.method279(var6, var6, -21176, var7, var5.field8061 != 0, class238.field3830);
        } else {
            int[] var9;
            if (var5.field8072 != 2 && class119.method940(var5.field8079, (byte) -95)) {
                var9 = this.field9997.method1771(0.7F, var6, arg1, var6, (byte) 70, true);
            } else {
                var9 = this.field9997.method1776(false, 0.7F, var6, (byte) 45, var6, arg1);
            }
            var8 = this.field9991.method265(var6, var5.field8061 != 0, var6, var9, 0);
        }
        var8.method597(34, var5.field8063, var5.field8078);
        this.field9990.method67((long) arg1, var8, -6772);
        return var8;
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Lpj;Ld;)V", line = 142)
    public class710(class38 arg0, class267 arg1) {
        this.field9997 = arg1;
        this.field9991 = arg0;
    }

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "(I)V", line = 158)
    public static void method3935(int arg0) {
        field9994 = null;
        field9999 = null;
        if (arg0 <= 0) {
            field10000 = 124;
        }
    }
}
