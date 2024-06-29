import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class422 extends class243 {

    @OriginalMember(owner = "client!mba", name = "K", descriptor = "I")
    private int field5910 = 2048;

    @OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
    private int field5908 = 4096;

    @OriginalMember(owner = "client!mba", name = "M", descriptor = "I")
    private int field5912 = 8192;

    @OriginalMember(owner = "client!mba", name = "S", descriptor = "I")
    private int field5918 = 12288;

    @OriginalMember(owner = "client!mba", name = "U", descriptor = "I")
    private int field5920 = 0;

    @OriginalMember(owner = "client!mba", name = "T", descriptor = "I")
    private int field5919 = 2048;

    @OriginalMember(owner = "client!mba", name = "W", descriptor = "I")
    private int field5922 = 0;

    @OriginalMember(owner = "client!mba", name = "F", descriptor = "[B")
    public static byte[] field5906 = new byte[2048];

    @OriginalMember(owner = "client!mba", name = "L", descriptor = "Z")
    public static boolean field5911 = false;

    @OriginalMember(owner = "client!mba", name = "E", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!mba", name = "G", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!mba", name = "J", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!mba", name = "N", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!mba", name = "O", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!mba", name = "P", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!mba", name = "Q", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!mba", name = "R", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!mba", name = "V", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!mba", name = "D", descriptor = "Lea;")
    public static class547 field5904;

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V", line = 6)
    public class422() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "(B)V", line = 9)
    public static final void method2407(byte arg0) {
        ++field5914;
        class262 var1 = class70.field759;
        synchronized (class70.field759) {
            if (arg0 >= -11) {
                method2412((byte) 49);
            }
            class70.field759.method1563(99);
        }
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(B)V", line = 23)
    public final void method85(byte arg0) {
        ++field5905;
        class333.method1982(arg0 ^ 66);
        if (arg0 != 66) {
            this.method5(-105, 15);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZ)Z", line = 38)
    public static final boolean method2408(int arg0, boolean arg1) {
        ++field5916;
        if (~arg0 != -16 && ~arg0 != -5 && ~arg0 != -9 && arg0 != 16 && arg0 != 1007) {
            if (~arg0 != -51 && ~arg0 != -1010) {
                if (arg1) {
                    method2410(-107, (class218) null);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII)Z", line = 61)
    private final boolean method2409(byte arg0, int arg1, int arg2) {
        if (arg0 != -15) {
            return false;
        } else {
            ++field5915;
            int var4 = (arg1 + arg2) * this.field5918 >> 12;
            int var5 = class623.field8718[(var4 * 255 & 1045671) >> 12];
            int var6 = (var5 << 12) / this.field5918;
            int var7 = (var6 << 12) / this.field5912;
            int var8 = this.field5908 * var7 >> 12;
            return var8 > -arg1 + arg2 && arg2 - arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILsba;)V", line = 84)
    public static final void method2410(int arg0, class218 arg1) {
        if (arg1.field2832 == 5 && ~arg1.field2771 != 0) {
            class397.method2305(class21.field142, true, arg1);
        }
        ++field5921;
        int var2 = 31 / ((27 - arg0) / 56);
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(III)Z", line = 110)
    private final boolean method2411(int arg0, int arg1, int arg2) {
        ++field5917;
        if (arg0 != -13306) {
            method2412((byte) -36);
        }
        int var4 = (arg2 - arg1) * this.field5918 >> 12;
        int var5 = class623.field8718[(1047784 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field5918;
        int var7 = (var6 << 12) / this.field5912;
        int var8 = this.field5908 * var7 >> 12;
        return var8 > arg1 + arg2 && ~(-var8) > ~(arg1 + arg2);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)[I", line = 129)
    public final int[] method5(int arg0, int arg1) {
        ++field5909;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            this.method2411(91, 52, -49);
        }
        if (super.field3164.field9250) {
            int var4 = class685.field9613[arg1] - 2048;
            for (int var5 = 0; class687.field9628 > var5; ++var5) {
                int var6 = class666.field9279[var5] + -2048;
                int var7 = var6 - -this.field5910;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = var4 - -this.field5922;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field5920 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = this.field5919 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method2411(-13306, var9, var12) && !this.method2409((byte) -15, var15, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILji;B)V", line = 182)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field5913;
        if (arg2 > -92) {
            this.field5918 = 53;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field5912 = arg1.method3402((byte) 127);
                                }
                            } else {
                                this.field5908 = arg1.method3402((byte) 127);
                            }
                        } else {
                            this.field5918 = arg1.method3402((byte) 127);
                        }
                    } else {
                        this.field5919 = arg1.method3402((byte) 127);
                    }
                } else {
                    this.field5920 = arg1.method3402((byte) 127);
                }
            } else {
                this.field5922 = arg1.method3402((byte) 127);
            }
        } else {
            this.field5910 = arg1.method3402((byte) 127);
        }
    }

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "(B)V", line = 266)
    public static void method2412(byte arg0) {
        if (arg0 != -48) {
            field5904 = null;
        }
        field5904 = null;
        field5906 = null;
    }
}
