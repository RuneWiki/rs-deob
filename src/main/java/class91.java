import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class91 {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Lbda;")
    public static class505 field1081 = new class505(1);

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method684(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1085++;
        int var5 = 0;
        int var6 = 14 % ((arg0 - 69) / 48);
        int var7 = arg2;
        int var8 = -arg2;
        class643.method3557(arg4 - arg2, class445.field6320[arg1], (byte) 113, arg3, arg2 + arg4);
        int var9 = -1;
        while (var5 < var7) {
            var9 += 2;
            var5++;
            var8 += var9;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var10 = class445.field6320[arg1 + var7];
                int[] var11 = class445.field6320[arg1 - var7];
                int var12 = arg4 + var5;
                int var13 = arg4 - var5;
                class643.method3557(var13, var10, (byte) 123, arg3, var12);
                class643.method3557(var13, var11, (byte) 120, arg3, var12);
            }
            int var14 = arg4 + var7;
            int var15 = arg4 - var7;
            int[] var16 = class445.field6320[arg1 + var5];
            int[] var17 = class445.field6320[arg1 - var5];
            class643.method3557(var15, var16, (byte) 71, arg3, var14);
            class643.method3557(var15, var17, (byte) 51, arg3, var14);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZILha;)Lda;", line = 58)
    public static final class59 method685(int arg0, boolean arg1, int arg2, class58 arg3) {
        field1082++;
        class655 var4 = class296.method1922(arg3, arg0, arg1, (byte) -22);
        if (arg2 != 0) {
            field1084 = -15;
        }
        return var4 == null ? null : var4.field8991;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 76)
    public static void method686(int arg0) {
        field1081 = null;
        if (arg0 != 16491) {
            field1081 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLha;)V", line = 93)
    public static final void method687(byte arg0, class58 arg1) {
        field1083++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != 112) {
            field1084 = 25;
        }
        if (class589.field8295) {
            var2 = class171.method1102(5467);
            var3 = class575.method3288((byte) -104);
        }
        int var4 = -10660793;
        class614.method3434(class470.field6668, class652.field8959 + var3, arg1, -16777216, true, var4, class225.field3039, class208.field2732 + var2);
        class505.field7241.method498(class208.field2732 + var2 + 3, 173, var4, class652.field8959 + var3 + 14, class71.field920.method588((byte) 118, class549.field7669), -1);
        int var5 = var2 + class530.field7470.method1094(arg0 - 198);
        int var6 = var3 + class530.field7470.method1089((byte) -63);
        if (class600.field8427) {
            int var7 = 0;
            for (class508 var8 = (class508) class455.field6429.method4000((byte) -7); var8 != null; var8 = (class508) class455.field6429.method4002(-102)) {
                int var12 = class652.field8959 + var7 * 16 + var3 + 31;
                var7++;
                if (var8.field7268 == 1) {
                    class337.method2191(class652.field8959 + var3, -256, -1, arg1, class225.field3039, var6, var5, (class37) var8.field7267.field9891.field8206, 9, class470.field6668, var12, class208.field2732 + var2);
                } else {
                    class48.method307(255, var6, arg1, -1, class470.field6668, var12, var5, class652.field8959 + var3, var8, class208.field2732 + var2, class225.field3039, -256);
                }
            }
            if (class430.field6135 != null) {
                class614.method3434(class426.field5986, class373.field5236, arg1, -16777216, true, var4, class505.field7238, class326.field4512);
                class505.field7241.method498(class326.field4512 + 3, 173, var4, class373.field5236 + 14, class430.field6135.field7270, -1);
                int var9 = 0;
                for (class37 var10 = (class37) class430.field6135.field7267.method4000((byte) -7); var10 != null; var10 = (class37) class430.field6135.field7267.method4002(arg0 - 153)) {
                    int var11 = var9 * 16 + class373.field5236 + 31;
                    class337.method2191(class373.field5236, -256, -1, arg1, class505.field7238, var6, var5, var10, 9, class426.field5986, var11, class326.field4512);
                    var9++;
                }
                class375.method2356(-8155, class426.field5986, class505.field7238, class373.field5236, class326.field4512);
            }
        } else {
            int var13 = 0;
            for (class37 var14 = (class37) class215.field2820.method2765(-12261); var14 != null; var14 = (class37) class215.field2820.method2759(-15361)) {
                int var15 = (class25.field341 - var13 - 1) * 16 + var3 + class652.field8959 + 31;
                var13++;
                class337.method2191(class652.field8959 + var3, -256, -1, arg1, class225.field3039, var6, var5, var14, 9, class470.field6668, var15, class208.field2732 + var2);
            }
        }
        class375.method2356(arg0 ^ 0xFFFFE055, class470.field6668, class225.field3039, class652.field8959 + var3, class208.field2732 + var2);
    }
}
