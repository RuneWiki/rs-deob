import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class151 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2349 = -1;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
    public static int[] field2351 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2355 = 0;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2354 = "glow1:";

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lj;")
    public class174 field2353;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lh;")
    public static class294 field2347;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[I")
    public int[] field2346;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method1000(int arg0) {
        if (arg0 != -1) {
            field2349 = -117;
        }
        field2351 = null;
        field2347 = null;
        field2354 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZIII)V")
    public static final void method1001(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 <= arg3 + arg4; var6++) {
            for (int var11 = arg1; var11 <= arg1 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class92.field1406[arg0][var11][var6] = 127;
                }
            }
        }
        field2350++;
        int var7 = arg3;
        if (!arg2) {
            field2354 = null;
        }
        while ((arg3 + arg4) > var7) {
            for (int var10 = arg1; var10 < (arg1 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class242.field3842[arg0][var10][var7] = arg0 > 0 ? class242.field3842[arg0 - 1][var10][var7] : 0;
                }
            }
            var7++;
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var8 = arg3 + 1; var8 < (arg3 + arg4); var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class242.field3842[arg0][arg1][var8] = class242.field3842[arg0][arg1 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var9 = arg1 + 1; var9 < arg1 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class242.field3842[arg0][var9][arg3] = class242.field3842[arg0][var9][arg3 - 1];
                }
            }
        }
        if (arg1 < 0 || arg3 < 0 || arg1 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 > 0 && class242.field3842[arg0][arg1 - 1][arg3] != 0) {
                class242.field3842[arg0][arg1][arg3] = class242.field3842[arg0][arg1 - 1][arg3];
                return;
            }
            if (arg3 > 0 && class242.field3842[arg0][arg1][arg3 - 1] != 0) {
                class242.field3842[arg0][arg1][arg3] = class242.field3842[arg0][arg1][arg3 - 1];
                return;
            }
            if (arg1 > 0 && arg3 > 0 && class242.field3842[arg0][arg1 - 1][arg3 - 1] != 0) {
                class242.field3842[arg0][arg1][arg3] = class242.field3842[arg0][arg1 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg1 > 0 && class242.field3842[arg0][arg1 - 1][arg3] != class242.field3842[arg0 - 1][arg1 - 1][arg3]) {
            class242.field3842[arg0][arg1][arg3] = class242.field3842[arg0][arg1 - 1][arg3];
            return;
        }
        if (arg3 > 0 && class242.field3842[arg0 - 1][arg1][arg3 - 1] != class242.field3842[arg0][arg1][arg3 - 1]) {
            class242.field3842[arg0][arg1][arg3] = class242.field3842[arg0][arg1][arg3 - 1];
            return;
        }
        if (arg1 > 0 && arg3 > 0 && class242.field3842[arg0][arg1 - 1][arg3 - 1] != class242.field3842[arg0 - 1][arg1 - 1][arg3 - 1]) {
            class242.field3842[arg0][arg1][arg3] = class242.field3842[arg0][arg1 - 1][arg3 - 1];
            return;
        }
    }
}
