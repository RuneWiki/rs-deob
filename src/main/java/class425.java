import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class425 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lfja;")
    public static class783 field5811 = new class783(44, 2);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[Lpha;")
    public static class176[] field5810;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIJI)V", line = 8)
    public static final void method2506(int arg0, int arg1, long arg2, int arg3) {
        field5809++;
        int var5 = 27 % ((arg1 - 50) / 63);
        int var6 = (int) arg2 >> 14 & 0x1F;
        int var7 = (int) arg2 >> 20 & 0x3;
        int var8 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var6 != 10 && var6 != 11 && var6 != 22) {
            class297.method1910(var7, 0, true, arg3, 0, arg0, var6, 0, -97);
            return;
        }
        class445 var9 = class414.field5670.method2319(var8, false);
        int var10;
        int var11;
        if (var7 == 0 || var7 == 2) {
            var11 = var9.field6053;
            var10 = var9.field6100;
        } else {
            var10 = var9.field6053;
            var11 = var9.field6100;
        }
        int var12 = var9.field6095;
        if (var7 != 0) {
            var12 = (var12 << var7 & 0xF) + (var12 >> 4 - var7);
        }
        class297.method1910(0, var11, true, arg3, var10, arg0, 0, var12, -48);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 51)
    public static void method2507(int arg0) {
        field5811 = null;
        if (arg0 != 2) {
            method2507(-118);
        }
        field5810 = null;
    }
}
