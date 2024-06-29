import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class193 {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Ldd;")
    private static class35 field3865 = class180.method1196((byte) -25, "Loaded wordpack");

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Ldd;")
    public static class35 field3863 = field3865;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3864 = 0;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Ldd;")
    public static class35 field3866 = class180.method1196((byte) 126, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Ldd;")
    public static class35 field3869 = class180.method1196((byte) -8, "welle2:");

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Ldd;")
    public static class35 field3872 = class180.method1196((byte) -34, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lag;")
    public static class8 field3862;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
    public static boolean field3870;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[[I)V")
    public static final void method1260(int arg0, int[][] arg1) {
        field3861++;
        if (arg0 != 1345804752) {
            method1262(34, 61, -103, -29, null, null, 61, -3, -123, 7, -72L);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)Z")
    public static final boolean method1261(byte arg0, int arg1) {
        field3871++;
        if (class52.field1192[arg1]) {
            return true;
        } else if (class69.field1674.method65((byte) 88, arg1)) {
            int var2 = class69.field1674.method56((byte) 31, arg1);
            if (var2 == 0) {
                class52.field1192[arg1] = true;
                return true;
            }
            if (class163.field3299[arg1] == null) {
                class163.field3299[arg1] = new class55[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class163.field3299[arg1][var3] == null) {
                    byte[] var4 = class69.field1674.method39(arg1, arg0 ^ 0xFFFFFF90, var3);
                    if (var4 != null) {
                        class163.field3299[arg1][var3] = new class55();
                        class163.field3299[arg1][var3].field1383 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class163.field3299[arg1][var3].method483((byte) 122, new class26(var4));
                        } else {
                            class163.field3299[arg1][var3].method481(new class26(var4), false);
                        }
                    }
                }
            }
            if (arg0 != 111) {
                method1262(7, 116, -33, -122, null, null, 67, -101, -100, -81, -87L);
            }
            class52.field1192[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIILlc;Llc;IIIIJ)V")
    public static final void method1262(int arg0, int arg1, int arg2, int arg3, class110 arg4, class110 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class150 var12 = new class150();
        var12.field3139 = arg10;
        var12.field3132 = arg1 * 128 + 64;
        var12.field3126 = arg2 * 128 + 64;
        var12.field3135 = arg3;
        var12.field3137 = arg4;
        var12.field3121 = arg5;
        var12.field3142 = arg6;
        var12.field3124 = arg7;
        var12.field3125 = arg8;
        var12.field3138 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class191.field3853[var13][arg1][arg2] == null) {
                class191.field3853[var13][arg1][arg2] = new class54(var13, arg1, arg2);
            }
        }
        class191.field3853[arg0][arg1][arg2].field1231 = var12;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1263(int arg0) {
        field3869 = null;
        field3872 = null;
        field3862 = null;
        if (arg0 != 20086) {
            method1264(-37);
        }
        field3866 = null;
        field3863 = null;
        field3865 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static final void method1264(int arg0) {
        field3867++;
        for (int var1 = 0; var1 < class175.field3579; var1++) {
            int var2 = class165.field3327[var1];
            class102 var3 = class51.field1154[var2];
            int var4 = class172.field3441.method221(-81);
            if ((var4 & 0x8) != 0) {
                var4 += class172.field3441.method221(-119) << 8;
            }
            class184.method1223(var4, var2, var3, false);
        }
        if (arg0 <= 48) {
            method1264(-16);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIJZ)Ldd;")
    public static final class35 method1265(int arg0, int arg1, long arg2, boolean arg3) {
        field3868++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 1;
        for (long var6 = arg2 / (long) arg0; var6 != 0L; var6 /= arg0) {
            var5++;
        }
        int var8 = var5;
        if (arg2 < 0L || arg3) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg3) {
            var9[0] = 43;
        }
        if (arg1 >= -66) {
            field3866 = null;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg2 % (long) arg0);
            if (var12 < 0) {
                var12 = -var12;
            }
            arg2 /= arg0;
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class35 var11 = new class35();
        var11.field730 = var9;
        var11.field758 = var8;
        return var11;
    }
}
