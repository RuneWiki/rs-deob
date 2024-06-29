import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class59 extends class14 {

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    private int field918 = 0;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    private int field917 = 0;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "I")
    private int field922 = 16;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    private int field924 = 2000;

    @OriginalMember(owner = "client!in", name = "Y", descriptor = "I")
    private int field931 = 4096;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "Ljava/lang/String;")
    public static String field925 = null;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "[I")
    public static int[] field926 = new int[50];

    @OriginalMember(owner = "client!in", name = "O", descriptor = "Lub;")
    public static class18 field921 = new class18(16);

    @OriginalMember(owner = "client!in", name = "X", descriptor = "I")
    public static int field930 = 0;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!in", name = "U", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "Lpc;")
    public static class473 field920;

    @OriginalMember(owner = "client!in", name = "W", descriptor = "[[S")
    public static short[][] field929;

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
    public class59() {
        super(0, true);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = -75 / ((-51 - arg1) / 37);
        ++field927;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field931 = arg2.method2212((byte) 83);
                        }
                    } else {
                        this.field917 = arg2.method2212((byte) 83);
                    }
                } else {
                    this.field922 = arg2.method2238(255);
                }
            } else {
                this.field924 = arg2.method2212((byte) 83);
            }
        } else {
            this.field918 = arg2.method2238(255);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZIIIIZ)V")
    public static final void method417(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            field921 = null;
        }
        class438.field6001 = arg0;
        class202.field2799 = arg3;
        class473.field6544 = arg2;
        class462.field6387 = arg5;
        class330.field4348 = arg4;
        ++field928;
        if (arg1 && ~class462.field6387 <= -101) {
            class168.field2438 = class438.field6001 * 128 - -64;
            class430.field5888 = class202.field2799 * 128 - -64;
            class365.field4937 = class210.method1330(class411.field5656, (byte) -47, class430.field5888, class168.field2438) - class330.field4348;
        }
        class42.field623 = 2;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field919;
        class204.method1307((byte) 64);
        int var2 = -36 / ((arg0 - 39) / 59);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field923;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            int var4 = this.field931 >> 1;
            int[][] var5 = super.field270.method2264(0);
            Random var6 = new Random((long) this.field918);
            for (int var7 = 0; var7 < this.field924; ++var7) {
                int var8 = ~this.field931 >= -1 ? this.field917 : this.field917 + class363.method2116(this.field931, var6, true) + -var4;
                int var9 = (4085 & var8) >> 4;
                int var10 = class363.method2116(class115.field1637, var6, true);
                int var11 = class363.method2116(class494.field6866, var6, true);
                int var12 = (class289.field3779[var9] * this.field922 >> 12) + var10;
                int var13 = (class383.field5225[var9] * this.field922 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class363.method2116(4096, var6, true) >> 2);
                    int var27 = var11 < var13 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = var26 - -((var28 - var10) * var25) + 1024;
                        int var30 = var28 & class305.field4023;
                        int var31 = var21 & class511.field7361;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        if (arg1 > -2) {
            method417(-111, true, 63, 62, 71, -52, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(B)V")
    public static final void method418(byte arg0) {
        class497.field6888 = -1;
        class11.field239 = -1;
        ++field916;
        if (arg0 >= 67) {
            class130.field1894 = 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V")
    public static void method419(int arg0) {
        field926 = null;
        field929 = null;
        field925 = null;
        field921 = null;
        if (arg0 != -17419) {
            method418((byte) 18);
        }
        field920 = null;
    }
}
