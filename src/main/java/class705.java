import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class705 {

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "Loo;")
    private class652 field9830 = new class652(256);

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "Ld;")
    private class160 field9825;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "Lqfa;")
    private class106 field9826;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "F")
    public static float field9827;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field9824;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)Lkm;", line = 8)
    public final class373 method3987(int arg0, int arg1) {
        field9824++;
        if (arg1 != -25045) {
            return null;
        }
        Object var3 = this.field9830.method3742((byte) 67, (long) arg0);
        if (var3 != null) {
            return (class373) var3;
        } else if (this.field9825.method1212(111, arg0)) {
            class467 var4 = this.field9825.method1208((byte) 47, arg0);
            int var5 = var4.field6574 ? 64 : this.field9826.field1415;
            class373 var7;
            if (var4.field6568 && this.field9826.method451()) {
                float[] var6 = this.field9825.method1210(arg0, var5, 0.7F, -7342, var5, false);
                var7 = new class373(this.field9826, 3553, 34842, var5, var5, var4.field6565 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field6581 != 2 && class217.method1495((byte) -49, var4.field6567)) {
                    var8 = this.field9825.method1211((byte) 22, var5, var5, true, arg0, 0.7F);
                } else {
                    var8 = this.field9825.method1207((byte) 92, false, arg0, var5, var5, 0.7F);
                }
                var7 = new class373(this.field9826, 3553, 6408, var5, var5, var4.field6565 != 0, var8, 0, 0, false);
            }
            var7.method2314(var4.field6572, var4.field6566, 0);
            this.field9830.method3739((long) arg0, (byte) 26, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V", line = 58)
    public final void method3988(byte arg0) {
        field9823++;
        int var2 = 52 / ((7 - arg0) / 50);
        this.field9830.method3741(5, 0);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)Z", line = 70)
    public static final boolean method3989(int arg0, int arg1, int arg2) {
        if (arg2 != -29120) {
            method3989(35, -78, 21);
        }
        field9831++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 81)
    public final void method3990(int arg0) {
        if (arg0 == -11332) {
            this.field9830.method3735(2);
            field9828++;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V", line = 92)
    public static final void method3991(int arg0) {
        class254.field3744.method3735(2);
        field9829++;
        class225.field3465.method3735(2);
        class31.field430.method3735(2);
        if (arg0 == -325) {
            class736.field10159.method3735(2);
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lqfa;Ld;)V", line = 111)
    public class705(class106 arg0, class160 arg1) {
        this.field9825 = arg1;
        this.field9826 = arg0;
    }
}
