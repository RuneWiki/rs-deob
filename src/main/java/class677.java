import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class677 {

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "Laj;")
    private class287 field9615 = new class287(256);

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "Lus;")
    private class1 field9618;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "Lfa;")
    private class214 field9612;

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
    public static int field9616 = 0;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "Ljava/lang/String;")
    public static String field9614 = "";

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "Lsb;")
    public static class266 field9613 = new class266(1, 7);

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
    public static void method3807(int arg0) {
        field9614 = null;
        if (arg0 != -21640) {
            method3808(-84, -119, 122);
        }
        field9613 = null;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(III)Z")
    public static final boolean method3808(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            field9619++;
            return class314.method2037(-67, arg0, arg2) & class414.method2529(109, arg2, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
    public final void method3809(boolean arg0) {
        if (!arg0) {
            method3807(57);
        }
        field9617++;
        this.field9615.method1908(5, (byte) -11);
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)V")
    public final void method3810(int arg0) {
        if (arg0 == 0) {
            field9620++;
            this.field9615.method1913(true);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)Ldb;")
    public final class296 method3811(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method3810(-98);
        }
        field9611++;
        Object var3 = this.field9615.method1900((long) arg1, -108);
        if (var3 != null) {
            return (class296) var3;
        } else if (this.field9612.method1499(arg1, -24052)) {
            class699 var4 = this.field9612.method1500(arg1, arg0 ^ 0xFFFFFFF1);
            int var5 = var4.field9836 ? 64 : this.field9618.field198;
            class296 var7;
            if (var4.field9827 && this.field9618.method162()) {
                float[] var6 = this.field9612.method1498(arg1, var5, false, var5, 0.7F, true);
                var7 = new class296(this.field9618, 3553, 34842, var5, var5, var4.field9842 != 0, var6, 6408);
            } else {
                int[] var8;
                if (!var4.field9840 && class673.method3797(1, var4.field9829)) {
                    var8 = this.field9612.method1495(arg1, true, 0.7F, var5, var5, 32682);
                } else {
                    var8 = this.field9612.method1496(arg1, var5, 0.7F, false, var5, -15473);
                }
                var7 = new class296(this.field9618, 3553, 6408, var5, var5, var4.field9842 != 0, var8, false);
            }
            var7.method1971(var4.field9847, -128, var4.field9832);
            this.field9615.method1904(var7, (long) arg1, -1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lus;Lfa;)V")
    public class677(class1 arg0, class214 arg1) {
        this.field9618 = arg0;
        this.field9612 = arg1;
    }
}
