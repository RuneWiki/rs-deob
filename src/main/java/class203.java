import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class203 {

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "[C")
    public static char[] field2586 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)I")
    public static final int method1259(byte arg0) {
        field2584++;
        if (arg0 <= 116) {
            return -36;
        } else if (class709.field9973 == 1) {
            return class437.field6143;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public static void method1260(int arg0) {
        if (arg0 <= 101) {
            field2586 = null;
        }
        field2586 = null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIB)V")
    public static final void method1261(int arg0, int arg1, int arg2, byte arg3) {
        field2587++;
        int var4 = class63.field851 + arg2;
        int var5 = class753.field10509 + arg1;
        if (class495.field7002 == null || arg2 < 0 || arg1 < 0 || arg2 >= class613.field8591 || arg1 >= class1.field3 || class223.field2944.field619.method444((byte) -127) == 0 && class339.field4374.field5779 != arg0) {
            return;
        }
        long var6 = (long) (var4 | arg0 << 28 | var5 << 14);
        class585 var8 = (class585) class497.field7028.method3248(var6, arg3 ^ 0x1E);
        if (var8 == null) {
            class87.method612(arg0, arg2, arg1);
            return;
        }
        class11 var9 = (class11) var8.field8118.method3111(109);
        if (var9 == null) {
            class87.method612(arg0, arg2, arg1);
            return;
        }
        class118 var10 = (class118) class87.method612(arg0, arg2, arg1);
        if (var10 == null) {
            var10 = new class118(arg2 << 9, class517.field7282[arg0].method2381(-128, arg2, arg1), arg1 << 9, arg0, arg0);
        } else {
            var10.field1437 = var10.field1448 = -1;
        }
        var10.field1445 = var9.field127;
        var10.field1434 = var9.field122;
        label61: while (true) {
            class11 var11 = (class11) var8.field8118.method3116(-63);
            if (var11 == null) {
                break;
            }
            if (var10.field1445 != var11.field127) {
                var10.field1438 = var11.field122;
                var10.field1437 = var11.field127;
                while (true) {
                    class11 var12 = (class11) var8.field8118.method3116(arg3 ^ 0xFFFFFFD6);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field1445 != var12.field127 && var10.field1437 != var12.field127) {
                        var10.field1436 = var12.field122;
                        var10.field1448 = var12.field127;
                    }
                }
            }
        }
        int var13 = class592.method3287(false, (arg1 << 9) + 256, arg0, (arg2 << 9) + 256);
        var10.field5784 = arg1 << 9;
        var10.field5792 = (byte) arg0;
        if (arg3 != 30) {
            field2586 = null;
        }
        var10.field5779 = (byte) arg0;
        var10.field5791 = var13;
        var10.field5790 = arg2 << 9;
        var10.field1441 = 0;
        if (class739.method4140((byte) 93, arg1, arg2)) {
            var10.field5792++;
        }
        class130.method835(arg0, arg2, arg1, var13, var10);
    }
}
