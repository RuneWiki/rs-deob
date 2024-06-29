import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class19 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field334 = Calendar.getInstance();

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLpk;[Lwh;)V")
    public static final void method132(byte arg0, class237 arg1, class289[] arg2) {
        class177.field2592 = arg2;
        field331++;
        class24.field391 = arg1;
        class18.field322 = new boolean[class177.field2592.length];
        if (arg0 != -92) {
            return;
        }
        class85.field1297.method305((byte) -67);
        int var3 = class24.field391.method1621("details", 1);
        int[] var4 = class24.field391.method1632(var3, (byte) -108);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class85.field1297.method309((byte) -8, class245.method1668(var4[var5], true, new class54(class24.field391.method1605(-128, var4[var5], var3))), (long) var4[var5]);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static final void method133(byte arg0) {
        if (arg0 == 3) {
            class15.field288.method944(65535);
            field332++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
    public static final void method134(byte arg0, int arg1) {
        field337++;
        class105 var2 = class9.method72(4, -1, arg1);
        var2.method764((byte) -117);
        if (arg0 < 77) {
            method136((byte) -84);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class130.field1903 < 100) {
            class11.method79((byte) -87);
        }
        field336++;
        class72.method567(arg2, arg1, arg0 + arg2, arg1 + arg4);
        if (class130.field1903 < 100) {
            byte var5 = 20;
            int var6 = arg0 / 2 + arg2;
            int var7 = arg1 + arg4 / 2 - var5 - 18;
            class72.method576(arg2, arg1, arg0, arg4, 0);
            class72.method564(var6 - 152, var7, 304, 34, 9179409);
            class72.method564(var6 - 151, var7 + 1, 302, 32, 0);
            class72.method576(var6 - 150, var7 - -2, class130.field1903 * 3, 30, 9179409);
            class72.method576(var6 + (class130.field1903 * 3) - 150, var7 - -2, 300 - (class130.field1903 * 3), 30, 0);
            class105.field1555.method1303(class14.field203, var6, var5 + var7, 16777215, -1);
            return;
        }
        class101.field1477 = class220.field3433 - ((int) ((float) arg0 / class78.field1243));
        class97.field1441 = class12.field171 - (int) ((float) arg4 / class78.field1243);
        class222.field3463 = (int) ((float) (arg4 * 2) / class78.field1243);
        class151.field2202 = (int) ((float) (arg0 * 2) / class78.field1243);
        int var8 = class12.field171 - ((int) ((float) arg4 / class78.field1243));
        int var9 = class220.field3433 - ((int) ((float) arg0 / class78.field1243));
        int var10 = (int) ((float) arg0 / class78.field1243) + class220.field3433;
        int var11 = (int) ((float) arg4 / class78.field1243) + class12.field171;
        class81.method629(arg1, var10, var11, arg1 + arg4, 0, var8, arg2, var9, arg0 + arg2);
        class43.method349(-91, var9, class244.field3781, var10, arg2, arg1 + arg4, var8, var11, arg0 + arg2, arg1);
        class1.method6(false, arg2, arg1 + arg4, var9, arg1, var10, var11, var8, arg0 + arg2);
        if (arg3 != -13379) {
            return;
        }
        if (class283.field4344 > 0) {
            class155.field2259--;
            if (class155.field2259 == 0) {
                class155.field2259 = 20;
                class283.field4344--;
            }
        }
        if (!class151.field2198) {
            return;
        }
        int var12 = arg2 + arg0 - 5;
        int var13 = arg1 + arg4 - 8;
        int var14 = 16776960;
        class269.field4186.method1292("Fps:" + class123.field1825, var12, var13, 16776960, -1);
        Runtime var15 = Runtime.getRuntime();
        int var17 = var13 - 15;
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class269.field4186.method1292("Mem:" + var16 + "k", var12, var17, var14, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static final void method136(byte arg0) {
        class216.field3319.method940(104);
        field335++;
        class128.field1889.method940(38);
        if (arg0 < 66) {
            field334 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public static final void method137(int arg0, int arg1) {
        field338++;
        class278.field4281.method938(arg0, (byte) -123);
        class275.field4239.method938(arg0, (byte) -123);
        if (arg1 <= 25) {
            field339 = 117;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method138(int arg0) {
        if (arg0 != -101) {
            field339 = -52;
        }
        field334 = null;
    }
}
