import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class341 extends class311 {

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Z")
    public static boolean field4607 = true;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field4610 = 10;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field4605 = new String[100];

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "[I")
    public static int[] field4614 = new int[500];

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "Lhc;")
    public static class368 field4615 = new class368("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "[[[Lr;")
    public static class63[][][] field4617;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lea;Lfk;IILqg;IILwk;)V", line = 3)
    public static final void method2077(class58 arg0, class23 arg1, int arg2, int arg3, class157 arg4, int arg5, int arg6, class430 arg7) {
        field4606++;
        int var8 = arg4.field2227 - (arg5 / 2 + 5);
        if (arg2 != 10) {
            field4617 = null;
        }
        int var9 = arg6 + 2;
        if (arg7.field6002 != 0) {
            arg0.method461(arg5 + 10, arg7.field6002, arg6 + arg1.method142() * arg3 + (-var9 - -1), -91, var8, var9);
        }
        if (arg7.field6008 != 0) {
            arg0.method460((byte) 48, var8, arg7.field6008, arg5 + 10, arg1.method142() * arg3 + arg6 + -var9 - -1, var9);
        }
        int var10 = arg7.field6000;
        if (arg4.field2236 && arg7.field5986 != -1) {
            var10 = arg7.field5986;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            String var12 = class274.field3751[var11];
            if ((arg3 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg1.method141(arg0, var12, arg4.field2227, arg6, var10, true);
            arg6 += arg1.method142();
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V", line = 53)
    public static void method2078(int arg0) {
        field4605 = null;
        field4615 = null;
        if (arg0 != 5158) {
            method2083(-117, -90, 84, -76, -57, -73, -70, -37);
        }
        field4617 = null;
        field4614 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 70)
    public static final void method2079(String arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            return;
        }
        class108.field1526++;
        class88.field1232.method1151(245, (byte) -94);
        field4611++;
        class88.field1232.method2280(class82.method662(12189, arg0) + 1, 1537846408);
        class88.field1232.method2280(arg2, 1537846408);
        class88.field1232.method2285(arg0, (byte) -97);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V", line = 88)
    public static final void method2080(int arg0, int arg1) {
        field4608++;
        class113.field1742.method2531(arg1, 112);
        if (arg0 != -20063) {
            method2078(-83);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V", line = 99)
    public static final void method2081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 9943) {
            method2080(62, -87);
        }
        if (class80.field1119 <= arg0 && arg1 <= class430.field6003 && class143.field2090 <= arg5 && arg2 <= class42.field543) {
            class278.method1752(arg3, 20, arg0, arg1, arg5, arg2);
        } else {
            class246.method1600((byte) 80, arg1, arg2, arg0, arg5, arg3);
        }
        field4613++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLvg;)V", line = 125)
    public static final void method2082(boolean arg0, class108 arg1) {
        if (!arg0) {
            return;
        }
        field4609++;
        class108 var2 = class452.method2820(arg1, (byte) -57);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class396.field5493;
            var4 = class373.field5174;
        } else {
            var3 = var2.field1577;
            var4 = var2.field1568;
        }
        class317.method1938(false, arg1, var4, var3, -6754);
        class75.method579(var4, -17642, var3, arg1);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIII)V", line = 160)
    public static final void method2083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4604++;
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class139.field2035 + ((class80.field1115 - class139.field2035) * var8 / 100);
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg1 & 0x3FFF;
        int var13 = 0;
        int var14 = arg3;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class136.field2021[var11] * -var10 >> 15;
            var15 = class136.field2020[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class136.field2021[var12] * var15 >> 15;
            var15 = class136.field2020[var12] * var15 >> 15;
        }
        class103.field1426 = 0;
        class104.field1433 = arg6 - var14;
        class389.field5410 = arg0;
        class63.field874 = arg5 - var13;
        class375.field5213 = arg4 - var15;
        class86.field1208 = arg1;
    }
}
