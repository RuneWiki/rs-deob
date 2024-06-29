import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class600 extends class56 {

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    private int field8420 = 2048;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    private int field8423 = 1024;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    private int field8424 = 3072;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "Z")
    public static boolean field8422 = false;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "Lqfa;")
    public static class98 field8417 = new class98(111, 10);

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "Lpca;")
    public static class714 field8425 = new class714(128, 4);

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "S")
    public static short field8426 = 205;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "Z")
    public static boolean field8427 = false;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILee;I)V", line = 7)
    public final void method6(int arg0, class675 arg1, int arg2) {
        ++field8421;
        if (arg0 != 3731) {
            this.field8424 = -124;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field674 = ~arg1.method3750((byte) 35) == -2;
                }
            } else {
                this.field8424 = arg1.method3757((byte) -65);
            }
        } else {
            this.field8423 = arg1.method3757((byte) -65);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 52)
    public final void method364(int arg0) {
        ++field8415;
        if (arg0 != 7) {
            field8425 = null;
        }
        this.field8420 = -this.field8423 + this.field8424;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 63)
    public class600() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)[I", line = 66)
    public final int[] method24(int arg0, boolean arg1) {
        ++field8418;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            return null;
        } else {
            if (super.field673.field8073) {
                int[] var4 = this.method367(4463, 0, arg0);
                for (int var5 = 0; var5 < class328.field4576; ++var5) {
                    var3[var5] = this.field8423 - -(var4[var5] * this.field8420 >> 12);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V", line = 99)
    public static void method3368(byte arg0) {
        field8425 = null;
        if (arg0 < 113) {
            field8422 = false;
        }
        field8417 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[[I", line = 120)
    public final int[][] method5(int arg0, int arg1) {
        ++field8416;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (arg1 != 1) {
            return null;
        } else {
            if (super.field668.field7292) {
                int[][] var4 = this.method369(arg0, -33, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class328.field4576; ++var11) {
                    var8[var11] = (var5[var11] * this.field8420 >> 12) + this.field8423;
                    var9[var11] = (var6[var11] * this.field8420 >> 12) + this.field8423;
                    var10[var11] = (var7[var11] * this.field8420 >> 12) + this.field8423;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V", line = 171)
    public static final void method3369(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class155.field2167 = arg4;
        if (arg2 == 1) {
            class184.field2493 = arg3;
            class244.field3262 = arg0;
            class130.field1567 = arg1;
            ++field8419;
        }
    }
}
