import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class491 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[I")
    public static int[] field7199 = new int[25];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "B")
    public static byte field7196;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public int field7197;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field7198;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public int field7200;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public int field7201;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 12)
    public static void method2946(byte arg0) {
        field7199 = null;
        int var1 = -93 / ((arg0 - 28) / 46);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIILua;)V", line = 22)
    public static final void method2947(int arg0, int arg1, int arg2, int arg3, class470 arg4) {
        class148 var5 = class453.method2729(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field6946 = (arg1 << class527.field7754) + class47.field517;
        arg4.field6938 = arg3;
        arg4.field6936 = (arg2 << class527.field7754) + class47.field517;
        for (class480 var7 = var5.field2086; var7 != null; var7 = var7.field7058) {
            if (var7.field7054.field6329) {
                int var8 = var7.field7054.method890(-25430);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field6938 += var6;
            arg4.field6945 = true;
        }
        var5.field2084 = arg4;
    }
}
