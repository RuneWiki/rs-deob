import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 extends class51 {

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field403 = -1;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Z")
    public static boolean field401 = true;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "J")
    public static long field410 = 0L;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "[I")
    public static int[] field411;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[[Lw;")
    public static class141[][] field406;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lgj;")
    public static final class225 method208(int arg0) {
        int var1 = class175.field3063[0] * class174.field3060[0];
        byte[] var2 = class127.field2221[0];
        field408++;
        int[] var3 = new int[var1];
        if (arg0 != 5) {
            field407 = -108;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class139.field2398[class272.method1817(255, var2[var4])];
        }
        class225 var5 = new class225(class52.field1094, class43.field944, class252.field4341[0], class226.field3868[0], class174.field3060[0], class175.field3063[0], var3);
        class190.method1291((byte) 103);
        return var5;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZZIILw;)V")
    public static final void method209(boolean arg0, boolean arg1, int arg2, int arg3, class141 arg4) {
        field402++;
        if (!arg0) {
            return;
        }
        int var5 = arg4.field2575;
        if (arg4.field2517 == 0) {
            arg4.field2575 = arg4.field2440;
        } else if (arg4.field2517 == 1) {
            arg4.field2575 = arg3 - arg4.field2440;
        } else if (arg4.field2517 == 2) {
            arg4.field2575 = arg4.field2440 * arg3 >> 14;
        } else if (arg4.field2517 == 3) {
            if (arg4.field2529 == 2) {
                arg4.field2575 = arg4.field2440 * 32 + ((arg4.field2440 - 1) * arg4.field2482);
            } else if (arg4.field2529 == 7) {
                arg4.field2575 = (arg4.field2440 - 1) * arg4.field2482 + arg4.field2440 * 115;
            }
        }
        int var6 = arg4.field2490;
        if (arg4.field2470 == 0) {
            arg4.field2490 = arg4.field2484;
        } else if (arg4.field2470 == 1) {
            arg4.field2490 = arg2 - arg4.field2484;
        } else if (arg4.field2470 == 2) {
            arg4.field2490 = arg4.field2484 * arg2 >> 14;
        } else if (arg4.field2470 == 3) {
            if (arg4.field2529 == 2) {
                arg4.field2490 = (arg4.field2484 - 1) * arg4.field2421 + arg4.field2484 * 32;
            } else if (arg4.field2529 == 7) {
                arg4.field2490 = arg4.field2484 * 12 + ((arg4.field2484 - 1) * arg4.field2421);
            }
        }
        if (arg4.field2517 == 4) {
            arg4.field2575 = arg4.field2506 * arg4.field2490 / arg4.field2474;
        }
        if (arg4.field2470 == 4) {
            arg4.field2490 = arg4.field2575 * arg4.field2474 / arg4.field2506;
        }
        if (class215.field3731 && (client.method1042(arg4) != 0 || arg4.field2529 == 0)) {
            if (arg4.field2490 < 5 && arg4.field2575 < 5) {
                arg4.field2575 = 5;
                arg4.field2490 = 5;
            } else {
                if (arg4.field2490 <= 0) {
                    arg4.field2490 = 5;
                }
                if (arg4.field2575 <= 0) {
                    arg4.field2575 = 5;
                }
            }
        }
        if (arg4.field2492 == 1337) {
            class262.field4484 = arg4;
        }
        if (arg1 && arg4.field2573 != null && arg4.field2575 != var5 || arg4.field2490 != var6) {
            class117 var7 = new class117();
            var7.field2053 = arg4.field2573;
            var7.field2046 = arg4;
            class71.field1389.method675(var7, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static void method210(int arg0) {
        int var1 = -16 / ((arg0 - 75) / 49);
        field406 = null;
        field411 = null;
    }
}
