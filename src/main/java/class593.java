import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class593 extends class297 {

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
    private int field8111 = 1024;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    private int field8110 = 3072;

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
    private int field8117 = 2048;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "Z")
    public static boolean field8116 = false;

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "Lwu;")
    public static class373 field8115 = new class373(64);

    @OriginalMember(owner = "client!kq", name = "R", descriptor = "[I")
    public static int[] field8118 = new int[4];

    @OriginalMember(owner = "client!kq", name = "S", descriptor = "Z")
    public static boolean field8119 = false;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field8114;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field4178 = ~arg0.method1535(255) == -2;
                }
            } else {
                this.field8110 = arg0.method1478(842397944);
            }
        } else {
            this.field8111 = arg0.method1478(arg2 ^ 842367455);
        }
        if (arg2 != 31015) {
            this.method17((class215) null, -85, -85);
        }
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)V")
    public final void method711(int arg0) {
        ++field8109;
        this.field8117 = this.field8110 - this.field8111;
        if (arg0 < 108) {
            this.method15(-31, 9);
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field8112;
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            int[] var4 = this.method1951(arg0, 633706337, 0);
            for (int var5 = 0; class525.field7275 > var5; ++var5) {
                var3[var5] = this.field8111 - -(var4[var5] * this.field8117 >> 12);
            }
        }
        return arg1 != 255 ? null : var3;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        ++field8113;
        int[][] var3 = super.field4166.method2180(-113, arg0);
        if (arg1 != -1564599039) {
            this.method17((class215) null, -10, -112);
        }
        if (super.field4166.field4849) {
            int[][] var4 = this.method1948((byte) -55, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class525.field7275; ++var11) {
                var8[var11] = (var5[var11] * this.field8117 >> 12) + this.field8111;
                var9[var11] = (var6[var11] * this.field8117 >> 12) + this.field8111;
                var10[var11] = (var7[var11] * this.field8117 >> 12) + this.field8111;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)V")
    public static void method3376(int arg0) {
        field8118 = null;
        field8115 = null;
        if (arg0 != 0) {
            field8118 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
    public class593() {
        super(1, false);
    }
}
