import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class122 extends class138 {

    @OriginalMember(owner = "client!qe", name = "zb", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!qe", name = "Ab", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!qe", name = "Bb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!qe", name = "Cb", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!qe", name = "Db", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!qe", name = "Eb", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!qe", name = "Gb", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!qe", name = "Hb", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client!qe", name = "Ib", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!qe", name = "Jb", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!qe", name = "Fb", descriptor = "Lov;")
    private class179 field1572;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Loa;)V")
    public static final void method743(class689 arg0) {
        for (int var1 = class331.field4843; var1 < class87.field1079; ++var1) {
            for (int var2 = 0; var2 < class149.field1872; ++var2) {
                for (int var3 = 0; var3 < class334.field4887; ++var3) {
                    class651 var4 = class145.field1841[var1][var2][var3];
                    if (var4 != null) {
                        class142 var5 = var4.field9220;
                        class142 var6 = var4.field9224;
                        if (var5 != null && var5.method135(0)) {
                            class316.method2040(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method135(0)) {
                                class316.method2040(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method133(var5, 0, arg0, 0, -8763, 0, false);
                                var6.method127(125);
                            }
                            var5.method127(126);
                        }
                        for (class82 var7 = var4.field9228; var7 != null; var7 = var7.field1024) {
                            class293 var9 = var7.field1027;
                            if (var9 != null && var9.method135(0)) {
                                class316.method2040(arg0, var9, var1, var2, var3, var9.field3928 - var9.field3921 + 1, var9.field3923 - var9.field3920 + 1);
                                var9.method127(122);
                            }
                        }
                        class331 var8 = var4.field9227;
                        if (var8 != null && var8.method135(0)) {
                            class443.method2548(arg0, var8, var1, var2, var3);
                            var8.method127(124);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I)V")
    public class122(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(Z)Z")
    public final boolean method744(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field1571;
            int var2 = super.field1712[super.field1745] - this.field1572.method1173(false) & 255;
            return var2 >= 128;
        }
    }

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "(I)V")
    public final void method745(int arg0) {
        ++field1570;
        this.field1574 = super.field1745 * arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[BII)V")
    public final void method746(byte arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg3; ++var5) {
            arg1[arg2 + var5] = (byte) (super.field1712[super.field1745++] + -this.field1572.method1178((byte) -2));
        }
        if (arg0 < 16) {
            this.method745(11);
        }
        ++field1568;
    }

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "(II)I")
    public final int method747(int arg0, int arg1) {
        if (arg0 != 8) {
            this.field1574 = -28;
        }
        ++field1569;
        return arg1 * 8 + -this.field1574;
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(B)I")
    public final int method748(byte arg0) {
        if (arg0 > -6) {
            this.method752(-15, -119);
        }
        ++field1575;
        int var2 = super.field1712[super.field1745++] - this.field1572.method1178((byte) -2) & 255;
        return var2 < 128 ? var2 : (var2 + -128 << 8) - -(super.field1712[super.field1745++] + -this.field1572.method1178((byte) -2) & 255);
    }

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "(II)V")
    public final void method749(int arg0, int arg1) {
        if (arg0 != -2079959225) {
            this.method744(true);
        }
        super.field1712[super.field1745++] = (byte) (this.field1572.method1178((byte) -2) + arg1);
        ++field1566;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([IB)V")
    public final void method750(int[] arg0, byte arg1) {
        if (arg1 >= 33) {
            this.field1572 = new class179(arg0);
            ++field1573;
        }
    }

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "(I)V")
    public final void method751(int arg0) {
        ++field1567;
        super.field1745 = (this.field1574 + 7) / 8;
        if (arg0 > -83) {
            this.field1574 = 52;
        }
    }

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "(II)I")
    public final int method752(int arg0, int arg1) {
        ++field1576;
        int var3 = this.field1574 >> 3;
        int var4 = 8 - (this.field1574 & 7);
        this.field1574 += arg1;
        int var5 = arg0;
        while (~arg1 < ~var4) {
            var5 += (super.field1712[var3++] & class603.field8238[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (class603.field8238[var4] & super.field1712[var3]) + var5;
        } else {
            var6 = (super.field1712[var3] >> -arg1 + var4 & class603.field8238[arg1]) + var5;
        }
        return var6;
    }
}
