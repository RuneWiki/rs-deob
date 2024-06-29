import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class275 extends class219 {

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    private int field4564 = 0;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    private int field4568 = 0;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    private int field4566 = 0;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "[Lbd;")
    public static class162[] field4574 = new class162[100];

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    private int field4561;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    private int field4572;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    private int field4573;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "I")
    private int field4575;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "I")
    private int field4578;

    @OriginalMember(owner = "client!fl", name = "bb", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIBI)V", line = 8)
    private final void method1865(int arg0, int arg1, byte arg2, int arg3) {
        field4562++;
        int var5 = arg1 < arg3 ? arg3 : arg1;
        int var6 = arg0 <= var5 ? var5 : arg0;
        int var7 = arg3 >= arg1 ? arg1 : arg3;
        int var8 = var7 > arg0 ? arg0 : var7;
        if (arg2 != -58) {
            this.method1871(-111, -39, 104, 7);
        }
        this.field4561 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (var9 <= 0) {
            this.field4578 = 0;
        } else {
            int var10 = (var6 - arg3 << 12) / var9;
            int var11 = (var6 - arg1 << 12) / var9;
            int var12 = (var6 - arg0 << 12) / var9;
            if (arg3 == var6) {
                this.field4578 = arg1 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (arg1 == var6) {
                this.field4578 = arg0 == var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field4578 = arg3 == var8 ? var11 + 12288 : 20480 - var10;
            }
            this.field4578 /= 6;
        }
        if (this.field4561 > 0 && this.field4561 < 4096) {
            this.field4575 = (var9 << 12) / (this.field4561 <= 2048 ? this.field4561 * 2 : 8192 - this.field4561 * 2);
        } else {
            this.field4575 = 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZIIIII)V", line = 62)
    public static final void method1866(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4579++;
        int var7 = arg0 - arg2;
        int var8 = arg2 + arg4;
        int var9 = arg6 + arg2;
        int var10 = arg5 - arg2;
        for (int var11 = arg6; var11 < var9; var11++) {
            class3.method14(arg3, arg4, arg5, class184.field3180[var11], -115);
        }
        for (int var12 = arg0; var12 > var7; var12--) {
            class3.method14(arg3, arg4, arg5, class184.field3180[var12], -102);
        }
        if (arg1) {
            return;
        }
        for (int var13 = var9; var13 <= var7; var13++) {
            int[] var14 = class184.field3180[var13];
            class3.method14(arg3, arg4, var8, var14, -122);
            class3.method14(arg3, var10, arg5, var14, -119);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 114)
    public class275() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILb;)V", line = 118)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            this.method42(-9, -74, (class94) null);
        }
        if (arg0 == 0) {
            this.field4564 = arg2.method750((byte) -24);
        } else if (arg0 == 1) {
            this.field4568 = (arg2.method719((byte) -42) << 12) / 100;
        } else if (arg0 == 2) {
            this.field4566 = (arg2.method719((byte) -42) << 12) / 100;
        }
        field4571++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)[[I", line = 171)
    public final int[][] method219(int arg0, byte arg1) {
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[][] var4 = this.method1583(arg0, true, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class128.field2326; var11++) {
                this.method1865(var7[var11], var5[var11], (byte) -58, var6[var11]);
                this.field4561 += this.field4566;
                this.field4575 += this.field4568;
                if (this.field4561 < 0) {
                    this.field4561 = 0;
                }
                this.field4578 += this.field4564;
                if (this.field4561 > 4096) {
                    this.field4561 = 4096;
                }
                while (this.field4578 < 0) {
                    this.field4578 += 4096;
                }
                while (this.field4578 > 4096) {
                    this.field4578 -= 4096;
                }
                if (this.field4575 < 0) {
                    this.field4575 = 0;
                }
                if (this.field4575 > 4096) {
                    this.field4575 = 4096;
                }
                this.method1871(this.field4561, arg1 ^ 0x853, this.field4578, this.field4575);
                var10[var11] = this.field4577;
                var8[var11] = this.field4572;
                var9[var11] = this.field4573;
            }
        }
        if (arg1 == 83) {
            field4565++;
            return var3;
        } else {
            return (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 243)
    public static void method1867(int arg0) {
        if (arg0 != 0) {
            method1868(105);
        }
        field4574 = null;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V", line = 254)
    public static final void method1868(int arg0) {
        if (arg0 != 15812) {
            field4574 = (class162[]) null;
        }
        field4570++;
        for (int var1 = 0; var1 < class255.field4233; var1++) {
            int var10002 = class237.field3948[var1]--;
            if (class237.field3948[var1] >= -10) {
                class241 var2 = class194.field3270[var1];
                if (var2 == null) {
                    var2 = class241.method1712(class157.field2764, class270.field4518[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class237.field3948[var1] += var2.method1710();
                    class194.field3270[var1] = var2;
                }
                if (class237.field3948[var1] < 0) {
                    int var3;
                    if (class30.field504[var1] == 0) {
                        var3 = class154.field2727;
                    } else {
                        int var4 = (class30.field504[var1] & 0xFFEBC9) >> 16;
                        int var5 = (class30.field504[var1] & 0xFF) * 128;
                        int var6 = var4 * 128 + (64 - class122.field2215.field5013);
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class30.field504[var1] & 0xFFD4) >> 8;
                        int var8 = var7 * 128 + 64 - class122.field2215.field5047;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 - (128 - var8);
                        if (var9 > var5) {
                            class237.field3948[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var3 = (var5 - var9) * class256.field4256 / var5;
                    }
                    if (var3 > 0) {
                        class310 var10 = var2.method1711().method2094(class222.field3710);
                        class76 var11 = class76.method562(var10, 100, var3);
                        var11.method566(class29.field495[var1] - 1);
                        class313.field5290.method454(var11);
                    }
                    class237.field3948[var1] = -100;
                }
            } else {
                class255.field4233--;
                for (int var12 = var1; var12 < class255.field4233; var12++) {
                    class270.field4518[var12] = class270.field4518[var12 + 1];
                    class194.field3270[var12] = class194.field3270[var12 + 1];
                    class29.field495[var12] = class29.field495[var12 + 1];
                    class237.field3948[var12] = class237.field3948[var12 + 1];
                    class30.field504[var12] = class30.field504[var12 + 1];
                }
                var1--;
            }
        }
        if (class127.field2307 && !class223.method1616((byte) -13)) {
            if (class135.field2413 != 0 && class163.field2887 != -1) {
                class252.method1759((byte) -56, class178.field3047, class135.field2413, class163.field2887, 0, false);
            }
            class127.field2307 = false;
        } else if (class135.field2413 != 0 && class163.field2887 != -1 && !class223.method1616((byte) -13)) {
            class187.field3229.method338(192, (byte) 8);
            class187.field3229.method730(false, class163.field2887);
            class273.field4539++;
            class163.field2887 = -1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIII)V", line = 393)
    public static final void method1869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4569++;
        if (arg2 >= class112.field2028 && class82.field1426 >= arg3 && arg0 >= class303.field5106 && class298.field4989 >= arg4) {
            class47.method348(arg2, arg1, arg4, arg0, arg3, 7, arg7, arg6);
        } else {
            class181.method1374(arg0, (byte) -89, arg1, arg3, arg2, arg4, arg7, arg6);
        }
        if (arg5 != 100) {
            field4574 = (class162[]) null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILb;)V", line = 416)
    public static final void method1870(int arg0, class94 arg1) {
        field4563++;
        int var2 = 0;
        int var3 = 113 / ((-arg0 - 53) / 42);
        while (class317.field5351 > var2) {
            int var4 = arg1.method755((byte) -101);
            int var5 = arg1.method761((byte) 108);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class220.field3661[var4] != null) {
                class220.field3661[var4].field15 = var5;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)V", line = 445)
    private final void method1871(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 <= arg1 ? (arg3 + 4096) * arg0 >> 12 : arg3 + arg0 - (arg0 * arg3 >> 12);
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = arg0 + arg0 - var5;
            int var8 = var6 >> 12;
            int var9 = (var5 - var7 << 12) / var5;
            int var11 = var6 - (var8 << 12);
            int var12 = var9 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var8 == 0) {
                this.field4572 = var14;
                this.field4573 = var7;
                this.field4577 = var5;
            } else if (var8 == 1) {
                this.field4573 = var7;
                this.field4577 = var15;
                this.field4572 = var5;
            } else if (var8 == 2) {
                this.field4573 = var14;
                this.field4577 = var7;
                this.field4572 = var5;
            } else if (var8 == 3) {
                this.field4577 = var7;
                this.field4572 = var15;
                this.field4573 = var5;
            } else if (var8 == 4) {
                this.field4573 = var5;
                this.field4572 = var7;
                this.field4577 = var14;
            } else if (var8 == 5) {
                this.field4572 = var7;
                this.field4573 = var15;
                this.field4577 = var5;
            }
        } else {
            this.field4577 = this.field4572 = this.field4573 = arg0;
        }
        field4576++;
    }
}
