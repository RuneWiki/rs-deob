import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class398 extends class192 {

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    private int field5068 = 585;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "Lnj;")
    public static class415 field5067 = new class415(23, -1);

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "[I")
    public static int[] field5071 = new int[13];

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "[I")
    public static int[] field5069 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Lra;")
    public static class361 field5070 = new class361(68, 6);

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "Ldn;")
    public static class548 field5074;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "Lpe;")
    public static class615 field5072;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 5)
    public static void method2277(int arg0) {
        field5072 = null;
        field5070 = null;
        field5069 = null;
        field5071 = null;
        field5074 = null;
        field5067 = null;
        if (arg0 != -1) {
            method2277(16);
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 22)
    public class398() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[I", line = 30)
    public final int[] method118(int arg0, byte arg1) {
        ++field5066;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 >= -123) {
            this.method118(-14, (byte) 41);
        }
        if (super.field2448.field7266) {
            int var4 = class221.field2895[arg0];
            for (int var5 = 0; var5 < class561.field7319; ++var5) {
                int var6 = class183.field2359[var5];
                if (var6 > this.field5068 && -this.field5068 + 4096 > var6 && ~(-this.field5068 + 2048) > ~var4 && ~(this.field5068 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field5068 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (-this.field5068 + 2048 < var6 && ~(this.field5068 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field5068;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field5068 + 2048);
                } else if (~this.field5068 >= ~var4 && ~(4096 - this.field5068) <= ~var4) {
                    if (this.field5068 <= var6 && ~(-this.field5068 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field5068);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field5068;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field5068 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILfd;I)V", line = 113)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field5068 = arg1.method2393(arg2 + -18567);
        }
        if (arg2 != -12160) {
            method2277(18);
        }
        ++field5065;
    }
}
