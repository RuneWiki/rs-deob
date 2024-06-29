import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class162 extends class306 {

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    private int field2494 = 0;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    private int field2500 = 0;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    private int field2503 = 0;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2488 = -1;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field2495 = 0;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    private int field2486;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    private int field2487;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    private int field2492;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    private int field2496;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    private int field2502;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Z")
    public static boolean field2490;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILlf;I)V", line = 7)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field2497++;
        if (arg2 == 0) {
            this.field2494 = arg1.method1021(-1);
        } else if (arg2 == 1) {
            this.field2503 = (arg1.method1028(79030408) << 12) / 100;
        } else if (arg2 == 2) {
            this.field2500 = (arg1.method1028(79030408) << 12) / 100;
        }
        if (arg0 != -15334) {
            this.method681(106, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIII)V", line = 66)
    private final void method1169(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 < arg0 ? arg1 : arg0;
        field2491++;
        int var6 = arg1 <= arg0 ? arg0 : arg1;
        int var7 = var6 >= arg3 ? var6 : arg3;
        int var8 = arg3 >= var5 ? var5 : arg3;
        int var9 = var7 - var8;
        if (var9 > 0) {
            int var10 = (var7 - arg1 << 12) / var9;
            int var11 = (var7 - arg0 << 12) / var9;
            int var12 = (var7 - arg3 << 12) / var9;
            if (arg1 == var7) {
                this.field2496 = arg0 == var8 ? var12 + 20480 : 4096 - var11;
            } else if (arg0 == var7) {
                this.field2496 = arg3 == var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field2496 = arg1 == var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field2496 /= 6;
        } else {
            this.field2496 = 0;
        }
        this.field2502 = (var7 + var8) / 2;
        if (this.field2502 > 0 && this.field2502 < 4096) {
            this.field2492 = (var9 << 12) / (this.field2502 > 2048 ? 8192 - (this.field2502 * 2) : this.field2502 * 2);
        } else {
            this.field2492 = 0;
        }
        if (arg2 <= 30) {
            this.field2492 = 49;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(IIII)V", line = 119)
    private final void method1170(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 > 2048 ? arg2 + arg3 - (arg2 * arg3 >> 12) : (arg3 + 4096) * arg2 >> 12;
        field2498++;
        if (var5 <= 0) {
            this.field2493 = this.field2487 = this.field2486 = arg2;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg2 - (var5 - arg2);
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var7 + var13;
            if (var9 == 0) {
                this.field2486 = var7;
                this.field2487 = var15;
                this.field2493 = var5;
            } else if (var9 == 1) {
                this.field2486 = var7;
                this.field2487 = var5;
                this.field2493 = var14;
            } else if (var9 == 2) {
                this.field2486 = var15;
                this.field2487 = var5;
                this.field2493 = var7;
            } else if (var9 == 3) {
                this.field2487 = var14;
                this.field2486 = var5;
                this.field2493 = var7;
            } else if (var9 == 4) {
                this.field2486 = var5;
                this.field2487 = var7;
                this.field2493 = var15;
            } else if (var9 == 5) {
                this.field2486 = var14;
                this.field2487 = var7;
                this.field2493 = var5;
            }
        }
        if (arg1 < 32) {
            this.method1169(1, 31, 19, -3);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BIII)V", line = 227)
    public static final void method1171(byte arg0, int arg1, int arg2, int arg3) {
        field2501++;
        int var4 = 53 / ((70 - arg0) / 56);
        class126 var5 = class245.method1735(arg1, arg2, arg3, false);
        if (var5 == null) {
            return;
        }
        class41.field447 = new int[var5.field1784];
        class250.field3958 = new String[var5.field1791];
        if (var5.field1781 == 15 || var5.field1781 == 17 || var5.field1781 == 16) {
            int var6 = 0;
            int var7 = 0;
            if (class68.field852 != null) {
                var7 = class68.field852.field5104;
                var6 = class68.field852.field5029;
            }
            class41.field447[0] = class197.field3009 - var6;
            class41.field447[1] = class128.field1873 - var7;
        }
        class176.method1224(0, var5, 200000);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 260)
    public class162() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[[I", line = 267)
    public final int[][] method681(int arg0, byte arg1) {
        field2499++;
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int[][] var4 = this.method2160(0, (byte) -95, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class31.field367; var11++) {
                this.method1169(var6[var11], var5[var11], 72, var7[var11]);
                this.field2492 += this.field2503;
                if (this.field2492 < 0) {
                    this.field2492 = 0;
                }
                if (this.field2492 > 4096) {
                    this.field2492 = 4096;
                }
                this.field2502 += this.field2500;
                this.field2496 += this.field2494;
                if (this.field2502 < 0) {
                    this.field2502 = 0;
                }
                if (this.field2502 > 4096) {
                    this.field2502 = 4096;
                }
                while (this.field2496 < 0) {
                    this.field2496 += 4096;
                }
                while (this.field2496 > 4096) {
                    this.field2496 -= 4096;
                }
                this.method1170(this.field2496, 89, this.field2502, this.field2492);
                var10[var11] = this.field2493;
                var8[var11] = this.field2487;
                var9[var11] = this.field2486;
            }
        }
        if (arg1 != -119) {
            this.method1170(-10, 104, -94, 78);
        }
        return var3;
    }
}
