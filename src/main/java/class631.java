import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class631 {

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "Ltt;")
    public static class338 field8735 = new class338(30, 6);

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "Ltt;")
    public static class338 field8738 = new class338(51, 4);

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "Lcv;")
    public class631 field8733;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Lcv;")
    public class631 field8734;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "[[[Lse;")
    public static class207[][][] field8736;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)V")
    public final void method3499(int arg0) {
        field8732++;
        if (this.field8734 != null && arg0 == 12151) {
            this.field8734.field8733 = this.field8733;
            this.field8733.field8734 = this.field8734;
            this.field8734 = null;
            this.field8733 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIII)V")
    public static final void method3500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8731++;
        if (arg2 != 32574) {
            field8738 = null;
        }
        int var6 = class496.method2826(arg4, (byte) 36, class6.field66, class151.field2071);
        int var7 = class496.method2826(arg3, (byte) 36, class6.field66, class151.field2071);
        int var8 = class496.method2826(arg0, (byte) 36, class281.field3703, class255.field3350);
        int var9 = class496.method2826(arg1, (byte) 36, class281.field3703, class255.field3350);
        for (int var10 = var6; var10 <= var7; var10++) {
            class285.method1691(var9, class315.field4224[var10], -7, var8, arg5);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IB)V")
    public static final void method3501(int arg0, byte arg1) {
        field8737++;
        if (arg1 > -119) {
            method3502(-112);
        }
        class256 var2 = class592.method3279((byte) -26, 16, arg0);
        var2.method1546((byte) -31);
    }

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "(I)V")
    public static void method3502(int arg0) {
        field8736 = null;
        field8735 = null;
        if (arg0 != 6) {
            field8735 = null;
        }
        field8738 = null;
    }
}
