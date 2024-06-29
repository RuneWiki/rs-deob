import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class21 extends class192 {

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "I")
    private int field225 = 1365;

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
    private int field227 = 20;

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "I")
    private int field226 = 0;

    @OriginalMember(owner = "client!uv", name = "P", descriptor = "I")
    private int field232 = 0;

    @OriginalMember(owner = "client!uv", name = "O", descriptor = "Lki;")
    public static class364 field231 = new class364();

    @OriginalMember(owner = "client!uv", name = "R", descriptor = "I")
    public static int field234 = 13156520;

    @OriginalMember(owner = "client!uv", name = "L", descriptor = "F")
    public static float field228;

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!uv", name = "N", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!uv", name = "Q", descriptor = "[I")
    public static int[] field233;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field226 = arg1.method2393(-30727);
                    }
                } else {
                    this.field232 = arg1.method2393(-30727);
                }
            } else {
                this.field227 = arg1.method2393(-30727);
            }
        } else {
            this.field225 = arg1.method2393(-30727);
        }
        if (arg2 != -12160) {
            field234 = -94;
        }
        ++field230;
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(B)V")
    public static void method117(byte arg0) {
        if (arg0 == -40) {
            field233 = null;
            field231 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
    public class21() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field229;
        if (arg1 >= -123) {
            this.method109(-22, (class418) null, -88);
        }
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            for (int var4 = 0; var4 < class561.field7319; ++var4) {
                int var5 = (class183.field2359[var4] << 12) / this.field225 + this.field232;
                int var6 = (class221.field2895[arg0] << 12) / this.field225 + this.field226;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field227 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 + -var12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field227 + -1) ? 0 : (var13 << 12) / this.field227;
            }
        }
        return var3;
    }
}
