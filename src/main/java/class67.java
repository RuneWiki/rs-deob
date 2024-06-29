import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class67 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1173 = 0;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lid;")
    public static class149 field1176 = class60.method382("hint_headicons", (byte) 28);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "[I")
    public static int[] field1177;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[S")
    public static short[] field1179;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lal;Lal;B)V")
    public static final void method413(class230 arg0, class230 arg1, byte arg2) {
        if (arg2 != -6) {
            method415(108, -86, -105, -124, -1);
        }
        class54.field968 = arg0;
        field1172++;
        class233.field4104 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method414(int arg0) {
        field1174++;
        if (class116.field1991 != null) {
            class116.field1991.method983(arg0 ^ 0x63);
        }
        if (class79.field1476 != null) {
            class79.field1476.method983(80);
        }
        class222.method1495(2, arg0 ^ 0x47, class126.field2209, 22050);
        class116.field1991 = class13.method78(22050, class272.field4900, 0, -9634, class244.field4295);
        class116.field1991.method975(126, class147.field2655);
        class79.field1476 = class13.method78(2048, class272.field4900, arg0, -9634, class244.field4295);
        class79.field1476.method975(arg0 + 11, class246.field4318);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
    public static final void method415(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class19 var5 = (class19) class10.field135.method639((byte) -15, (long) arg1);
        field1175++;
        if (var5 == null) {
            var5 = new class19();
            class10.field135.method638((byte) -89, var5, (long) arg1);
        }
        int var6 = 48 % ((-arg2 - 5) / 47);
        if (arg4 >= var5.field290.length) {
            int[] var7 = new int[arg4 + 1];
            int[] var8 = new int[arg4 + 1];
            for (int var9 = 0; var9 < var5.field290.length; var9++) {
                var7[var9] = var5.field290[var9];
                var8[var9] = var5.field286[var9];
            }
            for (int var10 = var5.field290.length; var10 < arg4; var10++) {
                var7[var10] = -1;
                var8[var10] = 0;
            }
            var5.field286 = var8;
            var5.field290 = var7;
        }
        var5.field290[arg4] = arg0;
        var5.field286[arg4] = arg3;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static void method416(int arg0) {
        field1177 = null;
        field1179 = null;
        if (arg0 != 22050) {
            field1179 = null;
        }
        field1176 = null;
    }
}
