import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class297 extends class115 {

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    private int field4237 = -1;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field4234 = 0;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field4235 = 0;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field4238 = -1;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "Lfi;")
    public static class331 field4240 = new class331(4);

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "[I")
    public int[] field4236;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)V")
    public static void method1878(byte arg0) {
        field4240 = null;
        if (arg0 >= 0) {
            method1878((byte) -7);
        }
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "(I)Z")
    public final boolean method1879(int arg0) {
        if (arg0 <= 4) {
            this.method630(28);
        }
        ++field4231;
        if (this.field4236 != null) {
            return true;
        } else if (this.field4237 >= 0) {
            class145 var2 = class115.field1353 < 0 ? class145.method862(class59.field710, this.field4237) : class145.method854(class59.field710, class115.field1353, this.field4237);
            var2.method856();
            this.field4236 = var2.method861();
            this.field4233 = var2.field2043;
            this.field4239 = var2.field2038;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4237 = arg1.method1355(32136);
        }
        if (arg0 < 83) {
            this.method636(25);
        }
        ++field4246;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public final void method630(int arg0) {
        ++field4242;
        super.method630(64);
        int var2 = -37 / ((-57 - arg0) / 52);
        this.field4236 = null;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)I")
    public final int method636(int arg0) {
        ++field4245;
        if (arg0 != 14257) {
            method1880((class211) null, 99);
        }
        return this.field4237;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lbk;I)Ljava/lang/String;")
    public static final String method1880(class211 arg0, int arg1) {
        if (arg1 > -27) {
            field4234 = -89;
        }
        ++field4244;
        return class71.method419((byte) 82, 32767, arg0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[[I")
    public int[][] method144(int arg0, int arg1) {
        ++field4232;
        int[][] var3 = super.field1342.method2530(arg0, (byte) 122);
        int var4 = -12 % ((arg1 - -80) / 45);
        if (super.field1342.field5819 && this.method1879(95)) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8 = (class392.field5738 == this.field4239 ? arg0 : this.field4239 * arg0 / class392.field5738) * this.field4233;
            if (class218.field2979 != this.field4233) {
                for (int var9 = 0; ~var9 > ~class218.field2979; ++var9) {
                    int var10 = this.field4233 * var9 / class218.field2979;
                    int var11 = this.field4236[var8 + var10];
                    var7[var9] = class40.method253(4080, var11 << 4);
                    var6[var9] = class40.method253(65280, var11) >> 4;
                    var5[var9] = class40.method253(var11 >> 12, 4080);
                }
            } else {
                for (int var12 = 0; var12 < class218.field2979; ++var12) {
                    int var13 = this.field4236[var8++];
                    var7[var12] = class40.method253(255, var13) << 4;
                    var6[var12] = class40.method253(65280, var13) >> 4;
                    var5[var12] = class40.method253(4080, var13 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class297() {
        super(0, false);
    }
}
