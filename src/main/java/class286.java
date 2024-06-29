import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class286 extends RuntimeException {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Ljava/lang/String;")
    public String field3932;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3936;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lcba;")
    public static class471 field3933 = new class471(28, 3);

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static final void method1827(byte arg0) {
        int var1 = 23 % ((arg0 + 25) / 51);
        if (class340.method2063(class440.field6254, 30645) || class604.method3558(3, class440.field6254)) {
            class191.method1189(5000, -9677, class563.field7794 >> 10, class462.field6488 >> 10);
        } else {
            int var2 = class645.field9372.field616[0] >> 3;
            int var3 = class645.field9372.field618[0] >> 3;
            if (var2 >= 0 && var2 < class32.field513 >> 3 && var3 >= 0 && var3 < (class611.field8786 >> 3)) {
                class191.method1189(5000, -9677, var2, var3);
            } else {
                class191.method1189(0, -9677, class32.field513 >> 4, class611.field8786 >> 4);
            }
        }
        field3934++;
        class493.method2867(true);
        class538.method3088(81);
        class626.method3652(-65);
        class186.method1158(-1);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method1828(int arg0) {
        field3933 = null;
        if (arg0 != 17587) {
            method1827((byte) 107);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILn;IILqa;II)V")
    public static final void method1829(int arg0, class17 arg1, int arg2, int arg3, class207 arg4, int arg5, int arg6) {
        field3935++;
        if (class132.field2109 < 100) {
            class377.method2230(256, arg4, arg1);
        }
        arg4.method1308(arg0, arg2, arg0 + arg5, arg2 + arg6);
        if (class132.field2109 < 100) {
            byte var7 = 20;
            int var8 = arg5 / 2 + arg0;
            int var9 = arg2 + (arg6 / 2) - var7 - 18;
            arg4.method1321(arg0, arg2, arg5, arg6, -16777216, 0);
            arg4.method1325(var8 - 152, var9, 304, 34, class386.field5182[class56.field1007].getRGB(), 0);
            arg4.method1321(var8 - 150, var9 + 2, class132.field2109 * 3, 30, class1.field19[class56.field1007].getRGB(), 0);
            class515.field7246.method666(var7 + var9, class564.field7809[class56.field1007].getRGB(), var8, arg3 + 105, class476.field6704.method739(class173.field2491, -64), -1);
            return;
        }
        int var10 = class285.field3931 - (int) ((float) arg5 / class413.field5820);
        int var11 = (int) ((float) arg6 / class413.field5820) + class627.field9160;
        int var12 = (int) ((float) arg5 / class413.field5820) + class285.field3931;
        class309.field4172 = class285.field3931 - ((int) ((float) arg5 / class413.field5820));
        class86.field1380 = (int) ((float) (arg5 * 2) / class413.field5820);
        class634.field9273 = class627.field9160 - ((int) ((float) arg6 / class413.field5820));
        class271.field3772 = (int) ((float) (arg6 * 2) / class413.field5820);
        int var13 = class627.field9160 - ((int) ((float) arg6 / class413.field5820));
        class413.method2462(class413.field5829 + var10, class413.field5826 + var11, class413.field5829 + var12, class413.field5826 + var13, arg0, arg2, arg0 + arg5, arg2 + arg6 + arg3);
        class413.method2458(arg4);
        class46 var14 = class413.method2471(arg4);
        class227.method1450(0, var14, arg4, 0, -1);
        if (class592.field8498 > 0) {
            class314.field4237--;
            if (class314.field4237 == 0) {
                class314.field4237 = 20;
                class592.field8498--;
            }
        }
        if (!class137.field2157) {
            return;
        }
        int var15 = arg0 + arg5 - 5;
        int var16 = arg6 + arg2 - 8;
        class206.field2905.method674(var15, 16776960, (byte) -123, -1, var16, "Fps:" + class583.field8079);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class206.field2905.method674(var15, var19, (byte) -93, -1, var20, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class286(Throwable arg0, String arg1) {
        this.field3932 = arg1;
        this.field3936 = arg0;
    }
}
