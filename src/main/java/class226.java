import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class226 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lph;")
    public static class229 field3708 = class266.method1858("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", 0);

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field3711 = 0;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "S")
    public static short field3713 = 320;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Lo;")
    public static class227 field3712 = new class227();

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIIIZI)Z", line = 12)
    public static final boolean method1568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field3714++;
        if (class230.field3820.method1457(arg7 + 24320) == 2) {
            return class262.method1823(arg6, arg1, arg8, arg11, arg9, 127, arg5, arg10, arg3, arg0, arg4, arg2);
        } else if (class230.field3820.method1457(0) <= 2) {
            return arg7 == -24320 ? class71.method552(arg1, arg4, arg5, arg0, arg3, arg2, arg10, arg9, arg11, -75, arg6, arg8) : false;
        } else {
            return class22.method129(class230.field3820.method1457(0), arg9, arg8, arg6, arg2, arg5, arg4, arg0, arg3, arg1, arg10, arg11, true);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Ljm;", line = 42)
    public static final class134 method1569(int arg0) {
        field3707++;
        class52.field747 = arg0;
        return class124.method917((byte) -35);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 52)
    public static void method1570(int arg0) {
        field3708 = null;
        if (arg0 != -31944) {
            method1571((class293) null, (byte) 47, 22, (class301) null, 10, -53, 31);
        }
        field3712 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lka;BILri;III)V", line = 71)
    public static final void method1571(class293 arg0, byte arg1, int arg2, class301 arg3, int arg4, int arg5, int arg6) {
        field3709++;
        if (arg0 == null) {
            return;
        }
        int var7 = class147.field2379 + class249.field4134 & 0x7FF;
        if (arg1 != -87) {
            method1568(114, 114, 103, -26, -120, -19, -34, -51, -33, -50, true, -31);
        }
        int var8 = arg2 * arg2 + (arg4 * arg4);
        int var9 = Math.max(arg3.field4923 / 2, arg3.field4882 / 2) + 10;
        if (var8 > (var9 * var9)) {
            return;
        }
        int var10 = class310.field5197[var7];
        int var11 = class310.field5199[var7];
        int var12 = var10 * 256 / (class260.field4341 + 256);
        int var13 = var11 * 256 / (class260.field4341 + 256);
        int var14 = arg2 * var12 + arg4 * var13 >> 16;
        int var15 = arg4 * var12 - (arg2 * var13) >> 16;
        if (class99.field1675) {
            ((class87) arg0).method641(arg3.field4923 / 2 + var14 + arg5 - (arg0.field4782 / 2), arg3.field4882 / 2 + (arg6 - var15 - arg0.field4781 / 2), (class87) arg3.method2032((byte) 5, false));
        } else {
            ((class327) arg0).method2247(arg3.field4923 / 2 + arg5 + var14 - (arg0.field4782 / 2), -(arg0.field4781 / 2) + arg6 - (-(arg3.field4882 / 2) - -var15), arg3.field4886, arg3.field4974);
        }
    }
}
