import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class199 {

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "Z")
    public static boolean field2623 = false;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field2625 = 0;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lql;")
    public static class735 field2626;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)S", line = 8)
    public static final short method1219(int arg0, int arg1) {
        field2624++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (arg0 == var6) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 33)
    public static final void method1220(int arg0, String arg1, int arg2) {
        if (arg0 > -118) {
            method1220(58, null, 89);
        }
        field2621++;
        class592 var3 = class682.method3825(-652872096, 2, arg2);
        var3.method3351(0);
        var3.field8340 = arg1;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 53)
    public static void method1221(int arg0) {
        field2626 = null;
        if (arg0 != -1608275071) {
            method1219(69, 54);
        }
    }
}
