import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class224 extends class117 {

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    private int field3647 = 1024;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    private int field3649 = 2048;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    private int field3651 = 3072;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "[I")
    public static int[] field3642;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "[[[B")
    public static byte[][][] field3644;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(I)V")
    public static void method1538(int arg0) {
        if (arg0 != 0) {
            field3644 = null;
        }
        field3642 = null;
        field3644 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field3650;
        if (arg0 != 2) {
            method1539(-59);
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 57);
        if (super.field1883.field1313) {
            int[] var4 = this.method837(arg0 ^ 2, 0, arg1);
            for (int var5 = 0; ~var5 > ~class168.field2737; ++var5) {
                var3[var5] = (var4[var5] * this.field3649 >> 12) + this.field3647;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 != 1) {
            method1538(93);
        }
        this.field3649 = this.field3651 - this.field3647;
        ++field3648;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int var3 = 75 % ((37 - arg1) / 38);
        ++field3645;
        int[][] var4 = super.field1886.method419(arg0, (byte) 103);
        if (super.field1886.field1022) {
            int[][] var5 = this.method838(0, 0, arg0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var5[2];
            for (int var12 = 0; ~class168.field2737 < ~var12; ++var12) {
                var8[var12] = (var7[var12] * this.field3649 >> 12) + this.field3647;
                var9[var12] = (var6[var12] * this.field3649 >> 12) + this.field3647;
                var10[var12] = this.field3647 - -(var11[var12] * this.field3649 >> 12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field3646;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1885 = ~arg0.method1133((byte) 53) == -2;
                }
            } else {
                this.field3651 = arg0.method1142(-18970);
            }
        } else {
            this.field3647 = arg0.method1142(-18970);
        }
        if (arg1 != 255) {
            this.method47(66, -35);
        }
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "(I)Z")
    public static final boolean method1539(int arg0) {
        if (arg0 != 3072) {
            field3644 = null;
        }
        ++field3643;
        class177 var1 = class34.field516;
        synchronized (class34.field516) {
            if (class68.field1134 == class303.field4837) {
                return false;
            } else {
                class265.field4272 = class115.field1828[class68.field1134];
                class101.field1628 = class125.field1975[class68.field1134];
                class68.field1134 = class68.field1134 + 1 & 127;
                return true;
            }
        }
    }
}
