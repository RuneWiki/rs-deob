import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class292 extends class115 {

    @OriginalMember(owner = "client!te", name = "A", descriptor = "Lsl;")
    public class99 field5203;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Lfn;")
    public static class31 field5205 = new class31();

    @OriginalMember(owner = "client!te", name = "G", descriptor = "[[B")
    public static byte[][] field5209 = new byte[1000][];

    @OriginalMember(owner = "client!te", name = "K", descriptor = "[I")
    public static int[] field5213 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field5212 = 0;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Llm;")
    public static class49 field5210;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "Z")
    public static boolean field5204;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V", line = 12)
    public static final void method2079(int arg0, boolean arg1) {
        field5208++;
        if (!class307.field5448) {
            arg0 = -1;
        }
        if (class195.field3501 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class58 var2 = class13.method94(arg0, (byte) 9);
            class66 var3 = var2.method527(!arg1);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class110.field2022.method2161(var3.method575(), (byte) 63, new Point(var2.field1234, var2.field1232), var3.field1381, class132.field2419, var3.field1386);
                class195.field3501 = arg0;
            }
        }
        if (arg0 == -1 && class195.field3501 != -1) {
            class110.field2022.method2161((int[]) null, (byte) 73, new Point(), -1, class132.field2419, -1);
            class195.field3501 = -1;
        }
        if (!arg1) {
            field5209 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 52)
    public static void method2080(int arg0) {
        field5210 = null;
        field5213 = null;
        field5209 = (byte[][]) null;
        field5205 = null;
        if (arg0 >= -112) {
            field5209 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V", line = 79)
    public static final void method2081(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5211++;
        class104 var5 = class293.method2085(arg1, arg2, false);
        var5.method879(0);
        var5.field1965 = arg0;
        var5.field1962 = arg4;
        var5.field1966 = arg3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)I", line = 105)
    public static final int method2082(byte arg0, int arg1, int arg2) {
        field5206++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            if (arg0 < 14) {
                field5212 = 43;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lsl;)V", line = 129)
    public class292(class99 arg0) {
        this.field5203 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 138)
    public static final void method2083(int arg0) {
        if (class52.field1071 < class183.field3356) {
            class52.field1071 = (float) ((double) class52.field1071 / 30.0D + (double) class52.field1071);
            if (class183.field3356 < class52.field1071) {
                class52.field1071 = class183.field3356;
            }
            class239.method1717(-2984);
        } else if (class52.field1071 > class183.field3356) {
            class52.field1071 = (float) ((double) class52.field1071 - (double) class52.field1071 / 30.0D);
            if (class183.field3356 > class52.field1071) {
                class52.field1071 = class183.field3356;
            }
            class239.method1717(arg0 - 2984);
        }
        field5207++;
        if (~class276.field4901 == arg0 || class298.field5284 == -1) {
            return;
        }
        int var1 = class276.field4901 - class265.field4776;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class265.field4776 += var1;
        int var2 = class298.field5284 - class298.field5282;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class298.field5282 += var2;
        if (var1 == 0 && var2 == 0) {
            class276.field4901 = -1;
            class298.field5284 = -1;
        }
        class239.method1717(-2984);
    }
}
