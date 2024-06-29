import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class113 extends class145 {

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    private int field1599 = 4096;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    private int field1601 = 4096;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    private int field1608 = 4096;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "[I")
    public static int[] field1600 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "[I")
    public static int[] field1607 = new int[100];

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V", line = 5)
    public static final void method920(byte arg0) {
        ++field1602;
        if (arg0 != -16) {
            method922(-38);
        }
        class56 var1 = null;
        try {
            class242 var2 = class30.field502.method1947((byte) -41);
            while (var2.field3345 == 0) {
                class229.method1541(124, 1L);
            }
            if (~var2.field3345 == -2) {
                var1 = (class56) var2.field3341;
                byte[] var3 = new byte[(int) var1.method522(-1)];
                int var5;
                for (int var4 = 0; var3.length > var4; var4 += var5) {
                    var5 = var1.method523(var3, var3.length - var4, (byte) -104, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class53.method507(new class289(var3), false);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method526(-19635);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIZ)Z", line = 59)
    public static final boolean method921(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1605;
        if (arg4) {
            field1606 = 97;
        }
        if (~(2 & class7.field57[0][arg0][arg1]) != -1) {
            return true;
        } else if (~(16 & class7.field57[arg2][arg0][arg1]) != -1) {
            return false;
        } else {
            return ~arg3 == ~class266.method1709(arg2, -6179, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V", line = 81)
    public static void method922(int arg0) {
        int var1 = 45 % ((51 - arg0) / 51);
        field1600 = null;
        field1607 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)[[I", line = 94)
    public final int[][] method4(boolean arg0, int arg1) {
        if (!arg0) {
            this.method4(true, 112);
        }
        ++field1604;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int[][] var4 = this.method1121(arg1, 0, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class156.field2364; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field1599 * var12 >> 12;
                    var9[var11] = this.field1601 * var13 >> 12;
                    var10[var11] = this.field1608 * var14 >> 12;
                } else {
                    var8[var11] = this.field1599;
                    var9[var11] = this.field1601;
                    var10[var11] = this.field1608;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 214)
    public class113() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lap;BI)V", line = 170)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field1598;
        int var4 = -76 % ((11 - arg1) / 52);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1608 = arg0.method1853(107);
                }
            } else {
                this.field1601 = arg0.method1853(104);
            }
        } else {
            this.field1599 = arg0.method1853(110);
        }
    }
}
