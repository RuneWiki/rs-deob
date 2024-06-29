import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class168 extends class180 {

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field2491 = 0;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Ltm;")
    public static class112 field2490 = new class112("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 6)
    public static final int method1039(String arg0, boolean arg1) {
        if (arg1) {
            field2490 = null;
        }
        field2492++;
        return class260.method1608(arg0, -94, 10, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V", line = 31)
    public static final void method1040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2493++;
        if (arg5 != -20002) {
            field2494 = 118;
        }
        int var8 = class229.method1443(class53.field874, arg0, class8.field174, (byte) -68);
        int var9 = class229.method1443(class53.field874, arg6, class8.field174, (byte) -68);
        int var10 = class229.method1443(class299.field4121, arg3, class248.field3487, (byte) -68);
        int var11 = class229.method1443(class299.field4121, arg2, class248.field3487, (byte) -68);
        int var12 = class229.method1443(class53.field874, arg0 + arg7, class8.field174, (byte) -68);
        int var13 = class229.method1443(class53.field874, arg6 - arg7, class8.field174, (byte) -68);
        for (int var14 = var8; var14 < var12; var14++) {
            class80.method554(class2.field16[var14], 111, arg4, var11, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class80.method554(class2.field16[var15], 123, arg4, var11, var10);
        }
        int var16 = class229.method1443(class299.field4121, arg3 + arg7, class248.field3487, (byte) -68);
        int var17 = class229.method1443(class299.field4121, arg2 - arg7, class248.field3487, (byte) -68);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class2.field16[var18];
            class80.method554(var19, 112, arg4, var16, var10);
            class80.method554(var19, 106, arg1, var17, var16);
            class80.method554(var19, 127, arg4, var11, var17);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;)I", line = 84)
    public static final int method1041(byte arg0, String arg1) {
        field2495++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 <= 66) {
            return 100;
        } else {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) + class161.method977((byte) -72, arg1.charAt(var4)) - var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 109)
    public static void method1042(int arg0) {
        if (arg0 != -13325) {
            method1040(-77, -43, -108, -3, -128, 95, -60, 115);
        }
        field2490 = null;
    }
}
