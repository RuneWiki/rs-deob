import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class11 extends class349 {

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
    private int field111 = 585;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "[[I")
    public static int[][] field110 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)V")
    public static void method70(int arg0) {
        if (arg0 >= -8) {
            method71(32, (char) 65507);
        }
        field110 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IC)Z")
    public static final boolean method71(int arg0, char arg1) {
        if (arg0 != 57) {
            return true;
        } else {
            ++field109;
            return ~arg1 <= -49 && arg1 <= '9';
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field108;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        int var4 = 50 / ((56 - arg0) / 41);
        if (super.field5109.field7515) {
            int var5 = class54.field709[arg1];
            for (int var6 = 0; ~class39.field497 < ~var6; ++var6) {
                int var7 = class29.field283[var6];
                if (~this.field111 > ~var7 && var7 < -this.field111 + 4096 && -this.field111 + 2048 < var5 && ~(this.field111 + 2048) < ~var5) {
                    int var8 = -var7 + 2048;
                    int var9 = ~var8 <= -1 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field111 + 2048);
                    var3[var6] = 4096 - var11;
                } else if (var7 > 2048 - this.field111 && ~var7 > ~(this.field111 + 2048)) {
                    int var12 = var5 + -2048;
                    int var13 = ~var12 > -1 ? -var12 : var12;
                    int var14 = var13 - this.field111;
                    int var15 = var14 << 12;
                    var3[var6] = var15 / (-this.field111 + 2048);
                } else if (~this.field111 >= ~var5 && -this.field111 + 4096 >= var5) {
                    if (this.field111 <= var7 && ~(-this.field111 + 4096) <= ~var7) {
                        var3[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = ~var16 <= -1 ? var16 : -var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field111 + 2048);
                        var3[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = ~var20 > -1 ? -var20 : var20;
                    int var22 = var21 - this.field111;
                    int var23 = var22 << 12;
                    var3[var6] = var23 / (-this.field111 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg1 == 0) {
            this.field111 = arg2.method922((byte) -121);
        }
        if (arg0 != 4095) {
            this.method5(-125, -126, (class138) null);
        }
        ++field112;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
    public class11() {
        super(0, true);
    }
}
