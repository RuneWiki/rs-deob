import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class60 extends class145 {

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lmb;")
    public static class132 field1021 = class166.method1092("Registrierter Benutzer", 126);

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "[I")
    public static int[] field1020 = new int[25];

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lmb;")
    public static class132 field1022 = class166.method1092("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 127);

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "[I")
    public static int[] field1019 = new int[200];

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[S")
    public static short[] field1023 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "[S")
    public static short[] field1026 = new short[] { 21, 30, 10, 45, 13, 46, 48, 12 };

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Lmb;")
    public static class132 field1025 = class166.method1092("Okay", 119);

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lmb;")
    public static class132 field1027 = class166.method1092("Ung-Ultiger Benutzername", 123);

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lmb;")
    public static class132 field1018 = class166.method1092("<)4col>", 121);

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lpb;")
    public static class165 field1024;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method393(int arg0) {
        field1021 = null;
        if (arg0 != 25) {
            return;
        }
        field1024 = null;
        field1023 = null;
        field1020 = null;
        field1025 = null;
        field1018 = null;
        field1022 = null;
        field1027 = null;
        field1026 = null;
        field1019 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class24.field348[arg0][var8][var14] == -class33.field520) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class78.field1364[arg0][arg1][arg3] + arg5;
            if (!class136.method928(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class136.method928(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class136.method928(var9, var11, var13)) {
                return false;
            } else if (class136.method928(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class145.method973(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class136.method928(var6 + 1, class78.field1364[arg0][arg1][arg3] + arg5, var7 + 1) && class136.method928(var6 + 128 - 1, class78.field1364[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class136.method928(var6 + 128 - 1, class78.field1364[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class136.method928(var6 + 1, class78.field1364[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
