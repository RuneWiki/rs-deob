import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class359 extends class14 {

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    private int field4843 = 4096;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "J")
    public static long field4844 = 0L;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "Lra;")
    public static class70 field4846 = new class70(1, 2, 2, 0);

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "Lpc;")
    public static class473 field4848;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "[I")
    public static int[] field4847;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
    public static void method2093(byte arg0) {
        field4846 = null;
        field4848 = null;
        int var1 = -112 % ((arg0 - -30) / 36);
        field4847 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field4845;
        if (arg1 > -2) {
            method2095(-75, -64, -33, 89, 3, 9, -28);
        }
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            int[] var4 = this.method145(class511.field7361 & arg0 + -1, 0, -18596);
            int[] var5 = this.method145(arg0, 0, -18596);
            int[] var6 = this.method145(arg0 - -1 & class511.field7361, 0, -18596);
            for (int var7 = 0; ~var7 > ~class115.field1637; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4843;
                int var9 = (var5[var7 + 1 & class305.field4023] + -var5[class305.field4023 & var7 + -1]) * this.field4843;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 - -var13) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public static final void method2094(int arg0) {
        ++field4842;
        int var1 = class481.field6632.method2238(255);
        boolean var2 = class481.field6632.method2222(-128) == 1;
        class55.field872 = class481.field6632.method2217((byte) 106);
        int var3 = class481.field6632.method2233((byte) -120);
        int var4 = class481.field6632.method2233((byte) -105);
        class380.method2252(-90, var1);
        class481.field6632.method750(true);
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var20 = 0; ~(class12.field251 >> 3) < ~var20; ++var20) {
                for (int var21 = 0; var21 < class289.field3782 >> 3; ++var21) {
                    int var22 = class481.field6632.method756(arg0 ^ -1745423068, 1);
                    if (var22 == 1) {
                        class168.field2437[var5][var20][var21] = class481.field6632.method756(7, 26);
                    } else {
                        class168.field2437[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class481.field6632.method757((byte) 66);
        int var6 = (-class481.field6632.field5173 + class219.field2965) / 16;
        class380.field5194 = new int[var6][4];
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            for (int var19 = 0; ~var19 > -5; ++var19) {
                class380.field5194[var7][var19] = class481.field6632.method2232((byte) 125);
            }
        }
        class76.field1132 = new int[var6];
        class467.field6437 = new int[var6];
        class162.field2364 = new int[var6];
        class305.field4025 = new byte[var6][];
        class257.field3388 = new byte[var6][];
        class506.field6966 = new byte[var6][];
        class252.field3333 = null;
        class103.field1521 = null;
        class420.field5754 = new byte[var6][];
        class386.field5257 = new int[var6];
        class149.field2131 = new int[var6];
        int var8 = 0;
        if (arg0 != -1745423069) {
            method2094(31);
        }
        for (int var9 = 0; var9 < 4; ++var9) {
            for (int var10 = 0; class12.field251 >> 3 > var10; ++var10) {
                for (int var11 = 0; class289.field3782 >> 3 > var11; ++var11) {
                    int var12 = class168.field2437[var9][var10][var11];
                    if (~var12 != 0) {
                        int var13 = 1023 & var12 >> 14;
                        int var14 = (16379 & var12) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; ++var16) {
                            if (~class149.field2131[var16] == ~var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (~var15 != 0) {
                            class149.field2131[var8] = var15;
                            int var17 = (65448 & var15) >> 8;
                            int var18 = 255 & var15;
                            class76.field1132[var8] = class88.field1340.method2704("m" + var17 + "_" + var18, true);
                            class467.field6437[var8] = class88.field1340.method2704("l" + var17 + "_" + var18, true);
                            class386.field5257[var8] = class88.field1340.method2704("um" + var17 + "_" + var18, true);
                            class162.field2364[var8] = class88.field1340.method2704("ul" + var17 + "_" + var18, true);
                            ++var8;
                        }
                    }
                }
            }
        }
        class167.method1124(var4, var3, false, (byte) 104, var2);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4841;
        if (arg1 > 32) {
            int var7 = arg3 + arg5;
            int var8 = -arg3 + arg2;
            for (int var9 = arg5; ~var9 > ~var7; ++var9) {
                class427.method2465(class457.field6299[var9], arg4, arg0, -7, arg6);
            }
            int var10 = arg0 + arg3;
            for (int var11 = arg2; var8 < var11; --var11) {
                class427.method2465(class457.field6299[var11], arg4, arg0, -7, arg6);
            }
            int var12 = arg4 - arg3;
            for (int var13 = var7; ~var13 >= ~var8; ++var13) {
                int[] var14 = class457.field6299[var13];
                class427.method2465(var14, var10, arg0, -7, arg6);
                class427.method2465(var14, arg4, var12, -7, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class359() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = -32 % ((arg1 - -51) / 37);
        ++field4840;
        if (~arg0 == -1) {
            this.field4843 = arg2.method2212((byte) 83);
        }
    }
}
