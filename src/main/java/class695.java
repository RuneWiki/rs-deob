import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class695 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lhm;")
    private class208 field9633 = new class208(256);

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Le;")
    private class498 field9638;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljaa;")
    private class576 field9634;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field9637;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/lang/Object;Lqj;)V")
    public static final void method3841(int arg0, Object arg1, class476 arg2) {
        field9635++;
        if (arg2.field5926 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field5926.peekEvent() != null; var3++) {
            class700.method3867(29279, 1L);
        }
        try {
            if (arg0 == 50 && arg1 != null) {
                arg2.field5926.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public final void method3842(int arg0) {
        if (arg0 <= -113) {
            this.field9633.method1222(14564, 5);
            field9632++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public final void method3843(int arg0) {
        field9636++;
        this.field9633.method1218(122);
        if (arg0 >= -119) {
            this.method3845((byte) 113, 71);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Z")
    public static final boolean method3844(int arg0, int arg1) {
        if (arg1 != -12288) {
            method3841(118, null, null);
        }
        field9637++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Lco;")
    public final class109 method3845(byte arg0, int arg1) {
        field9631++;
        if (arg0 != 69) {
            this.method3843(115);
        }
        Object var3 = this.field9633.method1221((long) arg1, true);
        if (var3 != null) {
            return (class109) var3;
        } else if (this.field9638.method2717(arg1, false)) {
            class152 var4 = this.field9638.method2718(arg1, (byte) 72);
            int var5 = var4.field1826 ? 64 : this.field9634.field7573;
            class109 var7;
            if (var4.field1807 && this.field9634.method393()) {
                float[] var6 = this.field9638.method2716(var5, 0.7F, var5, arg1, false, -1898);
                var7 = new class109(this.field9634, 3553, 34842, var5, var5, var4.field1828 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field1829) {
                    var8 = this.field9638.method2715(var5, var5, arg1, 0.7F, false, true);
                } else {
                    var8 = this.field9638.method2714(0.7F, arg1, var5, 19991, true, var5);
                }
                var7 = new class109(this.field9634, 3553, 6408, var5, var5, var4.field1828 != 0, var8, false);
            }
            var7.method758(106, var4.field1808, var4.field1812);
            this.field9633.method1230((byte) 28, (long) arg1, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljaa;Le;)V")
    public class695(class576 arg0, class498 arg1) {
        this.field9638 = arg1;
        this.field9634 = arg0;
    }
}
