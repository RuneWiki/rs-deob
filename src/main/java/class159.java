import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class159 extends class227 {

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    private int field2064 = 0;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    private int field2072 = 4096;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    private int field2067 = 12288;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    private int field2073 = 2048;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    private int field2068 = 0;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    private int field2065 = 2048;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    private int field2075 = 8192;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 68)
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method62(int arg0, int arg1) {
        ++field2074;
        int[] var3 = super.field3068.method1970(arg1, (byte) 54);
        if (super.field3068.field4480) {
            int var4 = class190.field2457[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class446.field6486; ++var5) {
                int var6 = class4.field37[var5] + -2048;
                int var7 = var6 - -this.field2073;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field2064 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field2068 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = var4 - -this.field2065;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method948(var12, var9, -9412) && !this.method949(arg0 + -15927, var18, var15) ? 0 : 4096;
            }
        }
        if (arg0 != 15811) {
            this.field2064 = 35;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(III)Z", line = 77)
    private final boolean method948(int arg0, int arg1, int arg2) {
        ++field2066;
        int var4 = (-arg1 + arg0) * this.field2067 >> 12;
        if (arg2 != -9412) {
            return false;
        } else {
            int var5 = class143.field1906[(1047489 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field2067;
            int var7 = (var6 << 12) / this.field2075;
            int var8 = this.field2072 * var7 >> 12;
            return arg1 - -arg0 < var8 && ~(arg1 - -arg0) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V", line = 99)
    public final void method877(int arg0) {
        ++field2071;
        class32.method182(109);
        if (arg0 != 1) {
            this.field2067 = -22;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lug;II)V", line = 111)
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field2076;
        if (arg1 == 487215116) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (~arg2 != -6) {
                                    if (arg2 == 6) {
                                        this.field2075 = arg0.method2386(-23648);
                                    }
                                } else {
                                    this.field2072 = arg0.method2386(-23648);
                                }
                            } else {
                                this.field2067 = arg0.method2386(-23648);
                            }
                        } else {
                            this.field2065 = arg0.method2386(-23648);
                        }
                    } else {
                        this.field2068 = arg0.method2386(-23648);
                    }
                } else {
                    this.field2064 = arg0.method2386(-23648);
                }
            } else {
                this.field2073 = arg0.method2386(-23648);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(III)Z", line = 195)
    private final boolean method949(int arg0, int arg1, int arg2) {
        if (arg0 > -66) {
            this.field2067 = -97;
        }
        ++field2069;
        int var4 = (arg1 + arg2) * this.field2067 >> 12;
        int var5 = class143.field1906[(1047384 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field2067;
        int var7 = (var6 << 12) / this.field2075;
        int var8 = this.field2072 * var7 >> 12;
        return var8 > arg1 - arg2 && ~(-var8) > ~(-arg2 + arg1);
    }
}
