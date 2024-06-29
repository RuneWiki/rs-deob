import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class131 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Z")
    public boolean field2213 = false;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public int field2214 = 0;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public int field2221 = 0;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "[I")
    public static int[] field2219 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field2215 = 0;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "Lrn;")
    public static class18 field2223;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "Lib;")
    public class35 field2218;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2222;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method1128(int arg0, int arg1, int arg2) {
        field2224++;
        if (!class6.field89) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class334.field5108[var3] == null || class334.field5108[var3][var4] == null) {
            return false;
        }
        class342 var5 = class334.field5108[var3][var4];
        if (arg0 == -1 && var5.field5279 == 0) {
            for (int var6 = 0; var6 < class66.field1006; var6++) {
                if (class356.field5670[var6] == 57 || class356.field5670[var6] == 1007 || class356.field5670[var6] == 20 || class356.field5670[var6] == 2 || class356.field5670[var6] == 58) {
                    for (class342 var7 = class355.method2497(arg1 - 23640, class90.field1278[var6]); var7 != null; var7 = class244.method1837(var7, (byte) -96)) {
                        if (var5.field5433 == var7.field5433) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class66.field1006; var8++) {
                if (class41.field654[var8] == arg0 && class90.field1278[var8] == var5.field5433 && (class356.field5670[var8] == 57 || class356.field5670[var8] == 1007 || class356.field5670[var8] == 20 || class356.field5670[var8] == 2 || class356.field5670[var8] == 58)) {
                    return true;
                }
            }
        }
        if (arg1 != 23640) {
            method1131(-91, -5, 29, 81, -85, (int[][]) ((int[][]) null));
        }
        return false;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V", line = 81)
    public static void method1129(boolean arg0) {
        field2223 = null;
        field2219 = null;
        if (!arg0) {
            method1129(false);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIZIIIII)V", line = 95)
    public static final void method1130(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2217++;
        if (arg3) {
            method1128(-10, 54, 31);
        }
        if (class328.method2321(0, arg5)) {
            class355.method2494(arg6, arg7, -1, arg0, arg4, !arg3, arg2, arg1, arg8, class334.field5108[arg5]);
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class227.field3540[var9] = true;
            }
        } else {
            class227.field3540[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII[[I)I", line = 143)
    public static final int method1131(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5) {
        field2220++;
        int var6 = (128 - arg1) * arg5[arg0][arg3] + arg5[arg0 + 1][arg3] * arg1 >> 7;
        if (arg4 != -2134986041) {
            field2215 = -104;
        }
        int var7 = (128 - arg1) * arg5[arg0][arg3 + 1] + arg5[arg0 + 1][arg3 + 1] * arg1 >> 7;
        return (128 - arg2) * var6 + arg2 * var7 >> 7;
    }
}
