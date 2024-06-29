import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class436 {

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "[I")
    public static int[] field6233 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field6235 = 0;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field6229;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public int field6231;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "Lfh;")
    public static class652 field6234;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public static void method2642(byte arg0) {
        field6233 = null;
        if (arg0 != -106) {
            method2643(null, 18);
        }
        field6234 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lff;I)I")
    public static final int method2643(class9 arg0, int arg1) {
        field6232++;
        class334 var2 = arg0.field126;
        if (var2.field4694 != null) {
            var2 = var2.method2110(class390.field5635, arg1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4681;
        if (arg1 != -1) {
            return 14;
        }
        class399 var4 = arg0.method2445((byte) 72);
        if (arg0.field5694 == -1 || arg0.field5639) {
            var3 = var2.field4660;
        } else if (arg0.field5694 == var4.field5863 || arg0.field5694 == var4.field5864 || arg0.field5694 == var4.field5893 || arg0.field5694 == var4.field5858) {
            var3 = var2.field4644;
        } else if (arg0.field5694 == var4.field5884 || arg0.field5694 == var4.field5868 || arg0.field5694 == var4.field5891 || arg0.field5694 == var4.field5902) {
            var3 = var2.field4712;
        }
        return var3;
    }
}
