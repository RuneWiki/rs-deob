import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class239 extends class312 {

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field3279 = 1;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field3278 = -1;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Lfg;")
    public static class83 field3280 = new class83("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Ljm;")
    public static class485 field3284 = new class485(24, 3);

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "Ltk;")
    public static class228 field3285 = new class228(13, 0, 1, 0);

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "[Lep;")
    public static class288[] field3286 = new class288[30];

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "Z")
    public static boolean field3287 = false;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field3288 = 0;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field3282;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIBIIIIIII)V", line = 3)
    public static final void method1384(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3283++;
        if (arg8 < 128 || arg7 < 128 || arg8 > (class442.field6435 - 2) * 128 || class232.field3217 * 128 - 256 < arg7) {
            class172.field2457[0] = class172.field2457[1] = -1;
            return;
        }
        int var10 = class186.method1118(arg8, arg7, 12840, arg5) - arg3;
        class500.field7351.method335(arg1, 0, 0);
        int var11 = -16 / ((75 - arg2) / 34);
        class418.field6109.method437(class500.field7351);
        class418.field6109.method533(arg8, var10, arg7, class172.field2457);
        class500.field7351.method335(-arg1, 0, 0);
        class418.field6109.method437(class500.field7351);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V", line = 44)
    public static final void method1385(int arg0, int arg1, int arg2) {
        boolean var3 = class385.field5410[0][arg1][arg2] != null && class385.field5410[0][arg1][arg2].field834 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class385.field5410[var4][arg1][arg2] == null) {
                class61 var5 = class385.field5410[var4][arg1][arg2] = new class61(var4, arg1, arg2);
                if (var3) {
                    var5.field836++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Z", line = 66)
    public static final boolean method1386(int arg0) {
        field3281++;
        class149 var1 = (class149) class260.field3585.field7697.field7339;
        if (var1 == null || class260.field3585.field7697 == var1) {
            return false;
        } else if (arg0 >= -87) {
            return true;
        } else {
            if (var1.field2102 >= 2000) {
                var1.field2102 -= 2000;
            }
            return var1.field2102 == 1010;
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V", line = 95)
    public static void method1387(int arg0) {
        field3286 = null;
        field3280 = null;
        field3285 = null;
        if (arg0 <= 46) {
            method1384(102, -16, (byte) -50, 91, -41, -75, 53, 119, -45, -55);
        }
        field3282 = null;
        field3284 = null;
    }
}
