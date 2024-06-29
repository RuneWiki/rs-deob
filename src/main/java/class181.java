import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class181 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "[I")
    public static int[] field2276 = new int[2];

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2278 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I")
    public static final int method955(int arg0, byte arg1) {
        field2275++;
        class32 var2 = class321.method1849(arg0, (byte) 66);
        int var3 = var2.field322;
        if (arg1 == 35) {
            int var4 = var2.field320;
            int var5 = var2.field324;
            int var6 = class85.field946[var5 - var4];
            return var6 & class254.field3495[var3] >> var4;
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLfd;IIIIII)V")
    public static final void method956(byte arg0, class194 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class99.field1173) {
            class27.field266 = 32;
        } else {
            class27.field266 = 0;
        }
        if (arg0 < 51) {
            field2276 = null;
        }
        field2282++;
        class99.field1173 = false;
        if (class268.field3650 != 0) {
            if (arg4 <= arg2 && (arg4 + 16) > arg2 && arg3 <= arg6 && arg6 < arg3 + 16) {
                arg1.field2565 -= 4;
                class204.method1107(arg1, (byte) -110);
            } else if (arg4 <= arg2 && (arg4 + 16) > arg2 && arg3 + arg5 - 16 <= arg6 && arg3 + arg5 > arg6) {
                arg1.field2565 += 4;
                class204.method1107(arg1, (byte) -105);
            } else if (arg2 >= (arg4 - class27.field266) && arg4 + class27.field266 + 16 > arg2 && arg6 >= arg3 + 16 && arg3 + arg5 - 16 > arg6) {
                int var8 = (arg5 - 32) * arg5 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - (var8 / 2) - arg3 - 16;
                int var10 = arg5 - var8 - 32;
                arg1.field2565 = (arg7 - arg5) * var9 / var10;
                class204.method1107(arg1, (byte) -110);
                class99.field1173 = true;
            }
        }
        if (class46.field463 == 0) {
            return;
        }
        int var11 = arg1.field2501;
        if ((arg4 - var11) <= arg2 && arg6 >= arg3 && arg4 + 16 > arg2 && (arg3 + arg5) >= arg6) {
            arg1.field2565 += class46.field463 * 45;
            class204.method1107(arg1, (byte) -108);
            return;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(CB)C")
    public static final char method957(char arg0, byte arg1) {
        field2274++;
        if (arg1 > -82) {
            method955(102, (byte) -102);
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILam;)Lnl;")
    public static final class143 method958(int arg0, int arg1, class286 arg2) {
        if (arg1 > -34) {
            return null;
        } else {
            field2277++;
            byte[] var3 = arg2.method1699(arg0, 116);
            return var3 == null ? null : new class143(var3);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lam;B)V")
    public static final void method959(class286 arg0, byte arg1) {
        class421.field6184 = arg0;
        if (arg1 <= -28) {
            field2279++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method960(byte arg0) {
        if (arg0 != -122) {
            method959((class286) null, (byte) -7);
        }
        field2278 = null;
        field2276 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
    public static final void method961(boolean arg0, int arg1) {
        class448.field6515 = new int[arg1];
        class204.field2748 = new int[arg1];
        field2280++;
        field2276 = new int[arg1];
        class434.field6346 = new int[arg1];
        if (!arg0) {
            class143.field1826 = new int[arg1];
        }
    }
}
