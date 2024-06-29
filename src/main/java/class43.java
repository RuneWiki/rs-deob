import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class43 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[Lup;")
    public static class150[] field585 = new class150[29];

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Ltj;")
    public static class108 field587;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Z")
    public static boolean field584;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lbk;Lvq;IIIIZ)V", line = 12)
    public static final void method292(class211 arg0, class269 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field583++;
        if (class284.field4121 < 100) {
            class46.method304(arg1, (byte) 119, arg0);
        }
        arg1.method937(arg5, arg2, arg5 + arg3, arg2 + arg4);
        if (class284.field4121 < 100) {
            byte var7 = 20;
            int var8 = arg3 / 2 + arg5;
            arg1.method1012(arg5, arg2, arg3, arg4, -16777216, 0);
            int var9 = arg4 / 2 + arg2 - var7 - 18;
            arg1.method983(var8 - 152, var9, 304, 34, class374.field5331[class356.field5155].getRGB(), 0);
            arg1.method1012(var8 - 150, var9 + 2, class284.field4121 * 3, 30, class294.field4243[class356.field5155].getRGB(), 0);
            class154.field2285.method2194(-21811, class105.field1346[class356.field5155].getRGB(), var9 + var7, class182.field2577.method2284((byte) -100, class309.field4497), -1, var8);
            return;
        }
        if (arg6) {
            field584 = true;
        }
        int var10 = class170.field2407 - ((int) ((float) arg3 / class176.field2468));
        int var11 = (int) ((float) arg4 / class176.field2468) + class175.field2459;
        int var12 = (int) ((float) arg3 / class176.field2468) + class170.field2407;
        class13.field196 = (int) ((float) (arg3 * 2) / class176.field2468);
        class347.field5069 = (int) ((float) (arg4 * 2) / class176.field2468);
        class56.field745 = class170.field2407 - ((int) ((float) arg3 / class176.field2468));
        class323.field4705 = class175.field2459 - ((int) ((float) arg4 / class176.field2468));
        int var13 = class175.field2459 - ((int) ((float) arg4 / class176.field2468));
        class176.method1241(class176.field2486 + var10, class176.field2493 + var11, class176.field2486 + var12, class176.field2493 + var13, arg5, arg2, arg5 + arg3, arg2 + 1 - -arg4);
        class176.method1255(arg1);
        class442 var14 = class176.method1249(arg1);
        class440.method2743(var14, 0, 0, true, arg1);
        if (class166.field2377 > 0) {
            class385.field5445--;
            if (class385.field5445 == 0) {
                class385.field5445 = 20;
                class166.field2377--;
            }
        }
        if (!class59.field791) {
            return;
        }
        int var15 = arg5 + arg3 - 5;
        int var16 = arg2 + arg4 - 8;
        class402.field5648.method2206(var15, -1, "Fps:" + class97.field1238, (byte) 81, var16, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class402.field5648.method2206(var15, -1, "Mem:" + var18 + "k", (byte) 81, var20, var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 95)
    public static void method293(int arg0) {
        if (arg0 <= 35) {
            field585 = null;
        }
        field585 = null;
        field587 = null;
    }
}
