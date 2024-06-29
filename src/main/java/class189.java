import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class189 extends class642 {

    @OriginalMember(owner = "client!afa", name = "D", descriptor = "I")
    private int field2568 = 4096;

    @OriginalMember(owner = "client!afa", name = "I", descriptor = "I")
    public static int field2573 = 0;

    @OriginalMember(owner = "client!afa", name = "C", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!afa", name = "E", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!afa", name = "F", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!afa", name = "G", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!afa", name = "H", descriptor = "Lwf;")
    public static class481 field2572;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method3(int arg0, int arg1) {
        ++field2567;
        if (arg1 != -9) {
            return null;
        } else {
            int[] var3 = super.field9216.method1185(arg0, arg1 ^ 120);
            if (super.field9216.field2418) {
                int[] var4 = this.method3658((byte) 84, class553.field8133 & arg0 + -1, 0);
                int[] var5 = this.method3658((byte) 98, arg0, 0);
                int[] var6 = this.method3658((byte) 77, class553.field8133 & arg0 + 1, 0);
                for (int var7 = 0; class338.field4909 > var7; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field2568;
                    int var9 = (var5[class412.field6121 & var7 + 1] + -var5[class412.field6121 & var7 - 1]) * this.field2568;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)) * 4096.0D);
                    int var15 = var14 != 0 ? 16777216 / var14 : 0;
                    var3[var7] = 4096 - var15;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)V", line = 60)
    public static void method1247(byte arg0) {
        int var1 = -90 % ((-68 - arg0) / 52);
        field2572 = null;
    }

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "(B)V", line = 70)
    public static final void method1248(byte arg0) {
        class692 var1 = class423.field6210;
        synchronized (class423.field6210) {
            if (arg0 <= 62) {
                field2572 = null;
            }
            class423.field6210.method3890(-1);
        }
        ++field2570;
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "()V", line = 89)
    public class189() {
        super(1, true);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILgk;B)V", line = 92)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field2568 = arg1.method3169(26488);
        }
        ++field2571;
        if (arg2 < 29) {
            field2572 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "(B)V", line = 109)
    public static final void method1249(byte arg0) {
        ++field2569;
        class18.field362.method1611((byte) 126);
        class315.field4612.method2344(true);
        class420.field6187.method575(511);
        class410.field6110.setBackground(Color.black);
        int var1 = 110 % ((arg0 - -20) / 33);
        class235.field3093 = -1;
        class18.field362 = class327.method2020((byte) 123, class410.field6110);
        class315.field4612 = class461.method2686(true, (byte) 100, class410.field6110);
    }
}
