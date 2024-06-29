import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class434 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[[I")
    public static int[][] field6210 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Luj;")
    public static class266 field6212;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lah;")
    public static class267 field6209;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "[I")
    public static int[] field6213;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 3)
    public static void method2566(int arg0) {
        field6213 = null;
        field6212 = null;
        if (arg0 >= -89) {
            field6210 = null;
        }
        field6209 = null;
        field6210 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V", line = 27)
    public static final void method2567(int arg0, int arg1, int arg2, int arg3) {
        class188 var4 = class461.field6675[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class469 var5 = var4.field2755;
        class469 var6 = var4.field2774;
        if (var5 != null) {
            var5.field6811 = var5.field6811 * arg3 / (0x10 << class322.field4795 - 7);
            var5.field6812 = var5.field6812 * arg3 / (0x10 << class322.field4795 - 7);
        }
        if (var6 != null) {
            var6.field6811 = var6.field6811 * arg3 / (0x10 << class322.field4795 - 7);
            var6.field6812 = var6.field6812 * arg3 / (0x10 << class322.field4795 - 7);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIBLjava/lang/String;)I", line = 49)
    public static final int method2568(boolean arg0, int arg1, byte arg2, String arg3) {
        field6211++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        int var8 = 49 % ((arg2 + 11) / 35);
        for (int var9 = 0; var9 < var7; var9++) {
            char var10 = arg3.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg0) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg1 * var6 + var12;
            if (var11 / arg1 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var11;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IFIIIIF[FFIF)V")
    public abstract void method1353(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float[] arg7, float arg8, int arg9, float arg10);
}
