import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class301 extends class3 {

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lcd;")
    public static class69 field5232 = new class69(16);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field5233 = 0;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lsf;")
    private static class108 field5235 = class140.method973(255, "Loaded sprites");

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lsf;")
    public static class108 field5234 = class140.method973(255, "<col=40ff00>");

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "S")
    public static short field5238 = 32767;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lsf;")
    public static class108 field5236 = field5235;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Laj;")
    public static class1 field5237 = new class1();

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Lsf;")
    private static class108 field5242 = class140.method973(255, "Loaded title screen");

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lsf;")
    private static class108 field5239 = class140.method973(255, "purple:");

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Lsf;")
    public static class108 field5244 = field5239;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field5245 = -2;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Lsf;")
    public static class108 field5240 = field5239;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lsf;")
    public static class108 field5241 = field5242;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field5243 = -1;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lsf;I)I", line = 9)
    public static final int method2118(class108 arg0, int arg1) {
        field5230++;
        for (int var2 = arg1; var2 < class273.field4784.length; var2++) {
            if (class273.field4784[var2].method781(arg0, arg1 - 26321)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIII)V", line = 43)
    public static final void method2119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg4 + 1;
        class209.method1452(arg0, class106.field1839[arg4], 7, arg3, arg5);
        field5231++;
        int var8 = arg2 - 1;
        class209.method1452(arg0, class106.field1839[arg2], 7, arg3, arg5);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class106.field1839[var6];
            var7[arg3] = var7[arg0] = arg5;
        }
        if (arg1 != 16) {
            field5232 = (class69) null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 66)
    public static void method2120(byte arg0) {
        field5234 = null;
        field5242 = null;
        field5232 = null;
        field5240 = null;
        field5244 = null;
        if (arg0 < 87) {
            return;
        }
        field5236 = null;
        field5241 = null;
        field5237 = null;
        field5235 = null;
        field5239 = null;
    }
}
