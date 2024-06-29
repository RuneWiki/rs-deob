import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class126 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lib;")
    public static class106 field1841;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lfs;")
    public static class387 field1843;

    static {
        new class331("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field1841 = new class106(32);
        field1842 = 100;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 4)
    public static final void method987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field1839++;
        if (class131.field1899 == null) {
            return;
        }
        class121 var15;
        if (arg6 < 0) {
            int var14 = -arg6 - 1;
            if (class396.field5815 == var14) {
                var15 = class435.field6375;
            } else {
                var15 = class384.field5647[var14];
            }
        } else {
            int var16 = arg6 - 1;
            var15 = class250.field3690[var16];
        }
        if (var15 == null) {
            return;
        }
        class222 var17 = class384.field5645.method786(arg11, 0);
        int var18;
        int var19;
        if (arg2 == 1 || arg2 == 3) {
            var19 = var17.field3180;
            var18 = var17.field3206;
        } else {
            var18 = var17.field3180;
            var19 = var17.field3206;
        }
        int var20 = (var19 >> 1) + arg0;
        int var21 = arg0 + (var19 + 1 >> 1);
        int var22 = (var18 >> 1) + arg10;
        int var23 = 25 / ((arg3 - 28) / 35);
        int var24 = (var18 + 1 >> 1) + arg10;
        class142 var25 = class131.field1899[arg8];
        int var26 = var25.method430(var20, var22) + var25.method430(var21, var22) + var25.method430(var20, var24) + var25.method430(var21, var24) >> 2;
        class161 var27 = new class161();
        var27.field2262 = class263.field3867 + arg12;
        var27.field2266 = arg13;
        var27.field2274 = class263.field3867 + arg1;
        var27.field2267 = var15.field6328;
        var27.field2261 = arg2;
        if (arg4 > arg9) {
            int var28 = arg4;
            arg4 = arg9;
            arg9 = var28;
        }
        var27.field2259 = arg0;
        var27.field2265 = arg11;
        var27.field2264 = arg10;
        if (arg5 < arg7) {
            int var29 = arg7;
            arg7 = arg5;
            arg5 = var29;
        }
        var27.field2276 = arg0 + arg9;
        var27.field2272 = arg0 + arg4;
        var27.field2275 = (var27.field2264 << 7) + (var18 << 6);
        var27.field2263 = arg7 + arg10;
        var27.field2271 = arg5 + arg10;
        var27.field2258 = var26;
        var27.field2269 = (var27.field2259 << 7) + (var19 << 6);
        class464.field6825.method1015(false, var27);
        var15.field1780 = var27;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 102)
    public static final void method988(byte arg0) {
        field1840++;
        int var1 = 44 % ((11 - arg0) / 56);
        if (class419.field6186.toLowerCase().indexOf("microsoft") != -1) {
            class523.field7685[221] = 43;
            class523.field7685[186] = 57;
            class523.field7685[189] = 26;
            class523.field7685[220] = 74;
            class523.field7685[187] = 27;
            class523.field7685[222] = 59;
            class523.field7685[192] = 58;
            class523.field7685[219] = 42;
            class523.field7685[190] = 72;
            class523.field7685[191] = 73;
            class523.field7685[188] = 71;
            class523.field7685[223] = 28;
            return;
        }
        if (class419.field6193 == null) {
            class523.field7685[222] = 59;
            class523.field7685[192] = 58;
        } else {
            class523.field7685[192] = 28;
            class523.field7685[520] = 59;
            class523.field7685[222] = 58;
        }
        class523.field7685[91] = 42;
        class523.field7685[46] = 72;
        class523.field7685[61] = 27;
        class523.field7685[93] = 43;
        class523.field7685[47] = 73;
        class523.field7685[59] = 57;
        class523.field7685[92] = 74;
        class523.field7685[45] = 26;
        class523.field7685[44] = 71;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 153)
    public static void method989(boolean arg0) {
        if (arg0) {
            field1842 = -73;
        }
        field1841 = null;
        field1843 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public abstract void method924(byte arg0);

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)J")
    public abstract long method921(byte arg0);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)I")
    public abstract int method923(boolean arg0, int arg1);
}
