import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class275 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lcc;")
    public static class216 field4416 = new class216(64);

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field4418 = 0;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field4417 = 0;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
    public static int[] field4419 = new int[5];

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4421 = new String[1000];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIBII)V")
    public static final void method1901(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field4412++;
        class48.field700[0].method20(arg4, arg5);
        int var6 = (arg2 - 32) * arg2 / arg0;
        class48.field700[1].method20(arg4, arg2 + arg5 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg1 / (arg0 - arg2);
        if (arg3 != 127) {
            field4421 = null;
        }
        class70.method508(arg4, arg5 + 16, 16, arg2 - 32, class257.field4231);
        class70.method508(arg4, arg5 + var7 + 16, 16, var6, class21.field241);
        class70.method510(arg4, var7 + arg5 + 16, var6, class152.field2508);
        class70.method510(arg4 + 1, arg5 - -var7 + 16, var6, class152.field2508);
        class70.method492(arg4, arg5 + var7 + 16, 16, class152.field2508);
        class70.method492(arg4, arg5 + var7 + 17, 16, class152.field2508);
        class70.method510(arg4 + 15, arg5 - (-16 - var7), var6, class212.field3393);
        class70.method510(arg4 + 14, arg5 - -var7 + 17, var6 - 1, class212.field3393);
        class70.method492(arg4, arg5 + var7 + var6 + 15, 16, class212.field3393);
        class70.method492(arg4 + 1, arg5 + var7 + 14 + var6, 15, class212.field3393);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V")
    public static final void method1902(int arg0, int[] arg1, int arg2, int arg3, Object[] arg4) {
        field4413++;
        if (arg0 > arg2) {
            int var5 = arg2;
            int var6 = (arg0 + arg2) / 2;
            int var7 = arg1[var6];
            arg1[var6] = arg1[arg0];
            arg1[arg0] = var7;
            Object var8 = arg4[var6];
            arg4[var6] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; var9++) {
                if (arg1[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5++] = var11;
                }
            }
            arg1[arg0] = arg1[var5];
            arg1[var5] = var7;
            arg4[arg0] = arg4[var5];
            arg4[var5] = var8;
            method1902(var5 - 1, arg1, arg2, arg3, arg4);
            method1902(arg0, arg1, var5 + 1, arg3, arg4);
        }
        if (arg3 != 9395) {
            field4416 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Lvd;")
    public static final class4 method1903(byte arg0) {
        if (arg0 == -56) {
            field4420++;
            class4 var1 = new class4(class262.field4258, class62.field912, class217.field3457[0], class272.field4377[0], class19.field214[0], class201.field3220[0], class152.field2505[0], class101.field1476);
            class188.method1398((byte) 111);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1904(int arg0) {
        field4419 = null;
        if (arg0 != 16) {
            field4421 = null;
        }
        field4421 = null;
        field4416 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static final void method1905(int arg0) {
        class91.field1355.method1556((byte) 115);
        field4411++;
        int var1 = -18 % ((-arg0 - 49) / 46);
        class265.field4292.method1556((byte) 119);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public static final void method1906(int arg0, int arg1) {
        class201 var2 = class94.method738(-110, arg0, 11);
        field4414++;
        if (arg1 <= 83) {
            field4419 = null;
        }
        var2.method1475(-743577184);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public static final void method1907(byte arg0) {
        field4415++;
        int var1 = class192.field3096;
        int var2 = class116.field1670;
        int var3 = class98.field1440;
        int var4 = class101.field1500;
        int var5 = 6116423;
        class70.method508(var1, var2, var4, var3, var5);
        class70.method508(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class70.method505(var1 + 1, var2 - -18, var4 - 2, var3 - 19, 0);
        class285.field4511.method1254(class280.field4466, var1 + 3, var2 + 14, var5, -1);
        int var6 = class296.field4680;
        int var7 = class169.field2731;
        for (int var8 = 0; var8 < class243.field3890; var8++) {
            int var9 = var2 + ((class243.field3890 - var8 - 1) * 15) + 31;
            int var10 = 16777215;
            if (var7 > var1 && var7 < (var1 + var4) && (var9 - 13) < var6 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class285.field4511.method1254(class188.method1401(2, var8), var1 + 3, var9, var10, 0);
        }
        class46.method346(class116.field1670, class192.field3096, class101.field1500, class98.field1440, 29262);
        if (arg0 < 96) {
            field4416 = null;
        }
    }
}
