import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class422 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field5778 = 1;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lm;")
    public static class126 field5779;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
    public static final boolean method2428(int arg0, int arg1, int arg2) {
        field5777++;
        if (arg2 < 6) {
            field5779 = null;
        }
        return class206.method1322(arg1, (byte) 53, arg0) & class282.method1678(arg1, (byte) 1, arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Z")
    public static final boolean method2429(int arg0) {
        if (arg0 <= 114) {
            return true;
        } else {
            field5781++;
            return class342.field4520 == 0 ? class399.field5369.method1960(-11366) : true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)I")
    public static final int method2430(int arg0, int arg1, int arg2) {
        field5776++;
        if (arg0 == -1) {
            return 12345678;
        } else if (arg2 == 65408) {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        } else {
            return 109;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIZFZII)[I")
    public static final int[] method2431(int arg0, int arg1, int arg2, boolean arg3, float arg4, boolean arg5, int arg6, int arg7) {
        field5782++;
        int[] var8 = new int[arg0];
        class120 var9 = new class120();
        var9.field1760 = (int) (arg4 * 4096.0F);
        if (!arg3) {
            return null;
        }
        var9.field1747 = arg1;
        var9.field1759 = arg2;
        var9.field1762 = arg5;
        var9.field1751 = arg7;
        var9.field1750 = arg6;
        var9.method142((byte) -78);
        class522.method3078(arg0, -112, 1);
        var9.method836(var8, 4095, 0);
        return var8;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method2432(byte arg0) {
        field5779 = null;
        int var1 = 125 / ((arg0 - 9) / 33);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmd;I)Lbw;")
    public static final class483 method2433(class379 arg0, int arg1) {
        field5780++;
        if (arg1 != 7761) {
            method2431(117, 10, -20, false, -1.7276496F, false, 22, -4);
        }
        return new class483(arg0.method2202(arg1 ^ 0xFFFF86AD), arg0.method2202(arg1 ^ 0xFFFF86AD), arg0.method2202(-26372), arg0.method2202(-26372), arg0.method2249((byte) 68), arg0.method2249((byte) 79), arg0.method2238(255));
    }
}
