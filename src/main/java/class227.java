import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class227 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lpi;")
    public static class340 field2924 = new class340(79, -2);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field2925 = 0;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field2929 = 0;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lhb;")
    public static class250 field2926 = new class250(23, 2);

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1435(int arg0) {
        field2924 = null;
        field2926 = null;
        int var1 = 4 / ((arg0 - 43) / 58);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V")
    public static final void method1436(int arg0, byte arg1, int arg2) {
        field2927++;
        if (arg1 == -3) {
            class436 var3 = class459.method2712(12, arg0, -1759243680);
            var3.method2574((byte) 39);
            var3.field5980 = arg2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static final void method1437(int arg0) {
        field2928++;
        if (arg0 == 32520 && class35.field542 == 5) {
            class35.field542 = 6;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2930++;
        if (arg0 >= -82) {
            method1436(109, (byte) 16, 97);
        }
        if (arg4 == arg5) {
            class36.method236(0, arg4, arg6, arg7, arg2, arg3, arg1);
        } else if (arg2 - arg4 >= class65.field827 && class281.field3589 >= arg2 + arg4 && class418.field5559 <= arg3 - arg5 && (arg3 + arg5) <= class456.field6365) {
            class301.method1803(arg7, arg1, arg4, arg6, arg3, 0, arg5, arg2);
        } else {
            class47.method296(arg7, arg2, arg1, -19812, arg4, arg6, arg3, arg5);
        }
    }
}
