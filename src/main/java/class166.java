import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class166 extends class88 {

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[Lga;")
    public class166[] field3057;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "Z")
    public boolean field3074;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lta;")
    public static class241 field3055 = new class241(64);

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "[I")
    public static int[] field3072 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "Z")
    public static boolean field3068 = false;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field3075 = 100;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Ltk;")
    public static class50 field3077 = null;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Ldi;")
    public class171 field3071;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Li;")
    public class54 field3064;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public void method16(int arg0) {
        field3061++;
        int var2 = 59 % ((58 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIII)V")
    public static final void method1226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field3069++;
        int var7 = arg5;
        int var8 = arg0 * arg0;
        int var9 = arg5 * arg5;
        int var10 = arg5 << 1;
        int var11 = var9 << 1;
        int var12 = (1 - var10) * var8 + var11;
        if (arg2 <= 114) {
            method1226(-109, -7, 101, 15, -31, 74);
        }
        int var13 = var8 << 1;
        int var14 = var8 << 2;
        int var15 = var9 - ((var10 - 1) * var13);
        int var16 = var9 << 2;
        int var17 = (var6 + 1) * var16;
        int var18 = ((var6 << 1) + 3) * var11;
        if (class19.field252 <= arg1 && field3075 >= arg1) {
            int var19 = class240.method1700(class35.field485, arg0 + arg3, -28, class201.field3629);
            int var20 = class240.method1700(class35.field485, arg3 - arg0, -41, class201.field3629);
            class99.method740(arg4, class186.field3402[arg1], -1162793114, var19, var20);
        }
        int var21 = (arg5 - 1) * var14;
        int var22 = ((arg5 << 1) - 3) * var13;
        while (var7 > 0) {
            if (var12 < 0) {
                while (var12 < 0) {
                    var15 += var17;
                    var17 += var16;
                    var12 += var18;
                    var18 += var16;
                    var6++;
                }
            }
            if (var15 < 0) {
                var15 += var17;
                var17 += var16;
                var12 += var18;
                var18 += var16;
                var6++;
            }
            var7--;
            int var23 = arg1 + var7;
            var12 += -var21;
            var15 += -var22;
            var22 -= var14;
            int var24 = arg1 - var7;
            if (var23 >= class19.field252 && field3075 >= var24) {
                int var25 = class240.method1700(class35.field485, arg3 + var6, -70, class201.field3629);
                int var26 = class240.method1700(class35.field485, arg3 - var6, 127, class201.field3629);
                if (var24 >= class19.field252) {
                    class99.method740(arg4, class186.field3402[var24], -1162793114, var25, var26);
                }
                if (field3075 >= var23) {
                    class99.method740(arg4, class186.field3402[var23], -1162793114, var25, var26);
                }
            }
            var21 -= var14;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public void method1225(int arg0) {
        if (arg0 != -1) {
            this.field3057 = null;
        }
        if (this.field3074) {
            this.field3071.method1250(8801);
            this.field3071 = null;
        } else {
            this.field3064.method323((byte) 12);
            this.field3064 = null;
        }
        field3065++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLfh;I)V")
    public void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 != 96) {
            method1233((byte) 4);
        }
        field3076++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)I")
    public int method1222(byte arg0) {
        field3056++;
        return arg0 == 43 ? -1 : 35;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)I")
    public int method1227(boolean arg0) {
        field3073++;
        return arg0 ? 69 : -1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[[I")
    public int[][] method134(int arg0, int arg1) {
        field3060++;
        if (arg0 != 0) {
            method1233((byte) -77);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public final void method1228(int arg0, int arg1, int arg2) {
        int var4 = ~this.field3070 == arg2 ? arg0 : this.field3070;
        field3062++;
        if (this.field3074) {
            this.field3071 = new class171(var4, arg0, arg1);
        } else {
            this.field3064 = new class54(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)[I")
    public int[] method20(int arg0, int arg1) {
        field3066++;
        if (arg1 != 8388607) {
            field3055 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)[[I")
    public final int[][] method1229(int arg0, int arg1, int arg2) {
        field3063++;
        if (arg1 != 23580) {
            return null;
        } else if (this.field3057[arg2].field3074) {
            int[] var4 = this.field3057[arg2].method20(arg0, 8388607);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3057[arg2].method134(0, arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)V")
    public static final void method1230(int arg0, int arg1) {
        class9.field71 = -1;
        class98.field1863 = null;
        class33.field453 = false;
        class27.field383 = arg1;
        class194.field3534 = 1;
        if (arg0 != 511) {
            field3068 = false;
        }
        class38.field534 = 0;
        field3059++;
        class253.field4577 = -1;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)[I")
    public final int[] method1231(int arg0, int arg1, int arg2) {
        field3058++;
        int var4 = -110 % ((arg0 - 85) / 37);
        return this.field3057[arg2].field3074 ? this.field3057[arg2].method20(arg1, 8388607) : this.field3057[arg2].method134(0, arg1)[0];
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)V")
    public static final void method1232(int arg0, int arg1) {
        field3067++;
        class212.field3861 = new int[arg0];
        class148.field2745 = new int[arg0];
        if (arg1 == 1048575) {
            class22.field300 = new int[arg0];
            class247.field4520 = new int[arg0];
            class273.field4827 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IZ)V")
    public class166(int arg0, boolean arg1) {
        this.field3057 = new class166[arg0];
        this.field3074 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
    public static void method1233(byte arg0) {
        if (arg0 < 50) {
            method1226(75, 92, 80, -32, 112, 120);
        }
        field3077 = null;
        field3072 = null;
        field3055 = null;
    }
}
