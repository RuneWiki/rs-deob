import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class208 extends class49 {

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field3314 = -1;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3319 = "purple:";

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lrk;")
    public static class292 field3321;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[[Lrg;")
    public static class248[][] field3315;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static final void method1428(int arg0) {
        class267.field4326.method1873(-7401);
        field3318++;
        if (arg0 != 0) {
            method1431(-13, -119, -42, -66, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public static void method1429(byte arg0) {
        field3315 = null;
        if (arg0 > -36) {
            field3319 = null;
        }
        field3319 = null;
        field3321 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public static final void method1430(int arg0, int arg1, int arg2) {
        field3320++;
        class92 var3 = class163.method1116((byte) 15, arg1);
        int var4 = var3.field1461;
        int var5 = var3.field1467;
        int var6 = var3.field1465;
        int var7 = class171.field2802[var5 - var4];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class298.method2043(arg2 << var4 & var8 | class68.field1090[var6] & ~var8, var6, 0);
        if (arg0 != 15741) {
            method1429((byte) 97);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIB)V")
    public static final void method1431(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class92.field1462 < 100) {
            class59.method380(false);
        }
        field3317++;
        class94.method676(arg0, arg2, arg0 + arg3, arg1 + arg2);
        if (class92.field1462 < 100) {
            int var5 = arg3 / 2 + arg0;
            byte var6 = 20;
            int var7 = arg2 + arg1 / 2 - var6 - 18;
            class94.method660(arg0, arg2, arg3, arg1, 0);
            class94.method670(var5 - 152, var7, 304, 34, 9179409);
            class94.method660(var5 - 150, var7 + 2, class92.field1462 * 3, 30, 9179409);
            class170.field2792.method510(class183.field3041, var5, var6 + var7, 16777215, -1);
            return;
        }
        class183.field3035 = class249.field4095 - ((int) ((float) arg3 / class262.field4270));
        client.field2676 = (int) ((float) (arg1 * 2) / class262.field4270);
        class210.field3358 = (int) ((float) (arg3 * 2) / class262.field4270);
        int var8 = class45.field667 - ((int) ((float) arg1 / class262.field4270));
        int var9 = class249.field4095 - ((int) ((float) arg3 / class262.field4270));
        class111.field1706 = class45.field667 - ((int) ((float) arg1 / class262.field4270));
        int var10 = (int) ((float) arg3 / class262.field4270) + class249.field4095;
        int var11 = (int) ((float) arg1 / class262.field4270) + class45.field667;
        class262.method1767(var9, var8, var10, var11, arg0, arg2, arg0 + arg3, arg1 + arg2 + 1);
        class262.method1766();
        class223 var12 = class262.method1753();
        class134.method919((byte) -70, 0, var12, 0);
        if (class108.field1685 > 0) {
            client.field2660--;
            if (client.field2660 == 0) {
                class108.field1685--;
                client.field2660 = 20;
            }
        }
        if (class118.field1837) {
            int var13 = arg3 + arg0 - 5;
            int var14 = arg1 + arg2 - 8;
            class207.field3313.method506("Fps:" + class132.field2121, var13, var14, 16776960, -1);
            int var19 = var14 - 15;
            Runtime var15 = Runtime.getRuntime();
            int var16 = 16776960;
            int var17 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
            if (var17 > 65536) {
                var16 = 16711680;
            }
            class207.field3313.method506("Mem:" + var17 + "k", var13, var19, var16, -1);
            var14 = var19 - 15;
        }
        int var18 = -63 / ((-arg4 - 14) / 45);
    }
}
