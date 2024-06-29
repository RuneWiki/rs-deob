import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class280 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lsh;")
    public static class472 field4234 = new class472(84, 7);

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[[B")
    public static byte[][] field4237 = new byte[50][];

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Lsh;")
    public static class472 field4236;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method1801(int arg0) {
        field4236 = null;
        if (arg0 >= -11) {
            field4236 = null;
        }
        field4237 = null;
        field4234 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[I[II)V")
    public static final void method1802(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg0 < 107) {
            method1801(-105);
        }
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (arg3[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method1802(120, arg1, arg2, arg3, var6 - 1);
            method1802(113, var6 + 1, arg2, arg3, arg4);
        }
        field4233++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1803(boolean arg0, char arg1) {
        field4235++;
        if (!arg0) {
            field4237 = null;
        }
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class178.method1234(-85, arg1)) {
            return true;
        } else {
            char[] var2 = class351.field5350;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class187.field2836;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V")
    public static final void method1804(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= arg3) {
            for (int var5 = arg4; var5 < arg3; var5++) {
                class49.field723[var5][arg1] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg4; var6++) {
                class49.field723[var6][arg1] = arg2;
            }
        }
        field4232++;
        if (arg0 != 1) {
            field4237 = null;
        }
    }
}
