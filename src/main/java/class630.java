import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class630 extends class642 {

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    private int field9124 = 4096;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "Z")
    private boolean field9127 = true;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "Lau;")
    public static class692 field9122 = new class692(8);

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 3)
    public class630() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[[I", line = 9)
    public final int[][] method138(int arg0, int arg1) {
        ++field9123;
        int[][] var3 = super.field9211.method1068(arg0 ^ arg0, arg1);
        if (super.field9211.field2131) {
            int[] var4 = this.method3658((byte) 72, arg1 + -1 & class553.field8133, 0);
            int[] var5 = this.method3658((byte) 106, arg1, 0);
            int[] var6 = this.method3658((byte) 100, arg1 + 1 & class553.field8133, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class338.field4909 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field9124;
                int var12 = (var5[var10 + 1 & class412.field6121] + -var5[var10 - 1 & class412.field6121]) * this.field9124;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var11 / var17;
                    var19 = 16777216 / var17;
                    var18 = var12 / var17;
                }
                if (this.field9127) {
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 91)
    public static void method3623(byte arg0) {
        if (arg0 < 108) {
            method3623((byte) -36);
        }
        field9122 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILgk;B)V", line = 111)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field9128;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field9127 = ~arg1.method3115(29871) == -2;
            }
        } else {
            this.field9124 = arg1.method3169(26488);
        }
        if (arg2 < 29) {
            field9126 = -44;
        }
    }
}
