import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class137 extends class67 {

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3302 = 0;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lrd;")
    private static class114 field3303 = class84.method656("Enter message to send to ", (byte) 122);

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "Lrd;")
    private static class114 field3304 = class84.method656("purple:", (byte) 114);

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Lrd;")
    private static class114 field3307 = class84.method656("No reply from loginserver)3", (byte) 122);

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "Lrd;")
    public static class114 field3314 = field3303;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Lrd;")
    public static class114 field3316 = field3307;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3311 = 0;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lrd;")
    public static class114 field3308 = class84.method656("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", (byte) 116);

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lrd;")
    private static class114 field3319 = class84.method656("go back to the main RuneScape webpage", (byte) 116);

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Lrd;")
    public static class114 field3312 = field3319;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "Lrd;")
    public static class114 field3320 = class84.method656(": ", (byte) 123);

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "Lrd;")
    private static class114 field3309 = class84.method656("Loading title screen )2 ", (byte) 125);

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lrd;")
    public static class114 field3313 = field3309;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Lrd;")
    public static class114 field3310 = field3304;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Lrd;")
    public class114 field3315;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "Lke;")
    public static class73 field3318;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIB)I")
    public static final int method1110(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 37) {
            return -28;
        }
        field3317++;
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class22.field430[1][var5][var4] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var8) * class124.field2958[var6][var5][var4] + class124.field2958[var6][var5 + 1][var4] * var8 >> 7;
        int var10 = (128 - var8) * class124.field2958[var6][var5][var4 + 1] + class124.field2958[var6][var5 + 1][var4 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[Lnc;IIIIII[B)V")
    public static final void method1111(int arg0, int arg1, class89[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg7 + var15 > 0 && arg7 + var15 < 103) {
                    arg2[arg8].field1983[arg1 + var10][arg7 + var15] = class96.method737(arg2[arg8].field1983[arg1 + var10][arg7 + var15], -16777217);
                }
            }
        }
        field3306++;
        class60 var11 = new class60(arg9);
        if (arg6 > -56) {
            field3311 = 0;
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg0 == var12 && var13 >= arg3 && arg3 + 8 > var13 && arg4 <= var14 && arg4 + 8 > var14) {
                        class126.method979(arg5, arg1 + class10.method77((byte) -89, var14 & 0x7, arg5, var13 & 0x7), 0, var11, 0, 49, class47.method344(var13 & 0x7, 255, var14 & 0x7, arg5) + arg7, arg8);
                    } else {
                        class126.method979(0, -1, 0, var11, 0, 49, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(Z)V")
    public static void method1112(boolean arg0) {
        field3308 = null;
        field3307 = null;
        field3316 = null;
        field3314 = null;
        field3319 = null;
        field3318 = null;
        field3310 = null;
        if (!arg0) {
            return;
        }
        field3309 = null;
        field3320 = null;
        field3312 = null;
        field3304 = null;
        field3313 = null;
        field3303 = null;
    }
}
