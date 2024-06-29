import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class234 {

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Liba;")
    public static class211 field3089 = new class211(3, -1);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILps;)Ljava/lang/String;", line = 3)
    public static final String method1443(int arg0, class5 arg1) {
        field3088++;
        if (client.method564(arg1).method452(16711680) == 0) {
            return null;
        } else if (arg0 <= 124) {
            return null;
        } else if (arg1.field44 == null || arg1.field44.trim().length() == 0) {
            return class1.field9 ? "Hidden-use" : null;
        } else {
            return arg1.field44;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 26)
    public static void method1444(int arg0) {
        if (arg0 == 15) {
            field3089 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lfa;IIIILr;I)V", line = 38)
    public static final void method1445(class615 arg0, int arg1, int arg2, int arg3, int arg4, class98 arg5, int arg6) {
        if (arg3 != 15) {
            field3089 = null;
        }
        if (class87.field1348 < 100) {
            class392.method2424(true, arg0, arg5);
        }
        field3086++;
        arg5.method652(arg2, arg6, arg1 + arg2, arg4 + arg6);
        if (class87.field1348 < 100) {
            byte var7 = 20;
            int var8 = arg2 + (arg1 / 2);
            int var9 = arg4 / 2 + arg6 - var7 - 18;
            arg5.method700(arg2, arg6, arg1, arg4, -16777216, 0);
            arg5.method633(var8 - 152, var9, 304, 34, class436.field6359[class2.field18].getRGB(), 0);
            arg5.method700(var8 - 150, var9 + 2, class87.field1348 * 3, 30, class29.field498[class2.field18].getRGB(), 0);
            class395.field5976.method2448((byte) 123, class580.field8448[class2.field18].getRGB(), -1, class279.field3643.method1654(arg3 ^ -99, class262.field3401), var7 + var9, var8);
            return;
        }
        int var10 = class108.field1617 - ((int) ((float) arg1 / class55.field844));
        int var11 = class19.field375 + ((int) ((float) arg4 / class55.field844));
        int var12 = (int) ((float) arg1 / class55.field844) + class108.field1617;
        class436.field6375 = class19.field375 - ((int) ((float) arg4 / class55.field844));
        class583.field8469 = (int) ((float) (arg4 * 2) / class55.field844);
        class678.field9597 = class108.field1617 - ((int) ((float) arg1 / class55.field844));
        int var13 = class19.field375 - ((int) ((float) arg4 / class55.field844));
        class530.field7814 = (int) ((float) (arg1 * 2) / class55.field844);
        class55.method329(class55.field865 + var10, class55.field866 + var11, var12 + class55.field865, var13 - -class55.field866, arg2, arg6, arg1 + arg2, arg4 + 1 + arg6);
        class55.method337(arg5);
        class302 var14 = class55.method340(arg5);
        class188.method1244(var14, 0, (byte) 0, arg5, 0);
        if (class606.field8764 > 0) {
            class405.field6057--;
            if (class405.field6057 == 0) {
                class606.field8764--;
                class405.field6057 = 20;
            }
        }
        if (!class300.field4448) {
            return;
        }
        int var15 = arg1 + arg2 - 5;
        int var16 = arg6 + arg4 - 8;
        class244.field3236.method2434(16776960, 22118, "Fps:" + class116.field1741, -1, var15, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class244.field3236.method2434(var19, 22118, "Mem:" + var18 + "k", -1, var15, var20);
        var16 = var20 - 15;
    }
}
