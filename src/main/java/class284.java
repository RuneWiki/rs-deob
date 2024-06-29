import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class284 {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field4803 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lqb;")
    public static class209 field4806 = new class209(50);

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lcj;")
    public static class182 field4807 = new class182(64);

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field4808 = 1;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lbd;")
    public static class162 field4809 = class17.method142(0, "Konfig geladen)3");

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 9)
    public static void method1963(byte arg0) {
        field4806 = null;
        field4807 = null;
        field4809 = null;
        int var1 = -21 % ((arg0 + 30) / 46);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[[I)V", line = 29)
    public static final void method1964(int arg0, int[][] arg1) {
        if (arg0 >= 26) {
            field4804++;
            class184.field3180 = arg1;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lcb;B)V", line = 40)
    public static final void method1965(class85 arg0, byte arg1) {
        arg0.field1521 = false;
        if (arg1 > -101) {
            method1964(58, (int[][]) ((int[][]) null));
        }
        if (arg0.field1520 != null) {
            arg0.field1520.field4789 = 0;
        }
        field4805++;
        for (class85 var2 = arg0.method453(); var2 != null; var2 = arg0.method452()) {
            method1965(var2, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIILhi;B)Lhi;", line = 72)
    public static final class176 method1966(int arg0, int arg1, int arg2, int arg3, int arg4, class176 arg5, byte arg6) {
        field4802++;
        long var7 = (long) arg1;
        class176 var9 = (class176) class288.field4850.method1536(var7, -109);
        if (var9 == null) {
            class195 var10 = class195.method1449(class158.field2782, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1465(64, 768, -50, -10, -50);
            class288.field4850.method1532(var7, -124, var9);
        }
        int var11 = arg5.method69();
        int var12 = arg5.method77();
        if (arg6 <= 30) {
            field4809 = (class162) null;
        }
        int var13 = arg5.method96();
        int var14 = arg5.method75();
        class176 var15 = var9.method88(true, true);
        if (arg3 != 0) {
            var15.method78(arg3);
        }
        if (class117.field2159) {
            class100 var16 = (class100) var15;
            if (arg2 != class3.method15(arg4 + var11, class157.field2765, arg0 + var13, false) || arg2 != class3.method15(arg4 + var12, class157.field2765, arg0 + var14, false)) {
                for (int var17 = 0; var17 < var16.field1820; var17++) {
                    var16.field1817[var17] += class3.method15(var16.field1794[var17] + arg4, class157.field2765, var16.field1801[var17] + arg0, false) - arg2;
                }
                var16.field1821.field3784 = false;
                var16.field1815.field3597 = false;
            }
        } else {
            class11 var18 = (class11) var15;
            if (class3.method15(arg4 + var11, class157.field2765, arg0 + var13, false) != arg2 || class3.method15(arg4 + var12, class157.field2765, arg0 + var14, false) != arg2) {
                for (int var19 = 0; var19 < var18.field150; var19++) {
                    var18.field148[var19] += class3.method15(var18.field137[var19] + arg4, class157.field2765, var18.field135[var19] + arg0, false) - arg2;
                }
                var18.field132 = false;
            }
        }
        return var15;
    }
}
