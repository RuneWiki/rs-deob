import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class394 extends class5 {

    @OriginalMember(owner = "client!ffa", name = "M", descriptor = "I")
    private int field4957 = 0;

    @OriginalMember(owner = "client!ffa", name = "O", descriptor = "I")
    private int field4959 = 10;

    @OriginalMember(owner = "client!ffa", name = "S", descriptor = "I")
    private int field4963 = 2048;

    @OriginalMember(owner = "client!ffa", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field4956 = new String[100];

    @OriginalMember(owner = "client!ffa", name = "K", descriptor = "Llea;")
    public static class326 field4955 = new class326();

    @OriginalMember(owner = "client!ffa", name = "I", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!ffa", name = "J", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ffa", name = "N", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!ffa", name = "P", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ffa", name = "R", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ffa", name = "H", descriptor = "[I")
    private int[] field4952;

    @OriginalMember(owner = "client!ffa", name = "Q", descriptor = "[I")
    private int[] field4961;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method39(int arg0, int arg1) {
        ++field4958;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = 18 % ((arg0 - 81) / 36);
        if (super.field126.field8392) {
            int var5 = class272.field3439[arg1];
            if (~this.field4957 == -1) {
                short var6 = 0;
                for (int var7 = 0; var7 < this.field4959; ++var7) {
                    if (~var5 <= ~this.field4952[var7] && this.field4952[var7 + 1] > var5) {
                        if (~this.field4961[var7] < ~var5) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class293.method1642(var3, 0, class657.field9287, var6);
            } else {
                for (int var8 = 0; ~var8 > ~class657.field9287; ++var8) {
                    int var9 = 0;
                    short var10 = 0;
                    int var11 = class269.field3405[var8];
                    int var12 = this.field4957;
                    if (var12 != 1) {
                        if (var12 != 2) {
                            if (var12 == 3) {
                                var9 = (-var5 + var11 >> 1) + 2048;
                            }
                        } else {
                            var9 = (var5 + var11 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var9 = var11;
                    }
                    for (int var13 = 0; this.field4959 > var13; ++var13) {
                        if (~this.field4952[var13] >= ~var9 && this.field4952[var13 + 1] > var9) {
                            if (var9 < this.field4961[var13]) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var8] = var10;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "(I)V", line = 122)
    public static final void method2113(int arg0) {
        class82.field1096.method3848((byte) 30);
        ++field4953;
        class583.field8147.method186(28804);
        class40.field540.method149((byte) -106);
        class428.field5352.method3137(93);
        class287.field3581.method1487((byte) 82);
        class633.field8881.method430(arg0 ^ arg0);
        class583.field8149.method1839((byte) -120);
        class370.field4686.method3941(25313);
        class452.field5800.method3565(-15501);
        class659.field9342.method123((byte) 88);
        class591.field8297.method1905(arg0 + -4064);
        class48.field671.method3751(-1);
        class556.field7727.method3772((byte) 127);
        class453.field5806.method959(35);
        class705.field9939.method2472(arg0 + -3983);
        class64.field879.method2870((byte) 13);
        class470.field5972.method2208((byte) 56);
        class279.field3504.method1173((byte) -114);
        class493.field6503.method3165((byte) -113);
        class672.field9462.method1860((byte) 127);
        class704.method3948(-1);
        class606.method3320(false);
        class360.method1982(arg0 + -4096);
        class517.method2797((byte) 25);
        class391.method2097((byte) 122);
        class691.field9779.method2412((byte) -128);
        class392.field4930.method2412((byte) -122);
        class195.field2452.method2412((byte) -120);
        class662.field9368.method2412((byte) 105);
        class197.field2497.method2412((byte) 95);
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V", line = 159)
    public class394() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V", line = 166)
    public static void method2114(byte arg0) {
        if (arg0 != -42) {
            method2113(-86);
        }
        field4956 = null;
        field4955 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILes;I)V", line = 188)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field4957 = arg1.method3501(arg0 ^ -9267);
                }
            } else {
                this.field4963 = arg1.method3470(13111);
            }
        } else {
            this.field4959 = arg1.method3501(-9268);
        }
        if (arg0 != 1) {
            this.method47(-81, (class630) null, 113);
        }
        ++field4960;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 234)
    public final void method46(int arg0) {
        ++field4954;
        int var2 = -2 / ((arg0 - 64) / 60);
        this.method2115(false);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V", line = 244)
    private final void method2115(boolean arg0) {
        ++field4962;
        this.field4961 = new int[this.field4959 - -1];
        int var2 = 0;
        this.field4952 = new int[this.field4959 + 1];
        int var3 = 4096 / this.field4959;
        int var4 = this.field4963 * var3 >> 12;
        if (arg0) {
            this.field4961 = null;
        }
        for (int var5 = 0; ~this.field4959 < ~var5; ++var5) {
            this.field4952[var5] = var2;
            this.field4961[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4952[this.field4959] = 4096;
        this.field4961[this.field4959] = this.field4961[0] + 4096;
    }
}
