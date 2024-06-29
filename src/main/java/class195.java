import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class195 extends class271 {

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field2700 = 2;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field2702 = 0;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Luc;")
    public static class51 field2699 = new class51(256);

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[I")
    public static int[] field2704 = new int[50];

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2706 = "Loading wordpack - ";

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient;")
    public static client field2701;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
    public static boolean field2697;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 < (arg4 + arg5); var6++) {
            for (int var9 = arg2; var9 < (arg2 + arg3); var9++) {
                if (var9 >= 0 && var9 < class351.field5217 && var6 >= 0 && var6 < class143.field1815) {
                    class164.field2231[arg0][var9][var6] = arg0 <= 0 ? 0 : class164.field2231[arg0 - 1][var9][var6] - 240;
                }
            }
        }
        field2703++;
        if (arg2 > 0 && class351.field5217 > arg2) {
            for (int var7 = arg5 + 1; var7 < arg4 + arg5; var7++) {
                if (var7 >= 0 && var7 < class143.field1815) {
                    class164.field2231[arg0][arg2][var7] = class164.field2231[arg0][arg2 - 1][var7];
                }
            }
        }
        if (arg1 >= -122) {
            return;
        }
        if (arg5 > 0 && arg5 < class143.field1815) {
            for (int var8 = arg2 + 1; var8 < (arg2 + arg3); var8++) {
                if (var8 >= 0 && class351.field5217 > var8) {
                    class164.field2231[arg0][var8][arg5] = class164.field2231[arg0][var8][arg5 - 1];
                }
            }
        }
        if (arg2 < 0 || arg5 < 0 || class351.field5217 <= arg2 || arg5 >= class143.field1815) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 <= 0 || class164.field2231[arg0][arg2 - 1][arg5] == 0) {
                if (arg5 > 0 && class164.field2231[arg0][arg2][arg5 - 1] != 0) {
                    class164.field2231[arg0][arg2][arg5] = class164.field2231[arg0][arg2][arg5 - 1];
                    return;
                }
                if (arg2 > 0 && arg5 > 0 && class164.field2231[arg0][arg2 - 1][arg5 - 1] != 0) {
                    class164.field2231[arg0][arg2][arg5] = class164.field2231[arg0][arg2 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            class164.field2231[arg0][arg2][arg5] = class164.field2231[arg0][arg2 - 1][arg5];
        } else if (arg2 <= 0 || class164.field2231[arg0 - 1][arg2 - 1][arg5] == class164.field2231[arg0][arg2 - 1][arg5]) {
            if (arg5 > 0 && class164.field2231[arg0][arg2][arg5 - 1] != class164.field2231[arg0 - 1][arg2][arg5 - 1]) {
                class164.field2231[arg0][arg2][arg5] = class164.field2231[arg0][arg2][arg5 - 1];
                return;
            }
            if (arg2 > 0 && arg5 > 0 && class164.field2231[arg0][arg2 - 1][arg5 - 1] != class164.field2231[arg0 - 1][arg2 - 1][arg5 - 1]) {
                class164.field2231[arg0][arg2][arg5] = class164.field2231[arg0][arg2 - 1][arg5 - 1];
                return;
            }
        } else {
            class164.field2231[arg0][arg2][arg5] = class164.field2231[arg0][arg2 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1294(int arg0, String arg1) {
        field2696++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class391.field5714; var2++) {
            if (arg1.equalsIgnoreCase(class30.field488[var2])) {
                return var2;
            }
        }
        return arg0 == -1 ? -1 : 93;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I")
    public static final int method1295(int arg0, int arg1) {
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        field2698++;
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return arg1 == 16021 ? var6 & 0xFF : -110;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method1296(byte arg0) {
        field2706 = null;
        field2701 = null;
        int var1 = 38 / ((arg0 - 41) / 36);
        field2699 = null;
        field2704 = null;
    }
}
