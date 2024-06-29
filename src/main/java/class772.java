import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class772 extends class585 {

    @OriginalMember(owner = "client!oha", name = "H", descriptor = "I")
    private int field10595 = 3072;

    @OriginalMember(owner = "client!oha", name = "K", descriptor = "I")
    private int field10598 = 2048;

    @OriginalMember(owner = "client!oha", name = "J", descriptor = "I")
    private int field10597 = 1024;

    @OriginalMember(owner = "client!oha", name = "O", descriptor = "Lok;")
    public static class266 field10602 = new class266();

    @OriginalMember(owner = "client!oha", name = "P", descriptor = "Lbu;")
    public static class21 field10603 = new class21(127, 4);

    @OriginalMember(owner = "client!oha", name = "R", descriptor = "[I")
    public static int[] field10605 = new int[14];

    @OriginalMember(owner = "client!oha", name = "E", descriptor = "I")
    public static int field10592;

    @OriginalMember(owner = "client!oha", name = "F", descriptor = "I")
    public static int field10593;

    @OriginalMember(owner = "client!oha", name = "G", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!oha", name = "I", descriptor = "I")
    public static int field10596;

    @OriginalMember(owner = "client!oha", name = "L", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!oha", name = "M", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!oha", name = "N", descriptor = "I")
    public static int field10601;

    @OriginalMember(owner = "client!oha", name = "T", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!oha", name = "Q", descriptor = "Lrja;")
    public static class114 field10604;

    @OriginalMember(owner = "client!oha", name = "S", descriptor = "Ljd;")
    public static class241 field10606;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIB[B)I", line = 3)
    public static final int method4255(int arg0, int arg1, byte arg2, byte[] arg3) {
        ++field10596;
        int var4 = -1;
        if (arg2 != 93) {
            return 90;
        } else {
            for (int var5 = arg1; var5 < arg0; ++var5) {
                var4 = class23.field368[(var4 ^ arg3[var5]) & 255] ^ var4 >>> 8;
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V", line = 29)
    public static void method4256(int arg0) {
        field10604 = null;
        field10605 = null;
        field10602 = null;
        field10606 = null;
        if (arg0 != 1297447720) {
            method4257(-117, 66, 102, 67);
        }
        field10603 = null;
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)[I", line = 43)
    public final int[] method55(int arg0, int arg1) {
        ++field10599;
        if (arg1 < 123) {
            field10604 = null;
        }
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int[] var4 = this.method3415(-127, 0, arg0);
            for (int var5 = 0; ~class293.field4278 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field10598 >> 12) + this.field10597;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V", line = 77)
    public final void method52(int arg0) {
        this.field10598 = -this.field10597 + this.field10595;
        ++field10592;
        if (arg0 != -4096) {
            this.method55(-66, -108);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZI)[[I", line = 91)
    public final int[][] method58(boolean arg0, int arg1) {
        ++field10600;
        int[][] var3 = super.field8265.method1576((byte) 119, arg1);
        if (super.field8265.field3546) {
            int[][] var4 = this.method3417(0, arg1, (byte) 113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class293.field4278 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field10598 >> 12) + this.field10597;
                var9[var11] = (var6[var11] * this.field10598 >> 12) + this.field10597;
                var10[var11] = (var7[var11] * this.field10598 >> 12) + this.field10597;
            }
        }
        if (arg0) {
            this.field10598 = 71;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "()V", line = 147)
    public class772() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIII)V", line = 156)
    public static final void method4257(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class21.field353.field10078.method2896(-118) * arg3 >> 8;
        ++field10601;
        if (arg0 >= -57) {
            field10604 = null;
        }
        if (~arg1 == 0 && !class169.field2642) {
            class601.method3496(true);
        } else if (arg1 != -1 && (~class577.field8137 != ~arg1 || !class95.method694((byte) -93)) && ~var4 != -1 && !class169.field2642) {
            class139.method1010(arg1, class488.field6899, false, 0, 0, var4, arg2);
            class753.method4192(95);
        }
        if (class577.field8137 != arg1) {
            class695.field9710 = null;
        }
        class577.field8137 = arg1;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lso;II)V", line = 190)
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field10594;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field8266 = ~arg0.method2964((byte) 71) == -2;
                }
            } else {
                this.field10595 = arg0.method2998(true);
            }
        } else {
            this.field10597 = arg0.method2998(true);
        }
        if (arg1 != 1) {
            this.method52(52);
        }
    }
}
