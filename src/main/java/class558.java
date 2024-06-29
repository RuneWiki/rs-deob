import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class558 implements class733 {

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lrp;")
    private class434 field7947;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Leq;")
    private class209 field7948;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field7940 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lpv;")
    public static class70 field7942;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lkr;")
    private class743 field7941;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
    public final void method1172(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = class57.field1064 >= class206.field2956 ? class57.field1064 : class206.field2956;
            int var4 = class477.field6814 >= class363.field5105 ? class477.field6814 : class363.field5105;
            int var5 = this.field7941.method82();
            int var6 = this.field7941.method83();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var9 > var4) {
                var8 = var4 * var5 / var6;
                var9 = var4;
                var10 = 0;
                var7 = (var3 - var8) / 2;
            }
            this.field7941.method4136(var7, var10, var8, var9);
        }
        int var11 = 8 / (-arg1 / 39);
        field7943++;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static void method3278(int arg0) {
        if (arg0 != -1) {
            field7946 = -26;
        }
        field7942 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public static final void method3279(int arg0, int arg1, int arg2) {
        field7944++;
        class354 var3 = class501.method3012(0, arg2, 2145997216);
        var3.method2222(-92);
        var3.field4980 = arg0;
        var3.field4990 = arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z")
    public final boolean method1176(byte arg0) {
        field7938++;
        if (arg0 <= 124) {
            field7940 = 66;
        }
        return this.field7948.method1472(-25711, this.field7947.field6072);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public final void method1173(int arg0) {
        field7945++;
        if (arg0 <= -105) {
            this.field7941 = class458.method2794(this.field7948, this.field7947.field6072, -108);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII[B)V")
    public static final void method3280(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field7939++;
        if (arg3 != -637946526) {
            field7940 = -62;
        }
        if (arg0 >= arg2) {
            return;
        }
        int var6 = arg2 - arg0 >> 2;
        int var7 = arg0 + arg1;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg2 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Leq;Lrp;)V")
    public class558(class209 arg0, class434 arg1) {
        this.field7947 = arg1;
        this.field7948 = arg0;
    }
}
