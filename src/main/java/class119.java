import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class119 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Llaa;")
    public static class106 field1569 = new class106(8, 0, 4, 1);

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lfc;")
    public static class235 field1571 = new class235(105, 2);

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)[Lcc;")
    public static final class670[] method855(int arg0) {
        if (arg0 != 15) {
            field1569 = null;
        }
        field1570++;
        return new class670[] { class112.field1530, class292.field4392, class23.field315, class128.field1770, class46.field682, class517.field7069 };
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method856(int arg0) {
        field1569 = null;
        if (arg0 == -101) {
            field1571 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIBLe;Loa;I)V")
    public static final void method857(int arg0, int arg1, int arg2, byte arg3, class489 arg4, class638 arg5, int arg6) {
        if (class160.field2400 < 100) {
            class7.method36(arg5, (byte) 114, arg4);
        }
        field1572++;
        arg5.method442(arg6, arg2, arg1 + arg6, arg0 + arg2);
        if (class160.field2400 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg6;
            int var9 = arg2 - var7 - (-(arg0 / 2) + 18);
            arg5.method472(arg6, arg2, arg1, arg0, -16777216, 0);
            arg5.method399(var8 - 152, var9, 304, 34, class209.field3083[class72.field991].getRGB(), 0);
            arg5.method472(var8 - 150, var9 - -2, class160.field2400 * 3, 30, class327.field4829[class72.field991].getRGB(), 0);
            class548.field7419.method1305(class173.field2589[class72.field991].getRGB(), var7 + var9, class9.field152.method42(class666.field9377, arg3 ^ 0x4C33), true, var8, -1);
            return;
        }
        int var10 = class306.field4504 - ((int) ((float) arg1 / class148.field2195));
        int var11 = (int) ((float) arg0 / class148.field2195) + class480.field6695;
        int var12 = (int) ((float) arg1 / class148.field2195) + class306.field4504;
        int var13 = class480.field6695 - ((int) ((float) arg0 / class148.field2195));
        class674.field9483 = (int) ((float) (arg0 * 2) / class148.field2195);
        class679.field9576 = class306.field4504 - ((int) ((float) arg1 / class148.field2195));
        class663.field9359 = class480.field6695 - ((int) ((float) arg0 / class148.field2195));
        class313.field4640 = (int) ((float) (arg1 * 2) / class148.field2195);
        class148.method1023(class148.field2208 + var10, class148.field2206 + var11, var12 + class148.field2208, var13 - -class148.field2206, arg6, arg2, arg1 + arg6, arg0 + arg2 + 1);
        class148.method1028(arg5);
        class192 var14 = class148.method1029(arg5);
        if (arg3 != 71) {
            return;
        }
        class261.method1598(arg5, (byte) -36, var14, 0, 0);
        if (class669.field9441 > 0) {
            class126.field1759--;
            if (class126.field1759 == 0) {
                class126.field1759 = 20;
                class669.field9441--;
            }
        }
        if (!class99.field1356) {
            return;
        }
        int var15 = arg1 + arg6 - 5;
        int var16 = arg2 + arg0 - 8;
        class668.field9418.method1300(var16, var15, -128, 16776960, "Fps:" + class454.field6343, -1);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class668.field9418.method1300(var20, var15, -128, var19, "Mem:" + var18 + "k", -1);
        var16 = var20 - 15;
    }
}
