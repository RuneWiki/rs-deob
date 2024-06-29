import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class28 extends class97 {

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "[I")
    public static int[] field358 = new int[250];

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field361 = 0;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "Z")
    public static boolean field363 = false;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "[I")
    public static int[] field367 = new int[5];

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Z")
    public static boolean field364 = false;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "Lnn;")
    public static class151 field365 = new class151("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lkr;")
    public class234 field362;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Z")
    public boolean field360;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILsc;II)Ljava/awt/Frame;")
    public static final Frame method162(int arg0, int arg1, int arg2, class239 arg3, int arg4, int arg5) {
        field366++;
        if (!arg3.method1437(true)) {
            return null;
        }
        if (arg0 == arg1) {
            class411[] var6 = class289.method1784(16382, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field6118 == arg5 && var6[var8].field6122 == arg2 && (arg4 == 0 || var6[var8].field6123 == arg4) && (!var7 || var6[var8].field6125 > arg1)) {
                    arg1 = var6[var8].field6125;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class211 var9 = arg3.method1464(arg1, arg5, arg2, arg4, (byte) -36);
        while (var9.field3172 == 0) {
            class109.method674((byte) 99, 10L);
        }
        Frame var10 = (Frame) var9.field3175;
        if (var10 == null) {
            return null;
        } else if (var9.field3172 == 2) {
            class187.method1139(var10, 0, arg3);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIIIIILef;ZIIII)V")
    public static final void method163(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class385 arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field359++;
        if (arg9 == 1) {
            arg8 = 1;
        } else if (arg9 == 2) {
            arg10 = 1;
            arg8 = 1;
        } else if (arg9 == 3) {
            arg10 = 1;
        }
        if (arg5 != -50) {
            field365 = null;
        }
        if (arg2 < 0 || arg2 >= class115.field1522 || arg4 < 0 || class198.field3004 <= arg4) {
            while (true) {
                int var14 = arg6.method2343(255);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg6.method2343(255);
                    return;
                }
                if (var14 <= 49) {
                    arg6.method2343(255);
                }
            }
        }
        if (!arg0 && !arg7) {
            class341.field5085[arg1][arg2][arg4] = 0;
        }
        while (true) {
            int var12 = arg6.method2343(arg5 + 305);
            if (var12 == 0) {
                if (arg0) {
                    class355.field5243[0][arg2 + arg10][arg4 + arg8] = class85.field1201[0].method92(arg2 + arg10, arg4 - -arg8);
                    return;
                } else if (arg1 == 0) {
                    class355.field5243[0][arg2 + arg10][arg4 + arg8] = -class403.method2538(24632, arg11 + 556238, arg3 + 932731) * 8;
                    return;
                } else {
                    class355.field5243[arg1][arg2 + arg10][arg4 + arg8] = class355.field5243[arg1 - 1][arg2 + arg10][arg4 + arg8] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg6.method2343(255);
                if (arg0) {
                    class355.field5243[0][arg2 + arg10][arg4 + arg8] = class85.field1201[0].method92(arg2 + arg10, arg4 + arg8) + (var13 * 8);
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg1 == 0) {
                    class355.field5243[0][arg2 + arg10][arg4 + arg8] = -var13 * 8;
                    return;
                }
                class355.field5243[arg1][arg2 + arg10][arg4 + arg8] = class355.field5243[arg1 - 1][arg2 + arg10][arg4 + arg8] - (var13 * 8);
                return;
            }
            if (var12 <= 49) {
                if (arg7) {
                    arg6.method2343(255);
                } else {
                    class449.field6614[arg1][arg2][arg4] = arg6.method2341((byte) 54);
                    class14.field172[arg1][arg2][arg4] = (byte) ((var12 - 2) / 4);
                    class45.field562[arg1][arg2][arg4] = (byte) class406.method2552(3, var12 + arg9 - 2);
                }
            } else if (var12 <= 81) {
                if (!arg0 && !arg7) {
                    class341.field5085[arg1][arg2][arg4] = (byte) (var12 - 49);
                }
            } else if (!arg7) {
                class221.field3372[arg1][arg2][arg4] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
    public static void method164(byte arg0) {
        field365 = null;
        field367 = null;
        field358 = null;
        if (arg0 != 121) {
            field367 = null;
        }
    }
}
