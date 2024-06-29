import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class355 {

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field4564 = 0;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field4566 = 0;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "Lwj;")
    public static class121 field4560 = new class121("game4", 3);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "Lwu;")
    public static class557 field4565;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "Lpaa;")
    public static class712 field4559;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
    public static void method2009(int arg0) {
        field4565 = null;
        if (arg0 == 5000) {
            field4560 = null;
            field4559 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method2010(class545 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class646.field9160 = arg0;
        class188.field2742 = arg1;
        class659.field9305 = class188.field2742 > 1 && class646.field9160.method2180();
        class509.field7106 = arg2;
        class96.field1402 = 0x1 << class509.field7106;
        class457.field6297 = class96.field1402 >> 1;
        Math.sqrt((double) (class457.field6297 * class457.field6297 + class457.field6297 * class457.field6297));
        class214.field3021 = arg3;
        class485.field6556 = arg4;
        class314.field4059 = arg5;
        class707.field9874 = arg6;
        class137.field1831 = class582.method3453(-20890);
        class568.method3398(false);
        class569.field8071 = new class38[arg3][class485.field6556][class314.field4059];
        class155.field2126 = new class339[arg3];
        if (arg7) {
            class589.field8454 = new int[class485.field6556][class314.field4059];
            class111.field1590 = new byte[class485.field6556][class314.field4059];
            class326.field4198 = new short[class485.field6556][class314.field4059];
            class192.field2787 = new class38[1][class485.field6556][class314.field4059];
            class435.field5969 = new class339[1];
        } else {
            class589.field8454 = null;
            class111.field1590 = null;
            class326.field4198 = null;
            class192.field2787 = null;
            class435.field5969 = null;
        }
        if (arg8) {
            class706.field9852 = new long[arg3][arg4][arg5];
            class146.field2026 = new class519[65535];
            class226.field3165 = new boolean[65535];
            class442.field6068 = 0;
        } else {
            class706.field9852 = null;
            class146.field2026 = null;
            class226.field3165 = null;
            class442.field6068 = 0;
        }
        class557.method3329(false);
        class261.field3566 = new class674[2][];
        class261.field3566[0] = new class674[class560.field7960[0]];
        class261.field3566[1] = new class674[class560.field7960[1]];
        class269.field3635 = new int[2];
        class160.field2206 = new class674[2][];
        class160.field2206[0] = new class674[class380.field5356[0]];
        class160.field2206[1] = new class674[class380.field5356[1]];
        class352.field4548 = new int[2];
        class140.field1931 = new class674[2][];
        class140.field1931[0] = new class674[class416.field5788[0]];
        class140.field1931[1] = new class674[class416.field5788[1]];
        class609.field8671 = new int[2];
        class603.field8622 = new class674[10000];
        class556.field7850 = 0;
        class232.field3220 = new class674[5000];
        class706.field9853 = 0;
        class707.field9873 = new class743[5000];
        class354.field4557 = 0;
        class359.field4594 = new boolean[class707.field9874 + class707.field9874 + 1][class707.field9874 + class707.field9874 + 1];
        class419.field5809 = new boolean[class707.field9874 + class707.field9874 + 2][class707.field9874 + class707.field9874 + 2];
        class48.field704 = new int[class707.field9874 + class707.field9874 + 2];
        class365.field4690 = class365.field4688;
        if (class659.field9305) {
            class534.field7490 = new boolean[arg3][class707.field9874 + class707.field9874 + 1][class707.field9874 + class707.field9874 + 1];
            class35.field502 = new boolean[arg3][][];
            if (class523.field7347 != null) {
                class492.method2907();
            }
            class523.field7347 = new class567[class188.field2742];
            class646.field9160.method2147(class523.field7347.length + 1);
            class646.field9160.method2071(0);
            for (int var9 = 0; var9 < class523.field7347.length; var9++) {
                class523.field7347[var9] = new class567(var9 + 1, class646.field9160);
                (new Thread(class523.field7347[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class188.field2742 == 2) {
                var10 = 4;
                class314.field4050 = 2;
            } else if (class188.field2742 == 3) {
                var10 = 6;
                class314.field4050 = 3;
            } else {
                var10 = 8;
                class314.field4050 = 4;
            }
            class66.field912 = new class270[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class66.field912[var11] = new class270(class136.field1829[class188.field2742 - 2][var11]);
            }
        } else {
            class314.field4050 = 1;
        }
        class678.field9554 = new int[class314.field4050 - 1];
        class619.field8818 = new int[class314.field4050 - 1];
    }
}
