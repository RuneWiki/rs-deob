import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class64 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Le;")
    public static class191 field1128 = class54.method368("Verbindung zum Update)2Server hergestellt)3", 2047);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lsa;")
    public class69 field1129;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
    public int[] field1133;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
    public static final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg0; var6 <= (arg0 + arg1); var6++) {
            for (int var11 = arg5; var11 <= arg2 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class59.field1075[arg4][var11][var6] = 127;
                }
            }
        }
        field1131++;
        for (int var7 = arg0; var7 < arg0 + arg1; var7++) {
            for (int var10 = arg5; var10 < arg2 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class12.field143[arg4][var10][var7] = arg4 > 0 ? class12.field143[arg4 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg1; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class12.field143[arg4][arg5][var8] = class12.field143[arg4][arg5 - 1][var8];
                }
            }
        }
        if (arg3 > ~arg0 && arg0 < 104) {
            for (int var9 = arg5 + 1; var9 < arg2 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class12.field143[arg4][var9][arg0] = class12.field143[arg4][var9][arg0 - 1];
                }
            }
        }
        if (arg5 < 0 || arg0 < 0 || arg5 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 <= 0 || class12.field143[arg4][arg5 - 1][arg0] == 0) {
                if (arg0 > 0 && class12.field143[arg4][arg5][arg0 - 1] != 0) {
                    class12.field143[arg4][arg5][arg0] = class12.field143[arg4][arg5][arg0 - 1];
                    return;
                }
                if (arg5 > 0 && arg0 > 0 && class12.field143[arg4][arg5 - 1][arg0 - 1] != 0) {
                    class12.field143[arg4][arg5][arg0] = class12.field143[arg4][arg5 - 1][arg0 - 1];
                    return;
                }
                return;
            }
            class12.field143[arg4][arg5][arg0] = class12.field143[arg4][arg5 - 1][arg0];
        } else if (arg5 <= 0 || class12.field143[arg4 - 1][arg5 - 1][arg0] == class12.field143[arg4][arg5 - 1][arg0]) {
            if (arg0 > 0 && class12.field143[arg4][arg5][arg0 - 1] != class12.field143[arg4 - 1][arg5][arg0 - 1]) {
                class12.field143[arg4][arg5][arg0] = class12.field143[arg4][arg5][arg0 - 1];
                return;
            }
            if (arg5 > 0 && arg0 > 0 && class12.field143[arg4][arg5 - 1][arg0 - 1] != class12.field143[arg4 - 1][arg5 - 1][arg0 - 1]) {
                class12.field143[arg4][arg5][arg0] = class12.field143[arg4][arg5 - 1][arg0 - 1];
                return;
            }
        } else {
            class12.field143[arg4][arg5][arg0] = class12.field143[arg4][arg5 - 1][arg0];
            return;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method427(int arg0) {
        field1128 = null;
        if (arg0 != 15796) {
            method427(-119);
        }
    }
}
