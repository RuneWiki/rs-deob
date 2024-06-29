import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class283 {

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    private int field7 = 0;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    private int field12 = 4096;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "Lna;")
    public static class26 field3 = class69.method505("<col=ff9040>", (byte) -123);

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "F")
    public static float field9;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "[I")
    public static int[] field11;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILwa;Z)V", line = 18)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field7 = arg1.method576(1);
        } else if (arg0 == 1) {
            this.field12 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field4715 = arg1.method642((byte) -76) == 1;
        }
        if (!arg2) {
            field3 = (class26) null;
        }
        field10++;
    }

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)V", line = 51)
    public static void method2(int arg0) {
        field11 = null;
        if (arg0 == 11597) {
            field3 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)[[I", line = 75)
    public final int[][] method3(int arg0, int arg1) {
        field8++;
        if (arg0 != -1) {
            method6(2, -7, -114, true, -24, 102, -125);
        }
        int[][] var3 = this.field4719.method2182((byte) -119, arg1);
        if (this.field4719.field5381) {
            int[][] var4 = this.method1994(arg1, 0, (byte) -124);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class101.field1632; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (this.field7 > var13) {
                    var8[var11] = this.field7;
                } else if (var13 > this.field12) {
                    var8[var11] = this.field12;
                } else {
                    var8[var11] = var13;
                }
                if (this.field7 > var12) {
                    var9[var11] = this.field7;
                } else if (var12 <= this.field12) {
                    var9[var11] = var12;
                } else {
                    var9[var11] = this.field12;
                }
                if (var14 < this.field7) {
                    var10[var11] = this.field7;
                } else if (this.field12 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BILbe;)I", line = 149)
    public static final int method4(byte arg0, int arg1, class297 arg2) {
        field4++;
        if (arg0 < 4) {
            method7(-50);
        }
        if (!client.method1730(arg2).method2283(arg1, (byte) -109) && arg2.field5126 == null) {
            return -1;
        } else if (arg2.field5055 == null || arg1 >= arg2.field5055.length) {
            return -1;
        } else {
            return arg2.field5055[arg1];
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V", line = 170)
    public static final void method5(int arg0, int arg1) {
        field6++;
        class252.field4132.method1985(-127, arg1);
        if (arg0 != 4096) {
            method7(92);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIZIII)V", line = 183)
    public static final void method6(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class305.method2142(arg5, 4);
        int var7 = arg5 - arg1;
        int var8 = 0;
        field2++;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -arg5;
        int var10 = arg5;
        int var11 = var7;
        int var12 = -var7;
        int var13 = -1;
        int[] var14 = class45.field710[arg2];
        int var15 = arg6 + var7;
        int var16 = -1;
        int var17 = arg6 - var7;
        class76.method543(var14, arg6 - arg5, -40, var17, arg0);
        class76.method543(var14, var17, -51, var15, arg4);
        class76.method543(var14, var15, -41, arg6 + arg5, arg0);
        if (!arg3) {
            field11 = (int[]) null;
        }
        while (var8 < var10) {
            var13 += 2;
            var12 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class86.field1421[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var8++;
            var16 += 2;
            var9 += var16;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var7 > var10) {
                    int[] var18 = class45.field710[arg2 + var10];
                    int[] var19 = class45.field710[arg2 - var10];
                    int var20 = arg6 - var8;
                    int var21 = arg6 + var8;
                    int var22 = class86.field1421[var10];
                    int var23 = arg6 - var22;
                    int var24 = arg6 + var22;
                    class76.method543(var18, var20, -113, var23, arg0);
                    class76.method543(var18, var23, 95, var24, arg4);
                    class76.method543(var18, var24, 117, var21, arg0);
                    class76.method543(var19, var20, 113, var23, arg0);
                    class76.method543(var19, var23, -76, var24, arg4);
                    class76.method543(var19, var24, -97, var21, arg0);
                } else {
                    int[] var25 = class45.field710[arg2 + var10];
                    int[] var26 = class45.field710[arg2 - var10];
                    int var27 = arg6 + var8;
                    int var28 = arg6 - var8;
                    class76.method543(var25, var28, 113, var27, arg0);
                    class76.method543(var26, var28, -100, var27, arg0);
                }
            }
            int[] var29 = class45.field710[arg2 + var8];
            int[] var30 = class45.field710[arg2 - var8];
            int var31 = arg6 + var10;
            int var32 = arg6 - var10;
            if (var7 <= var8) {
                class76.method543(var29, var32, 104, var31, arg0);
                class76.method543(var30, var32, -127, var31, arg0);
            } else {
                int var33 = var8 <= var11 ? var11 : class86.field1421[var8];
                int var34 = arg6 + var33;
                int var35 = arg6 - var33;
                class76.method543(var29, var32, -94, var35, arg0);
                class76.method543(var29, var35, 115, var34, arg4);
                class76.method543(var29, var34, 110, var31, arg0);
                class76.method543(var30, var32, -114, var35, arg0);
                class76.method543(var30, var35, -79, var34, arg4);
                class76.method543(var30, var34, 120, var31, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 322)
    public class1() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "(I)V", line = 330)
    public static final void method7(int arg0) {
        int var1 = 0;
        if (arg0 >= -111) {
            method7(40);
        }
        while (class313.field5358 > var1) {
            class167 var2 = class21.method139(-109, var1);
            if (var2 != null && var2.field2586 == 0) {
                class117.field1835[var1] = 0;
                class205.field3201[var1] = 0;
            }
            var1++;
        }
        class4.field32 = new class259(16);
        field1++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[I", line = 365)
    public final int[] method8(int arg0, byte arg1) {
        field5++;
        int var3 = -52 % ((arg1 - 30) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int[] var5 = this.method1990(0, arg0, 32755);
            for (int var6 = 0; var6 < class101.field1632; var6++) {
                int var7 = var5[var6];
                if (this.field7 > var7) {
                    var4[var6] = this.field7;
                } else if (this.field12 >= var7) {
                    var4[var6] = var7;
                } else {
                    var4[var6] = this.field12;
                }
            }
        }
        return var4;
    }
}
