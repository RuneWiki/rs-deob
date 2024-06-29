import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class621 implements class385 {

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "Lgga;")
    private class513 field8772;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "Lrm;")
    public class272 field8769;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    public static int field8764 = 0;

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "Lin;")
    public static class380 field8771 = new class380(56, 5);

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "Lmq;")
    public class85 field8773;

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "[I")
    public static int[] field8768;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V")
    public final void method20(int arg0) {
        field8766++;
        this.field8773 = class663.method3712(92, this.field8772, this.field8769.field3820);
        if (arg0 >= -50) {
            method3559(112);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[B)Z")
    public static final boolean method3558(int arg0, byte[] arg1) {
        if (arg0 != -2053826689) {
            return false;
        }
        field8765++;
        class431 var2 = new class431(arg1);
        int var3 = var2.method2557(14929);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2557(14929) == 1;
        if (var4) {
            class352.method2136(false, var2);
        }
        class754.method4157(-65536, var2);
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(I)V")
    public static void method3559(int arg0) {
        field8771 = null;
        field8768 = null;
        if (arg0 != -16531) {
            method3560(-76, -58, -59);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)I")
    public static final int method3560(int arg0, int arg1, int arg2) {
        field8767++;
        int var3 = arg0 >>> 31;
        return arg2 == 13921 ? (arg0 + var3) / arg1 - var3 : 56;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        if (arg0 >= -93) {
            this.field8772 = null;
        }
        field8763++;
        return this.field8772.method3005(this.field8769.field3820, (byte) -69);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V")
    public void method19(boolean arg0, int arg1) {
        if (arg1 < 44) {
            return;
        }
        if (arg0) {
            int var3 = this.field8769.field3828.method3291(this.field8773.method11(), 0, class499.field6858) + this.field8769.field3823;
            int var4 = this.field8769.field3822.method2110(class381.field5334, this.field8773.method14(), -29133) + this.field8769.field3821;
            this.field8773.method759(var3, var4);
        }
        field8774++;
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lgga;Lrm;)V")
    public class621(class513 arg0, class272 arg1) {
        this.field8772 = arg0;
        this.field8769 = arg1;
    }
}
