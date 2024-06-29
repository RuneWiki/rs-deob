import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class174 extends class320 {

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field2764 = 0;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field2761 = -1;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "Ljava/lang/String;")
    public static String field2762 = "Continue";

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "[I")
    public static int[] field2760;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V", line = 7)
    public static void method1364(int arg0) {
        if (arg0 != 1) {
            method1366(-94, (byte) 126);
        }
        field2760 = null;
        field2762 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIILqf;IZJ)Z", line = 18)
    public static final boolean method1365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class64 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class93.field1425 == class277.field4290;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class154.field2492 || var16 >= class166.field2642) {
                    return false;
                }
                class329 var17 = class170.field2689[arg0][var15][var16];
                if (var17 != null && var17.field5063 >= 5) {
                    return false;
                }
            }
        }
        class297 var18 = new class297();
        var18.field4611 = arg11;
        var18.field4617 = arg0;
        var18.field4609 = arg5;
        var18.field4604 = arg6;
        var18.field4615 = arg7;
        var18.field4605 = arg8;
        var18.field4600 = arg9;
        var18.field4616 = arg1;
        var18.field4614 = arg2;
        var18.field4606 = arg1 + arg3 - 1;
        var18.field4612 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class170.field2689[var22][var19][var20] == null) {
                        class170.field2689[var22][var19][var20] = new class329(var22, var19, var20);
                    }
                }
                class329 var23 = class170.field2689[arg0][var19][var20];
                var23.field5070[var23.field5063] = var18;
                var23.field5077[var23.field5063] = var21;
                var23.field5053 |= var21;
                var23.field5063++;
                if (var13 && class332.field5096[var19][var20] != 0) {
                    var14 = class332.field5096[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class332.field5096[var24][var25] == 0) {
                        class332.field5096[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class190.field2980[class301.field4680++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IB)V", line = 145)
    public static final void method1366(int arg0, byte arg1) {
        if (arg1 > 12) {
            field2765++;
            class138 var2 = class149.method1242(arg0, 0, 5);
            var2.method1152(126);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIII)V", line = 170)
    public static final void method1367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2763++;
        if (arg2 != 15112) {
            field2762 = (String) null;
        }
        class186.method1434(false, arg3, arg6, 0, arg4, arg7, arg1, arg0, arg5);
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method464(byte arg0);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)Z")
    public abstract boolean method463(int arg0);
}
