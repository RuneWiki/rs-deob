import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class343 extends class199 {

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "Lll;")
    public static class54 field5336 = new class54();

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "Z")
    public static boolean field5340 = true;

    @OriginalMember(owner = "client!fl", name = "cb", descriptor = "I")
    public static int field5342 = -1;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "Luj;")
    public static class158 field5337;

    @OriginalMember(owner = "client!fl", name = "bb", descriptor = "Lib;")
    public static class98 field5341;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[Lch;[BIIIIZII)V", line = 4)
    public static final void method2385(int arg0, int arg1, class8[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field5334++;
        class299 var11 = new class299(arg3);
        int var12 = -1;
        if (arg9 != 1) {
            field5332 = 16;
        }
        while (true) {
            int var13 = var11.method2065(118);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method2046((byte) 98);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method2096((byte) -122);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg7 == var18 && arg6 <= var16 && arg6 + 8 > var16 && arg5 <= var17 && (arg5 + 8) > var17) {
                    class219 var22 = class345.method2392(var12, 0);
                    int var23 = class72.method537(var22.field3112, var17 & 0x7, var21, var16 & 0x7, arg4, -2, var22.field3096) + arg1;
                    int var24 = arg10 + class88.method640(arg9 - 10525, var16 & 0x7, var22.field3096, var22.field3112, arg4, var17 & 0x7, var21);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class8 var25 = null;
                        if (!arg8) {
                            int var26 = arg0;
                            if ((class9.field101[1][var23][var24] & 0x2) == 2) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg2[var26];
                            }
                        }
                        class171.method1259(var21 + arg4 & 0x3, arg0, var12, arg0, var23, 4, arg8, var24, var25, !arg8, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(B)V", line = 85)
    public static void method2386(byte arg0) {
        field5341 = null;
        field5336 = null;
        field5337 = null;
        int var1 = -84 / ((arg0 - 76) / 33);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I", line = 98)
    public final int[] method190(int arg0, int arg1) {
        if (arg0 != -1735) {
            method2386((byte) -124);
        }
        field5339++;
        int[] var3 = this.field2802.method2502(arg1, 123);
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(-7764, arg1, 0);
            int[] var5 = this.method1467(-7764, arg1, 1);
            int[] var6 = this.method1467(-7764, arg1, 2);
            for (int var7 = 0; var7 < class95.field1235; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lfh;ILfh;)V", line = 152)
    public static final void method2387(class140 arg0, int arg1, class140 arg2) {
        if (arg1 != -26193) {
            field5332 = 12;
        }
        class313.field4595 = arg2;
        class215.field3040 = arg0;
        field5338++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLfd;I)V", line = 166)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg0 != -43) {
            method2387((class140) null, 124, (class140) null);
        }
        if (arg2 == 0) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
        field5335++;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)[[I", line = 180)
    public final int[][] method215(int arg0, int arg1) {
        field5333++;
        if (arg1 != -29869) {
            method2386((byte) -74);
        }
        int[][] var3 = this.field2796.method2187(arg0, -107);
        if (this.field2796.field4667) {
            int[] var4 = this.method1467(arg1 + 22105, arg0, 2);
            int[][] var5 = this.method1459(0, arg0, (byte) -51);
            int[][] var6 = this.method1459(1, arg0, (byte) -51);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[1];
            int[] var11 = var5[0];
            int[] var12 = var6[1];
            int[] var13 = var6[0];
            int[] var14 = var5[2];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class95.field1235; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var11[var16];
                    var8[var16] = var10[var16];
                    var9[var16] = var14[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var12[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var10[var16] * var17 + var12[var16] * var18 >> 12;
                    var9[var16] = var14[var16] * var17 + (var15[var16] * var18) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 260)
    public class343() {
        super(3, false);
    }
}
