import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class236 extends class210 {

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    private int field3521 = 585;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "Lvq;")
    public static class24 field3520 = new class24(26, -1);

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "Lvq;")
    public static class24 field3522 = new class24(20, 5);

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "Z")
    public static boolean field3523 = false;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "Lbn;")
    public static class160 field3524 = new class160(31, 4);

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field3525;

    static {
        new class409("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILat;)V", line = 5)
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 == -11941) {
            ++field3517;
            if (~arg0 == -1) {
                this.field3521 = arg2.method1767(arg1 + 1930505517);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)Z", line = 33)
    public static final boolean method1593(byte arg0) {
        ++field3518;
        if (class82.field1008 != 0) {
            return true;
        } else {
            if (arg0 < 68) {
                field3520 = null;
            }
            return class456.field6750.method2787(72);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)[I", line = 47)
    public final int[] method361(int arg0, byte arg1) {
        ++field3519;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int var4 = class331.field4911[arg0];
            for (int var5 = 0; class202.field2852 > var5; ++var5) {
                int var6 = class430.field6250[var5];
                if (~this.field3521 > ~var6 && ~(4096 - this.field3521) < ~var6 && var4 > -this.field3521 + 2048 && ~var4 > ~(this.field3521 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field3521 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (-this.field3521 + 2048 < var6 && var6 < 2048 - -this.field3521) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field3521;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3521 + 2048);
                } else if (var4 >= this.field3521 && var4 <= -this.field3521 + 4096) {
                    if (var6 >= this.field3521 && ~var6 >= ~(-this.field3521 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3521 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3521;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3521 + 2048);
                }
            }
        }
        if (arg1 != -38) {
            field3520 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 129)
    public class236() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)V", line = 136)
    public static void method1594(int arg0) {
        field3522 = null;
        field3520 = null;
        int var1 = -54 % ((-70 - arg0) / 37);
        field3524 = null;
    }
}
