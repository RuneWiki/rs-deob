import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class140 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2270 = "M";

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2271 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
    public static int[] field2269 = new int[25];

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2273 = "Allocating memory";

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public static int[] field2272;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class131.field2171[arg0][var8][var14] == -class47.field652) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class103.field1792[arg0][arg1][arg3] + arg5;
            if (!class49.method302(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class49.method302(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class49.method302(var9, var11, var13)) {
                return false;
            } else if (class49.method302(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class152.method1125(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class49.method302(var6 + 1, class103.field1792[arg0][arg1][arg3] + arg5, var7 + 1) && class49.method302(var6 + 128 - 1, class103.field1792[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class49.method302(var6 + 128 - 1, class103.field1792[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class49.method302(var6 + 1, class103.field1792[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1053(int arg0) {
        field2273 = null;
        field2272 = null;
        if (arg0 != 128) {
            field2272 = null;
        }
        field2270 = null;
        field2269 = null;
    }
}
