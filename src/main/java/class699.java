import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class699 extends class74 {

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field9804 = 0;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "Lf;")
    public static class534 field9807;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ltf;Ljava/lang/String;ZI)Lwb;")
    public static final class182 method3841(class701 arg0, String arg1, boolean arg2, int arg3) {
        if (arg3 != -18509) {
            return null;
        }
        field9801++;
        int var4 = arg0.method3875(arg1, (byte) -113);
        if (var4 == -1) {
            return new class182(0);
        }
        int[] var5 = arg0.method3852(12, var4);
        class182 var6 = new class182(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field2043) {
                class115 var9 = new class115(arg0.method3854((byte) 80, var4, var5[var8++]));
                int var10 = var9.method631(false);
                int var11 = var9.method643((byte) -77);
                int var12 = var9.method620((byte) 26);
                if (!arg2 && var12 == 1) {
                    var6.field2043--;
                } else {
                    var6.field2040[var7] = var10;
                    var6.field2041[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method3842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9808++;
        if (!class509.method2910(false, arg2, arg7, arg3)) {
            return false;
        }
        int var10 = class404.field5403[0];
        int var11 = class404.field5403[1];
        int var12 = class404.field5403[2];
        if (!class509.method2910(false, arg4, arg5, arg9)) {
            return false;
        }
        int var13 = class404.field5403[1];
        int var14 = class404.field5403[0];
        if (arg1 != -24488) {
            return false;
        }
        int var15 = class404.field5403[2];
        if (class509.method2910(false, arg0, arg6, arg8)) {
            int var16 = class404.field5403[1];
            int var17 = class404.field5403[0];
            int var18 = class404.field5403[2];
            return class410.method2294(var12, var17, 41, var15, var14, var11, var13, var16, var18, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method3843(int arg0) {
        field9807 = null;
        if (arg0 != 11170) {
            method3844(null, 55, null, 53, -61, -58);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lr;ILqp;III)V")
    public static final void method3844(class564 arg0, int arg1, class638 arg2, int arg3, int arg4, int arg5) {
        field9803++;
        class145 var6 = class689.field9695.method1114(-1, arg2.field9039);
        if (~var6.field1608 == arg5) {
            return;
        }
        int var8;
        if (arg2.field9052) {
            int var7 = arg2.field9047 + arg1;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class534 var9 = var6.method798(arg2.field8999, arg0, var8, (byte) -33);
        if (var9 == null) {
            return;
        }
        int var10 = arg2.field9051;
        int var11 = arg2.field9060;
        if ((var8 & 0x1) == 1) {
            var10 = arg2.field9060;
            var11 = arg2.field9051;
        }
        int var12 = var9.method312();
        int var13 = var9.method304();
        if (var6.field1604) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field1607 == 0) {
            var9.method3002(arg3, arg4 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method2997(arg3, 4 - (var11 * 4 - arg4), var12, var13, 0, var6.field1607 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLlw;Lsb;)Lqq;")
    public static final class653 method3845(byte arg0, class674 arg1, class305 arg2) {
        field9806++;
        class653 var3 = class273.method1604(arg0 - 45);
        var3.field9161 = arg2;
        if (arg0 != 45) {
            return null;
        }
        var3.field9159 = arg2.field3775;
        if (var3.field9159 == -1) {
            var3.field9158 = new class445(260);
        } else if (var3.field9159 == -2) {
            var3.field9158 = new class445(10000);
        } else if (var3.field9159 <= 18) {
            var3.field9158 = new class445(20);
        } else if (var3.field9159 > 98) {
            var3.field9158 = new class445(260);
        } else {
            var3.field9158 = new class445(100);
        }
        var3.field9158.method2578(arg1, -1431312856);
        var3.field9158.method2579(-23012, var3.field9161.method1760(true));
        var3.field9157 = 0;
        return var3;
    }
}
