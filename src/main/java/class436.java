import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class436 extends class305 {

    @OriginalMember(owner = "client!us", name = "L", descriptor = "I")
    private int field6497 = -1;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public int field6490;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "I")
    public int field6491;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!us", name = "J", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!us", name = "K", descriptor = "Lnq;")
    public static class499 field6496;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "[I")
    public int[] field6493;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)[[I", line = 7)
    public int[][] method72(int arg0, byte arg1) {
        ++field6494;
        int[][] var3 = super.field4674.method2206(-119, arg0);
        if (arg1 >= -59) {
            return null;
        } else {
            if (super.field4674.field5110 && this.method2705(91)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = this.field6491 * (class537.field7884 == this.field6490 ? arg0 : this.field6490 * arg0 / class537.field7884);
                if (class91.field1471 != this.field6491) {
                    for (int var8 = 0; var8 < class91.field1471; ++var8) {
                        int var9 = this.field6491 * var8 / class91.field1471;
                        int var10 = this.field6493[var7 + var9];
                        var6[var8] = class307.method2028(var10 << 4, 4080);
                        var5[var8] = class307.method2028(65280, var10) >> 4;
                        var4[var8] = class307.method2028(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; var11 < class91.field1471; ++var11) {
                        int var12 = this.field6493[var7++];
                        var6[var11] = class307.method2028(4080, var12 << 4);
                        var5[var11] = class307.method2028(65280, var12) >> 4;
                        var4[var11] = class307.method2028(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(B)V", line = 78)
    public static void method2704(byte arg0) {
        if (arg0 > -89) {
            field6496 = null;
        }
        field6496 = null;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V", line = 90)
    public final void method2019(byte arg0) {
        int var2 = 33 % ((arg0 - -68) / 32);
        ++field6495;
        super.method2019((byte) -102);
        this.field6493 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILfh;B)V", line = 101)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 < 76) {
            this.field6497 = 6;
        }
        ++field6499;
        if (arg0 == 0) {
            this.field6497 = arg1.method1396(2);
        }
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "(I)Z", line = 115)
    public final boolean method2705(int arg0) {
        ++field6498;
        if (this.field6493 != null) {
            return true;
        } else if (this.field6497 >= 0) {
            class309 var2 = ~class175.field2690 <= -1 ? class309.method2038(class405.field5996, class175.field2690, this.field6497) : class309.method2031(class405.field5996, this.field6497);
            var2.method2041();
            this.field6493 = var2.method2042();
            this.field6490 = var2.field4717;
            this.field6491 = var2.field4713;
            return true;
        } else {
            int var3 = -78 % ((16 - arg0) / 58);
            return false;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)I", line = 141)
    public final int method2017(int arg0) {
        ++field6489;
        if (arg0 != -24033) {
            this.method2019((byte) -22);
        }
        return this.field6497;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V", line = 177)
    public class436() {
        super(0, false);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(III)B", line = 159)
    public static final byte method2706(int arg0, int arg1, int arg2) {
        if (arg1 != 32005) {
            return -4;
        } else {
            ++field6492;
            if (~arg2 != -10) {
                return 0;
            } else {
                return (byte) (~(arg0 & 1) != -1 ? 2 : 1);
            }
        }
    }
}
