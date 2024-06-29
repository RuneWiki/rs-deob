import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class485 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Liba;")
    public static class211 field6908 = new class211(66, 2);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lre;")
    public class290 field6907;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 3)
    public static void method2770(int arg0) {
        field6908 = null;
        if (arg0 != 2) {
            method2771(30, null, 64, 58, -20);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 21)
    public static final void method2771(int arg0, String arg1, int arg2, int arg3, int arg4) {
        field6906++;
        class5 var5 = class194.method1261(arg0, arg4, 6);
        if (var5 == null) {
            return;
        }
        if (var5.field70 != null) {
            class303 var6 = new class303();
            var6.field4499 = var5;
            var6.field4500 = var5.field70;
            var6.field4494 = arg2;
            var6.field4497 = arg1;
            class195.method1270(var6);
        }
        if (class264.field3451 != 10 || !client.method564(var5).method456(arg2 - 1, -27)) {
            return;
        }
        if (arg2 == 1) {
            class580.field8423++;
            class654 var7 = class631.method3628(class553.field8129, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var7, var5.field59, arg4);
            class444.method2623(119, var7);
        }
        if (arg2 == 2) {
            class353.field5250++;
            class654 var8 = class631.method3628(class285.field3811, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var8, var5.field59, arg4);
            class444.method2623(126, var8);
        }
        if (arg2 == 3) {
            class273.field3564++;
            class654 var9 = class631.method3628(class372.field5500, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var9, var5.field59, arg4);
            class444.method2623(119, var9);
        }
        if (arg2 == 4) {
            class531.field7829++;
            class654 var10 = class631.method3628(class169.field2388, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var10, var5.field59, arg4);
            class444.method2623(122, var10);
        }
        if (arg2 == 5) {
            class103.field1543++;
            class654 var11 = class631.method3628(class553.field8130, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var11, var5.field59, arg4);
            class444.method2623(125, var11);
        }
        if (arg2 == 6) {
            class381.field5736++;
            class654 var12 = class631.method3628(class27.field480, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var12, var5.field59, arg4);
            class444.method2623(127, var12);
        }
        if (arg2 == 7) {
            class592.field8596++;
            class654 var13 = class631.method3628(class152.field2151, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var13, var5.field59, arg4);
            class444.method2623(125, var13);
        }
        if (arg3 <= 65) {
            field6908 = null;
        }
        if (arg2 == 8) {
            class619.field8967++;
            class654 var14 = class631.method3628(class85.field1328, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var14, var5.field59, arg4);
            class444.method2623(116, var14);
        }
        if (arg2 == 9) {
            class43.field630++;
            class654 var15 = class631.method3628(class282.field3769, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var15, var5.field59, arg4);
            class444.method2623(122, var15);
        }
        if (arg2 == 10) {
            class692.field9783++;
            class654 var16 = class631.method3628(class502.field7096, (byte) -51, class357.field5280);
            class166.method1163((byte) 38, arg0, var16, var5.field59, arg4);
            class444.method2623(123, var16);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 156)
    public static final void method2772(byte arg0) {
        if (arg0 > -20) {
            return;
        }
        field6909++;
        for (int var1 = 0; var1 < 5; var1++) {
            class215.field2883[var1] = false;
        }
        class115.field1731 = 0;
        class150.field2120 = -1;
        class250.field3280 = -1;
        class608.field8804 = 0;
        class74.field1160 = -1;
        class684.field9659 = 1;
        class426.field6233 = -1;
    }
}
