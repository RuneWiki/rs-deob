import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class222 {

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "Z")
    public static boolean field3744 = false;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Lss;")
    public static class213 field3748 = new class213("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field3750 = 100;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "[Lli;")
    public static class135[] field3745;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIBII)I")
    public static final int method1616(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3749++;
        int var7 = arg0 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg6;
        }
        if (arg4 != 47) {
            method1619(-7, 112, 29, 23, 119, -116, -48);
        }
        if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 1 + 7 - arg5 - arg6;
        } else {
            return 7 - arg1 - (arg2 + -1);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
    public static void method1617(boolean arg0) {
        field3748 = null;
        if (!arg0) {
            method1616(53, -47, -70, -27, (byte) 121, 76, 123);
        }
        field3745 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BIIIII)V")
    public static final void method1618(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3746++;
        if (arg4 == arg5) {
            class184.method1155(arg2, arg1, arg3, arg5, 125);
            return;
        }
        if (arg0 != 48) {
            method1617(false);
        }
        if (class178.field2609 <= (arg1 - arg5) && class460.field7096 >= arg1 + arg5 && arg3 - arg4 >= class462.field7105 && (arg3 + arg4) <= field3750) {
            class472.method2935(arg4, arg2, arg5, arg3, arg1, 7974);
        } else {
            class301.method2028(arg4, (byte) 32, arg3, arg1, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3747++;
        int var7 = class405.method2598(field3750, class462.field7105, arg0, (byte) 80);
        int var8 = class405.method2598(field3750, class462.field7105, arg6, (byte) 107);
        int var9 = class405.method2598(class460.field7096, class178.field2609, arg2, (byte) 77);
        int var10 = class405.method2598(class460.field7096, class178.field2609, arg3, (byte) 104);
        int var11 = class405.method2598(field3750, class462.field7105, arg0 + arg1, (byte) 109);
        int var12 = class405.method2598(field3750, class462.field7105, arg6 - arg1, (byte) 124);
        for (int var13 = var7; var13 < var11; var13++) {
            class280.method1888(var9, var10, (byte) 82, class103.field1521[var13], arg4);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class280.method1888(var9, var10, (byte) 82, class103.field1521[var14], arg4);
        }
        int var15 = class405.method2598(class460.field7096, class178.field2609, arg1 + arg2, (byte) 119);
        int var16 = class405.method2598(class460.field7096, class178.field2609, arg3 - arg1, (byte) 124);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class103.field1521[var17];
            class280.method1888(var9, var15, (byte) 82, var18, arg4);
            class280.method1888(var16, var10, (byte) 82, var18, arg4);
        }
        if (arg5 < 69) {
            method1616(44, -85, -52, 73, (byte) 77, 125, 57);
        }
    }
}
