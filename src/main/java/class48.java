import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class48 extends class112 {

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "[B")
    public byte[] field887;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "Z")
    public static boolean field879 = false;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Z")
    public static boolean field881 = false;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "[[I")
    public static int[][] field883 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "F")
    public static float field886;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Lmk;")
    public static class213 field878;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)V")
    public static void method413(byte arg0) {
        field878 = null;
        field883 = null;
        if (arg0 != 54) {
            method413((byte) -5);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
    public static final void method414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field884++;
        for (int var6 = arg3; var6 <= arg3 + arg2; var6++) {
            for (int var11 = arg1; var11 <= (arg1 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class127.field2098[arg0][var11][var6] = 127;
                }
            }
        }
        if (arg4 != 1) {
            method416(4, 101, -74, false, 91, 102);
        }
        for (int var7 = arg3; var7 < arg2 + arg3; var7++) {
            for (int var10 = arg1; var10 < arg1 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class21.field327[arg0][var10][var7] = arg0 <= 0 ? 0 : class21.field327[arg0 - 1][var10][var7];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var8 = arg3 + 1; var8 < (arg2 + arg3); var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class21.field327[arg0][arg1][var8] = class21.field327[arg0][arg1 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var9 = arg1 + 1; var9 < (arg1 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class21.field327[arg0][var9][arg3] = class21.field327[arg0][var9][arg3 - 1];
                }
            }
        }
        if (arg1 < 0 || arg3 < 0 || arg1 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg0 != 0) {
            if (arg1 > 0 && class21.field327[arg0][arg1 - 1][arg3] != class21.field327[arg0 - 1][arg1 - 1][arg3]) {
                class21.field327[arg0][arg1][arg3] = class21.field327[arg0][arg1 - 1][arg3];
                return;
            }
            if (arg3 > 0 && class21.field327[arg0][arg1][arg3 - 1] != class21.field327[arg0 - 1][arg1][arg3 - 1]) {
                class21.field327[arg0][arg1][arg3] = class21.field327[arg0][arg1][arg3 - 1];
                return;
            }
            if (arg1 > 0 && arg3 > 0 && class21.field327[arg0 - 1][arg1 - 1][arg3 - 1] != class21.field327[arg0][arg1 - 1][arg3 - 1]) {
                class21.field327[arg0][arg1][arg3] = class21.field327[arg0][arg1 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg1 > 0 && class21.field327[arg0][arg1 - 1][arg3] != 0) {
            class21.field327[arg0][arg1][arg3] = class21.field327[arg0][arg1 - 1][arg3];
            return;
        }
        if (arg3 > 0 && class21.field327[arg0][arg1][arg3 - 1] != 0) {
            class21.field327[arg0][arg1][arg3] = class21.field327[arg0][arg1][arg3 - 1];
            return;
        }
        if (arg1 > 0 && arg3 > 0 && class21.field327[arg0][arg1 - 1][arg3 - 1] != 0) {
            class21.field327[arg0][arg1][arg3] = class21.field327[arg0][arg1 - 1][arg3 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILbd;ZZ)Lbf;")
    public static final class102 method415(int arg0, int arg1, int arg2, int arg3, class81 arg4, boolean arg5, boolean arg6) {
        field882++;
        int var7 = (arg0 << 17) + (arg6 ? 65536 : 0) + arg2 + (arg3 << 19);
        long var9 = (long) var7 * 3849834839L + (long) arg1 * 3147483667L;
        class102 var11 = (class102) class36.field618.method1155(var9, true);
        if (var11 != null) {
            return var11;
        }
        class95.field1488 = arg5;
        class102 var12 = class276.method1864(arg4, (byte) 124, false, arg2, false, arg6, arg3, arg0, arg1);
        if (var12 != null && !class95.field1488) {
            class36.field618.method1161(var12, (byte) -120, var9);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIZII)V")
    public static final void method416(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= arg5; var6++) {
            class224.method1504(arg0, arg4, arg2, class114.field1841[var6], 7);
        }
        if (!arg3) {
            field879 = true;
        }
        field888++;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
    public class48(byte[] arg0) {
        this.field887 = arg0;
    }
}
