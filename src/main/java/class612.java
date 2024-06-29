import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class612 extends class694 {

    @OriginalMember(owner = "client!gba", name = "G", descriptor = "Z")
    private boolean field8488 = true;

    @OriginalMember(owner = "client!gba", name = "L", descriptor = "I")
    private int field8493 = 4096;

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "Lfaa;")
    public static class140 field8489 = null;

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!gba", name = "I", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!gba", name = "J", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!gba", name = "K", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field8491;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (arg0 != -22151) {
            method3378((byte) 57);
        }
        if (super.field9740.field8738) {
            int[] var4 = this.method3809(0, arg1 + -1 & class384.field5383, (byte) 35);
            int[] var5 = this.method3809(0, arg1, (byte) 35);
            int[] var6 = this.method3809(0, arg1 + 1 & class384.field5383, (byte) 35);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class465.field6544; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field8493;
                int var12 = (var5[class168.field2537 & var10 + 1] + -var5[var10 + -1 & class168.field2537]) * this.field8493;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field8488) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field8488 = ~arg1.method718(116) == -2;
            }
        } else {
            this.field8493 = arg1.method743((byte) -5);
        }
        int var5 = -16 / ((arg2 - 58) / 63);
        ++field8487;
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "(III)Z")
    public static final boolean method3377(int arg0, int arg1, int arg2) {
        ++field8490;
        if (arg2 <= 81) {
            field8489 = null;
        }
        return ~(arg0 & 52) != -1;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V")
    public static void method3378(byte arg0) {
        field8489 = null;
        int var1 = 60 % ((arg0 - -22) / 62);
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
    public class612() {
        super(1, false);
    }
}
