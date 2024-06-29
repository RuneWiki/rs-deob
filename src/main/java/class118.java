import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class118 extends class141 {

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
    public static int[] field1670 = new int[100];

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Loh;")
    public static class281 field1672 = new class281();

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
    public static final void method789(int arg0, boolean arg1) {
        field1669++;
        if (!class59.field844) {
            arg0 = -1;
        }
        if (class48.field702 == arg0) {
            return;
        }
        if (arg1) {
            method789(76, false);
        }
        if (arg0 != -1) {
            class85 var2 = class95.method637(arg0, 16);
            class128 var3 = var2.method534(4703);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class200.field2784.method1644(2500, class156.field2177, var3.field1536, new Point(var2.field1153, var2.field1155), var3.method873(), var3.field1526);
                class48.field702 = arg0;
            }
        }
        if (arg0 == -1 && class48.field702 != -1) {
            class200.field2784.method1644(2500, class156.field2177, -1, new Point(), (int[]) null, -1);
            class48.field702 = -1;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
    public static void method790(byte arg0) {
        if (arg0 > -24) {
            method789(122, false);
        }
        field1670 = null;
        field1672 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I")
    public static final int method791(int arg0, int arg1, int arg2) {
        field1671++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        int var4 = 26 % ((arg2 - 63) / 56);
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
