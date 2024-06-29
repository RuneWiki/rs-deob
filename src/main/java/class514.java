import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class514 extends class305 {

    @OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method15(int arg0, int arg1) {
        ++field7496;
        if (arg1 != 4688) {
            this.method15(82, 90);
        }
        int[] var3 = super.field4677.method2174(arg0, -91);
        if (super.field4677.field5040) {
            int[] var4 = this.method2021(0, arg0, arg1 ^ 4688);
            for (int var5 = 0; class91.field1471 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILfh;B)V", line = 39)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 > 76) {
            ++field7493;
            if (arg0 == 0) {
                super.field4675 = ~arg1.method1337((byte) -110) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IB)[[I", line = 52)
    public final int[][] method72(int arg0, byte arg1) {
        ++field7491;
        if (arg1 > -59) {
            return null;
        } else {
            int[][] var3 = super.field4674.method2206(-16, arg0);
            if (super.field4674.field5110) {
                int[][] var4 = this.method2015(true, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class91.field1471 < ~var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = 4096 - var6[var11];
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(II)V", line = 100)
    public static final void method3051(int arg0, int arg1) {
        class178.field2722 = 3;
        ++field7495;
        class237.field3569 = -1;
        class287.field4472 = 100;
        class53.field810 = arg0;
        if (arg1 == -1319) {
            ;
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V", line = 116)
    public class514() {
        super(1, false);
    }
}
