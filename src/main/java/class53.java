import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class53 {

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Lvh;")
    private class328 field756 = new class328(256);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Lgj;")
    private class580 field754;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Le;")
    private class489 field753;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "[I")
    public static int[] field759 = new int[2048];

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "S")
    public static short field755 = 32767;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "[I")
    public static int[] field760 = new int[32];

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "Lhb;")
    public static class666 field758;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)Lhr;")
    public final class483 method374(byte arg0, int arg1) {
        field762++;
        Object var3 = this.field756.method1986((byte) -89, (long) arg1);
        if (arg0 >= -61) {
            return null;
        } else if (var3 != null) {
            return (class483) var3;
        } else if (this.field753.method590(arg1, (byte) -50)) {
            class269 var4 = this.field753.method588(-26679, arg1);
            int var5 = var4.field3823 ? 64 : this.field754.field8007;
            class483 var7;
            if (var4.field3815 && this.field754.method308()) {
                float[] var6 = this.field753.method585(var5, arg1, 0.7F, var5, 25948, false);
                var7 = this.field754.method3174(var5, var6, class583.field8126, var4.field3809 != 0, false, var5);
            } else {
                int[] var8 = var4.field3813 ? this.field753.method582(var5, var5, 23117, false, arg1, 0.7F) : this.field753.method586(arg1, var5, 0.7F, var5, true, 110);
                var7 = this.field754.method3214(var5, var5, -17318, var8, var4.field3809 != 0);
            }
            var7.method786(var4.field3807, 27469, var4.field3824);
            this.field756.method1985(var7, (long) arg1, (byte) -102);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method375(int arg0) {
        field758 = null;
        field759 = null;
        field760 = null;
        if (arg0 >= -114) {
            method375(24);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V")
    public final void method376(boolean arg0) {
        if (!arg0) {
            this.field756.method1989(5, (byte) 105);
            field761++;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lgj;Le;)V")
    public class53(class580 arg0, class489 arg1) {
        this.field754 = arg0;
        this.field753 = arg1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Loa;I)V")
    public static final void method377(class638 arg0, int arg1) {
        field763++;
        if (arg1 != -6136) {
            return;
        }
        if (class229.field3278) {
            class642.method3579((byte) -28, arg0);
        } else {
            class196.method1320(-96, arg0);
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    public final void method378(int arg0) {
        int var2 = -52 % ((-arg0 - 54) / 36);
        field757++;
        this.field756.method1997(1);
    }
}
