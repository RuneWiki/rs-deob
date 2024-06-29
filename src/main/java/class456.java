import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class456 extends class362 {

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "Z")
    private boolean field6214 = true;

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
    private int field6211 = 4096;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "Lbt;")
    public static class48 field6213;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)V", line = 5)
    public static void method2629(int arg0) {
        field6213 = null;
        if (arg0 != 2048) {
            method2630(-18, 23, 84);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)[[I", line = 17)
    public final int[][] method153(int arg0, byte arg1) {
        ++field6210;
        if (arg1 <= 57) {
            field6212 = -62;
        }
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (super.field4938.field7848) {
            int[] var4 = this.method2221(0, class606.field8463 & arg0 + -1, -126);
            int[] var5 = this.method2221(0, arg0, -126);
            int[] var6 = this.method2221(0, class606.field8463 & arg0 + 1, -125);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class769.field10597; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field6211;
                int var12 = (var5[var10 + 1 & class522.field7083] + -var5[class522.field7083 & var10 + -1]) * this.field6211;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                    var18 = var12 / var17;
                }
                if (this.field6214) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(III)Z", line = 103)
    public static final boolean method2630(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2629(90);
        }
        ++field6209;
        return (arg2 & 2048) != 0;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V", line = 156)
    public class456() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lfca;II)V", line = 120)
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field6215;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field6214 = ~arg0.method793((byte) 127) == -2;
            }
        } else {
            this.field6211 = arg0.method763(arg2 + 82);
        }
        if (arg2 != -1) {
            this.method153(13, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIII)V", line = 160)
    public static final void method2631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 == 15901) {
            for (int var6 = arg3; arg2 >= var6; ++var6) {
                class679.method3826(class298.field4105[var6], arg0, 11, arg1, arg5);
            }
            ++field6216;
        }
    }
}
