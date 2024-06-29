import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class670 extends class214 {

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Z")
    private boolean field9493 = true;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    private int field9486 = 4096;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "[I")
    public static int[] field9489 = new int[2];

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "J")
    public static long field9487;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "[I")
    public static int[] field9491;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V", line = 6)
    public static void method3747(int arg0) {
        field9489 = null;
        if (arg0 != 20887) {
            method3747(39);
        }
        field9491 = null;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)[[I", line = 18)
    public final int[][] method62(int arg0, int arg1) {
        ++field9492;
        int[][] var3 = super.field3545.method2996((byte) 127, arg0);
        if (arg1 != -256) {
            this.method62(-44, -20);
        }
        if (super.field3545.field7147) {
            int[] var4 = this.method1545(class580.field8203 & arg0 + -1, 0, -1);
            int[] var5 = this.method1545(arg0, 0, -1);
            int[] var6 = this.method1545(arg0 + 1 & class580.field8203, 0, -1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class626.field8787; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field9486;
                int var12 = (var5[var10 - -1 & class245.field3948] - var5[class245.field3948 & var10 + -1]) * this.field9486;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                if (this.field9493) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILofa;I)V", line = 105)
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field9490;
        if (arg0 > 92) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    this.field9493 = arg1.method1987(-82) == 1;
                }
            } else {
                this.field9486 = arg1.method1989((byte) -45);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 143)
    public class670() {
        super(1, false);
    }
}
