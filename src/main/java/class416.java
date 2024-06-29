import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class416 extends class354 {

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "Z")
    private boolean field6148 = true;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "Z")
    private boolean field6153 = true;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "Lao;")
    public static class188 field6150 = new class188(55, -2);

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "Lao;")
    public static class188 field6152 = new class188(101, -1);

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "Lvp;")
    public static class123 field6154 = new class123(38, 3);

    @OriginalMember(owner = "client!nu", name = "R", descriptor = "Lvp;")
    public static class123 field6156 = new class123(18, 7);

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!nu", name = "Q", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!nu", name = "S", descriptor = "[[Ltn;")
    public static class58[][] field6157;

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V", line = 3)
    public class416() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(CB)Z", line = 6)
    public static final boolean method2561(char arg0, byte arg1) {
        if (arg1 != 4) {
            field6157 = null;
        }
        ++field6146;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)[I", line = 27)
    public final int[] method253(int arg0, byte arg1) {
        ++field6151;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            this.field6148 = false;
        }
        if (super.field5357.field1869) {
            int[] var4 = this.method2293(0, !this.field6153 ? arg0 : -arg0 + class30.field492, (byte) 69);
            if (this.field6148) {
                for (int var5 = 0; ~class404.field5952 < ~var5; ++var5) {
                    var3[var5] = var4[class168.field2527 - var5];
                }
            } else {
                class486.method2901(var4, 0, var3, 0, class404.field5952);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(IBI)Z", line = 65)
    public static final boolean method2562(int arg0, byte arg1, int arg2) {
        int var3 = 85 / ((arg1 - -40) / 36);
        ++field6147;
        return (256 & arg2) != 0;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILti;I)V", line = 77)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field5354 = arg1.method1918((byte) 95) == 1;
                }
            } else {
                this.field6153 = ~arg1.method1918((byte) -104) == -2;
            }
        } else {
            this.field6148 = arg1.method1918((byte) -48) == 1;
        }
        if (arg0 != 15180) {
            method2562(71, (byte) -91, 14);
        }
        ++field6149;
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V", line = 138)
    public static void method2563(int arg0) {
        if (arg0 != 3) {
            field6157 = null;
        }
        field6150 = null;
        field6152 = null;
        field6154 = null;
        field6156 = null;
        field6157 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BI)[[I", line = 153)
    public final int[][] method207(byte arg0, int arg1) {
        if (arg0 > -40) {
            field6157 = null;
        }
        ++field6155;
        int[][] var3 = super.field5351.method2819((byte) -58, arg1);
        if (super.field5351.field6959) {
            int[][] var4 = this.method2291(0, (byte) -102, this.field6153 ? -arg1 + class30.field492 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field6148) {
                for (int var11 = 0; class404.field5952 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class404.field5952 < ~var12; ++var12) {
                    var8[var12] = var5[-var12 + class168.field2527];
                    var9[var12] = var6[-var12 + class168.field2527];
                    var10[var12] = var7[-var12 + class168.field2527];
                }
            }
        }
        return var3;
    }
}
