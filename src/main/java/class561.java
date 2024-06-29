import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class561 {

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "Lbaa;")
    public static class130 field7801 = new class130(8);

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "Lkr;")
    public static class602 field7804 = new class602(79, 11);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public int field7798;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    private int field7800;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public int field7805;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "Ldea;")
    public class357 field7806;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)Loia;", line = 5)
    public final synchronized class52 method3297(int arg0) {
        field7802++;
        if (arg0 >= -2) {
            field7801 = null;
        }
        class52 var2 = (class52) this.field7806.field5132.method3898((byte) -42, (long) this.field7800);
        if (var2 != null) {
            return var2;
        }
        class52 var3 = class52.method374(this.field7806.field5121, this.field7800, 0);
        if (var3 != null) {
            this.field7806.field5132.method3899(127, var3, (long) this.field7800);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 30)
    public static final void method3298(long[] arg0, int arg1, Object[] arg2) {
        field7797++;
        if (arg1 <= -76) {
            class580.method3372(arg0.length - 1, 0, -118, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILdc;)V", line = 42)
    public final void method3299(int arg0, class63 arg1) {
        if (arg0 != 14524) {
            this.method3299(113, null);
        }
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                field7803++;
                return;
            }
            this.method3300(var3, arg1, arg0 - 14415);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILdc;I)V", line = 63)
    private final void method3300(int arg0, class63 arg1, int arg2) {
        if (arg0 == 1) {
            this.field7800 = arg1.method482(-772591672);
        } else if (arg0 == 2) {
            this.field7798 = arg1.method505((byte) -119);
            this.field7805 = arg1.method505((byte) -119);
        }
        int var4 = -100 % ((arg2 - 58) / 48);
        field7799++;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)V", line = 95)
    public static void method3301(int arg0) {
        field7804 = null;
        field7801 = null;
        int var1 = -97 % ((arg0 + 60) / 62);
    }
}
