import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class141 extends class298 {

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    private int field1693 = 4096;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "[I")
    private int[] field1697 = new int[3];

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    private int field1692 = 4096;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    private int field1698 = 409;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    private int field1701 = 4096;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "[Z")
    public static boolean[] field1696 = new boolean[5];

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class141() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
    public static final void method665(int arg0, int arg1, byte arg2) {
        ++field1699;
        class89 var3 = class146.method695(6, arg0, (byte) -16);
        int var4 = 16 / ((17 - arg2) / 53);
        var3.method449(true);
        var3.field1106 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 > -44) {
            this.method157(60, -21);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method899((byte) 119);
                            this.field1697[1] = class444.method2618(65280, var5) >> 4;
                            this.field1697[2] = class444.method2618(var5, 255) >> 12;
                            this.field1697[0] = class444.method2618(var5 << 4, 267386880);
                        }
                    } else {
                        this.field1693 = arg2.method916(21933);
                    }
                } else {
                    this.field1692 = arg2.method916(21933);
                }
            } else {
                this.field1701 = arg2.method916(21933);
            }
        } else {
            this.field1698 = arg2.method916(21933);
        }
        ++field1691;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[[I")
    public final int[][] method157(int arg0, int arg1) {
        ++field1700;
        int[][] var3 = super.field4454.method1638((byte) -109, arg1);
        if (arg0 != -24032) {
            this.field1698 = 127;
        }
        if (super.field4454.field3886) {
            int[][] var4 = this.method1878(0, arg1, 80);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class158.field1877 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field1697[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field1698 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field1697[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field1698 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field1697[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field1698 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field1693 * var12 >> 12;
                            var9[var11] = this.field1692 * var14 >> 12;
                            var10[var11] = this.field1701 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public static void method666(int arg0) {
        if (arg0 != -29361) {
            method666(-49);
        }
        field1696 = null;
    }
}
