import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class204 extends class148 {

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    private int field2937 = 2048;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    private int field2936 = 8192;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    private int field2933 = 12288;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    private int field2939 = 4096;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    private int field2941 = 2048;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    private int field2935 = 0;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    private int field2934 = 0;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLic;IZIII)V")
    public static final void method1379(byte arg0, class491 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class107.field1546 = arg6;
        class197.field2869 = arg1;
        class23.field239 = arg3;
        class150.field2232 = 1;
        if (arg0 > 59) {
            ++field2946;
            class237.field3495 = arg5;
            class146.field2162 = arg2;
            class88.field1343 = class411.field6178.method1259(-16684) / arg4;
            if (~class88.field1343 > -2) {
                class88.field1343 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZ)Z")
    private final boolean method1380(int arg0, int arg1, boolean arg2) {
        ++field2940;
        int var4 = (arg0 - arg1) * this.field2933 >> 12;
        int var5 = class318.field4564[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2933;
        if (arg2) {
            this.field2934 = -101;
        }
        int var7 = (var6 << 12) / this.field2936;
        int var8 = this.field2939 * var7 >> 12;
        return var8 > arg1 - -arg0 && arg0 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
    public static final void method1381(byte arg0, Object[] arg1, int[] arg2) {
        if (arg0 < 113) {
            method1381((byte) 30, (Object[]) null, (int[]) null);
        }
        ++field2943;
        class1.method2(arg2.length + -1, 0, (byte) -46, arg1, arg2);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Z")
    private final boolean method1382(int arg0, int arg1, int arg2) {
        if (arg0 != 2048) {
            return false;
        } else {
            ++field2938;
            int var4 = (arg1 + arg2) * this.field2933 >> 12;
            int var5 = class318.field4564[(1044829 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field2933;
            int var7 = (var6 << 12) / this.field2936;
            int var8 = this.field2939 * var7 >> 12;
            return -arg2 + arg1 < var8 && -arg2 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(CI)Z")
    public static final boolean method1383(char arg0, int arg1) {
        ++field2948;
        if ((~arg0 >= -1 || arg0 >= 128) && (~arg0 > -161 || arg0 > 255)) {
            if (arg0 != 0) {
                char[] var2 = class178.field2622;
                for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            if (arg1 != 6) {
                field2945 = 11;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (arg0 != -1285532468) {
            this.field2935 = 61;
        }
        ++field2942;
        class419.method2520(-127);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field2947;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int var4 = class456.field6752[arg1] + -2048;
            for (int var5 = 0; ~class320.field4579 < ~var5; ++var5) {
                int var6 = class517.field7539[var5] + -2048;
                int var7 = this.field2937 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field2935 + var4;
                int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = this.field2934 + var6;
                int var14 = var13 < -2048 ? var13 - -4096 : var13;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field2941 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method1380(var12, var9, false) && !this.method1382(2048, var18, var15) ? 0 : 4096;
            }
        }
        return arg0 > -65 ? null : var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        ++field2944;
        int var4 = -33 % ((-88 - arg2) / 33);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field2936 = arg1.method1450((byte) 47);
                                }
                            } else {
                                this.field2939 = arg1.method1450((byte) 111);
                            }
                        } else {
                            this.field2933 = arg1.method1450((byte) 28);
                        }
                    } else {
                        this.field2941 = arg1.method1450((byte) 79);
                    }
                } else {
                    this.field2934 = arg1.method1450((byte) 57);
                }
            } else {
                this.field2935 = arg1.method1450((byte) 56);
            }
        } else {
            this.field2937 = arg1.method1450((byte) 120);
        }
    }
}
