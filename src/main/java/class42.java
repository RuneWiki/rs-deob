import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class42 extends class585 {

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    private int field546 = 4096;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    private int field547 = 4096;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    private int field543 = 4096;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field542 = -2;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "Lwia;")
    public static class791 field550;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        ++field548;
        if (arg0) {
            method318(-125);
        }
        int[][] var3 = super.field8265.method1576((byte) 104, arg1);
        if (super.field8265.field3546) {
            int[][] var4 = this.method3417(0, arg1, (byte) 113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class293.field4278; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field543 * var12 >> 12;
                    var9[var11] = this.field547 * var13 >> 12;
                    var10[var11] = this.field546 * var14 >> 12;
                } else {
                    var8[var11] = this.field543;
                    var9[var11] = this.field547;
                    var10[var11] = this.field546;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
    public static final void method317(byte arg0) {
        if (arg0 != 48) {
            method318(2);
        }
        class720.field9964.method3743(8);
        ++field551;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field546 = arg0.method2998(true);
                }
            } else {
                this.field547 = arg0.method2998(true);
            }
        } else {
            this.field543 = arg0.method2998(true);
        }
        ++field544;
        if (arg1 != 1) {
            method318(8);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public static void method318(int arg0) {
        field550 = null;
        if (arg0 != -9840) {
            method318(75);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class42() {
        super(1, false);
    }
}
