import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class477 extends class65 {

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Ltg;")
    public class605 field6929 = new class605();

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[I")
    public static int[] field6931 = new int[1];

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[I")
    public static int[] field6930;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;III)Llc;")
    public static final class434 method2902(Canvas arg0, int arg1, int arg2, int arg3) {
        field6927++;
        try {
            Class var4 = Class.forName("gn");
            class434 var5 = (class434) var4.getDeclaredConstructor().newInstance();
            if (arg1 == 1196) {
                var5.method517(arg2, -5, arg0, arg3);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class55 var6 = new class55();
            var6.method517(arg2, -30, arg0, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ld;ZILha;III)V")
    public static final void method2903(class267 arg0, boolean arg1, int arg2, class544 arg3, int arg4, int arg5, int arg6) {
        if (class612.field8632 < 100) {
            class339.method2161(true, arg3, arg0);
        }
        field6928++;
        arg3.method240(arg2, arg6, arg2 + arg4, arg5 + arg6);
        if (class612.field8632 < 100) {
            byte var7 = 20;
            int var8 = arg4 / 2 + arg2;
            arg3.method410(arg2, arg6, arg4, arg5, -16777216, 0);
            int var9 = arg5 / 2 + arg6 - var7 - 18;
            arg3.method224(var8 - 152, var9, 304, 34, class4.field28[class472.field6851].getRGB(), 0);
            arg3.method410(var8 - 150, var9 + 2, class612.field8632 * 3, 30, class218.field3574[class472.field6851].getRGB(), 0);
            class257.field4034.method2473(false, -1, class641.field9011.method3621(98, class467.field6804), var7 + var9, class624.field8741[class472.field6851].getRGB(), var8);
            return;
        }
        int var10 = class187.field3121 - ((int) ((float) arg4 / class729.field10218));
        int var11 = (int) ((float) arg5 / class729.field10218) + class271.field4161;
        int var12 = (int) ((float) arg4 / class729.field10218) + class187.field3121;
        int var13 = class271.field4161 - (int) ((float) arg5 / class729.field10218);
        class404.field5992 = (int) ((float) (arg4 * 2) / class729.field10218);
        class106.field1551 = (int) ((float) (arg5 * 2) / class729.field10218);
        class709.field9986 = class187.field3121 - ((int) ((float) arg4 / class729.field10218));
        class629.field8848 = class271.field4161 - ((int) ((float) arg5 / class729.field10218));
        class729.method4050(class729.field10228 + var10, class729.field10239 + var11, class729.field10228 + var12, class729.field10239 + var13, arg2, arg6, arg2 + arg4, arg6 - -1 + arg5);
        class729.method4042(arg3);
        class605 var14 = class729.method4044(arg3);
        class681.method3800(var14, 0, 0, (byte) 117, arg3);
        if (class167.field2913 > 0) {
            class511.field7416--;
            if (class511.field7416 == 0) {
                class167.field2913--;
                class511.field7416 = 20;
            }
        }
        if (class758.field10580) {
            int var15 = arg2 + arg4 - 5;
            int var16 = arg5 + arg6 - 8;
            class74.field1105.method2482("Fps:" + class595.field8435, -1, var15, 0, 16776960, var16);
            int var20 = var16 - 15;
            Runtime var17 = Runtime.getRuntime();
            int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
            int var19 = 16776960;
            if (var18 > 65536) {
                var19 = 16711680;
            }
            class74.field1105.method2482("Mem:" + var18 + "k", -1, var15, 0, var19, var20);
            var16 = var20 - 15;
        }
        if (arg1) {
            field6930 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method2904(int arg0) {
        if (arg0 != 100) {
            method2904(115);
        }
        field6930 = null;
        field6931 = null;
    }
}
