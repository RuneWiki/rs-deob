import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class432 extends class4 {

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    private int field5888 = -1;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[I")
    public static int[] field5878 = new int[1];

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Luv;")
    public static class3 field5881 = new class3(57, 4);

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    private int field5880;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    private int field5889;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "[I")
    private int[] field5882;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public final void method14(int arg0) {
        super.method14(arg0);
        ++field5887;
        this.field5882 = null;
        if (arg0 != 26131) {
            this.method17(79, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(I)V")
    public static final void method2521(int arg0) {
        ++field5877;
        if (arg0 != -2) {
            field5878 = null;
        }
        if (class391.field5427 != null) {
            if (~class391.field5427.field6001 == -2) {
                class391.field5427 = null;
                return;
            }
            if (~class391.field5427.field6001 == -3) {
                class57.method309(class224.field2863, 96, 2, class565.field7920);
                class391.field5427 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 >= -89) {
            this.field5882 = null;
        }
        if (arg2 == 0) {
            this.field5888 = arg1.method3090(-102);
        }
        ++field5884;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class432() {
        super(0, false);
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "(I)V")
    public static void method2522(int arg0) {
        field5881 = null;
        if (arg0 == 0) {
            field5878 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/lang/Object;I[J)V")
    public static final void method2523(Object[] arg0, int arg1, long[] arg2) {
        if (arg1 != -1674857116) {
            method2521(-35);
        }
        class391.method2355(arg2, 26727, arg0, arg2.length + -1, 0);
        ++field5885;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field5890;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (arg1 >= -83) {
            method2521(-127);
        }
        if (super.field38.field7618) {
            int var4 = (class620.field8925 != this.field5880 ? this.field5880 * arg0 / class620.field8925 : arg0) * this.field5889;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class132.field1627 == ~this.field5889) {
                for (int var8 = 0; var8 < class132.field1627; ++var8) {
                    int var9 = this.field5882[var4++];
                    var7[var8] = class143.method783(var9 << 4, 4080);
                    var6[var8] = class143.method783(var9, 65280) >> 4;
                    var5[var8] = class143.method783(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~var10 > ~class132.field1627; ++var10) {
                    int var11 = this.field5889 * var10 / class132.field1627;
                    int var12 = this.field5882[var4 + var11];
                    var7[var10] = class143.method783(4080, var12 << 4);
                    var6[var10] = class143.method783(var12 >> 4, 4080);
                    var5[var10] = class143.method783(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(I)I")
    public final int method19(int arg0) {
        if (arg0 != 102) {
            method2523((Object[]) null, -48, (long[]) null);
        }
        ++field5883;
        return this.field5888;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
    public final void method11(byte arg0, int arg1, int arg2) {
        ++field5886;
        super.method11(arg0, arg1, arg2);
        if (this.field5888 >= 0 && class147.field1901 != null) {
            int var4 = class147.field1901.method2151(true, this.field5888).field613 ? 64 : 128;
            this.field5882 = class147.field1901.method2143(this.field5888, (byte) 15, false, var4, 1.0F, var4);
            this.field5889 = var4;
            this.field5880 = var4;
        }
    }
}
