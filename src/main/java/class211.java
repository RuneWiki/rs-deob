import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class211 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3362 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lck;")
    private static class119 field3364 = class298.method1987((byte) 42, "Select");

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3366 = 0;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Lck;")
    public static class119 field3370 = field3364;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lck;")
    private static class119 field3367 = class298.method1987((byte) 40, "scroll:");

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lck;")
    public static class119 field3368 = class298.method1987((byte) 39, "RADEON");

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Lck;")
    public static class119 field3365 = field3367;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Lck;")
    public static class119 field3371 = field3367;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Z")
    public static boolean field3369;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[[I[[IIIIIIZIF[[F[[FLib;II[[F)I", line = 9)
    public static final int method1321(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, float arg11, float[][] arg12, float[][] arg13, class145 arg14, int arg15, int arg16, float[][] arg17) {
        field3361++;
        if (arg5 == 1) {
            int var19 = arg4;
            arg4 = arg1;
            arg1 = 128 - var19;
        } else if (arg5 == 2) {
            arg1 = 128 - arg1;
            arg4 = 128 - arg4;
        } else if (arg5 == 3) {
            int var18 = arg4;
            arg4 = 128 - arg1;
            arg1 = var18;
        }
        int var20;
        float var21;
        float var22;
        float var23;
        if (arg4 == arg16 && arg1 == 0) {
            var20 = arg8;
            var21 = arg17[arg7][arg0];
            var22 = arg12[arg7][arg0];
            var23 = arg13[arg7][arg0];
        } else if (arg4 == 128 && arg1 == 0) {
            var23 = arg13[arg7 + 1][arg0];
            var21 = arg17[arg7 + 1][arg0];
            var20 = arg15;
            var22 = arg12[arg7 + 1][arg0];
        } else if (arg4 == 128 && arg1 == 128) {
            var22 = arg12[arg7 + 1][arg0 + 1];
            var21 = arg17[arg7 + 1][arg0 + 1];
            var23 = arg13[arg7 + 1][arg0 + 1];
            var20 = arg10;
        } else if (arg4 == 0 && arg1 == 128) {
            var22 = arg12[arg7][arg0 + 1];
            var20 = arg6;
            var21 = arg17[arg7][arg0 + 1];
            var23 = arg13[arg7][arg0 + 1];
        } else {
            float var24 = arg13[arg7][arg0];
            float var25 = (float) arg4 / 128.0F;
            float var26 = (arg13[arg7 + 1][arg0] - var24) * var25 + var24;
            float var27 = arg17[arg7][arg0];
            float var28 = (arg17[arg7 + 1][arg0] - var27) * var25 + var27;
            float var29 = arg12[arg7][arg0];
            float var30 = (float) arg1 / 128.0F;
            float var31 = (arg12[arg7 + 1][arg0] - var29) * var25 + var29;
            float var32 = arg12[arg7][arg0 + 1];
            float var33 = arg13[arg7][arg0 + 1];
            float var34 = arg17[arg7][arg0 + 1];
            float var35 = (arg13[arg7 + 1][arg0 + 1] - var33) * var25 + var33;
            var23 = (var35 - var26) * var30 + var26;
            float var36 = (arg17[arg7 + 1][arg0 + 1] - var34) * var25 + var34;
            float var37 = (arg12[arg7 + 1][arg0 + 1] - var32) * var25 + var32;
            var21 = (var36 - var28) * var30 + var28;
            var22 = (var37 - var31) * var30 + var31;
            int var38 = class94.method644(arg15, 809465831, arg8, arg4);
            int var39 = class94.method644(arg10, 809465831, arg6, arg4);
            var20 = class94.method644(var39, 809465831, var38, arg1);
        }
        int var40 = (arg7 << 7) + arg4;
        int var41 = (arg0 << 7) + arg1;
        int var42 = class4.method78(arg7, arg4, arg0, arg1, -113, arg2);
        return arg14.method951(var40, var42, var41, var22, var23, var21, arg9 ? var20 & 0xFFFFFF00 : var20, arg3 == null ? 0.0F : (float) (var42 - class4.method78(arg7, arg4, arg0, arg1, -112, arg3)) / arg11);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)[Lmd;", line = 123)
    public static final class88[] method1322(byte arg0) {
        field3363++;
        class88[] var1 = new class88[class285.field4706];
        for (int var2 = 0; var2 < class285.field4706; var2++) {
            int var3 = class64.field1006[var2] * class232.field3741[var2];
            byte[] var4 = class247.field3989[var2];
            if (class98.field1501[var2]) {
                int[] var7 = new int[var3];
                byte[] var8 = class95.field1465[var2];
                for (int var9 = 0; var9 < var3; var9++) {
                    var7[var9] = class156.method998(class19.method151(var8[var9], 255) << 24, class161.field2553[class19.method151(var4[var9], 255)]);
                }
                var1[var2] = new class45(class227.field3641, class207.field3304, class155.field2475[var2], class7.field152[var2], class232.field3741[var2], class64.field1006[var2], var7);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class161.field2553[class19.method151(var4[var6], 255)];
                }
                var1[var2] = new class160(class227.field3641, class207.field3304, class155.field2475[var2], class7.field152[var2], class232.field3741[var2], class64.field1006[var2], var5);
            }
        }
        if (arg0 < 112) {
            field3368 = (class119) null;
        }
        class162.method1035(-20432);
        return var1;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 196)
    public static void method1323(int arg0) {
        field3370 = null;
        field3365 = null;
        field3371 = null;
        field3364 = null;
        field3368 = null;
        field3362 = null;
        field3367 = null;
        if (arg0 != -1) {
            method1321(119, -65, (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), -77, 118, 85, 82, 110, false, -35, -0.8078566F, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (class145) null, 47, -126, (float[][]) ((float[][]) null));
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Color;IZILck;)V", line = 214)
    public static final void method1324(Color arg0, int arg1, boolean arg2, int arg3, class119 arg4) {
        try {
            Graphics var5 = class39.field587.getGraphics();
            if (class147.field2362 == null) {
                class147.field2362 = new Font("Helvetica", 1, 13);
                class195.field3112 = class39.field587.getFontMetrics(class147.field2362);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class269.field4437, class131.field2000);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (arg3 < 115) {
                    return;
                }
                if (class31.field445 == null) {
                    class31.field445 = class39.field587.createImage(304, 34);
                }
                Graphics var6 = class31.field445.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class147.field2362);
                var6.setColor(Color.white);
                arg4.method794(22, 97, var6, (304 - arg4.method799(0, class195.field3112)) / 2);
                var5.drawImage(class31.field445, class269.field4437 / 2 - 152, class131.field2000 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class269.field4437 / 2 - 152;
                int var9 = class131.field2000 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 - (-(arg1 * 3) - 2), var9 - -2, 300 - arg1 * 3, 30);
                var5.setFont(class147.field2362);
                var5.setColor(Color.white);
                arg4.method794(var9 + 22, 115, var5, var8 + (304 - arg4.method799(0, class195.field3112)) / 2);
            }
            if (class4.field125 != null) {
                var5.setFont(class147.field2362);
                var5.setColor(Color.white);
                class4.field125.method794(class131.field2000 / 2 - 26, 50, var5, class269.field4437 / 2 - class4.field125.method799(0, class195.field3112) / 2);
            }
        } catch (Exception var12) {
            class39.field587.repaint();
        }
        field3360++;
    }
}
