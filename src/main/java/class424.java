import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class424 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public int field5792;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field5793;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field5795;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public int field5797;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lqe;ILha;Lbr;)V", line = 5)
    public static final void method2566(class492 arg0, int arg1, class65 arg2, class413 arg3) {
        field5798++;
        class241 var4 = arg3.method2505(arg2, -1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1508();
        if (var5 < var4.method1502()) {
            var5 = var4.method1502();
        }
        byte var6 = 10;
        int var7 = arg0.field6972;
        int var8 = arg0.field6976;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field5646 != null) {
            var9 = class460.field6446.method36(null, class132.field1988, null, arg3.field5646, (byte) -52);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class132.field1988[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class139.field2068.method3770(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class139.field2068.method3767() + (class139.field2068.method3768() / 2);
        }
        int var15 = var5 / 2 + arg0.field6972;
        if (arg1 >= -116) {
            return;
        }
        if ((class117.field1819 + var5) > var7) {
            var15 = var5 / 2 + class117.field1819 + var10 / 2 + var6 + 5;
            var7 = class117.field1819;
        } else if ((class117.field1820 - var5) < var7) {
            var7 = class117.field1820 - var5;
            var15 = class117.field1820 - var6 - (var5 / 2 + var10 / 2) - 5;
        }
        int var16 = arg0.field6976;
        if (class117.field1823 + var5 > var8) {
            var8 = class117.field1823;
            var16 = class117.field1823 + (var5 / 2) + var6;
        } else if ((class117.field1822 - var5) < var8) {
            var16 = class117.field1822 - var11 - (var5 / 2) - var6;
            var8 = class117.field1822 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg0.field6972), (double) (var8 - arg0.field6976)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method1612((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field5646 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var10 + var18 + 10;
            var21 = var16 + (class139.field2068.method3767() * var9) + 3;
            if (arg3.field5653 != 0) {
                arg2.method436(var18, var20 - var18, arg3.field5653, var16, true, var21 - var16);
            }
            if (arg3.field5645 != 0) {
                arg2.method540(var21 - var16, var18, 25951, arg3.field5645, var16, var20 - var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class132.field1988[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class139.field2068.method3765(arg2, var23, var15, var16, arg3.field5642, true);
                var16 += class139.field2068.method3767();
            }
        }
        if (arg3.field5625 == -1 && arg3.field5646 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class348 var25 = new class348(arg0);
        var25.field4873 = var8 - var24;
        var25.field4876 = var7 - var24;
        var25.field4872 = var18;
        var25.field4871 = var21;
        var25.field4862 = var20;
        var25.field4864 = var8 + var24;
        var25.field4875 = var19;
        var25.field4865 = var7 + var24;
        class776.field10670.method1727(var25, (byte) 117);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 153)
    public static final void method2567(int arg0) {
        field5796++;
        class21.field353.method4080(true, class21.field353.field10075, 1);
        class21.field353.method4080(true, class21.field353.field10086, 1);
        class21.field353.method4080(true, class21.field353.field10058, 2);
        class21.field353.method4080(true, class21.field353.field10073, 2);
        class21.field353.method4080(true, class21.field353.field10067, 1);
        class21.field353.method4080(true, class21.field353.field10089, 1);
        class21.field353.method4080(true, class21.field353.field10104, 1);
        class21.field353.method4080(true, class21.field353.field10064, 1);
        class21.field353.method4080(true, class21.field353.field10069, 1);
        class21.field353.method4080(true, class21.field353.field10057, 1);
        class21.field353.method4080(true, class21.field353.field10062, 1);
        class21.field353.method4080(true, class21.field353.field10080, 1);
        class21.field353.method4080(true, class21.field353.field10072, 0);
        class21.field353.method4080(true, class21.field353.field10091, 1);
        class21.field353.method4080(true, class21.field353.field10096, 0);
        class21.field353.method4080(true, class21.field353.field10070, 0);
        class21.field353.method4080(true, class21.field353.field10102, 1);
        class21.field353.method4080(true, class21.field353.field10100, 0);
        class21.field353.method4080(true, class21.field353.field10090, arg0);
        class318.method2060(true);
        class21.field353.method4080(true, class21.field353.field10087, 1);
        class21.field353.method4080(true, class21.field353.field10088, 3);
        class594.method3464(true);
        class37.method289((byte) 68);
        class446.field6088 = true;
    }
}
