import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class122 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field2067 = -1;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Lin;")
    public static class380 field2071 = new class380(124, 10);

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Low;")
    public static class665 field2075 = new class665();

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "F")
    public static float field2069;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lm;")
    public static class554 field2072;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lmq;")
    public static class85 field2073;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIB)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2068++;
        if (arg2 >= class742.field10301 && class435.field6058 >= arg2) {
            int var5 = class645.method3656(class698.field9801, class515.field7102, arg3, 26289);
            int var6 = class645.method3656(class698.field9801, class515.field7102, arg0, 26289);
            class561.method3269(arg1, var6, 6408, arg2, var5);
        }
        if (arg4 >= -50) {
            method1067(71);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method1067(int arg0) {
        field2075 = null;
        field2072 = null;
        if (arg0 != -19572) {
            method1068(113, -27, 57);
        }
        field2071 = null;
        field2073 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z")
    public static final boolean method1068(int arg0, int arg1, int arg2) {
        field2070++;
        class416 var3 = class312.field4418.method369((byte) 125, arg2);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg1 == 12) {
            if (arg0 >= 5 && arg0 <= 8) {
                arg0 = 4;
            }
            return var3.method2456(arg0, 114);
        } else {
            return false;
        }
    }
}
