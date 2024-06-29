import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class184 extends class106 {

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field3605 = 0;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Lrd;")
    public static class173 field3603 = class133.method843("settings=", -113);

    @OriginalMember(owner = "client!se", name = "B", descriptor = "Lof;")
    public static class145 field3609 = new class145();

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "La;")
    public static class1 field3610;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1245(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3607++;
        if (arg1 <= 57) {
            field3603 = null;
        }
        int var7 = class68.method421(arg3, class37.field790, 123, class20.field445);
        int var8 = class68.method421(arg5, class37.field790, 77, class20.field445);
        int var9 = class68.method421(arg2, class194.field3778, -55, class96.field1766);
        int var10 = class68.method421(arg6, class194.field3778, 51, class96.field1766);
        int var11 = class68.method421(arg3 + arg4, class37.field790, -56, class20.field445);
        int var12 = class68.method421(arg5 - arg4, class37.field790, -121, class20.field445);
        for (int var13 = var7; var13 < var11; var13++) {
            class51.method350(var9, arg0, (byte) -128, class107.field1998[var13], var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class51.method350(var9, arg0, (byte) -118, class107.field1998[var14], var10);
        }
        int var15 = class68.method421(arg2 + arg4, class194.field3778, 110, class96.field1766);
        int var16 = class68.method421(arg6 - arg4, class194.field3778, -127, class96.field1766);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class107.field1998[var17];
            class51.method350(var9, arg0, (byte) -124, var18, var15);
            class51.method350(var16, arg0, (byte) -118, var18, var10);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static final void method1246(byte arg0) {
        field3604++;
        class20.field458 = null;
        class55.field1099 = null;
        if (arg0 != 31) {
            method1245(-65, (byte) -4, 126, -19, -42, -36, 81);
        }
        class30.field622 = null;
        class112.field2074 = null;
        class97.field1775 = null;
        class188.field3676 = null;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
    public static void method1247(int arg0) {
        field3609 = null;
        field3603 = null;
        field3610 = null;
        if (arg0 != 0) {
            field3610 = null;
        }
    }
}
