import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class528 extends class141 {

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Lnk;")
    public static class326 field7773 = new class326(61, 4);

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "[[I")
    public static int[][] field7774 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "Lnk;")
    public static class326 field7776 = new class326(30, 3);

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "Ljava/lang/String;")
    public static String field7775;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 12)
    public static void method3129(int arg0) {
        field7775 = null;
        field7774 = null;
        if (arg0 < -92) {
            field7773 = null;
            field7776 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIII)V", line = 25)
    public static final void method3130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7772++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg0 * arg0;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        if (arg1 != -10587) {
            field7776 = null;
        }
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        if (arg3 >= class29.field460 && arg3 <= class472.field6996) {
            int var21 = class52.method367(arg0 + arg5, class235.field4076, (byte) 109, class182.field2877);
            int var22 = class52.method367(arg5 - arg0, class235.field4076, (byte) 124, class182.field2877);
            class357.method2291(var22, arg2, class209.field3294[arg3], var21, -1);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (var24 >= class29.field460 && var23 <= class472.field6996) {
                int var25 = class52.method367(arg5 + var6, class235.field4076, (byte) -61, class182.field2877);
                int var26 = class52.method367(arg5 - var6, class235.field4076, (byte) 99, class182.field2877);
                if (class29.field460 <= var23) {
                    class357.method2291(var26, arg2, class209.field3294[var23], var25, -1);
                }
                if (class472.field6996 >= var24) {
                    class357.method2291(var26, arg2, class209.field3294[var24], var25, -1);
                }
            }
        }
    }
}
