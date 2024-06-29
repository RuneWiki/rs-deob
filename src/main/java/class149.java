import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class class149 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Loh;")
    public static class281 field2354 = new class281(50);

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field2358 = 0;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)I")
    public abstract int method1001(byte arg0, int arg1);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)V")
    public static final void method1002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2356++;
        if (class275.field4386 < 100) {
            class39.method282(-1);
        }
        class211.method1418(arg1, arg4, arg1 + arg3, arg2 + arg4);
        if (class275.field4386 < 100) {
            byte var5 = 20;
            int var6 = arg1 + (arg3 / 2);
            int var7 = arg2 / 2 + arg4 - var5 - 18;
            class211.method1424(arg1, arg4, arg3, arg2, 0);
            class211.method1411(var6 - 152, var7, 304, 34, 9179409);
            class211.method1411(var6 - 151, var7 - -1, 302, 32, 0);
            class211.method1424(var6 - 150, var7 + 2, class275.field4386 * 3, 30, 9179409);
            class211.method1424(class275.field4386 * 3 + var6 - 150, var7 + 2, 300 - class275.field4386 * 3, 30, 0);
            class228.field3517.method1671(class20.field296, var6, var7 + var5, 16777215, -1);
            return;
        }
        class25.field338 = (int) ((float) (arg0 * arg3) / class218.field3370);
        class82.field1386 = (int) ((float) (arg2 * 2) / class218.field3370);
        int var8 = class293.field4621 - ((int) ((float) arg3 / class218.field3370));
        class110.field1806 = class201.field3148 - (int) ((float) arg2 / class218.field3370);
        class24.field329 = class293.field4621 - ((int) ((float) arg3 / class218.field3370));
        int var9 = class201.field3148 - (int) ((float) arg2 / class218.field3370);
        int var10 = class201.field3148 + ((int) ((float) arg2 / class218.field3370));
        int var11 = (int) ((float) arg3 / class218.field3370) + class293.field4621;
        client.method1049(var8, var11, arg1, var10, var9, false, arg4, arg1 + arg3, arg2 + arg4);
        class49.method369((byte) -127, var9, arg1, var8, arg4, arg1 + arg3, class43.field616, arg2 + arg4, var10, var11);
        class148.method995(arg0 - 128, var10, var9, var8, arg2 + arg4, var11, arg4, arg1 + arg3, arg1);
        if (class71.field1140 > 0) {
            class6.field135--;
            if (class6.field135 == 0) {
                class6.field135 = 20;
                class71.field1140--;
            }
        }
        if (!class11.field208) {
            return;
        }
        int var12 = arg1 + arg3 - 5;
        int var13 = arg4 + arg2 - 8;
        int var14 = 16776960;
        class179.field2784.method1657("Fps:" + class106.field1771, var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class179.field2784.method1657("Mem:" + var16 + "k", var12, var17, var14, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1003(int arg0, int arg1);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method1004(int arg0) {
        if (arg0 != 0) {
            field2358 = -56;
        }
        field2354 = null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Lic;")
    public abstract class143 method1005(int arg0);

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public static final void method1006(int arg0) {
        field2357++;
        if (arg0 < -26) {
            class171.field2678.method1898((byte) -119);
            class165.field2587.method1898((byte) 21);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(BI)V")
    public abstract void method1007(byte arg0, int arg1);
}
