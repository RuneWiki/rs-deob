import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class230 {

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!cha", name = "f", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!cha", name = "g", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!cha", name = "e", descriptor = "Ljb;")
    public static class519 field2959;

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "[[Lofa;")
    public static class347[][] field2956;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(IBLofa;)I", line = 4)
    public static final int method1447(int arg0, byte arg1, class347 arg2) {
        field2957++;
        if (arg1 != -116) {
            method1451((byte) -75);
        }
        if (!client.method2055(arg2).method2116(arg0, 0) && arg2.field4941 == null) {
            return -1;
        } else if (arg2.field4989 == null || arg0 >= arg2.field4989.length) {
            return -1;
        } else {
            return arg2.field4989[arg0];
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lha;B)V", line = 25)
    public static final void method1448(class66 arg0, byte arg1) {
        field2955++;
        class743.field10052 = new class14[class436.field6312.length];
        if (arg1 != -6) {
            field2956 = null;
        }
        for (int var2 = 0; var2 < class436.field6312.length; var2++) {
            int var3 = class436.field6312[var2];
            class651 var4 = class588.method3309(true, var3, class220.field2857);
            class67 var5 = arg0.method502(var4, class162.method1124(class574.field7828, var3), true);
            class743.field10052[var2] = new class14(var5, var4);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lcm;I)V", line = 55)
    public static final void method1449(class758 arg0, int arg1) {
        field2958++;
        class119 var2 = (class119) class310.field4390.method1248(109, (long) arg0.field6146);
        if (var2 != null) {
            if (var2.field1599 != null) {
                class701.field9285.method22(var2.field1599);
                var2.field1599 = null;
            }
            var2.method1102((byte) 81);
        }
        if (arg1 != 0) {
            field2956 = null;
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BIIIIIII)V", line = 82)
    public static final void method1450(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2960++;
        if (arg0 != 96) {
            field2959 = null;
        }
        int var8 = class269.method1790(arg3, class233.field3099, class291.field4156, 13094);
        int var9 = class269.method1790(arg5, class233.field3099, class291.field4156, 13094);
        int var10 = class269.method1790(arg7, class45.field472, class297.field4199, 13094);
        int var11 = class269.method1790(arg1, class45.field472, class297.field4199, 13094);
        int var12 = class269.method1790(arg3 + arg6, class233.field3099, class291.field4156, 13094);
        int var13 = class269.method1790(arg5 - arg6, class233.field3099, class291.field4156, 13094);
        for (int var14 = var8; var14 < var12; var14++) {
            class464.method2733(arg4, var10, var11, -22816, class228.field2951[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class464.method2733(arg4, var10, var11, arg0 - 22912, class228.field2951[var15]);
        }
        int var16 = class269.method1790(arg6 + arg7, class45.field472, class297.field4199, 13094);
        int var17 = class269.method1790(arg1 - arg6, class45.field472, class297.field4199, 13094);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class228.field2951[var18];
            class464.method2733(arg4, var10, var16, arg0 ^ 0xFFFFA680, var19);
            class464.method2733(arg2, var16, var17, -22816, var19);
            class464.method2733(arg4, var17, var11, arg0 - 22912, var19);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V", line = 135)
    public static void method1451(byte arg0) {
        field2959 = null;
        field2956 = null;
        if (arg0 != -79) {
            method1449(null, 78);
        }
    }
}
