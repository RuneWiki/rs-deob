import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class610 {

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "Lau;")
    private class692 field8817 = new class692(256);

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "Luca;")
    private class287 field8818;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "Lfa;")
    private class615 field8815;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "[I")
    public static int[] field8813 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)V", line = 6)
    public final void method3478(boolean arg0) {
        field8811++;
        this.field8817.method3890(-1);
        if (arg0) {
            this.field8817 = null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZLje;)Z", line = 17)
    public static final boolean method3479(boolean arg0, class83 arg1) {
        field8816++;
        if (arg0) {
            method3479(true, null);
        }
        class289 var2 = class60.field965.method2596(0, arg1.method277((byte) 95));
        if (var2.field4246 == -1) {
            return true;
        } else {
            class673 var3 = class652.field9331.method227(var2.field4246, -113);
            return var3.field9458 == -1 ? true : var3.method3777((byte) -107);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(Z)V", line = 40)
    public final void method3480(boolean arg0) {
        if (arg0) {
            field8813 = null;
        }
        field8814++;
        this.field8817.method3900(5, 0);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 56)
    public static void method3481(int arg0) {
        field8813 = null;
        if (arg0 != 0) {
            method3479(false, null);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Laaa;", line = 75)
    public final class227 method3482(int arg0, int arg1) {
        field8812++;
        Object var3 = this.field8817.method3901((long) arg1, -99);
        if (arg0 != 0) {
            this.field8817 = null;
        }
        if (var3 != null) {
            return (class227) var3;
        } else if (this.field8815.method956(arg1, 15925)) {
            class457 var4 = this.field8815.method955(-1330, arg1);
            int var5 = var4.field6610 ? 64 : this.field8818.field4015;
            class227 var7;
            if (var4.field6587 && this.field8818.method705()) {
                float[] var6 = this.field8815.method951(var5, false, 0.7F, arg1, var5, 9934);
                var7 = new class227(this.field8818, 3553, 34842, var5, var5, var4.field6605 != 0, var6, 6408);
            } else {
                int[] var8;
                if (!var4.field6594 && class572.method3282(arg0 ^ 0x1, var4.field6600)) {
                    var8 = this.field8815.method958(0.7F, var5, arg0 - 17786, true, var5, arg1);
                } else {
                    var8 = this.field8815.method957(var5, arg0 ^ 0xFFFFF74E, var5, false, 0.7F, arg1);
                }
                var7 = new class227(this.field8818, 3553, 6408, var5, var5, var4.field6605 != 0, var8, 0, 0, false);
            }
            var7.method1424(10242, var4.field6588, var4.field6598);
            this.field8817.method3894(var7, (byte) 60, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Luca;Lfa;)V", line = 125)
    public class610(class287 arg0, class615 arg1) {
        this.field8818 = arg0;
        this.field8815 = arg1;
    }
}
