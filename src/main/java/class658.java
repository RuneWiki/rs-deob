import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class658 extends class493 {

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9169;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "J")
    public static long field9172 = 0L;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lr;IIIIILfa;)V", line = 3)
    public static final void method3779(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class214 arg6) {
        field9170++;
        if (class579.field8251 < 100) {
            class442.method2794(arg6, arg0, 60);
        }
        arg0.method352(arg2, arg5, arg2 + arg3, arg1 + arg5);
        if (class579.field8251 < 100) {
            byte var7 = 20;
            int var8 = arg2 + (arg3 / 2);
            int var9 = arg1 / 2 + arg5 - var7 - 18;
            arg0.method335(arg2, arg5, arg3, arg1, -16777216, 0);
            arg0.method344(var8 - 152, var9, 304, 34, class320.field5011[class677.field9526].getRGB(), 0);
            arg0.method335(var8 - 150, var9 - -2, class579.field8251 * 3, 30, class572.field8179[class677.field9526].getRGB(), 0);
            class246.field3928.method2654(var7 + var9, -1, class413.field6331[class677.field9526].getRGB(), class122.field1990.method1091(class135.field2206, 1), var8, true);
            return;
        }
        int var10 = class528.field7705 - ((int) ((float) arg3 / class378.field5877));
        int var11 = (int) ((float) arg1 / class378.field5877) + class97.field1570;
        int var12 = (int) ((float) arg3 / class378.field5877) + class528.field7705;
        class614.field8717 = class97.field1570 - ((int) ((float) arg1 / class378.field5877));
        int var13 = class97.field1570 - ((int) ((float) arg1 / class378.field5877));
        class531.field7741 = (int) ((float) (arg1 * 2) / class378.field5877);
        class614.field8727 = (int) ((float) (arg3 * 2) / class378.field5877);
        class183.field3075 = class528.field7705 - ((int) ((float) arg3 / class378.field5877));
        class378.method2475(var10 + class378.field5901, class378.field5902 + var11, class378.field5901 + var12, var13 - -class378.field5902, arg2, arg5, arg2 + arg3, arg1 + 1 + arg5);
        class378.method2491(arg0);
        class594 var14 = class378.method2486(arg0);
        class572.method3368(0, var14, 9179409, 0, arg0);
        int var15 = -106 / ((arg4 - 56) / 44);
        if (class471.field6976 > 0) {
            class442.field6729--;
            if (class442.field6729 == 0) {
                class442.field6729 = 20;
                class471.field6976--;
            }
        }
        if (!class217.field3567) {
            return;
        }
        int var16 = arg3 + arg2 - 5;
        int var17 = arg1 + arg5 - 8;
        class573.field8183.method2655(var17, -1, var16, 16776960, "Fps:" + class41.field583, (byte) 71);
        int var21 = var17 - 15;
        Runtime var18 = Runtime.getRuntime();
        int var19 = (int) ((var18.totalMemory() - var18.freeMemory()) / 1024L);
        int var20 = 16776960;
        if (var19 > 65536) {
            var20 = 16711680;
        }
        class573.field8183.method2655(var21, -1, var16, var20, "Mem:" + var19 + "k", (byte) 71);
        var17 = var21 - 15;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V", line = 85)
    public class658(int arg0) {
        this.field9169 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)[Lhga;", line = 94)
    public static final class158[] method3780(byte arg0) {
        field9171++;
        return arg0 == -3 ? new class158[] { class330.field5099, class623.field8793, class498.field7275, class475.field7031, class438.field6671, class100.field1649, class639.field8964, class650.field9103, class181.field3046, class556.field8033, class531.field7740, class528.field7703, class521.field7568, class602.field8561, class515.field7482, class161.field2738, class57.field737, class334.field5474, class86.field1049, class505.field7380, class689.field9668, class98.field1584, class411.field6313, class354.field5636, class609.field8648, class504.field7377, class626.field8823, class473.field6989, class10.field177, class232.field3689, class517.field7500, class610.field8671, class665.field9349, class85.field1047, class566.field8128, class335.field5478, class469.field6953, class478.field7076, class124.field2049, class288.field4573, class405.field6241, class640.field8984, class160.field2732, class139.field2344, class561.field8080, class140.field2358, class164.field2766, class402.field6192, class660.field9198, class578.field8220, class66.field843, class138.field2337, class659.field9178, class162.field2744, class497.field7258, class589.field8362, class500.field7341, class392.field6131, class177.field2888, class478.field7073, class136.field2217, class675.field9512, class276.field4476, class286.field4543, class420.field6423, class276.field4472, class347.field5572, class263.field4306, class443.field6743, class534.field7798, class268.field4353, class312.field4911, class351.field5595, class342.field5533, class206.field3452, class57.field750, class396.field6151, class444.field6752, class78.field995, class47.field637, class146.field2455, class47.field635, class567.field8136, class546.field7941, class286.field4550, class592.field8412, class413.field6345, class64.field822, class86.field1053, class520.field7517, class603.field8574, class331.field5113, class432.field6569, class350.field5593, class470.field6972, class664.field9255, class250.field3994, class418.field6400, class605.field8580, class390.field6044, class379.field5911, class507.field7396, class498.field7300, class476.field7050, class187.field3124, class612.field8699, class664.field9253, class96.field1531, class369.field5785, class56.field728, class665.field9418, class429.field6541, class572.field8174, class335.field5483, class78.field981, class555.field8027, class427.field6493, class643.field9049 } : null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 107)
    public final void method3781(byte arg0) {
        field9168++;
        int var2 = -4 % ((arg0 + 18) / 60);
        this.field9169.method3615();
    }
}
