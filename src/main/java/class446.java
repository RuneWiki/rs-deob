import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class446 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "[I")
    public static int[] field6459 = new int[6];

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Luf;")
    public static class310 field6460 = new class310(61, 2);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public int field6463;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public int field6465;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public int field6466;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public int field6468;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "[S")
    public static short[] field6467;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static void method2638(int arg0) {
        if (arg0 != 0) {
            method2638(-104);
        }
        field6467 = null;
        field6459 = null;
        field6460 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILqa;ILm;III)V")
    public static final void method2639(int arg0, class162 arg1, int arg2, class126 arg3, int arg4, int arg5, int arg6) {
        if (arg4 < ~class374.field5277) {
            class344.method1916(arg3, arg1, (byte) 117);
        }
        field6458++;
        arg1.method462(arg2, arg5, arg2 + arg6, arg5 - -arg0);
        if (class374.field5277 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg2;
            int var9 = arg0 / 2 + arg5 - var7 - 18;
            arg1.method459(arg2, arg5, arg6, arg0, -16777216, 0);
            arg1.method431(var8 - 152, var9, 304, 34, class153.field2189[class188.field2609].getRGB(), 0);
            arg1.method459(var8 - 150, var9 + 2, class374.field5277 * 3, 30, class204.field2897[class188.field2609].getRGB(), 0);
            class34.field487.method2884(var9 + var7, var8, class311.field4292[class188.field2609].getRGB(), -111, -1, class281.field3792.method590(class105.field1434, -22602));
            return;
        }
        int var10 = class201.field2872 - ((int) ((float) arg6 / class481.field7044));
        int var11 = class137.field1956 + ((int) ((float) arg0 / class481.field7044));
        int var12 = (int) ((float) arg6 / class481.field7044) + class201.field2872;
        class59.field796 = (int) ((float) (arg0 * 2) / class481.field7044);
        class167.field2369 = class137.field1956 - (int) ((float) arg0 / class481.field7044);
        int var13 = class137.field1956 - (int) ((float) arg0 / class481.field7044);
        class287.field3844 = class201.field2872 - (int) ((float) arg6 / class481.field7044);
        class61.field812 = (int) ((float) (arg6 * 2) / class481.field7044);
        class481.method2845(var10 + class481.field7046, class481.field7066 + var11, class481.field7046 + var12, class481.field7066 + var13, arg2, arg5, arg2 + arg6, arg5 - (-arg0 - 1));
        class481.method2842(arg1);
        class522 var14 = class481.method2835(arg1);
        class364.method2048(0, var14, -115, arg1, 0);
        if (class319.field4418 > 0) {
            class52.field706--;
            if (class52.field706 == 0) {
                class52.field706 = 20;
                class319.field4418--;
            }
        }
        if (!class433.field6302) {
            return;
        }
        int var15 = arg2 + arg6 - 5;
        int var16 = arg5 + arg0 - 8;
        class117.field1579.method2890(-1, "Fps:" + class20.field214, 16776960, var16, var15, -4907);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class117.field1579.method2890(-1, "Mem:" + var18 + "k", var19, var20, var15, -4907);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljv;B)Z")
    public static final boolean method2640(class55 arg0, byte arg1) {
        field6461++;
        class132 var2 = class82.field1154.method2121(arg0.method354((byte) 120), true);
        if (var2.field1887 == -1) {
            return true;
        }
        class526 var3 = class414.field6075.method1558(-1265, var2.field1887);
        if (arg1 == -60) {
            return var3.field7727 == -1 ? true : var3.method3084(-110);
        } else {
            return true;
        }
    }
}
