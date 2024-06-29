import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class238 extends RuntimeException {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Ljava/lang/String;")
    public String field3813;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3811;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field3817 = 0;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3814 = 7759444;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3816 = "skill: ";

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lph;")
    public static class217 field3821;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1608(boolean arg0, String arg1) {
        if (!arg0) {
            System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
            field3820++;
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class238(Throwable arg0, String arg1) {
        this.field3813 = arg1;
        this.field3811 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
    public static final void method1609(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class90.field1468 < 100) {
            class66.method465(false);
        }
        class127.method904(arg3, arg4, arg1 + arg3, arg2 + arg4);
        field3818++;
        if (class90.field1468 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg3;
            int var7 = arg2 / 2 + arg4 - var5 - 18;
            class127.method886(arg3, arg4, arg1, arg2, 0);
            class127.method898(var6 - 152, var7, 304, 34, 9179409);
            class127.method886(var6 - 150, var7 + 2, class90.field1468 * 3, 30, 9179409);
            class59.field967.method642(class209.field3318, var6, var5 + var7, 16777215, -1);
            return;
        }
        class62.field1029 = class129.field2029 - ((int) ((float) arg2 / class275.field4418));
        class22.field287 = (int) ((float) (arg1 * 2) / class275.field4418);
        class28.field343 = (int) ((float) (arg2 * 2) / class275.field4418);
        class206.field3285 = class247.field3934 - ((int) ((float) arg1 / class275.field4418));
        int var8 = class247.field3934 - ((int) ((float) arg1 / class275.field4418));
        int var9 = class247.field3934 + ((int) ((float) arg1 / class275.field4418));
        int var10 = class129.field2029 - ((int) ((float) arg2 / class275.field4418));
        int var11 = (int) ((float) arg2 / class275.field4418) + class129.field2029;
        class275.method1848(var8, var10, var9, var11, arg3, arg4, arg1 + arg3, arg4 - -arg2 + 1);
        if (arg0 <= 36) {
            method1610(0, 70, -40, -28, -31);
        }
        class275.method1844();
        class246 var12 = class275.method1851();
        class57.method388(var12, 33, 0, 0);
        if (class274.field4401 > 0) {
            class98.field1584--;
            if (class98.field1584 == 0) {
                class98.field1584 = 20;
                class274.field4401--;
            }
        }
        if (!class119.field1908) {
            return;
        }
        int var13 = arg1 + arg3 - 5;
        int var14 = arg4 + arg2 - 8;
        class88.field1443.method647("Fps:" + class269.field4332, var13, var14, 16776960, -1);
        int var18 = var14 - 15;
        int var15 = 16776960;
        Runtime var16 = Runtime.getRuntime();
        int var17 = (int) ((var16.totalMemory() - var16.freeMemory()) / 1024L);
        if (var17 > 65536) {
            var15 = 16711680;
        }
        class88.field1443.method647("Mem:" + var17 + "k", var13, var18, var15, -1);
        var14 = var18 - 15;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIIII)V")
    public static final void method1610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -54) {
            return;
        }
        if (class82.field1374 <= arg0 && class259.field4188 >= arg0) {
            int var5 = class123.method866(class85.field1409, arg2, (byte) 62, class234.field3774);
            int var6 = class123.method866(class85.field1409, arg1, (byte) -85, class234.field3774);
            class256.method1726(arg0, true, var6, arg3, var5);
        }
        field3819++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static void method1611(boolean arg0) {
        field3816 = null;
        field3821 = null;
        if (arg0) {
            method1608(false, (String) null);
        }
    }
}
