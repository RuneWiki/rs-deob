import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class137 {

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Z")
    public boolean field2106 = false;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Lna;")
    private static class26 field2096 = class69.method505("Checking for updates )2 ", (byte) -123);

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "Lna;")
    public static class26 field2104 = field2096;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Lna;")
    public static class26 field2100 = class69.method505(",Mcran)2titre charg-B", (byte) -126);

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "Lna;")
    public static class26 field2108 = class69.method505("(U1", (byte) -124);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "F")
    public static float field2093;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "J")
    public long field2105;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Lve;")
    public static class266 field2097;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lve;")
    public static class266 field2098;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Lth;")
    public class86 field2095;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBIIII)V", line = 9)
    public static final void method917(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
            for (int var7 = arg3; var7 <= arg3 + arg5; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class140.field2133[arg0][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg2; var8 < arg2 + arg4; var8++) {
            for (int var9 = arg3; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class229.field3635[arg0][var9][var8] = arg0 <= 0 ? 0 : class229.field3635[arg0 - 1][var9][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg2 + 1; var10 < (arg2 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class229.field3635[arg0][arg3][var10] = class229.field3635[arg0][arg3 - 1][var10];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var11 = arg3 + 1; var11 < (arg3 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class229.field3635[arg0][var11][arg2] = class229.field3635[arg0][var11][arg2 - 1];
                }
            }
        }
        field2102++;
        int var12 = 56 % ((arg1 + 18) / 50);
        if (arg3 < 0 || arg2 < 0 || arg3 >= 104 || arg2 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 > 0 && class229.field3635[arg0][arg3 - 1][arg2] != 0) {
                class229.field3635[arg0][arg3][arg2] = class229.field3635[arg0][arg3 - 1][arg2];
            } else if (arg2 > 0 && class229.field3635[arg0][arg3][arg2 - 1] != 0) {
                class229.field3635[arg0][arg3][arg2] = class229.field3635[arg0][arg3][arg2 - 1];
            } else if (arg3 > 0 && arg2 > 0 && class229.field3635[arg0][arg3 - 1][arg2 - 1] != 0) {
                class229.field3635[arg0][arg3][arg2] = class229.field3635[arg0][arg3 - 1][arg2 - 1];
            }
        } else if (arg3 > 0 && class229.field3635[arg0 - 1][arg3 - 1][arg2] != class229.field3635[arg0][arg3 - 1][arg2]) {
            class229.field3635[arg0][arg3][arg2] = class229.field3635[arg0][arg3 - 1][arg2];
        } else if (arg2 > 0 && class229.field3635[arg0][arg3][arg2 - 1] != class229.field3635[arg0 - 1][arg3][arg2 - 1]) {
            class229.field3635[arg0][arg3][arg2] = class229.field3635[arg0][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class229.field3635[arg0 - 1][arg3 - 1][arg2 - 1] != class229.field3635[arg0][arg3 - 1][arg2 - 1]) {
            class229.field3635[arg0][arg3][arg2] = class229.field3635[arg0][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 131)
    public static void method918(byte arg0) {
        field2096 = null;
        field2104 = null;
        field2108 = null;
        field2097 = null;
        field2098 = null;
        field2100 = null;
        int var1 = -93 / ((2 - arg0) / 50);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I", line = 149)
    public static final int method919(int arg0, int arg1, int arg2) {
        field2103++;
        class186 var3 = (class186) class55.field876.method1827((long) arg1, 0);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= ~arg2 && arg2 < var3.field2892.length) {
            return var3.field2892[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[B)[B", line = 173)
    public static final byte[] method920(byte arg0, byte[] arg1) {
        field2094++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 == 62) {
            class75.method536(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return (byte[]) null;
        }
    }
}
