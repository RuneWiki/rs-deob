import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class238 extends class24 {

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "[B")
    public static byte[] field3949 = new byte[32896];

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "Lve;")
    private static class255 field3960;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Lve;")
    private static class255 field3961;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "Lve;")
    private static class255 field3968;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "Lve;")
    private static class255 field3958;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Lve;")
    private static class255 field3966;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "Lve;")
    private static class255 field3962;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "Lve;")
    private static class255 field3964;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "Lve;")
    private static class255 field3963;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "Lve;")
    private static class255 field3970;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lve;")
    private static class255 field3969;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Lve;")
    private static class255 field3957;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Lve;")
    private static class255 field3971;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "[Lve;")
    public static class255[] field3956;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Lve;")
    public class255 field3948;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Lve;")
    public class255 field3950;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Lrg;")
    public static class88 field3965;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "[I")
    public static int[] field3952;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lpc;", line = 10)
    public static final class83 method1644(byte arg0) {
        field3972++;
        int var1 = -91 / ((-arg0 - 53) / 58);
        int var2 = class187.field3027[0] * class132.field2173[0];
        byte[] var3 = class282.field4849[0];
        class83 var6;
        if (class244.field4114[0]) {
            byte[] var7 = class150.field2539[0];
            int[] var8 = new int[var2];
            for (int var9 = 0; var9 < var2; var9++) {
                var8[var9] = class264.method1836(class154.method1134(255, var7[var9]) << 24, class18.field296[class154.method1134(var3[var9], 255)]);
            }
            var6 = new class65(class153.field2608, class154.field2632, class131.field2167[0], class298.field5098[0], class132.field2173[0], class187.field3027[0], var8);
        } else {
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class18.field296[class154.method1134(var3[var5], 255)];
            }
            var6 = new class83(class153.field2608, class154.field2632, class131.field2167[0], class298.field5098[0], class132.field2173[0], class187.field3027[0], var4);
        }
        class111.method850(-3);
        return var6;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Lte;", line = 59)
    public final class282 method1645(int arg0) {
        field3967++;
        return arg0 == 0 ? class14.field217[this.field357] : (class282) null;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V", line = 75)
    public static void method1646(int arg0) {
        field3968 = null;
        field3970 = null;
        field3956 = null;
        field3957 = null;
        field3963 = null;
        field3965 = null;
        field3961 = null;
        field3949 = null;
        field3971 = null;
        field3960 = null;
        field3964 = null;
        field3969 = null;
        field3966 = null;
        field3952 = null;
        if (arg0 != 0) {
            field3971 = (class255) null;
        }
        field3962 = null;
        field3958 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIBI)V", line = 103)
    public static final void method1647(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg4 > arg1) {
            class30.method170(arg4, class250.field4213[arg2], arg1, arg0, -30310);
        } else {
            class30.method170(arg1, class250.field4213[arg2], arg4, arg0, -30310);
        }
        if (arg3 != -27) {
            field3954 = -45;
        }
        field3955++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIB)V", line = 123)
    public static final void method1648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field3953++;
        int var7 = class198.method1425(class11.field156, false, arg2, class261.field4427);
        int var8 = class198.method1425(class11.field156, false, arg1, class261.field4427);
        int var9 = class198.method1425(class30.field473, false, arg4, class125.field2082);
        int var10 = class198.method1425(class30.field473, false, arg3, class125.field2082);
        int var11 = class198.method1425(class11.field156, false, arg0 + arg2, class261.field4427);
        int var12 = class198.method1425(class11.field156, false, arg1 - arg0, class261.field4427);
        for (int var13 = var7; var13 < var11; var13++) {
            class30.method170(var10, class250.field4213[var13], var9, arg5, -30310);
        }
        if (arg6 != -85) {
            method1647(100, 56, -20, (byte) 96, -44);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class30.method170(var10, class250.field4213[var14], var9, arg5, arg6 - 30225);
        }
        int var15 = class198.method1425(class30.field473, false, arg0 + arg4, class125.field2082);
        int var16 = class198.method1425(class30.field473, false, arg3 - arg0, class125.field2082);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class250.field4213[var17];
            class30.method170(var15, var18, var9, arg5, arg6 - 30225);
            class30.method170(var10, var18, var16, arg5, -30310);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3949[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3960 = class87.method607(72, "Sep");
        field3961 = class87.method607(45, "Apr");
        field3968 = class87.method607(94, "Nov");
        field3958 = class87.method607(70, "Mar");
        field3966 = class87.method607(67, "Jan");
        field3962 = class87.method607(117, "Aug");
        field3964 = class87.method607(116, "Oct");
        field3963 = class87.method607(113, "May");
        field3970 = class87.method607(107, "Dec");
        field3969 = class87.method607(123, "Jun");
        field3957 = class87.method607(88, "Feb");
        field3971 = class87.method607(90, "Jul");
        field3956 = new class255[] { field3966, field3957, field3958, field3961, field3963, field3969, field3971, field3962, field3960, field3964, field3968, field3970 };
    }
}
