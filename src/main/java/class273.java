import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class273 extends class184 {

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    private int field3425 = 4096;

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "I")
    private int field3423 = 4096;

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
    private int field3428 = 4096;

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "Ldq;")
    public static class493 field3424 = new class493(82, -2);

    @OriginalMember(owner = "client!mt", name = "O", descriptor = "[I")
    public static int[] field3432 = new int[8];

    @OriginalMember(owner = "client!mt", name = "N", descriptor = "Lap;")
    public static class335 field3431 = new class335(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!mt", name = "L", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!mt", name = "M", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 30608) {
            field3424 = null;
        }
        ++field3426;
        for (int var6 = arg0; ~arg2 <= ~var6; ++var6) {
            for (int var7 = arg1; arg5 >= var7; ++var7) {
                if (class300.field3868[var6][var7] == arg3 && class23.field341[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V")
    public static final void method1614(byte arg0) {
        ++field3430;
        if (arg0 < -39) {
            class309.method1803(class407.field5817.field3624, -30493);
            int var1 = (class441.field6317 >> 3) + (class310.field3971 >> 10);
            class276.field3488 = class23.field336.field2676 = 0;
            int var2 = (class320.field4064 >> 3) + (class193.field2500 >> 10);
            class23.field336.method1362(8, 8, (byte) 40);
            byte var3 = 18;
            class523.field7708 = new int[var3];
            class42.field521 = new byte[var3][];
            class433.field6138 = new int[var3];
            class450.field6476 = new byte[var3][];
            class166.field2121 = new byte[var3][];
            class268.field3391 = new int[var3][4];
            class79.field1025 = new int[var3];
            class189.field2476 = new byte[var3][];
            class53.field709 = new int[var3];
            class141.field1826 = new byte[var3][];
            class502.field7256 = new int[var3];
            class296.field3805 = new int[var3];
            int var4 = 0;
            for (int var5 = (var1 - (class452.field6526 >> 4)) / 8; ~var5 >= ~(((class452.field6526 >> 4) + var1) / 8); ++var5) {
                for (int var8 = (-(class440.field6307 >> 4) + var2) / 8; ~(((class440.field6307 >> 4) + var2) / 8) <= ~var8; ++var8) {
                    int var9 = (var5 << 8) + var8;
                    class79.field1025[var4] = var9;
                    class296.field3805[var4] = class351.field4507.method488("m" + var5 + "_" + var8, 97);
                    class523.field7708[var4] = class351.field4507.method488("l" + var5 + "_" + var8, 115);
                    class433.field6138[var4] = class351.field4507.method488("n" + var5 + "_" + var8, 87);
                    class502.field7256[var4] = class351.field4507.method488("um" + var5 + "_" + var8, 122);
                    class53.field709[var4] = class351.field4507.method488("ul" + var5 + "_" + var8, 105);
                    if (class433.field6138[var4] == -1) {
                        class296.field3805[var4] = -1;
                        class523.field7708[var4] = -1;
                        class502.field7256[var4] = -1;
                        class53.field709[var4] = -1;
                    }
                    ++var4;
                }
            }
            for (int var6 = var4; var6 < class433.field6138.length; ++var6) {
                class433.field6138[var6] = -1;
                class296.field3805[var6] = -1;
                class523.field7708[var6] = -1;
                class502.field7256[var6] = -1;
                class53.field709[var6] = -1;
            }
            byte var7;
            if (class483.field7059 != 1 && ~class483.field7059 != -3) {
                var7 = 7;
            } else {
                var7 = 3;
            }
            class400.method2371(var7, false, var2, false, var1);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = 0 / ((-13 - arg0) / 51);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3423 = arg2.method2758((byte) 111);
                }
            } else {
                this.field3425 = arg2.method2758((byte) 92);
            }
        } else {
            this.field3428 = arg2.method2758((byte) 83);
        }
        ++field3422;
    }

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "(I)V")
    public static void method1615(int arg0) {
        field3424 = null;
        field3432 = null;
        field3431 = null;
        if (arg0 != 32297) {
            method1615(41);
        }
    }

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "(Z)Lmv;")
    public static final class254 method1616(boolean arg0) {
        ++field3427;
        if (arg0) {
            field3424 = null;
        }
        return class293.field3732 < class62.field808.length ? class62.field808[class293.field3732++] : null;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)[[I")
    public final int[][] method13(int arg0, int arg1) {
        ++field3429;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (super.field2416.field7271) {
            int[][] var4 = this.method1163(1, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class245.field3167 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3428 * var12 >> 12;
                    var9[var11] = this.field3425 * var13 >> 12;
                    var10[var11] = this.field3423 * var14 >> 12;
                } else {
                    var8[var11] = this.field3428;
                    var9[var11] = this.field3425;
                    var10[var11] = this.field3423;
                }
            }
        }
        if (arg1 != 1) {
            this.field3425 = 50;
        }
        return var3;
    }
}
