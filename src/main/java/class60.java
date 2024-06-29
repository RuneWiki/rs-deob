import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class60 extends class646 {

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    private int field875 = 0;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    private int field876 = 0;

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
    private int field877 = 1;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "Z")
    public static boolean field874 = false;

    @OriginalMember(owner = "client!nn", name = "Q", descriptor = "Leda;")
    public static class116 field881 = new class116(40, 3);

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!nn", name = "P", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!nn", name = "R", descriptor = "[Lf;")
    public static class257[] field882;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field878;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field877 = arg0.method2705(-77);
                }
            } else {
                this.field875 = arg0.method2705(-80);
            }
        } else {
            this.field876 = arg0.method2705(-38);
        }
        if (arg2 < 7) {
            this.method422(-84);
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field880;
        if (arg1 != -120) {
            this.field875 = -92;
        }
        int[] var3 = super.field9156.method2193(arg1 ^ -1155, arg0);
        if (super.field9156.field5075) {
            int var4 = class78.field1195[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class89.field1330; ++var6) {
                int var7 = class518.field7652[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field876 == -1) {
                    var9 = (-var4 + var7) * this.field877;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field877 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field875 == -1) {
                    var12 = class609.field8759[var12 >> 4 & 255] + 4096 >> 1;
                } else if (this.field875 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
    public static void method511(int arg0) {
        field882 = null;
        field881 = null;
        if (arg0 != 40) {
            field874 = true;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
    public final void method422(int arg0) {
        if (arg0 == -1) {
            ++field879;
            class549.method3223(109);
        }
    }
}
