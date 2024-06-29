import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class106 {

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "[I")
    public static int[] field1619 = new int[50];

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "[[I")
    public static int[][] field1623 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IBIII)V")
    public static final void method843(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = -63 / ((arg1 + 57) / 58);
        field1620++;
        class188 var6 = class10.method48((byte) 55, 10, arg4);
        var6.method1308(false);
        var6.field2873 = arg2;
        var6.field2882 = arg3;
        var6.field2876 = arg0;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)V")
    public static final void method844(int arg0, byte arg1) {
        field1622++;
        int var2 = class446.field6625 - class499.field7270;
        if (var2 >= 100) {
            class33.field401 = 1;
            return;
        }
        int var3 = (int) class353.field5236;
        if ((class498.field7258 >> 8) > var3) {
            var3 = class498.field7258 >> 8;
        }
        if (class190.field2911[4] && var3 < class193.field2967[4] + 128) {
            var3 = class193.field2967[4] + 128;
        }
        int var4 = (int) class434.field6466 + class432.field6421 & 0x3FFF;
        if (arg1 != 126) {
            return;
        }
        class300.method1997(var3, class416.method2605(class116.field1781.field1279, class116.field1781.field1275, (byte) -125, class30.field370) - 50, (byte) 61, class172.field2662, class351.field5232, arg0, (var3 >> 3) * 3 + 600 << 0, var4);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class406.field5999 = (int) ((float) (class406.field5999 - class218.field3294) * var5 + (float) class218.field3294);
        class430.field6377 = (int) ((float) (class430.field6377 - class286.field4468) * var5 + (float) class286.field4468);
        class505.field7344 = (int) ((float) (class505.field7344 - class168.field2548) * var5 + (float) class168.field2548);
        class128.field1917 = (int) ((float) (class128.field1917 - class228.field3452) * var5 + (float) class228.field3452);
        int var6 = class536.field7863 - class405.field5984;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class536.field7863 = (int) ((float) var6 * var5 + (float) class405.field5984);
        class536.field7863 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method845(int arg0) {
        field1623 = null;
        field1619 = null;
        if (arg0 != 6) {
            method844(-114, (byte) -81);
        }
    }
}
