import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class44 implements class297 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lph;")
    public static class229 field674 = class266.method1858("Examiner", 0);

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lph;")
    public static class229 field675 = class266.method1858(":allyreq:", 0);

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lph;")
    public static class229 field678 = class266.method1858("::fpsoff", 0);

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Z")
    public static boolean field679 = false;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lph;")
    public static class229 field673 = class266.method1858("m", 0);

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lph;")
    private static class229 field681 = class266.method1858("Allocating memory", 0);

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
    public static int[] field684 = new int[128];

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lph;")
    public static class229 field683 = field681;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lsi;")
    public static class66 field682;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 11)
    public static void method328(int arg0) {
        field684 = null;
        field681 = null;
        field675 = null;
        field678 = null;
        if (arg0 != 1) {
            field679 = true;
        }
        field673 = null;
        field682 = null;
        field683 = null;
        field674 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIILri;I)V", line = 29)
    public static final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class301 arg6, int arg7) {
        field680++;
        if (class236.field3888) {
            class185.field3002 = 32;
        } else {
            class185.field3002 = 0;
        }
        class236.field3888 = false;
        if (class273.field4575 != 0) {
            if (arg1 <= arg3 && arg1 + 16 > arg3 && arg7 <= arg4 && arg4 < (arg7 + 16)) {
                arg6.field4897 -= 4;
                class296.method2006(arg6, 120);
            } else if (arg3 >= arg1 && arg3 < arg1 + 16 && arg2 + arg7 - 16 <= arg4 && arg4 < (arg2 + arg7)) {
                arg6.field4897 += 4;
                class296.method2006(arg6, arg5 + 133);
            } else if (arg1 - class185.field3002 <= arg3 && arg3 < arg1 + class185.field3002 + 16 && arg4 >= (arg7 + 16) && arg4 < (arg7 + arg2 - 16)) {
                int var8 = (arg2 - 32) * arg2 / arg0;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - arg7 - (var8 / 2) - 16;
                int var10 = arg2 - var8 - 32;
                arg6.field4897 = (arg0 - arg2) * var9 / var10;
                class296.method2006(arg6, 122);
                class236.field3888 = true;
            }
        }
        if (class76.field1271 != 0) {
            int var11 = arg6.field4923;
            if (arg3 >= arg1 - var11 && arg7 <= arg4 && arg3 < (arg1 + 16) && arg4 <= arg7 + arg2) {
                arg6.field4897 += class76.field1271 * 45;
                class296.method2006(arg6, 126);
            }
        }
        if (arg5 != -8) {
            field682 = (class66) null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BIIIII)V", line = 123)
    public static final void method330(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field677++;
        for (int var6 = arg3; var6 <= (arg3 + arg4); var6++) {
            for (int var7 = arg2; var7 <= (arg2 + arg5); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class16.field190[arg1][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg3; var8 < arg3 + arg4; var8++) {
            for (int var9 = arg2; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class192.field3174[arg1][var9][var8] = arg1 > 0 ? class192.field3174[arg1 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var10 = arg3 + 1; var10 < (arg3 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class192.field3174[arg1][arg2][var10] = class192.field3174[arg1][arg2 - 1][var10];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var11 = arg2 + 1; var11 < (arg2 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class192.field3174[arg1][var11][arg3] = class192.field3174[arg1][var11][arg3 - 1];
                }
            }
        }
        if (arg2 >= 0 && arg3 >= 0 && arg2 < 104 && arg3 < 104) {
            if (arg1 == 0) {
                if (arg2 > 0 && class192.field3174[arg1][arg2 - 1][arg3] != 0) {
                    class192.field3174[arg1][arg2][arg3] = class192.field3174[arg1][arg2 - 1][arg3];
                } else if (arg3 > 0 && class192.field3174[arg1][arg2][arg3 - 1] != 0) {
                    class192.field3174[arg1][arg2][arg3] = class192.field3174[arg1][arg2][arg3 - 1];
                } else if (arg2 > 0 && arg3 > 0 && class192.field3174[arg1][arg2 - 1][arg3 - 1] != 0) {
                    class192.field3174[arg1][arg2][arg3] = class192.field3174[arg1][arg2 - 1][arg3 - 1];
                }
            } else if (arg2 > 0 && class192.field3174[arg1 - 1][arg2 - 1][arg3] != class192.field3174[arg1][arg2 - 1][arg3]) {
                class192.field3174[arg1][arg2][arg3] = class192.field3174[arg1][arg2 - 1][arg3];
            } else if (arg3 > 0 && class192.field3174[arg1 - 1][arg2][arg3 - 1] != class192.field3174[arg1][arg2][arg3 - 1]) {
                class192.field3174[arg1][arg2][arg3] = class192.field3174[arg1][arg2][arg3 - 1];
            } else if (arg2 > 0 && arg3 > 0 && class192.field3174[arg1 - 1][arg2 - 1][arg3 - 1] != class192.field3174[arg1][arg2 - 1][arg3 - 1]) {
                class192.field3174[arg1][arg2][arg3] = class192.field3174[arg1][arg2 - 1][arg3 - 1];
            }
        }
        if (arg0 != -100) {
            method330((byte) 66, -34, -108, -92, -102, -95);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([IJII)Lph;", line = 243)
    public final class229 method331(int[] arg0, long arg1, int arg2, int arg3) {
        field685++;
        if (arg3 == 0) {
            class221 var6 = class279.method1921(arg0[0], (byte) 64);
            return var6.method1540(85, (int) arg1);
        }
        int var7 = -100 % ((17 - arg2) / 40);
        if (arg3 == 1 || arg3 == 10) {
            class191 var8 = class124.method920(-84, (int) arg1);
            return var8.field3154;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class279.method1921(arg0[0], (byte) 64).method1540(77, (int) arg1);
        } else {
            return null;
        }
    }
}
