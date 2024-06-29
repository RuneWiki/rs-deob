import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class290 extends class80 {

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "Lsba;")
    public static class200 field4590 = new class200(64);

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "Lrl;")
    public static class672 field4595 = new class672(23, -1);

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
    public static int field4596 = 0;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "F")
    public static float field4592;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "F")
    public static float field4597;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "Lri;")
    public static class97 field4593;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "Lri;")
    public static class97 field4598;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)Z")
    public static final boolean method2045(int arg0, int arg1) {
        field4588++;
        if (arg0 != -13857) {
            method2048(2, 72, 101, -52, -86);
        }
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)V")
    public static void method2046(boolean arg0) {
        field4590 = null;
        if (arg0) {
            method2047(false);
        }
        field4598 = null;
        field4593 = null;
        field4595 = null;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(Z)V")
    public static final void method2047(boolean arg0) {
        class402.field6203 = false;
        class257.field4073 = new class686[500];
        class95.field1489 = 0;
        class102.field1684 = 0;
        class684.field9589 = class134.field2203;
        class678.field9535 = new class686[1000];
        class210.field3502 = class134.field2203;
        class331.field5131 = new class686[500];
        class669.field9454 = 0;
        field4591++;
        if (!arg0) {
            return;
        }
        class288.field4579 = 0;
        class97.field1577 = new int[class524.field7649][class43.field597 + 1][class541.field7896 + 1];
        class48.field647 = new class686[2000];
        if (class595.field8435 instanceof class18) {
            class185.field3114 = false;
        } else {
            class185.field3114 = true;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIII)V")
    public static final void method2048(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4589++;
        class413 var5 = class674.method3852(arg0, arg3, 124);
        var5.method2633(16777215);
        var5.field6337 = arg2;
        var5.field6333 = arg1;
        var5.field6340 = arg4;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(IIIII)V")
    public static final void method2049(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4594++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class160.method1320(0, arg0 + arg2, class576.field8218, class340.field5510);
        int var10 = class160.method1320(arg3 ^ arg3, arg0 - arg2, class576.field8218, class340.field5510);
        class367.method2427(3803, arg4, var9, class39.field527[arg1], var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (class545.field7931 <= var12 && var11 <= class585.field8331) {
                    int var13 = class160.method1320(0, arg0 + var5, class576.field8218, class340.field5510);
                    int var14 = class160.method1320(0, arg0 - var5, class576.field8218, class340.field5510);
                    if (var12 <= class585.field8331) {
                        class367.method2427(3803, arg4, var13, class39.field527[var12], var14);
                    }
                    if (class545.field7931 <= var11) {
                        class367.method2427(3803, arg4, var13, class39.field527[var11], var14);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (class545.field7931 <= var16 && var15 <= class585.field8331) {
                int var17 = class160.method1320(0, arg0 + var6, class576.field8218, class340.field5510);
                int var18 = class160.method1320(0, arg0 - var6, class576.field8218, class340.field5510);
                if (class585.field8331 >= var16) {
                    class367.method2427(arg3 + 3739, arg4, var17, class39.field527[var16], var18);
                }
                if (class545.field7931 <= var15) {
                    class367.method2427(3803, arg4, var17, class39.field527[var15], var18);
                }
            }
        }
    }
}
