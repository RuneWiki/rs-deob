import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class492 {

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Lnj;")
    public static class415 field6516 = new class415(17, 7);

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "[I")
    public static int[] field6518 = new int[8];

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "Lnj;")
    public static class415 field6517 = new class415(5, 8);

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "Lrh;")
    public static class642 field6520;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V", line = 7)
    public static void method2687(boolean arg0) {
        field6520 = null;
        field6517 = null;
        field6518 = null;
        field6516 = null;
        if (arg0) {
            method2688(44, false, -76, (byte) -50, false);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZIBZ)I", line = 26)
    public static final int method2688(int arg0, boolean arg1, int arg2, byte arg3, boolean arg4) {
        field6514++;
        class263 var5 = class265.method1643(false, arg1, arg0);
        if (var5 == null) {
            return 0;
        } else if (arg3 > -48) {
            return 10;
        } else {
            int var6 = 0;
            for (int var7 = 0; var7 < var5.field3523.length; var7++) {
                if (var5.field3523[var7] >= 0 && var5.field3523[var7] < class232.field3109.field2558) {
                    class696 var8 = class232.field3109.method1292(0, var5.field3523[var7]);
                    int var9 = var8.method3782(false, class191.field2445.method1075((byte) -65, arg2).field5546, arg2);
                    if (arg4) {
                        var6 += var5.field3525[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;", line = 65)
    public final String toString() {
        field6515++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V", line = 85)
    public static final void method2689(int arg0, int arg1) {
        field6519++;
        int var2 = class424.field5503 - class656.field9156;
        if (var2 >= 100) {
            class704.field9810 = 1;
            return;
        }
        int var3 = (int) class710.field9918;
        if (var3 < class194.field2539 >> 8) {
            var3 = class194.field2539 >> 8;
        }
        if (class86.field1150[4] && var3 < (class288.field3722[4] + 128)) {
            var3 = class288.field3722[4] + 128;
        }
        int var4 = (int) class141.field1859 + class611.field8257 & 0x3FFF;
        class311.method1811(class332.method1916(1218445319, class233.field3130.field503, class390.field4991, class233.field3130.field506) - 200, class473.field6168, arg1, var3, (var3 >> 3) * 3 + 600 << 2, var4, 127, class219.field2880);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        int var6 = -40 % ((arg0 - 16) / 58);
        class499.field6555 = (int) ((float) (class499.field6555 - class133.field1740) * var5 + (float) class133.field1740);
        class655.field9120 = (int) ((float) (class655.field9120 - class130.field1671) * var5 + (float) class130.field1671);
        class299.field3911 = (int) ((float) (class299.field3911 - class211.field2742) * var5 + (float) class211.field2742);
        class549.field7132 = (int) ((float) (class549.field7132 - class83.field1130) * var5 + (float) class83.field1130);
        int var7 = class358.field4639 - class374.field4799;
        if (var7 > 8192) {
            var7 -= 16384;
        } else if (var7 < -8192) {
            var7 += 16384;
        }
        class358.field4639 = (int) ((float) var7 * var5 + (float) class374.field4799);
        class358.field4639 &= 0x3FFF;
    }
}
