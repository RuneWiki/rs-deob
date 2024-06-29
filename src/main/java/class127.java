import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class127 implements class103 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1910 = "rating: ";

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1911 = 0;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1916 = " has logged in.";

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[[[I")
    public static int[][][] field1913;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;ZZZIILjava/lang/String;JIZ)V")
    public static final void method798(int arg0, String arg1, boolean arg2, boolean arg3, boolean arg4, int arg5, int arg6, String arg7, long arg8, int arg9, boolean arg10) {
        field1915++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class248 var14 = new class248(128);
        var14.method1568(10, (byte) 49);
        var14.method1605((arg10 ? 2 : 0) | (arg4 ? 1 : 0) | (arg3 ? 4 : 0), (byte) -99);
        var14.method1610(791715792, arg8);
        var14.method1577((byte) 83, var12[0]);
        var14.method1589((byte) 75, arg7);
        var14.method1577((byte) 63, var12[1]);
        var14.method1605(class259.field3946, (byte) 60);
        if (!arg2) {
            method801((byte) -77);
        }
        var14.method1568(arg0, (byte) 49);
        var14.method1568(arg6, (byte) 49);
        var14.method1577((byte) 29, var12[2]);
        var14.method1605(arg5, (byte) 50);
        var14.method1605(arg9, (byte) 73);
        var14.method1577((byte) 125, var12[3]);
        var14.method1573(class90.field1426, 90, class129.field1925);
        class248 var15 = new class248(350);
        var15.method1589((byte) 112, arg1);
        int var16 = 8 - (class62.method419(arg1, 68) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1568((int) (Math.random() * 255.0D), (byte) 49);
        }
        var15.method1594(1484614160, var12);
        class196.field2979.field3748 = 0;
        class196.field2979.method1568(22, (byte) 49);
        class196.field2979.method1605(var14.field3748 + var15.field3748 + 2, (byte) 26);
        class196.field2979.method1605(544, (byte) -81);
        class196.field2979.method1601(var14.field3723, var14.field3748, 16, 0);
        class196.field2979.method1601(var15.field3723, var15.field3748, 16, 0);
        class110.field1708 = 0;
        class163.field2501 = 1;
        class234.field3523 = 0;
        class61.field970 = -3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
    public static int method799(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Lc;")
    public static final class108 method800(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class108 var4 = var3.field4063;
            var3.field4063 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([IJIB)Ljava/lang/String;")
    public final String method660(int[] arg0, long arg1, int arg2, byte arg3) {
        field1914++;
        if (arg2 == 0) {
            class217 var6 = class31.method191(arg0[0], (byte) 35);
            return var6.method1398(-16, (int) arg1);
        } else if (arg2 == 1 || arg2 == 10) {
            class43 var8 = class160.method999((int) arg1, 0);
            return var8.field626;
        } else {
            int var7 = -110 % ((arg3 - 11) / 59);
            return arg2 == 6 || arg2 == 7 || arg2 == 11 ? class31.method191(arg0[0], (byte) 35).method1398(-16, (int) arg1) : null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method801(byte arg0) {
        field1910 = null;
        if (arg0 != -106) {
            method800(-41, -68, -43);
        }
        field1913 = null;
        field1916 = null;
    }
}
