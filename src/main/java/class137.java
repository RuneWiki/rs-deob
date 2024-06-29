import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class137 extends class601 {

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    private int field1812 = 4096;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    private int field1814 = 16;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    private int field1815 = 2000;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    private int field1816 = 0;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    private int field1818 = 0;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "Ljf;")
    public static class667 field1820 = new class667();

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "[[[Lmf;")
    public static class766[][][] field1810;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
    public final void method292(byte arg0) {
        class257.method1651(0);
        if (arg0 < 44) {
            method791((byte) 101);
        }
        ++field1813;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
    public class137() {
        super(0, true);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(II)V")
    public static final void method790(int arg0, int arg1) {
        ++field1817;
        class207.field2846 = arg0;
        class317.field3954 = 100;
        class670.field8696 = -1;
        int var2 = -106 / ((-38 - arg1) / 63);
        class568.field7179 = 3;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field1811;
        if (arg1 > -76) {
            this.field1814 = 79;
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int var4 = this.field1812 >> 1;
            int[][] var5 = super.field7643.method2053((byte) -112);
            Random var6 = new Random((long) this.field1818);
            for (int var7 = 0; ~this.field1815 < ~var7; ++var7) {
                int var8 = this.field1812 <= 0 ? this.field1816 : this.field1816 + -var4 + class419.method2416(this.field1812, var6, (byte) 48);
                int var9 = var8 >> 4 & 255;
                int var10 = class419.method2416(class418.field5518, var6, (byte) 126);
                int var11 = class419.method2416(class418.field5514, var6, (byte) 30);
                int var12 = var10 - -(class558.field7100[var9] * this.field1814 >> 12);
                int var13 = (class438.field5764[var9] * this.field1814 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class419.method2416(4096, var6, (byte) 124) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + (var26 - -1024);
                        int var30 = class511.field6519 & var28;
                        int var31 = class104.field1388 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)V")
    public static void method791(byte arg0) {
        field1820 = null;
        field1810 = null;
        if (arg0 <= 110) {
            field1820 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field1819;
        int var4 = 10 % ((40 - arg2) / 52);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field1812 = arg0.method1553((byte) 60);
                        }
                    } else {
                        this.field1816 = arg0.method1553((byte) -111);
                    }
                } else {
                    this.field1814 = arg0.method1509(true);
                }
            } else {
                this.field1815 = arg0.method1553((byte) 54);
            }
        } else {
            this.field1818 = arg0.method1509(true);
        }
    }
}
