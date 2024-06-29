import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class202 {

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lr;")
    private static class66 field3471 = class93.method641(43, "Examine");

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lr;")
    public static class66 field3466 = field3471;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    public static int[] field3469;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[[I)V")
    public static final void method1307(int arg0, int[][] arg1) {
        class15.field183 = arg1;
        if (arg0 != 128) {
            method1310(-15, -16, 76, (class28) null);
        }
        field3467++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1308(int arg0) {
        field3466 = null;
        field3471 = null;
        field3469 = null;
        if (arg0 >= -32) {
            method1310(97, -124, 127, (class28) null);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static final void method1309(int arg0) {
        for (int var1 = 0; var1 < class87.field1699; var1++) {
            class173 var3 = class261.method1779(-85, var1);
            if (var3 != null && var3.field3049 == 0) {
                class214.field3678[var1] = 0;
                class89.field1726[var1] = 0;
            }
        }
        int var2 = -112 % ((arg0 + 72) / 51);
        field3465++;
        class60.field1017 = new class215(16);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIILcj;)Ljb;")
    public static final class256 method1310(int arg0, int arg1, int arg2, class28 arg3) {
        field3470++;
        if (arg0 == 64) {
            return class31.method174(-29381, arg1, arg3, arg2) ? class211.method1368((byte) -109) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIILa;La;IIJ)V")
    public static final void method1311(int arg0, int arg1, int arg2, int arg3, class20 arg4, class20 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class47 var10 = new class47();
        var10.field853 = arg8;
        var10.field851 = arg1 * 128 + 64;
        var10.field844 = arg2 * 128 + 64;
        var10.field854 = arg3;
        var10.field849 = arg4;
        var10.field852 = arg5;
        var10.field855 = arg6;
        var10.field845 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class110.field2124[var11][arg1][arg2] == null) {
                class110.field2124[var11][arg1][arg2] = new class16(var11, arg1, arg2);
            }
        }
        class110.field2124[arg0][arg1][arg2].field205 = var10;
    }
}
