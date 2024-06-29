import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class22 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lli;")
    private static class185 field373 = class245.method1649("Loading interfaces )2 ", 123);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lli;")
    public static class185 field369 = field373;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lli;")
    public static class185 field371 = class245.method1649("Fichiers config charg-Bs", -124);

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lli;")
    public static class185 field376 = class245.method1649("::fpson", 127);

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Lli;")
    public static class185 field375 = class245.method1649(" s(West connect-B)3", 122);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBIIIILjd;ZI)V")
    public static final void method155(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class118 arg6, boolean arg7, int arg8) {
        if (arg1 != -77) {
            method156((byte) -89);
        }
        field372++;
        if (arg3 < 0 || arg3 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var11 = arg6.method867(false);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg6.method867(false);
                    return;
                }
                if (var11 <= 49) {
                    arg6.method867(false);
                }
            }
        }
        if (!arg7) {
            class239.field4262[arg8][arg3][arg5] = 0;
        }
        while (true) {
            int var9 = arg6.method867(false);
            if (var9 == 0) {
                if (arg7) {
                    class201.field3694[0][arg3][arg5] = class60.field1075[0][arg3][arg5];
                    return;
                } else if (arg8 == 0) {
                    class201.field3694[0][arg3][arg5] = -class69.method455(arg2 + arg3 + 932731, arg1 + 19, arg4 + arg5 + 556238) * 8;
                    return;
                } else {
                    class201.field3694[arg8][arg3][arg5] = class201.field3694[arg8 - 1][arg3][arg5] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg6.method867(false);
                if (arg7) {
                    class201.field3694[0][arg3][arg5] = var10 * 8 + class60.field1075[0][arg3][arg5];
                    return;
                }
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg8 == 0) {
                    class201.field3694[0][arg3][arg5] = -var10 * 8;
                    return;
                }
                class201.field3694[arg8][arg3][arg5] = class201.field3694[arg8 - 1][arg3][arg5] - (var10 * 8);
                return;
            }
            if (var9 <= 49) {
                class38.field611[arg8][arg3][arg5] = arg6.method838(1275919136);
                class178.field3253[arg8][arg3][arg5] = (byte) ((var9 - 2) / 4);
                class235.field4216[arg8][arg3][arg5] = (byte) class220.method1526(arg0 + var9 - 2, 3);
            } else if (var9 > 81) {
                class239.field4267[arg8][arg3][arg5] = (byte) (var9 - 81);
            } else if (!arg7) {
                class239.field4262[arg8][arg3][arg5] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method156(byte arg0) {
        field376 = null;
        int var1 = -74 % ((59 - arg0) / 62);
        field373 = null;
        field375 = null;
        field371 = null;
        field369 = null;
    }
}
