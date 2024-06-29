import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class387 extends class467 {

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "B")
    public byte field5408 = 5;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field5412 = -1;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "[[I")
    public static int[][] field5413 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Lju;")
    public static class102 field5403 = new class102(64, -1);

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public int field5401;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public int field5402;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public int field5404;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public int field5406;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public int field5411;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "J")
    public static long field5414;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "Lwu;")
    public static class557 field5400;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "Z")
    public boolean field5410;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 8)
    public static void method2357(int arg0) {
        field5413 = null;
        field5400 = null;
        if (arg0 != 21026) {
            field5412 = -95;
        }
        field5403 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)Lgfa;", line = 25)
    public static final class753 method2358(byte arg0) {
        field5405++;
        if (class531.field7437 == null || class120.field1649 == null) {
            return null;
        }
        int var1 = 88 % ((arg0 - 42) / 46);
        class120.field1649.method311(-94, class531.field7437);
        class753 var2 = (class753) class120.field1649.method314((byte) 79);
        if (var2 == null) {
            return null;
        } else {
            class185 var3 = class531.field7421.method1971(var2.field10459, -23851);
            return var3 != null && var3.field2704 && var3.method1242(class531.field7422, (byte) -55) ? var2 : class35.method246(-8156);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI[BIIII)Z", line = 52)
    public static final boolean method2359(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field5409++;
        int var7 = arg4 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg5 + arg1 - 1) / arg1);
        int var10 = -((arg4 + arg1 - 1) / arg1);
        if (arg0 < 19) {
            return true;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg3] == 0) {
                    return true;
                }
                arg3 += arg1;
            }
            int var13 = arg3 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg6 + var13;
        }
        return false;
    }
}
