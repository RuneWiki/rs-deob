import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class220 extends class273 {

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    private int field3519 = 1365;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    private int field3528 = 20;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    private int field3518 = 0;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    private int field3530 = 0;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field3520 = 3;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Z")
    public static boolean field3521 = false;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public static int field3526 = -1;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3527 = "flash1:";

    @OriginalMember(owner = "client!t", name = "O", descriptor = "[I")
    public static int[] field3522 = new int[100];

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "Lsb;")
    public static class124 field3517;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "[I")
    public static int[] field3529;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public static void method1453(int arg0) {
        if (arg0 > -63) {
            field3520 = 82;
        }
        field3517 = null;
        field3529 = null;
        field3522 = null;
        field3527 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            method1454((byte) 58);
        }
        int[] var3 = super.field4359.method387((byte) -29, arg1);
        if (super.field4359.field833) {
            for (int var4 = 0; var4 < class26.field458; ++var4) {
                int var5 = (class255.field4068[arg1] << 12) / this.field3519 + this.field3518;
                int var6 = (class265.field4234[var4] << 12) / this.field3519 + this.field3530;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var5;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && var13 < this.field3528) {
                    ++var13;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 + -var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 < this.field3528 + -1 ? (var13 << 12) / this.field3528 : 0;
            }
        }
        ++field3525;
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class220() {
        super(0, true);
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)I")
    public static final int method1454(byte arg0) {
        ++field3524;
        if (arg0 != -64) {
            method1453(-98);
        }
        if ((double) class199.field3249 == 3.0D) {
            return 37;
        } else if ((double) class199.field3249 == 4.0D) {
            return 50;
        } else if ((double) class199.field3249 == 6.0D) {
            return 75;
        } else {
            return (double) class199.field3249 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field3523;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 == 3) {
                        this.field3518 = arg0.method996(65280);
                    }
                } else {
                    this.field3530 = arg0.method996(65280);
                }
            } else {
                this.field3528 = arg0.method996(65280);
            }
        } else {
            this.field3519 = arg0.method996(65280);
        }
        if (arg2 != 5) {
            field3520 = 21;
        }
    }
}
