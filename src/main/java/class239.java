import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class239 {

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public int field2989 = 0;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field2990 = -1;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "Ltda;")
    public static class16 field2987;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIZI)V")
    public static final void method1431(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2992++;
        if (~class651.field9191 == arg1) {
            class253.method1483(arg1 ^ 0xFFFFFFB6, false);
        } else {
            class517.field7071 = class651.field9191;
            class393.method2111(0, true);
        }
        class61.field833 = arg4;
        class130.field1613 = arg2;
        class296.field3660 = arg3;
        class656.method3682(arg0);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Les;I)V")
    public final void method1432(class630 arg0, int arg1) {
        field2991++;
        if (arg1 != -1) {
            field2987 = null;
        }
        while (true) {
            int var3 = arg0.method3501(-9268);
            if (var3 == 0) {
                return;
            }
            this.method1434(arg0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lr;Lng;I)I")
    public static final int method1433(class566 arg0, class221 arg1, int arg2) {
        field2993++;
        if (arg1.field2702 != -1) {
            return arg1.field2702;
        }
        if (arg1.field2709 != -1) {
            class13 var3 = arg0.field7898.method2486(arg1.field2709, (byte) 86);
            if (!var3.field246) {
                return var3.field247;
            }
        }
        if (arg2 <= 118) {
            method1431(36, -99, -31, true, -1);
        }
        return arg1.field2696;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Les;II)V")
    private final void method1434(class630 arg0, int arg1, int arg2) {
        field2986++;
        if (arg2 == 5) {
            this.field2989 = arg0.method3470(13111);
        }
        if (arg1 != -1) {
            this.field2989 = -74;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
    public static void method1435(byte arg0) {
        int var1 = 4 % ((arg0 + 45) / 55);
        field2987 = null;
    }
}
