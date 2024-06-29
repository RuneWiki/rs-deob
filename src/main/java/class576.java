import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class576 extends class667 {

    @OriginalMember(owner = "client!v", name = "C", descriptor = "Z")
    private boolean field8155 = true;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    private int field8156 = 4096;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Laj;")
    public static class312 field8161;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIZ)I")
    public static final int method3341(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8160;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg1;
        } else if (arg3) {
            return -30;
        } else if (~var4 == -2) {
            return arg2;
        } else {
            return var4 == 2 ? 4095 - arg1 : 4095 - arg2;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static final void method3342(int arg0) {
        ++field8154;
        int var1 = 0;
        if (class471.field6781 != null) {
            var1 = class471.field6781.field6705.method3488(27669);
        }
        if (~var1 != -3) {
            if (~var1 != -2) {
                class206.field2956 = class556.field7778;
                class452.field6245 = 0;
                class57.field1060 = 0;
                class363.field5105 = class194.field2788;
            } else {
                int var2 = class556.field7778 > 1024 ? 1024 : class556.field7778;
                class452.field6245 = (-var2 + class556.field7778) / 2;
                class206.field2956 = var2;
                int var3 = class194.field2788 > 768 ? 768 : class194.field2788;
                class363.field5105 = var3;
                class57.field1060 = 0;
            }
        } else {
            int var4 = class556.field7778 > 800 ? 800 : class556.field7778;
            int var5 = ~class194.field2788 < -601 ? 600 : class194.field2788;
            class452.field6245 = (class556.field7778 - var4) / 2;
            class206.field2956 = var4;
            class57.field1060 = 0;
            class363.field5105 = var5;
        }
        if (arg0 != -2) {
            field8161 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field8155 = ~arg0.method273(255) == -2;
            }
        } else {
            this.field8156 = arg0.method253(-13900);
        }
        ++field8158;
        if (arg1 != 3) {
            field8161 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class576() {
        super(1, false);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjda;Ljda;)V")
    public static final void method3343(int arg0, class224 arg1, class224 arg2) {
        ++field8157;
        if (arg1.field3202 != null) {
            arg1.method1553(-110);
        }
        arg1.field3201 = arg2;
        int var3 = -20 % ((-42 - arg0) / 57);
        arg1.field3202 = arg2.field3202;
        arg1.field3202.field3201 = arg1;
        arg1.field3201.field3202 = arg1;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public static void method3344(byte arg0) {
        int var1 = 125 / ((-63 - arg0) / 32);
        field8161 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        ++field8159;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178) {
            int[] var4 = this.method3744(arg1 - 1 & class77.field1453, (byte) 16, 0);
            int[] var5 = this.method3744(arg1, (byte) 122, 0);
            int[] var6 = this.method3744(arg1 + 1 & class77.field1453, (byte) 118, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class77.field1455; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field8156;
                int var12 = (var5[class439.field6131 & var10 + 1] + -var5[class439.field6131 & var10 + -1]) * this.field8156;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var20 = 0;
                    var18 = 0;
                    var19 = 0;
                }
                if (this.field8155) {
                    var18 = 2048 - -(var18 >> 1);
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return arg0 ? null : var3;
    }
}
