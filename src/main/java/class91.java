import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class91 extends class192 {

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    private int field1197 = 4096;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    private int field1199 = 0;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "Lft;")
    public static class285 field1194 = new class285(3, 2);

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "Lhca;")
    public static class365 field1201 = new class365();

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "Ltaa;")
    public static class135 field1202;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "Ldn;")
    public static class548 field1204;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 3)
    public static void method685(int arg0) {
        if (arg0 != 18092) {
            field1202 = null;
        }
        field1194 = null;
        field1202 = null;
        field1201 = null;
        field1204 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILoa;)V", line = 17)
    public static final void method686(int arg0, class43 arg1) {
        ++field1200;
        class305.field4015 = class351.method2015(class483.field6442, true, arg1, true);
        class47.field665 = class505.method2719(arg1, -65536, class483.field6442);
        class562.field7337 = class351.method2015(class531.field6904, true, arg1, true);
        class401.field5111 = class505.method2719(arg1, -65536, class531.field6904);
        class456.field5983 = class351.method2015(class628.field8776, true, arg1, true);
        if (arg0 == 30806) {
            class411.field5305 = class505.method2719(arg1, -65536, class628.field8776);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IB)[[I", line = 34)
    public final int[][] method107(int arg0, byte arg1) {
        ++field1196;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        int var4 = 58 % ((arg1 - -14) / 34);
        if (super.field2467.field5565) {
            int[][] var5 = this.method1251(0, arg0, (byte) 78);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~class561.field7319 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (var13 >= this.field1199) {
                    if (var13 <= this.field1197) {
                        var9[var12] = var13;
                    } else {
                        var9[var12] = this.field1197;
                    }
                } else {
                    var9[var12] = this.field1199;
                }
                if (~var14 > ~this.field1199) {
                    var10[var12] = this.field1199;
                } else if (var14 <= this.field1197) {
                    var10[var12] = var14;
                } else {
                    var10[var12] = this.field1197;
                }
                if (~this.field1199 < ~var15) {
                    var11[var12] = this.field1199;
                } else if (~var15 >= ~this.field1197) {
                    var11[var12] = var15;
                } else {
                    var11[var12] = this.field1197;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILfd;I)V", line = 110)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2449 = arg1.method2396(25) == 1;
                }
            } else {
                this.field1197 = arg1.method2393(-30727);
            }
        } else {
            this.field1199 = arg1.method2393(arg2 + -18567);
        }
        if (arg2 != -12160) {
            field1194 = null;
        }
        ++field1203;
    }

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)[Lfl;", line = 155)
    public static final class103[] method687(int arg0) {
        ++field1195;
        if (arg0 != 1) {
            field1201 = null;
        }
        return new class103[] { class614.field8296, class501.field6615, class197.field2593, class240.field3234, class213.field2745, class549.field7128, class419.field5431, class469.field6131, class625.field8740, class549.field7127 };
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 170)
    public class91() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)[I", line = 186)
    public final int[] method118(int arg0, byte arg1) {
        ++field1198;
        if (arg1 > -123) {
            this.field1199 = -105;
        }
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int[] var4 = this.method1253(0, arg0, 0);
            for (int var5 = 0; class561.field7319 > var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field1199) {
                    if (var6 > this.field1197) {
                        var3[var5] = this.field1197;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field1199;
                }
            }
        }
        return var3;
    }
}
