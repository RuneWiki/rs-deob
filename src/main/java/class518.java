import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class518 {

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "Lrl;")
    public static class672 field7501 = new class672(31, 8);

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "Lrl;")
    public static class672 field7503 = new class672(35, 7);

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "[I")
    public static int[] field7506 = new int[1000];

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "Z")
    public static boolean field7505 = false;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "Lrl;")
    public static class672 field7507 = new class672(36, 3);

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "Lf;")
    public static class702 field7508;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "Ljava/awt/Image;")
    public static Image field7504;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZIIIII)V", line = 3)
    public static final void method3128(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7502++;
        long var6 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg4);
        class527 var8 = (class527) class437.field6663.method1558(var6, (byte) -93);
        if (var8 == null) {
            var8 = new class527();
            class437.field6663.method1564(var6, var8, (byte) 76);
        }
        if (var8.field7693.length <= arg5) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field7693.length; var11++) {
                var9[var11] = var8.field7693[var11];
                var10[var11] = var8.field7697[var11];
            }
            for (int var12 = var8.field7693.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field7697 = var10;
            var8.field7693 = var9;
        }
        var8.field7693[arg5] = arg2;
        int var13 = -75 / ((arg1 + 58) / 53);
        var8.field7697[arg5] = arg3;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V", line = 63)
    public static void method3129(boolean arg0) {
        field7506 = null;
        field7508 = null;
        field7504 = null;
        if (arg0) {
            method3128(true, -110, -5, -98, -25, 110);
        }
        field7503 = null;
        field7507 = null;
        field7501 = null;
    }
}
