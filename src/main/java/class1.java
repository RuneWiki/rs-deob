import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class1 {

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public int field7 = -1;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public int field3 = 0;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
    public boolean field5 = true;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field10 = -1;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[I")
    public static int[] field13 = new int[] { 0, 3, 0, 0, 0, 0, 6, 0, 2, 0, 5, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 5, 0, 0, 0, 15, 4, 0, 0, 0, 0, 10, 0, 2, 0, 0, 4, 6, 4, 0, 0, 0, 0, -1, 0, 10, 7, 0, 0, 0, 0, 24, 0, 3, 0, 5, 0, 0, 0, 0, 6, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 7, 0, 0, 0, 0, 0, 1, 3, 4, 0, 0, 0, 0, 0, 0, 0, 6, 4, 0, 15, 0, 0, 1, 0, -2, 8, 5, 8, -1, 0, 0, -2, 0, 0, 0, 0, 0, 8, 0, -1, 0, 0, -2, 0, 20, 0, -2, 10, 0, -2, 0, -1, 0, 2, 0, 0, -1, 0, 0, -2, 4, -1, 0, 8, 0, 0, 1, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, 4, -2, 8, 0, -1, 2, -1, -2, 0, 0, 0, 0, 6, 0, 3, 0, 0, 0, 2, -1, 0, 6, 0, 7, 2, 0, 0, 0, 0, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, -2, 6, -1, 4, 0, 0, -2, 12, 0, 0, 1, 9, 0, -1, 0, 0, 5, 0, -1, 0, 0, 0, 0, 3, -2, 0, 0, 0, 0, 6, 4, 5, 6, 2, 0, 5, -1, 0, 0, -2 };

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lcj;")
    public static class28 field8;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLlh;I)V")
    public final void method1(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -64) {
            this.field7 = 75;
        }
        field2++;
        while (true) {
            int var4 = arg1.method1677(arg0 - 6613);
            if (var4 == 0) {
                return;
            }
            this.method3(var4, arg2, (byte) -87, arg1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method2(byte arg0) {
        field9++;
        if (!class247.field4308) {
            return;
        }
        if (arg0 < 60) {
            field12 = -52;
        }
        class63 var1 = class218.method1401(class225.field3859, false, class240.field4174);
        if (var1 != null && var1.field1129 != null) {
            class237 var2 = new class237();
            var2.field4118 = var1.field1129;
            var2.field4120 = var1;
            class8.method34(var2, 16);
        }
        class247.field4308 = false;
        class215.method1385(var1, -119);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIBLlh;)V")
    private final void method3(int arg0, int arg1, byte arg2, class249 arg3) {
        field1++;
        if (arg0 == 1) {
            this.field3 = class83.method573(arg3.method1648((byte) -63), -16844);
        } else if (arg0 == 2) {
            this.field10 = arg3.method1677(-6677);
        } else if (arg0 == 3) {
            this.field10 = arg3.method1674(1355769544);
            if (this.field10 == 65535) {
                this.field10 = -1;
            }
        } else if (arg0 == 5) {
            this.field5 = false;
        } else if (arg0 == 7) {
            this.field7 = class83.method573(arg3.method1648((byte) -105), -16844);
        } else if (arg0 == 8) {
            class35.field526 = arg1;
        } else if (arg0 == 9) {
            arg3.method1674(1355769544);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg3.method1677(-6677);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg3.method1648((byte) 105);
                } else if (arg0 == 14) {
                    arg3.method1677(-6677);
                }
            }
        }
        if (arg2 >= -51) {
            this.method3(64, -117, (byte) 66, (class249) null);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
    public static final void method4(int arg0, byte arg1) {
        class119.field2253.method1611(-18767, arg0);
        class252.field4433.method1611(-18767, arg0);
        if (arg1 != 35) {
            field4 = -106;
        }
        class63.field1241.method1611(-18767, arg0);
        field6++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method5(int arg0) {
        field8 = null;
        int var1 = -116 % ((arg0 - 74) / 49);
        field13 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field11++;
        if (arg3 != 1580177356) {
            field13 = null;
        }
        if (arg2 == arg8 && arg0 == arg6 && arg1 == arg7 && arg4 == arg5) {
            class234.method1527(arg8, arg9, arg0, arg7, (byte) -121, arg4);
            return;
        }
        int var10 = arg0;
        int var11 = arg8;
        int var12 = arg8 * 3;
        int var13 = arg0 * 3;
        int var14 = arg6 * 3;
        int var15 = arg1 * 3;
        int var16 = arg2 * 3;
        int var17 = var16 + arg7 - arg8 - var15;
        int var18 = arg5 * 3;
        int var19 = var18 - var14 - (-var13 + var14);
        int var20 = arg4 + var14 - arg0 - var18;
        int var21 = var15 - var16 - (var16 - var12);
        int var22 = var16 - var12;
        int var23 = var14 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var20 * var26;
            int var28 = var17 * var26;
            int var29 = var21 * var25;
            int var30 = var19 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var28 + var31 + var29 >> 12) + arg8;
            int var34 = (var30 + var32 + var27 >> 12) + arg0;
            class234.method1527(var11, arg9, var10, var33, (byte) -121, var34);
            var10 = var34;
            var11 = var33;
        }
    }
}
