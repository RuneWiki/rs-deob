import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class330 extends class338 {

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public int field4400 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public int field4395 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public int field4396 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public int field4394 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public int field4408 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field4404 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public int field4406 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public int field4411 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lir;")
    public class216 field4402;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "[C")
    public static char[] field4401 = new char[128];

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lph;")
    public static class114 field4399 = new class114(64);

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Z")
    public static boolean field4413 = false;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field4412 = 0;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field4403;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static final void method1888(byte arg0) {
        class14.field130.method606((byte) 120);
        field4407++;
        if (arg0 > -3) {
            field4403 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
    public final boolean method1889(int arg0, int arg1, int arg2) {
        if (arg1 < 70) {
            this.method1889(119, 88, -101);
        }
        field4398++;
        if (arg2 >= this.field4400 && arg2 <= this.field4408 && this.field4411 <= arg0 && this.field4406 >= arg0) {
            return true;
        } else {
            return arg2 >= this.field4404 && arg2 <= this.field4394 && this.field4395 <= arg0 && this.field4396 >= arg0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public static void method1890(byte arg0) {
        if (arg0 < 1) {
            field4412 = -30;
        }
        field4403 = null;
        field4401 = null;
        field4399 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
    public static final int method1891(boolean arg0) {
        if (!arg0) {
            return 42;
        }
        field4393++;
        if (class177.field2211) {
            return 0;
        } else if (class138.method758(-10762)) {
            return class177.field2217 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1892(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg8 && arg2 == arg5 && arg7 == arg9 && arg3 == arg6) {
            class176.method930(arg1, arg6, arg0, arg9, arg5, false);
        } else {
            int var10 = arg0;
            int var11 = arg5;
            int var12 = arg0 * 3;
            int var13 = arg5 * 3;
            int var14 = arg8 * 3;
            int var15 = arg2 * 3;
            int var16 = arg7 * 3;
            int var17 = arg3 * 3;
            int var18 = arg9 + var14 - var16 - arg0;
            int var19 = var15 + arg6 - var17 - arg5;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - (var15 + var15);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = (var28 + var30 + var32 >> 12) + arg0;
                int var35 = (var29 + var31 + var33 >> 12) + arg5;
                class176.method930(arg1, var35, var10, var34, var11, false);
                var11 = var35;
                var10 = var34;
            }
        }
        field4409++;
        int var25 = -88 / ((-arg4 - 16) / 40);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lfd;B)Z")
    public static final boolean method1893(class194 arg0, byte arg1) {
        field4410++;
        if (arg1 <= 36) {
            method1888((byte) -17);
        }
        if (arg0.field2455 == 205) {
            class192.field2420 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)Z")
    public static final boolean method1894(int arg0, int arg1, int arg2) {
        if (arg2 != 2188) {
            field4412 = -98;
        }
        field4405++;
        class225 var3 = class281.method1655((byte) -28, arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method1210((byte) -127, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lir;)V")
    public class330(class216 arg0) {
        this.field4402 = arg0;
    }
}
