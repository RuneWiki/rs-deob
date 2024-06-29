import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class458 implements class186 {

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Ljava/lang/String;")
    private String field6081;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "Lnd;")
    private class547 field6085;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public static int field6087 = 1406;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;IZI)V")
    public static final void method2552(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
        field6086++;
        class288 var5 = class466.method2658(arg4, arg2, 30639);
        if (arg3) {
            field6087 = -116;
        }
        if (var5 == null) {
            return;
        }
        if (var5.field3695 != null) {
            class694 var6 = new class694();
            var6.field9645 = var5.field3695;
            var6.field9639 = arg0;
            var6.field9633 = arg1;
            var6.field9635 = var5;
            class188.method1262(var6);
        }
        if (class27.field484 != 10 || !client.method1833(var5).method1570(arg0 - 1, 0)) {
            return;
        }
        if (arg0 == 1) {
            class636.field8783++;
            class589 var7 = class514.method2994(-29488, class760.field10605, class354.field4547);
            class589.method3345((byte) -14, var5.field3700, var7, arg2, arg4);
            class737.method4107(var7, 7);
        }
        if (arg0 == 2) {
            class305.field4005++;
            class589 var8 = class514.method2994(-29488, class760.field10605, class651.field9065);
            class589.method3345((byte) -14, var5.field3700, var8, arg2, arg4);
            class737.method4107(var8, 7);
        }
        if (arg0 == 3) {
            class225.field2992++;
            class589 var9 = class514.method2994(-29488, class760.field10605, class257.field3266);
            class589.method3345((byte) -14, var5.field3700, var9, arg2, arg4);
            class737.method4107(var9, 7);
        }
        if (arg0 == 4) {
            class759.field10596++;
            class589 var10 = class514.method2994(-29488, class760.field10605, class563.field7917);
            class589.method3345((byte) -14, var5.field3700, var10, arg2, arg4);
            class737.method4107(var10, 7);
        }
        if (arg0 == 5) {
            class111.field1616++;
            class589 var11 = class514.method2994(-29488, class760.field10605, class136.field1948);
            class589.method3345((byte) -14, var5.field3700, var11, arg2, arg4);
            class737.method4107(var11, 7);
        }
        if (arg0 == 6) {
            class412.field5246++;
            class589 var12 = class514.method2994(-29488, class760.field10605, class647.field8957);
            class589.method3345((byte) -14, var5.field3700, var12, arg2, arg4);
            class737.method4107(var12, 7);
        }
        if (arg0 == 7) {
            class430.field5748++;
            class589 var13 = class514.method2994(-29488, class760.field10605, class302.field3950);
            class589.method3345((byte) -14, var5.field3700, var13, arg2, arg4);
            class737.method4107(var13, 7);
        }
        if (arg0 == 8) {
            class667.field9371++;
            class589 var14 = class514.method2994(-29488, class760.field10605, class134.field1930);
            class589.method3345((byte) -14, var5.field3700, var14, arg2, arg4);
            class737.method4107(var14, 7);
        }
        if (arg0 == 9) {
            class684.field9533++;
            class589 var15 = class514.method2994(-29488, class760.field10605, class347.field4417);
            class589.method3345((byte) -14, var5.field3700, var15, arg2, arg4);
            class737.method4107(var15, 7);
        }
        if (arg0 == 10) {
            class225.field2989++;
            class589 var16 = class514.method2994(-29488, class760.field10605, class185.field2558);
            class589.method3345((byte) -14, var5.field3700, var16, arg2, arg4);
            class737.method4107(var16, 7);
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lqia;")
    public final class21 method1249(int arg0) {
        if (arg0 != -32660) {
            this.method1249(-19);
        }
        field6083++;
        return class21.field378;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lnd;Ljava/lang/String;)V")
    public class458(class547 arg0, String arg1) {
        this.field6081 = arg1;
        this.field6085 = arg0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
    public final int method1248(int arg0) {
        field6084++;
        if (this.field6085.method3160(this.field6081, 0)) {
            return 100;
        } else {
            if (arg0 != 27076) {
                method2552(57, null, -126, true, -19);
            }
            return 0;
        }
    }
}
