import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class81 extends class215 {

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "Lof;")
    public static class328 field1196 = new class328(8);

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "[I")
    public static int[] field1198 = new int[1024];

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "Lcg;")
    public static class10 field1199 = new class10(15, 0, 1, 0);

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "[[I")
    public static int[][] field1201 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "[S")
    public static short[] field1200;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZIIIII)V")
    public static final void method576(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0) {
            return;
        }
        field1197++;
        if (class222.field3750 < arg4 || arg3 < class462.field7105) {
            return;
        }
        boolean var6;
        if (arg1 < class178.field2609) {
            arg1 = class178.field2609;
            var6 = false;
        } else if (class460.field7096 < arg1) {
            arg1 = class460.field7096;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg2 < class178.field2609) {
            var7 = false;
            arg2 = class178.field2609;
        } else if (arg2 <= class460.field7096) {
            var7 = true;
        } else {
            arg2 = class460.field7096;
            var7 = false;
        }
        if (class462.field7105 <= arg4) {
            class280.method1888(arg1, arg2, (byte) 82, class103.field1521[arg4++], arg5);
        } else {
            arg4 = class462.field7105;
        }
        if (arg3 <= class222.field3750) {
            class280.method1888(arg1, arg2, (byte) 82, class103.field1521[arg3--], arg5);
        } else {
            arg3 = class222.field3750;
        }
        if (var6 && var7) {
            for (int var8 = arg4; var8 <= arg3; var8++) {
                int[] var9 = class103.field1521[var8];
                var9[arg1] = var9[arg2] = arg5;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg4; var10 <= arg3; var10++) {
                class103.field1521[var10][arg1] = arg5;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg4; var11 <= arg3; var11++) {
                class103.field1521[var11][arg2] = arg5;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)V")
    public static void method577(byte arg0) {
        field1200 = null;
        field1201 = null;
        field1199 = null;
        if (arg0 != -4) {
            method578((byte) -68, null);
        }
        field1196 = null;
        field1198 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLqu;)V")
    public static final void method578(byte arg0, class219 arg1) {
        class170.field2488.method1851(arg1.method1603(-1), -1342326174);
        field1195++;
        if (arg0 != 66) {
            method576(false, 114, -8, -33, 110, 63);
        }
    }
}
