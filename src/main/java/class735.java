import java.applet.Applet;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class735 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "J")
    public static long field10180 = -1L;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lvl;")
    public static class15 field10181 = new class15();

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "[S")
    public static short[] field10184 = new short[256];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field10182;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Ljava/applet/Applet;")
    public static Applet field10183;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ld;BIILha;II)V")
    public static final void method4075(class161 arg0, byte arg1, int arg2, int arg3, class65 arg4, int arg5, int arg6) {
        if (class37.field579 < 100) {
            class621.method3411(arg0, arg4, (byte) -84);
        }
        field10182++;
        arg4.method456(arg2, arg6, arg2 + arg5, arg6 - -arg3);
        if (class37.field579 < 100) {
            byte var7 = 20;
            int var8 = arg5 / 2 + arg2;
            int var9 = arg6 + (arg3 / 2) - var7 - 18;
            arg4.method563(arg2, arg6, arg5, arg3, -16777216, 0);
            arg4.method538(var8 - 152, var9, 304, 34, class93.field1328[class184.field2461].getRGB(), 0);
            arg4.method563(var8 - 150, var9 + 2, class37.field579 * 3, 30, class407.field5888[class184.field2461].getRGB(), 0);
            class251.field3716.method579(var8, -1, class120.field1757[class184.field2461].getRGB(), (byte) 109, class474.field6557.method2780(88, class38.field589), var7 + var9);
            return;
        }
        int var10 = class276.field4092 - ((int) ((float) arg5 / class375.field5429));
        int var11 = (int) ((float) arg3 / class375.field5429) + class66.field947;
        int var12 = (int) ((float) arg5 / class375.field5429) + class276.field4092;
        class183.field2452 = (int) ((float) (arg5 * 2) / class375.field5429);
        int var13 = class66.field947 - ((int) ((float) arg3 / class375.field5429));
        class131.field1946 = class276.field4092 - ((int) ((float) arg5 / class375.field5429));
        class360.field5268 = class66.field947 - ((int) ((float) arg3 / class375.field5429));
        class64.field907 = (int) ((float) (arg3 * 2) / class375.field5429);
        class375.method2345(var10 + class375.field5447, var11 - -class375.field5434, var12 + class375.field5447, var13 - -class375.field5434, arg2, arg6, arg2 + arg5, arg6 + 1 + arg3);
        if (arg1 < 121) {
            field10181 = null;
        }
        class375.method2327(arg4);
        class412 var14 = class375.method2339(arg4);
        class92.method738(var14, 0, 0, arg4, true);
        if (class653.field9062 > 0) {
            class526.field7210--;
            if (class526.field7210 == 0) {
                class526.field7210 = 20;
                class653.field9062--;
            }
        }
        if (!class605.field8216) {
            return;
        }
        int var15 = arg2 + arg5 - 5;
        int var16 = arg6 + arg3 - 8;
        class105.field1452.method569(16776960, "Fps:" + class549.field7446, -1, var15, var16, -1);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class105.field1452.method569(var19, "Mem:" + var18 + "k", -1, var15, var20, -1);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method4076(int arg0) {
        field10181 = null;
        if (arg0 < -96) {
            field10183 = null;
            field10184 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public static final void method4077(int arg0, int arg1) {
        if (class712.field9959.field1285.method800(111) == 0) {
            arg1 = -1;
        }
        field10179++;
        if (class655.field9073 == arg1) {
            return;
        }
        if (arg0 != -101) {
            method4077(102, 61);
        }
        if (arg1 != -1) {
            class155 var2 = class93.field1329.method4277(arg0 + 197, arg1);
            class508 var3 = var2.method1135(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class730.field10124.method629(var3.method2938(), false, var3.method2944(), var3.method2936(), class706.field9894, new Point(var2.field2119, var2.field2113));
                class655.field9073 = arg1;
            }
        }
        if (arg1 == -1 && class655.field9073 != -1) {
            class730.field10124.method629(-1, false, null, -1, class706.field9894, new Point());
            class655.field9073 = -1;
        }
    }
}
