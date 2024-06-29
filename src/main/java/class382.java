import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class382 extends class136 {

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    private int field5629 = -1;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field5631 = 0;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public int field5622;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public int field5630;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "[I")
    public int[] field5632;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "[Llk;")
    public static class413[] field5621;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)[[I", line = 13)
    public int[][] method272(byte arg0, int arg1) {
        ++field5628;
        int[][] var3 = super.field1952.method3127((byte) -103, arg1);
        if (arg0 < 33) {
            return null;
        } else {
            if (super.field1952.field7770 && this.method2331(-1121128860)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (class227.field3310 != this.field5630 ? this.field5630 * arg1 / class227.field3310 : arg1) * this.field5622;
                if (~class467.field6889 != ~this.field5622) {
                    for (int var8 = 0; class467.field6889 > var8; ++var8) {
                        int var9 = this.field5622 * var8 / class467.field6889;
                        int var10 = this.field5632[var7 - -var9];
                        var6[var8] = class345.method2089(255, var10) << 4;
                        var5[var8] = class345.method2089(var10, 65280) >> 4;
                        var4[var8] = class345.method2089(var10, 16711680) >> 12;
                    }
                } else {
                    for (int var11 = 0; ~var11 > ~class467.field6889; ++var11) {
                        int var12 = this.field5632[var7++];
                        var6[var11] = class345.method2089(4080, var12 << 4);
                        var5[var11] = class345.method2089(4080, var12 >> 4);
                        var4[var11] = class345.method2089(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V", line = 82)
    public static void method2329(int arg0) {
        field5621 = null;
        if (arg0 != -5669) {
            field5631 = -77;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 121)
    public class382() {
        super(0, false);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)V", line = 96)
    public static final void method2330(boolean arg0) {
        if (arg0) {
            method2330(false);
        }
        class156 var1 = class158.field2240;
        synchronized (class158.field2240) {
            class158.field2240.method1105(arg0);
        }
        ++field5625;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I", line = 109)
    public final int method1034(int arg0) {
        if (arg0 != -1) {
            return 29;
        } else {
            ++field5624;
            return this.field5629;
        }
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V", line = 124)
    public final void method659(int arg0) {
        super.method659(121);
        ++field5626;
        if (arg0 <= 120) {
            this.method272((byte) -62, 110);
        }
        this.field5632 = null;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)Z", line = 138)
    public final boolean method2331(int arg0) {
        ++field5623;
        if (this.field5632 != null) {
            return true;
        } else if (arg0 != -1121128860) {
            return false;
        } else if (this.field5629 >= 0) {
            class218 var2 = ~class153.field2179 <= -1 ? class218.method1488(class17.field196, class153.field2179, this.field5629) : class218.method1498(class17.field196, this.field5629);
            var2.method1492();
            this.field5632 = var2.method1489();
            this.field5630 = var2.field3139;
            this.field5622 = var2.field3140;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILiv;)V", line = 164)
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field5627;
        if (arg1 == 0) {
            this.field5629 = arg2.method623((byte) -92);
        }
        if (arg0 != 4) {
            this.method1034(-108);
        }
    }
}
