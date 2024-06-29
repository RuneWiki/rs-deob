import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class453 {

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field6517 = 0;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "Ldh;")
    public static class320 field6518 = new class320(13, -1);

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "Loh;")
    public static class404 field6520;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
    public static void method2784(int arg0) {
        if (arg0 != -1) {
            method2785(82, -125, false, -38, (byte) -64, null);
        }
        field6518 = null;
        field6520 = null;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIZIB[Ltp;)V")
    public static final void method2785(int arg0, int arg1, boolean arg2, int arg3, byte arg4, class532[] arg5) {
        field6519++;
        if (arg4 > -106) {
            return;
        }
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class532 var7 = arg5[var6];
            if (var7 != null && var7.field7580 == arg3) {
                class299.method1769(arg2, arg0, -104, arg1, var7);
                class30.method153(-3334, var7, arg1, arg0);
                if (var7.field7567 > var7.field7608 - var7.field7658) {
                    var7.field7567 = var7.field7608 - var7.field7658;
                }
                if ((var7.field7699 - var7.field7573) < var7.field7571) {
                    var7.field7571 = var7.field7699 - var7.field7573;
                }
                if (var7.field7567 < 0) {
                    var7.field7567 = 0;
                }
                if (var7.field7571 < 0) {
                    var7.field7571 = 0;
                }
                if (var7.field7543 == 0) {
                    class600.method3414(arg2, var7, 107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)V")
    public static final void method2786(int arg0, int arg1, int arg2) {
        class691 var3 = class638.field9170[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class334.method1997(var3.field9731);
        class334.method1997(var3.field9735);
        if (var3.field9731 != null) {
            var3.field9731 = null;
        }
        if (var3.field9735 != null) {
            var3.field9735 = null;
        }
    }
}
