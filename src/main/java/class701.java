import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class701 extends class644 {

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    private int field9747;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "[I")
    public static int[] field9755 = new int[4096];

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
    public static boolean field9751 = false;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "[I")
    public static int[] field9746 = null;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Lkg;")
    public static class275 field9753 = new class275(69, 0);

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Lkg;")
    public static class275 field9758 = new class275(27, 5);

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field9759 = 0;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field9761 = 1;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Lsq;")
    public static class181 field9760;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "[Leg;")
    public class110[] field9750;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "[[B")
    private byte[][] field9749;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z", line = 9)
    public final boolean method3942(int arg0, byte arg1) {
        field9756++;
        int var3 = -61 / ((64 - arg1) / 59);
        return this.field9750[arg0].field1595;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)Z", line = 20)
    public final boolean method3943(int arg0, byte arg1) {
        field9757++;
        int var3 = -54 % ((-arg1 - 62) / 39);
        return this.field9750[arg0].field1591;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Z", line = 32)
    public final boolean method3944(int arg0) {
        field9754++;
        if (this.field9750 != null) {
            return true;
        }
        if (this.field9749 == null) {
            class547 var2 = class273.field3428;
            synchronized (class273.field3428) {
                if (!class273.field3428.method3151(-11423, this.field9747)) {
                    return false;
                }
                int[] var4 = class273.field3428.method3181((byte) -66, this.field9747);
                this.field9749 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field9749[var5] = class273.field3428.method3153(var4[var5], class386.method2198(arg0, -20687), this.field9747);
                }
            }
        }
        boolean var6 = true;
        if (arg0 != -20687) {
            return false;
        }
        for (int var7 = 0; var7 < this.field9749.length; var7++) {
            byte[] var8 = this.field9749[var7];
            class461 var9 = new class461(var8);
            var9.field6193 = 1;
            int var10 = var9.method2566(-2);
            class547 var11 = class119.field1743;
            synchronized (class119.field1743) {
                var6 &= class119.field1743.method3154(var10, (byte) 98);
            }
        }
        if (!var6) {
            return false;
        }
        class653 var12 = new class653();
        class547 var13 = class273.field3428;
        int[] var15;
        synchronized (class273.field3428) {
            int var14 = class273.field3428.method3178((byte) 97, this.field9747);
            this.field9750 = new class110[var14];
            var15 = class273.field3428.method3181((byte) -98, this.field9747);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field9749[var16];
            class461 var18 = new class461(var17);
            var18.field6193 = 1;
            int var19 = var18.method2566(arg0 ^ 0x50CF);
            class565 var20 = null;
            for (class565 var21 = (class565) var12.method3672(-1); var21 != null; var21 = (class565) var12.method3662(-1)) {
                if (var21.field7937 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class547 var22 = class119.field1743;
                synchronized (class119.field1743) {
                    var20 = new class565(var19, class119.field1743.method3166((byte) 125, var19));
                }
                var12.method3671(var20, false);
            }
            this.field9750[var15[var16]] = new class110(var17, var20);
        }
        this.field9749 = null;
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V", line = 144)
    public static void method3945(int arg0) {
        field9758 = null;
        if (arg0 >= 11) {
            field9753 = null;
            field9760 = null;
            field9755 = null;
            field9746 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 158)
    public static final void method3946(boolean arg0) {
        field9752++;
        for (int var1 = 0; var1 < class660.field9192; var1++) {
            class667.field9364[var1] = null;
        }
        class660.field9192 = 0;
        if (arg0) {
            method3945(60);
        }
        for (int var2 = 0; var2 < class29.field515; var2++) {
            for (int var42 = 0; var42 < class289.field3784; var42++) {
                for (int var43 = 0; var43 < class463.field6223; var43++) {
                    class14 var44 = class197.field2689[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field285 > 0) {
                            var44.field285 = (short) (var44.field285 * -1);
                        }
                        if (var44.field286 > 0) {
                            var44.field286 = (short) (var44.field286 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class29.field515; var3++) {
            for (int var4 = 0; var4 < class289.field3784; var4++) {
                for (int var5 = 0; var5 < class463.field6223; var5++) {
                    class14 var6 = class197.field2689[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class197.field2689[0][var5][var4] != null && class197.field2689[0][var5][var4].field282 != null;
                        if (var6.field285 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class14 var12 = class197.field2689[var3][var5][var4 - 1];
                            int var13 = class707.field9826[var3].method1677(var4, (byte) 59, var5);
                            while (var8 > 0 && var12 != null && var12.field285 < 0 && var6.field285 == var12.field285 && var6.field280 == var12.field280 && class707.field9826[var3].method1677(var8 - 1, (byte) 77, var5) == var13 && ((var8 - 1) <= 0 || class707.field9826[var3].method1677(var8 - 2, (byte) 30, var5) == var13)) {
                                var8--;
                                var12 = class197.field2689[var3][var5][var8 - 1];
                            }
                            for (class14 var14 = class197.field2689[var3][var5][var4 + 1]; class463.field6223 > var9 && var14 != null && var14.field285 < 0 && var6.field285 == var14.field285 && var6.field280 == var14.field280 && var13 == class707.field9826[var3].method1677(var9 + 1, (byte) 79, var5) && (class463.field6223 <= (var9 + 1) || class707.field9826[var3].method1677(var9 + 2, (byte) 103, var5) == var13); var14 = class197.field2689[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class707.field9826[var7 ? var3 + 1 : var3].method1677(var8, (byte) 76, var5);
                            int var17 = var6.field285 * var15 + var16;
                            int var18 = class707.field9826[var7 ? var3 + 1 : var3].method1677(var9 + 1, (byte) 85, var5);
                            int var19 = var18 + (var6.field285 * var15);
                            int var20 = var5 << class480.field6531;
                            int var21 = var8 << class480.field6531;
                            int var22 = (var9 << class480.field6531) + class699.field9729;
                            class667.field9364[class660.field9192++] = new class222(1, var3, var6.field280 + var20, var6.field280 + var20, var6.field280 + var20, var20 - -var6.field280, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class197.field2689[var23][var5][var24].field285 = (short) (class197.field2689[var23][var5][var24].field285 * -1);
                                }
                            }
                        }
                        if (var6.field286 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class14 var29 = class197.field2689[var3][var5 - 1][var4];
                            int var30 = class707.field9826[var3].method1677(var4, (byte) 46, var5);
                            while (var25 > 0 && var29 != null && var29.field286 < 0 && var6.field286 == var29.field286 && var6.field281 == var29.field281 && class707.field9826[var3].method1677(var4, (byte) 69, var25 - 1) == var30 && (var25 - 1 <= 0 || var30 == class707.field9826[var3].method1677(var4, (byte) 31, var25 - 2))) {
                                var25--;
                                var29 = class197.field2689[var3][var25 - 1][var4];
                            }
                            for (class14 var31 = class197.field2689[var3][var5 + 1][var4]; var26 < class289.field3784 && var31 != null && var31.field286 < 0 && var6.field286 == var31.field286 && var6.field281 == var31.field281 && class707.field9826[var3].method1677(var4, (byte) 100, var26 + 1) == var30 && ((var26 + 1) >= class289.field3784 || class707.field9826[var3].method1677(var4, (byte) 123, var26 + 2) == var30); var31 = class197.field2689[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class707.field9826[var7 ? var3 + 1 : var3].method1677(var4, (byte) 71, var25);
                            int var34 = var6.field286 * var32 + var33;
                            int var35 = class707.field9826[var7 ? var3 + 1 : var3].method1677(var4, (byte) 53, var26 + 1);
                            int var36 = var6.field286 * var32 + var35;
                            int var37 = var25 << class480.field6531;
                            int var38 = (var26 << class480.field6531) + class699.field9729;
                            int var39 = var4 << class480.field6531;
                            class667.field9364[class660.field9192++] = new class222(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field281 + var39, var39 - -var6.field281, var6.field281 + var39, var6.field281 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class197.field2689[var40][var41][var4].field286 = (short) (class197.field2689[var40][var41][var4].field286 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class561.field7908 = true;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V", line = 382)
    public class701(int arg0) {
        this.field9747 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(IB)Z", line = 405)
    public final boolean method3947(int arg0, byte arg1) {
        if (arg1 <= 82) {
            field9751 = true;
        }
        field9748++;
        return this.field9750[arg0].field1582;
    }
}
