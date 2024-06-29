import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class216 extends class25 {

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "[I")
    public static int[] field2886 = new int[120];

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "[I")
    public static int[] field2888 = new int[14];

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field2893;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2886[var1] = var0 / 4;
        }
        field2892 = 0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1364(boolean arg0) {
        class389.field5816.method1941(-71);
        field2890++;
        int var1 = class389.field5816.method1946(8, (byte) 123);
        if (var1 < class155.field2213) {
            for (int var2 = var1; var2 < class155.field2213; var2++) {
                class442.field6422[class537.field7862++] = class523.field7379[var2];
            }
        }
        if (var1 > class155.field2213) {
            throw new RuntimeException("gnpov1");
        }
        class155.field2213 = 0;
        int var3 = 0;
        if (!arg0) {
            method1367(-19);
        }
        while (var3 < var1) {
            int var4 = class523.field7379[var3];
            class53 var5 = ((class177) class271.field3550.method2002((byte) -120, (long) var4)).field2476;
            int var6 = class389.field5816.method1946(1, (byte) 125);
            if (var6 == 0) {
                class523.field7379[class155.field2213++] = var4;
                var5.field7354 = class332.field4830;
            } else {
                int var7 = class389.field5816.method1946(2, (byte) 121);
                if (var7 == 0) {
                    class523.field7379[class155.field2213++] = var4;
                    var5.field7354 = class332.field4830;
                    class604.field8727[class12.field297++] = var4;
                } else if (var7 == 1) {
                    class523.field7379[class155.field2213++] = var4;
                    var5.field7354 = class332.field4830;
                    int var8 = class389.field5816.method1946(3, (byte) 123);
                    var5.method307(!arg0, var8, 1);
                    int var9 = class389.field5816.method1946(1, (byte) 125);
                    if (var9 == 1) {
                        class604.field8727[class12.field297++] = var4;
                    }
                } else if (var7 == 2) {
                    class523.field7379[class155.field2213++] = var4;
                    var5.field7354 = class332.field4830;
                    if (class389.field5816.method1946(1, (byte) 126) == 1) {
                        int var10 = class389.field5816.method1946(3, (byte) 122);
                        var5.method307(false, var10, 2);
                        int var11 = class389.field5816.method1946(3, (byte) 120);
                        var5.method307(false, var11, 2);
                    } else {
                        int var12 = class389.field5816.method1946(3, (byte) 127);
                        var5.method307(false, var12, 0);
                    }
                    int var13 = class389.field5816.method1946(1, (byte) 127);
                    if (var13 == 1) {
                        class604.field8727[class12.field297++] = var4;
                    }
                } else if (var7 == 3) {
                    class442.field6422[class537.field7862++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZZ)Z", line = 117)
    public static boolean method1365(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[B)Ljava/lang/String;", line = 127)
    public static final String method1366(int arg0, byte[] arg1) {
        field2893++;
        if (arg0 != -1) {
            method1369(27, 11, -53);
        }
        return class554.method3225(-98, 0, arg1, arg1.length);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 140)
    public static void method1367(int arg0) {
        field2888 = null;
        if (arg0 != 1) {
            field2892 = -29;
        }
        field2886 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BIIIII)Z", line = 156)
    public static final boolean method1368(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2887++;
        int var6 = arg1;
        if (arg0 != -109) {
            method1368((byte) -107, -81, 112, 20, 53, 82);
        }
        while (arg5 >= var6) {
            for (int var7 = arg2; var7 <= arg4; var7++) {
                if (class607.field8780[var6][var7] == arg3 && class668.field9446[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(III)Z", line = 187)
    public static final boolean method1369(int arg0, int arg1, int arg2) {
        if (arg0 != 384) {
            field2892 = 95;
        }
        field2889++;
        return (arg2 & 0x180) != 0;
    }
}
