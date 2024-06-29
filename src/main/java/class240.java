import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class240 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
    public static int[] field4313 = new int[32];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Ljd;")
    public static class86 field4312 = class122.method868("blinken1:", true);

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Ljd;")
    public static class86 field4318 = class122.method868(")4j", true);

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Ljd;")
    private static class86 field4315 = class122.method868("wishes to trade with you)3", true);

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Ljd;")
    public static class86 field4319 = class122.method868("Okay", true);

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ljd;")
    public static class86 field4320 = field4315;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1647(int arg0) {
        field4312 = null;
        if (arg0 != -219996400) {
            return;
        }
        field4315 = null;
        field4313 = null;
        field4320 = null;
        field4318 = null;
        field4319 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILgj;)V")
    public static final void method1648(int arg0, class224 arg1) {
        if (arg0 != 32) {
            method1647(-55);
        }
        field4316++;
        class14 var2 = (class14) class149.field2774.method1698(arg1.field4029.method622(-2), (byte) 108);
        if (var2 == null) {
            return;
        }
        if (var2.field420 != null) {
            class2.field18.method366(var2.field420);
            var2.field420 = null;
        }
        var2.method1477(1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4311++;
        if (arg5 >= -23) {
            field4312 = null;
        }
        int var9 = arg6 - arg3;
        int var10 = arg4 - arg0;
        int var11 = (arg2 - arg7 << 16) / var10;
        int var12 = (arg8 - arg1 << 16) / var9;
        class142.method1009(arg7, 0, var12, arg6, arg3, 0, arg1, 10, arg4, var11, arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BJILjd;Ljd;SI)V")
    public static final void method1650(byte arg0, long arg1, int arg2, class86 arg3, class86 arg4, short arg5, int arg6) {
        if (arg0 > -125) {
            return;
        }
        field4317++;
        if (class195.field3506 || class16.field463 >= 500) {
            return;
        }
        class46.field1022[class16.field463] = arg4;
        class188.field3332[class16.field463] = arg3;
        class273.field4784[class16.field463] = arg5;
        class68.field1333[class16.field463] = arg1;
        class241.field4321[class16.field463] = arg6;
        class137.field2612[class16.field463] = arg2;
        class16.field463++;
    }
}
