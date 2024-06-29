import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class16 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "[I")
    public static int[] field221 = new int[64];

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "[I")
    public static int[] field226 = new int[128];

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lv;")
    public static class67 field220 = new class67(5000);

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "[I")
    public static int[] field227 = new int[100];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "[Lca;")
    public static class91[] field225;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "[S")
    public static short[] field228;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static void method95(int arg0) {
        field220 = null;
        field221 = null;
        field226 = null;
        field227 = null;
        field228 = null;
        if (arg0 != 4) {
            method96((String) null, (class213) null, 105, 59, (class231) null, -64, 77, 12, -117, 33);
        }
        field225 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;Lfc;IILfe;IIIII)V")
    public static final void method96(String arg0, class213 arg1, int arg2, int arg3, class231 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field223++;
        int var10 = (int) class144.field2145 + class146.field2173 & 0x7FF;
        int var11 = Math.max(arg4.field3730 / 2, arg4.field3686 / 2) + 10;
        int var12 = arg2 * arg2 + arg8 * arg8;
        if (var11 * var11 < var12) {
            return;
        }
        int var13 = class221.field3468[var10];
        int var14 = var13 * 256 / (class60.field876 + 256);
        int var15 = class221.field3465[var10];
        int var16 = 100 % ((arg3 + 32) / 40);
        int var17 = var15 * 256 / (class60.field876 + 256);
        int var18 = arg2 * var17 + arg8 * var14 >> 16;
        int var19 = arg8 * var17 - (arg2 * var14) >> 16;
        int var20 = arg1.method1476(arg0, 100);
        int var21 = arg1.method1492(arg0, 100, 0);
        int var22 = var18 - var20 / 2;
        if (var22 >= -arg4.field3730 && var22 <= arg4.field3730 && -arg4.field3686 <= var19 && arg4.field3686 >= var19) {
            class151.method1023(arg4.field3637, arg4.field3687);
            arg1.method1475(arg0, arg4.field3730 / 2 + arg6 + var22, arg4.field3686 / 2 + arg7 - (arg5 + var19) - var21, var20, 50, arg9, 0, 256, 1, 0, 0);
            class151.method1046();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[IIII)V")
    public static final void method97(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg4--;
        field224++;
        int var6 = arg2 - 1;
        int var5 = arg0 + var6;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg4 = var13 + 1;
            arg1[arg4] = arg3;
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg3;
        }
    }
}
